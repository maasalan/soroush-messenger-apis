package p050b.p051a.p052a;

import java.io.OutputStream;
import p050b.p051a.C0817g;
import p050b.p051a.C0827p;

public final class C0796c {
    public OutputStream f2397a;
    private C0827p f2398b;

    public C0796c(OutputStream outputStream, C0827p c0827p) {
        this.f2397a = outputStream;
        this.f2398b = c0827p;
    }

    public final void m1739a(int i) {
        byte[] bArr = new byte[2];
        C0817g.m1833a(i, bArr, 0);
        this.f2397a.write(bArr);
    }
}
