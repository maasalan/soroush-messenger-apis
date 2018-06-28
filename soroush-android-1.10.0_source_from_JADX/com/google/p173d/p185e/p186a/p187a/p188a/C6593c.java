package com.google.p173d.p185e.p186a.p187a.p188a;

import com.google.p173d.C5629j;
import com.google.p173d.p177b.C1961a;

public final class C6593c extends C5606h {
    public C6593c(C1961a c1961a) {
        super(c1961a);
    }

    public final String mo1764a() {
        if (this.f6680a.f6554b < 48) {
            throw C5629j.m12369a();
        }
        StringBuilder stringBuilder = new StringBuilder();
        m12330b(stringBuilder, 8);
        int a = this.f6681b.m5472a(48, 2);
        stringBuilder.append("(392");
        stringBuilder.append(a);
        stringBuilder.append(')');
        stringBuilder.append(this.f6681b.m5473a(50, null).f15466a);
        return stringBuilder.toString();
    }
}
