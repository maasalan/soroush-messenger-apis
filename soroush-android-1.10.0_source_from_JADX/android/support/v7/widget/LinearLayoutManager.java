package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry;
import android.support.v7.widget.RecyclerView.LayoutManager.Properties;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.Recycler;
import android.support.v7.widget.RecyclerView.SmoothScroller;
import android.support.v7.widget.RecyclerView.SmoothScroller.ScrollVectorProvider;
import android.support.v7.widget.RecyclerView.State;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.support.v7.widget.helper.ItemTouchHelper.ViewDropHandler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class LinearLayoutManager extends LayoutManager implements ScrollVectorProvider, ViewDropHandler {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final AnchorInfo mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final LayoutChunkResult mLayoutChunkResult;
    private LayoutState mLayoutState;
    int mOrientation;
    OrientationHelper mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    class AnchorInfo {
        int mCoordinate;
        boolean mLayoutFromEnd;
        int mPosition;
        boolean mValid;

        AnchorInfo() {
            reset();
        }

        void assignCoordinateFromPadding() {
            this.mCoordinate = this.mLayoutFromEnd ? LinearLayoutManager.this.mOrientationHelper.getEndAfterPadding() : LinearLayoutManager.this.mOrientationHelper.getStartAfterPadding();
        }

        public void assignFromView(View view) {
            this.mCoordinate = this.mLayoutFromEnd ? LinearLayoutManager.this.mOrientationHelper.getDecoratedEnd(view) + LinearLayoutManager.this.mOrientationHelper.getTotalSpaceChange() : LinearLayoutManager.this.mOrientationHelper.getDecoratedStart(view);
            this.mPosition = LinearLayoutManager.this.getPosition(view);
        }

        public void assignFromViewAndKeepVisibleRect(View view) {
            int totalSpaceChange = LinearLayoutManager.this.mOrientationHelper.getTotalSpaceChange();
            if (totalSpaceChange >= 0) {
                assignFromView(view);
                return;
            }
            this.mPosition = LinearLayoutManager.this.getPosition(view);
            int endAfterPadding;
            int decoratedMeasurement;
            if (this.mLayoutFromEnd) {
                endAfterPadding = (LinearLayoutManager.this.mOrientationHelper.getEndAfterPadding() - totalSpaceChange) - LinearLayoutManager.this.mOrientationHelper.getDecoratedEnd(view);
                this.mCoordinate = LinearLayoutManager.this.mOrientationHelper.getEndAfterPadding() - endAfterPadding;
                if (endAfterPadding > 0) {
                    decoratedMeasurement = this.mCoordinate - LinearLayoutManager.this.mOrientationHelper.getDecoratedMeasurement(view);
                    totalSpaceChange = LinearLayoutManager.this.mOrientationHelper.getStartAfterPadding();
                    decoratedMeasurement -= totalSpaceChange + Math.min(LinearLayoutManager.this.mOrientationHelper.getDecoratedStart(view) - totalSpaceChange, 0);
                    if (decoratedMeasurement < 0) {
                        this.mCoordinate += Math.min(endAfterPadding, -decoratedMeasurement);
                    }
                }
                return;
            }
            endAfterPadding = LinearLayoutManager.this.mOrientationHelper.getDecoratedStart(view);
            decoratedMeasurement = endAfterPadding - LinearLayoutManager.this.mOrientationHelper.getStartAfterPadding();
            this.mCoordinate = endAfterPadding;
            if (decoratedMeasurement > 0) {
                int endAfterPadding2 = (LinearLayoutManager.this.mOrientationHelper.getEndAfterPadding() - Math.min(0, (LinearLayoutManager.this.mOrientationHelper.getEndAfterPadding() - totalSpaceChange) - LinearLayoutManager.this.mOrientationHelper.getDecoratedEnd(view))) - (endAfterPadding + LinearLayoutManager.this.mOrientationHelper.getDecoratedMeasurement(view));
                if (endAfterPadding2 < 0) {
                    this.mCoordinate -= Math.min(decoratedMeasurement, -endAfterPadding2);
                }
            }
        }

        boolean isViewValidAsAnchor(View view, State state) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            return !layoutParams.isItemRemoved() && layoutParams.getViewLayoutPosition() >= 0 && layoutParams.getViewLayoutPosition() < state.getItemCount();
        }

        void reset() {
            this.mPosition = -1;
            this.mCoordinate = Integer.MIN_VALUE;
            this.mLayoutFromEnd = false;
            this.mValid = false;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("AnchorInfo{mPosition=");
            stringBuilder.append(this.mPosition);
            stringBuilder.append(", mCoordinate=");
            stringBuilder.append(this.mCoordinate);
            stringBuilder.append(", mLayoutFromEnd=");
            stringBuilder.append(this.mLayoutFromEnd);
            stringBuilder.append(", mValid=");
            stringBuilder.append(this.mValid);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    protected static class LayoutChunkResult {
        public int mConsumed;
        public boolean mFinished;
        public boolean mFocusable;
        public boolean mIgnoreConsumed;

        protected LayoutChunkResult() {
        }

        void resetInternal() {
            this.mConsumed = 0;
            this.mFinished = false;
            this.mIgnoreConsumed = false;
            this.mFocusable = false;
        }
    }

    static class LayoutState {
        static final int INVALID_LAYOUT = Integer.MIN_VALUE;
        static final int ITEM_DIRECTION_HEAD = -1;
        static final int ITEM_DIRECTION_TAIL = 1;
        static final int LAYOUT_END = 1;
        static final int LAYOUT_START = -1;
        static final int SCROLLING_OFFSET_NaN = Integer.MIN_VALUE;
        static final String TAG = "LLM#LayoutState";
        int mAvailable;
        int mCurrentPosition;
        int mExtra = 0;
        boolean mInfinite;
        boolean mIsPreLayout = false;
        int mItemDirection;
        int mLastScrollDelta;
        int mLayoutDirection;
        int mOffset;
        boolean mRecycle = true;
        List<ViewHolder> mScrapList = null;
        int mScrollingOffset;

        LayoutState() {
        }

        private View nextViewFromScrapList() {
            int size = this.mScrapList.size();
            int i = 0;
            while (i < size) {
                View view = ((ViewHolder) this.mScrapList.get(i)).itemView;
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                if (layoutParams.isItemRemoved() || this.mCurrentPosition != layoutParams.getViewLayoutPosition()) {
                    i++;
                } else {
                    assignPositionFromScrapList(view);
                    return view;
                }
            }
            return null;
        }

        public void assignPositionFromScrapList() {
            assignPositionFromScrapList(null);
        }

        public void assignPositionFromScrapList(View view) {
            view = nextViewInLimitedList(view);
            this.mCurrentPosition = view == null ? -1 : ((LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
        }

        boolean hasMore(State state) {
            return this.mCurrentPosition >= 0 && this.mCurrentPosition < state.getItemCount();
        }

        void log() {
            String str = TAG;
            StringBuilder stringBuilder = new StringBuilder("avail:");
            stringBuilder.append(this.mAvailable);
            stringBuilder.append(", ind:");
            stringBuilder.append(this.mCurrentPosition);
            stringBuilder.append(", dir:");
            stringBuilder.append(this.mItemDirection);
            stringBuilder.append(", offset:");
            stringBuilder.append(this.mOffset);
            stringBuilder.append(", layoutDir:");
            stringBuilder.append(this.mLayoutDirection);
            Log.d(str, stringBuilder.toString());
        }

        View next(Recycler recycler) {
            if (this.mScrapList != null) {
                return nextViewFromScrapList();
            }
            View viewForPosition = recycler.getViewForPosition(this.mCurrentPosition);
            this.mCurrentPosition += this.mItemDirection;
            return viewForPosition;
        }

        public View nextViewInLimitedList(View view) {
            int size = this.mScrapList.size();
            View view2 = null;
            int i = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = ((ViewHolder) this.mScrapList.get(i2)).itemView;
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                if (!(view3 == view || layoutParams.isItemRemoved())) {
                    int viewLayoutPosition = (layoutParams.getViewLayoutPosition() - this.mCurrentPosition) * this.mItemDirection;
                    if (viewLayoutPosition >= 0 && viewLayoutPosition < r2) {
                        if (viewLayoutPosition == 0) {
                            return view3;
                        }
                        view2 = view3;
                        i = viewLayoutPosition;
                    }
                }
            }
            return view2;
        }
    }

    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new C07581();
        boolean mAnchorLayoutFromEnd;
        int mAnchorOffset;
        int mAnchorPosition;

        static class C07581 implements Creator<SavedState> {
            C07581() {
            }

            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mAnchorOffset = parcel.readInt();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.mAnchorLayoutFromEnd = z;
        }

        public SavedState(SavedState savedState) {
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mAnchorOffset = savedState.mAnchorOffset;
            this.mAnchorLayoutFromEnd = savedState.mAnchorLayoutFromEnd;
        }

        public int describeContents() {
            return 0;
        }

        boolean hasValidAnchor() {
            return this.mAnchorPosition >= 0;
        }

        void invalidateAnchor() {
            this.mAnchorPosition = -1;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mAnchorOffset);
            parcel.writeInt(this.mAnchorLayoutFromEnd);
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new AnchorInfo();
        this.mLayoutChunkResult = new LayoutChunkResult();
        this.mInitialPrefetchItemCount = 2;
        setOrientation(i);
        setReverseLayout(z);
        setAutoMeasureEnabled(true);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new AnchorInfo();
        this.mLayoutChunkResult = new LayoutChunkResult();
        this.mInitialPrefetchItemCount = 2;
        Properties properties = LayoutManager.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.orientation);
        setReverseLayout(properties.reverseLayout);
        setStackFromEnd(properties.stackFromEnd);
        setAutoMeasureEnabled(true);
    }

    private int computeScrollExtent(State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return ScrollbarHelper.computeScrollExtent(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(this.mSmoothScrollbarEnabled ^ true, true), findFirstVisibleChildClosestToEnd(this.mSmoothScrollbarEnabled ^ true, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return ScrollbarHelper.computeScrollOffset(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(this.mSmoothScrollbarEnabled ^ true, true), findFirstVisibleChildClosestToEnd(this.mSmoothScrollbarEnabled ^ true, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return ScrollbarHelper.computeScrollRange(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(this.mSmoothScrollbarEnabled ^ true, true), findFirstVisibleChildClosestToEnd(this.mSmoothScrollbarEnabled ^ true, true), this, this.mSmoothScrollbarEnabled);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild(Recycler recycler, State state) {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findFirstReferenceChild(Recycler recycler, State state) {
        return findReferenceChild(recycler, state, 0, getChildCount(), state.getItemCount());
    }

    private View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
        int i;
        int childCount;
        if (this.mShouldReverseLayout) {
            i = 0;
            childCount = getChildCount();
        } else {
            i = getChildCount() - 1;
            childCount = -1;
        }
        return findOneVisibleChild(i, childCount, z, z2);
    }

    private View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
        int childCount;
        int i;
        if (this.mShouldReverseLayout) {
            childCount = getChildCount() - 1;
            i = -1;
        } else {
            childCount = 0;
            i = getChildCount();
        }
        return findOneVisibleChild(childCount, i, z, z2);
    }

    private View findLastPartiallyOrCompletelyInvisibleChild(Recycler recycler, State state) {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View findLastReferenceChild(Recycler recycler, State state) {
        return findReferenceChild(recycler, state, getChildCount() - 1, -1, state.getItemCount());
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd(Recycler recycler, State state) {
        return this.mShouldReverseLayout ? findFirstPartiallyOrCompletelyInvisibleChild(recycler, state) : findLastPartiallyOrCompletelyInvisibleChild(recycler, state);
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart(Recycler recycler, State state) {
        return this.mShouldReverseLayout ? findLastPartiallyOrCompletelyInvisibleChild(recycler, state) : findFirstPartiallyOrCompletelyInvisibleChild(recycler, state);
    }

    private View findReferenceChildClosestToEnd(Recycler recycler, State state) {
        return this.mShouldReverseLayout ? findFirstReferenceChild(recycler, state) : findLastReferenceChild(recycler, state);
    }

    private View findReferenceChildClosestToStart(Recycler recycler, State state) {
        return this.mShouldReverseLayout ? findLastReferenceChild(recycler, state) : findFirstReferenceChild(recycler, state);
    }

    private int fixLayoutEndGap(int i, Recycler recycler, State state, boolean z) {
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding() - i;
        if (endAfterPadding <= 0) {
            return 0;
        }
        int i2 = -scrollBy(-endAfterPadding, recycler, state);
        i += i2;
        if (z) {
            int endAfterPadding2 = this.mOrientationHelper.getEndAfterPadding() - i;
            if (endAfterPadding2 > 0) {
                this.mOrientationHelper.offsetChildren(endAfterPadding2);
                return endAfterPadding2 + i2;
            }
        }
        return i2;
    }

    private int fixLayoutStartGap(int i, Recycler recycler, State state, boolean z) {
        int startAfterPadding = i - this.mOrientationHelper.getStartAfterPadding();
        if (startAfterPadding <= 0) {
            return 0;
        }
        int i2 = -scrollBy(startAfterPadding, recycler, state);
        i += i2;
        if (z) {
            i -= this.mOrientationHelper.getStartAfterPadding();
            if (i > 0) {
                this.mOrientationHelper.offsetChildren(-i);
                i2 -= i;
            }
        }
        return i2;
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void layoutForPredictiveAnimations(Recycler recycler, State state, int i, int i2) {
        LinearLayoutManager linearLayoutManager = this;
        Recycler recycler2 = recycler;
        State state2 = state;
        if (state.willRunPredictiveAnimations() && getChildCount() != 0 && !state.isPreLayout() && supportsPredictiveItemAnimations()) {
            List scrapList = recycler.getScrapList();
            int size = scrapList.size();
            int position = getPosition(getChildAt(0));
            int i3 = 0;
            int i4 = i3;
            int i5 = i4;
            while (i3 < size) {
                ViewHolder viewHolder = (ViewHolder) scrapList.get(i3);
                if (!viewHolder.isRemoved()) {
                    Object obj = 1;
                    if ((viewHolder.getLayoutPosition() < position) != linearLayoutManager.mShouldReverseLayout) {
                        obj = -1;
                    }
                    if (obj == -1) {
                        i4 += linearLayoutManager.mOrientationHelper.getDecoratedMeasurement(viewHolder.itemView);
                    } else {
                        i5 += linearLayoutManager.mOrientationHelper.getDecoratedMeasurement(viewHolder.itemView);
                    }
                }
                i3++;
            }
            linearLayoutManager.mLayoutState.mScrapList = scrapList;
            if (i4 > 0) {
                updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i);
                linearLayoutManager.mLayoutState.mExtra = i4;
                linearLayoutManager.mLayoutState.mAvailable = 0;
                linearLayoutManager.mLayoutState.assignPositionFromScrapList();
                fill(recycler2, linearLayoutManager.mLayoutState, state2, false);
            }
            if (i5 > 0) {
                updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i2);
                linearLayoutManager.mLayoutState.mExtra = i5;
                linearLayoutManager.mLayoutState.mAvailable = 0;
                linearLayoutManager.mLayoutState.assignPositionFromScrapList();
                fill(recycler2, linearLayoutManager.mLayoutState, state2, false);
            }
            linearLayoutManager.mLayoutState.mScrapList = null;
        }
    }

    private void logChildren() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            String str = TAG;
            StringBuilder stringBuilder = new StringBuilder("item ");
            stringBuilder.append(getPosition(childAt));
            stringBuilder.append(", coord:");
            stringBuilder.append(this.mOrientationHelper.getDecoratedStart(childAt));
            Log.d(str, stringBuilder.toString());
        }
        Log.d(TAG, "==============");
    }

    private void recycleByLayoutState(Recycler recycler, LayoutState layoutState) {
        if (layoutState.mRecycle && !layoutState.mInfinite) {
            if (layoutState.mLayoutDirection == -1) {
                recycleViewsFromEnd(recycler, layoutState.mScrollingOffset);
            } else {
                recycleViewsFromStart(recycler, layoutState.mScrollingOffset);
            }
        }
    }

    private void recycleChildren(Recycler recycler, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (i2--; i2 >= i; i2--) {
                    removeAndRecycleViewAt(i2, recycler);
                }
                return;
            }
            while (i > i2) {
                removeAndRecycleViewAt(i, recycler);
                i--;
            }
        }
    }

    private void recycleViewsFromEnd(Recycler recycler, int i) {
        int childCount = getChildCount();
        if (i >= 0) {
            int end = this.mOrientationHelper.getEnd() - i;
            if (this.mShouldReverseLayout) {
                int i2 = 0;
                while (i2 < childCount) {
                    View childAt = getChildAt(i2);
                    if (this.mOrientationHelper.getDecoratedStart(childAt) >= end) {
                        if (this.mOrientationHelper.getTransformedStartWithDecoration(childAt) >= end) {
                            i2++;
                        }
                    }
                    recycleChildren(recycler, 0, i2);
                    break;
                }
                return;
            }
            childCount--;
            i = childCount;
            while (i >= 0) {
                View childAt2 = getChildAt(i);
                if (this.mOrientationHelper.getDecoratedStart(childAt2) >= end) {
                    if (this.mOrientationHelper.getTransformedStartWithDecoration(childAt2) >= end) {
                        i--;
                    }
                }
                recycleChildren(recycler, childCount, i);
                break;
            }
        }
    }

    private void recycleViewsFromStart(Recycler recycler, int i) {
        if (i >= 0) {
            int childCount = getChildCount();
            if (this.mShouldReverseLayout) {
                childCount--;
                int i2 = childCount;
                while (i2 >= 0) {
                    View childAt = getChildAt(i2);
                    if (this.mOrientationHelper.getDecoratedEnd(childAt) <= i) {
                        if (this.mOrientationHelper.getTransformedEndWithDecoration(childAt) <= i) {
                            i2--;
                        }
                    }
                    recycleChildren(recycler, childCount, i2);
                    break;
                }
                return;
            }
            int i3 = 0;
            while (i3 < childCount) {
                View childAt2 = getChildAt(i3);
                if (this.mOrientationHelper.getDecoratedEnd(childAt2) <= i) {
                    if (this.mOrientationHelper.getTransformedEndWithDecoration(childAt2) <= i) {
                        i3++;
                    }
                }
                recycleChildren(recycler, 0, i3);
                break;
            }
        }
    }

    private void resolveShouldLayoutReverse() {
        boolean z = true;
        if (this.mOrientation != 1) {
            if (isLayoutRTL()) {
                if (this.mReverseLayout) {
                    z = false;
                }
                this.mShouldReverseLayout = z;
            }
        }
        z = this.mReverseLayout;
        this.mShouldReverseLayout = z;
    }

    private boolean updateAnchorFromChildren(Recycler recycler, State state, AnchorInfo anchorInfo) {
        boolean z = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && anchorInfo.isViewValidAsAnchor(focusedChild, state)) {
            anchorInfo.assignFromViewAndKeepVisibleRect(focusedChild);
            return true;
        } else if (this.mLastStackFromEnd != this.mStackFromEnd) {
            return false;
        } else {
            View findReferenceChildClosestToEnd = anchorInfo.mLayoutFromEnd ? findReferenceChildClosestToEnd(recycler, state) : findReferenceChildClosestToStart(recycler, state);
            if (findReferenceChildClosestToEnd == null) {
                return false;
            }
            anchorInfo.assignFromView(findReferenceChildClosestToEnd);
            if (!state.isPreLayout() && supportsPredictiveItemAnimations()) {
                if (this.mOrientationHelper.getDecoratedStart(findReferenceChildClosestToEnd) >= this.mOrientationHelper.getEndAfterPadding() || this.mOrientationHelper.getDecoratedEnd(findReferenceChildClosestToEnd) < this.mOrientationHelper.getStartAfterPadding()) {
                    z = true;
                }
                if (z) {
                    anchorInfo.mCoordinate = anchorInfo.mLayoutFromEnd ? this.mOrientationHelper.getEndAfterPadding() : this.mOrientationHelper.getStartAfterPadding();
                }
            }
            return true;
        }
    }

    private boolean updateAnchorFromPendingData(android.support.v7.widget.RecyclerView.State r5, android.support.v7.widget.LinearLayoutManager.AnchorInfo r6) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:20:0x0052
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.modifyBlocksTree(BlockProcessor.java:248)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r4 = this;
        r0 = r5.isPreLayout();
        r1 = 0;
        if (r0 != 0) goto L_0x0103;
    L_0x0007:
        r0 = r4.mPendingScrollPosition;
        r2 = -1;
        if (r0 != r2) goto L_0x000d;
    L_0x000c:
        return r1;
    L_0x000d:
        r0 = r4.mPendingScrollPosition;
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r0 < 0) goto L_0x00ff;
    L_0x0013:
        r0 = r4.mPendingScrollPosition;
        r5 = r5.getItemCount();
        if (r0 < r5) goto L_0x001d;
    L_0x001b:
        goto L_0x00ff;
    L_0x001d:
        r5 = r4.mPendingScrollPosition;
        r6.mPosition = r5;
        r5 = r4.mPendingSavedState;
        r0 = 1;
        if (r5 == 0) goto L_0x0053;
    L_0x0026:
        r5 = r4.mPendingSavedState;
        r5 = r5.hasValidAnchor();
        if (r5 == 0) goto L_0x0053;
    L_0x002e:
        r5 = r4.mPendingSavedState;
        r5 = r5.mAnchorLayoutFromEnd;
        r6.mLayoutFromEnd = r5;
        r5 = r6.mLayoutFromEnd;
        if (r5 == 0) goto L_0x0046;
    L_0x0038:
        r5 = r4.mOrientationHelper;
        r5 = r5.getEndAfterPadding();
        r1 = r4.mPendingSavedState;
        r1 = r1.mAnchorOffset;
        r5 = r5 - r1;
    L_0x0043:
        r6.mCoordinate = r5;
        return r0;
    L_0x0046:
        r5 = r4.mOrientationHelper;
        r5 = r5.getStartAfterPadding();
        r1 = r4.mPendingSavedState;
        r1 = r1.mAnchorOffset;
        r5 = r5 + r1;
        goto L_0x0043;
        return r0;
    L_0x0053:
        r5 = r4.mPendingScrollPositionOffset;
        if (r5 != r3) goto L_0x00e0;
    L_0x0057:
        r5 = r4.mPendingScrollPosition;
        r5 = r4.findViewByPosition(r5);
        if (r5 == 0) goto L_0x00c0;
    L_0x005f:
        r2 = r4.mOrientationHelper;
        r2 = r2.getDecoratedMeasurement(r5);
        r3 = r4.mOrientationHelper;
        r3 = r3.getTotalSpace();
        if (r2 <= r3) goto L_0x0071;
    L_0x006d:
        r6.assignCoordinateFromPadding();
        return r0;
    L_0x0071:
        r2 = r4.mOrientationHelper;
        r2 = r2.getDecoratedStart(r5);
        r3 = r4.mOrientationHelper;
        r3 = r3.getStartAfterPadding();
        r2 = r2 - r3;
        if (r2 >= 0) goto L_0x008b;
    L_0x0080:
        r5 = r4.mOrientationHelper;
        r5 = r5.getStartAfterPadding();
        r6.mCoordinate = r5;
        r6.mLayoutFromEnd = r1;
        return r0;
    L_0x008b:
        r1 = r4.mOrientationHelper;
        r1 = r1.getEndAfterPadding();
        r2 = r4.mOrientationHelper;
        r2 = r2.getDecoratedEnd(r5);
        r1 = r1 - r2;
        if (r1 >= 0) goto L_0x00a5;
    L_0x009a:
        r5 = r4.mOrientationHelper;
        r5 = r5.getEndAfterPadding();
        r6.mCoordinate = r5;
        r6.mLayoutFromEnd = r0;
        return r0;
    L_0x00a5:
        r1 = r6.mLayoutFromEnd;
        if (r1 == 0) goto L_0x00b7;
    L_0x00a9:
        r1 = r4.mOrientationHelper;
        r5 = r1.getDecoratedEnd(r5);
        r1 = r4.mOrientationHelper;
        r1 = r1.getTotalSpaceChange();
        r5 = r5 + r1;
        goto L_0x00bd;
    L_0x00b7:
        r1 = r4.mOrientationHelper;
        r5 = r1.getDecoratedStart(r5);
    L_0x00bd:
        r6.mCoordinate = r5;
        return r0;
    L_0x00c0:
        r5 = r4.getChildCount();
        if (r5 <= 0) goto L_0x00dc;
    L_0x00c6:
        r5 = r4.getChildAt(r1);
        r5 = r4.getPosition(r5);
        r2 = r4.mPendingScrollPosition;
        if (r2 >= r5) goto L_0x00d4;
    L_0x00d2:
        r5 = r0;
        goto L_0x00d5;
    L_0x00d4:
        r5 = r1;
    L_0x00d5:
        r2 = r4.mShouldReverseLayout;
        if (r5 != r2) goto L_0x00da;
    L_0x00d9:
        r1 = r0;
    L_0x00da:
        r6.mLayoutFromEnd = r1;
    L_0x00dc:
        r6.assignCoordinateFromPadding();
        return r0;
    L_0x00e0:
        r5 = r4.mShouldReverseLayout;
        r6.mLayoutFromEnd = r5;
        r5 = r4.mShouldReverseLayout;
        if (r5 == 0) goto L_0x00f4;
    L_0x00e8:
        r5 = r4.mOrientationHelper;
        r5 = r5.getEndAfterPadding();
        r1 = r4.mPendingScrollPositionOffset;
        r5 = r5 - r1;
    L_0x00f1:
        r6.mCoordinate = r5;
        return r0;
    L_0x00f4:
        r5 = r4.mOrientationHelper;
        r5 = r5.getStartAfterPadding();
        r1 = r4.mPendingScrollPositionOffset;
        r5 = r5 + r1;
        goto L_0x00f1;
        return r0;
    L_0x00ff:
        r4.mPendingScrollPosition = r2;
        r4.mPendingScrollPositionOffset = r3;
    L_0x0103:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.updateAnchorFromPendingData(android.support.v7.widget.RecyclerView$State, android.support.v7.widget.LinearLayoutManager$AnchorInfo):boolean");
    }

    private void updateAnchorInfoForLayout(Recycler recycler, State state, AnchorInfo anchorInfo) {
        if (!updateAnchorFromPendingData(state, anchorInfo) && !updateAnchorFromChildren(recycler, state, anchorInfo)) {
            anchorInfo.assignCoordinateFromPadding();
            anchorInfo.mPosition = this.mStackFromEnd ? state.getItemCount() - 1 : 0;
        }
    }

    private void updateLayoutState(int i, int i2, boolean z, State state) {
        this.mLayoutState.mInfinite = resolveIsInfinite();
        this.mLayoutState.mExtra = getExtraLayoutSpace(state);
        this.mLayoutState.mLayoutDirection = i;
        int i3 = -1;
        View childClosestToEnd;
        LayoutState layoutState;
        if (i == 1) {
            LayoutState layoutState2 = this.mLayoutState;
            layoutState2.mExtra += this.mOrientationHelper.getEndPadding();
            childClosestToEnd = getChildClosestToEnd();
            layoutState = this.mLayoutState;
            if (!this.mShouldReverseLayout) {
                i3 = 1;
            }
            layoutState.mItemDirection = i3;
            this.mLayoutState.mCurrentPosition = getPosition(childClosestToEnd) + this.mLayoutState.mItemDirection;
            this.mLayoutState.mOffset = this.mOrientationHelper.getDecoratedEnd(childClosestToEnd);
            i = this.mOrientationHelper.getDecoratedEnd(childClosestToEnd) - this.mOrientationHelper.getEndAfterPadding();
        } else {
            childClosestToEnd = getChildClosestToStart();
            layoutState = this.mLayoutState;
            layoutState.mExtra += this.mOrientationHelper.getStartAfterPadding();
            layoutState = this.mLayoutState;
            if (this.mShouldReverseLayout) {
                i3 = 1;
            }
            layoutState.mItemDirection = i3;
            this.mLayoutState.mCurrentPosition = getPosition(childClosestToEnd) + this.mLayoutState.mItemDirection;
            this.mLayoutState.mOffset = this.mOrientationHelper.getDecoratedStart(childClosestToEnd);
            i = (-this.mOrientationHelper.getDecoratedStart(childClosestToEnd)) + this.mOrientationHelper.getStartAfterPadding();
        }
        this.mLayoutState.mAvailable = i2;
        if (z) {
            LayoutState layoutState3 = this.mLayoutState;
            layoutState3.mAvailable -= i;
        }
        this.mLayoutState.mScrollingOffset = i;
    }

    private void updateLayoutStateToFillEnd(int i, int i2) {
        this.mLayoutState.mAvailable = this.mOrientationHelper.getEndAfterPadding() - i2;
        this.mLayoutState.mItemDirection = this.mShouldReverseLayout ? -1 : 1;
        this.mLayoutState.mCurrentPosition = i;
        this.mLayoutState.mLayoutDirection = 1;
        this.mLayoutState.mOffset = i2;
        this.mLayoutState.mScrollingOffset = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillEnd(AnchorInfo anchorInfo) {
        updateLayoutStateToFillEnd(anchorInfo.mPosition, anchorInfo.mCoordinate);
    }

    private void updateLayoutStateToFillStart(int i, int i2) {
        this.mLayoutState.mAvailable = i2 - this.mOrientationHelper.getStartAfterPadding();
        this.mLayoutState.mCurrentPosition = i;
        this.mLayoutState.mItemDirection = this.mShouldReverseLayout ? 1 : -1;
        this.mLayoutState.mLayoutDirection = -1;
        this.mLayoutState.mOffset = i2;
        this.mLayoutState.mScrollingOffset = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(AnchorInfo anchorInfo) {
        updateLayoutStateToFillStart(anchorInfo.mPosition, anchorInfo.mCoordinate);
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    public void collectAdjacentPrefetchPositions(int i, int i2, State state, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() != 0 && i != 0) {
            ensureLayoutState();
            updateLayoutState(i > 0 ? 1 : -1, Math.abs(i), true, state);
            collectPrefetchPositionsForLayoutState(state, this.mLayoutState, layoutPrefetchRegistry);
        }
    }

    public void collectInitialPrefetchPositions(int i, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        boolean z;
        int i2;
        int i3 = -1;
        if (this.mPendingSavedState == null || !this.mPendingSavedState.hasValidAnchor()) {
            resolveShouldLayoutReverse();
            z = this.mShouldReverseLayout;
            i2 = this.mPendingScrollPosition == -1 ? z ? i - 1 : 0 : this.mPendingScrollPosition;
        } else {
            z = this.mPendingSavedState.mAnchorLayoutFromEnd;
            i2 = this.mPendingSavedState.mAnchorPosition;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.mInitialPrefetchItemCount && i2 >= 0 && i2 < i; i4++) {
            layoutPrefetchRegistry.addPosition(i2, 0);
            i2 += i3;
        }
    }

    void collectPrefetchPositionsForLayoutState(State state, LayoutState layoutState, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i = layoutState.mCurrentPosition;
        if (i >= 0 && i < state.getItemCount()) {
            layoutPrefetchRegistry.addPosition(i, Math.max(0, layoutState.mScrollingOffset));
        }
    }

    public int computeHorizontalScrollExtent(State state) {
        return computeScrollExtent(state);
    }

    public int computeHorizontalScrollOffset(State state) {
        return computeScrollOffset(state);
    }

    public int computeHorizontalScrollRange(State state) {
        return computeScrollRange(state);
    }

    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < getPosition(getChildAt(0))) {
            z = true;
        }
        if (z != this.mShouldReverseLayout) {
            i2 = -1;
        }
        return this.mOrientation == 0 ? new PointF((float) i2, 0.0f) : new PointF(0.0f, (float) i2);
    }

    public int computeVerticalScrollExtent(State state) {
        return computeScrollExtent(state);
    }

    public int computeVerticalScrollOffset(State state) {
        return computeScrollOffset(state);
    }

    public int computeVerticalScrollRange(State state) {
        return computeScrollRange(state);
    }

    int convertFocusDirectionToLayoutDirection(int i) {
        if (i == 17) {
            return this.mOrientation == 0 ? -1 : Integer.MIN_VALUE;
        } else {
            if (i == 33) {
                return this.mOrientation == 1 ? -1 : Integer.MIN_VALUE;
            } else {
                if (i == 66) {
                    return this.mOrientation == 0 ? 1 : Integer.MIN_VALUE;
                } else {
                    if (i == 130) {
                        return this.mOrientation == 1 ? 1 : Integer.MIN_VALUE;
                    } else {
                        switch (i) {
                            case 1:
                                return (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
                            case 2:
                                return (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1;
                            default:
                                return Integer.MIN_VALUE;
                        }
                    }
                }
            }
        }
    }

    LayoutState createLayoutState() {
        return new LayoutState();
    }

    void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
        if (this.mOrientationHelper == null) {
            this.mOrientationHelper = OrientationHelper.createOrientationHelper(this, this.mOrientation);
        }
    }

    int fill(Recycler recycler, LayoutState layoutState, State state, boolean z) {
        int i = layoutState.mAvailable;
        if (layoutState.mScrollingOffset != Integer.MIN_VALUE) {
            if (layoutState.mAvailable < 0) {
                layoutState.mScrollingOffset += layoutState.mAvailable;
            }
            recycleByLayoutState(recycler, layoutState);
        }
        int i2 = layoutState.mAvailable + layoutState.mExtra;
        LayoutChunkResult layoutChunkResult = this.mLayoutChunkResult;
        while (true) {
            if ((!layoutState.mInfinite && i2 <= 0) || !layoutState.hasMore(state)) {
                break;
            }
            layoutChunkResult.resetInternal();
            layoutChunk(recycler, state, layoutState, layoutChunkResult);
            if (!layoutChunkResult.mFinished) {
                layoutState.mOffset += layoutChunkResult.mConsumed * layoutState.mLayoutDirection;
                if (!(layoutChunkResult.mIgnoreConsumed && this.mLayoutState.mScrapList == null && state.isPreLayout())) {
                    layoutState.mAvailable -= layoutChunkResult.mConsumed;
                    i2 -= layoutChunkResult.mConsumed;
                }
                if (layoutState.mScrollingOffset != Integer.MIN_VALUE) {
                    layoutState.mScrollingOffset += layoutChunkResult.mConsumed;
                    if (layoutState.mAvailable < 0) {
                        layoutState.mScrollingOffset += layoutState.mAvailable;
                    }
                    recycleByLayoutState(recycler, layoutState);
                }
                if (z && layoutChunkResult.mFocusable) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - layoutState.mAvailable;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        return findOneVisibleChild == null ? -1 : getPosition(findOneVisibleChild);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        return findOneVisibleChild == null ? -1 : getPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        return findOneVisibleChild == null ? -1 : getPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        return findOneVisibleChild == null ? -1 : getPosition(findOneVisibleChild);
    }

    View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        ensureLayoutState();
        Object obj = i2 > i ? 1 : i2 < i ? -1 : null;
        if (obj == null) {
            return getChildAt(i);
        }
        int i3;
        int i4;
        if (this.mOrientationHelper.getDecoratedStart(getChildAt(i)) < this.mOrientationHelper.getStartAfterPadding()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return (this.mOrientation == 0 ? this.mHorizontalBoundCheck : this.mVerticalBoundCheck).findOneViewWithinBoundFlags(i, i2, i3, i4);
    }

    View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        ensureLayoutState();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return (this.mOrientation == 0 ? this.mHorizontalBoundCheck : this.mVerticalBoundCheck).findOneViewWithinBoundFlags(i, i2, i4, i3);
    }

    View findReferenceChild(Recycler recycler, State state, int i, int i2, int i3) {
        ensureLayoutState();
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            if (position >= 0 && position < i3) {
                if (!((LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (this.mOrientationHelper.getDecoratedStart(childAt) < endAfterPadding) {
                        if (this.mOrientationHelper.getDecoratedEnd(childAt) >= startAfterPadding) {
                            return childAt;
                        }
                    }
                    if (view == null) {
                        view = childAt;
                    }
                } else if (view2 == null) {
                    view2 = childAt;
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    protected int getExtraLayoutSpace(State state) {
        return state.hasTargetScrollPosition() ? this.mOrientationHelper.getTotalSpace() : 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    protected boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    void layoutChunk(Recycler recycler, State state, LayoutState layoutState, LayoutChunkResult layoutChunkResult) {
        View next = layoutState.next(recycler);
        if (next == null) {
            layoutChunkResult.mFinished = true;
            return;
        }
        int decoratedMeasurementInOther;
        int i;
        int i2;
        int i3;
        LayoutParams layoutParams = (LayoutParams) next.getLayoutParams();
        if (layoutState.mScrapList == null) {
            if (this.mShouldReverseLayout == (layoutState.mLayoutDirection == -1)) {
                addView(next);
            } else {
                addView(next, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (layoutState.mLayoutDirection == -1)) {
                addDisappearingView(next);
            } else {
                addDisappearingView(next, 0);
            }
        }
        measureChildWithMargins(next, 0, 0);
        layoutChunkResult.mConsumed = this.mOrientationHelper.getDecoratedMeasurement(next);
        int width;
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                width = getWidth() - getPaddingRight();
                decoratedMeasurementInOther = width - this.mOrientationHelper.getDecoratedMeasurementInOther(next);
            } else {
                decoratedMeasurementInOther = getPaddingLeft();
                width = this.mOrientationHelper.getDecoratedMeasurementInOther(next) + decoratedMeasurementInOther;
            }
            if (layoutState.mLayoutDirection == -1) {
                i = layoutState.mOffset - layoutChunkResult.mConsumed;
                i2 = width;
                i3 = layoutState.mOffset;
            } else {
                i3 = layoutState.mOffset + layoutChunkResult.mConsumed;
                i2 = width;
                i = layoutState.mOffset;
            }
        } else {
            width = getPaddingTop();
            decoratedMeasurementInOther = this.mOrientationHelper.getDecoratedMeasurementInOther(next) + width;
            if (layoutState.mLayoutDirection == -1) {
                i = width;
                i2 = layoutState.mOffset;
                i3 = decoratedMeasurementInOther;
                decoratedMeasurementInOther = layoutState.mOffset - layoutChunkResult.mConsumed;
            } else {
                i2 = layoutState.mOffset + layoutChunkResult.mConsumed;
                i = width;
                i3 = decoratedMeasurementInOther;
                decoratedMeasurementInOther = layoutState.mOffset;
            }
        }
        layoutDecoratedWithMargins(next, decoratedMeasurementInOther, i, i2, i3);
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            layoutChunkResult.mIgnoreConsumed = true;
        }
        layoutChunkResult.mFocusable = next.hasFocusable();
    }

    void onAnchorReady(Recycler recycler, State state, AnchorInfo anchorInfo, int i) {
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    public View onFocusSearchFailed(View view, int i, Recycler recycler, State state) {
        resolveShouldLayoutReverse();
        if (getChildCount() == 0) {
            return null;
        }
        int convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i);
        if (convertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        ensureLayoutState();
        updateLayoutState(convertFocusDirectionToLayoutDirection, (int) (MAX_SCROLL_FACTOR * ((float) this.mOrientationHelper.getTotalSpace())), false, state);
        this.mLayoutState.mScrollingOffset = Integer.MIN_VALUE;
        this.mLayoutState.mRecycle = false;
        fill(recycler, this.mLayoutState, state, true);
        View findPartiallyOrCompletelyInvisibleChildClosestToStart = convertFocusDirectionToLayoutDirection == -1 ? findPartiallyOrCompletelyInvisibleChildClosestToStart(recycler, state) : findPartiallyOrCompletelyInvisibleChildClosestToEnd(recycler, state);
        view = convertFocusDirectionToLayoutDirection == -1 ? getChildClosestToStart() : getChildClosestToEnd();
        return view.hasFocusable() ? findPartiallyOrCompletelyInvisibleChildClosestToStart == null ? null : view : findPartiallyOrCompletelyInvisibleChildClosestToStart;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    public void onLayoutChildren(Recycler recycler, State state) {
        int i = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            return;
        }
        int extraLayoutSpace;
        int i2;
        View findViewByPosition;
        int decoratedStart;
        int i3;
        if (this.mPendingSavedState != null && this.mPendingSavedState.hasValidAnchor()) {
            this.mPendingScrollPosition = this.mPendingSavedState.mAnchorPosition;
        }
        ensureLayoutState();
        this.mLayoutState.mRecycle = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        if (this.mAnchorInfo.mValid && this.mPendingScrollPosition == -1) {
            if (this.mPendingSavedState == null) {
                if (focusedChild != null && (this.mOrientationHelper.getDecoratedStart(focusedChild) >= this.mOrientationHelper.getEndAfterPadding() || this.mOrientationHelper.getDecoratedEnd(focusedChild) <= this.mOrientationHelper.getStartAfterPadding())) {
                    this.mAnchorInfo.assignFromViewAndKeepVisibleRect(focusedChild);
                }
                extraLayoutSpace = getExtraLayoutSpace(state);
                if (this.mLayoutState.mLastScrollDelta < 0) {
                    i2 = extraLayoutSpace;
                    extraLayoutSpace = 0;
                } else {
                    i2 = 0;
                }
                extraLayoutSpace += this.mOrientationHelper.getStartAfterPadding();
                i2 += this.mOrientationHelper.getEndPadding();
                if (!(!state.isPreLayout() || this.mPendingScrollPosition == -1 || this.mPendingScrollPositionOffset == Integer.MIN_VALUE)) {
                    findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                    if (findViewByPosition != null) {
                        if (this.mShouldReverseLayout) {
                            decoratedStart = this.mOrientationHelper.getDecoratedStart(findViewByPosition) - this.mOrientationHelper.getStartAfterPadding();
                            i3 = this.mPendingScrollPositionOffset;
                        } else {
                            i3 = this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(findViewByPosition);
                            decoratedStart = this.mPendingScrollPositionOffset;
                        }
                        i3 -= decoratedStart;
                        if (i3 <= 0) {
                            extraLayoutSpace += i3;
                        } else {
                            i2 -= i3;
                        }
                    }
                }
                if (this.mAnchorInfo.mLayoutFromEnd ? this.mShouldReverseLayout : !this.mShouldReverseLayout) {
                    i = 1;
                }
                onAnchorReady(recycler, state, this.mAnchorInfo, i);
                detachAndScrapAttachedViews(recycler);
                this.mLayoutState.mInfinite = resolveIsInfinite();
                this.mLayoutState.mIsPreLayout = state.isPreLayout();
                if (this.mAnchorInfo.mLayoutFromEnd) {
                    updateLayoutStateToFillEnd(this.mAnchorInfo);
                    this.mLayoutState.mExtra = i2;
                    fill(recycler, this.mLayoutState, state, false);
                    i2 = this.mLayoutState.mOffset;
                    i = this.mLayoutState.mCurrentPosition;
                    if (this.mLayoutState.mAvailable > 0) {
                        extraLayoutSpace += this.mLayoutState.mAvailable;
                    }
                    updateLayoutStateToFillStart(this.mAnchorInfo);
                    this.mLayoutState.mExtra = extraLayoutSpace;
                    LayoutState layoutState = this.mLayoutState;
                    layoutState.mCurrentPosition += this.mLayoutState.mItemDirection;
                    fill(recycler, this.mLayoutState, state, false);
                    extraLayoutSpace = this.mLayoutState.mOffset;
                    if (this.mLayoutState.mAvailable > 0) {
                        decoratedStart = this.mLayoutState.mAvailable;
                        updateLayoutStateToFillEnd(i, i2);
                        this.mLayoutState.mExtra = decoratedStart;
                        fill(recycler, this.mLayoutState, state, false);
                        i2 = this.mLayoutState.mOffset;
                    }
                } else {
                    updateLayoutStateToFillStart(this.mAnchorInfo);
                    this.mLayoutState.mExtra = extraLayoutSpace;
                    fill(recycler, this.mLayoutState, state, false);
                    extraLayoutSpace = this.mLayoutState.mOffset;
                    i = this.mLayoutState.mCurrentPosition;
                    if (this.mLayoutState.mAvailable > 0) {
                        i2 += this.mLayoutState.mAvailable;
                    }
                    updateLayoutStateToFillEnd(this.mAnchorInfo);
                    this.mLayoutState.mExtra = i2;
                    LayoutState layoutState2 = this.mLayoutState;
                    layoutState2.mCurrentPosition += this.mLayoutState.mItemDirection;
                    fill(recycler, this.mLayoutState, state, false);
                    i2 = this.mLayoutState.mOffset;
                    if (this.mLayoutState.mAvailable > 0) {
                        decoratedStart = this.mLayoutState.mAvailable;
                        updateLayoutStateToFillStart(i, extraLayoutSpace);
                        this.mLayoutState.mExtra = decoratedStart;
                        fill(recycler, this.mLayoutState, state, false);
                        extraLayoutSpace = this.mLayoutState.mOffset;
                    }
                }
                if (getChildCount() > 0) {
                    if ((this.mShouldReverseLayout ^ this.mStackFromEnd) == 0) {
                        i = fixLayoutEndGap(i2, recycler, state, true);
                        extraLayoutSpace += i;
                        i2 += i;
                        i = fixLayoutStartGap(extraLayoutSpace, recycler, state, false);
                    } else {
                        i = fixLayoutStartGap(extraLayoutSpace, recycler, state, true);
                        extraLayoutSpace += i;
                        i2 += i;
                        i = fixLayoutEndGap(i2, recycler, state, false);
                    }
                    extraLayoutSpace += i;
                    i2 += i;
                }
                layoutForPredictiveAnimations(recycler, state, extraLayoutSpace, i2);
                if (state.isPreLayout()) {
                    this.mOrientationHelper.onLayoutComplete();
                } else {
                    this.mAnchorInfo.reset();
                }
                this.mLastStackFromEnd = this.mStackFromEnd;
            }
        }
        this.mAnchorInfo.reset();
        this.mAnchorInfo.mLayoutFromEnd = this.mShouldReverseLayout ^ this.mStackFromEnd;
        updateAnchorInfoForLayout(recycler, state, this.mAnchorInfo);
        this.mAnchorInfo.mValid = true;
        extraLayoutSpace = getExtraLayoutSpace(state);
        if (this.mLayoutState.mLastScrollDelta < 0) {
            i2 = 0;
        } else {
            i2 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        extraLayoutSpace += this.mOrientationHelper.getStartAfterPadding();
        i2 += this.mOrientationHelper.getEndPadding();
        findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
        if (findViewByPosition != null) {
            if (this.mShouldReverseLayout) {
                decoratedStart = this.mOrientationHelper.getDecoratedStart(findViewByPosition) - this.mOrientationHelper.getStartAfterPadding();
                i3 = this.mPendingScrollPositionOffset;
            } else {
                i3 = this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(findViewByPosition);
                decoratedStart = this.mPendingScrollPositionOffset;
            }
            i3 -= decoratedStart;
            if (i3 <= 0) {
                i2 -= i3;
            } else {
                extraLayoutSpace += i3;
            }
        }
        i = 1;
        onAnchorReady(recycler, state, this.mAnchorInfo, i);
        detachAndScrapAttachedViews(recycler);
        this.mLayoutState.mInfinite = resolveIsInfinite();
        this.mLayoutState.mIsPreLayout = state.isPreLayout();
        if (this.mAnchorInfo.mLayoutFromEnd) {
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            this.mLayoutState.mExtra = i2;
            fill(recycler, this.mLayoutState, state, false);
            i2 = this.mLayoutState.mOffset;
            i = this.mLayoutState.mCurrentPosition;
            if (this.mLayoutState.mAvailable > 0) {
                extraLayoutSpace += this.mLayoutState.mAvailable;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            this.mLayoutState.mExtra = extraLayoutSpace;
            LayoutState layoutState3 = this.mLayoutState;
            layoutState3.mCurrentPosition += this.mLayoutState.mItemDirection;
            fill(recycler, this.mLayoutState, state, false);
            extraLayoutSpace = this.mLayoutState.mOffset;
            if (this.mLayoutState.mAvailable > 0) {
                decoratedStart = this.mLayoutState.mAvailable;
                updateLayoutStateToFillEnd(i, i2);
                this.mLayoutState.mExtra = decoratedStart;
                fill(recycler, this.mLayoutState, state, false);
                i2 = this.mLayoutState.mOffset;
            }
        } else {
            updateLayoutStateToFillStart(this.mAnchorInfo);
            this.mLayoutState.mExtra = extraLayoutSpace;
            fill(recycler, this.mLayoutState, state, false);
            extraLayoutSpace = this.mLayoutState.mOffset;
            i = this.mLayoutState.mCurrentPosition;
            if (this.mLayoutState.mAvailable > 0) {
                i2 += this.mLayoutState.mAvailable;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            this.mLayoutState.mExtra = i2;
            LayoutState layoutState22 = this.mLayoutState;
            layoutState22.mCurrentPosition += this.mLayoutState.mItemDirection;
            fill(recycler, this.mLayoutState, state, false);
            i2 = this.mLayoutState.mOffset;
            if (this.mLayoutState.mAvailable > 0) {
                decoratedStart = this.mLayoutState.mAvailable;
                updateLayoutStateToFillStart(i, extraLayoutSpace);
                this.mLayoutState.mExtra = decoratedStart;
                fill(recycler, this.mLayoutState, state, false);
                extraLayoutSpace = this.mLayoutState.mOffset;
            }
        }
        if (getChildCount() > 0) {
            if ((this.mShouldReverseLayout ^ this.mStackFromEnd) == 0) {
                i = fixLayoutStartGap(extraLayoutSpace, recycler, state, true);
                extraLayoutSpace += i;
                i2 += i;
                i = fixLayoutEndGap(i2, recycler, state, false);
            } else {
                i = fixLayoutEndGap(i2, recycler, state, true);
                extraLayoutSpace += i;
                i2 += i;
                i = fixLayoutStartGap(extraLayoutSpace, recycler, state, false);
            }
            extraLayoutSpace += i;
            i2 += i;
        }
        layoutForPredictiveAnimations(recycler, state, extraLayoutSpace, i2);
        if (state.isPreLayout()) {
            this.mAnchorInfo.reset();
        } else {
            this.mOrientationHelper.onLayoutComplete();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    public void onLayoutCompleted(State state) {
        super.onLayoutCompleted(state);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.reset();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.mPendingSavedState = (SavedState) parcelable;
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        Parcelable savedState = new SavedState();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            savedState.mAnchorLayoutFromEnd = z;
            View childClosestToEnd;
            if (z) {
                childClosestToEnd = getChildClosestToEnd();
                savedState.mAnchorOffset = this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(childClosestToEnd);
                savedState.mAnchorPosition = getPosition(childClosestToEnd);
                return savedState;
            }
            childClosestToEnd = getChildClosestToStart();
            savedState.mAnchorPosition = getPosition(childClosestToEnd);
            savedState.mAnchorOffset = this.mOrientationHelper.getDecoratedStart(childClosestToEnd) - this.mOrientationHelper.getStartAfterPadding();
            return savedState;
        }
        savedState.invalidateAnchor();
        return savedState;
    }

    public void prepareForDrop(View view, View view2, int i, int i2) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        i = getPosition(view);
        i2 = getPosition(view2);
        Object obj = i < i2 ? 1 : -1;
        if (this.mShouldReverseLayout) {
            if (obj == 1) {
                scrollToPositionWithOffset(i2, this.mOrientationHelper.getEndAfterPadding() - (this.mOrientationHelper.getDecoratedStart(view2) + this.mOrientationHelper.getDecoratedMeasurement(view)));
            } else {
                scrollToPositionWithOffset(i2, this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(view2));
            }
        } else if (obj == -1) {
            scrollToPositionWithOffset(i2, this.mOrientationHelper.getDecoratedStart(view2));
        } else {
            scrollToPositionWithOffset(i2, this.mOrientationHelper.getDecoratedEnd(view2) - this.mOrientationHelper.getDecoratedMeasurement(view));
        }
    }

    boolean resolveIsInfinite() {
        return this.mOrientationHelper.getMode() == 0 && this.mOrientationHelper.getEnd() == 0;
    }

    int scrollBy(int i, Recycler recycler, State state) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        this.mLayoutState.mRecycle = true;
        ensureLayoutState();
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        updateLayoutState(i2, abs, true, state);
        int fill = this.mLayoutState.mScrollingOffset + fill(recycler, this.mLayoutState, state, false);
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i = i2 * fill;
        }
        this.mOrientationHelper.offsetChildren(-i);
        this.mLayoutState.mLastScrollDelta = i;
        return i;
    }

    public int scrollHorizontallyBy(int i, Recycler recycler, State state) {
        return this.mOrientation == 1 ? 0 : scrollBy(i, recycler, state);
    }

    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        if (this.mPendingSavedState != null) {
            this.mPendingSavedState.invalidateAnchor();
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        if (this.mPendingSavedState != null) {
            this.mPendingSavedState.invalidateAnchor();
        }
        requestLayout();
    }

    public int scrollVerticallyBy(int i, Recycler recycler, State state) {
        return this.mOrientation == 0 ? 0 : scrollBy(i, recycler, state);
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public void setOrientation(int i) {
        if (i == 0 || i == 1) {
            assertNotInLayoutOrScroll(null);
            if (i != this.mOrientation) {
                this.mOrientation = i;
                this.mOrientationHelper = null;
                requestLayout();
                return;
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("invalid orientation:");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (z != this.mReverseLayout) {
            this.mReverseLayout = z;
            requestLayout();
        }
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public void setStackFromEnd(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd != z) {
            this.mStackFromEnd = z;
            requestLayout();
        }
    }

    boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, State state, int i) {
        SmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }

    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    void validateChildOrder() {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder("validating child count ");
        stringBuilder.append(getChildCount());
        Log.d(str, stringBuilder.toString());
        if (getChildCount() > 0) {
            boolean z = false;
            int position = getPosition(getChildAt(0));
            int decoratedStart = this.mOrientationHelper.getDecoratedStart(getChildAt(0));
            int i;
            View childAt;
            int position2;
            int decoratedStart2;
            StringBuilder stringBuilder2;
            if (this.mShouldReverseLayout) {
                i = 1;
                while (i < getChildCount()) {
                    childAt = getChildAt(i);
                    position2 = getPosition(childAt);
                    decoratedStart2 = this.mOrientationHelper.getDecoratedStart(childAt);
                    if (position2 < position) {
                        logChildren();
                        stringBuilder2 = new StringBuilder("detected invalid position. loc invalid? ");
                        if (decoratedStart2 < decoratedStart) {
                            z = true;
                        }
                        stringBuilder2.append(z);
                        throw new RuntimeException(stringBuilder2.toString());
                    } else if (decoratedStart2 > decoratedStart) {
                        logChildren();
                        throw new RuntimeException("detected invalid location");
                    } else {
                        i++;
                    }
                }
                return;
            }
            i = 1;
            while (i < getChildCount()) {
                childAt = getChildAt(i);
                position2 = getPosition(childAt);
                decoratedStart2 = this.mOrientationHelper.getDecoratedStart(childAt);
                if (position2 < position) {
                    logChildren();
                    stringBuilder2 = new StringBuilder("detected invalid position. loc invalid? ");
                    if (decoratedStart2 < decoratedStart) {
                        z = true;
                    }
                    stringBuilder2.append(z);
                    throw new RuntimeException(stringBuilder2.toString());
                } else if (decoratedStart2 < decoratedStart) {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                } else {
                    i++;
                }
            }
        }
    }
}
