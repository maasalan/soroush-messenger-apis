package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.C1672p;
import java.util.HashMap;
import java.util.Map;
import org.jivesoftware.smackx.amp.packet.AMPExtension.Action;

public final class C5504l extends C1672p<C5504l> {
    public String f15276a;
    public String f15277b;
    public String f15278c;

    public final /* synthetic */ void mo1585a(C1672p c1672p) {
        C5504l c5504l = (C5504l) c1672p;
        if (!TextUtils.isEmpty(this.f15276a)) {
            c5504l.f15276a = this.f15276a;
        }
        if (!TextUtils.isEmpty(this.f15277b)) {
            c5504l.f15277b = this.f15277b;
        }
        if (!TextUtils.isEmpty(this.f15278c)) {
            c5504l.f15278c = this.f15278c;
        }
    }

    public final String toString() {
        Map hashMap = new HashMap();
        hashMap.put("network", this.f15276a);
        hashMap.put(Action.ATTRIBUTE_NAME, this.f15277b);
        hashMap.put("target", this.f15278c);
        return C1672p.m4264a((Object) hashMap);
    }
}
