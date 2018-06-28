package p000a.p003b.p004a.p016k;

public final class C0069a {
    public static String m116a(byte[] bArr) {
        int i;
        Object obj = bArr;
        int length = ((int) (8.0d - (((double) (obj.length % 5)) * 1.6d))) % 8;
        Object obj2 = new byte[(obj.length + length)];
        System.arraycopy(obj, 0, obj2, 0, obj.length);
        StringBuilder stringBuilder = new StringBuilder();
        int i2 = 0;
        while (i2 < obj.length) {
            long j = ((((((long) (obj2[i2] & 255)) << 32) + (((long) (obj2[i2 + 1] & 255)) << 24)) + ((long) ((obj2[i2 + 2] & 255) << 16))) + ((long) ((obj2[i2 + 3] & 255) << 8))) + ((long) (obj2[i2 + 4] & 255));
            i = length;
            stringBuilder.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) ((j >> 35) & 31)));
            stringBuilder.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) ((j >> 30) & 31)));
            stringBuilder.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) ((j >> 25) & 31)));
            stringBuilder.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) ((j >> 20) & 31)));
            stringBuilder.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) ((j >> 15) & 31)));
            stringBuilder.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) ((j >> 10) & 31)));
            stringBuilder.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) ((j >> 5) & 31)));
            stringBuilder.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) (j & 31)));
            i2 += 5;
            length = i;
        }
        i = length;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(stringBuilder.substring(0, stringBuilder.length() - i));
        stringBuilder2.append("======".substring(0, length));
        return stringBuilder2.toString();
    }
}
