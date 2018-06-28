package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.util.C1785d;
import com.google.android.gms.measurement.AppMeasurement.C5527a;
import com.google.android.gms.measurement.AppMeasurement.C5528d;
import com.google.android.gms.measurement.AppMeasurement.C5529e;

public final class fr extends hq {
    private static String[] f18131a = new String[C5527a.f15309a.length];
    private static String[] f18132b = new String[C5528d.f15311a.length];
    private static String[] f18133c = new String[C5529e.f15313a.length];

    fr(gr grVar) {
        super(grVar);
    }

    private final String m16177a(zzcfu com_google_android_gms_internal_zzcfu) {
        return com_google_android_gms_internal_zzcfu == null ? null : !m16187y() ? com_google_android_gms_internal_zzcfu.toString() : m16188a(com_google_android_gms_internal_zzcfu.m16838a());
    }

    private static String m16178a(String str, String[] strArr, String[] strArr2, String[] strArr3) {
        ac.m4376a((Object) strArr);
        ac.m4376a((Object) strArr2);
        ac.m4376a((Object) strArr3);
        int i = 0;
        boolean z = true;
        ac.m4385b(strArr.length == strArr2.length);
        if (strArr.length != strArr3.length) {
            z = false;
        }
        ac.m4385b(z);
        while (i < strArr.length) {
            if (ju.m16578b(str, strArr[i])) {
                synchronized (strArr3) {
                    if (strArr3[i] == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(strArr2[i]);
                        stringBuilder.append("(");
                        stringBuilder.append(strArr[i]);
                        stringBuilder.append(")");
                        strArr3[i] = stringBuilder.toString();
                    }
                    str = strArr3[i];
                }
                return str;
            }
            i++;
        }
        return str;
    }

    private static void m16179a(StringBuilder stringBuilder, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            stringBuilder.append("  ");
        }
    }

    private final void m16180a(StringBuilder stringBuilder, int i, jx jxVar) {
        if (jxVar != null) {
            m16179a(stringBuilder, i);
            stringBuilder.append("filter {\n");
            m16182a(stringBuilder, i, "complement", jxVar.f18235c);
            m16182a(stringBuilder, i, "param_name", m16196b(jxVar.f18236d));
            int i2 = i + 1;
            String str = "string_filter";
            ka kaVar = jxVar.f18233a;
            if (kaVar != null) {
                m16179a(stringBuilder, i2);
                stringBuilder.append(str);
                stringBuilder.append(" {\n");
                if (kaVar.f18246a != null) {
                    Object obj = "UNKNOWN_MATCH_TYPE";
                    switch (kaVar.f18246a.intValue()) {
                        case 1:
                            obj = "REGEXP";
                            break;
                        case 2:
                            obj = "BEGINS_WITH";
                            break;
                        case 3:
                            obj = "ENDS_WITH";
                            break;
                        case 4:
                            obj = "PARTIAL";
                            break;
                        case 5:
                            obj = "EXACT";
                            break;
                        case 6:
                            obj = "IN_LIST";
                            break;
                        default:
                            break;
                    }
                    m16182a(stringBuilder, i2, "match_type", obj);
                }
                m16182a(stringBuilder, i2, "expression", kaVar.f18247b);
                m16182a(stringBuilder, i2, "case_sensitive", kaVar.f18248c);
                if (kaVar.f18249d.length > 0) {
                    m16179a(stringBuilder, i2 + 1);
                    stringBuilder.append("expression_list {\n");
                    for (String str2 : kaVar.f18249d) {
                        m16179a(stringBuilder, i2 + 2);
                        stringBuilder.append(str2);
                        stringBuilder.append("\n");
                    }
                    stringBuilder.append("}\n");
                }
                m16179a(stringBuilder, i2);
                stringBuilder.append("}\n");
            }
            m16181a(stringBuilder, i2, "number_filter", jxVar.f18234b);
            m16179a(stringBuilder, i);
            stringBuilder.append("}\n");
        }
    }

    private static void m16181a(StringBuilder stringBuilder, int i, String str, jy jyVar) {
        if (jyVar != null) {
            m16179a(stringBuilder, i);
            stringBuilder.append(str);
            stringBuilder.append(" {\n");
            if (jyVar.f18237a != null) {
                Object obj = "UNKNOWN_COMPARISON_TYPE";
                switch (jyVar.f18237a.intValue()) {
                    case 1:
                        obj = "LESS_THAN";
                        break;
                    case 2:
                        obj = "GREATER_THAN";
                        break;
                    case 3:
                        obj = "EQUAL";
                        break;
                    case 4:
                        obj = "BETWEEN";
                        break;
                    default:
                        break;
                }
                m16182a(stringBuilder, i, "comparison_type", obj);
            }
            m16182a(stringBuilder, i, "match_as_float", jyVar.f18238b);
            m16182a(stringBuilder, i, "comparison_value", jyVar.f18239c);
            m16182a(stringBuilder, i, "min_comparison_value", jyVar.f18240d);
            m16182a(stringBuilder, i, "max_comparison_value", jyVar.f18241e);
            m16179a(stringBuilder, i);
            stringBuilder.append("}\n");
        }
    }

    private static void m16182a(StringBuilder stringBuilder, int i, String str, Object obj) {
        if (obj != null) {
            m16179a(stringBuilder, i + 1);
            stringBuilder.append(str);
            stringBuilder.append(": ");
            stringBuilder.append(obj);
            stringBuilder.append('\n');
        }
    }

    private static void m16183a(StringBuilder stringBuilder, String str, kj kjVar) {
        if (kjVar != null) {
            long[] jArr;
            int i;
            m16179a(stringBuilder, 3);
            stringBuilder.append(str);
            stringBuilder.append(" {\n");
            int i2 = 0;
            if (kjVar.f18319b != null) {
                m16179a(stringBuilder, 4);
                stringBuilder.append("results: ");
                jArr = kjVar.f18319b;
                int length = jArr.length;
                i = 0;
                int i3 = i;
                while (i < length) {
                    Long valueOf = Long.valueOf(jArr[i]);
                    int i4 = i3 + 1;
                    if (i3 != 0) {
                        stringBuilder.append(", ");
                    }
                    stringBuilder.append(valueOf);
                    i++;
                    i3 = i4;
                }
                stringBuilder.append('\n');
            }
            if (kjVar.f18318a != null) {
                m16179a(stringBuilder, 4);
                stringBuilder.append("status: ");
                jArr = kjVar.f18318a;
                int length2 = jArr.length;
                int i5 = 0;
                while (i2 < length2) {
                    Long valueOf2 = Long.valueOf(jArr[i2]);
                    i = i5 + 1;
                    if (i5 != 0) {
                        stringBuilder.append(", ");
                    }
                    stringBuilder.append(valueOf2);
                    i2++;
                    i5 = i;
                }
                stringBuilder.append('\n');
            }
            m16179a(stringBuilder, 3);
            stringBuilder.append("}\n");
        }
    }

    private static void m16184a(StringBuilder stringBuilder, ke[] keVarArr) {
        if (keVarArr != null) {
            for (ke keVar : keVarArr) {
                if (keVar != null) {
                    m16179a(stringBuilder, 2);
                    stringBuilder.append("audience_membership {\n");
                    m16182a(stringBuilder, 2, "audience_id", keVar.f18265a);
                    m16182a(stringBuilder, 2, "new_audience", keVar.f18268d);
                    m16183a(stringBuilder, "current_data", keVar.f18266b);
                    m16183a(stringBuilder, "previous_data", keVar.f18267c);
                    m16179a(stringBuilder, 2);
                    stringBuilder.append("}\n");
                }
            }
        }
    }

    private final void m16185a(StringBuilder stringBuilder, kf[] kfVarArr) {
        if (kfVarArr != null) {
            for (kf kfVar : kfVarArr) {
                if (kfVar != null) {
                    m16179a(stringBuilder, 2);
                    stringBuilder.append("event {\n");
                    m16182a(stringBuilder, 2, "name", m16194a(kfVar.f18271b));
                    m16182a(stringBuilder, 2, "timestamp_millis", kfVar.f18272c);
                    m16182a(stringBuilder, 2, "previous_timestamp_millis", kfVar.f18273d);
                    m16182a(stringBuilder, 2, "count", kfVar.f18274e);
                    kg[] kgVarArr = kfVar.f18270a;
                    if (kgVarArr != null) {
                        for (kg kgVar : kgVarArr) {
                            if (kgVar != null) {
                                m16179a(stringBuilder, 3);
                                stringBuilder.append("param {\n");
                                m16182a(stringBuilder, 3, "name", m16196b(kgVar.f18276a));
                                m16182a(stringBuilder, 3, "string_value", kgVar.f18277b);
                                m16182a(stringBuilder, 3, "int_value", kgVar.f18278c);
                                m16182a(stringBuilder, 3, "double_value", kgVar.f18279d);
                                m16179a(stringBuilder, 3);
                                stringBuilder.append("}\n");
                            }
                        }
                    }
                    m16179a(stringBuilder, 2);
                    stringBuilder.append("}\n");
                }
            }
        }
    }

    private final void m16186a(StringBuilder stringBuilder, kk[] kkVarArr) {
        if (kkVarArr != null) {
            for (kk kkVar : kkVarArr) {
                if (kkVar != null) {
                    m16179a(stringBuilder, 2);
                    stringBuilder.append("user_property {\n");
                    m16182a(stringBuilder, 2, "set_timestamp_millis", kkVar.f18321a);
                    m16182a(stringBuilder, 2, "name", m16198c(kkVar.f18322b));
                    m16182a(stringBuilder, 2, "string_value", kkVar.f18323c);
                    m16182a(stringBuilder, 2, "int_value", kkVar.f18324d);
                    m16182a(stringBuilder, 2, "double_value", kkVar.f18325e);
                    m16179a(stringBuilder, 2);
                    stringBuilder.append("}\n");
                }
            }
        }
    }

    private final boolean m16187y() {
        return this.s.m4906e().m16227a(3);
    }

    protected final String m16188a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!m16187y()) {
            return bundle.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : bundle.keySet()) {
            stringBuilder.append(stringBuilder.length() != 0 ? ", " : "Bundle[{");
            stringBuilder.append(m16196b(str));
            stringBuilder.append("=");
            stringBuilder.append(bundle.get(str));
        }
        stringBuilder.append("}]");
        return stringBuilder.toString();
    }

    protected final String m16189a(fe feVar) {
        if (!m16187y()) {
            return feVar.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Event{appId='");
        stringBuilder.append(feVar.f5728a);
        stringBuilder.append("', name='");
        stringBuilder.append(m16194a(feVar.f5729b));
        stringBuilder.append("', params=");
        stringBuilder.append(m16177a(feVar.f5733f));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    protected final String m16190a(jw jwVar) {
        if (jwVar == null) {
            return "null";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nevent_filter {\n");
        int i = 0;
        m16182a(stringBuilder, 0, "filter_id", jwVar.f18227a);
        m16182a(stringBuilder, 0, "event_name", m16194a(jwVar.f18228b));
        m16181a(stringBuilder, 1, "event_count_filter", jwVar.f18230d);
        stringBuilder.append("  filters {\n");
        jx[] jxVarArr = jwVar.f18229c;
        int length = jxVarArr.length;
        while (i < length) {
            m16180a(stringBuilder, 2, jxVarArr[i]);
            i++;
        }
        m16179a(stringBuilder, 1);
        stringBuilder.append("}\n}\n");
        return stringBuilder.toString();
    }

    protected final String m16191a(jz jzVar) {
        if (jzVar == null) {
            return "null";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nproperty_filter {\n");
        m16182a(stringBuilder, 0, "filter_id", jzVar.f18243a);
        m16182a(stringBuilder, 0, "property_name", m16198c(jzVar.f18244b));
        m16180a(stringBuilder, 1, jzVar.f18245c);
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }

    protected final String m16192a(kh khVar) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nbatch {\n");
        if (khVar.f18281a != null) {
            for (ki kiVar : khVar.f18281a) {
                if (!(kiVar == null || kiVar == null)) {
                    m16179a(stringBuilder, 1);
                    stringBuilder.append("bundle {\n");
                    m16182a(stringBuilder, 1, "protocol_version", kiVar.f18292a);
                    m16182a(stringBuilder, 1, "platform", kiVar.f18300i);
                    m16182a(stringBuilder, 1, "gmp_version", kiVar.f18308q);
                    m16182a(stringBuilder, 1, "uploading_gmp_version", kiVar.f18309r);
                    m16182a(stringBuilder, 1, "config_version", kiVar.f18287E);
                    m16182a(stringBuilder, 1, "gmp_app_id", kiVar.f18316y);
                    m16182a(stringBuilder, 1, "app_id", kiVar.f18306o);
                    m16182a(stringBuilder, 1, "app_version", kiVar.f18307p);
                    m16182a(stringBuilder, 1, "app_version_major", kiVar.f18285C);
                    m16182a(stringBuilder, 1, "firebase_instance_id", kiVar.f18284B);
                    m16182a(stringBuilder, 1, "dev_cert_hash", kiVar.f18313v);
                    m16182a(stringBuilder, 1, "app_store", kiVar.f18305n);
                    m16182a(stringBuilder, 1, "upload_timestamp_millis", kiVar.f18295d);
                    m16182a(stringBuilder, 1, "start_timestamp_millis", kiVar.f18296e);
                    m16182a(stringBuilder, 1, "end_timestamp_millis", kiVar.f18297f);
                    m16182a(stringBuilder, 1, "previous_bundle_start_timestamp_millis", kiVar.f18298g);
                    m16182a(stringBuilder, 1, "previous_bundle_end_timestamp_millis", kiVar.f18299h);
                    m16182a(stringBuilder, 1, "app_instance_id", kiVar.f18312u);
                    m16182a(stringBuilder, 1, "resettable_device_id", kiVar.f18310s);
                    m16182a(stringBuilder, 1, "device_id", kiVar.f18286D);
                    m16182a(stringBuilder, 1, "limited_ad_tracking", kiVar.f18311t);
                    m16182a(stringBuilder, 1, "os_version", kiVar.f18301j);
                    m16182a(stringBuilder, 1, "device_model", kiVar.f18302k);
                    m16182a(stringBuilder, 1, "user_default_language", kiVar.f18303l);
                    m16182a(stringBuilder, 1, "time_zone_offset_minutes", kiVar.f18304m);
                    m16182a(stringBuilder, 1, "bundle_sequential_index", kiVar.f18314w);
                    m16182a(stringBuilder, 1, "service_upload", kiVar.f18317z);
                    m16182a(stringBuilder, 1, "health_monitor", kiVar.f18315x);
                    if (kiVar.f18288F.longValue() != 0) {
                        m16182a(stringBuilder, 1, "android_id", kiVar.f18288F);
                    }
                    m16186a(stringBuilder, kiVar.f18294c);
                    m16184a(stringBuilder, kiVar.f18283A);
                    m16185a(stringBuilder, kiVar.f18293b);
                    m16179a(stringBuilder, 1);
                    stringBuilder.append("}\n");
                }
            }
        }
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }

    protected final String m16193a(zzcfx com_google_android_gms_internal_zzcfx) {
        if (com_google_android_gms_internal_zzcfx == null) {
            return null;
        }
        if (!m16187y()) {
            return com_google_android_gms_internal_zzcfx.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("origin=");
        stringBuilder.append(com_google_android_gms_internal_zzcfx.f18547c);
        stringBuilder.append(",name=");
        stringBuilder.append(m16194a(com_google_android_gms_internal_zzcfx.f18545a));
        stringBuilder.append(",params=");
        stringBuilder.append(m16177a(com_google_android_gms_internal_zzcfx.f18546b));
        return stringBuilder.toString();
    }

    protected final String m16194a(String str) {
        return str == null ? null : !m16187y() ? str : m16178a(str, C5527a.f15310b, C5527a.f15309a, f18131a);
    }

    public final /* bridge */ /* synthetic */ void mo1604a() {
        super.mo1604a();
    }

    protected final String m16196b(String str) {
        return str == null ? null : !m16187y() ? str : m16178a(str, C5528d.f15312b, C5528d.f15311a, f18132b);
    }

    public final /* bridge */ /* synthetic */ void mo1605b() {
        super.mo1605b();
    }

    protected final String m16198c(String str) {
        if (str == null) {
            return null;
        }
        if (!m16187y()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m16178a(str, C5529e.f15314b, C5529e.f15313a, f18133c);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("experiment_id");
        stringBuilder.append("(");
        stringBuilder.append(str);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final /* bridge */ /* synthetic */ void mo1606c() {
        super.mo1606c();
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
