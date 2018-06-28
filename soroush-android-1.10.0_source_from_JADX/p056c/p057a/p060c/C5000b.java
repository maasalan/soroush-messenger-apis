package p056c.p057a.p060c;

import java.net.ProtocolException;
import org.jivesoftware.smackx.bytestreams.ibb.packet.Close;
import p056c.C0942p;
import p056c.C0951u;
import p056c.C0951u.C0950a;
import p056c.aa;
import p056c.ac;
import p056c.ac.C0916a;
import p056c.ad;
import p056c.p057a.C0885c;
import p056c.p057a.p059b.C0873g;
import p056c.p057a.p059b.C4998c;
import p206d.C2273l;
import p206d.C2277r;
import p206d.C5682d;
import p206d.C5684g;
import p206d.C6623c;

public final class C5000b implements C0951u {
    private final boolean f13926a;

    static final class C6433a extends C5684g {
        long f17592a;

        C6433a(C2277r c2277r) {
            super(c2277r);
        }

        public final void a_(C6623c c6623c, long j) {
            super.a_(c6623c, j);
            this.f17592a += j;
        }
    }

    public C5000b(boolean z) {
        this.f13926a = z;
    }

    public final ac mo947a(C0950a c0950a) {
        C0916a b;
        ad adVar;
        C5001g c5001g = (C5001g) c0950a;
        C0877c c0877c = c5001g.f13928b;
        C0873g c0873g = c5001g.f13927a;
        C4998c c4998c = c5001g.f13929c;
        aa aaVar = c5001g.f13930d;
        long currentTimeMillis = System.currentTimeMillis();
        C0942p.m2327k();
        c0877c.mo968a(aaVar);
        C0942p.m2328l();
        C0916a c0916a = null;
        if (C0881f.m2080a(aaVar.f2802b) && aaVar.f2804d != null) {
            if ("100-continue".equalsIgnoreCase(aaVar.m2246a("Expect"))) {
                c0877c.mo967a();
                C0942p.m2331o();
                c0916a = c0877c.mo964a(true);
            }
            if (c0916a == null) {
                C0942p.m2329m();
                C5682d a = C2273l.m6208a(new C6433a(c0877c.mo966a(aaVar, aaVar.f2804d.mo1000b())));
                aaVar.f2804d.mo999a(a);
                a.close();
                C0942p.m2330n();
            } else if (!c4998c.m10096b()) {
                c0873g.m2062d();
            }
        }
        c0877c.mo969b();
        if (c0916a == null) {
            C0942p.m2331o();
            c0916a = c0877c.mo964a(false);
        }
        c0916a.f2807a = aaVar;
        c0916a.f2811e = c0873g.m2060b().f13914d;
        c0916a.f2817k = currentTimeMillis;
        c0916a.f2818l = System.currentTimeMillis();
        ac a2 = c0916a.m2258a();
        int i = a2.f2821c;
        if (i == 100) {
            C0916a a3 = c0877c.mo964a(false);
            a3.f2807a = aaVar;
            a3.f2811e = c0873g.m2060b().f13914d;
            a3.f2817k = currentTimeMillis;
            a3.f2818l = System.currentTimeMillis();
            a2 = a3.m2258a();
            i = a2.f2821c;
        }
        C0942p.m2332p();
        if (this.f13926a && i == 101) {
            b = a2.m2262b();
            adVar = C0885c.f2635c;
        } else {
            b = a2.m2262b();
            adVar = c0877c.mo965a(a2);
        }
        b.f2813g = adVar;
        ac a4 = b.m2258a();
        if (Close.ELEMENT.equalsIgnoreCase(a4.f2819a.m2246a("Connection")) || Close.ELEMENT.equalsIgnoreCase(a4.m2260a("Connection"))) {
            c0873g.m2062d();
        }
        if ((i != 204 && i != 205) || a4.f2825g.mo958b() <= 0) {
            return a4;
        }
        StringBuilder stringBuilder = new StringBuilder("HTTP ");
        stringBuilder.append(i);
        stringBuilder.append(" had non-zero Content-Length: ");
        stringBuilder.append(a4.f2825g.mo958b());
        throw new ProtocolException(stringBuilder.toString());
    }
}
