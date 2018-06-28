package android.support.v7.view;

import android.support.v4.view.C0579v;
import android.support.v4.view.C0580w;
import android.support.v4.view.C4847x;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public final class C0712h {
    public final ArrayList<C0579v> f2364a = new ArrayList();
    C0580w f2365b;
    boolean f2366c;
    private long f2367d = -1;
    private Interpolator f2368e;
    private final C4847x f2369f = new C63931(this);

    class C63931 extends C4847x {
        final /* synthetic */ C0712h f17483a;
        private boolean f17484b = false;
        private int f17485c = 0;

        C63931(C0712h c0712h) {
            this.f17483a = c0712h;
        }

        public final void onAnimationEnd(View view) {
            int i = this.f17485c + 1;
            this.f17485c = i;
            if (i == this.f17483a.f2364a.size()) {
                if (this.f17483a.f2365b != null) {
                    this.f17483a.f2365b.onAnimationEnd(null);
                }
                this.f17485c = 0;
                this.f17484b = false;
                this.f17483a.f2366c = false;
            }
        }

        public final void onAnimationStart(View view) {
            if (!this.f17484b) {
                this.f17484b = true;
                if (this.f17483a.f2365b != null) {
                    this.f17483a.f2365b.onAnimationStart(null);
                }
            }
        }
    }

    public final C0712h m1724a(C0579v c0579v) {
        if (!this.f2366c) {
            this.f2364a.add(c0579v);
        }
        return this;
    }

    public final C0712h m1725a(C0580w c0580w) {
        if (!this.f2366c) {
            this.f2365b = c0580w;
        }
        return this;
    }

    public final C0712h m1726a(Interpolator interpolator) {
        if (!this.f2366c) {
            this.f2368e = interpolator;
        }
        return this;
    }

    public final void m1727a() {
        if (!this.f2366c) {
            Iterator it = this.f2364a.iterator();
            while (it.hasNext()) {
                C0579v c0579v = (C0579v) it.next();
                if (this.f2367d >= 0) {
                    c0579v.m1411a(this.f2367d);
                }
                if (this.f2368e != null) {
                    c0579v.m1414a(this.f2368e);
                }
                if (this.f2365b != null) {
                    c0579v.m1412a(this.f2369f);
                }
                c0579v.m1417b();
            }
            this.f2366c = true;
        }
    }

    public final void m1728b() {
        if (this.f2366c) {
            Iterator it = this.f2364a.iterator();
            while (it.hasNext()) {
                ((C0579v) it.next()).m1415a();
            }
            this.f2366c = false;
        }
    }

    public final C0712h m1729c() {
        if (!this.f2366c) {
            this.f2367d = 250;
        }
        return this;
    }
}
