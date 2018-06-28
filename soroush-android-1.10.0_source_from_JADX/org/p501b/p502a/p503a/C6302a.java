package org.p501b.p502a.p503a;

import org.p501b.p502a.C4614i;
import org.p501b.p502a.C6308g;
import org.p501b.p502a.C6309h;
import org.p501b.p502a.C7003b;
import org.p501b.p502a.C7004c;
import org.p501b.p502a.C7005e;
import org.p501b.p502a.C7006f;

public abstract class C6302a implements C4614i {
    protected String f17247a;

    private void m14750b(String str) {
        StringBuilder stringBuilder = new StringBuilder("The JID '");
        stringBuilder.append(this);
        stringBuilder.append("' ");
        stringBuilder.append(str);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final boolean mo2451a(CharSequence charSequence) {
        return charSequence == null ? false : mo2452a(charSequence.toString());
    }

    public final boolean mo2452a(String str) {
        return toString().equals(str);
    }

    public char charAt(int i) {
        return toString().charAt(i);
    }

    public /* synthetic */ int compareTo(Object obj) {
        return toString().compareTo(((C4614i) obj).toString());
    }

    public final boolean mo2453e() {
        if (!(this instanceof C7005e)) {
            if (!(this instanceof C7006f)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        return obj == null ? false : this == obj ? true : obj instanceof CharSequence ? mo2451a((CharSequence) obj) : false;
    }

    public final boolean mo2454f() {
        return this instanceof C7005e;
    }

    public final boolean mo2455g() {
        return this instanceof C7006f;
    }

    public final boolean mo2456h() {
        return this instanceof C7003b;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final boolean mo2457i() {
        return this instanceof C7004c;
    }

    public final boolean mo2458k() {
        return this instanceof C6309h;
    }

    public final boolean mo2459l() {
        return this instanceof C6308g;
    }

    public int length() {
        return toString().length();
    }

    public final C7005e mo2460o() {
        C7005e n = mo3474n();
        if (n == null) {
            m14750b("can not be converted to EntityBareJid");
        }
        return n;
    }

    public final C7006f mo2461q() {
        C7006f p = mo3475p();
        if (p == null) {
            m14750b("can not be converted to EntityFullJid");
        }
        return p;
    }

    public CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }
}
