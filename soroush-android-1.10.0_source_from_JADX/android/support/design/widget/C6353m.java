package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout.C0273d;
import android.support.v4.p035d.C0443a;
import android.support.v4.view.C0555d;
import android.support.v4.view.C0571r;
import android.support.v4.view.C0582z;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import java.util.List;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

abstract class C6353m extends C4758v<View> {
    final Rect f17387a = new Rect();
    final Rect f17388b = new Rect();
    int f17389c = 0;
    int f17390d;

    public C6353m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    abstract View mo3277a(List<View> list);

    public boolean mo2519a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        C6353m c6353m = this;
        int i5 = view.getLayoutParams().height;
        if (i5 == -1 || i5 == -2) {
            View a = mo3277a(coordinatorLayout.m14910a(view));
            if (a != null) {
                View view2;
                if (!C0571r.m1386w(a) || C0571r.m1386w(view)) {
                    view2 = view;
                } else {
                    view2 = view;
                    C0571r.m1354b(view2, true);
                    if (C0571r.m1386w(view2)) {
                        view2.requestLayout();
                        return true;
                    }
                }
                int size = MeasureSpec.getSize(i3);
                if (size == 0) {
                    size = coordinatorLayout.getHeight();
                }
                coordinatorLayout.m14913a(view2, i, i2, MeasureSpec.makeMeasureSpec((size - a.getMeasuredHeight()) + mo3280c(a), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
                return true;
            }
        }
        return false;
    }

    float mo3279b(View view) {
        return BallPulseIndicator.SCALE;
    }

    protected final void mo2520b(CoordinatorLayout coordinatorLayout, View view, int i) {
        int bottom;
        View a = mo3277a(coordinatorLayout.m14910a(view));
        if (a != null) {
            C0273d c0273d = (C0273d) view.getLayoutParams();
            Rect rect = this.f17387a;
            rect.set(coordinatorLayout.getPaddingLeft() + c0273d.leftMargin, a.getBottom() + c0273d.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - c0273d.rightMargin, ((coordinatorLayout.getHeight() + a.getBottom()) - coordinatorLayout.getPaddingBottom()) - c0273d.bottomMargin);
            C0582z lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (!(lastWindowInsets == null || !C0571r.m1386w(coordinatorLayout) || C0571r.m1386w(view))) {
                rect.left += lastWindowInsets.m1426a();
                rect.right -= lastWindowInsets.m1429c();
            }
            Rect rect2 = this.f17388b;
            int i2 = c0273d.f989c;
            if (i2 == 0) {
                i2 = 8388659;
            }
            C0555d.m1225a(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            i = m14939d(a);
            view.layout(rect2.left, rect2.top - i, rect2.right, rect2.bottom - i);
            bottom = rect2.top - a.getBottom();
        } else {
            super.mo2520b(coordinatorLayout, view, i);
            bottom = 0;
        }
        this.f17389c = bottom;
    }

    int mo3280c(View view) {
        return view.getMeasuredHeight();
    }

    final int m14939d(View view) {
        return this.f17390d == 0 ? 0 : C0443a.m943a((int) (mo3279b(view) * ((float) this.f17390d)), 0, this.f17390d);
    }
}
