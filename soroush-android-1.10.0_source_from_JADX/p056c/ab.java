package p056c;

import java.nio.charset.Charset;
import p056c.p057a.C0885c;
import p206d.C2272f;
import p206d.C5682d;

public abstract class ab {

    class C50341 extends ab {
        final /* synthetic */ C0952v f14048a;
        final /* synthetic */ C2272f f14049b;

        C50341(C0952v c0952v, C2272f c2272f) {
            this.f14048a = c0952v;
            this.f14049b = c2272f;
        }

        public final C0952v mo998a() {
            return this.f14048a;
        }

        public final void mo999a(C5682d c5682d) {
            c5682d.mo3128c(this.f14049b);
        }

        public final long mo1000b() {
            return (long) this.f14049b.mo2050g();
        }
    }

    class C50352 extends ab {
        final /* synthetic */ C0952v f14050a;
        final /* synthetic */ int f14051b;
        final /* synthetic */ byte[] f14052c;
        final /* synthetic */ int f14053d = 0;

        C50352(C0952v c0952v, int i, byte[] bArr) {
            this.f14050a = c0952v;
            this.f14051b = i;
            this.f14052c = bArr;
        }

        public final C0952v mo998a() {
            return this.f14050a;
        }

        public final void mo999a(C5682d c5682d) {
            c5682d.mo3130c(this.f14052c, this.f14053d, this.f14051b);
        }

        public final long mo1000b() {
            return (long) this.f14051b;
        }
    }

    public static ab m2248a(C0952v c0952v, C2272f c2272f) {
        return new C50341(c0952v, c2272f);
    }

    public static ab m2249a(C0952v c0952v, String str) {
        Charset charset = C0885c.f2637e;
        if (c0952v != null) {
            charset = c0952v.m2386a(null);
            if (charset == null) {
                charset = C0885c.f2637e;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(c0952v);
                stringBuilder.append("; charset=utf-8");
                c0952v = C0952v.m2385a(stringBuilder.toString());
            }
        }
        return ab.m2250a(c0952v, str.getBytes(charset));
    }

    public static ab m2250a(C0952v c0952v, byte[] bArr) {
        int length = bArr.length;
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        C0885c.m2097a((long) bArr.length, (long) length);
        return new C50352(c0952v, length, bArr);
    }

    public abstract C0952v mo998a();

    public abstract void mo999a(C5682d c5682d);

    public long mo1000b() {
        return -1;
    }
}
