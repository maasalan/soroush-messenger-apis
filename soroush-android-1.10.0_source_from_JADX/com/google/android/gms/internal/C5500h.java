package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.C1672p;
import java.util.HashMap;
import java.util.Map;
import org.jivesoftware.smackx.amp.packet.AMPExtension.Action;

public final class C5500h extends C1672p<C5500h> {
    public String f15242a;
    public String f15243b;
    public String f15244c;
    public long f15245d;

    public final /* synthetic */ void mo1585a(C1672p c1672p) {
        C5500h c5500h = (C5500h) c1672p;
        if (!TextUtils.isEmpty(this.f15242a)) {
            c5500h.f15242a = this.f15242a;
        }
        if (!TextUtils.isEmpty(this.f15243b)) {
            c5500h.f15243b = this.f15243b;
        }
        if (!TextUtils.isEmpty(this.f15244c)) {
            c5500h.f15244c = this.f15244c;
        }
        if (this.f15245d != 0) {
            c5500h.f15245d = this.f15245d;
        }
    }

    public final String toString() {
        Map hashMap = new HashMap();
        hashMap.put("category", this.f15242a);
        hashMap.put(Action.ATTRIBUTE_NAME, this.f15243b);
        hashMap.put("label", this.f15244c);
        hashMap.put("value", Long.valueOf(this.f15245d));
        return C1672p.m4264a((Object) hashMap);
    }
}
