package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1708a.C5445b;
import com.google.android.gms.common.api.C1715e.C1713a;
import com.google.android.gms.common.api.C1715e.C1714b;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.internal.aw;
import com.google.android.gms.common.internal.zzbt;
import com.google.android.gms.internal.lj;
import com.google.android.gms.internal.lm;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lq;
import com.google.android.gms.internal.zzcwo;
import java.util.Set;

public final class ab extends lq implements C1713a, C1714b {
    private static C5445b<? extends lm, ln> f20363g = lj.f6100a;
    final Context f20364a;
    final Handler f20365b;
    final C5445b<? extends lm, ln> f20366c;
    aw f20367d;
    lm f20368e;
    ad f20369f;
    private Set<Scope> f20370h;

    public ab(Context context, Handler handler, aw awVar) {
        this(context, handler, awVar, f20363g);
    }

    private ab(Context context, Handler handler, aw awVar, C5445b<? extends lm, ln> c5445b) {
        this.f20364a = context;
        this.f20365b = handler;
        this.f20367d = (aw) ac.m4377a((Object) awVar, (Object) "ClientSettings must not be null");
        this.f20370h = awVar.f5377b;
        this.f20366c = c5445b;
    }

    static /* synthetic */ void m18782a(ab abVar, zzcwo com_google_android_gms_internal_zzcwo) {
        ConnectionResult connectionResult = com_google_android_gms_internal_zzcwo.f18576a;
        if (connectionResult.m15870b()) {
            zzbt com_google_android_gms_common_internal_zzbt = com_google_android_gms_internal_zzcwo.f18577b;
            connectionResult = com_google_android_gms_common_internal_zzbt.f18041a;
            if (connectionResult.m15870b()) {
                abVar.f20369f.mo1555a(com_google_android_gms_common_internal_zzbt.m15918a(), abVar.f20370h);
                abVar.f20368e.m11752a();
            }
            String valueOf = String.valueOf(connectionResult);
            StringBuilder stringBuilder = new StringBuilder(48 + String.valueOf(valueOf).length());
            stringBuilder.append("Sign-in succeeded with resolve account failure: ");
            stringBuilder.append(valueOf);
            Log.wtf("SignInCoordinator", stringBuilder.toString(), new Exception());
        }
        abVar.f20369f.mo1556b(connectionResult);
        abVar.f20368e.m11752a();
    }

    public final void mo3012a() {
        this.f20368e.mo3412a(this);
    }

    public final void mo3013a(ConnectionResult connectionResult) {
        this.f20369f.mo1556b(connectionResult);
    }

    public final void mo3039a(zzcwo com_google_android_gms_internal_zzcwo) {
        this.f20365b.post(new ac(this, com_google_android_gms_internal_zzcwo));
    }

    public final void mo3014b() {
        this.f20368e.m11752a();
    }
}
