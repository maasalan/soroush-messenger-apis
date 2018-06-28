package pl.droidsonroids.gif;

import android.content.Context;
import android.os.Build.VERSION;

final class C7846f {
    private static Context f24934a;

    private static Context m22135a() {
        if (f24934a == null) {
            try {
                f24934a = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
            } catch (Throwable e) {
                throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e);
            }
        }
        return f24934a;
    }

    static void m22136a(Context context, String str) {
        try {
            System.loadLibrary(str);
        } catch (UnsatisfiedLinkError e) {
            if (VERSION.SDK_INT < 9) {
                throw e;
            }
            if ("pl_droidsonroids_gif_surface".equals(str)) {
                C7846f.m22136a(context, "pl_droidsonroids_gif");
            }
            if (context == null) {
                context = C7846f.m22135a();
            }
            C7850h.m22140a(context, str);
        }
    }
}
