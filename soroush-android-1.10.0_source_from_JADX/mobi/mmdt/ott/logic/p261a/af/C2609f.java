package mobi.mmdt.ott.logic.p261a.af;

import com.liulishuo.filedownloader.C2135a;
import com.liulishuo.filedownloader.C2187i;
import com.liulishuo.filedownloader.C2216q;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import mobi.mmdt.componentsutils.p232b.C2492j;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.p250a.p251a.C2547a;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C5783e;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C5789k;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2557c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.C2560a;
import mobi.mmdt.ott.logic.C2791c;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p386h.C2983b;
import mobi.mmdt.ott.provider.p386h.C2984c;
import mobi.mmdt.ott.provider.p386h.C2987i;
import mobi.mmdt.ott.provider.p386h.C2988j;

public final class C2609f {
    private static C2609f f8502b;
    public int f8503a = 1;

    class C59001 extends C2187i {
        final /* synthetic */ C2609f f16061a;

        C59001(C2609f c2609f) {
            this.f16061a = c2609f;
        }

        protected final void mo2176a(C2135a c2135a) {
            if (c2135a.mo1892b(this.f16061a.f8503a) != null) {
                C2984c.m7456a(((Long) c2135a.mo1892b(this.f16061a.f8503a)).longValue(), C2987i.TRANSMITTING);
            }
        }

        protected final void mo2177a(C2135a c2135a, int i, int i2) {
            if (c2135a.mo1892b(this.f16061a.f8503a) != null) {
                long longValue = ((Long) c2135a.mo1892b(this.f16061a.f8503a)).longValue();
                if (i2 != 0) {
                    C2984c.m7453a(longValue, Integer.valueOf(String.valueOf((((long) i) * 100) / ((long) i2))).intValue());
                }
            }
        }

        protected final void mo2178a(C2135a c2135a, Throwable th) {
            if (c2135a.mo1892b(this.f16061a.f8503a) != null) {
                String[] strArr;
                StringBuilder stringBuilder;
                long longValue = ((Long) c2135a.mo1892b(this.f16061a.f8503a)).longValue();
                if (th instanceof C5783e) {
                    strArr = new String[]{C2966b.m7406b(longValue).f9206b};
                } else if (th instanceof C5789k) {
                    strArr = new String[]{C2966b.m7406b(longValue).f9206b};
                } else {
                    if (th instanceof FileNotFoundException) {
                        if (C2966b.m7406b(longValue).f9211g.equals(C2970j.OUT)) {
                            strArr = new String[]{C2966b.m7406b(longValue).f9206b};
                        }
                    }
                    C2984c.m7456a(longValue, C2987i.ERROR);
                    stringBuilder = new StringBuilder("Error <<");
                    stringBuilder.append(c2135a.mo1904l());
                    stringBuilder.append(">> ");
                    stringBuilder.append(th.getMessage());
                    C2480b.m6736b(stringBuilder.toString());
                }
                C2966b.m7396a(strArr, C2971k.ERROR);
                C2984c.m7456a(longValue, C2987i.ERROR);
                stringBuilder = new StringBuilder("Error <<");
                stringBuilder.append(c2135a.mo1904l());
                stringBuilder.append(">> ");
                stringBuilder.append(th.getMessage());
                C2480b.m6736b(stringBuilder.toString());
            }
        }

        protected final void mo2179b(C2135a c2135a) {
            if (c2135a.mo1892b(this.f16061a.f8503a) != null) {
                long longValue = ((Long) c2135a.mo1892b(this.f16061a.f8503a)).longValue();
                C2984c.m7453a(longValue, 100);
                C2984c.m7456a(longValue, C2987i.FINISHED);
                if (C2535a.m6888a().m6970s()) {
                    C2983b a = C2984c.m7461a(longValue);
                    if (a.f9337f.equals(C2988j.IMAGE) || a.f9337f.equals(C2988j.GIF) || a.f9337f.equals(C2988j.VIDEO)) {
                        C2791c.m7109a();
                        C2791c.m7110a(a.f9334c);
                    }
                }
                c2135a.mo1888a(null);
                StringBuilder stringBuilder = new StringBuilder("Download Completed <<");
                stringBuilder.append(c2135a.mo1904l());
                stringBuilder.append(">>");
                C2480b.m6736b(stringBuilder.toString());
            }
        }

        protected final void mo2180b(C2135a c2135a, int i, int i2) {
            if (c2135a.mo1892b(this.f16061a.f8503a) != null) {
                long longValue = ((Long) c2135a.mo1892b(this.f16061a.f8503a)).longValue();
                C2984c.m7456a(longValue, C2987i.CANCEL);
                if (i2 != 0) {
                    C2984c.m7453a(longValue, Integer.valueOf(String.valueOf((((long) i) * 100) / ((long) i2))).intValue());
                }
                StringBuilder stringBuilder = new StringBuilder("Paused <<");
                stringBuilder.append(c2135a.mo1904l());
                stringBuilder.append(">> ");
                stringBuilder.append(i);
                stringBuilder.append(" byte");
                C2480b.m6736b(stringBuilder.toString());
            }
        }
    }

    class C59012 extends C2187i {
        final /* synthetic */ C2609f f16062a;

        C59012(C2609f c2609f) {
            this.f16062a = c2609f;
        }

        protected final void mo2176a(C2135a c2135a) {
            if (c2135a.mo1892b(this.f16062a.f8503a) != null) {
                C2984c.m7464b(((Long) c2135a.mo1892b(this.f16062a.f8503a)).longValue(), C2987i.TRANSMITTING);
            }
        }

        protected final void mo2177a(C2135a c2135a, int i, int i2) {
        }

        protected final void mo2178a(C2135a c2135a, Throwable th) {
            if (c2135a.mo1892b(this.f16062a.f8503a) != null) {
                C2984c.m7464b(((Long) c2135a.mo1892b(this.f16062a.f8503a)).longValue(), C2987i.CANCEL);
                StringBuilder stringBuilder = new StringBuilder("Error <<");
                stringBuilder.append(c2135a.mo1904l());
                stringBuilder.append(">> ");
                stringBuilder.append(th.getMessage());
                C2480b.m6736b(stringBuilder.toString());
            }
        }

        protected final void mo2179b(C2135a c2135a) {
            if (c2135a.mo1892b(this.f16062a.f8503a) != null) {
                long longValue = ((Long) c2135a.mo1892b(this.f16062a.f8503a)).longValue();
                if (c2135a.mo1902j() != null && new File(c2135a.mo1902j()).exists()) {
                    C2984c.m7464b(longValue, C2987i.FINISHED);
                }
                c2135a.mo1888a(null);
                StringBuilder stringBuilder = new StringBuilder("Download Completed <<");
                stringBuilder.append(c2135a.mo1904l());
                stringBuilder.append(">>");
                C2480b.m6736b(stringBuilder.toString());
            }
        }

        protected final void mo2180b(C2135a c2135a, int i, int i2) {
        }
    }

    private static String m7040a(C2983b c2983b, boolean z) {
        boolean a = C2609f.m7042a(c2983b.f9344m);
        String a2 = C2556b.m6998a(z ? c2983b.f9339h : c2983b.f9333b);
        if (a) {
            return a2;
        }
        String d = C2535a.m6888a().m6928d();
        String a3 = C2547a.m6986a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c2983b.f9344m);
        stringBuilder.append(d);
        stringBuilder.append(a3);
        C2560a.m7006a(MyApplication.m12952b());
        stringBuilder.append(C2560a.m7010d());
        String a4 = C2557c.m7002a(stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append(a2);
        stringBuilder.append("/");
        stringBuilder.append(d);
        stringBuilder.append("/");
        C2560a.m7006a(MyApplication.m12952b());
        stringBuilder.append(C2560a.m7008b());
        stringBuilder.append("/");
        stringBuilder.append(a4);
        stringBuilder.append("/");
        stringBuilder.append(a3);
        return stringBuilder.toString();
    }

    public static C2609f m7041a() {
        if (f8502b == null) {
            f8502b = new C2609f();
        }
        return f8502b;
    }

    static boolean m7042a(String str) {
        String[] split = str.split("\\.");
        str = split.length > 1 ? split[1] : null;
        return (str == null || str.isEmpty()) ? false : true;
    }

    public final void m7043a(long j) {
        try {
            C2983b a = C2984c.m7461a(j);
            if (a.f9344m != null) {
                if (!C2609f.m7042a(a.f9344m)) {
                    C2808d.m7149c(new C6668i(j));
                } else if ((a.f9337f == C2988j.IMAGE || a.f9337f == C2988j.GIF || a.f9337f == C2988j.VIDEO) && !a.f9342k.equals(C2987i.FINISHED) && !a.f9342k.equals(C2987i.TRANSMITTING) && a.f9339h != null && !a.f9339h.isEmpty()) {
                    String a2 = C2609f.m7040a(a, true);
                    C2216q.m6073a();
                    C2135a a3 = C2216q.m6072a(a2).mo1889a(a.f9340i.getPath()).mo1888a(new C59012(this)).mo1885a().mo1886a(10).mo1887a(this.f8503a, Long.valueOf(j));
                    a2 = C2492j.m6840a(MyApplication.m12952b());
                    a3.mo1890a("http.agent", a2).mo1890a("User-Agent", a2);
                    a3.mo1896d();
                    C2984c.m7464b(j, C2987i.TRANSMITTING);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (GeneralSecurityException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void m7044a(long r7, boolean r9, long r10) {
        /*
        r6 = this;
        r0 = mobi.mmdt.ott.provider.p386h.C2984c.m7461a(r7);
        r1 = r0.f9344m;
        r1 = mobi.mmdt.ott.logic.p261a.af.C2609f.m7042a(r1);
        r2 = 0;
        r3 = 1;
        if (r1 != 0) goto L_0x0031;
    L_0x000e:
        if (r9 == 0) goto L_0x0019;
    L_0x0010:
        r9 = new mobi.mmdt.ott.logic.a.af.g;
        r9.<init>(r7);
        mobi.mmdt.ott.logic.C2808d.m7149c(r9);
        return;
    L_0x0019:
        r0 = -1;
        r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1));
        if (r9 == 0) goto L_0x0028;
    L_0x001f:
        r7 = new mobi.mmdt.ott.logic.a.af.k;
        r7.<init>(r10, r3);
        mobi.mmdt.ott.logic.C2808d.m7149c(r7);
        return;
    L_0x0028:
        r9 = mobi.mmdt.ott.logic.p370r.C2897c.m7264a();
        r10 = 0;
        r9.m7266a(r7, r2, r10);
        return;
    L_0x0031:
        r10 = r0.f9337f;
        r10 = mobi.mmdt.ott.logic.p370r.C2895a.m7255a(r10);
        if (r10 != 0) goto L_0x003c;
    L_0x0039:
        if (r9 == 0) goto L_0x003c;
    L_0x003b:
        return;
    L_0x003c:
        r9 = r0.f9333b;
        if (r9 == 0) goto L_0x022c;
    L_0x0040:
        r9 = r0.f9333b;
        r9 = r9.isEmpty();
        if (r9 == 0) goto L_0x004a;
    L_0x0048:
        goto L_0x022c;
    L_0x004a:
        r9 = com.liulishuo.filedownloader.C2186h.C2173a.f7243a;
        r10 = r0.f9347p;
        r10 = r10.intValue();
        r9 = r9.m6027b(r10);
        if (r9 == 0) goto L_0x0083;
    L_0x005a:
        r9 = r9.mo1871B();
        if (r9 == 0) goto L_0x0083;
    L_0x0060:
        r10 = r9.mo1911s();
        if (r10 == r3) goto L_0x0082;
    L_0x0066:
        r10 = r9.mo1911s();
        r11 = 6;
        if (r10 == r11) goto L_0x0082;
    L_0x006d:
        r10 = r9.mo1911s();
        r11 = 2;
        if (r10 == r11) goto L_0x0082;
    L_0x0074:
        r10 = r9.mo1911s();
        r11 = 3;
        if (r10 == r11) goto L_0x0082;
    L_0x007b:
        r9 = r9.mo1911s();
        r10 = -3;
        if (r9 != r10) goto L_0x0083;
    L_0x0082:
        return;
    L_0x0083:
        r9 = mobi.mmdt.ott.view.tools.C4516l.m8232a();
        if (r9 == 0) goto L_0x01ba;
    L_0x0089:
        r9 = mobi.mmdt.ott.logic.p359k.C2837a.m7169a();
        if (r9 != 0) goto L_0x01ba;
    L_0x008f:
        r9 = mobi.mmdt.ott.logic.C2791c.m7109a();
        r10 = r9.f8819e;
        r11 = mobi.mmdt.ott.view.tools.C4516l.m8232a();
        if (r11 == 0) goto L_0x00ba;
    L_0x009b:
        r11 = mobi.mmdt.ott.logic.p359k.C2837a.m7169a();
        if (r11 != 0) goto L_0x00ba;
    L_0x00a1:
        r11 = mobi.mmdt.ott.logic.C2791c.C27871.f8807a;
        r1 = r0.f9337f;
        r1 = r1.ordinal();
        r11 = r11[r1];
        switch(r11) {
            case 1: goto L_0x00b8;
            case 2: goto L_0x00b5;
            case 3: goto L_0x00b2;
            case 4: goto L_0x00af;
            case 5: goto L_0x00b8;
            case 6: goto L_0x00af;
            default: goto L_0x00ae;
        };
    L_0x00ae:
        goto L_0x00ba;
    L_0x00af:
        r10 = r9.f8819e;
        goto L_0x00ba;
    L_0x00b2:
        r10 = r9.f8818d;
        goto L_0x00ba;
    L_0x00b5:
        r10 = r9.f8816b;
        goto L_0x00ba;
    L_0x00b8:
        r10 = r9.f8815a;
    L_0x00ba:
        r9 = android.net.Uri.parse(r10);
        mobi.mmdt.ott.logic.C2791c.m7109a();
        r10 = r0.f9335d;
        r11 = mobi.mmdt.ott.view.tools.C4516l.m8232a();
        if (r11 == 0) goto L_0x0196;
    L_0x00c9:
        r11 = mobi.mmdt.ott.logic.p359k.C2837a.m7169a();
        if (r11 != 0) goto L_0x0196;
    L_0x00cf:
        r11 = "\\.";
        r11 = r10.split(r11);
        r1 = mobi.mmdt.ott.logic.C2791c.C27871.f8807a;
        r4 = r0.f9337f;
        r4 = r4.ordinal();
        r1 = r1[r4];
        switch(r1) {
            case 1: goto L_0x016b;
            case 2: goto L_0x0149;
            case 3: goto L_0x0135;
            case 4: goto L_0x011b;
            case 5: goto L_0x00ff;
            case 6: goto L_0x00e4;
            default: goto L_0x00e2;
        };
    L_0x00e2:
        goto L_0x0196;
    L_0x00e4:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r4 = java.lang.System.currentTimeMillis();
        r1.append(r4);
        r4 = ".";
        r1.append(r4);
        r4 = r10.length();
        r5 = r11.length;
        r5 = r5 - r3;
        r11 = r11[r5];
        goto L_0x0186;
    L_0x00ff:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r4 = java.lang.System.currentTimeMillis();
        r1.append(r4);
        r4 = ".";
        r1.append(r4);
        r4 = r0.f9335d;
        r4 = r4.length();
        r5 = r11.length;
        r5 = r5 - r3;
        r11 = r11[r5];
        goto L_0x0186;
    L_0x011b:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r4 = java.lang.System.currentTimeMillis();
        r1.append(r4);
        r4 = ".";
        r1.append(r4);
        r4 = r10.length();
        r5 = r11.length;
        r5 = r5 - r3;
        r11 = r11[r5];
        goto L_0x0186;
    L_0x0135:
        r10 = new java.lang.StringBuilder;
        r10.<init>();
        r4 = java.lang.System.currentTimeMillis();
        r10.append(r4);
        r11 = "_";
        r10.append(r11);
        r11 = r0.f9335d;
        goto L_0x0163;
    L_0x0149:
        r10 = new java.lang.StringBuilder;
        r10.<init>();
        r4 = java.lang.System.currentTimeMillis();
        r10.append(r4);
        r11 = r0.f9335d;
        r1 = r0.f9335d;
        r1 = r1.length();
        r1 = r1 + -4;
        r11 = r11.substring(r1);
    L_0x0163:
        r10.append(r11);
        r10 = r10.toString();
        goto L_0x0196;
    L_0x016b:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r4 = java.lang.System.currentTimeMillis();
        r1.append(r4);
        r4 = ".";
        r1.append(r4);
        r4 = r0.f9335d;
        r4 = r4.length();
        r5 = r11.length;
        r5 = r5 - r3;
        r11 = r11[r5];
    L_0x0186:
        r11 = r11.length();
        r4 = r4 - r11;
        r10 = r10.substring(r4);
        r1.append(r10);
        r10 = r1.toString();
    L_0x0196:
        r11 = new java.io.File;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r9 = r9.getPath();
        r1.append(r9);
        r9 = java.io.File.separator;
        r1.append(r9);
        r1.append(r10);
        r9 = r1.toString();
        r11.<init>(r9);
        r9 = android.net.Uri.fromFile(r11);
        mobi.mmdt.ott.provider.p386h.C2984c.m7454a(r7, r9);
    L_0x01ba:
        r9 = mobi.mmdt.ott.logic.p261a.af.C2609f.m7040a(r0, r2);
        com.liulishuo.filedownloader.C2216q.m6073a();
        r9 = com.liulishuo.filedownloader.C2216q.m6072a(r9);
        r10 = r0.f9334c;
        r10 = r10.getPath();
        r9 = r9.mo1889a(r10);
        r10 = new mobi.mmdt.ott.logic.a.af.f$1;
        r10.<init>(r6);
        r9 = r9.mo1888a(r10);
        r9 = r9.mo1885a();
        r10 = 5;
        r9 = r9.mo1886a(r10);
        r10 = r6.f8503a;
        r11 = java.lang.Long.valueOf(r7);
        r9 = r9.mo1887a(r10, r11);
        r10 = mobi.mmdt.ott.MyApplication.m12952b();
        r10 = mobi.mmdt.componentsutils.p232b.C2492j.m6840a(r10);
        r11 = "http.agent";
        r11 = r9.mo1890a(r11, r10);
        r1 = "User-Agent";
        r11.mo1890a(r1, r10);
        r10 = r0.f9332a;
        r0 = r9.mo1898f();
        r0 = java.lang.Integer.valueOf(r0);
        r1 = new mobi.mmdt.ott.provider.h.e;
        r1.<init>();
        r1.m13455b(r0);
        r0 = new mobi.mmdt.ott.provider.h.g;
        r0.<init>();
        r3 = new long[r3];
        r3[r2] = r10;
        r0.m13470b(r3);
        r10 = mobi.mmdt.ott.MyApplication.m12952b();
        r1.m13445a(r10, r0);
        r9.mo1896d();
        r9 = mobi.mmdt.ott.provider.p386h.C2987i.TRANSMITTING;
        mobi.mmdt.ott.provider.p386h.C2984c.m7456a(r7, r9);
        return;
    L_0x022c:
        r7 = new java.lang.NullPointerException;
        r7.<init>();
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.af.f.a(long, boolean, long):void");
    }
}
