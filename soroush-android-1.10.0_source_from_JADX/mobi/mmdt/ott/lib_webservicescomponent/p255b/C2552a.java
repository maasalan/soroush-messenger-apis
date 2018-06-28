package mobi.mmdt.ott.lib_webservicescomponent.p255b;

import android.content.Context;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import p056c.C5047x;
import p056c.C5047x.C0955a;
import p056c.p057a.C0885c;

public final class C2552a {
    private static C5047x m6992a(C0955a c0955a) {
        c0955a = c0955a.m2389a(1, TimeUnit.DAYS);
        c0955a.f3052y = C0885c.m2087a("timeout", 1, TimeUnit.DAYS);
        c0955a.f3053z = C0885c.m2087a("timeout", 1, TimeUnit.DAYS);
        c0955a.f3050w = true;
        return c0955a.m2391a();
    }

    public static C5047x m6993a(String str, Context context) {
        C5047x a = C2552a.m6992a(new C0955a());
        try {
            if (new URI(str).getHost().contains("soroush-hamrah.ir")) {
                return C2552a.m6992a(C2567b.m7018a().m7020a(context, true));
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return a;
    }
}
