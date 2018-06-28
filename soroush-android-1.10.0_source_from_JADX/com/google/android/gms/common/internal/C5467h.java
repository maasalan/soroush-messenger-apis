package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.stats.C1775a;
import java.util.HashMap;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

final class C5467h extends C1758f implements Callback {
    private final HashMap<C1759g, C1760i> f15160a = new HashMap();
    private final Context f15161b;
    private final Handler f15162c;
    private final C1775a f15163d;
    private final long f15164e;
    private final long f15165f;

    C5467h(Context context) {
        this.f15161b = context.getApplicationContext();
        this.f15162c = new Handler(context.getMainLooper(), this);
        this.f15163d = C1775a.m4485a();
        this.f15164e = 5000;
        this.f15165f = 300000;
    }

    protected final boolean mo1568a(C1759g c1759g, ServiceConnection serviceConnection) {
        boolean z;
        ac.m4377a((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f15160a) {
            C1760i c1760i = (C1760i) this.f15160a.get(c1759g);
            if (c1760i != null) {
                this.f15162c.removeMessages(0, c1759g);
                if (!c1760i.m4456b(serviceConnection)) {
                    c1760i.m4454a(serviceConnection);
                    switch (c1760i.f5401b) {
                        case 1:
                            serviceConnection.onServiceConnected(c1760i.f5405f, c1760i.f5403d);
                            break;
                        case 2:
                            c1760i.m4453a();
                            break;
                        default:
                            break;
                    }
                }
                String valueOf = String.valueOf(c1759g);
                StringBuilder stringBuilder = new StringBuilder(81 + String.valueOf(valueOf).length());
                stringBuilder.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
            }
            c1760i = new C1760i(this, c1759g);
            c1760i.m4454a(serviceConnection);
            c1760i.m4453a();
            this.f15160a.put(c1759g, c1760i);
            z = c1760i.f5402c;
        }
        return z;
    }

    protected final void mo1569b(C1759g c1759g, ServiceConnection serviceConnection) {
        ac.m4377a((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f15160a) {
            C1760i c1760i = (C1760i) this.f15160a.get(c1759g);
            String valueOf;
            StringBuilder stringBuilder;
            if (c1760i == null) {
                valueOf = String.valueOf(c1759g);
                stringBuilder = new StringBuilder(50 + String.valueOf(valueOf).length());
                stringBuilder.append("Nonexistent connection status for service config: ");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (c1760i.m4456b(serviceConnection)) {
                c1760i.f5400a.remove(serviceConnection);
                if (c1760i.m4455b()) {
                    this.f15162c.sendMessageDelayed(this.f15162c.obtainMessage(0, c1759g), this.f15164e);
                }
            } else {
                valueOf = String.valueOf(c1759g);
                stringBuilder = new StringBuilder(76 + String.valueOf(valueOf).length());
                stringBuilder.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        C1759g c1759g;
        switch (message.what) {
            case 0:
                synchronized (this.f15160a) {
                    c1759g = (C1759g) message.obj;
                    C1760i c1760i = (C1760i) this.f15160a.get(c1759g);
                    if (c1760i != null && c1760i.m4455b()) {
                        if (c1760i.f5402c) {
                            c1760i.f5406g.f15162c.removeMessages(1, c1760i.f5404e);
                            c1760i.f5406g.f15161b.unbindService(c1760i);
                            c1760i.f5402c = false;
                            c1760i.f5401b = 2;
                        }
                        this.f15160a.remove(c1759g);
                    }
                }
                return true;
            case 1:
                synchronized (this.f15160a) {
                    c1759g = (C1759g) message.obj;
                    C1760i c1760i2 = (C1760i) this.f15160a.get(c1759g);
                    if (c1760i2 != null && c1760i2.f5401b == 3) {
                        String valueOf = String.valueOf(c1759g);
                        StringBuilder stringBuilder = new StringBuilder(47 + String.valueOf(valueOf).length());
                        stringBuilder.append("Timeout waiting for ServiceConnection callback ");
                        stringBuilder.append(valueOf);
                        Log.wtf("GmsClientSupervisor", stringBuilder.toString(), new Exception());
                        ComponentName componentName = c1760i2.f5405f;
                        if (componentName == null) {
                            componentName = c1759g.f5397b;
                        }
                        if (componentName == null) {
                            componentName = new ComponentName(c1759g.f5396a, IjkMediaMeta.IJKM_VAL_TYPE__UNKNOWN);
                        }
                        c1760i2.onServiceDisconnected(componentName);
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
