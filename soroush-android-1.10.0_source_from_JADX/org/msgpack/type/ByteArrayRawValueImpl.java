package org.msgpack.type;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import org.jivesoftware.smack.util.StringUtils;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;

class ByteArrayRawValueImpl extends AbstractRawValue {
    private static final ThreadLocal<CharsetDecoder> decoderStore = new C78331();
    private static ByteArrayRawValueImpl emptyInstance = new ByteArrayRawValueImpl(new byte[0], true);
    private byte[] bytes;

    static class C78331 extends ThreadLocal<CharsetDecoder> {
        C78331() {
        }

        protected final CharsetDecoder initialValue() {
            return Charset.forName(StringUtils.UTF8).newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
        }
    }

    ByteArrayRawValueImpl(byte[] bArr, int i, int i2) {
        this.bytes = new byte[i2];
        System.arraycopy(bArr, i, this.bytes, 0, i2);
    }

    ByteArrayRawValueImpl(byte[] bArr, boolean z) {
        if (z) {
            this.bytes = bArr;
            return;
        }
        this.bytes = new byte[bArr.length];
        System.arraycopy(bArr, 0, this.bytes, 0, bArr.length);
    }

    public static RawValue getEmptyInstance() {
        return emptyInstance;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Value)) {
            return false;
        }
        Value value = (Value) obj;
        return !value.isRawValue() ? false : Arrays.equals(this.bytes, value.asRawValue().getByteArray());
    }

    public byte[] getByteArray() {
        return this.bytes;
    }

    public String getString() {
        try {
            return ((CharsetDecoder) decoderStore.get()).decode(ByteBuffer.wrap(this.bytes)).toString();
        } catch (Throwable e) {
            throw new MessageTypeException(e);
        }
    }

    public int hashCode() {
        return Arrays.hashCode(this.bytes);
    }

    public void writeTo(Packer packer) {
        packer.write(this.bytes);
    }
}
