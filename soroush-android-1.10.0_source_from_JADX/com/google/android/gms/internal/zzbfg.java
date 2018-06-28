package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class zzbfg extends zzbej implements dr<String, Integer> {
    public static final Creator<zzbfg> CREATOR = new C1817do();
    private int f18476a;
    private final HashMap<String, Integer> f18477b;
    private final SparseArray<String> f18478c;
    private final ArrayList<zzbfh> f18479d;

    public zzbfg() {
        this.f18476a = 1;
        this.f18477b = new HashMap();
        this.f18478c = new SparseArray();
        this.f18479d = null;
    }

    zzbfg(int i, ArrayList<zzbfh> arrayList) {
        this.f18476a = i;
        this.f18477b = new HashMap();
        this.f18478c = new SparseArray();
        this.f18479d = null;
        m16820a((ArrayList) arrayList);
    }

    private final void m16820a(ArrayList<zzbfh> arrayList) {
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            zzbfh com_google_android_gms_internal_zzbfh = (zzbfh) obj;
            String str = com_google_android_gms_internal_zzbfh.f18480a;
            int i2 = com_google_android_gms_internal_zzbfh.f18481b;
            this.f18477b.put(str, Integer.valueOf(i2));
            this.f18478c.put(i2, str);
        }
    }

    public final /* synthetic */ Object mo3041a(Object obj) {
        String str = (String) this.f18478c.get(((Integer) obj).intValue());
        return (str == null && this.f18477b.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f18476a);
        List arrayList = new ArrayList();
        for (String str : this.f18477b.keySet()) {
            arrayList.add(new zzbfh(str, ((Integer) this.f18477b.get(str)).intValue()));
        }
        dm.m4745c(parcel, 2, arrayList);
        dm.m4742b(parcel, i);
    }
}
