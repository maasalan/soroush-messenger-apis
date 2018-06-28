package com.google.p173d;

import com.google.p173d.p174a.C5600b;
import com.google.p173d.p180c.C5603a;
import com.google.p173d.p183d.C5604a;
import com.google.p173d.p185e.C6603i;
import com.google.p173d.p189f.C5614b;
import com.google.p173d.p193g.C5624a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class C5628i implements C2045l {
    private Map<C2007e, ?> f15481a;
    private C2045l[] f15482b;

    private com.google.p173d.C2047n m12364b(com.google.p173d.C1987c r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = r5.f15482b;
        if (r0 == 0) goto L_0x0016;
    L_0x0004:
        r0 = r5.f15482b;
        r1 = r0.length;
        r2 = 0;
    L_0x0008:
        if (r2 >= r1) goto L_0x0016;
    L_0x000a:
        r3 = r0[r2];
        r4 = r5.f15481a;	 Catch:{ m -> 0x0013 }
        r3 = r3.mo1757a(r6, r4);	 Catch:{ m -> 0x0013 }
        return r3;
    L_0x0013:
        r2 = r2 + 1;
        goto L_0x0008;
    L_0x0016:
        r6 = com.google.p173d.C5629j.m12369a();
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.i.b(com.google.d.c):com.google.d.n");
    }

    public final C2047n m12365a(C1987c c1987c) {
        if (this.f15482b == null) {
            m12368a(null);
        }
        return m12364b(c1987c);
    }

    public final C2047n mo1757a(C1987c c1987c, Map<C2007e, ?> map) {
        m12368a((Map) map);
        return m12364b(c1987c);
    }

    public final void mo1758a() {
        if (this.f15482b != null) {
            for (C2045l a : this.f15482b) {
                a.mo1758a();
            }
        }
    }

    public final void m12368a(Map<C2007e, ?> map) {
        this.f15481a = map;
        Object obj = null;
        Object obj2 = (map == null || !map.containsKey(C2007e.TRY_HARDER)) ? null : 1;
        Collection collection = map == null ? null : (Collection) map.get(C2007e.POSSIBLE_FORMATS);
        Collection arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(C1958a.UPC_A) || collection.contains(C1958a.UPC_E) || collection.contains(C1958a.EAN_13) || collection.contains(C1958a.EAN_8) || collection.contains(C1958a.CODABAR) || collection.contains(C1958a.CODE_39) || collection.contains(C1958a.CODE_93) || collection.contains(C1958a.CODE_128) || collection.contains(C1958a.ITF) || collection.contains(C1958a.RSS_14) || collection.contains(C1958a.RSS_EXPANDED)) {
                obj = 1;
            }
            if (obj != null && obj2 == null) {
                arrayList.add(new C6603i(map));
            }
            if (collection.contains(C1958a.QR_CODE)) {
                arrayList.add(new C5624a());
            }
            if (collection.contains(C1958a.DATA_MATRIX)) {
                arrayList.add(new C5603a());
            }
            if (collection.contains(C1958a.AZTEC)) {
                arrayList.add(new C5600b());
            }
            if (collection.contains(C1958a.PDF_417)) {
                arrayList.add(new C5614b());
            }
            if (collection.contains(C1958a.MAXICODE)) {
                arrayList.add(new C5604a());
            }
            if (!(obj == null || obj2 == null)) {
                arrayList.add(new C6603i(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (obj2 == null) {
                arrayList.add(new C6603i(map));
            }
            arrayList.add(new C5624a());
            arrayList.add(new C5603a());
            arrayList.add(new C5600b());
            arrayList.add(new C5614b());
            arrayList.add(new C5604a());
            if (obj2 != null) {
                arrayList.add(new C6603i(map));
            }
        }
        this.f15482b = (C2045l[]) arrayList.toArray(new C2045l[arrayList.size()]);
    }
}
