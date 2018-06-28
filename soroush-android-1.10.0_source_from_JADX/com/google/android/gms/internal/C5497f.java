package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.C1672p;
import java.util.HashMap;
import java.util.Map;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C5497f extends C1672p<C5497f> {
    public String f15225a;
    public int f15226b;
    public int f15227c;
    public int f15228d;
    public int f15229e;
    public int f15230f;

    public final /* synthetic */ void mo1585a(C1672p c1672p) {
        C5497f c5497f = (C5497f) c1672p;
        if (this.f15226b != 0) {
            c5497f.f15226b = this.f15226b;
        }
        if (this.f15227c != 0) {
            c5497f.f15227c = this.f15227c;
        }
        if (this.f15228d != 0) {
            c5497f.f15228d = this.f15228d;
        }
        if (this.f15229e != 0) {
            c5497f.f15229e = this.f15229e;
        }
        if (this.f15230f != 0) {
            c5497f.f15230f = this.f15230f;
        }
        if (!TextUtils.isEmpty(this.f15225a)) {
            c5497f.f15225a = this.f15225a;
        }
    }

    public final String toString() {
        Map hashMap = new HashMap();
        hashMap.put(IjkMediaMeta.IJKM_KEY_LANGUAGE, this.f15225a);
        hashMap.put("screenColors", Integer.valueOf(this.f15226b));
        hashMap.put("screenWidth", Integer.valueOf(this.f15227c));
        hashMap.put("screenHeight", Integer.valueOf(this.f15228d));
        hashMap.put("viewportWidth", Integer.valueOf(this.f15229e));
        hashMap.put("viewportHeight", Integer.valueOf(this.f15230f));
        return C1672p.m4264a((Object) hashMap);
    }
}
