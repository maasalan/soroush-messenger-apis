package mobi.mmdt.ott.logic.p261a.p326w.p327a;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2968f;
import mobi.mmdt.ott.provider.p384f.C2972l;
import mobi.mmdt.ott.provider.p384f.C6019d;
import mobi.mmdt.ott.provider.p384f.C6021g;

public final class C6784a extends C5891a {
    private String f19370a;
    private String f19371b;
    private Long f19372c = null;

    static /* synthetic */ class C27541 {
        static final /* synthetic */ int[] f8709a = new int[C2761g.m7088a().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = mobi.mmdt.ott.logic.p261a.p326w.p327a.C2761g.m7088a();
            r0 = r0.length;
            r0 = new int[r0];
            f8709a = r0;
            r0 = 1;
            r1 = f8709a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = mobi.mmdt.ott.logic.p261a.p326w.p327a.C2761g.f8716a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = f8709a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = mobi.mmdt.ott.logic.p261a.p326w.p327a.C2761g.f8717b;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r1 = f8709a;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = mobi.mmdt.ott.logic.p261a.p326w.p327a.C2761g.f8718c;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r0 = 3;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.w.a.a.1.<clinit>():void");
        }
    }

    public C6784a(String str, String str2) {
        super(C2683h.f8619a);
        this.f19370a = str;
        this.f19371b = str2;
    }

    private static void m17220a(String str, String str2, Long l) {
        C6019d c6019d = new C6019d();
        c6019d.m13360l(str2);
        C6021g c6021g = new C6021g();
        c6021g.m13378a(str);
        c6019d.m13332a(c6021g);
        C2968f a = C2966b.m7400a(str);
        if (a != null && a.f9207c.equals(C2972l.TEXT)) {
            C6019d c6019d2 = new C6019d();
            c6019d2.m13336a(l);
            C6021g c6021g2 = new C6021g();
            c6021g2.m13378a(str);
            c6019d2.m13332a(c6021g2);
        }
    }

    private static boolean m17221a(int i, String str, String str2, String str3) {
        if (i == 0) {
            return false;
        }
        switch (C27541.f8709a[i - 1]) {
            case 1:
                return C6784a.m17222a(str) && C6784a.m17222a(str2) && C6784a.m17222a(str3);
            case 2:
                if (C6784a.m17222a(str) && C6784a.m17222a(str2) && C6784a.m17222a(str3)) {
                    return true;
                }
            case 3:
                return true;
            default:
                return false;
        }
    }

    private static boolean m17222a(String str) {
        return (str == null || str.equals("null") || str.isEmpty()) ? false : true;
    }

    public final void onAdded() {
        C6784a.m17220a(this.f19370a, "not_available", null);
    }

    protected final void onCancel(int i, Throwable th) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRun() {
        /*
        r24 = this;
        r1 = r24;
        r2 = "AddLinkPreviewDataJob start ";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r2);
        r2 = r1.f19371b;
        r2 = mobi.mmdt.ott.logic.p261a.p326w.p327a.C2760f.m7087a(r2);
        if (r2 == 0) goto L_0x0171;
    L_0x000f:
        r3 = mobi.mmdt.ott.logic.p261a.p326w.p327a.p328a.C2756a.m7082a(r2);
        if (r3 != 0) goto L_0x0016;
    L_0x0015:
        return;
    L_0x0016:
        r3 = "UTF-8";
        r3 = java.net.URLEncoder.encode(r2, r3);
        r4 = new mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.linkpreview.a;
        r4.<init>(r3);
        r3 = mobi.mmdt.ott.MyApplication.m12952b();
        r3 = r4.m13066a(r3);
        r4 = new java.lang.StringBuilder;
        r5 = "AddLinkPreviewDataJob result ";
        r4.<init>(r5);
        r5 = r3.toString();
        r4.append(r5);
        r4 = r4.toString();
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r4);
        r4 = r3.getSiteName();
        r5 = r3.getSiteTitle();
        r6 = r3.getDescription();
        r8 = r3.getLinkPreviewImage();
        r7 = r3.getPreviewType();
        r9 = -1;
        r10 = r7.hashCode();
        r11 = -732377866; // 0xffffffffd458ccf6 float:-3.72460644E12 double:NaN;
        r12 = 1;
        r13 = 0;
        if (r10 == r11) goto L_0x007d;
    L_0x005e:
        r11 = 100313435; // 0x5faa95b float:2.3572098E-35 double:4.9561422E-316;
        if (r10 == r11) goto L_0x0073;
    L_0x0063:
        r11 = 1224335515; // 0x48f9e09b float:511748.84 double:6.04902117E-315;
        if (r10 == r11) goto L_0x0069;
    L_0x0068:
        goto L_0x0086;
    L_0x0069:
        r10 = "website";
        r7 = r7.equals(r10);
        if (r7 == 0) goto L_0x0086;
    L_0x0071:
        r9 = r13;
        goto L_0x0086;
    L_0x0073:
        r10 = "image";
        r7 = r7.equals(r10);
        if (r7 == 0) goto L_0x0086;
    L_0x007b:
        r9 = 2;
        goto L_0x0086;
    L_0x007d:
        r10 = "article";
        r7 = r7.equals(r10);
        if (r7 == 0) goto L_0x0086;
    L_0x0085:
        r9 = r12;
    L_0x0086:
        switch(r9) {
            case 0: goto L_0x0090;
            case 1: goto L_0x0090;
            case 2: goto L_0x008b;
            default: goto L_0x0089;
        };
    L_0x0089:
        r7 = r13;
        goto L_0x0097;
    L_0x008b:
        if (r8 == 0) goto L_0x0089;
    L_0x008d:
        r7 = mobi.mmdt.ott.logic.p261a.p326w.p327a.C2761g.f8718c;
        goto L_0x0097;
    L_0x0090:
        if (r8 == 0) goto L_0x0095;
    L_0x0092:
        r7 = mobi.mmdt.ott.logic.p261a.p326w.p327a.C2761g.f8717b;
        goto L_0x0097;
    L_0x0095:
        r7 = mobi.mmdt.ott.logic.p261a.p326w.p327a.C2761g.f8716a;
    L_0x0097:
        if (r7 != 0) goto L_0x009a;
    L_0x0099:
        return;
    L_0x009a:
        r9 = 0;
        r10 = mobi.mmdt.ott.logic.p261a.p326w.p327a.C6784a.C27541.f8709a;
        r11 = r7 + -1;
        r10 = r10[r11];
        switch(r10) {
            case 1: goto L_0x0159;
            case 2: goto L_0x00a6;
            case 3: goto L_0x00a6;
            default: goto L_0x00a4;
        };
    L_0x00a4:
        goto L_0x0164;
    L_0x00a6:
        r7 = mobi.mmdt.ott.logic.p261a.p326w.p327a.C6784a.m17221a(r7, r4, r5, r6);
        if (r7 == 0) goto L_0x0164;
    L_0x00ac:
        r7 = new mobi.mmdt.componentsutils.b.d;
        r7.<init>(r13, r13);
        r9 = r3.getImageWith();	 Catch:{ Exception -> 0x00db }
        if (r9 == 0) goto L_0x00d3;
    L_0x00b7:
        r9 = r3.getImageHeight();	 Catch:{ Exception -> 0x00db }
        if (r9 == 0) goto L_0x00d3;
    L_0x00bd:
        r9 = r3.getImageHeight();	 Catch:{ Exception -> 0x00db }
        r13 = java.lang.Integer.parseInt(r9);	 Catch:{ Exception -> 0x00db }
        r3 = r3.getImageWith();	 Catch:{ Exception -> 0x00db }
        r3 = java.lang.Integer.parseInt(r3);	 Catch:{ Exception -> 0x00db }
        r23 = r13;
        r13 = r3;
        r3 = r23;
        goto L_0x00d4;
    L_0x00d3:
        r3 = r13;
    L_0x00d4:
        r9 = new mobi.mmdt.componentsutils.b.d;	 Catch:{ Exception -> 0x00db }
        r9.<init>(r13, r3);	 Catch:{ Exception -> 0x00db }
        r7 = r9;
        goto L_0x00ee;
    L_0x00db:
        r0 = move-exception;
        r3 = r0;
        r9 = new java.lang.StringBuilder;
        r10 = "problem in get image size of ";
        r9.<init>(r10);
        r9.append(r2);
        r2 = r9.toString();
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6737b(r2, r3);
    L_0x00ee:
        r2 = "\\.";
        r2 = r8.split(r2);
        r3 = "\\.";
        r3 = r8.split(r3);
        r3 = r3.length;
        r3 = r3 - r12;
        r2 = r2[r3];
        r3 = mobi.mmdt.ott.logic.C2791c.m7109a();
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r10 = 8;
        r10 = mobi.mmdt.componentsutils.p232b.p237e.C2485a.m6745a(r10);
        r9.append(r10);
        r10 = ".";
        r9.append(r10);
        r9.append(r2);
        r2 = r9.toString();
        r2 = r3.m7112a(r2);
        r3 = new java.io.File;
        r3.<init>(r2);
        r2 = android.net.Uri.fromFile(r3);
        r9 = 0;
        r10 = mobi.mmdt.ott.provider.p386h.C2988j.IMAGE;
        r11 = r3.getName();
        r12 = 0;
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r17 = mobi.mmdt.ott.provider.p386h.C2987i.NOT_STARTED;
        r18 = mobi.mmdt.ott.provider.p386h.C2987i.NOT_STARTED;
        r19 = 0;
        r20 = 0;
        r3 = r7.f8163a;
        r7 = r7.f8164b;
        r22 = r7;
        r7 = r2;
        r21 = r3;
        r2 = mobi.mmdt.ott.provider.p386h.C2984c.m7459a(r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22);
        r2 = java.lang.Long.valueOf(r2);
        r1.f19372c = r2;
        r9 = new mobi.mmdt.ott.logic.a.w.a.c;
        r2 = r1.f19372c;
        r9.<init>(r4, r5, r6, r2);
        goto L_0x0164;
    L_0x0159:
        r2 = mobi.mmdt.ott.logic.p261a.p326w.p327a.C6784a.m17221a(r7, r4, r5, r6);
        if (r2 == 0) goto L_0x0164;
    L_0x015f:
        r9 = new mobi.mmdt.ott.logic.a.w.a.b;
        r9.<init>(r4, r5, r6);
    L_0x0164:
        if (r9 == 0) goto L_0x0171;
    L_0x0166:
        r2 = r1.f19370a;
        r3 = r9.mo2187a();
        r4 = r1.f19372c;
        mobi.mmdt.ott.logic.p261a.p326w.p327a.C6784a.m17220a(r2, r3, r4);
    L_0x0171:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.w.a.a.onRun():void");
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
