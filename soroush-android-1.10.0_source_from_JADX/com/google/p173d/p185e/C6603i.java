package com.google.p173d.p185e;

import com.google.p173d.C1958a;
import com.google.p173d.C2007e;
import com.google.p173d.C2045l;
import com.google.p173d.p185e.p186a.C7145e;
import com.google.p173d.p185e.p186a.p187a.C7144c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class C6603i extends C5612k {
    private final C5612k[] f18837a;

    public C6603i(Map<C2007e, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(C2007e.POSSIBLE_FORMATS);
        boolean z = (map == null || map.get(C2007e.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        Collection arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(C1958a.EAN_13) || collection.contains(C1958a.UPC_A) || collection.contains(C1958a.EAN_8) || collection.contains(C1958a.UPC_E)) {
                arrayList.add(new C6604j(map));
            }
            if (collection.contains(C1958a.CODE_39)) {
                arrayList.add(new C6600c(z));
            }
            if (collection.contains(C1958a.CODE_93)) {
                arrayList.add(new C6601d());
            }
            if (collection.contains(C1958a.CODE_128)) {
                arrayList.add(new C6599b());
            }
            if (collection.contains(C1958a.ITF)) {
                arrayList.add(new C6602h());
            }
            if (collection.contains(C1958a.CODABAR)) {
                arrayList.add(new C6598a());
            }
            if (collection.contains(C1958a.RSS_14)) {
                arrayList.add(new C7145e());
            }
            if (collection.contains(C1958a.RSS_EXPANDED)) {
                arrayList.add(new C7144c());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C6604j(map));
            arrayList.add(new C6600c());
            arrayList.add(new C6598a());
            arrayList.add(new C6601d());
            arrayList.add(new C6599b());
            arrayList.add(new C6602h());
            arrayList.add(new C7145e());
            arrayList.add(new C7144c());
        }
        this.f18837a = (C5612k[]) arrayList.toArray(new C5612k[arrayList.size()]);
    }

    public final com.google.p173d.C2047n mo3064a(int r5, com.google.p173d.p177b.C1961a r6, java.util.Map<com.google.p173d.C2007e, ?> r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r4.f18837a;
        r1 = 0;
        r2 = r0.length;
    L_0x0004:
        if (r1 >= r2) goto L_0x0010;
    L_0x0006:
        r3 = r0[r1];
        r3 = r3.mo3064a(r5, r6, r7);	 Catch:{ m -> 0x000d }
        return r3;
    L_0x000d:
        r1 = r1 + 1;
        goto L_0x0004;
    L_0x0010:
        r5 = com.google.p173d.C5629j.m12369a();
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.e.i.a(int, com.google.d.b.a, java.util.Map):com.google.d.n");
    }

    public final void mo1758a() {
        for (C2045l a : this.f18837a) {
            a.mo1758a();
        }
    }
}
