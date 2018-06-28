package com.google.android.gms.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.util.C1795o;
import com.google.android.gms.common.util.C1799s;
import java.util.HashMap;
import java.util.Map;

public final class ly {
    private static String f6108i = "WakeLock";
    private static String f6109j = "*gcore*:";
    private static boolean f6110k = false;
    final WakeLock f6111a;
    WorkSource f6112b;
    final int f6113c;
    final String f6114d;
    final Context f6115e;
    boolean f6116f;
    final Map<String, Integer[]> f6117g;
    int f6118h;
    private final String f6119l;
    private final String f6120m;

    public ly(Context context, String str) {
        this(context, str, context == null ? null : context.getPackageName());
    }

    @SuppressLint({"UnwrappedWakeLock"})
    private ly(Context context, String str, String str2) {
        this(context, str, str2, (byte) 0);
    }

    @SuppressLint({"UnwrappedWakeLock"})
    private ly(Context context, String str, String str2, byte b) {
        this.f6116f = true;
        this.f6117g = new HashMap();
        ac.m4379a(str, (Object) "Wake lock name can NOT be empty");
        this.f6113c = 1;
        this.f6119l = null;
        this.f6120m = null;
        this.f6115e = context.getApplicationContext();
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f6114d = str;
        } else {
            String valueOf = String.valueOf(f6109j);
            String valueOf2 = String.valueOf(str);
            this.f6114d = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        this.f6111a = ((PowerManager) context.getSystemService("power")).newWakeLock(1, str);
        if (C1799s.m4548a(this.f6115e)) {
            if (C1795o.m4538a(str2)) {
                str2 = context.getPackageName();
            }
            this.f6112b = C1799s.m4544a(context, str2);
            WorkSource workSource = this.f6112b;
            if (workSource != null && C1799s.m4548a(this.f6115e)) {
                if (this.f6112b != null) {
                    this.f6112b.add(workSource);
                } else {
                    this.f6112b = workSource;
                }
                try {
                    this.f6111a.setWorkSource(this.f6112b);
                } catch (IllegalArgumentException e) {
                    Log.wtf(f6108i, e.toString());
                }
            }
        }
    }

    final String m4976a() {
        return this.f6116f ? !TextUtils.isEmpty(null) ? null : this.f6119l : this.f6119l;
    }
}
