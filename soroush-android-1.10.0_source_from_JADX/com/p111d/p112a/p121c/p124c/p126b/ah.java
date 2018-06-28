package com.p111d.p112a.p121c.p124c.p126b;

import com.p111d.p112a.p114b.C1344b;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.p540d.C6490b;
import java.util.Arrays;
import java.util.UUID;

public final class ah extends C7060l<UUID> {
    static final int[] f21002a;

    static {
        int[] iArr = new int[127];
        f21002a = iArr;
        Arrays.fill(iArr, -1);
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            f21002a[48 + i2] = i2;
        }
        while (i < 6) {
            int i3 = 10 + i;
            f21002a[97 + i] = i3;
            f21002a[65 + i] = i3;
            i++;
        }
    }

    public ah() {
        super(UUID.class);
    }

    private static int m19359a(String str, int i, C5347g c5347g) {
        return (((ah.m19366c(str, i, c5347g) << 24) + (ah.m19366c(str, i + 2, c5347g) << 16)) + (ah.m19366c(str, i + 4, c5347g) << 8)) + ah.m19366c(str, i + 6, c5347g);
    }

    private static int m19360a(String str, C5347g c5347g, char c) {
        throw C6490b.m15564a(c5347g.m11472k(), String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String: input String '%s'", new Object[]{Character.valueOf(c), Integer.toHexString(c), str}), str, UUID.class);
    }

    private static long m19361a(byte[] bArr, int i) {
        return (((long) ah.m19364b(bArr, i)) << 32) | ((((long) ah.m19364b(bArr, i + 4)) << 32) >>> 32);
    }

    private UUID m19362a(byte[] bArr, C5347g c5347g) {
        if (bArr.length == 16) {
            return new UUID(ah.m19361a(bArr, 0), ah.m19361a(bArr, 8));
        }
        C5303j k = c5347g.m11472k();
        StringBuilder stringBuilder = new StringBuilder("Can only construct UUIDs from byte[16]; got ");
        stringBuilder.append(bArr.length);
        stringBuilder.append(" bytes");
        throw C6490b.m15564a(k, stringBuilder.toString(), bArr, mo1307a());
    }

    private static int m19363b(String str, int i, C5347g c5347g) {
        return (ah.m19366c(str, i, c5347g) << 8) + ah.m19366c(str, i + 2, c5347g);
    }

    private static int m19364b(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | (((bArr[i] << 24) | ((bArr[i + 1] & 255) << 16)) | ((bArr[i + 2] & 255) << 8));
    }

    private void m19365b(String str, C5347g c5347g) {
        throw C6490b.m15564a(c5347g.m11472k(), String.format("UUID has to be represented by standard 36-char representation: input String '%s'", new Object[]{str}), str, mo1307a());
    }

    private static int m19366c(String str, int i, C5347g c5347g) {
        char charAt = str.charAt(i);
        char charAt2 = str.charAt(i + 1);
        if (charAt <= '' && charAt2 <= '') {
            int i2 = (f21002a[charAt] << 4) | f21002a[charAt2];
            if (i2 >= 0) {
                return i2;
            }
        }
        if (charAt <= '') {
            if (f21002a[charAt] >= 0) {
                return ah.m19360a(str, c5347g, charAt2);
            }
        }
        return ah.m19360a(str, c5347g, charAt);
    }

    protected final /* synthetic */ Object mo3528a(String str, C5347g c5347g) {
        if (str.length() != 36) {
            if (str.length() == 24) {
                return m19362a(C1344b.m3177a().m3170a(str), c5347g);
            }
            m19365b(str, c5347g);
        }
        if (!(str.charAt(8) == '-' && str.charAt(13) == '-' && str.charAt(18) == '-' && str.charAt(23) == '-')) {
            m19365b(str, c5347g);
        }
        return new UUID((((long) ah.m19359a(str, 0, c5347g)) << 32) + ((((long) ah.m19363b(str, 9, c5347g)) << 16) | ((long) ah.m19363b(str, 14, c5347g))), (((long) (ah.m19363b(str, 24, c5347g) | (ah.m19363b(str, 19, c5347g) << 16))) << 32) | ((((long) ah.m19359a(str, 28, c5347g)) << 32) >>> 32));
    }
}
