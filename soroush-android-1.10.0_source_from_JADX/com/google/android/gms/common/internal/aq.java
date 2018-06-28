package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

public final class aq implements ServiceConnection {
    private final int f5374a;
    private /* synthetic */ ai f5375b;

    public aq(ai aiVar, int i) {
        this.f5375b = aiVar;
        this.f5374a = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            ai.m4392a(this.f5375b);
            return;
        }
        synchronized (this.f5375b.f5358o) {
            C1767u c1767u;
            ai aiVar = this.f5375b;
            if (iBinder == null) {
                c1767u = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                c1767u = (queryLocalInterface == null || !(queryLocalInterface instanceof C1767u)) ? new C5473v(iBinder) : (C1767u) queryLocalInterface;
            }
            aiVar.f5359p = c1767u;
        }
        this.f5375b.m4409a(0, this.f5374a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f5375b.f5358o) {
            this.f5375b.f5359p = null;
        }
        this.f5375b.f5347d.sendMessage(this.f5375b.f5347d.obtainMessage(6, this.f5374a, 1));
    }
}
