package com.google.android.gms.location.places.p161a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.C5458b;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.internal.zzben;
import com.google.android.gms.location.places.C1832a;
import com.google.android.gms.location.places.internal.PlaceEntity;

public final class C5508a extends C1830b {

    public static class C5507a extends C1831c {
        public C5507a() {
            super("com.google.android.gms.location.places.ui.PICK_PLACE");
            this.a.putExtra("gmscore_client_jar_version", C5458b.f15143a);
        }

        public final Intent mo1673a(Activity activity) {
            return super.mo1673a(activity);
        }
    }

    @Deprecated
    public static C1832a m12042a(Intent intent, Context context) {
        zzben com_google_android_gms_internal_zzben;
        ac.m4377a((Object) intent, (Object) "intent must not be null");
        ac.m4377a((Object) context, (Object) "context must not be null");
        Object obj = PlaceEntity.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("selected_place");
        if (byteArrayExtra == null) {
            com_google_android_gms_internal_zzben = null;
        } else {
            ac.m4376a(obj);
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            obtain.setDataPosition(0);
            com_google_android_gms_internal_zzben = (zzben) obj.createFromParcel(obtain);
            obtain.recycle();
        }
        return (C1832a) com_google_android_gms_internal_zzben;
    }
}
