package com.coremedia.iso;

public final class Ascii {
    public static String convert(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, "us-ascii");
        } catch (Throwable e) {
            throw new Error(e);
        }
    }

    public static byte[] convert(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes("us-ascii");
        } catch (Throwable e) {
            throw new Error(e);
        }
    }
}
