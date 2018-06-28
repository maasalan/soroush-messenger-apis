package com.google.firebase.iid;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.p160b.C1693e;

abstract class C2087x<T> {
    final int f7021a;
    final C1693e<T> f7022b = new C1693e();
    final int f7023c;
    final Bundle f7024d;

    C2087x(int i, int i2, Bundle bundle) {
        this.f7021a = i;
        this.f7023c = i2;
        this.f7024d = bundle;
    }

    abstract void mo1779a(Bundle bundle);

    final void m5690a(C2088y c2088y) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(c2088y);
            StringBuilder stringBuilder = new StringBuilder((14 + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length());
            stringBuilder.append("Failing ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" with ");
            stringBuilder.append(valueOf2);
            Log.d("MessengerIpcClient", stringBuilder.toString());
        }
        this.f7022b.m4296a((Exception) c2088y);
    }

    final void m5691a(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder stringBuilder = new StringBuilder((16 + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length());
            stringBuilder.append("Finishing ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" with ");
            stringBuilder.append(valueOf2);
            Log.d("MessengerIpcClient", stringBuilder.toString());
        }
        this.f7022b.m4297a((Object) t);
    }

    abstract boolean mo1780a();

    public String toString() {
        int i = this.f7023c;
        int i2 = this.f7021a;
        boolean a = mo1780a();
        StringBuilder stringBuilder = new StringBuilder(55);
        stringBuilder.append("Request { what=");
        stringBuilder.append(i);
        stringBuilder.append(" id=");
        stringBuilder.append(i2);
        stringBuilder.append(" oneWay=");
        stringBuilder.append(a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
