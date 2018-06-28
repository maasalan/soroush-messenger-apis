package mobi.mmdt.ott.view.tools;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.Locale;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.p246d.p248b.C2535a;

public final class C4522p {
    public static String m8236a(int i) {
        Object obj;
        Configuration configuration = MyApplication.m12952b().getResources().getConfiguration();
        String b = C2535a.m6888a().m6919b();
        int hashCode = b.hashCode();
        if (hashCode != 3121) {
            if (hashCode == 3259) {
                if (b.equals("fa")) {
                    obj = null;
                    switch (obj) {
                        case null:
                            b = "fa";
                            break;
                        case 1:
                            b = "ar";
                            break;
                        default:
                            b = "en";
                            break;
                    }
                    configuration.locale = new Locale(b);
                    return new Resources(MyApplication.m12952b().getAssets(), new DisplayMetrics(), configuration).getString(i);
                }
            }
        } else if (b.equals("ar")) {
            obj = 1;
            switch (obj) {
                case null:
                    b = "fa";
                    break;
                case 1:
                    b = "ar";
                    break;
                default:
                    b = "en";
                    break;
            }
            configuration.locale = new Locale(b);
            return new Resources(MyApplication.m12952b().getAssets(), new DisplayMetrics(), configuration).getString(i);
        }
        obj = -1;
        switch (obj) {
            case null:
                b = "fa";
                break;
            case 1:
                b = "ar";
                break;
            default:
                b = "en";
                break;
        }
        configuration.locale = new Locale(b);
        return new Resources(MyApplication.m12952b().getAssets(), new DisplayMetrics(), configuration).getString(i);
    }
}
