package com.p111d.p112a.p114b.p120g;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p114b.p120g.C5300d.C5299c;

public final class C6466c extends C5299c {
    public static final String f17625a;
    public static final C6466c f17626b = new C6466c("  ", f17625a);
    private final char[] f17627d;
    private final int f17628e;
    private final String f17629f;

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "line.separator";	 Catch:{ Throwable -> 0x0007 }
        r0 = java.lang.System.getProperty(r0);	 Catch:{ Throwable -> 0x0007 }
        goto L_0x0009;
    L_0x0007:
        r0 = "\n";
    L_0x0009:
        f17625a = r0;
        r0 = new com.d.a.b.g.c;
        r1 = "  ";
        r2 = f17625a;
        r0.<init>(r1, r2);
        f17626b = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.b.g.c.<clinit>():void");
    }

    public C6466c() {
        this("  ", f17625a);
    }

    private C6466c(String str, String str2) {
        this.f17628e = str.length();
        this.f17627d = new char[(str.length() * 16)];
        int i = 0;
        int i2 = i;
        while (i < 16) {
            str.getChars(0, str.length(), this.f17627d, i2);
            i2 += str.length();
            i++;
        }
        this.f17629f = str2;
    }

    public final void mo1283a(C5301g c5301g, int i) {
        c5301g.writeRaw(this.f17629f);
        if (i > 0) {
            i *= this.f17628e;
            while (i > this.f17627d.length) {
                c5301g.writeRaw(this.f17627d, 0, this.f17627d.length);
                i -= this.f17627d.length;
            }
            c5301g.writeRaw(this.f17627d, 0, i);
        }
    }

    public final boolean mo1284a() {
        return false;
    }
}
