package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.os.UserManager;

public abstract class ky<T> {
    static Context f6085a = null;
    private static final Object f6086f = new Object();
    private static boolean f6087g = false;
    final le f6088b;
    final String f6089c;
    final String f6090d;
    final T f6091e;
    private T f6092h;

    private ky(le leVar, String str) {
        this.f6092h = null;
        if (leVar.f6093a == null && leVar.f6094b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        } else if (leVar.f6093a == null || leVar.f6094b == null) {
            String str2;
            this.f6088b = leVar;
            if (leVar.f6097e) {
                str2 = null;
            } else {
                str2 = String.valueOf(leVar.f6095c);
                String valueOf = String.valueOf(str);
                str2 = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
            }
            this.f6090d = str2;
            String valueOf2 = String.valueOf(leVar.f6096d);
            str = String.valueOf(str);
            this.f6089c = str.length() != 0 ? valueOf2.concat(str) : new String(valueOf2);
            this.f6091e = null;
        } else {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
    }

    static <V> V m4966a(com.google.android.gms.internal.ld<V> r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = r2.mo1649a();	 Catch:{ SecurityException -> 0x0006 }
        r2 = r0;
        return r2;
    L_0x0006:
        r0 = android.os.Binder.clearCallingIdentity();
        r2 = r2.mo1649a();	 Catch:{ all -> 0x0012 }
        android.os.Binder.restoreCallingIdentity(r0);
        return r2;
    L_0x0012:
        r2 = move-exception;
        android.os.Binder.restoreCallingIdentity(r0);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ky.a(com.google.android.gms.internal.ld):V");
    }

    public static void m4967a(Context context) {
        if (f6085a == null) {
            synchronized (f6086f) {
                if (VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                }
                f6085a = context;
            }
            f6087g = false;
        }
    }

    @TargetApi(24)
    final T m4969a() {
        if (!((Boolean) m4966a(lb.f15280a)).booleanValue()) {
            if (this.f6088b.f6094b != null) {
                String str = (String) m4966a(new kz(this, kl.m4958a(f6085a.getContentResolver(), this.f6088b.f6094b)));
                if (str != null) {
                    return mo1651a(str);
                }
            } else if (this.f6088b.f6093a == null || (VERSION.SDK_INT >= 24 && !f6085a.isDeviceProtectedStorage() && !((UserManager) f6085a.getSystemService(UserManager.class)).isUserUnlocked())) {
                return null;
            } else {
                SharedPreferences sharedPreferences = f6085a.getSharedPreferences(this.f6088b.f6093a, 0);
                if (sharedPreferences.contains(this.f6089c)) {
                    return mo1650a(sharedPreferences);
                }
            }
        }
        return null;
    }

    public abstract T mo1650a(SharedPreferences sharedPreferences);

    public abstract T mo1651a(String str);

    final T m4972b() {
        if (this.f6090d != null) {
            String str = (String) m4966a(new la(this));
            if (str != null) {
                return mo1651a(str);
            }
        }
        return null;
    }
}
