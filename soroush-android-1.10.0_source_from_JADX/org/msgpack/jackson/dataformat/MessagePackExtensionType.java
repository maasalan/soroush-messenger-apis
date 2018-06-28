package org.msgpack.jackson.dataformat;

import com.p111d.p112a.p121c.p122a.C1397f;
import java.util.Arrays;

@C1397f(a = Serializer.class)
public class MessagePackExtensionType {
    private final byte[] data;
    private final byte type;

    public MessagePackExtensionType(byte b, byte[] bArr) {
        this.type = b;
        this.data = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagePackExtensionType)) {
            return false;
        }
        MessagePackExtensionType messagePackExtensionType = (MessagePackExtensionType) obj;
        return this.type != messagePackExtensionType.type ? false : Arrays.equals(this.data, messagePackExtensionType.data);
    }

    public byte[] getData() {
        return this.data;
    }

    public byte getType() {
        return this.type;
    }

    public int hashCode() {
        return (31 * this.type) + Arrays.hashCode(this.data);
    }
}
