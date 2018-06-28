package com.google.p154a.p155a;

import java.util.Arrays;

public final class C1624g {

    public static final class C1623a {
        private final String f5076a;
        private final C1622a f5077b;
        private C1622a f5078c;
        private boolean f5079d;

        private static final class C1622a {
            String f5073a;
            Object f5074b;
            C1622a f5075c;

            private C1622a() {
            }
        }

        private C1623a(String str) {
            this.f5077b = new C1622a();
            this.f5078c = this.f5077b;
            this.f5079d = false;
            this.f5076a = (String) C1625i.m4181a((Object) str);
        }

        public final C1623a m4179a(String str, Object obj) {
            C1622a c1622a = new C1622a();
            this.f5078c.f5075c = c1622a;
            this.f5078c = c1622a;
            c1622a.f5074b = obj;
            c1622a.f5073a = (String) C1625i.m4181a((Object) str);
            return this;
        }

        public final String toString() {
            boolean z = this.f5079d;
            String str = "";
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append(this.f5076a);
            stringBuilder.append('{');
            C1622a c1622a = this.f5077b;
            while (true) {
                c1622a = c1622a.f5075c;
                if (c1622a != null) {
                    Object obj = c1622a.f5074b;
                    if (!z || obj != null) {
                        stringBuilder.append(str);
                        str = ", ";
                        if (c1622a.f5073a != null) {
                            stringBuilder.append(c1622a.f5073a);
                            stringBuilder.append('=');
                        }
                        if (obj == null || !obj.getClass().isArray()) {
                            stringBuilder.append(obj);
                        } else {
                            CharSequence deepToString = Arrays.deepToString(new Object[]{obj});
                            stringBuilder.append(deepToString, 1, deepToString.length() - 1);
                        }
                    }
                } else {
                    stringBuilder.append('}');
                    return stringBuilder.toString();
                }
            }
        }
    }
}
