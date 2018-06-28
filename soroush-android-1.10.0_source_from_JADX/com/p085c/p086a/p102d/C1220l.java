package com.p085c.p086a.p102d;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.C0390k;
import android.support.v4.app.C7249g;
import android.support.v4.app.Fragment;
import android.support.v4.p038g.C4813a;
import android.util.Log;
import android.view.View;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C5284j;
import com.p085c.p086a.p109i.C1273i;
import java.util.HashMap;
import java.util.Map;

public final class C1220l implements Callback {
    private static final C1219a f3848i = new C52621();
    final Map<FragmentManager, C1218k> f3849a = new HashMap();
    final Map<C0390k, C6460o> f3850b = new HashMap();
    private volatile C5284j f3851c;
    private final Handler f3852d;
    private final C1219a f3853e;
    private final C4813a<View, Fragment> f3854f = new C4813a();
    private final C4813a<View, android.app.Fragment> f3855g = new C4813a();
    private final Bundle f3856h = new Bundle();

    public interface C1219a {
        C5284j mo1226a(C1212c c1212c, C1216h c1216h, C1221m c1221m);
    }

    static class C52621 implements C1219a {
        C52621() {
        }

        public final C5284j mo1226a(C1212c c1212c, C1216h c1216h, C1221m c1221m) {
            return new C5284j(c1212c, c1216h, c1221m);
        }
    }

    public C1220l(C1219a c1219a) {
        if (c1219a == null) {
            c1219a = f3848i;
        }
        this.f3853e = c1219a;
        this.f3852d = new Handler(Looper.getMainLooper(), this);
    }

    private C5284j m2888b(Context context) {
        if (this.f3851c == null) {
            synchronized (this) {
                if (this.f3851c == null) {
                    this.f3851c = this.f3853e.mo1226a(C1212c.m2871a(context), new C5257b(), new C5260g());
                }
            }
        }
        return this.f3851c;
    }

    @TargetApi(17)
    private static void m2889b(Activity activity) {
        if (VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    @TargetApi(17)
    final C1218k m2890a(FragmentManager fragmentManager) {
        C1218k c1218k = (C1218k) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (c1218k != null) {
            return c1218k;
        }
        c1218k = (C1218k) this.f3849a.get(fragmentManager);
        if (c1218k != null) {
            return c1218k;
        }
        android.app.Fragment c1218k2 = new C1218k();
        c1218k2.f3845d = null;
        this.f3849a.put(fragmentManager, c1218k2);
        fragmentManager.beginTransaction().add(c1218k2, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.f3852d.obtainMessage(1, fragmentManager).sendToTarget();
        return c1218k2;
    }

    final C6460o m2891a(C0390k c0390k) {
        C6460o c6460o = (C6460o) c0390k.mo253a("com.bumptech.glide.manager");
        if (c6460o != null) {
            return c6460o;
        }
        c6460o = (C6460o) this.f3850b.get(c0390k);
        if (c6460o != null) {
            return c6460o;
        }
        Fragment c6460o2 = new C6460o();
        c6460o2.f17621d = null;
        this.f3850b.put(c0390k, c6460o2);
        c0390k.mo254a().mo237a(c6460o2, "com.bumptech.glide.manager").mo244d();
        this.f3852d.obtainMessage(2, c0390k).sendToTarget();
        return c6460o2;
    }

    public final C5284j m2892a(Activity activity) {
        if (C1273i.m3027d()) {
            return m2893a(activity.getApplicationContext());
        }
        C1220l.m2889b(activity);
        C1218k a = m2890a(activity.getFragmentManager());
        C5284j c5284j = a.f3844c;
        if (c5284j == null) {
            c5284j = this.f3853e.mo1226a(C1212c.m2871a((Context) activity), a.f3842a, a.f3843b);
            a.f3844c = c5284j;
        }
        return c5284j;
    }

    public final C5284j m2893a(Context context) {
        while (context != null) {
            if (C1273i.m3026c() && !(context instanceof Application)) {
                if (context instanceof C7249g) {
                    return m2894a((C7249g) context);
                }
                if (context instanceof Activity) {
                    return m2892a((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            return m2888b(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public final C5284j m2894a(C7249g c7249g) {
        if (C1273i.m3027d()) {
            return m2893a(c7249g.getApplicationContext());
        }
        C1220l.m2889b((Activity) c7249g);
        C6460o a = m2891a(c7249g.m19188c());
        C5284j c5284j = a.f17620c;
        if (c5284j == null) {
            c5284j = this.f3853e.mo1226a(C1212c.m2871a((Context) c7249g), a.f17618a, a.f17619b);
            a.f17620c = c5284j;
        }
        return c5284j;
    }

    public final boolean handleMessage(Message message) {
        Map map;
        Object obj;
        Object obj2 = null;
        boolean z = true;
        switch (message.what) {
            case 1:
                obj2 = (FragmentManager) message.obj;
                map = this.f3849a;
                break;
            case 2:
                obj2 = (C0390k) message.obj;
                map = this.f3850b;
                break;
            default:
                z = false;
                obj = null;
                break;
        }
        obj = map.remove(obj2);
        if (z && r5 == null && Log.isLoggable("RMRetriever", 5)) {
            StringBuilder stringBuilder = new StringBuilder("Failed to remove expected request manager fragment, manager: ");
            stringBuilder.append(obj2);
            Log.w("RMRetriever", stringBuilder.toString());
        }
        return z;
    }
}
