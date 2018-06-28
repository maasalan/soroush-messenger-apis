package org.apache.p493a.p494a.p495a;

import java.io.Serializable;
import java.text.DateFormat;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C4605d implements Serializable, Comparable<C4605d> {
    public final long f12641a;
    DateFormat f12642b;

    public C4605d(long j) {
        this.f12641a = j;
    }

    public static long m8339a(long j) {
        long j2 = (j >>> 32) & 4294967295L;
        return (((j2 & IjkMediaMeta.AV_CH_WIDE_LEFT) == 0 ? 2085978496000L : -2208988800000L) + (j2 * 1000)) + Math.round((1000.0d * ((double) (j & 4294967295L))) / 4.294967296E9d);
    }

    public static C4605d m8340a() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = 2085978496000L;
        Object obj = currentTimeMillis < 2085978496000L ? 1 : null;
        if (obj != null) {
            j = -2208988800000L;
        }
        long j2 = currentTimeMillis - j;
        j = j2 / 1000;
        j2 = ((j2 % 1000) * IjkMediaMeta.AV_CH_WIDE_RIGHT) / 1000;
        if (obj != null) {
            j |= IjkMediaMeta.AV_CH_WIDE_LEFT;
        }
        return new C4605d((j << 32) | j2);
    }

    private static void m8341a(StringBuilder stringBuilder, long j) {
        String toHexString = Long.toHexString(j);
        for (int length = toHexString.length(); length < 8; length++) {
            stringBuilder.append('0');
        }
        stringBuilder.append(toHexString);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C4605d c4605d = (C4605d) obj;
        long j = this.f12641a;
        long j2 = c4605d.f12641a;
        return j < j2 ? -1 : j == j2 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4605d) && this.f12641a == ((C4605d) obj).f12641a;
    }

    public final int hashCode() {
        return (int) (this.f12641a ^ (this.f12641a >>> 32));
    }

    public final String toString() {
        long j = this.f12641a;
        StringBuilder stringBuilder = new StringBuilder();
        C4605d.m8341a(stringBuilder, (j >>> 32) & 4294967295L);
        stringBuilder.append('.');
        C4605d.m8341a(stringBuilder, j & 4294967295L);
        return stringBuilder.toString();
    }
}
