package com.google.p173d.p180c;

import com.google.p173d.C2045l;
import com.google.p173d.C2049p;
import com.google.p173d.p180c.p181a.C1980d;

public final class C5603a implements C2045l {
    private static final C2049p[] f15460a = new C2049p[0];
    private final C1980d f15461b = new C1980d();

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p173d.C2047n mo1757a(com.google.p173d.C1987c r28, java.util.Map<com.google.p173d.C2007e, ?> r29) {
        /*
        r27 = this;
        r0 = r27;
        r1 = r29;
        r2 = 0;
        r3 = 1;
        if (r1 == 0) goto L_0x008f;
    L_0x0008:
        r4 = com.google.p173d.C2007e.PURE_BARCODE;
        r1 = r1.containsKey(r4);
        if (r1 == 0) goto L_0x008f;
    L_0x0010:
        r1 = r28.m5457b();
        r4 = r1.m5417a();
        r5 = r1.m5420b();
        if (r4 == 0) goto L_0x008a;
    L_0x001e:
        if (r5 != 0) goto L_0x0022;
    L_0x0020:
        goto L_0x008a;
    L_0x0022:
        r6 = r1.f6573a;
        r7 = r4[r2];
        r8 = r4[r3];
    L_0x0028:
        if (r7 >= r6) goto L_0x0033;
    L_0x002a:
        r9 = r1.m5416a(r7, r8);
        if (r9 == 0) goto L_0x0033;
    L_0x0030:
        r7 = r7 + 1;
        goto L_0x0028;
    L_0x0033:
        if (r7 != r6) goto L_0x003a;
    L_0x0035:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
    L_0x003a:
        r6 = r4[r2];
        r7 = r7 - r6;
        if (r7 != 0) goto L_0x0044;
    L_0x003f:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
    L_0x0044:
        r6 = r4[r3];
        r8 = r5[r3];
        r4 = r4[r2];
        r5 = r5[r2];
        r5 = r5 - r4;
        r5 = r5 + r3;
        r5 = r5 / r7;
        r8 = r8 - r6;
        r8 = r8 + r3;
        r8 = r8 / r7;
        if (r5 <= 0) goto L_0x0085;
    L_0x0054:
        if (r8 > 0) goto L_0x0057;
    L_0x0056:
        goto L_0x0085;
    L_0x0057:
        r3 = r7 / 2;
        r6 = r6 + r3;
        r4 = r4 + r3;
        r3 = new com.google.d.b.b;
        r3.<init>(r5, r8);
        r9 = r2;
    L_0x0061:
        if (r9 >= r8) goto L_0x007b;
    L_0x0063:
        r10 = r9 * r7;
        r10 = r10 + r6;
        r11 = r2;
    L_0x0067:
        if (r11 >= r5) goto L_0x0078;
    L_0x0069:
        r12 = r11 * r7;
        r12 = r12 + r4;
        r12 = r1.m5416a(r12, r10);
        if (r12 == 0) goto L_0x0075;
    L_0x0072:
        r3.m5418b(r11, r9);
    L_0x0075:
        r11 = r11 + 1;
        goto L_0x0067;
    L_0x0078:
        r9 = r9 + 1;
        goto L_0x0061;
    L_0x007b:
        r1 = r0.f15461b;
        r1 = r1.m5449a(r3);
        r2 = f15460a;
        goto L_0x0326;
    L_0x0085:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
    L_0x008a:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
    L_0x008f:
        r1 = new com.google.d.c.b.a;
        r4 = r28.m5457b();
        r1.<init>(r4);
        r4 = r1.f6673b;
        r4 = r4.m5392a();
        r5 = r4[r2];
        r6 = r4[r3];
        r7 = 2;
        r8 = r4[r7];
        r9 = 3;
        r4 = r4[r9];
        r10 = new java.util.ArrayList;
        r11 = 4;
        r10.<init>(r11);
        r12 = r1.m5455b(r5, r6);
        r10.add(r12);
        r12 = r1.m5455b(r5, r8);
        r10.add(r12);
        r12 = r1.m5455b(r6, r4);
        r10.add(r12);
        r12 = r1.m5455b(r8, r4);
        r10.add(r12);
        r12 = new com.google.d.c.b.a$b;
        r12.<init>();
        java.util.Collections.sort(r10, r12);
        r12 = r10.get(r2);
        r12 = (com.google.p173d.p180c.p182b.C1986a.C1984a) r12;
        r10 = r10.get(r3);
        r10 = (com.google.p173d.p180c.p182b.C1986a.C1984a) r10;
        r13 = new java.util.HashMap;
        r13.<init>();
        r14 = r12.f6669a;
        com.google.p173d.p180c.p182b.C1986a.m5453a(r13, r14);
        r12 = r12.f6670b;
        com.google.p173d.p180c.p182b.C1986a.m5453a(r13, r12);
        r12 = r10.f6669a;
        com.google.p173d.p180c.p182b.C1986a.m5453a(r13, r12);
        r10 = r10.f6670b;
        com.google.p173d.p180c.p182b.C1986a.m5453a(r13, r10);
        r10 = r13.entrySet();
        r10 = r10.iterator();
        r14 = 0;
        r15 = 0;
        r16 = 0;
    L_0x0103:
        r17 = r10.hasNext();
        if (r17 == 0) goto L_0x012e;
    L_0x0109:
        r17 = r10.next();
        r12 = r17;
        r12 = (java.util.Map.Entry) r12;
        r17 = r12.getKey();
        r17 = (com.google.p173d.C2049p) r17;
        r12 = r12.getValue();
        r12 = (java.lang.Integer) r12;
        r12 = r12.intValue();
        if (r12 != r7) goto L_0x0126;
    L_0x0123:
        r15 = r17;
        goto L_0x0103;
    L_0x0126:
        if (r14 != 0) goto L_0x012b;
    L_0x0128:
        r14 = r17;
        goto L_0x0103;
    L_0x012b:
        r16 = r17;
        goto L_0x0103;
    L_0x012e:
        if (r14 == 0) goto L_0x0344;
    L_0x0130:
        if (r15 == 0) goto L_0x0344;
    L_0x0132:
        if (r16 != 0) goto L_0x0136;
    L_0x0134:
        goto L_0x0344;
    L_0x0136:
        r10 = new com.google.p173d.C2049p[r9];
        r10[r2] = r14;
        r10[r3] = r15;
        r10[r7] = r16;
        com.google.p173d.C2049p.m5584a(r10);
        r12 = r10[r2];
        r14 = r10[r3];
        r10 = r10[r7];
        r15 = r13.containsKey(r5);
        if (r15 != 0) goto L_0x014f;
    L_0x014d:
        r4 = r5;
        goto L_0x015e;
    L_0x014f:
        r5 = r13.containsKey(r6);
        if (r5 == 0) goto L_0x015d;
    L_0x0155:
        r5 = r13.containsKey(r8);
        if (r5 != 0) goto L_0x015e;
    L_0x015b:
        r4 = r8;
        goto L_0x015e;
    L_0x015d:
        r4 = r6;
    L_0x015e:
        r5 = r1.m5455b(r10, r4);
        r5 = r5.f6671c;
        r6 = r1.m5455b(r12, r4);
        r6 = r6.f6671c;
        r8 = r5 & 1;
        if (r8 != r3) goto L_0x0170;
    L_0x016e:
        r5 = r5 + 1;
    L_0x0170:
        r5 = r5 + r7;
        r8 = r6 & 1;
        if (r8 != r3) goto L_0x0177;
    L_0x0175:
        r6 = r6 + 1;
    L_0x0177:
        r6 = r6 + r7;
        r8 = r11 * r5;
        r13 = r6 * 7;
        if (r8 >= r13) goto L_0x0244;
    L_0x017e:
        r8 = r11 * r6;
        r13 = r5 * 7;
        if (r8 < r13) goto L_0x0186;
    L_0x0184:
        goto L_0x0244;
    L_0x0186:
        r5 = java.lang.Math.min(r6, r5);
        r6 = com.google.p173d.p180c.p182b.C1986a.m5451a(r14, r12);
        r6 = (float) r6;
        r5 = (float) r5;
        r6 = r6 / r5;
        r8 = com.google.p173d.p180c.p182b.C1986a.m5451a(r10, r4);
        r13 = r4.f6891a;
        r15 = r10.f6891a;
        r13 = r13 - r15;
        r8 = (float) r8;
        r13 = r13 / r8;
        r15 = r4.f6892b;
        r9 = r10.f6892b;
        r15 = r15 - r9;
        r15 = r15 / r8;
        r8 = new com.google.d.p;
        r9 = r4.f6891a;
        r13 = r13 * r6;
        r9 = r9 + r13;
        r13 = r4.f6892b;
        r6 = r6 * r15;
        r13 = r13 + r6;
        r8.<init>(r9, r13);
        r6 = com.google.p173d.p180c.p182b.C1986a.m5451a(r14, r10);
        r6 = (float) r6;
        r6 = r6 / r5;
        r5 = com.google.p173d.p180c.p182b.C1986a.m5451a(r12, r4);
        r9 = r4.f6891a;
        r13 = r12.f6891a;
        r9 = r9 - r13;
        r5 = (float) r5;
        r9 = r9 / r5;
        r13 = r4.f6892b;
        r15 = r12.f6892b;
        r13 = r13 - r15;
        r13 = r13 / r5;
        r5 = new com.google.d.p;
        r15 = r4.f6891a;
        r9 = r9 * r6;
        r15 = r15 + r9;
        r9 = r4.f6892b;
        r6 = r6 * r13;
        r9 = r9 + r6;
        r5.<init>(r15, r9);
        r6 = r1.m5454a(r8);
        if (r6 != 0) goto L_0x01e2;
    L_0x01d9:
        r6 = r1.m5454a(r5);
        if (r6 != 0) goto L_0x0210;
    L_0x01df:
        r18 = 0;
        goto L_0x0212;
    L_0x01e2:
        r6 = r1.m5454a(r5);
        if (r6 != 0) goto L_0x01e9;
    L_0x01e8:
        goto L_0x020d;
    L_0x01e9:
        r6 = r1.m5455b(r10, r8);
        r6 = r6.f6671c;
        r9 = r1.m5455b(r12, r8);
        r9 = r9.f6671c;
        r6 = r6 - r9;
        r6 = java.lang.Math.abs(r6);
        r9 = r1.m5455b(r10, r5);
        r9 = r9.f6671c;
        r13 = r1.m5455b(r12, r5);
        r13 = r13.f6671c;
        r9 = r9 - r13;
        r9 = java.lang.Math.abs(r9);
        if (r6 > r9) goto L_0x0210;
    L_0x020d:
        r18 = r8;
        goto L_0x0212;
    L_0x0210:
        r18 = r5;
    L_0x0212:
        if (r18 != 0) goto L_0x0215;
    L_0x0214:
        goto L_0x0217;
    L_0x0215:
        r4 = r18;
    L_0x0217:
        r5 = r1.m5455b(r10, r4);
        r5 = r5.f6671c;
        r6 = r1.m5455b(r12, r4);
        r6 = r6.f6671c;
        r5 = java.lang.Math.max(r5, r6);
        r5 = r5 + r3;
        r6 = r5 & 1;
        if (r6 != r3) goto L_0x022e;
    L_0x022c:
        r5 = r5 + 1;
    L_0x022e:
        r25 = r5;
        r1 = r1.f6672a;
        r19 = r1;
        r20 = r10;
        r21 = r14;
        r22 = r12;
        r23 = r4;
        r24 = r25;
    L_0x023e:
        r1 = com.google.p173d.p180c.p182b.C1986a.m5452a(r19, r20, r21, r22, r23, r24, r25);
        goto L_0x030a;
    L_0x0244:
        r8 = com.google.p173d.p180c.p182b.C1986a.m5451a(r14, r12);
        r8 = (float) r8;
        r9 = (float) r5;
        r8 = r8 / r9;
        r9 = com.google.p173d.p180c.p182b.C1986a.m5451a(r10, r4);
        r13 = r4.f6891a;
        r15 = r10.f6891a;
        r13 = r13 - r15;
        r9 = (float) r9;
        r13 = r13 / r9;
        r15 = r4.f6892b;
        r7 = r10.f6892b;
        r15 = r15 - r7;
        r15 = r15 / r9;
        r7 = new com.google.d.p;
        r9 = r4.f6891a;
        r13 = r13 * r8;
        r9 = r9 + r13;
        r13 = r4.f6892b;
        r8 = r8 * r15;
        r13 = r13 + r8;
        r7.<init>(r9, r13);
        r8 = com.google.p173d.p180c.p182b.C1986a.m5451a(r14, r10);
        r8 = (float) r8;
        r9 = (float) r6;
        r8 = r8 / r9;
        r9 = com.google.p173d.p180c.p182b.C1986a.m5451a(r12, r4);
        r13 = r4.f6891a;
        r15 = r12.f6891a;
        r13 = r13 - r15;
        r9 = (float) r9;
        r13 = r13 / r9;
        r15 = r4.f6892b;
        r2 = r12.f6892b;
        r15 = r15 - r2;
        r15 = r15 / r9;
        r2 = new com.google.d.p;
        r9 = r4.f6891a;
        r13 = r13 * r8;
        r9 = r9 + r13;
        r13 = r4.f6892b;
        r8 = r8 * r15;
        r13 = r13 + r8;
        r2.<init>(r9, r13);
        r8 = r1.m5454a(r7);
        if (r8 != 0) goto L_0x029d;
    L_0x0294:
        r5 = r1.m5454a(r2);
        if (r5 != 0) goto L_0x02d9;
    L_0x029a:
        r18 = 0;
        goto L_0x02db;
    L_0x029d:
        r8 = r1.m5454a(r2);
        if (r8 != 0) goto L_0x02a4;
    L_0x02a3:
        goto L_0x02d6;
    L_0x02a4:
        r8 = r1.m5455b(r10, r7);
        r8 = r8.f6671c;
        r8 = r5 - r8;
        r8 = java.lang.Math.abs(r8);
        r9 = r1.m5455b(r12, r7);
        r9 = r9.f6671c;
        r9 = r6 - r9;
        r9 = java.lang.Math.abs(r9);
        r8 = r8 + r9;
        r9 = r1.m5455b(r10, r2);
        r9 = r9.f6671c;
        r5 = r5 - r9;
        r5 = java.lang.Math.abs(r5);
        r9 = r1.m5455b(r12, r2);
        r9 = r9.f6671c;
        r6 = r6 - r9;
        r6 = java.lang.Math.abs(r6);
        r5 = r5 + r6;
        if (r8 > r5) goto L_0x02d9;
    L_0x02d6:
        r18 = r7;
        goto L_0x02db;
    L_0x02d9:
        r18 = r2;
    L_0x02db:
        if (r18 != 0) goto L_0x02de;
    L_0x02dd:
        goto L_0x02e0;
    L_0x02de:
        r4 = r18;
    L_0x02e0:
        r2 = r1.m5455b(r10, r4);
        r2 = r2.f6671c;
        r5 = r1.m5455b(r12, r4);
        r5 = r5.f6671c;
        r6 = r2 & 1;
        if (r6 != r3) goto L_0x02f2;
    L_0x02f0:
        r2 = r2 + 1;
    L_0x02f2:
        r24 = r2;
        r2 = r5 & 1;
        if (r2 != r3) goto L_0x02fa;
    L_0x02f8:
        r5 = r5 + 1;
    L_0x02fa:
        r25 = r5;
        r1 = r1.f6672a;
        r19 = r1;
        r20 = r10;
        r21 = r14;
        r22 = r12;
        r23 = r4;
        goto L_0x023e;
    L_0x030a:
        r2 = new com.google.d.b.g;
        r5 = new com.google.p173d.C2049p[r11];
        r6 = 0;
        r5[r6] = r10;
        r5[r3] = r14;
        r3 = 2;
        r5[r3] = r12;
        r3 = 3;
        r5[r3] = r4;
        r2.<init>(r1, r5);
        r1 = r0.f15461b;
        r3 = r2.f6622d;
        r1 = r1.m5449a(r3);
        r2 = r2.f6623e;
    L_0x0326:
        r3 = new com.google.d.n;
        r4 = r1.f6614c;
        r5 = r1.f6612a;
        r6 = com.google.p173d.C1958a.DATA_MATRIX;
        r3.<init>(r4, r5, r2, r6);
        r2 = r1.f6615d;
        if (r2 == 0) goto L_0x033a;
    L_0x0335:
        r4 = com.google.p173d.C2048o.BYTE_SEGMENTS;
        r3.m5581a(r4, r2);
    L_0x033a:
        r1 = r1.f6616e;
        if (r1 == 0) goto L_0x0343;
    L_0x033e:
        r2 = com.google.p173d.C2048o.ERROR_CORRECTION_LEVEL;
        r3.m5581a(r2, r1);
    L_0x0343:
        return r3;
    L_0x0344:
        r1 = com.google.p173d.C5629j.m12369a();
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.c.a.a(com.google.d.c, java.util.Map):com.google.d.n");
    }

    public final void mo1758a() {
    }
}
