package org.p487a.p490b.p492b;

import org.jivesoftware.smack.sasl.core.SASLAnonymous;

final class C4602h {
    static C4602h f12623j;
    static C4602h f12624k;
    static C4602h f12625l;
    boolean f12626a = true;
    boolean f12627b = true;
    boolean f12628c = false;
    boolean f12629d = false;
    boolean f12630e = false;
    boolean f12631f = true;
    boolean f12632g = true;
    boolean f12633h = true;
    int f12634i;

    static {
        C4602h c4602h = new C4602h();
        f12623j = c4602h;
        c4602h.f12626a = true;
        f12623j.f12627b = false;
        f12623j.f12628c = false;
        f12623j.f12629d = false;
        f12623j.f12630e = true;
        f12623j.f12631f = false;
        f12623j.f12632g = false;
        f12623j.f12634i = 0;
        c4602h = new C4602h();
        f12624k = c4602h;
        c4602h.f12626a = true;
        f12624k.f12627b = true;
        f12624k.f12628c = false;
        f12624k.f12629d = false;
        f12624k.f12630e = false;
        f12623j.f12634i = 1;
        c4602h = new C4602h();
        f12625l = c4602h;
        c4602h.f12626a = false;
        f12625l.f12627b = true;
        f12625l.f12628c = false;
        f12625l.f12629d = true;
        f12625l.f12630e = false;
        f12625l.f12633h = false;
        f12625l.f12634i = 2;
    }

    C4602h() {
    }

    static String m8328a(String str) {
        int lastIndexOf = str.lastIndexOf(45);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }

    public final String m8329a(Class cls) {
        return m8330a(cls, cls.getName(), this.f12626a);
    }

    final String m8330a(Class cls, String str, boolean z) {
        if (cls == null) {
            return SASLAnonymous.NAME;
        }
        if (cls.isArray()) {
            cls = cls.getComponentType();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(m8330a(cls, cls.getName(), z));
            stringBuffer.append("[]");
            return stringBuffer.toString();
        } else if (!z) {
            return str.replace('$', '.');
        } else {
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf != -1) {
                str = str.substring(lastIndexOf + 1);
            }
            return str.replace('$', '.');
        }
    }

    public final void m8331a(StringBuffer stringBuffer, Class[] clsArr) {
        for (int i = 0; i < clsArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(m8329a(clsArr[i]));
        }
    }
}
