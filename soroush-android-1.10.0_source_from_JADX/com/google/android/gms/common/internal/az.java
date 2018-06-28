package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.p038g.C0482m;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.C1650a.C1645b;
import com.google.android.gms.common.C5462e;
import com.google.android.gms.common.util.C1787g;

public final class az {
    private static final C0482m<String, String> f5393a = new C0482m();

    private static java.lang.String m4437a(android.content.Context r2) {
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
        r0 = r2.getPackageName();
        r1 = com.google.android.gms.internal.dz.m4762a(r2);	 Catch:{ NameNotFoundException -> 0x0011, NameNotFoundException -> 0x0011 }
        r1 = r1.m4761b(r0);	 Catch:{ NameNotFoundException -> 0x0011, NameNotFoundException -> 0x0011 }
        r1 = r1.toString();	 Catch:{ NameNotFoundException -> 0x0011, NameNotFoundException -> 0x0011 }
        return r1;
    L_0x0011:
        r2 = r2.getApplicationInfo();
        r2 = r2.name;
        r1 = android.text.TextUtils.isEmpty(r2);
        if (r1 == 0) goto L_0x001e;
    L_0x001d:
        return r0;
    L_0x001e:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.az.a(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m4438a(android.content.Context r3, int r4) {
        /*
        r0 = r3.getResources();
        r1 = 20;
        if (r4 == r1) goto L_0x0081;
    L_0x0008:
        r1 = 0;
        switch(r4) {
            case 1: goto L_0x007a;
            case 2: goto L_0x0073;
            case 3: goto L_0x006c;
            case 4: goto L_0x006b;
            case 5: goto L_0x005d;
            case 6: goto L_0x006b;
            case 7: goto L_0x004f;
            case 8: goto L_0x004a;
            case 9: goto L_0x0045;
            case 10: goto L_0x0040;
            case 11: goto L_0x003b;
            default: goto L_0x000c;
        };
    L_0x000c:
        switch(r4) {
            case 16: goto L_0x0036;
            case 17: goto L_0x0028;
            case 18: goto L_0x006b;
            default: goto L_0x000f;
        };
    L_0x000f:
        r3 = "GoogleApiAvailability";
        r0 = 33;
        r2 = new java.lang.StringBuilder;
        r2.<init>(r0);
        r0 = "Unexpected error code ";
        r2.append(r0);
        r2.append(r4);
        r4 = r2.toString();
    L_0x0024:
        android.util.Log.e(r3, r4);
        return r1;
    L_0x0028:
        r4 = "GoogleApiAvailability";
        r0 = "The specified account could not be signed in.";
        android.util.Log.e(r4, r0);
        r4 = "common_google_play_services_sign_in_failed_title";
        r3 = m4439a(r3, r4);
        return r3;
    L_0x0036:
        r3 = "GoogleApiAvailability";
        r4 = "One of the API components you attempted to connect to is not available.";
        goto L_0x0024;
    L_0x003b:
        r3 = "GoogleApiAvailability";
        r4 = "The application is not licensed to the user.";
        goto L_0x0024;
    L_0x0040:
        r3 = "GoogleApiAvailability";
        r4 = "Developer error occurred. Please see logs for detailed information";
        goto L_0x0024;
    L_0x0045:
        r3 = "GoogleApiAvailability";
        r4 = "Google Play services is invalid. Cannot recover.";
        goto L_0x0024;
    L_0x004a:
        r3 = "GoogleApiAvailability";
        r4 = "Internal error occurred. Please see logs for detailed information";
        goto L_0x0024;
    L_0x004f:
        r4 = "GoogleApiAvailability";
        r0 = "Network error occurred. Please retry request later.";
        android.util.Log.e(r4, r0);
        r4 = "common_google_play_services_network_error_title";
        r3 = m4439a(r3, r4);
        return r3;
    L_0x005d:
        r4 = "GoogleApiAvailability";
        r0 = "An invalid account was specified when connecting. Please provide a valid account.";
        android.util.Log.e(r4, r0);
        r4 = "common_google_play_services_invalid_account_title";
        r3 = m4439a(r3, r4);
        return r3;
    L_0x006b:
        return r1;
    L_0x006c:
        r3 = com.google.android.gms.C1650a.C1645b.common_google_play_services_enable_title;
        r3 = r0.getString(r3);
        return r3;
    L_0x0073:
        r3 = com.google.android.gms.C1650a.C1645b.common_google_play_services_update_title;
        r3 = r0.getString(r3);
        return r3;
    L_0x007a:
        r3 = com.google.android.gms.C1650a.C1645b.common_google_play_services_install_title;
        r3 = r0.getString(r3);
        return r3;
    L_0x0081:
        r4 = "GoogleApiAvailability";
        r0 = "The current user profile is restricted and could not use authenticated features.";
        android.util.Log.e(r4, r0);
        r4 = "common_google_play_services_restricted_profile_title";
        r3 = m4439a(r3, r4);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.az.a(android.content.Context, int):java.lang.String");
    }

    private static String m4439a(Context context, String str) {
        synchronized (f5393a) {
            String str2 = (String) f5393a.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources b = C5462e.m11800b(context);
            if (b == null) {
                return null;
            }
            int identifier = b.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String str3 = "GoogleApiAvailability";
                String str4 = "Missing resource: ";
                str = String.valueOf(str);
                Log.w(str3, str.length() != 0 ? str4.concat(str) : new String(str4));
                return null;
            }
            Object string = b.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                str3 = "GoogleApiAvailability";
                str4 = "Got empty resource: ";
                str = String.valueOf(str);
                Log.w(str3, str.length() != 0 ? str4.concat(str) : new String(str4));
                return null;
            }
            f5393a.put(str, string);
            return string;
        }
    }

    private static String m4440a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String a = m4439a(context, str);
        if (a == null) {
            a = resources.getString(C1645b.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, a, new Object[]{str2});
    }

    public static String m4441b(Context context, int i) {
        String a = i == 6 ? m4439a(context, "common_google_play_services_resolution_required_title") : m4438a(context, i);
        return a == null ? context.getResources().getString(C1645b.common_google_play_services_notification_ticker) : a;
    }

    public static String m4442c(Context context, int i) {
        Resources resources = context.getResources();
        String a = m4437a(context);
        if (i == 5) {
            return m4440a(context, "common_google_play_services_invalid_account_text", a);
        }
        if (i == 7) {
            return m4440a(context, "common_google_play_services_network_error_text", a);
        }
        if (i == 9) {
            return resources.getString(C1645b.common_google_play_services_unsupported_text, new Object[]{a});
        } else if (i == 20) {
            return m4440a(context, "common_google_play_services_restricted_profile_text", a);
        } else {
            switch (i) {
                case 1:
                    return resources.getString(C1645b.common_google_play_services_install_text, new Object[]{a});
                case 2:
                    if (C1787g.m4524a(context)) {
                        return resources.getString(C1645b.common_google_play_services_wear_update_text);
                    }
                    return resources.getString(C1645b.common_google_play_services_update_text, new Object[]{a});
                case 3:
                    return resources.getString(C1645b.common_google_play_services_enable_text, new Object[]{a});
                default:
                    switch (i) {
                        case 16:
                            return m4440a(context, "common_google_play_services_api_unavailable_text", a);
                        case 17:
                            return m4440a(context, "common_google_play_services_sign_in_failed_text", a);
                        case 18:
                            return resources.getString(C1645b.common_google_play_services_updating_text, new Object[]{a});
                        default:
                            return resources.getString(C1645b.common_google_play_services_unknown_issue, new Object[]{a});
                    }
            }
        }
    }

    public static String m4443d(Context context, int i) {
        return i == 6 ? m4440a(context, "common_google_play_services_resolution_required_text", m4437a(context)) : m4442c(context, i);
    }

    public static String m4444e(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                i = C1645b.common_google_play_services_install_button;
                break;
            case 2:
                i = C1645b.common_google_play_services_update_button;
                break;
            case 3:
                i = C1645b.common_google_play_services_enable_button;
                break;
            default:
                i = 17039370;
                break;
        }
        return resources.getString(i);
    }
}
