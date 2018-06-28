package mobi.mmdt.ott.view.settings;

import android.app.Activity;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;

public final class C4370d {
    public static String m8116a(Activity activity) {
        try {
            return activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0).versionName;
        } catch (Throwable e) {
            C2480b.m6738b(e);
            return "";
        }
    }
}
