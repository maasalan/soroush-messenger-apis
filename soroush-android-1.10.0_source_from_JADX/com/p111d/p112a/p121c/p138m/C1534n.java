package com.p111d.p112a.p121c.p138m;

import java.io.Serializable;

public abstract class C1534n {
    public static final C1534n f4779a = new C5377b();

    public static class C5376a extends C1534n implements Serializable {
        protected final C1534n f14935b;
        protected final C1534n f14936c;

        public C5376a(C1534n c1534n, C1534n c1534n2) {
            this.f14935b = c1534n;
            this.f14936c = c1534n2;
        }

        public final String mo1482a(String str) {
            return this.f14935b.mo1482a(this.f14936c.mo1482a(str));
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("[ChainedTransformer(");
            stringBuilder.append(this.f14935b);
            stringBuilder.append(", ");
            stringBuilder.append(this.f14936c);
            stringBuilder.append(")]");
            return stringBuilder.toString();
        }
    }

    protected static final class C5377b extends C1534n implements Serializable {
        protected C5377b() {
        }

        public final String mo1482a(String str) {
            return str;
        }
    }

    protected C1534n() {
    }

    public static C1534n m4002a(C1534n c1534n, C1534n c1534n2) {
        return new C5376a(c1534n, c1534n2);
    }

    public static C1534n m4003a(final String str, final String str2) {
        Object obj = null;
        Object obj2 = (str == null || str.length() <= 0) ? null : 1;
        if (str2 != null && str2.length() > 0) {
            obj = 1;
        }
        return obj2 != null ? obj != null ? new C1534n() {
            public final String mo1482a(String str) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(str);
                stringBuilder.append(str2);
                return stringBuilder.toString();
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("[PreAndSuffixTransformer('");
                stringBuilder.append(str);
                stringBuilder.append("','");
                stringBuilder.append(str2);
                stringBuilder.append("')]");
                return stringBuilder.toString();
            }
        } : new C1534n() {
            public final String mo1482a(String str) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(str);
                return stringBuilder.toString();
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("[PrefixTransformer('");
                stringBuilder.append(str);
                stringBuilder.append("')]");
                return stringBuilder.toString();
            }
        } : obj != null ? new C1534n() {
            public final String mo1482a(String str) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(str2);
                return stringBuilder.toString();
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("[SuffixTransformer('");
                stringBuilder.append(str2);
                stringBuilder.append("')]");
                return stringBuilder.toString();
            }
        } : f4779a;
    }

    public abstract String mo1482a(String str);
}
