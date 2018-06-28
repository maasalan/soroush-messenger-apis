package p000a.p003b.p004a.p016k;

public final class C0072d {
    public static StringBuilder m119a(byte[] bArr) {
        StringBuilder stringBuilder = new StringBuilder(bArr.length * 2);
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            stringBuilder.append(String.format("%02X ", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return stringBuilder;
    }
}
