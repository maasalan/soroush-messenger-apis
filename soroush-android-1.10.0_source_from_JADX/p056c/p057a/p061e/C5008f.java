package p056c.p057a.p061e;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p056c.C0925e;
import p056c.C0942p;
import p056c.C0946s;
import p056c.C0946s.C0945a;
import p056c.C0951u.C0950a;
import p056c.C0956y;
import p056c.C5047x;
import p056c.aa;
import p056c.ac;
import p056c.ac.C0916a;
import p056c.ad;
import p056c.p057a.C0866a;
import p056c.p057a.C0885c;
import p056c.p057a.p059b.C0873g;
import p056c.p057a.p060c.C0877c;
import p056c.p057a.p060c.C0880e;
import p056c.p057a.p060c.C0882i;
import p056c.p057a.p060c.C0883k;
import p056c.p057a.p060c.C5002h;
import p206d.C2272f;
import p206d.C2273l;
import p206d.C2277r;
import p206d.C2278s;
import p206d.C5685h;
import p206d.C6623c;

public final class C5008f implements C0877c {
    private static final C2272f f13964b = C2272f.m6191a("connection");
    private static final C2272f f13965c = C2272f.m6191a("host");
    private static final C2272f f13966d = C2272f.m6191a("keep-alive");
    private static final C2272f f13967e = C2272f.m6191a("proxy-connection");
    private static final C2272f f13968f = C2272f.m6191a("transfer-encoding");
    private static final C2272f f13969g = C2272f.m6191a("te");
    private static final C2272f f13970h = C2272f.m6191a("encoding");
    private static final C2272f f13971i = C2272f.m6191a("upgrade");
    private static final List<C2272f> f13972j = C0885c.m2095a(f13964b, f13965c, f13966d, f13967e, f13969g, f13968f, f13970h, f13971i, C0888c.f2666c, C0888c.f2667d, C0888c.f2668e, C0888c.f2669f);
    private static final List<C2272f> f13973k = C0885c.m2095a(f13964b, f13965c, f13966d, f13967e, f13969g, f13968f, f13970h, f13971i);
    final C0873g f13974a;
    private final C5047x f13975l;
    private final C0950a f13976m;
    private final C0895g f13977n;
    private C0898i f13978o;

    class C6437a extends C5685h {
        boolean f17601a = false;
        long f17602b = 0;
        final /* synthetic */ C5008f f17603c;

        C6437a(C5008f c5008f, C2278s c2278s) {
            this.f17603c = c5008f;
            super(c2278s);
        }

        private void m15347a(IOException iOException) {
            if (!this.f17601a) {
                this.f17601a = true;
                this.f17603c.f13974a.m2059a(false, this.f17603c, iOException);
            }
        }

        public final long mo944a(C6623c c6623c, long j) {
            try {
                long a = this.f15624d.mo944a(c6623c, j);
                if (a > 0) {
                    this.f17602b += a;
                }
                return a;
            } catch (IOException e) {
                m15347a(e);
                throw e;
            }
        }

        public final void close() {
            super.close();
            m15347a(null);
        }
    }

    public C5008f(C5047x c5047x, C0950a c0950a, C0873g c0873g, C0895g c0895g) {
        this.f13975l = c5047x;
        this.f13976m = c0950a;
        this.f13974a = c0873g;
        this.f13977n = c0895g;
    }

    public final C0916a mo964a(boolean z) {
        List c = this.f13978o.m2173c();
        C0945a c0945a = new C0945a();
        int size = c.size();
        C0945a c0945a2 = c0945a;
        C0883k c0883k = null;
        for (int i = 0; i < size; i++) {
            C0888c c0888c = (C0888c) c.get(i);
            if (c0888c != null) {
                C2272f c2272f = c0888c.f2670g;
                String a = c0888c.f2671h.mo2040a();
                if (c2272f.equals(C0888c.f2665b)) {
                    StringBuilder stringBuilder = new StringBuilder("HTTP/1.1 ");
                    stringBuilder.append(a);
                    c0883k = C0883k.m2082a(stringBuilder.toString());
                } else if (!f13973k.contains(c2272f)) {
                    C0866a.f2589a.mo1013a(c0945a2, c2272f.mo2040a(), a);
                }
            } else if (c0883k != null && c0883k.f2631b == 100) {
                c0945a2 = new C0945a();
                c0883k = null;
            }
        }
        if (c0883k == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        C0916a c0916a = new C0916a();
        c0916a.f2808b = C0956y.HTTP_2;
        c0916a.f2809c = c0883k.f2631b;
        c0916a.f2810d = c0883k.f2632c;
        c0916a = c0916a.m2256a(c0945a2.m2341a());
        return (z && C0866a.f2589a.mo1007a(c0916a) == 100) ? null : c0916a;
    }

    public final ad mo965a(ac acVar) {
        C0942p c0942p = this.f13974a.f2614f;
        C0925e c0925e = this.f13974a.f2613e;
        C0942p.m2333q();
        return new C5002h(acVar.m2260a("Content-Type"), C0880e.m2075a(acVar), C2273l.m6209a(new C6437a(this, this.f13978o.f2740g)));
    }

    public final C2277r mo966a(aa aaVar, long j) {
        return this.f13978o.m2175d();
    }

    public final void mo967a() {
        this.f13977n.f2724q.m2190b();
    }

    public final void mo968a(aa aaVar) {
        if (this.f13978o == null) {
            int i = 0;
            boolean z = aaVar.f2804d != null;
            C0946s c0946s = aaVar.f2803c;
            List arrayList = new ArrayList((c0946s.f2991a.length / 2) + 4);
            arrayList.add(new C0888c(C0888c.f2666c, aaVar.f2802b));
            arrayList.add(new C0888c(C0888c.f2667d, C0882i.m2081a(aaVar.f2801a)));
            String a = aaVar.m2246a("Host");
            if (a != null) {
                arrayList.add(new C0888c(C0888c.f2669f, a));
            }
            arrayList.add(new C0888c(C0888c.f2668e, aaVar.f2801a.f3007a));
            int length = c0946s.f2991a.length / 2;
            while (i < length) {
                C2272f a2 = C2272f.m6191a(c0946s.m2345a(i).toLowerCase(Locale.US));
                if (!f13972j.contains(a2)) {
                    arrayList.add(new C0888c(a2, c0946s.m2347b(i)));
                }
                i++;
            }
            this.f13978o = this.f13977n.m2145a(arrayList, z);
            this.f13978o.f2742i.mo2031a((long) this.f13976m.mo955d(), TimeUnit.MILLISECONDS);
            this.f13978o.f2743j.mo2031a((long) this.f13976m.mo956e(), TimeUnit.MILLISECONDS);
        }
    }

    public final void mo969b() {
        this.f13978o.m2175d().close();
    }

    public final void mo970c() {
        if (this.f13978o != null) {
            this.f13978o.m2171b(C0887b.CANCEL);
        }
    }
}
