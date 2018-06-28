package p050b.p051a.p053b;

import p050b.C0848e;
import p050b.p051a.C0817g;
import p050b.p051a.C0827p;
import p050b.p051a.C0828s;
import p050b.p051a.aa;
import p050b.p051a.ap;
import p050b.p051a.aq;
import p050b.p051a.p053b.C0811d.C4946e;
import p050b.p051a.p053b.C0811d.C6413h;
import p050b.p051a.p053b.C0811d.C6414j;

public abstract class C4943c implements C0812e {
    protected C0848e f13768a;
    protected C0827p f13769b;
    protected String f13770c;
    protected int f13771d;
    protected C0811d[] f13772e;
    protected C0811d[] f13773f;

    public C4943c(C4943c c4943c) {
        this.f13768a = c4943c.f13768a;
        this.f13769b = c4943c.f13769b;
        this.f13770c = c4943c.f13770c;
        this.f13771d = c4943c.f13771d;
        this.f13772e = C0811d.m1791a(c4943c.f13772e.length);
        this.f13773f = C0811d.m1791a(c4943c.f13773f.length);
    }

    public C4943c(C0848e c0848e, C0827p c0827p, int i, int i2, String str) {
        this.f13768a = c0848e;
        this.f13769b = c0827p;
        this.f13770c = str;
        this.f13771d = 0;
        this.f13772e = C0811d.m1791a(i);
        this.f13773f = C0811d.m1791a(i2);
    }

    private int m9622a(int i, C0811d c0811d) {
        this.f13771d--;
        this.f13773f[i] = c0811d;
        if (c0811d.mo855d()) {
            this.f13771d--;
            this.f13773f[i + 1] = g;
        }
        return 2;
    }

    private int m9623a(int i, byte[] bArr, C0811d c0811d) {
        return m9622a(bArr[i + 1] & 255, c0811d);
    }

    private int m9624a(int i, byte[] bArr, boolean z) {
        i = C0817g.m1832a(bArr, i + 1);
        String d = this.f13769b.m1886d(i);
        this.f13771d -= C0828s.m1906d(d);
        char charAt = d.charAt(0);
        if (charAt == 'L') {
            this.f13772e[this.f13771d].mo852a(C4943c.m9626a(d, 0), this.f13768a);
        } else if (charAt == '[') {
            this.f13772e[this.f13771d].mo852a(d, this.f13768a);
        }
        m9631a(z, i);
        return 3;
    }

    private int m9625a(C0811d c0811d) {
        C0811d[] c0811dArr = this.f13772e;
        int i = this.f13771d;
        this.f13771d = i + 1;
        c0811dArr[i] = c0811d;
        if (c0811d.mo855d()) {
            C0811d[] c0811dArr2 = this.f13772e;
            int i2 = this.f13771d;
            this.f13771d = i2 + 1;
            c0811dArr2[i2] = g;
        }
        return 2;
    }

    private static String m9626a(String str, int i) {
        return str.substring(i + 1, str.length() - 1).replace('/', '.');
    }

    private void m9627a(int i) {
        C0811d[] c0811dArr = this.f13772e;
        i = this.f13769b.m1878b(i);
        if (i == 8) {
            i = this.f13771d;
            this.f13771d = i + 1;
            c0811dArr[i] = new C4946e("java.lang.String");
        } else if (i == 3) {
            i = this.f13771d;
            this.f13771d = i + 1;
            c0811dArr[i] = h;
        } else if (i == 4) {
            i = this.f13771d;
            this.f13771d = i + 1;
            c0811dArr[i] = i;
        } else if (i == 5) {
            i = this.f13771d;
            this.f13771d = i + 1;
            c0811dArr[i] = k;
            i = this.f13771d;
            this.f13771d = i + 1;
            c0811dArr[i] = g;
        } else if (i == 6) {
            i = this.f13771d;
            this.f13771d = i + 1;
            c0811dArr[i] = j;
            i = this.f13771d;
            this.f13771d = i + 1;
            c0811dArr[i] = g;
        } else if (i == 7) {
            i = this.f13771d;
            this.f13771d = i + 1;
            c0811dArr[i] = new C4946e("java.lang.Class");
        } else {
            StringBuilder stringBuilder = new StringBuilder("bad LDC: ");
            stringBuilder.append(i);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void m9628a(int i, int i2) {
        C0811d[] c0811dArr = this.f13772e;
        int i3 = this.f13771d - 1;
        i2 = i3 - i2;
        while (i3 > i2) {
            c0811dArr[i3 + i] = c0811dArr[i3];
            i3--;
        }
    }

    private void m9629a(C0811d c0811d, int i) {
        c0811d.mo2668b(i);
        int i2 = 0;
        for (int i3 = 0; i3 < this.f13771d; i3++) {
            this.f13772e[i3].mo2668b(i);
        }
        while (i2 < this.f13773f.length) {
            this.f13773f[i2].mo2668b(i);
            i2++;
        }
    }

    private void m9630a(String str) {
        int i;
        int i2 = 0;
        if (str.charAt(0) == '(') {
            i2 = str.indexOf(41) + 1;
            if (i2 <= 0) {
                StringBuilder stringBuilder = new StringBuilder("bad descriptor: ");
                stringBuilder.append(str);
                throw new IndexOutOfBoundsException(stringBuilder.toString());
            }
        }
        C0811d[] c0811dArr = this.f13772e;
        int i3 = this.f13771d;
        char charAt = str.charAt(i2);
        if (charAt != 'D') {
            if (charAt == 'F') {
                c0811dArr[i3] = i;
            } else if (charAt == 'J') {
                c0811dArr[i3] = k;
                c0811dArr[i3 + 1] = g;
            } else if (charAt == 'L') {
                c0811dArr[i3] = new C4946e(C4943c.m9626a(str, i2));
            } else if (charAt == 'V') {
                return;
            } else {
                if (charAt != '[') {
                    c0811dArr[i3] = h;
                } else {
                    c0811dArr[i3] = new C4946e(str.substring(i2));
                }
            }
            i = this.f13771d + 1;
            this.f13771d = i;
        }
        c0811dArr[i3] = j;
        c0811dArr[i3 + 1] = g;
        i = this.f13771d + 2;
        this.f13771d = i;
    }

    private void m9631a(boolean z, int i) {
        if (z) {
            C0827p c0827p = this.f13769b;
            aa aaVar = (aa) c0827p.m1875a(i);
            String c = aaVar == null ? null : c0827p.m1884c(aaVar.a);
            C0811d[] c0811dArr = this.f13772e;
            int i2 = this.f13771d - 1;
            this.f13771d = i2;
            c0811dArr[i2].mo852a(c, this.f13768a);
        }
    }

    private int m9632b(int i) {
        C0811d[] c0811dArr = this.f13772e;
        int i2 = this.f13771d;
        this.f13771d = i2 + 1;
        c0811dArr[i2] = this.f13773f[i];
        return 2;
    }

    private int m9633b(int i, byte[] bArr, boolean z) {
        i = C0817g.m1832a(bArr, i + 1);
        m9631a(z, i);
        m9630a(this.f13769b.m1886d(i));
        return 3;
    }

    private void m9634b(int i, byte[] bArr, C0811d c0811d) {
        m9622a(C0817g.m1832a(bArr, i + 2), c0811d);
    }

    private void m9635b(String str, int i) {
        char charAt = str.charAt(i);
        if (charAt != ')') {
            int i2 = 0;
            int i3 = i;
            while (charAt == '[') {
                i3++;
                charAt = str.charAt(i3);
                i2 = 1;
            }
            if (charAt == 'L') {
                i3 = str.indexOf(59, i3) + 1;
                if (i3 <= 0) {
                    throw new IndexOutOfBoundsException("bad descriptor");
                }
            }
            i3++;
            m9635b(str, i3);
            int i4 = (i2 == 0 && (charAt == 'J' || charAt == 'D')) ? this.f13771d - 2 : this.f13771d - 1;
            this.f13771d = i4;
            if (i2 != 0) {
                this.f13772e[this.f13771d].mo852a(str.substring(i, i3), this.f13768a);
                return;
            }
            if (charAt == 'L') {
                this.f13772e[this.f13771d].mo852a(str.substring(i + 1, i3 - 1).replace('/', '.'), this.f13768a);
            }
        }
    }

    private int m9636c(int i) {
        this.f13771d--;
        this.f13773f[i] = this.f13772e[this.f13771d];
        return 2;
    }

    private int m9637c(int i, byte[] bArr, boolean z) {
        i = C0817g.m1832a(bArr, i + 1);
        C0827p c0827p = this.f13769b;
        ap apVar = (ap) c0827p.m1875a(i);
        String str = null;
        if (apVar != null) {
            aq aqVar = (aq) c0827p.m1875a(apVar.c);
            if (aqVar != null) {
                str = c0827p.m1892j(aqVar.f13746c);
            }
        }
        m9635b(str, 1);
        if (z) {
            String e = this.f13769b.m1887e(i);
            C0811d[] c0811dArr = this.f13772e;
            int i2 = this.f13771d - 1;
            this.f13771d = i2;
            C0811d c0811d = c0811dArr[i2];
            if ((c0811d instanceof C6414j) && c0811d.mo2667f()) {
                i2 = ((C6414j) c0811d).m15243i();
            } else {
                if (c0811d instanceof C6413h) {
                    i2 = ((C6413h) c0811d).f17567a;
                }
                c0811d.mo852a(e, this.f13768a);
            }
            m9629a(c0811d, i2);
            c0811d.mo852a(e, this.f13768a);
        }
        m9630a(str);
        return 3;
    }

    protected final int m9638a(int r12, byte[] r13) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:113:0x027c in {9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 46, 47, 49, 51, 53, 55, 56, 57, 59, 63, 64, 66, 67, 68, 70, 71, 72, 74, 75, 77, 78, 80, 85, 90, 95, 97, 98, 103, 104, 106, 108, 109, 110, 111, 112, 115, 117, 119, 121, 123, 125, 131, 135, 137, 139, 140, 142, 143, 145, 147, 149, 151, 152, 154, 155, 156, 157, 159, 162, 163, 165, 167, 175, 177, 178, 180, 181, 182, 183, 185, 186, 188, 189, 190, 191, 192, 194, 195, 197, 199, 202, 204, 205, 207, 209, 212, 214, 216, 220, 221, 222, 223, 224, 225, 226, 227, 229, 231, 233, 236, 239, 240, 242, 245, 248, 249, 251, 253, 255, 257, 259, 261, 263, 264, 265, 267, 268, 269, 270, 271, 273, 274, 275, 276, 278, 280, 281, 283, 285, 287, 288, 291} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r11 = this;
        r0 = r13[r12];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r0 & 255;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1 = 96;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r2 = 4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r3 = 3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r4 = 2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r5 = 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        if (r0 >= r1) goto L_0x02a9;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x000c:
        r1 = 54;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        if (r0 >= r1) goto L_0x0152;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0010:
        r1 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        switch(r0) {
            case 0: goto L_0x014b;
            case 1: goto L_0x013e;
            case 2: goto L_0x0133;
            case 3: goto L_0x0133;
            case 4: goto L_0x0133;
            case 5: goto L_0x0133;
            case 6: goto L_0x0133;
            case 7: goto L_0x0133;
            case 8: goto L_0x0133;
            case 9: goto L_0x011e;
            case 10: goto L_0x011e;
            case 11: goto L_0x0113;
            case 12: goto L_0x0113;
            case 13: goto L_0x0113;
            case 14: goto L_0x00fe;
            case 15: goto L_0x00fe;
            case 16: goto L_0x00ee;
            case 17: goto L_0x00ee;
            case 18: goto L_0x00e5;
            case 19: goto L_0x00dc;
            case 20: goto L_0x00dc;
            case 21: goto L_0x00d5;
            case 22: goto L_0x00ce;
            case 23: goto L_0x00c7;
            case 24: goto L_0x00c0;
            case 25: goto L_0x00b6;
            case 26: goto L_0x00ab;
            case 27: goto L_0x00ab;
            case 28: goto L_0x00ab;
            case 29: goto L_0x00ab;
            case 30: goto L_0x0096;
            case 31: goto L_0x0096;
            case 32: goto L_0x0096;
            case 33: goto L_0x0096;
            case 34: goto L_0x008b;
            case 35: goto L_0x008b;
            case 36: goto L_0x008b;
            case 37: goto L_0x008b;
            case 38: goto L_0x0076;
            case 39: goto L_0x0076;
            case 40: goto L_0x0076;
            case 41: goto L_0x0076;
            case 42: goto L_0x0067;
            case 43: goto L_0x0067;
            case 44: goto L_0x0067;
            case 45: goto L_0x0067;
            case 46: goto L_0x005c;
            case 47: goto L_0x004d;
            case 48: goto L_0x0042;
            case 49: goto L_0x0033;
            case 50: goto L_0x0024;
            case 51: goto L_0x0019;
            case 52: goto L_0x0019;
            case 53: goto L_0x0019;
            default: goto L_0x0015;
        };	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0015:
        r12 = new java.lang.RuntimeException;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x014c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0019:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = h;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1[r12] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0024:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r1[r12];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = p050b.p051a.p053b.C0811d.C6409b.m15190c(r13);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1[r12] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0033:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12 - r4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = j;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1[r12] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = g;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1[r12] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0042:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = i;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1[r12] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x004d:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12 - r4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1[r12] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = g;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1[r12] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x005c:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = h;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1[r12] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0067:
        r0 = r0 + -42;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r12 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13773f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13[r0];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1[r12] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0076:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r12 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = j;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1[r12] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r12 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = g;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1[r12] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x008b:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r12 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = i;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1[r12] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0096:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r12 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1[r12] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r12 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = g;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1[r12] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x00ab:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r12 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = h;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1[r12] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x00b6:
        r12 = r12 + r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r13[r12];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12 & 255;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.m9632b(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x00c0:
        r12 = j;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.m9625a(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x00c7:
        r12 = i;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.m9625a(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x00ce:
        r12 = k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.m9625a(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x00d5:
        r12 = h;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.m9625a(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x00dc:
        r12 = r12 + r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = p050b.p051a.C0817g.m1832a(r13, r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.m9627a(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x00e5:
        r12 = r12 + r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r13[r12];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12 & 255;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.m9627a(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x00ee:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r12 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = h;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1[r12] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = 17;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        if (r0 != r12) goto L_0x00fd;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x00fc:
        return r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x00fd:
        return r4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x00fe:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r12 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = j;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1[r12] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r12 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = g;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1[r12] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0113:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r12 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = i;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1[r12] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x011e:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r12 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1[r12] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r12 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = g;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1[r12] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0133:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r12 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = h;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1[r12] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x013e:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r12 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = new b.a.b.d$f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13.<init>();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1[r12] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x014b:
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x014c:
        r13 = "fatal";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12.<init>(r13);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        throw r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0152:
        switch(r0) {
            case 54: goto L_0x029c;
            case 55: goto L_0x0295;
            case 56: goto L_0x028e;
            case 57: goto L_0x0287;
            case 58: goto L_0x027d;
            case 59: goto L_0x0270;
            case 60: goto L_0x0270;
            case 61: goto L_0x0270;
            case 62: goto L_0x0270;
            case 63: goto L_0x025d;
            case 64: goto L_0x025d;
            case 65: goto L_0x025d;
            case 66: goto L_0x025d;
            case 67: goto L_0x0251;
            case 68: goto L_0x0251;
            case 69: goto L_0x0251;
            case 70: goto L_0x0251;
            case 71: goto L_0x023e;
            case 72: goto L_0x023e;
            case 73: goto L_0x023e;
            case 74: goto L_0x023e;
            case 75: goto L_0x0238;
            case 76: goto L_0x0238;
            case 77: goto L_0x0238;
            case 78: goto L_0x0238;
            case 79: goto L_0x0228;
            case 80: goto L_0x0228;
            case 81: goto L_0x0228;
            case 82: goto L_0x0228;
            case 83: goto L_0x01cb;
            case 84: goto L_0x01c5;
            case 85: goto L_0x01c5;
            case 86: goto L_0x01c5;
            case 87: goto L_0x01bf;
            case 88: goto L_0x01b9;
            case 89: goto L_0x01ac;
            case 90: goto L_0x0196;
            case 91: goto L_0x0196;
            case 92: goto L_0x0190;
            case 93: goto L_0x016f;
            case 94: goto L_0x016f;
            case 95: goto L_0x0159;
            default: goto L_0x0155;
        };	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0155:
        r12 = new java.lang.RuntimeException;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x02a3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0159:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13[r12];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r2 = r12 + -1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1 = r1[r2];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0[r12] = r1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12[r2] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x016f:
        r0 = r0 + -93;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r0 + r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.m9628a(r4, r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r12 - r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1 = r1[r12];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13[r0] = r1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r0 + r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r2 = r12 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1 = r1[r2];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13[r0] = r1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x018c:
        r12 = r12 + r4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0190:
        r11.m9628a(r4, r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x018c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0196:
        r0 = r0 + -90;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r0 + r4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.m9628a(r5, r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r12 - r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1 = r1[r12];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13[r0] = r1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x01a8:
        r12 = r12 + r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x01ac:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1 = r12 + -1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r0[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13[r12] = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x01a8;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x01b9:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x01bb:
        r12 = r12 - r4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x01bf:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x01c1:
        r12 = r12 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x01c5:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x01c7:
        r12 = r12 - r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x01cb:
        r12 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12[r13];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r0 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13[r0];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r11.f13768a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1 = r12 instanceof p050b.p051a.p053b.C0811d.C4944a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        if (r1 == 0) goto L_0x01ef;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x01df:
        r1 = r13.mo2666e();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        if (r1 != 0) goto L_0x01ef;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x01e5:
        r1 = r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1 = (p050b.p051a.p053b.C0811d.C4944a) r1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r2 = p050b.p051a.p053b.C0811d.C6410c.m15199c(r13);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1.mo2664b(r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x01ef:
        r1 = r13 instanceof p050b.p051a.p053b.C0811d.C4944a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        if (r1 == 0) goto L_0x0225;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x01f3:
        r1 = r12 instanceof p050b.p051a.p053b.C0811d.C4944a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        if (r1 == 0) goto L_0x01fb;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x01f7:
        p050b.p051a.p053b.C0811d.C6409b.m15190c(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x0225;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x01fb:
        r1 = r12 instanceof p050b.p051a.p053b.C0811d.C4946e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        if (r1 == 0) goto L_0x0211;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x01ff:
        r1 = r12.mo2666e();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        if (r1 != 0) goto L_0x0225;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0205:
        r12 = r12.mo856g();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = p050b.p051a.p053b.C0811d.C6409b.m15189a(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13.mo852a(r12, r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x0225;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0211:
        r13 = new b.a.e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = new java.lang.StringBuilder;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1 = "bad AASTORE: ";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0.<init>(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0.append(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r0.toString();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13.<init>(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        throw r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0225:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x01c7;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0228:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = 80;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        if (r0 == r13) goto L_0x0234;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x022e:
        r13 = 82;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        if (r0 != r13) goto L_0x0233;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0232:
        goto L_0x0234;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0233:
        r2 = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0234:
        r12 = r12 - r2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0238:
        r0 = r0 + -75;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.m9636c(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x023e:
        r0 = r0 + -71;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13773f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = j;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12[r0] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13773f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r0 + r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = g;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12[r0] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x01bb;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0251:
        r0 = r0 + -67;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13773f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = i;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12[r0] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x01c1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x025d:
        r0 = r0 + -63;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13773f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12[r0] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13773f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r0 + r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = g;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12[r0] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x01bb;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0270:
        r0 = r0 + -59;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13773f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = h;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12[r0] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x01c1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x027d:
        r12 = r12 + r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r13[r12];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12 & 255;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.m9636c(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0287:
        r0 = j;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.m9623a(r12, r13, r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x028e:
        r0 = i;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.m9623a(r12, r13, r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0295:
        r0 = k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.m9623a(r12, r13, r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x029c:
        r0 = h;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.m9623a(r12, r13, r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x02a3:
        r13 = "fatal";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12.<init>(r13);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        throw r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x02a9:
        r1 = 148; // 0x94 float:2.07E-43 double:7.3E-322;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        if (r0 >= r1) goto L_0x0379;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x02ad:
        r12 = 131; // 0x83 float:1.84E-43 double:6.47E-322;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        if (r0 > r12) goto L_0x02bb;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x02b1:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = p050b.p051a.ar.f2410i;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13[r0];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12 + r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x02bb:
        switch(r0) {
            case 132: goto L_0x0372;
            case 133: goto L_0x035d;
            case 134: goto L_0x0353;
            case 135: goto L_0x033f;
            case 136: goto L_0x0332;
            case 137: goto L_0x0325;
            case 138: goto L_0x031b;
            case 139: goto L_0x0311;
            case 140: goto L_0x02fd;
            case 141: goto L_0x02e6;
            case 142: goto L_0x02d9;
            case 143: goto L_0x02cf;
            case 144: goto L_0x02c2;
            case 145: goto L_0x0371;
            case 146: goto L_0x0371;
            case 147: goto L_0x0371;
            default: goto L_0x02be;
        };	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x02be:
        r12 = new java.lang.RuntimeException;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x0373;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x02c2:
        r12 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = i;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12[r13] = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x02cf:
        r12 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12[r13] = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x02d9:
        r12 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = h;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12[r13] = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x02e6:
        r12 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = j;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12[r13] = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = g;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12[r13] = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x02f9:
        r12 = r12 + r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x02fd:
        r12 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12[r13] = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = g;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12[r13] = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x02f9;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0311:
        r12 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = h;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12[r13] = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x031b:
        r12 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = j;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12[r13] = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0325:
        r12 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = i;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12[r13] = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0332:
        r12 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = h;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12[r13] = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x033f:
        r12 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = j;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12[r13] = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = g;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12[r13] = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x02f9;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0353:
        r12 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = i;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12[r13] = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x035d:
        r12 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12[r13] = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = g;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12[r13] = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x02f9;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0371:
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0372:
        return r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0373:
        r13 = "fatal";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12.<init>(r13);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        throw r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0379:
        r1 = 91;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r6 = 47;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r7 = 46;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r8 = 0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r9 = 5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r10 = 0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        switch(r0) {
            case 148: goto L_0x05fd;
            case 149: goto L_0x05f0;
            case 150: goto L_0x05f0;
            case 151: goto L_0x05e1;
            case 152: goto L_0x05e1;
            case 153: goto L_0x05db;
            case 154: goto L_0x05db;
            case 155: goto L_0x05db;
            case 156: goto L_0x05db;
            case 157: goto L_0x05db;
            case 158: goto L_0x05db;
            case 159: goto L_0x05d5;
            case 160: goto L_0x05d5;
            case 161: goto L_0x05d5;
            case 162: goto L_0x05d5;
            case 163: goto L_0x05d5;
            case 164: goto L_0x05d5;
            case 165: goto L_0x05d5;
            case 166: goto L_0x05d5;
            case 167: goto L_0x05d4;
            case 168: goto L_0x05d4;
            case 169: goto L_0x05d3;
            case 170: goto L_0x05bb;
            case 171: goto L_0x05a7;
            case 172: goto L_0x05a3;
            case 173: goto L_0x05a0;
            case 174: goto L_0x059c;
            case 175: goto L_0x0596;
            case 176: goto L_0x0587;
            case 177: goto L_0x0609;
            case 178: goto L_0x0582;
            case 179: goto L_0x057d;
            case 180: goto L_0x0578;
            case 181: goto L_0x0573;
            case 182: goto L_0x056e;
            case 183: goto L_0x056e;
            case 184: goto L_0x0569;
            case 185: goto L_0x0525;
            case 186: goto L_0x04fd;
            case 187: goto L_0x04e1;
            case 188: goto L_0x04ac;
            case 189: goto L_0x046b;
            case 190: goto L_0x0453;
            case 191: goto L_0x0442;
            case 192: goto L_0x0420;
            case 193: goto L_0x0416;
            case 194: goto L_0x0410;
            case 195: goto L_0x0410;
            case 196: goto L_0x03b5;
            case 197: goto L_0x038d;
            case 198: goto L_0x0387;
            case 199: goto L_0x0387;
            case 200: goto L_0x0386;
            case 201: goto L_0x0386;
            default: goto L_0x0385;
        };	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0385:
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0386:
        return r9;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0387:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x038d:
        r0 = r12 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = p050b.p051a.C0817g.m1832a(r13, r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12 + r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r13[r12];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12 & 255;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13769b;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12.m1884c(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12.replace(r7, r6);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r0 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1 = new b.a.b.d$e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1.<init>(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13[r0] = r1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x03b5:
        r0 = r12 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r13[r0];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r0 & 255;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1 = 132; // 0x84 float:1.85E-43 double:6.5E-322;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        if (r0 == r1) goto L_0x040e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x03bf:
        r1 = 169; // 0xa9 float:2.37E-43 double:8.35E-322;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        if (r0 == r1) goto L_0x040d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x03c3:
        switch(r0) {
            case 21: goto L_0x040a;
            case 22: goto L_0x0407;
            case 23: goto L_0x0404;
            case 24: goto L_0x03fe;
            case 25: goto L_0x03f5;
            default: goto L_0x03c6;
        };	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x03c6:
        switch(r0) {
            case 54: goto L_0x03f2;
            case 55: goto L_0x03ef;
            case 56: goto L_0x03ec;
            case 57: goto L_0x03e6;
            case 58: goto L_0x03dd;
            default: goto L_0x03c9;
        };	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x03c9:
        r12 = new java.lang.RuntimeException;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = new java.lang.StringBuilder;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1 = "bad WIDE instruction: ";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13.<init>(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13.append(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13.toString();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12.<init>(r13);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        throw r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x03dd:
        r12 = r12 + r4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = p050b.p051a.C0817g.m1832a(r13, r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.m9636c(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x03e6:
        r0 = j;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x03e8:
        r11.m9634b(r12, r13, r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x03ec:
        r0 = i;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x03e8;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x03ef:
        r0 = k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x03e8;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x03f2:
        r0 = h;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x03e8;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x03f5:
        r12 = r12 + r4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = p050b.p051a.C0817g.m1832a(r13, r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.m9632b(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x03fe:
        r12 = j;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0400:
        r11.m9625a(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0404:
        r12 = i;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x0400;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0407:
        r12 = k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x0400;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x040a:
        r12 = h;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x0400;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x040d:
        return r2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x040e:
        r12 = 6;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0410:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0412:
        r12 = r12 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0416:
        r12 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = h;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12[r13] = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0420:
        r12 = r12 + r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = p050b.p051a.C0817g.m1832a(r13, r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13769b;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r13.m1884c(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r12.charAt(r10);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        if (r13 != r1) goto L_0x0435;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0431:
        r12 = r12.replace(r7, r6);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0435:
        r13 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r0 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1 = new b.a.b.d$e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1.<init>(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13[r0] = r1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0442:
        r12 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12[r13];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = "java.lang.Throwable";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r11.f13768a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x044f:
        r12.mo852a(r13, r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0453:
        r12 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12[r13];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = "[Ljava.lang.Object;";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r11.f13768a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12.mo852a(r13, r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = h;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12[r13] = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x046b:
        r12 = r12 + r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = p050b.p051a.C0817g.m1832a(r13, r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13769b;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r13.m1884c(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12.replace(r7, r6);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r12.charAt(r10);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        if (r13 != r1) goto L_0x048f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0480:
        r13 = new java.lang.StringBuilder;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = "[";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13.<init>(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13.append(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x048a:
        r12 = r13.toString();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x049f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x048f:
        r13 = new java.lang.StringBuilder;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = "[L";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13.<init>(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13.append(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = ";";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13.append(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x048a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x049f:
        r13 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r0 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1 = new b.a.b.d$e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1.<init>(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13[r0] = r1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x04ac:
        r0 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r0 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12 + r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r13[r12];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12 & 255;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        switch(r12) {
            case 4: goto L_0x04cf;
            case 5: goto L_0x04cc;
            case 6: goto L_0x04c9;
            case 7: goto L_0x04c6;
            case 8: goto L_0x04c3;
            case 9: goto L_0x04c0;
            case 10: goto L_0x04bd;
            case 11: goto L_0x04ba;
            default: goto L_0x04b7;
        };	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x04b7:
        r12 = new java.lang.RuntimeException;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x04db;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x04ba:
        r12 = "[J";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x04d1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x04bd:
        r12 = "[I";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x04d1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x04c0:
        r12 = "[S";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x04d1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x04c3:
        r12 = "[B";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x04d1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x04c6:
        r12 = "[D";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x04d1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x04c9:
        r12 = "[F";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x04d1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x04cc:
        r12 = "[C";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x04d1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x04cf:
        r12 = "[Z";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x04d1:
        r13 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1 = new b.a.b.d$e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1.<init>(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13[r0] = r1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x04db:
        r13 = "bad newarray";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12.<init>(r13);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        throw r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x04e1:
        r0 = r12 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = p050b.p051a.C0817g.m1832a(r13, r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r2 = r1 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r2 = new b.a.b.d$h;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r4 = r11.f13769b;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r4.m1884c(r13);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r2.<init>(r12, r13);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0[r1] = r2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x04fd:
        r12 = r12 + r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = p050b.p051a.C0817g.m1832a(r13, r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13769b;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r13.m1875a(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = (p050b.p051a.af) r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        if (r12 != 0) goto L_0x050d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x050c:
        goto L_0x051e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x050d:
        r12 = r12.f13738c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r13.m1875a(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = (p050b.p051a.aq) r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        if (r12 != 0) goto L_0x0518;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0517:
        goto L_0x051e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0518:
        r12 = r12.f13746c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r8 = r13.m1892j(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x051e:
        r11.m9635b(r8, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.m9630a(r8);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r9;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0525:
        r12 = r12 + r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = p050b.p051a.C0817g.m1832a(r13, r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13769b;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r13.m1875a(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = (p050b.p051a.ae) r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        if (r0 != 0) goto L_0x0535;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0534:
        goto L_0x0546;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0535:
        r0 = r0.c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r13.m1875a(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = (p050b.p051a.aq) r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        if (r0 != 0) goto L_0x0540;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x053f:
        goto L_0x0546;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0540:
        r0 = r0.f13746c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r8 = r13.m1892j(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0546:
        r11.m9635b(r8, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13769b;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r13.m1875a(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = (p050b.p051a.ae) r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12.a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r13.m1884c(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r0 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13[r0];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r11.f13768a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13.mo852a(r12, r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.m9630a(r8);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r9;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0569:
        r12 = r11.m9637c(r12, r13, r10);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x056e:
        r12 = r11.m9637c(r12, r13, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0573:
        r12 = r11.m9624a(r12, r13, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0578:
        r12 = r11.m9633b(r12, r13, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x057d:
        r12 = r11.m9624a(r12, r13, r10);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0582:
        r12 = r11.m9633b(r12, r13, r10);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0587:
        r12 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12[r13];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13770c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r11.f13768a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x044f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0596:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x0598:
        r12 = r12 - r4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x059c:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x0412;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x05a0:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x0598;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x05a3:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x0412;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x05a7:
        r0 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r0 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r12 & -4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r0 + 8;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = p050b.p051a.C0817g.m1834b(r13, r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 * 8;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 + 12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x05b8:
        r12 = r12 & r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x05bb:
        r0 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r0 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r12 & -4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r0 + 8;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r1 = p050b.p051a.C0817g.m1834b(r13, r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = r0 + r2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = p050b.p051a.C0817g.m1834b(r13, r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 + r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 * r2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 + 16;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x05b8;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x05d3:
        return r4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x05d4:
        return r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x05d5:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12 - r4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x05db:
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r12 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x05e1:
        r12 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = h;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12[r13] = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x05ec:
        r12 = r12 - r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x05f0:
        r12 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r11.f13771d = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = h;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12[r13] = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
    L_0x05fd:
        r12 = r11.f13772e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r13 = r13 - r2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r0 = h;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12[r13] = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        r12 = r11.f13771d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x060a }
        goto L_0x05ec;
    L_0x0609:
        return r5;
    L_0x060a:
        r12 = move-exception;
        r13 = new b.a.e;
        r0 = new java.lang.StringBuilder;
        r1 = "inconsistent stack height ";
        r0.<init>(r1);
        r1 = r12.getMessage();
        r0.append(r1);
        r0 = r0.toString();
        r13.<init>(r0, r12);
        throw r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.b.c.a(int, byte[]):int");
    }
}
