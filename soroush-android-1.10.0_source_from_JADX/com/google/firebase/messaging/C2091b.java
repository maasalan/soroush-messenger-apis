package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.app.C0425x.C0421d;
import android.support.v4.app.C0425x.C4791c;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.C1650a.C1645b;
import com.google.android.gms.common.util.C1793m;
import com.google.firebase.iid.C2066b;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C2091b {
    private static C2091b f7039a;
    private final Context f7040b;
    private Bundle f7041c;
    private Method f7042d;
    private Method f7043e;
    private final AtomicInteger f7044f = new AtomicInteger((int) SystemClock.elapsedRealtime());

    private C2091b(Context context) {
        this.f7040b = context.getApplicationContext();
    }

    @TargetApi(26)
    private final Notification m5694a(CharSequence charSequence, String str, int i, Integer num, Uri uri, PendingIntent pendingIntent, PendingIntent pendingIntent2, String str2) {
        Builder smallIcon = new Builder(this.f7040b).setAutoCancel(true).setSmallIcon(i);
        if (!TextUtils.isEmpty(charSequence)) {
            smallIcon.setContentTitle(charSequence);
        }
        if (!TextUtils.isEmpty(str)) {
            smallIcon.setContentText(str);
            smallIcon.setStyle(new BigTextStyle().bigText(str));
        }
        if (num != null) {
            smallIcon.setColor(num.intValue());
        }
        if (uri != null) {
            smallIcon.setSound(uri);
        }
        if (pendingIntent != null) {
            smallIcon.setContentIntent(pendingIntent);
        }
        if (pendingIntent2 != null) {
            smallIcon.setDeleteIntent(pendingIntent2);
        }
        if (str2 != null) {
            if (this.f7042d == null) {
                this.f7042d = C2091b.m5698a("setChannelId");
            }
            if (this.f7042d == null) {
                this.f7042d = C2091b.m5698a("setChannel");
            }
            if (this.f7042d == null) {
                Log.e("FirebaseMessaging", "Error while setting the notification channel");
            } else {
                try {
                    this.f7042d.invoke(smallIcon, new Object[]{str2});
                } catch (Throwable e) {
                    Log.e("FirebaseMessaging", "Error while setting the notification channel", e);
                }
            }
        }
        return smallIcon.build();
    }

    private final android.os.Bundle m5695a() {
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
        r4 = this;
        r0 = r4.f7041c;
        if (r0 == 0) goto L_0x0007;
    L_0x0004:
        r0 = r4.f7041c;
        return r0;
    L_0x0007:
        r0 = 0;
        r1 = r4.f7040b;	 Catch:{ NameNotFoundException -> 0x001b }
        r1 = r1.getPackageManager();	 Catch:{ NameNotFoundException -> 0x001b }
        r2 = r4.f7040b;	 Catch:{ NameNotFoundException -> 0x001b }
        r2 = r2.getPackageName();	 Catch:{ NameNotFoundException -> 0x001b }
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ NameNotFoundException -> 0x001b }
        r1 = r1.getApplicationInfo(r2, r3);	 Catch:{ NameNotFoundException -> 0x001b }
        r0 = r1;
    L_0x001b:
        if (r0 == 0) goto L_0x0028;
    L_0x001d:
        r1 = r0.metaData;
        if (r1 == 0) goto L_0x0028;
    L_0x0021:
        r0 = r0.metaData;
        r4.f7041c = r0;
        r0 = r4.f7041c;
        return r0;
    L_0x0028:
        r0 = android.os.Bundle.EMPTY;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.b.a():android.os.Bundle");
    }

    static synchronized C2091b m5696a(Context context) {
        C2091b c2091b;
        synchronized (C2091b.class) {
            if (f7039a == null) {
                f7039a = new C2091b(context);
            }
            c2091b = f7039a;
        }
        return c2091b;
    }

    static String m5697a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    @android.annotation.TargetApi(26)
    private static java.lang.reflect.Method m5698a(java.lang.String r4) {
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
        r0 = android.app.Notification.Builder.class;	 Catch:{ NoSuchMethodException -> 0x000f, NoSuchMethodException -> 0x000f }
        r1 = 1;	 Catch:{ NoSuchMethodException -> 0x000f, NoSuchMethodException -> 0x000f }
        r1 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x000f, NoSuchMethodException -> 0x000f }
        r2 = 0;	 Catch:{ NoSuchMethodException -> 0x000f, NoSuchMethodException -> 0x000f }
        r3 = java.lang.String.class;	 Catch:{ NoSuchMethodException -> 0x000f, NoSuchMethodException -> 0x000f }
        r1[r2] = r3;	 Catch:{ NoSuchMethodException -> 0x000f, NoSuchMethodException -> 0x000f }
        r4 = r0.getMethod(r4, r1);	 Catch:{ NoSuchMethodException -> 0x000f, NoSuchMethodException -> 0x000f }
        return r4;
    L_0x000f:
        r4 = 0;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.b.a(java.lang.String):java.lang.reflect.Method");
    }

    private static void m5699a(Intent intent, Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (str.startsWith("google.c.a.") || str.equals(PrivacyItem.SUBSCRIPTION_FROM)) {
                intent.putExtra(str, bundle.getString(str));
            }
        }
    }

    public static boolean m5700a(Bundle bundle) {
        if (!"1".equals(C2091b.m5697a(bundle, "gcm.n.e"))) {
            if (C2091b.m5697a(bundle, "gcm.n.icon") == null) {
                return false;
            }
        }
        return true;
    }

    static Uri m5701b(Bundle bundle) {
        Object a = C2091b.m5697a(bundle, "gcm.n.link_android");
        if (TextUtils.isEmpty(a)) {
            a = C2091b.m5697a(bundle, "gcm.n.link");
        }
        return !TextUtils.isEmpty(a) ? Uri.parse(a) : null;
    }

    private final java.lang.Integer m5702b(java.lang.String r5) {
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
        r4 = this;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 0;
        r2 = 21;
        if (r0 >= r2) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = android.text.TextUtils.isEmpty(r5);
        if (r0 != 0) goto L_0x003d;
    L_0x000e:
        r0 = android.graphics.Color.parseColor(r5);	 Catch:{ IllegalArgumentException -> 0x0017 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ IllegalArgumentException -> 0x0017 }
        return r0;
    L_0x0017:
        r0 = "FirebaseMessaging";
        r2 = 54;
        r3 = java.lang.String.valueOf(r5);
        r3 = r3.length();
        r2 = r2 + r3;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "Color ";
        r3.append(r2);
        r3.append(r5);
        r5 = " not valid. Notification will use default color.";
        r3.append(r5);
        r5 = r3.toString();
        android.util.Log.w(r0, r5);
    L_0x003d:
        r5 = r4.m5695a();
        r0 = "com.google.firebase.messaging.default_notification_color";
        r2 = 0;
        r5 = r5.getInt(r0, r2);
        if (r5 == 0) goto L_0x005c;
    L_0x004a:
        r0 = r4.f7040b;	 Catch:{ NotFoundException -> 0x0055 }
        r5 = android.support.v4.p029a.C0346c.m687c(r0, r5);	 Catch:{ NotFoundException -> 0x0055 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ NotFoundException -> 0x0055 }
        return r5;
    L_0x0055:
        r5 = "FirebaseMessaging";
        r0 = "Cannot find the color resource referenced in AndroidManifest.";
        android.util.Log.w(r5, r0);
    L_0x005c:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.b.b(java.lang.String):java.lang.Integer");
    }

    static String m5703b(Bundle bundle, String str) {
        str = String.valueOf(str);
        String valueOf = String.valueOf("_loc_key");
        return C2091b.m5697a(bundle, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    @TargetApi(26)
    private final String m5704c(String str) {
        if (!C1793m.m4535d()) {
            return null;
        }
        NotificationManager notificationManager = (NotificationManager) this.f7040b.getSystemService(NotificationManager.class);
        try {
            String str2;
            if (this.f7043e == null) {
                this.f7043e = notificationManager.getClass().getMethod("getNotificationChannel", new Class[]{String.class});
            }
            if (!TextUtils.isEmpty(str)) {
                if (this.f7043e.invoke(notificationManager, new Object[]{str}) != null) {
                    return str;
                }
                StringBuilder stringBuilder = new StringBuilder(IjkMediaMeta.FF_PROFILE_H264_HIGH_422 + String.valueOf(str).length());
                stringBuilder.append("Notification Channel requested (");
                stringBuilder.append(str);
                stringBuilder.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                Log.w("FirebaseMessaging", stringBuilder.toString());
            }
            Object string = m5695a().getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string)) {
                str = "FirebaseMessaging";
                str2 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
            } else {
                if (this.f7043e.invoke(notificationManager, new Object[]{string}) != null) {
                    return string;
                }
                str = "FirebaseMessaging";
                str2 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
            }
            Log.w(str, str2);
            if (this.f7043e.invoke(notificationManager, new Object[]{"fcm_fallback_notification_channel"}) == null) {
                Object newInstance = Class.forName("android.app.NotificationChannel").getConstructor(new Class[]{String.class, CharSequence.class, Integer.TYPE}).newInstance(new Object[]{"fcm_fallback_notification_channel", this.f7040b.getString(C1645b.fcm_fallback_notification_channel_label), Integer.valueOf(3)});
                notificationManager.getClass().getMethod("createNotificationChannel", new Class[]{r11}).invoke(notificationManager, new Object[]{newInstance});
            }
            return "fcm_fallback_notification_channel";
        } catch (Throwable e) {
            Log.e("FirebaseMessaging", "Error while setting the notification channel", e);
            return null;
        }
    }

    static java.lang.Object[] m5705c(android.os.Bundle r5, java.lang.String r6) {
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
        r0 = java.lang.String.valueOf(r6);
        r1 = "_loc_args";
        r1 = java.lang.String.valueOf(r1);
        r2 = r1.length();
        if (r2 == 0) goto L_0x0015;
    L_0x0010:
        r0 = r0.concat(r1);
        goto L_0x001b;
    L_0x0015:
        r1 = new java.lang.String;
        r1.<init>(r0);
        r0 = r1;
    L_0x001b:
        r5 = com.google.firebase.messaging.C2091b.m5697a(r5, r0);
        r0 = android.text.TextUtils.isEmpty(r5);
        r1 = 0;
        if (r0 == 0) goto L_0x0027;
    L_0x0026:
        return r1;
    L_0x0027:
        r0 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x0040 }
        r0.<init>(r5);	 Catch:{ JSONException -> 0x0040 }
        r2 = r0.length();	 Catch:{ JSONException -> 0x0040 }
        r2 = new java.lang.String[r2];	 Catch:{ JSONException -> 0x0040 }
        r3 = 0;	 Catch:{ JSONException -> 0x0040 }
    L_0x0033:
        r4 = r2.length;	 Catch:{ JSONException -> 0x0040 }
        if (r3 >= r4) goto L_0x003f;	 Catch:{ JSONException -> 0x0040 }
    L_0x0036:
        r4 = r0.opt(r3);	 Catch:{ JSONException -> 0x0040 }
        r2[r3] = r4;	 Catch:{ JSONException -> 0x0040 }
        r3 = r3 + 1;
        goto L_0x0033;
    L_0x003f:
        return r2;
    L_0x0040:
        r0 = "FirebaseMessaging";
        r6 = java.lang.String.valueOf(r6);
        r2 = "_loc_args";
        r2 = java.lang.String.valueOf(r2);
        r3 = r2.length();
        if (r3 == 0) goto L_0x0057;
    L_0x0052:
        r6 = r6.concat(r2);
        goto L_0x005d;
    L_0x0057:
        r2 = new java.lang.String;
        r2.<init>(r6);
        r6 = r2;
    L_0x005d:
        r2 = 6;
        r6 = r6.substring(r2);
        r2 = 41;
        r3 = java.lang.String.valueOf(r6);
        r3 = r3.length();
        r2 = r2 + r3;
        r3 = java.lang.String.valueOf(r5);
        r3 = r3.length();
        r2 = r2 + r3;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "Malformed ";
        r3.append(r2);
        r3.append(r6);
        r6 = ": ";
        r3.append(r6);
        r3.append(r5);
        r5 = "  Default value will be used.";
        r3.append(r5);
        r5 = r3.toString();
        android.util.Log.w(r0, r5);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.b.c(android.os.Bundle, java.lang.String):java.lang.Object[]");
    }

    static String m5706d(Bundle bundle) {
        Object a = C2091b.m5697a(bundle, "gcm.n.sound2");
        return TextUtils.isEmpty(a) ? C2091b.m5697a(bundle, "gcm.n.sound") : a;
    }

    private final String m5707d(Bundle bundle, String str) {
        Object a = C2091b.m5697a(bundle, str);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        String b = C2091b.m5703b(bundle, str);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        Resources resources = this.f7040b.getResources();
        int identifier = resources.getIdentifier(b, "string", this.f7040b.getPackageName());
        if (identifier == 0) {
            String str2 = "FirebaseMessaging";
            str = String.valueOf(str);
            String valueOf = String.valueOf("_loc_key");
            str = (valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).substring(6);
            StringBuilder stringBuilder = new StringBuilder((49 + String.valueOf(str).length()) + String.valueOf(b).length());
            stringBuilder.append(str);
            stringBuilder.append(" resource not found: ");
            stringBuilder.append(b);
            stringBuilder.append(" Default value will be used.");
            Log.w(str2, stringBuilder.toString());
            return null;
        }
        Object[] c = C2091b.m5705c(bundle, str);
        if (c == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, c);
        } catch (Throwable e) {
            str2 = Arrays.toString(c);
            StringBuilder stringBuilder2 = new StringBuilder((58 + String.valueOf(b).length()) + String.valueOf(str2).length());
            stringBuilder2.append("Missing format argument for ");
            stringBuilder2.append(b);
            stringBuilder2.append(": ");
            stringBuilder2.append(str2);
            stringBuilder2.append(" Default value will be used.");
            Log.w("FirebaseMessaging", stringBuilder2.toString(), e);
            return null;
        }
    }

    private final PendingIntent m5708e(Bundle bundle) {
        Intent intent;
        Object a = C2091b.m5697a(bundle, "gcm.n.click_action");
        if (TextUtils.isEmpty(a)) {
            Uri b = C2091b.m5701b(bundle);
            if (b != null) {
                intent = new Intent("android.intent.action.VIEW");
                intent.setPackage(this.f7040b.getPackageName());
                intent.setData(b);
            } else {
                intent = this.f7040b.getPackageManager().getLaunchIntentForPackage(this.f7040b.getPackageName());
                if (intent == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            }
        } else {
            intent = new Intent(a);
            intent.setPackage(this.f7040b.getPackageName());
            intent.setFlags(268435456);
        }
        if (intent == null) {
            return null;
        }
        intent.addFlags(67108864);
        Bundle bundle2 = new Bundle(bundle);
        FirebaseMessagingService.m12387a(bundle2);
        intent.putExtras(bundle2);
        for (String str : bundle2.keySet()) {
            if (str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                intent.removeExtra(str);
            }
        }
        return PendingIntent.getActivity(this.f7040b, this.f7044f.incrementAndGet(), intent, 1073741824);
    }

    final boolean m5709c(Bundle bundle) {
        if ("1".equals(C2091b.m5697a(bundle, "gcm.n.noui"))) {
            return true;
        }
        int myPid;
        boolean z;
        CharSequence d;
        CharSequence charSequence;
        CharSequence d2;
        String a;
        Resources resources;
        int identifier;
        int identifier2;
        Integer b;
        PendingIntent pendingIntent;
        Uri uri;
        Parcelable e;
        Intent intent;
        Parcelable parcelable;
        PendingIntent pendingIntent2;
        C0421d c0421d;
        Notification a2;
        String a3;
        NotificationManager notificationManager;
        long uptimeMillis;
        StringBuilder stringBuilder;
        if (!((KeyguardManager) this.f7040b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (!C1793m.m4534c()) {
                SystemClock.sleep(10);
            }
            myPid = Process.myPid();
            List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f7040b.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == myPid) {
                        if (runningAppProcessInfo.importance == 100) {
                            z = true;
                            if (z) {
                                return false;
                            }
                            d = m5707d(bundle, "gcm.n.title");
                            if (TextUtils.isEmpty(d)) {
                                d = this.f7040b.getApplicationInfo().loadLabel(this.f7040b.getPackageManager());
                            }
                            charSequence = d;
                            d2 = m5707d(bundle, "gcm.n.body");
                            a = C2091b.m5697a(bundle, "gcm.n.icon");
                            if (!TextUtils.isEmpty(a)) {
                                resources = this.f7040b.getResources();
                                identifier = resources.getIdentifier(a, "drawable", this.f7040b.getPackageName());
                                if (identifier != 0) {
                                    identifier2 = resources.getIdentifier(a, "mipmap", this.f7040b.getPackageName());
                                    if (identifier2 == 0) {
                                        identifier = identifier2;
                                    } else {
                                        StringBuilder stringBuilder2 = new StringBuilder(61 + String.valueOf(a).length());
                                        stringBuilder2.append("Icon resource ");
                                        stringBuilder2.append(a);
                                        stringBuilder2.append(" not found. Notification will use default icon.");
                                        Log.w("FirebaseMessaging", stringBuilder2.toString());
                                    }
                                }
                                b = m5702b(C2091b.m5697a(bundle, "gcm.n.color"));
                                a = C2091b.m5706d(bundle);
                                pendingIntent = null;
                                if (TextUtils.isEmpty(a)) {
                                    uri = null;
                                } else if (!"default".equals(a) || this.f7040b.getResources().getIdentifier(a, "raw", this.f7040b.getPackageName()) == 0) {
                                    uri = RingtoneManager.getDefaultUri(2);
                                } else {
                                    String str = "android.resource://";
                                    String packageName = this.f7040b.getPackageName();
                                    StringBuilder stringBuilder3 = new StringBuilder(((5 + String.valueOf(str).length()) + String.valueOf(packageName).length()) + String.valueOf(a).length());
                                    stringBuilder3.append(str);
                                    stringBuilder3.append(packageName);
                                    stringBuilder3.append("/raw/");
                                    stringBuilder3.append(a);
                                    uri = Uri.parse(stringBuilder3.toString());
                                }
                                e = m5708e(bundle);
                                if (FirebaseMessagingService.m12388b(bundle)) {
                                    intent = new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN");
                                    C2091b.m5699a(intent, bundle);
                                    intent.putExtra("pending_intent", e);
                                    e = C2066b.m5635a(this.f7040b, this.f7044f.incrementAndGet(), intent);
                                    intent = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS");
                                    C2091b.m5699a(intent, bundle);
                                    pendingIntent = C2066b.m5635a(this.f7040b, this.f7044f.incrementAndGet(), intent);
                                }
                                parcelable = e;
                                pendingIntent2 = pendingIntent;
                                if (C1793m.m4535d() || this.f7040b.getApplicationInfo().targetSdkVersion <= 25) {
                                    c0421d = new C0421d(this.f7040b, (byte) 0);
                                    c0421d.m856b(16);
                                    c0421d = c0421d.m849a(identifier);
                                    if (!TextUtils.isEmpty(charSequence)) {
                                        c0421d.m853a(charSequence);
                                    }
                                    if (!TextUtils.isEmpty(d2)) {
                                        c0421d.m855b(d2);
                                        c0421d.m852a(new C4791c().m9140c(d2));
                                    }
                                    if (b != null) {
                                        c0421d.f1492B = b.intValue();
                                    }
                                    if (uri != null) {
                                        c0421d.m851a(uri);
                                    }
                                    if (parcelable != null) {
                                        c0421d.f1508d = parcelable;
                                    }
                                    if (pendingIntent2 != null) {
                                        c0421d.f1503M.deleteIntent = pendingIntent2;
                                    }
                                    a2 = c0421d.m848a();
                                } else {
                                    a2 = m5694a(charSequence, d2, identifier, b, uri, parcelable, pendingIntent2, m5704c(C2091b.m5697a(bundle, "gcm.n.android_channel_id")));
                                }
                                a3 = C2091b.m5697a(bundle, "gcm.n.tag");
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    Log.d("FirebaseMessaging", "Showing notification");
                                }
                                notificationManager = (NotificationManager) this.f7040b.getSystemService("notification");
                                if (TextUtils.isEmpty(a3)) {
                                    uptimeMillis = SystemClock.uptimeMillis();
                                    stringBuilder = new StringBuilder(37);
                                    stringBuilder.append("FCM-Notification:");
                                    stringBuilder.append(uptimeMillis);
                                    a3 = stringBuilder.toString();
                                }
                                notificationManager.notify(a3, 0, a2);
                                return true;
                            }
                            myPid = m5695a().getInt("com.google.firebase.messaging.default_notification_icon", 0);
                            if (myPid == 0) {
                                myPid = this.f7040b.getApplicationInfo().icon;
                            }
                            if (myPid == 0) {
                                myPid = 17301651;
                            }
                            identifier = myPid;
                            b = m5702b(C2091b.m5697a(bundle, "gcm.n.color"));
                            a = C2091b.m5706d(bundle);
                            pendingIntent = null;
                            if (TextUtils.isEmpty(a)) {
                                uri = null;
                            } else {
                                if ("default".equals(a)) {
                                }
                                uri = RingtoneManager.getDefaultUri(2);
                            }
                            e = m5708e(bundle);
                            if (FirebaseMessagingService.m12388b(bundle)) {
                                intent = new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN");
                                C2091b.m5699a(intent, bundle);
                                intent.putExtra("pending_intent", e);
                                e = C2066b.m5635a(this.f7040b, this.f7044f.incrementAndGet(), intent);
                                intent = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS");
                                C2091b.m5699a(intent, bundle);
                                pendingIntent = C2066b.m5635a(this.f7040b, this.f7044f.incrementAndGet(), intent);
                            }
                            parcelable = e;
                            pendingIntent2 = pendingIntent;
                            if (C1793m.m4535d()) {
                            }
                            c0421d = new C0421d(this.f7040b, (byte) 0);
                            c0421d.m856b(16);
                            c0421d = c0421d.m849a(identifier);
                            if (TextUtils.isEmpty(charSequence)) {
                                c0421d.m853a(charSequence);
                            }
                            if (TextUtils.isEmpty(d2)) {
                                c0421d.m855b(d2);
                                c0421d.m852a(new C4791c().m9140c(d2));
                            }
                            if (b != null) {
                                c0421d.f1492B = b.intValue();
                            }
                            if (uri != null) {
                                c0421d.m851a(uri);
                            }
                            if (parcelable != null) {
                                c0421d.f1508d = parcelable;
                            }
                            if (pendingIntent2 != null) {
                                c0421d.f1503M.deleteIntent = pendingIntent2;
                            }
                            a2 = c0421d.m848a();
                            a3 = C2091b.m5697a(bundle, "gcm.n.tag");
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Showing notification");
                            }
                            notificationManager = (NotificationManager) this.f7040b.getSystemService("notification");
                            if (TextUtils.isEmpty(a3)) {
                                uptimeMillis = SystemClock.uptimeMillis();
                                stringBuilder = new StringBuilder(37);
                                stringBuilder.append("FCM-Notification:");
                                stringBuilder.append(uptimeMillis);
                                a3 = stringBuilder.toString();
                            }
                            notificationManager.notify(a3, 0, a2);
                            return true;
                        }
                    }
                }
            }
        }
        z = false;
        if (z) {
            return false;
        }
        d = m5707d(bundle, "gcm.n.title");
        if (TextUtils.isEmpty(d)) {
            d = this.f7040b.getApplicationInfo().loadLabel(this.f7040b.getPackageManager());
        }
        charSequence = d;
        d2 = m5707d(bundle, "gcm.n.body");
        a = C2091b.m5697a(bundle, "gcm.n.icon");
        if (TextUtils.isEmpty(a)) {
            resources = this.f7040b.getResources();
            identifier = resources.getIdentifier(a, "drawable", this.f7040b.getPackageName());
            if (identifier != 0) {
                identifier2 = resources.getIdentifier(a, "mipmap", this.f7040b.getPackageName());
                if (identifier2 == 0) {
                    StringBuilder stringBuilder22 = new StringBuilder(61 + String.valueOf(a).length());
                    stringBuilder22.append("Icon resource ");
                    stringBuilder22.append(a);
                    stringBuilder22.append(" not found. Notification will use default icon.");
                    Log.w("FirebaseMessaging", stringBuilder22.toString());
                } else {
                    identifier = identifier2;
                }
            }
            b = m5702b(C2091b.m5697a(bundle, "gcm.n.color"));
            a = C2091b.m5706d(bundle);
            pendingIntent = null;
            if (TextUtils.isEmpty(a)) {
                uri = null;
            } else {
                if ("default".equals(a)) {
                }
                uri = RingtoneManager.getDefaultUri(2);
            }
            e = m5708e(bundle);
            if (FirebaseMessagingService.m12388b(bundle)) {
                intent = new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN");
                C2091b.m5699a(intent, bundle);
                intent.putExtra("pending_intent", e);
                e = C2066b.m5635a(this.f7040b, this.f7044f.incrementAndGet(), intent);
                intent = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS");
                C2091b.m5699a(intent, bundle);
                pendingIntent = C2066b.m5635a(this.f7040b, this.f7044f.incrementAndGet(), intent);
            }
            parcelable = e;
            pendingIntent2 = pendingIntent;
            if (C1793m.m4535d()) {
            }
            c0421d = new C0421d(this.f7040b, (byte) 0);
            c0421d.m856b(16);
            c0421d = c0421d.m849a(identifier);
            if (TextUtils.isEmpty(charSequence)) {
                c0421d.m853a(charSequence);
            }
            if (TextUtils.isEmpty(d2)) {
                c0421d.m855b(d2);
                c0421d.m852a(new C4791c().m9140c(d2));
            }
            if (b != null) {
                c0421d.f1492B = b.intValue();
            }
            if (uri != null) {
                c0421d.m851a(uri);
            }
            if (parcelable != null) {
                c0421d.f1508d = parcelable;
            }
            if (pendingIntent2 != null) {
                c0421d.f1503M.deleteIntent = pendingIntent2;
            }
            a2 = c0421d.m848a();
            a3 = C2091b.m5697a(bundle, "gcm.n.tag");
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Showing notification");
            }
            notificationManager = (NotificationManager) this.f7040b.getSystemService("notification");
            if (TextUtils.isEmpty(a3)) {
                uptimeMillis = SystemClock.uptimeMillis();
                stringBuilder = new StringBuilder(37);
                stringBuilder.append("FCM-Notification:");
                stringBuilder.append(uptimeMillis);
                a3 = stringBuilder.toString();
            }
            notificationManager.notify(a3, 0, a2);
            return true;
        }
        myPid = m5695a().getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (myPid == 0) {
            myPid = this.f7040b.getApplicationInfo().icon;
        }
        if (myPid == 0) {
            myPid = 17301651;
        }
        identifier = myPid;
        b = m5702b(C2091b.m5697a(bundle, "gcm.n.color"));
        a = C2091b.m5706d(bundle);
        pendingIntent = null;
        if (TextUtils.isEmpty(a)) {
            if ("default".equals(a)) {
            }
            uri = RingtoneManager.getDefaultUri(2);
        } else {
            uri = null;
        }
        e = m5708e(bundle);
        if (FirebaseMessagingService.m12388b(bundle)) {
            intent = new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN");
            C2091b.m5699a(intent, bundle);
            intent.putExtra("pending_intent", e);
            e = C2066b.m5635a(this.f7040b, this.f7044f.incrementAndGet(), intent);
            intent = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS");
            C2091b.m5699a(intent, bundle);
            pendingIntent = C2066b.m5635a(this.f7040b, this.f7044f.incrementAndGet(), intent);
        }
        parcelable = e;
        pendingIntent2 = pendingIntent;
        if (C1793m.m4535d()) {
        }
        c0421d = new C0421d(this.f7040b, (byte) 0);
        c0421d.m856b(16);
        c0421d = c0421d.m849a(identifier);
        if (TextUtils.isEmpty(charSequence)) {
            c0421d.m853a(charSequence);
        }
        if (TextUtils.isEmpty(d2)) {
            c0421d.m855b(d2);
            c0421d.m852a(new C4791c().m9140c(d2));
        }
        if (b != null) {
            c0421d.f1492B = b.intValue();
        }
        if (uri != null) {
            c0421d.m851a(uri);
        }
        if (parcelable != null) {
            c0421d.f1508d = parcelable;
        }
        if (pendingIntent2 != null) {
            c0421d.f1503M.deleteIntent = pendingIntent2;
        }
        a2 = c0421d.m848a();
        a3 = C2091b.m5697a(bundle, "gcm.n.tag");
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        notificationManager = (NotificationManager) this.f7040b.getSystemService("notification");
        if (TextUtils.isEmpty(a3)) {
            uptimeMillis = SystemClock.uptimeMillis();
            stringBuilder = new StringBuilder(37);
            stringBuilder.append("FCM-Notification:");
            stringBuilder.append(uptimeMillis);
            a3 = stringBuilder.toString();
        }
        notificationManager.notify(a3, 0, a2);
        return true;
    }
}
