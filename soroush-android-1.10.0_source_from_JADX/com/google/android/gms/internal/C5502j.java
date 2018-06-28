package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.C1672p;
import com.google.android.gms.common.internal.ac;
import java.util.HashMap;
import java.util.Map;

public final class C5502j extends C1672p<C5502j> {
    public String f15255a;
    public String f15256b;
    public String f15257c;
    public String f15258d;
    public boolean f15259e;
    public String f15260f;
    public boolean f15261g;
    public double f15262h;

    public final /* synthetic */ void mo1585a(C1672p c1672p) {
        C5502j c5502j = (C5502j) c1672p;
        if (!TextUtils.isEmpty(this.f15255a)) {
            c5502j.f15255a = this.f15255a;
        }
        if (!TextUtils.isEmpty(this.f15256b)) {
            c5502j.f15256b = this.f15256b;
        }
        if (!TextUtils.isEmpty(this.f15257c)) {
            c5502j.f15257c = this.f15257c;
        }
        if (!TextUtils.isEmpty(this.f15258d)) {
            c5502j.f15258d = this.f15258d;
        }
        boolean z = true;
        if (this.f15259e) {
            c5502j.f15259e = true;
        }
        if (!TextUtils.isEmpty(this.f15260f)) {
            c5502j.f15260f = this.f15260f;
        }
        if (this.f15261g) {
            c5502j.f15261g = this.f15261g;
        }
        if (this.f15262h != 0.0d) {
            double d = this.f15262h;
            if (d < 0.0d || d > 100.0d) {
                z = false;
            }
            ac.m4386b(z, "Sample rate must be between 0% and 100%");
            c5502j.f15262h = d;
        }
    }

    public final String toString() {
        Map hashMap = new HashMap();
        hashMap.put("hitType", this.f15255a);
        hashMap.put("clientId", this.f15256b);
        hashMap.put("userId", this.f15257c);
        hashMap.put("androidAdId", this.f15258d);
        hashMap.put("AdTargetingEnabled", Boolean.valueOf(this.f15259e));
        hashMap.put("sessionControl", this.f15260f);
        hashMap.put("nonInteraction", Boolean.valueOf(this.f15261g));
        hashMap.put("sampleRate", Double.valueOf(this.f15262h));
        return C1672p.m4264a((Object) hashMap);
    }
}
