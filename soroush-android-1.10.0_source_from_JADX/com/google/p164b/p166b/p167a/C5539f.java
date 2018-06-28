package com.google.p164b.p166b.p167a;

import com.google.p164b.C1944k;
import com.google.p164b.C5590i;
import com.google.p164b.C5592m;
import com.google.p164b.C5593n;
import com.google.p164b.C5594p;
import com.google.p164b.p170d.C1937c;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class C5539f extends C1937c {
    private static final Writer f15338h = new C19091();
    private static final C5594p f15339i = new C5594p("closed");
    public final List<C1944k> f15340a = new ArrayList();
    public C1944k f15341b = C5592m.f15449a;
    private String f15342j;

    static class C19091 extends Writer {
        C19091() {
        }

        public final void close() {
            throw new AssertionError();
        }

        public final void flush() {
            throw new AssertionError();
        }

        public final void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public C5539f() {
        super(f15338h);
    }

    private void m12132a(C1944k c1944k) {
        if (this.f15342j != null) {
            if (!(c1944k instanceof C5592m) || this.f6459g) {
                ((C5593n) m12133f()).m12304a(this.f15342j, c1944k);
            }
            this.f15342j = null;
        } else if (this.f15340a.isEmpty()) {
            this.f15341b = c1944k;
        } else {
            C1944k f = m12133f();
            if (f instanceof C5590i) {
                ((C5590i) f).m12298a(c1944k);
                return;
            }
            throw new IllegalStateException();
        }
    }

    private C1944k m12133f() {
        return (C1944k) this.f15340a.get(this.f15340a.size() - 1);
    }

    public final C1937c mo1732a() {
        C1944k c5590i = new C5590i();
        m12132a(c5590i);
        this.f15340a.add(c5590i);
        return this;
    }

    public final C1937c mo1733a(long j) {
        m12132a(new C5594p(Long.valueOf(j)));
        return this;
    }

    public final C1937c mo1734a(Boolean bool) {
        if (bool == null) {
            return mo1743e();
        }
        m12132a(new C5594p(bool));
        return this;
    }

    public final C1937c mo1735a(Number number) {
        if (number == null) {
            return mo1743e();
        }
        if (!this.f6457e) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                StringBuilder stringBuilder = new StringBuilder("JSON forbids NaN and infinities: ");
                stringBuilder.append(number);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        m12132a(new C5594p(number));
        return this;
    }

    public final C1937c mo1736a(String str) {
        if (!this.f15340a.isEmpty()) {
            if (this.f15342j == null) {
                if (m12133f() instanceof C5593n) {
                    this.f15342j = str;
                    return this;
                }
                throw new IllegalStateException();
            }
        }
        throw new IllegalStateException();
    }

    public final C1937c mo1737a(boolean z) {
        m12132a(new C5594p(Boolean.valueOf(z)));
        return this;
    }

    public final C1937c mo1738b() {
        if (!this.f15340a.isEmpty()) {
            if (this.f15342j == null) {
                if (m12133f() instanceof C5590i) {
                    this.f15340a.remove(this.f15340a.size() - 1);
                    return this;
                }
                throw new IllegalStateException();
            }
        }
        throw new IllegalStateException();
    }

    public final C1937c mo1739b(String str) {
        if (str == null) {
            return mo1743e();
        }
        m12132a(new C5594p(str));
        return this;
    }

    public final C1937c mo1740c() {
        C1944k c5593n = new C5593n();
        m12132a(c5593n);
        this.f15340a.add(c5593n);
        return this;
    }

    public final void close() {
        if (this.f15340a.isEmpty()) {
            this.f15340a.add(f15339i);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public final C1937c mo1742d() {
        if (!this.f15340a.isEmpty()) {
            if (this.f15342j == null) {
                if (m12133f() instanceof C5593n) {
                    this.f15340a.remove(this.f15340a.size() - 1);
                    return this;
                }
                throw new IllegalStateException();
            }
        }
        throw new IllegalStateException();
    }

    public final C1937c mo1743e() {
        m12132a(C5592m.f15449a);
        return this;
    }

    public final void flush() {
    }
}
