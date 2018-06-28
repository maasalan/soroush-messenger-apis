package com.p111d.p112a.p121c.p133j;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.aa;
import java.math.BigInteger;

public final class C7569c extends C7414n {
    private static final BigInteger f23116b = BigInteger.valueOf(-2147483648L);
    private static final BigInteger f23117c = BigInteger.valueOf(2147483647L);
    private static final BigInteger f23118d = BigInteger.valueOf(Long.MIN_VALUE);
    private static final BigInteger f23119e = BigInteger.valueOf(Long.MAX_VALUE);
    protected final BigInteger f23120a;

    private C7569c(BigInteger bigInteger) {
        this.f23120a = bigInteger;
    }

    public static C7569c m20700a(BigInteger bigInteger) {
        return new C7569c(bigInteger);
    }

    public final void mo1483a(C5301g c5301g, aa aaVar) {
        c5301g.writeNumber(this.f23120a);
    }

    public final String mo3532b() {
        return this.f23120a.toString();
    }

    public final boolean equals(Object obj) {
        return obj == this ? true : (obj != null && (obj instanceof C7569c)) ? ((C7569c) obj).f23120a.equals(this.f23120a) : false;
    }

    public final int hashCode() {
        return this.f23120a.hashCode();
    }
}
