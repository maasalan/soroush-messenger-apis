package com.p111d.p112a.p114b.p539a;

import com.p111d.p112a.p114b.C1341a;
import com.p111d.p112a.p114b.C1381o;
import com.p111d.p112a.p114b.C1382p;
import com.p111d.p112a.p114b.C1384r;
import com.p111d.p112a.p114b.C1385s;
import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p114b.C5301g.C1368a;
import com.p111d.p112a.p114b.C5304n;
import com.p111d.p112a.p114b.p117d.C1358b;
import com.p111d.p112a.p114b.p117d.C5295e;
import com.p111d.p112a.p114b.p120g.C1374j;
import com.p111d.p112a.p114b.p120g.C5300d;
import java.io.InputStream;

public abstract class C6464a extends C5301g {
    protected static final int DERIVED_FEATURES_MASK = ((C1368a.WRITE_NUMBERS_AS_STRINGS.f4318k | C1368a.ESCAPE_NON_ASCII.f4318k) | C1368a.STRICT_DUPLICATE_DETECTION.f4318k);
    public static final int SURR1_FIRST = 55296;
    public static final int SURR1_LAST = 56319;
    public static final int SURR2_FIRST = 56320;
    public static final int SURR2_LAST = 57343;
    protected final String WRITE_BINARY = "write a binary value";
    protected final String WRITE_BOOLEAN = "write a boolean value";
    protected final String WRITE_NULL = "write a null";
    protected final String WRITE_NUMBER = "write a number";
    protected final String WRITE_RAW = "write a raw (unencoded) value";
    protected final String WRITE_STRING = "write a string";
    protected boolean _cfgNumbersAsStrings;
    protected boolean _closed;
    protected int _features;
    protected C5304n _objectCodec;
    protected C5295e _writeContext;

    protected C6464a(int i, C5304n c5304n) {
        this._features = i;
        this._objectCodec = c5304n;
        this._writeContext = C5295e.m10995b(C1368a.STRICT_DUPLICATE_DETECTION.m3311a(i) ? C1358b.m3264a((C5301g) this) : null);
        this._cfgNumbersAsStrings = C1368a.WRITE_NUMBERS_AS_STRINGS.m3311a(i);
    }

    protected C6464a(int i, C5304n c5304n, C5295e c5295e) {
        this._features = i;
        this._objectCodec = c5304n;
        this._writeContext = c5295e;
        this._cfgNumbersAsStrings = C1368a.WRITE_NUMBERS_AS_STRINGS.m3311a(i);
    }

    protected void _checkStdFeatureChanges(int i, int i2) {
        if ((DERIVED_FEATURES_MASK & i2) != 0) {
            this._cfgNumbersAsStrings = C1368a.WRITE_NUMBERS_AS_STRINGS.m3311a(i);
            if (C1368a.ESCAPE_NON_ASCII.m3311a(i2)) {
                setHighestNonEscapedChar(C1368a.ESCAPE_NON_ASCII.m3311a(i) ? 127 : 0);
            }
            if (C1368a.STRICT_DUPLICATE_DETECTION.m3311a(i2)) {
                if (!C1368a.STRICT_DUPLICATE_DETECTION.m3311a(i)) {
                    this._writeContext = this._writeContext.m10997a(null);
                } else if (this._writeContext.m11005m() == null) {
                    this._writeContext = this._writeContext.m10997a(C1358b.m3264a((C5301g) this));
                }
            }
        }
    }

    protected C1381o _constructDefaultPrettyPrinter() {
        return new C5300d();
    }

    protected final int _decodeSurrogate(int i, int i2) {
        if (i2 < SURR2_FIRST || i2 > SURR2_LAST) {
            StringBuilder stringBuilder = new StringBuilder("Incomplete surrogate pair: first char 0x");
            stringBuilder.append(Integer.toHexString(i));
            stringBuilder.append(", second 0x");
            stringBuilder.append(Integer.toHexString(i2));
            _reportError(stringBuilder.toString());
        }
        return (65536 + ((i - SURR1_FIRST) << 10)) + (i2 - SURR2_FIRST);
    }

    public abstract void _releaseBuffers();

    public abstract void _verifyValueWrite(String str);

    public void close() {
        this._closed = true;
    }

    public C5301g disable(C1368a c1368a) {
        int i = c1368a.f4318k;
        this._features &= i ^ -1;
        if ((i & DERIVED_FEATURES_MASK) != 0) {
            if (c1368a == C1368a.WRITE_NUMBERS_AS_STRINGS) {
                this._cfgNumbersAsStrings = false;
                return this;
            } else if (c1368a == C1368a.ESCAPE_NON_ASCII) {
                setHighestNonEscapedChar(0);
                return this;
            } else if (c1368a == C1368a.STRICT_DUPLICATE_DETECTION) {
                this._writeContext = this._writeContext.m10997a(null);
            }
        }
        return this;
    }

    public C5301g enable(C1368a c1368a) {
        int i = c1368a.f4318k;
        this._features |= i;
        if ((i & DERIVED_FEATURES_MASK) != 0) {
            if (c1368a == C1368a.WRITE_NUMBERS_AS_STRINGS) {
                this._cfgNumbersAsStrings = true;
                return this;
            } else if (c1368a == C1368a.ESCAPE_NON_ASCII) {
                setHighestNonEscapedChar(127);
                return this;
            } else if (c1368a == C1368a.STRICT_DUPLICATE_DETECTION && this._writeContext.m11005m() == null) {
                this._writeContext = this._writeContext.m10997a(C1358b.m3264a((C5301g) this));
            }
        }
        return this;
    }

    public abstract void flush();

    public final C5304n getCodec() {
        return this._objectCodec;
    }

    public Object getCurrentValue() {
        return this._writeContext.mo1280h();
    }

    public int getFeatureMask() {
        return this._features;
    }

    public final C5295e getOutputContext() {
        return this._writeContext;
    }

    public boolean isClosed() {
        return this._closed;
    }

    public final boolean isEnabled(C1368a c1368a) {
        return (c1368a.f4318k & this._features) != 0;
    }

    public C5301g overrideStdFeatures(int i, int i2) {
        int i3 = this._features;
        i = (i & i2) | ((i2 ^ -1) & i3);
        i2 = i3 ^ i;
        if (i2 != 0) {
            this._features = i;
            _checkStdFeatureChanges(i, i2);
        }
        return this;
    }

    public C5301g setCodec(C5304n c5304n) {
        this._objectCodec = c5304n;
        return this;
    }

    public void setCurrentValue(Object obj) {
        this._writeContext.mo1279a(obj);
    }

    @Deprecated
    public C5301g setFeatureMask(int i) {
        int i2 = this._features ^ i;
        this._features = i;
        if (i2 != 0) {
            _checkStdFeatureChanges(i, i2);
        }
        return this;
    }

    public C5301g useDefaultPrettyPrinter() {
        return getPrettyPrinter() != null ? this : setPrettyPrinter(_constructDefaultPrettyPrinter());
    }

    public C1385s version() {
        return C1374j.m3346a(getClass());
    }

    public int writeBinary(C1341a c1341a, InputStream inputStream, int i) {
        _reportUnsupportedOperation();
        return 0;
    }

    public void writeFieldName(C1382p c1382p) {
        writeFieldName(c1382p.getValue());
    }

    public void writeObject(Object obj) {
        if (obj == null) {
            writeNull();
        } else if (this._objectCodec != null) {
            this._objectCodec.mo2980a((C5301g) this, obj);
        } else {
            _writeSimpleObject(obj);
        }
    }

    public void writeRawValue(C1382p c1382p) {
        _verifyValueWrite("write raw value");
        writeRaw(c1382p);
    }

    public void writeRawValue(String str) {
        _verifyValueWrite("write raw value");
        writeRaw(str);
    }

    public void writeRawValue(String str, int i, int i2) {
        _verifyValueWrite("write raw value");
        writeRaw(str, i, i2);
    }

    public void writeRawValue(char[] cArr, int i, int i2) {
        _verifyValueWrite("write raw value");
        writeRaw(cArr, i, i2);
    }

    public void writeString(C1382p c1382p) {
        writeString(c1382p.getValue());
    }

    public void writeTree(C1384r c1384r) {
        if (c1384r == null) {
            writeNull();
        } else if (this._objectCodec == null) {
            throw new IllegalStateException("No ObjectCodec defined");
        } else {
            this._objectCodec.mo2980a((C5301g) this, (Object) c1384r);
        }
    }
}
