package com.google.p173d.p185e;

import com.google.p173d.C1958a;
import com.google.p173d.C2007e;
import com.google.p173d.C2045l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class C6604j extends C5612k {
    private final C6605p[] f18838a;

    public C6604j(Map<C2007e, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(C2007e.POSSIBLE_FORMATS);
        Collection arrayList = new ArrayList();
        if (collection != null) {
            Object c7146e;
            if (collection.contains(C1958a.EAN_13)) {
                c7146e = new C7146e();
            } else {
                if (collection.contains(C1958a.UPC_A)) {
                    c7146e = new C7148l();
                }
                if (collection.contains(C1958a.EAN_8)) {
                    arrayList.add(new C7147f());
                }
                if (collection.contains(C1958a.UPC_E)) {
                    arrayList.add(new C7149q());
                }
            }
            arrayList.add(c7146e);
            if (collection.contains(C1958a.EAN_8)) {
                arrayList.add(new C7147f());
            }
            if (collection.contains(C1958a.UPC_E)) {
                arrayList.add(new C7149q());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C7146e());
            arrayList.add(new C7147f());
            arrayList.add(new C7149q());
        }
        this.f18838a = (C6605p[]) arrayList.toArray(new C6605p[arrayList.size()]);
    }

    public final com.google.p173d.C2047n mo3064a(int r7, com.google.p173d.p177b.C1961a r8, java.util.Map<com.google.p173d.C2007e, ?> r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = com.google.p173d.p185e.C6605p.m16926a(r8);
        r1 = r6.f18838a;
        r2 = 0;
        r3 = r1.length;
        r4 = r2;
    L_0x0009:
        if (r4 >= r3) goto L_0x005b;
    L_0x000b:
        r5 = r1[r4];
        r5 = r5.mo3423a(r7, r8, r0, r9);	 Catch:{ m -> 0x0058 }
        r7 = r5.f6875d;
        r8 = com.google.p173d.C1958a.EAN_13;
        r0 = 1;
        if (r7 != r8) goto L_0x0024;
    L_0x0018:
        r7 = r5.f6872a;
        r7 = r7.charAt(r2);
        r8 = 48;
        if (r7 != r8) goto L_0x0024;
    L_0x0022:
        r7 = r0;
        goto L_0x0025;
    L_0x0024:
        r7 = r2;
    L_0x0025:
        if (r9 != 0) goto L_0x0029;
    L_0x0027:
        r8 = 0;
        goto L_0x0031;
    L_0x0029:
        r8 = com.google.p173d.C2007e.POSSIBLE_FORMATS;
        r8 = r9.get(r8);
        r8 = (java.util.Collection) r8;
    L_0x0031:
        if (r8 == 0) goto L_0x003b;
    L_0x0033:
        r9 = com.google.p173d.C1958a.UPC_A;
        r8 = r8.contains(r9);
        if (r8 == 0) goto L_0x003c;
    L_0x003b:
        r2 = r0;
    L_0x003c:
        if (r7 == 0) goto L_0x0057;
    L_0x003e:
        if (r2 == 0) goto L_0x0057;
    L_0x0040:
        r7 = new com.google.d.n;
        r8 = r5.f6872a;
        r8 = r8.substring(r0);
        r9 = r5.f6873b;
        r0 = r5.f6874c;
        r1 = com.google.p173d.C1958a.UPC_A;
        r7.<init>(r8, r9, r0, r1);
        r8 = r5.f6876e;
        r7.m5582a(r8);
        return r7;
    L_0x0057:
        return r5;
    L_0x0058:
        r4 = r4 + 1;
        goto L_0x0009;
    L_0x005b:
        r7 = com.google.p173d.C5629j.m12369a();
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.e.j.a(int, com.google.d.b.a, java.util.Map):com.google.d.n");
    }

    public final void mo1758a() {
        for (C2045l a : this.f18838a) {
            a.mo1758a();
        }
    }
}
