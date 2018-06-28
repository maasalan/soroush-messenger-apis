package mobi.mmdt.ott.lib_webservicescomponent.p257d;

import android.util.Base64;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import org.jivesoftware.smack.util.StringUtils;

public final class C2555a {
    public static String f8312a;
    public static String f8313b;
    private static SecretKeySpec f8314c;

    public static void m6994a(String str) {
        f8314c = new SecretKeySpec(Arrays.copyOf(str.getBytes(), 16), "AES");
    }

    public static void m6995a(String str, byte[] bArr) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance.init(1, f8314c, new IvParameterSpec(Arrays.copyOf(bArr, 16)));
            f8313b = Base64.encodeToString(instance.doFinal(str.getBytes(StringUtils.UTF8)), 0);
        } catch (Throwable e) {
            C2480b.m6738b(e);
        }
    }

    public static void m6996b(String str, byte[] bArr) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance.init(2, f8314c, new IvParameterSpec(Arrays.copyOf(bArr, 16)));
            f8312a = new String(instance.doFinal(Base64.decode(str, 0)), 0);
        } catch (Throwable e) {
            C2480b.m6737b(e.getMessage(), e);
        }
    }
}
