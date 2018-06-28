package com.google.p164b.p166b.p167a;

import com.google.p164b.C5590i;
import com.google.p164b.C5592m;
import com.google.p164b.C5593n;
import com.google.p164b.C5594p;
import com.google.p164b.p170d.C1935a;
import com.google.p164b.p170d.C1936b;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map.Entry;

public final class C5538e extends C1935a {
    private static final Reader f15332c = new C19081();
    private static final Object f15333d = new Object();
    private Object[] f15334e;
    private int f15335f;
    private String[] f15336g;
    private int[] f15337h;

    static class C19081 extends Reader {
        C19081() {
        }

        public final void close() {
            throw new AssertionError();
        }

        public final int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    private Object m12112s() {
        Object[] objArr = this.f15334e;
        int i = this.f15335f - 1;
        this.f15335f = i;
        Object obj = objArr[i];
        this.f15334e[this.f15335f] = null;
        return obj;
    }

    private String m12113t() {
        StringBuilder stringBuilder = new StringBuilder(" at path ");
        stringBuilder.append(mo1730p());
        return stringBuilder.toString();
    }

    public final void mo1714a() {
        m12115a(C1936b.BEGIN_ARRAY);
        m12116a(((C5590i) mo1721g()).iterator());
        this.f15337h[this.f15335f - 1] = 0;
    }

    public final void m12115a(C1936b c1936b) {
        if (mo1720f() != c1936b) {
            StringBuilder stringBuilder = new StringBuilder("Expected ");
            stringBuilder.append(c1936b);
            stringBuilder.append(" but was ");
            stringBuilder.append(mo1720f());
            stringBuilder.append(m12113t());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final void m12116a(Object obj) {
        if (this.f15335f == this.f15334e.length) {
            Object obj2 = new Object[(this.f15335f * 2)];
            Object obj3 = new int[(this.f15335f * 2)];
            Object obj4 = new String[(this.f15335f * 2)];
            System.arraycopy(this.f15334e, 0, obj2, 0, this.f15335f);
            System.arraycopy(this.f15337h, 0, obj3, 0, this.f15335f);
            System.arraycopy(this.f15336g, 0, obj4, 0, this.f15335f);
            this.f15334e = obj2;
            this.f15337h = obj3;
            this.f15336g = obj4;
        }
        Object[] objArr = this.f15334e;
        int i = this.f15335f;
        this.f15335f = i + 1;
        objArr[i] = obj;
    }

    public final void mo1715b() {
        m12115a(C1936b.END_ARRAY);
        m12112s();
        m12112s();
        if (this.f15335f > 0) {
            int[] iArr = this.f15337h;
            int i = this.f15335f - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    public final void mo1716c() {
        m12115a(C1936b.BEGIN_OBJECT);
        m12116a(((C5593n) mo1721g()).f15450a.entrySet().iterator());
    }

    public final void close() {
        this.f15334e = new Object[]{f15333d};
        this.f15335f = 1;
    }

    public final void mo1718d() {
        m12115a(C1936b.END_OBJECT);
        m12112s();
        m12112s();
        if (this.f15335f > 0) {
            int[] iArr = this.f15337h;
            int i = this.f15335f - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    public final boolean mo1719e() {
        C1936b f = mo1720f();
        return (f == C1936b.END_OBJECT || f == C1936b.END_ARRAY) ? false : true;
    }

    public final C1936b mo1720f() {
        while (this.f15335f != 0) {
            Object g = mo1721g();
            if (g instanceof Iterator) {
                boolean z = this.f15334e[this.f15335f - 2] instanceof C5593n;
                Iterator it = (Iterator) g;
                if (!it.hasNext()) {
                    return z ? C1936b.END_OBJECT : C1936b.END_ARRAY;
                } else {
                    if (z) {
                        return C1936b.NAME;
                    }
                    m12116a(it.next());
                }
            } else if (g instanceof C5593n) {
                return C1936b.BEGIN_OBJECT;
            } else {
                if (g instanceof C5590i) {
                    return C1936b.BEGIN_ARRAY;
                }
                if (g instanceof C5594p) {
                    C5594p c5594p = (C5594p) g;
                    if (c5594p.f15452a instanceof String) {
                        return C1936b.STRING;
                    }
                    if (c5594p.f15452a instanceof Boolean) {
                        return C1936b.BOOLEAN;
                    }
                    if (c5594p.f15452a instanceof Number) {
                        return C1936b.NUMBER;
                    }
                    throw new AssertionError();
                } else if (g instanceof C5592m) {
                    return C1936b.NULL;
                } else {
                    if (g == f15333d) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                    throw new AssertionError();
                }
            }
        }
        return C1936b.END_DOCUMENT;
    }

    public final Object mo1721g() {
        return this.f15334e[this.f15335f - 1];
    }

    public final String mo1722h() {
        m12115a(C1936b.NAME);
        Entry entry = (Entry) ((Iterator) mo1721g()).next();
        String str = (String) entry.getKey();
        this.f15336g[this.f15335f - 1] = str;
        m12116a(entry.getValue());
        return str;
    }

    public final String mo1723i() {
        C1936b f = mo1720f();
        if (f == C1936b.STRING || f == C1936b.NUMBER) {
            String b = ((C5594p) m12112s()).mo1752b();
            if (this.f15335f > 0) {
                int[] iArr = this.f15337h;
                int i = this.f15335f - 1;
                iArr[i] = iArr[i] + 1;
            }
            return b;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected ");
        stringBuilder.append(C1936b.STRING);
        stringBuilder.append(" but was ");
        stringBuilder.append(f);
        stringBuilder.append(m12113t());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final boolean mo1724j() {
        m12115a(C1936b.BOOLEAN);
        boolean f = ((C5594p) m12112s()).mo1756f();
        if (this.f15335f > 0) {
            int[] iArr = this.f15337h;
            int i = this.f15335f - 1;
            iArr[i] = iArr[i] + 1;
        }
        return f;
    }

    public final void mo1725k() {
        m12115a(C1936b.NULL);
        m12112s();
        if (this.f15335f > 0) {
            int[] iArr = this.f15337h;
            int i = this.f15335f - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    public final double mo1726l() {
        C1936b f = mo1720f();
        if (f == C1936b.NUMBER || f == C1936b.STRING) {
            double c = ((C5594p) mo1721g()).mo1753c();
            if (this.f6427a || !(Double.isNaN(c) || Double.isInfinite(c))) {
                m12112s();
                if (this.f15335f > 0) {
                    int[] iArr = this.f15337h;
                    int i = this.f15335f - 1;
                    iArr[i] = iArr[i] + 1;
                }
                return c;
            }
            StringBuilder stringBuilder = new StringBuilder("JSON forbids NaN and infinities: ");
            stringBuilder.append(c);
            throw new NumberFormatException(stringBuilder.toString());
        }
        StringBuilder stringBuilder2 = new StringBuilder("Expected ");
        stringBuilder2.append(C1936b.NUMBER);
        stringBuilder2.append(" but was ");
        stringBuilder2.append(f);
        stringBuilder2.append(m12113t());
        throw new IllegalStateException(stringBuilder2.toString());
    }

    public final long mo1727m() {
        C1936b f = mo1720f();
        if (f == C1936b.NUMBER || f == C1936b.STRING) {
            long d = ((C5594p) mo1721g()).mo1754d();
            m12112s();
            if (this.f15335f > 0) {
                int[] iArr = this.f15337h;
                int i = this.f15335f - 1;
                iArr[i] = iArr[i] + 1;
            }
            return d;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected ");
        stringBuilder.append(C1936b.NUMBER);
        stringBuilder.append(" but was ");
        stringBuilder.append(f);
        stringBuilder.append(m12113t());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final int mo1728n() {
        C1936b f = mo1720f();
        if (f == C1936b.NUMBER || f == C1936b.STRING) {
            int e = ((C5594p) mo1721g()).mo1755e();
            m12112s();
            if (this.f15335f > 0) {
                int[] iArr = this.f15337h;
                int i = this.f15335f - 1;
                iArr[i] = iArr[i] + 1;
            }
            return e;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected ");
        stringBuilder.append(C1936b.NUMBER);
        stringBuilder.append(" but was ");
        stringBuilder.append(f);
        stringBuilder.append(m12113t());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final void mo1729o() {
        if (mo1720f() == C1936b.NAME) {
            mo1722h();
            this.f15336g[this.f15335f - 2] = "null";
        } else {
            m12112s();
            if (this.f15335f > 0) {
                this.f15336g[this.f15335f - 1] = "null";
            }
        }
        if (this.f15335f > 0) {
            int[] iArr = this.f15337h;
            int i = this.f15335f - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    public final String mo1730p() {
        StringBuilder stringBuilder = new StringBuilder("$");
        int i = 0;
        while (i < this.f15335f) {
            if (this.f15334e[i] instanceof C5590i) {
                i++;
                if (this.f15334e[i] instanceof Iterator) {
                    stringBuilder.append('[');
                    stringBuilder.append(this.f15337h[i]);
                    stringBuilder.append(']');
                }
            } else if (this.f15334e[i] instanceof C5593n) {
                i++;
                if (this.f15334e[i] instanceof Iterator) {
                    stringBuilder.append('.');
                    if (this.f15336g[i] != null) {
                        stringBuilder.append(this.f15336g[i]);
                    }
                }
            }
            i++;
        }
        return stringBuilder.toString();
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
