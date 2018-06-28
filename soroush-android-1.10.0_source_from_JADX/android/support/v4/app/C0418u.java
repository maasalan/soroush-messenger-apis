package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build.VERSION;

public final class C0418u {
    public static android.content.Intent m840a(android.app.Activity r4) {
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
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 16;
        if (r0 < r1) goto L_0x000d;
    L_0x0006:
        r0 = r4.getParentActivityIntent();
        if (r0 == 0) goto L_0x000d;
    L_0x000c:
        return r0;
    L_0x000d:
        r0 = android.support.v4.app.C0418u.m842b(r4);
        r1 = 0;
        if (r0 != 0) goto L_0x0015;
    L_0x0014:
        return r1;
    L_0x0015:
        r2 = new android.content.ComponentName;
        r2.<init>(r4, r0);
        r4 = android.support.v4.app.C0418u.m843b(r4, r2);	 Catch:{ NameNotFoundException -> 0x002f }
        if (r4 != 0) goto L_0x0025;	 Catch:{ NameNotFoundException -> 0x002f }
    L_0x0020:
        r4 = android.content.Intent.makeMainActivity(r2);	 Catch:{ NameNotFoundException -> 0x002f }
        return r4;	 Catch:{ NameNotFoundException -> 0x002f }
    L_0x0025:
        r4 = new android.content.Intent;	 Catch:{ NameNotFoundException -> 0x002f }
        r4.<init>();	 Catch:{ NameNotFoundException -> 0x002f }
        r4 = r4.setComponent(r2);	 Catch:{ NameNotFoundException -> 0x002f }
        return r4;
    L_0x002f:
        r4 = "NavUtils";
        r2 = new java.lang.StringBuilder;
        r3 = "getParentActivityIntent: bad parentActivityName '";
        r2.<init>(r3);
        r2.append(r0);
        r0 = "' in manifest";
        r2.append(r0);
        r0 = r2.toString();
        android.util.Log.e(r4, r0);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.u.a(android.app.Activity):android.content.Intent");
    }

    public static Intent m841a(Context context, ComponentName componentName) {
        String b = C0418u.m843b(context, componentName);
        if (b == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), b);
        return C0418u.m843b(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String m842b(Activity activity) {
        try {
            return C0418u.m843b(activity, activity.getComponentName());
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static String m843b(Context context, ComponentName componentName) {
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 128);
        if (VERSION.SDK_INT >= 16) {
            String str = activityInfo.parentActivityName;
            if (str != null) {
                return str;
            }
        }
        if (activityInfo.metaData == null) {
            return null;
        }
        String string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY");
        if (string == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(context.getPackageName());
            stringBuilder.append(string);
            string = stringBuilder.toString();
        }
        return string;
    }
}
