package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.util.ArrayList;
import java.util.List;

public final class PolygonOptions extends zzbej {
    public static final Creator<PolygonOptions> CREATOR = new C1889q();
    private final List<LatLng> f18760a;
    private final List<List<LatLng>> f18761b;
    private float f18762c;
    private int f18763d;
    private int f18764e;
    private float f18765f;
    private boolean f18766g;
    private boolean f18767h;
    private boolean f18768i;
    private int f18769j;
    private List<PatternItem> f18770k;

    public PolygonOptions() {
        this.f18762c = 10.0f;
        this.f18763d = -16777216;
        this.f18764e = 0;
        this.f18765f = 0.0f;
        this.f18766g = true;
        this.f18767h = false;
        this.f18768i = false;
        this.f18769j = 0;
        this.f18770k = null;
        this.f18760a = new ArrayList();
        this.f18761b = new ArrayList();
    }

    PolygonOptions(List<LatLng> list, List list2, float f, int i, int i2, float f2, boolean z, boolean z2, boolean z3, int i3, List<PatternItem> list3) {
        this.f18762c = 10.0f;
        this.f18763d = -16777216;
        this.f18764e = 0;
        this.f18765f = 0.0f;
        this.f18766g = true;
        this.f18767h = false;
        this.f18768i = false;
        this.f18769j = 0;
        this.f18770k = null;
        this.f18760a = list;
        this.f18761b = list2;
        this.f18762c = f;
        this.f18763d = i;
        this.f18764e = i2;
        this.f18765f = f2;
        this.f18766g = z;
        this.f18767h = z2;
        this.f18768i = z3;
        this.f18769j = i3;
        this.f18770k = list3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4745c(parcel, 2, this.f18760a);
        List list = this.f18761b;
        if (list != null) {
            int a = dm.m4723a(parcel, 3);
            parcel.writeList(list);
            dm.m4742b(parcel, a);
        }
        dm.m4726a(parcel, 4, this.f18762c);
        dm.m4743b(parcel, 5, this.f18763d);
        dm.m4743b(parcel, 6, this.f18764e);
        dm.m4726a(parcel, 7, this.f18765f);
        dm.m4735a(parcel, 8, this.f18766g);
        dm.m4735a(parcel, 9, this.f18767h);
        dm.m4735a(parcel, 10, this.f18768i);
        dm.m4743b(parcel, 11, this.f18769j);
        dm.m4745c(parcel, 12, this.f18770k);
        dm.m4742b(parcel, i);
    }
}
