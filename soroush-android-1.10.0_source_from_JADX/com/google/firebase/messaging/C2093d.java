package com.google.firebase.messaging;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.os;
import com.google.android.gms.internal.ot;
import com.google.android.gms.measurement.AppMeasurement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public final class C2093d {
    private static Bundle m5710a(ot otVar) {
        return C2093d.m5711a(otVar.f18439a, otVar.f18440b);
    }

    private static Bundle m5711a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    private static com.google.android.gms.internal.ot m5712a(byte[] r2) {
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
        r0 = new com.google.android.gms.internal.ot;	 Catch:{ oh -> 0x000d }
        r0.<init>();	 Catch:{ oh -> 0x000d }
        r1 = r2.length;	 Catch:{ oh -> 0x000d }
        r2 = com.google.android.gms.internal.oi.m5122a(r0, r2, r1);	 Catch:{ oh -> 0x000d }
        r2 = (com.google.android.gms.internal.ot) r2;	 Catch:{ oh -> 0x000d }
        return r2;
    L_0x000d:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.d.a(byte[]):com.google.android.gms.internal.ot");
    }

    private static com.google.android.gms.measurement.AppMeasurement m5713a(android.content.Context r0) {
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
        r0 = com.google.android.gms.measurement.AppMeasurement.getInstance(r0);	 Catch:{ NoClassDefFoundError -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.d.a(android.content.Context):com.google.android.gms.measurement.AppMeasurement");
    }

    private static Object m5714a(ot otVar, String str, C2092c c2092c) {
        Object newInstance;
        Throwable e;
        Object obj = null;
        try {
            Class cls = Class.forName("com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty");
            Bundle a = C2093d.m5710a(otVar);
            newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            try {
                cls.getField("mOrigin").set(newInstance, str);
                cls.getField("mCreationTimestamp").set(newInstance, Long.valueOf(otVar.f18441c));
                cls.getField("mName").set(newInstance, otVar.f18439a);
                cls.getField("mValue").set(newInstance, otVar.f18440b);
                if (!TextUtils.isEmpty(otVar.f18442d)) {
                    obj = otVar.f18442d;
                }
                cls.getField("mTriggerEventName").set(newInstance, obj);
                cls.getField("mTimedOutEventName").set(newInstance, !TextUtils.isEmpty(otVar.f18448j) ? otVar.f18448j : c2092c.f7047c);
                cls.getField("mTimedOutEventParams").set(newInstance, a);
                cls.getField("mTriggerTimeout").set(newInstance, Long.valueOf(otVar.f18443e));
                cls.getField("mTriggeredEventName").set(newInstance, !TextUtils.isEmpty(otVar.f18446h) ? otVar.f18446h : c2092c.f7046b);
                cls.getField("mTriggeredEventParams").set(newInstance, a);
                cls.getField("mTimeToLive").set(newInstance, Long.valueOf(otVar.f18444f));
                cls.getField("mExpiredEventName").set(newInstance, !TextUtils.isEmpty(otVar.f18449k) ? otVar.f18449k : c2092c.f7048d);
                cls.getField("mExpiredEventParams").set(newInstance, a);
                return newInstance;
            } catch (Exception e2) {
                e = e2;
                Log.e("FirebaseAbtUtil", "Could not complete the operation due to an internal error.", e);
                return newInstance;
            }
        } catch (Exception e3) {
            e = e3;
            newInstance = null;
            Log.e("FirebaseAbtUtil", "Could not complete the operation due to an internal error.", e);
            return newInstance;
        }
    }

    private static String m5715a(ot otVar, C2092c c2092c) {
        return (otVar == null || TextUtils.isEmpty(otVar.f18447i)) ? c2092c.f7049e : otVar.f18447i;
    }

    private static String m5716a(Object obj) {
        return (String) Class.forName("com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty").getField("mName").get(obj);
    }

    private static List<Object> m5717a(AppMeasurement appMeasurement, String str) {
        List<Object> list;
        ArrayList arrayList = new ArrayList();
        try {
            Method declaredMethod = AppMeasurement.class.getDeclaredMethod("getConditionalUserProperties", new Class[]{String.class, String.class});
            declaredMethod.setAccessible(true);
            list = (List) declaredMethod.invoke(appMeasurement, new Object[]{str, ""});
        } catch (Throwable e) {
            Log.e("FirebaseAbtUtil", "Could not complete the operation due to an internal error.", e);
            list = arrayList;
        }
        if (Log.isLoggable("FirebaseAbtUtil", 2)) {
            int size = list.size();
            StringBuilder stringBuilder = new StringBuilder(55 + String.valueOf(str).length());
            stringBuilder.append("Number of currently set _Es for origin: ");
            stringBuilder.append(str);
            stringBuilder.append(" is ");
            stringBuilder.append(size);
            Log.v("FirebaseAbtUtil", stringBuilder.toString());
        }
        return list;
    }

    private static void m5718a(Context context, String str, String str2, String str3, String str4) {
        if (Log.isLoggable("FirebaseAbtUtil", 2)) {
            String str5 = "FirebaseAbtUtil";
            String str6 = "_CE(experimentId) called by ";
            str = String.valueOf(str);
            Log.v(str5, str.length() != 0 ? str6.concat(str) : new String(str6));
        }
        if (C2093d.m5723b(context)) {
            AppMeasurement a = C2093d.m5713a(context);
            try {
                Method declaredMethod = AppMeasurement.class.getDeclaredMethod("clearConditionalUserProperty", new Class[]{String.class, String.class, Bundle.class});
                declaredMethod.setAccessible(true);
                if (Log.isLoggable("FirebaseAbtUtil", 2)) {
                    StringBuilder stringBuilder = new StringBuilder((17 + String.valueOf(str2).length()) + String.valueOf(str3).length());
                    stringBuilder.append("Clearing _E: [");
                    stringBuilder.append(str2);
                    stringBuilder.append(", ");
                    stringBuilder.append(str3);
                    stringBuilder.append("]");
                    Log.v("FirebaseAbtUtil", stringBuilder.toString());
                }
                declaredMethod.invoke(a, new Object[]{str2, str4, C2093d.m5711a(str2, str3)});
            } catch (Throwable e) {
                Log.e("FirebaseAbtUtil", "Could not complete the operation due to an internal error.", e);
            }
        }
    }

    public static void m5719a(Context context, String str, byte[] bArr, C2092c c2092c) {
        Context context2 = context;
        String str2 = str;
        C2092c c2092c2 = c2092c;
        int i = 2;
        if (Log.isLoggable("FirebaseAbtUtil", 2)) {
            String str3 = "FirebaseAbtUtil";
            String str4 = "_SE called by ";
            String valueOf = String.valueOf(str);
            Log.v(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
        }
        if (C2093d.m5723b(context)) {
            AppMeasurement a = C2093d.m5713a(context);
            ot a2 = C2093d.m5712a(bArr);
            if (a2 == null) {
                if (Log.isLoggable("FirebaseAbtUtil", 2)) {
                    Log.v("FirebaseAbtUtil", "_SE failed; either _P was not set, or we couldn't deserialize the _P.");
                }
                return;
            }
            try {
                Class.forName("com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty");
                Object obj = null;
                for (Object next : C2093d.m5717a(a, str2)) {
                    String a3 = C2093d.m5716a(next);
                    String b = C2093d.m5722b(next);
                    long longValue = ((Long) Class.forName("com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty").getField("mCreationTimestamp").get(next)).longValue();
                    if (a2.f18439a.equals(a3) && a2.f18440b.equals(b)) {
                        if (Log.isLoggable("FirebaseAbtUtil", i)) {
                            StringBuilder stringBuilder = new StringBuilder((23 + String.valueOf(a3).length()) + String.valueOf(b).length());
                            stringBuilder.append("_E is already set. [");
                            stringBuilder.append(a3);
                            stringBuilder.append(", ");
                            stringBuilder.append(b);
                            stringBuilder.append("]");
                            Log.v("FirebaseAbtUtil", stringBuilder.toString());
                        }
                        obj = 1;
                    } else {
                        StringBuilder stringBuilder2;
                        Object obj2;
                        os[] osVarArr = a2.f18451m;
                        int length = osVarArr.length;
                        int i2 = 0;
                        while (i2 < length) {
                            if (osVarArr[i2].f18438a.equals(a3)) {
                                if (Log.isLoggable("FirebaseAbtUtil", 2)) {
                                    stringBuilder2 = new StringBuilder((33 + String.valueOf(a3).length()) + String.valueOf(b).length());
                                    stringBuilder2.append("_E is found in the _OE list. [");
                                    stringBuilder2.append(a3);
                                    stringBuilder2.append(", ");
                                    stringBuilder2.append(b);
                                    stringBuilder2.append("]");
                                    Log.v("FirebaseAbtUtil", stringBuilder2.toString());
                                }
                                obj2 = 1;
                                if (obj2 == null) {
                                    if (a2.f18441c > longValue) {
                                        if (Log.isLoggable("FirebaseAbtUtil", 2)) {
                                            stringBuilder2 = new StringBuilder((115 + String.valueOf(a3).length()) + String.valueOf(b).length());
                                            stringBuilder2.append("Clearing _E as it was not in the _OE list, andits start time is older than the start time of the _E to be set. [");
                                            stringBuilder2.append(a3);
                                            stringBuilder2.append(", ");
                                            stringBuilder2.append(b);
                                            stringBuilder2.append("]");
                                            Log.v("FirebaseAbtUtil", stringBuilder2.toString());
                                        }
                                        C2093d.m5718a(context2, str2, a3, b, C2093d.m5715a(a2, c2092c2));
                                    } else if (Log.isLoggable("FirebaseAbtUtil", 2)) {
                                        stringBuilder2 = new StringBuilder((109 + String.valueOf(a3).length()) + String.valueOf(b).length());
                                        stringBuilder2.append("_E was not found in the _OE list, but not clearing it as it has a new start time than the _E to be set.  [");
                                        stringBuilder2.append(a3);
                                        stringBuilder2.append(", ");
                                        stringBuilder2.append(b);
                                        stringBuilder2.append("]");
                                        Log.v("FirebaseAbtUtil", stringBuilder2.toString());
                                    }
                                }
                                i = 2;
                            } else {
                                i2++;
                            }
                        }
                        obj2 = null;
                        if (obj2 == null) {
                            if (a2.f18441c > longValue) {
                                if (Log.isLoggable("FirebaseAbtUtil", 2)) {
                                    stringBuilder2 = new StringBuilder((115 + String.valueOf(a3).length()) + String.valueOf(b).length());
                                    stringBuilder2.append("Clearing _E as it was not in the _OE list, andits start time is older than the start time of the _E to be set. [");
                                    stringBuilder2.append(a3);
                                    stringBuilder2.append(", ");
                                    stringBuilder2.append(b);
                                    stringBuilder2.append("]");
                                    Log.v("FirebaseAbtUtil", stringBuilder2.toString());
                                }
                                C2093d.m5718a(context2, str2, a3, b, C2093d.m5715a(a2, c2092c2));
                            } else if (Log.isLoggable("FirebaseAbtUtil", 2)) {
                                stringBuilder2 = new StringBuilder((109 + String.valueOf(a3).length()) + String.valueOf(b).length());
                                stringBuilder2.append("_E was not found in the _OE list, but not clearing it as it has a new start time than the _E to be set.  [");
                                stringBuilder2.append(a3);
                                stringBuilder2.append(", ");
                                stringBuilder2.append(b);
                                stringBuilder2.append("]");
                                Log.v("FirebaseAbtUtil", stringBuilder2.toString());
                            }
                        }
                        i = 2;
                    }
                }
                if (obj != null) {
                    if (Log.isLoggable("FirebaseAbtUtil", 2)) {
                        str2 = a2.f18439a;
                        String str5 = a2.f18440b;
                        StringBuilder stringBuilder3 = new StringBuilder((44 + String.valueOf(str2).length()) + String.valueOf(str5).length());
                        stringBuilder3.append("_E is already set. Not setting it again [");
                        stringBuilder3.append(str2);
                        stringBuilder3.append(", ");
                        stringBuilder3.append(str5);
                        stringBuilder3.append("]");
                        Log.v("FirebaseAbtUtil", stringBuilder3.toString());
                    }
                    return;
                }
                C2093d.m5720a(a, context2, str2, a2, c2092c2);
            } catch (Throwable e) {
                Log.e("FirebaseAbtUtil", "Could not complete the operation due to an internal error.", e);
            }
        }
    }

    private static void m5720a(AppMeasurement appMeasurement, Context context, String str, ot otVar, C2092c c2092c) {
        if (Log.isLoggable("FirebaseAbtUtil", 2)) {
            String str2 = otVar.f18439a;
            String str3 = otVar.f18440b;
            StringBuilder stringBuilder = new StringBuilder((7 + String.valueOf(str2).length()) + String.valueOf(str3).length());
            stringBuilder.append("_SEI: ");
            stringBuilder.append(str2);
            stringBuilder.append(" ");
            stringBuilder.append(str3);
            Log.v("FirebaseAbtUtil", stringBuilder.toString());
        }
        try {
            Object obj;
            StringBuilder stringBuilder2;
            String str4;
            StringBuilder stringBuilder3;
            Class.forName("com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty");
            List a = C2093d.m5717a(appMeasurement, str);
            if (C2093d.m5717a(appMeasurement, str).size() >= C2093d.m5721b(appMeasurement, str)) {
                if ((otVar.f18450l != 0 ? otVar.f18450l : 1) == 1) {
                    obj = a.get(0);
                    str3 = C2093d.m5716a(obj);
                    str2 = C2093d.m5722b(obj);
                    if (Log.isLoggable("FirebaseAbtUtil", 2)) {
                        stringBuilder2 = new StringBuilder(38 + String.valueOf(str3).length());
                        stringBuilder2.append("Clearing _E due to overflow policy: [");
                        stringBuilder2.append(str3);
                        stringBuilder2.append("]");
                        Log.v("FirebaseAbtUtil", stringBuilder2.toString());
                    }
                    C2093d.m5718a(context, str, str3, str2, C2093d.m5715a(otVar, c2092c));
                } else {
                    if (Log.isLoggable("FirebaseAbtUtil", 2)) {
                        str4 = otVar.f18439a;
                        str = otVar.f18440b;
                        stringBuilder3 = new StringBuilder((44 + String.valueOf(str4).length()) + String.valueOf(str).length());
                        stringBuilder3.append("_E won't be set due to overflow policy. [");
                        stringBuilder3.append(str4);
                        stringBuilder3.append(", ");
                        stringBuilder3.append(str);
                        stringBuilder3.append("]");
                        Log.v("FirebaseAbtUtil", stringBuilder3.toString());
                    }
                    return;
                }
            }
            for (Object obj2 : a) {
                str3 = C2093d.m5716a(obj2);
                str2 = C2093d.m5722b(obj2);
                if (str3.equals(otVar.f18439a) && !str2.equals(otVar.f18440b) && Log.isLoggable("FirebaseAbtUtil", 2)) {
                    stringBuilder2 = new StringBuilder((77 + String.valueOf(str3).length()) + String.valueOf(str2).length());
                    stringBuilder2.append("Clearing _E, as only one _V of the same _E can be set atany given time: [");
                    stringBuilder2.append(str3);
                    stringBuilder2.append(", ");
                    stringBuilder2.append(str2);
                    stringBuilder2.append("].");
                    Log.v("FirebaseAbtUtil", stringBuilder2.toString());
                    C2093d.m5718a(context, str, str3, str2, C2093d.m5715a(otVar, c2092c));
                }
            }
            if (C2093d.m5714a(otVar, str, c2092c) == null) {
                if (Log.isLoggable("FirebaseAbtUtil", 2)) {
                    str4 = otVar.f18439a;
                    str = otVar.f18440b;
                    stringBuilder3 = new StringBuilder((42 + String.valueOf(str4).length()) + String.valueOf(str).length());
                    stringBuilder3.append("Could not create _CUP for: [");
                    stringBuilder3.append(str4);
                    stringBuilder3.append(", ");
                    stringBuilder3.append(str);
                    stringBuilder3.append("]. Skipping.");
                    Log.v("FirebaseAbtUtil", stringBuilder3.toString());
                }
                return;
            }
            if (Log.isLoggable("FirebaseAbtUtil", 2)) {
                String str5 = otVar.f18439a;
                str2 = otVar.f18440b;
                str3 = otVar.f18442d;
                StringBuilder stringBuilder4 = new StringBuilder(((27 + String.valueOf(str5).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length());
                stringBuilder4.append("Setting _CUP for _E: [");
                stringBuilder4.append(str5);
                stringBuilder4.append(", ");
                stringBuilder4.append(str2);
                stringBuilder4.append(", ");
                stringBuilder4.append(str3);
                stringBuilder4.append("]");
                Log.v("FirebaseAbtUtil", stringBuilder4.toString());
            }
            try {
                Method declaredMethod = AppMeasurement.class.getDeclaredMethod("setConditionalUserProperty", new Class[]{Class.forName("com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty")});
                declaredMethod.setAccessible(true);
                appMeasurement.logEventInternal(str, !TextUtils.isEmpty(otVar.f18445g) ? otVar.f18445g : c2092c.f7045a, C2093d.m5710a(otVar));
                declaredMethod.invoke(appMeasurement, new Object[]{r10});
            } catch (Throwable e) {
                Log.e("FirebaseAbtUtil", "Could not complete the operation due to an internal error.", e);
            }
        } catch (Throwable e2) {
            Log.e("FirebaseAbtUtil", "Could not complete the operation due to an internal error.", e2);
        }
    }

    private static int m5721b(AppMeasurement appMeasurement, String str) {
        try {
            Method declaredMethod = AppMeasurement.class.getDeclaredMethod("getMaxUserProperties", new Class[]{String.class});
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(appMeasurement, new Object[]{str})).intValue();
        } catch (Throwable e) {
            Log.e("FirebaseAbtUtil", "Could not complete the operation due to an internal error.", e);
            return 20;
        }
    }

    private static String m5722b(Object obj) {
        return (String) Class.forName("com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty").getField("mValue").get(obj);
    }

    private static boolean m5723b(android.content.Context r2) {
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
        r2 = com.google.firebase.messaging.C2093d.m5713a(r2);
        r0 = 0;
        r1 = 2;
        if (r2 != 0) goto L_0x0018;
    L_0x0008:
        r2 = "FirebaseAbtUtil";
        r2 = android.util.Log.isLoggable(r2, r1);
        if (r2 == 0) goto L_0x0017;
    L_0x0010:
        r2 = "FirebaseAbtUtil";
        r1 = "Firebase Analytics not available";
        android.util.Log.v(r2, r1);
    L_0x0017:
        return r0;
    L_0x0018:
        r2 = "com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty";	 Catch:{ ClassNotFoundException -> 0x001f }
        java.lang.Class.forName(r2);	 Catch:{ ClassNotFoundException -> 0x001f }
        r2 = 1;
        return r2;
    L_0x001f:
        r2 = "FirebaseAbtUtil";
        r2 = android.util.Log.isLoggable(r2, r1);
        if (r2 == 0) goto L_0x002e;
    L_0x0027:
        r2 = "FirebaseAbtUtil";
        r1 = "Firebase Analytics library is missing support for abt. Please update to a more recent version.";
        android.util.Log.v(r2, r1);
    L_0x002e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.d.b(android.content.Context):boolean");
    }
}
