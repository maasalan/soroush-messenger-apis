package org.msgpack.value.impl;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessageStringCodingException;
import org.msgpack.value.ImmutableArrayValue;
import org.msgpack.value.ImmutableBinaryValue;
import org.msgpack.value.ImmutableBooleanValue;
import org.msgpack.value.ImmutableExtensionValue;
import org.msgpack.value.ImmutableFloatValue;
import org.msgpack.value.ImmutableIntegerValue;
import org.msgpack.value.ImmutableMapValue;
import org.msgpack.value.ImmutableNilValue;
import org.msgpack.value.ImmutableNumberValue;
import org.msgpack.value.ImmutableRawValue;
import org.msgpack.value.ImmutableStringValue;

public abstract class AbstractImmutableRawValue extends AbstractImmutableValue implements ImmutableRawValue {
    private static final char[] HEX_TABLE = "0123456789ABCDEF".toCharArray();
    private volatile CharacterCodingException codingException;
    protected final byte[] data;
    private volatile String decodedStringCache;

    public AbstractImmutableRawValue(String str) {
        this.decodedStringCache = str;
        this.data = str.getBytes(MessagePack.UTF8);
    }

    public AbstractImmutableRawValue(byte[] bArr) {
        this.data = bArr;
    }

    static void appendJsonString(StringBuilder stringBuilder, String str) {
        stringBuilder.append("\"");
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            String str2;
            if (charAt < ' ') {
                switch (charAt) {
                    case '\b':
                        str2 = "\\b";
                        break;
                    case '\t':
                        str2 = "\\t";
                        break;
                    case '\n':
                        str2 = "\\n";
                        break;
                    case '\f':
                        str2 = "\\f";
                        break;
                    case '\r':
                        str2 = "\\r";
                        break;
                }
            }
            if (charAt <= '') {
                if (charAt == '\"') {
                    str2 = "\\\"";
                } else if (charAt == '\\') {
                    str2 = "\\\\";
                }
                stringBuilder.append(str2);
            } else if (charAt >= '?' && charAt <= '?') {
            }
            stringBuilder.append(charAt);
            escapeChar(stringBuilder, charAt);
        }
        stringBuilder.append("\"");
    }

    private void decodeString() {
        synchronized (this.data) {
            if (this.decodedStringCache != null) {
                return;
            }
            try {
                this.decodedStringCache = MessagePack.UTF8.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(asByteBuffer()).toString();
            } catch (CharacterCodingException e) {
                throw new MessageStringCodingException(e);
            } catch (CharacterCodingException e2) {
                this.decodedStringCache = MessagePack.UTF8.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).decode(asByteBuffer()).toString();
                this.codingException = e2;
            }
        }
    }

    private static void escapeChar(StringBuilder stringBuilder, int i) {
        stringBuilder.append("\\u");
        stringBuilder.append(HEX_TABLE[(i >> 12) & 15]);
        stringBuilder.append(HEX_TABLE[(i >> 8) & 15]);
        stringBuilder.append(HEX_TABLE[(i >> 4) & 15]);
        stringBuilder.append(HEX_TABLE[i & 15]);
    }

    public /* bridge */ /* synthetic */ ImmutableArrayValue asArrayValue() {
        return super.asArrayValue();
    }

    public /* bridge */ /* synthetic */ ImmutableBinaryValue asBinaryValue() {
        return super.asBinaryValue();
    }

    public /* bridge */ /* synthetic */ ImmutableBooleanValue asBooleanValue() {
        return super.asBooleanValue();
    }

    public byte[] asByteArray() {
        return Arrays.copyOf(this.data, this.data.length);
    }

    public ByteBuffer asByteBuffer() {
        return ByteBuffer.wrap(this.data).asReadOnlyBuffer();
    }

    public /* bridge */ /* synthetic */ ImmutableExtensionValue asExtensionValue() {
        return super.asExtensionValue();
    }

    public /* bridge */ /* synthetic */ ImmutableFloatValue asFloatValue() {
        return super.asFloatValue();
    }

    public /* bridge */ /* synthetic */ ImmutableIntegerValue asIntegerValue() {
        return super.asIntegerValue();
    }

    public /* bridge */ /* synthetic */ ImmutableMapValue asMapValue() {
        return super.asMapValue();
    }

    public /* bridge */ /* synthetic */ ImmutableNilValue asNilValue() {
        return super.asNilValue();
    }

    public /* bridge */ /* synthetic */ ImmutableNumberValue asNumberValue() {
        return super.asNumberValue();
    }

    public ImmutableRawValue asRawValue() {
        return this;
    }

    public String asString() {
        if (this.decodedStringCache == null) {
            decodeString();
        }
        if (this.codingException == null) {
            return this.decodedStringCache;
        }
        throw new MessageStringCodingException(this.codingException);
    }

    public /* bridge */ /* synthetic */ ImmutableStringValue asStringValue() {
        return super.asStringValue();
    }

    public /* bridge */ /* synthetic */ boolean isArrayValue() {
        return super.isArrayValue();
    }

    public /* bridge */ /* synthetic */ boolean isBinaryValue() {
        return super.isBinaryValue();
    }

    public /* bridge */ /* synthetic */ boolean isBooleanValue() {
        return super.isBooleanValue();
    }

    public /* bridge */ /* synthetic */ boolean isExtensionValue() {
        return super.isExtensionValue();
    }

    public /* bridge */ /* synthetic */ boolean isFloatValue() {
        return super.isFloatValue();
    }

    public /* bridge */ /* synthetic */ boolean isIntegerValue() {
        return super.isIntegerValue();
    }

    public /* bridge */ /* synthetic */ boolean isMapValue() {
        return super.isMapValue();
    }

    public /* bridge */ /* synthetic */ boolean isNilValue() {
        return super.isNilValue();
    }

    public /* bridge */ /* synthetic */ boolean isNumberValue() {
        return super.isNumberValue();
    }

    public /* bridge */ /* synthetic */ boolean isRawValue() {
        return super.isRawValue();
    }

    public /* bridge */ /* synthetic */ boolean isStringValue() {
        return super.isStringValue();
    }

    public String toJson() {
        StringBuilder stringBuilder = new StringBuilder();
        appendJsonString(stringBuilder, toString());
        return stringBuilder.toString();
    }

    public String toString() {
        if (this.decodedStringCache == null) {
            decodeString();
        }
        return this.decodedStringCache;
    }
}
