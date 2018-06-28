package mobi.mmdt.ott.lib_webservicescomponent.retrofit.p259b;

import com.google.p164b.C1940f;
import com.google.p164b.C1941g;
import com.google.p164b.C1944k;
import com.google.p164b.C1948t;
import com.google.p164b.C5530a;
import com.google.p164b.C5591l;
import com.google.p164b.C5592m;
import com.google.p164b.p166b.C1930j;
import com.google.p164b.p166b.p167a.C1913n;
import com.google.p164b.p170d.C1937c;
import java.io.StringWriter;
import java.io.Writer;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public final class C2564b {
    private static C1940f f8372a;

    static {
        C1948t c5530a;
        C1948t c5530a2;
        C1948t c1948t;
        C1941g c1941g = new C1941g();
        c1941g.f6489m = false;
        List arrayList = new ArrayList((c1941g.f6481e.size() + c1941g.f6482f.size()) + 3);
        arrayList.addAll(c1941g.f6481e);
        Collections.reverse(arrayList);
        Collection arrayList2 = new ArrayList(c1941g.f6482f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        String str = c1941g.f6484h;
        int i = c1941g.f6485i;
        int i2 = c1941g.f6486j;
        if (str == null || "".equals(str.trim())) {
            if (!(i == 2 || i2 == 2)) {
                c5530a = new C5530a(Date.class, i, i2);
                c5530a2 = new C5530a(Timestamp.class, i, i2);
                C1948t c5530a3 = new C5530a(java.sql.Date.class, i, i2);
                c1948t = c5530a2;
                c5530a2 = c5530a3;
            }
            f8372a = new C1940f(c1941g.f6477a, c1941g.f6479c, c1941g.f6480d, c1941g.f6483g, c1941g.f6487k, c1941g.f6491o, c1941g.f6489m, c1941g.f6490n, c1941g.f6492p, c1941g.f6488l, c1941g.f6478b, arrayList);
        }
        C1948t c5530a4 = new C5530a(Date.class, str);
        c1948t = new C5530a(Timestamp.class, str);
        c5530a2 = new C5530a(java.sql.Date.class, str);
        c5530a = c5530a4;
        arrayList.add(C1913n.m5247a(Date.class, c5530a));
        arrayList.add(C1913n.m5247a(Timestamp.class, c1948t));
        arrayList.add(C1913n.m5247a(java.sql.Date.class, c5530a2));
        f8372a = new C1940f(c1941g.f6477a, c1941g.f6479c, c1941g.f6480d, c1941g.f6483g, c1941g.f6487k, c1941g.f6491o, c1941g.f6489m, c1941g.f6490n, c1941g.f6492p, c1941g.f6488l, c1941g.f6478b, arrayList);
    }

    public static String m7016a(Object obj) {
        C1937c a;
        boolean z;
        boolean z2;
        boolean z3;
        C1940f c1940f = f8372a;
        if (obj != null) {
            return c1940f.m5351a(obj, obj.getClass());
        }
        C1944k c1944k = C5592m.f15449a;
        StringWriter stringWriter = new StringWriter();
        try {
            a = c1940f.m5346a((Writer) stringWriter);
            z = a.f6457e;
            a.f6457e = true;
            z2 = a.f6458f;
            a.f6458f = c1940f.f6466b;
            z3 = a.f6459g;
            a.f6459g = c1940f.f6465a;
            C1930j.m5284a(c1944k, a);
            a.f6457e = z;
            a.f6458f = z2;
            a.f6459g = z3;
            return stringWriter.toString();
        } catch (Throwable e) {
            throw new C5591l(e);
        } catch (Throwable e2) {
            throw new C5591l(e2);
        } catch (Throwable th) {
            a.f6457e = z;
            a.f6458f = z2;
            a.f6459g = z3;
        }
    }
}
