package com.p111d.p112a.p121c.p133j;

import com.p111d.p112a.p121c.p138m.C5378q;
import java.io.Serializable;
import java.math.BigInteger;

public final class C1480j implements Serializable {
    public static final C1480j f4616b = f4617c;
    private static final C1480j f4617c = new C1480j(false);
    private static final C1480j f4618d = new C1480j(true);
    public final boolean f4619a;

    protected C1480j() {
        this(false);
    }

    private C1480j(boolean z) {
        this.f4619a = z;
    }

    public static C7411d m3808a(byte[] bArr) {
        return C7411d.m19707a(bArr);
    }

    public static C7412e m3809a(boolean z) {
        return z ? C7412e.m19710f() : C7412e.m19711g();
    }

    public static C7413m m3810a() {
        return C7413m.m19714f();
    }

    public static C7414n m3811a(double d) {
        return C7571h.m20706a(d);
    }

    public static C7414n m3812a(int i) {
        return C7572i.m20709a(i);
    }

    public static C7414n m3813a(long j) {
        return C7573l.m20712a(j);
    }

    public static C7414n m3814a(BigInteger bigInteger) {
        return C7569c.m20700a(bigInteger);
    }

    public static C7417q m3815a(String str) {
        return C7417q.m19733b(str);
    }

    public static C7280r m3816a(C5378q c5378q) {
        return new C7416p(c5378q);
    }

    public static C7280r m3817a(Object obj) {
        return new C7416p(obj);
    }

    public final C7410a m3818b() {
        return new C7410a(this);
    }

    public final C7415o m3819c() {
        return new C7415o(this);
    }
}
