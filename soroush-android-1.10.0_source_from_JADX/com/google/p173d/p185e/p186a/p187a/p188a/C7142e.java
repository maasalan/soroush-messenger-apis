package com.google.p173d.p185e.p186a.p187a.p188a;

import com.google.p173d.C5629j;
import com.google.p173d.p177b.C1961a;

public final class C7142e extends C6596i {
    private final String f20416c;
    private final String f20417d;

    public C7142e(C1961a c1961a, String str, String str2) {
        super(c1961a);
        this.f20416c = str2;
        this.f20417d = str;
    }

    protected final int mo3419a(int i) {
        return i % 100000;
    }

    public final String mo1764a() {
        if (this.f6680a.f6554b != 84) {
            throw C5629j.m12369a();
        }
        StringBuilder stringBuilder = new StringBuilder();
        m12330b(stringBuilder, 8);
        m16898b(stringBuilder, 48, 20);
        int a = this.f6681b.m5472a(68, 16);
        if (a != 38400) {
            stringBuilder.append('(');
            stringBuilder.append(this.f20416c);
            stringBuilder.append(')');
            int i = a % 32;
            a /= 32;
            int i2 = (a % 12) + 1;
            a /= 12;
            if (a / 10 == 0) {
                stringBuilder.append('0');
            }
            stringBuilder.append(a);
            if (i2 / 10 == 0) {
                stringBuilder.append('0');
            }
            stringBuilder.append(i2);
            if (i / 10 == 0) {
                stringBuilder.append('0');
            }
            stringBuilder.append(i);
        }
        return stringBuilder.toString();
    }

    protected final void mo3420a(StringBuilder stringBuilder, int i) {
        stringBuilder.append('(');
        stringBuilder.append(this.f20417d);
        stringBuilder.append(i / 100000);
        stringBuilder.append(')');
    }
}
