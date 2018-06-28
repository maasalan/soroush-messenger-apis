package com.google.p164b;

import com.google.p164b.p166b.C1921f;
import java.math.BigInteger;

public final class C5594p extends C1944k {
    private static final Class<?>[] f15451b = new Class[]{Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};
    public Object f15452a;

    public C5594p(Boolean bool) {
        m12305a((Object) bool);
    }

    public C5594p(Number number) {
        m12305a((Object) number);
    }

    public C5594p(String str) {
        m12305a((Object) str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12305a(java.lang.Object r8) {
        /*
        r7 = this;
        r0 = r8 instanceof java.lang.Character;
        if (r0 == 0) goto L_0x0011;
    L_0x0004:
        r8 = (java.lang.Character) r8;
        r8 = r8.charValue();
        r8 = java.lang.String.valueOf(r8);
    L_0x000e:
        r7.f15452a = r8;
        return;
    L_0x0011:
        r0 = r8 instanceof java.lang.Number;
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x0036;
    L_0x0017:
        r0 = r8 instanceof java.lang.String;
        if (r0 == 0) goto L_0x001d;
    L_0x001b:
        r0 = r2;
        goto L_0x0034;
    L_0x001d:
        r0 = r8.getClass();
        r3 = f15451b;
        r4 = r3.length;
        r5 = r1;
    L_0x0025:
        if (r5 >= r4) goto L_0x0033;
    L_0x0027:
        r6 = r3[r5];
        r6 = r6.isAssignableFrom(r0);
        if (r6 == 0) goto L_0x0030;
    L_0x002f:
        goto L_0x001b;
    L_0x0030:
        r5 = r5 + 1;
        goto L_0x0025;
    L_0x0033:
        r0 = r1;
    L_0x0034:
        if (r0 == 0) goto L_0x0037;
    L_0x0036:
        r1 = r2;
    L_0x0037:
        com.google.p164b.p166b.C1914a.m5251a(r1);
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.b.p.a(java.lang.Object):void");
    }

    private static boolean m12306a(C5594p c5594p) {
        if (!(c5594p.f15452a instanceof Number)) {
            return false;
        }
        Number number = (Number) c5594p.f15452a;
        if (!((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short))) {
            if (!(number instanceof Byte)) {
                return false;
            }
        }
        return true;
    }

    public final Number mo1751a() {
        return this.f15452a instanceof String ? new C1921f((String) this.f15452a) : (Number) this.f15452a;
    }

    public final String mo1752b() {
        return this.f15452a instanceof Number ? mo1751a().toString() : this.f15452a instanceof Boolean ? ((Boolean) this.f15452a).toString() : (String) this.f15452a;
    }

    public final double mo1753c() {
        return this.f15452a instanceof Number ? mo1751a().doubleValue() : Double.parseDouble(mo1752b());
    }

    public final long mo1754d() {
        return this.f15452a instanceof Number ? mo1751a().longValue() : Long.parseLong(mo1752b());
    }

    public final int mo1755e() {
        return this.f15452a instanceof Number ? mo1751a().intValue() : Integer.parseInt(mo1752b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5594p c5594p = (C5594p) obj;
        if (this.f15452a == null) {
            return c5594p.f15452a == null;
        } else {
            if (C5594p.m12306a(this) && C5594p.m12306a(c5594p)) {
                return mo1751a().longValue() == c5594p.mo1751a().longValue();
            } else {
                if (!(this.f15452a instanceof Number) || !(c5594p.f15452a instanceof Number)) {
                    return this.f15452a.equals(c5594p.f15452a);
                }
                double doubleValue = mo1751a().doubleValue();
                double doubleValue2 = c5594p.mo1751a().doubleValue();
                return doubleValue != doubleValue2 ? Double.isNaN(doubleValue) && Double.isNaN(doubleValue2) : true;
            }
        }
    }

    public final boolean mo1756f() {
        return this.f15452a instanceof Boolean ? ((Boolean) this.f15452a).booleanValue() : Boolean.parseBoolean(mo1752b());
    }

    public final int hashCode() {
        if (this.f15452a == null) {
            return 31;
        }
        long longValue;
        if (C5594p.m12306a(this)) {
            longValue = mo1751a().longValue();
            return (int) (longValue ^ (longValue >>> 32));
        } else if (!(this.f15452a instanceof Number)) {
            return this.f15452a.hashCode();
        } else {
            longValue = Double.doubleToLongBits(mo1751a().doubleValue());
            return (int) (longValue ^ (longValue >>> 32));
        }
    }
}
