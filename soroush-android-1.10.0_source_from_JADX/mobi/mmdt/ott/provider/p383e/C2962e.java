package mobi.mmdt.ott.provider.p383e;

import android.content.Context;

public final class C2962e {
    public static int m7387a(Context context, String str) {
        C6016b c6016b = new C6016b();
        c6016b.m13316a(Integer.valueOf(1));
        C6018d c6018d = new C6018d();
        c6018d.m13330b(str);
        return c6016b.m13314a(context, c6018d);
    }

    public static int m7388a(Context context, String str, boolean z) {
        C6016b c6016b = new C6016b();
        c6016b.m13319a(false);
        c6016b.m13314a(context, null);
        c6016b = new C6016b();
        c6016b.m13319a(z);
        C6018d c6018d = new C6018d();
        c6018d.m13329a(str);
        return c6016b.m13314a(context, c6018d);
    }
}
