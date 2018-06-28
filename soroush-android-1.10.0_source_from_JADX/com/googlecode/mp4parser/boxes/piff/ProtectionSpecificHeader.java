package com.googlecode.mp4parser.boxes.piff;

import com.coremedia.iso.Hex;
import com.googlecode.mp4parser.contentprotection.GenericHeader;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public abstract class ProtectionSpecificHeader {
    protected static Map<UUID, Class<? extends ProtectionSpecificHeader>> uuidRegistry = new HashMap();

    public static ProtectionSpecificHeader createFor(UUID uuid, ByteBuffer byteBuffer) {
        ProtectionSpecificHeader protectionSpecificHeader;
        Class cls = (Class) uuidRegistry.get(uuid);
        if (cls != null) {
            try {
                protectionSpecificHeader = (ProtectionSpecificHeader) cls.newInstance();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            } catch (Throwable e2) {
                throw new RuntimeException(e2);
            }
        }
        protectionSpecificHeader = null;
        if (protectionSpecificHeader == null) {
            protectionSpecificHeader = new GenericHeader();
        }
        protectionSpecificHeader.parse(byteBuffer);
        return protectionSpecificHeader;
    }

    public boolean equals(Object obj) {
        throw new RuntimeException("somebody called equals on me but that's not supposed to happen.");
    }

    public abstract ByteBuffer getData();

    public abstract UUID getSystemId();

    public abstract void parse(ByteBuffer byteBuffer);

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProtectionSpecificHeader");
        stringBuilder.append("{data=");
        ByteBuffer duplicate = getData().duplicate();
        duplicate.rewind();
        byte[] bArr = new byte[duplicate.limit()];
        duplicate.get(bArr);
        stringBuilder.append(Hex.encodeHex(bArr));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
