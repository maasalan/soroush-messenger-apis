package android.support.p028d;

import android.graphics.Matrix;
import android.support.p028d.C0226r.C0225a;
import android.view.View;
import android.view.ViewParent;

class am implements ar {
    am() {
    }

    public ak mo76a(View view) {
        return ai.m8636c(view);
    }

    public void mo77a(View view, float f) {
        Float f2 = (Float) view.getTag(C0225a.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    public void mo78a(View view, int i, int i2, int i3, int i4) {
        view.setLeft(i);
        view.setTop(i2);
        view.setRight(i3);
        view.setBottom(i4);
    }

    public void mo79a(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo79a(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    public av mo80b(View view) {
        return new at(view.getWindowToken());
    }

    public void mo81b(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo81b(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }

    public float mo82c(View view) {
        Float f = (Float) view.getTag(C0225a.save_non_transition_alpha);
        return f != null ? view.getAlpha() / f.floatValue() : view.getAlpha();
    }

    public void mo83d(View view) {
        if (view.getTag(C0225a.save_non_transition_alpha) == null) {
            view.setTag(C0225a.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }

    public void mo84e(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C0225a.save_non_transition_alpha, null);
        }
    }
}
