package com.p111d.p112a.p114b;

import com.p111d.p112a.p114b.C5303j.C1377b;
import com.p111d.p112a.p114b.p116c.C1346b;
import com.p111d.p112a.p114b.p120g.C1374j;
import java.io.Closeable;
import java.io.Flushable;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public abstract class C5301g implements C1386t, Closeable, Flushable {
    protected C1381o _cfgPrettyPrinter;

    public enum C1368a {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        ESCAPE_NON_ASCII(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false);
        
        public final int f4318k;
        private final boolean f4319l;

        private C1368a(boolean z) {
            this.f4319l = z;
            this.f4318k = 1 << ordinal();
        }

        public static int m3310a() {
            C1368a[] values = C1368a.values();
            int i = 0;
            int length = values.length;
            int i2 = 0;
            while (i < length) {
                C1368a c1368a = values[i];
                if (c1368a.f4319l) {
                    i2 |= c1368a.f4318k;
                }
                i++;
            }
            return i2;
        }

        public final boolean m3311a(int i) {
            return (i & this.f4318k) != 0;
        }
    }

    protected C5301g() {
    }

    protected void _reportError(String str) {
        throw new C5298f(str, this);
    }

    public void _reportUnsupportedOperation() {
        StringBuilder stringBuilder = new StringBuilder("Operation not supported by generator of type ");
        stringBuilder.append(getClass().getName());
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    protected final void _throwInternal() {
        C1374j.m3348a();
    }

    protected void _writeSimpleObject(Object obj) {
        if (obj == null) {
            writeNull();
        } else if (obj instanceof String) {
            writeString((String) obj);
        } else {
            if (obj instanceof Number) {
                Number number = (Number) obj;
                if (number instanceof Integer) {
                    writeNumber(number.intValue());
                    return;
                } else if (number instanceof Long) {
                    writeNumber(number.longValue());
                    return;
                } else if (number instanceof Double) {
                    writeNumber(number.doubleValue());
                    return;
                } else if (number instanceof Float) {
                    writeNumber(number.floatValue());
                    return;
                } else if (number instanceof Short) {
                    writeNumber(number.shortValue());
                    return;
                } else if (number instanceof Byte) {
                    writeNumber((short) number.byteValue());
                    return;
                } else if (number instanceof BigInteger) {
                    writeNumber((BigInteger) number);
                    return;
                } else if (number instanceof BigDecimal) {
                    writeNumber((BigDecimal) number);
                    return;
                } else if (number instanceof AtomicInteger) {
                    writeNumber(((AtomicInteger) number).get());
                    return;
                } else if (number instanceof AtomicLong) {
                    writeNumber(((AtomicLong) number).get());
                    return;
                }
            } else if (obj instanceof byte[]) {
                writeBinary((byte[]) obj);
                return;
            } else if (obj instanceof Boolean) {
                writeBoolean(((Boolean) obj).booleanValue());
                return;
            } else if (obj instanceof AtomicBoolean) {
                writeBoolean(((AtomicBoolean) obj).get());
                return;
            }
            StringBuilder stringBuilder = new StringBuilder("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed ");
            stringBuilder.append(obj.getClass().getName());
            stringBuilder.append(")");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public boolean canOmitFields() {
        return true;
    }

    public boolean canUseSchema(C1356c c1356c) {
        return false;
    }

    public boolean canWriteBinaryNatively() {
        return false;
    }

    public boolean canWriteObjectId() {
        return false;
    }

    public boolean canWriteTypeId() {
        return false;
    }

    public abstract void close();

    public final C5301g configure(C1368a c1368a, boolean z) {
        if (z) {
            enable(c1368a);
            return this;
        }
        disable(c1368a);
        return this;
    }

    public void copyCurrentEvent(C5303j c5303j) {
        C1380m currentToken = c5303j.getCurrentToken();
        if (currentToken == null) {
            _reportError("No current event to copy");
        }
        int i = currentToken.f4392q;
        if (i != -1) {
            C1377b numberType;
            switch (i) {
                case 1:
                    break;
                case 2:
                    writeEndObject();
                    return;
                case 3:
                    writeStartArray();
                    return;
                case 4:
                    writeEndArray();
                    return;
                case 5:
                    writeFieldName(c5303j.getCurrentName());
                    return;
                case 6:
                    if (c5303j.hasTextCharacters()) {
                        writeString(c5303j.getTextCharacters(), c5303j.getTextOffset(), c5303j.getTextLength());
                        return;
                    } else {
                        writeString(c5303j.getText());
                        return;
                    }
                case 7:
                    numberType = c5303j.getNumberType();
                    if (numberType == C1377b.INT) {
                        writeNumber(c5303j.getIntValue());
                        return;
                    } else if (numberType == C1377b.BIG_INTEGER) {
                        writeNumber(c5303j.getBigIntegerValue());
                        return;
                    } else {
                        writeNumber(c5303j.getLongValue());
                        return;
                    }
                case 8:
                    numberType = c5303j.getNumberType();
                    if (numberType == C1377b.BIG_DECIMAL) {
                        writeNumber(c5303j.getDecimalValue());
                        return;
                    } else if (numberType == C1377b.FLOAT) {
                        writeNumber(c5303j.getFloatValue());
                        return;
                    } else {
                        writeNumber(c5303j.getDoubleValue());
                        return;
                    }
                case 9:
                    writeBoolean(true);
                    return;
                case 10:
                    writeBoolean(false);
                    return;
                case 11:
                    writeNull();
                    return;
                case 12:
                    writeObject(c5303j.getEmbeddedObject());
                    return;
                default:
                    _throwInternal();
                    return;
            }
        }
        _reportError("No current event to copy");
        writeStartObject();
    }

    public void copyCurrentStructure(C5303j c5303j) {
        C1380m currentToken = c5303j.getCurrentToken();
        if (currentToken == null) {
            _reportError("No current event to copy");
        }
        int i = currentToken.f4392q;
        if (i == 5) {
            writeFieldName(c5303j.getCurrentName());
            i = c5303j.nextToken().f4392q;
        }
        if (i == 1) {
            writeStartObject();
            while (c5303j.nextToken() != C1380m.END_OBJECT) {
                copyCurrentStructure(c5303j);
            }
            writeEndObject();
        } else if (i != 3) {
            copyCurrentEvent(c5303j);
        } else {
            writeStartArray();
            while (c5303j.nextToken() != C1380m.END_ARRAY) {
                copyCurrentStructure(c5303j);
            }
            writeEndArray();
        }
    }

    public abstract C5301g disable(C1368a c1368a);

    public abstract C5301g enable(C1368a c1368a);

    public abstract void flush();

    public C1346b getCharacterEscapes() {
        return null;
    }

    public abstract C5304n getCodec();

    public Object getCurrentValue() {
        C1379l outputContext = getOutputContext();
        return outputContext == null ? null : outputContext.mo1280h();
    }

    public abstract int getFeatureMask();

    public int getFormatFeatures() {
        return 0;
    }

    public int getHighestEscapedChar() {
        return 0;
    }

    public int getOutputBuffered() {
        return -1;
    }

    public abstract C1379l getOutputContext();

    public Object getOutputTarget() {
        return null;
    }

    public C1381o getPrettyPrinter() {
        return this._cfgPrettyPrinter;
    }

    public C1356c getSchema() {
        return null;
    }

    public abstract boolean isClosed();

    public abstract boolean isEnabled(C1368a c1368a);

    public C5301g overrideFormatFeatures(int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder("No FormatFeatures defined for generator of type ");
        stringBuilder.append(getClass().getName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public C5301g overrideStdFeatures(int i, int i2) {
        return setFeatureMask((i & i2) | (getFeatureMask() & (i2 ^ -1)));
    }

    public C5301g setCharacterEscapes(C1346b c1346b) {
        return this;
    }

    public abstract C5301g setCodec(C5304n c5304n);

    public void setCurrentValue(Object obj) {
        C1379l outputContext = getOutputContext();
        if (outputContext != null) {
            outputContext.mo1279a(obj);
        }
    }

    @Deprecated
    public abstract C5301g setFeatureMask(int i);

    public C5301g setHighestNonEscapedChar(int i) {
        return this;
    }

    public C5301g setPrettyPrinter(C1381o c1381o) {
        this._cfgPrettyPrinter = c1381o;
        return this;
    }

    public C5301g setRootValueSeparator(C1382p c1382p) {
        throw new UnsupportedOperationException();
    }

    public void setSchema(C1356c c1356c) {
        StringBuilder stringBuilder = new StringBuilder("Generator of type ");
        stringBuilder.append(getClass().getName());
        stringBuilder.append(" does not support schema of type '");
        stringBuilder.append(c1356c.m3256a());
        stringBuilder.append("'");
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public abstract C5301g useDefaultPrettyPrinter();

    public abstract C1385s version();

    public final void writeArrayFieldStart(String str) {
        writeFieldName(str);
        writeStartArray();
    }

    public abstract int writeBinary(C1341a c1341a, InputStream inputStream, int i);

    public int writeBinary(InputStream inputStream, int i) {
        return writeBinary(C1344b.m3177a(), inputStream, i);
    }

    public abstract void writeBinary(C1341a c1341a, byte[] bArr, int i, int i2);

    public void writeBinary(byte[] bArr) {
        writeBinary(C1344b.m3177a(), bArr, 0, bArr.length);
    }

    public void writeBinary(byte[] bArr, int i, int i2) {
        writeBinary(C1344b.m3177a(), bArr, i, i2);
    }

    public final void writeBinaryField(String str, byte[] bArr) {
        writeFieldName(str);
        writeBinary(bArr);
    }

    public abstract void writeBoolean(boolean z);

    public final void writeBooleanField(String str, boolean z) {
        writeFieldName(str);
        writeBoolean(z);
    }

    public abstract void writeEndArray();

    public abstract void writeEndObject();

    public abstract void writeFieldName(C1382p c1382p);

    public abstract void writeFieldName(String str);

    public abstract void writeNull();

    public final void writeNullField(String str) {
        writeFieldName(str);
        writeNull();
    }

    public abstract void writeNumber(double d);

    public abstract void writeNumber(float f);

    public abstract void writeNumber(int i);

    public abstract void writeNumber(long j);

    public abstract void writeNumber(String str);

    public abstract void writeNumber(BigDecimal bigDecimal);

    public abstract void writeNumber(BigInteger bigInteger);

    public void writeNumber(short s) {
        writeNumber((int) s);
    }

    public final void writeNumberField(String str, double d) {
        writeFieldName(str);
        writeNumber(d);
    }

    public final void writeNumberField(String str, float f) {
        writeFieldName(str);
        writeNumber(f);
    }

    public final void writeNumberField(String str, int i) {
        writeFieldName(str);
        writeNumber(i);
    }

    public final void writeNumberField(String str, long j) {
        writeFieldName(str);
        writeNumber(j);
    }

    public final void writeNumberField(String str, BigDecimal bigDecimal) {
        writeFieldName(str);
        writeNumber(bigDecimal);
    }

    public abstract void writeObject(Object obj);

    public final void writeObjectField(String str, Object obj) {
        writeFieldName(str);
        writeObject(obj);
    }

    public final void writeObjectFieldStart(String str) {
        writeFieldName(str);
        writeStartObject();
    }

    public void writeObjectId(Object obj) {
        throw new C5298f("No native support for writing Object Ids", this);
    }

    public void writeObjectRef(Object obj) {
        throw new C5298f("No native support for writing Object Ids", this);
    }

    public void writeOmittedField(String str) {
    }

    public abstract void writeRaw(char c);

    public void writeRaw(C1382p c1382p) {
        writeRaw(c1382p.getValue());
    }

    public abstract void writeRaw(String str);

    public abstract void writeRaw(String str, int i, int i2);

    public abstract void writeRaw(char[] cArr, int i, int i2);

    public abstract void writeRawUTF8String(byte[] bArr, int i, int i2);

    public void writeRawValue(C1382p c1382p) {
        writeRawValue(c1382p.getValue());
    }

    public abstract void writeRawValue(String str);

    public abstract void writeRawValue(String str, int i, int i2);

    public abstract void writeRawValue(char[] cArr, int i, int i2);

    public abstract void writeStartArray();

    public void writeStartArray(int i) {
        writeStartArray();
    }

    public abstract void writeStartObject();

    public abstract void writeString(C1382p c1382p);

    public abstract void writeString(String str);

    public abstract void writeString(char[] cArr, int i, int i2);

    public void writeStringField(String str, String str2) {
        writeFieldName(str);
        writeString(str2);
    }

    public abstract void writeTree(C1384r c1384r);

    public void writeTypeId(Object obj) {
        throw new C5298f("No native support for writing Type Ids", this);
    }

    public abstract void writeUTF8String(byte[] bArr, int i, int i2);
}
