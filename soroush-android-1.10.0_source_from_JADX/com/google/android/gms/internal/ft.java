package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.util.C1785d;
import com.google.android.gms.measurement.AppMeasurement;
import org.jivesoftware.smack.roster.Roster;

public final class ft extends hq {
    public final fv f18134a;
    final fv f18135b;
    public final fv f18136c;
    public final fv f18137d;
    final fv f18138e;
    final fv f18139f;
    public final fv f18140g;
    private final String f18141h = ((String) fj.f5762c.f5786a);
    private final char f18142i;
    private final long f18143j = 11720;
    private final fv f18144k;
    private final fv f18145l;

    ft(gr grVar) {
        super(grVar);
        this.f18142i = mo1625v().m11945w() ? 'C' : 'c';
        this.f18134a = new fv(this, 6, false, false);
        this.f18135b = new fv(this, 6, true, false);
        this.f18144k = new fv(this, 6, false, true);
        this.f18136c = new fv(this, 5, false, false);
        this.f18145l = new fv(this, 5, true, false);
        this.f18137d = new fv(this, 5, false, true);
        this.f18138e = new fv(this, 4, false, false);
        this.f18139f = new fv(this, 3, false, false);
        this.f18140g = new fv(this, 2, false, false);
    }

    protected static Object m16220a(String str) {
        return str == null ? null : new fw(str);
    }

    private static String m16221a(boolean z, Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i = 0;
        String valueOf;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            StringBuilder stringBuilder = new StringBuilder((43 + String.valueOf(str).length()) + String.valueOf(str).length());
            stringBuilder.append(str);
            stringBuilder.append(round);
            stringBuilder.append("...");
            stringBuilder.append(str);
            stringBuilder.append(round2);
            return stringBuilder.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (!(obj instanceof Throwable)) {
                return obj instanceof fw ? ((fw) obj).f5796a : z ? "-" : String.valueOf(obj);
            } else {
                Throwable th = (Throwable) obj;
                StringBuilder stringBuilder2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
                valueOf = m16223b(AppMeasurement.class.getCanonicalName());
                String b = m16223b(gr.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (i < length) {
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod()) {
                        String className = stackTraceElement.getClassName();
                        if (className != null) {
                            className = m16223b(className);
                            if (className.equals(valueOf) || className.equals(b)) {
                                stringBuilder2.append(": ");
                                stringBuilder2.append(stackTraceElement);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i++;
                }
                return stringBuilder2.toString();
            }
        }
    }

    private static String m16222a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (str == null) {
            Object obj4 = "";
        }
        obj = m16221a(z, obj);
        obj2 = m16221a(z, obj2);
        Object a = m16221a(z, obj3);
        StringBuilder stringBuilder = new StringBuilder();
        String str2 = "";
        if (!TextUtils.isEmpty(obj4)) {
            stringBuilder.append(obj4);
            str2 = ": ";
        }
        if (!TextUtils.isEmpty(obj)) {
            stringBuilder.append(str2);
            stringBuilder.append(obj);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(obj2)) {
            stringBuilder.append(str2);
            stringBuilder.append(obj2);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a)) {
            stringBuilder.append(str2);
            stringBuilder.append(a);
        }
        return stringBuilder.toString();
    }

    private static String m16223b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    public final /* bridge */ /* synthetic */ void mo1604a() {
        super.mo1604a();
    }

    protected final void m16225a(int i, String str) {
        Log.println(i, this.f18141h, str);
    }

    protected final void m16226a(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && m16227a(i)) {
            m16225a(i, m16222a(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            String str2;
            ac.m4376a((Object) str);
            hq hqVar = this.s.f5870d;
            if (hqVar == null) {
                str2 = "Scheduler not set. Not logging error/warn";
            } else if (hqVar.m11974K()) {
                if (i < 0) {
                    i = 0;
                }
                if (i >= 9) {
                    i = 8;
                }
                String str3 = "2";
                char charAt = "01VDIWEA?".charAt(i);
                char c = this.f18142i;
                long j = this.f18143j;
                String a = m16222a(true, str, obj, obj2, obj3);
                StringBuilder stringBuilder = new StringBuilder((23 + String.valueOf(str3).length()) + String.valueOf(a).length());
                stringBuilder.append(str3);
                stringBuilder.append(charAt);
                stringBuilder.append(c);
                stringBuilder.append(j);
                stringBuilder.append(":");
                stringBuilder.append(a);
                str2 = stringBuilder.toString();
                if (str2.length() > Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE) {
                    str2 = str.substring(0, Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE);
                }
                hqVar.m16336a(new fu(this, str2));
            } else {
                str2 = "Scheduler not initialized. Not logging error/warn";
            }
            m16225a(6, str2);
        }
    }

    protected final boolean m16227a(int i) {
        return Log.isLoggable(this.f18141h, i);
    }

    public final /* bridge */ /* synthetic */ void mo1605b() {
        super.mo1605b();
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

    public final String m16250y() {
        Pair pair;
        gg ggVar = mo1624u().f18147b;
        ggVar.f5828d.mo1606c();
        ggVar.f5828d.mo1606c();
        long b = ggVar.m4857b();
        if (b == 0) {
            ggVar.m4856a();
            b = 0;
        } else {
            b = Math.abs(b - ggVar.f5828d.mo1614k().mo1575a());
        }
        if (b >= ggVar.f5827c) {
            if (b > (ggVar.f5827c << 1)) {
                ggVar.m4856a();
            } else {
                String string = ggVar.f5828d.m16276D().getString(ggVar.f5826b, null);
                long j = ggVar.f5828d.m16276D().getLong(ggVar.f5825a, 0);
                ggVar.m4856a();
                if (string != null) {
                    if (j > 0) {
                        pair = new Pair(string, Long.valueOf(j));
                        if (pair != null && pair != gd.f18146a) {
                            string = String.valueOf(pair.second);
                            String str = (String) pair.first;
                            StringBuilder stringBuilder = new StringBuilder((1 + String.valueOf(string).length()) + String.valueOf(str).length());
                            stringBuilder.append(string);
                            stringBuilder.append(":");
                            stringBuilder.append(str);
                            return stringBuilder.toString();
                        }
                    }
                }
                pair = gd.f18146a;
                return pair != null ? null : null;
            }
        }
        pair = null;
        if (pair != null) {
        }
    }
}
