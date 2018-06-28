package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.p038g.C0464b;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.util.Collections;
import java.util.Set;

public final class zzo extends zzbej {
    public static final Creator<zzo> CREATOR = new C1839i();
    private static zzo f18669a = m16851a("test_type", 1);
    private static zzo f18670b = m16851a("labeled_place", 6);
    private static zzo f18671c = m16851a("here_content", 7);
    private static Set<zzo> f18672d;
    private String f18673e;
    private int f18674f;

    static {
        zzo com_google_android_gms_location_places_zzo = f18669a;
        zzo com_google_android_gms_location_places_zzo2 = f18670b;
        zzo com_google_android_gms_location_places_zzo3 = f18671c;
        Set c0464b = new C0464b((byte) 0);
        c0464b.add(com_google_android_gms_location_places_zzo);
        c0464b.add(com_google_android_gms_location_places_zzo2);
        c0464b.add(com_google_android_gms_location_places_zzo3);
        f18672d = Collections.unmodifiableSet(c0464b);
    }

    zzo(String str, int i) {
        ac.m4378a(str);
        this.f18673e = str;
        this.f18674f = i;
    }

    private static zzo m16851a(String str, int i) {
        return new zzo(str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzo)) {
            return false;
        }
        zzo com_google_android_gms_location_places_zzo = (zzo) obj;
        return this.f18673e.equals(com_google_android_gms_location_places_zzo.f18673e) && this.f18674f == com_google_android_gms_location_places_zzo.f18674f;
    }

    public final int hashCode() {
        return this.f18673e.hashCode();
    }

    public final String toString() {
        return this.f18673e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4733a(parcel, 1, this.f18673e);
        dm.m4743b(parcel, 2, this.f18674f);
        dm.m4742b(parcel, i);
    }
}
