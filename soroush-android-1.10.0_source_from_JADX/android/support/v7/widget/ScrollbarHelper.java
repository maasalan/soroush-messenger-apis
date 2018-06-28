package android.support.v7.widget;

import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.State;
import android.view.View;

class ScrollbarHelper {
    ScrollbarHelper() {
    }

    static int computeScrollExtent(State state, OrientationHelper orientationHelper, View view, View view2, LayoutManager layoutManager, boolean z) {
        if (!(layoutManager.getChildCount() == 0 || state.getItemCount() == 0 || view == null)) {
            if (view2 != null) {
                if (!z) {
                    return Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1;
                }
                return Math.min(orientationHelper.getTotalSpace(), orientationHelper.getDecoratedEnd(view2) - orientationHelper.getDecoratedStart(view));
            }
        }
        return 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int computeScrollOffset(android.support.v7.widget.RecyclerView.State r4, android.support.v7.widget.OrientationHelper r5, android.view.View r6, android.view.View r7, android.support.v7.widget.RecyclerView.LayoutManager r8, boolean r9, boolean r10) {
        /*
        r0 = r8.getChildCount();
        r1 = 0;
        if (r0 == 0) goto L_0x0070;
    L_0x0007:
        r0 = r4.getItemCount();
        if (r0 == 0) goto L_0x0070;
    L_0x000d:
        if (r6 == 0) goto L_0x0070;
    L_0x000f:
        if (r7 != 0) goto L_0x0012;
    L_0x0011:
        return r1;
    L_0x0012:
        r0 = r8.getPosition(r6);
        r2 = r8.getPosition(r7);
        r0 = java.lang.Math.min(r0, r2);
        r2 = r8.getPosition(r6);
        r3 = r8.getPosition(r7);
        r2 = java.lang.Math.max(r2, r3);
        if (r10 == 0) goto L_0x0038;
    L_0x002c:
        r4 = r4.getItemCount();
        r4 = r4 - r2;
        r4 = r4 + -1;
        r4 = java.lang.Math.max(r1, r4);
        goto L_0x003c;
    L_0x0038:
        r4 = java.lang.Math.max(r1, r0);
    L_0x003c:
        if (r9 != 0) goto L_0x003f;
    L_0x003e:
        return r4;
    L_0x003f:
        r9 = r5.getDecoratedEnd(r7);
        r10 = r5.getDecoratedStart(r6);
        r9 = r9 - r10;
        r9 = java.lang.Math.abs(r9);
        r10 = r8.getPosition(r6);
        r7 = r8.getPosition(r7);
        r10 = r10 - r7;
        r7 = java.lang.Math.abs(r10);
        r7 = r7 + 1;
        r8 = (float) r9;
        r7 = (float) r7;
        r8 = r8 / r7;
        r4 = (float) r4;
        r4 = r4 * r8;
        r7 = r5.getStartAfterPadding();
        r5 = r5.getDecoratedStart(r6);
        r7 = r7 - r5;
        r5 = (float) r7;
        r4 = r4 + r5;
        r4 = java.lang.Math.round(r4);
        return r4;
    L_0x0070:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ScrollbarHelper.computeScrollOffset(android.support.v7.widget.RecyclerView$State, android.support.v7.widget.OrientationHelper, android.view.View, android.view.View, android.support.v7.widget.RecyclerView$LayoutManager, boolean, boolean):int");
    }

    static int computeScrollRange(State state, OrientationHelper orientationHelper, View view, View view2, LayoutManager layoutManager, boolean z) {
        if (!(layoutManager.getChildCount() == 0 || state.getItemCount() == 0 || view == null)) {
            if (view2 != null) {
                if (!z) {
                    return state.getItemCount();
                }
                return (int) ((((float) (orientationHelper.getDecoratedEnd(view2) - orientationHelper.getDecoratedStart(view))) / ((float) (Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1))) * ((float) state.getItemCount()));
            }
        }
        return 0;
    }
}
