package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.p039a.C0536b;
import android.support.v4.view.p039a.C0536b.C0535l;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry;
import android.support.v7.widget.RecyclerView.Recycler;
import android.support.v7.widget.RecyclerView.State;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.Arrays;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class GridLayoutManager extends LinearLayoutManager {
    private static final boolean DEBUG = false;
    public static final int DEFAULT_SPAN_COUNT = -1;
    private static final String TAG = "GridLayoutManager";
    int[] mCachedBorders;
    final Rect mDecorInsets = new Rect();
    boolean mPendingSpanCountChange = false;
    final SparseIntArray mPreLayoutSpanIndexCache = new SparseIntArray();
    final SparseIntArray mPreLayoutSpanSizeCache = new SparseIntArray();
    View[] mSet;
    int mSpanCount = -1;
    SpanSizeLookup mSpanSizeLookup = new DefaultSpanSizeLookup();

    public static abstract class SpanSizeLookup {
        private boolean mCacheSpanIndices = false;
        final SparseIntArray mSpanIndexCache = new SparseIntArray();

        int findReferenceIndexFromCache(int i) {
            int size = this.mSpanIndexCache.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (this.mSpanIndexCache.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            i2--;
            return (i2 < 0 || i2 >= this.mSpanIndexCache.size()) ? -1 : this.mSpanIndexCache.keyAt(i2);
        }

        int getCachedSpanIndex(int i, int i2) {
            if (!this.mCacheSpanIndices) {
                return getSpanIndex(i, i2);
            }
            int i3 = this.mSpanIndexCache.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            i2 = getSpanIndex(i, i2);
            this.mSpanIndexCache.put(i, i2);
            return i2;
        }

        public int getSpanGroupIndex(int i, int i2) {
            int spanSize = getSpanSize(i);
            int i3 = 0;
            int i4 = i3;
            int i5 = i4;
            while (i3 < i) {
                int spanSize2 = getSpanSize(i3);
                i4 += spanSize2;
                if (i4 == i2) {
                    i5++;
                    i4 = 0;
                } else if (i4 > i2) {
                    i5++;
                    i4 = spanSize2;
                }
                i3++;
            }
            return i4 + spanSize > i2 ? i5 + 1 : i5;
        }

        public int getSpanIndex(int r6, int r7) {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r5 = this;
            r0 = r5.getSpanSize(r6);
            r1 = 0;
            if (r0 != r7) goto L_0x0008;
        L_0x0007:
            return r1;
        L_0x0008:
            r2 = r5.mCacheSpanIndices;
            if (r2 == 0) goto L_0x0026;
        L_0x000c:
            r2 = r5.mSpanIndexCache;
            r2 = r2.size();
            if (r2 <= 0) goto L_0x0026;
        L_0x0014:
            r2 = r5.findReferenceIndexFromCache(r6);
            if (r2 < 0) goto L_0x0026;
        L_0x001a:
            r3 = r5.mSpanIndexCache;
            r3 = r3.get(r2);
            r4 = r5.getSpanSize(r2);
            r3 = r3 + r4;
            goto L_0x0036;
        L_0x0026:
            r2 = r1;
            r3 = r2;
        L_0x0028:
            if (r2 >= r6) goto L_0x0039;
        L_0x002a:
            r4 = r5.getSpanSize(r2);
            r3 = r3 + r4;
            if (r3 != r7) goto L_0x0033;
        L_0x0031:
            r3 = r1;
            goto L_0x0036;
        L_0x0033:
            if (r3 <= r7) goto L_0x0036;
        L_0x0035:
            r3 = r4;
        L_0x0036:
            r2 = r2 + 1;
            goto L_0x0028;
        L_0x0039:
            r0 = r0 + r3;
            if (r0 > r7) goto L_0x003d;
        L_0x003c:
            return r3;
        L_0x003d:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.SpanSizeLookup.getSpanIndex(int, int):int");
        }

        public abstract int getSpanSize(int i);

        public void invalidateSpanIndexCache() {
            this.mSpanIndexCache.clear();
        }

        public boolean isSpanIndexCacheEnabled() {
            return this.mCacheSpanIndices;
        }

        public void setSpanIndexCacheEnabled(boolean z) {
            this.mCacheSpanIndices = z;
        }
    }

    public static final class DefaultSpanSizeLookup extends SpanSizeLookup {
        public final int getSpanIndex(int i, int i2) {
            return i % i2;
        }

        public final int getSpanSize(int i) {
            return 1;
        }
    }

    public static class LayoutParams extends android.support.v7.widget.RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        int mSpanIndex = -1;
        int mSpanSize = 0;

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

        public int getSpanIndex() {
            return this.mSpanIndex;
        }

        public int getSpanSize() {
            return this.mSpanSize;
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        setSpanCount(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        setSpanCount(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setSpanCount(LayoutManager.getProperties(context, attributeSet, i, i2).spanCount);
    }

    private void assignSpans(Recycler recycler, State state, int i, int i2, boolean z) {
        int i3;
        i2 = -1;
        int i4 = 0;
        if (z) {
            i3 = 1;
            i2 = i;
            i = 0;
        } else {
            i--;
            i3 = -1;
        }
        while (i != i2) {
            View view = this.mSet[i];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.mSpanSize = getSpanSize(recycler, state, getPosition(view));
            layoutParams.mSpanIndex = i4;
            i4 += layoutParams.mSpanSize;
            i += i3;
        }
    }

    private void cachePreLayoutSpanMapping() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int viewLayoutPosition = layoutParams.getViewLayoutPosition();
            this.mPreLayoutSpanSizeCache.put(viewLayoutPosition, layoutParams.getSpanSize());
            this.mPreLayoutSpanIndexCache.put(viewLayoutPosition, layoutParams.getSpanIndex());
        }
    }

    private void calculateItemBorders(int i) {
        this.mCachedBorders = calculateItemBorders(this.mCachedBorders, this.mSpanCount, i);
    }

    static int[] calculateItemBorders(int[] iArr, int i, int i2) {
        int i3 = 1;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        i2 %= i;
        int i6 = 0;
        while (i3 <= i) {
            int i7;
            i4 += i2;
            if (i4 <= 0 || i - i4 >= i2) {
                i7 = i5;
            } else {
                i7 = i5 + 1;
                i4 -= i;
            }
            i6 += i7;
            iArr[i3] = i6;
            i3++;
        }
        return iArr;
    }

    private void clearPreLayoutSpanMappingCache() {
        this.mPreLayoutSpanSizeCache.clear();
        this.mPreLayoutSpanIndexCache.clear();
    }

    private void ensureAnchorIsInCorrectSpan(Recycler recycler, State state, AnchorInfo anchorInfo, int i) {
        i = i == 1 ? 1 : 0;
        int spanIndex = getSpanIndex(recycler, state, anchorInfo.mPosition);
        if (i != 0) {
            while (spanIndex > 0 && anchorInfo.mPosition > 0) {
                anchorInfo.mPosition--;
                spanIndex = getSpanIndex(recycler, state, anchorInfo.mPosition);
            }
            return;
        }
        i = state.getItemCount() - 1;
        int i2 = anchorInfo.mPosition;
        while (i2 < i) {
            int i3 = i2 + 1;
            int spanIndex2 = getSpanIndex(recycler, state, i3);
            if (spanIndex2 <= spanIndex) {
                break;
            }
            i2 = i3;
            spanIndex = spanIndex2;
        }
        anchorInfo.mPosition = i2;
    }

    private void ensureViewSet() {
        if (this.mSet == null || this.mSet.length != this.mSpanCount) {
            this.mSet = new View[this.mSpanCount];
        }
    }

    private int getSpanGroupIndex(Recycler recycler, State state, int i) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getSpanGroupIndex(i, this.mSpanCount);
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout != -1) {
            return this.mSpanSizeLookup.getSpanGroupIndex(convertPreLayoutPositionToPostLayout, this.mSpanCount);
        }
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder("Cannot find span size for pre layout position. ");
        stringBuilder.append(i);
        Log.w(str, stringBuilder.toString());
        return 0;
    }

    private int getSpanIndex(Recycler recycler, State state, int i) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getCachedSpanIndex(i, this.mSpanCount);
        }
        int i2 = this.mPreLayoutSpanIndexCache.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout != -1) {
            return this.mSpanSizeLookup.getCachedSpanIndex(convertPreLayoutPositionToPostLayout, this.mSpanCount);
        }
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        stringBuilder.append(i);
        Log.w(str, stringBuilder.toString());
        return 0;
    }

    private int getSpanSize(Recycler recycler, State state, int i) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getSpanSize(i);
        }
        int i2 = this.mPreLayoutSpanSizeCache.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout != -1) {
            return this.mSpanSizeLookup.getSpanSize(convertPreLayoutPositionToPostLayout);
        }
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        stringBuilder.append(i);
        Log.w(str, stringBuilder.toString());
        return 1;
    }

    private void guessMeasurement(float f, int i) {
        calculateItemBorders(Math.max(Math.round(f * ((float) this.mSpanCount)), i));
    }

    private void measureChild(View view, int i, boolean z) {
        int childMeasureSpec;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.mDecorInsets;
        int i2 = ((rect.top + rect.bottom) + layoutParams.topMargin) + layoutParams.bottomMargin;
        int i3 = ((rect.left + rect.right) + layoutParams.leftMargin) + layoutParams.rightMargin;
        int spaceForSpanRange = getSpaceForSpanRange(layoutParams.mSpanIndex, layoutParams.mSpanSize);
        if (this.mOrientation == 1) {
            i = LayoutManager.getChildMeasureSpec(spaceForSpanRange, i, i3, layoutParams.width, false);
            childMeasureSpec = LayoutManager.getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), getHeightMode(), i2, layoutParams.height, true);
        } else {
            i = LayoutManager.getChildMeasureSpec(spaceForSpanRange, i, i2, layoutParams.height, false);
            int childMeasureSpec2 = LayoutManager.getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), getWidthMode(), i3, layoutParams.width, true);
            childMeasureSpec = i;
            i = childMeasureSpec2;
        }
        measureChildWithDecorationsAndMargin(view, i, childMeasureSpec, z);
    }

    private void measureChildWithDecorationsAndMargin(View view, int i, int i2, boolean z) {
        android.support.v7.widget.RecyclerView.LayoutParams layoutParams = (android.support.v7.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        if (z ? shouldReMeasureChild(view, i, i2, layoutParams) : shouldMeasureChild(view, i, i2, layoutParams)) {
            view.measure(i, i2);
        }
    }

    private void updateMeasurements() {
        int width;
        int paddingLeft;
        if (getOrientation() == 1) {
            width = getWidth() - getPaddingRight();
            paddingLeft = getPaddingLeft();
        } else {
            width = getHeight() - getPaddingBottom();
            paddingLeft = getPaddingTop();
        }
        calculateItemBorders(width - paddingLeft);
    }

    public boolean checkLayoutParams(android.support.v7.widget.RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    void collectPrefetchPositionsForLayoutState(State state, LayoutState layoutState, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i = this.mSpanCount;
        for (int i2 = 0; i2 < this.mSpanCount && layoutState.hasMore(state) && i > 0; i2++) {
            int i3 = layoutState.mCurrentPosition;
            layoutPrefetchRegistry.addPosition(i3, Math.max(0, layoutState.mScrollingOffset));
            i -= this.mSpanSizeLookup.getSpanSize(i3);
            layoutState.mCurrentPosition += layoutState.mItemDirection;
        }
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
            if (position >= 0 && position < i3 && getSpanIndex(recycler, state, position) == 0) {
                if (!((android.support.v7.widget.RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
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
        return this.mOrientation == 1 ? this.mSpanCount : state.getItemCount() <= 0 ? 0 : getSpanGroupIndex(recycler, state, state.getItemCount() - 1) + 1;
    }

    public int getRowCountForAccessibility(Recycler recycler, State state) {
        return this.mOrientation == 0 ? this.mSpanCount : state.getItemCount() <= 0 ? 0 : getSpanGroupIndex(recycler, state, state.getItemCount() - 1) + 1;
    }

    int getSpaceForSpanRange(int i, int i2) {
        return (this.mOrientation == 1 && isLayoutRTL()) ? this.mCachedBorders[this.mSpanCount - i] - this.mCachedBorders[(this.mSpanCount - i) - i2] : this.mCachedBorders[i2 + i] - this.mCachedBorders[i];
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    public SpanSizeLookup getSpanSizeLookup() {
        return this.mSpanSizeLookup;
    }

    void layoutChunk(Recycler recycler, State state, LayoutState layoutState, LayoutChunkResult layoutChunkResult) {
        Recycler recycler2 = recycler;
        State state2 = state;
        LayoutState layoutState2 = layoutState;
        LayoutChunkResult layoutChunkResult2 = layoutChunkResult;
        int modeInOther = this.mOrientationHelper.getModeInOther();
        boolean z = modeInOther != 1073741824;
        int i = getChildCount() > 0 ? r6.mCachedBorders[r6.mSpanCount] : 0;
        if (z) {
            updateMeasurements();
        }
        boolean z2 = layoutState2.mItemDirection == 1;
        int i2 = r6.mSpanCount;
        if (!z2) {
            i2 = getSpanIndex(recycler2, state2, layoutState2.mCurrentPosition) + getSpanSize(recycler2, state2, layoutState2.mCurrentPosition);
        }
        int i3 = 0;
        int i4 = 0;
        while (i4 < r6.mSpanCount && layoutState2.hasMore(state2) && i2 > 0) {
            int i5 = layoutState2.mCurrentPosition;
            int spanSize = getSpanSize(recycler2, state2, i5);
            if (spanSize <= r6.mSpanCount) {
                i2 -= spanSize;
                if (i2 < 0) {
                    break;
                }
                View next = layoutState2.next(recycler2);
                if (next == null) {
                    break;
                }
                i3 += spanSize;
                r6.mSet[i4] = next;
                i4++;
            } else {
                StringBuilder stringBuilder = new StringBuilder("Item at position ");
                stringBuilder.append(i5);
                stringBuilder.append(" requires ");
                stringBuilder.append(spanSize);
                stringBuilder.append(" spans but GridLayoutManager has only ");
                stringBuilder.append(r6.mSpanCount);
                stringBuilder.append(" spans.");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        if (i4 == 0) {
            layoutChunkResult2.mFinished = true;
            return;
        }
        int decoratedMeasurement;
        float f = 0.0f;
        int i6 = i4;
        assignSpans(recycler2, state2, i4, i3, z2);
        int i7 = 0;
        for (i2 = 0; i2 < i6; i2++) {
            boolean z3;
            View view = r6.mSet[i2];
            if (layoutState2.mScrapList != null) {
                z3 = false;
                if (z2) {
                    addDisappearingView(view);
                } else {
                    addDisappearingView(view, 0);
                }
            } else if (z2) {
                addView(view);
                z3 = false;
            } else {
                z3 = false;
                addView(view, 0);
            }
            calculateItemDecorationsForChild(view, r6.mDecorInsets);
            measureChild(view, modeInOther, z3);
            i5 = r6.mOrientationHelper.getDecoratedMeasurement(view);
            if (i5 > i7) {
                i7 = i5;
            }
            float decoratedMeasurementInOther = (BallPulseIndicator.SCALE * ((float) r6.mOrientationHelper.getDecoratedMeasurementInOther(view))) / ((float) ((LayoutParams) view.getLayoutParams()).mSpanSize);
            if (decoratedMeasurementInOther > f) {
                f = decoratedMeasurementInOther;
            }
        }
        if (z) {
            guessMeasurement(f, i);
            i7 = 0;
            for (i2 = 0; i2 < i6; i2++) {
                view = r6.mSet[i2];
                measureChild(view, 1073741824, true);
                decoratedMeasurement = r6.mOrientationHelper.getDecoratedMeasurement(view);
                if (decoratedMeasurement > i7) {
                    i7 = decoratedMeasurement;
                }
            }
        }
        for (i2 = 0; i2 < i6; i2++) {
            view = r6.mSet[i2];
            if (r6.mOrientationHelper.getDecoratedMeasurement(view) != i7) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                Rect rect = layoutParams.mDecorInsets;
                i4 = ((rect.top + rect.bottom) + layoutParams.topMargin) + layoutParams.bottomMargin;
                modeInOther = ((rect.left + rect.right) + layoutParams.leftMargin) + layoutParams.rightMargin;
                i3 = getSpaceForSpanRange(layoutParams.mSpanIndex, layoutParams.mSpanSize);
                if (r6.mOrientation == 1) {
                    i5 = LayoutManager.getChildMeasureSpec(i3, 1073741824, modeInOther, layoutParams.width, false);
                    i3 = MeasureSpec.makeMeasureSpec(i7 - i4, 1073741824);
                    modeInOther = i5;
                } else {
                    modeInOther = MeasureSpec.makeMeasureSpec(i7 - modeInOther, 1073741824);
                    i3 = LayoutManager.getChildMeasureSpec(i3, 1073741824, i4, layoutParams.height, false);
                }
                measureChildWithDecorationsAndMargin(view, modeInOther, i3, true);
            }
        }
        spanSize = 0;
        layoutChunkResult2.mConsumed = i7;
        if (r6.mOrientation != 1) {
            if (layoutState2.mLayoutDirection == -1) {
                i2 = layoutState2.mOffset;
                i5 = i2 - i7;
            } else {
                i2 = layoutState2.mOffset;
                i5 = i2;
                i2 = i7 + i2;
            }
            i7 = 0;
            decoratedMeasurement = i7;
        } else if (layoutState2.mLayoutDirection == -1) {
            i2 = layoutState2.mOffset;
            i7 = i2 - i7;
            decoratedMeasurement = i2;
            i2 = 0;
            i5 = i2;
        } else {
            i2 = layoutState2.mOffset;
            decoratedMeasurement = i7 + i2;
            i5 = 0;
            i7 = i2;
            i2 = i5;
        }
        while (spanSize < i6) {
            int i8;
            int i9;
            int decoratedMeasurementInOther2;
            View view2 = r6.mSet[spanSize];
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            if (r6.mOrientation != 1) {
                i7 = getPaddingTop() + r6.mCachedBorders[layoutParams2.mSpanIndex];
                decoratedMeasurement = r6.mOrientationHelper.getDecoratedMeasurementInOther(view2) + i7;
            } else if (isLayoutRTL()) {
                i2 = getPaddingLeft() + r6.mCachedBorders[r6.mSpanCount - layoutParams2.mSpanIndex];
                i5 = i2 - r6.mOrientationHelper.getDecoratedMeasurementInOther(view2);
            } else {
                i2 = getPaddingLeft() + r6.mCachedBorders[layoutParams2.mSpanIndex];
                i8 = i2;
                i = i7;
                i9 = decoratedMeasurement;
                decoratedMeasurementInOther2 = r6.mOrientationHelper.getDecoratedMeasurementInOther(view2) + i2;
                layoutDecoratedWithMargins(view2, i8, i, decoratedMeasurementInOther2, i9);
                if (!layoutParams2.isItemRemoved() || layoutParams2.isItemChanged()) {
                    layoutChunkResult2.mIgnoreConsumed = true;
                }
                layoutChunkResult2.mFocusable |= view2.hasFocusable();
                spanSize++;
                i5 = i8;
                i7 = i;
                i2 = decoratedMeasurementInOther2;
                decoratedMeasurement = i9;
            }
            decoratedMeasurementInOther2 = i2;
            i = i7;
            i9 = decoratedMeasurement;
            i8 = i5;
            layoutDecoratedWithMargins(view2, i8, i, decoratedMeasurementInOther2, i9);
            if (layoutParams2.isItemRemoved()) {
            }
            layoutChunkResult2.mIgnoreConsumed = true;
            layoutChunkResult2.mFocusable |= view2.hasFocusable();
            spanSize++;
            i5 = i8;
            i7 = i;
            i2 = decoratedMeasurementInOther2;
            decoratedMeasurement = i9;
        }
        Arrays.fill(r6.mSet, null);
    }

    void onAnchorReady(Recycler recycler, State state, AnchorInfo anchorInfo, int i) {
        super.onAnchorReady(recycler, state, anchorInfo, i);
        updateMeasurements();
        if (state.getItemCount() > 0 && !state.isPreLayout()) {
            ensureAnchorIsInCorrectSpan(recycler, state, anchorInfo, i);
        }
        ensureViewSet();
    }

    public View onFocusSearchFailed(View view, int i, Recycler recycler, State state) {
        GridLayoutManager gridLayoutManager = this;
        Recycler recycler2 = recycler;
        State state2 = state;
        View findContainingItemView = findContainingItemView(view);
        View view2 = null;
        if (findContainingItemView == null) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) findContainingItemView.getLayoutParams();
        int i2 = layoutParams.mSpanIndex;
        int i3 = layoutParams.mSpanIndex + layoutParams.mSpanSize;
        if (super.onFocusSearchFailed(view, i, recycler, state) == null) {
            return null;
        }
        int childCount;
        int i4;
        int i5;
        if (((convertFocusDirectionToLayoutDirection(i) == 1) != gridLayoutManager.mShouldReverseLayout ? 1 : 0) != 0) {
            childCount = getChildCount() - 1;
            i4 = -1;
            i5 = i4;
        } else {
            i4 = getChildCount();
            i5 = 1;
            childCount = 0;
        }
        boolean z = gridLayoutManager.mOrientation == 1 && isLayoutRTL();
        int spanGroupIndex = getSpanGroupIndex(recycler2, state2, childCount);
        int i6 = -1;
        int i7 = i6;
        int i8 = 0;
        int i9 = 0;
        View view3 = null;
        while (childCount != i4) {
            int spanGroupIndex2 = getSpanGroupIndex(recycler2, state2, childCount);
            View childAt = getChildAt(childCount);
            if (childAt == findContainingItemView) {
                break;
            }
            View view4;
            int i10;
            int i11;
            int i12;
            if (!childAt.hasFocusable() || spanGroupIndex2 == spanGroupIndex) {
                LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                int i13 = layoutParams2.mSpanIndex;
                view4 = findContainingItemView;
                i10 = i4;
                int i14 = layoutParams2.mSpanIndex + layoutParams2.mSpanSize;
                if (childAt.hasFocusable() && i13 == i2 && i14 == i3) {
                    return childAt;
                }
                Object obj;
                if (!(childAt.hasFocusable() && view2 == null) && (childAt.hasFocusable() || view3 != null)) {
                    i4 = Math.min(i14, i3) - Math.max(i13, i2);
                    if (childAt.hasFocusable()) {
                        if (i4 <= i8) {
                            if (i4 == i8) {
                                if (z == (i13 > i6)) {
                                }
                            }
                        }
                    } else if (view2 == null) {
                        i11 = i6;
                        i12 = spanGroupIndex;
                        boolean z2 = false;
                        if (isViewPartiallyVisible(childAt, false, true)) {
                            i6 = i9;
                            if (i4 > i6) {
                                i4 = i7;
                                obj = 1;
                                if (obj != null) {
                                    if (childAt.hasFocusable()) {
                                        i8 = Math.min(i14, i3) - Math.max(i13, i2);
                                        i9 = i6;
                                        i7 = i4;
                                        i6 = layoutParams2.mSpanIndex;
                                        view2 = childAt;
                                        childCount += i5;
                                        findContainingItemView = view4;
                                        i4 = i10;
                                        spanGroupIndex = i12;
                                        recycler2 = recycler;
                                        state2 = state;
                                    } else {
                                        view3 = childAt;
                                        i9 = Math.min(i14, i3) - Math.max(i13, i2);
                                        i7 = layoutParams2.mSpanIndex;
                                        i6 = i11;
                                        childCount += i5;
                                        findContainingItemView = view4;
                                        i4 = i10;
                                        spanGroupIndex = i12;
                                        recycler2 = recycler;
                                        state2 = state;
                                    }
                                }
                            } else {
                                if (i4 == i6) {
                                    i4 = i7;
                                    if (i13 > i4) {
                                        z2 = true;
                                    }
                                    if (z == z2) {
                                        obj = 1;
                                        if (obj != null) {
                                            if (childAt.hasFocusable()) {
                                                view3 = childAt;
                                                i9 = Math.min(i14, i3) - Math.max(i13, i2);
                                                i7 = layoutParams2.mSpanIndex;
                                                i6 = i11;
                                                childCount += i5;
                                                findContainingItemView = view4;
                                                i4 = i10;
                                                spanGroupIndex = i12;
                                                recycler2 = recycler;
                                                state2 = state;
                                            } else {
                                                i8 = Math.min(i14, i3) - Math.max(i13, i2);
                                                i9 = i6;
                                                i7 = i4;
                                                i6 = layoutParams2.mSpanIndex;
                                                view2 = childAt;
                                                childCount += i5;
                                                findContainingItemView = view4;
                                                i4 = i10;
                                                spanGroupIndex = i12;
                                                recycler2 = recycler;
                                                state2 = state;
                                            }
                                        }
                                    }
                                    obj = null;
                                    if (obj != null) {
                                        if (childAt.hasFocusable()) {
                                            i8 = Math.min(i14, i3) - Math.max(i13, i2);
                                            i9 = i6;
                                            i7 = i4;
                                            i6 = layoutParams2.mSpanIndex;
                                            view2 = childAt;
                                            childCount += i5;
                                            findContainingItemView = view4;
                                            i4 = i10;
                                            spanGroupIndex = i12;
                                            recycler2 = recycler;
                                            state2 = state;
                                        } else {
                                            view3 = childAt;
                                            i9 = Math.min(i14, i3) - Math.max(i13, i2);
                                            i7 = layoutParams2.mSpanIndex;
                                            i6 = i11;
                                            childCount += i5;
                                            findContainingItemView = view4;
                                            i4 = i10;
                                            spanGroupIndex = i12;
                                            recycler2 = recycler;
                                            state2 = state;
                                        }
                                    }
                                }
                                i4 = i7;
                                obj = null;
                                if (obj != null) {
                                    if (childAt.hasFocusable()) {
                                        view3 = childAt;
                                        i9 = Math.min(i14, i3) - Math.max(i13, i2);
                                        i7 = layoutParams2.mSpanIndex;
                                        i6 = i11;
                                        childCount += i5;
                                        findContainingItemView = view4;
                                        i4 = i10;
                                        spanGroupIndex = i12;
                                        recycler2 = recycler;
                                        state2 = state;
                                    } else {
                                        i8 = Math.min(i14, i3) - Math.max(i13, i2);
                                        i9 = i6;
                                        i7 = i4;
                                        i6 = layoutParams2.mSpanIndex;
                                        view2 = childAt;
                                        childCount += i5;
                                        findContainingItemView = view4;
                                        i4 = i10;
                                        spanGroupIndex = i12;
                                        recycler2 = recycler;
                                        state2 = state;
                                    }
                                }
                            }
                        }
                        i6 = i9;
                        i4 = i7;
                        obj = null;
                        if (obj != null) {
                            if (childAt.hasFocusable()) {
                                i8 = Math.min(i14, i3) - Math.max(i13, i2);
                                i9 = i6;
                                i7 = i4;
                                i6 = layoutParams2.mSpanIndex;
                                view2 = childAt;
                                childCount += i5;
                                findContainingItemView = view4;
                                i4 = i10;
                                spanGroupIndex = i12;
                                recycler2 = recycler;
                                state2 = state;
                            } else {
                                view3 = childAt;
                                i9 = Math.min(i14, i3) - Math.max(i13, i2);
                                i7 = layoutParams2.mSpanIndex;
                                i6 = i11;
                                childCount += i5;
                                findContainingItemView = view4;
                                i4 = i10;
                                spanGroupIndex = i12;
                                recycler2 = recycler;
                                state2 = state;
                            }
                        }
                    }
                    i11 = i6;
                    i12 = spanGroupIndex;
                    i6 = i9;
                    i4 = i7;
                    obj = null;
                    if (obj != null) {
                        if (childAt.hasFocusable()) {
                            view3 = childAt;
                            i9 = Math.min(i14, i3) - Math.max(i13, i2);
                            i7 = layoutParams2.mSpanIndex;
                            i6 = i11;
                            childCount += i5;
                            findContainingItemView = view4;
                            i4 = i10;
                            spanGroupIndex = i12;
                            recycler2 = recycler;
                            state2 = state;
                        } else {
                            i8 = Math.min(i14, i3) - Math.max(i13, i2);
                            i9 = i6;
                            i7 = i4;
                            i6 = layoutParams2.mSpanIndex;
                            view2 = childAt;
                            childCount += i5;
                            findContainingItemView = view4;
                            i4 = i10;
                            spanGroupIndex = i12;
                            recycler2 = recycler;
                            state2 = state;
                        }
                    }
                }
                i11 = i6;
                i12 = spanGroupIndex;
                i6 = i9;
                i4 = i7;
                obj = 1;
                if (obj != null) {
                    if (childAt.hasFocusable()) {
                        i8 = Math.min(i14, i3) - Math.max(i13, i2);
                        i9 = i6;
                        i7 = i4;
                        i6 = layoutParams2.mSpanIndex;
                        view2 = childAt;
                        childCount += i5;
                        findContainingItemView = view4;
                        i4 = i10;
                        spanGroupIndex = i12;
                        recycler2 = recycler;
                        state2 = state;
                    } else {
                        view3 = childAt;
                        i9 = Math.min(i14, i3) - Math.max(i13, i2);
                        i7 = layoutParams2.mSpanIndex;
                        i6 = i11;
                        childCount += i5;
                        findContainingItemView = view4;
                        i4 = i10;
                        spanGroupIndex = i12;
                        recycler2 = recycler;
                        state2 = state;
                    }
                }
            } else if (view2 != null) {
                break;
            } else {
                view4 = findContainingItemView;
                i11 = i6;
                i10 = i4;
                i12 = spanGroupIndex;
                i6 = i9;
                i4 = i7;
            }
            i9 = i6;
            i7 = i4;
            i6 = i11;
            childCount += i5;
            findContainingItemView = view4;
            i4 = i10;
            spanGroupIndex = i12;
            recycler2 = recycler;
            state2 = state;
        }
        return view2 != null ? view2 : view3;
    }

    public void onInitializeAccessibilityNodeInfoForItem(Recycler recycler, State state, View view, C0536b c0536b) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            Object a;
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            int spanGroupIndex = getSpanGroupIndex(recycler, state, layoutParams2.getViewLayoutPosition());
            boolean z = false;
            int spanIndex;
            int spanSize;
            if (this.mOrientation == 0) {
                spanIndex = layoutParams2.getSpanIndex();
                spanSize = layoutParams2.getSpanSize();
                if (this.mSpanCount > 1 && layoutParams2.getSpanSize() == this.mSpanCount) {
                    z = true;
                }
                a = C0535l.m1189a(spanIndex, spanSize, spanGroupIndex, 1, z);
            } else {
                spanIndex = layoutParams2.getSpanIndex();
                spanSize = layoutParams2.getSpanSize();
                if (this.mSpanCount > 1 && layoutParams2.getSpanSize() == this.mSpanCount) {
                    z = true;
                }
                a = C0535l.m1189a(spanGroupIndex, 1, spanIndex, spanSize, z);
            }
            c0536b.m1196a(a);
            return;
        }
        super.onInitializeAccessibilityNodeInfoForItem(view, c0536b);
    }

    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }

    public void onItemsChanged(RecyclerView recyclerView) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }

    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }

    public void onLayoutChildren(Recycler recycler, State state) {
        if (state.isPreLayout()) {
            cachePreLayoutSpanMapping();
        }
        super.onLayoutChildren(recycler, state);
        clearPreLayoutSpanMappingCache();
    }

    public void onLayoutCompleted(State state) {
        super.onLayoutCompleted(state);
        this.mPendingSpanCountChange = false;
    }

    public int scrollHorizontallyBy(int i, Recycler recycler, State state) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollHorizontallyBy(i, recycler, state);
    }

    public int scrollVerticallyBy(int i, Recycler recycler, State state) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollVerticallyBy(i, recycler, state);
    }

    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int chooseSize;
        if (this.mCachedBorders == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            chooseSize = LayoutManager.chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            i = LayoutManager.chooseSize(i, this.mCachedBorders[this.mCachedBorders.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            i = LayoutManager.chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            chooseSize = LayoutManager.chooseSize(i2, this.mCachedBorders[this.mCachedBorders.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(i, chooseSize);
    }

    public void setSpanCount(int i) {
        if (i != this.mSpanCount) {
            this.mPendingSpanCountChange = true;
            if (i <= 0) {
                StringBuilder stringBuilder = new StringBuilder("Span count should be at least 1. Provided ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            this.mSpanCount = i;
            this.mSpanSizeLookup.invalidateSpanIndexCache();
            requestLayout();
        }
    }

    public void setSpanSizeLookup(SpanSizeLookup spanSizeLookup) {
        this.mSpanSizeLookup = spanSizeLookup;
    }

    public void setStackFromEnd(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.mPendingSpanCountChange;
    }
}
