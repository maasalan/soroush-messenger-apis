package org.jivesoftware.smack.util;

import java.security.SecureRandom;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class StringUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String AMP_ENCODE = "&amp;";
    public static final String APOS_ENCODE = "&apos;";
    public static final String GT_ENCODE = "&gt;";
    public static final char[] HEX_CHARS = "0123456789abcdef".toCharArray();
    public static final String LT_ENCODE = "&lt;";
    public static final String MD5 = "MD5";
    public static final String QUOTE_ENCODE = "&quot;";
    private static final ThreadLocal<SecureRandom> SECURE_RANDOM = new C77692();
    public static final String SHA1 = "SHA-1";
    public static final String USASCII = "US-ASCII";
    public static final String UTF8 = "UTF-8";
    private static final char[] numbersAndLetters = "0123456789abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final ThreadLocal<Random> randGen = new C77681();

    static class C77681 extends ThreadLocal<Random> {
        C77681() {
        }

        protected final Random initialValue() {
            return new Random();
        }
    }

    static class C77692 extends ThreadLocal<SecureRandom> {
        C77692() {
        }

        protected final SecureRandom initialValue() {
            return new SecureRandom();
        }
    }

    private enum XmlEscapeMode {
        safe,
        forAttribute,
        forAttributeApos,
        forText
    }

    public static String collectionToString(Collection<? extends Object> collection) {
        return toStringBuilder(collection, " ").toString();
    }

    public static String encodeHex(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            cArr[i3] = HEX_CHARS[i2 >>> 4];
            cArr[i3 + 1] = HEX_CHARS[i2 & 15];
        }
        return new String(cArr);
    }

    @Deprecated
    public static CharSequence escapeForXML(CharSequence charSequence) {
        return escapeForXml(charSequence);
    }

    public static CharSequence escapeForXml(CharSequence charSequence) {
        return escapeForXml(charSequence, XmlEscapeMode.safe);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.CharSequence escapeForXml(java.lang.CharSequence r9, org.jivesoftware.smack.util.StringUtils.XmlEscapeMode r10) {
        /*
        r0 = 0;
        if (r9 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r9.length();
        r2 = new java.lang.StringBuilder;
        r3 = (double) r1;
        r5 = 4608533498688228557; // 0x3ff4cccccccccccd float:-1.07374184E8 double:1.3;
        r3 = r3 * r5;
        r3 = (int) r3;
        r2.<init>(r3);
        r3 = 0;
        r4 = r3;
    L_0x0017:
        if (r3 >= r1) goto L_0x006f;
    L_0x0019:
        r5 = r9.charAt(r3);
        r6 = org.jivesoftware.smack.util.StringUtils.C77703.$SwitchMap$org$jivesoftware$smack$util$StringUtils$XmlEscapeMode;
        r7 = r10.ordinal();
        r6 = r6[r7];
        r7 = 34;
        r8 = 60;
        switch(r6) {
            case 1: goto L_0x0042;
            case 2: goto L_0x003a;
            case 3: goto L_0x0034;
            case 4: goto L_0x002d;
            default: goto L_0x002c;
        };
    L_0x002c:
        goto L_0x005d;
    L_0x002d:
        r6 = 38;
        if (r5 == r6) goto L_0x0051;
    L_0x0031:
        if (r5 == r8) goto L_0x0057;
    L_0x0033:
        goto L_0x005d;
    L_0x0034:
        if (r5 == r8) goto L_0x0057;
    L_0x0036:
        switch(r5) {
            case 38: goto L_0x0051;
            case 39: goto L_0x004e;
            default: goto L_0x0039;
        };
    L_0x0039:
        goto L_0x005d;
    L_0x003a:
        if (r5 == r7) goto L_0x005a;
    L_0x003c:
        if (r5 == r8) goto L_0x0057;
    L_0x003e:
        switch(r5) {
            case 38: goto L_0x0051;
            case 39: goto L_0x004e;
            default: goto L_0x0041;
        };
    L_0x0041:
        goto L_0x005d;
    L_0x0042:
        if (r5 == r7) goto L_0x005a;
    L_0x0044:
        if (r5 == r8) goto L_0x0057;
    L_0x0046:
        r6 = 62;
        if (r5 == r6) goto L_0x0054;
    L_0x004a:
        switch(r5) {
            case 38: goto L_0x0051;
            case 39: goto L_0x004e;
            default: goto L_0x004d;
        };
    L_0x004d:
        goto L_0x005d;
    L_0x004e:
        r5 = "&apos;";
        goto L_0x005e;
    L_0x0051:
        r5 = "&amp;";
        goto L_0x005e;
    L_0x0054:
        r5 = "&gt;";
        goto L_0x005e;
    L_0x0057:
        r5 = "&lt;";
        goto L_0x005e;
    L_0x005a:
        r5 = "&quot;";
        goto L_0x005e;
    L_0x005d:
        r5 = r0;
    L_0x005e:
        if (r5 == 0) goto L_0x006c;
    L_0x0060:
        if (r3 <= r4) goto L_0x0065;
    L_0x0062:
        r2.append(r9, r4, r3);
    L_0x0065:
        r2.append(r5);
        r4 = r3 + 1;
        r3 = r4;
        goto L_0x0017;
    L_0x006c:
        r3 = r3 + 1;
        goto L_0x0017;
    L_0x006f:
        if (r4 != 0) goto L_0x0072;
    L_0x0071:
        return r9;
    L_0x0072:
        if (r3 <= r4) goto L_0x0077;
    L_0x0074:
        r2.append(r9, r4, r3);
    L_0x0077:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.util.StringUtils.escapeForXml(java.lang.CharSequence, org.jivesoftware.smack.util.StringUtils$XmlEscapeMode):java.lang.CharSequence");
    }

    public static CharSequence escapeForXmlAttribute(CharSequence charSequence) {
        return escapeForXml(charSequence, XmlEscapeMode.forAttribute);
    }

    public static CharSequence escapeForXmlAttributeApos(CharSequence charSequence) {
        return escapeForXml(charSequence, XmlEscapeMode.forAttributeApos);
    }

    public static CharSequence escapeForXmlText(CharSequence charSequence) {
        return escapeForXml(charSequence, XmlEscapeMode.forText);
    }

    private static char getPrintableChar(byte b) {
        return numbersAndLetters[(b & 255) % numbersAndLetters.length];
    }

    @Deprecated
    public static synchronized String hash(String str) {
        synchronized (StringUtils.class) {
            str = SHA1.hex(str);
        }
        return str;
    }

    public static String insecureRandomString(int i) {
        if (i <= 0) {
            return null;
        }
        Random random = (Random) randGen.get();
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = numbersAndLetters[random.nextInt(numbersAndLetters.length)];
        }
        return new String(cArr);
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    public static boolean isNotEmpty(CharSequence charSequence) {
        return !isNullOrEmpty(charSequence);
    }

    public static boolean isNotEmpty(CharSequence... charSequenceArr) {
        for (CharSequence isNullOrEmpty : charSequenceArr) {
            if (isNullOrEmpty(isNullOrEmpty)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNullOrEmpty(CharSequence charSequence) {
        if (charSequence != null) {
            if (!isEmpty(charSequence)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNullOrEmpty(CharSequence... charSequenceArr) {
        for (CharSequence isNotEmpty : charSequenceArr) {
            if (isNotEmpty(isNotEmpty)) {
                return false;
            }
        }
        return true;
    }

    public static String maybeToString(CharSequence charSequence) {
        return charSequence == null ? null : charSequence.toString();
    }

    public static int nullSafeCharSequenceComperator(CharSequence charSequence, CharSequence charSequence2) {
        return ((charSequence == null ? 1 : 0) ^ (charSequence2 == null ? 1 : 0)) != 0 ? charSequence == null ? -1 : 1 : (charSequence == null && charSequence2 == null) ? 0 : charSequence.toString().compareTo(charSequence2.toString());
    }

    public static boolean nullSafeCharSequenceEquals(CharSequence charSequence, CharSequence charSequence2) {
        return nullSafeCharSequenceComperator(charSequence, charSequence2) == 0;
    }

    public static String randomString(int i) {
        if (i <= 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        ((SecureRandom) SECURE_RANDOM.get()).nextBytes(bArr);
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = getPrintableChar(bArr[i2]);
        }
        return new String(cArr);
    }

    public static <CS extends CharSequence> CS requireNotNullOrEmpty(CS cs, String str) {
        if (!isNullOrEmpty((CharSequence) cs)) {
            return cs;
        }
        throw new IllegalArgumentException(str);
    }

    public static String returnIfNotEmptyTrimmed(String str) {
        if (str == null) {
            return null;
        }
        str = str.trim();
        return str.length() > 0 ? str : null;
    }

    public static byte[] toBytes(String str) {
        try {
            return str.getBytes(UTF8);
        } catch (Throwable e) {
            throw new IllegalStateException("UTF-8 encoding not supported by platform", e);
        }
    }

    public static StringBuilder toStringBuilder(Collection<? extends Object> collection, String str) {
        StringBuilder stringBuilder = new StringBuilder(collection.size() * 20);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            stringBuilder.append(it.next());
            if (it.hasNext()) {
                stringBuilder.append(str);
            }
        }
        return stringBuilder;
    }
}
