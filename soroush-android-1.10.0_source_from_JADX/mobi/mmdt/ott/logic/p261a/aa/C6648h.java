package mobi.mmdt.ott.logic.p261a.aa;

import com.p072b.p073a.p074a.C1073q;
import java.util.LinkedHashMap;
import java.util.Map;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;

public final class C6648h extends C5891a {
    private String[] f18922a;
    private Map<String, Long> f18923b = new LinkedHashMap();

    public C6648h(String[] strArr) {
        super(C2683h.f8621c);
        this.f18922a = strArr;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r10 = this;
        r0 = r10.f18922a;
        if (r0 != 0) goto L_0x000a;
    L_0x0004:
        r0 = new java.lang.NullPointerException;
        r0.<init>();
        throw r0;
    L_0x000a:
        r0 = mobi.mmdt.ott.logic.p360l.C5996e.m13260a();
        r0 = r0.f16147a;
        r1 = 0;
        r0 = r0.m7105a(r1);
        if (r0 != 0) goto L_0x001d;
    L_0x0017:
        r0 = new mobi.mmdt.ott.lib_webservicescomponent.c.ab;
        r0.<init>();
        throw r0;
    L_0x001d:
        r0 = r10.f18922a;
        r0 = r0.length;
        if (r0 != 0) goto L_0x0023;
    L_0x0022:
        return;
    L_0x0023:
        r0 = r10.f18922a;
        r2 = r0.length;
    L_0x0026:
        if (r1 >= r2) goto L_0x0050;
    L_0x0028:
        r3 = r0[r1];
        r4 = mobi.mmdt.ott.logic.p360l.C5996e.m13260a();	 Catch:{ d -> 0x004d, Exception -> 0x0049 }
        r4 = r4.f16147a;	 Catch:{ d -> 0x004d, Exception -> 0x0049 }
        r4 = r4.f8811c;	 Catch:{ d -> 0x004d, Exception -> 0x0049 }
        r4 = r4.mo2137a(r3);	 Catch:{ d -> 0x004d, Exception -> 0x0049 }
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ d -> 0x004d, Exception -> 0x0049 }
        r4 = r4 * r6;	 Catch:{ d -> 0x004d, Exception -> 0x0049 }
        r6 = mobi.mmdt.ott.logic.C2778b.m7093a();	 Catch:{ d -> 0x004d, Exception -> 0x0049 }
        r8 = r6 - r4;	 Catch:{ d -> 0x004d, Exception -> 0x0049 }
        r4 = r10.f18923b;	 Catch:{ d -> 0x004d, Exception -> 0x0049 }
        r5 = java.lang.Long.valueOf(r8);	 Catch:{ d -> 0x004d, Exception -> 0x0049 }
        r4.put(r3, r5);	 Catch:{ d -> 0x004d, Exception -> 0x0049 }
        goto L_0x004d;
    L_0x0049:
        r3 = move-exception;
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6738b(r3);
    L_0x004d:
        r1 = r1 + 1;
        goto L_0x0026;
    L_0x0050:
        r0 = r10.f18923b;
        r0 = r0.size();
        if (r0 == 0) goto L_0x005d;
    L_0x0058:
        r0 = r10.f18923b;
        mobi.mmdt.ott.provider.p389k.C2999a.m7503a(r0);
    L_0x005d:
        r0 = "Group Last Online : UpdateLastOnlineContactsJob onRun End";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.aa.h.onRun():void");
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
