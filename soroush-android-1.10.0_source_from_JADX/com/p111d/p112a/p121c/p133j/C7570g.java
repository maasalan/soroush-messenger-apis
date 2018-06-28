package com.p111d.p112a.p121c.p133j;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.aa;
import java.math.BigDecimal;

public final class C7570g extends C7414n {
    public static final C7570g f23121a = new C7570g(BigDecimal.ZERO);
    private static final BigDecimal f23122c = BigDecimal.valueOf(-2147483648L);
    private static final BigDecimal f23123d = BigDecimal.valueOf(2147483647L);
    private static final BigDecimal f23124e = BigDecimal.valueOf(Long.MIN_VALUE);
    private static final BigDecimal f23125f = BigDecimal.valueOf(Long.MAX_VALUE);
    protected final BigDecimal f23126b;

    private C7570g(BigDecimal bigDecimal) {
        this.f23126b = bigDecimal;
    }

    public static C7570g m20703a(BigDecimal bigDecimal) {
        return new C7570g(bigDecimal);
    }

    public final void mo1483a(C5301g c5301g, aa aaVar) {
        c5301g.writeNumber(this.f23126b);
    }

    public final String mo3532b() {
        return this.f23126b.toString();
    }

    public final boolean equals(Object obj) {
        return obj == this ? true : obj != null && (obj instanceof C7570g) && ((C7570g) obj).f23126b.compareTo(this.f23126b) == 0;
    }

    public final int hashCode() {
        return Double.valueOf(this.f23126b.doubleValue()).hashCode();
    }
}
