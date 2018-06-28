package android.support.design.widget;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout.C0270a;
import android.util.AttributeSet;
import android.view.View;

class C4758v<V extends View> extends C0270a<V> {
    private C0332w f13150a;
    private int f13151b = 0;
    private int f13152c = 0;

    public C4758v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean mo152a(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo2520b(coordinatorLayout, v, i);
        if (this.f13150a == null) {
            this.f13150a = new C0332w(v);
        }
        this.f13150a.m653a();
        if (this.f13151b != 0) {
            this.f13150a.m654a(this.f13151b);
            this.f13151b = 0;
        }
        if (this.f13152c != 0) {
            C0332w c0332w = this.f13150a;
            i = this.f13152c;
            if (c0332w.f1276c != i) {
                c0332w.f1276c = i;
                c0332w.m655b();
            }
            this.f13152c = 0;
        }
        return true;
    }

    public boolean a_(int i) {
        if (this.f13150a != null) {
            return this.f13150a.m654a(i);
        }
        this.f13151b = i;
        return false;
    }

    protected void mo2520b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.m14912a((View) v, i);
    }

    public int mo3276c() {
        return this.f13150a != null ? this.f13150a.f1275b : 0;
    }
}
