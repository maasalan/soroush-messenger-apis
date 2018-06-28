package org.jivesoftware.smack.util;

import java.security.MessageDigest;

public class SHA1 {
    private static MessageDigest SHA1_DIGEST;

    static {
        try {
            SHA1_DIGEST = MessageDigest.getInstance(StringUtils.SHA1);
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public static byte[] bytes(String str) {
        return bytes(StringUtils.toBytes(str));
    }

    public static synchronized byte[] bytes(byte[] bArr) {
        synchronized (SHA1.class) {
            SHA1_DIGEST.update(bArr);
            bArr = SHA1_DIGEST.digest();
        }
        return bArr;
    }

    public static String hex(String str) {
        return hex(StringUtils.toBytes(str));
    }

    public static String hex(byte[] bArr) {
        return StringUtils.encodeHex(bytes(bArr));
    }
}
