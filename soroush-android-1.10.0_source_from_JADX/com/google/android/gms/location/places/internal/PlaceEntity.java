package com.google.android.gms.location.places.internal;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import com.google.android.gms.location.places.C1832a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.jivesoftware.smackx.address.packet.MultipleAddresses.Address;
import org.jivesoftware.smackx.message_correct.element.MessageCorrectExtension;

public final class PlaceEntity extends zzbej implements ReflectedParcelable, C1832a {
    public static final Creator<PlaceEntity> CREATOR = new C1840a();
    private final String f18602a;
    private final Bundle f18603b;
    @Deprecated
    private final zzak f18604c;
    private final LatLng f18605d;
    private final float f18606e;
    private final LatLngBounds f18607f;
    private final String f18608g;
    private final Uri f18609h;
    private final boolean f18610i;
    private final float f18611j;
    private final int f18612k;
    private final List<Integer> f18613l;
    private final List<Integer> f18614m;
    private final String f18615n;
    private final String f18616o;
    private final String f18617p;
    private final String f18618q;
    private final List<String> f18619r;
    private final zzam f18620s;
    private final zzaf f18621t;
    private final String f18622u;
    private final Map<Integer, String> f18623v;
    private final TimeZone f18624w;
    private Locale f18625x;

    PlaceEntity(String str, List<Integer> list, List<Integer> list2, Bundle bundle, String str2, String str3, String str4, String str5, List<String> list3, LatLng latLng, float f, LatLngBounds latLngBounds, String str6, Uri uri, boolean z, float f2, int i, zzak com_google_android_gms_location_places_internal_zzak, zzam com_google_android_gms_location_places_internal_zzam, zzaf com_google_android_gms_location_places_internal_zzaf, String str7) {
        this.f18602a = str;
        this.f18614m = Collections.unmodifiableList(list);
        this.f18613l = list2;
        r0.f18603b = bundle != null ? bundle : new Bundle();
        r0.f18615n = str2;
        r0.f18616o = str3;
        r0.f18617p = str4;
        r0.f18618q = str5;
        r0.f18619r = list3 != null ? list3 : Collections.emptyList();
        r0.f18605d = latLng;
        r0.f18606e = f;
        r0.f18607f = latLngBounds;
        r0.f18608g = str6 != null ? str6 : "UTC";
        r0.f18609h = uri;
        r0.f18610i = z;
        r0.f18611j = f2;
        r0.f18612k = i;
        r0.f18623v = Collections.unmodifiableMap(new HashMap());
        r0.f18624w = null;
        r0.f18625x = null;
        r0.f18604c = com_google_android_gms_location_places_internal_zzak;
        r0.f18620s = com_google_android_gms_location_places_internal_zzam;
        r0.f18621t = com_google_android_gms_location_places_internal_zzaf;
        r0.f18622u = str7;
    }

    public final LatLng mo3044a() {
        return this.f18605d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceEntity)) {
            return false;
        }
        PlaceEntity placeEntity = (PlaceEntity) obj;
        return this.f18602a.equals(placeEntity.f18602a) && aa.m4374a(this.f18625x, placeEntity.f18625x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18602a, this.f18625x});
    }

    @SuppressLint({"DefaultLocale"})
    public final String toString() {
        return aa.m4373a(this).m4375a(MessageCorrectExtension.ID_TAG, this.f18602a).m4375a("placeTypes", this.f18614m).m4375a("locale", this.f18625x).m4375a("name", this.f18615n).m4375a(Address.ELEMENT, this.f18616o).m4375a("phoneNumber", this.f18617p).m4375a("latlng", this.f18605d).m4375a("viewport", this.f18607f).m4375a("websiteUri", this.f18609h).m4375a("isPermanentlyClosed", Boolean.valueOf(this.f18610i)).m4375a("priceLevel", Integer.valueOf(this.f18612k)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4733a(parcel, 1, this.f18602a);
        dm.m4729a(parcel, 2, this.f18603b);
        dm.m4731a(parcel, 3, this.f18604c, i);
        dm.m4731a(parcel, 4, this.f18605d, i);
        dm.m4726a(parcel, 5, this.f18606e);
        dm.m4731a(parcel, 6, this.f18607f, i);
        dm.m4733a(parcel, 7, this.f18608g);
        dm.m4731a(parcel, 8, this.f18609h, i);
        dm.m4735a(parcel, 9, this.f18610i);
        dm.m4726a(parcel, 10, this.f18611j);
        dm.m4743b(parcel, 11, this.f18612k);
        dm.m4734a(parcel, 13, this.f18613l);
        dm.m4733a(parcel, 14, this.f18616o);
        dm.m4733a(parcel, 15, this.f18617p);
        dm.m4733a(parcel, 16, this.f18618q);
        dm.m4744b(parcel, 17, this.f18619r);
        dm.m4733a(parcel, 19, this.f18615n);
        dm.m4734a(parcel, 20, this.f18614m);
        dm.m4731a(parcel, 21, this.f18620s, i);
        dm.m4731a(parcel, 22, this.f18621t, i);
        dm.m4733a(parcel, 23, this.f18622u);
        dm.m4742b(parcel, a);
    }
}
