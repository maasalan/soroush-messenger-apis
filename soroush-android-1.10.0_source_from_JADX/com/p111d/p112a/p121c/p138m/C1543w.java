package com.p111d.p112a.p121c.p138m;

import java.io.Serializable;

public class C1543w implements Serializable {
    protected static final C1543w f4818a = new C1543w();

    private static final class C5380a extends C1543w implements Serializable {
        private final Class<?>[] f14944b;

        public C5380a(Class<?>[] clsArr) {
            this.f14944b = clsArr;
        }

        public final boolean mo1485a(Class<?> cls) {
            int length = this.f14944b.length;
            int i = 0;
            while (i < length) {
                Class<?> cls2 = this.f14944b[i];
                if (cls != cls2) {
                    if (!cls2.isAssignableFrom(cls)) {
                        i++;
                    }
                }
                return true;
            }
            return false;
        }
    }

    private static final class C5381b extends C1543w {
        private final Class<?> f14945b;

        public C5381b(Class<?> cls) {
            this.f14945b = cls;
        }

        public final boolean mo1485a(Class<?> cls) {
            if (cls != this.f14945b) {
                if (!this.f14945b.isAssignableFrom(cls)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static C1543w m4045a(Class<?>[] clsArr) {
        if (clsArr == null) {
            return f4818a;
        }
        switch (clsArr.length) {
            case 0:
                return f4818a;
            case 1:
                return new C5381b(clsArr[0]);
            default:
                return new C5380a(clsArr);
        }
    }

    public boolean mo1485a(Class<?> cls) {
        return false;
    }
}
