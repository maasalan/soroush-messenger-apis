package p207e.p516a.p517a;

import com.google.p164b.C1940f;
import com.google.p164b.C1948t;
import java.io.Reader;
import p056c.ad;
import p056c.ad.C0917a;
import p207e.C2309d;

final class C5700c<T> implements C2309d<ad, T> {
    private final C1940f f15651a;
    private final C1948t<T> f15652b;

    C5700c(C1940f c1940f, C1948t<T> c1948t) {
        this.f15651a = c1940f;
        this.f15652b = c1948t;
    }

    private T m12746a(ad adVar) {
        C1940f c1940f = this.f15651a;
        Reader reader = adVar.f2836a;
        if (reader == null) {
            reader = new C0917a(adVar.mo959d(), adVar.m2271f());
            adVar.f2836a = reader;
        }
        try {
            T a = this.f15652b.mo1711a(c1940f.m5345a(reader));
            return a;
        } finally {
            adVar.close();
        }
    }
}
