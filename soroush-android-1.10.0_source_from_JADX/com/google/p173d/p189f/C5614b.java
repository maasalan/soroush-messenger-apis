package com.google.p173d.p189f;

import com.google.p173d.C1958a;
import com.google.p173d.C1987c;
import com.google.p173d.C2007e;
import com.google.p173d.C2045l;
import com.google.p173d.C2047n;
import com.google.p173d.C2048o;
import com.google.p173d.C2049p;
import com.google.p173d.C5629j;
import com.google.p173d.p177b.C1969e;
import com.google.p173d.p189f.p190a.C2021j;
import com.google.p173d.p189f.p192b.C2023a;
import com.google.p173d.p189f.p192b.C2024b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class C5614b implements C2045l {
    private static int m12343a(C2049p c2049p, C2049p c2049p2) {
        if (c2049p != null) {
            if (c2049p2 != null) {
                return (int) Math.abs(c2049p.f6891a - c2049p2.f6891a);
            }
        }
        return 0;
    }

    private static int m12344b(C2049p c2049p, C2049p c2049p2) {
        if (c2049p != null) {
            if (c2049p2 != null) {
                return (int) Math.abs(c2049p.f6891a - c2049p2.f6891a);
            }
        }
        return ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    public final C2047n mo1757a(C1987c c1987c, Map<C2007e, ?> map) {
        List arrayList = new ArrayList();
        C2024b a = C2023a.m5531a(c1987c);
        for (C2049p[] c2049pArr : a.f6791b) {
            C1969e a2 = C2021j.m5522a(a.f6790a, c2049pArr[4], c2049pArr[5], c2049pArr[6], c2049pArr[7], Math.min(Math.min(C5614b.m12344b(c2049pArr[0], c2049pArr[4]), (C5614b.m12344b(c2049pArr[6], c2049pArr[2]) * 17) / 18), Math.min(C5614b.m12344b(c2049pArr[1], c2049pArr[5]), (C5614b.m12344b(c2049pArr[7], c2049pArr[3]) * 17) / 18)), Math.max(Math.max(C5614b.m12343a(c2049pArr[0], c2049pArr[4]), (C5614b.m12343a(c2049pArr[6], c2049pArr[2]) * 17) / 18), Math.max(C5614b.m12343a(c2049pArr[1], c2049pArr[5]), (C5614b.m12343a(c2049pArr[7], c2049pArr[3]) * 17) / 18)));
            C2047n c2047n = new C2047n(a2.f6614c, a2.f6612a, c2049pArr, C1958a.PDF_417);
            c2047n.m5581a(C2048o.ERROR_CORRECTION_LEVEL, a2.f6616e);
            C2025c c2025c = (C2025c) a2.f6619h;
            if (c2025c != null) {
                c2047n.m5581a(C2048o.PDF417_EXTRA_METADATA, c2025c);
            }
            arrayList.add(c2047n);
        }
        C2047n[] c2047nArr = (C2047n[]) arrayList.toArray(new C2047n[arrayList.size()]);
        if (!(c2047nArr == null || c2047nArr.length == 0)) {
            if (c2047nArr[0] != null) {
                return c2047nArr[0];
            }
        }
        throw C5629j.m12369a();
    }

    public final void mo1758a() {
    }
}
