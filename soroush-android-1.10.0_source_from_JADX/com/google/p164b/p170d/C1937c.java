package com.google.p164b.p170d;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

public class C1937c implements Closeable, Flushable {
    private static final String[] f6453a = new String[128];
    private static final String[] f6454b;
    public String f6455c;
    public String f6456d;
    public boolean f6457e;
    public boolean f6458f;
    public boolean f6459g;
    private final Writer f6460h;
    private int[] f6461i = new int[32];
    private int f6462j = 0;
    private String f6463k;

    static {
        for (int i = 0; i <= 31; i++) {
            f6453a[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        f6453a[34] = "\\\"";
        f6453a[92] = "\\\\";
        f6453a[9] = "\\t";
        f6453a[8] = "\\b";
        f6453a[10] = "\\n";
        f6453a[13] = "\\r";
        f6453a[12] = "\\f";
        String[] strArr = (String[]) f6453a.clone();
        f6454b = strArr;
        strArr[60] = "\\u003c";
        f6454b[62] = "\\u003e";
        f6454b[38] = "\\u0026";
        f6454b[61] = "\\u003d";
        f6454b[39] = "\\u0027";
    }

    public C1937c(Writer writer) {
        m5324a(6);
        this.f6456d = ":";
        this.f6459g = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f6460h = writer;
    }

    private C1937c m5322a(int i, int i2, String str) {
        int f = m5327f();
        if (f != i2 && f != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f6463k != null) {
            StringBuilder stringBuilder = new StringBuilder("Dangling name: ");
            stringBuilder.append(this.f6463k);
            throw new IllegalStateException(stringBuilder.toString());
        } else {
            this.f6462j--;
            if (f == i2) {
                m5329h();
            }
            this.f6460h.write(str);
            return this;
        }
    }

    private C1937c m5323a(int i, String str) {
        m5330i();
        m5324a(i);
        this.f6460h.write(str);
        return this;
    }

    private void m5324a(int i) {
        if (this.f6462j == this.f6461i.length) {
            Object obj = new int[(this.f6462j * 2)];
            System.arraycopy(this.f6461i, 0, obj, 0, this.f6462j);
            this.f6461i = obj;
        }
        int[] iArr = this.f6461i;
        int i2 = this.f6462j;
        this.f6462j = i2 + 1;
        iArr[i2] = i;
    }

    private void m5325b(int i) {
        this.f6461i[this.f6462j - 1] = i;
    }

    private void m5326c(String str) {
        String[] strArr = this.f6458f ? f6454b : f6453a;
        this.f6460h.write("\"");
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str2;
            char charAt = str.charAt(i);
            if (charAt < '') {
                str2 = strArr[charAt];
                if (str2 == null) {
                    i++;
                }
            } else if (charAt == ' ') {
                str2 = "\\u2028";
            } else if (charAt == ' ') {
                str2 = "\\u2029";
            } else {
                i++;
            }
            if (i2 < i) {
                this.f6460h.write(str, i2, i - i2);
            }
            this.f6460h.write(str2);
            i2 = i + 1;
            i++;
        }
        if (i2 < length) {
            this.f6460h.write(str, i2, length - i2);
        }
        this.f6460h.write("\"");
    }

    private int m5327f() {
        if (this.f6462j != 0) {
            return this.f6461i[this.f6462j - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void m5328g() {
        if (this.f6463k != null) {
            int f = m5327f();
            if (f == 5) {
                this.f6460h.write(44);
            } else if (f != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m5329h();
            m5325b(4);
            m5326c(this.f6463k);
            this.f6463k = null;
        }
    }

    private void m5329h() {
        if (this.f6455c != null) {
            this.f6460h.write("\n");
            int i = this.f6462j;
            for (int i2 = 1; i2 < i; i2++) {
                this.f6460h.write(this.f6455c);
            }
        }
    }

    private void m5330i() {
        switch (m5327f()) {
            case 1:
                m5325b(2);
                m5329h();
                return;
            case 2:
                this.f6460h.append(',');
                m5329h();
                return;
            case 4:
                this.f6460h.append(this.f6456d);
                m5325b(5);
                return;
            case 6:
                break;
            case 7:
                if (!this.f6457e) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
                break;
            default:
                throw new IllegalStateException("Nesting problem.");
        }
        m5325b(7);
    }

    public C1937c mo1732a() {
        m5328g();
        return m5323a(1, "[");
    }

    public C1937c mo1733a(long j) {
        m5328g();
        m5330i();
        this.f6460h.write(Long.toString(j));
        return this;
    }

    public C1937c mo1734a(Boolean bool) {
        if (bool == null) {
            return mo1743e();
        }
        m5328g();
        m5330i();
        this.f6460h.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public C1937c mo1735a(Number number) {
        if (number == null) {
            return mo1743e();
        }
        m5328g();
        CharSequence obj = number.toString();
        if (this.f6457e || !(obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            m5330i();
            this.f6460h.append(obj);
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder("Numeric values must be finite, but was ");
        stringBuilder.append(number);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public C1937c mo1736a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f6463k != null) {
            throw new IllegalStateException();
        } else if (this.f6462j == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        } else {
            this.f6463k = str;
            return this;
        }
    }

    public C1937c mo1737a(boolean z) {
        m5328g();
        m5330i();
        this.f6460h.write(z ? "true" : "false");
        return this;
    }

    public C1937c mo1738b() {
        return m5322a(1, 2, "]");
    }

    public C1937c mo1739b(String str) {
        if (str == null) {
            return mo1743e();
        }
        m5328g();
        m5330i();
        m5326c(str);
        return this;
    }

    public C1937c mo1740c() {
        m5328g();
        return m5323a(3, "{");
    }

    public void close() {
        this.f6460h.close();
        int i = this.f6462j;
        if (i <= 1) {
            if (i != 1 || this.f6461i[i - 1] == 7) {
                this.f6462j = 0;
                return;
            }
        }
        throw new IOException("Incomplete document");
    }

    public C1937c mo1742d() {
        return m5322a(3, 5, "}");
    }

    public C1937c mo1743e() {
        if (this.f6463k != null) {
            if (this.f6459g) {
                m5328g();
            } else {
                this.f6463k = null;
                return this;
            }
        }
        m5330i();
        this.f6460h.write("null");
        return this;
    }

    public void flush() {
        if (this.f6462j == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f6460h.flush();
    }
}
