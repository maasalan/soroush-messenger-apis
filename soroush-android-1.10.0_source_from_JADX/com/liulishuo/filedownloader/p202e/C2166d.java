package com.liulishuo.filedownloader.p202e;

import android.annotation.TargetApi;
import com.liulishuo.filedownloader.p205h.C2185f;
import java.io.IOException;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C2166d extends IOException {
    private long f7236a;
    private long f7237b;
    private long f7238c;

    public C2166d(long j, long j2, long j3) {
        super(C2185f.m5996a("The file is too large to store, breakpoint in bytes:  %d, required space in bytes: %d, but free space in bytes: %d", Long.valueOf(j3), Long.valueOf(j2), Long.valueOf(j)));
        m5939a(j, j2, j3);
    }

    @TargetApi(9)
    public C2166d(long j, long j2, Throwable th) {
        super(C2185f.m5996a("The file is too large to store, breakpoint in bytes:  %d, required space in bytes: %d, but free space in bytes: %d", Long.valueOf(j2), Long.valueOf(IjkMediaMeta.AV_CH_TOP_FRONT_LEFT), Long.valueOf(j)), th);
        m5939a(j, IjkMediaMeta.AV_CH_TOP_FRONT_LEFT, j2);
    }

    private void m5939a(long j, long j2, long j3) {
        this.f7236a = j;
        this.f7237b = j2;
        this.f7238c = j3;
    }
}
