package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.C1672p;
import java.util.HashMap;
import java.util.Map;
import org.jivesoftware.smackx.message_correct.element.MessageCorrectExtension;

public final class C5493b extends C1672p<C5493b> {
    public String f15182a;
    public String f15183b;
    public String f15184c;
    public String f15185d;
    public String f15186e;
    public String f15187f;
    public String f15188g;
    public String f15189h;
    public String f15190i;
    public String f15191j;

    public final /* synthetic */ void mo1585a(C1672p c1672p) {
        C5493b c5493b = (C5493b) c1672p;
        if (!TextUtils.isEmpty(this.f15182a)) {
            c5493b.f15182a = this.f15182a;
        }
        if (!TextUtils.isEmpty(this.f15183b)) {
            c5493b.f15183b = this.f15183b;
        }
        if (!TextUtils.isEmpty(this.f15184c)) {
            c5493b.f15184c = this.f15184c;
        }
        if (!TextUtils.isEmpty(this.f15185d)) {
            c5493b.f15185d = this.f15185d;
        }
        if (!TextUtils.isEmpty(this.f15186e)) {
            c5493b.f15186e = this.f15186e;
        }
        if (!TextUtils.isEmpty(this.f15187f)) {
            c5493b.f15187f = this.f15187f;
        }
        if (!TextUtils.isEmpty(this.f15188g)) {
            c5493b.f15188g = this.f15188g;
        }
        if (!TextUtils.isEmpty(this.f15189h)) {
            c5493b.f15189h = this.f15189h;
        }
        if (!TextUtils.isEmpty(this.f15190i)) {
            c5493b.f15190i = this.f15190i;
        }
        if (!TextUtils.isEmpty(this.f15191j)) {
            c5493b.f15191j = this.f15191j;
        }
    }

    public final String toString() {
        Map hashMap = new HashMap();
        hashMap.put("name", this.f15182a);
        hashMap.put("source", this.f15183b);
        hashMap.put("medium", this.f15184c);
        hashMap.put("keyword", this.f15185d);
        hashMap.put("content", this.f15186e);
        hashMap.put(MessageCorrectExtension.ID_TAG, this.f15187f);
        hashMap.put("adNetworkId", this.f15188g);
        hashMap.put("gclid", this.f15189h);
        hashMap.put("dclid", this.f15190i);
        hashMap.put("aclid", this.f15191j);
        return C1672p.m4264a((Object) hashMap);
    }
}
