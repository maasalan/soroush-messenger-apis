package p207e.p516a.p517a;

import com.google.p164b.C1940f;
import com.google.p164b.C1948t;
import com.google.p164b.p170d.C1937c;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import org.jivesoftware.smack.util.StringUtils;
import p056c.C0952v;
import p056c.ab;
import p206d.C6623c;
import p206d.C6623c.C22701;
import p207e.C2309d;

final class C5699b<T> implements C2309d<T, ab> {
    private static final C0952v f15647a = C0952v.m2385a("application/json; charset=UTF-8");
    private static final Charset f15648b = Charset.forName(StringUtils.UTF8);
    private final C1940f f15649c;
    private final C1948t<T> f15650d;

    C5699b(C1940f c1940f, C1948t<T> c1948t) {
        this.f15649c = c1940f;
        this.f15650d = c1948t;
    }

    public final /* synthetic */ Object mo2054a(Object obj) {
        C6623c c6623c = new C6623c();
        C1937c a = this.f15649c.m5346a(new OutputStreamWriter(new C22701(c6623c), f15648b));
        this.f15650d.mo1712a(a, obj);
        a.close();
        return ab.m2248a(f15647a, c6623c.m17067l());
    }
}
