package com.google.android.gms.common.internal;

import android.util.Log;

public abstract class an<TListener> {
    private TListener f5371a;
    private boolean f5372b = false;
    private /* synthetic */ ai f5373c;

    public an(ai aiVar, TListener tListener) {
        this.f5373c = aiVar;
        this.f5371a = tListener;
    }

    protected abstract void mo1563a(TListener tListener);

    public final void m4431b() {
        synchronized (this) {
            Object obj = this.f5371a;
            if (this.f5372b) {
                String valueOf = String.valueOf(this);
                StringBuilder stringBuilder = new StringBuilder(47 + String.valueOf(valueOf).length());
                stringBuilder.append("Callback proxy ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" being reused. This is not safe.");
                Log.w("GmsClient", stringBuilder.toString());
            }
        }
        if (obj != null) {
            try {
                mo1563a(obj);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.f5372b = true;
        }
        m4432c();
    }

    public final void m4432c() {
        m4433d();
        synchronized (this.f5373c.f5361r) {
            this.f5373c.f5361r.remove(this);
        }
    }

    public final void m4433d() {
        synchronized (this) {
            this.f5371a = null;
        }
    }
}
