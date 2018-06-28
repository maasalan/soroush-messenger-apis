package com.google.p154a.p157c;

import com.google.p154a.p155a.C1617b;
import com.google.p154a.p155a.C1618c;
import com.google.p154a.p155a.C1621f;
import com.google.p154a.p155a.C1625i;
import com.google.p154a.p155a.C1628j;
import com.google.p154a.p155a.C1628j.C16262;
import com.google.p154a.p155a.C1628j.C54151;
import com.google.p154a.p156b.C5420g;
import com.google.p171c.p172a.C1950a;
import java.util.List;
import org.msgpack.util.TemplatePrecompiler;

public final class C1640a {
    private static final C1618c f5095b = C1618c.m4160a((CharSequence) ".。．｡");
    private static final C1628j f5096c;
    private static final C1621f f5097d = new C1621f(TemplatePrecompiler.DEFAULT_DEST);
    private static final C1618c f5098g = C1618c.m4160a((CharSequence) "-_");
    private static final C1618c f5099h = C1618c.m4164d().mo2988a(f5098g);
    public final int f5100a;
    private final String f5101e;
    private final C5420g<String> f5102f;

    static {
        Object a = C1618c.m4159a('.');
        C1625i.m4181a(a);
        f5096c = new C1628j(new C54151(a));
    }

    private C1640a(String str) {
        Object a = C1617b.m4156a(f5095b.mo2989f(str));
        boolean z = true;
        if (a.endsWith(TemplatePrecompiler.DEFAULT_DEST)) {
            a = a.substring(0, a.length() - 1);
        }
        C1625i.m4186a(a.length() <= 253, "Domain name too long: '%s':", a);
        this.f5101e = a;
        C1628j c1628j = f5096c;
        C1625i.m4181a(a);
        this.f5102f = C5420g.m11684a(new C16262(c1628j, a));
        if (this.f5102f.size() > 127) {
            z = false;
        }
        C1625i.m4186a(z, "Domain has too many parts: '%s'", a);
        C1625i.m4186a(C1640a.m4212a(this.f5102f), "Not a valid domain name: '%s'", a);
        this.f5100a = m4209a();
    }

    private int m4209a() {
        int size = this.f5102f.size();
        for (int i = 0; i < size; i++) {
            String a = f5097d.m4177a(this.f5102f.mo2994a(i, size));
            if (C1950a.f6496a.containsKey(a)) {
                return i;
            }
            int i2 = 1;
            if (C1950a.f6498c.containsKey(a)) {
                return i + 1;
            }
            String[] split = a.split("\\.", 2);
            if (split.length != 2 || !C1950a.f6497b.containsKey(split[1])) {
                i2 = 0;
            }
            if (i2 != 0) {
                return i;
            }
        }
        return -1;
    }

    public static C1640a m4210a(String str) {
        return new C1640a((String) C1625i.m4181a((Object) str));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m4211a(java.lang.String r4, boolean r5) {
        /*
        r0 = r4.length();
        r1 = 0;
        if (r0 <= 0) goto L_0x0056;
    L_0x0007:
        r0 = r4.length();
        r2 = 63;
        if (r0 <= r2) goto L_0x0010;
    L_0x000f:
        return r1;
    L_0x0010:
        r0 = com.google.p154a.p155a.C1618c.m4161b();
        r0 = r0.mo1513e();
        r0 = r0.mo3402e(r4);
        r2 = f5099h;
        r0 = r2.mo1514b(r0);
        if (r0 != 0) goto L_0x0025;
    L_0x0024:
        return r1;
    L_0x0025:
        r0 = f5098g;
        r2 = r4.charAt(r1);
        r0 = r0.mo1511b(r2);
        if (r0 != 0) goto L_0x0056;
    L_0x0031:
        r0 = f5098g;
        r2 = r4.length();
        r3 = 1;
        r2 = r2 - r3;
        r2 = r4.charAt(r2);
        r0 = r0.mo1511b(r2);
        if (r0 == 0) goto L_0x0044;
    L_0x0043:
        return r1;
    L_0x0044:
        if (r5 == 0) goto L_0x0055;
    L_0x0046:
        r5 = com.google.p154a.p155a.C1618c.m4162c();
        r4 = r4.charAt(r1);
        r4 = r5.mo1511b(r4);
        if (r4 == 0) goto L_0x0055;
    L_0x0054:
        return r1;
    L_0x0055:
        return r3;
    L_0x0056:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.c.a.a(java.lang.String, boolean):boolean");
    }

    private static boolean m4212a(List<String> list) {
        int size = list.size() - 1;
        if (!C1640a.m4211a((String) list.get(size), true)) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!C1640a.m4211a((String) list.get(i), false)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1640a)) {
            return false;
        }
        return this.f5101e.equals(((C1640a) obj).f5101e);
    }

    public final int hashCode() {
        return this.f5101e.hashCode();
    }

    public final String toString() {
        return this.f5101e;
    }
}
