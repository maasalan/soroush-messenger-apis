package mobi.mmdt.ott.view.components.browser;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.app.C0383e.C0382a;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;

public final class C3116d {
    public final Intent f9698a;
    public final Bundle f9699b;

    public static final class C3115a {
        final Intent f9694a;
        ArrayList<Bundle> f9695b;
        Bundle f9696c;
        ArrayList<Bundle> f9697d;

        public C3115a() {
            this(null);
        }

        public C3115a(C3117e c3117e) {
            this.f9694a = new Intent("android.intent.action.VIEW");
            this.f9695b = null;
            this.f9696c = null;
            this.f9697d = null;
            if (c3117e != null) {
                this.f9694a.setPackage(c3117e.f9701b.getPackageName());
            }
            Bundle bundle = new Bundle();
            String str = "android.support.customtabs.extra.SESSION";
            IBinder asBinder = c3117e == null ? null : c3117e.f9700a.asBinder();
            if (VERSION.SDK_INT >= 18) {
                bundle.putBinder(str, asBinder);
            } else {
                if (!C0382a.f1415b) {
                    try {
                        Method method = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                        C0382a.f1414a = method;
                        method.setAccessible(true);
                    } catch (Throwable e) {
                        Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e);
                    }
                    C0382a.f1415b = true;
                }
                if (C0382a.f1414a != null) {
                    try {
                        C0382a.f1414a.invoke(bundle, new Object[]{str, asBinder});
                    } catch (Throwable e2) {
                        Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e2);
                        C0382a.f1414a = null;
                    }
                }
            }
            this.f9694a.putExtras(bundle);
        }
    }

    private C3116d(Intent intent, Bundle bundle) {
        this.f9698a = intent;
        this.f9699b = bundle;
    }
}
