package org.jivesoftware.smackx.bytestreams.socks5;

import java.io.DataInputStream;
import org.b.a.i;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.util.SHA1;

class Socks5Utils {
    Socks5Utils() {
    }

    public static String createDigest(String str, i iVar, i iVar2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(iVar);
        stringBuilder.append(iVar2);
        return SHA1.hex(stringBuilder.toString());
    }

    public static byte[] receiveSocks5Message(DataInputStream dataInputStream) {
        Object obj = new byte[5];
        dataInputStream.readFully(obj, 0, 5);
        if (obj[3] != (byte) 3) {
            StringBuilder stringBuilder = new StringBuilder("Unsupported SOCKS5 address type: ");
            stringBuilder.append(obj[3]);
            stringBuilder.append(" (expected: 0x03)");
            throw new SmackException(stringBuilder.toString());
        }
        byte b = obj[4];
        Object obj2 = new byte[(7 + b)];
        System.arraycopy(obj, 0, obj2, 0, 5);
        dataInputStream.readFully(obj2, 5, b + 2);
        return obj2;
    }
}
