package mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b;

import com.p072b.p073a.p074a.C1073q;
import java.util.Map;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p384f.C2971k;

public final class C6715d extends C5891a {
    private String f19103a;
    private String f19104b;
    private String f19105c;
    private String f19106d;
    private Map<String, String> f19107e;
    private C2971k f19108f;
    private C2970j f19109g;

    public C6715d(String str, String str2, String str3, String str4, Map<String, String> map, C2971k c2971k, C2970j c2970j) {
        super(C2683h.f8622d);
        this.f19103a = str;
        this.f19104b = str2;
        this.f19105c = str3;
        this.f19106d = str4;
        this.f19107e = map;
        this.f19108f = c2971k;
        this.f19109g = c2970j;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRun() {
        /*
        r23 = this;
        r1 = r23;
        r2 = mobi.mmdt.ott.MyApplication.m12950a();
        r2 = r2.f15918x;
        if (r2 == 0) goto L_0x001e;
    L_0x000a:
        r2 = mobi.mmdt.ott.MyApplication.m12950a();
        r2 = r2.f15918x;
        r4 = r1.f19104b;
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x001e;
    L_0x0018:
        r2 = mobi.mmdt.ott.provider.p384f.C2971k.READ;
        r1.f19108f = r2;
        r2 = 0;
        goto L_0x001f;
    L_0x001e:
        r2 = 1;
    L_0x001f:
        r4 = r1.f19107e;
        r5 = "MAJOR_TYPE";
        r4 = r4.get(r5);
        r4 = (java.lang.String) r4;
        r4 = mobi.mmdt.ott.logic.p261a.p284f.p286b.C2656r.m7055a(r4);
        r5 = mobi.mmdt.ott.provider.p384f.C2973m.GROUP;
        r5 = r4.equals(r5);
        if (r5 != 0) goto L_0x003d;
    L_0x0035:
        r5 = mobi.mmdt.ott.provider.p384f.C2973m.CHANNEL;
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0052;
    L_0x003d:
        r4 = r1.f19103a;
        r5 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r5 = r5.m6928d();
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0052;
    L_0x004d:
        r2 = mobi.mmdt.ott.provider.p384f.C2971k.SEEN;
        r1.f19108f = r2;
        r2 = 0;
    L_0x0052:
        r4 = r1.f19104b;
        r4 = mobi.mmdt.ott.provider.p385g.C2980g.m7433a(r4);
        if (r4 == 0) goto L_0x0060;
    L_0x005a:
        r4 = r4.f9292l;
        if (r4 == 0) goto L_0x0060;
    L_0x005e:
        r11 = 0;
        goto L_0x0061;
    L_0x0060:
        r11 = r2;
    L_0x0061:
        r5 = r1.f19103a;
        r6 = r1.f19104b;
        r7 = r1.f19105c;
        r8 = r1.f19106d;
        r9 = r1.f19107e;
        r10 = r1.f19108f;
        r12 = r1.f19109g;
        r2 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C2668c.m7060a(r5, r6, r7, r8, r9, r10, r11, r12);
        r4 = r2.f8227a;	 Catch:{ a -> 0x020a }
        r5 = r2.f8228b;	 Catch:{ a -> 0x020a }
        r6 = r2.f8229c;	 Catch:{ a -> 0x020a }
        r7 = r2.f8230d;	 Catch:{ a -> 0x020a }
        r9 = r2.f8231e;	 Catch:{ a -> 0x020a }
        r11 = r2.f8232f;	 Catch:{ a -> 0x020a }
        r12 = r2.f8233g;	 Catch:{ a -> 0x020a }
        r13 = r2.f8234h;	 Catch:{ a -> 0x020a }
        r14 = r2.f8235i;	 Catch:{ a -> 0x020a }
        r15 = r2.f8236j;	 Catch:{ a -> 0x020a }
        r3 = r2.f8237k;	 Catch:{ a -> 0x020a }
        r1 = r2.f8238l;	 Catch:{ a -> 0x0206 }
        r21 = r1;
        r1 = r2.f8239m;	 Catch:{ a -> 0x0206 }
        r19 = 0;
        r22 = r1;
        r1 = r2.f8243q;	 Catch:{ a -> 0x0206 }
        r16 = r3;
        r17 = r21;
        r18 = r22;
        r20 = r1;
        mobi.mmdt.ott.provider.p384f.C2966b.m7397a(r4, r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);	 Catch:{ a -> 0x0206 }
        r1 = r2.f8234h;	 Catch:{ a -> 0x0206 }
        r1 = mobi.mmdt.ott.provider.p385g.C2980g.m7439b(r1);	 Catch:{ a -> 0x0206 }
        if (r1 == 0) goto L_0x00bc;
    L_0x00a8:
        r1 = r2.f8234h;	 Catch:{ a -> 0x00b6 }
        r3 = r2.f8227a;	 Catch:{ a -> 0x00b6 }
        r4 = r2.f8230d;	 Catch:{ a -> 0x00b6 }
        r4 = java.lang.Long.valueOf(r4);	 Catch:{ a -> 0x00b6 }
        mobi.mmdt.ott.provider.p385g.C2980g.m7424a(r1, r3, r4);	 Catch:{ a -> 0x00b6 }
        goto L_0x00d8;
    L_0x00b6:
        r0 = move-exception;
        r2 = r0;
        r1 = r23;
        goto L_0x020c;
    L_0x00bc:
        r1 = r2.f8235i;	 Catch:{ a -> 0x0206 }
        r3 = mobi.mmdt.ott.provider.p384f.C2973m.SINGLE;	 Catch:{ a -> 0x0206 }
        r1 = r1.equals(r3);	 Catch:{ a -> 0x0206 }
        if (r1 == 0) goto L_0x00d8;
    L_0x00c6:
        r3 = r2.f8234h;	 Catch:{ a -> 0x00b6 }
        r4 = r2.f8231e;	 Catch:{ a -> 0x00b6 }
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r9 = r2.f8227a;	 Catch:{ a -> 0x00b6 }
        r10 = r2.f8231e;	 Catch:{ a -> 0x00b6 }
        r10 = java.lang.Long.valueOf(r10);	 Catch:{ a -> 0x00b6 }
        mobi.mmdt.ott.provider.p385g.C2980g.m7427a(r3, r4, r6, r7, r8, r9, r10);	 Catch:{ a -> 0x00b6 }
    L_0x00d8:
        r1 = r2.f8235i;	 Catch:{ a -> 0x0206 }
        r3 = mobi.mmdt.ott.provider.p384f.C2973m.BOT;	 Catch:{ a -> 0x0206 }
        r1 = r1.equals(r3);	 Catch:{ a -> 0x0206 }
        if (r1 == 0) goto L_0x0116;
    L_0x00e2:
        r1 = r23;
        r3 = r1.f19107e;	 Catch:{ Exception -> 0x010e }
        r4 = "KEYBOARD_DATA";
        r3 = r3.containsKey(r4);	 Catch:{ Exception -> 0x010e }
        if (r3 == 0) goto L_0x0118;
    L_0x00ee:
        r3 = new java.lang.String;	 Catch:{ Exception -> 0x010e }
        r4 = r1.f19107e;	 Catch:{ Exception -> 0x010e }
        r5 = "KEYBOARD_DATA";
        r4 = r4.get(r5);	 Catch:{ Exception -> 0x010e }
        r4 = (java.lang.String) r4;	 Catch:{ Exception -> 0x010e }
        r4 = r4.getBytes();	 Catch:{ Exception -> 0x010e }
        r5 = 0;
        r4 = android.util.Base64.decode(r4, r5);	 Catch:{ Exception -> 0x010e }
        r3.<init>(r4);	 Catch:{ Exception -> 0x010e }
        r4 = r1.f19104b;	 Catch:{ Exception -> 0x010e }
        r5 = r2.f8229c;	 Catch:{ Exception -> 0x010e }
        mobi.mmdt.ott.logic.p261a.p277c.C2630a.m7047a(r4, r5, r3);	 Catch:{ Exception -> 0x010e }
        goto L_0x0118;
    L_0x010e:
        r0 = move-exception;
        r3 = r0;
        r4 = "Error in bot keyboard";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6737b(r4, r3);	 Catch:{ a -> 0x020a }
        goto L_0x0118;
    L_0x0116:
        r1 = r23;
    L_0x0118:
        r3 = r2.f8232f;	 Catch:{ a -> 0x020a }
        r4 = mobi.mmdt.ott.provider.p384f.C2970j.IN;	 Catch:{ a -> 0x020a }
        r3 = r3.equals(r4);	 Catch:{ a -> 0x020a }
        if (r3 == 0) goto L_0x0127;
    L_0x0122:
        r3 = r2.f8234h;	 Catch:{ a -> 0x020a }
        mobi.mmdt.ott.provider.p385g.C2980g.m7450k(r3);	 Catch:{ a -> 0x020a }
    L_0x0127:
        r3 = mobi.mmdt.ott.MyApplication.m12950a();	 Catch:{ a -> 0x020a }
        r3 = r3.f15918x;	 Catch:{ a -> 0x020a }
        if (r3 == 0) goto L_0x0142;
    L_0x012f:
        r3 = mobi.mmdt.ott.MyApplication.m12950a();	 Catch:{ a -> 0x020a }
        r3 = r3.f15918x;	 Catch:{ a -> 0x020a }
        r4 = r1.f19104b;	 Catch:{ a -> 0x020a }
        r3 = r3.equals(r4);	 Catch:{ a -> 0x020a }
        if (r3 == 0) goto L_0x0142;
    L_0x013d:
        r3 = r1.f19104b;	 Catch:{ a -> 0x020a }
        mobi.mmdt.ott.provider.p384f.C2966b.m7416g(r3);	 Catch:{ a -> 0x020a }
    L_0x0142:
        r3 = r2.f8240n;
        if (r3 == 0) goto L_0x0167;
    L_0x0146:
        r3 = new mobi.mmdt.ott.logic.a.g.b.a;
        r4 = r2.f8242p;
        r5 = r2.f8240n;
        r6 = r2.f8241o;
        r3.<init>(r4, r5, r6);
        r4 = r3.f8607b;
        r5 = r3.f8606a;
        r6 = r2.f8227a;
        r7 = r3.f8608c;
        r8 = 0;
        mobi.mmdt.ott.logic.p261a.p287g.p293b.C6729f.m17190a(r4, r5, r6, r7, r8);
        r4 = new mobi.mmdt.ott.logic.a.g.b.f;
        r5 = r2.f8227a;
        r4.<init>(r5, r3);
        mobi.mmdt.ott.logic.C2808d.m7148b(r4);
    L_0x0167:
        r3 = new java.util.HashSet;
        r3.<init>();
        r4 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6715d.C26691.f8594a;
        r5 = r2.f8235i;
        r5 = r5.ordinal();
        r4 = r4[r5];
        switch(r4) {
            case 1: goto L_0x01a2;
            case 2: goto L_0x0192;
            case 3: goto L_0x017f;
            default: goto L_0x0179;
        };
    L_0x0179:
        r4 = r2.f8236j;
        r3.add(r4);
        goto L_0x01b9;
    L_0x017f:
        r4 = r2.f8234h;
        r4 = mobi.mmdt.ott.provider.p385g.C2980g.m7439b(r4);
        if (r4 != 0) goto L_0x01b9;
    L_0x0187:
        r4 = new mobi.mmdt.ott.logic.a.c.b;
        r5 = r2.f8234h;
        r4.<init>(r5);
        mobi.mmdt.ott.logic.C2808d.m7148b(r4);
        goto L_0x01b9;
    L_0x0192:
        r4 = r2.f8234h;
        r4 = mobi.mmdt.ott.provider.p385g.C2980g.m7439b(r4);
        if (r4 != 0) goto L_0x01b9;
    L_0x019a:
        r4 = new mobi.mmdt.ott.logic.a.f.b.i;
        r5 = r2.f8234h;
        r4.<init>(r5);
        goto L_0x01b6;
    L_0x01a2:
        r4 = r2.f8236j;
        r3.add(r4);
        r4 = r2.f8234h;
        r4 = mobi.mmdt.ott.provider.p385g.C2980g.m7439b(r4);
        if (r4 != 0) goto L_0x01b9;
    L_0x01af:
        r4 = new mobi.mmdt.ott.logic.a.r.a.b.d;
        r5 = r2.f8234h;
        r4.<init>(r5);
    L_0x01b6:
        mobi.mmdt.ott.logic.C2808d.m7149c(r4);
    L_0x01b9:
        r4 = r3.size();
        if (r4 <= 0) goto L_0x01d4;
    L_0x01bf:
        r4 = new mobi.mmdt.ott.logic.a.aa.b;
        r5 = r3.size();
        r5 = new java.lang.String[r5];
        r3 = r3.toArray(r5);
        r3 = (java.lang.String[]) r3;
        r5 = 0;
        r4.<init>(r3, r5, r5);
        mobi.mmdt.ott.logic.C2808d.m7149c(r4);
    L_0x01d4:
        r3 = r2.f8228b;
        r4 = mobi.mmdt.ott.provider.p384f.C2972l.TEXT;
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x01ea;
    L_0x01de:
        r3 = new mobi.mmdt.ott.logic.a.w.a.a;
        r4 = r2.f8227a;
        r5 = r2.f8229c;
        r3.<init>(r4, r5);
        mobi.mmdt.ott.logic.C2808d.m7148b(r3);
    L_0x01ea:
        r3 = r2.f8228b;
        r4 = mobi.mmdt.ott.provider.p384f.C2972l.TEXT;
        r3 = r3.equals(r4);
        if (r3 != 0) goto L_0x0205;
    L_0x01f4:
        r3 = r2.f8237k;
        if (r3 == 0) goto L_0x0205;
    L_0x01f8:
        r3 = mobi.mmdt.ott.logic.p261a.af.C2609f.m7041a();
        r2 = r2.f8237k;
        r4 = r2.longValue();
        r3.m7043a(r4);
    L_0x0205:
        return;
    L_0x0206:
        r0 = move-exception;
        r1 = r23;
        goto L_0x020b;
    L_0x020a:
        r0 = move-exception;
    L_0x020b:
        r2 = r0;
    L_0x020c:
        r3 = "Handled ConversationExistException";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6737b(r3, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.g.a.b.d.onRun():void");
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
