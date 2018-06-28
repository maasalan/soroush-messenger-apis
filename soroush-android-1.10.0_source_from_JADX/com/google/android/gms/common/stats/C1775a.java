package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.util.C1784c;
import java.util.Collections;
import java.util.List;

public final class C1775a {
    private static final Object f5423a = new Object();
    private static volatile C1775a f5424b = null;
    private static boolean f5425c = false;
    private final List<String> f5426d = Collections.EMPTY_LIST;
    private final List<String> f5427e = Collections.EMPTY_LIST;
    private final List<String> f5428f = Collections.EMPTY_LIST;
    private final List<String> f5429g = Collections.EMPTY_LIST;

    private C1775a() {
    }

    public static C1775a m4485a() {
        if (f5424b == null) {
            synchronized (f5423a) {
                if (f5424b == null) {
                    f5424b = new C1775a();
                }
            }
        }
        return f5424b;
    }

    public static boolean m4486a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (!(component == null ? false : C1784c.m4518a(context, component.getPackageName()))) {
            return context.bindService(intent, serviceConnection, i);
        }
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
    }

    public static boolean m4487b(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        context.getClass().getName();
        return C1775a.m4486a(context, intent, serviceConnection, i);
    }
}
