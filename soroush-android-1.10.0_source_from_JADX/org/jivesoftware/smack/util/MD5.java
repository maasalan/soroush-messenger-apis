package org.jivesoftware.smack.util;

import java.security.MessageDigest;

public class MD5 {
    private static MessageDigest MD5_DIGEST;

    static {
        try {
            MD5_DIGEST = MessageDigest.getInstance(StringUtils.MD5);
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public static byte[] bytes(String str) {
        return bytes(StringUtils.toBytes(str));
    }

    public static synchronized byte[] bytes(byte[] bArr) {
        synchronized (MD5.class) {
            bArr = MD5_DIGEST.digest(bArr);
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
