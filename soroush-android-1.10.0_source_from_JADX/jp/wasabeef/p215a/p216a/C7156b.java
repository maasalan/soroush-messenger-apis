package jp.wasabeef.p215a.p216a;

public final class C7156b extends C6628a {
    private static int f20478b = 25;
    private static int f20479c = 1;
    private int f20480d;
    private int f20481e;

    public C7156b() {
        this(f20478b, f20479c);
    }

    public C7156b(int i) {
        this(i, f20479c);
    }

    private C7156b(int i, int i2) {
        this.f20480d = i;
        this.f20481e = i2;
    }

    protected final android.graphics.Bitmap mo3439a(android.content.Context r5, com.p085c.p086a.p089c.p092b.p093a.C1106e r6, android.graphics.Bitmap r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r7.getWidth();
        r1 = r7.getHeight();
        r2 = r4.f20481e;
        r0 = r0 / r2;
        r2 = r4.f20481e;
        r1 = r1 / r2;
        r2 = android.graphics.Bitmap.Config.ARGB_8888;
        r6 = r6.mo1134a(r0, r1, r2);
        r0 = new android.graphics.Canvas;
        r0.<init>(r6);
        r1 = r4.f20481e;
        r1 = (float) r1;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1 = r2 / r1;
        r3 = r4.f20481e;
        r3 = (float) r3;
        r2 = r2 / r3;
        r0.scale(r1, r2);
        r1 = new android.graphics.Paint;
        r1.<init>();
        r2 = 2;
        r1.setFlags(r2);
        r2 = 0;
        r0.drawBitmap(r7, r2, r2, r1);
        r7 = android.os.Build.VERSION.SDK_INT;
        r0 = 18;
        if (r7 < r0) goto L_0x0041;
    L_0x003a:
        r7 = r4.f20480d;	 Catch:{ RSRuntimeException -> 0x0041 }
        r5 = jp.wasabeef.p215a.p216a.p217a.C2401b.m6570a(r5, r6, r7);	 Catch:{ RSRuntimeException -> 0x0041 }
        return r5;
    L_0x0041:
        r5 = r4.f20480d;
        r5 = jp.wasabeef.p215a.p216a.p217a.C2400a.m6569a(r6, r5);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.wasabeef.a.a.b.a(android.content.Context, com.c.a.c.b.a.e, android.graphics.Bitmap):android.graphics.Bitmap");
    }

    public final String mo3440a() {
        StringBuilder stringBuilder = new StringBuilder("BlurTransformation(radius=");
        stringBuilder.append(this.f20480d);
        stringBuilder.append(", sampling=");
        stringBuilder.append(this.f20481e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
