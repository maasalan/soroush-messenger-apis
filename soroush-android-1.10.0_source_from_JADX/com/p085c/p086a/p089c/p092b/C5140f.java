package com.p085c.p086a.p089c.p092b;

import android.support.v4.os.C0513f;
import android.support.v4.p038g.C0480k.C0479a;
import android.util.Log;
import com.p085c.p086a.C1227e;
import com.p085c.p086a.C1251g;
import com.p085c.p086a.C1254h.C5274d;
import com.p085c.p086a.p089c.C1102a;
import com.p085c.p086a.p089c.C1182c;
import com.p085c.p086a.p089c.C1208h;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.C5254l;
import com.p085c.p086a.p089c.C5255m;
import com.p085c.p086a.p089c.p090a.C1096b;
import com.p085c.p086a.p089c.p090a.C1098c;
import com.p085c.p086a.p089c.p092b.C1133d.C1132a;
import com.p085c.p086a.p089c.p092b.C1143g.C1142a;
import com.p085c.p086a.p089c.p092b.p094b.C1115a;
import com.p085c.p086a.p089c.p097c.C1173m.C1172a;
import com.p085c.p086a.p109i.C1267d;
import com.p085c.p086a.p109i.p110a.C1262a.C1260c;
import com.p085c.p086a.p109i.p110a.C1263b;
import com.p085c.p086a.p109i.p110a.C1263b.C5282a;
import java.util.ArrayList;
import java.util.List;

public final class C5140f<R> implements C1132a, C1260c, Comparable<C5140f<?>>, Runnable {
    private Object f14362A;
    private C1102a f14363B;
    private C1096b<?> f14364C;
    private volatile boolean f14365D;
    public final C1134e<R> f14366a = new C1134e();
    public final C1138d f14367b;
    final C1137c<?> f14368c = new C1137c();
    final C1139e f14369d = new C1139e();
    public C1227e f14370e;
    public C1208h f14371f;
    public C1251g f14372g;
    public C5151l f14373h;
    public int f14374i;
    public int f14375j;
    public C1144h f14376k;
    public C5253j f14377l;
    public C1136a<R> f14378m;
    public int f14379n;
    public C1140f f14380o;
    public boolean f14381p;
    C1208h f14382q;
    public volatile C1133d f14383r;
    public volatile boolean f14384s;
    private final List<Exception> f14385t = new ArrayList();
    private final C1263b f14386u = new C5282a();
    private final C0479a<C5140f<?>> f14387v;
    private C1141g f14388w;
    private long f14389x;
    private Thread f14390y;
    private C1208h f14391z;

    interface C1136a<R> {
        void mo1176a(C5140f<?> c5140f);

        void mo1177a(C1156o c1156o);

        void mo1178a(C1159s<R> c1159s, C1102a c1102a);
    }

    private static class C1137c<Z> {
        C1208h f3667a;
        C5254l<Z> f3668b;
        C5154r<Z> f3669c;

        C1137c() {
        }

        final boolean m2747a() {
            return this.f3669c != null;
        }
    }

    interface C1138d {
        C1115a mo1171a();
    }

    private static class C1139e {
        private boolean f3670a;
        private boolean f3671b;
        private boolean f3672c;

        C1139e() {
        }

        private boolean m2749e() {
            return (this.f3672c || this.f3671b) && this.f3670a;
        }

        final synchronized boolean m2750a() {
            this.f3670a = true;
            return m2749e();
        }

        final synchronized boolean m2751b() {
            this.f3671b = true;
            return m2749e();
        }

        final synchronized boolean m2752c() {
            this.f3672c = true;
            return m2749e();
        }

        final synchronized void m2753d() {
            this.f3671b = false;
            this.f3670a = false;
            this.f3672c = false;
        }
    }

    private enum C1140f {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    private enum C1141g {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    private final class C5139b<Z> implements C1142a<Z> {
        final /* synthetic */ C5140f f14360a;
        private final C1102a f14361b;

        C5139b(C5140f c5140f, C1102a c1102a) {
            this.f14360a = c5140f;
            this.f14361b = c1102a;
        }

        public final C1159s<Z> mo1163a(C1159s<Z> c1159s) {
            C5255m c5255m;
            C1159s<Z> a;
            Class cls = c1159s.mo1180b().getClass();
            C5254l c5254l = null;
            if (this.f14361b != C1102a.RESOURCE_DISK_CACHE) {
                C5255m c = this.f14360a.f14366a.m2742c(cls);
                c5255m = c;
                a = c.mo2695a(this.f14360a.f14370e, c1159s, this.f14360a.f14374i, this.f14360a.f14375j);
            } else {
                a = c1159s;
                c5255m = null;
            }
            if (!c1159s.equals(a)) {
                c1159s.mo1182d();
            }
            int i = 0;
            if ((this.f14360a.f14366a.f3650c.f3874b.f3946b.m2912a(a.mo1179a()) != null ? 1 : 0) != 0) {
                c5254l = this.f14360a.f14366a.f3650c.f3874b.f3946b.m2912a(a.mo1179a());
                if (c5254l != null) {
                    C1182c a2 = c5254l.mo2694a(this.f14360a.f14377l);
                } else {
                    throw new C5274d(a.mo1179a());
                }
            }
            a2 = C1182c.NONE;
            C5254l c5254l2 = c5254l;
            C1134e c1134e = this.f14360a.f14366a;
            C1208h c1208h = this.f14360a.f14382q;
            List b = c1134e.m2741b();
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((C1172a) b.get(i2)).f3736a.equals(c1208h)) {
                    i = 1;
                    break;
                }
            }
            if (!this.f14360a.f14376k.mo1169a(i ^ true, this.f14361b, a2)) {
                return a;
            }
            if (c5254l2 == null) {
                throw new C5274d(a.mo1180b().getClass());
            }
            C1208h c5135b;
            if (a2 == C1182c.SOURCE) {
                c5135b = new C5135b(this.f14360a.f14382q, this.f14360a.f14371f);
            } else if (a2 == C1182c.TRANSFORMED) {
                C1208h c5156u = new C5156u(this.f14360a.f14382q, this.f14360a.f14371f, this.f14360a.f14374i, this.f14360a.f14375j, c5255m, cls, this.f14360a.f14377l);
            } else {
                StringBuilder stringBuilder = new StringBuilder("Unknown strategy: ");
                stringBuilder.append(a2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            C1159s a3 = C5154r.m10626a(a);
            C1137c c1137c = this.f14360a.f14368c;
            c1137c.f3667a = c5135b;
            c1137c.f3668b = c5254l2;
            c1137c.f3669c = a3;
            return a3;
        }
    }

    C5140f(C1138d c1138d, C0479a<C5140f<?>> c0479a) {
        this.f14367b = c1138d;
        this.f14387v = c0479a;
    }

    private <Data> C1159s<R> m10566a(C1096b<?> c1096b, Data data, C1102a c1102a) {
        if (data == null) {
            c1096b.mo1108a();
            return null;
        }
        try {
            long a = C1267d.m2998a();
            C1159s<R> a2 = m10567a((Object) data, c1102a, this.f14366a.m2740b(data.getClass()));
            if (Log.isLoggable("DecodeJob", 2)) {
                StringBuilder stringBuilder = new StringBuilder("Decoded result ");
                stringBuilder.append(a2);
                m10569a(stringBuilder.toString(), a, null);
            }
            c1096b.mo1108a();
            return a2;
        } catch (Throwable th) {
            c1096b.mo1108a();
        }
    }

    private <Data, ResourceType> C1159s<R> m10567a(Data data, C1102a c1102a, C1158q<Data, ResourceType, R> c1158q) {
        C1098c a = this.f14370e.f3874b.f3947c.m2672a((Object) data);
        try {
            C1159s<R> a2 = c1158q.m2772a(a, this.f14377l, this.f14374i, this.f14375j, new C5139b(this, c1102a));
            return a2;
        } finally {
            a.mo1116b();
        }
    }

    private void m10569a(String str, long j, String str2) {
        String str3 = "DecodeJob";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" in ");
        stringBuilder.append(C1267d.m2997a(j));
        stringBuilder.append(", load key: ");
        stringBuilder.append(this.f14373h);
        if (str2 != null) {
            StringBuilder stringBuilder2 = new StringBuilder(", ");
            stringBuilder2.append(str2);
            str = stringBuilder2.toString();
        } else {
            str = "";
        }
        stringBuilder.append(str);
        stringBuilder.append(", thread: ");
        stringBuilder.append(Thread.currentThread().getName());
        Log.v(str3, stringBuilder.toString());
    }

    private void m10570d() {
        if (this.f14369d.m2751b()) {
            m10577a();
        }
    }

    private C1133d m10571e() {
        switch (this.f14388w) {
            case RESOURCE_CACHE:
                return new C5155t(this.f14366a, this);
            case DATA_CACHE:
                return new C5126a(this.f14366a, this);
            case SOURCE:
                return new C5157w(this.f14366a, this);
            case FINISHED:
                return null;
            default:
                StringBuilder stringBuilder = new StringBuilder("Unrecognized stage: ");
                stringBuilder.append(this.f14388w);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private void m10572f() {
        this.f14390y = Thread.currentThread();
        this.f14389x = C1267d.m2998a();
        boolean z = false;
        while (!this.f14384s && this.f14383r != null) {
            z = this.f14383r.mo1142a();
            if (z) {
                break;
            }
            this.f14388w = m10576a(this.f14388w);
            this.f14383r = m10571e();
            if (this.f14388w == C1141g.SOURCE) {
                mo1166c();
                return;
            }
        }
        if ((this.f14388w == C1141g.FINISHED || this.f14384s) && !r0) {
            m10573g();
        }
    }

    private void m10573g() {
        m10574h();
        this.f14378m.mo1177a(new C1156o("Failed to load resource", new ArrayList(this.f14385t)));
        if (this.f14369d.m2752c()) {
            m10577a();
        }
    }

    private void m10574h() {
        this.f14386u.mo1247a();
        if (this.f14365D) {
            throw new IllegalStateException("Already notified");
        }
        this.f14365D = true;
    }

    private void m10575i() {
        C1159s a;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f14389x;
            StringBuilder stringBuilder = new StringBuilder("data: ");
            stringBuilder.append(this.f14362A);
            stringBuilder.append(", cache key: ");
            stringBuilder.append(this.f14382q);
            stringBuilder.append(", fetcher: ");
            stringBuilder.append(this.f14364C);
            m10569a("Retrieved data", j, stringBuilder.toString());
        }
        try {
            a = m10566a(this.f14364C, this.f14362A, this.f14363B);
        } catch (C1156o e) {
            e.m2768a(this.f14391z, this.f14363B, null);
            this.f14385t.add(e);
            a = null;
        }
        if (a != null) {
            C1159s a2;
            C5154r c5154r;
            C1102a c1102a = this.f14363B;
            if (a instanceof C1157p) {
                ((C1157p) a).mo1201e();
            }
            if (this.f14368c.m2747a()) {
                a2 = C5154r.m10626a(a);
                c5154r = a2;
            } else {
                C1159s c1159s = a;
                c5154r = null;
                a2 = c1159s;
            }
            m10574h();
            this.f14378m.mo1178a(a2, c1102a);
            this.f14388w = C1141g.ENCODE;
            C1137c c1137c;
            try {
                if (this.f14368c.m2747a()) {
                    c1137c = this.f14368c;
                    C1138d c1138d = this.f14367b;
                    C5253j c5253j = this.f14377l;
                    C0513f.m1121a("DecodeJob.encode");
                    c1138d.mo1171a().mo1145a(c1137c.f3667a, new C5138c(c1137c.f3668b, c1137c.f3669c, c5253j));
                    c1137c.f3669c.m10631e();
                    C0513f.m1120a();
                }
                if (c5154r != null) {
                    c5154r.m10631e();
                }
                m10570d();
            } catch (Throwable th) {
                if (c5154r != null) {
                    c5154r.m10631e();
                }
                m10570d();
            }
        } else {
            m10572f();
        }
    }

    public final C1141g m10576a(C1141g c1141g) {
        while (true) {
            switch (c1141g) {
                case RESOURCE_CACHE:
                    if (!this.f14376k.mo1170b()) {
                        c1141g = C1141g.DATA_CACHE;
                        break;
                    }
                    return C1141g.DATA_CACHE;
                case DATA_CACHE:
                    return this.f14381p ? C1141g.FINISHED : C1141g.SOURCE;
                case SOURCE:
                case FINISHED:
                    return C1141g.FINISHED;
                case INITIALIZE:
                    if (!this.f14376k.mo1167a()) {
                        c1141g = C1141g.RESOURCE_CACHE;
                        break;
                    }
                    return C1141g.RESOURCE_CACHE;
                default:
                    StringBuilder stringBuilder = new StringBuilder("Unrecognized stage: ");
                    stringBuilder.append(c1141g);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }

    final void m10577a() {
        this.f14369d.m2753d();
        C1137c c1137c = this.f14368c;
        c1137c.f3667a = null;
        c1137c.f3668b = null;
        c1137c.f3669c = null;
        C1134e c1134e = this.f14366a;
        c1134e.f3650c = null;
        c1134e.f3651d = null;
        c1134e.f3661n = null;
        c1134e.f3654g = null;
        c1134e.f3658k = null;
        c1134e.f3656i = null;
        c1134e.f3662o = null;
        c1134e.f3657j = null;
        c1134e.f3663p = null;
        c1134e.f3648a.clear();
        c1134e.f3659l = false;
        c1134e.f3649b.clear();
        c1134e.f3660m = false;
        this.f14365D = false;
        this.f14370e = null;
        this.f14371f = null;
        this.f14377l = null;
        this.f14372g = null;
        this.f14373h = null;
        this.f14378m = null;
        this.f14388w = null;
        this.f14383r = null;
        this.f14390y = null;
        this.f14382q = null;
        this.f14362A = null;
        this.f14363B = null;
        this.f14364C = null;
        this.f14389x = 0;
        this.f14384s = false;
        this.f14385t.clear();
        this.f14387v.mo309a(this);
    }

    public final void mo1164a(C1208h c1208h, Exception exception, C1096b<?> c1096b, C1102a c1102a) {
        c1096b.mo1108a();
        C1156o c1156o = new C1156o("Fetching data failed", exception);
        c1156o.m2768a(c1208h, c1102a, c1096b.mo1112d());
        this.f14385t.add(c1156o);
        if (Thread.currentThread() != this.f14390y) {
            this.f14380o = C1140f.SWITCH_TO_SOURCE_SERVICE;
            this.f14378m.mo1176a(this);
            return;
        }
        m10572f();
    }

    public final void mo1165a(C1208h c1208h, Object obj, C1096b<?> c1096b, C1102a c1102a, C1208h c1208h2) {
        this.f14382q = c1208h;
        this.f14362A = obj;
        this.f14364C = c1096b;
        this.f14363B = c1102a;
        this.f14391z = c1208h2;
        if (Thread.currentThread() != this.f14390y) {
            this.f14380o = C1140f.DECODE_DATA;
            this.f14378m.mo1176a(this);
            return;
        }
        C0513f.m1121a("DecodeJob.decodeFromRetrievedData");
        try {
            m10575i();
        } finally {
            C0513f.m1120a();
        }
    }

    public final C1263b b_() {
        return this.f14386u;
    }

    public final void mo1166c() {
        this.f14380o = C1140f.SWITCH_TO_SOURCE_SERVICE;
        this.f14378m.mo1176a(this);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        C5140f c5140f = (C5140f) obj;
        int ordinal = this.f14372g.ordinal() - c5140f.f14372g.ordinal();
        return ordinal == 0 ? this.f14379n - c5140f.f14379n : ordinal;
    }

    public final void run() {
        C0513f.m1121a("DecodeJob#run");
        try {
            if (this.f14384s) {
                m10573g();
                return;
            }
            switch (this.f14380o) {
                case INITIALIZE:
                    this.f14388w = m10576a(C1141g.INITIALIZE);
                    this.f14383r = m10571e();
                    break;
                case SWITCH_TO_SOURCE_SERVICE:
                    break;
                case DECODE_DATA:
                    m10575i();
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder("Unrecognized run reason: ");
                    stringBuilder.append(this.f14380o);
                    throw new IllegalStateException(stringBuilder.toString());
            }
            m10572f();
            if (this.f14364C != null) {
                this.f14364C.mo1108a();
            }
            C0513f.m1120a();
        } catch (Throwable e) {
            if (Log.isLoggable("DecodeJob", 3)) {
                StringBuilder stringBuilder2 = new StringBuilder("DecodeJob threw unexpectedly, isCancelled: ");
                stringBuilder2.append(this.f14384s);
                stringBuilder2.append(", stage: ");
                stringBuilder2.append(this.f14388w);
                Log.d("DecodeJob", stringBuilder2.toString(), e);
            }
            if (this.f14388w != C1141g.ENCODE) {
                m10573g();
            }
            if (!this.f14384s) {
                throw e;
            }
        } finally {
            if (this.f14364C != null) {
                this.f14364C.mo1108a();
            }
            C0513f.m1120a();
        }
    }
}
