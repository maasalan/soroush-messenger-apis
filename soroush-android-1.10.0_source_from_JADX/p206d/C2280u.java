package p206d;

import java.nio.charset.Charset;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C2280u {
    public static final Charset f7576a = Charset.forName(StringUtils.UTF8);

    public static int m6233a(int i) {
        return ((i & 255) << 24) | ((((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8)) | ((65280 & i) << 8));
    }

    public static short m6234a(short s) {
        int i = s & InBandBytestreamManager.MAXIMUM_BLOCK_SIZE;
        return (short) (((i & 255) << 8) | ((65280 & i) >>> 8));
    }

    public static void m6235a(long j, long j2, long j3) {
        if ((j2 | j3) >= 0 && j2 <= j) {
            if (j - j2 >= j3) {
                return;
            }
        }
        throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)}));
    }

    public static void m6236a(Throwable th) {
        throw th;
    }

    public static boolean m6237a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }
}
