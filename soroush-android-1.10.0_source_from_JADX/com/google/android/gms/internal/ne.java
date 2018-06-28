package com.google.android.gms.internal;

import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

enum ne {
    NETWORK("network", 700, 70),
    TRACE("trace", IjkMediaCodecInfo.RANK_SECURE, 30);
    
    final int f6198c;
    final int f6199d;
    final int f6200e;
    final int f6201f;
    private final String f6202g;

    private ne(String str, int i, int i2) {
        this.f6202g = str;
        this.f6198c = 10;
        this.f6199d = i;
        this.f6200e = 10;
        this.f6201f = i2;
    }

    public final String m5033a() {
        return String.valueOf(this.f6202g).concat("_flimit_time");
    }

    public final String m5034b() {
        return String.valueOf(this.f6202g).concat("_flimit_events");
    }

    public final String m5035c() {
        return String.valueOf(this.f6202g).concat("_blimit_time");
    }

    public final String m5036d() {
        return String.valueOf(this.f6202g).concat("_blimit_events");
    }

    public final String toString() {
        return name();
    }
}
