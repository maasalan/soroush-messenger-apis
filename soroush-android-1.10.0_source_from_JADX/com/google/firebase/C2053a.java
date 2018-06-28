package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.p038g.C4813a;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.al;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.internal.ah;
import com.google.android.gms.common.util.C1794n;
import com.google.android.gms.internal.mq;
import com.google.android.gms.internal.mr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class C2053a {
    static final Map<String, C2053a> f6895a = new C4813a();
    private static final List<String> f6896b = Arrays.asList(new String[]{"com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId"});
    private static final List<String> f6897c = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");
    private static final List<String> f6898d = Arrays.asList(new String[]{"com.google.android.gms.measurement.AppMeasurement"});
    private static final List<String> f6899e = Arrays.asList(new String[0]);
    private static final Set<String> f6900f = Collections.emptySet();
    private static final Object f6901g = new Object();
    private final Context f6902h;
    private final String f6903i;
    private final C2057b f6904j;
    private final AtomicBoolean f6905k = new AtomicBoolean(false);
    private final AtomicBoolean f6906l = new AtomicBoolean();
    private final List<Object> f6907m = new CopyOnWriteArrayList();
    private final List<Object> f6908n = new CopyOnWriteArrayList();
    private final List<Object> f6909o = new CopyOnWriteArrayList();
    private C2051a f6910p;

    public interface C2051a {
    }

    @TargetApi(24)
    static class C2052b extends BroadcastReceiver {
        private static AtomicReference<C2052b> f6893a = new AtomicReference();
        private final Context f6894b;

        private C2052b(Context context) {
            this.f6894b = context;
        }

        static /* synthetic */ void m5585a(Context context) {
            if (f6893a.get() == null) {
                BroadcastReceiver c2052b = new C2052b(context);
                if (f6893a.compareAndSet(null, c2052b)) {
                    context.registerReceiver(c2052b, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public final void onReceive(Context context, Intent intent) {
            synchronized (C2053a.f6901g) {
                for (C2053a a : C2053a.f6895a.values()) {
                    C2053a.m5588a(a);
                }
            }
            this.f6894b.unregisterReceiver(this);
        }
    }

    private C2053a(Context context, String str, C2057b c2057b) {
        this.f6902h = (Context) ac.m4376a((Object) context);
        this.f6903i = ac.m4378a(str);
        this.f6904j = (C2057b) ac.m4376a((Object) c2057b);
        this.f6910p = new mq();
    }

    public static C2053a m5586a(Context context) {
        synchronized (f6901g) {
            if (f6895a.containsKey("[DEFAULT]")) {
                C2053a c = C2053a.m5590c();
                return c;
            }
            ah ahVar = new ah(context);
            Object a = ahVar.m4388a("google_app_id");
            if (TextUtils.isEmpty(a)) {
                C2057b c2057b = null;
            } else {
                C2057b c2057b2 = new C2057b(a, ahVar.m4388a("google_api_key"), ahVar.m4388a("firebase_database_url"), ahVar.m4388a("ga_trackingId"), ahVar.m4388a("gcm_defaultSenderId"), ahVar.m4388a("google_storage_bucket"), ahVar.m4388a("project_id"));
            }
            if (c2057b == null) {
                return null;
            }
            c = C2053a.m5587a(context, c2057b, "[DEFAULT]");
            return c;
        }
    }

    private static C2053a m5587a(Context context, C2057b c2057b, String str) {
        Object c2053a;
        mr.m5010a();
        if (context.getApplicationContext() instanceof Application) {
            al.m4326a((Application) context.getApplicationContext());
            al.m4325a().m4328a(new C5631c());
        }
        str = str.trim();
        if (context.getApplicationContext() != null) {
            Object applicationContext = context.getApplicationContext();
        }
        synchronized (f6901g) {
            boolean containsKey = f6895a.containsKey(str) ^ 1;
            StringBuilder stringBuilder = new StringBuilder(33 + String.valueOf(str).length());
            stringBuilder.append("FirebaseApp name ");
            stringBuilder.append(str);
            stringBuilder.append(" already exists!");
            ac.m4382a(containsKey, stringBuilder.toString());
            ac.m4377a(applicationContext, (Object) "Application context cannot be null.");
            c2053a = new C2053a(applicationContext, str, c2057b);
            f6895a.put(str, c2053a);
        }
        mr.m5011b();
        c2053a.m5589a(C2053a.class, c2053a, f6896b);
        if (c2053a.m5595h()) {
            c2053a.m5589a(C2053a.class, c2053a, f6897c);
            c2053a.m5589a(Context.class, c2053a.m5597a(), f6898d);
        }
        return c2053a;
    }

    static /* synthetic */ void m5588a(C2053a c2053a) {
        c2053a.m5589a(C2053a.class, (Object) c2053a, f6896b);
        if (c2053a.m5595h()) {
            c2053a.m5589a(C2053a.class, (Object) c2053a, f6897c);
            c2053a.m5589a(Context.class, c2053a.f6902h, f6898d);
        }
    }

    private final <T> void m5589a(java.lang.Class<T> r8, T r9, java.lang.Iterable<java.lang.String> r10) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r7 = this;
        r0 = r7.f6902h;
        r0 = android.support.v4.p029a.C0346c.m684a(r0);
        if (r0 == 0) goto L_0x000d;
    L_0x0008:
        r1 = r7.f6902h;
        com.google.firebase.C2053a.C2052b.m5585a(r1);
    L_0x000d:
        r10 = r10.iterator();
    L_0x0011:
        r1 = r10.hasNext();
        if (r1 == 0) goto L_0x00b2;
    L_0x0017:
        r1 = r10.next();
        r1 = (java.lang.String) r1;
        if (r0 == 0) goto L_0x002c;
    L_0x001f:
        r2 = f6899e;	 Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0079, InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0028 }
        r2 = r2.contains(r1);	 Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0079, InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0028 }
        if (r2 == 0) goto L_0x0011;	 Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0079, InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0028 }
    L_0x0027:
        goto L_0x002c;	 Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0079, InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0028 }
    L_0x0028:
        r2 = move-exception;	 Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0079, InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0028 }
        goto L_0x0055;	 Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0079, InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0028 }
    L_0x002a:
        r1 = move-exception;	 Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0079, InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0028 }
        goto L_0x0071;	 Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0079, InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0028 }
    L_0x002c:
        r2 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0079, InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0028 }
        r3 = "getInstance";	 Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0079, InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0028 }
        r4 = 1;	 Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0079, InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0028 }
        r5 = new java.lang.Class[r4];	 Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0079, InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0028 }
        r6 = 0;	 Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0079, InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0028 }
        r5[r6] = r8;	 Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0079, InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0028 }
        r2 = r2.getMethod(r3, r5);	 Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0079, InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0028 }
        r3 = r2.getModifiers();	 Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0079, InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0028 }
        r5 = java.lang.reflect.Modifier.isPublic(r3);	 Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0079, InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0028 }
        if (r5 == 0) goto L_0x0011;	 Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0079, InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0028 }
    L_0x0046:
        r3 = java.lang.reflect.Modifier.isStatic(r3);	 Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0079, InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0028 }
        if (r3 == 0) goto L_0x0011;	 Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0079, InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0028 }
    L_0x004c:
        r3 = 0;	 Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0079, InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0028 }
        r4 = new java.lang.Object[r4];	 Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0079, InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0028 }
        r4[r6] = r9;	 Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0079, InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0028 }
        r2.invoke(r3, r4);	 Catch:{ ClassNotFoundException -> 0x0089, NoSuchMethodException -> 0x0079, InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0028 }
        goto L_0x0011;
    L_0x0055:
        r3 = "FirebaseApp";
        r4 = "Failed to initialize ";
        r1 = java.lang.String.valueOf(r1);
        r5 = r1.length();
        if (r5 == 0) goto L_0x0068;
    L_0x0063:
        r1 = r4.concat(r1);
        goto L_0x006d;
    L_0x0068:
        r1 = new java.lang.String;
        r1.<init>(r4);
    L_0x006d:
        android.util.Log.wtf(r3, r1, r2);
        goto L_0x0011;
    L_0x0071:
        r2 = "FirebaseApp";
        r3 = "Firebase API initialization failure.";
        android.util.Log.wtf(r2, r3, r1);
        goto L_0x0011;
    L_0x0079:
        r8 = new java.lang.IllegalStateException;
        r9 = java.lang.String.valueOf(r1);
        r10 = "#getInstance has been removed by Proguard. Add keep rule to prevent it.";
        r9 = r9.concat(r10);
        r8.<init>(r9);
        throw r8;
    L_0x0089:
        r2 = f6900f;
        r2 = r2.contains(r1);
        if (r2 == 0) goto L_0x00a1;
    L_0x0091:
        r8 = new java.lang.IllegalStateException;
        r9 = java.lang.String.valueOf(r1);
        r10 = " is missing, but is required. Check if it has been removed by Proguard.";
        r9 = r9.concat(r10);
        r8.<init>(r9);
        throw r8;
    L_0x00a1:
        r2 = "FirebaseApp";
        r1 = java.lang.String.valueOf(r1);
        r3 = " is not linked. Skipping initialization.";
        r1 = r1.concat(r3);
        android.util.Log.d(r2, r1);
        goto L_0x0011;
    L_0x00b2:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.a.a(java.lang.Class, java.lang.Object, java.lang.Iterable):void");
    }

    public static C2053a m5590c() {
        C2053a c2053a;
        synchronized (f6901g) {
            c2053a = (C2053a) f6895a.get("[DEFAULT]");
            if (c2053a == null) {
                String a = C1794n.m4536a();
                StringBuilder stringBuilder = new StringBuilder(116 + String.valueOf(a).length());
                stringBuilder.append("Default FirebaseApp is not initialized in this process ");
                stringBuilder.append(a);
                stringBuilder.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        return c2053a;
    }

    public static void m5591d() {
        synchronized (f6901g) {
            ArrayList arrayList = new ArrayList(f6895a.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C2053a c2053a = (C2053a) obj;
                if (c2053a.f6905k.get()) {
                    c2053a.m5596i();
                }
            }
        }
    }

    private String m5593f() {
        m5594g();
        return this.f6903i;
    }

    private final void m5594g() {
        ac.m4382a(this.f6906l.get() ^ 1, (Object) "FirebaseApp was deleted");
    }

    private boolean m5595h() {
        return "[DEFAULT]".equals(m5593f());
    }

    private final void m5596i() {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f6908n.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final Context m5597a() {
        m5594g();
        return this.f6902h;
    }

    public final C2057b m5598b() {
        m5594g();
        return this.f6904j;
    }

    public boolean equals(Object obj) {
        return !(obj instanceof C2053a) ? false : this.f6903i.equals(((C2053a) obj).m5593f());
    }

    public int hashCode() {
        return this.f6903i.hashCode();
    }

    public String toString() {
        return aa.m4373a(this).m4375a("name", this.f6903i).m4375a("options", this.f6904j).toString();
    }
}
