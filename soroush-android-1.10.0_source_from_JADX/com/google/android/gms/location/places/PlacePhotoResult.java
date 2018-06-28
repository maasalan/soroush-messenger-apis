package com.google.android.gms.location.places;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.C1720i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import org.jivesoftware.smackx.muc.packet.MUCUser;

public class PlacePhotoResult extends zzbej implements C1720i {
    public static final Creator<PlacePhotoResult> CREATOR = new C1837g();
    private final Status f18595a;
    private BitmapTeleporter f18596b;
    private final Bitmap f18597c;

    public PlacePhotoResult(Status status, BitmapTeleporter bitmapTeleporter) {
        this.f18595a = status;
        this.f18596b = bitmapTeleporter;
        this.f18597c = this.f18596b != null ? bitmapTeleporter.m15903a() : null;
    }

    public final Status mo3007a() {
        return this.f18595a;
    }

    public String toString() {
        return aa.m4373a(this).m4375a(MUCUser.Status.ELEMENT, this.f18595a).m4375a("bitmap", this.f18597c).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4731a(parcel, 1, this.f18595a, i);
        dm.m4731a(parcel, 2, this.f18596b, i);
        dm.m4742b(parcel, a);
    }
}
