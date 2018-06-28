package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public abstract class cw extends mo implements cv {
    public cw() {
        attachInterface(this, "com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m5003a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo3028a((Status) mp.m5004a(parcel, Status.CREATOR));
                return true;
            case 2:
                mp.m5004a(parcel, Status.CREATOR);
                mo3027a();
                return true;
            case 3:
                mp.m5004a(parcel, Status.CREATOR);
                parcel.readLong();
                mo3029b();
                return true;
            case 4:
                mp.m5004a(parcel, Status.CREATOR);
                mo3031d();
                return true;
            case 5:
                mp.m5004a(parcel, Status.CREATOR);
                parcel.readLong();
                mo3032e();
                return true;
            case 6:
                mp.m5004a(parcel, Status.CREATOR);
                parcel.createTypedArray(zzbde.CREATOR);
                mo3034g();
                return true;
            case 7:
                mp.m5004a(parcel, DataHolder.CREATOR);
                mo3035h();
                return true;
            case 8:
                mp.m5004a(parcel, Status.CREATOR);
                mp.m5004a(parcel, zzbdc.CREATOR);
                mo3030c();
                return true;
            case 9:
                mp.m5004a(parcel, Status.CREATOR);
                mp.m5004a(parcel, zzbdc.CREATOR);
                mo3033f();
                return true;
            default:
                return false;
        }
    }
}
