package com.p111d.p112a.p121c.p124c;

import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5348h;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C7089f;
import com.p111d.p112a.p121c.p128f.C6493h;
import com.p111d.p112a.p121c.p128f.C6494i;

public abstract class C1443v {
    public Object mo1300a(C5347g c5347g) {
        throw c5347g.m11446a("Can not instantiate value of type %s; no default creator found", mo1301a());
    }

    public Object mo1313a(C5347g c5347g, double d) {
        throw c5347g.m11446a("Can not instantiate value of type %s from Floating-point number (%s, double)", mo1301a(), Double.valueOf(d));
    }

    public Object mo1314a(C5347g c5347g, int i) {
        throw c5347g.m11446a("Can not instantiate value of type %s from Integer number (%s, int)", mo1301a(), Integer.valueOf(i));
    }

    public Object mo1315a(C5347g c5347g, long j) {
        throw c5347g.m11446a("Can not instantiate value of type %s from Integer number (%s, long)", mo1301a(), Long.valueOf(j));
    }

    public Object mo1316a(C5347g c5347g, Object obj) {
        throw c5347g.m11446a("Can not instantiate value of type %s using delegate", mo1301a());
    }

    public Object mo1317a(C5347g c5347g, String str) {
        return m3595b(c5347g, str);
    }

    public Object mo1318a(C5347g c5347g, boolean z) {
        throw c5347g.m11446a("Can not instantiate value of type %s from Boolean value (%s)", mo1301a(), Boolean.valueOf(z));
    }

    public Object mo1319a(C5347g c5347g, Object[] objArr) {
        throw c5347g.m11446a("Can not instantiate value of type %s with arguments", mo1301a());
    }

    public abstract String mo1301a();

    public C6488s[] mo1320a(C7089f c7089f) {
        return null;
    }

    public Object mo1321b(C5347g c5347g, Object obj) {
        throw c5347g.m11446a("Can not instantiate value of type %s using delegate", mo1301a());
    }

    protected final Object m3595b(C5347g c5347g, String str) {
        if (mo1326g()) {
            String trim = str.trim();
            if ("true".equals(trim)) {
                return mo1318a(c5347g, true);
            }
            if ("false".equals(trim)) {
                return mo1318a(c5347g, false);
            }
        }
        if (str.length() == 0 && c5347g.m11452a(C5348h.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
            return null;
        }
        throw c5347g.m11446a("Can not instantiate value of type %s from String value ('%s'); no single-String constructor/factory method", mo1301a(), str);
    }

    public boolean mo1302b() {
        if (!(mo1303h() || mo1327i() || mo1329k() || mo1322c() || mo1323d() || mo1324e() || mo1325f())) {
            if (!mo1326g()) {
                return false;
            }
        }
        return true;
    }

    public boolean mo1322c() {
        return false;
    }

    public boolean mo1323d() {
        return false;
    }

    public boolean mo1324e() {
        return false;
    }

    public boolean mo1325f() {
        return false;
    }

    public boolean mo1326g() {
        return false;
    }

    public boolean mo1303h() {
        return mo1332n() != null;
    }

    public boolean mo1327i() {
        return false;
    }

    public boolean mo1328j() {
        return false;
    }

    public boolean mo1329k() {
        return false;
    }

    public C5354j mo1330l() {
        return null;
    }

    public C5354j mo1331m() {
        return null;
    }

    public C6494i mo1332n() {
        return null;
    }

    public C6494i mo1333o() {
        return null;
    }

    public C6494i mo1334p() {
        return null;
    }

    public C6493h mo1335q() {
        return null;
    }
}
