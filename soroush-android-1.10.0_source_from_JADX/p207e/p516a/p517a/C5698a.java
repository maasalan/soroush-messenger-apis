package p207e.p516a.p517a;

import com.google.p164b.C1940f;
import com.google.p164b.p169c.C1933a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p056c.ab;
import p056c.ad;
import p207e.C2309d;
import p207e.C2309d.C2308a;

public final class C5698a extends C2308a {
    private final C1940f f15646a;

    private C5698a(C1940f c1940f) {
        this.f15646a = c1940f;
    }

    public static C5698a m12742a() {
        return new C5698a(new C1940f());
    }

    public final C2309d<?, ab> mo2055a(Type type) {
        return new C5699b(this.f15646a, this.f15646a.m5347a(C1933a.m5291a(type)));
    }

    public final C2309d<ad, ?> mo2056a(Type type, Annotation[] annotationArr) {
        return new C5700c(this.f15646a, this.f15646a.m5347a(C1933a.m5291a(type)));
    }
}
