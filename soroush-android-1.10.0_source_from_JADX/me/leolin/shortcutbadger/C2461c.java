package me.leolin.shortcutbadger;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import java.util.LinkedList;
import java.util.List;
import me.leolin.shortcutbadger.impl.AdwHomeBadger;
import me.leolin.shortcutbadger.impl.ApexHomeBadger;
import me.leolin.shortcutbadger.impl.C5754a;
import me.leolin.shortcutbadger.impl.C5755b;
import me.leolin.shortcutbadger.impl.C5756c;
import me.leolin.shortcutbadger.impl.C5757d;
import me.leolin.shortcutbadger.impl.C5758e;
import me.leolin.shortcutbadger.impl.C5759f;
import me.leolin.shortcutbadger.impl.C5760g;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import me.leolin.shortcutbadger.impl.NovaHomeBadger;
import me.leolin.shortcutbadger.impl.SonyHomeBadger;

public final class C2461c {
    private static final List<Class<? extends C2459a>> f8145a = new LinkedList();
    private static volatile Boolean f8146b;
    private static final Object f8147c = new Object();
    private static C2459a f8148d;
    private static ComponentName f8149e;

    static {
        f8145a.add(AdwHomeBadger.class);
        f8145a.add(ApexHomeBadger.class);
        f8145a.add(NewHtcHomeBadger.class);
        f8145a.add(NovaHomeBadger.class);
        f8145a.add(SonyHomeBadger.class);
        f8145a.add(C5754a.class);
        f8145a.add(C5756c.class);
        f8145a.add(C5757d.class);
        f8145a.add(C5758e.class);
        f8145a.add(C5760g.class);
        f8145a.add(C5759f.class);
        f8145a.add(C5755b.class);
    }

    public static boolean m6693a(Context context) {
        if (f8146b == null) {
            synchronized (f8147c) {
                if (f8146b == null) {
                    String str = null;
                    int i = 0;
                    while (i < 3) {
                        try {
                            StringBuilder stringBuilder = new StringBuilder("Checking if platform supports badge counters, attempt ");
                            stringBuilder.append(String.format("%d/%d.", new Object[]{Integer.valueOf(i + 1), Integer.valueOf(3)}));
                            Log.i("ShortcutBadger", stringBuilder.toString());
                            if (C2461c.m6695b(context)) {
                                f8148d.mo2135a(context, f8149e, 0);
                                f8146b = Boolean.valueOf(true);
                                Log.i("ShortcutBadger", "Badge counter is supported in this platform.");
                                break;
                            }
                            str = "Failed to initialize the badge counter.";
                            i++;
                        } catch (Exception e) {
                            str = e.getMessage();
                        }
                    }
                    if (f8146b == null) {
                        StringBuilder stringBuilder2 = new StringBuilder("Badge counter seems not supported for this platform: ");
                        stringBuilder2.append(str);
                        Log.w("ShortcutBadger", stringBuilder2.toString());
                        f8146b = Boolean.valueOf(false);
                    }
                }
            }
        }
        return f8146b.booleanValue();
    }

    public static boolean m6694a(Context context, int i) {
        try {
            if (f8148d != null || C2461c.m6695b(context)) {
                f8148d.mo2135a(context, f8149e, i);
                return true;
            }
            throw new C2460b("No default launcher available");
        } catch (Exception e) {
            throw new C2460b("Unable to execute badge", e);
        } catch (Throwable e2) {
            if (Log.isLoggable("ShortcutBadger", 3)) {
                Log.d("ShortcutBadger", "Unable to execute badge", e2);
            }
            return false;
        }
    }

    private static boolean m6695b(android.content.Context r4) {
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
        r0 = r4.getPackageManager();
        r1 = r4.getPackageName();
        r0 = r0.getLaunchIntentForPackage(r1);
        r1 = 0;
        if (r0 != 0) goto L_0x0027;
    L_0x000f:
        r0 = "ShortcutBadger";
        r2 = new java.lang.StringBuilder;
        r3 = "Unable to find launch intent for package ";
        r2.<init>(r3);
        r4 = r4.getPackageName();
        r2.append(r4);
        r4 = r2.toString();
        android.util.Log.e(r0, r4);
        return r1;
    L_0x0027:
        r0 = r0.getComponent();
        f8149e = r0;
        r0 = new android.content.Intent;
        r2 = "android.intent.action.MAIN";
        r0.<init>(r2);
        r2 = "android.intent.category.HOME";
        r0.addCategory(r2);
        r4 = r4.getPackageManager();
        r2 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r4 = r4.resolveActivity(r0, r2);
        if (r4 == 0) goto L_0x00c1;
    L_0x0045:
        r0 = r4.activityInfo;
        r0 = r0.name;
        r0 = r0.toLowerCase();
        r2 = "resolver";
        r0 = r0.contains(r2);
        if (r0 == 0) goto L_0x0056;
    L_0x0055:
        return r1;
    L_0x0056:
        r4 = r4.activityInfo;
        r4 = r4.packageName;
        r0 = f8145a;
        r0 = r0.iterator();
    L_0x0060:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0083;
    L_0x0066:
        r1 = r0.next();
        r1 = (java.lang.Class) r1;
        r2 = 0;
        r1 = r1.newInstance();	 Catch:{ Exception -> 0x0074 }
        r1 = (me.leolin.shortcutbadger.C2459a) r1;	 Catch:{ Exception -> 0x0074 }
        goto L_0x0075;
    L_0x0074:
        r1 = r2;
    L_0x0075:
        if (r1 == 0) goto L_0x0060;
    L_0x0077:
        r2 = r1.mo2134a();
        r2 = r2.contains(r4);
        if (r2 == 0) goto L_0x0060;
    L_0x0081:
        f8148d = r1;
    L_0x0083:
        r4 = f8148d;
        if (r4 != 0) goto L_0x00bf;
    L_0x0087:
        r4 = android.os.Build.MANUFACTURER;
        r0 = "ZUK";
        r4 = r4.equalsIgnoreCase(r0);
        if (r4 == 0) goto L_0x0099;
    L_0x0091:
        r4 = new me.leolin.shortcutbadger.impl.g;
        r4.<init>();
    L_0x0096:
        f8148d = r4;
        goto L_0x00bf;
    L_0x0099:
        r4 = android.os.Build.MANUFACTURER;
        r0 = "OPPO";
        r4 = r4.equalsIgnoreCase(r0);
        if (r4 == 0) goto L_0x00a9;
    L_0x00a3:
        r4 = new me.leolin.shortcutbadger.impl.d;
        r4.<init>();
        goto L_0x0096;
    L_0x00a9:
        r4 = android.os.Build.MANUFACTURER;
        r0 = "VIVO";
        r4 = r4.equalsIgnoreCase(r0);
        if (r4 == 0) goto L_0x00b9;
    L_0x00b3:
        r4 = new me.leolin.shortcutbadger.impl.f;
        r4.<init>();
        goto L_0x0096;
    L_0x00b9:
        r4 = new me.leolin.shortcutbadger.impl.DefaultBadger;
        r4.<init>();
        goto L_0x0096;
    L_0x00bf:
        r4 = 1;
        return r4;
    L_0x00c1:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: me.leolin.shortcutbadger.c.b(android.content.Context):boolean");
    }
}
