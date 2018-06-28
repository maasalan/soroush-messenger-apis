package ir.pec.mpl.pecpayment.p209a.p210a;

import android.util.Base64;
import java.io.StringReader;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyFactory;
import java.security.spec.RSAPublicKeySpec;
import java.util.HashMap;
import javax.crypto.Cipher;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public class C2340b {
    public static HashMap<String, String> m6342a(String str) {
        HashMap<String, String> hashMap = new HashMap();
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                if (eventType == 2) {
                    str = newPullParser.getName();
                    if (str.equals("Modulus")) {
                        hashMap.put("Modulus", newPullParser.nextText());
                    }
                    if (str.equals("Exponent")) {
                        hashMap.put("Exponent", newPullParser.nextText());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hashMap;
    }

    public String m6343a(String str, String str2, String str3) {
        String str4 = "";
        try {
            Key generatePublic = KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(new BigInteger(1, Base64.decode(str2, 0)), new BigInteger(1, Base64.decode(str3, 0))));
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(1, generatePublic);
            return Base64.encodeToString(instance.doFinal(str.getBytes()), 2);
        } catch (Exception e) {
            e.printStackTrace();
            return str4;
        }
    }
}
