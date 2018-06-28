package mobi.mmdt.ott.provider.p393o;

import android.content.Context;
import android.net.Uri;

public final class C3011a {
    public static int m7519a(Context context, String str, int i) {
        C6044c c6044c = new C6044c();
        c6044c.m13551b(i);
        C6046e c6046e = new C6046e();
        c6046e.m13562a(str);
        return c6044c.m13547a(context, c6046e);
    }

    public static Uri m7520a(Context context, int i, int i2, int i3, String str, String str2, String str3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (!(str2 == null || str2.isEmpty() || str3 == null)) {
            if (!str3.isEmpty()) {
                C6044c c6044c = new C6044c();
                c6044c.m13553c(i).m13549a(i2).m13555d(i3).m13552b(str2).m13554c(str3).m13558g(i4).m13559h(i5).m13556e(i6).m13557f(i7).m13550a(str).m13551b(i8).m13560i(i9);
                return c6044c.m7349a(context);
            }
        }
        throw new NullPointerException();
    }

    public static String m7521a(String str) {
        return str.split("_")[0];
    }

    public static String m7522b(String str) {
        return str.split("_")[1];
    }

    public static String m7523c(String str) {
        return str.split("_")[2];
    }
}
