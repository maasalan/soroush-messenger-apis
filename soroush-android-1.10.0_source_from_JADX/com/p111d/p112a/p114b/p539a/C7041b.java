package com.p111d.p112a.p114b.p539a;

import com.p111d.p112a.p114b.C1341a;
import com.p111d.p112a.p114b.C1375h;
import com.p111d.p112a.p114b.C1379l;
import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C1385s;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p114b.C5303j.C1376a;
import com.p111d.p112a.p114b.C5303j.C1377b;
import com.p111d.p112a.p114b.p116c.C1347c;
import com.p111d.p112a.p114b.p116c.C1351g;
import com.p111d.p112a.p114b.p117d.C1358b;
import com.p111d.p112a.p114b.p117d.C5294d;
import com.p111d.p112a.p114b.p117d.C5296f;
import com.p111d.p112a.p114b.p120g.C1369b;
import com.p111d.p112a.p114b.p120g.C1373i;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class C7041b extends C6465c {
    static final BigInteger f20080r = BigInteger.valueOf(-2147483648L);
    static final BigInteger f20081s = BigInteger.valueOf(2147483647L);
    static final BigInteger f20082t = BigInteger.valueOf(Long.MIN_VALUE);
    static final BigInteger f20083u = BigInteger.valueOf(Long.MAX_VALUE);
    static final BigDecimal f20084v = new BigDecimal(f20082t);
    static final BigDecimal f20085w = new BigDecimal(f20083u);
    static final BigDecimal f20086x = new BigDecimal(f20080r);
    static final BigDecimal f20087y = new BigDecimal(f20081s);
    protected int f20088A;
    protected long f20089B;
    protected double f20090C;
    protected BigInteger f20091D;
    protected BigDecimal f20092E;
    protected boolean f20093F;
    protected int f20094G;
    protected int f20095H;
    protected int f20096I;
    protected final C1347c f20097a;
    protected boolean f20098b;
    protected int f20099c;
    protected int f20100d;
    protected long f20101e;
    protected int f20102f = 1;
    protected int f20103g;
    protected long f20104h;
    protected int f20105i = 1;
    protected int f20106j;
    protected C5294d f20107k;
    protected C1380m f20108l;
    protected final C1373i f20109m;
    protected char[] f20110n;
    protected boolean f20111o;
    protected C1369b f20112p;
    protected byte[] f20113q;
    protected int f20114z = 0;

    protected C7041b(C1347c c1347c, int i) {
        super(i);
        this.f20097a = c1347c;
        this.f20109m = c1347c.m3206d();
        this.f20107k = C5294d.m10980b(C1376a.STRICT_DUPLICATE_DETECTION.m3351a(i) ? C1358b.m3265a((C5303j) this) : null);
    }

    protected static IllegalArgumentException m18201a(C1341a c1341a, int i, int i2, String str) {
        StringBuilder stringBuilder;
        String str2;
        StringBuilder stringBuilder2;
        String stringBuilder3;
        if (i <= 32) {
            stringBuilder = new StringBuilder("Illegal white space character (code 0x");
            stringBuilder.append(Integer.toHexString(i));
            stringBuilder.append(") as character #");
            stringBuilder.append(i2 + 1);
            str2 = " of 4-char base64 unit: can only used between units";
        } else if (c1341a.m3169a(i)) {
            stringBuilder2 = new StringBuilder("Unexpected padding character ('");
            stringBuilder2.append(c1341a.m3171b());
            stringBuilder2.append("') as character #");
            stringBuilder2.append(i2 + 1);
            stringBuilder2.append(" of 4-char base64 unit: padding only legal as 3rd or 4th character");
            stringBuilder3 = stringBuilder2.toString();
            if (str != null) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(stringBuilder3);
                stringBuilder2.append(": ");
                stringBuilder2.append(str);
                stringBuilder3 = stringBuilder2.toString();
            }
            return new IllegalArgumentException(stringBuilder3);
        } else {
            if (Character.isDefined(i)) {
                if (!Character.isISOControl(i)) {
                    stringBuilder = new StringBuilder("Illegal character '");
                    stringBuilder.append((char) i);
                    stringBuilder.append("' (code 0x");
                    stringBuilder.append(Integer.toHexString(i));
                    str2 = ") in base64 content";
                }
            }
            stringBuilder = new StringBuilder("Illegal character (code 0x");
            stringBuilder.append(Integer.toHexString(i));
            str2 = ") in base64 content";
        }
        stringBuilder.append(str2);
        stringBuilder3 = stringBuilder.toString();
        if (str != null) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(stringBuilder3);
            stringBuilder2.append(": ");
            stringBuilder2.append(str);
            stringBuilder3 = stringBuilder2.toString();
        }
        return new IllegalArgumentException(stringBuilder3);
    }

    private void m18202a(int i) {
        StringBuilder stringBuilder;
        char[] e;
        if (this._currToken == C1380m.VALUE_NUMBER_INT) {
            e = this.f20109m.m3337e();
            int d = this.f20109m.m3336d();
            int i2 = this.f20094G;
            if (this.f20093F) {
                d++;
            }
            if (i2 <= 9) {
                i = C1351g.m3225a(e, d, i2);
                if (this.f20093F) {
                    i = -i;
                }
                this.f20088A = i;
                this.f20114z = 1;
            } else if (i2 <= 18) {
                long b = C1351g.m3230b(e, d, i2);
                if (this.f20093F) {
                    b = -b;
                }
                if (i2 == 10) {
                    if (this.f20093F) {
                        if (b >= -2147483648L) {
                            this.f20088A = (int) b;
                            this.f20114z = 1;
                            return;
                        }
                    } else if (b <= 2147483647L) {
                        this.f20088A = (int) b;
                        this.f20114z = 1;
                        return;
                    }
                }
                this.f20089B = b;
                this.f20114z = 2;
            } else {
                String f = this.f20109m.m3338f();
                try {
                    if (C1351g.m3228a(e, d, i2, this.f20093F)) {
                        this.f20089B = Long.parseLong(f);
                        this.f20114z = 2;
                        return;
                    }
                    this.f20091D = new BigInteger(f);
                    this.f20114z = 4;
                } catch (Throwable e2) {
                    stringBuilder = new StringBuilder("Malformed numeric value '");
                    stringBuilder.append(f);
                    stringBuilder.append("'");
                    _wrapError(stringBuilder.toString(), e2);
                }
            }
        } else if (this._currToken != C1380m.VALUE_NUMBER_FLOAT) {
            StringBuilder stringBuilder2 = new StringBuilder("Current token (");
            stringBuilder2.append(this._currToken);
            stringBuilder2.append(") not numeric, can not use numeric value accessors");
            _reportError(stringBuilder2.toString());
        } else if (i == 16) {
            try {
                BigDecimal c;
                C1373i c1373i = this.f20109m;
                if (c1373i.f4342k != null) {
                    e = c1373i.f4342k;
                } else {
                    char[] cArr;
                    int i3;
                    if (c1373i.f4335d >= 0 && c1373i.f4334c != null) {
                        cArr = c1373i.f4334c;
                        i3 = c1373i.f4335d;
                        i = c1373i.f4336e;
                    } else if (c1373i.f4338g != 0 || c1373i.f4339h == null) {
                        e = c1373i.m3339g();
                    } else {
                        cArr = c1373i.f4339h;
                        i3 = 0;
                        i = c1373i.f4340i;
                    }
                    c = C1351g.m3231c(cArr, i3, i);
                    this.f20092E = c;
                    this.f20114z = 16;
                }
                c = C1351g.m3227a(e);
                this.f20092E = c;
                this.f20114z = 16;
            } catch (Throwable e22) {
                stringBuilder = new StringBuilder("Malformed numeric value '");
                stringBuilder.append(this.f20109m.m3338f());
                stringBuilder.append("'");
                _wrapError(stringBuilder.toString(), e22);
            }
        } else {
            this.f20090C = C1351g.m3233d(this.f20109m.m3338f());
            this.f20114z = 8;
        }
    }

    private void m18203a(int i, int i2) {
        int i3 = C1376a.STRICT_DUPLICATE_DETECTION.f4363l;
        if (!((i2 & i3) == 0 || (i & i3) == 0)) {
            if (this.f20107k.m10992l() == null) {
                this.f20107k = this.f20107k.m10982a(C1358b.m3265a((C5303j) this));
                return;
            }
            this.f20107k = this.f20107k.m10982a(null);
        }
    }

    private void m18204k() {
        StringBuilder stringBuilder = new StringBuilder("Numeric value (");
        stringBuilder.append(getText());
        stringBuilder.append(") out of range of int (-2147483648 - 2147483647)");
        _reportError(stringBuilder.toString());
    }

    private void m18205l() {
        StringBuilder stringBuilder = new StringBuilder("Numeric value (");
        stringBuilder.append(getText());
        stringBuilder.append(") out of range of long (-9223372036854775808 - 9223372036854775807)");
        _reportError(stringBuilder.toString());
    }

    protected void _handleEOF() {
        if (!this.f20107k.m3358c()) {
            StringBuilder stringBuilder = new StringBuilder(": expected close marker for ");
            stringBuilder.append(this.f20107k.m3360e());
            stringBuilder.append(" (from ");
            stringBuilder.append(this.f20107k.m10987b(this.f20097a.m3194a()));
            stringBuilder.append(")");
            _reportInvalidEOF(stringBuilder.toString());
        }
    }

    protected final int m18206a(C1341a c1341a, char c, int i) {
        if (c != '\\') {
            throw C7041b.m18201a(c1341a, (int) c, i, null);
        }
        int j = mo3512j();
        if (j <= 32 && i == 0) {
            return -1;
        }
        int b = c1341a.m3172b((char) j);
        if (b >= 0) {
            return b;
        }
        throw C7041b.m18201a(c1341a, j, i, null);
    }

    protected final int m18207a(C1341a c1341a, int i, int i2) {
        if (i != 92) {
            throw C7041b.m18201a(c1341a, i, i2, null);
        }
        i = mo3512j();
        if (i <= 32 && i2 == 0) {
            return -1;
        }
        int b = c1341a.m3173b(i);
        if (b >= 0) {
            return b;
        }
        throw C7041b.m18201a(c1341a, i, i2, null);
    }

    protected final C1380m m18208a(String str, double d) {
        C1373i c1373i = this.f20109m;
        c1373i.f4334c = null;
        c1373i.f4335d = -1;
        c1373i.f4336e = 0;
        c1373i.f4341j = str;
        c1373i.f4342k = null;
        if (c1373i.f4337f) {
            c1373i.m3333b();
        }
        c1373i.f4340i = 0;
        this.f20090C = d;
        this.f20114z = 8;
        return C1380m.VALUE_NUMBER_FLOAT;
    }

    protected final C1380m m18209a(boolean z, int i) {
        this.f20093F = z;
        this.f20094G = i;
        this.f20095H = 0;
        this.f20096I = 0;
        this.f20114z = 0;
        return C1380m.VALUE_NUMBER_INT;
    }

    protected final C1380m m18210a(boolean z, int i, int i2, int i3) {
        return (i2 > 0 || i3 > 0) ? m18215b(z, i, i2, i3) : m18209a(z, i);
    }

    protected final void m18211a() {
        if (!mo3508b()) {
            _reportInvalidEOF();
        }
    }

    protected final void m18212a(int i, char c) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f20107k.m10987b(this.f20097a.m3194a()));
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder("Unexpected close marker '");
        stringBuilder3.append((char) i);
        stringBuilder3.append("': expected '");
        stringBuilder3.append(c);
        stringBuilder3.append("' (for ");
        stringBuilder3.append(this.f20107k.m3360e());
        stringBuilder3.append(" starting at ");
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append(")");
        _reportError(stringBuilder3.toString());
    }

    protected final void m18213a(int i, String str) {
        StringBuilder stringBuilder = new StringBuilder("Unexpected character (");
        stringBuilder.append(C6465c._getCharDesc(i));
        stringBuilder.append(") in numeric value");
        String stringBuilder2 = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(stringBuilder2);
        stringBuilder.append(": ");
        stringBuilder.append(str);
        _reportError(stringBuilder.toString());
    }

    protected final void m18214a(String str) {
        StringBuilder stringBuilder = new StringBuilder("Invalid numeric value: ");
        stringBuilder.append(str);
        _reportError(stringBuilder.toString());
    }

    protected final C1380m m18215b(boolean z, int i, int i2, int i3) {
        this.f20093F = z;
        this.f20094G = i;
        this.f20095H = i2;
        this.f20096I = i3;
        this.f20114z = 0;
        return C1380m.VALUE_NUMBER_FLOAT;
    }

    public abstract boolean mo3508b();

    public abstract void mo3509c();

    public void close() {
        if (!this.f20098b) {
            this.f20098b = true;
            try {
                mo3510d();
            } finally {
                mo3511e();
            }
        }
    }

    public abstract void mo3510d();

    public C5303j disable(C1376a c1376a) {
        this._features &= c1376a.f4363l ^ -1;
        if (c1376a == C1376a.STRICT_DUPLICATE_DETECTION) {
            this.f20107k = this.f20107k.m10982a(null);
        }
        return this;
    }

    public void mo3511e() {
        C1373i c1373i = this.f20109m;
        if (c1373i.f4333b == null) {
            c1373i.m3330a();
        } else if (c1373i.f4339h != null) {
            c1373i.m3330a();
            char[] cArr = c1373i.f4339h;
            c1373i.f4339h = null;
            c1373i.f4333b.m3313a(2, cArr);
        }
        char[] cArr2 = this.f20110n;
        if (cArr2 != null) {
            this.f20110n = null;
            this.f20097a.m3204c(cArr2);
        }
    }

    public C5303j enable(C1376a c1376a) {
        this._features |= c1376a.f4363l;
        if (c1376a == C1376a.STRICT_DUPLICATE_DETECTION && this.f20107k.m10992l() == null) {
            this.f20107k = this.f20107k.m10982a(C1358b.m3265a((C5303j) this));
        }
        return this;
    }

    protected final int m18220f() {
        _handleEOF();
        return -1;
    }

    public final C1369b m18221g() {
        if (this.f20112p == null) {
            this.f20112p = new C1369b();
        } else {
            this.f20112p.m3318a();
        }
        return this.f20112p;
    }

    public BigInteger getBigIntegerValue() {
        if ((this.f20114z & 4) == 0) {
            if (this.f20114z == 0) {
                m18202a(4);
            }
            if ((this.f20114z & 4) == 0) {
                BigDecimal bigDecimal;
                BigInteger valueOf;
                if ((this.f20114z & 16) != 0) {
                    bigDecimal = this.f20092E;
                } else {
                    long j;
                    if ((this.f20114z & 2) != 0) {
                        j = this.f20089B;
                    } else if ((this.f20114z & 1) != 0) {
                        j = (long) this.f20088A;
                    } else if ((this.f20114z & 8) != 0) {
                        bigDecimal = BigDecimal.valueOf(this.f20090C);
                    } else {
                        _throwInternal();
                        this.f20114z |= 4;
                    }
                    valueOf = BigInteger.valueOf(j);
                    this.f20091D = valueOf;
                    this.f20114z |= 4;
                }
                valueOf = bigDecimal.toBigInteger();
                this.f20091D = valueOf;
                this.f20114z |= 4;
            }
        }
        return this.f20091D;
    }

    public byte[] getBinaryValue(C1341a c1341a) {
        if (this.f20113q == null) {
            if (this._currToken != C1380m.VALUE_STRING) {
                StringBuilder stringBuilder = new StringBuilder("Current token (");
                stringBuilder.append(this._currToken);
                stringBuilder.append(") not VALUE_STRING, can not access as binary");
                _reportError(stringBuilder.toString());
            }
            C1369b g = m18221g();
            _decodeBase64(getText(), g, c1341a);
            this.f20113q = g.m3321b();
        }
        return this.f20113q;
    }

    public C1375h getCurrentLocation() {
        int i = (this.f20099c - this.f20103g) + 1;
        return new C1375h(this.f20097a.m3194a(), -1, this.f20101e + ((long) this.f20099c), this.f20102f, i);
    }

    public String getCurrentName() {
        C5294d c5294d;
        if (this._currToken != C1380m.START_OBJECT) {
            if (this._currToken != C1380m.START_ARRAY) {
                c5294d = this.f20107k;
                return c5294d.m10989i();
            }
        }
        c5294d = this.f20107k.m10991k();
        return c5294d.m10989i();
    }

    public Object getCurrentValue() {
        return this.f20107k.mo1280h();
    }

    public BigDecimal getDecimalValue() {
        if ((this.f20114z & 16) == 0) {
            if (this.f20114z == 0) {
                m18202a(16);
            }
            if ((this.f20114z & 16) == 0) {
                BigDecimal e;
                if ((this.f20114z & 8) != 0) {
                    e = C1351g.m3234e(getText());
                } else if ((this.f20114z & 4) != 0) {
                    e = new BigDecimal(this.f20091D);
                } else {
                    long j;
                    if ((this.f20114z & 2) != 0) {
                        j = this.f20089B;
                    } else if ((this.f20114z & 1) != 0) {
                        j = (long) this.f20088A;
                    } else {
                        _throwInternal();
                        this.f20114z |= 16;
                    }
                    e = BigDecimal.valueOf(j);
                }
                this.f20092E = e;
                this.f20114z |= 16;
            }
        }
        return this.f20092E;
    }

    public double getDoubleValue() {
        if ((this.f20114z & 8) == 0) {
            if (this.f20114z == 0) {
                m18202a(8);
            }
            if ((this.f20114z & 8) == 0) {
                double doubleValue;
                if ((this.f20114z & 16) != 0) {
                    doubleValue = this.f20092E.doubleValue();
                } else if ((this.f20114z & 4) != 0) {
                    doubleValue = this.f20091D.doubleValue();
                } else if ((this.f20114z & 2) != 0) {
                    doubleValue = (double) this.f20089B;
                } else if ((this.f20114z & 1) != 0) {
                    doubleValue = (double) this.f20088A;
                } else {
                    _throwInternal();
                    this.f20114z |= 8;
                }
                this.f20090C = doubleValue;
                this.f20114z |= 8;
            }
        }
        return this.f20090C;
    }

    public Object getEmbeddedObject() {
        return null;
    }

    public float getFloatValue() {
        return (float) getDoubleValue();
    }

    public int getIntValue() {
        if ((this.f20114z & 1) == 0) {
            if (this.f20114z == 0) {
                return m18222h();
            }
            if ((this.f20114z & 1) == 0) {
                m18223i();
            }
        }
        return this.f20088A;
    }

    public long getLongValue() {
        if ((this.f20114z & 2) == 0) {
            if (this.f20114z == 0) {
                m18202a(2);
            }
            if ((this.f20114z & 2) == 0) {
                long j;
                if ((this.f20114z & 1) != 0) {
                    j = (long) this.f20088A;
                } else if ((this.f20114z & 4) != 0) {
                    if (f20082t.compareTo(this.f20091D) > 0 || f20083u.compareTo(this.f20091D) < 0) {
                        m18205l();
                    }
                    j = this.f20091D.longValue();
                } else if ((this.f20114z & 8) != 0) {
                    if (this.f20090C < -9.223372036854776E18d || this.f20090C > 9.223372036854776E18d) {
                        m18205l();
                    }
                    j = (long) this.f20090C;
                } else if ((this.f20114z & 16) != 0) {
                    if (f20084v.compareTo(this.f20092E) > 0 || f20085w.compareTo(this.f20092E) < 0) {
                        m18205l();
                    }
                    j = this.f20092E.longValue();
                } else {
                    _throwInternal();
                    this.f20114z |= 2;
                }
                this.f20089B = j;
                this.f20114z |= 2;
            }
        }
        return this.f20089B;
    }

    public C1377b getNumberType() {
        if (this.f20114z == 0) {
            m18202a(0);
        }
        return this._currToken == C1380m.VALUE_NUMBER_INT ? (this.f20114z & 1) != 0 ? C1377b.INT : (this.f20114z & 2) != 0 ? C1377b.LONG : C1377b.BIG_INTEGER : (this.f20114z & 16) != 0 ? C1377b.BIG_DECIMAL : C1377b.DOUBLE;
    }

    public Number getNumberValue() {
        if (this.f20114z == 0) {
            m18202a(0);
        }
        if (this._currToken == C1380m.VALUE_NUMBER_INT) {
            return (this.f20114z & 1) != 0 ? Integer.valueOf(this.f20088A) : (this.f20114z & 2) != 0 ? Long.valueOf(this.f20089B) : (this.f20114z & 4) != 0 ? this.f20091D : this.f20092E;
        } else {
            if ((this.f20114z & 16) != 0) {
                return this.f20092E;
            }
            if ((this.f20114z & 8) == 0) {
                _throwInternal();
            }
            return Double.valueOf(this.f20090C);
        }
    }

    public /* bridge */ /* synthetic */ C1379l getParsingContext() {
        return this.f20107k;
    }

    public C1375h getTokenLocation() {
        Object a = this.f20097a.m3194a();
        long j = this.f20104h;
        int i = this.f20105i;
        int i2 = this.f20106j;
        if (i2 >= 0) {
            i2++;
        }
        return new C1375h(a, -1, j, i, i2);
    }

    protected final int m18222h() {
        if (this._currToken == C1380m.VALUE_NUMBER_INT) {
            char[] e = this.f20109m.m3337e();
            int d = this.f20109m.m3336d();
            int i = this.f20094G;
            if (this.f20093F) {
                d++;
            }
            if (i <= 9) {
                int a = C1351g.m3225a(e, d, i);
                if (this.f20093F) {
                    a = -a;
                }
                this.f20088A = a;
                this.f20114z = 1;
                return a;
            }
        }
        m18202a(1);
        if ((this.f20114z & 1) == 0) {
            m18223i();
        }
        return this.f20088A;
    }

    public boolean hasTextCharacters() {
        return this._currToken == C1380m.VALUE_STRING ? true : this._currToken == C1380m.FIELD_NAME ? this.f20111o : false;
    }

    protected final void m18223i() {
        int i;
        if ((this.f20114z & 2) != 0) {
            i = (int) this.f20089B;
            if (((long) i) != this.f20089B) {
                StringBuilder stringBuilder = new StringBuilder("Numeric value (");
                stringBuilder.append(getText());
                stringBuilder.append(") out of range of int");
                _reportError(stringBuilder.toString());
            }
        } else if ((this.f20114z & 4) != 0) {
            if (f20080r.compareTo(this.f20091D) > 0 || f20081s.compareTo(this.f20091D) < 0) {
                m18204k();
            }
            i = this.f20091D.intValue();
        } else if ((this.f20114z & 8) != 0) {
            if (this.f20090C < -2.147483648E9d || this.f20090C > 2.147483647E9d) {
                m18204k();
            }
            i = (int) this.f20090C;
        } else if ((this.f20114z & 16) != 0) {
            if (f20086x.compareTo(this.f20092E) > 0 || f20087y.compareTo(this.f20092E) < 0) {
                m18204k();
            }
            i = this.f20092E.intValue();
        } else {
            _throwInternal();
            this.f20114z |= 1;
        }
        this.f20088A = i;
        this.f20114z |= 1;
    }

    public boolean isClosed() {
        return this.f20098b;
    }

    public char mo3512j() {
        throw new UnsupportedOperationException();
    }

    public void overrideCurrentName(String str) {
        C5294d c5294d = this.f20107k;
        if (this._currToken == C1380m.START_OBJECT || this._currToken == C1380m.START_ARRAY) {
            c5294d = c5294d.m10990j();
        }
        try {
            c5294d.m10985a(str);
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public C5303j overrideStdFeatures(int i, int i2) {
        int i3 = this._features;
        i = (i & i2) | ((i2 ^ -1) & i3);
        i2 = i3 ^ i;
        if (i2 != 0) {
            this._features = i;
            m18203a(i, i2);
        }
        return this;
    }

    public void setCurrentValue(Object obj) {
        this.f20107k.mo1279a(obj);
    }

    @Deprecated
    public C5303j setFeatureMask(int i) {
        int i2 = this._features ^ i;
        if (i2 != 0) {
            this._features = i;
            m18203a(i, i2);
        }
        return this;
    }

    public C1385s version() {
        return C5296f.f14697a;
    }
}
