package android.support.v4.app;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.Method;

public final class C0383e {

    static class C0382a {
        public static Method f1414a;
        public static boolean f1415b;
        private static Method f1416c;
        private static boolean f1417d;

        public static IBinder m750a(Bundle bundle, String str) {
            if (!f1417d) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f1416c = method;
                    method.setAccessible(true);
                } catch (Throwable e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e);
                }
                f1417d = true;
            }
            if (f1416c != null) {
                try {
                    return (IBinder) f1416c.invoke(bundle, new Object[]{str});
                } catch (Throwable e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e2);
                    f1416c = null;
                }
            }
            return null;
        }
    }
}
