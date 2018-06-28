package com.p085c.p086a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p089c.p098d.p100e.C5244c;
import com.p085c.p086a.p089c.p098d.p514c.C5240b;
import com.p085c.p086a.p102d.C1214d;
import com.p085c.p086a.p102d.C1216h;
import com.p085c.p086a.p102d.C1217i;
import com.p085c.p086a.p102d.C1221m;
import com.p085c.p086a.p102d.C1222n;
import com.p085c.p086a.p102d.C5258c;
import com.p085c.p086a.p102d.C5258c.C1213a;
import com.p085c.p086a.p102d.C5264p;
import com.p085c.p086a.p105g.C1244b;
import com.p085c.p086a.p105g.C1248f;
import com.p085c.p086a.p105g.p106a.C5266h;
import com.p085c.p086a.p105g.p106a.C7039i;
import com.p085c.p086a.p105g.p107b.C1242b;
import com.p085c.p086a.p109i.C1273i;
import java.util.ArrayList;

public final class C5284j implements C1217i {
    private static final C1248f f14646f;
    private static final C1248f f14647g;
    private static final C1248f f14648h = C1248f.m2938a(C1144h.f3691c).m2952a(C1251g.LOW).m2956c();
    protected final C1212c f14649a;
    final C1216h f14650b;
    final C1222n f14651c;
    final C5264p f14652d;
    C1248f f14653e;
    private final C1221m f14654i;
    private final Runnable f14655j;
    private final Handler f14656k;
    private final C5258c f14657l;

    class C12751 implements Runnable {
        final /* synthetic */ C5284j f3998a;

        C12751(C5284j c5284j) {
            this.f3998a = c5284j;
        }

        public final void run() {
            this.f3998a.f14650b.mo1223a(this.f3998a);
        }
    }

    private static class C5283b implements C1213a {
        private final C1222n f14645a;

        public C5283b(C1222n c1222n) {
            this.f14645a = c1222n;
        }

        public final void mo1249a(boolean z) {
            if (z) {
                C1222n c1222n = this.f14645a;
                for (C1244b c1244b : C1273i.m3019a(c1222n.f3857a)) {
                    if (!(c1244b.mo1238f() || c1244b.mo1240h())) {
                        c1244b.mo1235c();
                        if (c1222n.f3859c) {
                            c1222n.f3858b.add(c1244b);
                        } else {
                            c1244b.mo1231a();
                        }
                    }
                }
            }
        }
    }

    private static class C7259a extends C7039i<View, Object> {
        public C7259a(View view) {
            super(view);
        }

        public final void mo3320a(Object obj, C1242b<? super Object> c1242b) {
        }
    }

    static {
        C1248f a = C1248f.m2942a(Bitmap.class);
        a.f3925t = true;
        f14646f = a;
        a = C1248f.m2942a(C5244c.class);
        a.f3925t = true;
        f14647g = a;
    }

    public C5284j(C1212c c1212c, C1216h c1216h, C1221m c1221m) {
        this(c1212c, c1216h, c1221m, new C1222n(), c1212c.f3836g);
    }

    private C5284j(C1212c c1212c, C1216h c1216h, C1221m c1221m, C1222n c1222n, C1214d c1214d) {
        this.f14652d = new C5264p();
        this.f14655j = new C12751(this);
        this.f14656k = new Handler(Looper.getMainLooper());
        this.f14649a = c1212c;
        this.f14650b = c1216h;
        this.f14654i = c1221m;
        this.f14651c = c1222n;
        this.f14657l = c1214d.mo1225a(c1212c.f3832c.getBaseContext(), new C5283b(c1222n));
        if (C1273i.m3027d()) {
            this.f14656k.post(this.f14655j);
        } else {
            c1216h.mo1223a(this);
        }
        c1216h.mo1223a(this.f14657l);
        this.f14653e = c1212c.f3832c.f3875c.m2958d().m2963i();
        synchronized (c1212c.f3837h) {
            if (c1212c.f3837h.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            c1212c.f3837h.add(this);
        }
    }

    private <ResourceType> C1274i<ResourceType> m10948a(Class<ResourceType> cls) {
        return new C1274i(this.f14649a, this, cls);
    }

    private boolean m10949b(C5266h<?> c5266h) {
        C1244b a = c5266h.mo2698a();
        if (a == null) {
            return true;
        }
        if (!this.f14651c.m2896a(a)) {
            return false;
        }
        this.f14652d.f14607a.remove(c5266h);
        c5266h.mo2700a(null);
        return true;
    }

    public final C1274i<Drawable> m10950a(Object obj) {
        return m10948a(Drawable.class).m3035a(new C5240b()).m3037a(obj);
    }

    public final void m10951a() {
        this.f14649a.f3832c.onLowMemory();
    }

    public final void m10952a(int i) {
        this.f14649a.f3832c.onTrimMemory(i);
    }

    public final void m10953a(View view) {
        m10954a(new C7259a(view));
    }

    public final void m10954a(final C5266h<?> c5266h) {
        if (c5266h != null) {
            if (!C1273i.m3026c()) {
                this.f14656k.post(new Runnable(this) {
                    final /* synthetic */ C5284j f4000b;

                    public final void run() {
                        this.f4000b.m10954a(c5266h);
                    }
                });
            } else if (!m10949b(c5266h)) {
                C1212c c1212c = this.f14649a;
                synchronized (c1212c.f3837h) {
                    for (C5284j b : c1212c.f3837h) {
                        if (b.m10949b(c5266h)) {
                            return;
                        }
                    }
                    throw new IllegalStateException("Failed to remove target from managers");
                }
            }
        }
    }

    public final void mo1227b() {
        C1273i.m3021a();
        C1222n c1222n = this.f14651c;
        c1222n.f3859c = false;
        for (C1244b c1244b : C1273i.m3019a(c1222n.f3857a)) {
            if (!(c1244b.mo1238f() || c1244b.mo1240h() || c1244b.mo1237e())) {
                c1244b.mo1231a();
            }
        }
        c1222n.f3858b.clear();
        this.f14652d.mo1227b();
    }

    public final void mo1228c() {
        C1273i.m3021a();
        C1222n c1222n = this.f14651c;
        c1222n.f3859c = true;
        for (C1244b c1244b : C1273i.m3019a(c1222n.f3857a)) {
            if (c1244b.mo1237e()) {
                c1244b.mo1235c();
                c1222n.f3858b.add(c1244b);
            }
        }
        this.f14652d.mo1228c();
    }

    public final void mo1229d() {
        this.f14652d.mo1229d();
        for (C5266h a : new ArrayList(this.f14652d.f14607a)) {
            m10954a(a);
        }
        this.f14652d.f14607a.clear();
        this.f14651c.m2895a();
        this.f14650b.mo1224b(this);
        this.f14650b.mo1224b(this.f14657l);
        this.f14656k.removeCallbacks(this.f14655j);
        C1212c c1212c = this.f14649a;
        synchronized (c1212c.f3837h) {
            if (c1212c.f3837h.contains(this)) {
                c1212c.f3837h.remove(this);
            } else {
                throw new IllegalStateException("Cannot register not yet registered manager");
            }
        }
    }

    public final C1274i<Bitmap> m10958e() {
        return m10948a(Bitmap.class).m3035a(new C5101b()).m3034a(f14646f);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("{tracker=");
        stringBuilder.append(this.f14651c);
        stringBuilder.append(", treeNode=");
        stringBuilder.append(this.f14654i);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
