package p207e;

import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import p207e.C2307c.C2306a;

final class C5706f extends C2306a {
    final Executor f15660a;

    static final class C5705a<T> implements C2305b<T> {
        final Executor f15658a;
        final C2305b<T> f15659b;

        C5705a(Executor executor, C2305b<T> c2305b) {
            this.f15658a = executor;
            this.f15659b = c2305b;
        }

        public final C2314k<T> mo2060a() {
            return this.f15659b.mo2060a();
        }

        public final C2305b<T> mo2061b() {
            return new C5705a(this.f15658a, this.f15659b.mo2061b());
        }

        public final /* synthetic */ Object clone() {
            return mo2061b();
        }
    }

    C5706f(Executor executor) {
        this.f15660a = executor;
    }

    public final C2307c<?, ?> mo2059a(Type type) {
        if (C2323n.m6307a(type) != C2305b.class) {
            return null;
        }
        type = C2323n.m6319e(type);
        return new C2307c<Object, C2305b<?>>(this) {
            final /* synthetic */ C5706f f15657b;

            public final /* synthetic */ Object mo2057a(C2305b c2305b) {
                return new C5705a(this.f15657b.f15660a, c2305b);
            }

            public final Type mo2058a() {
                return type;
            }
        };
    }
}
