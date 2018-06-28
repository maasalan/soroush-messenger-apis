package com.liulishuo.filedownloader;

import android.os.SystemClock;
import com.liulishuo.filedownloader.C2219r.C2217a;
import com.liulishuo.filedownloader.C2219r.C2218b;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class C5655b implements C2217a, C2218b {
    private long f15524a;
    private long f15525b;
    private long f15526c;
    private long f15527d;
    private int f15528e;
    private int f15529f = IjkMediaCodecInfo.RANK_MAX;

    public final void mo1859a() {
        this.f15528e = 0;
        this.f15524a = 0;
    }

    public final void mo1860a(long j) {
        this.f15527d = SystemClock.uptimeMillis();
        this.f15526c = j;
    }

    public final void mo1861b(long j) {
        if (this.f15527d > 0) {
            long j2 = j - this.f15526c;
            this.f15524a = 0;
            long uptimeMillis = SystemClock.uptimeMillis() - this.f15527d;
            if (uptimeMillis > 0) {
                j2 /= uptimeMillis;
            }
            this.f15528e = (int) j2;
        }
    }

    public final void mo1862c(long j) {
        if (this.f15529f > 0) {
            int i = 1;
            if (this.f15524a != 0) {
                long uptimeMillis = SystemClock.uptimeMillis() - this.f15524a;
                if (uptimeMillis < ((long) this.f15529f)) {
                    if (this.f15528e != 0 || uptimeMillis <= 0) {
                        i = 0;
                    }
                }
                this.f15528e = (int) ((j - this.f15525b) / uptimeMillis);
                this.f15528e = Math.max(0, this.f15528e);
            }
            if (i != 0) {
                this.f15525b = j;
                this.f15524a = SystemClock.uptimeMillis();
            }
        }
    }
}
