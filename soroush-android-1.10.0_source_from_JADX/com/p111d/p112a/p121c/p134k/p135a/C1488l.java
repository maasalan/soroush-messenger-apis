package com.p111d.p112a.p121c.p134k.p135a;

import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.p138m.C1542v;
import java.util.Map;
import java.util.Map.Entry;

public final class C1488l {
    public final C1487a[] f4645a;
    public final int f4646b;
    private final int f4647c;

    private static final class C1487a {
        public final C1545o<Object> f4640a;
        public final C1487a f4641b;
        protected final Class<?> f4642c;
        protected final C5354j f4643d;
        protected final boolean f4644e;

        public C1487a(C1487a c1487a, C1542v c1542v, C1545o<Object> c1545o) {
            this.f4641b = c1487a;
            this.f4640a = c1545o;
            this.f4644e = c1542v.m4042a();
            this.f4642c = c1542v.m4043b();
            this.f4643d = c1542v.m4044c();
        }

        public final boolean m3826a(C5354j c5354j) {
            return this.f4644e && c5354j.equals(this.f4643d);
        }

        public final boolean m3827a(Class<?> cls) {
            return this.f4642c == cls && this.f4644e;
        }

        public final boolean m3828b(C5354j c5354j) {
            return !this.f4644e && c5354j.equals(this.f4643d);
        }

        public final boolean m3829b(Class<?> cls) {
            return this.f4642c == cls && !this.f4644e;
        }
    }

    public C1488l(Map<C1542v, C1545o<Object>> map) {
        int a = C1488l.m3830a(map.size());
        this.f4647c = a;
        this.f4646b = a - 1;
        C1487a[] c1487aArr = new C1487a[a];
        for (Entry entry : map.entrySet()) {
            C1542v c1542v = (C1542v) entry.getKey();
            int hashCode = c1542v.hashCode() & this.f4646b;
            c1487aArr[hashCode] = new C1487a(c1487aArr[hashCode], c1542v, (C1545o) entry.getValue());
        }
        this.f4645a = c1487aArr;
    }

    private static final int m3830a(int i) {
        int i2 = 8;
        while (i2 < (i <= 64 ? i + i : i + (i >> 2))) {
            i2 += i2;
        }
        return i2;
    }

    public final C1545o<Object> m3831a(C5354j c5354j) {
        C1487a c1487a = this.f4645a[(c5354j.hashCode() - 1) & this.f4646b];
        if (c1487a == null) {
            return null;
        }
        if (c1487a.m3828b(c5354j)) {
            return c1487a.f4640a;
        }
        do {
            c1487a = c1487a.f4641b;
            if (c1487a == null) {
                return null;
            }
        } while (!c1487a.m3828b(c5354j));
        return c1487a.f4640a;
    }

    public final C1545o<Object> m3832a(Class<?> cls) {
        C1487a c1487a = this.f4645a[cls.getName().hashCode() & this.f4646b];
        if (c1487a == null) {
            return null;
        }
        if (c1487a.m3829b((Class) cls)) {
            return c1487a.f4640a;
        }
        do {
            c1487a = c1487a.f4641b;
            if (c1487a == null) {
                return null;
            }
        } while (!c1487a.m3829b((Class) cls));
        return c1487a.f4640a;
    }
}
