package com.p111d.p112a.p114b.p117d;

import com.p111d.p112a.p114b.C1341a;
import com.p111d.p112a.p114b.C1375h;
import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j.C1376a;
import com.p111d.p112a.p114b.C5304n;
import com.p111d.p112a.p114b.p116c.C1345a;
import com.p111d.p112a.p114b.p116c.C1347c;
import com.p111d.p112a.p114b.p118e.C1362a;
import com.p111d.p112a.p114b.p120g.C1369b;
import com.p111d.p112a.p114b.p120g.C1373i;
import com.p111d.p112a.p114b.p539a.C6464a;
import com.p111d.p112a.p114b.p539a.C7041b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public final class C7262i extends C7041b {
    protected static final int[] f20981J = C1345a.m3180a();
    private static final int[] f20982U = C1345a.m3181b();
    protected C5304n f20983K;
    protected final C1362a f20984L;
    protected int[] f20985M = new int[16];
    protected boolean f20986N;
    protected int f20987O;
    protected int f20988P;
    protected int f20989Q;
    protected InputStream f20990R;
    protected byte[] f20991S;
    protected boolean f20992T;
    private int f20993V;

    public C7262i(C1347c c1347c, int i, InputStream inputStream, C5304n c5304n, C1362a c1362a, byte[] bArr, int i2, int i3, boolean z) {
        super(c1347c, i);
        this.f20990R = inputStream;
        this.f20983K = c5304n;
        this.f20984L = c1362a;
        this.f20991S = bArr;
        this.c = i2;
        this.d = i3;
        this.g = i2;
        this.e = (long) (-i2);
        this.f20992T = z;
    }

    private void m19283A() {
        if ((this.c < this.d || mo3508b()) && this.f20991S[this.c] == (byte) 10) {
            this.c++;
        }
        this.f++;
        this.g = this.c;
    }

    private int m19284B() {
        if (this.c >= this.d) {
            m18211a();
        }
        byte[] bArr = this.f20991S;
        int i = this.c;
        this.c = i + 1;
        return bArr[i] & 255;
    }

    private final void m19285C() {
        this.i = this.f;
        int i = this.c;
        this.h = this.e + ((long) i);
        this.j = i - this.g;
    }

    private final void m19286D() {
        this.f20988P = this.f;
        int i = this.c;
        this.f20987O = i;
        this.f20989Q = i - this.g;
    }

    private final int m19287a(boolean z) {
        while (true) {
            if (this.c >= this.d) {
                if (!mo3508b()) {
                    StringBuilder stringBuilder = new StringBuilder("Unexpected end-of-input within/between ");
                    stringBuilder.append(this.k.m3360e());
                    stringBuilder.append(" entries");
                    throw _constructError(stringBuilder.toString());
                }
            }
            byte[] bArr = this.f20991S;
            int i = this.c;
            this.c = i + 1;
            int i2 = bArr[i] & 255;
            if (i2 > 32) {
                if (i2 == 47) {
                    m19332u();
                } else if (i2 != 35 || !m19333v()) {
                    if (z) {
                        return i2;
                    }
                    if (i2 != 58) {
                        if (i2 < 32) {
                            _throwInvalidSpace(i2);
                        }
                        _reportUnexpectedChar(i2, "was expecting a colon to separate field name and value");
                    }
                    z = true;
                }
            } else if (i2 != 32) {
                if (i2 == 10) {
                    this.f++;
                    this.g = this.c;
                } else if (i2 == 13) {
                    m19283A();
                } else if (i2 != 9) {
                    _throwInvalidSpace(i2);
                }
            }
        }
    }

    private final C1380m m19288a(int i) {
        C1380m c1380m;
        if (i == 34) {
            this.f20986N = true;
            c1380m = C1380m.VALUE_STRING;
        } else if (i == 45) {
            c1380m = m19321l();
        } else if (i == 91) {
            this.k = this.k.m10981a(this.i, this.j);
            c1380m = C1380m.START_ARRAY;
        } else if (i == 102) {
            m19299a("false", 1);
            c1380m = C1380m.VALUE_FALSE;
        } else if (i == 110) {
            m19299a("null", 1);
            c1380m = C1380m.VALUE_NULL;
        } else if (i == 116) {
            m19299a("true", 1);
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
                    c1380m = m19305b(i);
                    break;
                default:
                    c1380m = m19313e(i);
                    break;
            }
        } else {
            this.k = this.k.m10986b(this.i, this.j);
            c1380m = C1380m.START_OBJECT;
        }
        this._currToken = c1380m;
        return c1380m;
    }

    private C1380m m19289a(int i, boolean z) {
        while (i == 73) {
            String str;
            if (this.c >= this.d && !mo3508b()) {
                _reportInvalidEOFInValue();
            }
            byte[] bArr = this.f20991S;
            int i2 = this.c;
            this.c = i2 + 1;
            i = bArr[i2];
            if (i != 78) {
                if (i != 110) {
                    break;
                }
                str = z ? "-Infinity" : "+Infinity";
            } else {
                str = z ? "-INF" : "+INF";
            }
            m19299a(str, 3);
            if (isEnabled(C1376a.ALLOW_NON_NUMERIC_NUMBERS)) {
                return m18208a(str, z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            StringBuilder stringBuilder = new StringBuilder("Non-standard token '");
            stringBuilder.append(str);
            stringBuilder.append("': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            _reportError(stringBuilder.toString());
        }
        m18213a(i, "expected digit (0-9) to follow minus sign, for valid numeric value");
        return null;
    }

    private final C1380m m19290a(char[] cArr, int i, int i2, boolean z, int i3) {
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if (i2 == 46) {
            int i8;
            i4 = i + 1;
            cArr[i] = (char) i2;
            i = i4;
            i4 = i2;
            char[] cArr2 = cArr;
            i5 = 0;
            while (true) {
                if (this.c >= this.d && !mo3508b()) {
                    break;
                }
                byte[] bArr = this.f20991S;
                i6 = this.c;
                this.c = i6 + 1;
                i4 = bArr[i6] & 255;
                if (i4 < 48 || i4 > 57) {
                    i6 = 0;
                } else {
                    i5++;
                    if (i >= cArr2.length) {
                        cArr2 = this.m.m3342j();
                        i = 0;
                    }
                    i6 = i + 1;
                    cArr2[i] = (char) i4;
                    i = i6;
                }
                if (i5 == 0) {
                    m18213a(i4, "Decimal point not followed by a digit");
                }
                i8 = i4;
                i4 = i5;
                cArr = cArr2;
                i2 = i8;
            }
            i6 = 1;
            if (i5 == 0) {
                m18213a(i4, "Decimal point not followed by a digit");
            }
            i8 = i4;
            i4 = i5;
            cArr = cArr2;
            i2 = i8;
        } else {
            i4 = 0;
            i6 = i4;
        }
        if (i2 == 101 || i2 == 69) {
            char[] cArr3;
            int i9;
            byte[] bArr2;
            if (i >= cArr.length) {
                cArr = this.m.m3342j();
                i = 0;
            }
            int i10 = i + 1;
            cArr[i] = (char) i2;
            if (this.c >= this.d) {
                m18211a();
            }
            byte[] bArr3 = this.f20991S;
            i2 = this.c;
            this.c = i2 + 1;
            i = bArr3[i2] & 255;
            if (i != 45) {
                if (i == 43) {
                }
                i2 = i;
                cArr3 = cArr;
                i5 = 0;
                while (i2 <= 57 && i2 >= 48) {
                    i5++;
                    if (i10 >= cArr3.length) {
                        cArr3 = this.m.m3342j();
                        i10 = 0;
                    }
                    i9 = i10 + 1;
                    cArr3[i10] = (char) i2;
                    if (this.c < this.d && !mo3508b()) {
                        i7 = i5;
                        i6 = 1;
                        i = i9;
                        break;
                    }
                    bArr2 = this.f20991S;
                    i10 = this.c;
                    this.c = i10 + 1;
                    i2 = bArr2[i10] & 255;
                    i10 = i9;
                }
                i7 = i5;
                i = i10;
                if (i7 == 0) {
                    m18213a(i2, "Exponent indicator not followed by a digit");
                }
            }
            if (i10 >= cArr.length) {
                cArr = this.m.m3342j();
                i10 = 0;
            }
            i2 = i10 + 1;
            cArr[i10] = (char) i;
            if (this.c >= this.d) {
                m18211a();
            }
            bArr3 = this.f20991S;
            i10 = this.c;
            this.c = i10 + 1;
            i = bArr3[i10] & 255;
            i10 = i2;
            i2 = i;
            cArr3 = cArr;
            i5 = 0;
            while (i2 <= 57) {
                i5++;
                if (i10 >= cArr3.length) {
                    cArr3 = this.m.m3342j();
                    i10 = 0;
                }
                i9 = i10 + 1;
                cArr3[i10] = (char) i2;
                if (this.c < this.d) {
                }
                bArr2 = this.f20991S;
                i10 = this.c;
                this.c = i10 + 1;
                i2 = bArr2[i10] & 255;
                i10 = i9;
            }
            i7 = i5;
            i = i10;
            if (i7 == 0) {
                m18213a(i2, "Exponent indicator not followed by a digit");
            }
        }
        if (i6 == 0) {
            this.c--;
            if (this.k.m3358c()) {
                m19311c(i2);
            }
        }
        this.m.f4340i = i;
        return m18215b(z, i3, i4, i7);
    }

    private final C1380m m19291a(char[] cArr, int i, boolean z, int i2) {
        int i3;
        char[] cArr2 = cArr;
        int i4 = i;
        int i5 = i2;
        while (true) {
            if (this.c < this.d || mo3508b()) {
                byte[] bArr = this.f20991S;
                i = this.c;
                this.c = i + 1;
                i3 = bArr[i] & 255;
                if (i3 > 57) {
                    break;
                } else if (i3 < 48) {
                    break;
                } else {
                    if (i4 >= cArr2.length) {
                        i4 = 0;
                        cArr2 = this.m.m3342j();
                    }
                    int i6 = i4 + 1;
                    cArr2[i4] = (char) i3;
                    i5++;
                    i4 = i6;
                }
            } else {
                this.m.f4340i = i4;
                return m18209a(z, i5);
            }
        }
        if (!(i3 == 46 || i3 == 101)) {
            if (i3 != 69) {
                this.c--;
                this.m.f4340i = i4;
                if (this.k.m3358c()) {
                    bArr = this.f20991S;
                    i = this.c;
                    this.c = i + 1;
                    m19311c(bArr[i] & 255);
                }
                return m18209a(z, i5);
            }
        }
        return m19290a(cArr2, i4, i3, z, i5);
    }

    private final String m19292a(int i, int i2) {
        i = C7262i.m19310c(i, i2);
        String b = this.f20984L.m3293b(i);
        if (b != null) {
            return b;
        }
        this.f20985M[0] = i;
        return m19296a(this.f20985M, 1, i2);
    }

    private final String m19293a(int i, int i2, int i3) {
        return m19298a(this.f20985M, 0, i, i2, i3);
    }

    private final String m19294a(int i, int i2, int i3, int i4) {
        this.f20985M[0] = i;
        return m19298a(this.f20985M, 1, i2, i3, i4);
    }

    private final String m19295a(int i, int i2, int i3, int i4, int i5) {
        this.f20985M[0] = i;
        this.f20985M[1] = i2;
        return m19298a(this.f20985M, 2, i3, i4, i5);
    }

    private final String m19296a(int[] iArr, int i, int i2) {
        int i3;
        int i4;
        C7262i c7262i = this;
        int[] iArr2 = iArr;
        int i5 = i;
        int i6 = i2;
        int i7 = ((i5 << 2) - 4) + i6;
        if (i6 < 4) {
            i3 = i5 - 1;
            i4 = iArr2[i3];
            iArr2[i3] = i4 << ((4 - i6) << 3);
        } else {
            i4 = 0;
        }
        char[] i8 = c7262i.m.m3341i();
        i3 = 0;
        int i9 = 0;
        while (i3 < i7) {
            int i10;
            int i11 = (iArr2[i3 >> 2] >> ((3 - (i3 & 3)) << 3)) & 255;
            i3++;
            if (i11 > 127) {
                int i12;
                if ((i11 & 224) == 192) {
                    i12 = i11 & 31;
                    i11 = 1;
                } else if ((i11 & 240) == 224) {
                    i12 = i11 & 15;
                    i11 = 2;
                } else if ((i11 & 248) == 240) {
                    i12 = i11 & 7;
                    i11 = 3;
                } else {
                    m19322l(i11);
                    i11 = 1;
                    i12 = i11;
                }
                if (i3 + i11 > i7) {
                    _reportInvalidEOF(" in field name");
                }
                int i13 = iArr2[i3 >> 2] >> ((3 - (i3 & 3)) << 3);
                i3++;
                if ((i13 & 192) != 128) {
                    m19324m(i13);
                }
                int i14 = (i12 << 6) | (i13 & 63);
                if (i11 > 1) {
                    i10 = iArr2[i3 >> 2] >> ((3 - (i3 & 3)) << 3);
                    i3++;
                    if ((i10 & 192) != 128) {
                        m19324m(i10);
                    }
                    i10 = (i10 & 63) | (i14 << 6);
                    i14 = 2;
                    if (i11 > 2) {
                        i14 = iArr2[i3 >> 2] >> ((3 - (i3 & 3)) << 3);
                        i3++;
                        if ((i14 & 192) != 128) {
                            m19324m(i14 & 255);
                        }
                        i10 = (i10 << 6) | (i14 & 63);
                    }
                    if (i11 <= i14) {
                        i10 -= 65536;
                        if (i9 >= i8.length) {
                            i8 = c7262i.m.m3343k();
                        }
                        i14 = i9 + 1;
                        i8[i9] = (char) (C6464a.SURR1_FIRST + (i10 >> 10));
                        i11 = C6464a.SURR2_FIRST | (i10 & 1023);
                        i9 = i14;
                    } else {
                        i11 = i10;
                    }
                } else {
                    i10 = i14;
                }
                i14 = 2;
                if (i11 <= i14) {
                    i11 = i10;
                } else {
                    i10 -= 65536;
                    if (i9 >= i8.length) {
                        i8 = c7262i.m.m3343k();
                    }
                    i14 = i9 + 1;
                    i8[i9] = (char) (C6464a.SURR1_FIRST + (i10 >> 10));
                    i11 = C6464a.SURR2_FIRST | (i10 & 1023);
                    i9 = i14;
                }
            }
            if (i9 >= i8.length) {
                i8 = c7262i.m.m3343k();
            }
            i10 = i9 + 1;
            i8[i9] = (char) i11;
            i9 = i10;
        }
        String str = new String(i8, 0, i9);
        if (i6 < 4) {
            iArr2[i5 - 1] = i4;
        }
        return c7262i.f20984L.m3291a(str, iArr2, i5);
    }

    private final String m19297a(int[] iArr, int i, int i2, int i3) {
        if (i >= iArr.length) {
            iArr = C7262i.m19304a(iArr, iArr.length);
            this.f20985M = iArr;
        }
        int i4 = i + 1;
        iArr[i] = C7262i.m19310c(i2, i3);
        String a = this.f20984L.m3292a(iArr, i4);
        return a == null ? m19296a(iArr, i4, i3) : a;
    }

    private String m19298a(int[] iArr, int i, int i2, int i3, int i4) {
        int[] iArr2 = f20981J;
        while (true) {
            if (iArr2[i3] != 0) {
                if (i3 == 34) {
                    break;
                }
                if (i3 != 92) {
                    _throwUnquotedSpace(i3, "name");
                } else {
                    i3 = mo3512j();
                }
                if (i3 > 127) {
                    if (i4 >= 4) {
                        if (i >= iArr.length) {
                            iArr = C7262i.m19304a(iArr, iArr.length);
                            this.f20985M = iArr;
                        }
                        i4 = i + 1;
                        iArr[i] = i2;
                        i = i4;
                        i2 = 0;
                        i4 = i2;
                    }
                    if (i3 < 2048) {
                        i2 = (i2 << 8) | (192 | (i3 >> 6));
                        i4++;
                    } else {
                        i2 = (i2 << 8) | (224 | (i3 >> 12));
                        i4++;
                        if (i4 >= 4) {
                            if (i >= iArr.length) {
                                iArr = C7262i.m19304a(iArr, iArr.length);
                                this.f20985M = iArr;
                            }
                            i4 = i + 1;
                            iArr[i] = i2;
                            i = i4;
                            i2 = 0;
                            i4 = i2;
                        }
                        i2 = (i2 << 8) | (((i3 >> 6) & 63) | 128);
                        i4++;
                    }
                    i3 = (i3 & 63) | 128;
                }
            }
            if (i4 < 4) {
                i4++;
                i2 = (i2 << 8) | i3;
            } else {
                if (i >= iArr.length) {
                    iArr = C7262i.m19304a(iArr, iArr.length);
                    this.f20985M = iArr;
                }
                i4 = i + 1;
                iArr[i] = i2;
                i2 = i3;
                i = i4;
                i4 = 1;
            }
            if (this.c >= this.d && !mo3508b()) {
                _reportInvalidEOF(" in field name");
            }
            byte[] bArr = this.f20991S;
            int i5 = this.c;
            this.c = i5 + 1;
            i3 = bArr[i5] & 255;
        }
        if (i4 > 0) {
            if (i >= iArr.length) {
                iArr = C7262i.m19304a(iArr, iArr.length);
                this.f20985M = iArr;
            }
            i3 = i + 1;
            iArr[i] = C7262i.m19310c(i2, i4);
            i = i3;
        }
        String a = this.f20984L.m3292a(iArr, i);
        return a == null ? m19296a(iArr, i, i4) : a;
    }

    private void m19299a(String str, int i) {
        int length = str.length();
        if (this.c + length >= this.d) {
            int length2 = str.length();
            do {
                if ((this.c >= this.d && !mo3508b()) || this.f20991S[this.c] != str.charAt(i)) {
                    m19309b(str.substring(0, i));
                }
                this.c++;
                i++;
            } while (i < length2);
            if (this.c < this.d || mo3508b()) {
                length = this.f20991S[this.c] & 255;
                if (!(length < 48 || length == 93 || length == 125)) {
                    m19300a(str, i, length);
                }
            }
            return;
        }
        do {
            if (this.f20991S[this.c] != str.charAt(i)) {
                m19309b(str.substring(0, i));
            }
            this.c++;
            i++;
        } while (i < length);
        length = this.f20991S[this.c] & 255;
        if (!(length < 48 || length == 93 || length == 125)) {
            m19300a(str, i, length);
        }
    }

    private final void m19300a(String str, int i, int i2) {
        if (Character.isJavaIdentifierPart((char) m19314f(i2))) {
            m19309b(str.substring(0, i));
        }
    }

    private void m19301a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder(str);
        while (true) {
            if (this.c >= this.d && !mo3508b()) {
                break;
            }
            byte[] bArr = this.f20991S;
            int i = this.c;
            this.c = i + 1;
            char f = (char) m19314f(bArr[i]);
            if (!Character.isJavaIdentifierPart(f)) {
                break;
            }
            stringBuilder.append(f);
        }
        StringBuilder stringBuilder2 = new StringBuilder("Unrecognized token '");
        stringBuilder2.append(stringBuilder.toString());
        stringBuilder2.append("': was expecting ");
        stringBuilder2.append(str2);
        _reportError(stringBuilder2.toString());
    }

    private final void m19302a(char[] cArr, int i) {
        int[] iArr = f20982U;
        byte[] bArr = this.f20991S;
        while (true) {
            int i2 = this.c;
            if (i2 >= this.d) {
                m18211a();
                i2 = this.c;
            }
            if (i >= cArr.length) {
                cArr = this.m.m3342j();
                i = 0;
            }
            int min = Math.min(this.d, (cArr.length - i) + i2);
            while (i2 < min) {
                int i3 = i2 + 1;
                i2 = bArr[i2] & 255;
                if (iArr[i2] != 0) {
                    this.c = i3;
                    if (i2 != 34) {
                        switch (iArr[i2]) {
                            case 1:
                                i2 = mo3512j();
                                break;
                            case 2:
                                i2 = m19315g(i2);
                                break;
                            case 3:
                                if (this.d - this.c < 2) {
                                    i2 = m19316h(i2);
                                    break;
                                } else {
                                    i2 = m19317i(i2);
                                    break;
                                }
                            case 4:
                                i2 = m19318j(i2);
                                min = i + 1;
                                cArr[i] = (char) (C6464a.SURR1_FIRST | (i2 >> 10));
                                if (min >= cArr.length) {
                                    cArr = this.m.m3342j();
                                    min = 0;
                                }
                                i2 = (i2 & 1023) | C6464a.SURR2_FIRST;
                                i = min;
                                break;
                            default:
                                if (i2 >= 32) {
                                    m19320k(i2);
                                    break;
                                } else {
                                    _throwUnquotedSpace(i2, "string value");
                                    break;
                                }
                        }
                        if (i >= cArr.length) {
                            cArr = this.m.m3342j();
                            i = 0;
                        }
                        int i4 = i + 1;
                        cArr[i] = (char) i2;
                        i = i4;
                    } else {
                        this.m.f4340i = i;
                        return;
                    }
                }
                int i5 = i + 1;
                cArr[i] = (char) i2;
                i2 = i3;
                i = i5;
            }
            this.c = i2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] m19303a(com.p111d.p112a.p114b.C1341a r10) {
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
        r1 = r9.f20991S;
        r2 = r9.c;
        r3 = r2 + 1;
        r9.c = r3;
        r1 = r1[r2];
        r1 = r1 & 255;
        r2 = 32;
        if (r1 <= r2) goto L_0x0004;
    L_0x001d:
        r2 = r10.m3173b(r1);
        r3 = 34;
        if (r2 >= 0) goto L_0x0033;
    L_0x0025:
        if (r1 != r3) goto L_0x002c;
    L_0x0027:
        r10 = r0.m3321b();
        return r10;
    L_0x002c:
        r2 = 0;
        r2 = r9.m18207a(r10, r1, r2);
        if (r2 < 0) goto L_0x0004;
    L_0x0033:
        r1 = r9.c;
        r4 = r9.d;
        if (r1 < r4) goto L_0x003c;
    L_0x0039:
        r9.m18211a();
    L_0x003c:
        r1 = r9.f20991S;
        r4 = r9.c;
        r5 = r4 + 1;
        r9.c = r5;
        r1 = r1[r4];
        r1 = r1 & 255;
        r4 = r10.m3173b(r1);
        if (r4 >= 0) goto L_0x0053;
    L_0x004e:
        r4 = 1;
        r4 = r9.m18207a(r10, r1, r4);
    L_0x0053:
        r1 = r2 << 6;
        r1 = r1 | r4;
        r2 = r9.c;
        r4 = r9.d;
        if (r2 < r4) goto L_0x005f;
    L_0x005c:
        r9.m18211a();
    L_0x005f:
        r2 = r9.f20991S;
        r4 = r9.c;
        r5 = r4 + 1;
        r9.c = r5;
        r2 = r2[r4];
        r2 = r2 & 255;
        r4 = r10.m3173b(r2);
        r5 = 3;
        r6 = 2;
        r7 = -2;
        if (r4 >= 0) goto L_0x00cd;
    L_0x0074:
        if (r4 == r7) goto L_0x008d;
    L_0x0076:
        if (r2 != r3) goto L_0x0088;
    L_0x0078:
        r4 = r10.m3167a();
        if (r4 != 0) goto L_0x0088;
    L_0x007e:
        r10 = r1 >> 4;
        r0.m3319a(r10);
    L_0x0083:
        r10 = r0.m3321b();
        return r10;
    L_0x0088:
        r2 = r9.m18207a(r10, r2, r6);
        r4 = r2;
    L_0x008d:
        if (r4 != r7) goto L_0x00cd;
    L_0x008f:
        r2 = r9.c;
        r3 = r9.d;
        if (r2 < r3) goto L_0x0098;
    L_0x0095:
        r9.m18211a();
    L_0x0098:
        r2 = r9.f20991S;
        r3 = r9.c;
        r4 = r3 + 1;
        r9.c = r4;
        r2 = r2[r3];
        r2 = r2 & 255;
        r3 = r10.m3169a(r2);
        if (r3 != 0) goto L_0x00c6;
    L_0x00aa:
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
    L_0x00c6:
        r1 = r1 >> 4;
        r0.m3319a(r1);
        goto L_0x0004;
    L_0x00cd:
        r1 = r1 << 6;
        r1 = r1 | r4;
        r2 = r9.c;
        r4 = r9.d;
        if (r2 < r4) goto L_0x00d9;
    L_0x00d6:
        r9.m18211a();
    L_0x00d9:
        r2 = r9.f20991S;
        r4 = r9.c;
        r8 = r4 + 1;
        r9.c = r8;
        r2 = r2[r4];
        r2 = r2 & 255;
        r4 = r10.m3173b(r2);
        if (r4 >= 0) goto L_0x0109;
    L_0x00eb:
        if (r4 == r7) goto L_0x0100;
    L_0x00ed:
        if (r2 != r3) goto L_0x00fb;
    L_0x00ef:
        r3 = r10.m3167a();
        if (r3 != 0) goto L_0x00fb;
    L_0x00f5:
        r10 = r1 >> 2;
        r0.m3320b(r10);
        goto L_0x0083;
    L_0x00fb:
        r2 = r9.m18207a(r10, r2, r5);
        r4 = r2;
    L_0x0100:
        if (r4 != r7) goto L_0x0109;
    L_0x0102:
        r1 = r1 >> 2;
        r0.m3320b(r1);
        goto L_0x0004;
    L_0x0109:
        r1 = r1 << 6;
        r1 = r1 | r4;
        r0.m3322c(r1);
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.b.d.i.a(com.d.a.b.a):byte[]");
    }

    private static int[] m19304a(int[] iArr, int i) {
        return iArr == null ? new int[i] : Arrays.copyOf(iArr, iArr.length + i);
    }

    private C1380m m19305b(int i) {
        char[] i2 = this.m.m3341i();
        if (i == 48) {
            i = m19323m();
        }
        i2[0] = (char) i;
        i = (this.c + i2.length) - 1;
        if (i > this.d) {
            i = this.d;
        }
        int i3 = 1;
        int i4 = i3;
        while (this.c < i) {
            byte[] bArr = this.f20991S;
            int i5 = this.c;
            this.c = i5 + 1;
            int i6 = bArr[i5] & 255;
            if (i6 < 48 || i6 > 57) {
                if (!(i6 == 46 || i6 == 101)) {
                    if (i6 != 69) {
                        this.c--;
                        this.m.f4340i = i3;
                        if (this.k.m3358c()) {
                            m19311c(i6);
                        }
                        return m18209a(false, i4);
                    }
                }
                return m19290a(i2, i3, i6, false, i4);
            }
            i4++;
            i5 = i3 + 1;
            i2[i3] = (char) i6;
            i3 = i5;
        }
        return m19291a(i2, i3, false, i4);
    }

    private final String m19306b(int i, int i2, int i3) {
        i2 = C7262i.m19310c(i2, i3);
        String a = this.f20984L.m3289a(i, i2);
        if (a != null) {
            return a;
        }
        this.f20985M[0] = i;
        this.f20985M[1] = i2;
        return m19296a(this.f20985M, 2, i3);
    }

    private final String m19307b(int i, int i2, int i3, int i4) {
        i3 = C7262i.m19310c(i3, i4);
        String a = this.f20984L.m3290a(i, i2, i3);
        if (a != null) {
            return a;
        }
        int[] iArr = this.f20985M;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = C7262i.m19310c(i3, i4);
        return m19296a(iArr, 3, i4);
    }

    private void m19308b(int i, int i2) {
        this.c = i2;
        m19324m(i);
    }

    private void m19309b(String str) {
        m19301a(str, "'null', 'true', 'false' or NaN");
    }

    private static final int m19310c(int i, int i2) {
        return i2 == 4 ? i : i | (-1 << (i2 << 3));
    }

    private final void m19311c(int i) {
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
        m19283A();
    }

    private String m19312d(int i) {
        C7262i c7262i = this;
        int i2 = i;
        int i3 = 0;
        byte[] bArr;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        if (i2 != 34) {
            int[] iArr2;
            if (i2 == 39 && isEnabled(C1376a.ALLOW_SINGLE_QUOTES)) {
                if (c7262i.c >= c7262i.d && !mo3508b()) {
                    _reportInvalidEOF(": was expecting closing ''' for name");
                }
                bArr = c7262i.f20991S;
                i4 = c7262i.c;
                c7262i.c = i4 + 1;
                i2 = bArr[i4] & 255;
                if (i2 == 39) {
                    return "";
                }
                iArr = c7262i.f20985M;
                iArr2 = f20981J;
                i5 = 0;
                int i9 = i5;
                int[] iArr3 = iArr;
                i4 = i9;
                while (i2 != 39) {
                    if (!(i2 == 34 || iArr2[i2] == 0)) {
                        if (i2 != 92) {
                            _throwUnquotedSpace(i2, "name");
                        } else {
                            i2 = mo3512j();
                        }
                        if (i2 > 127) {
                            if (i4 >= 4) {
                                if (i5 >= iArr3.length) {
                                    iArr3 = C7262i.m19304a(iArr3, iArr3.length);
                                    c7262i.f20985M = iArr3;
                                }
                                i4 = i5 + 1;
                                iArr3[i5] = i9;
                                i9 = 0;
                                i5 = i4;
                                i4 = i9;
                            }
                            if (i2 < 2048) {
                                i9 = (i9 << 8) | (192 | (i2 >> 6));
                                i4++;
                            } else {
                                i9 = (i9 << 8) | (224 | (i2 >> 12));
                                i4++;
                                if (i4 >= 4) {
                                    if (i5 >= iArr3.length) {
                                        iArr3 = C7262i.m19304a(iArr3, iArr3.length);
                                        c7262i.f20985M = iArr3;
                                    }
                                    i4 = i5 + 1;
                                    iArr3[i5] = i9;
                                    i9 = 0;
                                    i5 = i4;
                                    i4 = i9;
                                }
                                i9 = (i9 << 8) | (((i2 >> 6) & 63) | 128);
                                i4++;
                            }
                            i2 = (i2 & 63) | 128;
                        }
                    }
                    if (i4 < 4) {
                        i4++;
                        i9 = i2 | (i9 << 8);
                    } else {
                        if (i5 >= iArr3.length) {
                            iArr3 = C7262i.m19304a(iArr3, iArr3.length);
                            c7262i.f20985M = iArr3;
                        }
                        i4 = i5 + 1;
                        iArr3[i5] = i9;
                        i9 = i2;
                        i5 = i4;
                        i4 = 1;
                    }
                    if (c7262i.c >= c7262i.d && !mo3508b()) {
                        _reportInvalidEOF(" in field name");
                    }
                    bArr = c7262i.f20991S;
                    i6 = c7262i.c;
                    c7262i.c = i6 + 1;
                    i2 = bArr[i6] & 255;
                }
                if (i4 > 0) {
                    if (i5 >= iArr3.length) {
                        iArr3 = C7262i.m19304a(iArr3, iArr3.length);
                        c7262i.f20985M = iArr3;
                    }
                    i2 = i5 + 1;
                    iArr3[i5] = C7262i.m19310c(i9, i4);
                } else {
                    i2 = i5;
                }
                String a = c7262i.f20984L.m3292a(iArr3, i2);
                if (a == null) {
                    a = m19296a(iArr3, i2, i4);
                }
                return a;
            }
            if (!isEnabled(C1376a.ALLOW_UNQUOTED_FIELD_NAMES)) {
                _reportUnexpectedChar((char) m19314f(i), "was expecting double-quote to start field name");
            }
            int[] d = C1345a.m3183d();
            if (d[i2] != 0) {
                _reportUnexpectedChar(i2, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
            }
            i4 = 0;
            iArr2 = c7262i.f20985M;
            i7 = i2;
            i2 = i4;
            while (true) {
                if (i3 < 4) {
                    i3++;
                    i2 = (i2 << 8) | i7;
                } else {
                    if (i4 >= iArr2.length) {
                        iArr2 = C7262i.m19304a(iArr2, iArr2.length);
                        c7262i.f20985M = iArr2;
                    }
                    i3 = i4 + 1;
                    iArr2[i4] = i2;
                    i4 = i3;
                    i3 = 1;
                    i2 = i7;
                }
                if (c7262i.c >= c7262i.d && !mo3508b()) {
                    _reportInvalidEOF(" in field name");
                }
                i7 = c7262i.f20991S[c7262i.c] & 255;
                if (d[i7] != 0) {
                    break;
                }
                c7262i.c++;
            }
            if (i3 > 0) {
                if (i4 >= iArr2.length) {
                    iArr2 = C7262i.m19304a(iArr2, iArr2.length);
                    c7262i.f20985M = iArr2;
                }
                i8 = i4 + 1;
                iArr2[i4] = i2;
            } else {
                i8 = i4;
            }
            String a2 = c7262i.f20984L.m3292a(iArr2, i8);
            if (a2 == null) {
                a2 = m19296a(iArr2, i8, i3);
            }
            return a2;
        } else if (c7262i.c + 13 > c7262i.d) {
            if (c7262i.c >= c7262i.d && !mo3508b()) {
                _reportInvalidEOF(": was expecting closing '\"' for name");
            }
            bArr = c7262i.f20991S;
            i8 = c7262i.c;
            c7262i.c = i8 + 1;
            int i10 = bArr[i8] & 255;
            return i10 == 34 ? "" : m19298a(c7262i.f20985M, 0, 0, i10, 0);
        } else {
            bArr = c7262i.f20991S;
            int[] iArr4 = f20981J;
            i4 = c7262i.c;
            c7262i.c = i4 + 1;
            i4 = bArr[i4] & 255;
            if (iArr4[i4] != 0) {
                return i4 == 34 ? "" : m19293a(0, i4, 0);
            } else {
                int i11 = c7262i.c;
                c7262i.c = i11 + 1;
                i11 = bArr[i11] & 255;
                if (iArr4[i11] != 0) {
                    return i11 == 34 ? m19292a(i4, 1) : m19293a(i4, i11, 1);
                } else {
                    i4 = (i4 << 8) | i11;
                    i11 = c7262i.c;
                    c7262i.c = i11 + 1;
                    i11 = bArr[i11] & 255;
                    if (iArr4[i11] != 0) {
                        return i11 == 34 ? m19292a(i4, 2) : m19293a(i4, i11, 2);
                    } else {
                        i4 = (i4 << 8) | i11;
                        i11 = c7262i.c;
                        c7262i.c = i11 + 1;
                        i11 = bArr[i11] & 255;
                        if (iArr4[i11] != 0) {
                            return i11 == 34 ? m19292a(i4, 3) : m19293a(i4, i11, 3);
                        } else {
                            i4 = (i4 << 8) | i11;
                            i11 = c7262i.c;
                            c7262i.c = i11 + 1;
                            i2 = bArr[i11] & 255;
                            if (iArr4[i2] != 0) {
                                return i2 == 34 ? m19292a(i4, 4) : m19293a(i4, i2, 4);
                            } else {
                                c7262i.f20993V = i4;
                                byte[] bArr2 = c7262i.f20991S;
                                iArr = f20981J;
                                i11 = c7262i.c;
                                c7262i.c = i11 + 1;
                                i11 = bArr2[i11] & 255;
                                if (iArr[i11] != 0) {
                                    return i11 == 34 ? m19306b(c7262i.f20993V, i2, 1) : m19294a(c7262i.f20993V, i2, i11, 1);
                                } else {
                                    i2 = (i2 << 8) | i11;
                                    i11 = c7262i.c;
                                    c7262i.c = i11 + 1;
                                    i11 = bArr2[i11] & 255;
                                    if (iArr[i11] != 0) {
                                        return i11 == 34 ? m19306b(c7262i.f20993V, i2, 2) : m19294a(c7262i.f20993V, i2, i11, 2);
                                    } else {
                                        i2 = (i2 << 8) | i11;
                                        i11 = c7262i.c;
                                        c7262i.c = i11 + 1;
                                        i11 = bArr2[i11] & 255;
                                        if (iArr[i11] != 0) {
                                            return i11 == 34 ? m19306b(c7262i.f20993V, i2, 3) : m19294a(c7262i.f20993V, i2, i11, 3);
                                        } else {
                                            i11 |= i2 << 8;
                                            i2 = c7262i.c;
                                            c7262i.c = i2 + 1;
                                            i7 = bArr2[i2] & 255;
                                            if (iArr[i7] != 0) {
                                                return i7 == 34 ? m19306b(c7262i.f20993V, i11, 4) : m19294a(c7262i.f20993V, i11, i7, 4);
                                            } else {
                                                bArr = c7262i.f20991S;
                                                iArr = f20981J;
                                                i5 = c7262i.c;
                                                c7262i.c = i5 + 1;
                                                i5 = bArr[i5] & 255;
                                                if (iArr[i5] != 0) {
                                                    return i5 == 34 ? m19307b(c7262i.f20993V, i11, i7, 1) : m19295a(c7262i.f20993V, i11, i7, i5, 1);
                                                } else {
                                                    i7 = (i7 << 8) | i5;
                                                    i5 = c7262i.c;
                                                    c7262i.c = i5 + 1;
                                                    i5 = bArr[i5] & 255;
                                                    if (iArr[i5] != 0) {
                                                        return i5 == 34 ? m19307b(c7262i.f20993V, i11, i7, 2) : m19295a(c7262i.f20993V, i11, i7, i5, 2);
                                                    } else {
                                                        i7 = (i7 << 8) | i5;
                                                        i5 = c7262i.c;
                                                        c7262i.c = i5 + 1;
                                                        i5 = bArr[i5] & 255;
                                                        if (iArr[i5] != 0) {
                                                            return i5 == 34 ? m19307b(c7262i.f20993V, i11, i7, 3) : m19295a(c7262i.f20993V, i11, i7, i5, 3);
                                                        } else {
                                                            i7 = (i7 << 8) | i5;
                                                            i5 = c7262i.c;
                                                            c7262i.c = i5 + 1;
                                                            i5 = bArr[i5] & 255;
                                                            if (iArr[i5] != 0) {
                                                                return i5 == 34 ? m19307b(c7262i.f20993V, i11, i7, 4) : m19295a(c7262i.f20993V, i11, i7, i5, 4);
                                                            } else {
                                                                c7262i.f20985M[0] = c7262i.f20993V;
                                                                c7262i.f20985M[1] = i11;
                                                                c7262i.f20985M[2] = i7;
                                                                bArr = c7262i.f20991S;
                                                                int[] iArr5 = f20981J;
                                                                i7 = 3;
                                                                while (c7262i.c + 4 <= c7262i.d) {
                                                                    i4 = c7262i.c;
                                                                    c7262i.c = i4 + 1;
                                                                    i4 = bArr[i4] & 255;
                                                                    if (iArr5[i4] != 0) {
                                                                        return i4 == 34 ? m19297a(c7262i.f20985M, i7, i5, 1) : m19298a(c7262i.f20985M, i7, i5, i4, 1);
                                                                    } else {
                                                                        i4 |= i5 << 8;
                                                                        i11 = c7262i.c;
                                                                        c7262i.c = i11 + 1;
                                                                        i11 = bArr[i11] & 255;
                                                                        if (iArr5[i11] != 0) {
                                                                            return i11 == 34 ? m19297a(c7262i.f20985M, i7, i4, 2) : m19298a(c7262i.f20985M, i7, i4, i11, 2);
                                                                        } else {
                                                                            i4 = (i4 << 8) | i11;
                                                                            i11 = c7262i.c;
                                                                            c7262i.c = i11 + 1;
                                                                            i11 = bArr[i11] & 255;
                                                                            if (iArr5[i11] != 0) {
                                                                                return i11 == 34 ? m19297a(c7262i.f20985M, i7, i4, 3) : m19298a(c7262i.f20985M, i7, i4, i11, 3);
                                                                            } else {
                                                                                i4 = (i4 << 8) | i11;
                                                                                i11 = c7262i.c;
                                                                                c7262i.c = i11 + 1;
                                                                                i5 = bArr[i11] & 255;
                                                                                if (iArr5[i5] != 0) {
                                                                                    return i5 == 34 ? m19297a(c7262i.f20985M, i7, i4, 4) : m19298a(c7262i.f20985M, i7, i4, i5, 4);
                                                                                } else {
                                                                                    if (i7 >= c7262i.f20985M.length) {
                                                                                        c7262i.f20985M = C7262i.m19304a(c7262i.f20985M, i7);
                                                                                    }
                                                                                    i6 = i7 + 1;
                                                                                    c7262i.f20985M[i7] = i4;
                                                                                    i7 = i6;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                return m19298a(c7262i.f20985M, i7, 0, i5, 0);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private C1380m m19313e(int i) {
        StringBuilder stringBuilder;
        if (i != 39) {
            if (i != 43) {
                String str;
                if (i == 73) {
                    m19299a("Infinity", 1);
                    if (isEnabled(C1376a.ALLOW_NON_NUMERIC_NUMBERS)) {
                        return m18208a("Infinity", Double.POSITIVE_INFINITY);
                    }
                    str = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow";
                } else if (i == 78) {
                    m19299a("NaN", 1);
                    if (isEnabled(C1376a.ALLOW_NON_NUMERIC_NUMBERS)) {
                        return m18208a("NaN", Double.NaN);
                    }
                    str = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow";
                } else if (i == 93 || i == 125) {
                    _reportUnexpectedChar(i, "expected a value");
                } else {
                    if (Character.isJavaIdentifierStart(i)) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append((char) i);
                        m19301a(stringBuilder.toString(), "('true', 'false' or 'null')");
                    }
                    _reportUnexpectedChar(i, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
                    return null;
                }
                _reportError(str);
                if (Character.isJavaIdentifierStart(i)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append((char) i);
                    m19301a(stringBuilder.toString(), "('true', 'false' or 'null')");
                }
                _reportUnexpectedChar(i, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
                return null;
            }
            if (this.c >= this.d && !mo3508b()) {
                _reportInvalidEOFInValue();
            }
            byte[] bArr = this.f20991S;
            int i2 = this.c;
            this.c = i2 + 1;
            return m19289a(bArr[i2] & 255, false);
        }
        if (isEnabled(C1376a.ALLOW_SINGLE_QUOTES)) {
            char[] i3 = this.m.m3341i();
            int[] iArr = f20982U;
            byte[] bArr2 = this.f20991S;
            char[] cArr = i3;
            i = 0;
            while (true) {
                if (this.c >= this.d) {
                    m18211a();
                }
                if (i >= cArr.length) {
                    cArr = this.m.m3342j();
                    i = 0;
                }
                int i4 = this.d;
                int length = this.c + (cArr.length - i);
                if (length < i4) {
                    i4 = length;
                }
                while (this.c < i4) {
                    length = this.c;
                    this.c = length + 1;
                    length = bArr2[length] & 255;
                    if (length != 39 && iArr[length] == 0) {
                        int i5 = i + 1;
                        cArr[i] = (char) length;
                        i = i5;
                    } else if (length != 39) {
                        switch (iArr[length]) {
                            case 1:
                                if (length != 39) {
                                    length = mo3512j();
                                    break;
                                }
                                break;
                            case 2:
                                length = m19315g(length);
                                break;
                            case 3:
                                if (this.d - this.c < 2) {
                                    length = m19316h(length);
                                    break;
                                }
                                length = m19317i(length);
                                break;
                            case 4:
                                i4 = m19318j(length);
                                length = i + 1;
                                cArr[i] = (char) (C6464a.SURR1_FIRST | (i4 >> 10));
                                if (length >= cArr.length) {
                                    cArr = this.m.m3342j();
                                    length = 0;
                                }
                                int i6 = length;
                                length = C6464a.SURR2_FIRST | (i4 & 1023);
                                i = i6;
                                break;
                            default:
                                if (length < 32) {
                                    _throwUnquotedSpace(length, "string value");
                                }
                                m19320k(length);
                                break;
                        }
                        if (i >= cArr.length) {
                            cArr = this.m.m3342j();
                            i = 0;
                        }
                        i4 = i + 1;
                        cArr[i] = (char) length;
                        i = i4;
                    } else {
                        this.m.f4340i = i;
                        return C1380m.VALUE_STRING;
                    }
                }
            }
        }
        if (Character.isJavaIdentifierStart(i)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append((char) i);
            m19301a(stringBuilder.toString(), "('true', 'false' or 'null')");
        }
        _reportUnexpectedChar(i, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
        return null;
    }

    private int m19314f(int i) {
        i &= 255;
        if (i <= 127) {
            return i;
        }
        Object obj;
        int B;
        int B2;
        if ((i & 224) == 192) {
            i &= 31;
        } else {
            if ((i & 240) == 224) {
                i &= 15;
                obj = 2;
            } else if ((i & 248) == 240) {
                i &= 7;
                obj = 3;
            } else {
                m19322l(i & 255);
            }
            B = m19284B();
            if ((B & 192) != 128) {
                m19324m(B & 255);
            }
            i = (i << 6) | (B & 63);
            if (obj > 1) {
                return i;
            }
            int B3;
            B3 = m19284B();
            if ((B3 & 192) != 128) {
                m19324m(B3 & 255);
            }
            i = (i << 6) | (B3 & 63);
            if (obj > 2) {
                return i;
            }
            B2 = m19284B();
            if ((B2 & 192) != 128) {
                m19324m(B2 & 255);
            }
            return (i << 6) | (B2 & 63);
        }
        obj = 1;
        B = m19284B();
        if ((B & 192) != 128) {
            m19324m(B & 255);
        }
        i = (i << 6) | (B & 63);
        if (obj > 1) {
            return i;
        }
        B3 = m19284B();
        if ((B3 & 192) != 128) {
            m19324m(B3 & 255);
        }
        i = (i << 6) | (B3 & 63);
        if (obj > 2) {
            return i;
        }
        B2 = m19284B();
        if ((B2 & 192) != 128) {
            m19324m(B2 & 255);
        }
        return (i << 6) | (B2 & 63);
    }

    private final int m19315g(int i) {
        if (this.c >= this.d) {
            m18211a();
        }
        byte[] bArr = this.f20991S;
        int i2 = this.c;
        this.c = i2 + 1;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            m19308b(b & 255, this.c);
        }
        return ((i & 31) << 6) | (b & 63);
    }

    private final int m19316h(int i) {
        if (this.c >= this.d) {
            m18211a();
        }
        i &= 15;
        byte[] bArr = this.f20991S;
        int i2 = this.c;
        this.c = i2 + 1;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            m19308b(b & 255, this.c);
        }
        i = (i << 6) | (b & 63);
        if (this.c >= this.d) {
            m18211a();
        }
        bArr = this.f20991S;
        i2 = this.c;
        this.c = i2 + 1;
        b = bArr[i2];
        if ((b & 192) != 128) {
            m19308b(b & 255, this.c);
        }
        return (i << 6) | (b & 63);
    }

    private final int m19317i(int i) {
        i &= 15;
        byte[] bArr = this.f20991S;
        int i2 = this.c;
        this.c = i2 + 1;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            m19308b(b & 255, this.c);
        }
        i = (i << 6) | (b & 63);
        bArr = this.f20991S;
        i2 = this.c;
        this.c = i2 + 1;
        b = bArr[i2];
        if ((b & 192) != 128) {
            m19308b(b & 255, this.c);
        }
        return (i << 6) | (b & 63);
    }

    private final int m19318j(int i) {
        if (this.c >= this.d) {
            m18211a();
        }
        byte[] bArr = this.f20991S;
        int i2 = this.c;
        this.c = i2 + 1;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            m19308b(b & 255, this.c);
        }
        i = ((i & 7) << 6) | (b & 63);
        if (this.c >= this.d) {
            m18211a();
        }
        bArr = this.f20991S;
        i2 = this.c;
        this.c = i2 + 1;
        b = bArr[i2];
        if ((b & 192) != 128) {
            m19308b(b & 255, this.c);
        }
        i = (i << 6) | (b & 63);
        if (this.c >= this.d) {
            m18211a();
        }
        bArr = this.f20991S;
        i2 = this.c;
        this.c = i2 + 1;
        b = bArr[i2];
        if ((b & 192) != 128) {
            m19308b(b & 255, this.c);
        }
        return ((i << 6) | (b & 63)) - 65536;
    }

    private final C1380m m19319k() {
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

    private void m19320k(int i) {
        if (i < 32) {
            _throwInvalidSpace(i);
        }
        m19322l(i);
    }

    private C1380m m19321l() {
        char[] i = this.m.m3341i();
        i[0] = '-';
        if (this.c >= this.d) {
            m18211a();
        }
        byte[] bArr = this.f20991S;
        int i2 = this.c;
        this.c = i2 + 1;
        int i3 = bArr[i2] & 255;
        if (i3 >= 48) {
            if (i3 <= 57) {
                if (i3 == 48) {
                    i3 = m19323m();
                }
                i[1] = (char) i3;
                int i4 = 2;
                i3 = (this.c + i.length) - 2;
                if (i3 > this.d) {
                    i3 = this.d;
                }
                int i5 = 1;
                while (this.c < i3) {
                    byte[] bArr2 = this.f20991S;
                    int i6 = this.c;
                    this.c = i6 + 1;
                    int i7 = bArr2[i6] & 255;
                    if (i7 < 48 || i7 > 57) {
                        if (!(i7 == 46 || i7 == 101)) {
                            if (i7 != 69) {
                                this.c--;
                                this.m.f4340i = i4;
                                if (this.k.m3358c()) {
                                    m19311c(i7);
                                }
                                return m18209a(true, i5);
                            }
                        }
                        return m19290a(i, i4, i7, true, i5);
                    }
                    i5++;
                    i6 = i4 + 1;
                    i[i4] = (char) i7;
                    i4 = i6;
                }
                return m19291a(i, i4, true, i5);
            }
        }
        return m19289a(i3, true);
    }

    private void m19322l(int i) {
        StringBuilder stringBuilder = new StringBuilder("Invalid UTF-8 start byte 0x");
        stringBuilder.append(Integer.toHexString(i));
        _reportError(stringBuilder.toString());
    }

    private final int m19323m() {
        if (this.c >= this.d && !mo3508b()) {
            return 48;
        }
        int i = this.f20991S[this.c] & 255;
        if (i < 48 || i > 57) {
            return 48;
        }
        if (!isEnabled(C1376a.ALLOW_NUMERIC_LEADING_ZEROS)) {
            m18214a("Leading zeroes not allowed");
        }
        this.c++;
        if (i == 48) {
            do {
                if (this.c < this.d || mo3508b()) {
                    i = this.f20991S[this.c] & 255;
                    if (i < 48 || i > 57) {
                        return 48;
                    }
                    this.c++;
                }
            } while (i == 48);
            return i;
        }
        return i;
    }

    private void m19324m(int i) {
        StringBuilder stringBuilder = new StringBuilder("Invalid UTF-8 middle byte 0x");
        stringBuilder.append(Integer.toHexString(i));
        _reportError(stringBuilder.toString());
    }

    private String m19325n() {
        int i = this.c;
        if (i >= this.d) {
            m18211a();
            i = this.c;
        }
        char[] i2 = this.m.m3341i();
        int[] iArr = f20982U;
        int min = Math.min(this.d, i2.length + i);
        byte[] bArr = this.f20991S;
        int i3 = 0;
        while (i < min) {
            int i4 = bArr[i] & 255;
            if (iArr[i4] != 0) {
                if (i4 == 34) {
                    this.c = i + 1;
                    C1373i c1373i = this.m;
                    c1373i.f4340i = i3;
                    if (c1373i.f4338g > 0) {
                        return c1373i.m3338f();
                    }
                    int i5 = c1373i.f4340i;
                    String str = i5 == 0 ? "" : new String(c1373i.f4339h, 0, i5);
                    c1373i.f4341j = str;
                    return str;
                }
                this.c = i;
                m19302a(i2, i3);
                return this.m.m3338f();
            }
            i++;
            int i6 = i3 + 1;
            i2[i3] = (char) i4;
            i3 = i6;
        }
        this.c = i;
        m19302a(i2, i3);
        return this.m.m3338f();
    }

    private void m19326o() {
        this.f20986N = false;
        int[] iArr = f20982U;
        byte[] bArr = this.f20991S;
        while (true) {
            int i = this.c;
            int i2 = this.d;
            if (i >= i2) {
                m18211a();
                i = this.c;
                i2 = this.d;
            }
            while (i < i2) {
                int i3 = i + 1;
                i = bArr[i] & 255;
                if (iArr[i] != 0) {
                    this.c = i3;
                    if (i != 34) {
                        switch (iArr[i]) {
                            case 1:
                                mo3512j();
                                break;
                            case 2:
                                m19335x();
                                break;
                            case 3:
                                m19336y();
                                break;
                            case 4:
                                m19337z();
                                break;
                            default:
                                if (i >= 32) {
                                    m19320k(i);
                                    break;
                                } else {
                                    _throwUnquotedSpace(i, "string value");
                                    break;
                                }
                        }
                    }
                    return;
                }
                i = i3;
            }
            this.c = i;
        }
    }

    private final int m19327p() {
        while (this.c < this.d) {
            byte[] bArr = this.f20991S;
            int i = this.c;
            this.c = i + 1;
            int i2 = bArr[i] & 255;
            if (i2 > 32) {
                if (i2 != 47) {
                    if (i2 != 35) {
                        return i2;
                    }
                }
                this.c--;
                return m19328q();
            } else if (i2 != 32) {
                if (i2 == 10) {
                    this.f++;
                    this.g = this.c;
                } else if (i2 == 13) {
                    m19283A();
                } else if (i2 != 9) {
                    _throwInvalidSpace(i2);
                }
            }
        }
        return m19328q();
    }

    private final int m19328q() {
        int i;
        while (true) {
            if (this.c >= this.d) {
                if (!mo3508b()) {
                    StringBuilder stringBuilder = new StringBuilder("Unexpected end-of-input within/between ");
                    stringBuilder.append(this.k.m3360e());
                    stringBuilder.append(" entries");
                    throw _constructError(stringBuilder.toString());
                }
            }
            byte[] bArr = this.f20991S;
            int i2 = this.c;
            this.c = i2 + 1;
            i = bArr[i2] & 255;
            if (i > 32) {
                if (i == 47) {
                    m19332u();
                } else if (i != 35 || !m19333v()) {
                    return i;
                }
            } else if (i != 32) {
                if (i == 10) {
                    this.f++;
                    this.g = this.c;
                } else if (i == 13) {
                    m19283A();
                } else if (i != 9) {
                    _throwInvalidSpace(i);
                }
            }
        }
        return i;
    }

    private final int m19329r() {
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
        r0 = r9.f20991S;
        r1 = r9.c;
        r2 = r1 + 1;
        r9.c = r2;
        r0 = r0[r1];
        r0 = r0 & 255;
        r1 = 35;
        r2 = 47;
        r3 = 32;
        if (r0 <= r3) goto L_0x0036;
    L_0x0025:
        if (r0 == r2) goto L_0x002b;
    L_0x0027:
        if (r0 != r1) goto L_0x002a;
    L_0x0029:
        goto L_0x002b;
    L_0x002a:
        return r0;
    L_0x002b:
        r0 = r9.c;
        r0 = r0 + -1;
        r9.c = r0;
        r0 = r9.m19330s();
        return r0;
    L_0x0036:
        r4 = 9;
        r5 = 13;
        r6 = 10;
        if (r0 == r3) goto L_0x0056;
    L_0x003e:
        if (r0 != r6) goto L_0x004b;
    L_0x0040:
        r0 = r9.f;
        r0 = r0 + 1;
        r9.f = r0;
        r0 = r9.c;
        r9.g = r0;
        goto L_0x0056;
    L_0x004b:
        if (r0 != r5) goto L_0x0051;
    L_0x004d:
        r9.m19283A();
        goto L_0x0056;
    L_0x0051:
        if (r0 == r4) goto L_0x0056;
    L_0x0053:
        r9._throwInvalidSpace(r0);
    L_0x0056:
        r0 = r9.c;
        r7 = r9.d;
        if (r0 >= r7) goto L_0x007b;
    L_0x005c:
        r0 = r9.f20991S;
        r7 = r9.c;
        r8 = r7 + 1;
        r9.c = r8;
        r0 = r0[r7];
        r0 = r0 & 255;
        if (r0 <= r3) goto L_0x0070;
    L_0x006a:
        if (r0 == r2) goto L_0x002b;
    L_0x006c:
        if (r0 != r1) goto L_0x006f;
    L_0x006e:
        goto L_0x002b;
    L_0x006f:
        return r0;
    L_0x0070:
        if (r0 == r3) goto L_0x0056;
    L_0x0072:
        if (r0 != r6) goto L_0x0075;
    L_0x0074:
        goto L_0x0040;
    L_0x0075:
        if (r0 != r5) goto L_0x0078;
    L_0x0077:
        goto L_0x004d;
    L_0x0078:
        if (r0 == r4) goto L_0x0056;
    L_0x007a:
        goto L_0x0053;
    L_0x007b:
        r0 = r9.m19330s();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.b.d.i.r():int");
    }

    private final int m19330s() {
        int i;
        while (true) {
            if (this.c >= this.d) {
                if (!mo3508b()) {
                    return m18220f();
                }
            }
            byte[] bArr = this.f20991S;
            int i2 = this.c;
            this.c = i2 + 1;
            i = bArr[i2] & 255;
            if (i > 32) {
                if (i == 47) {
                    m19332u();
                } else if (i != 35 || !m19333v()) {
                    return i;
                }
            } else if (i != 32) {
                if (i == 10) {
                    this.f++;
                    this.g = this.c;
                } else if (i == 13) {
                    m19283A();
                } else if (i != 9) {
                    _throwInvalidSpace(i);
                }
            }
        }
        return i;
    }

    private final int m19331t() {
        if (this.c + 4 >= this.d) {
            return m19287a(false);
        }
        int i;
        byte b = this.f20991S[this.c];
        byte[] bArr;
        int i2;
        if (b == (byte) 58) {
            bArr = this.f20991S;
            i2 = this.c + 1;
            this.c = i2;
            i = bArr[i2];
            if (i > 32) {
                if (i != 47) {
                    if (i == 35) {
                    }
                }
                return m19287a(true);
            }
            if (i == 32 || i == 9) {
                bArr = this.f20991S;
                i2 = this.c + 1;
                this.c = i2;
                i = bArr[i2];
                if (i > 32) {
                    if (i == 47 || i == 35) {
                        return m19287a(true);
                    }
                }
            }
            return m19287a(true);
        }
        if (b == (byte) 32 || b == (byte) 9) {
            bArr = this.f20991S;
            int i3 = this.c + 1;
            this.c = i3;
            b = bArr[i3];
        }
        if (b != (byte) 58) {
            return m19287a(false);
        }
        bArr = this.f20991S;
        i2 = this.c + 1;
        this.c = i2;
        i = bArr[i2];
        if (i <= 32) {
            if (i == 32 || i == 9) {
                bArr = this.f20991S;
                i2 = this.c + 1;
                this.c = i2;
                i = bArr[i2];
                if (i > 32) {
                    if (i == 47 || i == 35) {
                        return m19287a(true);
                    }
                }
            }
            return m19287a(true);
        } else if (i == 47 || i == 35) {
            return m19287a(true);
        }
        this.c++;
        return i;
    }

    private final void m19332u() {
        if (!isEnabled(C1376a.ALLOW_COMMENTS)) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.c >= this.d && !mo3508b()) {
            _reportInvalidEOF(" in a comment");
        }
        byte[] bArr = this.f20991S;
        int i = this.c;
        this.c = i + 1;
        int i2 = bArr[i] & 255;
        if (i2 == 47) {
            m19334w();
        } else if (i2 == 42) {
            int[] e = C1345a.m3184e();
            while (true) {
                if (this.c < this.d || mo3508b()) {
                    bArr = this.f20991S;
                    int i3 = this.c;
                    this.c = i3 + 1;
                    i2 = bArr[i3] & 255;
                    i3 = e[i2];
                    if (i3 != 0) {
                        if (i3 == 10) {
                            this.f++;
                            this.g = this.c;
                        } else if (i3 == 13) {
                            m19283A();
                        } else if (i3 != 42) {
                            switch (i3) {
                                case 2:
                                    m19335x();
                                    break;
                                case 3:
                                    m19336y();
                                    break;
                                case 4:
                                    m19337z();
                                    break;
                                default:
                                    m19320k(i2);
                                    break;
                            }
                        } else {
                            if (this.c >= this.d) {
                                if (mo3508b()) {
                                }
                            }
                            if (this.f20991S[this.c] == (byte) 47) {
                                this.c++;
                                return;
                            }
                        }
                    }
                }
                _reportInvalidEOF(" in a comment");
                return;
            }
        } else {
            _reportUnexpectedChar(i2, "was expecting either '*' or '/' for a comment");
        }
    }

    private final boolean m19333v() {
        if (!isEnabled(C1376a.ALLOW_YAML_COMMENTS)) {
            return false;
        }
        m19334w();
        return true;
    }

    private final void m19334w() {
        int[] e = C1345a.m3184e();
        while (true) {
            if (this.c >= this.d) {
                if (!mo3508b()) {
                    return;
                }
            }
            byte[] bArr = this.f20991S;
            int i = this.c;
            this.c = i + 1;
            int i2 = bArr[i] & 255;
            i = e[i2];
            if (i != 0) {
                if (i == 10) {
                    this.f++;
                    this.g = this.c;
                    return;
                } else if (i == 13) {
                    m19283A();
                    return;
                } else if (i != 42) {
                    switch (i) {
                        case 2:
                            m19335x();
                            break;
                        case 3:
                            m19336y();
                            break;
                        case 4:
                            m19337z();
                            break;
                        default:
                            if (i >= 0) {
                                break;
                            }
                            m19320k(i2);
                            break;
                    }
                }
            }
        }
    }

    private final void m19335x() {
        if (this.c >= this.d) {
            m18211a();
        }
        byte[] bArr = this.f20991S;
        int i = this.c;
        this.c = i + 1;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            m19308b(b & 255, this.c);
        }
    }

    private final void m19336y() {
        if (this.c >= this.d) {
            m18211a();
        }
        byte[] bArr = this.f20991S;
        int i = this.c;
        this.c = i + 1;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            m19308b(b & 255, this.c);
        }
        if (this.c >= this.d) {
            m18211a();
        }
        bArr = this.f20991S;
        i = this.c;
        this.c = i + 1;
        b = bArr[i];
        if ((b & 192) != 128) {
            m19308b(b & 255, this.c);
        }
    }

    private final void m19337z() {
        if (this.c >= this.d) {
            m18211a();
        }
        byte[] bArr = this.f20991S;
        int i = this.c;
        this.c = i + 1;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            m19308b(b & 255, this.c);
        }
        if (this.c >= this.d) {
            m18211a();
        }
        bArr = this.f20991S;
        i = this.c;
        this.c = i + 1;
        b = bArr[i];
        if ((b & 192) != 128) {
            m19308b(b & 255, this.c);
        }
        if (this.c >= this.d) {
            m18211a();
        }
        bArr = this.f20991S;
        i = this.c;
        this.c = i + 1;
        b = bArr[i];
        if ((b & 192) != 128) {
            m19308b(b & 255, this.c);
        }
    }

    protected final boolean mo3508b() {
        int i = this.d;
        this.e += (long) this.d;
        this.g -= this.d;
        this.f20987O -= i;
        if (this.f20990R != null) {
            i = this.f20991S.length;
            if (i == 0) {
                return false;
            }
            i = this.f20990R.read(this.f20991S, 0, i);
            if (i > 0) {
                this.c = 0;
                this.d = i;
                return true;
            }
            mo3510d();
            if (i == 0) {
                StringBuilder stringBuilder = new StringBuilder("InputStream.read() returned 0 characters when trying to read ");
                stringBuilder.append(this.f20991S.length);
                stringBuilder.append(" bytes");
                throw new IOException(stringBuilder.toString());
            }
        }
        return false;
    }

    protected final void mo3509c() {
        int i = this.c;
        if (i >= this.d) {
            m18211a();
            i = this.c;
        }
        int i2 = 0;
        char[] i3 = this.m.m3341i();
        int[] iArr = f20982U;
        int min = Math.min(this.d, i3.length + i);
        byte[] bArr = this.f20991S;
        while (i < min) {
            int i4 = bArr[i] & 255;
            if (iArr[i4] != 0) {
                if (i4 == 34) {
                    this.c = i + 1;
                    this.m.f4340i = i2;
                    return;
                }
                this.c = i;
                m19302a(i3, i2);
            }
            i++;
            int i5 = i2 + 1;
            i3[i2] = (char) i4;
            i2 = i5;
        }
        this.c = i;
        m19302a(i3, i2);
    }

    protected final void mo3510d() {
        if (this.f20990R != null) {
            if (this.a.m3205c() || isEnabled(C1376a.AUTO_CLOSE_SOURCE)) {
                this.f20990R.close();
            }
            this.f20990R = null;
        }
    }

    protected final void mo3511e() {
        super.mo3511e();
        this.f20984L.m3294b();
        if (this.f20992T) {
            byte[] bArr = this.f20991S;
            if (bArr != null) {
                this.f20991S = C1369b.f4324a;
                this.a.m3196a(bArr);
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
        if (this.f20986N) {
            try {
                this.q = m19303a(c1341a);
                this.f20986N = false;
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
        return this.f20983K;
    }

    public final C1375h getCurrentLocation() {
        int i = (this.c - this.g) + 1;
        return new C1375h(this.a.m3194a(), this.e + ((long) this.c), -1, this.f, i);
    }

    public final Object getInputSource() {
        return this.f20990R;
    }

    public final String getText() {
        if (this._currToken != C1380m.VALUE_STRING) {
            C1380m c1380m = this._currToken;
            if (c1380m == null) {
                return null;
            }
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
        } else if (!this.f20986N) {
            return this.m.m3338f();
        } else {
            this.f20986N = false;
            return m19325n();
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
                if (this.f20986N) {
                    this.f20986N = false;
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
                if (this.f20986N) {
                    this.f20986N = false;
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
        r0 = r2.f20986N;
        if (r0 == 0) goto L_0x0016;
    L_0x0011:
        r2.f20986N = r1;
        r2.mo3509c();
    L_0x0016:
        r0 = r2.m;
        r0 = r0.m3336d();
        return r0;
    L_0x001d:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.b.d.i.getTextOffset():int");
    }

    public final C1375h getTokenLocation() {
        Object a = this.a.m3194a();
        if (this._currToken == C1380m.FIELD_NAME) {
            return new C1375h(a, this.e + ((long) (this.f20987O - 1)), -1, this.f20988P, this.f20989Q);
        }
        return new C1375h(a, this.h - 1, -1, this.i, this.j);
    }

    public final int getValueAsInt() {
        C1380m c1380m = this._currToken;
        if (c1380m != C1380m.VALUE_NUMBER_INT) {
            if (c1380m != C1380m.VALUE_NUMBER_FLOAT) {
                return super.getValueAsInt(0);
            }
        }
        if ((this.z & 1) == 0) {
            if (this.z == 0) {
                return m18222h();
            }
            if ((this.z & 1) == 0) {
                m18223i();
            }
        }
        return this.A;
    }

    public final int getValueAsInt(int i) {
        C1380m c1380m = this._currToken;
        if (c1380m != C1380m.VALUE_NUMBER_INT) {
            if (c1380m != C1380m.VALUE_NUMBER_FLOAT) {
                return super.getValueAsInt(i);
            }
        }
        if ((this.z & 1) == 0) {
            if (this.z == 0) {
                return m18222h();
            }
            if ((this.z & 1) == 0) {
                m18223i();
            }
        }
        return this.A;
    }

    public final String getValueAsString() {
        if (this._currToken != C1380m.VALUE_STRING) {
            return this._currToken == C1380m.FIELD_NAME ? getCurrentName() : super.getValueAsString(null);
        } else {
            if (!this.f20986N) {
                return this.m.m3338f();
            }
            this.f20986N = false;
            return m19325n();
        }
    }

    public final String getValueAsString(String str) {
        if (this._currToken != C1380m.VALUE_STRING) {
            return this._currToken == C1380m.FIELD_NAME ? getCurrentName() : super.getValueAsString(str);
        } else {
            if (!this.f20986N) {
                return this.m.m3338f();
            }
            this.f20986N = false;
            return m19325n();
        }
    }

    protected final char mo3512j() {
        if (this.c >= this.d && !mo3508b()) {
            _reportInvalidEOF(" in character escape sequence");
        }
        byte[] bArr = this.f20991S;
        int i = this.c;
        this.c = i + 1;
        byte b = bArr[i];
        if (b == (byte) 34 || b == (byte) 47 || b == (byte) 92) {
            return (char) b;
        }
        if (b == (byte) 98) {
            return '\b';
        }
        if (b == (byte) 102) {
            return '\f';
        }
        if (b == (byte) 110) {
            return '\n';
        }
        if (b == (byte) 114) {
            return '\r';
        }
        switch (b) {
            case (byte) 116:
                return '\t';
            case (byte) 117:
                int i2 = 0;
                i = 0;
                while (i2 < 4) {
                    if (this.c >= this.d && !mo3508b()) {
                        _reportInvalidEOF(" in character escape sequence");
                    }
                    byte[] bArr2 = this.f20991S;
                    int i3 = this.c;
                    this.c = i3 + 1;
                    byte b2 = bArr2[i3];
                    i3 = C1345a.m3178a(b2);
                    if (i3 < 0) {
                        _reportUnexpectedChar(b2, "expected a hex-digit for character escape sequence");
                    }
                    i = (i << 4) | i3;
                    i2++;
                }
                return (char) i;
            default:
                return _handleUnrecognizedCharacterEscape((char) m19314f(b));
        }
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
        return c1380m == C1380m.VALUE_TRUE ? Boolean.TRUE : c1380m == C1380m.VALUE_FALSE ? Boolean.FALSE : null;
    }

    public final String nextFieldName() {
        this.z = 0;
        if (this._currToken == C1380m.FIELD_NAME) {
            m19319k();
            return null;
        }
        if (this.f20986N) {
            m19326o();
        }
        int r = m19329r();
        if (r < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this.q = null;
        if (r == 93) {
            m19285C();
            if (!this.k.m3357b()) {
                m18212a(r, '}');
            }
            this.k = this.k.m10991k();
            this._currToken = C1380m.END_ARRAY;
            return null;
        } else if (r == 125) {
            m19285C();
            if (!this.k.m3359d()) {
                m18212a(r, ']');
            }
            this.k = this.k.m10991k();
            this._currToken = C1380m.END_OBJECT;
            return null;
        } else {
            if (this.k.m10993m()) {
                if (r != 44) {
                    StringBuilder stringBuilder = new StringBuilder("was expecting comma to separate ");
                    stringBuilder.append(this.k.m3360e());
                    stringBuilder.append(" entries");
                    _reportUnexpectedChar(r, stringBuilder.toString());
                }
                r = m19327p();
            }
            if (this.k.m3359d()) {
                m19286D();
                String d = m19312d(r);
                this.k.m10985a(d);
                this._currToken = C1380m.FIELD_NAME;
                int t = m19331t();
                m19285C();
                if (t == 34) {
                    this.f20986N = true;
                    this.l = C1380m.VALUE_STRING;
                    return d;
                }
                C1380m l;
                if (t == 45) {
                    l = m19321l();
                } else if (t == 91) {
                    l = C1380m.START_ARRAY;
                } else if (t == 102) {
                    m19299a("false", 1);
                    l = C1380m.VALUE_FALSE;
                } else if (t == 110) {
                    m19299a("null", 1);
                    l = C1380m.VALUE_NULL;
                } else if (t == 116) {
                    m19299a("true", 1);
                    l = C1380m.VALUE_TRUE;
                } else if (t != 123) {
                    switch (t) {
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
                            l = m19305b(t);
                            break;
                        default:
                            l = m19313e(t);
                            break;
                    }
                } else {
                    l = C1380m.START_OBJECT;
                }
                this.l = l;
                return d;
            }
            m19285C();
            m19288a(r);
            return null;
        }
    }

    public final boolean nextFieldName(com.p111d.p112a.p114b.C1382p r15) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:99:0x0193 in {3, 6, 10, 15, 17, 21, 23, 28, 29, 33, 47, 48, 50, 54, 55, 56, 57, 60, 61, 62, 68, 70, 75, 76, 88, 90, 91, 92, 93, 94, 95, 96, 97, 98, 102, 106, 116, 117, 118, 119, 120, 121, 122, 123, 125} preds:[]
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
        r14.m19319k();
        return r0;
    L_0x000d:
        r1 = r14.f20986N;
        if (r1 == 0) goto L_0x0014;
    L_0x0011:
        r14.m19326o();
    L_0x0014:
        r1 = r14.m19329r();
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
        r14.m19285C();
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
        r14.m19285C();
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
        if (r2 == 0) goto L_0x008d;
    L_0x0069:
        r2 = 44;
        if (r1 == r2) goto L_0x0089;
    L_0x006d:
        r2 = new java.lang.StringBuilder;
        r3 = "was expecting comma to separate ";
        r2.<init>(r3);
        r3 = r14.k;
        r3 = r3.m3360e();
        r2.append(r3);
        r3 = " entries";
        r2.append(r3);
        r2 = r2.toString();
        r14._reportUnexpectedChar(r1, r2);
    L_0x0089:
        r1 = r14.m19327p();
    L_0x008d:
        r2 = r14.k;
        r2 = r2.m3359d();
        if (r2 != 0) goto L_0x009c;
    L_0x0095:
        r14.m19285C();
        r14.m19288a(r1);
        return r0;
    L_0x009c:
        r14.m19286D();
        r2 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r3 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r4 = 91;
        r5 = 45;
        r6 = 34;
        r7 = 1;
        if (r1 != r6) goto L_0x01a2;
    L_0x00ac:
        r8 = r15.asQuotedUTF8();
        r9 = r8.length;
        r10 = r14.c;
        r10 = r10 + r9;
        r10 = r10 + 4;
        r11 = r14.d;
        if (r10 >= r11) goto L_0x01a2;
    L_0x00ba:
        r10 = r14.c;
        r10 = r10 + r9;
        r9 = r14.f20991S;
        r9 = r9[r10];
        if (r9 != r6) goto L_0x01a2;
    L_0x00c3:
        r9 = r14.c;
        r11 = r0;
    L_0x00c6:
        if (r9 != r10) goto L_0x0194;
    L_0x00c8:
        r1 = r14.k;
        r15 = r15.getValue();
        r1.m10985a(r15);
        r9 = r9 + r7;
        r15 = r14.f20991S;
        r1 = r9 + 1;
        r15 = r15[r9];
        r8 = 58;
        r9 = 9;
        r10 = 35;
        r11 = 47;
        r12 = 32;
        if (r15 != r8) goto L_0x010f;
    L_0x00e4:
        r15 = r14.f20991S;
        r0 = r1 + 1;
        r15 = r15[r1];
        if (r15 <= r12) goto L_0x00f3;
    L_0x00ec:
        if (r15 == r11) goto L_0x0107;
    L_0x00ee:
        if (r15 == r10) goto L_0x0107;
    L_0x00f0:
        r14.c = r0;
        goto L_0x0143;
    L_0x00f3:
        if (r15 == r12) goto L_0x00f7;
    L_0x00f5:
        if (r15 != r9) goto L_0x0107;
    L_0x00f7:
        r15 = r14.f20991S;
        r1 = r0 + 1;
        r15 = r15[r0];
        if (r15 <= r12) goto L_0x0106;
    L_0x00ff:
        if (r15 == r11) goto L_0x0106;
    L_0x0101:
        if (r15 == r10) goto L_0x0106;
    L_0x0103:
        r14.c = r1;
        goto L_0x0143;
    L_0x0106:
        r0 = r1;
    L_0x0107:
        r0 = r0 - r7;
        r14.c = r0;
        r15 = r14.m19287a(r7);
        goto L_0x0143;
    L_0x010f:
        if (r15 == r12) goto L_0x0116;
    L_0x0111:
        if (r15 != r9) goto L_0x0114;
    L_0x0113:
        goto L_0x0116;
    L_0x0114:
        r13 = r1;
        goto L_0x011c;
    L_0x0116:
        r15 = r14.f20991S;
        r13 = r1 + 1;
        r15 = r15[r1];
    L_0x011c:
        if (r15 != r8) goto L_0x013c;
    L_0x011e:
        r15 = r14.f20991S;
        r0 = r13 + 1;
        r15 = r15[r13];
        if (r15 <= r12) goto L_0x012b;
    L_0x0126:
        if (r15 == r11) goto L_0x0107;
    L_0x0128:
        if (r15 == r10) goto L_0x0107;
    L_0x012a:
        goto L_0x00f0;
    L_0x012b:
        if (r15 == r12) goto L_0x012f;
    L_0x012d:
        if (r15 != r9) goto L_0x0107;
    L_0x012f:
        r15 = r14.f20991S;
        r1 = r0 + 1;
        r15 = r15[r0];
        if (r15 <= r12) goto L_0x0106;
    L_0x0137:
        if (r15 == r11) goto L_0x0106;
    L_0x0139:
        if (r15 == r10) goto L_0x0106;
    L_0x013b:
        goto L_0x0103;
    L_0x013c:
        r13 = r13 - r7;
        r14.c = r13;
        r15 = r14.m19287a(r0);
    L_0x0143:
        r0 = com.p111d.p112a.p114b.C1380m.FIELD_NAME;
        r14._currToken = r0;
        r14.m19285C();
        if (r15 == r6) goto L_0x018e;
    L_0x014c:
        if (r15 == r5) goto L_0x0189;
    L_0x014e:
        if (r15 == r4) goto L_0x0186;
    L_0x0150:
        if (r15 == r3) goto L_0x017e;
    L_0x0152:
        if (r15 == r2) goto L_0x0176;
    L_0x0154:
        r0 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        if (r15 == r0) goto L_0x016e;
    L_0x0158:
        r0 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        if (r15 == r0) goto L_0x016b;
    L_0x015c:
        switch(r15) {
            case 48: goto L_0x0166;
            case 49: goto L_0x0166;
            case 50: goto L_0x0166;
            case 51: goto L_0x0166;
            case 52: goto L_0x0166;
            case 53: goto L_0x0166;
            case 54: goto L_0x0166;
            case 55: goto L_0x0166;
            case 56: goto L_0x0166;
            case 57: goto L_0x0166;
            default: goto L_0x015f;
        };
    L_0x015f:
        r15 = r14.m19313e(r15);
    L_0x0163:
        r14.l = r15;
        return r7;
    L_0x0166:
        r15 = r14.m19305b(r15);
        goto L_0x0163;
    L_0x016b:
        r15 = com.p111d.p112a.p114b.C1380m.START_OBJECT;
        goto L_0x0163;
    L_0x016e:
        r15 = "true";
        r14.m19299a(r15, r7);
        r15 = com.p111d.p112a.p114b.C1380m.VALUE_TRUE;
        goto L_0x0163;
    L_0x0176:
        r15 = "null";
        r14.m19299a(r15, r7);
        r15 = com.p111d.p112a.p114b.C1380m.VALUE_NULL;
        goto L_0x0163;
    L_0x017e:
        r15 = "false";
        r14.m19299a(r15, r7);
        r15 = com.p111d.p112a.p114b.C1380m.VALUE_FALSE;
        goto L_0x0163;
    L_0x0186:
        r15 = com.p111d.p112a.p114b.C1380m.START_ARRAY;
        goto L_0x0163;
    L_0x0189:
        r15 = r14.m19321l();
        goto L_0x0163;
    L_0x018e:
        r14.f20986N = r7;
        r15 = com.p111d.p112a.p114b.C1380m.VALUE_STRING;
        goto L_0x0163;
        return r7;
    L_0x0194:
        r12 = r8[r11];
        r13 = r14.f20991S;
        r13 = r13[r9];
        if (r12 != r13) goto L_0x01a2;
    L_0x019c:
        r11 = r11 + 1;
        r9 = r9 + 1;
        goto L_0x00c6;
    L_0x01a2:
        r0 = r14.m19312d(r1);
        r1 = r14.k;
        r1.m10985a(r0);
        r15 = r15.getValue();
        r15 = r0.equals(r15);
        r0 = com.p111d.p112a.p114b.C1380m.FIELD_NAME;
        r14._currToken = r0;
        r0 = r14.m19331t();
        r14.m19285C();
        if (r0 != r6) goto L_0x01c7;
    L_0x01c0:
        r14.f20986N = r7;
        r0 = com.p111d.p112a.p114b.C1380m.VALUE_STRING;
        r14.l = r0;
        return r15;
    L_0x01c7:
        if (r0 == r5) goto L_0x0202;
    L_0x01c9:
        if (r0 == r4) goto L_0x01ff;
    L_0x01cb:
        if (r0 == r3) goto L_0x01f7;
    L_0x01cd:
        if (r0 == r2) goto L_0x01ef;
    L_0x01cf:
        r1 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        if (r0 == r1) goto L_0x01e7;
    L_0x01d3:
        r1 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        if (r0 == r1) goto L_0x01e4;
    L_0x01d7:
        switch(r0) {
            case 48: goto L_0x01df;
            case 49: goto L_0x01df;
            case 50: goto L_0x01df;
            case 51: goto L_0x01df;
            case 52: goto L_0x01df;
            case 53: goto L_0x01df;
            case 54: goto L_0x01df;
            case 55: goto L_0x01df;
            case 56: goto L_0x01df;
            case 57: goto L_0x01df;
            default: goto L_0x01da;
        };
    L_0x01da:
        r0 = r14.m19313e(r0);
        goto L_0x0206;
    L_0x01df:
        r0 = r14.m19305b(r0);
        goto L_0x0206;
    L_0x01e4:
        r0 = com.p111d.p112a.p114b.C1380m.START_OBJECT;
        goto L_0x0206;
    L_0x01e7:
        r0 = "true";
        r14.m19299a(r0, r7);
        r0 = com.p111d.p112a.p114b.C1380m.VALUE_TRUE;
        goto L_0x0206;
    L_0x01ef:
        r0 = "null";
        r14.m19299a(r0, r7);
        r0 = com.p111d.p112a.p114b.C1380m.VALUE_NULL;
        goto L_0x0206;
    L_0x01f7:
        r0 = "false";
        r14.m19299a(r0, r7);
        r0 = com.p111d.p112a.p114b.C1380m.VALUE_FALSE;
        goto L_0x0206;
    L_0x01ff:
        r0 = com.p111d.p112a.p114b.C1380m.START_ARRAY;
        goto L_0x0206;
    L_0x0202:
        r0 = r14.m19321l();
    L_0x0206:
        r14.l = r0;
        return r15;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.b.d.i.nextFieldName(com.d.a.b.p):boolean");
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
            if (c1380m != C1380m.VALUE_STRING) {
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
            } else if (!this.f20986N) {
                return this.m.m3338f();
            } else {
                this.f20986N = false;
                return m19325n();
            }
        }
    }

    public final C1380m nextToken() {
        if (this._currToken == C1380m.FIELD_NAME) {
            return m19319k();
        }
        this.z = 0;
        if (this.f20986N) {
            m19326o();
        }
        int r = m19329r();
        if (r < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this.q = null;
        C1380m c1380m;
        if (r == 93) {
            m19285C();
            if (!this.k.m3357b()) {
                m18212a(r, '}');
            }
            this.k = this.k.m10991k();
            c1380m = C1380m.END_ARRAY;
            this._currToken = c1380m;
            return c1380m;
        } else if (r == 125) {
            m19285C();
            if (!this.k.m3359d()) {
                m18212a(r, ']');
            }
            this.k = this.k.m10991k();
            c1380m = C1380m.END_OBJECT;
            this._currToken = c1380m;
            return c1380m;
        } else {
            if (this.k.m10993m()) {
                if (r != 44) {
                    StringBuilder stringBuilder = new StringBuilder("was expecting comma to separate ");
                    stringBuilder.append(this.k.m3360e());
                    stringBuilder.append(" entries");
                    _reportUnexpectedChar(r, stringBuilder.toString());
                }
                r = m19327p();
            }
            if (this.k.m3359d()) {
                m19286D();
                this.k.m10985a(m19312d(r));
                this._currToken = C1380m.FIELD_NAME;
                r = m19331t();
                m19285C();
                if (r == 34) {
                    this.f20986N = true;
                    this.l = C1380m.VALUE_STRING;
                    return this._currToken;
                }
                if (r == 45) {
                    c1380m = m19321l();
                } else if (r == 91) {
                    c1380m = C1380m.START_ARRAY;
                } else if (r == 102) {
                    m19299a("false", 1);
                    c1380m = C1380m.VALUE_FALSE;
                } else if (r == 110) {
                    m19299a("null", 1);
                    c1380m = C1380m.VALUE_NULL;
                } else if (r == 116) {
                    m19299a("true", 1);
                    c1380m = C1380m.VALUE_TRUE;
                } else if (r != 123) {
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
                            c1380m = m19305b(r);
                            break;
                        default:
                            c1380m = m19313e(r);
                            break;
                    }
                } else {
                    c1380m = C1380m.START_OBJECT;
                }
                this.l = c1380m;
                return this._currToken;
            }
            m19285C();
            return m19288a(r);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int readBinaryValue(com.p111d.p112a.p114b.C1341a r14, java.io.OutputStream r15) {
        /*
        r13 = this;
        r0 = r13.f20986N;
        if (r0 == 0) goto L_0x015d;
    L_0x0004:
        r0 = r13._currToken;
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_STRING;
        if (r0 == r1) goto L_0x000c;
    L_0x000a:
        goto L_0x015d;
    L_0x000c:
        r0 = r13.a;
        r0 = r0.m3209g();
        r1 = r0.length;	 Catch:{ all -> 0x0156 }
        r2 = 3;
        r1 = r1 - r2;
        r3 = 0;
        r4 = r3;
        r5 = r4;
    L_0x0018:
        r6 = r13.c;	 Catch:{ all -> 0x0156 }
        r7 = r13.d;	 Catch:{ all -> 0x0156 }
        if (r6 < r7) goto L_0x0021;
    L_0x001e:
        r13.m18211a();	 Catch:{ all -> 0x0156 }
    L_0x0021:
        r6 = r13.f20991S;	 Catch:{ all -> 0x0156 }
        r7 = r13.c;	 Catch:{ all -> 0x0156 }
        r8 = r7 + 1;
        r13.c = r8;	 Catch:{ all -> 0x0156 }
        r6 = r6[r7];	 Catch:{ all -> 0x0156 }
        r6 = r6 & 255;
        r7 = 32;
        if (r6 <= r7) goto L_0x0018;
    L_0x0031:
        r7 = r14.m3173b(r6);	 Catch:{ all -> 0x0156 }
        r8 = 34;
        if (r7 >= 0) goto L_0x0041;
    L_0x0039:
        if (r6 == r8) goto L_0x011a;
    L_0x003b:
        r7 = r13.m18207a(r14, r6, r3);	 Catch:{ all -> 0x0156 }
        if (r7 < 0) goto L_0x0018;
    L_0x0041:
        if (r4 <= r1) goto L_0x0048;
    L_0x0043:
        r5 = r5 + r4;
        r15.write(r0, r3, r4);	 Catch:{ all -> 0x0156 }
        r4 = r3;
    L_0x0048:
        r6 = r13.c;	 Catch:{ all -> 0x0156 }
        r9 = r13.d;	 Catch:{ all -> 0x0156 }
        if (r6 < r9) goto L_0x0051;
    L_0x004e:
        r13.m18211a();	 Catch:{ all -> 0x0156 }
    L_0x0051:
        r6 = r13.f20991S;	 Catch:{ all -> 0x0156 }
        r9 = r13.c;	 Catch:{ all -> 0x0156 }
        r10 = r9 + 1;
        r13.c = r10;	 Catch:{ all -> 0x0156 }
        r6 = r6[r9];	 Catch:{ all -> 0x0156 }
        r6 = r6 & 255;
        r9 = r14.m3173b(r6);	 Catch:{ all -> 0x0156 }
        if (r9 >= 0) goto L_0x0068;
    L_0x0063:
        r9 = 1;
        r9 = r13.m18207a(r14, r6, r9);	 Catch:{ all -> 0x0156 }
    L_0x0068:
        r6 = r7 << 6;
        r6 = r6 | r9;
        r7 = r13.c;	 Catch:{ all -> 0x0156 }
        r9 = r13.d;	 Catch:{ all -> 0x0156 }
        if (r7 < r9) goto L_0x0074;
    L_0x0071:
        r13.m18211a();	 Catch:{ all -> 0x0156 }
    L_0x0074:
        r7 = r13.f20991S;	 Catch:{ all -> 0x0156 }
        r9 = r13.c;	 Catch:{ all -> 0x0156 }
        r10 = r9 + 1;
        r13.c = r10;	 Catch:{ all -> 0x0156 }
        r7 = r7[r9];	 Catch:{ all -> 0x0156 }
        r7 = r7 & 255;
        r9 = r14.m3173b(r7);	 Catch:{ all -> 0x0156 }
        r10 = 2;
        r11 = -2;
        if (r9 >= 0) goto L_0x00e4;
    L_0x0088:
        if (r9 == r11) goto L_0x00a1;
    L_0x008a:
        if (r7 != r8) goto L_0x009c;
    L_0x008c:
        r9 = r14.m3167a();	 Catch:{ all -> 0x0156 }
        if (r9 != 0) goto L_0x009c;
    L_0x0092:
        r14 = r6 >> 4;
        r1 = r4 + 1;
        r14 = (byte) r14;	 Catch:{ all -> 0x0156 }
        r0[r4] = r14;	 Catch:{ all -> 0x0156 }
        r4 = r1;
        goto L_0x011a;
    L_0x009c:
        r7 = r13.m18207a(r14, r7, r10);	 Catch:{ all -> 0x0156 }
        r9 = r7;
    L_0x00a1:
        if (r9 != r11) goto L_0x00e4;
    L_0x00a3:
        r7 = r13.c;	 Catch:{ all -> 0x0156 }
        r8 = r13.d;	 Catch:{ all -> 0x0156 }
        if (r7 < r8) goto L_0x00ac;
    L_0x00a9:
        r13.m18211a();	 Catch:{ all -> 0x0156 }
    L_0x00ac:
        r7 = r13.f20991S;	 Catch:{ all -> 0x0156 }
        r8 = r13.c;	 Catch:{ all -> 0x0156 }
        r9 = r8 + 1;
        r13.c = r9;	 Catch:{ all -> 0x0156 }
        r7 = r7[r8];	 Catch:{ all -> 0x0156 }
        r7 = r7 & 255;
        r8 = r14.m3169a(r7);	 Catch:{ all -> 0x0156 }
        if (r8 != 0) goto L_0x00da;
    L_0x00be:
        r15 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0156 }
        r1 = "expected padding character '";
        r15.<init>(r1);	 Catch:{ all -> 0x0156 }
        r1 = r14.m3171b();	 Catch:{ all -> 0x0156 }
        r15.append(r1);	 Catch:{ all -> 0x0156 }
        r1 = "'";
        r15.append(r1);	 Catch:{ all -> 0x0156 }
        r15 = r15.toString();	 Catch:{ all -> 0x0156 }
        r14 = com.p111d.p112a.p114b.p539a.C7041b.m18201a(r14, r7, r2, r15);	 Catch:{ all -> 0x0156 }
        throw r14;	 Catch:{ all -> 0x0156 }
    L_0x00da:
        r6 = r6 >> 4;
        r7 = r4 + 1;
        r6 = (byte) r6;	 Catch:{ all -> 0x0156 }
        r0[r4] = r6;	 Catch:{ all -> 0x0156 }
    L_0x00e1:
        r4 = r7;
        goto L_0x0018;
    L_0x00e4:
        r6 = r6 << 6;
        r6 = r6 | r9;
        r7 = r13.c;	 Catch:{ all -> 0x0156 }
        r9 = r13.d;	 Catch:{ all -> 0x0156 }
        if (r7 < r9) goto L_0x00f0;
    L_0x00ed:
        r13.m18211a();	 Catch:{ all -> 0x0156 }
    L_0x00f0:
        r7 = r13.f20991S;	 Catch:{ all -> 0x0156 }
        r9 = r13.c;	 Catch:{ all -> 0x0156 }
        r12 = r9 + 1;
        r13.c = r12;	 Catch:{ all -> 0x0156 }
        r7 = r7[r9];	 Catch:{ all -> 0x0156 }
        r7 = r7 & 255;
        r9 = r14.m3173b(r7);	 Catch:{ all -> 0x0156 }
        if (r9 >= 0) goto L_0x013f;
    L_0x0102:
        if (r9 == r11) goto L_0x012d;
    L_0x0104:
        if (r7 != r8) goto L_0x0128;
    L_0x0106:
        r8 = r14.m3167a();	 Catch:{ all -> 0x0156 }
        if (r8 != 0) goto L_0x0128;
    L_0x010c:
        r14 = r6 >> 2;
        r1 = r4 + 1;
        r2 = r14 >> 8;
        r2 = (byte) r2;	 Catch:{ all -> 0x0156 }
        r0[r4] = r2;	 Catch:{ all -> 0x0156 }
        r4 = r1 + 1;
        r14 = (byte) r14;	 Catch:{ all -> 0x0156 }
        r0[r1] = r14;	 Catch:{ all -> 0x0156 }
    L_0x011a:
        r13.f20986N = r3;	 Catch:{ all -> 0x0156 }
        if (r4 <= 0) goto L_0x0122;
    L_0x011e:
        r5 = r5 + r4;
        r15.write(r0, r3, r4);	 Catch:{ all -> 0x0156 }
    L_0x0122:
        r14 = r13.a;
        r14.m3203c(r0);
        return r5;
    L_0x0128:
        r7 = r13.m18207a(r14, r7, r2);	 Catch:{ all -> 0x0156 }
        r9 = r7;
    L_0x012d:
        if (r9 != r11) goto L_0x013f;
    L_0x012f:
        r6 = r6 >> 2;
        r7 = r4 + 1;
        r8 = r6 >> 8;
        r8 = (byte) r8;	 Catch:{ all -> 0x0156 }
        r0[r4] = r8;	 Catch:{ all -> 0x0156 }
        r4 = r7 + 1;
        r6 = (byte) r6;	 Catch:{ all -> 0x0156 }
        r0[r7] = r6;	 Catch:{ all -> 0x0156 }
        goto L_0x0018;
    L_0x013f:
        r6 = r6 << 6;
        r6 = r6 | r9;
        r7 = r4 + 1;
        r8 = r6 >> 16;
        r8 = (byte) r8;	 Catch:{ all -> 0x0156 }
        r0[r4] = r8;	 Catch:{ all -> 0x0156 }
        r4 = r7 + 1;
        r8 = r6 >> 8;
        r8 = (byte) r8;	 Catch:{ all -> 0x0156 }
        r0[r7] = r8;	 Catch:{ all -> 0x0156 }
        r7 = r4 + 1;
        r6 = (byte) r6;	 Catch:{ all -> 0x0156 }
        r0[r4] = r6;	 Catch:{ all -> 0x0156 }
        goto L_0x00e1;
    L_0x0156:
        r14 = move-exception;
        r15 = r13.a;
        r15.m3203c(r0);
        throw r14;
    L_0x015d:
        r14 = r13.getBinaryValue(r14);
        r15.write(r14);
        r14 = r14.length;
        return r14;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.b.d.i.readBinaryValue(com.d.a.b.a, java.io.OutputStream):int");
    }

    public final int releaseBuffered(OutputStream outputStream) {
        int i = this.d - this.c;
        if (i <= 0) {
            return 0;
        }
        outputStream.write(this.f20991S, this.c, i);
        return i;
    }

    public final void setCodec(C5304n c5304n) {
        this.f20983K = c5304n;
    }
}
