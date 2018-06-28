package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jivesoftware.smackx.address.packet.MultipleAddresses.Address;

@Deprecated
public class AddPlaceRequest extends zzbej {
    public static final Creator<AddPlaceRequest> CREATOR = new C1833c();
    private final String f18581a;
    private final LatLng f18582b;
    private final String f18583c;
    private final List<Integer> f18584d;
    private final String f18585e;
    private final Uri f18586f;

    public AddPlaceRequest(String str, LatLng latLng, String str2, List<Integer> list, String str3, Uri uri) {
        this.f18581a = ac.m4378a(str);
        this.f18582b = (LatLng) ac.m4376a((Object) latLng);
        this.f18583c = ac.m4378a(str2);
        this.f18584d = new ArrayList((Collection) ac.m4376a((Object) list));
        boolean z = true;
        ac.m4386b(this.f18584d.isEmpty() ^ true, "At least one place type should be provided.");
        if (TextUtils.isEmpty(str3)) {
            if (uri == null) {
                z = false;
            }
        }
        ac.m4386b(z, "One of phone number or URI should be provided.");
        this.f18585e = str3;
        this.f18586f = uri;
    }

    public String toString() {
        return aa.m4373a(this).m4375a("name", this.f18581a).m4375a("latLng", this.f18582b).m4375a(Address.ELEMENT, this.f18583c).m4375a("placeTypes", this.f18584d).m4375a("phoneNumer", this.f18585e).m4375a("websiteUri", this.f18586f).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4733a(parcel, 1, this.f18581a);
        dm.m4731a(parcel, 2, this.f18582b, i);
        dm.m4733a(parcel, 3, this.f18583c);
        dm.m4734a(parcel, 4, this.f18584d);
        dm.m4733a(parcel, 5, this.f18585e);
        dm.m4731a(parcel, 6, this.f18586f, i);
        dm.m4742b(parcel, a);
    }
}
