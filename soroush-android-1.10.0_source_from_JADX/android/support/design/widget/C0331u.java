package android.support.design.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

final class C0331u {
    private static final ThreadLocal<Matrix> f1272a = new ThreadLocal();
    private static final ThreadLocal<RectF> f1273b = new ThreadLocal();

    static void m651a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        Matrix matrix = (Matrix) f1272a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f1272a.set(matrix);
        } else {
            matrix.reset();
        }
        C0331u.m652a((ViewParent) viewGroup, view, matrix);
        RectF rectF = (RectF) f1273b.get();
        if (rectF == null) {
            rectF = new RectF();
            f1273b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    private static void m652a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            C0331u.m652a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
