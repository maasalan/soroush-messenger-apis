package android.support.v7.widget;

import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.SmoothScroller.Action;
import android.support.v7.widget.RecyclerView.SmoothScroller.ScrollVectorProvider;
import android.support.v7.widget.RecyclerView.State;
import android.util.DisplayMetrics;
import android.view.View;

public class PagerSnapHelper extends SnapHelper {
    private static final int MAX_SCROLL_ON_FLING_DURATION = 100;
    private OrientationHelper mHorizontalHelper;
    private OrientationHelper mVerticalHelper;

    private int distanceToCenter(LayoutManager layoutManager, View view, OrientationHelper orientationHelper) {
        return (orientationHelper.getDecoratedStart(view) + (orientationHelper.getDecoratedMeasurement(view) / 2)) - (layoutManager.getClipToPadding() ? orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2) : orientationHelper.getEnd() / 2);
    }

    private View findCenterView(LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int startAfterPadding = layoutManager.getClipToPadding() ? orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2) : orientationHelper.getEnd() / 2;
        int i = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int abs = Math.abs((orientationHelper.getDecoratedStart(childAt) + (orientationHelper.getDecoratedMeasurement(childAt) / 2)) - startAfterPadding);
            if (abs < i) {
                view = childAt;
                i = abs;
            }
        }
        return view;
    }

    private View findStartView(LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int i = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int decoratedStart = orientationHelper.getDecoratedStart(childAt);
            if (decoratedStart < i) {
                view = childAt;
                i = decoratedStart;
            }
        }
        return view;
    }

    private OrientationHelper getHorizontalHelper(LayoutManager layoutManager) {
        if (this.mHorizontalHelper == null || this.mHorizontalHelper.mLayoutManager != layoutManager) {
            this.mHorizontalHelper = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.mHorizontalHelper;
    }

    private OrientationHelper getVerticalHelper(LayoutManager layoutManager) {
        if (this.mVerticalHelper == null || this.mVerticalHelper.mLayoutManager != layoutManager) {
            this.mVerticalHelper = OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.mVerticalHelper;
    }

    public int[] calculateDistanceToFinalSnap(LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = distanceToCenter(layoutManager, view, getHorizontalHelper(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = distanceToCenter(layoutManager, view, getVerticalHelper(layoutManager));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    protected LinearSmoothScroller createSnapScroller(LayoutManager layoutManager) {
        return !(layoutManager instanceof ScrollVectorProvider) ? null : new LinearSmoothScroller(this.mRecyclerView.getContext()) {
            protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            protected int calculateTimeForScrolling(int i) {
                return Math.min(100, super.calculateTimeForScrolling(i));
            }

            protected void onTargetFound(View view, State state, Action action) {
                int[] calculateDistanceToFinalSnap = PagerSnapHelper.this.calculateDistanceToFinalSnap(PagerSnapHelper.this.mRecyclerView.getLayoutManager(), view);
                int i = calculateDistanceToFinalSnap[0];
                int i2 = calculateDistanceToFinalSnap[1];
                int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                if (calculateTimeForDeceleration > 0) {
                    action.update(i, i2, calculateTimeForDeceleration, this.mDecelerateInterpolator);
                }
            }
        };
    }

    public View findSnapView(LayoutManager layoutManager) {
        OrientationHelper verticalHelper;
        if (layoutManager.canScrollVertically()) {
            verticalHelper = getVerticalHelper(layoutManager);
        } else if (!layoutManager.canScrollHorizontally()) {
            return null;
        } else {
            verticalHelper = getHorizontalHelper(layoutManager);
        }
        return findCenterView(layoutManager, verticalHelper);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int findTargetSnapPosition(android.support.v7.widget.RecyclerView.LayoutManager r6, int r7, int r8) {
        /*
        r5 = this;
        r0 = r6.getItemCount();
        r1 = -1;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r2 = 0;
        r3 = r6.canScrollVertically();
        if (r3 == 0) goto L_0x0018;
    L_0x000f:
        r2 = r5.getVerticalHelper(r6);
    L_0x0013:
        r2 = r5.findStartView(r6, r2);
        goto L_0x0023;
    L_0x0018:
        r3 = r6.canScrollHorizontally();
        if (r3 == 0) goto L_0x0023;
    L_0x001e:
        r2 = r5.getHorizontalHelper(r6);
        goto L_0x0013;
    L_0x0023:
        if (r2 != 0) goto L_0x0026;
    L_0x0025:
        return r1;
    L_0x0026:
        r2 = r6.getPosition(r2);
        if (r2 != r1) goto L_0x002d;
    L_0x002c:
        return r1;
    L_0x002d:
        r1 = r6.canScrollHorizontally();
        r3 = 0;
        r4 = 1;
        if (r1 == 0) goto L_0x003b;
    L_0x0035:
        if (r7 <= 0) goto L_0x0039;
    L_0x0037:
        r7 = r4;
        goto L_0x003e;
    L_0x0039:
        r7 = r3;
        goto L_0x003e;
    L_0x003b:
        if (r8 <= 0) goto L_0x0039;
    L_0x003d:
        goto L_0x0037;
    L_0x003e:
        r8 = r6 instanceof android.support.v7.widget.RecyclerView.SmoothScroller.ScrollVectorProvider;
        if (r8 == 0) goto L_0x0059;
    L_0x0042:
        r6 = (android.support.v7.widget.RecyclerView.SmoothScroller.ScrollVectorProvider) r6;
        r0 = r0 - r4;
        r6 = r6.computeScrollVectorForPosition(r0);
        if (r6 == 0) goto L_0x0059;
    L_0x004b:
        r8 = r6.x;
        r0 = 0;
        r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
        if (r8 < 0) goto L_0x0058;
    L_0x0052:
        r6 = r6.y;
        r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1));
        if (r6 >= 0) goto L_0x0059;
    L_0x0058:
        r3 = r4;
    L_0x0059:
        if (r3 == 0) goto L_0x005f;
    L_0x005b:
        if (r7 == 0) goto L_0x005e;
    L_0x005d:
        r2 = r2 - r4;
    L_0x005e:
        return r2;
    L_0x005f:
        if (r7 == 0) goto L_0x0062;
    L_0x0061:
        r2 = r2 + r4;
    L_0x0062:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.PagerSnapHelper.findTargetSnapPosition(android.support.v7.widget.RecyclerView$LayoutManager, int, int):int");
    }
}
