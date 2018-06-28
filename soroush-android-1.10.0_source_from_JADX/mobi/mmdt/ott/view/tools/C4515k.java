package mobi.mmdt.ott.view.tools;

import android.graphics.Bitmap;
import com.p085c.p086a.p089c.C5255m;
import com.p085c.p086a.p089c.p097c.C5190g;
import com.p085c.p086a.p089c.p097c.C5193j.C1169a;
import com.p085c.p086a.p089c.p097c.C5193j.C5192b;
import java.util.List;
import jp.wasabeef.p215a.p216a.C7156b;
import mobi.mmdt.componentsutils.p232b.C2492j;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.provider.p386h.C2987i;

public final class C4515k {
    private static final String f12464a = C2492j.m6840a(MyApplication.m12952b());

    public static C5255m<Bitmap> m8230a(C2987i c2987i, String str) {
        return (c2987i != C2987i.FINISHED || str == null) ? new C7156b(10) : null;
    }

    public static String m8231a(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                C1169a c1169a = new C1169a();
                String str2 = "User-Agent";
                C5192b c5192b = new C5192b(f12464a);
                if (c1169a.f3729b && "User-Agent".equalsIgnoreCase(str2)) {
                    c1169a.m2790a();
                    List a = c1169a.m2789a(str2);
                    a.clear();
                    a.add(c5192b);
                    if (c1169a.f3729b && "User-Agent".equalsIgnoreCase(str2)) {
                        c1169a.f3729b = false;
                    }
                } else {
                    c1169a.m2790a();
                    c1169a.m2789a(str2).add(c5192b);
                }
                return new C5190g(str, c1169a.m2791b()).m10715a();
            }
        }
        return null;
    }
}
