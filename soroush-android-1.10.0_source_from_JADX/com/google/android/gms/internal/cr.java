package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.common.api.C1708a.C1705c;
import com.google.android.gms.common.api.C1715e;
import com.google.android.gms.common.api.C1720i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.an;

final class cr extends an<Status, ct> {
    private final zzbde f20389c;

    cr(zzbde com_google_android_gms_internal_zzbde, C1715e c1715e) {
        super(cg.f5622a, c1715e);
        this.f20389c = com_google_android_gms_internal_zzbde;
    }

    protected final /* synthetic */ C1720i mo3008a(Status status) {
        return status;
    }

    protected final /* synthetic */ void mo3411a(C1705c c1705c) {
        ct ctVar = (ct) c1705c;
        cv csVar = new cs(this);
        try {
            zzbde com_google_android_gms_internal_zzbde = this.f20389c;
            if (com_google_android_gms_internal_zzbde.f18457d != null && com_google_android_gms_internal_zzbde.f18456c.f18411c.length == 0) {
                com_google_android_gms_internal_zzbde.f18456c.f18411c = com_google_android_gms_internal_zzbde.f18457d.m4670a();
            }
            if (com_google_android_gms_internal_zzbde.f18458e != null && com_google_android_gms_internal_zzbde.f18456c.f18413e.length == 0) {
                com_google_android_gms_internal_zzbde.f18456c.f18413e = com_google_android_gms_internal_zzbde.f18458e.m4670a();
            }
            com_google_android_gms_internal_zzbde.f18455b = oi.m5123a(com_google_android_gms_internal_zzbde.f18456c);
            ((cx) ctVar.m4424n()).mo1596a(csVar, this.f20389c);
        } catch (Throwable e) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e);
            m15881b(new Status(10, "MessageProducer"));
        }
    }
}
