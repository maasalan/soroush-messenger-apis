package com.google.p164b;

import com.google.p164b.p166b.C1930j;
import com.google.p164b.p170d.C1937c;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public abstract class C1944k {
    public Number mo1751a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String mo1752b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double mo1753c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public long mo1754d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int mo1755e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean mo1756f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final C5594p m5360g() {
        if (this instanceof C5594p) {
            return (C5594p) this;
        }
        StringBuilder stringBuilder = new StringBuilder("Not a JSON Primitive: ");
        stringBuilder.append(this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public String toString() {
        try {
            Writer stringWriter = new StringWriter();
            C1937c c1937c = new C1937c(stringWriter);
            c1937c.f6457e = true;
            C1930j.m5284a(this, c1937c);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
