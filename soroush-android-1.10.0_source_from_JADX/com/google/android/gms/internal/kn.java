package com.google.android.gms.internal;

import android.database.ContentObserver;

final class kn extends ContentObserver {
    private /* synthetic */ kl f6080a;

    kn(kl klVar) {
        this.f6080a = klVar;
        super(null);
    }

    public final void onChange(boolean z) {
        synchronized (this.f6080a.f6078e) {
            this.f6080a.f6079f = null;
        }
    }
}
