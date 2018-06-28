package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.C1720i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;

public class PlacePhotoMetadataResult extends zzbej implements C1720i {
    public static final Creator<PlacePhotoMetadataResult> CREATOR = new C1836f();
    private final Status f18592a;
    private DataHolder f18593b;
    private final C7141b f18594c;

    public PlacePhotoMetadataResult(Status status, DataHolder dataHolder) {
        this.f18592a = status;
        this.f18593b = dataHolder;
        this.f18594c = dataHolder == null ? null : new C7141b(this.f18593b);
    }

    public final Status mo3007a() {
        return this.f18592a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4731a(parcel, 1, this.f18592a, i);
        dm.m4731a(parcel, 2, this.f18593b, i);
        dm.m4742b(parcel, a);
    }
}
