package p207e;

import java.lang.reflect.Type;
import p207e.C2307c.C2306a;

final class C5703e extends C2306a {
    static final C2306a f15655a = new C5703e();

    C5703e() {
    }

    public final C2307c<?, ?> mo2059a(Type type) {
        if (C2323n.m6307a(type) != C2305b.class) {
            return null;
        }
        type = C2323n.m6319e(type);
        return new C2307c<Object, C2305b<?>>(this) {
            final /* synthetic */ C5703e f15654b;

            public final /* bridge */ /* synthetic */ Object mo2057a(C2305b c2305b) {
                return c2305b;
            }

            public final Type mo2058a() {
                return type;
            }
        };
    }
}
