package org.msgpack.unpacker;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import org.jivesoftware.smack.util.StringUtils;
import org.msgpack.MessageTypeException;

final class StringAccept extends Accept {
    private CharsetDecoder decoder = Charset.forName(StringUtils.UTF8).newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
    String value;

    public StringAccept() {
        super("raw value");
    }

    final void acceptEmptyRaw() {
        this.value = "";
    }

    final void acceptRaw(byte[] bArr) {
        try {
            this.value = this.decoder.decode(ByteBuffer.wrap(bArr)).toString();
        } catch (Throwable e) {
            throw new MessageTypeException(e);
        }
    }

    public final void refer(ByteBuffer byteBuffer, boolean z) {
        try {
            this.value = this.decoder.decode(byteBuffer).toString();
        } catch (Throwable e) {
            throw new MessageTypeException(e);
        }
    }
}
