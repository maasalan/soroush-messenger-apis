package p056c;

import p056c.C0946s.C0945a;
import p056c.p057a.p060c.C0881f;

public final class aa {
    public final C0949t f2801a;
    public final String f2802b;
    public final C0946s f2803c;
    public final ab f2804d;
    final Object f2805e;
    private volatile C0923d f2806f;

    public static class C0915a {
        C0949t f2796a;
        String f2797b;
        C0945a f2798c;
        ab f2799d;
        Object f2800e;

        public C0915a() {
            this.f2797b = "GET";
            this.f2798c = new C0945a();
        }

        C0915a(aa aaVar) {
            this.f2796a = aaVar.f2801a;
            this.f2797b = aaVar.f2802b;
            this.f2799d = aaVar.f2804d;
            this.f2800e = aaVar.f2805e;
            this.f2798c = aaVar.f2803c.m2344a();
        }

        public final C0915a m2237a(C0946s c0946s) {
            this.f2798c = c0946s.m2344a();
            return this;
        }

        public final C0915a m2238a(C0949t c0949t) {
            if (c0949t == null) {
                throw new NullPointerException("url == null");
            }
            this.f2796a = c0949t;
            return this;
        }

        public final C0915a m2239a(String str) {
            if (str == null) {
                throw new NullPointerException("url == null");
            }
            StringBuilder stringBuilder;
            int i;
            C0949t e;
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                stringBuilder = new StringBuilder("http:");
                i = 3;
            } else {
                if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    stringBuilder = new StringBuilder("https:");
                    i = 4;
                }
                e = C0949t.m2367e(str);
                if (e == null) {
                    return m2238a(e);
                }
                StringBuilder stringBuilder2 = new StringBuilder("unexpected url: ");
                stringBuilder2.append(str);
                throw new IllegalArgumentException(stringBuilder2.toString());
            }
            stringBuilder.append(str.substring(i));
            str = stringBuilder.toString();
            e = C0949t.m2367e(str);
            if (e == null) {
                return m2238a(e);
            }
            StringBuilder stringBuilder22 = new StringBuilder("unexpected url: ");
            stringBuilder22.append(str);
            throw new IllegalArgumentException(stringBuilder22.toString());
        }

        public final C0915a m2240a(String str, ab abVar) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (abVar == null || C0881f.m2080a(str)) {
                if (abVar == null) {
                    Object obj;
                    if (!(str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH"))) {
                        if (!str.equals("REPORT")) {
                            obj = null;
                            if (obj != null) {
                                r0 = new StringBuilder("method ");
                                r0.append(str);
                                r0.append(" must have a request body.");
                                throw new IllegalArgumentException(r0.toString());
                            }
                        }
                    }
                    obj = 1;
                    if (obj != null) {
                        r0 = new StringBuilder("method ");
                        r0.append(str);
                        r0.append(" must have a request body.");
                        throw new IllegalArgumentException(r0.toString());
                    }
                }
                this.f2797b = str;
                this.f2799d = abVar;
                return this;
            } else {
                r0 = new StringBuilder("method ");
                r0.append(str);
                r0.append(" must not have a request body.");
                throw new IllegalArgumentException(r0.toString());
            }
        }

        public final C0915a m2241a(String str, String str2) {
            C0945a c0945a = this.f2798c;
            C0945a.m2338c(str, str2);
            c0945a.m2339a(str);
            c0945a.m2342b(str, str2);
            return this;
        }

        public final aa m2242a() {
            if (this.f2796a != null) {
                return new aa(this);
            }
            throw new IllegalStateException("url == null");
        }

        public final C0915a m2243b(String str) {
            this.f2798c.m2339a(str);
            return this;
        }

        public final C0915a m2244b(String str, String str2) {
            this.f2798c.m2340a(str, str2);
            return this;
        }
    }

    aa(C0915a c0915a) {
        this.f2801a = c0915a.f2796a;
        this.f2802b = c0915a.f2797b;
        this.f2803c = c0915a.f2798c.m2341a();
        this.f2804d = c0915a.f2799d;
        this.f2805e = c0915a.f2800e != null ? c0915a.f2800e : this;
    }

    public final C0915a m2245a() {
        return new C0915a(this);
    }

    public final String m2246a(String str) {
        return this.f2803c.m2346a(str);
    }

    public final C0923d m2247b() {
        C0923d c0923d = this.f2806f;
        if (c0923d != null) {
            return c0923d;
        }
        c0923d = C0923d.m2278a(this.f2803c);
        this.f2806f = c0923d;
        return c0923d;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Request{method=");
        stringBuilder.append(this.f2802b);
        stringBuilder.append(", url=");
        stringBuilder.append(this.f2801a);
        stringBuilder.append(", tag=");
        stringBuilder.append(this.f2805e != this ? this.f2805e : null);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
