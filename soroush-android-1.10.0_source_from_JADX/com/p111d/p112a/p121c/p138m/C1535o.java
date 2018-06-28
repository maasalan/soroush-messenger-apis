package com.p111d.p112a.p121c.p138m;

import java.lang.reflect.Array;
import java.util.List;

public final class C1535o {
    public int f4780a;
    private C1533m<Object[]> f4781b;
    private C1533m<Object[]> f4782c;
    private Object[] f4783d;

    private void m4005a(Object obj, int i, Object[] objArr, int i2) {
        int i3 = 0;
        for (C1533m c1533m = this.f4781b; c1533m != null; c1533m = c1533m.f4778b) {
            Object[] objArr2 = (Object[]) c1533m.f4777a;
            int length = objArr2.length;
            System.arraycopy(objArr2, 0, obj, i3, length);
            i3 += length;
        }
        System.arraycopy(objArr, 0, obj, i3, i2);
        i3 += i2;
        if (i3 != i) {
            StringBuilder stringBuilder = new StringBuilder("Should have gotten ");
            stringBuilder.append(i);
            stringBuilder.append(" entries, got ");
            stringBuilder.append(i3);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private void m4006c() {
        if (this.f4782c != null) {
            this.f4783d = (Object[]) this.f4782c.f4777a;
        }
        this.f4782c = null;
        this.f4781b = null;
        this.f4780a = 0;
    }

    public final void m4007a(Object[] objArr, int i, List<Object> list) {
        C1533m c1533m = this.f4781b;
        while (true) {
            int i2 = 0;
            if (c1533m == null) {
                break;
            }
            Object[] objArr2 = (Object[]) c1533m.f4777a;
            int length = objArr2.length;
            while (i2 < length) {
                list.add(objArr2[i2]);
                i2++;
            }
            c1533m = c1533m.f4778b;
        }
        while (i2 < i) {
            list.add(objArr[i2]);
            i2++;
        }
    }

    public final Object[] m4008a() {
        m4006c();
        return this.f4783d == null ? new Object[12] : this.f4783d;
    }

    public final Object[] m4009a(Object[] objArr) {
        C1533m c1533m = new C1533m(objArr, null);
        if (this.f4781b == null) {
            this.f4782c = c1533m;
            this.f4781b = c1533m;
        } else {
            C1533m c1533m2 = this.f4782c;
            if (c1533m2.f4778b != null) {
                throw new IllegalStateException();
            }
            c1533m2.f4778b = c1533m;
            this.f4782c = c1533m;
        }
        int length = objArr.length;
        this.f4780a += length;
        if (length < 16384) {
            length += length;
        } else if (length < 262144) {
            length += length >> 2;
        }
        return new Object[length];
    }

    public final Object[] m4010a(Object[] objArr, int i) {
        int i2 = this.f4780a + i;
        Object obj = new Object[i2];
        m4005a(obj, i2, objArr, i);
        return obj;
    }

    public final <T> T[] m4011a(Object[] objArr, int i, Class<T> cls) {
        int i2 = this.f4780a + i;
        Object[] objArr2 = (Object[]) Array.newInstance(cls, i2);
        m4005a(objArr2, i2, objArr, i);
        m4006c();
        return objArr2;
    }

    public final int m4012b() {
        return this.f4783d == null ? 0 : this.f4783d.length;
    }
}
