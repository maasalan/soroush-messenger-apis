package p056c;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import p056c.p057a.C0885c;
import p206d.C5683e;
import p206d.C6623c;

public abstract class ad implements Closeable {
    public Reader f2836a;

    static final class C0917a extends Reader {
        private final C5683e f2832a;
        private final Charset f2833b;
        private boolean f2834c;
        private Reader f2835d;

        public C0917a(C5683e c5683e, Charset charset) {
            this.f2832a = c5683e;
            this.f2833b = charset;
        }

        public final void close() {
            this.f2834c = true;
            if (this.f2835d != null) {
                this.f2835d.close();
            } else {
                this.f2832a.close();
            }
        }

        public final int read(char[] cArr, int i, int i2) {
            if (this.f2834c) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.f2835d;
            if (reader == null) {
                Reader inputStreamReader = new InputStreamReader(this.f2832a.mo3133d(), C0885c.m2093a(this.f2832a, this.f2833b));
                this.f2835d = inputStreamReader;
                reader = inputStreamReader;
            }
            return reader.read(cArr, i, i2);
        }
    }

    class C50361 extends ad {
        final /* synthetic */ C0952v f14054b;
        final /* synthetic */ long f14055c;
        final /* synthetic */ C5683e f14056d;

        C50361(C0952v c0952v, long j, C5683e c5683e) {
            this.f14054b = c0952v;
            this.f14055c = j;
            this.f14056d = c5683e;
        }

        public final C0952v mo957a() {
            return this.f14054b;
        }

        public final long mo958b() {
            return this.f14055c;
        }

        public final C5683e mo959d() {
            return this.f14056d;
        }
    }

    public static ad m2264a(C0952v c0952v, long j, C5683e c5683e) {
        if (c5683e != null) {
            return new C50361(c0952v, j, c5683e);
        }
        throw new NullPointerException("source == null");
    }

    public static ad m2265a(byte[] bArr) {
        return ad.m2264a(null, (long) bArr.length, new C6623c().m17034b(bArr));
    }

    public abstract C0952v mo957a();

    public abstract long mo958b();

    public final InputStream m2268c() {
        return mo959d().mo3133d();
    }

    public void close() {
        C0885c.m2098a(mo959d());
    }

    public abstract C5683e mo959d();

    public final String m2270e() {
        Closeable d = mo959d();
        try {
            String a = d.mo3121a(C0885c.m2093a((C5683e) d, m2271f()));
            return a;
        } finally {
            C0885c.m2098a(d);
        }
    }

    public final Charset m2271f() {
        C0952v a = mo957a();
        return a != null ? a.m2386a(C0885c.f2637e) : C0885c.f2637e;
    }
}
