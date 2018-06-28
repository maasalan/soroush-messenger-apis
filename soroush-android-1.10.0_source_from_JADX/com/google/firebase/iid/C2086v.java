package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.iid.C1815a;
import com.google.android.gms.iid.MessengerCompat;

final class C2086v {
    private static String f7018c = C1815a.class.getName();
    final Messenger f7019a;
    final MessengerCompat f7020b;

    C2086v(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f7019a = new Messenger(iBinder);
            this.f7020b = null;
        } else if (f7018c.equals(interfaceDescriptor)) {
            this.f7020b = new MessengerCompat(iBinder);
            this.f7019a = null;
        } else {
            String str = "MessengerIpcClient";
            String str2 = "Invalid interface descriptor: ";
            interfaceDescriptor = String.valueOf(interfaceDescriptor);
            Log.w(str, interfaceDescriptor.length() != 0 ? str2.concat(interfaceDescriptor) : new String(str2));
            throw new RemoteException();
        }
    }
}
