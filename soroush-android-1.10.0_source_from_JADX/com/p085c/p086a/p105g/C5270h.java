package com.p085c.p086a.p105g;

import android.graphics.drawable.Drawable;
import android.support.v4.p029a.p030a.C0343b;
import android.support.v4.p038g.C0480k.C0479a;
import android.util.Log;
import com.p085c.p086a.C1227e;
import com.p085c.p086a.C1251g;
import com.p085c.p086a.p089c.C1102a;
import com.p085c.p086a.p089c.C1208h;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p092b.C1133d;
import com.p085c.p086a.p089c.p092b.C1134e;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p089c.p092b.C1156o;
import com.p085c.p086a.p089c.p092b.C1159s;
import com.p085c.p086a.p089c.p092b.C5140f;
import com.p085c.p086a.p089c.p092b.C5140f.C1138d;
import com.p085c.p086a.p089c.p092b.C5140f.C1140f;
import com.p085c.p086a.p089c.p092b.C5140f.C1141g;
import com.p085c.p086a.p089c.p092b.C5149i;
import com.p085c.p086a.p089c.p092b.C5149i.C1145a;
import com.p085c.p086a.p089c.p092b.C5149i.C1147d;
import com.p085c.p086a.p089c.p092b.C5149i.C1149f;
import com.p085c.p086a.p089c.p092b.C5150j;
import com.p085c.p086a.p089c.p092b.C5151l;
import com.p085c.p086a.p089c.p092b.C5152n;
import com.p085c.p086a.p105g.p106a.C1239g;
import com.p085c.p086a.p105g.p106a.C5266h;
import com.p085c.p086a.p105g.p107b.C1243c;
import com.p085c.p086a.p109i.C1267d;
import com.p085c.p086a.p109i.C1273i;
import com.p085c.p086a.p109i.p110a.C1262a;
import com.p085c.p086a.p109i.p110a.C1262a.C1259a;
import com.p085c.p086a.p109i.p110a.C1262a.C1260c;
import com.p085c.p086a.p109i.p110a.C1263b;
import com.p085c.p086a.p109i.p110a.C1263b.C5282a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

public final class C5270h<R> implements C1239g, C1244b, C1249g, C1260c {
    private static final C0479a<C5270h<?>> f14610a = C1262a.m2986a(new C52691());
    private static boolean f14611y = true;
    private final String f14612b = String.valueOf(hashCode());
    private final C1263b f14613c = new C5282a();
    private C1245c f14614d;
    private C1227e f14615e;
    private Object f14616f;
    private Class<R> f14617g;
    private C1248f f14618h;
    private int f14619i;
    private int f14620j;
    private C1251g f14621k;
    private C5266h<R> f14622l;
    private C1247e<R> f14623m;
    private C5149i f14624n;
    private C1243c<? super R> f14625o;
    private C1159s<R> f14626p;
    private C1147d f14627q;
    private long f14628r;
    private int f14629s;
    private Drawable f14630t;
    private Drawable f14631u;
    private Drawable f14632v;
    private int f14633w;
    private int f14634x;

    private enum C1250a {
        ;
        
        public static final int f3930a = 1;
        public static final int f3931b = 2;
        public static final int f3932c = 3;
        public static final int f3933d = 4;
        public static final int f3934e = 5;
        public static final int f3935f = 6;
        public static final int f3936g = 7;
        public static final int f3937h = 8;

        static {
            f3938i = new int[]{f3930a, f3931b, f3932c, f3933d, f3934e, f3935f, f3936g, f3937h};
        }
    }

    static class C52691 implements C1259a<C5270h<?>> {
        C52691() {
        }

        public final /* synthetic */ Object mo1156a() {
            return new C5270h();
        }
    }

    C5270h() {
    }

    private static int m10901a(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * ((float) i));
    }

    private Drawable m10902a(int i) {
        return f14611y ? m10907b(i) : m10908c(i);
    }

    public static <R> C5270h<R> m10903a(C1227e c1227e, Object obj, Class<R> cls, C1248f c1248f, int i, int i2, C1251g c1251g, C5266h<R> c5266h, C1247e<R> c1247e, C1245c c1245c, C5149i c5149i, C1243c<? super R> c1243c) {
        C5270h<R> c5270h = (C5270h) f14610a.mo308a();
        if (c5270h == null) {
            c5270h = new C5270h();
        }
        c5270h.f14615e = c1227e;
        c5270h.f14616f = obj;
        c5270h.f14617g = cls;
        c5270h.f14618h = c1248f;
        c5270h.f14619i = i;
        c5270h.f14620j = i2;
        c5270h.f14621k = c1251g;
        c5270h.f14622l = c5266h;
        c5270h.f14623m = c1247e;
        c5270h.f14614d = c1245c;
        c5270h.f14624n = c5149i;
        c5270h.f14625o = c1243c;
        c5270h.f14629s = C1250a.f3930a;
        return c5270h;
    }

    private void m10904a(C1156o c1156o, int i) {
        this.f14613c.mo1247a();
        int i2 = this.f14615e.f3877e;
        if (i2 <= i) {
            StringBuilder stringBuilder = new StringBuilder("Load failed for ");
            stringBuilder.append(this.f14616f);
            stringBuilder.append(" with size [");
            stringBuilder.append(this.f14633w);
            stringBuilder.append("x");
            stringBuilder.append(this.f14634x);
            stringBuilder.append("]");
            Log.w("Glide", stringBuilder.toString(), c1156o);
            if (i2 <= 4) {
                c1156o.m2769a("Glide");
            }
        }
        Drawable drawable = null;
        this.f14627q = null;
        this.f14629s = C1250a.f3934e;
        if (this.f14623m != null) {
            C1247e c1247e = this.f14623m;
            m10912m();
            c1247e.mo2229a();
        }
        if (m10911l()) {
            if (this.f14616f == null) {
                drawable = m10910k();
            }
            if (drawable == null) {
                if (this.f14630t == null) {
                    this.f14630t = this.f14618h.f3910e;
                    if (this.f14630t == null && this.f14618h.f3911f > 0) {
                        this.f14630t = m10902a(this.f14618h.f3911f);
                    }
                }
                drawable = this.f14630t;
            }
            if (drawable == null) {
                drawable = m10909j();
            }
            this.f14622l.mo2702c(drawable);
        }
    }

    private void m10905a(C1159s<?> c1159s) {
        C1273i.m3021a();
        if (c1159s instanceof C5152n) {
            ((C5152n) c1159s).m10624f();
            this.f14626p = null;
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    private void m10906a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" this: ");
        stringBuilder.append(this.f14612b);
        Log.v("Request", stringBuilder.toString());
    }

    private android.graphics.drawable.Drawable m10907b(int r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r1 = this;
        r0 = r1.f14615e;	 Catch:{ NoClassDefFoundError -> 0x0007 }
        r0 = android.support.v7.p043c.p044a.C0683b.m1656b(r0, r2);	 Catch:{ NoClassDefFoundError -> 0x0007 }
        return r0;
    L_0x0007:
        r0 = 0;
        f14611y = r0;
        r2 = r1.m10908c(r2);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.g.h.b(int):android.graphics.drawable.Drawable");
    }

    private Drawable m10908c(int i) {
        return C0343b.m671a(this.f14615e.getResources(), i, this.f14618h.f3926u);
    }

    private Drawable m10909j() {
        if (this.f14631u == null) {
            this.f14631u = this.f14618h.f3912g;
            if (this.f14631u == null && this.f14618h.f3913h > 0) {
                this.f14631u = m10902a(this.f14618h.f3913h);
            }
        }
        return this.f14631u;
    }

    private Drawable m10910k() {
        if (this.f14632v == null) {
            this.f14632v = this.f14618h.f3920o;
            if (this.f14632v == null && this.f14618h.f3921p > 0) {
                this.f14632v = m10902a(this.f14618h.f3921p);
            }
        }
        return this.f14632v;
    }

    private boolean m10911l() {
        if (this.f14614d != null) {
            if (!this.f14614d.mo1244b(this)) {
                return false;
            }
        }
        return true;
    }

    private boolean m10912m() {
        if (this.f14614d != null) {
            if (this.f14614d.mo1243b()) {
                return false;
            }
        }
        return true;
    }

    public final void mo1231a() {
        this.f14613c.mo1247a();
        this.f14628r = C1267d.m2998a();
        if (this.f14616f == null) {
            if (C1273i.m3022a(this.f14619i, this.f14620j)) {
                this.f14633w = this.f14619i;
                this.f14634x = this.f14620j;
            }
            m10904a(new C1156o("Received null model"), m10910k() == null ? 5 : 3);
            return;
        }
        this.f14629s = C1250a.f3932c;
        if (C1273i.m3022a(this.f14619i, this.f14620j)) {
            mo1232a(this.f14619i, this.f14620j);
        } else {
            this.f14622l.mo3318a((C1239g) this);
        }
        if ((this.f14629s == C1250a.f3931b || this.f14629s == C1250a.f3932c) && m10911l()) {
            this.f14622l.mo2701b(m10909j());
        }
        if (Log.isLoggable("Request", 2)) {
            StringBuilder stringBuilder = new StringBuilder("finished run method in ");
            stringBuilder.append(C1267d.m2997a(this.f14628r));
            m10906a(stringBuilder.toString());
        }
    }

    public final void mo1232a(int i, int i2) {
        this.f14613c.mo1247a();
        if (Log.isLoggable("Request", 2)) {
            StringBuilder stringBuilder = new StringBuilder("Got onSizeReady in ");
            stringBuilder.append(C1267d.m2997a(r0.f14628r));
            m10906a(stringBuilder.toString());
        }
        if (r0.f14629s == C1250a.f3932c) {
            C1159s a;
            String str;
            long j;
            C1147d c1147d;
            int i3;
            r0.f14629s = C1250a.f3931b;
            float f = r0.f14618h.f3907b;
            r0.f14633w = C5270h.m10901a(i, f);
            r0.f14634x = C5270h.m10901a(i2, f);
            if (Log.isLoggable("Request", 2)) {
                stringBuilder = new StringBuilder("finished setup for calling load in ");
                stringBuilder.append(C1267d.m2997a(r0.f14628r));
                m10906a(stringBuilder.toString());
            }
            C5149i c5149i = r0.f14624n;
            C1227e c1227e = r0.f14615e;
            Object obj = r0.f14616f;
            C1208h c1208h = r0.f14618h.f3917l;
            int i4 = r0.f14633w;
            int i5 = r0.f14634x;
            Class cls = r0.f14618h.f3924s;
            Class cls2 = r0.f14617g;
            C1251g c1251g = r0.f14621k;
            C1144h c1144h = r0.f14618h.f3908c;
            Map map = r0.f14618h.f3923r;
            boolean z = r0.f14618h.f3918m;
            C5253j c5253j = r0.f14618h.f3922q;
            boolean z2 = r0.f14618h.f3914i;
            boolean z3 = r0.f14618h.f3928w;
            boolean z4 = z2;
            z2 = r0.f14618h.f3929x;
            C1273i.m3021a();
            boolean z5 = z3;
            C1227e c1227e2 = c1227e;
            long a2 = C1267d.m2998a();
            boolean z6 = z2;
            boolean z7 = z4;
            C5253j c5253j2 = c5253j;
            boolean z8 = z;
            Map map2 = map;
            C1144h c1144h2 = c1144h;
            C1251g c1251g2 = c1251g;
            Class cls3 = cls2;
            Class cls4 = cls;
            int i6 = i5;
            C1208h c5151l = new C5151l(obj, c1208h, i4, i5, map2, cls, cls3, c5253j2);
            if (z7) {
                a = c5149i.f14397b.mo1149a(c5151l);
                a = a == null ? null : a instanceof C5152n ? (C5152n) a : new C5152n(a, true);
                if (a != null) {
                    a.m10623e();
                    c5149i.f14399d.put(c5151l, new C1149f(c5151l, a, c5149i.m10605a()));
                }
            } else {
                a = null;
            }
            if (a != null) {
                mo1234a(a, C1102a.MEMORY_CACHE);
                if (Log.isLoggable("Engine", 2)) {
                    str = "Loaded resource from cache";
                    j = a2;
                }
                c1147d = null;
                i3 = 2;
                r0.f14627q = c1147d;
                if (Log.isLoggable("Request", i3)) {
                    stringBuilder = new StringBuilder("finished onSizeReady in ");
                    stringBuilder.append(C1267d.m2997a(r0.f14628r));
                    m10906a(stringBuilder.toString());
                }
            }
            C1159s c1159s;
            C5150j c5150j;
            C1145a c1145a;
            C5140f c5140f;
            int i7;
            C1134e c1134e;
            C1138d c1138d;
            C1227e c1227e3;
            C1144h c1144h3;
            C1251g c1251g3;
            C5253j c5253j3;
            long j2;
            C1141g a3;
            Object obj2;
            j = a2;
            if (z7) {
                WeakReference weakReference = (WeakReference) c5149i.f14399d.get(c5151l);
                if (weakReference != null) {
                    c1159s = (C5152n) weakReference.get();
                    if (c1159s != null) {
                        c1159s.m10623e();
                    } else {
                        c5149i.f14399d.remove(c5151l);
                    }
                    if (c1159s == null) {
                        mo1234a(c1159s, C1102a.MEMORY_CACHE);
                        if (Log.isLoggable("Engine", 2)) {
                            str = "Loaded resource from active resources";
                        }
                        c1147d = null;
                        i3 = 2;
                        r0.f14627q = c1147d;
                        if (Log.isLoggable("Request", i3)) {
                            stringBuilder = new StringBuilder("finished onSizeReady in ");
                            stringBuilder.append(C1267d.m2997a(r0.f14628r));
                            m10906a(stringBuilder.toString());
                        }
                    }
                    c5150j = (C5150j) c5149i.f14396a.get(c5151l);
                    if (c5150j == null) {
                        c5150j.m10614a(r0);
                        if (Log.isLoggable("Engine", 2)) {
                            C5149i.m10604a("Added to existing load", j, c5151l);
                        }
                        c1147d = new C1147d(r0, c5150j);
                        i3 = 2;
                        r0.f14627q = c1147d;
                        if (Log.isLoggable("Request", i3)) {
                            stringBuilder = new StringBuilder("finished onSizeReady in ");
                            stringBuilder.append(C1267d.m2997a(r0.f14628r));
                            m10906a(stringBuilder.toString());
                        }
                    }
                    c5150j = (C5150j) c5149i.f14398c.f3701e.mo308a();
                    c5150j.f14411e = c5151l;
                    c5150j.f14412f = z7;
                    c5150j.f14413g = z5;
                    c1145a = c5149i.f14400e;
                    c5140f = (C5140f) c1145a.f3695b.mo308a();
                    i7 = c1145a.f3696c;
                    c1145a.f3696c = i7 + 1;
                    c1134e = c5140f.f14366a;
                    c1138d = c5140f.f14367b;
                    c1227e3 = c1227e2;
                    c1134e.f3650c = c1227e3;
                    c1134e.f3651d = obj;
                    c1134e.f3661n = c1208h;
                    c1134e.f3652e = i4;
                    i5 = i6;
                    c1134e.f3653f = i5;
                    c1144h3 = c1144h2;
                    c1134e.f3663p = c1144h3;
                    c1134e.f3654g = cls4;
                    c1134e.f3655h = c1138d;
                    c1134e.f3658k = cls3;
                    c1251g3 = c1251g2;
                    c1134e.f3662o = c1251g3;
                    c5253j3 = c5253j2;
                    c1134e.f3656i = c5253j3;
                    j2 = j;
                    c1134e.f3657j = map2;
                    c1134e.f3664q = z8;
                    c5140f.f14370e = c1227e3;
                    c5140f.f14371f = c1208h;
                    c5140f.f14372g = c1251g3;
                    c5140f.f14373h = c5151l;
                    c5140f.f14374i = i4;
                    c5140f.f14375j = i5;
                    c5140f.f14376k = c1144h3;
                    c5140f.f14381p = z6;
                    c5140f.f14377l = c5253j3;
                    c5140f.f14378m = c5150j;
                    c5140f.f14379n = i7;
                    c5140f.f14380o = C1140f.INITIALIZE;
                    c5149i.f14396a.put(c5151l, c5150j);
                    c5150j.m10614a(r0);
                    c5150j.f14420n = c5140f;
                    a3 = c5140f.m10576a(C1141g.INITIALIZE);
                    if (a3 != C1141g.RESOURCE_CACHE) {
                        if (a3 == C1141g.DATA_CACHE) {
                            obj2 = null;
                            (obj2 == null ? c5150j.f14410d : c5150j.m10610a()).execute(c5140f);
                            i3 = 2;
                            if (Log.isLoggable("Engine", 2)) {
                                C5149i.m10604a("Started new load", j2, c5151l);
                            }
                            c1147d = new C1147d(r0, c5150j);
                            r0.f14627q = c1147d;
                            if (Log.isLoggable("Request", i3)) {
                                stringBuilder = new StringBuilder("finished onSizeReady in ");
                                stringBuilder.append(C1267d.m2997a(r0.f14628r));
                                m10906a(stringBuilder.toString());
                            }
                        }
                    }
                    obj2 = 1;
                    if (obj2 == null) {
                    }
                    (obj2 == null ? c5150j.f14410d : c5150j.m10610a()).execute(c5140f);
                    i3 = 2;
                    if (Log.isLoggable("Engine", 2)) {
                        C5149i.m10604a("Started new load", j2, c5151l);
                    }
                    c1147d = new C1147d(r0, c5150j);
                    r0.f14627q = c1147d;
                    if (Log.isLoggable("Request", i3)) {
                        stringBuilder = new StringBuilder("finished onSizeReady in ");
                        stringBuilder.append(C1267d.m2997a(r0.f14628r));
                        m10906a(stringBuilder.toString());
                    }
                }
            }
            c1159s = null;
            if (c1159s == null) {
                c5150j = (C5150j) c5149i.f14396a.get(c5151l);
                if (c5150j == null) {
                    c5150j = (C5150j) c5149i.f14398c.f3701e.mo308a();
                    c5150j.f14411e = c5151l;
                    c5150j.f14412f = z7;
                    c5150j.f14413g = z5;
                    c1145a = c5149i.f14400e;
                    c5140f = (C5140f) c1145a.f3695b.mo308a();
                    i7 = c1145a.f3696c;
                    c1145a.f3696c = i7 + 1;
                    c1134e = c5140f.f14366a;
                    c1138d = c5140f.f14367b;
                    c1227e3 = c1227e2;
                    c1134e.f3650c = c1227e3;
                    c1134e.f3651d = obj;
                    c1134e.f3661n = c1208h;
                    c1134e.f3652e = i4;
                    i5 = i6;
                    c1134e.f3653f = i5;
                    c1144h3 = c1144h2;
                    c1134e.f3663p = c1144h3;
                    c1134e.f3654g = cls4;
                    c1134e.f3655h = c1138d;
                    c1134e.f3658k = cls3;
                    c1251g3 = c1251g2;
                    c1134e.f3662o = c1251g3;
                    c5253j3 = c5253j2;
                    c1134e.f3656i = c5253j3;
                    j2 = j;
                    c1134e.f3657j = map2;
                    c1134e.f3664q = z8;
                    c5140f.f14370e = c1227e3;
                    c5140f.f14371f = c1208h;
                    c5140f.f14372g = c1251g3;
                    c5140f.f14373h = c5151l;
                    c5140f.f14374i = i4;
                    c5140f.f14375j = i5;
                    c5140f.f14376k = c1144h3;
                    c5140f.f14381p = z6;
                    c5140f.f14377l = c5253j3;
                    c5140f.f14378m = c5150j;
                    c5140f.f14379n = i7;
                    c5140f.f14380o = C1140f.INITIALIZE;
                    c5149i.f14396a.put(c5151l, c5150j);
                    c5150j.m10614a(r0);
                    c5150j.f14420n = c5140f;
                    a3 = c5140f.m10576a(C1141g.INITIALIZE);
                    if (a3 != C1141g.RESOURCE_CACHE) {
                        if (a3 == C1141g.DATA_CACHE) {
                            obj2 = null;
                            if (obj2 == null) {
                            }
                            (obj2 == null ? c5150j.f14410d : c5150j.m10610a()).execute(c5140f);
                            i3 = 2;
                            if (Log.isLoggable("Engine", 2)) {
                                C5149i.m10604a("Started new load", j2, c5151l);
                            }
                            c1147d = new C1147d(r0, c5150j);
                            r0.f14627q = c1147d;
                            if (Log.isLoggable("Request", i3)) {
                                stringBuilder = new StringBuilder("finished onSizeReady in ");
                                stringBuilder.append(C1267d.m2997a(r0.f14628r));
                                m10906a(stringBuilder.toString());
                            }
                        }
                    }
                    obj2 = 1;
                    if (obj2 == null) {
                    }
                    (obj2 == null ? c5150j.f14410d : c5150j.m10610a()).execute(c5140f);
                    i3 = 2;
                    if (Log.isLoggable("Engine", 2)) {
                        C5149i.m10604a("Started new load", j2, c5151l);
                    }
                    c1147d = new C1147d(r0, c5150j);
                    r0.f14627q = c1147d;
                    if (Log.isLoggable("Request", i3)) {
                        stringBuilder = new StringBuilder("finished onSizeReady in ");
                        stringBuilder.append(C1267d.m2997a(r0.f14628r));
                        m10906a(stringBuilder.toString());
                    }
                }
                c5150j.m10614a(r0);
                if (Log.isLoggable("Engine", 2)) {
                    C5149i.m10604a("Added to existing load", j, c5151l);
                }
                c1147d = new C1147d(r0, c5150j);
                i3 = 2;
                r0.f14627q = c1147d;
                if (Log.isLoggable("Request", i3)) {
                    stringBuilder = new StringBuilder("finished onSizeReady in ");
                    stringBuilder.append(C1267d.m2997a(r0.f14628r));
                    m10906a(stringBuilder.toString());
                }
            }
            mo1234a(c1159s, C1102a.MEMORY_CACHE);
            if (Log.isLoggable("Engine", 2)) {
                str = "Loaded resource from active resources";
            }
            c1147d = null;
            i3 = 2;
            r0.f14627q = c1147d;
            if (Log.isLoggable("Request", i3)) {
                stringBuilder = new StringBuilder("finished onSizeReady in ");
                stringBuilder.append(C1267d.m2997a(r0.f14628r));
                m10906a(stringBuilder.toString());
            }
            C5149i.m10604a(str, j, c5151l);
            c1147d = null;
            i3 = 2;
            r0.f14627q = c1147d;
            if (Log.isLoggable("Request", i3)) {
                stringBuilder = new StringBuilder("finished onSizeReady in ");
                stringBuilder.append(C1267d.m2997a(r0.f14628r));
                m10906a(stringBuilder.toString());
            }
        }
    }

    public final void mo1233a(C1156o c1156o) {
        m10904a(c1156o, 5);
    }

    public final void mo1234a(C1159s<?> c1159s, C1102a c1102a) {
        this.f14613c.mo1247a();
        this.f14627q = null;
        if (c1159s == null) {
            StringBuilder stringBuilder = new StringBuilder("Expected to receive a Resource<R> with an object of ");
            stringBuilder.append(this.f14617g);
            stringBuilder.append(" inside, but instead got null.");
            m10904a(new C1156o(stringBuilder.toString()), 5);
            return;
        }
        Object b = c1159s.mo1180b();
        if (b != null) {
            if (this.f14617g.isAssignableFrom(b.getClass())) {
                Object obj;
                StringBuilder stringBuilder2;
                if (this.f14614d != null) {
                    if (!this.f14614d.mo1242a(this)) {
                        obj = null;
                        if (obj != null) {
                            m10905a((C1159s) c1159s);
                            this.f14629s = C1250a.f3933d;
                            return;
                        }
                        m10912m();
                        this.f14629s = C1250a.f3933d;
                        this.f14626p = c1159s;
                        if (this.f14615e.f3877e <= 3) {
                            stringBuilder2 = new StringBuilder("Finished loading ");
                            stringBuilder2.append(b.getClass().getSimpleName());
                            stringBuilder2.append(" from ");
                            stringBuilder2.append(c1102a);
                            stringBuilder2.append(" for ");
                            stringBuilder2.append(this.f14616f);
                            stringBuilder2.append(" with size [");
                            stringBuilder2.append(this.f14633w);
                            stringBuilder2.append("x");
                            stringBuilder2.append(this.f14634x);
                            stringBuilder2.append("] in ");
                            stringBuilder2.append(C1267d.m2997a(this.f14628r));
                            stringBuilder2.append(" ms");
                            Log.d("Glide", stringBuilder2.toString());
                        }
                        if (this.f14623m != null) {
                            this.f14623m.mo2230b();
                        }
                        this.f14622l.mo3320a(b, this.f14625o.mo1230a());
                        if (this.f14614d != null) {
                            this.f14614d.mo1245c(this);
                        }
                        return;
                    }
                }
                obj = 1;
                if (obj != null) {
                    m10912m();
                    this.f14629s = C1250a.f3933d;
                    this.f14626p = c1159s;
                    if (this.f14615e.f3877e <= 3) {
                        stringBuilder2 = new StringBuilder("Finished loading ");
                        stringBuilder2.append(b.getClass().getSimpleName());
                        stringBuilder2.append(" from ");
                        stringBuilder2.append(c1102a);
                        stringBuilder2.append(" for ");
                        stringBuilder2.append(this.f14616f);
                        stringBuilder2.append(" with size [");
                        stringBuilder2.append(this.f14633w);
                        stringBuilder2.append("x");
                        stringBuilder2.append(this.f14634x);
                        stringBuilder2.append("] in ");
                        stringBuilder2.append(C1267d.m2997a(this.f14628r));
                        stringBuilder2.append(" ms");
                        Log.d("Glide", stringBuilder2.toString());
                    }
                    if (this.f14623m != null) {
                        this.f14623m.mo2230b();
                    }
                    this.f14622l.mo3320a(b, this.f14625o.mo1230a());
                    if (this.f14614d != null) {
                        this.f14614d.mo1245c(this);
                    }
                    return;
                }
                m10905a((C1159s) c1159s);
                this.f14629s = C1250a.f3933d;
                return;
            }
        }
        m10905a((C1159s) c1159s);
        StringBuilder stringBuilder3 = new StringBuilder("Expected to receive an object of ");
        stringBuilder3.append(this.f14617g);
        stringBuilder3.append(" but instead got ");
        stringBuilder3.append(b != null ? b.getClass() : "");
        stringBuilder3.append("{");
        stringBuilder3.append(b);
        stringBuilder3.append("} inside Resource{");
        stringBuilder3.append(c1159s);
        stringBuilder3.append("}.");
        stringBuilder3.append(b != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
        m10904a(new C1156o(stringBuilder3.toString()), 5);
    }

    public final C1263b b_() {
        return this.f14613c;
    }

    public final void mo1235c() {
        mo1236d();
        this.f14629s = C1250a.f3937h;
    }

    public final void mo1236d() {
        C1273i.m3021a();
        if (this.f14629s != C1250a.f3936g) {
            this.f14613c.mo1247a();
            this.f14622l.mo3319b((C1239g) this);
            this.f14629s = C1250a.f3935f;
            if (this.f14627q != null) {
                C1147d c1147d = this.f14627q;
                C5150j c5150j = c1147d.f3702a;
                C1249g c1249g = c1147d.f3703b;
                C1273i.m3021a();
                c5150j.f14408b.mo1247a();
                if (!c5150j.f14416j) {
                    if (!c5150j.f14417k) {
                        c5150j.f14407a.remove(c1249g);
                        if (!(!c5150j.f14407a.isEmpty() || c5150j.f14417k || c5150j.f14416j)) {
                            if (!c5150j.f14421o) {
                                c5150j.f14421o = true;
                                C5140f c5140f = c5150j.f14420n;
                                c5140f.f14384s = true;
                                C1133d c1133d = c5140f.f14383r;
                                if (c1133d != null) {
                                    c1133d.mo1143b();
                                }
                                c5150j.f14409c.mo1172a(c5150j, c5150j.f14411e);
                            }
                        }
                        this.f14627q = null;
                    }
                }
                if (c5150j.f14418l == null) {
                    c5150j.f14418l = new ArrayList(2);
                }
                if (!c5150j.f14418l.contains(c1249g)) {
                    c5150j.f14418l.add(c1249g);
                }
                this.f14627q = null;
            }
            if (this.f14626p != null) {
                m10905a(this.f14626p);
            }
            if (m10911l()) {
                this.f14622l.mo2699a(m10909j());
            }
            this.f14629s = C1250a.f3936g;
        }
    }

    public final boolean mo1237e() {
        if (this.f14629s != C1250a.f3931b) {
            if (this.f14629s != C1250a.f3932c) {
                return false;
            }
        }
        return true;
    }

    public final boolean mo1238f() {
        return this.f14629s == C1250a.f3933d;
    }

    public final boolean mo1239g() {
        return mo1238f();
    }

    public final boolean mo1240h() {
        if (this.f14629s != C1250a.f3935f) {
            if (this.f14629s != C1250a.f3936g) {
                return false;
            }
        }
        return true;
    }

    public final void mo1241i() {
        this.f14615e = null;
        this.f14616f = null;
        this.f14617g = null;
        this.f14618h = null;
        this.f14619i = -1;
        this.f14620j = -1;
        this.f14622l = null;
        this.f14623m = null;
        this.f14614d = null;
        this.f14625o = null;
        this.f14627q = null;
        this.f14630t = null;
        this.f14631u = null;
        this.f14632v = null;
        this.f14633w = -1;
        this.f14634x = -1;
        f14610a.mo309a(this);
    }
}
