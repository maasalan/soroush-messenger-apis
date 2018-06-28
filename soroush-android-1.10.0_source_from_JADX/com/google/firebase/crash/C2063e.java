package com.google.firebase.crash;

import android.util.Log;
import com.google.android.gms.common.util.C1786e;
import com.google.android.gms.internal.mg;
import com.google.android.gms.internal.mi;
import com.google.android.gms.internal.zzdxr;
import com.google.android.gms.p158a.C6566m;
import com.google.firebase.C2057b;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

final class C2063e implements Runnable {
    private /* synthetic */ Future f6932a;
    private /* synthetic */ long f6933b = 10000;
    private /* synthetic */ C2064f f6934c;
    private /* synthetic */ C2061c f6935d;

    C2063e(C2061c c2061c, Future future, C2064f c2064f) {
        this.f6935d = c2061c;
        this.f6932a = future;
        this.f6934c = c2064f;
    }

    public final void run() {
        mg mgVar;
        String valueOf;
        try {
            mgVar = (mg) this.f6932a.get(this.f6933b, TimeUnit.MILLISECONDS);
        } catch (Throwable e) {
            Log.e("FirebaseCrash", "Failed to initialize crash reporting", e);
            this.f6932a.cancel(true);
            mgVar = null;
        }
        if (mgVar == null) {
            this.f6934c.mo1773a();
            return;
        }
        try {
            C2057b b = this.f6935d.f6929b.m5598b();
            mgVar.mo1657a(C6566m.m15848a(this.f6935d.f6930c), new zzdxr(b.f6912b, b.f6911a));
            if (this.f6935d.f6928a == null) {
                this.f6935d.f6928a = FirebaseInstanceId.m5609a().m5620c();
            }
            mgVar.mo1658a(this.f6935d.f6928a);
            valueOf = String.valueOf(mi.m4995a());
            StringBuilder stringBuilder = new StringBuilder(36 + String.valueOf(valueOf).length());
            stringBuilder.append("FirebaseCrash reporting initialized ");
            stringBuilder.append(valueOf);
            Log.i("FirebaseCrash", stringBuilder.toString());
            this.f6934c.mo1774a(mgVar);
        } catch (Throwable e2) {
            String str = "FirebaseCrash";
            valueOf = "Failed to initialize crash reporting: ";
            String valueOf2 = String.valueOf(e2.getMessage());
            Log.e(str, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
            C1786e.m4522a(this.f6935d.f6930c, e2);
            this.f6934c.mo1773a();
        }
    }
}
