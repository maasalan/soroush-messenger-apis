package android.support.v4.p031b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v4.p029a.p030a.C4761a.C0341c;
import android.support.v4.p029a.p030a.C4761a.C4762b;
import android.support.v4.p031b.C0438c.C0437a;
import android.support.v4.p036e.C0449b.C0448b;

class C4804g implements C0437a {

    private interface C0439a<T> {
        boolean mo289a(T t);

        int mo290b(T t);
    }

    class C48021 implements C0439a<C0448b> {
        final /* synthetic */ C4804g f13382a;

        C48021(C4804g c4804g) {
            this.f13382a = c4804g;
        }

        public final /* bridge */ /* synthetic */ boolean mo289a(Object obj) {
            return ((C0448b) obj).f1563d;
        }

        public final /* bridge */ /* synthetic */ int mo290b(Object obj) {
            return ((C0448b) obj).f1562c;
        }
    }

    class C48032 implements C0439a<C0341c> {
        final /* synthetic */ C4804g f13383a;

        C48032(C4804g c4804g) {
            this.f13383a = c4804g;
        }

        public final /* bridge */ /* synthetic */ boolean mo289a(Object obj) {
            return ((C0341c) obj).f1296c;
        }

        public final /* bridge */ /* synthetic */ int mo290b(Object obj) {
            return ((C0341c) obj).f1295b;
        }
    }

    C4804g() {
    }

    protected static android.graphics.Typeface m9167a(android.content.Context r1, java.io.InputStream r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = android.support.v4.p031b.C0440h.m932a(r1);
        r0 = 0;
        if (r1 != 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        r2 = android.support.v4.p031b.C0440h.m938a(r1, r2);	 Catch:{ RuntimeException -> 0x0023, all -> 0x001e }
        if (r2 != 0) goto L_0x0012;
    L_0x000e:
        r1.delete();
        return r0;
    L_0x0012:
        r2 = r1.getPath();	 Catch:{ RuntimeException -> 0x0023, all -> 0x001e }
        r2 = android.graphics.Typeface.createFromFile(r2);	 Catch:{ RuntimeException -> 0x0023, all -> 0x001e }
        r1.delete();
        return r2;
    L_0x001e:
        r2 = move-exception;
        r1.delete();
        throw r2;
    L_0x0023:
        r1.delete();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.b.g.a(android.content.Context, java.io.InputStream):android.graphics.Typeface");
    }

    private static <T> T m9168a(T[] tArr, int i, C0439a<T> c0439a) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        int i3 = Integer.MAX_VALUE;
        T t = null;
        for (T t2 : tArr) {
            int abs = (Math.abs(c0439a.mo290b(t2) - i2) * 2) + (c0439a.mo289a(t2) == z ? 0 : 1);
            if (t == null || r6 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    public android.graphics.Typeface mo291a(android.content.Context r1, android.content.res.Resources r2, int r3, java.lang.String r4, int r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = this;
        r1 = android.support.v4.p031b.C0440h.m932a(r1);
        r4 = 0;
        if (r1 != 0) goto L_0x0008;
    L_0x0007:
        return r4;
    L_0x0008:
        r2 = android.support.v4.p031b.C0440h.m937a(r1, r2, r3);	 Catch:{ RuntimeException -> 0x0023, all -> 0x001e }
        if (r2 != 0) goto L_0x0012;
    L_0x000e:
        r1.delete();
        return r4;
    L_0x0012:
        r2 = r1.getPath();	 Catch:{ RuntimeException -> 0x0023, all -> 0x001e }
        r2 = android.graphics.Typeface.createFromFile(r2);	 Catch:{ RuntimeException -> 0x0023, all -> 0x001e }
        r1.delete();
        return r2;
    L_0x001e:
        r2 = move-exception;
        r1.delete();
        throw r2;
    L_0x0023:
        r1.delete();
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.b.g.a(android.content.Context, android.content.res.Resources, int, java.lang.String, int):android.graphics.Typeface");
    }

    public Typeface mo292a(Context context, C4762b c4762b, Resources resources, int i) {
        C0341c c0341c = (C0341c) C4804g.m9168a(c4762b.f13159a, i, new C48032(this));
        return c0341c == null ? null : C0438c.m925a(context, resources, c0341c.f1297d, c0341c.f1294a, i);
    }

    public android.graphics.Typeface mo293a(android.content.Context r3, android.support.v4.p036e.C0449b.C0448b[] r4, int r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = 0;
        r1 = r4.length;
        if (r1 > 0) goto L_0x0005;
    L_0x0004:
        return r0;
    L_0x0005:
        r4 = r2.m9172a(r4, r5);
        r5 = r3.getContentResolver();	 Catch:{ IOException -> 0x0023, all -> 0x001e }
        r4 = r4.f1560a;	 Catch:{ IOException -> 0x0023, all -> 0x001e }
        r4 = r5.openInputStream(r4);	 Catch:{ IOException -> 0x0023, all -> 0x001e }
        r3 = android.support.v4.p031b.C4804g.m9167a(r3, r4);	 Catch:{ IOException -> 0x0024, all -> 0x001b }
        android.support.v4.p031b.C0440h.m936a(r4);
        return r3;
    L_0x001b:
        r3 = move-exception;
        r0 = r4;
        goto L_0x001f;
    L_0x001e:
        r3 = move-exception;
    L_0x001f:
        android.support.v4.p031b.C0440h.m936a(r0);
        throw r3;
    L_0x0023:
        r4 = r0;
    L_0x0024:
        android.support.v4.p031b.C0440h.m936a(r4);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.b.g.a(android.content.Context, android.support.v4.e.b$b[], int):android.graphics.Typeface");
    }

    protected final C0448b m9172a(C0448b[] c0448bArr, int i) {
        return (C0448b) C4804g.m9168a((Object[]) c0448bArr, i, new C48021(this));
    }
}
