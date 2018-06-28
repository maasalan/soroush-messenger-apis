package com.google.android.gms.internal;

import com.google.android.gms.common.C1771k;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class C1826w {
    public static final String f6280a = String.valueOf(C1771k.f5418b / IjkMediaCodecInfo.RANK_MAX).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
    public static final String f6281b;

    static {
        String str = "ma";
        String valueOf = String.valueOf(f6280a);
        f6281b = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }
}
