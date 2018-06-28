package org.p501b.p502a.p503a;

import org.p501b.p502a.C4614i;
import org.p501b.p502a.C6303a;
import org.p501b.p502a.C6309h;
import org.p501b.p502a.C7003b;
import org.p501b.p502a.C7004c;
import org.p501b.p502a.C7005e;
import org.p501b.p502a.C7006f;
import org.p501b.p502a.p504b.C6306d;
import org.p501b.p506b.C4617c;
import org.p501b.p507c.C4625b;
import org.p501b.p507c.p508a.C4621a;
import org.p501b.p507c.p508a.C6312c;

public final class C4611d {
    private static final C4621a<String, C4614i> f12669a = new C6312c(100);
    private static final C4621a<String, C6303a> f12670b = new C6312c(100);
    private static final C4621a<String, C6309h> f12671c = new C6312c(100);
    private static final C4621a<String, C7005e> f12672d = new C6312c(100);
    private static final C4621a<String, C7006f> f12673e = new C6312c(100);
    private static final C4621a<String, C7003b> f12674f = new C6312c(100);
    private static final C4621a<String, C7004c> f12675g = new C6312c(100);

    private static C7006f m8360a(String str, String str2, String str3) {
        try {
            return new C7246f(str, str2, str3);
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append('@');
            stringBuilder.append(str2);
            stringBuilder.append('/');
            stringBuilder.append(str3);
            throw new C4617c(stringBuilder.toString(), e);
        }
    }

    public static C7006f m8361a(C7005e c7005e, C6306d c6306d) {
        return new C7246f(c7005e, c6306d);
    }

    public static C4614i m8362a(CharSequence charSequence) {
        return C4611d.m8363a(charSequence.toString());
    }

    public static C4614i m8363a(String str) {
        String a = C4625b.m8415a(str);
        String b = C4625b.m8418b(str);
        String c = C4625b.m8419c(str);
        try {
            String a2 = C4625b.m8417a(a, b, c);
            C4614i c4614i = (C4614i) f12669a.mo2465a(a2);
            if (c4614i != null) {
                return c4614i;
            }
            if (a.length() > 0 && b.length() > 0 && c.length() > 0) {
                c4614i = new C7246f(a, b, c);
            } else if (a.length() > 0 && b.length() > 0 && c.length() == 0) {
                c4614i = new C7245e(a, b);
            } else if (a.length() == 0 && b.length() > 0 && c.length() == 0) {
                c4614i = new C7244c(b);
            } else if (a.length() != 0 || b.length() <= 0 || c.length() <= 0) {
                throw new IllegalArgumentException("Not a valid combination of localpart, domainpart and resource");
            } else {
                c4614i = new C7243b(b, c);
            }
            f12669a.put(a2, c4614i);
            return c4614i;
        } catch (Exception e) {
            throw new C4617c(str, e);
        }
    }

    public static C6303a m8364b(String str) {
        C6303a c6303a = (C6303a) f12670b.mo2465a(str);
        if (c6303a != null) {
            return c6303a;
        }
        String a = C4625b.m8415a(str);
        String b = C4625b.m8418b(str);
        try {
            C6303a c7245e = a.length() != 0 ? new C7245e(a, b) : new C7244c(b);
            f12670b.put(str, c7245e);
            return c7245e;
        } catch (Exception e) {
            throw new C4617c(str, e);
        }
    }

    public static C7005e m8365c(String str) {
        C7005e c7005e = (C7005e) f12672d.mo2465a(str);
        if (c7005e != null) {
            return c7005e;
        }
        try {
            C7005e c7245e = new C7245e(C4625b.m8415a(str), C4625b.m8418b(str));
            f12672d.put(str, c7245e);
            return c7245e;
        } catch (Exception e) {
            throw new C4617c(str, e);
        }
    }

    public static C7006f m8366d(String str) {
        C7006f c7006f = (C7006f) f12673e.mo2465a(str);
        if (c7006f != null) {
            return c7006f;
        }
        try {
            c7006f = C4611d.m8360a(C4625b.m8415a(str), C4625b.m8418b(str), C4625b.m8419c(str));
            f12673e.put(str, c7006f);
            return c7006f;
        } catch (Exception e) {
            throw new C4617c(str, e);
        }
    }

    public static C7003b m8367e(String str) {
        C7003b c7003b = (C7003b) f12674f.mo2465a(str);
        if (c7003b != null) {
            return c7003b;
        }
        try {
            C7003b c7244c = new C7244c(C4625b.m8418b(str));
            f12674f.put(str, c7244c);
            return c7244c;
        } catch (Exception e) {
            throw new C4617c(str, e);
        }
    }
}
