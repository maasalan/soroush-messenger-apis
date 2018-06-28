package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.common.internal.ab;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.util.Arrays;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class PlaceReport extends zzbej implements ReflectedParcelable {
    public static final Creator<PlaceReport> CREATOR = new C1838h();
    private int f18598a;
    private final String f18599b;
    private final String f18600c;
    private final String f18601d;

    PlaceReport(int i, String str, String str2, String str3) {
        this.f18598a = i;
        this.f18599b = str;
        this.f18600c = str2;
        this.f18601d = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        return aa.m4374a(this.f18599b, placeReport.f18599b) && aa.m4374a(this.f18600c, placeReport.f18600c) && aa.m4374a(this.f18601d, placeReport.f18601d);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18599b, this.f18600c, this.f18601d});
    }

    public String toString() {
        ab a = aa.m4373a(this);
        a.m4375a("placeId", this.f18599b);
        a.m4375a("tag", this.f18600c);
        if (!IjkMediaMeta.IJKM_VAL_TYPE__UNKNOWN.equals(this.f18601d)) {
            a.m4375a("source", this.f18601d);
        }
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f18598a);
        dm.m4733a(parcel, 2, this.f18599b);
        dm.m4733a(parcel, 3, this.f18600c);
        dm.m4733a(parcel, 4, this.f18601d);
        dm.m4742b(parcel, i);
    }
}
