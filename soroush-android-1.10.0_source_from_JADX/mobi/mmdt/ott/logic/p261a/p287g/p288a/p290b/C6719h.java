package mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.af.p270a.C2603h;
import mobi.mmdt.ott.logic.p261a.p287g.p293b.C2678d;
import mobi.mmdt.ott.logic.p360l.p361a.C2841c;
import mobi.mmdt.ott.logic.p360l.p361a.C5994h;
import mobi.mmdt.ott.logic.p370r.C2896b;
import mobi.mmdt.ott.logic.p370r.C2897c;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2968f;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p386h.C2983b;
import mobi.mmdt.ott.provider.p386h.C2984c;
import mobi.mmdt.ott.provider.p393o.C3011a;
import org.json.JSONObject;

public final class C6719h extends C5891a {
    private C2841c f19122a;

    public C6719h() {
        super(C2683h.f8621c);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C2968f[] a = C2966b.m7404a(C2973m.GROUP);
        this.f19122a = C5994h.m13240a();
        for (final C2968f c2968f : a) {
            long a2 = C2778b.m7093a();
            switch (c2968f.f9207c) {
                case TEXT:
                    StringBuilder stringBuilder = new StringBuilder("resend message to ");
                    stringBuilder.append(c2968f.f9213i);
                    stringBuilder.append(" - ");
                    stringBuilder.append(c2968f.f9208d);
                    C2480b.m6736b(stringBuilder.toString());
                    r0.f19122a.mo2189a(c2968f.f9213i, c2968f.f9208d, c2968f.f9206b, c2968f.f9218n, a2, null, c2968f.f9220p, C2678d.m7061a(c2968f.f9221q), c2968f.f9222r);
                    break;
                case LOCATION:
                    JSONObject jSONObject = new JSONObject(c2968f.f9208d);
                    r0.f19122a.mo2191a(c2968f.f9213i, jSONObject.getString("LOCATION_LATITUDE"), jSONObject.getString("LOCATION_LONGITUDE"), c2968f.f9206b, c2968f.f9218n, a2, null, c2968f.f9220p, C2678d.m7061a(c2968f.f9221q), c2968f.f9222r);
                    break;
                case STICKER:
                    String str = c2968f.f9217m;
                    if (!(str == null || str.isEmpty())) {
                        String a3 = C3011a.m7521a(str);
                        String b = C3011a.m7522b(str);
                        String c = C3011a.m7523c(str);
                        if (!(a3 == null || b == null || c == null || a3.isEmpty() || b.isEmpty() || c.isEmpty())) {
                            r0.f19122a.mo2193a(c2968f.f9213i, c2968f.f9206b, a3, b, c, c2968f.f9218n, a2, null, c2968f.f9220p, C2678d.m7061a(c2968f.f9221q), c2968f.f9222r);
                            break;
                        }
                    }
                default:
                    C2897c.m7264a().m7265a(c2968f.f9216l.longValue(), false, C2603h.f8490a, (C2896b) new C2896b(r0) {
                        final /* synthetic */ C6719h f16107b;

                        public final void mo2169a() {
                        }

                        public final void mo2170a(int i) {
                        }

                        public final void mo2171a(int i, Object obj) {
                        }

                        public final void mo2172a(String str, String str2, String str3) {
                            C2983b a = C2984c.m7461a(c2968f.f9216l.longValue());
                            long a2 = C2778b.m7093a();
                            try {
                                C2841c a3;
                                String str4;
                                String str5;
                                String str6;
                                Long valueOf;
                                String str7;
                                String str8;
                                int i;
                                int i2;
                                String str9;
                                String str10;
                                int i3;
                                String str11;
                                switch (a.f9337f) {
                                    case IMAGE:
                                        a3 = r1.f16107b.f19122a;
                                        str4 = c2968f.f9213i;
                                        str5 = c2968f.f9206b;
                                        str6 = c2968f.f9208d;
                                        valueOf = Long.valueOf(a.f9336e);
                                        str7 = a.f9335d;
                                        str8 = c2968f.f9218n;
                                        i = a.f9345n;
                                        i2 = a.f9346o;
                                        str9 = c2968f.f9220p;
                                        str10 = str9;
                                        i3 = i;
                                        a3.mo2195a(str4, str5, str6, str3, str, str2, valueOf, str7, str8, a2, null, i3, i2, str10, C2678d.m7061a(c2968f.f9221q), c2968f.f9222r);
                                        return;
                                    case GIF:
                                        a3 = r1.f16107b.f19122a;
                                        str4 = c2968f.f9213i;
                                        str5 = c2968f.f9206b;
                                        str6 = c2968f.f9208d;
                                        valueOf = Long.valueOf(a.f9336e);
                                        str7 = a.f9335d;
                                        str8 = c2968f.f9218n;
                                        i = a.f9345n;
                                        i2 = a.f9346o;
                                        str9 = c2968f.f9220p;
                                        str10 = str9;
                                        i3 = i;
                                        a3.mo2197b(str4, str5, str6, str3, str, str2, valueOf, str7, str8, a2, null, i3, i2, str10, C2678d.m7061a(c2968f.f9221q), c2968f.f9222r);
                                        return;
                                    case PUSH_TO_TALK:
                                        a3 = r1.f16107b.f19122a;
                                        str4 = c2968f.f9213i;
                                        str5 = c2968f.f9206b;
                                        Long valueOf2 = Long.valueOf(a.f9336e);
                                        str9 = a.f9335d;
                                        Integer valueOf3 = Integer.valueOf(a.f9343l);
                                        str7 = c2968f.f9218n;
                                        str8 = c2968f.f9220p;
                                        str11 = str8;
                                        a3.mo2190a(str4, str5, str3, str, valueOf2, str9, valueOf3, str7, a2, null, str11, C2678d.m7061a(c2968f.f9221q), c2968f.f9222r);
                                        return;
                                    case VIDEO:
                                        a3 = r1.f16107b.f19122a;
                                        str4 = c2968f.f9213i;
                                        str5 = c2968f.f9206b;
                                        str6 = c2968f.f9208d;
                                        valueOf = Long.valueOf(a.f9336e);
                                        str7 = a.f9335d;
                                        Integer valueOf4 = Integer.valueOf(a.f9343l);
                                        String str12 = c2968f.f9218n;
                                        int i4 = a.f9345n;
                                        i2 = a.f9346o;
                                        String str13 = c2968f.f9220p;
                                        String str14 = str13;
                                        i3 = i4;
                                        a3.mo2194a(str4, str5, str6, str3, str, str2, valueOf, str7, valueOf4, str12, a2, null, i3, i2, str14, C2678d.m7061a(c2968f.f9221q), c2968f.f9222r);
                                        return;
                                    case OTHER:
                                        a3 = r1.f16107b.f19122a;
                                        str4 = c2968f.f9213i;
                                        str5 = c2968f.f9206b;
                                        str6 = c2968f.f9208d;
                                        Long valueOf5 = Long.valueOf(a.f9336e);
                                        String str15 = a.f9335d;
                                        str7 = c2968f.f9218n;
                                        str8 = c2968f.f9220p;
                                        str11 = str8;
                                        a3.mo2192a(str4, str5, str6, str3, str, valueOf5, str15, str7, a2, null, str11, C2678d.m7061a(c2968f.f9221q), c2968f.f9222r);
                                        return;
                                    default:
                                        return;
                                }
                            } catch (Throwable e) {
                                C2480b.m6737b("NotConnectedException", e);
                            }
                        }

                        public final void mo2173b() {
                        }

                        public final void mo2174c() {
                        }
                    });
                    break;
            }
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
