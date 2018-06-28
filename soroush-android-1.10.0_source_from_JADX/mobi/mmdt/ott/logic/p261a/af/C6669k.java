package mobi.mmdt.ott.logic.p261a.af;

import com.p072b.p073a.p074a.C1073q;
import java.io.File;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.af.p270a.C2603h;
import mobi.mmdt.ott.logic.p261a.p287g.p293b.C2678d;
import mobi.mmdt.ott.logic.p360l.p361a.C2841c;
import mobi.mmdt.ott.logic.p360l.p361a.C5990d;
import mobi.mmdt.ott.logic.p360l.p361a.C5992f;
import mobi.mmdt.ott.logic.p360l.p361a.C5993g;
import mobi.mmdt.ott.logic.p360l.p361a.C5994h;
import mobi.mmdt.ott.logic.p360l.p361a.C5995i;
import mobi.mmdt.ott.logic.p370r.C2896b;
import mobi.mmdt.ott.logic.p370r.C2897c;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2968f;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p386h.C2983b;
import mobi.mmdt.ott.provider.p386h.C2984c;
import mobi.mmdt.ott.provider.p386h.C2987i;
import mobi.mmdt.ott.provider.p386h.C2988j;
import mobi.mmdt.ott.provider.p390l.C3004f;

public final class C6669k extends C5891a {
    private long f18969a;
    private long f18970b;
    private int f18971c;
    private boolean f18972d;
    private C2896b f18973e;
    private String f18974f;
    private String f18975g;
    private String f18976h;
    private String f18977i;
    private String f18978j;
    private String f18979k;
    private C2973m f18980l;
    private String f18981m;
    private C2988j f18982n;
    private C2841c f18983o;
    private String f18984p;
    private C2983b f18985q;
    private boolean f18986r = false;
    private int f18987s;

    class C59031 implements C2896b {
        final /* synthetic */ C6669k f16066a;

        C59031(C6669k c6669k) {
            this.f16066a = c6669k;
        }

        public final void mo2169a() {
        }

        public final void mo2170a(int i) {
        }

        public final void mo2171a(int i, Object obj) {
        }

        public final void mo2172a(String str, String str2, String str3) {
        }

        public final void mo2173b() {
        }

        public final void mo2174c() {
            C2897c.m7264a().m7266a(this.f16066a.f18970b, false, null);
        }
    }

    class C59042 implements C2896b {
        final /* synthetic */ C6669k f16067a;

        C59042(C6669k c6669k) {
            this.f16067a = c6669k;
        }

        public final void mo2169a() {
        }

        public final void mo2170a(int i) {
        }

        public final void mo2171a(int i, Object obj) {
        }

        public final void mo2172a(String str, String str2, String str3) {
            C59042 c59042 = this;
            long a = C2778b.m7093a();
            C2480b.m6742f("ReTransmitFileJob upload finished");
            try {
                C2841c l;
                String c;
                String d;
                String e;
                Long valueOf;
                String str4;
                String g;
                String h;
                int i;
                int i2;
                int i3;
                int i4;
                switch (c59042.f16067a.f18982n) {
                    case IMAGE:
                        l = c59042.f16067a.f18983o;
                        c = c59042.f16067a.f18975g;
                        d = c59042.f16067a.f18976h;
                        e = c59042.f16067a.f18977i;
                        valueOf = Long.valueOf(c59042.f16067a.f18985q.f9336e);
                        str4 = c59042.f16067a.f18985q.f9335d;
                        g = c59042.f16067a.f18978j;
                        h = c59042.f16067a.f18984p;
                        i = c59042.f16067a.f18985q.f9345n;
                        i2 = c59042.f16067a.f18985q.f9346o;
                        i3 = i2;
                        i4 = i;
                        l.mo2195a(c, d, e, str3, str, str2, valueOf, str4, g, a, h, i4, i3, c59042.f16067a.f18979k, C2678d.m7061a(c59042.f16067a.f18980l), c59042.f16067a.f18981m);
                        return;
                    case GIF:
                        l = c59042.f16067a.f18983o;
                        c = c59042.f16067a.f18975g;
                        d = c59042.f16067a.f18976h;
                        e = c59042.f16067a.f18977i;
                        valueOf = Long.valueOf(c59042.f16067a.f18985q.f9336e);
                        str4 = c59042.f16067a.f18985q.f9335d;
                        g = c59042.f16067a.f18978j;
                        h = c59042.f16067a.f18984p;
                        i = c59042.f16067a.f18985q.f9345n;
                        i2 = c59042.f16067a.f18985q.f9346o;
                        i3 = i2;
                        i4 = i;
                        l.mo2197b(c, d, e, str3, str, str2, valueOf, str4, g, a, h, i4, i3, c59042.f16067a.f18979k, C2678d.m7061a(c59042.f16067a.f18980l), c59042.f16067a.f18981m);
                        return;
                    case VIDEO:
                        l = c59042.f16067a.f18983o;
                        c = c59042.f16067a.f18975g;
                        d = c59042.f16067a.f18976h;
                        e = c59042.f16067a.f18977i;
                        valueOf = Long.valueOf(c59042.f16067a.f18985q.f9336e);
                        str4 = c59042.f16067a.f18985q.f9335d;
                        Integer valueOf2 = Integer.valueOf(c59042.f16067a.f18971c);
                        String g2 = c59042.f16067a.f18978j;
                        h = c59042.f16067a.f18984p;
                        i2 = c59042.f16067a.f18985q.f9345n;
                        int i5 = c59042.f16067a.f18985q.f9346o;
                        int i6 = i5;
                        i3 = i2;
                        l.mo2194a(c, d, e, str3, str, str2, valueOf, str4, valueOf2, g2, a, h, i3, i6, c59042.f16067a.f18979k, C2678d.m7061a(c59042.f16067a.f18980l), c59042.f16067a.f18981m);
                        return;
                    case PUSH_TO_TALK:
                        c59042.f16067a.f18983o.mo2190a(c59042.f16067a.f18975g, c59042.f16067a.f18976h, str3, str, Long.valueOf(c59042.f16067a.f18985q.f9336e), c59042.f16067a.f18985q.f9335d, Integer.valueOf(c59042.f16067a.f18971c), c59042.f16067a.f18978j, a, c59042.f16067a.f18984p, c59042.f16067a.f18979k, C2678d.m7061a(c59042.f16067a.f18980l), c59042.f16067a.f18981m);
                        return;
                    case AUDIO:
                        c59042.f16067a.f18983o.mo2190a(c59042.f16067a.f18975g, c59042.f16067a.f18976h, str3, str, Long.valueOf(c59042.f16067a.f18985q.f9336e), c59042.f16067a.f18985q.f9335d, Integer.valueOf(c59042.f16067a.f18971c), c59042.f16067a.f18978j, a, c59042.f16067a.f18984p, c59042.f16067a.f18979k, C2678d.m7061a(c59042.f16067a.f18980l), c59042.f16067a.f18981m);
                        return;
                    case OTHER:
                        c59042.f16067a.f18983o.mo2192a(c59042.f16067a.f18975g, c59042.f16067a.f18976h, c59042.f16067a.f18977i, str3, str, Long.valueOf(c59042.f16067a.f18985q.f9336e), c59042.f16067a.f18985q.f9335d, c59042.f16067a.f18978j, a, c59042.f16067a.f18984p, c59042.f16067a.f18979k, C2678d.m7061a(c59042.f16067a.f18980l), c59042.f16067a.f18981m);
                        return;
                    default:
                        return;
                }
            } catch (Throwable e2) {
                C2480b.m6737b("NotConnectedException", e2);
            }
        }

        public final void mo2173b() {
        }

        public final void mo2174c() {
        }
    }

    public C6669k(long j, boolean z) {
        super(C2683h.f8621c);
        this.f18969a = j;
        this.f18972d = z;
    }

    public final void onAdded() {
        int i;
        C2841c a;
        C2968f a2 = C2966b.m7399a(this.f18969a);
        this.f18985q = C2984c.m7461a(a2.f9216l.longValue());
        switch (a2.f9214j) {
            case CHANNEL:
            case CHANNEL_REPLY:
            case CHANNEL_DIRECT:
                i = C2603h.f8492c;
                break;
            case GROUP:
                i = C2603h.f8490a;
                break;
            default:
                i = C2603h.f8491b;
                break;
        }
        this.f18987s = i;
        if (!((a2.f9212h.equals(C2971k.PENDING) && a2.f9212h.equals(C2971k.PENDING_RETRANSMIT)) || new File(this.f18985q.f9334c.getPath()).exists())) {
            this.f18972d = true;
        }
        C2984c.m7456a(this.f18985q.f9332a, C2987i.TRANSMITTING);
        this.f18974f = this.f18985q.f9334c.getPath();
        this.f18970b = this.f18985q.f9332a;
        this.f18982n = this.f18985q.f9337f;
        this.f18975g = a2.f9213i;
        this.f18977i = a2.f9208d;
        this.f18976h = a2.f9206b;
        this.f18978j = a2.f9218n;
        this.f18979k = a2.f9220p;
        this.f18980l = a2.f9221q;
        this.f18981m = a2.f9222r;
        this.f18971c = this.f18985q.f9343l;
        i = C26123.f8506a[a2.f9214j.ordinal()];
        if (i != 1) {
            switch (i) {
                case 3:
                    this.f18983o = C5993g.m13230a();
                    return;
                case 4:
                    a = C5994h.m13240a();
                    break;
                case 5:
                    a = C5995i.m13250a();
                    break;
                default:
                    return;
            }
        }
        C3004f c3004f = C2980g.m7433a(a2.f9213i).f9287g;
        if (!c3004f.equals(C3004f.ADMIN)) {
            if (!c3004f.equals(C3004f.OWNER)) {
                a = C5992f.m13220a();
            }
        }
        a = C5990d.m13201a();
        this.f18983o = a;
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        StringBuilder stringBuilder = new StringBuilder("ReTransmitFileJob started messageId : ");
        stringBuilder.append(this.f18976h);
        C2480b.m6742f(stringBuilder.toString());
        C2983b a = C2984c.m7461a(this.f18970b);
        StringBuilder stringBuilder2 = new StringBuilder("ReTransmitFileJob called progress is :");
        stringBuilder2.append(a.f9338g);
        C2480b.m6742f(stringBuilder2.toString());
        if (this.f18972d) {
            C2480b.m6742f("ReTransmitFileJob download ");
            this.f18973e = new C59031(this);
            a = C2984c.m7461a(C2966b.m7399a(this.f18969a).f9216l.longValue());
            if (!(a.f9342k.equals(C2987i.FINISHED) || a.f9342k.equals(C2987i.TRANSMITTING) || a.f9339h == null)) {
                if (!a.f9339h.isEmpty()) {
                    if (this.f18986r) {
                        C2897c.m7264a().m7268a(a.f9333b, a.f9334c, this.f18973e);
                        return;
                    } else {
                        C2897c.m7264a().m7266a(this.f18970b, true, this.f18973e);
                        return;
                    }
                }
            }
            if (this.f18986r) {
                C2897c.m7264a().m7268a(a.f9333b, a.f9334c, null);
                return;
            } else {
                C2897c.m7264a().m7266a(this.f18970b, false, null);
                return;
            }
        }
        C2480b.m6742f("ReTransmitFileJob upload");
        this.f18973e = new C59042(this);
        C2897c.m7264a().m7265a(this.f18970b, false, this.f18987s, this.f18973e);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
