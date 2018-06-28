package com.google.android.gms.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ac;
import java.util.Iterator;

public final class fe {
    final String f5728a;
    final String f5729b;
    String f5730c;
    final long f5731d;
    final long f5732e;
    final zzcfu f5733f;

    fe(gr grVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        ac.m4378a(str2);
        ac.m4378a(str3);
        this.f5728a = str2;
        this.f5729b = str3;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f5730c = str;
        this.f5731d = j;
        this.f5732e = j2;
        if (this.f5732e != 0 && this.f5732e > this.f5731d) {
            grVar.m4906e().f18136c.m4847a("Event created with reverse previous/current timestamps. appId", ft.m16220a(str2));
        }
        this.f5733f = m4820a(grVar, bundle);
    }

    fe(gr grVar, String str, String str2, String str3, long j, long j2, zzcfu com_google_android_gms_internal_zzcfu) {
        ac.m4378a(str2);
        ac.m4378a(str3);
        ac.m4376a((Object) com_google_android_gms_internal_zzcfu);
        this.f5728a = str2;
        this.f5729b = str3;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f5730c = str;
        this.f5731d = j;
        this.f5732e = j2;
        if (this.f5732e != 0 && this.f5732e > this.f5731d) {
            grVar.m4906e().f18136c.m4847a("Event created with reverse previous/current timestamps. appId", ft.m16220a(str2));
        }
        this.f5733f = com_google_android_gms_internal_zzcfu;
    }

    private static zzcfu m4820a(gr grVar, Bundle bundle) {
        if (bundle == null || bundle.isEmpty()) {
            return new zzcfu(new Bundle());
        }
        Bundle bundle2 = new Bundle(bundle);
        Iterator it = bundle2.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                grVar.m4906e().f18134a.m4846a("Param name can't be null");
            } else {
                grVar.m4910i();
                Object a = ju.m16562a(str, bundle2.get(str));
                if (a == null) {
                    grVar.m4906e().f18136c.m4847a("Param value can't be null", grVar.m4911j().m16196b(str));
                } else {
                    grVar.m4910i().m16597a(bundle2, str, a);
                }
            }
            it.remove();
        }
        return new zzcfu(bundle2);
    }

    public final String toString() {
        String str = this.f5728a;
        String str2 = this.f5729b;
        String valueOf = String.valueOf(this.f5733f);
        StringBuilder stringBuilder = new StringBuilder(((33 + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(valueOf).length());
        stringBuilder.append("Event{appId='");
        stringBuilder.append(str);
        stringBuilder.append("', name='");
        stringBuilder.append(str2);
        stringBuilder.append("', params=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
