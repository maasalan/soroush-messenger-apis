package mobi.mmdt.ott.lib_webservicescomponent.retrofit.p259b.p260a;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.jivesoftware.smack.util.StringUtils;

public final class C2562b {
    public static String m7012a(String str) {
        byte[] digest = MessageDigest.getInstance("SHA1").digest(str.getBytes());
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : digest) {
            stringBuilder.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return stringBuilder.toString();
    }

    public static String m7013a(String str, String str2) {
        Object obj;
        int hashCode = str.hashCode();
        if (hashCode != -1850268089) {
            if (hashCode != -1850265334) {
                if (hashCode == 2543909) {
                    if (str.equals("SHA1")) {
                        obj = null;
                        switch (obj) {
                            case null:
                                return C2562b.m7014b(str2);
                            case 1:
                                str = "SHA-256";
                                break;
                            case 2:
                                str = "SHA-512";
                                break;
                            default:
                                return null;
                        }
                        return C2562b.m7015b(str2, str);
                    }
                }
            } else if (str.equals("SHA512")) {
                obj = 2;
                switch (obj) {
                    case null:
                        return C2562b.m7014b(str2);
                    case 1:
                        str = "SHA-256";
                        break;
                    case 2:
                        str = "SHA-512";
                        break;
                    default:
                        return null;
                }
                return C2562b.m7015b(str2, str);
            }
        } else if (str.equals("SHA256")) {
            obj = 1;
            switch (obj) {
                case null:
                    return C2562b.m7014b(str2);
                case 1:
                    str = "SHA-256";
                    break;
                case 2:
                    str = "SHA-512";
                    break;
                default:
                    return null;
            }
            return C2562b.m7015b(str2, str);
        }
        obj = -1;
        switch (obj) {
            case null:
                return C2562b.m7014b(str2);
            case 1:
                str = "SHA-256";
                break;
            case 2:
                str = "SHA-512";
                break;
            default:
                return null;
        }
        return C2562b.m7015b(str2, str);
    }

    public static String m7014b(String str) {
        String str2 = "";
        try {
            return C2562b.m7012a(str);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return str2;
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            return str2;
        }
    }

    private static String m7015b(String str, String str2) {
        String str3 = "";
        try {
            MessageDigest instance = MessageDigest.getInstance(str2);
            instance.update(str.getBytes(StringUtils.UTF8));
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < digest.length; i++) {
                int i2 = (digest[i] >>> 4) & 15;
                int i3 = 0;
                while (true) {
                    if (i2 < 0 || i2 > 9) {
                        stringBuffer.append((char) (97 + (i2 - 10)));
                    } else {
                        stringBuffer.append((char) (48 + i2));
                    }
                    i2 = digest[i] & 15;
                    int i4 = i3 + 1;
                    if (i3 > 0) {
                        break;
                    }
                    i3 = i4;
                }
            }
            return stringBuffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return str3;
        }
    }
}
