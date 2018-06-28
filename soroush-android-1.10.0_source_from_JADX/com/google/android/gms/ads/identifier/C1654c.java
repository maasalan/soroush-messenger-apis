package com.google.android.gms.ads.identifier;

import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.util.HashMap;
import java.util.Map;

final /* synthetic */ class C1654c implements Runnable {
    private final Info f5126a;
    private final boolean f5127b;
    private final long f5128c;

    C1654c(Info info, boolean z, long j) {
        this.f5126a = info;
        this.f5127b = z;
        this.f5128c = j;
    }

    public final void run() {
        Info info = this.f5126a;
        boolean z = this.f5127b;
        long j = this.f5128c;
        Map hashMap = new HashMap();
        hashMap.put("ad_id_size", Integer.toString(info == null ? -1 : info.getId().length()));
        hashMap.put("has_gmscore", z ? "1" : "0");
        hashMap.put("tag", "AdvertisingIdLightClient");
        hashMap.put("time_spent", Long.toString(j));
        C1656e c1656e = new C1656e();
        C1656e.m4247a(hashMap);
    }
}
