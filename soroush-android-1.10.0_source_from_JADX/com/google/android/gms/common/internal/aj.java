package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

abstract class aj extends an<Boolean> {
    private int f15148a;
    private Bundle f15149b;
    private /* synthetic */ ai f15150c;

    protected aj(ai aiVar, int i, Bundle bundle) {
        this.f15150c = aiVar;
        super(aiVar, Boolean.valueOf(true));
        this.f15148a = i;
        this.f15149b = bundle;
    }

    protected abstract void mo3020a(ConnectionResult connectionResult);

    protected final /* synthetic */ void mo1563a(Object obj) {
        if (((Boolean) obj) == null) {
            this.f15150c.m4391a(1, null);
            return;
        }
        int i = this.f15148a;
        PendingIntent pendingIntent = null;
        if (i == 0) {
            if (!mo3021a()) {
                this.f15150c.m4391a(1, null);
                mo3020a(new ConnectionResult(8, null));
            }
        } else if (i != 10) {
            this.f15150c.m4391a(1, null);
            if (this.f15149b != null) {
                pendingIntent = (PendingIntent) this.f15149b.getParcelable("pendingIntent");
            }
            mo3020a(new ConnectionResult(this.f15148a, pendingIntent));
        } else {
            this.f15150c.m4391a(1, null);
            throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
        }
    }

    protected abstract boolean mo3021a();
}
