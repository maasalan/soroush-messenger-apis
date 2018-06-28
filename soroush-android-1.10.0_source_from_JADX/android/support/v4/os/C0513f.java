package android.support.v4.os;

import android.os.Build.VERSION;
import android.os.Trace;

public final class C0513f {
    public static void m1120a() {
        if (VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    public static void m1121a(String str) {
        if (VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }
}
