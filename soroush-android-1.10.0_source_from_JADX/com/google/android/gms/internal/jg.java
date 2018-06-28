package com.google.android.gms.internal;

import android.content.Intent;

public final /* synthetic */ class jg implements Runnable {
    private final jf f6053a;
    private final int f6054b;
    private final ft f6055c;
    private final Intent f6056d;

    public jg(jf jfVar, int i, ft ftVar, Intent intent) {
        this.f6053a = jfVar;
        this.f6054b = i;
        this.f6055c = ftVar;
        this.f6056d = intent;
    }

    public final void run() {
        jf jfVar = this.f6053a;
        int i = this.f6054b;
        ft ftVar = this.f6055c;
        Intent intent = this.f6056d;
        if (((jj) jfVar.f6052a).mo1710a(i)) {
            ftVar.f18140g.m4847a("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            jfVar.m4953c().f18140g.m4846a("Completed wakeful intent.");
            ((jj) jfVar.f6052a).mo1709a(intent);
        }
    }
}
