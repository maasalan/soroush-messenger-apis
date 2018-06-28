package uk.co.p616a.p617a.p618a;

import android.annotation.TargetApi;
import android.content.Context;

@TargetApi(5)
public class C8035b extends C7995a {
    private int f25010f = -1;
    private int f25011g = 0;

    public C8035b(Context context) {
        super(context);
    }

    final float mo5009a(android.view.MotionEvent r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.f25011g;	 Catch:{ Exception -> 0x0007 }
        r0 = r2.getX(r0);	 Catch:{ Exception -> 0x0007 }
        return r0;
    L_0x0007:
        r2 = r2.getX();
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: uk.co.a.a.a.b.a(android.view.MotionEvent):float");
    }

    final float mo5010b(android.view.MotionEvent r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.f25011g;	 Catch:{ Exception -> 0x0007 }
        r0 = r2.getY(r0);	 Catch:{ Exception -> 0x0007 }
        return r0;
    L_0x0007:
        r2 = r2.getY();
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: uk.co.a.a.a.b.b(android.view.MotionEvent):float");
    }

    public boolean mo4869c(android.view.MotionEvent r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = r7.getAction();
        r0 = r0 & 255;
        r1 = 3;
        r2 = -1;
        r3 = 1;
        r4 = 0;
        if (r0 == r1) goto L_0x0046;
    L_0x000c:
        r1 = 6;
        if (r0 == r1) goto L_0x001a;
    L_0x000f:
        switch(r0) {
            case 0: goto L_0x0013;
            case 1: goto L_0x0046;
            default: goto L_0x0012;
        };
    L_0x0012:
        goto L_0x0048;
    L_0x0013:
        r0 = r7.getPointerId(r4);
        r6.f25010f = r0;
        goto L_0x0048;
    L_0x001a:
        r0 = r7.getAction();
        r1 = android.os.Build.VERSION.SDK_INT;
        r1 = 65280; // 0xff00 float:9.1477E-41 double:3.22526E-319;
        r0 = r0 & r1;
        r0 = r0 >> 8;
        r1 = r7.getPointerId(r0);
        r5 = r6.f25010f;
        if (r1 != r5) goto L_0x0048;
    L_0x002e:
        if (r0 != 0) goto L_0x0032;
    L_0x0030:
        r0 = r3;
        goto L_0x0033;
    L_0x0032:
        r0 = r4;
    L_0x0033:
        r1 = r7.getPointerId(r0);
        r6.f25010f = r1;
        r1 = r7.getX(r0);
        r6.b = r1;
        r0 = r7.getY(r0);
        r6.c = r0;
        goto L_0x0048;
    L_0x0046:
        r6.f25010f = r2;
    L_0x0048:
        r0 = r6.f25010f;
        if (r0 == r2) goto L_0x004e;
    L_0x004c:
        r4 = r6.f25010f;
    L_0x004e:
        r0 = r7.findPointerIndex(r4);
        r6.f25011g = r0;
        r7 = super.mo4869c(r7);	 Catch:{ IllegalArgumentException -> 0x0059 }
        return r7;
    L_0x0059:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: uk.co.a.a.a.b.c(android.view.MotionEvent):boolean");
    }
}
