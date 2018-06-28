package org.msgpack.jackson.dataformat;

import com.d.a.b.p;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.jivesoftware.smack.util.StringUtils;

public class MessagePackSerializedString implements p {
    private static final Charset UTF8 = Charset.forName(StringUtils.UTF8);
    private final Object value;

    public MessagePackSerializedString(Object obj) {
        this.value = obj;
    }

    public int appendQuoted(char[] cArr, int i) {
        return 0;
    }

    public int appendQuotedUTF8(byte[] bArr, int i) {
        return 0;
    }

    public int appendUnquoted(char[] cArr, int i) {
        return 0;
    }

    public int appendUnquotedUTF8(byte[] bArr, int i) {
        return 0;
    }

    public char[] asQuotedChars() {
        return getValue().toCharArray();
    }

    public byte[] asQuotedUTF8() {
        StringBuilder stringBuilder = new StringBuilder("\"");
        stringBuilder.append(getValue());
        stringBuilder.append("\"");
        return stringBuilder.toString().getBytes(UTF8);
    }

    public byte[] asUnquotedUTF8() {
        return getValue().getBytes(UTF8);
    }

    public int charLength() {
        return getValue().length();
    }

    public Object getRawValue() {
        return this.value;
    }

    public String getValue() {
        return this.value.toString();
    }

    public int putQuotedUTF8(ByteBuffer byteBuffer) {
        return 0;
    }

    public int putUnquotedUTF8(ByteBuffer byteBuffer) {
        return 0;
    }

    public int writeQuotedUTF8(OutputStream outputStream) {
        return 0;
    }

    public int writeUnquotedUTF8(OutputStream outputStream) {
        return 0;
    }
}
