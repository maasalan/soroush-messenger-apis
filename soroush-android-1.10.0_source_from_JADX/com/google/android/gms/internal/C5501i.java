package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.C1672p;
import java.util.HashMap;
import java.util.Map;

public final class C5501i extends C1672p<C5501i> {
    public String f15247a;
    public boolean f15248b;

    public final /* synthetic */ void mo1585a(C1672p c1672p) {
        C5501i c5501i = (C5501i) c1672p;
        if (!TextUtils.isEmpty(this.f15247a)) {
            c5501i.f15247a = this.f15247a;
        }
        if (this.f15248b) {
            c5501i.f15248b = this.f15248b;
        }
    }

    public final String toString() {
        Map hashMap = new HashMap();
        hashMap.put("description", this.f15247a);
        hashMap.put("fatal", Boolean.valueOf(this.f15248b));
        return C1672p.m4264a((Object) hashMap);
    }
}
