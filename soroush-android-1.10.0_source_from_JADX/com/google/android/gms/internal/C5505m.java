package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.C1672p;
import java.util.HashMap;
import java.util.Map;

public final class C5505m extends C1672p<C5505m> {
    public String f15281a;
    public long f15282b;
    public String f15283c;
    public String f15284d;

    public final /* synthetic */ void mo1585a(C1672p c1672p) {
        C5505m c5505m = (C5505m) c1672p;
        if (!TextUtils.isEmpty(this.f15281a)) {
            c5505m.f15281a = this.f15281a;
        }
        if (this.f15282b != 0) {
            c5505m.f15282b = this.f15282b;
        }
        if (!TextUtils.isEmpty(this.f15283c)) {
            c5505m.f15283c = this.f15283c;
        }
        if (!TextUtils.isEmpty(this.f15284d)) {
            c5505m.f15284d = this.f15284d;
        }
    }

    public final String toString() {
        Map hashMap = new HashMap();
        hashMap.put("variableName", this.f15281a);
        hashMap.put("timeInMillis", Long.valueOf(this.f15282b));
        hashMap.put("category", this.f15283c);
        hashMap.put("label", this.f15284d);
        return C1672p.m4264a((Object) hashMap);
    }
}
