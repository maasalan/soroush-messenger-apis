package com.google.android.gms.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.support.v4.p038g.C4813a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.util.C1785d;
import com.google.android.gms.measurement.AppMeasurement.C5527a;
import com.google.android.gms.measurement.AppMeasurement.C5528d;
import com.google.android.gms.measurement.AppMeasurement.C5529e;
import java.io.IOException;
import java.util.Map;

public final class gl extends hq {
    private static int f18168c = 65535;
    private static int f18169d = 2;
    final Map<String, kc> f18170a = new C4813a();
    final Map<String, String> f18171b = new C4813a();
    private final Map<String, Map<String, String>> f18172e = new C4813a();
    private final Map<String, Map<String, Boolean>> f18173f = new C4813a();
    private final Map<String, Map<String, Boolean>> f18174g = new C4813a();
    private final Map<String, Map<String, Integer>> f18175h = new C4813a();

    gl(gr grVar) {
        super(grVar);
    }

    private final kc m16290a(String str, byte[] bArr) {
        if (bArr == null) {
            return new kc();
        }
        nz a = nz.m5045a(bArr, bArr.length);
        oi kcVar = new kc();
        try {
            kcVar.mo3038a(a);
            mo1623t().f18140g.m4848a("Parsed config. version, gmp_app_id", kcVar.f18255a, kcVar.f18256b);
            return kcVar;
        } catch (IOException e) {
            mo1623t().f18136c.m4848a("Unable to merge remote config. appId", ft.m16220a(str), e);
            return new kc();
        }
    }

    private static Map<String, String> m16291a(kc kcVar) {
        Map<String, String> c4813a = new C4813a();
        if (!(kcVar == null || kcVar.f18257c == null)) {
            for (kd kdVar : kcVar.f18257c) {
                if (kdVar != null) {
                    c4813a.put(kdVar.f18262a, kdVar.f18263b);
                }
            }
        }
        return c4813a;
    }

    private final void m16292a(String str, kc kcVar) {
        Map c4813a = new C4813a();
        Map c4813a2 = new C4813a();
        Map c4813a3 = new C4813a();
        if (!(kcVar == null || kcVar.f18258d == null)) {
            for (kb kbVar : kcVar.f18258d) {
                if (TextUtils.isEmpty(kbVar.f18251a)) {
                    mo1623t().f18136c.m4846a("EventConfig contained null event name");
                } else {
                    Object a = C5527a.m12081a(kbVar.f18251a);
                    if (!TextUtils.isEmpty(a)) {
                        kbVar.f18251a = a;
                    }
                    c4813a.put(kbVar.f18251a, kbVar.f18252b);
                    c4813a2.put(kbVar.f18251a, kbVar.f18253c);
                    if (kbVar.f18254d != null) {
                        if (kbVar.f18254d.intValue() >= f18169d) {
                            if (kbVar.f18254d.intValue() <= f18168c) {
                                c4813a3.put(kbVar.f18251a, kbVar.f18254d);
                            }
                        }
                        mo1623t().f18136c.m4848a("Invalid sampling rate. Event name, sample rate", kbVar.f18251a, kbVar.f18254d);
                    }
                }
            }
        }
        this.f18173f.put(str, c4813a);
        this.f18174g.put(str, c4813a2);
        this.f18175h.put(str, c4813a3);
    }

    private final void m16293b(String str) {
        m11975L();
        mo1606c();
        ac.m4378a(str);
        if (this.f18170a.get(str) == null) {
            byte[] d = mo1617n().m16085d(str);
            if (d == null) {
                this.f18172e.put(str, null);
                this.f18173f.put(str, null);
                this.f18174g.put(str, null);
                this.f18170a.put(str, null);
                this.f18171b.put(str, null);
                this.f18175h.put(str, null);
                return;
            }
            kc a = m16290a(str, d);
            this.f18172e.put(str, m16291a(a));
            m16292a(str, a);
            this.f18170a.put(str, a);
            this.f18171b.put(str, null);
        }
    }

    protected final kc m16294a(String str) {
        m11975L();
        mo1606c();
        ac.m4378a(str);
        m16293b(str);
        return (kc) this.f18170a.get(str);
    }

    final String m16295a(String str, String str2) {
        mo1606c();
        m16293b(str);
        Map map = (Map) this.f18172e.get(str);
        return map != null ? (String) map.get(str2) : null;
    }

    public final /* bridge */ /* synthetic */ void mo1604a() {
        super.mo1604a();
    }

    protected final boolean m16297a(String str, byte[] bArr, String str2) {
        byte[] bArr2;
        String str3 = str;
        m11975L();
        mo1606c();
        ac.m4378a(str);
        kc a = m16290a(str, bArr);
        m16292a(str3, a);
        this.f18170a.put(str3, a);
        this.f18171b.put(str3, str2);
        this.f18172e.put(str3, m16291a(a));
        hp e = mo1608e();
        jv[] jvVarArr = a.f18259e;
        ac.m4376a((Object) jvVarArr);
        int length = jvVarArr.length;
        int i = 0;
        while (i < length) {
            int i2;
            jv jvVar = jvVarArr[i];
            for (jw jwVar : jvVar.f18225c) {
                String a2 = C5527a.m12081a(jwVar.f18228b);
                if (a2 != null) {
                    jwVar.f18228b = a2;
                }
                jx[] jxVarArr = jwVar.f18229c;
                int length2 = jxVarArr.length;
                int i3 = 0;
                while (i3 < length2) {
                    jx jxVar = jxVarArr[i3];
                    i2 = length;
                    String a3 = C5528d.m12082a(jxVar.f18236d);
                    if (a3 != null) {
                        jxVar.f18236d = a3;
                    }
                    i3++;
                    length = i2;
                }
                i2 = length;
            }
            i2 = length;
            for (jz jzVar : jvVar.f18224b) {
                String a4 = C5529e.m12083a(jzVar.f18244b);
                if (a4 != null) {
                    jzVar.f18244b = a4;
                }
            }
            i++;
            length = i2;
        }
        e.mo1617n().m16072a(str3, jvVarArr);
        try {
            a.f18259e = null;
            bArr2 = new byte[a.m5129f()];
            a.mo1667a(oa.m5073a(bArr2, bArr2.length));
        } catch (IOException e2) {
            mo1623t().f18136c.m4848a("Unable to serialize reduced-size config. Storing full config instead. appId", ft.m16220a(str), e2);
            bArr2 = bArr;
        }
        hp n = mo1617n();
        ac.m4378a(str);
        n.mo1606c();
        n.m11975L();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr2);
        try {
            if (((long) n.m16057A().update("apps", contentValues, "app_id = ?", new String[]{str3})) == 0) {
                n.mo1623t().f18134a.m4847a("Failed to update remote config (got 0). appId", ft.m16220a(str));
                return true;
            }
        } catch (SQLiteException e3) {
            n.mo1623t().f18134a.m4848a("Error storing remote config. appId", ft.m16220a(str), e3);
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ void mo1605b() {
        super.mo1605b();
    }

    final boolean m16299b(String str, String str2) {
        mo1606c();
        m16293b(str);
        if (mo1619p().m16626k(str) && ju.m16584h(str2)) {
            return true;
        }
        if (mo1619p().m16628l(str) && ju.m16570a(str2)) {
            return true;
        }
        Map map = (Map) this.f18173f.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        return bool == null ? false : bool.booleanValue();
    }

    public final /* bridge */ /* synthetic */ void mo1606c() {
        super.mo1606c();
    }

    final boolean m16301c(String str, String str2) {
        mo1606c();
        m16293b(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f18174g.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        return bool == null ? false : bool.booleanValue();
    }

    final int m16302d(String str, String str2) {
        mo1606c();
        m16293b(str);
        Map map = (Map) this.f18175h.get(str);
        if (map == null) {
            return 1;
        }
        Integer num = (Integer) map.get(str2);
        return num == null ? 1 : num.intValue();
    }

    public final /* bridge */ /* synthetic */ eo mo1607d() {
        return super.mo1607d();
    }

    public final /* bridge */ /* synthetic */ eu mo1608e() {
        return super.mo1608e();
    }

    public final /* bridge */ /* synthetic */ hs mo1609f() {
        return super.mo1609f();
    }

    public final /* bridge */ /* synthetic */ fo mo1610g() {
        return super.mo1610g();
    }

    public final /* bridge */ /* synthetic */ fd mo1611h() {
        return super.mo1611h();
    }

    public final /* bridge */ /* synthetic */ il mo1612i() {
        return super.mo1612i();
    }

    public final /* bridge */ /* synthetic */ ih mo1613j() {
        return super.mo1613j();
    }

    public final /* bridge */ /* synthetic */ C1785d mo1614k() {
        return super.mo1614k();
    }

    public final /* bridge */ /* synthetic */ Context mo1615l() {
        return super.mo1615l();
    }

    public final /* bridge */ /* synthetic */ fp mo1616m() {
        return super.mo1616m();
    }

    public final /* bridge */ /* synthetic */ ex mo1617n() {
        return super.mo1617n();
    }

    public final /* bridge */ /* synthetic */ fr mo1618o() {
        return super.mo1618o();
    }

    public final /* bridge */ /* synthetic */ ju mo1619p() {
        return super.mo1619p();
    }

    public final /* bridge */ /* synthetic */ gl mo1620q() {
        return super.mo1620q();
    }

    public final /* bridge */ /* synthetic */ jk mo1621r() {
        return super.mo1621r();
    }

    public final /* bridge */ /* synthetic */ gm mo1622s() {
        return super.mo1622s();
    }

    public final /* bridge */ /* synthetic */ ft mo1623t() {
        return super.mo1623t();
    }

    public final /* bridge */ /* synthetic */ gd mo1624u() {
        return super.mo1624u();
    }

    public final /* bridge */ /* synthetic */ ew mo1625v() {
        return super.mo1625v();
    }

    protected final boolean mo3036w() {
        return false;
    }
}
