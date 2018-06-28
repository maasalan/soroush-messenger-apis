package mobi.mmdt.ott.lib_webservicescomponent.p257d;

import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import org.jivesoftware.smack.util.StringUtils;

public final class C2557c {
    public static String m7002a(String str) {
        byte[] digest = MessageDigest.getInstance("SHA1").digest(str.getBytes());
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : digest) {
            stringBuilder.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return stringBuilder.toString();
    }

    private static String m7003a(byte[] bArr) {
        String str = "";
        for (byte b : bArr) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(Integer.toString((b & 255) + 256, 16).substring(1));
            str = stringBuilder.toString();
        }
        return str;
    }

    public static String m7004b(String str) {
        MessageDigest instance = MessageDigest.getInstance("SHA1");
        InputStream fileInputStream = new FileInputStream(str);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read >= 0) {
                instance.update(bArr, 0, read);
            } else {
                fileInputStream.close();
                return C2557c.m7003a(instance.digest());
            }
        }
    }

    public static String m7005c(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(StringUtils.MD5);
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder stringBuilder = new StringBuilder();
            for (byte b : digest) {
                String toHexString = Integer.toHexString(b & 255);
                while (toHexString.length() < 2) {
                    StringBuilder stringBuilder2 = new StringBuilder("0");
                    stringBuilder2.append(toHexString);
                    toHexString = stringBuilder2.toString();
                }
                stringBuilder.append(toHexString);
            }
            return stringBuilder.toString();
        } catch (Throwable e) {
            C2480b.m6734a(e.getMessage(), e);
            return "";
        }
    }
}
