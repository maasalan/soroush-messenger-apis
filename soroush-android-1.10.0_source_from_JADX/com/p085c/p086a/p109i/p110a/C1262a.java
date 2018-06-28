package com.p085c.p086a.p109i.p110a;

import android.support.v4.p038g.C0480k.C0479a;
import android.support.v4.p038g.C0480k.C4816b;
import android.support.v4.p038g.C0480k.C6367c;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class C1262a {
    private static final C1261d<Object> f3964a = new C52781();

    public interface C1259a<T> {
        T mo1156a();
    }

    public interface C1260c {
        C1263b b_();
    }

    public interface C1261d<T> {
        void mo1246a(T t);
    }

    static class C52781 implements C1261d<Object> {
        C52781() {
        }

        public final void mo1246a(Object obj) {
        }
    }

    static class C52792 implements C1259a<List<T>> {
        C52792() {
        }

        public final /* synthetic */ Object mo1156a() {
            return new ArrayList();
        }
    }

    static class C52803 implements C1261d<List<T>> {
        C52803() {
        }

        public final /* synthetic */ void mo1246a(Object obj) {
            ((List) obj).clear();
        }
    }

    private static final class C5281b<T> implements C0479a<T> {
        private final C1259a<T> f14641a;
        private final C1261d<T> f14642b;
        private final C0479a<T> f14643c;

        C5281b(C0479a<T> c0479a, C1259a<T> c1259a, C1261d<T> c1261d) {
            this.f14643c = c0479a;
            this.f14641a = c1259a;
            this.f14642b = c1261d;
        }

        public final T mo308a() {
            T a = this.f14643c.mo308a();
            if (a == null) {
                a = this.f14641a.mo1156a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder stringBuilder = new StringBuilder("Created new ");
                    stringBuilder.append(a.getClass());
                    Log.v("FactoryPools", stringBuilder.toString());
                }
            }
            if (a instanceof C1260c) {
                ((C1260c) a).b_().mo1248a(false);
            }
            return a;
        }

        public final boolean mo309a(T t) {
            if (t instanceof C1260c) {
                ((C1260c) t).b_().mo1248a(true);
            }
            this.f14642b.mo1246a(t);
            return this.f14643c.mo309a(t);
        }
    }

    public static <T> C0479a<List<T>> m2982a() {
        return C1262a.m2985a(new C6367c(20), new C52792(), new C52803());
    }

    public static <T extends C1260c> C0479a<T> m2983a(int i, C1259a<T> c1259a) {
        return C1262a.m2984a(new C6367c(i), (C1259a) c1259a);
    }

    private static <T extends C1260c> C0479a<T> m2984a(C0479a<T> c0479a, C1259a<T> c1259a) {
        return C1262a.m2985a(c0479a, c1259a, f3964a);
    }

    private static <T> C0479a<T> m2985a(C0479a<T> c0479a, C1259a<T> c1259a, C1261d<T> c1261d) {
        return new C5281b(c0479a, c1259a, c1261d);
    }

    public static <T extends C1260c> C0479a<T> m2986a(C1259a<T> c1259a) {
        return C1262a.m2984a(new C4816b(150), (C1259a) c1259a);
    }
}
