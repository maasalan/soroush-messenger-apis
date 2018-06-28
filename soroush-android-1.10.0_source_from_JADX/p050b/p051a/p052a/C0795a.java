package p050b.p051a.p052a;

import java.util.Iterator;
import java.util.LinkedHashMap;
import p050b.p051a.C0827p;
import p050b.p051a.C0828s;

public final class C0795a {
    public C0827p f2394a;
    int f2395b;
    public LinkedHashMap f2396c = null;

    static class C0794a {
        public int f2392a;
        public C0797n f2393b;
    }

    public C0795a(int i, C0827p c0827p) {
        this.f2394a = c0827p;
        this.f2395b = i;
    }

    private String m1738a() {
        return C0828s.m1903b(this.f2394a.m1892j(this.f2395b));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C0795a)) {
            return false;
        }
        C0795a c0795a = (C0795a) obj;
        if (!m1738a().equals(c0795a.m1738a())) {
            return false;
        }
        LinkedHashMap linkedHashMap = c0795a.f2396c;
        return this.f2396c == linkedHashMap ? true : this.f2396c == null ? linkedHashMap == null : linkedHashMap == null ? false : this.f2396c.equals(linkedHashMap);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("@");
        stringBuffer.append(m1738a());
        if (this.f2396c != null) {
            stringBuffer.append("(");
            Iterator it = this.f2396c.keySet().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                stringBuffer.append(str);
                stringBuffer.append("=");
                Object obj = null;
                if (this.f2396c != null) {
                    C0794a c0794a = (C0794a) this.f2396c.get(str);
                    if (c0794a != null) {
                        obj = c0794a.f2393b;
                    }
                }
                stringBuffer.append(obj);
                if (it.hasNext()) {
                    stringBuffer.append(", ");
                }
            }
            stringBuffer.append(")");
        }
        return stringBuffer.toString();
    }
}
