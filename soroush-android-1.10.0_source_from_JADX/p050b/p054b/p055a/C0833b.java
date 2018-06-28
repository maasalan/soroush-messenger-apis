package p050b.p054b.p055a;

import java.io.Serializable;

public abstract class C0833b implements Serializable {
    public C0833b mo883a() {
        return null;
    }

    public void mo884a(C0833b c0833b) {
    }

    public abstract void mo885a(C0834v c0834v);

    public C0833b mo886b() {
        return null;
    }

    protected String mo2672c() {
        String name = getClass().getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('<');
        stringBuffer.append(mo2672c());
        stringBuffer.append('>');
        return stringBuffer.toString();
    }
}
