package com.p085c.p086a.p089c.p097c;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.p085c.p086a.p109i.C1268e;
import com.p085c.p086a.p109i.C1273i;
import java.util.Queue;

public final class C1171l<A, B> {
    public final C1268e<C1170a<A>, B> f3735a;

    static final class C1170a<A> {
        private static final Queue<C1170a<?>> f3731a = C1273i.m3020a(0);
        private int f3732b;
        private int f3733c;
        private A f3734d;

        private C1170a() {
        }

        public static <A> C1170a<A> m2792a(A a) {
            C1170a<A> c1170a;
            synchronized (f3731a) {
                c1170a = (C1170a) f3731a.poll();
            }
            if (c1170a == null) {
                c1170a = new C1170a();
            }
            c1170a.f3734d = a;
            c1170a.f3733c = 0;
            c1170a.f3732b = 0;
            return c1170a;
        }

        public final void m2793a() {
            synchronized (f3731a) {
                f3731a.offer(this);
            }
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C1170a) {
                C1170a c1170a = (C1170a) obj;
                if (this.f3733c == c1170a.f3733c && this.f3732b == c1170a.f3732b && this.f3734d.equals(c1170a.f3734d)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (31 * ((this.f3732b * 31) + this.f3733c)) + this.f3734d.hashCode();
        }
    }

    public C1171l() {
        this(Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
    }

    public C1171l(int i) {
        this.f3735a = new C1268e<C1170a<A>, B>(this, i) {
            final /* synthetic */ C1171l f14519a;

            protected final /* bridge */ /* synthetic */ void mo1153a(Object obj, Object obj2) {
                ((C1170a) obj).m2793a();
            }
        };
    }

    public final B m2794a(A a) {
        Object a2 = C1170a.m2792a(a);
        B b = this.f3735a.m3005b(a2);
        a2.m2793a();
        return b;
    }
}
