package p050b.p051a.p053b;

import p050b.p051a.C0815e;
import p050b.p051a.p053b.C0810a.C0808c;
import p050b.p051a.p053b.C0811d.C4946e;

public final class C4948f extends C0810a {
    public int f13777g;
    public int f13778h;
    public C0811d[] f13779i = null;
    public C0811d[] f13780j;

    public static class C4947a extends C0808c {
        protected final C0810a mo857a(int i) {
            return new C4948f(i);
        }

        protected final C0810a[] mo858b(int i) {
            return new C4948f[i];
        }
    }

    protected C4948f(int i) {
        super(i);
    }

    private static int m9660a(String str, int i, int i2, C0811d[] c0811dArr) {
        char charAt = str.charAt(i);
        int i3 = 0;
        if (charAt == ')') {
            return 0;
        }
        int i4 = i;
        while (charAt == '[') {
            i3++;
            i4++;
            charAt = str.charAt(i4);
        }
        if (charAt == 'L') {
            int indexOf = str.indexOf(59, i4 + 1);
            if (i3 > 0) {
                indexOf++;
                c0811dArr[i2] = new C4946e(str.substring(i, indexOf));
                return indexOf;
            }
            indexOf++;
            c0811dArr[i2] = new C4946e(str.substring(i + 1, indexOf - 1).replace('/', '.'));
            return indexOf;
        } else if (i3 > 0) {
            i4++;
            c0811dArr[i2] = new C4946e(str.substring(i, i4));
            return i4;
        } else {
            C0811d c0811d;
            if (charAt != 'F') {
                if (!(charAt == 'S' || charAt == 'Z')) {
                    switch (charAt) {
                        case 'B':
                        case 'C':
                            break;
                        case 'D':
                            c0811d = C0812e.f2438j;
                            break;
                        default:
                            switch (charAt) {
                                case 'I':
                                    break;
                                case 'J':
                                    c0811d = C0812e.f2439k;
                                    break;
                                default:
                                    c0811d = null;
                                    break;
                            }
                    }
                }
                c0811d = C0812e.f2436h;
            } else {
                c0811d = C0812e.f2437i;
            }
            if (c0811d == null) {
                StringBuilder stringBuilder = new StringBuilder("bad method descriptor: ");
                stringBuilder.append(str);
                throw new C0815e(stringBuilder.toString());
            }
            c0811dArr[i2] = c0811d;
            return i4 + 1;
        }
    }

    private static void m9661a(StringBuffer stringBuffer, int i, C0811d[] c0811dArr) {
        if (c0811dArr != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 > 0) {
                    stringBuffer.append(", ");
                }
                Object obj = c0811dArr[i2];
                stringBuffer.append(obj == null ? "<>" : obj.toString());
            }
        }
    }

    public static p050b.p051a.p053b.C4948f[] m9662a(p050b.p051a.an r10, p050b.p051a.C4956l r11) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = new b.a.b.f$a;
        r0.<init>();
        r0 = r0.m1786a(r10);
        r0 = (p050b.p051a.p053b.C4948f[]) r0;
        r1 = 0;
        r2 = 2;
        r3 = r0.length;
        if (r3 >= r2) goto L_0x001b;
    L_0x0010:
        r2 = r0.length;
        if (r2 == 0) goto L_0x0019;
    L_0x0013:
        r2 = r0[r1];
        r2 = r2.c;
        if (r2 != 0) goto L_0x001b;
    L_0x0019:
        r10 = 0;
        return r10;
    L_0x001b:
        r2 = r10.f2404a;
        r3 = r10.f2405b;
        r3 = r3 & 8;
        r4 = 1;
        if (r3 == 0) goto L_0x0026;
    L_0x0024:
        r3 = r4;
        goto L_0x0027;
    L_0x0026:
        r3 = r1;
    L_0x0027:
        r5 = r0[r1];
        r6 = r11.f13798d;
        r11 = r11.f13799e;
        r2 = r2.m1876a();
        r7 = r10.m1750d();
        r10 = r10.m1748b();
        r8 = r7.charAt(r1);
        r9 = 40;
        if (r8 == r9) goto L_0x0055;
    L_0x0041:
        r10 = new b.a.e;
        r11 = new java.lang.StringBuilder;
        r0 = "no method descriptor: ";
        r11.<init>(r0);
        r11.append(r7);
        r11 = r11.toString();
        r10.<init>(r11);
        throw r10;
    L_0x0055:
        r5.f13777g = r1;
        r6 = p050b.p051a.p053b.C0811d.m1791a(r6);
        r5.f13780j = r6;
        r11 = p050b.p051a.p053b.C0811d.m1791a(r11);
        if (r10 == 0) goto L_0x006b;
    L_0x0063:
        r10 = new b.a.b.d$i;
        r10.<init>(r2);
        r11[r1] = r10;
        goto L_0x0074;
    L_0x006b:
        if (r3 != 0) goto L_0x0074;
    L_0x006d:
        r10 = new b.a.b.d$e;
        r10.<init>(r2);
        r11[r1] = r10;
    L_0x0074:
        if (r3 == 0) goto L_0x0077;
    L_0x0076:
        r1 = -1;
    L_0x0077:
        r10 = r4;
    L_0x0078:
        r1 = r1 + r4;
        r10 = p050b.p051a.p053b.C4948f.m9660a(r7, r10, r1, r11);	 Catch:{ StringIndexOutOfBoundsException -> 0x0093 }
        if (r10 <= 0) goto L_0x008e;	 Catch:{ StringIndexOutOfBoundsException -> 0x0093 }
    L_0x007f:
        r2 = r11[r1];	 Catch:{ StringIndexOutOfBoundsException -> 0x0093 }
        r2 = r2.mo855d();	 Catch:{ StringIndexOutOfBoundsException -> 0x0093 }
        if (r2 == 0) goto L_0x0078;	 Catch:{ StringIndexOutOfBoundsException -> 0x0093 }
    L_0x0087:
        r1 = r1 + 1;	 Catch:{ StringIndexOutOfBoundsException -> 0x0093 }
        r2 = p050b.p051a.p053b.C0812e.f2435g;	 Catch:{ StringIndexOutOfBoundsException -> 0x0093 }
        r11[r1] = r2;	 Catch:{ StringIndexOutOfBoundsException -> 0x0093 }
        goto L_0x0078;
    L_0x008e:
        r5.f13778h = r1;
        r5.f13779i = r11;
        return r0;
    L_0x0093:
        r10 = new b.a.e;
        r11 = new java.lang.StringBuilder;
        r0 = "bad method descriptor: ";
        r11.<init>(r0);
        r11.append(r7);
        r11 = r11.toString();
        r10.<init>(r11);
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.b.f.a(b.a.an, b.a.l):b.a.b.f[]");
    }

    protected final void mo859a(StringBuffer stringBuffer) {
        super.mo859a(stringBuffer);
        stringBuffer.append(",\n stack={");
        C4948f.m9661a(stringBuffer, this.f13777g, this.f13780j);
        stringBuffer.append("}, locals={");
        C4948f.m9661a(stringBuffer, this.f13778h, this.f13779i);
        stringBuffer.append('}');
    }

    public final boolean m9664a() {
        return this.f13779i != null;
    }

    public final void m9665b() {
        if (this.f13779i != null) {
            int length = this.f13779i.length;
            while (length > 0 && this.f13779i[length - 1].mo854c() == C0812e.f2435g && (length <= 1 || !this.f13779i[length - 2].mo855d())) {
                length--;
            }
            this.f13778h = length;
        }
    }
}
