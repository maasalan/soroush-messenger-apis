package com.p111d.p112a.p114b.p117d;

import com.p111d.p112a.p114b.C1341a;
import com.p111d.p112a.p114b.C1375h;
import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j.C1376a;
import com.p111d.p112a.p114b.C5304n;
import com.p111d.p112a.p114b.p116c.C1345a;
import com.p111d.p112a.p114b.p116c.C1347c;
import com.p111d.p112a.p114b.p118e.C1364b;
import com.p111d.p112a.p114b.p120g.C1369b;
import com.p111d.p112a.p114b.p120g.C1373i;
import com.p111d.p112a.p114b.p539a.C7041b;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public final class C7260g extends C7041b {
    protected static final int[] f20957J = C1345a.m3180a();
    protected Reader f20958K;
    protected char[] f20959L;
    protected boolean f20960M;
    protected C5304n f20961N;
    protected final C1364b f20962O;
    protected final int f20963P;
    protected boolean f20964Q;
    protected long f20965R;
    protected int f20966S;
    protected int f20967T;

    public C7260g(C1347c c1347c, int i, C5304n c5304n, C1364b c1364b, char[] cArr, int i2, int i3, boolean z) {
        super(c1347c, i);
        this.f20958K = null;
        this.f20959L = cArr;
        this.c = i2;
        this.d = i3;
        this.f20961N = c5304n;
        this.f20962O = c1364b;
        this.f20963P = c1364b.f4295c;
        this.f20960M = z;
    }

    public C7260g(C1347c c1347c, int i, Reader reader, C5304n c5304n, C1364b c1364b) {
        super(c1347c, i);
        this.f20958K = reader;
        this.f20959L = c1347c.m3210h();
        this.c = 0;
        this.d = 0;
        this.f20961N = c5304n;
        this.f20962O = c1364b;
        this.f20963P = c1364b.f4295c;
        this.f20960M = true;
    }

    private final void m19227A() {
        int i = this.c;
        this.f20965R = (long) i;
        this.f20966S = this.f;
        this.f20967T = i - this.g;
    }

    private final int m19228a(boolean z) {
        while (true) {
            if (this.c >= this.d) {
                m18211a();
            }
            char[] cArr = this.f20959L;
            int i = this.c;
            this.c = i + 1;
            char c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    m19253t();
                } else if (c != '#' || !m19254u()) {
                    if (z) {
                        return c;
                    }
                    if (c != ':') {
                        if (c < ' ') {
                            _throwInvalidSpace(c);
                        }
                        _reportUnexpectedChar(c, "was expecting a colon to separate field name and value");
                    }
                    z = true;
                }
            } else if (c < ' ') {
                if (c == '\n') {
                    this.f++;
                    this.g = this.c;
                } else if (c == '\r') {
                    m19248o();
                } else if (c != '\t') {
                    _throwInvalidSpace(c);
                }
            }
        }
    }

    private final C1380m m19229a(int i) {
        C1380m c1380m;
        if (i == 34) {
            this.f20964Q = true;
            c1380m = C1380m.VALUE_STRING;
        } else if (i == 45) {
            c1380m = m19245l();
        } else if (i == 91) {
            this.k = this.k.m10981a(this.i, this.j);
            c1380m = C1380m.START_ARRAY;
        } else if (i == 102) {
            m19233a("false", 1);
            c1380m = C1380m.VALUE_FALSE;
        } else if (i == 110) {
            m19233a("null", 1);
            c1380m = C1380m.VALUE_NULL;
        } else if (i == 116) {
            m19233a("true", 1);
            c1380m = C1380m.VALUE_TRUE;
        } else if (i != 123) {
            switch (i) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    c1380m = m19237b(i);
                    break;
                default:
                    c1380m = m19242e(i);
                    break;
            }
        } else {
            this.k = this.k.m10986b(this.i, this.j);
            c1380m = C1380m.START_OBJECT;
        }
        this._currToken = c1380m;
        return c1380m;
    }

    private final C1380m m19230a(int i, int i2, int i3, boolean z, int i4) {
        int i5;
        int i6;
        int i7 = this.d;
        int i8 = 0;
        if (i == 46) {
            i = 0;
            while (i3 < i7) {
                i5 = i3 + 1;
                char c = this.f20959L[i3];
                if (c < '0' || c > '9') {
                    if (i == 0) {
                        m18213a((int) c, "Decimal point not followed by a digit");
                    }
                    i6 = i;
                    i = c;
                    i3 = i5;
                } else {
                    i++;
                    i3 = i5;
                }
            }
            return m19238b(z, i2);
        }
        i6 = 0;
        if (i == 101 || i == 69) {
            if (i3 >= i7) {
                this.c = i2;
                return m19238b(z, i2);
            }
            i5 = i3 + 1;
            i = this.f20959L[i3];
            if (i != 45) {
                if (i == 43) {
                }
                i3 = i5;
                if (i > 57 && i >= 48) {
                    i8++;
                    if (i3 >= i7) {
                        this.c = i2;
                    } else {
                        i5 = i3 + 1;
                        i = this.f20959L[i3];
                        i3 = i5;
                        if (i > 57) {
                        }
                        if (i8 == 0) {
                            m18213a(i, "Exponent indicator not followed by a digit");
                        }
                    }
                    this.c = i2;
                    return m19238b(z, i2);
                } else if (i8 == 0) {
                    m18213a(i, "Exponent indicator not followed by a digit");
                }
            }
            if (i5 >= i7) {
                this.c = i2;
                return m19238b(z, i2);
            }
            i3 = i5 + 1;
            i = this.f20959L[i5];
            if (i > 57) {
            }
            if (i8 == 0) {
                m18213a(i, "Exponent indicator not followed by a digit");
            }
        }
        i3--;
        this.c = i3;
        if (this.k.m3358c()) {
            m19239c(i);
        }
        this.m.m3331a(this.f20959L, i2, i3 - i2);
        return m18215b(z, i4, i6, i8);
    }

    private C1380m m19231a(int i, boolean z) {
        if (i == 73) {
            String str;
            StringBuilder stringBuilder;
            if (this.c >= this.d && !mo3508b()) {
                _reportInvalidEOFInValue();
            }
            char[] cArr = this.f20959L;
            int i2 = this.c;
            this.c = i2 + 1;
            i = cArr[i2];
            double d = Double.POSITIVE_INFINITY;
            if (i == 78) {
                str = z ? "-INF" : "+INF";
                m19233a(str, 3);
                if (isEnabled(C1376a.ALLOW_NON_NUMERIC_NUMBERS)) {
                    if (z) {
                        d = Double.NEGATIVE_INFINITY;
                    }
                    return m18208a(str, d);
                }
                stringBuilder = new StringBuilder("Non-standard token '");
            } else if (i == 110) {
                str = z ? "-Infinity" : "+Infinity";
                m19233a(str, 3);
                if (isEnabled(C1376a.ALLOW_NON_NUMERIC_NUMBERS)) {
                    if (z) {
                        d = Double.NEGATIVE_INFINITY;
                    }
                    return m18208a(str, d);
                }
                stringBuilder = new StringBuilder("Non-standard token '");
            }
            stringBuilder.append(str);
            stringBuilder.append("': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            _reportError(stringBuilder.toString());
        }
        m18213a(i, "expected digit (0-9) to follow minus sign, for valid numeric value");
        return null;
    }

    private String m19232a(int i, int i2, int i3) {
        this.m.m3331a(this.f20959L, i, this.c - i);
        char[] h = this.m.m3340h();
        int i4 = this.m.f4340i;
        while (true) {
            if (this.c >= this.d && !mo3508b()) {
                StringBuilder stringBuilder = new StringBuilder(": was expecting closing '");
                stringBuilder.append((char) i3);
                stringBuilder.append("' for name");
                _reportInvalidEOF(stringBuilder.toString());
            }
            char[] cArr = this.f20959L;
            int i5 = this.c;
            this.c = i5 + 1;
            char c = cArr[i5];
            if (c <= '\\') {
                if (c == '\\') {
                    c = mo3512j();
                } else if (c <= i3) {
                    if (c == i3) {
                        this.m.f4340i = i4;
                        C1373i c1373i = this.m;
                        return this.f20962O.m3304a(c1373i.m3337e(), c1373i.m3336d(), c1373i.m3335c(), i2);
                    } else if (c < ' ') {
                        _throwUnquotedSpace(c, "name");
                    }
                }
            }
            i2 = (i2 * 33) + c;
            i5 = i4 + 1;
            h[i4] = c;
            if (i5 >= h.length) {
                h = this.m.m3342j();
                i4 = 0;
            } else {
                i4 = i5;
            }
        }
    }

    private void m19233a(String str, int i) {
        int length = str.length();
        do {
            if (this.c >= this.d && !mo3508b()) {
                m19240c(str.substring(0, i));
            }
            if (this.f20959L[this.c] != str.charAt(i)) {
                m19240c(str.substring(0, i));
            }
            this.c++;
            i++;
        } while (i < length);
        if (this.c < this.d || mo3508b()) {
            char c = this.f20959L[this.c];
            if (c >= '0' && c != ']' && c != '}' && Character.isJavaIdentifierPart(c)) {
                m19240c(str.substring(0, i));
            }
        }
    }

    private void m19234a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder(str);
        while (true) {
            if (this.c >= this.d && !mo3508b()) {
                break;
            }
            char c = this.f20959L[this.c];
            if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            this.c++;
            stringBuilder.append(c);
        }
        StringBuilder stringBuilder2 = new StringBuilder("Unrecognized token '");
        stringBuilder2.append(stringBuilder.toString());
        stringBuilder2.append("': was expecting ");
        stringBuilder2.append(str2);
        _reportError(stringBuilder2.toString());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] m19235a(com.p111d.p112a.p114b.C1341a r10) {
        /*
        r9 = this;
        r0 = r9.m18221g();
    L_0x0004:
        r1 = r9.c;
        r2 = r9.d;
        if (r1 < r2) goto L_0x000d;
    L_0x000a:
        r9.m18211a();
    L_0x000d:
        r1 = r9.f20959L;
        r2 = r9.c;
        r3 = r2 + 1;
        r9.c = r3;
        r1 = r1[r2];
        r2 = 32;
        if (r1 <= r2) goto L_0x0004;
    L_0x001b:
        r2 = r10.m3172b(r1);
        r3 = 34;
        if (r2 >= 0) goto L_0x0031;
    L_0x0023:
        if (r1 != r3) goto L_0x002a;
    L_0x0025:
        r10 = r0.m3321b();
        return r10;
    L_0x002a:
        r2 = 0;
        r2 = r9.m18206a(r10, r1, r2);
        if (r2 < 0) goto L_0x0004;
    L_0x0031:
        r1 = r9.c;
        r4 = r9.d;
        if (r1 < r4) goto L_0x003a;
    L_0x0037:
        r9.m18211a();
    L_0x003a:
        r1 = r9.f20959L;
        r4 = r9.c;
        r5 = r4 + 1;
        r9.c = r5;
        r1 = r1[r4];
        r4 = r10.m3172b(r1);
        if (r4 >= 0) goto L_0x004f;
    L_0x004a:
        r4 = 1;
        r4 = r9.m18206a(r10, r1, r4);
    L_0x004f:
        r1 = r2 << 6;
        r1 = r1 | r4;
        r2 = r9.c;
        r4 = r9.d;
        if (r2 < r4) goto L_0x005b;
    L_0x0058:
        r9.m18211a();
    L_0x005b:
        r2 = r9.f20959L;
        r4 = r9.c;
        r5 = r4 + 1;
        r9.c = r5;
        r2 = r2[r4];
        r4 = r10.m3172b(r2);
        r5 = 3;
        r6 = 2;
        r7 = -2;
        if (r4 >= 0) goto L_0x00c5;
    L_0x006e:
        if (r4 == r7) goto L_0x0087;
    L_0x0070:
        if (r2 != r3) goto L_0x0082;
    L_0x0072:
        r4 = r10.m3167a();
        if (r4 != 0) goto L_0x0082;
    L_0x0078:
        r10 = r1 >> 4;
        r0.m3319a(r10);
    L_0x007d:
        r10 = r0.m3321b();
        return r10;
    L_0x0082:
        r2 = r9.m18206a(r10, r2, r6);
        r4 = r2;
    L_0x0087:
        if (r4 != r7) goto L_0x00c5;
    L_0x0089:
        r2 = r9.c;
        r3 = r9.d;
        if (r2 < r3) goto L_0x0092;
    L_0x008f:
        r9.m18211a();
    L_0x0092:
        r2 = r9.f20959L;
        r3 = r9.c;
        r4 = r3 + 1;
        r9.c = r4;
        r2 = r2[r3];
        r3 = r10.m3168a(r2);
        if (r3 != 0) goto L_0x00be;
    L_0x00a2:
        r0 = new java.lang.StringBuilder;
        r1 = "expected padding character '";
        r0.<init>(r1);
        r1 = r10.m3171b();
        r0.append(r1);
        r1 = "'";
        r0.append(r1);
        r0 = r0.toString();
        r10 = com.p111d.p112a.p114b.p539a.C7041b.m18201a(r10, r2, r5, r0);
        throw r10;
    L_0x00be:
        r1 = r1 >> 4;
        r0.m3319a(r1);
        goto L_0x0004;
    L_0x00c5:
        r1 = r1 << 6;
        r1 = r1 | r4;
        r2 = r9.c;
        r4 = r9.d;
        if (r2 < r4) goto L_0x00d1;
    L_0x00ce:
        r9.m18211a();
    L_0x00d1:
        r2 = r9.f20959L;
        r4 = r9.c;
        r8 = r4 + 1;
        r9.c = r8;
        r2 = r2[r4];
        r4 = r10.m3172b(r2);
        if (r4 >= 0) goto L_0x00ff;
    L_0x00e1:
        if (r4 == r7) goto L_0x00f6;
    L_0x00e3:
        if (r2 != r3) goto L_0x00f1;
    L_0x00e5:
        r3 = r10.m3167a();
        if (r3 != 0) goto L_0x00f1;
    L_0x00eb:
        r10 = r1 >> 2;
        r0.m3320b(r10);
        goto L_0x007d;
    L_0x00f1:
        r2 = r9.m18206a(r10, r2, r5);
        r4 = r2;
    L_0x00f6:
        if (r4 != r7) goto L_0x00ff;
    L_0x00f8:
        r1 = r1 >> 2;
        r0.m3320b(r1);
        goto L_0x0004;
    L_0x00ff:
        r1 = r1 << 6;
        r1 = r1 | r4;
        r0.m3322c(r1);
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.b.d.g.a(com.d.a.b.a):byte[]");
    }

    private char m19236b(String str) {
        if (this.c >= this.d && !mo3508b()) {
            _reportInvalidEOF(str);
        }
        char[] cArr = this.f20959L;
        int i = this.c;
        this.c = i + 1;
        return cArr[i];
    }

    private C1380m m19237b(int i) {
        int i2 = this.c;
        int i3 = i2 - 1;
        int i4 = this.d;
        if (i == 48) {
            return m19238b(false, i3);
        }
        int i5 = 1;
        while (i2 < i4) {
            int i6 = i2 + 1;
            i = this.f20959L[i2];
            if (i < '0' || i > '9') {
                if (!(i == '.' || i == 'e')) {
                    if (i != 'E') {
                        i6--;
                        this.c = i6;
                        if (this.k.m3358c()) {
                            m19239c(i);
                        }
                        this.m.m3331a(this.f20959L, i3, i6 - i3);
                        return m18209a(false, i5);
                    }
                }
                this.c = i6;
                return m19230a(i, i3, i6, false, i5);
            }
            i5++;
            i2 = i6;
        }
        this.c = i3;
        return m19238b(false, i3);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.p111d.p112a.p114b.C1380m m19238b(boolean r18, int r19) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        if (r1 == 0) goto L_0x0009;
    L_0x0006:
        r2 = r19 + 1;
        goto L_0x000b;
    L_0x0009:
        r2 = r19;
    L_0x000b:
        r0.c = r2;
        r2 = r0.m;
        r2 = r2.m3341i();
        r3 = 45;
        r4 = 0;
        r5 = 1;
        if (r1 == 0) goto L_0x001d;
    L_0x0019:
        r2[r4] = r3;
        r6 = r5;
        goto L_0x001e;
    L_0x001d:
        r6 = r4;
    L_0x001e:
        r7 = r0.c;
        r8 = r0.d;
        if (r7 >= r8) goto L_0x002f;
    L_0x0024:
        r7 = r0.f20959L;
        r8 = r0.c;
        r9 = r8 + 1;
        r0.c = r9;
        r7 = r7[r8];
        goto L_0x0035;
    L_0x002f:
        r7 = "No digit following minus sign";
        r7 = r0.m19236b(r7);
    L_0x0035:
        r8 = 57;
        r9 = 48;
        if (r7 != r9) goto L_0x0097;
    L_0x003b:
        r7 = r0.c;
        r10 = r0.d;
        if (r7 >= r10) goto L_0x004d;
    L_0x0041:
        r7 = r0.f20959L;
        r10 = r0.c;
        r7 = r7[r10];
        if (r7 < r9) goto L_0x004b;
    L_0x0049:
        if (r7 <= r8) goto L_0x004d;
    L_0x004b:
        r7 = r9;
        goto L_0x0097;
    L_0x004d:
        r7 = r0.c;
        r10 = r0.d;
        if (r7 < r10) goto L_0x005a;
    L_0x0053:
        r7 = r17.mo3508b();
        if (r7 != 0) goto L_0x005a;
    L_0x0059:
        goto L_0x004b;
    L_0x005a:
        r7 = r0.f20959L;
        r10 = r0.c;
        r7 = r7[r10];
        if (r7 < r9) goto L_0x004b;
    L_0x0062:
        if (r7 <= r8) goto L_0x0065;
    L_0x0064:
        goto L_0x004b;
    L_0x0065:
        r10 = com.p111d.p112a.p114b.C5303j.C1376a.ALLOW_NUMERIC_LEADING_ZEROS;
        r10 = r0.isEnabled(r10);
        if (r10 != 0) goto L_0x0072;
    L_0x006d:
        r10 = "Leading zeroes not allowed";
        r0.m18214a(r10);
    L_0x0072:
        r10 = r0.c;
        r10 = r10 + r5;
        r0.c = r10;
        if (r7 != r9) goto L_0x0097;
    L_0x0079:
        r10 = r0.c;
        r11 = r0.d;
        if (r10 < r11) goto L_0x0085;
    L_0x007f:
        r10 = r17.mo3508b();
        if (r10 == 0) goto L_0x0097;
    L_0x0085:
        r7 = r0.f20959L;
        r10 = r0.c;
        r7 = r7[r10];
        if (r7 < r9) goto L_0x004b;
    L_0x008d:
        if (r7 <= r8) goto L_0x0090;
    L_0x008f:
        goto L_0x004b;
    L_0x0090:
        r10 = r0.c;
        r10 = r10 + r5;
        r0.c = r10;
        if (r7 == r9) goto L_0x0079;
    L_0x0097:
        r10 = r2;
        r2 = r4;
    L_0x0099:
        if (r7 < r9) goto L_0x00c9;
    L_0x009b:
        if (r7 > r8) goto L_0x00c9;
    L_0x009d:
        r2 = r2 + 1;
        r11 = r10.length;
        if (r6 < r11) goto L_0x00aa;
    L_0x00a2:
        r6 = r0.m;
        r6 = r6.m3342j();
        r10 = r6;
        r6 = r4;
    L_0x00aa:
        r11 = r6 + 1;
        r10[r6] = r7;
        r6 = r0.c;
        r7 = r0.d;
        if (r6 < r7) goto L_0x00bd;
    L_0x00b4:
        r6 = r17.mo3508b();
        if (r6 != 0) goto L_0x00bd;
    L_0x00ba:
        r7 = r4;
        r6 = r5;
        goto L_0x00cb;
    L_0x00bd:
        r6 = r0.f20959L;
        r7 = r0.c;
        r12 = r7 + 1;
        r0.c = r12;
        r7 = r6[r7];
        r6 = r11;
        goto L_0x0099;
    L_0x00c9:
        r11 = r6;
        r6 = r4;
    L_0x00cb:
        if (r2 != 0) goto L_0x00d2;
    L_0x00cd:
        r1 = r0.m19231a(r7, r1);
        return r1;
    L_0x00d2:
        r12 = 46;
        if (r7 != r12) goto L_0x0112;
    L_0x00d6:
        r12 = r11 + 1;
        r10[r11] = r7;
        r11 = r7;
        r7 = r4;
    L_0x00dc:
        r13 = r0.c;
        r14 = r0.d;
        if (r13 < r14) goto L_0x00ea;
    L_0x00e2:
        r13 = r17.mo3508b();
        if (r13 != 0) goto L_0x00ea;
    L_0x00e8:
        r6 = r5;
        goto L_0x010a;
    L_0x00ea:
        r11 = r0.f20959L;
        r13 = r0.c;
        r14 = r13 + 1;
        r0.c = r14;
        r11 = r11[r13];
        if (r11 < r9) goto L_0x010a;
    L_0x00f6:
        if (r11 > r8) goto L_0x010a;
    L_0x00f8:
        r7 = r7 + 1;
        r13 = r10.length;
        if (r12 < r13) goto L_0x0104;
    L_0x00fd:
        r10 = r0.m;
        r10 = r10.m3342j();
        r12 = r4;
    L_0x0104:
        r13 = r12 + 1;
        r10[r12] = r11;
        r12 = r13;
        goto L_0x00dc;
    L_0x010a:
        if (r7 != 0) goto L_0x0115;
    L_0x010c:
        r13 = "Decimal point not followed by a digit";
        r0.m18213a(r11, r13);
        goto L_0x0115;
    L_0x0112:
        r12 = r11;
        r11 = r7;
        r7 = r4;
    L_0x0115:
        r13 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        if (r11 == r13) goto L_0x0123;
    L_0x0119:
        r13 = 69;
        if (r11 != r13) goto L_0x011e;
    L_0x011d:
        goto L_0x0123;
    L_0x011e:
        r3 = r6;
        r6 = r2;
        r2 = r0;
        goto L_0x01c1;
    L_0x0123:
        r13 = r10.length;
        if (r12 < r13) goto L_0x012d;
    L_0x0126:
        r10 = r0.m;
        r10 = r10.m3342j();
        r12 = r4;
    L_0x012d:
        r13 = r12 + 1;
        r10[r12] = r11;
        r11 = r0.c;
        r12 = r0.d;
        if (r11 >= r12) goto L_0x0142;
    L_0x0137:
        r11 = r0.f20959L;
        r12 = r0.c;
        r14 = r12 + 1;
        r0.c = r14;
        r11 = r11[r12];
        goto L_0x0148;
    L_0x0142:
        r11 = "expected a digit for number exponent";
        r11 = r0.m19236b(r11);
    L_0x0148:
        if (r11 == r3) goto L_0x0155;
    L_0x014a:
        r3 = 43;
        if (r11 != r3) goto L_0x014f;
    L_0x014e:
        goto L_0x0155;
    L_0x014f:
        r12 = r2;
        r3 = r6;
        r2 = r0;
        r6 = r1;
        r1 = r4;
        goto L_0x0185;
    L_0x0155:
        r3 = r10.length;
        if (r13 < r3) goto L_0x015f;
    L_0x0158:
        r3 = r0.m;
        r10 = r3.m3342j();
        r13 = r4;
    L_0x015f:
        r3 = r13 + 1;
        r10[r13] = r11;
        r11 = r0.c;
        r12 = r0.d;
        if (r11 >= r12) goto L_0x0179;
    L_0x0169:
        r11 = r0.f20959L;
        r12 = r0.c;
        r13 = r12 + 1;
        r0.c = r13;
        r11 = r11[r12];
    L_0x0173:
        r12 = r2;
        r13 = r6;
        r2 = r0;
        r6 = r1;
        r1 = r4;
        goto L_0x0180;
    L_0x0179:
        r11 = "expected a digit for number exponent";
        r11 = r0.m19236b(r11);
        goto L_0x0173;
    L_0x0180:
        r16 = r13;
        r13 = r3;
        r3 = r16;
    L_0x0185:
        if (r11 > r8) goto L_0x01b6;
    L_0x0187:
        if (r11 < r9) goto L_0x01b6;
    L_0x0189:
        r1 = r1 + 1;
        r14 = r10.length;
        if (r13 < r14) goto L_0x0195;
    L_0x018e:
        r10 = r2.m;
        r10 = r10.m3342j();
        r13 = r4;
    L_0x0195:
        r14 = r13 + 1;
        r10[r13] = r11;
        r13 = r2.c;
        r15 = r2.d;
        if (r13 < r15) goto L_0x01a9;
    L_0x019f:
        r13 = r2.mo3508b();
        if (r13 != 0) goto L_0x01a9;
    L_0x01a5:
        r4 = r1;
        r3 = r5;
        r13 = r14;
        goto L_0x01b7;
    L_0x01a9:
        r11 = r2.f20959L;
        r13 = r2.c;
        r15 = r13 + 1;
        r2.c = r15;
        r11 = r11[r13];
        r13 = r3;
        r3 = r14;
        goto L_0x0180;
    L_0x01b6:
        r4 = r1;
    L_0x01b7:
        if (r4 != 0) goto L_0x01be;
    L_0x01b9:
        r1 = "Exponent indicator not followed by a digit";
        r2.m18213a(r11, r1);
    L_0x01be:
        r1 = r6;
        r6 = r12;
        r12 = r13;
    L_0x01c1:
        if (r3 != 0) goto L_0x01d3;
    L_0x01c3:
        r3 = r2.c;
        r3 = r3 - r5;
        r2.c = r3;
        r3 = r2.k;
        r3 = r3.m3358c();
        if (r3 == 0) goto L_0x01d3;
    L_0x01d0:
        r2.m19239c(r11);
    L_0x01d3:
        r3 = r2.m;
        r3.f4340i = r12;
        r1 = r2.m18210a(r1, r6, r7, r4);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.b.d.g.b(boolean, int):com.d.a.b.m");
    }

    private final void m19239c(int i) {
        this.c++;
        if (i != 13) {
            if (i != 32) {
                switch (i) {
                    case 9:
                        break;
                    case 10:
                        this.f++;
                        this.g = this.c;
                        break;
                    default:
                        _reportMissingRootWS(i);
                        return;
                }
            }
            return;
        }
        m19248o();
    }

    private void m19240c(String str) {
        m19234a(str, "'null', 'true', 'false' or NaN");
    }

    private String m19241d(int i) {
        char c;
        if (i == 39 && isEnabled(C1376a.ALLOW_SINGLE_QUOTES)) {
            i = this.c;
            int i2 = this.f20963P;
            int i3 = this.d;
            if (i < i3) {
                int[] iArr = f20957J;
                char length = iArr.length;
                do {
                    c = this.f20959L[i];
                    if (c != '\'') {
                        if (c < length && iArr[c] != 0) {
                            break;
                        }
                        i2 = (i2 * 33) + c;
                        i++;
                    } else {
                        int i4 = this.c;
                        this.c = i + 1;
                        return this.f20962O.m3304a(this.f20959L, i4, i - i4, i2);
                    }
                } while (i < i3);
            }
            i3 = this.c;
            this.c = i;
            return m19232a(i3, i2, 39);
        }
        char c2;
        if (!isEnabled(C1376a.ALLOW_UNQUOTED_FIELD_NAMES)) {
            _reportUnexpectedChar(i, "was expecting double-quote to start field name");
        }
        int[] c3 = C1345a.m3182c();
        char length2 = c3.length;
        boolean isJavaIdentifierPart = i < length2 ? c3[i] == 0 : Character.isJavaIdentifierPart((char) i);
        if (!isJavaIdentifierPart) {
            _reportUnexpectedChar(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        i = this.c;
        int i5 = this.f20963P;
        int i6 = this.d;
        if (i < i6) {
            do {
                c2 = this.f20959L[i];
                if (c2 < length2) {
                    if (c3[c2] != 0) {
                        i4 = this.c - 1;
                        this.c = i;
                        return this.f20962O.m3304a(this.f20959L, i4, i - i4, i5);
                    }
                } else if (!Character.isJavaIdentifierPart((char) c2)) {
                    i4 = this.c - 1;
                    this.c = i;
                    return this.f20962O.m3304a(this.f20959L, i4, i - i4, i5);
                }
                i5 = (i5 * 33) + c2;
                i++;
            } while (i < i6);
        }
        int i7 = this.c - 1;
        this.c = i;
        this.m.m3331a(this.f20959L, i7, this.c - i7);
        char[] h = this.m.m3340h();
        i7 = this.m.f4340i;
        c = c3.length;
        while (true) {
            if (this.c >= this.d && !mo3508b()) {
                break;
            }
            c2 = this.f20959L[this.c];
            if (c2 > c) {
                if (!Character.isJavaIdentifierPart(c2)) {
                    break;
                }
            } else if (c3[c2] != 0) {
                break;
            }
            this.c++;
            i5 = (i5 * 33) + c2;
            int i8 = i7 + 1;
            h[i7] = c2;
            if (i8 >= h.length) {
                h = this.m.m3342j();
                i7 = 0;
            } else {
                i7 = i8;
            }
        }
        this.m.f4340i = i7;
        C1373i c1373i = this.m;
        return this.f20962O.m3304a(c1373i.m3337e(), c1373i.m3336d(), c1373i.m3335c(), i5);
    }

    private C1380m m19242e(int i) {
        char[] cArr;
        if (i != 39) {
            if (i != 43) {
                String str;
                if (i == 73) {
                    m19233a("Infinity", 1);
                    if (isEnabled(C1376a.ALLOW_NON_NUMERIC_NUMBERS)) {
                        return m18208a("Infinity", Double.POSITIVE_INFINITY);
                    }
                    str = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow";
                } else if (i == 78) {
                    m19233a("NaN", 1);
                    if (isEnabled(C1376a.ALLOW_NON_NUMERIC_NUMBERS)) {
                        return m18208a("NaN", Double.NaN);
                    }
                    str = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow";
                }
                _reportError(str);
            } else {
                if (this.c >= this.d && !mo3508b()) {
                    _reportInvalidEOFInValue();
                }
                cArr = this.f20959L;
                int i2 = this.c;
                this.c = i2 + 1;
                return m19231a(cArr[i2], false);
            }
        } else if (isEnabled(C1376a.ALLOW_SINGLE_QUOTES)) {
            cArr = this.m.m3341i();
            int i3 = this.m.f4340i;
            while (true) {
                if (this.c >= this.d && !mo3508b()) {
                    _reportInvalidEOF(": was expecting closing quote for a string value");
                }
                char[] cArr2 = this.f20959L;
                int i4 = this.c;
                this.c = i4 + 1;
                char c = cArr2[i4];
                if (c <= '\\') {
                    if (c == '\\') {
                        c = mo3512j();
                    } else if (c <= '\'') {
                        if (c == '\'') {
                            this.m.f4340i = i3;
                            return C1380m.VALUE_STRING;
                        } else if (c < ' ') {
                            _throwUnquotedSpace(c, "string value");
                        }
                    }
                }
                if (i3 >= cArr.length) {
                    cArr = this.m.m3342j();
                    i3 = 0;
                }
                i4 = i3 + 1;
                cArr[i3] = c;
                i3 = i4;
            }
        }
        if (Character.isJavaIdentifierStart(i)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((char) i);
            m19234a(stringBuilder.toString(), "('true', 'false' or 'null')");
        }
        _reportUnexpectedChar(i, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
        return null;
    }

    private final int m19243f(int i) {
        if (i != 44) {
            StringBuilder stringBuilder = new StringBuilder("was expecting comma to separate ");
            stringBuilder.append(this.k.m3360e());
            stringBuilder.append(" entries");
            _reportUnexpectedChar(i, stringBuilder.toString());
        }
        while (this.c < this.d) {
            char[] cArr = this.f20959L;
            int i2 = this.c;
            this.c = i2 + 1;
            char c = cArr[i2];
            if (c > ' ') {
                if (c != '/') {
                    if (c != '#') {
                        return c;
                    }
                }
                this.c--;
                return m19250q();
            } else if (c < ' ') {
                if (c == '\n') {
                    this.f++;
                    this.g = this.c;
                } else if (c == '\r') {
                    m19248o();
                } else if (c != '\t') {
                    _throwInvalidSpace(c);
                }
            }
        }
        return m19250q();
    }

    private final C1380m m19244k() {
        C5294d a;
        this.o = false;
        C1380m c1380m = this.l;
        this.l = null;
        if (c1380m == C1380m.START_ARRAY) {
            a = this.k.m10981a(this.i, this.j);
        } else {
            if (c1380m == C1380m.START_OBJECT) {
                a = this.k.m10986b(this.i, this.j);
            }
            this._currToken = c1380m;
            return c1380m;
        }
        this.k = a;
        this._currToken = c1380m;
        return c1380m;
    }

    private C1380m m19245l() {
        int i = this.c;
        int i2 = i - 1;
        int i3 = this.d;
        if (i >= i3) {
            return m19238b(true, i2);
        }
        int i4 = i + 1;
        i = this.f20959L[i];
        if (i <= 57) {
            if (i >= 48) {
                if (i == 48) {
                    return m19238b(true, i2);
                }
                i = 1;
                while (i4 < i3) {
                    int i5 = i4 + 1;
                    i4 = this.f20959L[i4];
                    if (i4 < '0' || i4 > '9') {
                        if (!(i4 == '.' || i4 == 'e')) {
                            if (i4 != 'E') {
                                i5--;
                                this.c = i5;
                                if (this.k.m3358c()) {
                                    m19239c(i4);
                                }
                                this.m.m3331a(this.f20959L, i2, i5 - i2);
                                return m18209a(true, i);
                            }
                        }
                        this.c = i5;
                        return m19230a(i4, i2, i5, true, i);
                    }
                    i++;
                    i4 = i5;
                }
                return m19238b(true, i2);
            }
        }
        this.c = i4;
        return m19231a(i, true);
    }

    private String m19246m() {
        int i;
        int i2 = this.c;
        int i3 = this.f20963P;
        int[] iArr = f20957J;
        while (i2 < this.d) {
            char c = this.f20959L[i2];
            if (c >= iArr.length || iArr[c] == 0) {
                i3 = (i3 * 33) + c;
                i2++;
            } else {
                if (c == '\"') {
                    i = this.c;
                    this.c = i2 + 1;
                    return this.f20962O.m3304a(this.f20959L, i, i2 - i, i3);
                }
                i = this.c;
                this.c = i2;
                return m19232a(i, i3, 34);
            }
        }
        i = this.c;
        this.c = i2;
        return m19232a(i, i3, 34);
    }

    private void m19247n() {
        this.f20964Q = false;
        int i = this.c;
        int i2 = this.d;
        char[] cArr = this.f20959L;
        while (true) {
            if (i >= i2) {
                this.c = i;
                if (!mo3508b()) {
                    _reportInvalidEOF(": was expecting closing quote for a string value");
                }
                i = this.c;
                i2 = this.d;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c <= '\\') {
                if (c == '\\') {
                    this.c = i3;
                    mo3512j();
                    i = this.c;
                    i2 = this.d;
                } else if (c <= '\"') {
                    if (c == '\"') {
                        this.c = i3;
                        return;
                    } else if (c < ' ') {
                        this.c = i3;
                        _throwUnquotedSpace(c, "string value");
                    }
                }
            }
            i = i3;
        }
    }

    private void m19248o() {
        if ((this.c < this.d || mo3508b()) && this.f20959L[this.c] == '\n') {
            this.c++;
        }
        this.f++;
        this.g = this.c;
    }

    private final int m19249p() {
        if (this.c + 4 >= this.d) {
            return m19228a(false);
        }
        int i;
        char c = this.f20959L[this.c];
        char[] cArr;
        int i2;
        if (c == ':') {
            cArr = this.f20959L;
            i2 = this.c + 1;
            this.c = i2;
            i = cArr[i2];
            if (i > 32) {
                if (i != 47) {
                    if (i == 35) {
                    }
                }
                return m19228a(true);
            }
            if (i == 32 || i == 9) {
                cArr = this.f20959L;
                i2 = this.c + 1;
                this.c = i2;
                i = cArr[i2];
                if (i > 32) {
                    if (i == 47 || i == 35) {
                        return m19228a(true);
                    }
                }
            }
            return m19228a(true);
        }
        if (c == ' ' || c == '\t') {
            cArr = this.f20959L;
            int i3 = this.c + 1;
            this.c = i3;
            c = cArr[i3];
        }
        if (c != ':') {
            return m19228a(false);
        }
        cArr = this.f20959L;
        i2 = this.c + 1;
        this.c = i2;
        i = cArr[i2];
        if (i <= 32) {
            if (i == 32 || i == 9) {
                cArr = this.f20959L;
                i2 = this.c + 1;
                this.c = i2;
                i = cArr[i2];
                if (i > 32) {
                    if (i == 47 || i == 35) {
                        return m19228a(true);
                    }
                }
            }
            return m19228a(true);
        } else if (i == 47 || i == 35) {
            return m19228a(true);
        }
        this.c++;
        return i;
    }

    private final int m19250q() {
        char c;
        while (true) {
            if (this.c >= this.d) {
                if (!mo3508b()) {
                    StringBuilder stringBuilder = new StringBuilder("Unexpected end-of-input within/between ");
                    stringBuilder.append(this.k.m3360e());
                    stringBuilder.append(" entries");
                    throw _constructError(stringBuilder.toString());
                }
            }
            char[] cArr = this.f20959L;
            int i = this.c;
            this.c = i + 1;
            c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    m19253t();
                } else if (c != '#' || !m19254u()) {
                    return c;
                }
            } else if (c < ' ') {
                if (c == '\n') {
                    this.f++;
                    this.g = this.c;
                } else if (c == '\r') {
                    m19248o();
                } else if (c != '\t') {
                    _throwInvalidSpace(c);
                }
            }
        }
        return c;
    }

    private final int m19251r() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r9 = this;
        r0 = r9.c;
        r1 = r9.d;
        if (r0 < r1) goto L_0x0011;
    L_0x0006:
        r0 = r9.mo3508b();
        if (r0 != 0) goto L_0x0011;
    L_0x000c:
        r0 = r9.m18220f();
        return r0;
    L_0x0011:
        r0 = r9.f20959L;
        r1 = r9.c;
        r2 = r1 + 1;
        r9.c = r2;
        r0 = r0[r1];
        r1 = 35;
        r2 = 47;
        r3 = 32;
        if (r0 <= r3) goto L_0x0034;
    L_0x0023:
        if (r0 == r2) goto L_0x0029;
    L_0x0025:
        if (r0 != r1) goto L_0x0028;
    L_0x0027:
        goto L_0x0029;
    L_0x0028:
        return r0;
    L_0x0029:
        r0 = r9.c;
        r0 = r0 + -1;
        r9.c = r0;
        r0 = r9.m19252s();
        return r0;
    L_0x0034:
        r4 = 9;
        r5 = 13;
        r6 = 10;
        if (r0 == r3) goto L_0x0054;
    L_0x003c:
        if (r0 != r6) goto L_0x0049;
    L_0x003e:
        r0 = r9.f;
        r0 = r0 + 1;
        r9.f = r0;
        r0 = r9.c;
        r9.g = r0;
        goto L_0x0054;
    L_0x0049:
        if (r0 != r5) goto L_0x004f;
    L_0x004b:
        r9.m19248o();
        goto L_0x0054;
    L_0x004f:
        if (r0 == r4) goto L_0x0054;
    L_0x0051:
        r9._throwInvalidSpace(r0);
    L_0x0054:
        r0 = r9.c;
        r7 = r9.d;
        if (r0 >= r7) goto L_0x0077;
    L_0x005a:
        r0 = r9.f20959L;
        r7 = r9.c;
        r8 = r7 + 1;
        r9.c = r8;
        r0 = r0[r7];
        if (r0 <= r3) goto L_0x006c;
    L_0x0066:
        if (r0 == r2) goto L_0x0029;
    L_0x0068:
        if (r0 != r1) goto L_0x006b;
    L_0x006a:
        goto L_0x0029;
    L_0x006b:
        return r0;
    L_0x006c:
        if (r0 == r3) goto L_0x0054;
    L_0x006e:
        if (r0 != r6) goto L_0x0071;
    L_0x0070:
        goto L_0x003e;
    L_0x0071:
        if (r0 != r5) goto L_0x0074;
    L_0x0073:
        goto L_0x004b;
    L_0x0074:
        if (r0 == r4) goto L_0x0054;
    L_0x0076:
        goto L_0x0051;
    L_0x0077:
        r0 = r9.m19252s();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.b.d.g.r():int");
    }

    private int m19252s() {
        char c;
        while (true) {
            if (this.c >= this.d && !mo3508b()) {
                return m18220f();
            }
            char[] cArr = this.f20959L;
            int i = this.c;
            this.c = i + 1;
            c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    m19253t();
                } else if (c != '#' || !m19254u()) {
                    return c;
                }
            } else if (c != ' ') {
                if (c == '\n') {
                    this.f++;
                    this.g = this.c;
                } else if (c == '\r') {
                    m19248o();
                } else if (c != '\t') {
                    _throwInvalidSpace(c);
                }
            }
        }
        return c;
    }

    private void m19253t() {
        if (!isEnabled(C1376a.ALLOW_COMMENTS)) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.c >= this.d && !mo3508b()) {
            _reportInvalidEOF(" in a comment");
        }
        char[] cArr = this.f20959L;
        int i = this.c;
        this.c = i + 1;
        char c = cArr[i];
        if (c == '/') {
            m19255v();
        } else if (c == '*') {
            while (true) {
                if (this.c >= this.d && !mo3508b()) {
                    break;
                }
                cArr = this.f20959L;
                int i2 = this.c;
                this.c = i2 + 1;
                c = cArr[i2];
                if (c <= '*') {
                    if (c == '*') {
                        if (this.c >= this.d) {
                            if (!mo3508b()) {
                                break;
                            }
                        }
                        if (this.f20959L[this.c] == '/') {
                            this.c++;
                            return;
                        }
                    } else if (c < ' ') {
                        if (c == '\n') {
                            this.f++;
                            this.g = this.c;
                        } else if (c == '\r') {
                            m19248o();
                        } else if (c != '\t') {
                            _throwInvalidSpace(c);
                        }
                    }
                }
            }
            _reportInvalidEOF(" in a comment");
        } else {
            _reportUnexpectedChar(c, "was expecting either '*' or '/' for a comment");
        }
    }

    private boolean m19254u() {
        if (!isEnabled(C1376a.ALLOW_YAML_COMMENTS)) {
            return false;
        }
        m19255v();
        return true;
    }

    private void m19255v() {
        while (true) {
            if (this.c >= this.d) {
                if (!mo3508b()) {
                    return;
                }
            }
            char[] cArr = this.f20959L;
            int i = this.c;
            this.c = i + 1;
            char c = cArr[i];
            if (c < ' ') {
                if (c == '\n') {
                    this.f++;
                    this.g = this.c;
                    return;
                } else if (c == '\r') {
                    m19248o();
                    return;
                } else if (c != '\t') {
                    _throwInvalidSpace(c);
                }
            }
        }
    }

    private final void m19256w() {
        int i = this.c;
        if (i + 3 < this.d) {
            char[] cArr = this.f20959L;
            if (cArr[i] == 'r') {
                i++;
                if (cArr[i] == 'u') {
                    i++;
                    if (cArr[i] == 'e') {
                        i++;
                        char c = cArr[i];
                        if (c < '0' || c == ']' || c == '}') {
                            this.c = i;
                            return;
                        }
                    }
                }
            }
        }
        m19233a("true", 1);
    }

    private final void m19257x() {
        int i = this.c;
        if (i + 4 < this.d) {
            char[] cArr = this.f20959L;
            if (cArr[i] == 'a') {
                i++;
                if (cArr[i] == 'l') {
                    i++;
                    if (cArr[i] == 's') {
                        i++;
                        if (cArr[i] == 'e') {
                            i++;
                            char c = cArr[i];
                            if (c < '0' || c == ']' || c == '}') {
                                this.c = i;
                                return;
                            }
                        }
                    }
                }
            }
        }
        m19233a("false", 1);
    }

    private final void m19258y() {
        int i = this.c;
        if (i + 3 < this.d) {
            char[] cArr = this.f20959L;
            if (cArr[i] == 'u') {
                i++;
                if (cArr[i] == 'l') {
                    i++;
                    if (cArr[i] == 'l') {
                        i++;
                        char c = cArr[i];
                        if (c < '0' || c == ']' || c == '}') {
                            this.c = i;
                            return;
                        }
                    }
                }
            }
        }
        m19233a("null", 1);
    }

    private final void m19259z() {
        int i = this.c;
        this.h = this.e + ((long) i);
        this.i = this.f;
        this.j = i - this.g;
    }

    protected final boolean mo3508b() {
        int i = this.d;
        long j = (long) i;
        this.e += j;
        this.g -= i;
        this.f20965R -= j;
        if (this.f20958K != null) {
            i = this.f20958K.read(this.f20959L, 0, this.f20959L.length);
            if (i > 0) {
                this.c = 0;
                this.d = i;
                return true;
            }
            mo3510d();
            if (i == 0) {
                StringBuilder stringBuilder = new StringBuilder("Reader returned 0 characters when trying to read ");
                stringBuilder.append(this.d);
                throw new IOException(stringBuilder.toString());
            }
        }
        return false;
    }

    protected final void mo3509c() {
        int i = this.c;
        int i2 = this.d;
        if (i < i2) {
            int[] iArr = f20957J;
            char length = iArr.length;
            do {
                char c = this.f20959L[i];
                if (c >= length || iArr[c] == 0) {
                    i++;
                } else if (c == '\"') {
                    this.m.m3331a(this.f20959L, this.c, i - this.c);
                    this.c = i + 1;
                    return;
                }
            } while (i < i2);
        }
        C1373i c1373i = this.m;
        Object obj = this.f20959L;
        int i3 = this.c;
        int i4 = i - this.c;
        c1373i.f4334c = null;
        c1373i.f4335d = -1;
        c1373i.f4336e = 0;
        c1373i.f4341j = null;
        c1373i.f4342k = null;
        if (c1373i.f4337f) {
            c1373i.m3333b();
        } else if (c1373i.f4339h == null) {
            c1373i.f4339h = c1373i.m3332a(i4);
        }
        c1373i.f4338g = 0;
        c1373i.f4340i = 0;
        if (c1373i.f4335d >= 0) {
            c1373i.m3334b(i4);
        }
        c1373i.f4341j = null;
        c1373i.f4342k = null;
        Object obj2 = c1373i.f4339h;
        int length2 = obj2.length - c1373i.f4340i;
        if (length2 >= i4) {
            System.arraycopy(obj, i3, obj2, c1373i.f4340i, i4);
            c1373i.f4340i += i4;
        } else {
            if (length2 > 0) {
                System.arraycopy(obj, i3, obj2, c1373i.f4340i, length2);
                i3 += length2;
                i4 -= length2;
            }
            do {
                c1373i.m3344l();
                int min = Math.min(c1373i.f4339h.length, i4);
                System.arraycopy(obj, i3, c1373i.f4339h, 0, min);
                c1373i.f4340i += min;
                i3 += min;
                i4 -= min;
            } while (i4 > 0);
        }
        this.c = i;
        char[] h = this.m.m3340h();
        i2 = this.m.f4340i;
        int[] iArr2 = f20957J;
        char length3 = iArr2.length;
        while (true) {
            if (this.c >= this.d && !mo3508b()) {
                _reportInvalidEOF(": was expecting closing quote for a string value");
            }
            char[] cArr = this.f20959L;
            i3 = this.c;
            this.c = i3 + 1;
            char c2 = cArr[i3];
            if (c2 < length3 && iArr2[c2] != 0) {
                if (c2 == '\"') {
                    this.m.f4340i = i2;
                    return;
                } else if (c2 == '\\') {
                    c2 = mo3512j();
                } else if (c2 < ' ') {
                    _throwUnquotedSpace(c2, "string value");
                }
            }
            if (i2 >= h.length) {
                h = this.m.m3342j();
                i2 = 0;
            }
            i3 = i2 + 1;
            h[i2] = c2;
            i2 = i3;
        }
    }

    protected final void mo3510d() {
        if (this.f20958K != null) {
            if (this.a.m3205c() || isEnabled(C1376a.AUTO_CLOSE_SOURCE)) {
                this.f20958K.close();
            }
            this.f20958K = null;
        }
    }

    protected final void mo3511e() {
        super.mo3511e();
        this.f20962O.m3305b();
        if (this.f20960M) {
            char[] cArr = this.f20959L;
            if (cArr != null) {
                this.f20959L = null;
                this.a.m3197a(cArr);
            }
        }
    }

    public final byte[] getBinaryValue(C1341a c1341a) {
        if (this._currToken != C1380m.VALUE_STRING && (this._currToken != C1380m.VALUE_EMBEDDED_OBJECT || this.q == null)) {
            StringBuilder stringBuilder = new StringBuilder("Current token (");
            stringBuilder.append(this._currToken);
            stringBuilder.append(") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
            _reportError(stringBuilder.toString());
        }
        if (this.f20964Q) {
            try {
                this.q = m19235a(c1341a);
                this.f20964Q = false;
            } catch (IllegalArgumentException e) {
                StringBuilder stringBuilder2 = new StringBuilder("Failed to decode VALUE_STRING as base64 (");
                stringBuilder2.append(c1341a);
                stringBuilder2.append("): ");
                stringBuilder2.append(e.getMessage());
                throw _constructError(stringBuilder2.toString());
            }
        } else if (this.q == null) {
            C1369b g = m18221g();
            _decodeBase64(getText(), g, c1341a);
            this.q = g.m3321b();
        }
        return this.q;
    }

    public final C5304n getCodec() {
        return this.f20961N;
    }

    public final C1375h getCurrentLocation() {
        int i = (this.c - this.g) + 1;
        return new C1375h(this.a.m3194a(), -1, this.e + ((long) this.c), this.f, i);
    }

    public final Object getInputSource() {
        return this.f20958K;
    }

    public final String getText() {
        C1380m c1380m = this._currToken;
        if (c1380m == C1380m.VALUE_STRING) {
            if (this.f20964Q) {
                this.f20964Q = false;
                mo3509c();
            }
            return this.m.m3338f();
        } else if (c1380m == null) {
            return null;
        } else {
            switch (c1380m.f4392q) {
                case 5:
                    return this.k.m10989i();
                case 6:
                case 7:
                case 8:
                    return this.m.m3338f();
                default:
                    return c1380m.f4389n;
            }
        }
    }

    public final char[] getTextCharacters() {
        if (this._currToken == null) {
            return null;
        }
        switch (this._currToken.f4392q) {
            case 5:
                if (!this.o) {
                    char[] b;
                    String i = this.k.m10989i();
                    int length = i.length();
                    if (this.n == null) {
                        b = this.a.m3202b(length);
                    } else {
                        if (this.n.length < length) {
                            b = new char[length];
                        }
                        i.getChars(0, length, this.n, 0);
                        this.o = true;
                    }
                    this.n = b;
                    i.getChars(0, length, this.n, 0);
                    this.o = true;
                }
                return this.n;
            case 6:
                if (this.f20964Q) {
                    this.f20964Q = false;
                    mo3509c();
                    break;
                }
                break;
            case 7:
            case 8:
                break;
            default:
                return this._currToken.f4390o;
        }
        return this.m.m3337e();
    }

    public final int getTextLength() {
        if (this._currToken == null) {
            return 0;
        }
        switch (this._currToken.f4392q) {
            case 5:
                return this.k.m10989i().length();
            case 6:
                if (this.f20964Q) {
                    this.f20964Q = false;
                    mo3509c();
                    break;
                }
                break;
            case 7:
            case 8:
                break;
            default:
                return this._currToken.f4390o.length;
        }
        return this.m.m3335c();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getTextOffset() {
        /*
        r2 = this;
        r0 = r2._currToken;
        r1 = 0;
        if (r0 == 0) goto L_0x001d;
    L_0x0005:
        r0 = r2._currToken;
        r0 = r0.f4392q;
        switch(r0) {
            case 5: goto L_0x001d;
            case 6: goto L_0x000d;
            case 7: goto L_0x0016;
            case 8: goto L_0x0016;
            default: goto L_0x000c;
        };
    L_0x000c:
        return r1;
    L_0x000d:
        r0 = r2.f20964Q;
        if (r0 == 0) goto L_0x0016;
    L_0x0011:
        r2.f20964Q = r1;
        r2.mo3509c();
    L_0x0016:
        r0 = r2.m;
        r0 = r0.m3336d();
        return r0;
    L_0x001d:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.b.d.g.getTextOffset():int");
    }

    public final C1375h getTokenLocation() {
        Object a = this.a.m3194a();
        if (this._currToken == C1380m.FIELD_NAME) {
            return new C1375h(a, -1, this.e + (this.f20965R - 1), this.f20966S, this.f20967T);
        }
        return new C1375h(a, -1, this.h - 1, this.i, this.j);
    }

    public final String getValueAsString() {
        if (this._currToken != C1380m.VALUE_STRING) {
            return this._currToken == C1380m.FIELD_NAME ? getCurrentName() : super.getValueAsString(null);
        } else {
            if (this.f20964Q) {
                this.f20964Q = false;
                mo3509c();
            }
            return this.m.m3338f();
        }
    }

    public final String getValueAsString(String str) {
        if (this._currToken != C1380m.VALUE_STRING) {
            return this._currToken == C1380m.FIELD_NAME ? getCurrentName() : super.getValueAsString(str);
        } else {
            if (this.f20964Q) {
                this.f20964Q = false;
                mo3509c();
            }
            return this.m.m3338f();
        }
    }

    protected final char mo3512j() {
        if (this.c >= this.d && !mo3508b()) {
            _reportInvalidEOF(" in character escape sequence");
        }
        char[] cArr = this.f20959L;
        int i = this.c;
        this.c = i + 1;
        char c = cArr[i];
        if (!(c == '\"' || c == '/' || c == '\\')) {
            if (c == 'b') {
                c = '\b';
            } else if (c == 'f') {
                return '\f';
            } else {
                if (c == 'n') {
                    return '\n';
                }
                if (c == 'r') {
                    return '\r';
                }
                switch (c) {
                    case 't':
                        return '\t';
                    case 'u':
                        int i2 = 0;
                        i = 0;
                        while (i2 < 4) {
                            if (this.c >= this.d && !mo3508b()) {
                                _reportInvalidEOF(" in character escape sequence");
                            }
                            char[] cArr2 = this.f20959L;
                            int i3 = this.c;
                            this.c = i3 + 1;
                            char c2 = cArr2[i3];
                            i3 = C1345a.m3178a(c2);
                            if (i3 < 0) {
                                _reportUnexpectedChar(c2, "expected a hex-digit for character escape sequence");
                            }
                            i = (i << 4) | i3;
                            i2++;
                        }
                        return (char) i;
                    default:
                        return _handleUnrecognizedCharacterEscape(c);
                }
            }
        }
        return c;
    }

    public final Boolean nextBooleanValue() {
        C1380m c1380m;
        if (this._currToken == C1380m.FIELD_NAME) {
            this.o = false;
            c1380m = this.l;
            this.l = null;
            this._currToken = c1380m;
            if (c1380m == C1380m.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (c1380m == C1380m.VALUE_FALSE) {
                return Boolean.FALSE;
            }
            C5294d a;
            if (c1380m == C1380m.START_ARRAY) {
                a = this.k.m10981a(this.i, this.j);
            } else if (c1380m != C1380m.START_OBJECT) {
                return null;
            } else {
                a = this.k.m10986b(this.i, this.j);
            }
            this.k = a;
            return null;
        }
        c1380m = nextToken();
        if (c1380m != null) {
            int i = c1380m.f4392q;
            if (i == 9) {
                return Boolean.TRUE;
            }
            if (i == 10) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    public final String nextFieldName() {
        this.z = 0;
        if (this._currToken == C1380m.FIELD_NAME) {
            m19244k();
            return null;
        }
        if (this.f20964Q) {
            m19247n();
        }
        int r = m19251r();
        if (r < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this.q = null;
        if (r == 93) {
            m19259z();
            if (!this.k.m3357b()) {
                m18212a(r, '}');
            }
            this.k = this.k.m10991k();
            this._currToken = C1380m.END_ARRAY;
            return null;
        } else if (r == 125) {
            m19259z();
            if (!this.k.m3359d()) {
                m18212a(r, ']');
            }
            this.k = this.k.m10991k();
            this._currToken = C1380m.END_OBJECT;
            return null;
        } else {
            if (this.k.m10993m()) {
                r = m19243f(r);
            }
            if (this.k.m3359d()) {
                m19227A();
                String m = r == 34 ? m19246m() : m19241d(r);
                this.k.m10985a(m);
                this._currToken = C1380m.FIELD_NAME;
                int p = m19249p();
                m19259z();
                if (p == 34) {
                    this.f20964Q = true;
                    this.l = C1380m.VALUE_STRING;
                    return m;
                }
                C1380m l;
                if (p == 45) {
                    l = m19245l();
                } else if (p == 91) {
                    l = C1380m.START_ARRAY;
                } else if (p == 102) {
                    m19257x();
                    l = C1380m.VALUE_FALSE;
                } else if (p == 110) {
                    m19258y();
                    l = C1380m.VALUE_NULL;
                } else if (p == 116) {
                    m19256w();
                    l = C1380m.VALUE_TRUE;
                } else if (p != 123) {
                    switch (p) {
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                            l = m19237b(p);
                            break;
                        default:
                            l = m19242e(p);
                            break;
                    }
                } else {
                    l = C1380m.START_OBJECT;
                }
                this.l = l;
                return m;
            }
            m19259z();
            m19229a(r);
            return null;
        }
    }

    public final boolean nextFieldName(com.p111d.p112a.p114b.C1382p r15) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:100:0x017c in {3, 6, 10, 15, 17, 21, 23, 26, 30, 45, 47, 51, 52, 53, 54, 57, 58, 59, 61, 67, 70, 71, 76, 77, 89, 91, 92, 93, 94, 95, 96, 97, 98, 99, 103, 106, 107, 110, 112, 122, 123, 124, 125, 126, 127, 128, 129} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r14 = this;
        r0 = 0;
        r14.z = r0;
        r1 = r14._currToken;
        r2 = com.p111d.p112a.p114b.C1380m.FIELD_NAME;
        if (r1 != r2) goto L_0x000d;
    L_0x0009:
        r14.m19244k();
        return r0;
    L_0x000d:
        r1 = r14.f20964Q;
        if (r1 == 0) goto L_0x0014;
    L_0x0011:
        r14.m19247n();
    L_0x0014:
        r1 = r14.m19251r();
        r2 = 0;
        if (r1 >= 0) goto L_0x0021;
    L_0x001b:
        r14.close();
        r14._currToken = r2;
        return r0;
    L_0x0021:
        r14.q = r2;
        r2 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r3 = 93;
        if (r1 != r3) goto L_0x0044;
    L_0x0029:
        r14.m19259z();
        r15 = r14.k;
        r15 = r15.m3357b();
        if (r15 != 0) goto L_0x0037;
    L_0x0034:
        r14.m18212a(r1, r2);
    L_0x0037:
        r15 = r14.k;
        r15 = r15.m10991k();
        r14.k = r15;
        r15 = com.p111d.p112a.p114b.C1380m.END_ARRAY;
        r14._currToken = r15;
        return r0;
    L_0x0044:
        if (r1 != r2) goto L_0x0061;
    L_0x0046:
        r14.m19259z();
        r15 = r14.k;
        r15 = r15.m3359d();
        if (r15 != 0) goto L_0x0054;
    L_0x0051:
        r14.m18212a(r1, r3);
    L_0x0054:
        r15 = r14.k;
        r15 = r15.m10991k();
        r14.k = r15;
        r15 = com.p111d.p112a.p114b.C1380m.END_OBJECT;
        r14._currToken = r15;
        return r0;
    L_0x0061:
        r2 = r14.k;
        r2 = r2.m10993m();
        if (r2 == 0) goto L_0x006d;
    L_0x0069:
        r1 = r14.m19243f(r1);
    L_0x006d:
        r2 = r14.k;
        r2 = r2.m3359d();
        if (r2 != 0) goto L_0x007c;
    L_0x0075:
        r14.m19259z();
        r14.m19229a(r1);
        return r0;
    L_0x007c:
        r14.m19227A();
        r2 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r3 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r4 = 91;
        r5 = 45;
        r6 = 34;
        r7 = 1;
        if (r1 != r6) goto L_0x018b;
    L_0x008c:
        r8 = r15.asQuotedChars();
        r9 = r8.length;
        r10 = r14.c;
        r10 = r10 + r9;
        r10 = r10 + 4;
        r11 = r14.d;
        if (r10 >= r11) goto L_0x018b;
    L_0x009a:
        r10 = r14.c;
        r10 = r10 + r9;
        r9 = r14.f20959L;
        r9 = r9[r10];
        if (r9 != r6) goto L_0x018b;
    L_0x00a3:
        r9 = r14.c;
        r11 = r0;
    L_0x00a6:
        if (r9 != r10) goto L_0x017d;
    L_0x00a8:
        r1 = r14.k;
        r15 = r15.getValue();
        r1.m10985a(r15);
        r9 = r9 + r7;
        r15 = r14.f20959L;
        r1 = r9 + 1;
        r15 = r15[r9];
        r8 = 58;
        r9 = 9;
        r10 = 35;
        r11 = 47;
        r12 = 32;
        if (r15 != r8) goto L_0x00f0;
    L_0x00c4:
        r15 = r14.f20959L;
        r0 = r1 + 1;
        r15 = r15[r1];
        if (r15 <= r12) goto L_0x00d4;
    L_0x00cc:
        if (r15 == r11) goto L_0x00e8;
    L_0x00ce:
        if (r15 == r10) goto L_0x00e8;
    L_0x00d0:
        r14.c = r0;
        goto L_0x012c;
    L_0x00d4:
        if (r15 == r12) goto L_0x00d8;
    L_0x00d6:
        if (r15 != r9) goto L_0x00e8;
    L_0x00d8:
        r15 = r14.f20959L;
        r1 = r0 + 1;
        r15 = r15[r0];
        if (r15 <= r12) goto L_0x00e7;
    L_0x00e0:
        if (r15 == r11) goto L_0x00e7;
    L_0x00e2:
        if (r15 == r10) goto L_0x00e7;
    L_0x00e4:
        r14.c = r1;
        goto L_0x012c;
    L_0x00e7:
        r0 = r1;
    L_0x00e8:
        r0 = r0 - r7;
        r14.c = r0;
        r15 = r14.m19228a(r7);
        goto L_0x012c;
    L_0x00f0:
        if (r15 == r12) goto L_0x00f7;
    L_0x00f2:
        if (r15 != r9) goto L_0x00f5;
    L_0x00f4:
        goto L_0x00f7;
    L_0x00f5:
        r13 = r1;
        goto L_0x00fd;
    L_0x00f7:
        r15 = r14.f20959L;
        r13 = r1 + 1;
        r15 = r15[r1];
    L_0x00fd:
        if (r15 != r8) goto L_0x0100;
    L_0x00ff:
        r0 = r7;
    L_0x0100:
        if (r0 == 0) goto L_0x0125;
    L_0x0102:
        r15 = r14.f20959L;
        r1 = r13 + 1;
        r15 = r15[r13];
        if (r15 <= r12) goto L_0x010f;
    L_0x010a:
        if (r15 == r11) goto L_0x0114;
    L_0x010c:
        if (r15 == r10) goto L_0x0114;
    L_0x010e:
        goto L_0x00e4;
    L_0x010f:
        if (r15 == r12) goto L_0x0116;
    L_0x0111:
        if (r15 != r9) goto L_0x0114;
    L_0x0113:
        goto L_0x0116;
    L_0x0114:
        r13 = r1;
        goto L_0x0125;
    L_0x0116:
        r15 = r14.f20959L;
        r13 = r1 + 1;
        r15 = r15[r1];
        if (r15 <= r12) goto L_0x0125;
    L_0x011e:
        if (r15 == r11) goto L_0x0125;
    L_0x0120:
        if (r15 == r10) goto L_0x0125;
    L_0x0122:
        r14.c = r13;
        goto L_0x012c;
    L_0x0125:
        r13 = r13 - r7;
        r14.c = r13;
        r15 = r14.m19228a(r0);
    L_0x012c:
        r0 = com.p111d.p112a.p114b.C1380m.FIELD_NAME;
        r14._currToken = r0;
        r14.m19259z();
        if (r15 == r6) goto L_0x0177;
    L_0x0135:
        if (r15 == r5) goto L_0x0172;
    L_0x0137:
        if (r15 == r4) goto L_0x016f;
    L_0x0139:
        if (r15 == r3) goto L_0x0167;
    L_0x013b:
        if (r15 == r2) goto L_0x015f;
    L_0x013d:
        r0 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        if (r15 == r0) goto L_0x0157;
    L_0x0141:
        r0 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        if (r15 == r0) goto L_0x0154;
    L_0x0145:
        switch(r15) {
            case 48: goto L_0x014f;
            case 49: goto L_0x014f;
            case 50: goto L_0x014f;
            case 51: goto L_0x014f;
            case 52: goto L_0x014f;
            case 53: goto L_0x014f;
            case 54: goto L_0x014f;
            case 55: goto L_0x014f;
            case 56: goto L_0x014f;
            case 57: goto L_0x014f;
            default: goto L_0x0148;
        };
    L_0x0148:
        r15 = r14.m19242e(r15);
    L_0x014c:
        r14.l = r15;
        return r7;
    L_0x014f:
        r15 = r14.m19237b(r15);
        goto L_0x014c;
    L_0x0154:
        r15 = com.p111d.p112a.p114b.C1380m.START_OBJECT;
        goto L_0x014c;
    L_0x0157:
        r15 = "true";
        r14.m19233a(r15, r7);
        r15 = com.p111d.p112a.p114b.C1380m.VALUE_TRUE;
        goto L_0x014c;
    L_0x015f:
        r15 = "null";
        r14.m19233a(r15, r7);
        r15 = com.p111d.p112a.p114b.C1380m.VALUE_NULL;
        goto L_0x014c;
    L_0x0167:
        r15 = "false";
        r14.m19233a(r15, r7);
        r15 = com.p111d.p112a.p114b.C1380m.VALUE_FALSE;
        goto L_0x014c;
    L_0x016f:
        r15 = com.p111d.p112a.p114b.C1380m.START_ARRAY;
        goto L_0x014c;
    L_0x0172:
        r15 = r14.m19245l();
        goto L_0x014c;
    L_0x0177:
        r14.f20964Q = r7;
        r15 = com.p111d.p112a.p114b.C1380m.VALUE_STRING;
        goto L_0x014c;
        return r7;
    L_0x017d:
        r12 = r8[r11];
        r13 = r14.f20959L;
        r13 = r13[r9];
        if (r12 != r13) goto L_0x018b;
    L_0x0185:
        r11 = r11 + 1;
        r9 = r9 + 1;
        goto L_0x00a6;
    L_0x018b:
        r15 = r15.getValue();
        if (r1 != r6) goto L_0x0196;
    L_0x0191:
        r0 = r14.m19246m();
        goto L_0x019a;
    L_0x0196:
        r0 = r14.m19241d(r1);
    L_0x019a:
        r1 = r14.k;
        r1.m10985a(r0);
        r1 = com.p111d.p112a.p114b.C1380m.FIELD_NAME;
        r14._currToken = r1;
        r1 = r14.m19249p();
        r14.m19259z();
        if (r1 != r6) goto L_0x01b7;
    L_0x01ac:
        r14.f20964Q = r7;
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_STRING;
    L_0x01b0:
        r14.l = r1;
        r15 = r15.equals(r0);
        return r15;
    L_0x01b7:
        if (r1 == r5) goto L_0x01ec;
    L_0x01b9:
        if (r1 == r4) goto L_0x01e9;
    L_0x01bb:
        if (r1 == r3) goto L_0x01e3;
    L_0x01bd:
        if (r1 == r2) goto L_0x01dd;
    L_0x01bf:
        r2 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        if (r1 == r2) goto L_0x01d7;
    L_0x01c3:
        r2 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        if (r1 == r2) goto L_0x01d4;
    L_0x01c7:
        switch(r1) {
            case 48: goto L_0x01cf;
            case 49: goto L_0x01cf;
            case 50: goto L_0x01cf;
            case 51: goto L_0x01cf;
            case 52: goto L_0x01cf;
            case 53: goto L_0x01cf;
            case 54: goto L_0x01cf;
            case 55: goto L_0x01cf;
            case 56: goto L_0x01cf;
            case 57: goto L_0x01cf;
            default: goto L_0x01ca;
        };
    L_0x01ca:
        r1 = r14.m19242e(r1);
        goto L_0x01b0;
    L_0x01cf:
        r1 = r14.m19237b(r1);
        goto L_0x01b0;
    L_0x01d4:
        r1 = com.p111d.p112a.p114b.C1380m.START_OBJECT;
        goto L_0x01b0;
    L_0x01d7:
        r14.m19256w();
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_TRUE;
        goto L_0x01b0;
    L_0x01dd:
        r14.m19258y();
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_NULL;
        goto L_0x01b0;
    L_0x01e3:
        r14.m19257x();
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_FALSE;
        goto L_0x01b0;
    L_0x01e9:
        r1 = com.p111d.p112a.p114b.C1380m.START_ARRAY;
        goto L_0x01b0;
    L_0x01ec:
        r1 = r14.m19245l();
        goto L_0x01b0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.b.d.g.nextFieldName(com.d.a.b.p):boolean");
    }

    public final int nextIntValue(int i) {
        if (this._currToken == C1380m.FIELD_NAME) {
            this.o = false;
            C1380m c1380m = this.l;
            this.l = null;
            this._currToken = c1380m;
            if (c1380m == C1380m.VALUE_NUMBER_INT) {
                return getIntValue();
            }
            C5294d a;
            if (c1380m == C1380m.START_ARRAY) {
                a = this.k.m10981a(this.i, this.j);
            } else if (c1380m != C1380m.START_OBJECT) {
                return i;
            } else {
                a = this.k.m10986b(this.i, this.j);
            }
            this.k = a;
            return i;
        }
        if (nextToken() == C1380m.VALUE_NUMBER_INT) {
            i = getIntValue();
        }
        return i;
    }

    public final long nextLongValue(long j) {
        if (this._currToken == C1380m.FIELD_NAME) {
            this.o = false;
            C1380m c1380m = this.l;
            this.l = null;
            this._currToken = c1380m;
            if (c1380m == C1380m.VALUE_NUMBER_INT) {
                return getLongValue();
            }
            C5294d a;
            if (c1380m == C1380m.START_ARRAY) {
                a = this.k.m10981a(this.i, this.j);
            } else if (c1380m != C1380m.START_OBJECT) {
                return j;
            } else {
                a = this.k.m10986b(this.i, this.j);
            }
            this.k = a;
            return j;
        }
        if (nextToken() == C1380m.VALUE_NUMBER_INT) {
            j = getLongValue();
        }
        return j;
    }

    public final String nextTextValue() {
        if (this._currToken != C1380m.FIELD_NAME) {
            return nextToken() == C1380m.VALUE_STRING ? getText() : null;
        } else {
            this.o = false;
            C1380m c1380m = this.l;
            this.l = null;
            this._currToken = c1380m;
            if (c1380m == C1380m.VALUE_STRING) {
                if (this.f20964Q) {
                    this.f20964Q = false;
                    mo3509c();
                }
                return this.m.m3338f();
            }
            C5294d a;
            if (c1380m == C1380m.START_ARRAY) {
                a = this.k.m10981a(this.i, this.j);
            } else if (c1380m != C1380m.START_OBJECT) {
                return null;
            } else {
                a = this.k.m10986b(this.i, this.j);
            }
            this.k = a;
            return null;
        }
    }

    public final C1380m nextToken() {
        if (this._currToken == C1380m.FIELD_NAME) {
            return m19244k();
        }
        this.z = 0;
        if (this.f20964Q) {
            m19247n();
        }
        int r = m19251r();
        if (r < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this.q = null;
        C1380m c1380m;
        if (r == 93) {
            m19259z();
            if (!this.k.m3357b()) {
                m18212a(r, '}');
            }
            this.k = this.k.m10991k();
            c1380m = C1380m.END_ARRAY;
            this._currToken = c1380m;
            return c1380m;
        } else if (r == 125) {
            m19259z();
            if (!this.k.m3359d()) {
                m18212a(r, ']');
            }
            this.k = this.k.m10991k();
            c1380m = C1380m.END_OBJECT;
            this._currToken = c1380m;
            return c1380m;
        } else {
            if (this.k.m10993m()) {
                r = m19243f(r);
            }
            boolean d = this.k.m3359d();
            if (d) {
                m19227A();
                this.k.m10985a(r == 34 ? m19246m() : m19241d(r));
                this._currToken = C1380m.FIELD_NAME;
                r = m19249p();
            }
            m19259z();
            if (r == 34) {
                this.f20964Q = true;
                c1380m = C1380m.VALUE_STRING;
            } else if (r == 45) {
                c1380m = m19245l();
            } else if (r != 91) {
                if (r != 93) {
                    if (r == 102) {
                        m19257x();
                        c1380m = C1380m.VALUE_FALSE;
                    } else if (r != 110) {
                        if (r != 116) {
                            if (r != 123) {
                                if (r != 125) {
                                    switch (r) {
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                            c1380m = m19237b(r);
                                            break;
                                        default:
                                            c1380m = m19242e(r);
                                            break;
                                    }
                                }
                            }
                            if (!d) {
                                this.k = this.k.m10986b(this.i, this.j);
                            }
                            c1380m = C1380m.START_OBJECT;
                        }
                        m19256w();
                        c1380m = C1380m.VALUE_TRUE;
                    } else {
                        m19258y();
                        c1380m = C1380m.VALUE_NULL;
                    }
                }
                _reportUnexpectedChar(r, "expected a value");
                m19256w();
                c1380m = C1380m.VALUE_TRUE;
            } else {
                if (!d) {
                    this.k = this.k.m10981a(this.i, this.j);
                }
                c1380m = C1380m.START_ARRAY;
            }
            if (d) {
                this.l = c1380m;
                return this._currToken;
            }
            this._currToken = c1380m;
            return c1380m;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int readBinaryValue(com.p111d.p112a.p114b.C1341a r14, java.io.OutputStream r15) {
        /*
        r13 = this;
        r0 = r13.f20964Q;
        if (r0 == 0) goto L_0x0153;
    L_0x0004:
        r0 = r13._currToken;
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_STRING;
        if (r0 == r1) goto L_0x000c;
    L_0x000a:
        goto L_0x0153;
    L_0x000c:
        r0 = r13.a;
        r0 = r0.m3209g();
        r1 = r0.length;	 Catch:{ all -> 0x014c }
        r2 = 3;
        r1 = r1 - r2;
        r3 = 0;
        r4 = r3;
        r5 = r4;
    L_0x0018:
        r6 = r13.c;	 Catch:{ all -> 0x014c }
        r7 = r13.d;	 Catch:{ all -> 0x014c }
        if (r6 < r7) goto L_0x0021;
    L_0x001e:
        r13.m18211a();	 Catch:{ all -> 0x014c }
    L_0x0021:
        r6 = r13.f20959L;	 Catch:{ all -> 0x014c }
        r7 = r13.c;	 Catch:{ all -> 0x014c }
        r8 = r7 + 1;
        r13.c = r8;	 Catch:{ all -> 0x014c }
        r6 = r6[r7];	 Catch:{ all -> 0x014c }
        r7 = 32;
        if (r6 <= r7) goto L_0x0018;
    L_0x002f:
        r7 = r14.m3172b(r6);	 Catch:{ all -> 0x014c }
        r8 = 34;
        if (r7 >= 0) goto L_0x003f;
    L_0x0037:
        if (r6 == r8) goto L_0x0110;
    L_0x0039:
        r7 = r13.m18206a(r14, r6, r3);	 Catch:{ all -> 0x014c }
        if (r7 < 0) goto L_0x0018;
    L_0x003f:
        if (r4 <= r1) goto L_0x0046;
    L_0x0041:
        r5 = r5 + r4;
        r15.write(r0, r3, r4);	 Catch:{ all -> 0x014c }
        r4 = r3;
    L_0x0046:
        r6 = r13.c;	 Catch:{ all -> 0x014c }
        r9 = r13.d;	 Catch:{ all -> 0x014c }
        if (r6 < r9) goto L_0x004f;
    L_0x004c:
        r13.m18211a();	 Catch:{ all -> 0x014c }
    L_0x004f:
        r6 = r13.f20959L;	 Catch:{ all -> 0x014c }
        r9 = r13.c;	 Catch:{ all -> 0x014c }
        r10 = r9 + 1;
        r13.c = r10;	 Catch:{ all -> 0x014c }
        r6 = r6[r9];	 Catch:{ all -> 0x014c }
        r9 = r14.m3172b(r6);	 Catch:{ all -> 0x014c }
        if (r9 >= 0) goto L_0x0064;
    L_0x005f:
        r9 = 1;
        r9 = r13.m18206a(r14, r6, r9);	 Catch:{ all -> 0x014c }
    L_0x0064:
        r6 = r7 << 6;
        r6 = r6 | r9;
        r7 = r13.c;	 Catch:{ all -> 0x014c }
        r9 = r13.d;	 Catch:{ all -> 0x014c }
        if (r7 < r9) goto L_0x0070;
    L_0x006d:
        r13.m18211a();	 Catch:{ all -> 0x014c }
    L_0x0070:
        r7 = r13.f20959L;	 Catch:{ all -> 0x014c }
        r9 = r13.c;	 Catch:{ all -> 0x014c }
        r10 = r9 + 1;
        r13.c = r10;	 Catch:{ all -> 0x014c }
        r7 = r7[r9];	 Catch:{ all -> 0x014c }
        r9 = r14.m3172b(r7);	 Catch:{ all -> 0x014c }
        r10 = 2;
        r11 = -2;
        if (r9 >= 0) goto L_0x00dc;
    L_0x0082:
        if (r9 == r11) goto L_0x009b;
    L_0x0084:
        if (r7 != r8) goto L_0x0096;
    L_0x0086:
        r9 = r14.m3167a();	 Catch:{ all -> 0x014c }
        if (r9 != 0) goto L_0x0096;
    L_0x008c:
        r14 = r6 >> 4;
        r1 = r4 + 1;
        r14 = (byte) r14;	 Catch:{ all -> 0x014c }
        r0[r4] = r14;	 Catch:{ all -> 0x014c }
        r4 = r1;
        goto L_0x0110;
    L_0x0096:
        r7 = r13.m18206a(r14, r7, r10);	 Catch:{ all -> 0x014c }
        r9 = r7;
    L_0x009b:
        if (r9 != r11) goto L_0x00dc;
    L_0x009d:
        r7 = r13.c;	 Catch:{ all -> 0x014c }
        r8 = r13.d;	 Catch:{ all -> 0x014c }
        if (r7 < r8) goto L_0x00a6;
    L_0x00a3:
        r13.m18211a();	 Catch:{ all -> 0x014c }
    L_0x00a6:
        r7 = r13.f20959L;	 Catch:{ all -> 0x014c }
        r8 = r13.c;	 Catch:{ all -> 0x014c }
        r9 = r8 + 1;
        r13.c = r9;	 Catch:{ all -> 0x014c }
        r7 = r7[r8];	 Catch:{ all -> 0x014c }
        r8 = r14.m3168a(r7);	 Catch:{ all -> 0x014c }
        if (r8 != 0) goto L_0x00d2;
    L_0x00b6:
        r15 = new java.lang.StringBuilder;	 Catch:{ all -> 0x014c }
        r1 = "expected padding character '";
        r15.<init>(r1);	 Catch:{ all -> 0x014c }
        r1 = r14.m3171b();	 Catch:{ all -> 0x014c }
        r15.append(r1);	 Catch:{ all -> 0x014c }
        r1 = "'";
        r15.append(r1);	 Catch:{ all -> 0x014c }
        r15 = r15.toString();	 Catch:{ all -> 0x014c }
        r14 = com.p111d.p112a.p114b.p539a.C7041b.m18201a(r14, r7, r2, r15);	 Catch:{ all -> 0x014c }
        throw r14;	 Catch:{ all -> 0x014c }
    L_0x00d2:
        r6 = r6 >> 4;
        r7 = r4 + 1;
        r6 = (byte) r6;	 Catch:{ all -> 0x014c }
        r0[r4] = r6;	 Catch:{ all -> 0x014c }
    L_0x00d9:
        r4 = r7;
        goto L_0x0018;
    L_0x00dc:
        r6 = r6 << 6;
        r6 = r6 | r9;
        r7 = r13.c;	 Catch:{ all -> 0x014c }
        r9 = r13.d;	 Catch:{ all -> 0x014c }
        if (r7 < r9) goto L_0x00e8;
    L_0x00e5:
        r13.m18211a();	 Catch:{ all -> 0x014c }
    L_0x00e8:
        r7 = r13.f20959L;	 Catch:{ all -> 0x014c }
        r9 = r13.c;	 Catch:{ all -> 0x014c }
        r12 = r9 + 1;
        r13.c = r12;	 Catch:{ all -> 0x014c }
        r7 = r7[r9];	 Catch:{ all -> 0x014c }
        r9 = r14.m3172b(r7);	 Catch:{ all -> 0x014c }
        if (r9 >= 0) goto L_0x0135;
    L_0x00f8:
        if (r9 == r11) goto L_0x0123;
    L_0x00fa:
        if (r7 != r8) goto L_0x011e;
    L_0x00fc:
        r8 = r14.m3167a();	 Catch:{ all -> 0x014c }
        if (r8 != 0) goto L_0x011e;
    L_0x0102:
        r14 = r6 >> 2;
        r1 = r4 + 1;
        r2 = r14 >> 8;
        r2 = (byte) r2;	 Catch:{ all -> 0x014c }
        r0[r4] = r2;	 Catch:{ all -> 0x014c }
        r4 = r1 + 1;
        r14 = (byte) r14;	 Catch:{ all -> 0x014c }
        r0[r1] = r14;	 Catch:{ all -> 0x014c }
    L_0x0110:
        r13.f20964Q = r3;	 Catch:{ all -> 0x014c }
        if (r4 <= 0) goto L_0x0118;
    L_0x0114:
        r5 = r5 + r4;
        r15.write(r0, r3, r4);	 Catch:{ all -> 0x014c }
    L_0x0118:
        r14 = r13.a;
        r14.m3203c(r0);
        return r5;
    L_0x011e:
        r7 = r13.m18206a(r14, r7, r2);	 Catch:{ all -> 0x014c }
        r9 = r7;
    L_0x0123:
        if (r9 != r11) goto L_0x0135;
    L_0x0125:
        r6 = r6 >> 2;
        r7 = r4 + 1;
        r8 = r6 >> 8;
        r8 = (byte) r8;	 Catch:{ all -> 0x014c }
        r0[r4] = r8;	 Catch:{ all -> 0x014c }
        r4 = r7 + 1;
        r6 = (byte) r6;	 Catch:{ all -> 0x014c }
        r0[r7] = r6;	 Catch:{ all -> 0x014c }
        goto L_0x0018;
    L_0x0135:
        r6 = r6 << 6;
        r6 = r6 | r9;
        r7 = r4 + 1;
        r8 = r6 >> 16;
        r8 = (byte) r8;	 Catch:{ all -> 0x014c }
        r0[r4] = r8;	 Catch:{ all -> 0x014c }
        r4 = r7 + 1;
        r8 = r6 >> 8;
        r8 = (byte) r8;	 Catch:{ all -> 0x014c }
        r0[r7] = r8;	 Catch:{ all -> 0x014c }
        r7 = r4 + 1;
        r6 = (byte) r6;	 Catch:{ all -> 0x014c }
        r0[r4] = r6;	 Catch:{ all -> 0x014c }
        goto L_0x00d9;
    L_0x014c:
        r14 = move-exception;
        r15 = r13.a;
        r15.m3203c(r0);
        throw r14;
    L_0x0153:
        r14 = r13.getBinaryValue(r14);
        r15.write(r14);
        r14 = r14.length;
        return r14;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.b.d.g.readBinaryValue(com.d.a.b.a, java.io.OutputStream):int");
    }

    public final int releaseBuffered(Writer writer) {
        int i = this.d - this.c;
        if (i <= 0) {
            return 0;
        }
        writer.write(this.f20959L, this.c, i);
        return i;
    }

    public final void setCodec(C5304n c5304n) {
        this.f20961N = c5304n;
    }
}
