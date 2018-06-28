package com.google.p173d.p185e;

import com.google.p173d.C1958a;
import com.google.p173d.C1987c;
import com.google.p173d.C2007e;
import com.google.p173d.C2047n;
import com.google.p173d.C5615f;
import com.google.p173d.p177b.C1961a;
import java.util.Map;

public final class C7148l extends C6605p {
    private final C6605p f20440a = new C7146e();

    private static C2047n m18843a(C2047n c2047n) {
        String str = c2047n.f6872a;
        if (str.charAt(0) == '0') {
            return new C2047n(str.substring(1), null, c2047n.f6874c, C1958a.UPC_A);
        }
        throw C5615f.m12347a();
    }

    protected final int mo3421a(C1961a c1961a, int[] iArr, StringBuilder stringBuilder) {
        return this.f20440a.mo3421a(c1961a, iArr, stringBuilder);
    }

    public final C2047n mo3064a(int i, C1961a c1961a, Map<C2007e, ?> map) {
        return C7148l.m18843a(this.f20440a.mo3064a(i, c1961a, (Map) map));
    }

    public final C2047n mo3423a(int i, C1961a c1961a, int[] iArr, Map<C2007e, ?> map) {
        return C7148l.m18843a(this.f20440a.mo3423a(i, c1961a, iArr, (Map) map));
    }

    public final C2047n mo1757a(C1987c c1987c, Map<C2007e, ?> map) {
        return C7148l.m18843a(this.f20440a.mo1757a(c1987c, map));
    }

    final C1958a mo3422b() {
        return C1958a.UPC_A;
    }
}
