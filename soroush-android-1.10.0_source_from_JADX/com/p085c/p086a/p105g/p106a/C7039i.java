package com.p085c.p086a.p105g.p106a;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.p085c.p086a.p105g.C1244b;
import com.p085c.p086a.p109i.C1271h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public abstract class C7039i<T extends View, Z> extends C6461a<Z> {
    private static boolean f20062b = false;
    private static Integer f20063c;
    protected final T f20064a;
    private final C1241a f20065d;

    private static class C1241a {
        final View f3901a;
        final List<C1239g> f3902b = new ArrayList();
        C1240a f3903c;

        private static class C1240a implements OnPreDrawListener {
            private final WeakReference<C1241a> f3900a;

            C1240a(C1241a c1241a) {
                this.f3900a = new WeakReference(c1241a);
            }

            public final boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    StringBuilder stringBuilder = new StringBuilder("OnGlobalLayoutListener called listener=");
                    stringBuilder.append(this);
                    Log.v("ViewTarget", stringBuilder.toString());
                }
                C1241a c1241a = (C1241a) this.f3900a.get();
                if (c1241a != null) {
                    c1241a.m2917a();
                }
                return true;
            }
        }

        C1241a(View view) {
            this.f3901a = view;
        }

        private static int m2915a(int i, int i2, int i3) {
            i -= i3;
            return C1241a.m2916a(i) ? i : i2 == 0 ? 0 : i2 == -2 ? Integer.MIN_VALUE : i2 > 0 ? i2 - i3 : 0;
        }

        private static boolean m2916a(int i) {
            if (i <= 0) {
                if (i != Integer.MIN_VALUE) {
                    return false;
                }
            }
            return true;
        }

        final void m2917a() {
            if (!this.f3902b.isEmpty()) {
                int d = m2921d();
                int c = m2920c();
                if (m2918a(d, c)) {
                    for (C1239g a : this.f3902b) {
                        a.mo1232a(d, c);
                    }
                    m2919b();
                }
            }
        }

        final boolean m2918a(int i, int i2) {
            boolean z;
            if (this.f3901a.getLayoutParams() == null || this.f3901a.getLayoutParams().width <= 0 || this.f3901a.getLayoutParams().height <= 0) {
                if (this.f3901a.isLayoutRequested()) {
                    z = false;
                    return z && C1241a.m2916a(i) && C1241a.m2916a(i2);
                }
            }
            z = true;
            if (!z) {
            }
        }

        final void m2919b() {
            ViewTreeObserver viewTreeObserver = this.f3901a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f3903c);
            }
            this.f3903c = null;
            this.f3902b.clear();
        }

        final int m2920c() {
            int paddingTop = this.f3901a.getPaddingTop() + this.f3901a.getPaddingBottom();
            LayoutParams layoutParams = this.f3901a.getLayoutParams();
            return C1241a.m2915a(this.f3901a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        final int m2921d() {
            int paddingLeft = this.f3901a.getPaddingLeft() + this.f3901a.getPaddingRight();
            LayoutParams layoutParams = this.f3901a.getLayoutParams();
            return C1241a.m2915a(this.f3901a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }
    }

    public C7039i(T t) {
        this.f20064a = (View) C1271h.m3012a((Object) t, "Argument must not be null");
        this.f20065d = new C1241a(t);
    }

    public final C1244b mo2698a() {
        Object tag = f20063c == null ? this.f20064a.getTag() : this.f20064a.getTag(f20063c.intValue());
        if (tag == null) {
            return null;
        }
        if (tag instanceof C1244b) {
            return (C1244b) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public void mo2699a(Drawable drawable) {
        super.mo2699a(drawable);
        this.f20065d.m2919b();
    }

    public final void mo3318a(C1239g c1239g) {
        C1241a c1241a = this.f20065d;
        int d = c1241a.m2921d();
        int c = c1241a.m2920c();
        if (c1241a.m2918a(d, c)) {
            c1239g.mo1232a(d, c);
            return;
        }
        if (!c1241a.f3902b.contains(c1239g)) {
            c1241a.f3902b.add(c1239g);
        }
        if (c1241a.f3903c == null) {
            ViewTreeObserver viewTreeObserver = c1241a.f3901a.getViewTreeObserver();
            c1241a.f3903c = new C1240a(c1241a);
            viewTreeObserver.addOnPreDrawListener(c1241a.f3903c);
        }
    }

    public final void mo2700a(C1244b c1244b) {
        if (f20063c == null) {
            f20062b = true;
            this.f20064a.setTag(c1244b);
            return;
        }
        this.f20064a.setTag(f20063c.intValue(), c1244b);
    }

    public final void mo3319b(C1239g c1239g) {
        this.f20065d.f3902b.remove(c1239g);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Target for: ");
        stringBuilder.append(this.f20064a);
        return stringBuilder.toString();
    }
}
