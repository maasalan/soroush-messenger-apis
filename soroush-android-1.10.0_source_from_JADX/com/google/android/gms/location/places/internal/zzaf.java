package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.util.Collections;
import java.util.List;

public final class zzaf extends zzbej {
    public static final Creator<zzaf> CREATOR = new C1841b();
    private final List<Integer> f18637a;
    private final String f18638b;
    private final Uri f18639c;
    private final float f18640d;
    private final int f18641e;

    zzaf(List<Integer> list, String str, Uri uri, float f, int i) {
        this.f18637a = Collections.unmodifiableList(list);
        this.f18638b = str;
        this.f18639c = uri;
        this.f18640d = f;
        this.f18641e = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4734a(parcel, 1, this.f18637a);
        dm.m4733a(parcel, 2, this.f18638b);
        dm.m4731a(parcel, 3, this.f18639c, i);
        dm.m4726a(parcel, 4, this.f18640d);
        dm.m4743b(parcel, 5, this.f18641e);
        dm.m4742b(parcel, a);
    }
}
