package com.google.android.gms.common.api.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Handler;
import com.google.android.gms.common.C5458b;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicReference;

public abstract class ao extends LifecycleCallback implements OnCancelListener {
    protected volatile boolean f15108b;
    protected final AtomicReference<ap> f15109c;
    protected final C5458b f15110d;
    private final Handler f15111e;

    protected abstract void mo3010a(ConnectionResult connectionResult, int i);

    protected abstract void mo3011b();

    public final void m11761b(ConnectionResult connectionResult, int i) {
        ap apVar = new ap(connectionResult, i);
        if (this.f15109c.compareAndSet(null, apVar)) {
            this.f15111e.post(new aq(this, apVar));
        }
    }

    protected final void m11762c() {
        this.f15109c.set(null);
        mo3011b();
    }

    public void onCancel(DialogInterface dialogInterface) {
        ap apVar = (ap) this.f15109c.get();
        mo3010a(new ConnectionResult(13, null), apVar == null ? -1 : apVar.f5251a);
        m11762c();
    }
}
