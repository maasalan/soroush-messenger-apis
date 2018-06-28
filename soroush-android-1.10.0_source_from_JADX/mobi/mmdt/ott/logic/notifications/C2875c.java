package mobi.mmdt.ott.logic.notifications;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.support.v4.p029a.C0346c;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;

public final class C2875c {
    public static Bitmap m7231a() {
        return C2491i.m6762a(VERSION.SDK_INT >= 21 ? MyApplication.m12952b().getResources().getDrawable(R.mipmap.ic_launcher2, MyApplication.m12952b().getTheme()) : C0346c.m682a(MyApplication.m12952b(), (int) R.mipmap.ic_launcher2));
    }
}
