package p000a.p003b.p004a.p016k;

public final class C0070b {
    public static String m117a(byte[] bArr) {
        int length = (3 - (bArr.length % 3)) % 3;
        Object obj = new byte[(bArr.length + length)];
        System.arraycopy(bArr, 0, obj, 0, bArr.length);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < bArr.length; i += 3) {
            int i2 = (((obj[i] & 255) << 16) + ((obj[i + 1] & 255) << 8)) + (obj[i + 2] & 255);
            stringBuilder.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i2 >> 18) & 63));
            stringBuilder.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i2 >> 12) & 63));
            stringBuilder.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i2 >> 6) & 63));
            stringBuilder.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(i2 & 63));
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(stringBuilder.substring(0, stringBuilder.length() - length));
        stringBuilder2.append("==".substring(0, length));
        return stringBuilder2.toString();
    }
}
