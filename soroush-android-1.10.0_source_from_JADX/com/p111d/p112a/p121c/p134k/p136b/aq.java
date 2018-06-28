package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p138m.C6523u;
import java.util.UUID;

public final class aq extends ak<UUID> {
    static final char[] f20230a = "0123456789abcdef".toCharArray();

    public aq() {
        super(UUID.class);
    }

    private static final void m18575a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >> 24);
        i2++;
        bArr[i2] = (byte) (i >> 16);
        i2++;
        bArr[i2] = (byte) (i >> 8);
        bArr[i2 + 1] = (byte) i;
    }

    private static void m18576a(int i, char[] cArr, int i2) {
        aq.m18577b(i >> 16, cArr, i2);
        aq.m18577b(i, cArr, i2 + 4);
    }

    private static void m18577b(int i, char[] cArr, int i2) {
        cArr[i2] = f20230a[(i >> 12) & 15];
        i2++;
        cArr[i2] = f20230a[(i >> 8) & 15];
        i2++;
        cArr[i2] = f20230a[(i >> 4) & 15];
        cArr[i2 + 1] = f20230a[i & 15];
    }

    public final /* synthetic */ boolean isEmpty(aa aaVar, Object obj) {
        UUID uuid = (UUID) obj;
        return uuid == null ? true : uuid.getLeastSignificantBits() == 0 && uuid.getMostSignificantBits() == 0;
    }

    public final /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
        UUID uuid = (UUID) obj;
        if (!c5301g.canWriteBinaryNatively() || (c5301g instanceof C6523u)) {
            char[] cArr = new char[36];
            long mostSignificantBits = uuid.getMostSignificantBits();
            aq.m18576a((int) (mostSignificantBits >> 32), cArr, 0);
            cArr[8] = '-';
            int i = (int) mostSignificantBits;
            aq.m18577b(i >>> 16, cArr, 9);
            cArr[13] = '-';
            aq.m18577b(i, cArr, 14);
            cArr[18] = '-';
            mostSignificantBits = uuid.getLeastSignificantBits();
            aq.m18577b((int) (mostSignificantBits >>> 48), cArr, 19);
            cArr[23] = '-';
            aq.m18577b((int) (mostSignificantBits >>> 32), cArr, 24);
            aq.m18576a((int) mostSignificantBits, cArr, 28);
            c5301g.writeString(cArr, 0, 36);
            return;
        }
        byte[] bArr = new byte[16];
        long mostSignificantBits2 = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        aq.m18575a((int) (mostSignificantBits2 >> 32), bArr, 0);
        aq.m18575a((int) mostSignificantBits2, bArr, 4);
        aq.m18575a((int) (leastSignificantBits >> 32), bArr, 8);
        aq.m18575a((int) leastSignificantBits, bArr, 12);
        c5301g.writeBinary(bArr);
    }
}
