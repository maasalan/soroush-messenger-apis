package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ac;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzbfq extends zzbej {
    public static final Creator<zzbfq> CREATOR = new du();
    final String f18494a;
    private int f18495b;
    private final HashMap<String, Map<String, zzbfl<?, ?>>> f18496c;
    private final ArrayList<zzbfr> f18497d = null;

    zzbfq(int i, ArrayList<zzbfr> arrayList, String str) {
        this.f18495b = i;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzbfr com_google_android_gms_internal_zzbfr = (zzbfr) arrayList.get(i2);
            hashMap.put(com_google_android_gms_internal_zzbfr.f18498a, com_google_android_gms_internal_zzbfr.m16827a());
        }
        this.f18496c = hashMap;
        this.f18494a = (String) ac.m4376a((Object) str);
        m16825a();
    }

    private final void m16825a() {
        for (String str : this.f18496c.keySet()) {
            Map map = (Map) this.f18496c.get(str);
            for (String str2 : map.keySet()) {
                ((zzbfl) map.get(str2)).f18490h = this;
            }
        }
    }

    public final Map<String, zzbfl<?, ?>> m16826a(String str) {
        return (Map) this.f18496c.get(str);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : this.f18496c.keySet()) {
            stringBuilder.append(str);
            stringBuilder.append(":\n");
            Map map = (Map) this.f18496c.get(str);
            for (String str2 : map.keySet()) {
                stringBuilder.append("  ");
                stringBuilder.append(str2);
                stringBuilder.append(": ");
                stringBuilder.append(map.get(str2));
            }
        }
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f18495b);
        List arrayList = new ArrayList();
        for (String str : this.f18496c.keySet()) {
            arrayList.add(new zzbfr(str, (Map) this.f18496c.get(str)));
        }
        dm.m4745c(parcel, 2, arrayList);
        dm.m4733a(parcel, 3, this.f18494a);
        dm.m4742b(parcel, i);
    }
}
