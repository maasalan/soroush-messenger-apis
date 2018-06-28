package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.C1672p;
import java.util.HashMap;
import java.util.Map;

public final class C5492a extends C1672p<C5492a> {
    public String f15172a;
    public String f15173b;
    public String f15174c;
    public String f15175d;

    public final /* synthetic */ void mo1585a(C1672p c1672p) {
        m11851a((C5492a) c1672p);
    }

    public final void m11851a(C5492a c5492a) {
        if (!TextUtils.isEmpty(this.f15172a)) {
            c5492a.f15172a = this.f15172a;
        }
        if (!TextUtils.isEmpty(this.f15173b)) {
            c5492a.f15173b = this.f15173b;
        }
        if (!TextUtils.isEmpty(this.f15174c)) {
            c5492a.f15174c = this.f15174c;
        }
        if (!TextUtils.isEmpty(this.f15175d)) {
            c5492a.f15175d = this.f15175d;
        }
    }

    public final String toString() {
        Map hashMap = new HashMap();
        hashMap.put("appName", this.f15172a);
        hashMap.put("appVersion", this.f15173b);
        hashMap.put("appId", this.f15174c);
        hashMap.put("appInstallerId", this.f15175d);
        return C1672p.m4264a((Object) hashMap);
    }
}
