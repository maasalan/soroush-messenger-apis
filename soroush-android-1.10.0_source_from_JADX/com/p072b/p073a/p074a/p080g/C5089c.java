package com.p072b.p073a.p074a.p080g;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest.Builder;
import android.os.Build.VERSION;
import android.os.PowerManager;
import com.p072b.p073a.p074a.p080g.C1042a.C1041a;

public final class C5089c implements C1042a, C1043b {
    private C1041a f14212a;

    class C10441 extends BroadcastReceiver {
        final /* synthetic */ C5089c f3378a;

        C10441(C5089c c5089c) {
            this.f3378a = c5089c;
        }

        public final void onReceive(Context context, Intent intent) {
            this.f3378a.m10379b(context);
        }
    }

    class C10463 extends BroadcastReceiver {
        final /* synthetic */ C5089c f3381a;

        C10463(C5089c c5089c) {
            this.f3381a = c5089c;
        }

        public final void onReceive(Context context, Intent intent) {
            this.f3381a.m10379b(context);
        }
    }

    public C5089c(Context context) {
        context = context.getApplicationContext();
        if (VERSION.SDK_INT >= 21) {
            if (VERSION.SDK_INT >= 23) {
                context.registerReceiver(new C10463(this), new IntentFilter("android.os.action.DEVICE_IDLE_MODE_CHANGED"));
            }
            ((ConnectivityManager) context.getSystemService("connectivity")).registerNetworkCallback(new Builder().addCapability(12).addCapability(13).build(), new NetworkCallback(this) {
                final /* synthetic */ C5089c f3380b;

                public final void onAvailable(Network network) {
                    this.f3380b.m10379b(context);
                }
            });
            return;
        }
        BroadcastReceiver c10441 = new C10441(this);
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        if (VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        context.registerReceiver(c10441, intentFilter);
    }

    public final int mo1084a(Context context) {
        int i;
        NetworkInfo activeNetworkInfo;
        if (VERSION.SDK_INT >= 23) {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            if (powerManager.isDeviceIdleMode() && !powerManager.isIgnoringBatteryOptimizations(context.getPackageName())) {
                i = 1;
                if (i != 0) {
                    return 0;
                }
                activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    return 0;
                }
                if (activeNetworkInfo.getType() != 1) {
                    if (activeNetworkInfo.getType() == 9) {
                        return 1;
                    }
                }
                return 2;
            }
        }
        i = 0;
        if (i != 0) {
            return 0;
        }
        activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return 0;
        }
        if (activeNetworkInfo.getType() != 1) {
            if (activeNetworkInfo.getType() == 9) {
                return 1;
            }
        }
        return 2;
    }

    public final void mo1085a(C1041a c1041a) {
        this.f14212a = c1041a;
    }

    final void m10379b(Context context) {
        if (this.f14212a != null) {
            C1041a c1041a = this.f14212a;
            mo1084a(context);
            c1041a.mo1096a();
        }
    }
}
