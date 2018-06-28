package org.json.p613a.p614a;

import java.util.LinkedList;

public final class C7810b {
    private LinkedList f24842a;
    private C7812d f24843b = new C7812d();
    private C7813e f24844c = null;
    private int f24845d = 0;

    private static int m22085a(LinkedList linkedList) {
        return linkedList.size() == 0 ? -1 : ((Integer) linkedList.getFirst()).intValue();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m22086a(java.io.Reader r9) {
        /*
        r8 = this;
        r0 = r8.f24843b;
        r0.f24856a = r9;
        r9 = 1;
        r0.f24865j = r9;
        r1 = 0;
        r0.f24866k = r1;
        r0.f24860e = r1;
        r0.f24861f = r1;
        r0.f24858c = r1;
        r0.f24859d = r1;
        r0.f24864i = r1;
        r0.f24863h = r1;
        r0.f24862g = r1;
        r0.f24857b = r1;
        r0 = 0;
        r8.f24844c = r0;
        r8.f24845d = r1;
        r8.f24842a = r0;
        r1 = new java.util.LinkedList;
        r1.<init>();
        r2 = new java.util.LinkedList;
        r2.<init>();
    L_0x002b:
        r3 = r8.f24843b;	 Catch:{ IOException -> 0x01f2 }
        r3 = r3.m22088a();	 Catch:{ IOException -> 0x01f2 }
        r8.f24844c = r3;	 Catch:{ IOException -> 0x01f2 }
        r3 = r8.f24844c;	 Catch:{ IOException -> 0x01f2 }
        r4 = -1;
        if (r3 != 0) goto L_0x003f;
    L_0x0038:
        r3 = new org.json.a.a.e;	 Catch:{ IOException -> 0x01f2 }
        r3.<init>(r4, r0);	 Catch:{ IOException -> 0x01f2 }
        r8.f24844c = r3;	 Catch:{ IOException -> 0x01f2 }
    L_0x003f:
        r3 = r8.f24845d;	 Catch:{ IOException -> 0x01f2 }
        r5 = 2;
        r6 = 3;
        switch(r3) {
            case -1: goto L_0x01c4;
            case 0: goto L_0x0181;
            case 1: goto L_0x016a;
            case 2: goto L_0x012c;
            case 3: goto L_0x00c2;
            case 4: goto L_0x0048;
            default: goto L_0x0046;
        };	 Catch:{ IOException -> 0x01f2 }
    L_0x0046:
        goto L_0x01d0;
    L_0x0048:
        r3 = r8.f24844c;	 Catch:{ IOException -> 0x01f2 }
        r3 = r3.f24870a;	 Catch:{ IOException -> 0x01f2 }
        if (r3 == r6) goto L_0x009e;
    L_0x004e:
        r6 = 6;
        if (r3 == r6) goto L_0x01d0;
    L_0x0051:
        switch(r3) {
            case 0: goto L_0x0080;
            case 1: goto L_0x0058;
            default: goto L_0x0054;
        };	 Catch:{ IOException -> 0x01f2 }
    L_0x0054:
        r8.f24845d = r4;	 Catch:{ IOException -> 0x01f2 }
        goto L_0x01d0;
    L_0x0058:
        r1.removeFirst();	 Catch:{ IOException -> 0x01f2 }
        r3 = r2.removeFirst();	 Catch:{ IOException -> 0x01f2 }
        r3 = (java.lang.String) r3;	 Catch:{ IOException -> 0x01f2 }
        r6 = r2.getFirst();	 Catch:{ IOException -> 0x01f2 }
        r6 = (java.util.Map) r6;	 Catch:{ IOException -> 0x01f2 }
        r7 = new org.json.a.c;	 Catch:{ IOException -> 0x01f2 }
        r7.<init>();	 Catch:{ IOException -> 0x01f2 }
        r6.put(r3, r7);	 Catch:{ IOException -> 0x01f2 }
        r8.f24845d = r5;	 Catch:{ IOException -> 0x01f2 }
        r3 = new java.lang.Integer;	 Catch:{ IOException -> 0x01f2 }
        r5 = r8.f24845d;	 Catch:{ IOException -> 0x01f2 }
        r3.<init>(r5);	 Catch:{ IOException -> 0x01f2 }
        r1.addFirst(r3);	 Catch:{ IOException -> 0x01f2 }
    L_0x007b:
        r2.addFirst(r7);	 Catch:{ IOException -> 0x01f2 }
        goto L_0x01d0;
    L_0x0080:
        r1.removeFirst();	 Catch:{ IOException -> 0x01f2 }
        r3 = r2.removeFirst();	 Catch:{ IOException -> 0x01f2 }
        r3 = (java.lang.String) r3;	 Catch:{ IOException -> 0x01f2 }
        r5 = r2.getFirst();	 Catch:{ IOException -> 0x01f2 }
        r5 = (java.util.Map) r5;	 Catch:{ IOException -> 0x01f2 }
        r6 = r8.f24844c;	 Catch:{ IOException -> 0x01f2 }
        r6 = r6.f24871b;	 Catch:{ IOException -> 0x01f2 }
        r5.put(r3, r6);	 Catch:{ IOException -> 0x01f2 }
        r3 = org.json.p613a.p614a.C7810b.m22085a(r1);	 Catch:{ IOException -> 0x01f2 }
    L_0x009a:
        r8.f24845d = r3;	 Catch:{ IOException -> 0x01f2 }
        goto L_0x01d0;
    L_0x009e:
        r1.removeFirst();	 Catch:{ IOException -> 0x01f2 }
        r3 = r2.removeFirst();	 Catch:{ IOException -> 0x01f2 }
        r3 = (java.lang.String) r3;	 Catch:{ IOException -> 0x01f2 }
        r5 = r2.getFirst();	 Catch:{ IOException -> 0x01f2 }
        r5 = (java.util.Map) r5;	 Catch:{ IOException -> 0x01f2 }
        r7 = new org.json.a.a;	 Catch:{ IOException -> 0x01f2 }
        r7.<init>();	 Catch:{ IOException -> 0x01f2 }
        r5.put(r3, r7);	 Catch:{ IOException -> 0x01f2 }
        r8.f24845d = r6;	 Catch:{ IOException -> 0x01f2 }
        r3 = new java.lang.Integer;	 Catch:{ IOException -> 0x01f2 }
        r5 = r8.f24845d;	 Catch:{ IOException -> 0x01f2 }
        r3.<init>(r5);	 Catch:{ IOException -> 0x01f2 }
        r1.addFirst(r3);	 Catch:{ IOException -> 0x01f2 }
        goto L_0x007b;
    L_0x00c2:
        r3 = r8.f24844c;	 Catch:{ IOException -> 0x01f2 }
        r3 = r3.f24870a;	 Catch:{ IOException -> 0x01f2 }
        switch(r3) {
            case 0: goto L_0x011d;
            case 1: goto L_0x00fe;
            case 2: goto L_0x00c9;
            case 3: goto L_0x00df;
            case 4: goto L_0x00ca;
            case 5: goto L_0x01d0;
            default: goto L_0x00c9;
        };	 Catch:{ IOException -> 0x01f2 }
    L_0x00c9:
        goto L_0x0054;
    L_0x00ca:
        r3 = r2.size();	 Catch:{ IOException -> 0x01f2 }
        if (r3 <= r9) goto L_0x00db;
    L_0x00d0:
        r1.removeFirst();	 Catch:{ IOException -> 0x01f2 }
        r2.removeFirst();	 Catch:{ IOException -> 0x01f2 }
        r3 = org.json.p613a.p614a.C7810b.m22085a(r1);	 Catch:{ IOException -> 0x01f2 }
        goto L_0x009a;
    L_0x00db:
        r8.f24845d = r9;	 Catch:{ IOException -> 0x01f2 }
        goto L_0x01d0;
    L_0x00df:
        r3 = r2.getFirst();	 Catch:{ IOException -> 0x01f2 }
        r3 = (java.util.List) r3;	 Catch:{ IOException -> 0x01f2 }
        r5 = new org.json.a.a;	 Catch:{ IOException -> 0x01f2 }
        r5.<init>();	 Catch:{ IOException -> 0x01f2 }
        r3.add(r5);	 Catch:{ IOException -> 0x01f2 }
        r8.f24845d = r6;	 Catch:{ IOException -> 0x01f2 }
        r3 = new java.lang.Integer;	 Catch:{ IOException -> 0x01f2 }
        r6 = r8.f24845d;	 Catch:{ IOException -> 0x01f2 }
        r3.<init>(r6);	 Catch:{ IOException -> 0x01f2 }
        r1.addFirst(r3);	 Catch:{ IOException -> 0x01f2 }
        r2.addFirst(r5);	 Catch:{ IOException -> 0x01f2 }
        goto L_0x01d0;
    L_0x00fe:
        r3 = r2.getFirst();	 Catch:{ IOException -> 0x01f2 }
        r3 = (java.util.List) r3;	 Catch:{ IOException -> 0x01f2 }
        r6 = new org.json.a.c;	 Catch:{ IOException -> 0x01f2 }
        r6.<init>();	 Catch:{ IOException -> 0x01f2 }
        r3.add(r6);	 Catch:{ IOException -> 0x01f2 }
        r8.f24845d = r5;	 Catch:{ IOException -> 0x01f2 }
        r3 = new java.lang.Integer;	 Catch:{ IOException -> 0x01f2 }
        r5 = r8.f24845d;	 Catch:{ IOException -> 0x01f2 }
        r3.<init>(r5);	 Catch:{ IOException -> 0x01f2 }
        r1.addFirst(r3);	 Catch:{ IOException -> 0x01f2 }
        r2.addFirst(r6);	 Catch:{ IOException -> 0x01f2 }
        goto L_0x01d0;
    L_0x011d:
        r3 = r2.getFirst();	 Catch:{ IOException -> 0x01f2 }
        r3 = (java.util.List) r3;	 Catch:{ IOException -> 0x01f2 }
        r5 = r8.f24844c;	 Catch:{ IOException -> 0x01f2 }
        r5 = r5.f24871b;	 Catch:{ IOException -> 0x01f2 }
        r3.add(r5);	 Catch:{ IOException -> 0x01f2 }
        goto L_0x01d0;
    L_0x012c:
        r3 = r8.f24844c;	 Catch:{ IOException -> 0x01f2 }
        r3 = r3.f24870a;	 Catch:{ IOException -> 0x01f2 }
        if (r3 == 0) goto L_0x014b;
    L_0x0132:
        if (r3 == r5) goto L_0x0139;
    L_0x0134:
        r5 = 5;
        if (r3 == r5) goto L_0x01d0;
    L_0x0137:
        goto L_0x0054;
    L_0x0139:
        r3 = r2.size();	 Catch:{ IOException -> 0x01f2 }
        if (r3 <= r9) goto L_0x00db;
    L_0x013f:
        r1.removeFirst();	 Catch:{ IOException -> 0x01f2 }
        r2.removeFirst();	 Catch:{ IOException -> 0x01f2 }
        r3 = org.json.p613a.p614a.C7810b.m22085a(r1);	 Catch:{ IOException -> 0x01f2 }
        goto L_0x009a;
    L_0x014b:
        r3 = r8.f24844c;	 Catch:{ IOException -> 0x01f2 }
        r3 = r3.f24871b;	 Catch:{ IOException -> 0x01f2 }
        r3 = r3 instanceof java.lang.String;	 Catch:{ IOException -> 0x01f2 }
        if (r3 == 0) goto L_0x0054;
    L_0x0153:
        r3 = r8.f24844c;	 Catch:{ IOException -> 0x01f2 }
        r3 = r3.f24871b;	 Catch:{ IOException -> 0x01f2 }
        r3 = (java.lang.String) r3;	 Catch:{ IOException -> 0x01f2 }
        r2.addFirst(r3);	 Catch:{ IOException -> 0x01f2 }
        r3 = 4;
        r8.f24845d = r3;	 Catch:{ IOException -> 0x01f2 }
        r3 = new java.lang.Integer;	 Catch:{ IOException -> 0x01f2 }
        r5 = r8.f24845d;	 Catch:{ IOException -> 0x01f2 }
        r3.<init>(r5);	 Catch:{ IOException -> 0x01f2 }
        r1.addFirst(r3);	 Catch:{ IOException -> 0x01f2 }
        goto L_0x01d0;
    L_0x016a:
        r0 = r8.f24844c;	 Catch:{ IOException -> 0x01f2 }
        r0 = r0.f24870a;	 Catch:{ IOException -> 0x01f2 }
        if (r0 != r4) goto L_0x0175;
    L_0x0170:
        r9 = r2.removeFirst();	 Catch:{ IOException -> 0x01f2 }
        return r9;
    L_0x0175:
        r0 = new org.json.a.a.c;	 Catch:{ IOException -> 0x01f2 }
        r1 = r8.f24843b;	 Catch:{ IOException -> 0x01f2 }
        r1 = r1.f24863h;	 Catch:{ IOException -> 0x01f2 }
        r2 = r8.f24844c;	 Catch:{ IOException -> 0x01f2 }
        r0.<init>(r1, r9, r2);	 Catch:{ IOException -> 0x01f2 }
        throw r0;	 Catch:{ IOException -> 0x01f2 }
    L_0x0181:
        r3 = r8.f24844c;	 Catch:{ IOException -> 0x01f2 }
        r3 = r3.f24870a;	 Catch:{ IOException -> 0x01f2 }
        if (r3 == r6) goto L_0x01b2;
    L_0x0187:
        switch(r3) {
            case 0: goto L_0x01a1;
            case 1: goto L_0x018c;
            default: goto L_0x018a;
        };	 Catch:{ IOException -> 0x01f2 }
    L_0x018a:
        goto L_0x0054;
    L_0x018c:
        r8.f24845d = r5;	 Catch:{ IOException -> 0x01f2 }
        r3 = new java.lang.Integer;	 Catch:{ IOException -> 0x01f2 }
        r5 = r8.f24845d;	 Catch:{ IOException -> 0x01f2 }
        r3.<init>(r5);	 Catch:{ IOException -> 0x01f2 }
        r1.addFirst(r3);	 Catch:{ IOException -> 0x01f2 }
        r3 = new org.json.a.c;	 Catch:{ IOException -> 0x01f2 }
        r3.<init>();	 Catch:{ IOException -> 0x01f2 }
    L_0x019d:
        r2.addFirst(r3);	 Catch:{ IOException -> 0x01f2 }
        goto L_0x01d0;
    L_0x01a1:
        r8.f24845d = r9;	 Catch:{ IOException -> 0x01f2 }
        r3 = new java.lang.Integer;	 Catch:{ IOException -> 0x01f2 }
        r5 = r8.f24845d;	 Catch:{ IOException -> 0x01f2 }
        r3.<init>(r5);	 Catch:{ IOException -> 0x01f2 }
        r1.addFirst(r3);	 Catch:{ IOException -> 0x01f2 }
        r3 = r8.f24844c;	 Catch:{ IOException -> 0x01f2 }
        r3 = r3.f24871b;	 Catch:{ IOException -> 0x01f2 }
        goto L_0x019d;
    L_0x01b2:
        r8.f24845d = r6;	 Catch:{ IOException -> 0x01f2 }
        r3 = new java.lang.Integer;	 Catch:{ IOException -> 0x01f2 }
        r5 = r8.f24845d;	 Catch:{ IOException -> 0x01f2 }
        r3.<init>(r5);	 Catch:{ IOException -> 0x01f2 }
        r1.addFirst(r3);	 Catch:{ IOException -> 0x01f2 }
        r3 = new org.json.a.a;	 Catch:{ IOException -> 0x01f2 }
        r3.<init>();	 Catch:{ IOException -> 0x01f2 }
        goto L_0x019d;
    L_0x01c4:
        r0 = new org.json.a.a.c;	 Catch:{ IOException -> 0x01f2 }
        r1 = r8.f24843b;	 Catch:{ IOException -> 0x01f2 }
        r1 = r1.f24863h;	 Catch:{ IOException -> 0x01f2 }
        r2 = r8.f24844c;	 Catch:{ IOException -> 0x01f2 }
        r0.<init>(r1, r9, r2);	 Catch:{ IOException -> 0x01f2 }
        throw r0;	 Catch:{ IOException -> 0x01f2 }
    L_0x01d0:
        r3 = r8.f24845d;	 Catch:{ IOException -> 0x01f2 }
        if (r3 != r4) goto L_0x01e0;
    L_0x01d4:
        r0 = new org.json.a.a.c;	 Catch:{ IOException -> 0x01f2 }
        r1 = r8.f24843b;	 Catch:{ IOException -> 0x01f2 }
        r1 = r1.f24863h;	 Catch:{ IOException -> 0x01f2 }
        r2 = r8.f24844c;	 Catch:{ IOException -> 0x01f2 }
        r0.<init>(r1, r9, r2);	 Catch:{ IOException -> 0x01f2 }
        throw r0;	 Catch:{ IOException -> 0x01f2 }
    L_0x01e0:
        r3 = r8.f24844c;	 Catch:{ IOException -> 0x01f2 }
        r3 = r3.f24870a;	 Catch:{ IOException -> 0x01f2 }
        if (r3 != r4) goto L_0x002b;
    L_0x01e6:
        r0 = new org.json.a.a.c;
        r1 = r8.f24843b;
        r1 = r1.f24863h;
        r2 = r8.f24844c;
        r0.<init>(r1, r9, r2);
        throw r0;
    L_0x01f2:
        r9 = move-exception;
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.a.a.b.a(java.io.Reader):java.lang.Object");
    }
}
