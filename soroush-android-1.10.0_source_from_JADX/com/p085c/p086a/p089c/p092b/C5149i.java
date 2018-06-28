package com.p085c.p086a.p089c.p092b;

import android.os.Looper;
import android.os.MessageQueue.IdleHandler;
import android.support.v4.p038g.C0480k.C0479a;
import android.util.Log;
import com.p085c.p086a.p089c.C1208h;
import com.p085c.p086a.p089c.p092b.C5140f.C1138d;
import com.p085c.p086a.p089c.p092b.C5152n.C1154a;
import com.p085c.p086a.p089c.p092b.p094b.C1115a;
import com.p085c.p086a.p089c.p092b.p094b.C1115a.C1113a;
import com.p085c.p086a.p089c.p092b.p094b.C1121h;
import com.p085c.p086a.p089c.p092b.p094b.C1121h.C1120a;
import com.p085c.p086a.p089c.p092b.p094b.C5127b;
import com.p085c.p086a.p089c.p092b.p095c.C1130a;
import com.p085c.p086a.p105g.C1249g;
import com.p085c.p086a.p109i.C1267d;
import com.p085c.p086a.p109i.C1273i;
import com.p085c.p086a.p109i.p110a.C1262a;
import com.p085c.p086a.p109i.p110a.C1262a.C1259a;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class C5149i implements C1120a, C1152k, C1154a {
    public final Map<C1208h, C5150j<?>> f14396a;
    public final C1121h f14397b;
    public final C1146b f14398c;
    public final Map<C1208h, WeakReference<C5152n<?>>> f14399d;
    public final C1145a f14400e;
    private final C1153m f14401f;
    private final C1161v f14402g;
    private final C5148c f14403h;
    private ReferenceQueue<C5152n<?>> f14404i;

    static class C1145a {
        final C1138d f3694a;
        public final C0479a<C5140f<?>> f3695b = C1262a.m2986a(new C51461(this));
        public int f3696c;

        class C51461 implements C1259a<C5140f<?>> {
            final /* synthetic */ C1145a f14392a;

            C51461(C1145a c1145a) {
                this.f14392a = c1145a;
            }

            public final /* synthetic */ Object mo1156a() {
                return new C5140f(this.f14392a.f3694a, this.f14392a.f3695b);
            }
        }

        C1145a(C1138d c1138d) {
            this.f3694a = c1138d;
        }
    }

    static class C1146b {
        final C1130a f3697a;
        final C1130a f3698b;
        final C1130a f3699c;
        final C1152k f3700d;
        public final C0479a<C5150j<?>> f3701e = C1262a.m2986a(new C51471(this));

        class C51471 implements C1259a<C5150j<?>> {
            final /* synthetic */ C1146b f14393a;

            C51471(C1146b c1146b) {
                this.f14393a = c1146b;
            }

            public final /* synthetic */ Object mo1156a() {
                return new C5150j(this.f14393a.f3697a, this.f14393a.f3698b, this.f14393a.f3699c, this.f14393a.f3700d, this.f14393a.f3701e);
            }
        }

        C1146b(C1130a c1130a, C1130a c1130a2, C1130a c1130a3, C1152k c1152k) {
            this.f3697a = c1130a;
            this.f3698b = c1130a2;
            this.f3699c = c1130a3;
            this.f3700d = c1152k;
        }
    }

    public static class C1147d {
        public final C5150j<?> f3702a;
        public final C1249g f3703b;

        public C1147d(C1249g c1249g, C5150j<?> c5150j) {
            this.f3703b = c1249g;
            this.f3702a = c5150j;
        }
    }

    private static class C1148e implements IdleHandler {
        private final Map<C1208h, WeakReference<C5152n<?>>> f3704a;
        private final ReferenceQueue<C5152n<?>> f3705b;

        public C1148e(Map<C1208h, WeakReference<C5152n<?>>> map, ReferenceQueue<C5152n<?>> referenceQueue) {
            this.f3704a = map;
            this.f3705b = referenceQueue;
        }

        public final boolean queueIdle() {
            C1149f c1149f = (C1149f) this.f3705b.poll();
            if (c1149f != null) {
                this.f3704a.remove(c1149f.f3706a);
            }
            return true;
        }
    }

    private static class C1149f extends WeakReference<C5152n<?>> {
        final C1208h f3706a;

        public C1149f(C1208h c1208h, C5152n<?> c5152n, ReferenceQueue<? super C5152n<?>> referenceQueue) {
            super(c5152n, referenceQueue);
            this.f3706a = c1208h;
        }
    }

    private static class C5148c implements C1138d {
        private final C1113a f14394a;
        private volatile C1115a f14395b;

        public C5148c(C1113a c1113a) {
            this.f14394a = c1113a;
        }

        public final C1115a mo1171a() {
            if (this.f14395b == null) {
                synchronized (this) {
                    if (this.f14395b == null) {
                        this.f14395b = this.f14394a.mo1146a();
                    }
                    if (this.f14395b == null) {
                        this.f14395b = new C5127b();
                    }
                }
            }
            return this.f14395b;
        }
    }

    public C5149i(C1121h c1121h, C1113a c1113a, C1130a c1130a, C1130a c1130a2, C1130a c1130a3) {
        this(c1121h, c1113a, c1130a, c1130a2, c1130a3, (byte) 0);
    }

    private C5149i(C1121h c1121h, C1113a c1113a, C1130a c1130a, C1130a c1130a2, C1130a c1130a3, byte b) {
        this.f14397b = c1121h;
        this.f14403h = new C5148c(c1113a);
        this.f14399d = new HashMap();
        this.f14401f = new C1153m();
        this.f14396a = new HashMap();
        this.f14398c = new C1146b(c1130a, c1130a2, c1130a3, this);
        this.f14400e = new C1145a(this.f14403h);
        this.f14402g = new C1161v();
        c1121h.mo1152a((C1120a) this);
    }

    public static void m10604a(String str, long j, C1208h c1208h) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" in ");
        stringBuilder.append(C1267d.m2997a(j));
        stringBuilder.append("ms, key: ");
        stringBuilder.append(c1208h);
        Log.v("Engine", stringBuilder.toString());
    }

    public final ReferenceQueue<C5152n<?>> m10605a() {
        if (this.f14404i == null) {
            this.f14404i = new ReferenceQueue();
            Looper.myQueue().addIdleHandler(new C1148e(this.f14399d, this.f14404i));
        }
        return this.f14404i;
    }

    public final void mo1172a(C5150j c5150j, C1208h c1208h) {
        C1273i.m3021a();
        if (c5150j.equals((C5150j) this.f14396a.get(c1208h))) {
            this.f14396a.remove(c1208h);
        }
    }

    public final void mo1173a(C1159s<?> c1159s) {
        C1273i.m3021a();
        this.f14402g.m2777a(c1159s);
    }

    public final void mo1174a(C1208h c1208h, C5152n<?> c5152n) {
        C1273i.m3021a();
        if (c5152n != null) {
            c5152n.f14438c = c1208h;
            c5152n.f14437b = this;
            if (c5152n.f14436a) {
                this.f14399d.put(c1208h, new C1149f(c1208h, c5152n, m10605a()));
            }
        }
        this.f14396a.remove(c1208h);
    }

    public final void mo1175b(C1208h c1208h, C5152n c5152n) {
        C1273i.m3021a();
        this.f14399d.remove(c1208h);
        if (c5152n.f14436a) {
            this.f14397b.mo1150a(c1208h, c5152n);
        } else {
            this.f14402g.m2777a(c5152n);
        }
    }
}
