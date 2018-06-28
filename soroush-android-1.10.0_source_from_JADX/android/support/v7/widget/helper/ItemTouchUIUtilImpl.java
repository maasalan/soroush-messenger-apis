package android.support.v7.widget.helper;

import android.graphics.Canvas;
import android.support.v4.view.C0571r;
import android.support.v7.p047e.C0699a.C0697b;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

class ItemTouchUIUtilImpl {

    static class BaseImpl implements ItemTouchUIUtil {
        BaseImpl() {
        }

        public void clearView(View view) {
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
            view.setTranslationX(f);
            view.setTranslationY(f2);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        }

        public void onSelected(View view) {
        }
    }

    static class Api21Impl extends BaseImpl {
        Api21Impl() {
        }

        private float findMaxElevation(RecyclerView recyclerView, View view) {
            int childCount = recyclerView.getChildCount();
            float f = 0.0f;
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != view) {
                    float s = C0571r.m1382s(childAt);
                    if (s > f) {
                        f = s;
                    }
                }
            }
            return f;
        }

        public void clearView(View view) {
            Object tag = view.getTag(C0697b.item_touch_helper_previous_elevation);
            if (tag != null && (tag instanceof Float)) {
                C0571r.m1372i(view, ((Float) tag).floatValue());
            }
            view.setTag(C0697b.item_touch_helper_previous_elevation, null);
            super.clearView(view);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
            if (z && view.getTag(C0697b.item_touch_helper_previous_elevation) == null) {
                Float valueOf = Float.valueOf(C0571r.m1382s(view));
                C0571r.m1372i(view, BallPulseIndicator.SCALE + findMaxElevation(recyclerView, view));
                view.setTag(C0697b.item_touch_helper_previous_elevation, valueOf);
            }
            super.onDraw(canvas, recyclerView, view, f, f2, i, z);
        }
    }

    ItemTouchUIUtilImpl() {
    }
}
