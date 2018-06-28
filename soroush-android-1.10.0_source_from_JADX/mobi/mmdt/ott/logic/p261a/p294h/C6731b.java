package mobi.mmdt.ott.logic.p261a.p294h;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.logic.core.C2800c;
import mobi.mmdt.ott.logic.core.C2800c.C2799a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p348e.C2810a.C2809a;
import mobi.mmdt.ott.logic.p348e.C5981b.C2811a;

public final class C6731b extends C5891a {

    static /* synthetic */ class C26821 {
        static final /* synthetic */ int[] f8617a = new int[C2809a.m7150a().length];
        static final /* synthetic */ int[] f8618b = new int[C2811a.m7151a().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = mobi.mmdt.ott.logic.p348e.C5981b.C2811a.m7151a();
            r0 = r0.length;
            r0 = new int[r0];
            f8618b = r0;
            r0 = 1;
            r1 = f8618b;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = mobi.mmdt.ott.logic.p348e.C5981b.C2811a.f8883a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = 2;
            r2 = f8618b;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = mobi.mmdt.ott.logic.p348e.C5981b.C2811a.f8884b;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = r3 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r2 = mobi.mmdt.ott.logic.p348e.C2810a.C2809a.m7150a();
            r2 = r2.length;
            r2 = new int[r2];
            f8617a = r2;
            r2 = f8617a;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r3 = mobi.mmdt.ott.logic.p348e.C2810a.C2809a.f8874b;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r3 = r3 - r0;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r2[r3] = r0;	 Catch:{ NoSuchFieldError -> 0x0029 }
        L_0x0029:
            r2 = f8617a;	 Catch:{ NoSuchFieldError -> 0x0030 }
            r3 = mobi.mmdt.ott.logic.p348e.C2810a.C2809a.f8873a;	 Catch:{ NoSuchFieldError -> 0x0030 }
            r3 = r3 - r0;	 Catch:{ NoSuchFieldError -> 0x0030 }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x0030 }
        L_0x0030:
            r1 = f8617a;	 Catch:{ NoSuchFieldError -> 0x0038 }
            r2 = mobi.mmdt.ott.logic.p348e.C2810a.C2809a.f8875c;	 Catch:{ NoSuchFieldError -> 0x0038 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0038 }
            r3 = 3;	 Catch:{ NoSuchFieldError -> 0x0038 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0038 }
        L_0x0038:
            r1 = f8617a;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = mobi.mmdt.ott.logic.p348e.C2810a.C2809a.f8876d;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r0 = 4;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.h.b.1.<clinit>():void");
        }
    }

    public C6731b() {
        super(C2683h.f8621c);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRun() {
        /*
        r17 = this;
        r0 = mobi.mmdt.ott.MyApplication.m12952b();
        r0 = mobi.mmdt.componentsutils.p232b.C2474a.m6718b(r0);
        if (r0 != 0) goto L_0x0014;
    L_0x000a:
        r0 = mobi.mmdt.ott.MyApplication.m12950a();
        r1 = mobi.mmdt.ott.logic.p360l.C2845b.WAITING_FOR_NETWORK;
        r0.m12958a(r1);
        return;
    L_0x0014:
        r0 = mobi.mmdt.ott.logic.p360l.C5996e.m13260a();
        r0 = r0.f16147a;
        r1 = 1;
        r0 = r0.m7105a(r1);
        if (r0 == 0) goto L_0x002b;
    L_0x0021:
        r0 = mobi.mmdt.ott.MyApplication.m12950a();
        r1 = mobi.mmdt.ott.logic.p360l.C2845b.CONNECTED;
        r0.m12958a(r1);
        return;
    L_0x002b:
        r0 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r0 = r0.m6907S();
        if (r0 == 0) goto L_0x011d;
    L_0x0035:
        r2 = new mobi.mmdt.ott.logic.core.a.b;
        r2.<init>(r0);
        r0 = r2.f8836a;
        r2 = r0.size();
        if (r2 != 0) goto L_0x0053;
    L_0x0042:
        r0 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r0.m6969s(r1);
        r0 = mobi.mmdt.ott.logic.core.C2800c.m7135a();
        r1 = mobi.mmdt.ott.logic.core.C2800c.C2799a.f8851c;
        r0.m7139b(r1);
        return;
    L_0x0053:
        r0 = r0.iterator();
    L_0x0057:
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x011d;
    L_0x005d:
        r2 = r0.next();
        r2 = (mobi.mmdt.ott.logic.p348e.C5981b) r2;
        r15 = new mobi.mmdt.ott.c.a;
        r4 = r2.f8880c;
        r5 = r2.f8881d;
        r6 = r2.f8878a;
        r7 = r2.f16131g;
        r8 = r2.f8879b;
        r3 = r2.f8882e;
        r9 = mobi.mmdt.ott.logic.p261a.p294h.C6731b.C26821.f8617a;
        r3 = r3 - r1;
        r3 = r9[r3];
        r16 = 0;
        switch(r3) {
            case 1: goto L_0x0087;
            case 2: goto L_0x0084;
            case 3: goto L_0x0081;
            case 4: goto L_0x007e;
            default: goto L_0x007b;
        };
    L_0x007b:
        r9 = r16;
        goto L_0x008a;
    L_0x007e:
        r3 = mobi.mmdt.ott.p240c.C2515a.C2506b.f8186d;
        goto L_0x0089;
    L_0x0081:
        r3 = mobi.mmdt.ott.p240c.C2515a.C2506b.f8185c;
        goto L_0x0089;
    L_0x0084:
        r3 = mobi.mmdt.ott.p240c.C2515a.C2506b.f8183a;
        goto L_0x0089;
    L_0x0087:
        r3 = mobi.mmdt.ott.p240c.C2515a.C2506b.f8184b;
    L_0x0089:
        r9 = r3;
    L_0x008a:
        r10 = r2.f16130f;
        r11 = r2.f16133i;
        r12 = r2.f16132h;
        r2 = r2.f16134j;
        r3 = mobi.mmdt.ott.logic.p261a.p294h.C6731b.C26821.f8618b;
        r2 = r2 - r1;
        r2 = r3[r2];
        switch(r2) {
            case 1: goto L_0x00a0;
            case 2: goto L_0x009d;
            default: goto L_0x009a;
        };
    L_0x009a:
        r14 = r16;
        goto L_0x00a3;
    L_0x009d:
        r2 = mobi.mmdt.ott.p240c.C2515a.C5770a.f8181b;
        goto L_0x00a2;
    L_0x00a0:
        r2 = mobi.mmdt.ott.p240c.C2515a.C5770a.f8180a;
    L_0x00a2:
        r14 = r2;
    L_0x00a3:
        r3 = r15;
        r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r14);
        r2 = r15.f8198c;
        if (r2 == 0) goto L_0x00d5;
    L_0x00ab:
        r2 = r15.f8199d;
        if (r2 == 0) goto L_0x00d5;
    L_0x00af:
        r2 = r15.f8196a;
        if (r2 != 0) goto L_0x00b4;
    L_0x00b3:
        goto L_0x00d5;
    L_0x00b4:
        r2 = r15.f8198c;
        r3 = "null";
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x00d5;
    L_0x00be:
        r2 = r15.f8199d;
        r3 = "null";
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x00d5;
    L_0x00c8:
        r2 = r15.f8196a;
        r3 = "null";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x00d3;
    L_0x00d2:
        goto L_0x00d5;
    L_0x00d3:
        r16 = r1;
    L_0x00d5:
        if (r16 != 0) goto L_0x00e0;
    L_0x00d7:
        r2 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r2.m6969s(r1);
        goto L_0x0057;
    L_0x00e0:
        r0 = mobi.mmdt.ott.MyApplication.m12950a();
        r1 = mobi.mmdt.ott.logic.p360l.C2845b.CONNECTING;
        r0.m12958a(r1);
        r0 = mobi.mmdt.ott.logic.p360l.C5996e.m13260a();
        r1 = mobi.mmdt.ott.MyApplication.m12952b();
        r2 = r0.f16147a;
        r3 = r2.f8810b;
        if (r3 != 0) goto L_0x0100;
    L_0x00f7:
        r2.f8810b = r0;
        r3 = r2.f8811c;
        r2 = r2.f8810b;
        r3.mo2150a(r2);
    L_0x0100:
        r0 = r0.f16147a;
        r0.f8809a = r15;
        r0 = r0.f8811c;
        r0.mo2148a(r15, r1);
        r0 = mobi.mmdt.ott.MyApplication.m12950a();
        r1 = mobi.mmdt.ott.logic.p360l.C2845b.CONNECTED;
        r0.m12958a(r1);
        r0 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r1 = mobi.mmdt.ott.logic.C2778b.m7093a();
        r0.m6926c(r1);
    L_0x011d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.h.b.onRun():void");
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C2480b.m6737b("ConnectChatServerJob shouldReRunOnThrowable", th);
        C2800c.m7135a().m7139b(C2799a.f8850b);
        return C1073q.f3504b;
    }
}
