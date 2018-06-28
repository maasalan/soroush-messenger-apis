package p056c.p057a.p509d;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy.Type;
import java.util.concurrent.TimeUnit;
import p056c.C0925e;
import p056c.C0942p;
import p056c.C0946s;
import p056c.C0946s.C0945a;
import p056c.C0949t;
import p056c.C5047x;
import p056c.aa;
import p056c.ac;
import p056c.ac.C0916a;
import p056c.ad;
import p056c.p057a.C0866a;
import p056c.p057a.C0885c;
import p056c.p057a.p059b.C0873g;
import p056c.p057a.p059b.C4998c;
import p056c.p057a.p060c.C0877c;
import p056c.p057a.p060c.C0880e;
import p056c.p057a.p060c.C0882i;
import p056c.p057a.p060c.C0883k;
import p056c.p057a.p060c.C5002h;
import p206d.C2273l;
import p206d.C2277r;
import p206d.C2278s;
import p206d.C2279t;
import p206d.C5682d;
import p206d.C5683e;
import p206d.C5686i;
import p206d.C6623c;

public final class C5007a implements C0877c {
    final C5047x f13958a;
    final C0873g f13959b;
    final C5683e f13960c;
    final C5682d f13961d;
    int f13962e = 0;
    private long f13963f = 262144;

    private abstract class C5004a implements C2278s {
        protected final C5686i f13947a;
        protected boolean f13948b;
        protected long f13949c;
        final /* synthetic */ C5007a f13950d;

        private C5004a(C5007a c5007a) {
            this.f13950d = c5007a;
            this.f13947a = new C5686i(this.f13950d.f13960c.mo945a());
            this.f13949c = 0;
        }

        public long mo944a(C6623c c6623c, long j) {
            try {
                long a = this.f13950d.f13960c.mo944a(c6623c, j);
                if (a > 0) {
                    this.f13949c += a;
                }
                return a;
            } catch (IOException e) {
                m10116a(false, e);
                throw e;
            }
        }

        public final C2279t mo945a() {
            return this.f13947a;
        }

        protected final void m10116a(boolean z, IOException iOException) {
            if (this.f13950d.f13962e != 6) {
                if (this.f13950d.f13962e != 5) {
                    StringBuilder stringBuilder = new StringBuilder("state: ");
                    stringBuilder.append(this.f13950d.f13962e);
                    throw new IllegalStateException(stringBuilder.toString());
                }
                C5007a.m10119a(this.f13947a);
                this.f13950d.f13962e = 6;
                if (this.f13950d.f13959b != null) {
                    this.f13950d.f13959b.m2059a(z ^ 1, this.f13950d, iOException);
                }
            }
        }
    }

    private final class C5005b implements C2277r {
        final /* synthetic */ C5007a f13951a;
        private final C5686i f13952b = new C5686i(this.f13951a.f13961d.mo960a());
        private boolean f13953c;

        C5005b(C5007a c5007a) {
            this.f13951a = c5007a;
        }

        public final C2279t mo960a() {
            return this.f13952b;
        }

        public final void a_(C6623c c6623c, long j) {
            if (this.f13953c) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                this.f13951a.f13961d.mo3146k(j);
                this.f13951a.f13961d.mo3125b("\r\n");
                this.f13951a.f13961d.a_(c6623c, j);
                this.f13951a.f13961d.mo3125b("\r\n");
            }
        }

        public final synchronized void close() {
            if (!this.f13953c) {
                this.f13953c = true;
                this.f13951a.f13961d.mo3125b("0\r\n\r\n");
                C5007a.m10119a(this.f13952b);
                this.f13951a.f13962e = 3;
            }
        }

        public final synchronized void flush() {
            if (!this.f13953c) {
                this.f13951a.f13961d.flush();
            }
        }
    }

    private final class C5006d implements C2277r {
        final /* synthetic */ C5007a f13954a;
        private final C5686i f13955b = new C5686i(this.f13954a.f13961d.mo960a());
        private boolean f13956c;
        private long f13957d;

        C5006d(C5007a c5007a, long j) {
            this.f13954a = c5007a;
            this.f13957d = j;
        }

        public final C2279t mo960a() {
            return this.f13955b;
        }

        public final void a_(C6623c c6623c, long j) {
            if (this.f13956c) {
                throw new IllegalStateException("closed");
            }
            C0885c.m2097a(c6623c.f18884b, j);
            if (j > this.f13957d) {
                StringBuilder stringBuilder = new StringBuilder("expected ");
                stringBuilder.append(this.f13957d);
                stringBuilder.append(" bytes but received ");
                stringBuilder.append(j);
                throw new ProtocolException(stringBuilder.toString());
            }
            this.f13954a.f13961d.a_(c6623c, j);
            this.f13957d -= j;
        }

        public final void close() {
            if (!this.f13956c) {
                this.f13956c = true;
                if (this.f13957d > 0) {
                    throw new ProtocolException("unexpected end of stream");
                }
                C5007a.m10119a(this.f13955b);
                this.f13954a.f13962e = 3;
            }
        }

        public final void flush() {
            if (!this.f13956c) {
                this.f13954a.f13961d.flush();
            }
        }
    }

    private class C6434c extends C5004a {
        final /* synthetic */ C5007a f17593e;
        private final C0949t f17594f;
        private long f17595g = -1;
        private boolean f17596h = true;

        C6434c(C5007a c5007a, C0949t c0949t) {
            this.f17593e = c5007a;
            super();
            this.f17594f = c0949t;
        }

        public final long mo944a(C6623c c6623c, long j) {
            if (j < 0) {
                StringBuilder stringBuilder = new StringBuilder("byteCount < 0: ");
                stringBuilder.append(j);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (this.b) {
                throw new IllegalStateException("closed");
            } else if (!this.f17596h) {
                return -1;
            } else {
                if (this.f17595g == 0 || this.f17595g == -1) {
                    if (this.f17595g != -1) {
                        this.f17593e.f13960c.mo3148n();
                    }
                    try {
                        this.f17595g = this.f17593e.f13960c.mo3145k();
                        String trim = this.f17593e.f13960c.mo3148n().trim();
                        if (this.f17595g >= 0) {
                            if (trim.isEmpty() || trim.startsWith(";")) {
                                if (this.f17595g == 0) {
                                    this.f17596h = false;
                                    C0880e.m2077a(this.f17593e.f13958a.f14090k, this.f17594f, this.f17593e.m10130d());
                                    m10116a(true, null);
                                }
                                if (!this.f17596h) {
                                    return -1;
                                }
                            }
                        }
                        StringBuilder stringBuilder2 = new StringBuilder("expected chunk size and optional extensions but was \"");
                        stringBuilder2.append(this.f17595g);
                        stringBuilder2.append(trim);
                        stringBuilder2.append("\"");
                        throw new ProtocolException(stringBuilder2.toString());
                    } catch (NumberFormatException e) {
                        throw new ProtocolException(e.getMessage());
                    }
                }
                long a = super.mo944a(c6623c, Math.min(j, this.f17595g));
                if (a == -1) {
                    IOException protocolException = new ProtocolException("unexpected end of stream");
                    m10116a(false, protocolException);
                    throw protocolException;
                }
                this.f17595g -= a;
                return a;
            }
        }

        public final void close() {
            if (!this.b) {
                if (this.f17596h && !C0885c.m2101a((C2278s) this, TimeUnit.MILLISECONDS)) {
                    m10116a(false, null);
                }
                this.b = true;
            }
        }
    }

    private class C6435e extends C5004a {
        final /* synthetic */ C5007a f17597e;
        private long f17598f;

        C6435e(C5007a c5007a, long j) {
            this.f17597e = c5007a;
            super();
            this.f17598f = j;
            if (this.f17598f == 0) {
                m10116a(true, null);
            }
        }

        public final long mo944a(C6623c c6623c, long j) {
            if (j < 0) {
                StringBuilder stringBuilder = new StringBuilder("byteCount < 0: ");
                stringBuilder.append(j);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (this.b) {
                throw new IllegalStateException("closed");
            } else if (this.f17598f == 0) {
                return -1;
            } else {
                long a = super.mo944a(c6623c, Math.min(this.f17598f, j));
                if (a == -1) {
                    IOException protocolException = new ProtocolException("unexpected end of stream");
                    m10116a(false, protocolException);
                    throw protocolException;
                }
                this.f17598f -= a;
                if (this.f17598f == 0) {
                    m10116a(true, null);
                }
                return a;
            }
        }

        public final void close() {
            if (!this.b) {
                if (!(this.f17598f == 0 || C0885c.m2101a((C2278s) this, TimeUnit.MILLISECONDS))) {
                    m10116a(false, null);
                }
                this.b = true;
            }
        }
    }

    private class C6436f extends C5004a {
        final /* synthetic */ C5007a f17599e;
        private boolean f17600f;

        C6436f(C5007a c5007a) {
            this.f17599e = c5007a;
            super();
        }

        public final long mo944a(C6623c c6623c, long j) {
            if (j < 0) {
                StringBuilder stringBuilder = new StringBuilder("byteCount < 0: ");
                stringBuilder.append(j);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (this.b) {
                throw new IllegalStateException("closed");
            } else if (this.f17600f) {
                return -1;
            } else {
                long a = super.mo944a(c6623c, j);
                if (a != -1) {
                    return a;
                }
                this.f17600f = true;
                m10116a(true, null);
                return -1;
            }
        }

        public final void close() {
            if (!this.b) {
                if (!this.f17600f) {
                    m10116a(false, null);
                }
                this.b = true;
            }
        }
    }

    public C5007a(C5047x c5047x, C0873g c0873g, C5683e c5683e, C5682d c5682d) {
        this.f13958a = c5047x;
        this.f13959b = c0873g;
        this.f13960c = c5683e;
        this.f13961d = c5682d;
    }

    static void m10119a(C5686i c5686i) {
        C2279t c2279t = c5686i.f15625a;
        C2279t c2279t2 = C2279t.f7572c;
        if (c2279t2 == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        c5686i.f15625a = c2279t2;
        c2279t.s_();
        c2279t.mo2033d();
    }

    private String m10120e() {
        String e = this.f13960c.mo3134e(this.f13963f);
        this.f13963f -= (long) e.length();
        return e;
    }

    public final C0916a mo964a(boolean z) {
        if (this.f13962e == 1 || this.f13962e == 3) {
            try {
                C0883k a = C0883k.m2082a(m10120e());
                C0916a c0916a = new C0916a();
                c0916a.f2808b = a.f2630a;
                c0916a.f2809c = a.f2631b;
                c0916a.f2810d = a.f2632c;
                c0916a = c0916a.m2256a(m10130d());
                if (z && a.f2631b == 100) {
                    return null;
                }
                if (a.f2631b == 100) {
                    this.f13962e = 3;
                    return c0916a;
                }
                this.f13962e = 4;
                return c0916a;
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder("unexpected end of stream on ");
                stringBuilder.append(this.f13959b);
                IOException iOException = new IOException(stringBuilder.toString());
                iOException.initCause(e);
                throw iOException;
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder("state: ");
        stringBuilder2.append(this.f13962e);
        throw new IllegalStateException(stringBuilder2.toString());
    }

    public final ad mo965a(ac acVar) {
        C0942p c0942p = this.f13959b.f2614f;
        C0925e c0925e = this.f13959b.f2613e;
        C0942p.m2333q();
        String a = acVar.m2260a("Content-Type");
        if (!C0880e.m2079b(acVar)) {
            return new C5002h(a, 0, C2273l.m6209a(m10124a(0)));
        }
        if ("chunked".equalsIgnoreCase(acVar.m2260a("Transfer-Encoding"))) {
            C0949t c0949t = acVar.f2819a.f2801a;
            if (this.f13962e != 4) {
                StringBuilder stringBuilder = new StringBuilder("state: ");
                stringBuilder.append(this.f13962e);
                throw new IllegalStateException(stringBuilder.toString());
            }
            this.f13962e = 5;
            return new C5002h(a, -1, C2273l.m6209a(new C6434c(this, c0949t)));
        }
        long a2 = C0880e.m2075a(acVar);
        if (a2 != -1) {
            return new C5002h(a, a2, C2273l.m6209a(m10124a(a2)));
        }
        if (this.f13962e != 4) {
            stringBuilder = new StringBuilder("state: ");
            stringBuilder.append(this.f13962e);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (this.f13959b == null) {
            throw new IllegalStateException("streamAllocation == null");
        } else {
            this.f13962e = 5;
            this.f13959b.m2062d();
            return new C5002h(a, -1, C2273l.m6209a(new C6436f(this)));
        }
    }

    public final C2277r mo966a(aa aaVar, long j) {
        StringBuilder stringBuilder;
        if ("chunked".equalsIgnoreCase(aaVar.m2246a("Transfer-Encoding"))) {
            if (this.f13962e != 1) {
                stringBuilder = new StringBuilder("state: ");
                stringBuilder.append(this.f13962e);
                throw new IllegalStateException(stringBuilder.toString());
            }
            this.f13962e = 2;
            return new C5005b(this);
        } else if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.f13962e != 1) {
            stringBuilder = new StringBuilder("state: ");
            stringBuilder.append(this.f13962e);
            throw new IllegalStateException(stringBuilder.toString());
        } else {
            this.f13962e = 2;
            return new C5006d(this, j);
        }
    }

    public final C2278s m10124a(long j) {
        if (this.f13962e != 4) {
            StringBuilder stringBuilder = new StringBuilder("state: ");
            stringBuilder.append(this.f13962e);
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.f13962e = 5;
        return new C6435e(this, j);
    }

    public final void mo967a() {
        this.f13961d.flush();
    }

    public final void mo968a(aa aaVar) {
        Type type = this.f13959b.m2060b().f13911a.f2838b.type();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(aaVar.f2802b);
        stringBuilder.append(' ');
        Object obj = (aaVar.f2801a.m2371c() || type != Type.HTTP) ? null : 1;
        if (obj != null) {
            stringBuilder.append(aaVar.f2801a);
        } else {
            stringBuilder.append(C0882i.m2081a(aaVar.f2801a));
        }
        stringBuilder.append(" HTTP/1.1");
        m10127a(aaVar.f2803c, stringBuilder.toString());
    }

    public final void m10127a(C0946s c0946s, String str) {
        if (this.f13962e != 0) {
            StringBuilder stringBuilder = new StringBuilder("state: ");
            stringBuilder.append(this.f13962e);
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.f13961d.mo3125b(str).mo3125b("\r\n");
        int length = c0946s.f2991a.length / 2;
        for (int i = 0; i < length; i++) {
            this.f13961d.mo3125b(c0946s.m2345a(i)).mo3125b(": ").mo3125b(c0946s.m2347b(i)).mo3125b("\r\n");
        }
        this.f13961d.mo3125b("\r\n");
        this.f13962e = 1;
    }

    public final void mo969b() {
        this.f13961d.flush();
    }

    public final void mo970c() {
        C4998c b = this.f13959b.m2060b();
        if (b != null) {
            C0885c.m2099a(b.f13912b);
        }
    }

    public final C0946s m10130d() {
        C0945a c0945a = new C0945a();
        while (true) {
            String e = m10120e();
            if (e.length() == 0) {
                return c0945a.m2341a();
            }
            C0866a.f2589a.mo1012a(c0945a, e);
        }
    }
}
