package me.leolin.shortcutbadger.impl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import me.leolin.shortcutbadger.C2459a;

public class C5757d implements C2459a {
    private static int f15861a = -1;

    private static java.lang.Class m12920a(java.lang.String r0) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: me.leolin.shortcutbadger.impl.d.a(java.lang.String):java.lang.Class");
    }

    private static Object m12921a(Class cls, String str) {
        if (!(cls == null || C5757d.m12922a((Object) str))) {
            Method b = C5757d.m12925b(cls, str);
            if (b != null) {
                b.setAccessible(true);
                try {
                    return b.invoke(null, null);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e2) {
                    e2.printStackTrace();
                }
            }
        }
        return null;
    }

    private static boolean m12922a(Object obj) {
        if (!(obj == null || obj.toString().equals(""))) {
            if (!obj.toString().trim().equals("null")) {
                return false;
            }
        }
        return true;
    }

    private int m12923b() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = f15861a;
        if (r0 < 0) goto L_0x0007;
    L_0x0004:
        r0 = f15861a;
        return r0;
    L_0x0007:
        r0 = "com.color.os.ColorBuild";	 Catch:{ Exception -> 0x001a }
        r0 = me.leolin.shortcutbadger.impl.C5757d.m12920a(r0);	 Catch:{ Exception -> 0x001a }
        r1 = "getColorOSVERSION";	 Catch:{ Exception -> 0x001a }
        r0 = me.leolin.shortcutbadger.impl.C5757d.m12921a(r0, r1);	 Catch:{ Exception -> 0x001a }
        r0 = (java.lang.Integer) r0;	 Catch:{ Exception -> 0x001a }
        r0 = r0.intValue();	 Catch:{ Exception -> 0x001a }
        goto L_0x001b;
    L_0x001a:
        r0 = 0;
    L_0x001b:
        if (r0 != 0) goto L_0x0041;
    L_0x001d:
        r1 = "ro.build.version.opporom";	 Catch:{ Exception -> 0x0041 }
        r1 = me.leolin.shortcutbadger.impl.C5757d.m12924b(r1);	 Catch:{ Exception -> 0x0041 }
        r2 = "V1.4";	 Catch:{ Exception -> 0x0041 }
        r2 = r1.startsWith(r2);	 Catch:{ Exception -> 0x0041 }
        if (r2 == 0) goto L_0x002d;	 Catch:{ Exception -> 0x0041 }
    L_0x002b:
        r0 = 3;	 Catch:{ Exception -> 0x0041 }
        return r0;	 Catch:{ Exception -> 0x0041 }
    L_0x002d:
        r2 = "V2.0";	 Catch:{ Exception -> 0x0041 }
        r2 = r1.startsWith(r2);	 Catch:{ Exception -> 0x0041 }
        if (r2 == 0) goto L_0x0037;	 Catch:{ Exception -> 0x0041 }
    L_0x0035:
        r0 = 4;	 Catch:{ Exception -> 0x0041 }
        return r0;	 Catch:{ Exception -> 0x0041 }
    L_0x0037:
        r2 = "V2.1";	 Catch:{ Exception -> 0x0041 }
        r1 = r1.startsWith(r2);	 Catch:{ Exception -> 0x0041 }
        if (r1 == 0) goto L_0x0041;
    L_0x003f:
        r0 = 5;
        return r0;
    L_0x0041:
        f15861a = r0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: me.leolin.shortcutbadger.impl.d.b():int");
    }

    private static java.lang.String m12924b(java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        r1 = java.lang.Runtime.getRuntime();	 Catch:{ IOException -> 0x003a, all -> 0x0035 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x003a, all -> 0x0035 }
        r3 = "getprop ";	 Catch:{ IOException -> 0x003a, all -> 0x0035 }
        r2.<init>(r3);	 Catch:{ IOException -> 0x003a, all -> 0x0035 }
        r2.append(r4);	 Catch:{ IOException -> 0x003a, all -> 0x0035 }
        r4 = r2.toString();	 Catch:{ IOException -> 0x003a, all -> 0x0035 }
        r4 = r1.exec(r4);	 Catch:{ IOException -> 0x003a, all -> 0x0035 }
        r1 = new java.io.BufferedReader;	 Catch:{ IOException -> 0x003a, all -> 0x0035 }
        r2 = new java.io.InputStreamReader;	 Catch:{ IOException -> 0x003a, all -> 0x0035 }
        r4 = r4.getInputStream();	 Catch:{ IOException -> 0x003a, all -> 0x0035 }
        r2.<init>(r4);	 Catch:{ IOException -> 0x003a, all -> 0x0035 }
        r4 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;	 Catch:{ IOException -> 0x003a, all -> 0x0035 }
        r1.<init>(r2, r4);	 Catch:{ IOException -> 0x003a, all -> 0x0035 }
        r4 = r1.readLine();	 Catch:{ IOException -> 0x003b, all -> 0x0032 }
        r1.close();	 Catch:{ IOException -> 0x003b, all -> 0x0032 }
        me.leolin.shortcutbadger.p230a.C2458b.m6690a(r1);
        return r4;
    L_0x0032:
        r4 = move-exception;
        r0 = r1;
        goto L_0x0036;
    L_0x0035:
        r4 = move-exception;
    L_0x0036:
        me.leolin.shortcutbadger.p230a.C2458b.m6690a(r0);
        throw r4;
    L_0x003a:
        r1 = r0;
    L_0x003b:
        me.leolin.shortcutbadger.p230a.C2458b.m6690a(r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: me.leolin.shortcutbadger.impl.d.b(java.lang.String):java.lang.String");
    }

    private static java.lang.reflect.Method m12925b(java.lang.Class r2, java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
    L_0x0000:
        r0 = 0;
        if (r2 == 0) goto L_0x0025;
    L_0x0003:
        r1 = me.leolin.shortcutbadger.impl.C5757d.m12922a(r3);
        if (r1 == 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r2.getMethods();	 Catch:{ Exception -> 0x0015 }
        r2.getDeclaredMethods();	 Catch:{ Exception -> 0x0015 }
        r1 = r2.getDeclaredMethod(r3, r0);	 Catch:{ Exception -> 0x0015 }
        return r1;
    L_0x0015:
        r1 = r2.getMethod(r3, r0);	 Catch:{ Exception -> 0x001a }
        return r1;
    L_0x001a:
        r1 = r2.getSuperclass();
        if (r1 == 0) goto L_0x0025;
    L_0x0020:
        r2 = r2.getSuperclass();
        goto L_0x0000;
    L_0x0025:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: me.leolin.shortcutbadger.impl.d.b(java.lang.Class, java.lang.String):java.lang.reflect.Method");
    }

    public final List<String> mo2134a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    @android.annotation.TargetApi(11)
    public final void mo2135a(android.content.Context r4, android.content.ComponentName r5, int r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        if (r6 != 0) goto L_0x0003;
    L_0x0002:
        r6 = -1;
    L_0x0003:
        r0 = new android.content.Intent;
        r1 = "com.oppo.unsettledevent";
        r0.<init>(r1);
        r1 = "pakeageName";
        r5 = r5.getPackageName();
        r0.putExtra(r1, r5);
        r5 = "number";
        r0.putExtra(r5, r6);
        r5 = "upgradeNumber";
        r0.putExtra(r5, r6);
        r5 = me.leolin.shortcutbadger.p230a.C2457a.m6688a(r4, r0);
        if (r5 == 0) goto L_0x0027;
    L_0x0023:
        r4.sendBroadcast(r0);
        return;
    L_0x0027:
        r5 = r3.m12923b();
        r1 = 6;
        if (r5 != r1) goto L_0x0061;
    L_0x002e:
        r5 = new android.os.Bundle;	 Catch:{ Throwable -> 0x0049 }
        r5.<init>();	 Catch:{ Throwable -> 0x0049 }
        r1 = "app_badge_count";	 Catch:{ Throwable -> 0x0049 }
        r5.putInt(r1, r6);	 Catch:{ Throwable -> 0x0049 }
        r4 = r4.getContentResolver();	 Catch:{ Throwable -> 0x0049 }
        r6 = "content://com.android.badge/badge";	 Catch:{ Throwable -> 0x0049 }
        r6 = android.net.Uri.parse(r6);	 Catch:{ Throwable -> 0x0049 }
        r1 = "setAppBadgeCount";	 Catch:{ Throwable -> 0x0049 }
        r2 = 0;	 Catch:{ Throwable -> 0x0049 }
        r4.call(r6, r1, r2, r5);	 Catch:{ Throwable -> 0x0049 }
        return;
    L_0x0049:
        r4 = new me.leolin.shortcutbadger.b;
        r5 = new java.lang.StringBuilder;
        r6 = "unable to resolve intent: ";
        r5.<init>(r6);
        r6 = r0.toString();
        r5.append(r6);
        r5 = r5.toString();
        r4.<init>(r5);
        throw r4;
    L_0x0061:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: me.leolin.shortcutbadger.impl.d.a(android.content.Context, android.content.ComponentName, int):void");
    }
}
