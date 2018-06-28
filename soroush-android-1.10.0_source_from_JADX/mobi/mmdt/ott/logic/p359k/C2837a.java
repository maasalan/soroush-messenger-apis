package mobi.mmdt.ott.logic.p359k;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.support.v4.app.C4767a;
import android.support.v4.p029a.C0346c;
import java.util.ArrayList;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.view.tools.C4516l;

@TargetApi(23)
public final class C2837a {
    private static final String[] f8919a = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};

    public static void m7167a(Activity activity, String str, int i) {
        if (!(activity == null || C2837a.m7170a(str))) {
            C4767a.m8922a(activity, new String[]{str}, i);
        }
    }

    public static void m7168a(Activity activity, String[] strArr) {
        if (activity != null) {
            boolean[] zArr;
            int i = 0;
            if (activity == null) {
                zArr = null;
            } else {
                boolean[] zArr2 = new boolean[2];
                for (int i2 = 0; i2 < 2; i2++) {
                    zArr2[i2] = C0346c.m681a((Context) activity, strArr[i2]) == 0;
                }
                zArr = zArr2;
            }
            ArrayList arrayList = new ArrayList();
            while (i < zArr.length) {
                if (!zArr[i]) {
                    arrayList.add(strArr[i]);
                }
                i++;
            }
            if (arrayList.size() > 0) {
                C4767a.m8922a(activity, (String[]) arrayList.toArray(new String[arrayList.size()]), 516);
            }
        }
    }

    public static boolean m7169a() {
        return C2837a.m7170a("android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public static boolean m7170a(String str) {
        return !C4516l.m8232a() || C0346c.m681a(MyApplication.m12952b(), str) == 0;
    }

    public static boolean m7171b() {
        return C2837a.m7170a("android.permission.READ_CONTACTS");
    }
}
