package com.google.android.gms.internal;

import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.common.C1780t;
import com.google.android.gms.common.C1781u;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.util.C1798r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class gw extends fm {
    private final gr f18187a;
    private Boolean f18188b;
    private String f18189c;

    public gw(gr grVar) {
        this(grVar, (byte) 0);
    }

    private gw(gr grVar, byte b) {
        ac.m4376a((Object) grVar);
        this.f18187a = grVar;
        this.f18189c = null;
    }

    private final void m16363a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            this.f18187a.m4906e().f18134a.m4846a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.f18188b == null) {
                    if (!("com.google.android.gms".equals(this.f18189c) || C1798r.m4541a(this.f18187a.f5867a, Binder.getCallingUid()))) {
                        if (!C1781u.m4504a(this.f18187a.f5867a).m4508a(Binder.getCallingUid())) {
                            z = false;
                            this.f18188b = Boolean.valueOf(z);
                        }
                    }
                    z = true;
                    this.f18188b = Boolean.valueOf(z);
                }
                if (this.f18188b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                this.f18187a.m4906e().f18134a.m4847a("Measurement Service called with invalid calling package. appId", ft.m16220a(str));
                throw e;
            }
        }
        if (this.f18189c == null && C1780t.m4494a(this.f18187a.f5867a, Binder.getCallingUid(), str)) {
            this.f18189c = str;
        }
        if (!str.equals(this.f18189c)) {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
        }
    }

    private final void m16364e(zzcff com_google_android_gms_internal_zzcff) {
        ac.m4376a((Object) com_google_android_gms_internal_zzcff);
        m16363a(com_google_android_gms_internal_zzcff.f18517a, false);
        this.f18187a.m4910i().m16617e(com_google_android_gms_internal_zzcff.f18518b);
    }

    public final List<zzckk> mo1626a(zzcff com_google_android_gms_internal_zzcff, boolean z) {
        m16364e(com_google_android_gms_internal_zzcff);
        try {
            List<jt> list = (List) this.f18187a.m4907f().m16334a(new hm(this, com_google_android_gms_internal_zzcff)).get();
            List<zzckk> arrayList = new ArrayList(list.size());
            for (jt jtVar : list) {
                if (z || !ju.m16584h(jtVar.f6070c)) {
                    arrayList.add(new zzckk(jtVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            this.f18187a.m4906e().f18134a.m4848a("Failed to get user attributes. appId", ft.m16220a(com_google_android_gms_internal_zzcff.f18517a), e);
            return null;
        }
    }

    public final List<zzcfi> mo1627a(String str, String str2, zzcff com_google_android_gms_internal_zzcff) {
        m16364e(com_google_android_gms_internal_zzcff);
        try {
            return (List) this.f18187a.m4907f().m16334a(new he(this, com_google_android_gms_internal_zzcff, str, str2)).get();
        } catch (InterruptedException e) {
            this.f18187a.m4906e().f18134a.m4847a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    public final List<zzcfi> mo1628a(String str, String str2, String str3) {
        m16363a(str, true);
        try {
            return (List) this.f18187a.m4907f().m16334a(new hf(this, str, str2, str3)).get();
        } catch (InterruptedException e) {
            this.f18187a.m4906e().f18134a.m4847a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    public final List<zzckk> mo1629a(String str, String str2, String str3, boolean z) {
        m16363a(str, true);
        try {
            List<jt> list = (List) this.f18187a.m4907f().m16334a(new hd(this, str, str2, str3)).get();
            List<zzckk> arrayList = new ArrayList(list.size());
            for (jt jtVar : list) {
                if (z || !ju.m16584h(jtVar.f6070c)) {
                    arrayList.add(new zzckk(jtVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            this.f18187a.m4906e().f18134a.m4848a("Failed to get user attributes. appId", ft.m16220a(str), e);
            return Collections.emptyList();
        }
    }

    public final List<zzckk> mo1630a(String str, String str2, boolean z, zzcff com_google_android_gms_internal_zzcff) {
        m16364e(com_google_android_gms_internal_zzcff);
        try {
            List<jt> list = (List) this.f18187a.m4907f().m16334a(new hc(this, com_google_android_gms_internal_zzcff, str, str2)).get();
            List<zzckk> arrayList = new ArrayList(list.size());
            for (jt jtVar : list) {
                if (z || !ju.m16584h(jtVar.f6070c)) {
                    arrayList.add(new zzckk(jtVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            this.f18187a.m4906e().f18134a.m4848a("Failed to get user attributes. appId", ft.m16220a(com_google_android_gms_internal_zzcff.f18517a), e);
            return Collections.emptyList();
        }
    }

    public final void mo1631a(long j, String str, String str2, String str3) {
        this.f18187a.m4907f().m16336a(new ho(this, str2, str3, str, j));
    }

    public final void mo1632a(zzcff com_google_android_gms_internal_zzcff) {
        m16364e(com_google_android_gms_internal_zzcff);
        Runnable hnVar = new hn(this, com_google_android_gms_internal_zzcff);
        if (this.f18187a.m4907f().m16361z()) {
            hnVar.run();
        } else {
            this.f18187a.m4907f().m16336a(hnVar);
        }
    }

    public final void mo1633a(zzcfi com_google_android_gms_internal_zzcfi) {
        gm f;
        Runnable haVar;
        ac.m4376a((Object) com_google_android_gms_internal_zzcfi);
        ac.m4376a(com_google_android_gms_internal_zzcfi.f18534c);
        m16363a(com_google_android_gms_internal_zzcfi.f18532a, true);
        zzcfi com_google_android_gms_internal_zzcfi2 = new zzcfi(com_google_android_gms_internal_zzcfi);
        if (com_google_android_gms_internal_zzcfi.f18534c.m16841a() == null) {
            f = this.f18187a.m4907f();
            haVar = new ha(this, com_google_android_gms_internal_zzcfi2);
        } else {
            f = this.f18187a.m4907f();
            haVar = new hb(this, com_google_android_gms_internal_zzcfi2);
        }
        f.m16336a(haVar);
    }

    public final void mo1634a(zzcfi com_google_android_gms_internal_zzcfi, zzcff com_google_android_gms_internal_zzcff) {
        gm f;
        Runnable gyVar;
        ac.m4376a((Object) com_google_android_gms_internal_zzcfi);
        ac.m4376a(com_google_android_gms_internal_zzcfi.f18534c);
        m16364e(com_google_android_gms_internal_zzcff);
        zzcfi com_google_android_gms_internal_zzcfi2 = new zzcfi(com_google_android_gms_internal_zzcfi);
        com_google_android_gms_internal_zzcfi2.f18532a = com_google_android_gms_internal_zzcff.f18517a;
        if (com_google_android_gms_internal_zzcfi.f18534c.m16841a() == null) {
            f = this.f18187a.m4907f();
            gyVar = new gy(this, com_google_android_gms_internal_zzcfi2, com_google_android_gms_internal_zzcff);
        } else {
            f = this.f18187a.m4907f();
            gyVar = new gz(this, com_google_android_gms_internal_zzcfi2, com_google_android_gms_internal_zzcff);
        }
        f.m16336a(gyVar);
    }

    public final void mo1635a(zzcfx com_google_android_gms_internal_zzcfx, zzcff com_google_android_gms_internal_zzcff) {
        ac.m4376a((Object) com_google_android_gms_internal_zzcfx);
        m16364e(com_google_android_gms_internal_zzcff);
        this.f18187a.m4907f().m16336a(new hh(this, com_google_android_gms_internal_zzcfx, com_google_android_gms_internal_zzcff));
    }

    public final void mo1636a(zzcfx com_google_android_gms_internal_zzcfx, String str, String str2) {
        ac.m4376a((Object) com_google_android_gms_internal_zzcfx);
        ac.m4378a(str);
        m16363a(str, true);
        this.f18187a.m4907f().m16336a(new hi(this, com_google_android_gms_internal_zzcfx, str));
    }

    public final void mo1637a(zzckk com_google_android_gms_internal_zzckk, zzcff com_google_android_gms_internal_zzcff) {
        gm f;
        Runnable hkVar;
        ac.m4376a((Object) com_google_android_gms_internal_zzckk);
        m16364e(com_google_android_gms_internal_zzcff);
        if (com_google_android_gms_internal_zzckk.m16841a() == null) {
            f = this.f18187a.m4907f();
            hkVar = new hk(this, com_google_android_gms_internal_zzckk, com_google_android_gms_internal_zzcff);
        } else {
            f = this.f18187a.m4907f();
            hkVar = new hl(this, com_google_android_gms_internal_zzckk, com_google_android_gms_internal_zzcff);
        }
        f.m16336a(hkVar);
    }

    public final byte[] mo1638a(zzcfx com_google_android_gms_internal_zzcfx, String str) {
        ac.m4378a(str);
        ac.m4376a((Object) com_google_android_gms_internal_zzcfx);
        m16363a(str, true);
        this.f18187a.m4906e().f18139f.m4847a("Log and bundle. event", this.f18187a.m4911j().m16194a(com_google_android_gms_internal_zzcfx.f18545a));
        long c = this.f18187a.f5875i.mo1577c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f18187a.m4907f().m16337b(new hj(this, com_google_android_gms_internal_zzcfx, str)).get();
            if (bArr == null) {
                this.f18187a.m4906e().f18134a.m4847a("Log and bundle returned null. appId", ft.m16220a(str));
                bArr = new byte[0];
            }
            this.f18187a.m4906e().f18139f.m4849a("Log and bundle processed. event, size, time_ms", this.f18187a.m4911j().m16194a(com_google_android_gms_internal_zzcfx.f18545a), Integer.valueOf(bArr.length), Long.valueOf((this.f18187a.f5875i.mo1577c() / 1000000) - c));
            return bArr;
        } catch (InterruptedException e) {
            this.f18187a.m4906e().f18134a.m4849a("Failed to log and bundle. appId, event, error", ft.m16220a(str), this.f18187a.m4911j().m16194a(com_google_android_gms_internal_zzcfx.f18545a), e);
            return null;
        }
    }

    public final void mo1639b(zzcff com_google_android_gms_internal_zzcff) {
        m16364e(com_google_android_gms_internal_zzcff);
        this.f18187a.m4907f().m16336a(new gx(this, com_google_android_gms_internal_zzcff));
    }

    public final String mo1640c(zzcff com_google_android_gms_internal_zzcff) {
        m16364e(com_google_android_gms_internal_zzcff);
        return this.f18187a.m4887a(com_google_android_gms_internal_zzcff.f18517a);
    }

    public final void mo1641d(zzcff com_google_android_gms_internal_zzcff) {
        m16363a(com_google_android_gms_internal_zzcff.f18517a, false);
        this.f18187a.m4907f().m16336a(new hg(this, com_google_android_gms_internal_zzcff));
    }
}
