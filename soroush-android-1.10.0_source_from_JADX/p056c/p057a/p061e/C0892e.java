package p056c.p057a.p061e;

import java.io.IOException;
import p056c.p057a.C0885c;
import p206d.C2272f;

public final class C0892e {
    static final C2272f f2693a = C2272f.m6191a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    static final String[] f2694b = new String[64];
    static final String[] f2695c = new String[256];
    private static final String[] f2696d;

    static {
        r0 = new String[10];
        int i = 0;
        r0[0] = "DATA";
        r0[1] = "HEADERS";
        r0[2] = "PRIORITY";
        r0[3] = "RST_STREAM";
        r0[4] = "SETTINGS";
        r0[5] = "PUSH_PROMISE";
        r0[6] = "PING";
        r0[7] = "GOAWAY";
        r0[8] = "WINDOW_UPDATE";
        r0[9] = "CONTINUATION";
        f2696d = r0;
        for (int i2 = 0; i2 < f2695c.length; i2++) {
            f2695c[i2] = C0885c.m2092a("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
        }
        f2694b[0] = "";
        f2694b[1] = "END_STREAM";
        int[] iArr = new int[]{1};
        f2694b[8] = "PADDED";
        for (int i3 = 0; i3 <= 0; i3++) {
            int i4 = iArr[i3];
            String[] strArr = f2694b;
            int i5 = i4 | 8;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(f2694b[i4]);
            stringBuilder.append("|PADDED");
            strArr[i5] = stringBuilder.toString();
        }
        f2694b[4] = "END_HEADERS";
        f2694b[32] = "PRIORITY";
        f2694b[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = new int[]{4, 32, 36};
        for (i4 = 0; i4 < 3; i4++) {
            int i6 = iArr2[i4];
            for (int i7 = 0; i7 <= 0; i7++) {
                int i8 = iArr[i7];
                String[] strArr2 = f2694b;
                int i9 = i8 | i6;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(f2694b[i8]);
                stringBuilder2.append('|');
                stringBuilder2.append(f2694b[i6]);
                strArr2[i9] = stringBuilder2.toString();
                strArr2 = f2694b;
                i9 |= 8;
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(f2694b[i8]);
                stringBuilder2.append('|');
                stringBuilder2.append(f2694b[i6]);
                stringBuilder2.append("|PADDED");
                strArr2[i9] = stringBuilder2.toString();
            }
        }
        while (i < f2694b.length) {
            if (f2694b[i] == null) {
                f2694b[i] = f2695c[i];
            }
            i++;
        }
    }

    private C0892e() {
    }

    static IllegalArgumentException m2132a(String str, Object... objArr) {
        throw new IllegalArgumentException(C0885c.m2092a(str, objArr));
    }

    static String m2133a(boolean z, int i, int i2, byte b, byte b2) {
        String str;
        String a = b < f2696d.length ? f2696d[b] : C0885c.m2092a("0x%02x", Byte.valueOf(b));
        if (b2 != (byte) 0) {
            switch (b) {
                case (byte) 2:
                case (byte) 3:
                case (byte) 7:
                case (byte) 8:
                    str = f2695c[b2];
                    break;
                case (byte) 4:
                case (byte) 6:
                    if (b2 != (byte) 1) {
                        str = f2695c[b2];
                        break;
                    }
                    str = "ACK";
                    break;
                default:
                    CharSequence charSequence;
                    CharSequence charSequence2;
                    String str2 = b2 < f2694b.length ? f2694b[b2] : f2695c[b2];
                    if (b == (byte) 5 && (b2 & 4) != 0) {
                        charSequence = "HEADERS";
                        charSequence2 = "PUSH_PROMISE";
                    } else if (b != (byte) 0 || (b2 & 32) == 0) {
                        str = str2;
                        break;
                    } else {
                        charSequence = "PRIORITY";
                        charSequence2 = "COMPRESSED";
                    }
                    str = str2.replace(charSequence, charSequence2);
                    break;
            }
        }
        str = "";
        String str3 = "%s 0x%08x %5d %-13s %s";
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = a;
        objArr[4] = str;
        return C0885c.m2092a(str3, objArr);
    }

    static IOException m2134b(String str, Object... objArr) {
        throw new IOException(C0885c.m2092a(str, objArr));
    }
}
