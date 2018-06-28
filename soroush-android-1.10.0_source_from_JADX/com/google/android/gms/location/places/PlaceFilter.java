package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.common.internal.ab;
import com.google.android.gms.internal.dm;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class PlaceFilter extends zza {
    public static final Creator<PlaceFilter> CREATOR = new C1835e();
    private static final PlaceFilter f20404a = new PlaceFilter();
    private List<Integer> f20405b;
    private boolean f20406c;
    private List<zzo> f20407d;
    private List<String> f20408e;
    private final Set<Integer> f20409f;
    private final Set<zzo> f20410g;
    private final Set<String> f20411h;

    public PlaceFilter() {
        this((byte) 0);
    }

    private PlaceFilter(byte b) {
        this('\u0000');
    }

    private PlaceFilter(char c) {
        this(Collections.emptyList(), false, Collections.emptyList(), Collections.emptyList());
    }

    PlaceFilter(List<Integer> list, boolean z, List<String> list2, List<zzo> list3) {
        this.f20405b = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f20406c = z;
        this.f20407d = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.f20408e = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f20409f = zza.m16850a(this.f20405b);
        this.f20410g = zza.m16850a(this.f20407d);
        this.f20411h = zza.m16850a(this.f20408e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceFilter)) {
            return false;
        }
        PlaceFilter placeFilter = (PlaceFilter) obj;
        return this.f20409f.equals(placeFilter.f20409f) && this.f20406c == placeFilter.f20406c && this.f20410g.equals(placeFilter.f20410g) && this.f20411h.equals(placeFilter.f20411h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20409f, Boolean.valueOf(this.f20406c), this.f20410g, this.f20411h});
    }

    public final String toString() {
        ab a = aa.m4373a(this);
        if (!this.f20409f.isEmpty()) {
            a.m4375a("types", this.f20409f);
        }
        a.m4375a("requireOpenNow", Boolean.valueOf(this.f20406c));
        if (!this.f20411h.isEmpty()) {
            a.m4375a("placeIds", this.f20411h);
        }
        if (!this.f20410g.isEmpty()) {
            a.m4375a("requestedUserDataTypes", this.f20410g);
        }
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4734a(parcel, 1, this.f20405b);
        dm.m4735a(parcel, 3, this.f20406c);
        dm.m4745c(parcel, 4, this.f20407d);
        dm.m4744b(parcel, 6, this.f20408e);
        dm.m4742b(parcel, i);
    }
}
