package com.google.android.gms.internal;

import android.app.job.JobParameters;

public final /* synthetic */ class jh implements Runnable {
    private final jf f6057a;
    private final ft f6058b;
    private final JobParameters f6059c;

    public jh(jf jfVar, ft ftVar, JobParameters jobParameters) {
        this.f6057a = jfVar;
        this.f6058b = ftVar;
        this.f6059c = jobParameters;
    }

    public final void run() {
        jf jfVar = this.f6057a;
        ft ftVar = this.f6058b;
        JobParameters jobParameters = this.f6059c;
        ftVar.f18140g.m4846a("AppMeasurementJobService processed last upload request.");
        ((jj) jfVar.f6052a).mo1708a(jobParameters);
    }
}
