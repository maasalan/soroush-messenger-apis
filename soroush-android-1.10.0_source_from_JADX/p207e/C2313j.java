package p207e;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import p056c.C0946s;
import p056c.C0949t;
import p056c.C0949t.C0948a;
import p056c.C0952v;
import p056c.C5044q.C0943a;
import p056c.C5045w;
import p056c.C5045w.C0953a;
import p056c.C5045w.C0954b;
import p056c.aa.C0915a;
import p056c.ab;
import p206d.C5682d;
import p206d.C6623c;

final class C2313j {
    private static final char[] f7579k = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final String f7580a;
    final C0949t f7581b;
    String f7582c;
    C0948a f7583d;
    final C0915a f7584e = new C0915a();
    C0952v f7585f;
    final boolean f7586g;
    C0953a f7587h;
    C0943a f7588i;
    ab f7589j;

    private static class C5727a extends ab {
        private final ab f15697a;
        private final C0952v f15698b;

        C5727a(ab abVar, C0952v c0952v) {
            this.f15697a = abVar;
            this.f15698b = c0952v;
        }

        public final C0952v mo998a() {
            return this.f15698b;
        }

        public final void mo999a(C5682d c5682d) {
            this.f15697a.mo999a(c5682d);
        }

        public final long mo1000b() {
            return this.f15697a.mo1000b();
        }
    }

    C2313j(String str, C0949t c0949t, String str2, C0946s c0946s, C0952v c0952v, boolean z, boolean z2, boolean z3) {
        this.f7580a = str;
        this.f7581b = c0949t;
        this.f7582c = str2;
        this.f7585f = c0952v;
        this.f7586g = z;
        if (c0946s != null) {
            this.f7584e.m2237a(c0946s);
        }
        if (z2) {
            this.f7588i = new C0943a();
            return;
        }
        if (z3) {
            this.f7587h = new C0953a();
            C0953a c0953a = this.f7587h;
            C0952v c0952v2 = C5045w.f14068e;
            if (c0952v2 == null) {
                throw new NullPointerException("type == null");
            } else if (c0952v2.f3018a.equals("multipart")) {
                c0953a.f3023b = c0952v2;
            } else {
                StringBuilder stringBuilder = new StringBuilder("multipart != ");
                stringBuilder.append(c0952v2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }

    static String m6279a(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt >= 32 && codePointAt < 127 && " \"<>^`{}|\\?#".indexOf(codePointAt) == -1) {
                if (!z) {
                    if (codePointAt != 47) {
                        if (codePointAt == 37) {
                        }
                    }
                }
                i += Character.charCount(codePointAt);
            }
            C6623c c6623c = new C6623c();
            c6623c.m17027a(str, 0, i);
            C6623c c6623c2 = null;
            while (i < length) {
                int codePointAt2 = str.codePointAt(i);
                if (!(z && (codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13))) {
                    if (codePointAt2 >= 32 && codePointAt2 < 127 && " \"<>^`{}|\\?#".indexOf(codePointAt2) == -1) {
                        if (!z) {
                            if (codePointAt2 != 47) {
                                if (codePointAt2 == 37) {
                                }
                            }
                        }
                        c6623c.m17023a(codePointAt2);
                    }
                    if (c6623c2 == null) {
                        c6623c2 = new C6623c();
                    }
                    c6623c2.m17023a(codePointAt2);
                    while (!c6623c2.mo3131c()) {
                        int f = c6623c2.mo3135f() & 255;
                        c6623c.m17033b(37);
                        c6623c.m17033b(f7579k[(f >> 4) & 15]);
                        c6623c.m17033b(f7579k[f & 15]);
                    }
                }
                i += Character.charCount(codePointAt2);
            }
            return c6623c.m17068m();
        }
        return str;
    }

    final void m6280a(C0946s c0946s, ab abVar) {
        this.f7587h.m2387a(C0954b.m2388a(c0946s, abVar));
    }

    final void m6281a(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            C0952v a = C0952v.m2385a(str2);
            if (a == null) {
                StringBuilder stringBuilder = new StringBuilder("Malformed content type: ");
                stringBuilder.append(str2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            this.f7585f = a;
            return;
        }
        this.f7584e.m2244b(str, str2);
    }

    final void m6282a(String str, String str2, boolean z) {
        Object obj = null;
        if (this.f7582c != null) {
            this.f7583d = this.f7581b.m2372d(this.f7582c);
            if (this.f7583d == null) {
                StringBuilder stringBuilder = new StringBuilder("Malformed URL. Base: ");
                stringBuilder.append(this.f7581b);
                stringBuilder.append(", Relative: ");
                stringBuilder.append(this.f7582c);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            this.f7582c = null;
        }
        C0948a c0948a;
        if (z) {
            c0948a = this.f7583d;
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            }
            if (c0948a.f3004g == null) {
                c0948a.f3004g = new ArrayList();
            }
            c0948a.f3004g.add(C0949t.m2360a(str, " \"'<>#&=", true, false, true, true));
            List list = c0948a.f3004g;
            if (str2 != null) {
                obj = C0949t.m2360a(str2, " \"'<>#&=", true, false, true, true);
            }
            list.add(obj);
            return;
        }
        c0948a = this.f7583d;
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (c0948a.f3004g == null) {
            c0948a.f3004g = new ArrayList();
        }
        c0948a.f3004g.add(C0949t.m2360a(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
        list = c0948a.f3004g;
        if (str2 != null) {
            obj = C0949t.m2360a(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true);
        }
        list.add(obj);
    }

    final void m6283b(String str, String str2, boolean z) {
        C0943a c0943a;
        List list;
        String str3;
        Charset charset;
        boolean z2;
        if (z) {
            c0943a = this.f7588i;
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 == null) {
                throw new NullPointerException("value == null");
            } else {
                list = c0943a.f2983a;
                str3 = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
                charset = c0943a.f2985c;
                z2 = true;
            }
        } else {
            c0943a = this.f7588i;
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 == null) {
                throw new NullPointerException("value == null");
            } else {
                list = c0943a.f2983a;
                str3 = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
                charset = c0943a.f2985c;
                z2 = false;
            }
        }
        list.add(C0949t.m2359a(str, str3, z2, charset));
        c0943a.f2984b.add(C0949t.m2359a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", z2, c0943a.f2985c));
    }
}
