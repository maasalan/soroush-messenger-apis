package p050b.p051a;

public final class C0817g {
    public static int m1832a(byte[] bArr, int i) {
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    public static void m1833a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
    }

    public static int m1834b(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | (((bArr[i] << 24) | ((bArr[i + 1] & 255) << 16)) | ((bArr[i + 2] & 255) << 8));
    }

    public static void m1835b(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }
}
