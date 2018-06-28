package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.C1672p;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class C5503k extends C1672p<C5503k> {
    public String f15266a;
    public int f15267b;
    public String f15268c;
    private int f15269d;
    private String f15270e;
    private boolean f15271f;
    private boolean f15272g;

    public C5503k() {
        this((byte) 0);
    }

    private C5503k(byte b) {
        UUID randomUUID = UUID.randomUUID();
        int leastSignificantBits = (int) (randomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits == 0) {
            leastSignificantBits = (int) (randomUUID.getMostSignificantBits() & 2147483647L);
            if (leastSignificantBits == 0) {
                Log.e("GAv4", "UUID.randomUUID() returned 0.");
                leastSignificantBits = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            }
        }
        this(leastSignificantBits);
    }

    private C5503k(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        this.f15267b = i;
        this.f15272g = false;
    }

    public final /* synthetic */ void mo1585a(C1672p c1672p) {
        C5503k c5503k = (C5503k) c1672p;
        if (!TextUtils.isEmpty(this.f15266a)) {
            c5503k.f15266a = this.f15266a;
        }
        if (this.f15267b != 0) {
            c5503k.f15267b = this.f15267b;
        }
        if (this.f15269d != 0) {
            c5503k.f15269d = this.f15269d;
        }
        if (!TextUtils.isEmpty(this.f15270e)) {
            c5503k.f15270e = this.f15270e;
        }
        if (!TextUtils.isEmpty(this.f15268c)) {
            String str = this.f15268c;
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            c5503k.f15268c = str;
        }
        if (this.f15271f) {
            c5503k.f15271f = this.f15271f;
        }
        if (this.f15272g) {
            c5503k.f15272g = this.f15272g;
        }
    }

    public final String toString() {
        Map hashMap = new HashMap();
        hashMap.put("screenName", this.f15266a);
        hashMap.put("interstitial", Boolean.valueOf(this.f15271f));
        hashMap.put("automatic", Boolean.valueOf(this.f15272g));
        hashMap.put("screenId", Integer.valueOf(this.f15267b));
        hashMap.put("referrerScreenId", Integer.valueOf(this.f15269d));
        hashMap.put("referrerScreenName", this.f15270e);
        hashMap.put("referrerUri", this.f15268c);
        return C1672p.m4264a((Object) hashMap);
    }
}
