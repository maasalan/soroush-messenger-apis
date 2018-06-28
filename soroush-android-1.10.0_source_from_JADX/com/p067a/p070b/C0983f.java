package com.p067a.p070b;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.jivesoftware.smack.util.StringUtils;

final class C0983f {
    private static final char[] f3164a = "0123456789ABCDEF".toCharArray();

    public static String m2439a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(StringUtils.SHA1);
            byte[] bytes = str.getBytes(StringUtils.UTF8);
            int i = 0;
            instance.update(bytes, 0, bytes.length);
            bytes = instance.digest();
            char[] cArr = new char[(bytes.length * 2)];
            while (i < bytes.length) {
                int i2 = bytes[i] & 255;
                int i3 = i * 2;
                cArr[i3] = f3164a[i2 >>> 4];
                cArr[i3 + 1] = f3164a[i2 & 15];
                i++;
            }
            return new String(cArr);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
