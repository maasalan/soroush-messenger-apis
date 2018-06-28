package com.google.p173d.p185e.p186a.p187a.p188a;

import com.google.p173d.C5629j;
import com.google.p173d.p177b.C1961a;

public final class C6594d extends C5606h {
    public C6594d(C1961a c1961a) {
        super(c1961a);
    }

    public final String mo1764a() {
        if (this.f6680a.f6554b < 48) {
            throw C5629j.m12369a();
        }
        StringBuilder stringBuilder = new StringBuilder();
        m12330b(stringBuilder, 8);
        int a = this.f6681b.m5472a(48, 2);
        stringBuilder.append("(393");
        stringBuilder.append(a);
        stringBuilder.append(')');
        a = this.f6681b.m5472a(50, 10);
        if (a / 100 == 0) {
            stringBuilder.append('0');
        }
        if (a / 10 == 0) {
            stringBuilder.append('0');
        }
        stringBuilder.append(a);
        stringBuilder.append(this.f6681b.m5473a(60, null).f15466a);
        return stringBuilder.toString();
    }
}
