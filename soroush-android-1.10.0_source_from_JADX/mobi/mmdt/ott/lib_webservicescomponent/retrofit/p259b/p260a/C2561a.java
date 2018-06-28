package mobi.mmdt.ott.lib_webservicescomponent.retrofit.p259b.p260a;

import android.util.Base64;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.jivesoftware.smack.util.StringUtils;

public final class C2561a {
    public static String m7011a(String str, String str2, String str3, String str4) {
        try {
            int i;
            String str5 = "AES/CBC/PKCS7Padding";
            int i2 = -1;
            int hashCode = str.hashCode();
            if (hashCode != 573506460) {
                if (hashCode != 579792361) {
                    if (hashCode == 604846592) {
                        if (str.equals("AES256CBC")) {
                            i2 = 2;
                        }
                    }
                } else if (str.equals("AES192CBC")) {
                    i2 = 1;
                }
            } else if (str.equals("AES128CBC")) {
                i2 = 0;
            }
            switch (i2) {
                case 0:
                    i = 16;
                    break;
                case 1:
                    i = 24;
                    break;
                case 2:
                    i = 32;
                    break;
                default:
                    i = 0;
                    break;
            }
            AlgorithmParameterSpec ivParameterSpec = new IvParameterSpec(Base64.decode(str3, 0));
            Key secretKeySpec = new SecretKeySpec(str4.substring(0, i).getBytes(StringUtils.UTF8), "AES");
            Cipher instance = Cipher.getInstance(str5);
            instance.init(2, secretKeySpec, ivParameterSpec);
            return new String(instance.doFinal(Base64.decode(str2, 0)));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
