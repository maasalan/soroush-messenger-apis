package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.p039a.C0536b;
import android.support.v4.view.p039a.C0536b.C0535l;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry;
import android.support.v7.widget.RecyclerView.LayoutManager.Properties;
import android.support.v7.widget.RecyclerView.Recycler;
import android.support.v7.widget.RecyclerView.SmoothScroller;
import android.support.v7.widget.RecyclerView.SmoothScroller.ScrollVectorProvider;
import android.support.v7.widget.RecyclerView.State;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class StaggeredGridLayoutManager extends LayoutManager implements ScrollVectorProvider {
    static final boolean DEBUG = false;
    @Deprecated
    public static final int GAP_HANDLING_LAZY = 1;
    public static final int GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS = 2;
    public static final int GAP_HANDLING_NONE = 0;
    public static final int HORIZONTAL = 0;
    static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "StaggeredGridLManager";
    public static final int VERTICAL = 1;
    private final AnchorInfo mAnchorInfo = new AnchorInfo();
    private final Runnable mCheckForGapsRunnable;
    private int mFullSizeSpec;
    private int mGapStrategy = 2;
    private boolean mLaidOutInvalidFullSpan = false;
    private boolean mLastLayoutFromEnd;
    private boolean mLastLayoutRTL;
    private final LayoutState mLayoutState;
    LazySpanLookup mLazySpanLookup = new LazySpanLookup();
    private int mOrientation;
    private SavedState mPendingSavedState;
    int mPendingScrollPosition = -1;
    int mPendingScrollPositionOffset = Integer.MIN_VALUE;
    private int[] mPrefetchDistances;
    OrientationHelper mPrimaryOrientation;
    private BitSet mRemainingSpans;
    boolean mReverseLayout = false;
    OrientationHelper mSecondaryOrientation;
    boolean mShouldReverseLayout = false;
    private int mSizePerSpan;
    private boolean mSmoothScrollbarEnabled;
    private int mSpanCount = -1;
    Span[] mSpans;
    private final Rect mTmpRect = new Rect();

    class C07781 implements Runnable {
        C07781() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.checkForGaps();
        }
    }

    class AnchorInfo {
        boolean mInvalidateOffsets;
        boolean mLayoutFromEnd;
        int mOffset;
        int mPosition;
        int[] mSpanReferenceLines;
        boolean mValid;

        AnchorInfo() {
            reset();
        }

        void assignCoordinateFromPadding() {
            this.mOffset = this.mLayoutFromEnd ? StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding() : StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding();
        }

        void assignCoordinateFromPadding(int i) {
            this.mOffset = this.mLayoutFromEnd ? StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding() - i : StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding() + i;
        }

        void reset() {
            this.mPosition = -1;
            this.mOffset = Integer.MIN_VALUE;
            this.mLayoutFromEnd = false;
            this.mInvalidateOffsets = false;
            this.mValid = false;
            if (this.mSpanReferenceLines != null) {
                Arrays.fill(this.mSpanReferenceLines, -1);
            }
        }

        void saveSpanReferenceLines(Span[] spanArr) {
            int length = spanArr.length;
            if (this.mSpanReferenceLines == null || this.mSpanReferenceLines.length < length) {
                this.mSpanReferenceLines = new int[StaggeredGridLayoutManager.this.mSpans.length];
            }
            for (int i = 0; i < length; i++) {
                this.mSpanReferenceLines[i] = spanArr[i].getStartLine(Integer.MIN_VALUE);
            }
        }
    }

    static class LazySpanLookup {
        private static final int MIN_SIZE = 10;
        int[] mData;
        List<FullSpanItem> mFullSpanItems;

        static class FullSpanItem implements Parcelable {
            public static final Creator<FullSpanItem> CREATOR = new C07791();
            int mGapDir;
            int[] mGapPerSpan;
            boolean mHasUnwantedGapAfter;
            int mPosition;

            static class C07791 implements Creator<FullSpanItem> {
                C07791() {
                }

                public final FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                public final FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            FullSpanItem() {
            }

            FullSpanItem(Parcel parcel) {
                this.mPosition = parcel.readInt();
                this.mGapDir = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                this.mHasUnwantedGapAfter = z;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    this.mGapPerSpan = new int[readInt];
                    parcel.readIntArray(this.mGapPerSpan);
                }
            }

            public int describeContents() {
                return 0;
            }

            int getGapForSpan(int i) {
                return this.mGapPerSpan == null ? 0 : this.mGapPerSpan[i];
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder("FullSpanItem{mPosition=");
                stringBuilder.append(this.mPosition);
                stringBuilder.append(", mGapDir=");
                stringBuilder.append(this.mGapDir);
                stringBuilder.append(", mHasUnwantedGapAfter=");
                stringBuilder.append(this.mHasUnwantedGapAfter);
                stringBuilder.append(", mGapPerSpan=");
                stringBuilder.append(Arrays.toString(this.mGapPerSpan));
                stringBuilder.append('}');
                return stringBuilder.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.mPosition);
                parcel.writeInt(this.mGapDir);
                parcel.writeInt(this.mHasUnwantedGapAfter);
                if (this.mGapPerSpan == null || this.mGapPerSpan.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(this.mGapPerSpan.length);
                parcel.writeIntArray(this.mGapPerSpan);
            }
        }

        LazySpanLookup() {
        }

        private int invalidateFullSpansAfter(int i) {
            if (this.mFullSpanItems == null) {
                return -1;
            }
            FullSpanItem fullSpanItem = getFullSpanItem(i);
            if (fullSpanItem != null) {
                this.mFullSpanItems.remove(fullSpanItem);
            }
            int size = this.mFullSpanItems.size();
            int i2 = 0;
            while (i2 < size) {
                if (((FullSpanItem) this.mFullSpanItems.get(i2)).mPosition >= i) {
                    break;
                }
                i2++;
            }
            i2 = -1;
            if (i2 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem2 = (FullSpanItem) this.mFullSpanItems.get(i2);
            this.mFullSpanItems.remove(i2);
            return fullSpanItem2.mPosition;
        }

        private void offsetFullSpansForAddition(int i, int i2) {
            if (this.mFullSpanItems != null) {
                for (int size = this.mFullSpanItems.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = (FullSpanItem) this.mFullSpanItems.get(size);
                    if (fullSpanItem.mPosition >= i) {
                        fullSpanItem.mPosition += i2;
                    }
                }
            }
        }

        private void offsetFullSpansForRemoval(int i, int i2) {
            if (this.mFullSpanItems != null) {
                int i3 = i + i2;
                for (int size = this.mFullSpanItems.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = (FullSpanItem) this.mFullSpanItems.get(size);
                    if (fullSpanItem.mPosition >= i) {
                        if (fullSpanItem.mPosition < i3) {
                            this.mFullSpanItems.remove(size);
                        } else {
                            fullSpanItem.mPosition -= i2;
                        }
                    }
                }
            }
        }

        public void addFullSpanItem(FullSpanItem fullSpanItem) {
            if (this.mFullSpanItems == null) {
                this.mFullSpanItems = new ArrayList();
            }
            int size = this.mFullSpanItems.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = (FullSpanItem) this.mFullSpanItems.get(i);
                if (fullSpanItem2.mPosition == fullSpanItem.mPosition) {
                    this.mFullSpanItems.remove(i);
                }
                if (fullSpanItem2.mPosition >= fullSpanItem.mPosition) {
                    this.mFullSpanItems.add(i, fullSpanItem);
                    return;
                }
            }
            this.mFullSpanItems.add(fullSpanItem);
        }

        void clear() {
            if (this.mData != null) {
                Arrays.fill(this.mData, -1);
            }
            this.mFullSpanItems = null;
        }

        void ensureSize(int i) {
            if (this.mData == null) {
                this.mData = new int[(Math.max(i, 10) + 1)];
                Arrays.fill(this.mData, -1);
                return;
            }
            if (i >= this.mData.length) {
                Object obj = this.mData;
                this.mData = new int[sizeForPosition(i)];
                System.arraycopy(obj, 0, this.mData, 0, obj.length);
                Arrays.fill(this.mData, obj.length, this.mData.length, -1);
            }
        }

        int forceInvalidateAfter(int i) {
            if (this.mFullSpanItems != null) {
                for (int size = this.mFullSpanItems.size() - 1; size >= 0; size--) {
                    if (((FullSpanItem) this.mFullSpanItems.get(size)).mPosition >= i) {
                        this.mFullSpanItems.remove(size);
                    }
                }
            }
            return invalidateAfter(i);
        }

        public FullSpanItem getFirstFullSpanItemInRange(int i, int i2, int i3, boolean z) {
            if (this.mFullSpanItems == null) {
                return null;
            }
            int size = this.mFullSpanItems.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.mFullSpanItems.get(i4);
                if (fullSpanItem.mPosition >= i2) {
                    return null;
                }
                if (fullSpanItem.mPosition >= i && (i3 == 0 || fullSpanItem.mGapDir == i3 || (z && fullSpanItem.mHasUnwantedGapAfter))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem getFullSpanItem(int i) {
            if (this.mFullSpanItems == null) {
                return null;
            }
            for (int size = this.mFullSpanItems.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.mFullSpanItems.get(size);
                if (fullSpanItem.mPosition == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        int getSpan(int i) {
            if (this.mData != null) {
                if (i < this.mData.length) {
                    return this.mData[i];
                }
            }
            return -1;
        }

        int invalidateAfter(int i) {
            if (this.mData == null || i >= this.mData.length) {
                return -1;
            }
            int invalidateFullSpansAfter = invalidateFullSpansAfter(i);
            if (invalidateFullSpansAfter == -1) {
                Arrays.fill(this.mData, i, this.mData.length, -1);
                return this.mData.length;
            }
            invalidateFullSpansAfter++;
            Arrays.fill(this.mData, i, invalidateFullSpansAfter, -1);
            return invalidateFullSpansAfter;
        }

        void offsetForAddition(int i, int i2) {
            if (this.mData != null && i < this.mData.length) {
                int i3 = i + i2;
                ensureSize(i3);
                System.arraycopy(this.mData, i, this.mData, i3, (this.mData.length - i) - i2);
                Arrays.fill(this.mData, i, i3, -1);
                offsetFullSpansForAddition(i, i2);
            }
        }

        void offsetForRemoval(int i, int i2) {
            if (this.mData != null && i < this.mData.length) {
                int i3 = i + i2;
                ensureSize(i3);
                System.arraycopy(this.mData, i3, this.mData, i, (this.mData.length - i) - i2);
                Arrays.fill(this.mData, this.mData.length - i2, this.mData.length, -1);
                offsetFullSpansForRemoval(i, i2);
            }
        }

        void setSpan(int i, Span span) {
            ensureSize(i);
            this.mData[i] = span.mIndex;
        }

        int sizeForPosition(int i) {
            int length = this.mData.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }
    }

    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new C07801();
        boolean mAnchorLayoutFromEnd;
        int mAnchorPosition;
        List<FullSpanItem> mFullSpanItems;
        boolean mLastLayoutRTL;
        boolean mReverseLayout;
        int[] mSpanLookup;
        int mSpanLookupSize;
        int[] mSpanOffsets;
        int mSpanOffsetsSize;
        int mVisibleAnchorPosition;

        static class C07801 implements Creator<SavedState> {
            C07801() {
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
            this.mVisibleAnchorPosition = parcel.readInt();
            this.mSpanOffsetsSize = parcel.readInt();
            if (this.mSpanOffsetsSize > 0) {
                this.mSpanOffsets = new int[this.mSpanOffsetsSize];
                parcel.readIntArray(this.mSpanOffsets);
            }
            this.mSpanLookupSize = parcel.readInt();
            if (this.mSpanLookupSize > 0) {
                this.mSpanLookup = new int[this.mSpanLookupSize];
                parcel.readIntArray(this.mSpanLookup);
            }
            boolean z = false;
            this.mReverseLayout = parcel.readInt() == 1;
            this.mAnchorLayoutFromEnd = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.mLastLayoutRTL = z;
            this.mFullSpanItems = parcel.readArrayList(FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.mSpanOffsetsSize = savedState.mSpanOffsetsSize;
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mVisibleAnchorPosition = savedState.mVisibleAnchorPosition;
            this.mSpanOffsets = savedState.mSpanOffsets;
            this.mSpanLookupSize = savedState.mSpanLookupSize;
            this.mSpanLookup = savedState.mSpanLookup;
            this.mReverseLayout = savedState.mReverseLayout;
            this.mAnchorLayoutFromEnd = savedState.mAnchorLayoutFromEnd;
            this.mLastLayoutRTL = savedState.mLastLayoutRTL;
            this.mFullSpanItems = savedState.mFullSpanItems;
        }

        public int describeContents() {
            return 0;
        }

        void invalidateAnchorPositionInfo() {
            this.mSpanOffsets = null;
            this.mSpanOffsetsSize = 0;
            this.mAnchorPosition = -1;
            this.mVisibleAnchorPosition = -1;
        }

        void invalidateSpanInfo() {
            this.mSpanOffsets = null;
            this.mSpanOffsetsSize = 0;
            this.mSpanLookupSize = 0;
            this.mSpanLookup = null;
            this.mFullSpanItems = null;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mVisibleAnchorPosition);
            parcel.writeInt(this.mSpanOffsetsSize);
            if (this.mSpanOffsetsSize > 0) {
                parcel.writeIntArray(this.mSpanOffsets);
            }
            parcel.writeInt(this.mSpanLookupSize);
            if (this.mSpanLookupSize > 0) {
                parcel.writeIntArray(this.mSpanLookup);
            }
            parcel.writeInt(this.mReverseLayout);
            parcel.writeInt(this.mAnchorLayoutFromEnd);
            parcel.writeInt(this.mLastLayoutRTL);
            parcel.writeList(this.mFullSpanItems);
        }
    }

    class Span {
        static final int INVALID_LINE = Integer.MIN_VALUE;
        int mCachedEnd = Integer.MIN_VALUE;
        int mCachedStart = Integer.MIN_VALUE;
        int mDeletedSize = 0;
        final int mIndex;
        ArrayList<View> mViews = new ArrayList();

        Span(int i) {
            this.mIndex = i;
        }

        void appendToSpan(View view) {
            LayoutParams layoutParams = getLayoutParams(view);
            layoutParams.mSpan = this;
            this.mViews.add(view);
            this.mCachedEnd = Integer.MIN_VALUE;
            if (this.mViews.size() == 1) {
                this.mCachedStart = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.mDeletedSize += StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(view);
            }
        }

        void cacheReferenceLineAndClear(boolean z, int i) {
            int endLine = z ? getEndLine(Integer.MIN_VALUE) : getStartLine(Integer.MIN_VALUE);
            clear();
            if (endLine != Integer.MIN_VALUE) {
                if ((!z || endLine >= StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding()) && (z || endLine <= StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding())) {
                    if (i != Integer.MIN_VALUE) {
                        endLine += i;
                    }
                    this.mCachedEnd = endLine;
                    this.mCachedStart = endLine;
                }
            }
        }

        void calculateCachedEnd() {
            View view = (View) this.mViews.get(this.mViews.size() - 1);
            LayoutParams layoutParams = getLayoutParams(view);
            this.mCachedEnd = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedEnd(view);
            if (layoutParams.mFullSpan) {
                FullSpanItem fullSpanItem = StaggeredGridLayoutManager.this.mLazySpanLookup.getFullSpanItem(layoutParams.getViewLayoutPosition());
                if (fullSpanItem != null && fullSpanItem.mGapDir == 1) {
                    this.mCachedEnd += fullSpanItem.getGapForSpan(this.mIndex);
                }
            }
        }

        void calculateCachedStart() {
            View view = (View) this.mViews.get(0);
            LayoutParams layoutParams = getLayoutParams(view);
            this.mCachedStart = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedStart(view);
            if (layoutParams.mFullSpan) {
                FullSpanItem fullSpanItem = StaggeredGridLayoutManager.this.mLazySpanLookup.getFullSpanItem(layoutParams.getViewLayoutPosition());
                if (fullSpanItem != null && fullSpanItem.mGapDir == -1) {
                    this.mCachedStart -= fullSpanItem.getGapForSpan(this.mIndex);
                }
            }
        }

        void clear() {
            this.mViews.clear();
            invalidateCache();
            this.mDeletedSize = 0;
        }

        public int findFirstCompletelyVisibleItemPosition() {
            int size;
            int i;
            if (StaggeredGridLayoutManager.this.mReverseLayout) {
                size = this.mViews.size() - 1;
                i = -1;
            } else {
                size = 0;
                i = this.mViews.size();
            }
            return findOneVisibleChild(size, i, true);
        }

        public int findFirstPartiallyVisibleItemPosition() {
            int size;
            int i;
            if (StaggeredGridLayoutManager.this.mReverseLayout) {
                size = this.mViews.size() - 1;
                i = -1;
            } else {
                size = 0;
                i = this.mViews.size();
            }
            return findOnePartiallyVisibleChild(size, i, true);
        }

        public int findFirstVisibleItemPosition() {
            return StaggeredGridLayoutManager.this.mReverseLayout ? findOneVisibleChild(this.mViews.size() - 1, -1, false) : findOneVisibleChild(0, this.mViews.size(), false);
        }

        public int findLastCompletelyVisibleItemPosition() {
            int i;
            int size;
            if (StaggeredGridLayoutManager.this.mReverseLayout) {
                i = 0;
                size = this.mViews.size();
            } else {
                i = this.mViews.size() - 1;
                size = -1;
            }
            return findOneVisibleChild(i, size, true);
        }

        public int findLastPartiallyVisibleItemPosition() {
            int i;
            int size;
            if (StaggeredGridLayoutManager.this.mReverseLayout) {
                i = 0;
                size = this.mViews.size();
            } else {
                i = this.mViews.size() - 1;
                size = -1;
            }
            return findOnePartiallyVisibleChild(i, size, true);
        }

        public int findLastVisibleItemPosition() {
            return StaggeredGridLayoutManager.this.mReverseLayout ? findOneVisibleChild(0, this.mViews.size(), false) : findOneVisibleChild(this.mViews.size() - 1, -1, false);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        int findOnePartiallyOrCompletelyVisibleChild(int r11, int r12, boolean r13, boolean r14, boolean r15) {
            /*
            r10 = this;
            r0 = android.support.v7.widget.StaggeredGridLayoutManager.this;
            r0 = r0.mPrimaryOrientation;
            r0 = r0.getStartAfterPadding();
            r1 = android.support.v7.widget.StaggeredGridLayoutManager.this;
            r1 = r1.mPrimaryOrientation;
            r1 = r1.getEndAfterPadding();
            r2 = -1;
            r3 = 1;
            if (r12 <= r11) goto L_0x0016;
        L_0x0014:
            r4 = r3;
            goto L_0x0017;
        L_0x0016:
            r4 = r2;
        L_0x0017:
            if (r11 == r12) goto L_0x0063;
        L_0x0019:
            r5 = r10.mViews;
            r5 = r5.get(r11);
            r5 = (android.view.View) r5;
            r6 = android.support.v7.widget.StaggeredGridLayoutManager.this;
            r6 = r6.mPrimaryOrientation;
            r6 = r6.getDecoratedStart(r5);
            r7 = android.support.v7.widget.StaggeredGridLayoutManager.this;
            r7 = r7.mPrimaryOrientation;
            r7 = r7.getDecoratedEnd(r5);
            r8 = 0;
            if (r15 == 0) goto L_0x003a;
        L_0x0034:
            if (r6 > r1) goto L_0x0038;
        L_0x0036:
            r9 = r3;
            goto L_0x003d;
        L_0x0038:
            r9 = r8;
            goto L_0x003d;
        L_0x003a:
            if (r6 >= r1) goto L_0x0038;
        L_0x003c:
            goto L_0x0036;
        L_0x003d:
            if (r15 == 0) goto L_0x0043;
        L_0x003f:
            if (r7 < r0) goto L_0x0046;
        L_0x0041:
            r8 = r3;
            goto L_0x0046;
        L_0x0043:
            if (r7 <= r0) goto L_0x0046;
        L_0x0045:
            goto L_0x0041;
        L_0x0046:
            if (r9 == 0) goto L_0x0061;
        L_0x0048:
            if (r8 == 0) goto L_0x0061;
        L_0x004a:
            if (r13 == 0) goto L_0x0059;
        L_0x004c:
            if (r14 == 0) goto L_0x0059;
        L_0x004e:
            if (r6 < r0) goto L_0x0061;
        L_0x0050:
            if (r7 > r1) goto L_0x0061;
        L_0x0052:
            r11 = android.support.v7.widget.StaggeredGridLayoutManager.this;
            r11 = r11.getPosition(r5);
            return r11;
        L_0x0059:
            if (r14 == 0) goto L_0x005c;
        L_0x005b:
            goto L_0x0052;
        L_0x005c:
            if (r6 < r0) goto L_0x0052;
        L_0x005e:
            if (r7 <= r1) goto L_0x0061;
        L_0x0060:
            goto L_0x0052;
        L_0x0061:
            r11 = r11 + r4;
            goto L_0x0017;
        L_0x0063:
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.Span.findOnePartiallyOrCompletelyVisibleChild(int, int, boolean, boolean, boolean):int");
        }

        int findOnePartiallyVisibleChild(int i, int i2, boolean z) {
            return findOnePartiallyOrCompletelyVisibleChild(i, i2, false, false, z);
        }

        int findOneVisibleChild(int i, int i2, boolean z) {
            return findOnePartiallyOrCompletelyVisibleChild(i, i2, z, true, false);
        }

        public int getDeletedSize() {
            return this.mDeletedSize;
        }

        int getEndLine() {
            if (this.mCachedEnd != Integer.MIN_VALUE) {
                return this.mCachedEnd;
            }
            calculateCachedEnd();
            return this.mCachedEnd;
        }

        int getEndLine(int i) {
            if (this.mCachedEnd != Integer.MIN_VALUE) {
                return this.mCachedEnd;
            }
            if (this.mViews.size() == 0) {
                return i;
            }
            calculateCachedEnd();
            return this.mCachedEnd;
        }

        public View getFocusableViewAfter(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                i2 = this.mViews.size() - 1;
                while (i2 >= 0) {
                    View view2 = (View) this.mViews.get(i2);
                    if ((StaggeredGridLayoutManager.this.mReverseLayout && StaggeredGridLayoutManager.this.getPosition(view2) >= i) || ((!StaggeredGridLayoutManager.this.mReverseLayout && StaggeredGridLayoutManager.this.getPosition(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    i2--;
                    view = view2;
                }
            } else {
                i2 = this.mViews.size();
                int i3 = 0;
                while (i3 < i2) {
                    View view3 = (View) this.mViews.get(i3);
                    if ((StaggeredGridLayoutManager.this.mReverseLayout && StaggeredGridLayoutManager.this.getPosition(view3) <= i) || ((!StaggeredGridLayoutManager.this.mReverseLayout && StaggeredGridLayoutManager.this.getPosition(view3) >= i) || !view3.hasFocusable())) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        LayoutParams getLayoutParams(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        int getStartLine() {
            if (this.mCachedStart != Integer.MIN_VALUE) {
                return this.mCachedStart;
            }
            calculateCachedStart();
            return this.mCachedStart;
        }

        int getStartLine(int i) {
            if (this.mCachedStart != Integer.MIN_VALUE) {
                return this.mCachedStart;
            }
            if (this.mViews.size() == 0) {
                return i;
            }
            calculateCachedStart();
            return this.mCachedStart;
        }

        void invalidateCache() {
            this.mCachedStart = Integer.MIN_VALUE;
            this.mCachedEnd = Integer.MIN_VALUE;
        }

        void onOffset(int i) {
            if (this.mCachedStart != Integer.MIN_VALUE) {
                this.mCachedStart += i;
            }
            if (this.mCachedEnd != Integer.MIN_VALUE) {
                this.mCachedEnd += i;
            }
        }

        void popEnd() {
            int size = this.mViews.size();
            View view = (View) this.mViews.remove(size - 1);
            LayoutParams layoutParams = getLayoutParams(view);
            layoutParams.mSpan = null;
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.mDeletedSize -= StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(view);
            }
            if (size == 1) {
                this.mCachedStart = Integer.MIN_VALUE;
            }
            this.mCachedEnd = Integer.MIN_VALUE;
        }

        void popStart() {
            View view = (View) this.mViews.remove(0);
            LayoutParams layoutParams = getLayoutParams(view);
            layoutParams.mSpan = null;
            if (this.mViews.size() == 0) {
                this.mCachedEnd = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.mDeletedSize -= StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(view);
            }
            this.mCachedStart = Integer.MIN_VALUE;
        }

        void prependToSpan(View view) {
            LayoutParams layoutParams = getLayoutParams(view);
            layoutParams.mSpan = this;
            this.mViews.add(0, view);
            this.mCachedStart = Integer.MIN_VALUE;
            if (this.mViews.size() == 1) {
                this.mCachedEnd = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.mDeletedSize += StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(view);
            }
        }

        void setLine(int i) {
            this.mCachedStart = i;
            this.mCachedEnd = i;
        }
    }

    public static class LayoutParams extends android.support.v7.widget.RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        boolean mFullSpan;
        Span mSpan;

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(android.support.v7.widget.RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public final int getSpanIndex() {
            return this.mSpan == null ? -1 : this.mSpan.mIndex;
        }

        public boolean isFullSpan() {
            return this.mFullSpan;
        }

        public void setFullSpan(boolean z) {
            this.mFullSpan = z;
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        boolean z = true;
        this.mSmoothScrollbarEnabled = true;
        this.mCheckForGapsRunnable = new C07781();
        this.mOrientation = i2;
        setSpanCount(i);
        if (this.mGapStrategy == 0) {
            z = false;
        }
        setAutoMeasureEnabled(z);
        this.mLayoutState = new LayoutState();
        createOrientationHelpers();
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        boolean z = true;
        this.mSmoothScrollbarEnabled = true;
        this.mCheckForGapsRunnable = new C07781();
        Properties properties = LayoutManager.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.orientation);
        setSpanCount(properties.spanCount);
        setReverseLayout(properties.reverseLayout);
        if (this.mGapStrategy == 0) {
            z = false;
        }
        setAutoMeasureEnabled(z);
        this.mLayoutState = new LayoutState();
        createOrientationHelpers();
    }

    private void appendViewToAllSpans(View view) {
        for (int i = this.mSpanCount - 1; i >= 0; i--) {
            this.mSpans[i].appendToSpan(view);
        }
    }

    private void applyPendingSavedState(AnchorInfo anchorInfo) {
        boolean z;
        if (this.mPendingSavedState.mSpanOffsetsSize > 0) {
            if (this.mPendingSavedState.mSpanOffsetsSize == this.mSpanCount) {
                for (int i = 0; i < this.mSpanCount; i++) {
                    this.mSpans[i].clear();
                    int i2 = this.mPendingSavedState.mSpanOffsets[i];
                    if (i2 != Integer.MIN_VALUE) {
                        i2 += this.mPendingSavedState.mAnchorLayoutFromEnd ? this.mPrimaryOrientation.getEndAfterPadding() : this.mPrimaryOrientation.getStartAfterPadding();
                    }
                    this.mSpans[i].setLine(i2);
                }
            } else {
                this.mPendingSavedState.invalidateSpanInfo();
                this.mPendingSavedState.mAnchorPosition = this.mPendingSavedState.mVisibleAnchorPosition;
            }
        }
        this.mLastLayoutRTL = this.mPendingSavedState.mLastLayoutRTL;
        setReverseLayout(this.mPendingSavedState.mReverseLayout);
        resolveShouldLayoutReverse();
        if (this.mPendingSavedState.mAnchorPosition != -1) {
            this.mPendingScrollPosition = this.mPendingSavedState.mAnchorPosition;
            z = this.mPendingSavedState.mAnchorLayoutFromEnd;
        } else {
            z = this.mShouldReverseLayout;
        }
        anchorInfo.mLayoutFromEnd = z;
        if (this.mPendingSavedState.mSpanLookupSize > 1) {
            this.mLazySpanLookup.mData = this.mPendingSavedState.mSpanLookup;
            this.mLazySpanLookup.mFullSpanItems = this.mPendingSavedState.mFullSpanItems;
        }
    }

    private void attachViewToSpans(View view, LayoutParams layoutParams, LayoutState layoutState) {
        if (layoutState.mLayoutDirection == 1) {
            if (layoutParams.mFullSpan) {
                appendViewToAllSpans(view);
            } else {
                layoutParams.mSpan.appendToSpan(view);
            }
        } else if (layoutParams.mFullSpan) {
            prependViewToAllSpans(view);
        } else {
            layoutParams.mSpan.prependToSpan(view);
        }
    }

    private int calculateScrollDirectionForPosition(int i) {
        if (getChildCount() == 0) {
            return this.mShouldReverseLayout ? 1 : -1;
        } else {
            return (i < getFirstChildPosition()) != this.mShouldReverseLayout ? -1 : 1;
        }
    }

    private boolean checkSpanForGap(Span span) {
        return this.mShouldReverseLayout ? span.getEndLine() < this.mPrimaryOrientation.getEndAfterPadding() && !span.getLayoutParams((View) span.mViews.get(span.mViews.size() - 1)).mFullSpan : span.getStartLine() > this.mPrimaryOrientation.getStartAfterPadding() && !span.getLayoutParams((View) span.mViews.get(0)).mFullSpan;
    }

    private int computeScrollExtent(State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return ScrollbarHelper.computeScrollExtent(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(this.mSmoothScrollbarEnabled ^ 1), findFirstVisibleItemClosestToEnd(this.mSmoothScrollbarEnabled ^ 1), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return ScrollbarHelper.computeScrollOffset(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(this.mSmoothScrollbarEnabled ^ 1), findFirstVisibleItemClosestToEnd(this.mSmoothScrollbarEnabled ^ 1), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return ScrollbarHelper.computeScrollRange(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(this.mSmoothScrollbarEnabled ^ 1), findFirstVisibleItemClosestToEnd(this.mSmoothScrollbarEnabled ^ 1), this, this.mSmoothScrollbarEnabled);
    }

    private int convertFocusDirectionToLayoutDirection(int i) {
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

    private FullSpanItem createFullSpanItemFromEnd(int i) {
        FullSpanItem fullSpanItem = new FullSpanItem();
        fullSpanItem.mGapPerSpan = new int[this.mSpanCount];
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            fullSpanItem.mGapPerSpan[i2] = i - this.mSpans[i2].getEndLine(i);
        }
        return fullSpanItem;
    }

    private FullSpanItem createFullSpanItemFromStart(int i) {
        FullSpanItem fullSpanItem = new FullSpanItem();
        fullSpanItem.mGapPerSpan = new int[this.mSpanCount];
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            fullSpanItem.mGapPerSpan[i2] = this.mSpans[i2].getStartLine(i) - i;
        }
        return fullSpanItem;
    }

    private void createOrientationHelpers() {
        this.mPrimaryOrientation = OrientationHelper.createOrientationHelper(this, this.mOrientation);
        this.mSecondaryOrientation = OrientationHelper.createOrientationHelper(this, 1 - this.mOrientation);
    }

    private int fill(Recycler recycler, LayoutState layoutState, State state) {
        int span;
        Recycler recycler2 = recycler;
        LayoutState layoutState2 = layoutState;
        boolean z = false;
        this.mRemainingSpans.set(0, this.mSpanCount, true);
        int i = this.mLayoutState.mInfinite ? layoutState2.mLayoutDirection == 1 ? ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : Integer.MIN_VALUE : layoutState2.mLayoutDirection == 1 ? layoutState2.mEndLine + layoutState2.mAvailable : layoutState2.mStartLine - layoutState2.mAvailable;
        int i2 = i;
        updateAllRemainingSpans(layoutState2.mLayoutDirection, i2);
        int endAfterPadding = r6.mShouldReverseLayout ? r6.mPrimaryOrientation.getEndAfterPadding() : r6.mPrimaryOrientation.getStartAfterPadding();
        boolean z2 = false;
        while (layoutState.hasMore(state) && (r6.mLayoutState.mInfinite || !r6.mRemainingSpans.isEmpty())) {
            Span nextSpan;
            int decoratedMeasurement;
            int i3;
            int i4;
            int decoratedMeasurement2;
            StaggeredGridLayoutManager staggeredGridLayoutManager;
            View view;
            int i5;
            View next = layoutState2.next(recycler2);
            LayoutParams layoutParams = (LayoutParams) next.getLayoutParams();
            i = layoutParams.getViewLayoutPosition();
            span = r6.mLazySpanLookup.getSpan(i);
            boolean z3 = span == -1 ? true : z;
            if (z3) {
                nextSpan = layoutParams.mFullSpan ? r6.mSpans[z] : getNextSpan(layoutState2);
                r6.mLazySpanLookup.setSpan(i, nextSpan);
            } else {
                nextSpan = r6.mSpans[span];
            }
            Span span2 = nextSpan;
            layoutParams.mSpan = span2;
            if (layoutState2.mLayoutDirection == 1) {
                addView(next);
            } else {
                addView(next, z);
            }
            measureChildWithDecorationsAndMargin(next, layoutParams, z);
            FullSpanItem createFullSpanItemFromEnd;
            if (layoutState2.mLayoutDirection == 1) {
                span = layoutParams.mFullSpan ? getMaxEnd(endAfterPadding) : span2.getEndLine(endAfterPadding);
                decoratedMeasurement = r6.mPrimaryOrientation.getDecoratedMeasurement(next) + span;
                if (z3 && layoutParams.mFullSpan) {
                    createFullSpanItemFromEnd = createFullSpanItemFromEnd(span);
                    createFullSpanItemFromEnd.mGapDir = -1;
                    createFullSpanItemFromEnd.mPosition = i;
                    r6.mLazySpanLookup.addFullSpanItem(createFullSpanItemFromEnd);
                }
                i3 = decoratedMeasurement;
                decoratedMeasurement = span;
            } else {
                span = layoutParams.mFullSpan ? getMinStart(endAfterPadding) : span2.getStartLine(endAfterPadding);
                decoratedMeasurement = span - r6.mPrimaryOrientation.getDecoratedMeasurement(next);
                if (z3 && layoutParams.mFullSpan) {
                    createFullSpanItemFromEnd = createFullSpanItemFromStart(span);
                    createFullSpanItemFromEnd.mGapDir = 1;
                    createFullSpanItemFromEnd.mPosition = i;
                    r6.mLazySpanLookup.addFullSpanItem(createFullSpanItemFromEnd);
                }
                i3 = span;
            }
            if (layoutParams.mFullSpan && layoutState2.mItemDirection == -1) {
                if (!z3) {
                    if (((layoutState2.mLayoutDirection == 1 ? areAllEndsEqual() : areAllStartsEqual()) ^ 1) != 0) {
                        FullSpanItem fullSpanItem = r6.mLazySpanLookup.getFullSpanItem(i);
                        if (fullSpanItem != null) {
                            fullSpanItem.mHasUnwantedGapAfter = true;
                        }
                    }
                }
                r6.mLaidOutInvalidFullSpan = true;
            }
            attachViewToSpans(next, layoutParams, layoutState2);
            if (isLayoutRTL() && r6.mOrientation == 1) {
                i = layoutParams.mFullSpan ? r6.mSecondaryOrientation.getEndAfterPadding() : r6.mSecondaryOrientation.getEndAfterPadding() - (((r6.mSpanCount - 1) - span2.mIndex) * r6.mSizePerSpan);
                i4 = i;
                decoratedMeasurement2 = i - r6.mSecondaryOrientation.getDecoratedMeasurement(next);
            } else {
                i = layoutParams.mFullSpan ? r6.mSecondaryOrientation.getStartAfterPadding() : (span2.mIndex * r6.mSizePerSpan) + r6.mSecondaryOrientation.getStartAfterPadding();
                decoratedMeasurement2 = i;
                i4 = r6.mSecondaryOrientation.getDecoratedMeasurement(next) + i;
            }
            if (r6.mOrientation == 1) {
                staggeredGridLayoutManager = r6;
                view = next;
                i5 = decoratedMeasurement2;
                decoratedMeasurement2 = decoratedMeasurement;
                decoratedMeasurement = i4;
            } else {
                staggeredGridLayoutManager = r6;
                view = next;
                i5 = decoratedMeasurement;
                decoratedMeasurement = i3;
                i3 = i4;
            }
            staggeredGridLayoutManager.layoutDecoratedWithMargins(view, i5, decoratedMeasurement2, decoratedMeasurement, i3);
            if (layoutParams.mFullSpan) {
                updateAllRemainingSpans(r6.mLayoutState.mLayoutDirection, i2);
            } else {
                updateRemainingSpans(span2, r6.mLayoutState.mLayoutDirection, i2);
            }
            recycle(recycler2, r6.mLayoutState);
            if (r6.mLayoutState.mStopInFocusable && next.hasFocusable()) {
                if (layoutParams.mFullSpan) {
                    r6.mRemainingSpans.clear();
                } else {
                    r6.mRemainingSpans.set(span2.mIndex, false);
                }
            }
            z2 = true;
            z = false;
        }
        if (!z2) {
            recycle(recycler2, r6.mLayoutState);
        }
        span = r6.mLayoutState.mLayoutDirection == -1 ? r6.mPrimaryOrientation.getStartAfterPadding() - getMinStart(r6.mPrimaryOrientation.getStartAfterPadding()) : getMaxEnd(r6.mPrimaryOrientation.getEndAfterPadding()) - r6.mPrimaryOrientation.getEndAfterPadding();
        return span > 0 ? Math.min(layoutState2.mAvailable, span) : 0;
    }

    private int findFirstReferenceChildPosition(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            int position = getPosition(getChildAt(i2));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    private int findLastReferenceChildPosition(int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    private void fixEndGap(Recycler recycler, State state, boolean z) {
        int maxEnd = getMaxEnd(Integer.MIN_VALUE);
        if (maxEnd != Integer.MIN_VALUE) {
            int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding() - maxEnd;
            if (endAfterPadding > 0) {
                endAfterPadding -= -scrollBy(-endAfterPadding, recycler, state);
                if (z && endAfterPadding > 0) {
                    this.mPrimaryOrientation.offsetChildren(endAfterPadding);
                }
            }
        }
    }

    private void fixStartGap(Recycler recycler, State state, boolean z) {
        int minStart = getMinStart(ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        if (minStart != ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
            minStart -= this.mPrimaryOrientation.getStartAfterPadding();
            if (minStart > 0) {
                minStart -= scrollBy(minStart, recycler, state);
                if (z && minStart > 0) {
                    this.mPrimaryOrientation.offsetChildren(-minStart);
                }
            }
        }
    }

    private int getMaxEnd(int i) {
        int endLine = this.mSpans[0].getEndLine(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int endLine2 = this.mSpans[i2].getEndLine(i);
            if (endLine2 > endLine) {
                endLine = endLine2;
            }
        }
        return endLine;
    }

    private int getMaxStart(int i) {
        int startLine = this.mSpans[0].getStartLine(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int startLine2 = this.mSpans[i2].getStartLine(i);
            if (startLine2 > startLine) {
                startLine = startLine2;
            }
        }
        return startLine;
    }

    private int getMinEnd(int i) {
        int endLine = this.mSpans[0].getEndLine(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int endLine2 = this.mSpans[i2].getEndLine(i);
            if (endLine2 < endLine) {
                endLine = endLine2;
            }
        }
        return endLine;
    }

    private int getMinStart(int i) {
        int startLine = this.mSpans[0].getStartLine(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int startLine2 = this.mSpans[i2].getStartLine(i);
            if (startLine2 < startLine) {
                startLine = startLine2;
            }
        }
        return startLine;
    }

    private Span getNextSpan(LayoutState layoutState) {
        int i;
        int i2;
        int i3 = -1;
        if (preferLastSpan(layoutState.mLayoutDirection)) {
            i = this.mSpanCount - 1;
            i2 = -1;
        } else {
            i = 0;
            i3 = this.mSpanCount;
            i2 = 1;
        }
        Span span = null;
        int i4;
        int startAfterPadding;
        Span span2;
        int endLine;
        if (layoutState.mLayoutDirection == 1) {
            i4 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
            while (i != i3) {
                span2 = this.mSpans[i];
                endLine = span2.getEndLine(startAfterPadding);
                if (endLine < i4) {
                    span = span2;
                    i4 = endLine;
                }
                i += i2;
            }
            return span;
        }
        i4 = Integer.MIN_VALUE;
        startAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        while (i != i3) {
            span2 = this.mSpans[i];
            endLine = span2.getStartLine(startAfterPadding);
            if (endLine > i4) {
                span = span2;
                i4 = endLine;
            }
            i += i2;
        }
        return span;
    }

    private void handleUpdate(int i, int i2, int i3) {
        int i4;
        int i5;
        int lastChildPosition = this.mShouldReverseLayout ? getLastChildPosition() : getFirstChildPosition();
        if (i3 != 8) {
            i4 = i + i2;
        } else if (i < i2) {
            i4 = i2 + 1;
        } else {
            i5 = i + 1;
            i4 = i2;
            this.mLazySpanLookup.invalidateAfter(i4);
            if (i3 != 8) {
                switch (i3) {
                    case 1:
                        this.mLazySpanLookup.offsetForAddition(i, i2);
                        break;
                    case 2:
                        this.mLazySpanLookup.offsetForRemoval(i, i2);
                        break;
                    default:
                        break;
                }
            }
            this.mLazySpanLookup.offsetForRemoval(i, 1);
            this.mLazySpanLookup.offsetForAddition(i2, 1);
            if (i5 <= lastChildPosition) {
                if (i4 <= (this.mShouldReverseLayout ? getFirstChildPosition() : getLastChildPosition())) {
                    requestLayout();
                }
            }
        }
        i5 = i4;
        i4 = i;
        this.mLazySpanLookup.invalidateAfter(i4);
        if (i3 != 8) {
            switch (i3) {
                case 1:
                    this.mLazySpanLookup.offsetForAddition(i, i2);
                    break;
                case 2:
                    this.mLazySpanLookup.offsetForRemoval(i, i2);
                    break;
                default:
                    break;
            }
        }
        this.mLazySpanLookup.offsetForRemoval(i, 1);
        this.mLazySpanLookup.offsetForAddition(i2, 1);
        if (i5 <= lastChildPosition) {
            if (this.mShouldReverseLayout) {
            }
            if (i4 <= (this.mShouldReverseLayout ? getFirstChildPosition() : getLastChildPosition())) {
                requestLayout();
            }
        }
    }

    private void measureChildWithDecorationsAndMargin(View view, int i, int i2, boolean z) {
        calculateItemDecorationsForChild(view, this.mTmpRect);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        i = updateSpecWithExtra(i, layoutParams.leftMargin + this.mTmpRect.left, layoutParams.rightMargin + this.mTmpRect.right);
        i2 = updateSpecWithExtra(i2, layoutParams.topMargin + this.mTmpRect.top, layoutParams.bottomMargin + this.mTmpRect.bottom);
        if (z ? shouldReMeasureChild(view, i, i2, layoutParams) : shouldMeasureChild(view, i, i2, layoutParams)) {
            view.measure(i, i2);
        }
    }

    private void measureChildWithDecorationsAndMargin(View view, LayoutParams layoutParams, boolean z) {
        if (layoutParams.mFullSpan) {
            if (this.mOrientation == 1) {
                measureChildWithDecorationsAndMargin(view, this.mFullSizeSpec, LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), 0, layoutParams.height, true), z);
            } else {
                measureChildWithDecorationsAndMargin(view, LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), 0, layoutParams.width, true), this.mFullSizeSpec, z);
            }
        } else if (this.mOrientation == 1) {
            measureChildWithDecorationsAndMargin(view, LayoutManager.getChildMeasureSpec(this.mSizePerSpan, getWidthMode(), 0, layoutParams.width, false), LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), 0, layoutParams.height, true), z);
        } else {
            measureChildWithDecorationsAndMargin(view, LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), 0, layoutParams.width, true), LayoutManager.getChildMeasureSpec(this.mSizePerSpan, getHeightMode(), 0, layoutParams.height, false), z);
        }
    }

    private void onLayoutChildren(Recycler recycler, State state, boolean z) {
        while (true) {
            AnchorInfo anchorInfo = this.mAnchorInfo;
            if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && state.getItemCount() == 0) {
                removeAndRecycleAllViews(recycler);
                anchorInfo.reset();
                return;
            }
            boolean z2;
            int i;
            boolean z3 = true;
            if (anchorInfo.mValid && this.mPendingScrollPosition == -1) {
                if (this.mPendingSavedState == null) {
                    z2 = false;
                    if (z2) {
                        anchorInfo.reset();
                        if (this.mPendingSavedState == null) {
                            applyPendingSavedState(anchorInfo);
                        } else {
                            resolveShouldLayoutReverse();
                            anchorInfo.mLayoutFromEnd = this.mShouldReverseLayout;
                        }
                        updateAnchorInfoForLayout(state, anchorInfo);
                        anchorInfo.mValid = true;
                    }
                    if (this.mPendingSavedState == null && this.mPendingScrollPosition == -1 && !(anchorInfo.mLayoutFromEnd == this.mLastLayoutFromEnd && isLayoutRTL() == this.mLastLayoutRTL)) {
                        this.mLazySpanLookup.clear();
                        anchorInfo.mInvalidateOffsets = true;
                    }
                    if (getChildCount() > 0 && (this.mPendingSavedState == null || this.mPendingSavedState.mSpanOffsetsSize <= 0)) {
                        if (anchorInfo.mInvalidateOffsets) {
                            if (!z2) {
                                if (this.mAnchorInfo.mSpanReferenceLines == null) {
                                    for (i = 0; i < this.mSpanCount; i++) {
                                        Span span = this.mSpans[i];
                                        span.clear();
                                        span.setLine(this.mAnchorInfo.mSpanReferenceLines[i]);
                                    }
                                }
                            }
                            for (i = 0; i < this.mSpanCount; i++) {
                                this.mSpans[i].cacheReferenceLineAndClear(this.mShouldReverseLayout, anchorInfo.mOffset);
                            }
                            this.mAnchorInfo.saveSpanReferenceLines(this.mSpans);
                        } else {
                            for (i = 0; i < this.mSpanCount; i++) {
                                this.mSpans[i].clear();
                                if (anchorInfo.mOffset != Integer.MIN_VALUE) {
                                    this.mSpans[i].setLine(anchorInfo.mOffset);
                                }
                            }
                        }
                    }
                    detachAndScrapAttachedViews(recycler);
                    this.mLayoutState.mRecycle = false;
                    this.mLaidOutInvalidFullSpan = false;
                    updateMeasureSpecs(this.mSecondaryOrientation.getTotalSpace());
                    updateLayoutState(anchorInfo.mPosition, state);
                    if (anchorInfo.mLayoutFromEnd) {
                        setLayoutStateDirection(1);
                        fill(recycler, this.mLayoutState, state);
                        setLayoutStateDirection(-1);
                    } else {
                        setLayoutStateDirection(-1);
                        fill(recycler, this.mLayoutState, state);
                        setLayoutStateDirection(1);
                    }
                    this.mLayoutState.mCurrentPosition = anchorInfo.mPosition + this.mLayoutState.mItemDirection;
                    fill(recycler, this.mLayoutState, state);
                    repositionToWrapContentIfNecessary();
                    if (getChildCount() > 0) {
                        if (this.mShouldReverseLayout) {
                            fixStartGap(recycler, state, true);
                            fixEndGap(recycler, state, false);
                        } else {
                            fixEndGap(recycler, state, true);
                            fixStartGap(recycler, state, false);
                        }
                    }
                    if (z && !state.isPreLayout()) {
                        z = this.mGapStrategy == 0 && getChildCount() > 0 && (this.mLaidOutInvalidFullSpan || hasGapsToFix() != null);
                        if (z) {
                            removeCallbacks(this.mCheckForGapsRunnable);
                            if (checkForGaps()) {
                                if (state.isPreLayout()) {
                                    this.mAnchorInfo.reset();
                                }
                                this.mLastLayoutFromEnd = anchorInfo.mLayoutFromEnd;
                                this.mLastLayoutRTL = isLayoutRTL();
                                if (!z3) {
                                    this.mAnchorInfo.reset();
                                    z = false;
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                    z3 = false;
                    if (state.isPreLayout()) {
                        this.mAnchorInfo.reset();
                    }
                    this.mLastLayoutFromEnd = anchorInfo.mLayoutFromEnd;
                    this.mLastLayoutRTL = isLayoutRTL();
                    if (!z3) {
                        this.mAnchorInfo.reset();
                        z = false;
                    } else {
                        return;
                    }
                }
            }
            z2 = true;
            if (z2) {
                anchorInfo.reset();
                if (this.mPendingSavedState == null) {
                    resolveShouldLayoutReverse();
                    anchorInfo.mLayoutFromEnd = this.mShouldReverseLayout;
                } else {
                    applyPendingSavedState(anchorInfo);
                }
                updateAnchorInfoForLayout(state, anchorInfo);
                anchorInfo.mValid = true;
            }
            this.mLazySpanLookup.clear();
            anchorInfo.mInvalidateOffsets = true;
            if (anchorInfo.mInvalidateOffsets) {
                if (z2) {
                    if (this.mAnchorInfo.mSpanReferenceLines == null) {
                        for (i = 0; i < this.mSpanCount; i++) {
                            Span span2 = this.mSpans[i];
                            span2.clear();
                            span2.setLine(this.mAnchorInfo.mSpanReferenceLines[i]);
                        }
                    }
                }
                for (i = 0; i < this.mSpanCount; i++) {
                    this.mSpans[i].cacheReferenceLineAndClear(this.mShouldReverseLayout, anchorInfo.mOffset);
                }
                this.mAnchorInfo.saveSpanReferenceLines(this.mSpans);
            } else {
                for (i = 0; i < this.mSpanCount; i++) {
                    this.mSpans[i].clear();
                    if (anchorInfo.mOffset != Integer.MIN_VALUE) {
                        this.mSpans[i].setLine(anchorInfo.mOffset);
                    }
                }
            }
            detachAndScrapAttachedViews(recycler);
            this.mLayoutState.mRecycle = false;
            this.mLaidOutInvalidFullSpan = false;
            updateMeasureSpecs(this.mSecondaryOrientation.getTotalSpace());
            updateLayoutState(anchorInfo.mPosition, state);
            if (anchorInfo.mLayoutFromEnd) {
                setLayoutStateDirection(1);
                fill(recycler, this.mLayoutState, state);
                setLayoutStateDirection(-1);
            } else {
                setLayoutStateDirection(-1);
                fill(recycler, this.mLayoutState, state);
                setLayoutStateDirection(1);
            }
            this.mLayoutState.mCurrentPosition = anchorInfo.mPosition + this.mLayoutState.mItemDirection;
            fill(recycler, this.mLayoutState, state);
            repositionToWrapContentIfNecessary();
            if (getChildCount() > 0) {
                if (this.mShouldReverseLayout) {
                    fixStartGap(recycler, state, true);
                    fixEndGap(recycler, state, false);
                } else {
                    fixEndGap(recycler, state, true);
                    fixStartGap(recycler, state, false);
                }
            }
            if (this.mGapStrategy == 0) {
            }
            if (z) {
                removeCallbacks(this.mCheckForGapsRunnable);
                if (checkForGaps()) {
                    if (state.isPreLayout()) {
                        this.mAnchorInfo.reset();
                    }
                    this.mLastLayoutFromEnd = anchorInfo.mLayoutFromEnd;
                    this.mLastLayoutRTL = isLayoutRTL();
                    if (!z3) {
                        this.mAnchorInfo.reset();
                        z = false;
                    } else {
                        return;
                    }
                }
            }
            z3 = false;
            if (state.isPreLayout()) {
                this.mAnchorInfo.reset();
            }
            this.mLastLayoutFromEnd = anchorInfo.mLayoutFromEnd;
            this.mLastLayoutRTL = isLayoutRTL();
            if (!z3) {
                this.mAnchorInfo.reset();
                z = false;
            } else {
                return;
            }
        }
    }

    private boolean preferLastSpan(int i) {
        if (this.mOrientation == 0) {
            return (i == -1) != this.mShouldReverseLayout;
        } else {
            return ((i == -1) == this.mShouldReverseLayout) == isLayoutRTL();
        }
    }

    private void prependViewToAllSpans(View view) {
        for (int i = this.mSpanCount - 1; i >= 0; i--) {
            this.mSpans[i].prependToSpan(view);
        }
    }

    private void recycle(Recycler recycler, LayoutState layoutState) {
        if (layoutState.mRecycle && !layoutState.mInfinite) {
            if (layoutState.mAvailable == 0) {
                if (layoutState.mLayoutDirection == -1) {
                    recycleFromEnd(recycler, layoutState.mEndLine);
                } else {
                    recycleFromStart(recycler, layoutState.mStartLine);
                }
            } else if (layoutState.mLayoutDirection == -1) {
                r0 = layoutState.mStartLine - getMaxStart(layoutState.mStartLine);
                recycleFromEnd(recycler, r0 < 0 ? layoutState.mEndLine : layoutState.mEndLine - Math.min(r0, layoutState.mAvailable));
            } else {
                r0 = getMinEnd(layoutState.mEndLine) - layoutState.mEndLine;
                recycleFromStart(recycler, r0 < 0 ? layoutState.mStartLine : Math.min(r0, layoutState.mAvailable) + layoutState.mStartLine);
            }
        }
    }

    private void recycleFromEnd(Recycler recycler, int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.mPrimaryOrientation.getDecoratedStart(childAt) < i || this.mPrimaryOrientation.getTransformedStartWithDecoration(childAt) < i) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.mFullSpan) {
                int i2 = 0;
                int i3 = 0;
                while (i3 < this.mSpanCount) {
                    if (this.mSpans[i3].mViews.size() != 1) {
                        i3++;
                    } else {
                        return;
                    }
                }
                while (i2 < this.mSpanCount) {
                    this.mSpans[i2].popEnd();
                    i2++;
                }
            } else if (layoutParams.mSpan.mViews.size() != 1) {
                layoutParams.mSpan.popEnd();
            } else {
                return;
            }
            removeAndRecycleView(childAt, recycler);
        }
    }

    private void recycleFromStart(Recycler recycler, int i) {
        while (getChildCount() > 0) {
            int i2 = 0;
            View childAt = getChildAt(0);
            if (this.mPrimaryOrientation.getDecoratedEnd(childAt) > i || this.mPrimaryOrientation.getTransformedEndWithDecoration(childAt) > i) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.mFullSpan) {
                int i3 = 0;
                while (i3 < this.mSpanCount) {
                    if (this.mSpans[i3].mViews.size() != 1) {
                        i3++;
                    } else {
                        return;
                    }
                }
                while (i2 < this.mSpanCount) {
                    this.mSpans[i2].popStart();
                    i2++;
                }
            } else if (layoutParams.mSpan.mViews.size() != 1) {
                layoutParams.mSpan.popStart();
            } else {
                return;
            }
            removeAndRecycleView(childAt, recycler);
        }
    }

    private void repositionToWrapContentIfNecessary() {
        if (this.mSecondaryOrientation.getMode() != 1073741824) {
            int i;
            int childCount = getChildCount();
            int i2 = 0;
            float f = 0.0f;
            for (i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                float decoratedMeasurement = (float) this.mSecondaryOrientation.getDecoratedMeasurement(childAt);
                if (decoratedMeasurement >= f) {
                    if (((LayoutParams) childAt.getLayoutParams()).isFullSpan()) {
                        decoratedMeasurement = (BallPulseIndicator.SCALE * decoratedMeasurement) / ((float) this.mSpanCount);
                    }
                    f = Math.max(f, decoratedMeasurement);
                }
            }
            i = this.mSizePerSpan;
            int round = Math.round(f * ((float) this.mSpanCount));
            if (this.mSecondaryOrientation.getMode() == Integer.MIN_VALUE) {
                round = Math.min(round, this.mSecondaryOrientation.getTotalSpace());
            }
            updateMeasureSpecs(round);
            if (this.mSizePerSpan != i) {
                while (i2 < childCount) {
                    View childAt2 = getChildAt(i2);
                    LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
                    if (!layoutParams.mFullSpan) {
                        int i3;
                        int i4;
                        if (isLayoutRTL() && this.mOrientation == 1) {
                            i3 = (-((this.mSpanCount - 1) - layoutParams.mSpan.mIndex)) * this.mSizePerSpan;
                            i4 = (-((this.mSpanCount - 1) - layoutParams.mSpan.mIndex)) * i;
                        } else {
                            i3 = layoutParams.mSpan.mIndex * this.mSizePerSpan;
                            i4 = layoutParams.mSpan.mIndex * i;
                            if (this.mOrientation != 1) {
                                childAt2.offsetTopAndBottom(i3 - i4);
                            }
                        }
                        childAt2.offsetLeftAndRight(i3 - i4);
                    }
                    i2++;
                }
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

    private void setLayoutStateDirection(int i) {
        this.mLayoutState.mLayoutDirection = i;
        LayoutState layoutState = this.mLayoutState;
        int i2 = 1;
        if (this.mShouldReverseLayout != (i == -1)) {
            i2 = -1;
        }
        layoutState.mItemDirection = i2;
    }

    private void updateAllRemainingSpans(int i, int i2) {
        for (int i3 = 0; i3 < this.mSpanCount; i3++) {
            if (!this.mSpans[i3].mViews.isEmpty()) {
                updateRemainingSpans(this.mSpans[i3], i, i2);
            }
        }
    }

    private boolean updateAnchorFromChildren(State state, AnchorInfo anchorInfo) {
        anchorInfo.mPosition = this.mLastLayoutFromEnd ? findLastReferenceChildPosition(state.getItemCount()) : findFirstReferenceChildPosition(state.getItemCount());
        anchorInfo.mOffset = Integer.MIN_VALUE;
        return true;
    }

    private void updateLayoutState(int i, State state) {
        int targetScrollPosition;
        LayoutState layoutState;
        boolean z = false;
        this.mLayoutState.mAvailable = 0;
        this.mLayoutState.mCurrentPosition = i;
        if (isSmoothScrolling()) {
            targetScrollPosition = state.getTargetScrollPosition();
            if (targetScrollPosition != -1) {
                if (this.mShouldReverseLayout == (targetScrollPosition < i)) {
                    targetScrollPosition = this.mPrimaryOrientation.getTotalSpace();
                    i = 0;
                } else {
                    i = this.mPrimaryOrientation.getTotalSpace();
                    targetScrollPosition = 0;
                }
                if (getClipToPadding()) {
                    this.mLayoutState.mEndLine = this.mPrimaryOrientation.getEnd() + targetScrollPosition;
                    this.mLayoutState.mStartLine = -i;
                } else {
                    this.mLayoutState.mStartLine = this.mPrimaryOrientation.getStartAfterPadding() - i;
                    this.mLayoutState.mEndLine = this.mPrimaryOrientation.getEndAfterPadding() + targetScrollPosition;
                }
                this.mLayoutState.mStopInFocusable = false;
                this.mLayoutState.mRecycle = true;
                layoutState = this.mLayoutState;
                if (this.mPrimaryOrientation.getMode() == 0 && this.mPrimaryOrientation.getEnd() == 0) {
                    z = true;
                }
                layoutState.mInfinite = z;
            }
        }
        i = 0;
        targetScrollPosition = i;
        if (getClipToPadding()) {
            this.mLayoutState.mEndLine = this.mPrimaryOrientation.getEnd() + targetScrollPosition;
            this.mLayoutState.mStartLine = -i;
        } else {
            this.mLayoutState.mStartLine = this.mPrimaryOrientation.getStartAfterPadding() - i;
            this.mLayoutState.mEndLine = this.mPrimaryOrientation.getEndAfterPadding() + targetScrollPosition;
        }
        this.mLayoutState.mStopInFocusable = false;
        this.mLayoutState.mRecycle = true;
        layoutState = this.mLayoutState;
        z = true;
        layoutState.mInfinite = z;
    }

    private void updateRemainingSpans(Span span, int i, int i2) {
        int deletedSize = span.getDeletedSize();
        if (i == -1) {
            if (span.getStartLine() + deletedSize <= i2) {
                this.mRemainingSpans.set(span.mIndex, false);
            }
            return;
        }
        if (span.getEndLine() - deletedSize >= i2) {
            this.mRemainingSpans.set(span.mIndex, false);
        }
    }

    private int updateSpecWithExtra(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return i;
            }
        }
        return MeasureSpec.makeMeasureSpec(Math.max(0, (MeasureSpec.getSize(i) - i2) - i3), mode);
    }

    boolean areAllEndsEqual() {
        int endLine = this.mSpans[0].getEndLine(Integer.MIN_VALUE);
        for (int i = 1; i < this.mSpanCount; i++) {
            if (this.mSpans[i].getEndLine(Integer.MIN_VALUE) != endLine) {
                return false;
            }
        }
        return true;
    }

    boolean areAllStartsEqual() {
        int startLine = this.mSpans[0].getStartLine(Integer.MIN_VALUE);
        for (int i = 1; i < this.mSpanCount; i++) {
            if (this.mSpans[i].getStartLine(Integer.MIN_VALUE) != startLine) {
                return false;
            }
        }
        return true;
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

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean checkForGaps() {
        /*
        r7 = this;
        r0 = r7.getChildCount();
        r1 = 0;
        if (r0 == 0) goto L_0x0076;
    L_0x0007:
        r0 = r7.mGapStrategy;
        if (r0 == 0) goto L_0x0076;
    L_0x000b:
        r0 = r7.isAttachedToWindow();
        if (r0 != 0) goto L_0x0012;
    L_0x0011:
        return r1;
    L_0x0012:
        r0 = r7.mShouldReverseLayout;
        if (r0 == 0) goto L_0x001f;
    L_0x0016:
        r0 = r7.getLastChildPosition();
        r2 = r7.getFirstChildPosition();
        goto L_0x0027;
    L_0x001f:
        r0 = r7.getFirstChildPosition();
        r2 = r7.getLastChildPosition();
    L_0x0027:
        r3 = 1;
        if (r0 != 0) goto L_0x003c;
    L_0x002a:
        r4 = r7.hasGapsToFix();
        if (r4 == 0) goto L_0x003c;
    L_0x0030:
        r0 = r7.mLazySpanLookup;
        r0.clear();
    L_0x0035:
        r7.requestSimpleAnimationsInNextLayout();
        r7.requestLayout();
        return r3;
    L_0x003c:
        r4 = r7.mLaidOutInvalidFullSpan;
        if (r4 != 0) goto L_0x0041;
    L_0x0040:
        return r1;
    L_0x0041:
        r4 = r7.mShouldReverseLayout;
        r5 = -1;
        if (r4 == 0) goto L_0x0048;
    L_0x0046:
        r4 = r5;
        goto L_0x0049;
    L_0x0048:
        r4 = r3;
    L_0x0049:
        r6 = r7.mLazySpanLookup;
        r2 = r2 + r3;
        r6 = r6.getFirstFullSpanItemInRange(r0, r2, r4, r3);
        if (r6 != 0) goto L_0x005a;
    L_0x0052:
        r7.mLaidOutInvalidFullSpan = r1;
        r0 = r7.mLazySpanLookup;
        r0.forceInvalidateAfter(r2);
        return r1;
    L_0x005a:
        r1 = r7.mLazySpanLookup;
        r2 = r6.mPosition;
        r4 = r4 * r5;
        r0 = r1.getFirstFullSpanItemInRange(r0, r2, r4, r3);
        if (r0 != 0) goto L_0x006d;
    L_0x0065:
        r0 = r7.mLazySpanLookup;
        r1 = r6.mPosition;
        r0.forceInvalidateAfter(r1);
        goto L_0x0035;
    L_0x006d:
        r1 = r7.mLazySpanLookup;
        r0 = r0.mPosition;
        r0 = r0 + r3;
        r1.forceInvalidateAfter(r0);
        goto L_0x0035;
    L_0x0076:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.checkForGaps():boolean");
    }

    public boolean checkLayoutParams(android.support.v7.widget.RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void collectAdjacentPrefetchPositions(int i, int i2, State state, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() != 0 && i != 0) {
            prepareLayoutStateForDelta(i, state);
            if (this.mPrefetchDistances == null || this.mPrefetchDistances.length < this.mSpanCount) {
                this.mPrefetchDistances = new int[this.mSpanCount];
            }
            i = 0;
            i2 = 0;
            int i3 = i2;
            while (i2 < this.mSpanCount) {
                int i4;
                int startLine;
                if (this.mLayoutState.mItemDirection == -1) {
                    i4 = this.mLayoutState.mStartLine;
                    startLine = this.mSpans[i2].getStartLine(this.mLayoutState.mStartLine);
                } else {
                    i4 = this.mSpans[i2].getEndLine(this.mLayoutState.mEndLine);
                    startLine = this.mLayoutState.mEndLine;
                }
                i4 -= startLine;
                if (i4 >= 0) {
                    this.mPrefetchDistances[i3] = i4;
                    i3++;
                }
                i2++;
            }
            Arrays.sort(this.mPrefetchDistances, 0, i3);
            while (i < i3 && this.mLayoutState.hasMore(state)) {
                layoutPrefetchRegistry.addPosition(this.mLayoutState.mCurrentPosition, this.mPrefetchDistances[i]);
                LayoutState layoutState = this.mLayoutState;
                layoutState.mCurrentPosition += this.mLayoutState.mItemDirection;
                i++;
            }
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
        i = calculateScrollDirectionForPosition(i);
        PointF pointF = new PointF();
        if (i == 0) {
            return null;
        }
        if (this.mOrientation == 0) {
            pointF.x = (float) i;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = (float) i;
        return pointF;
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

    public int[] findFirstCompletelyVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            StringBuilder stringBuilder = new StringBuilder("Provided int[]'s size must be more than or equal to span count. Expected:");
            stringBuilder.append(this.mSpanCount);
            stringBuilder.append(", array size:");
            stringBuilder.append(iArr.length);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        for (int i = 0; i < this.mSpanCount; i++) {
            iArr[i] = this.mSpans[i].findFirstCompletelyVisibleItemPosition();
        }
        return iArr;
    }

    View findFirstVisibleItemClosestToEnd(boolean z) {
        int startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
        int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int decoratedStart = this.mPrimaryOrientation.getDecoratedStart(childAt);
            int decoratedEnd = this.mPrimaryOrientation.getDecoratedEnd(childAt);
            if (decoratedEnd > startAfterPadding && decoratedStart < endAfterPadding) {
                if (decoratedEnd <= endAfterPadding || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    View findFirstVisibleItemClosestToStart(boolean z) {
        int startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
        int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int decoratedStart = this.mPrimaryOrientation.getDecoratedStart(childAt);
            if (this.mPrimaryOrientation.getDecoratedEnd(childAt) > startAfterPadding && decoratedStart < endAfterPadding) {
                if (decoratedStart >= startAfterPadding || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    int findFirstVisibleItemPositionInt() {
        View findFirstVisibleItemClosestToEnd = this.mShouldReverseLayout ? findFirstVisibleItemClosestToEnd(true) : findFirstVisibleItemClosestToStart(true);
        return findFirstVisibleItemClosestToEnd == null ? -1 : getPosition(findFirstVisibleItemClosestToEnd);
    }

    public int[] findFirstVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            StringBuilder stringBuilder = new StringBuilder("Provided int[]'s size must be more than or equal to span count. Expected:");
            stringBuilder.append(this.mSpanCount);
            stringBuilder.append(", array size:");
            stringBuilder.append(iArr.length);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        for (int i = 0; i < this.mSpanCount; i++) {
            iArr[i] = this.mSpans[i].findFirstVisibleItemPosition();
        }
        return iArr;
    }

    public int[] findLastCompletelyVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            StringBuilder stringBuilder = new StringBuilder("Provided int[]'s size must be more than or equal to span count. Expected:");
            stringBuilder.append(this.mSpanCount);
            stringBuilder.append(", array size:");
            stringBuilder.append(iArr.length);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        for (int i = 0; i < this.mSpanCount; i++) {
            iArr[i] = this.mSpans[i].findLastCompletelyVisibleItemPosition();
        }
        return iArr;
    }

    public int[] findLastVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            StringBuilder stringBuilder = new StringBuilder("Provided int[]'s size must be more than or equal to span count. Expected:");
            stringBuilder.append(this.mSpanCount);
            stringBuilder.append(", array size:");
            stringBuilder.append(iArr.length);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        for (int i = 0; i < this.mSpanCount; i++) {
            iArr[i] = this.mSpans[i].findLastVisibleItemPosition();
        }
        return iArr;
    }

    public android.support.v7.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    public android.support.v7.widget.RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public android.support.v7.widget.RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getColumnCountForAccessibility(Recycler recycler, State state) {
        return this.mOrientation == 1 ? this.mSpanCount : super.getColumnCountForAccessibility(recycler, state);
    }

    int getFirstChildPosition() {
        return getChildCount() == 0 ? 0 : getPosition(getChildAt(0));
    }

    public int getGapStrategy() {
        return this.mGapStrategy;
    }

    int getLastChildPosition() {
        int childCount = getChildCount();
        return childCount == 0 ? 0 : getPosition(getChildAt(childCount - 1));
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public int getRowCountForAccessibility(Recycler recycler, State state) {
        return this.mOrientation == 0 ? this.mSpanCount : super.getRowCountForAccessibility(recycler, state);
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    android.view.View hasGapsToFix() {
        /*
        r12 = this;
        r0 = r12.getChildCount();
        r1 = 1;
        r0 = r0 - r1;
        r2 = new java.util.BitSet;
        r3 = r12.mSpanCount;
        r2.<init>(r3);
        r3 = r12.mSpanCount;
        r4 = 0;
        r2.set(r4, r3, r1);
        r3 = r12.mOrientation;
        r5 = -1;
        if (r3 != r1) goto L_0x0020;
    L_0x0018:
        r3 = r12.isLayoutRTL();
        if (r3 == 0) goto L_0x0020;
    L_0x001e:
        r3 = r1;
        goto L_0x0021;
    L_0x0020:
        r3 = r5;
    L_0x0021:
        r6 = r12.mShouldReverseLayout;
        if (r6 == 0) goto L_0x0027;
    L_0x0025:
        r6 = r5;
        goto L_0x002b;
    L_0x0027:
        r0 = r0 + 1;
        r6 = r0;
        r0 = r4;
    L_0x002b:
        if (r0 >= r6) goto L_0x002e;
    L_0x002d:
        r5 = r1;
    L_0x002e:
        if (r0 == r6) goto L_0x00aa;
    L_0x0030:
        r7 = r12.getChildAt(r0);
        r8 = r7.getLayoutParams();
        r8 = (android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams) r8;
        r9 = r8.mSpan;
        r9 = r9.mIndex;
        r9 = r2.get(r9);
        if (r9 == 0) goto L_0x0054;
    L_0x0044:
        r9 = r8.mSpan;
        r9 = r12.checkSpanForGap(r9);
        if (r9 == 0) goto L_0x004d;
    L_0x004c:
        return r7;
    L_0x004d:
        r9 = r8.mSpan;
        r9 = r9.mIndex;
        r2.clear(r9);
    L_0x0054:
        r9 = r8.mFullSpan;
        if (r9 != 0) goto L_0x00a8;
    L_0x0058:
        r9 = r0 + r5;
        if (r9 == r6) goto L_0x00a8;
    L_0x005c:
        r9 = r12.getChildAt(r9);
        r10 = r12.mShouldReverseLayout;
        if (r10 == 0) goto L_0x0076;
    L_0x0064:
        r10 = r12.mPrimaryOrientation;
        r10 = r10.getDecoratedEnd(r7);
        r11 = r12.mPrimaryOrientation;
        r11 = r11.getDecoratedEnd(r9);
        if (r10 >= r11) goto L_0x0073;
    L_0x0072:
        return r7;
    L_0x0073:
        if (r10 != r11) goto L_0x0089;
    L_0x0075:
        goto L_0x0087;
    L_0x0076:
        r10 = r12.mPrimaryOrientation;
        r10 = r10.getDecoratedStart(r7);
        r11 = r12.mPrimaryOrientation;
        r11 = r11.getDecoratedStart(r9);
        if (r10 <= r11) goto L_0x0085;
    L_0x0084:
        return r7;
    L_0x0085:
        if (r10 != r11) goto L_0x0089;
    L_0x0087:
        r10 = r1;
        goto L_0x008a;
    L_0x0089:
        r10 = r4;
    L_0x008a:
        if (r10 == 0) goto L_0x00a8;
    L_0x008c:
        r9 = r9.getLayoutParams();
        r9 = (android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams) r9;
        r8 = r8.mSpan;
        r8 = r8.mIndex;
        r9 = r9.mSpan;
        r9 = r9.mIndex;
        r8 = r8 - r9;
        if (r8 >= 0) goto L_0x009f;
    L_0x009d:
        r8 = r1;
        goto L_0x00a0;
    L_0x009f:
        r8 = r4;
    L_0x00a0:
        if (r3 >= 0) goto L_0x00a4;
    L_0x00a2:
        r9 = r1;
        goto L_0x00a5;
    L_0x00a4:
        r9 = r4;
    L_0x00a5:
        if (r8 == r9) goto L_0x00a8;
    L_0x00a7:
        return r7;
    L_0x00a8:
        r0 = r0 + r5;
        goto L_0x002e;
    L_0x00aa:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.hasGapsToFix():android.view.View");
    }

    public void invalidateSpanAssignments() {
        this.mLazySpanLookup.clear();
        requestLayout();
    }

    boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            this.mSpans[i2].onOffset(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            this.mSpans[i2].onOffset(i);
        }
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, Recycler recycler) {
        removeCallbacks(this.mCheckForGapsRunnable);
        for (int i = 0; i < this.mSpanCount; i++) {
            this.mSpans[i].clear();
        }
        recyclerView.requestLayout();
    }

    public View onFocusSearchFailed(View view, int i, Recycler recycler, State state) {
        if (getChildCount() == 0) {
            return null;
        }
        view = findContainingItemView(view);
        if (view == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        i = convertFocusDirectionToLayoutDirection(i);
        if (i == Integer.MIN_VALUE) {
            return null;
        }
        View focusableViewAfter;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        boolean z = layoutParams.mFullSpan;
        Span span = layoutParams.mSpan;
        int lastChildPosition = i == 1 ? getLastChildPosition() : getFirstChildPosition();
        updateLayoutState(lastChildPosition, state);
        setLayoutStateDirection(i);
        this.mLayoutState.mCurrentPosition = this.mLayoutState.mItemDirection + lastChildPosition;
        this.mLayoutState.mAvailable = (int) (MAX_SCROLL_FACTOR * ((float) this.mPrimaryOrientation.getTotalSpace()));
        this.mLayoutState.mStopInFocusable = true;
        int i2 = 0;
        this.mLayoutState.mRecycle = false;
        fill(recycler, this.mLayoutState, state);
        this.mLastLayoutFromEnd = this.mShouldReverseLayout;
        if (!z) {
            View focusableViewAfter2 = span.getFocusableViewAfter(lastChildPosition, i);
            if (!(focusableViewAfter2 == null || focusableViewAfter2 == view)) {
                return focusableViewAfter2;
            }
        }
        int i3;
        if (preferLastSpan(i)) {
            for (i3 = this.mSpanCount - 1; i3 >= 0; i3--) {
                focusableViewAfter = this.mSpans[i3].getFocusableViewAfter(lastChildPosition, i);
                if (focusableViewAfter != null && focusableViewAfter != view) {
                    return focusableViewAfter;
                }
            }
        } else {
            for (i3 = 0; i3 < this.mSpanCount; i3++) {
                focusableViewAfter = this.mSpans[i3].getFocusableViewAfter(lastChildPosition, i);
                if (focusableViewAfter != null && focusableViewAfter != view) {
                    return focusableViewAfter;
                }
            }
        }
        boolean z2 = (this.mReverseLayout ^ 1) == (i == -1);
        if (!z) {
            focusableViewAfter = findViewByPosition(z2 ? span.findFirstPartiallyVisibleItemPosition() : span.findLastPartiallyVisibleItemPosition());
            if (!(focusableViewAfter == null || focusableViewAfter == view)) {
                return focusableViewAfter;
            }
        }
        if (preferLastSpan(i)) {
            for (i = this.mSpanCount - 1; i >= 0; i--) {
                if (i != span.mIndex) {
                    focusableViewAfter = findViewByPosition(z2 ? this.mSpans[i].findFirstPartiallyVisibleItemPosition() : this.mSpans[i].findLastPartiallyVisibleItemPosition());
                    if (!(focusableViewAfter == null || focusableViewAfter == view)) {
                        return focusableViewAfter;
                    }
                }
            }
        } else {
            while (i2 < this.mSpanCount) {
                View findViewByPosition = findViewByPosition(z2 ? this.mSpans[i2].findFirstPartiallyVisibleItemPosition() : this.mSpans[i2].findLastPartiallyVisibleItemPosition());
                if (findViewByPosition != null && findViewByPosition != view) {
                    return findViewByPosition;
                }
                i2++;
            }
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View findFirstVisibleItemClosestToStart = findFirstVisibleItemClosestToStart(false);
            View findFirstVisibleItemClosestToEnd = findFirstVisibleItemClosestToEnd(false);
            if (findFirstVisibleItemClosestToStart != null && findFirstVisibleItemClosestToEnd != null) {
                int position = getPosition(findFirstVisibleItemClosestToStart);
                int position2 = getPosition(findFirstVisibleItemClosestToEnd);
                if (position < position2) {
                    accessibilityEvent.setFromIndex(position);
                    accessibilityEvent.setToIndex(position2);
                    return;
                }
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfoForItem(Recycler recycler, State state, View view, C0536b c0536b) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            int spanIndex;
            int i;
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            int i2 = 1;
            int i3 = -1;
            if (this.mOrientation == 0) {
                spanIndex = layoutParams2.getSpanIndex();
                if (layoutParams2.mFullSpan) {
                    i2 = this.mSpanCount;
                }
                i = -1;
                i3 = spanIndex;
                spanIndex = i;
            } else {
                spanIndex = layoutParams2.getSpanIndex();
                if (layoutParams2.mFullSpan) {
                    i2 = this.mSpanCount;
                }
                i = i2;
                i2 = -1;
            }
            c0536b.m1196a(C0535l.m1189a(i3, i2, spanIndex, i, layoutParams2.mFullSpan));
            return;
        }
        super.onInitializeAccessibilityNodeInfoForItem(view, c0536b);
    }

    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        handleUpdate(i, i2, 1);
    }

    public void onItemsChanged(RecyclerView recyclerView) {
        this.mLazySpanLookup.clear();
        requestLayout();
    }

    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        handleUpdate(i, i2, 8);
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        handleUpdate(i, i2, 2);
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        handleUpdate(i, i2, 4);
    }

    public void onLayoutChildren(Recycler recycler, State state) {
        onLayoutChildren(recycler, state, true);
    }

    public void onLayoutCompleted(State state) {
        super.onLayoutCompleted(state);
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
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
        savedState.mReverseLayout = this.mReverseLayout;
        savedState.mAnchorLayoutFromEnd = this.mLastLayoutFromEnd;
        savedState.mLastLayoutRTL = this.mLastLayoutRTL;
        int i = 0;
        if (this.mLazySpanLookup == null || this.mLazySpanLookup.mData == null) {
            savedState.mSpanLookupSize = 0;
        } else {
            savedState.mSpanLookup = this.mLazySpanLookup.mData;
            savedState.mSpanLookupSize = savedState.mSpanLookup.length;
            savedState.mFullSpanItems = this.mLazySpanLookup.mFullSpanItems;
        }
        if (getChildCount() > 0) {
            savedState.mAnchorPosition = this.mLastLayoutFromEnd ? getLastChildPosition() : getFirstChildPosition();
            savedState.mVisibleAnchorPosition = findFirstVisibleItemPositionInt();
            savedState.mSpanOffsetsSize = this.mSpanCount;
            savedState.mSpanOffsets = new int[this.mSpanCount];
            while (i < this.mSpanCount) {
                int endLine;
                int endAfterPadding;
                if (this.mLastLayoutFromEnd) {
                    endLine = this.mSpans[i].getEndLine(Integer.MIN_VALUE);
                    if (endLine != Integer.MIN_VALUE) {
                        endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
                    } else {
                        savedState.mSpanOffsets[i] = endLine;
                        i++;
                    }
                } else {
                    endLine = this.mSpans[i].getStartLine(Integer.MIN_VALUE);
                    if (endLine != Integer.MIN_VALUE) {
                        endAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
                    } else {
                        savedState.mSpanOffsets[i] = endLine;
                        i++;
                    }
                }
                endLine -= endAfterPadding;
                savedState.mSpanOffsets[i] = endLine;
                i++;
            }
        } else {
            savedState.mAnchorPosition = -1;
            savedState.mVisibleAnchorPosition = -1;
            savedState.mSpanOffsetsSize = 0;
        }
        return savedState;
    }

    public void onScrollStateChanged(int i) {
        if (i == 0) {
            checkForGaps();
        }
    }

    void prepareLayoutStateForDelta(int i, State state) {
        int lastChildPosition;
        int i2;
        if (i > 0) {
            lastChildPosition = getLastChildPosition();
            i2 = 1;
        } else {
            i2 = -1;
            lastChildPosition = getFirstChildPosition();
        }
        this.mLayoutState.mRecycle = true;
        updateLayoutState(lastChildPosition, state);
        setLayoutStateDirection(i2);
        this.mLayoutState.mCurrentPosition = lastChildPosition + this.mLayoutState.mItemDirection;
        this.mLayoutState.mAvailable = Math.abs(i);
    }

    int scrollBy(int i, Recycler recycler, State state) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        prepareLayoutStateForDelta(i, state);
        int fill = fill(recycler, this.mLayoutState, state);
        if (this.mLayoutState.mAvailable >= fill) {
            i = i < 0 ? -fill : fill;
        }
        this.mPrimaryOrientation.offsetChildren(-i);
        this.mLastLayoutFromEnd = this.mShouldReverseLayout;
        this.mLayoutState.mAvailable = 0;
        recycle(recycler, this.mLayoutState);
        return i;
    }

    public int scrollHorizontallyBy(int i, Recycler recycler, State state) {
        return scrollBy(i, recycler, state);
    }

    public void scrollToPosition(int i) {
        if (!(this.mPendingSavedState == null || this.mPendingSavedState.mAnchorPosition == i)) {
            this.mPendingSavedState.invalidateAnchorPositionInfo();
        }
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        if (this.mPendingSavedState != null) {
            this.mPendingSavedState.invalidateAnchorPositionInfo();
        }
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        requestLayout();
    }

    public int scrollVerticallyBy(int i, Recycler recycler, State state) {
        return scrollBy(i, recycler, state);
    }

    public void setGapStrategy(int i) {
        assertNotInLayoutOrScroll(null);
        if (i != this.mGapStrategy) {
            if (i == 0 || i == 2) {
                this.mGapStrategy = i;
                setAutoMeasureEnabled(this.mGapStrategy != 0);
                requestLayout();
                return;
            }
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
    }

    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int chooseSize;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            chooseSize = LayoutManager.chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            i = LayoutManager.chooseSize(i, (this.mSizePerSpan * this.mSpanCount) + paddingLeft, getMinimumWidth());
        } else {
            i = LayoutManager.chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            chooseSize = LayoutManager.chooseSize(i2, (this.mSizePerSpan * this.mSpanCount) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(i, chooseSize);
    }

    public void setOrientation(int i) {
        if (i == 0 || i == 1) {
            assertNotInLayoutOrScroll(null);
            if (i != this.mOrientation) {
                this.mOrientation = i;
                OrientationHelper orientationHelper = this.mPrimaryOrientation;
                this.mPrimaryOrientation = this.mSecondaryOrientation;
                this.mSecondaryOrientation = orientationHelper;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (!(this.mPendingSavedState == null || this.mPendingSavedState.mReverseLayout == z)) {
            this.mPendingSavedState.mReverseLayout = z;
        }
        this.mReverseLayout = z;
        requestLayout();
    }

    public void setSpanCount(int i) {
        assertNotInLayoutOrScroll(null);
        if (i != this.mSpanCount) {
            invalidateSpanAssignments();
            this.mSpanCount = i;
            this.mRemainingSpans = new BitSet(this.mSpanCount);
            this.mSpans = new Span[this.mSpanCount];
            for (i = 0; i < this.mSpanCount; i++) {
                this.mSpans[i] = new Span(i);
            }
            requestLayout();
        }
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, State state, int i) {
        SmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }

    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null;
    }

    boolean updateAnchorFromPendingData(android.support.v7.widget.RecyclerView.State r5, android.support.v7.widget.StaggeredGridLayoutManager.AnchorInfo r6) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:33:0x0078 in {4, 9, 16, 18, 23, 24, 29, 31, 32, 38, 39, 41, 45, 49, 51, 56, 57, 58, 60, 61, 62} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r4 = this;
        r0 = r5.isPreLayout();
        r1 = 0;
        if (r0 != 0) goto L_0x00e6;
    L_0x0007:
        r0 = r4.mPendingScrollPosition;
        r2 = -1;
        if (r0 != r2) goto L_0x000d;
    L_0x000c:
        return r1;
    L_0x000d:
        r0 = r4.mPendingScrollPosition;
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r0 < 0) goto L_0x00e2;
    L_0x0013:
        r0 = r4.mPendingScrollPosition;
        r5 = r5.getItemCount();
        if (r0 < r5) goto L_0x001d;
    L_0x001b:
        goto L_0x00e2;
    L_0x001d:
        r5 = r4.mPendingSavedState;
        r0 = 1;
        if (r5 == 0) goto L_0x0036;
    L_0x0022:
        r5 = r4.mPendingSavedState;
        r5 = r5.mAnchorPosition;
        if (r5 == r2) goto L_0x0036;
    L_0x0028:
        r5 = r4.mPendingSavedState;
        r5 = r5.mSpanOffsetsSize;
        if (r5 > 0) goto L_0x002f;
    L_0x002e:
        goto L_0x0036;
    L_0x002f:
        r6.mOffset = r3;
        r5 = r4.mPendingScrollPosition;
        r6.mPosition = r5;
        return r0;
    L_0x0036:
        r5 = r4.mPendingScrollPosition;
        r5 = r4.findViewByPosition(r5);
        if (r5 == 0) goto L_0x00c3;
    L_0x003e:
        r1 = r4.mShouldReverseLayout;
        if (r1 == 0) goto L_0x0047;
    L_0x0042:
        r1 = r4.getLastChildPosition();
        goto L_0x004b;
    L_0x0047:
        r1 = r4.getFirstChildPosition();
    L_0x004b:
        r6.mPosition = r1;
        r1 = r4.mPendingScrollPositionOffset;
        if (r1 == r3) goto L_0x0079;
    L_0x0051:
        r1 = r6.mLayoutFromEnd;
        if (r1 == 0) goto L_0x0068;
    L_0x0055:
        r1 = r4.mPrimaryOrientation;
        r1 = r1.getEndAfterPadding();
        r2 = r4.mPendingScrollPositionOffset;
        r1 = r1 - r2;
        r2 = r4.mPrimaryOrientation;
        r5 = r2.getDecoratedEnd(r5);
    L_0x0064:
        r1 = r1 - r5;
        r6.mOffset = r1;
        return r0;
    L_0x0068:
        r1 = r4.mPrimaryOrientation;
        r1 = r1.getStartAfterPadding();
        r2 = r4.mPendingScrollPositionOffset;
        r1 = r1 + r2;
        r2 = r4.mPrimaryOrientation;
        r5 = r2.getDecoratedStart(r5);
        goto L_0x0064;
        return r0;
    L_0x0079:
        r1 = r4.mPrimaryOrientation;
        r1 = r1.getDecoratedMeasurement(r5);
        r2 = r4.mPrimaryOrientation;
        r2 = r2.getTotalSpace();
        if (r1 <= r2) goto L_0x009b;
    L_0x0087:
        r5 = r6.mLayoutFromEnd;
        if (r5 == 0) goto L_0x0092;
    L_0x008b:
        r5 = r4.mPrimaryOrientation;
        r5 = r5.getEndAfterPadding();
        goto L_0x0098;
    L_0x0092:
        r5 = r4.mPrimaryOrientation;
        r5 = r5.getStartAfterPadding();
    L_0x0098:
        r6.mOffset = r5;
        return r0;
    L_0x009b:
        r1 = r4.mPrimaryOrientation;
        r1 = r1.getDecoratedStart(r5);
        r2 = r4.mPrimaryOrientation;
        r2 = r2.getStartAfterPadding();
        r1 = r1 - r2;
        if (r1 >= 0) goto L_0x00ae;
    L_0x00aa:
        r5 = -r1;
        r6.mOffset = r5;
        return r0;
    L_0x00ae:
        r1 = r4.mPrimaryOrientation;
        r1 = r1.getEndAfterPadding();
        r2 = r4.mPrimaryOrientation;
        r5 = r2.getDecoratedEnd(r5);
        r1 = r1 - r5;
        if (r1 >= 0) goto L_0x00c0;
    L_0x00bd:
        r6.mOffset = r1;
        return r0;
    L_0x00c0:
        r6.mOffset = r3;
        return r0;
    L_0x00c3:
        r5 = r4.mPendingScrollPosition;
        r6.mPosition = r5;
        r5 = r4.mPendingScrollPositionOffset;
        if (r5 != r3) goto L_0x00da;
    L_0x00cb:
        r5 = r6.mPosition;
        r5 = r4.calculateScrollDirectionForPosition(r5);
        if (r5 != r0) goto L_0x00d4;
    L_0x00d3:
        r1 = r0;
    L_0x00d4:
        r6.mLayoutFromEnd = r1;
        r6.assignCoordinateFromPadding();
        goto L_0x00df;
    L_0x00da:
        r5 = r4.mPendingScrollPositionOffset;
        r6.assignCoordinateFromPadding(r5);
    L_0x00df:
        r6.mInvalidateOffsets = r0;
        return r0;
    L_0x00e2:
        r4.mPendingScrollPosition = r2;
        r4.mPendingScrollPositionOffset = r3;
    L_0x00e6:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.updateAnchorFromPendingData(android.support.v7.widget.RecyclerView$State, android.support.v7.widget.StaggeredGridLayoutManager$AnchorInfo):boolean");
    }

    void updateAnchorInfoForLayout(State state, AnchorInfo anchorInfo) {
        if (!updateAnchorFromPendingData(state, anchorInfo) && !updateAnchorFromChildren(state, anchorInfo)) {
            anchorInfo.assignCoordinateFromPadding();
            anchorInfo.mPosition = 0;
        }
    }

    void updateMeasureSpecs(int i) {
        this.mSizePerSpan = i / this.mSpanCount;
        this.mFullSizeSpec = MeasureSpec.makeMeasureSpec(i, this.mSecondaryOrientation.getMode());
    }
}
