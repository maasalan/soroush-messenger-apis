package com.google.android.gms.internal;

import android.app.job.JobParameters;

final class bx implements bd {
    final /* synthetic */ Integer f15199a;
    final /* synthetic */ bp f15200b;
    final /* synthetic */ JobParameters f15201c;
    final /* synthetic */ bw f15202d;
    private /* synthetic */ C1827x f15203e;

    bx(bw bwVar, Integer num, C1827x c1827x, bp bpVar, JobParameters jobParameters) {
        this.f15202d = bwVar;
        this.f15199a = num;
        this.f15203e = c1827x;
        this.f15200b = bpVar;
        this.f15201c = jobParameters;
    }

    public final void mo1587a() {
        this.f15202d.f5616a.post(new by(this));
    }
}
