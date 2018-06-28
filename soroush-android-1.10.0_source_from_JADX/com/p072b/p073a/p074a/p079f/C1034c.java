package com.p072b.p073a.p074a.p079f;

import com.p072b.p073a.p074a.p078e.C1028b;
import java.util.Arrays;

public final class C1034c {
    C1033b[] f3340a = new C1033b[C1038i.values().length];
    int[] f3341b = new int[this.f3340a.length];

    public C1034c() {
        Arrays.fill(this.f3341b, 0);
    }

    public final <T extends C1033b> T m2518a(Class<T> cls) {
        Throwable e;
        StringBuilder stringBuilder;
        String stringBuilder2;
        Object[] objArr;
        C1038i c1038i = (C1038i) C1038i.f3353m.get(cls);
        synchronized (c1038i) {
            T t = this.f3340a[c1038i.ordinal()];
            if (t != null) {
                this.f3340a[c1038i.ordinal()] = t.f3338b;
                int[] iArr = this.f3341b;
                int ordinal = c1038i.ordinal();
                iArr[ordinal] = iArr[ordinal] - 1;
                t.f3338b = null;
                return t;
            }
            try {
                C1033b c1033b = (C1033b) cls.newInstance();
                return c1033b;
            } catch (InstantiationException e2) {
                e = e2;
                stringBuilder = new StringBuilder("Cannot create an instance of ");
                stringBuilder.append(cls);
                stringBuilder.append(". Make sure it has a empty constructor.");
                stringBuilder2 = stringBuilder.toString();
                objArr = new Object[0];
                C1028b.m2505a(e, stringBuilder2, objArr);
                return null;
            } catch (IllegalAccessException e3) {
                e = e3;
                stringBuilder = new StringBuilder("Cannot create an instance of ");
                stringBuilder.append(cls);
                stringBuilder.append(". Make sure it has a public empty constructor.");
                stringBuilder2 = stringBuilder.toString();
                objArr = new Object[0];
                C1028b.m2505a(e, stringBuilder2, objArr);
                return null;
            }
        }
    }

    public final void m2519a(C1033b c1033b) {
        C1038i c1038i = c1033b.f3337a;
        c1033b.f3338b = null;
        c1033b.f3339c = Long.MIN_VALUE;
        c1033b.mo1080a();
        synchronized (c1038i) {
            if (this.f3341b[c1038i.ordinal()] < 20) {
                c1033b.f3338b = this.f3340a[c1038i.ordinal()];
                this.f3340a[c1038i.ordinal()] = c1033b;
                int[] iArr = this.f3341b;
                int ordinal = c1038i.ordinal();
                iArr[ordinal] = iArr[ordinal] + 1;
            }
        }
    }
}
