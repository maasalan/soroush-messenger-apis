package com.p111d.p112a.p114b;

import com.p111d.p112a.p114b.p119f.C1366b;
import java.io.Closeable;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;

public abstract class C5303j implements C1386t, Closeable {
    private static final int MAX_BYTE_I = 255;
    private static final int MAX_SHORT_I = 32767;
    private static final int MIN_BYTE_I = -128;
    private static final int MIN_SHORT_I = -32768;
    protected int _features;

    public enum C1376a {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false);
        
        public final int f4363l;
        private final boolean f4364m;

        private C1376a(boolean z) {
            this.f4363l = 1 << ordinal();
            this.f4364m = z;
        }

        public static int m3350a() {
            C1376a[] values = C1376a.values();
            int i = 0;
            int length = values.length;
            int i2 = 0;
            while (i < length) {
                C1376a c1376a = values[i];
                if (c1376a.f4364m) {
                    i2 |= c1376a.f4363l;
                }
                i++;
            }
            return i2;
        }

        public final boolean m3351a(int i) {
            return (i & this.f4363l) != 0;
        }
    }

    public enum C1377b {
        INT,
        LONG,
        BIG_INTEGER,
        FLOAT,
        DOUBLE,
        BIG_DECIMAL
    }

    protected C5303j() {
    }

    protected C5303j(int i) {
        this._features = i;
    }

    protected C5304n _codec() {
        C5304n codec = getCodec();
        if (codec != null) {
            return codec;
        }
        throw new IllegalStateException("No ObjectCodec defined for parser, needed for deserialization");
    }

    protected C5302i _constructError(String str) {
        return new C5302i(this, str);
    }

    protected void _reportUnsupportedOperation() {
        StringBuilder stringBuilder = new StringBuilder("Operation not supported by parser of type ");
        stringBuilder.append(getClass().getName());
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public boolean canReadObjectId() {
        return false;
    }

    public boolean canReadTypeId() {
        return false;
    }

    public boolean canUseSchema(C1356c c1356c) {
        return false;
    }

    public abstract void clearCurrentToken();

    public abstract void close();

    public C5303j configure(C1376a c1376a, boolean z) {
        if (z) {
            enable(c1376a);
            return this;
        }
        disable(c1376a);
        return this;
    }

    public C5303j disable(C1376a c1376a) {
        this._features = (c1376a.f4363l ^ -1) & this._features;
        return this;
    }

    public C5303j enable(C1376a c1376a) {
        this._features = c1376a.f4363l | this._features;
        return this;
    }

    public abstract BigInteger getBigIntegerValue();

    public byte[] getBinaryValue() {
        return getBinaryValue(C1344b.m3177a());
    }

    public abstract byte[] getBinaryValue(C1341a c1341a);

    public boolean getBooleanValue() {
        C1380m currentToken = getCurrentToken();
        if (currentToken == C1380m.VALUE_TRUE) {
            return true;
        }
        if (currentToken == C1380m.VALUE_FALSE) {
            return false;
        }
        throw new C5302i(this, String.format("Current token (%s) not of boolean type", new Object[]{currentToken}));
    }

    public byte getByteValue() {
        int intValue = getIntValue();
        if (intValue >= MIN_BYTE_I) {
            if (intValue <= MAX_BYTE_I) {
                return (byte) intValue;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("Numeric value (");
        stringBuilder.append(getText());
        stringBuilder.append(") out of range of Java byte");
        throw _constructError(stringBuilder.toString());
    }

    public abstract C5304n getCodec();

    public abstract C1375h getCurrentLocation();

    public abstract String getCurrentName();

    public abstract C1380m getCurrentToken();

    public abstract int getCurrentTokenId();

    public Object getCurrentValue() {
        C1379l parsingContext = getParsingContext();
        return parsingContext == null ? null : parsingContext.mo1280h();
    }

    public abstract BigDecimal getDecimalValue();

    public abstract double getDoubleValue();

    public abstract Object getEmbeddedObject();

    public int getFeatureMask() {
        return this._features;
    }

    public abstract float getFloatValue();

    public int getFormatFeatures() {
        return 0;
    }

    public Object getInputSource() {
        return null;
    }

    public abstract int getIntValue();

    public abstract C1380m getLastClearedToken();

    public abstract long getLongValue();

    public abstract C1377b getNumberType();

    public abstract Number getNumberValue();

    public Object getObjectId() {
        return null;
    }

    public abstract C1379l getParsingContext();

    public C1356c getSchema() {
        return null;
    }

    public short getShortValue() {
        int intValue = getIntValue();
        if (intValue >= MIN_SHORT_I) {
            if (intValue <= MAX_SHORT_I) {
                return (short) intValue;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("Numeric value (");
        stringBuilder.append(getText());
        stringBuilder.append(") out of range of Java short");
        throw _constructError(stringBuilder.toString());
    }

    public abstract String getText();

    public abstract char[] getTextCharacters();

    public abstract int getTextLength();

    public abstract int getTextOffset();

    public abstract C1375h getTokenLocation();

    public Object getTypeId() {
        return null;
    }

    public boolean getValueAsBoolean() {
        return getValueAsBoolean(false);
    }

    public boolean getValueAsBoolean(boolean z) {
        return z;
    }

    public double getValueAsDouble() {
        return getValueAsDouble(0.0d);
    }

    public double getValueAsDouble(double d) {
        return d;
    }

    public int getValueAsInt() {
        return getValueAsInt(0);
    }

    public int getValueAsInt(int i) {
        return i;
    }

    public long getValueAsLong() {
        return getValueAsLong(0);
    }

    public long getValueAsLong(long j) {
        return j;
    }

    public String getValueAsString() {
        return getValueAsString(null);
    }

    public abstract String getValueAsString(String str);

    public abstract boolean hasCurrentToken();

    public abstract boolean hasTextCharacters();

    public abstract boolean hasToken(C1380m c1380m);

    public abstract boolean hasTokenId(int i);

    public abstract boolean isClosed();

    public boolean isEnabled(C1376a c1376a) {
        return c1376a.m3351a(this._features);
    }

    public boolean isExpectedStartArrayToken() {
        return getCurrentToken() == C1380m.START_ARRAY;
    }

    public boolean isExpectedStartObjectToken() {
        return getCurrentToken() == C1380m.START_OBJECT;
    }

    public Boolean nextBooleanValue() {
        C1380m nextToken = nextToken();
        return nextToken == C1380m.VALUE_TRUE ? Boolean.TRUE : nextToken == C1380m.VALUE_FALSE ? Boolean.FALSE : null;
    }

    public String nextFieldName() {
        return nextToken() == C1380m.FIELD_NAME ? getCurrentName() : null;
    }

    public boolean nextFieldName(C1382p c1382p) {
        return nextToken() == C1380m.FIELD_NAME && c1382p.getValue().equals(getCurrentName());
    }

    public int nextIntValue(int i) {
        return nextToken() == C1380m.VALUE_NUMBER_INT ? getIntValue() : i;
    }

    public long nextLongValue(long j) {
        return nextToken() == C1380m.VALUE_NUMBER_INT ? getLongValue() : j;
    }

    public String nextTextValue() {
        return nextToken() == C1380m.VALUE_STRING ? getText() : null;
    }

    public abstract C1380m nextToken();

    public abstract C1380m nextValue();

    public abstract void overrideCurrentName(String str);

    public C5303j overrideFormatFeatures(int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder("No FormatFeatures defined for parser of type ");
        stringBuilder.append(getClass().getName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public C5303j overrideStdFeatures(int i, int i2) {
        return setFeatureMask((i & i2) | (this._features & (i2 ^ -1)));
    }

    public int readBinaryValue(C1341a c1341a, OutputStream outputStream) {
        _reportUnsupportedOperation();
        return 0;
    }

    public int readBinaryValue(OutputStream outputStream) {
        return readBinaryValue(C1344b.m3177a(), outputStream);
    }

    public <T> T readValueAs(C1366b<?> c1366b) {
        return _codec().mo2977a(this, (C1366b) c1366b);
    }

    public <T> T readValueAs(Class<T> cls) {
        return _codec().mo2978a(this, (Class) cls);
    }

    public <T extends C1384r> T readValueAsTree() {
        return _codec().mo2976a(this);
    }

    public <T> Iterator<T> readValuesAs(C1366b<?> c1366b) {
        return _codec().mo2981b(this, (C1366b) c1366b);
    }

    public <T> Iterator<T> readValuesAs(Class<T> cls) {
        return _codec().mo2982b(this, (Class) cls);
    }

    public int releaseBuffered(OutputStream outputStream) {
        return -1;
    }

    public int releaseBuffered(Writer writer) {
        return -1;
    }

    public boolean requiresCustomCodec() {
        return false;
    }

    public abstract void setCodec(C5304n c5304n);

    public void setCurrentValue(Object obj) {
        C1379l parsingContext = getParsingContext();
        if (parsingContext != null) {
            parsingContext.mo1279a(obj);
        }
    }

    @Deprecated
    public C5303j setFeatureMask(int i) {
        this._features = i;
        return this;
    }

    public void setSchema(C1356c c1356c) {
        StringBuilder stringBuilder = new StringBuilder("Parser of type ");
        stringBuilder.append(getClass().getName());
        stringBuilder.append(" does not support schema of type '");
        stringBuilder.append(c1356c.m3256a());
        stringBuilder.append("'");
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public abstract C5303j skipChildren();

    public abstract C1385s version();
}
