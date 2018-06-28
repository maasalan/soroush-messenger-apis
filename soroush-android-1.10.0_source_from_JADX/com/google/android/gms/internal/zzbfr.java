package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class zzbfr extends zzbej {
    public static final Creator<zzbfr> CREATOR = new dv();
    final String f18498a;
    private int f18499b;
    private ArrayList<zzbfs> f18500c;

    zzbfr(int i, String str, ArrayList<zzbfs> arrayList) {
        this.f18499b = i;
        this.f18498a = str;
        this.f18500c = arrayList;
    }

    zzbfr(String str, Map<String, zzbfl<?, ?>> map) {
        ArrayList arrayList;
        this.f18499b = 1;
        this.f18498a = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new zzbfs(str2, (zzbfl) map.get(str2)));
            }
        }
        this.f18500c = arrayList;
    }

    final HashMap<String, zzbfl<?, ?>> m16827a() {
        HashMap<String, zzbfl<?, ?>> hashMap = new HashMap();
        int size = this.f18500c.size();
        for (int i = 0; i < size; i++) {
            zzbfs com_google_android_gms_internal_zzbfs = (zzbfs) this.f18500c.get(i);
            hashMap.put(com_google_android_gms_internal_zzbfs.f18501a, com_google_android_gms_internal_zzbfs.f18502b);
        }
        return hashMap;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f18499b);
        dm.m4733a(parcel, 2, this.f18498a);
        dm.m4745c(parcel, 3, this.f18500c);
        dm.m4742b(parcel, i);
    }
}
