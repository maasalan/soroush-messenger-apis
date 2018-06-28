package com.p111d.p112a.p121c.p137l;

import com.p111d.p112a.p121c.C5354j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public final class C1516o implements Serializable {
    protected final C1513m f4730a;

    static final class C1515a extends StringTokenizer {
        protected final String f4727a;
        protected int f4728b;
        protected String f4729c;

        public C1515a(String str) {
            super(str, "<,>", true);
            this.f4727a = str;
        }

        public final String m3929a() {
            return this.f4727a;
        }

        public final void m3930a(String str) {
            this.f4729c = str;
            this.f4728b -= str.length();
        }

        public final String m3931b() {
            return this.f4727a.substring(this.f4728b);
        }

        public final boolean hasMoreTokens() {
            if (this.f4729c == null) {
                if (!super.hasMoreTokens()) {
                    return false;
                }
            }
            return true;
        }

        public final String nextToken() {
            String str;
            if (this.f4729c != null) {
                str = this.f4729c;
                this.f4729c = null;
            } else {
                str = super.nextToken();
            }
            this.f4728b += str.length();
            return str;
        }
    }

    public C1516o(C1513m c1513m) {
        this.f4730a = c1513m;
    }

    private Class<?> m3932a(String str, C1515a c1515a) {
        try {
            return this.f4730a.m3925a(str);
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            StringBuilder stringBuilder = new StringBuilder("Can not locate class '");
            stringBuilder.append(str);
            stringBuilder.append("', problem: ");
            stringBuilder.append(e.getMessage());
            throw C1516o.m3933a(c1515a, stringBuilder.toString());
        }
    }

    static IllegalArgumentException m3933a(C1515a c1515a, String str) {
        StringBuilder stringBuilder = new StringBuilder("Failed to parse type '");
        stringBuilder.append(c1515a.m3929a());
        stringBuilder.append("' (remaining: '");
        stringBuilder.append(c1515a.m3931b());
        stringBuilder.append("'): ");
        stringBuilder.append(str);
        return new IllegalArgumentException(stringBuilder.toString());
    }

    final C5354j m3934a(C1515a c1515a) {
        if (c1515a.hasMoreTokens()) {
            Class a = m3932a(c1515a.nextToken(), c1515a);
            if (c1515a.hasMoreTokens()) {
                String nextToken = c1515a.nextToken();
                if ("<".equals(nextToken)) {
                    List arrayList = new ArrayList();
                    while (c1515a.hasMoreTokens()) {
                        arrayList.add(m3934a(c1515a));
                        if (!c1515a.hasMoreTokens()) {
                            break;
                        }
                        String nextToken2 = c1515a.nextToken();
                        if (">".equals(nextToken2)) {
                            return this.f4730a.m3919a(null, a, C1512l.m3902a(a, arrayList));
                        } else if (!",".equals(nextToken2)) {
                            StringBuilder stringBuilder = new StringBuilder("Unexpected token '");
                            stringBuilder.append(nextToken2);
                            stringBuilder.append("', expected ',' or '>')");
                            throw C1516o.m3933a(c1515a, stringBuilder.toString());
                        }
                    }
                    throw C1516o.m3933a(c1515a, "Unexpected end-of-string");
                }
                c1515a.m3930a(nextToken);
            }
            return this.f4730a.m3919a(null, a, null);
        }
        throw C1516o.m3933a(c1515a, "Unexpected end-of-string");
    }
}
