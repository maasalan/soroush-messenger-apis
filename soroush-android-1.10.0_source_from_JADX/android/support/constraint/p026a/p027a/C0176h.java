package android.support.constraint.p026a.p027a;

import android.support.constraint.p026a.C0184e;
import android.support.constraint.p026a.p027a.C0174d.C0173a;

public final class C0176h {
    static boolean[] f650a = new boolean[3];

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m323a(int r13, android.support.constraint.p026a.p027a.C0174d r14) {
        /*
        r14.m300g();
        r0 = r14.f643u;
        r0 = r0.f580a;
        r1 = r14.f644v;
        r1 = r1.f580a;
        r2 = r14.f645w;
        r2 = r2.f580a;
        r3 = r14.f646x;
        r3 = r3.f580a;
        r4 = 8;
        r13 = r13 & r4;
        r5 = 0;
        r6 = 1;
        if (r13 != r4) goto L_0x001c;
    L_0x001a:
        r13 = r6;
        goto L_0x001d;
    L_0x001c:
        r13 = r5;
    L_0x001d:
        r4 = r0.f12921g;
        r7 = 3;
        r8 = 4;
        r9 = 0;
        r10 = -1;
        r11 = 2;
        if (r4 == r8) goto L_0x015c;
    L_0x0026:
        r4 = r2.f12921g;
        if (r4 == r8) goto L_0x015c;
    L_0x002a:
        r4 = r14.f602E;
        r4 = r4[r5];
        r12 = android.support.constraint.p026a.p027a.C0174d.C0173a.f592a;
        if (r4 != r12) goto L_0x00d9;
    L_0x0032:
        r4 = r14.f643u;
        r4 = r4.f583d;
        if (r4 != 0) goto L_0x0056;
    L_0x0038:
        r4 = r14.f645w;
        r4 = r4.f583d;
        if (r4 != 0) goto L_0x0056;
    L_0x003e:
        r0.f12921g = r6;
        r2.f12921g = r6;
        if (r13 == 0) goto L_0x004d;
    L_0x0044:
        r4 = r14.m302h();
        r2.m8600a(r0, r6, r4);
        goto L_0x015c;
    L_0x004d:
        r4 = r14.m308l();
    L_0x0051:
        r2.m8604b(r0, r4);
        goto L_0x015c;
    L_0x0056:
        r4 = r14.f643u;
        r4 = r4.f583d;
        if (r4 == 0) goto L_0x0069;
    L_0x005c:
        r4 = r14.f645w;
        r4 = r4.f583d;
        if (r4 != 0) goto L_0x0069;
    L_0x0062:
        r0.f12921g = r6;
        r2.f12921g = r6;
        if (r13 == 0) goto L_0x004d;
    L_0x0068:
        goto L_0x0044;
    L_0x0069:
        r4 = r14.f643u;
        r4 = r4.f583d;
        if (r4 != 0) goto L_0x0096;
    L_0x006f:
        r4 = r14.f645w;
        r4 = r4.f583d;
        if (r4 == 0) goto L_0x0096;
    L_0x0075:
        r0.f12921g = r6;
        r2.f12921g = r6;
        r4 = r14.m308l();
        r4 = -r4;
        r0.m8604b(r2, r4);
        if (r13 == 0) goto L_0x008c;
    L_0x0083:
        r4 = r14.m302h();
        r0.m8600a(r2, r10, r4);
        goto L_0x015c;
    L_0x008c:
        r4 = r14.m308l();
    L_0x0090:
        r4 = -r4;
        r0.m8604b(r2, r4);
        goto L_0x015c;
    L_0x0096:
        r4 = r14.f643u;
        r4 = r4.f583d;
        if (r4 == 0) goto L_0x015c;
    L_0x009c:
        r4 = r14.f645w;
        r4 = r4.f583d;
        if (r4 == 0) goto L_0x015c;
    L_0x00a2:
        r0.f12921g = r11;
        r2.f12921g = r11;
        if (r13 == 0) goto L_0x00c6;
    L_0x00a8:
        r4 = r14.m302h();
        r4.m328a(r0);
        r4 = r14.m302h();
        r4.m328a(r2);
        r4 = r14.m302h();
        r0.m8605b(r2, r10, r4);
        r4 = r14.m302h();
        r2.m8605b(r0, r6, r4);
        goto L_0x015c;
    L_0x00c6:
        r4 = r14.m308l();
        r4 = -r4;
        r4 = (float) r4;
        r0.m8603b(r2, r4);
        r4 = r14.m308l();
        r4 = (float) r4;
        r2.m8603b(r0, r4);
        goto L_0x015c;
    L_0x00d9:
        r4 = r14.f602E;
        r4 = r4[r5];
        r12 = android.support.constraint.p026a.p027a.C0174d.C0173a.f594c;
        if (r4 != r12) goto L_0x015c;
    L_0x00e1:
        r4 = android.support.constraint.p026a.p027a.C0176h.m325a(r14, r5);
        if (r4 == 0) goto L_0x015c;
    L_0x00e7:
        r4 = r14.m308l();
        r0.f12921g = r6;
        r2.f12921g = r6;
        r5 = r14.f643u;
        r5 = r5.f583d;
        if (r5 != 0) goto L_0x00ff;
    L_0x00f5:
        r5 = r14.f645w;
        r5 = r5.f583d;
        if (r5 != 0) goto L_0x00ff;
    L_0x00fb:
        if (r13 == 0) goto L_0x0051;
    L_0x00fd:
        goto L_0x0044;
    L_0x00ff:
        r5 = r14.f643u;
        r5 = r5.f583d;
        if (r5 == 0) goto L_0x010f;
    L_0x0105:
        r5 = r14.f645w;
        r5 = r5.f583d;
        if (r5 != 0) goto L_0x010f;
    L_0x010b:
        if (r13 == 0) goto L_0x0051;
    L_0x010d:
        goto L_0x0044;
    L_0x010f:
        r5 = r14.f643u;
        r5 = r5.f583d;
        if (r5 != 0) goto L_0x011f;
    L_0x0115:
        r5 = r14.f645w;
        r5 = r5.f583d;
        if (r5 == 0) goto L_0x011f;
    L_0x011b:
        if (r13 == 0) goto L_0x0090;
    L_0x011d:
        goto L_0x0083;
    L_0x011f:
        r5 = r14.f643u;
        r5 = r5.f583d;
        if (r5 == 0) goto L_0x015c;
    L_0x0125:
        r5 = r14.f645w;
        r5 = r5.f583d;
        if (r5 == 0) goto L_0x015c;
    L_0x012b:
        if (r13 == 0) goto L_0x013b;
    L_0x012d:
        r5 = r14.m302h();
        r5.m328a(r0);
        r5 = r14.m302h();
        r5.m328a(r2);
    L_0x013b:
        r5 = r14.f606I;
        r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));
        if (r5 != 0) goto L_0x014c;
    L_0x0141:
        r0.f12921g = r7;
        r2.f12921g = r7;
        r0.m8603b(r2, r9);
        r2.m8603b(r0, r9);
        goto L_0x015c;
    L_0x014c:
        r0.f12921g = r11;
        r2.f12921g = r11;
        r5 = -r4;
        r5 = (float) r5;
        r0.m8603b(r2, r5);
        r5 = (float) r4;
        r2.m8603b(r0, r5);
        r14.m293d(r4);
    L_0x015c:
        r0 = r1.f12921g;
        if (r0 == r8) goto L_0x0300;
    L_0x0160:
        r0 = r3.f12921g;
        if (r0 == r8) goto L_0x0300;
    L_0x0164:
        r0 = r14.f602E;
        r0 = r0[r6];
        r2 = android.support.constraint.p026a.p027a.C0174d.C0173a.f592a;
        if (r0 != r2) goto L_0x0251;
    L_0x016c:
        r0 = r14.f644v;
        r0 = r0.f583d;
        if (r0 != 0) goto L_0x01a4;
    L_0x0172:
        r0 = r14.f646x;
        r0 = r0.f583d;
        if (r0 != 0) goto L_0x01a4;
    L_0x0178:
        r1.f12921g = r6;
        r3.f12921g = r6;
        if (r13 == 0) goto L_0x0186;
    L_0x017e:
        r13 = r14.m304i();
        r3.m8600a(r1, r6, r13);
        goto L_0x018d;
    L_0x0186:
        r13 = r14.m309m();
        r3.m8604b(r1, r13);
    L_0x018d:
        r13 = r14.f647y;
        r13 = r13.f583d;
        if (r13 == 0) goto L_0x0300;
    L_0x0193:
        r13 = r14.f647y;
        r13 = r13.f580a;
        r13.f12921g = r6;
        r13 = r14.f647y;
        r13 = r13.f580a;
        r14 = r14.f612O;
        r14 = -r14;
        r1.m8599a(r13, r14);
        return;
    L_0x01a4:
        r0 = r14.f644v;
        r0 = r0.f583d;
        if (r0 == 0) goto L_0x01d3;
    L_0x01aa:
        r0 = r14.f646x;
        r0 = r0.f583d;
        if (r0 != 0) goto L_0x01d3;
    L_0x01b0:
        r1.f12921g = r6;
        r3.f12921g = r6;
        if (r13 == 0) goto L_0x01be;
    L_0x01b6:
        r13 = r14.m304i();
        r3.m8600a(r1, r6, r13);
        goto L_0x01c5;
    L_0x01be:
        r13 = r14.m309m();
        r3.m8604b(r1, r13);
    L_0x01c5:
        r13 = r14.f612O;
        if (r13 <= 0) goto L_0x0300;
    L_0x01c9:
        r13 = r14.f647y;
        r13 = r13.f580a;
        r14 = r14.f612O;
        r13.m8599a(r1, r14);
        return;
    L_0x01d3:
        r0 = r14.f644v;
        r0 = r0.f583d;
        if (r0 != 0) goto L_0x0203;
    L_0x01d9:
        r0 = r14.f646x;
        r0 = r0.f583d;
        if (r0 == 0) goto L_0x0203;
    L_0x01df:
        r1.f12921g = r6;
        r3.f12921g = r6;
        if (r13 == 0) goto L_0x01ed;
    L_0x01e5:
        r13 = r14.m304i();
        r1.m8600a(r3, r10, r13);
        goto L_0x01f5;
    L_0x01ed:
        r13 = r14.m309m();
        r13 = -r13;
        r1.m8604b(r3, r13);
    L_0x01f5:
        r13 = r14.f612O;
        if (r13 <= 0) goto L_0x0300;
    L_0x01f9:
        r13 = r14.f647y;
        r13 = r13.f580a;
        r14 = r14.f612O;
        r13.m8599a(r1, r14);
        return;
    L_0x0203:
        r0 = r14.f644v;
        r0 = r0.f583d;
        if (r0 == 0) goto L_0x0300;
    L_0x0209:
        r0 = r14.f646x;
        r0 = r0.f583d;
        if (r0 == 0) goto L_0x0300;
    L_0x020f:
        r1.f12921g = r11;
        r3.f12921g = r11;
        if (r13 == 0) goto L_0x0232;
    L_0x0215:
        r13 = r14.m304i();
        r1.m8605b(r3, r10, r13);
        r13 = r14.m304i();
        r3.m8605b(r1, r6, r13);
        r13 = r14.m304i();
        r13.m328a(r1);
        r13 = r14.m302h();
        r13.m328a(r3);
        goto L_0x0243;
    L_0x0232:
        r13 = r14.m309m();
        r13 = -r13;
        r13 = (float) r13;
        r1.m8603b(r3, r13);
        r13 = r14.m309m();
        r13 = (float) r13;
        r3.m8603b(r1, r13);
    L_0x0243:
        r13 = r14.f612O;
        if (r13 <= 0) goto L_0x0300;
    L_0x0247:
        r13 = r14.f647y;
        r13 = r13.f580a;
        r14 = r14.f612O;
        r13.m8599a(r1, r14);
        return;
    L_0x0251:
        r0 = r14.f602E;
        r0 = r0[r6];
        r2 = android.support.constraint.p026a.p027a.C0174d.C0173a.f594c;
        if (r0 != r2) goto L_0x0300;
    L_0x0259:
        r0 = android.support.constraint.p026a.p027a.C0176h.m325a(r14, r6);
        if (r0 == 0) goto L_0x0300;
    L_0x025f:
        r0 = r14.m309m();
        r1.f12921g = r6;
        r3.f12921g = r6;
        r2 = r14.f644v;
        r2 = r2.f583d;
        if (r2 != 0) goto L_0x0281;
    L_0x026d:
        r2 = r14.f646x;
        r2 = r2.f583d;
        if (r2 != 0) goto L_0x0281;
    L_0x0273:
        if (r13 == 0) goto L_0x027d;
    L_0x0275:
        r13 = r14.m304i();
        r3.m8600a(r1, r6, r13);
        return;
    L_0x027d:
        r3.m8604b(r1, r0);
        return;
    L_0x0281:
        r2 = r14.f644v;
        r2 = r2.f583d;
        if (r2 == 0) goto L_0x029b;
    L_0x0287:
        r2 = r14.f646x;
        r2 = r2.f583d;
        if (r2 != 0) goto L_0x029b;
    L_0x028d:
        if (r13 == 0) goto L_0x0297;
    L_0x028f:
        r13 = r14.m304i();
        r3.m8600a(r1, r6, r13);
        return;
    L_0x0297:
        r3.m8604b(r1, r0);
        return;
    L_0x029b:
        r2 = r14.f644v;
        r2 = r2.f583d;
        if (r2 != 0) goto L_0x02b6;
    L_0x02a1:
        r2 = r14.f646x;
        r2 = r2.f583d;
        if (r2 == 0) goto L_0x02b6;
    L_0x02a7:
        if (r13 == 0) goto L_0x02b1;
    L_0x02a9:
        r13 = r14.m304i();
        r1.m8600a(r3, r10, r13);
        return;
    L_0x02b1:
        r13 = -r0;
        r1.m8604b(r3, r13);
        return;
    L_0x02b6:
        r2 = r14.f644v;
        r2 = r2.f583d;
        if (r2 == 0) goto L_0x0300;
    L_0x02bc:
        r2 = r14.f646x;
        r2 = r2.f583d;
        if (r2 == 0) goto L_0x0300;
    L_0x02c2:
        if (r13 == 0) goto L_0x02d2;
    L_0x02c4:
        r13 = r14.m304i();
        r13.m328a(r1);
        r13 = r14.m302h();
        r13.m328a(r3);
    L_0x02d2:
        r13 = r14.f606I;
        r13 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1));
        if (r13 != 0) goto L_0x02e3;
    L_0x02d8:
        r1.f12921g = r7;
        r3.f12921g = r7;
        r1.m8603b(r3, r9);
        r3.m8603b(r1, r9);
        return;
    L_0x02e3:
        r1.f12921g = r11;
        r3.f12921g = r11;
        r13 = -r0;
        r13 = (float) r13;
        r1.m8603b(r3, r13);
        r13 = (float) r0;
        r3.m8603b(r1, r13);
        r14.m296e(r0);
        r13 = r14.f612O;
        if (r13 <= 0) goto L_0x0300;
    L_0x02f7:
        r13 = r14.f647y;
        r13 = r13.f580a;
        r14 = r14.f612O;
        r13.m8599a(r1, r14);
    L_0x0300:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.a.a.h.a(int, android.support.constraint.a.a.d):void");
    }

    static void m324a(C6337e c6337e, C0184e c0184e, C0174d c0174d) {
        if (c6337e.E[0] != C0173a.f593b && c0174d.f602E[0] == C0173a.f595d) {
            int i = c0174d.f643u.f584e;
            int l = c6337e.m308l() - c0174d.f645w.f584e;
            c0174d.f643u.f588i = c0184e.m358a(c0174d.f643u);
            c0174d.f645w.f588i = c0184e.m358a(c0174d.f645w);
            c0184e.m362a(c0174d.f643u.f588i, i);
            c0184e.m362a(c0174d.f645w.f588i, l);
            c0174d.f625c = 2;
            c0174d.m292c(i, l);
        }
        if (c6337e.E[1] != C0173a.f593b && c0174d.f602E[1] == C0173a.f595d) {
            i = c0174d.f644v.f584e;
            int m = c6337e.m309m() - c0174d.f646x.f584e;
            c0174d.f644v.f588i = c0184e.m358a(c0174d.f644v);
            c0174d.f646x.f588i = c0184e.m358a(c0174d.f646x);
            c0184e.m362a(c0174d.f644v.f588i, i);
            c0184e.m362a(c0174d.f646x.f588i, m);
            if (c0174d.f612O > 0 || c0174d.f620X == 8) {
                c0174d.f647y.f588i = c0184e.m358a(c0174d.f647y);
                c0184e.m362a(c0174d.f647y.f588i, c0174d.f612O + i);
            }
            c0174d.f626d = 2;
            c0174d.m294d(i, m);
        }
    }

    private static boolean m325a(C0174d c0174d, int i) {
        if (c0174d.f602E[i] != C0173a.f594c) {
            return false;
        }
        int i2 = 1;
        if (c0174d.f606I != 0.0f) {
            int[] iArr = c0174d.f602E;
            if (i != 0) {
                i2 = 0;
            }
            return iArr[i2] == C0173a.f594c ? false : false;
        } else {
            if (i == 0) {
                return c0174d.f629g == 0 && c0174d.f631i == 0 && c0174d.f632j == 0;
            } else {
                if (c0174d.f630h != 0 || c0174d.f634l != 0 || c0174d.f635m != 0) {
                    return false;
                }
            }
        }
    }

    static boolean m326a(android.support.constraint.p026a.p027a.C6337e r22, android.support.constraint.p026a.C0184e r23, int r24, int r25, android.support.constraint.p026a.p027a.C0174d r26) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:216:0x036b in {11, 12, 14, 15, 16, 21, 22, 25, 26, 28, 29, 30, 33, 34, 37, 38, 41, 47, 49, 52, 54, 56, 57, 67, 71, 72, 75, 80, 83, 84, 85, 87, 93, 94, 96, 97, 102, 108, 112, 116, 117, 119, 120, 122, 125, 127, 136, 139, 143, 147, 148, 152, 153, 156, 157, 158, 160, 164, 170, 173, 175, 177, 178, 179, 181, 183, 185, 187, 192, 193, 194, 199, 202, 206, 209, 211, 213, 214, 215, 218} preds:[]
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
        r0 = r23;
        r1 = r26;
        r2 = android.support.constraint.p026a.p027a.C0174d.C0173a.f593b;
        r2 = 0;
        r4 = 1;
        if (r24 != 0) goto L_0x0039;
    L_0x000a:
        r5 = r22;
        r5 = r5.f17323a;
        if (r5 == 0) goto L_0x0039;
    L_0x0010:
        r6 = r1;
        r5 = 0;
    L_0x0012:
        if (r5 != 0) goto L_0x003a;
    L_0x0014:
        r7 = r6.f600C;
        r8 = r25 + 1;
        r7 = r7[r8];
        r7 = r7.f583d;
        if (r7 == 0) goto L_0x0032;
    L_0x001e:
        r7 = r7.f581b;
        r8 = r7.f600C;
        r8 = r8[r25];
        r8 = r8.f583d;
        if (r8 == 0) goto L_0x0032;
    L_0x0028:
        r8 = r7.f600C;
        r8 = r8[r25];
        r8 = r8.f583d;
        r8 = r8.f581b;
        if (r8 == r6) goto L_0x0033;
    L_0x0032:
        r7 = r2;
    L_0x0033:
        if (r7 == 0) goto L_0x0037;
    L_0x0035:
        r6 = r7;
        goto L_0x0012;
    L_0x0037:
        r5 = r4;
        goto L_0x0012;
    L_0x0039:
        r6 = r1;
    L_0x003a:
        r5 = 2;
        if (r24 != 0) goto L_0x0053;
    L_0x003d:
        r7 = r6.ab;
        if (r7 != 0) goto L_0x0043;
    L_0x0041:
        r7 = r4;
        goto L_0x0044;
    L_0x0043:
        r7 = 0;
    L_0x0044:
        r8 = r6.ab;
        if (r8 != r4) goto L_0x004a;
    L_0x0048:
        r8 = r4;
        goto L_0x004b;
    L_0x004a:
        r8 = 0;
    L_0x004b:
        r6 = r6.ab;
        if (r6 != r5) goto L_0x0051;
    L_0x004f:
        r5 = r4;
        goto L_0x0066;
    L_0x0051:
        r5 = 0;
        goto L_0x0066;
    L_0x0053:
        r7 = r6.ac;
        if (r7 != 0) goto L_0x0059;
    L_0x0057:
        r7 = r4;
        goto L_0x005a;
    L_0x0059:
        r7 = 0;
    L_0x005a:
        r8 = r6.ac;
        if (r8 != r4) goto L_0x0060;
    L_0x005e:
        r8 = r4;
        goto L_0x0061;
    L_0x0060:
        r8 = 0;
    L_0x0061:
        r6 = r6.ac;
        if (r6 != r5) goto L_0x0051;
    L_0x0065:
        goto L_0x004f;
    L_0x0066:
        r10 = r1;
        r4 = r2;
        r11 = r4;
        r12 = r11;
        r17 = r12;
        r6 = 0;
        r9 = 0;
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r16 = 0;
    L_0x0073:
        if (r9 != 0) goto L_0x012f;
    L_0x0075:
        r3 = r10.ah;
        r3[r24] = r2;
        r3 = r10.f620X;
        r2 = 8;
        if (r3 == r2) goto L_0x00bb;
    L_0x007f:
        if (r11 == 0) goto L_0x0085;
    L_0x0081:
        r3 = r11.ah;
        r3[r24] = r10;
    L_0x0085:
        if (r12 != 0) goto L_0x0088;
    L_0x0087:
        r12 = r10;
    L_0x0088:
        r13 = r13 + 1;
        if (r24 != 0) goto L_0x0093;
    L_0x008c:
        r3 = r10.m308l();
    L_0x0090:
        r3 = (float) r3;
        r14 = r14 + r3;
        goto L_0x0098;
    L_0x0093:
        r3 = r10.m309m();
        goto L_0x0090;
    L_0x0098:
        if (r10 == r12) goto L_0x00a4;
    L_0x009a:
        r3 = r10.f600C;
        r3 = r3[r25];
        r3 = r3.m274b();
        r3 = (float) r3;
        r14 = r14 + r3;
    L_0x00a4:
        r3 = r10.f600C;
        r3 = r3[r25];
        r3 = r3.m274b();
        r3 = (float) r3;
        r15 = r15 + r3;
        r3 = r10.f600C;
        r11 = r25 + 1;
        r3 = r3[r11];
        r3 = r3.m274b();
        r3 = (float) r3;
        r15 = r15 + r3;
        r11 = r10;
    L_0x00bb:
        r3 = r10.ag;
        r18 = 0;
        r3[r24] = r18;
        r3 = r10.f620X;
        if (r3 == r2) goto L_0x0103;
    L_0x00c5:
        r2 = r10.f602E;
        r2 = r2[r24];
        r3 = android.support.constraint.p026a.p027a.C0174d.C0173a.f594c;
        if (r2 != r3) goto L_0x0103;
    L_0x00cd:
        r6 = r6 + 1;
        if (r24 != 0) goto L_0x00e1;
    L_0x00d1:
        r2 = r10.f629g;
        if (r2 == 0) goto L_0x00d7;
    L_0x00d5:
        r2 = 0;
        return r2;
    L_0x00d7:
        r2 = 0;
        r3 = r10.f631i;
        if (r3 != 0) goto L_0x00e0;
    L_0x00dc:
        r3 = r10.f632j;
        if (r3 == 0) goto L_0x00f0;
    L_0x00e0:
        return r2;
    L_0x00e1:
        r2 = 0;
        r3 = r10.f630h;
        if (r3 == 0) goto L_0x00e7;
    L_0x00e6:
        return r2;
    L_0x00e7:
        r2 = r10.f634l;
        if (r2 != 0) goto L_0x0101;
    L_0x00eb:
        r2 = r10.f635m;
        if (r2 == 0) goto L_0x00f0;
    L_0x00ef:
        goto L_0x0101;
    L_0x00f0:
        r2 = r10.af;
        r2 = r2[r24];
        r16 = r16 + r2;
        if (r17 != 0) goto L_0x00fb;
    L_0x00f8:
        r17 = r10;
        goto L_0x00ff;
    L_0x00fb:
        r2 = r4.ag;
        r2[r24] = r10;
    L_0x00ff:
        r4 = r10;
        goto L_0x0103;
    L_0x0101:
        r0 = 0;
        return r0;
    L_0x0103:
        r2 = r10.f600C;
        r3 = r25 + 1;
        r2 = r2[r3];
        r2 = r2.f583d;
        if (r2 == 0) goto L_0x0121;
    L_0x010d:
        r2 = r2.f581b;
        r3 = r2.f600C;
        r3 = r3[r25];
        r3 = r3.f583d;
        if (r3 == 0) goto L_0x0121;
    L_0x0117:
        r3 = r2.f600C;
        r3 = r3[r25];
        r3 = r3.f583d;
        r3 = r3.f581b;
        if (r3 == r10) goto L_0x0123;
    L_0x0121:
        r2 = r18;
    L_0x0123:
        if (r2 == 0) goto L_0x012a;
    L_0x0125:
        r10 = r2;
        r2 = r18;
        goto L_0x0073;
    L_0x012a:
        r2 = r18;
        r9 = 1;
        goto L_0x0073;
    L_0x012f:
        r2 = r1.f600C;
        r2 = r2[r25];
        r2 = r2.f580a;
        r3 = r10.f600C;
        r4 = r25 + 1;
        r3 = r3[r4];
        r3 = r3.f580a;
        r9 = r2.f12917c;
        if (r9 == 0) goto L_0x036c;
    L_0x0141:
        r9 = r3.f12917c;
        if (r9 != 0) goto L_0x0147;
    L_0x0145:
        goto L_0x036c;
    L_0x0147:
        r9 = r2.f12917c;
        r9 = r9.i;
        r1 = 1;
        if (r9 == r1) goto L_0x0156;
    L_0x014e:
        r9 = r3.f12917c;
        r9 = r9.i;
        if (r9 == r1) goto L_0x0156;
    L_0x0154:
        r1 = 0;
        return r1;
    L_0x0156:
        r1 = 0;
        if (r6 <= 0) goto L_0x015c;
    L_0x0159:
        if (r6 == r13) goto L_0x015c;
    L_0x015b:
        return r1;
    L_0x015c:
        if (r5 != 0) goto L_0x0165;
    L_0x015e:
        if (r7 != 0) goto L_0x0165;
    L_0x0160:
        if (r8 == 0) goto L_0x0163;
    L_0x0162:
        goto L_0x0165;
    L_0x0163:
        r1 = 0;
        goto L_0x017e;
    L_0x0165:
        if (r12 == 0) goto L_0x0171;
    L_0x0167:
        r1 = r12.f600C;
        r1 = r1[r25];
        r1 = r1.m274b();
        r1 = (float) r1;
        goto L_0x0172;
    L_0x0171:
        r1 = 0;
    L_0x0172:
        if (r11 == 0) goto L_0x017e;
    L_0x0174:
        r9 = r11.f600C;
        r9 = r9[r4];
        r9 = r9.m274b();
        r9 = (float) r9;
        r1 = r1 + r9;
    L_0x017e:
        r9 = r2.f12917c;
        r9 = r9.f12920f;
        r3 = r3.f12917c;
        r3 = r3.f12920f;
        r17 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
        if (r17 >= 0) goto L_0x018d;
    L_0x018a:
        r3 = r3 - r9;
    L_0x018b:
        r3 = r3 - r14;
        goto L_0x0190;
    L_0x018d:
        r3 = r9 - r3;
        goto L_0x018b;
    L_0x0190:
        r19 = 1;
        if (r6 <= 0) goto L_0x0248;
    L_0x0194:
        if (r6 != r13) goto L_0x0248;
    L_0x0196:
        r5 = r10.f603F;
        if (r5 == 0) goto L_0x01a6;
    L_0x019a:
        r5 = r10.f603F;
        r5 = r5.f602E;
        r5 = r5[r24];
        r8 = android.support.constraint.p026a.p027a.C0174d.C0173a.f593b;
        if (r5 != r8) goto L_0x01a6;
    L_0x01a4:
        r5 = 0;
        return r5;
    L_0x01a6:
        r3 = r3 + r14;
        r3 = r3 - r15;
        if (r7 == 0) goto L_0x01ac;
    L_0x01aa:
        r15 = r15 - r1;
        r3 = r3 - r15;
    L_0x01ac:
        if (r7 == 0) goto L_0x01c8;
    L_0x01ae:
        r1 = r12.f600C;
        r1 = r1[r4];
        r1 = r1.m274b();
        r1 = (float) r1;
        r9 = r9 + r1;
        r1 = r12.ah;
        r1 = r1[r24];
        if (r1 == 0) goto L_0x01c8;
    L_0x01be:
        r1 = r1.f600C;
        r1 = r1[r25];
        r1 = r1.m274b();
        r1 = (float) r1;
        r9 = r9 + r1;
    L_0x01c8:
        if (r12 == 0) goto L_0x0246;
    L_0x01ca:
        r1 = android.support.constraint.p026a.C0184e.f677h;
        if (r1 == 0) goto L_0x01e9;
    L_0x01ce:
        r1 = android.support.constraint.p026a.C0184e.f677h;
        r7 = r1.f696B;
        r21 = r4;
        r4 = r7 - r19;
        r1.f696B = r4;
        r1 = android.support.constraint.p026a.C0184e.f677h;
        r4 = r1.f717s;
        r7 = r4 + r19;
        r1.f717s = r7;
        r1 = android.support.constraint.p026a.C0184e.f677h;
        r4 = r1.f723y;
        r7 = r4 + r19;
        r1.f723y = r7;
        goto L_0x01eb;
    L_0x01e9:
        r21 = r4;
    L_0x01eb:
        r1 = r12.ah;
        r1 = r1[r24];
        if (r1 != 0) goto L_0x01f6;
    L_0x01f1:
        if (r12 != r11) goto L_0x01f4;
    L_0x01f3:
        goto L_0x01f6;
    L_0x01f4:
        r5 = 0;
        goto L_0x0242;
    L_0x01f6:
        r4 = (float) r6;
        r4 = r3 / r4;
        r5 = 0;
        r7 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1));
        if (r7 <= 0) goto L_0x0205;
    L_0x01fe:
        r4 = r12.af;
        r4 = r4[r24];
        r4 = r4 * r3;
        r4 = r4 / r16;
    L_0x0205:
        r7 = r12.f600C;
        r7 = r7[r25];
        r7 = r7.m274b();
        r7 = (float) r7;
        r9 = r9 + r7;
        r7 = r12.f600C;
        r7 = r7[r25];
        r7 = r7.f580a;
        r8 = r2.f12919e;
        r7.m8598a(r8, r9);
        r7 = r12.f600C;
        r7 = r7[r21];
        r7 = r7.f580a;
        r8 = r2.f12919e;
        r9 = r9 + r4;
        r7.m8598a(r8, r9);
        r4 = r12.f600C;
        r4 = r4[r25];
        r4 = r4.f580a;
        r4.m8601a(r0);
        r4 = r12.f600C;
        r4 = r4[r21];
        r4 = r4.f580a;
        r4.m8601a(r0);
        r4 = r12.f600C;
        r4 = r4[r21];
        r4 = r4.m274b();
        r4 = (float) r4;
        r9 = r9 + r4;
    L_0x0242:
        r12 = r1;
        r4 = r21;
        goto L_0x01c8;
    L_0x0246:
        r1 = 1;
        return r1;
    L_0x0248:
        r21 = r4;
        r4 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1));
        if (r4 >= 0) goto L_0x0250;
    L_0x024e:
        r4 = 0;
        return r4;
    L_0x0250:
        if (r5 == 0) goto L_0x02cd;
    L_0x0252:
        r3 = r3 - r1;
        r1 = r26;
        r1 = r1.f617U;
        r3 = r3 * r1;
        r9 = r9 + r3;
    L_0x0259:
        if (r12 == 0) goto L_0x02cb;
    L_0x025b:
        r1 = android.support.constraint.p026a.C0184e.f677h;
        if (r1 == 0) goto L_0x0277;
    L_0x025f:
        r1 = android.support.constraint.p026a.C0184e.f677h;
        r3 = r1.f696B;
        r5 = r3 - r19;
        r1.f696B = r5;
        r1 = android.support.constraint.p026a.C0184e.f677h;
        r3 = r1.f717s;
        r5 = r3 + r19;
        r1.f717s = r5;
        r1 = android.support.constraint.p026a.C0184e.f677h;
        r3 = r1.f723y;
        r5 = r3 + r19;
        r1.f723y = r5;
    L_0x0277:
        r1 = r12.ah;
        r1 = r1[r24];
        if (r1 != 0) goto L_0x027f;
    L_0x027d:
        if (r12 != r11) goto L_0x02c9;
    L_0x027f:
        if (r24 != 0) goto L_0x0287;
    L_0x0281:
        r3 = r12.m308l();
    L_0x0285:
        r3 = (float) r3;
        goto L_0x028c;
    L_0x0287:
        r3 = r12.m309m();
        goto L_0x0285;
    L_0x028c:
        r4 = r12.f600C;
        r4 = r4[r25];
        r4 = r4.m274b();
        r4 = (float) r4;
        r9 = r9 + r4;
        r4 = r12.f600C;
        r4 = r4[r25];
        r4 = r4.f580a;
        r5 = r2.f12919e;
        r4.m8598a(r5, r9);
        r4 = r12.f600C;
        r4 = r4[r21];
        r4 = r4.f580a;
        r5 = r2.f12919e;
        r9 = r9 + r3;
        r4.m8598a(r5, r9);
        r3 = r12.f600C;
        r3 = r3[r25];
        r3 = r3.f580a;
        r3.m8601a(r0);
        r3 = r12.f600C;
        r3 = r3[r21];
        r3 = r3.f580a;
        r3.m8601a(r0);
        r3 = r12.f600C;
        r3 = r3[r21];
        r3 = r3.m274b();
        r3 = (float) r3;
        r9 = r9 + r3;
    L_0x02c9:
        r12 = r1;
        goto L_0x0259;
    L_0x02cb:
        r0 = 1;
        return r0;
    L_0x02cd:
        if (r7 != 0) goto L_0x02d1;
    L_0x02cf:
        if (r8 == 0) goto L_0x02cb;
    L_0x02d1:
        if (r7 == 0) goto L_0x02d5;
    L_0x02d3:
        r3 = r3 - r1;
        goto L_0x02d8;
    L_0x02d5:
        if (r8 == 0) goto L_0x02d8;
    L_0x02d7:
        goto L_0x02d3;
    L_0x02d8:
        r1 = r13 + 1;
        r1 = (float) r1;
        r1 = r3 / r1;
        if (r8 == 0) goto L_0x02eb;
    L_0x02df:
        r4 = 1;
        if (r13 <= r4) goto L_0x02e8;
    L_0x02e2:
        r1 = r13 + -1;
        r1 = (float) r1;
    L_0x02e5:
        r1 = r3 / r1;
        goto L_0x02eb;
    L_0x02e8:
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        goto L_0x02e5;
    L_0x02eb:
        r3 = r9 + r1;
        if (r8 == 0) goto L_0x02fc;
    L_0x02ef:
        r4 = 1;
        if (r13 <= r4) goto L_0x02fc;
    L_0x02f2:
        r3 = r12.f600C;
        r3 = r3[r25];
        r3 = r3.m274b();
        r3 = (float) r3;
        r3 = r3 + r9;
    L_0x02fc:
        if (r7 == 0) goto L_0x030a;
    L_0x02fe:
        if (r12 == 0) goto L_0x030a;
    L_0x0300:
        r4 = r12.f600C;
        r4 = r4[r25];
        r4 = r4.m274b();
        r4 = (float) r4;
        r3 = r3 + r4;
    L_0x030a:
        if (r12 == 0) goto L_0x02cb;
    L_0x030c:
        r4 = android.support.constraint.p026a.C0184e.f677h;
        if (r4 == 0) goto L_0x0328;
    L_0x0310:
        r4 = android.support.constraint.p026a.C0184e.f677h;
        r5 = r4.f696B;
        r7 = r5 - r19;
        r4.f696B = r7;
        r4 = android.support.constraint.p026a.C0184e.f677h;
        r5 = r4.f717s;
        r7 = r5 + r19;
        r4.f717s = r7;
        r4 = android.support.constraint.p026a.C0184e.f677h;
        r5 = r4.f723y;
        r7 = r5 + r19;
        r4.f723y = r7;
    L_0x0328:
        r4 = r12.ah;
        r4 = r4[r24];
        if (r4 != 0) goto L_0x0330;
    L_0x032e:
        if (r12 != r11) goto L_0x0369;
    L_0x0330:
        if (r24 != 0) goto L_0x0338;
    L_0x0332:
        r5 = r12.m308l();
    L_0x0336:
        r5 = (float) r5;
        goto L_0x033d;
    L_0x0338:
        r5 = r12.m309m();
        goto L_0x0336;
    L_0x033d:
        r6 = r12.f600C;
        r6 = r6[r25];
        r6 = r6.f580a;
        r7 = r2.f12919e;
        r6.m8598a(r7, r3);
        r6 = r12.f600C;
        r6 = r6[r21];
        r6 = r6.f580a;
        r7 = r2.f12919e;
        r8 = r3 + r5;
        r6.m8598a(r7, r8);
        r6 = r12.f600C;
        r6 = r6[r25];
        r6 = r6.f580a;
        r6.m8601a(r0);
        r6 = r12.f600C;
        r6 = r6[r21];
        r6 = r6.f580a;
        r6.m8601a(r0);
        r5 = r5 + r1;
        r3 = r3 + r5;
    L_0x0369:
        r12 = r4;
        goto L_0x030a;
        return r0;
    L_0x036c:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.a.a.h.a(android.support.constraint.a.a.e, android.support.constraint.a.e, int, int, android.support.constraint.a.a.d):boolean");
    }
}
