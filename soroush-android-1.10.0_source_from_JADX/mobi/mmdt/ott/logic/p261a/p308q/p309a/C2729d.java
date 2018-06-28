package mobi.mmdt.ott.logic.p261a.p308q.p309a;

import android.app.Activity;
import android.net.Uri;
import android.widget.Toast;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p359k.C2837a;
import mobi.mmdt.ott.view.tools.C4516l;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C2729d {
    public static void m7071a(final Activity activity) {
        activity.runOnUiThread(new Runnable() {
            public final void run() {
                Toast.makeText(activity, C4522p.m8236a(R.string.file_saved_to_gallery), 0).show();
            }
        });
    }

    public static void m7072a(Activity activity, String str) {
        Object obj = (!C4516l.m8232a() || C2837a.m7169a()) ? null : 1;
        if (obj != null) {
            C2837a.m7167a(activity, "android.permission.WRITE_EXTERNAL_STORAGE", 187);
        } else {
            C2808d.m7147a(new C6767e(Uri.parse(str)));
        }
    }
}
