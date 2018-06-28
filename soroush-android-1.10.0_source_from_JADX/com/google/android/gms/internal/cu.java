package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class cu {
    private static int m4672a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16));
    }

    private static long m4673a(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        j4 = (j2 ^ (j4 ^ (j4 >>> 47))) * j3;
        return (j4 ^ (j4 >>> 47)) * j3;
    }

    public static long m4674a(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        if (length >= 0) {
            if (length <= bArr2.length) {
                long b;
                long b2;
                long b3;
                long b4;
                if (length <= 32) {
                    if (length > 16) {
                        long j = -7286425919675154353L + ((long) (length << 1));
                        b = m4677b(bArr2, 0) * -5435081209227447693L;
                        b2 = m4677b(bArr2, 8);
                        length += 0;
                        b3 = m4677b(bArr2, length - 8) * j;
                        return m4673a((Long.rotateRight(b + b2, 43) + Long.rotateRight(b3, 30)) + (m4677b(bArr2, length - 16) * -7286425919675154353L), (b + Long.rotateRight(b2 - 7286425919675154353L, 18)) + b3, j);
                    } else if (length >= 8) {
                        long j2 = -7286425919675154353L + ((long) (length << 1));
                        b4 = m4677b(bArr2, 0) - 7286425919675154353L;
                        long b5 = m4677b(bArr2, (length + 0) - 8);
                        return m4673a((Long.rotateRight(b5, 37) * j2) + b4, (Long.rotateRight(b4, 25) + b5) * j2, j2);
                    } else if (length >= 4) {
                        return m4673a(((long) length) + ((((long) m4672a(bArr2, 0)) & 4294967295L) << 3), ((long) m4672a(bArr2, (length + 0) - 4)) & 4294967295L, -7286425919675154353L + ((long) (length << 1)));
                    } else if (length <= 0) {
                        return -7286425919675154353L;
                    } else {
                        b4 = (((long) ((bArr2[0] & 255) + ((bArr2[(length >> 1) + 0] & 255) << 8))) * -7286425919675154353L) ^ (((long) (length + ((bArr2[0 + (length - 1)] & 255) << 2))) * -4348849565147123417L);
                        return (b4 ^ (b4 >>> 47)) * -7286425919675154353L;
                    }
                } else if (length > 64) {
                    return m4675a(bArr2, 0, length);
                } else {
                    long j3 = -7286425919675154353L + ((long) (length << 1));
                    long b6 = m4677b(bArr2, 0) * -7286425919675154353L;
                    b2 = m4677b(bArr2, 8);
                    length += 0;
                    b3 = m4677b(bArr2, length - 8) * j3;
                    b = (Long.rotateRight(b6 + b2, 43) + Long.rotateRight(b3, 30)) + (m4677b(bArr2, length - 16) * -7286425919675154353L);
                    b4 = m4673a(b, (b6 + Long.rotateRight(b2 - 7286425919675154353L, 18)) + b3, j3);
                    long b7 = m4677b(bArr2, 16) * j3;
                    b2 = m4677b(bArr2, 24);
                    b = (b + m4677b(bArr2, length - 32)) * j3;
                    return m4673a((Long.rotateRight(b7 + b2, 43) + Long.rotateRight(b, 30)) + ((b4 + m4677b(bArr2, length - 24)) * j3), (b7 + Long.rotateRight(b2 + b6, 18)) + b, j3);
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder(67);
        stringBuilder.append("Out of bound index with offput: 0 and length: ");
        stringBuilder.append(length);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    private static long m4675a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = bArr;
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        int i3 = 0;
        long b = 95310865018149119L + m4677b(bArr2, 0);
        int i4 = i2 - 1;
        int i5 = 0 + ((i4 / 64) << 6);
        int i6 = i4 & 63;
        int i7 = (i5 + i6) - 63;
        long j = 2480279821605975764L;
        long j2 = 1390051526045402406L;
        int i8 = i;
        while (true) {
            long rotateRight = (Long.rotateRight(((b + j) + jArr[i3]) + m4677b(bArr2, i8 + 8), 37) * -5435081209227447693L) ^ jArr2[1];
            byte[] bArr3 = bArr;
            long rotateRight2 = (Long.rotateRight((j + jArr[1]) + m4677b(bArr2, i8 + 48), 42) * -5435081209227447693L) + (jArr[0] + m4677b(bArr3, i8 + 40));
            long rotateRight3 = Long.rotateRight(j2 + jArr2[0], 33) * -5435081209227447693L;
            m4676a(bArr3, i8, jArr[1] * -5435081209227447693L, rotateRight + jArr2[0], jArr);
            m4676a(bArr3, i8 + 32, rotateRight3 + jArr2[1], rotateRight2 + m4677b(bArr3, i8 + 16), jArr2);
            i8 += 64;
            if (i8 == i5) {
                long j3 = -5435081209227447693L + ((rotateRight & 255) << 1);
                jArr2[0] = jArr2[0] + ((long) i6);
                jArr[0] = jArr[0] + jArr2[0];
                jArr2[0] = jArr2[0] + jArr[0];
                long rotateRight4 = (Long.rotateRight(((rotateRight3 + rotateRight2) + jArr[0]) + m4677b(bArr3, i7 + 8), 37) * j3) ^ (jArr2[1] * 9);
                long rotateRight5 = (Long.rotateRight((rotateRight2 + jArr[1]) + m4677b(bArr3, i7 + 48), 42) * j3) + ((jArr[0] * 9) + m4677b(bArr3, i7 + 40));
                long rotateRight6 = Long.rotateRight(rotateRight + jArr2[0], 33) * j3;
                m4676a(bArr3, i7, jArr[1] * j3, rotateRight4 + jArr2[0], jArr);
                m4676a(bArr3, i7 + 32, rotateRight6 + jArr2[1], rotateRight5 + m4677b(bArr3, i7 + 16), jArr2);
                long j4 = j3;
                return m4673a((m4673a(jArr[0], jArr2[0], j4) + ((rotateRight5 ^ (rotateRight5 >>> 47)) * -4348849565147123417L)) + rotateRight4, m4673a(jArr[1], jArr2[1], j4) + rotateRight6, j4);
            }
            bArr2 = bArr3;
            j = rotateRight2;
            b = rotateRight3;
            j2 = rotateRight;
            i3 = 0;
        }
    }

    private static void m4676a(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long b = m4677b(bArr, i);
        long b2 = m4677b(bArr, i + 8);
        long b3 = m4677b(bArr, i + 16);
        long b4 = m4677b(bArr, i + 24);
        long j3 = j + b;
        b = (j3 + b2) + b3;
        b2 = Long.rotateRight((j2 + j3) + b4, 21) + Long.rotateRight(b, 44);
        jArr[0] = b + b4;
        jArr[1] = b2 + j3;
    }

    private static long m4677b(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }
}
