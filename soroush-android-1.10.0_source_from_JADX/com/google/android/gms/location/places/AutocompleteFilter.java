package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.util.Arrays;
import java.util.List;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public class AutocompleteFilter extends zzbej implements ReflectedParcelable {
    public static final Creator<AutocompleteFilter> CREATOR = new C1834d();
    private int f18587a;
    private boolean f18588b;
    private List<Integer> f18589c;
    private String f18590d;
    private int f18591e;

    AutocompleteFilter(int i, boolean z, List<Integer> list, String str) {
        this.f18587a = i;
        this.f18589c = list;
        if (list != null) {
            if (!list.isEmpty()) {
                i = ((Integer) list.iterator().next()).intValue();
                this.f18591e = i;
                this.f18590d = str;
                if (this.f18587a > 0) {
                    this.f18588b = z ^ 1;
                } else {
                    this.f18588b = z;
                }
            }
        }
        i = 0;
        this.f18591e = i;
        this.f18590d = str;
        if (this.f18587a > 0) {
            this.f18588b = z;
        } else {
            this.f18588b = z ^ 1;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutocompleteFilter)) {
            return false;
        }
        AutocompleteFilter autocompleteFilter = (AutocompleteFilter) obj;
        return this.f18591e == autocompleteFilter.f18591e && this.f18588b == autocompleteFilter.f18588b && this.f18590d == autocompleteFilter.f18590d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f18588b), Integer.valueOf(this.f18591e), this.f18590d});
    }

    public String toString() {
        return aa.m4373a(this).m4375a("includeQueryPredictions", Boolean.valueOf(this.f18588b)).m4375a("typeFilter", Integer.valueOf(this.f18591e)).m4375a("country", this.f18590d).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4735a(parcel, 1, this.f18588b);
        dm.m4734a(parcel, 2, this.f18589c);
        dm.m4733a(parcel, 3, this.f18590d);
        dm.m4743b(parcel, (int) IjkMediaCodecInfo.RANK_MAX, this.f18587a);
        dm.m4742b(parcel, i);
    }
}
