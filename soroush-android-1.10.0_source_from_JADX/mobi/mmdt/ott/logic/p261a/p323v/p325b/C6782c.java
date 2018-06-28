package mobi.mmdt.ott.logic.p261a.p323v.p325b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;

public final class C6782c extends C5891a {
    private String f19364a;
    private long f19365b;

    public C6782c(String str, long j) {
        super(C2683h.f8620b);
        this.f19364a = str;
        this.f19365b = j;
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
        r25 = this;
        r1 = r25;
        r2 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        java.lang.Thread.sleep(r2);
        r2 = new mobi.mmdt.ott.logic.a.aa.b;
        r3 = 1;
        r4 = new java.lang.String[r3];
        r5 = r1.f19364a;
        r6 = 0;
        r4[r6] = r5;
        r2.<init>(r4, r3, r6);
        r2.onRun();
        r2 = r1.f19364a;
        r2 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r2);
        r4 = "";
        r5 = r2.f9425k;
        if (r5 == 0) goto L_0x0026;
    L_0x0023:
        r4 = r2.f9425k;
        goto L_0x002c;
    L_0x0026:
        r5 = r2.f9416b;
        if (r5 == 0) goto L_0x002c;
    L_0x002a:
        r4 = r2.f9416b;
    L_0x002c:
        r5 = new java.lang.StringBuilder;
        r7 = "0_first_message_";
        r5.<init>(r7);
        r7 = r1.f19364a;
        r5.append(r7);
        r5 = r5.toString();
        r9 = mobi.mmdt.ott.provider.p384f.C2972l.REPORT;	 Catch:{ a -> 0x0098 }
        r7 = 2131690111; // 0x7f0f027f float:1.9009256E38 double:1.0531948514E-314;	 Catch:{ a -> 0x0098 }
        r7 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r7);	 Catch:{ a -> 0x0098 }
        r3 = new java.lang.Object[r3];	 Catch:{ a -> 0x0098 }
        r3[r6] = r4;	 Catch:{ a -> 0x0098 }
        r10 = java.lang.String.format(r7, r3);	 Catch:{ a -> 0x0098 }
        r11 = r1.f19365b;	 Catch:{ a -> 0x0098 }
        r13 = r1.f19365b;	 Catch:{ a -> 0x0098 }
        r15 = mobi.mmdt.ott.provider.p384f.C2970j.IN;	 Catch:{ a -> 0x0098 }
        r16 = mobi.mmdt.ott.provider.p384f.C2971k.NOT_READ;	 Catch:{ a -> 0x0098 }
        r3 = r1.f19364a;	 Catch:{ a -> 0x0098 }
        r18 = mobi.mmdt.ott.provider.p384f.C2973m.SINGLE;	 Catch:{ a -> 0x0098 }
        r4 = r1.f19364a;	 Catch:{ a -> 0x0098 }
        r20 = 0;	 Catch:{ a -> 0x0098 }
        r21 = 0;	 Catch:{ a -> 0x0098 }
        r22 = 0;	 Catch:{ a -> 0x0098 }
        r23 = 0;	 Catch:{ a -> 0x0098 }
        r24 = 1;	 Catch:{ a -> 0x0098 }
        r8 = r5;	 Catch:{ a -> 0x0098 }
        r17 = r3;	 Catch:{ a -> 0x0098 }
        r19 = r4;	 Catch:{ a -> 0x0098 }
        mobi.mmdt.ott.provider.p384f.C2966b.m7397a(r8, r9, r10, r11, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);	 Catch:{ a -> 0x0098 }
        r3 = r2.f9418d;	 Catch:{ a -> 0x0098 }
        r3 = mobi.mmdt.ott.provider.p385g.C2980g.m7439b(r3);	 Catch:{ a -> 0x0098 }
        if (r3 == 0) goto L_0x0086;	 Catch:{ a -> 0x0098 }
    L_0x0075:
        r3 = r2.f9418d;	 Catch:{ a -> 0x0098 }
        r6 = r1.f19365b;	 Catch:{ a -> 0x0098 }
        r4 = java.lang.Long.valueOf(r6);	 Catch:{ a -> 0x0098 }
        mobi.mmdt.ott.provider.p385g.C2980g.m7424a(r3, r5, r4);	 Catch:{ a -> 0x0098 }
        r2 = r2.f9418d;	 Catch:{ a -> 0x0098 }
        mobi.mmdt.ott.provider.p385g.C2980g.m7450k(r2);	 Catch:{ a -> 0x0098 }
        return;
    L_0x0086:
        r8 = r2.f9418d;	 Catch:{ b -> 0x0097 }
        r9 = r1.f19365b;	 Catch:{ b -> 0x0097 }
        r11 = 0;	 Catch:{ b -> 0x0097 }
        r12 = 0;	 Catch:{ b -> 0x0097 }
        r13 = 1;	 Catch:{ b -> 0x0097 }
        r2 = r1.f19365b;	 Catch:{ b -> 0x0097 }
        r15 = java.lang.Long.valueOf(r2);	 Catch:{ b -> 0x0097 }
        r14 = r5;	 Catch:{ b -> 0x0097 }
        mobi.mmdt.ott.provider.p385g.C2980g.m7427a(r8, r9, r11, r12, r13, r14, r15);	 Catch:{ b -> 0x0097 }
    L_0x0097:
        return;
    L_0x0098:
        r0 = move-exception;
        r2 = r0;
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6738b(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.v.b.c.onRun():void");
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
