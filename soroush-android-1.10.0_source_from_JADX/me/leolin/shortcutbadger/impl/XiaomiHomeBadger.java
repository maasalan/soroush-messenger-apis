package me.leolin.shortcutbadger.impl;

import android.content.pm.ResolveInfo;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.C2459a;

@Deprecated
public class XiaomiHomeBadger implements C2459a {
    private ResolveInfo f15860a;

    public final List<String> mo2134a() {
        return Arrays.asList(new String[]{"com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2", "com.i.miui.launcher"});
    }

    public final void mo2135a(android.content.Context r8, android.content.ComponentName r9, int r10) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r0 = 1;
        r1 = "android.app.MiuiNotification";	 Catch:{ Exception -> 0x0031 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ Exception -> 0x0031 }
        r1 = r1.newInstance();	 Catch:{ Exception -> 0x0031 }
        r2 = r1.getClass();	 Catch:{ Exception -> 0x0031 }
        r3 = "messageCount";	 Catch:{ Exception -> 0x0031 }
        r2 = r2.getDeclaredField(r3);	 Catch:{ Exception -> 0x0031 }
        r2.setAccessible(r0);	 Catch:{ Exception -> 0x0031 }
        if (r10 != 0) goto L_0x001d;
    L_0x001a:
        r3 = "";	 Catch:{ Exception -> 0x0029 }
        goto L_0x0021;	 Catch:{ Exception -> 0x0029 }
    L_0x001d:
        r3 = java.lang.Integer.valueOf(r10);	 Catch:{ Exception -> 0x0029 }
    L_0x0021:
        r3 = java.lang.String.valueOf(r3);	 Catch:{ Exception -> 0x0029 }
        r2.set(r1, r3);	 Catch:{ Exception -> 0x0029 }
        goto L_0x0074;
    L_0x0029:
        r3 = java.lang.Integer.valueOf(r10);	 Catch:{ Exception -> 0x0031 }
        r2.set(r1, r3);	 Catch:{ Exception -> 0x0031 }
        goto L_0x0074;
    L_0x0031:
        r1 = new android.content.Intent;
        r2 = "android.intent.action.APPLICATION_MESSAGE_UPDATE";
        r1.<init>(r2);
        r2 = "android.intent.extra.update_application_component_name";
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = r9.getPackageName();
        r3.append(r4);
        r4 = "/";
        r3.append(r4);
        r9 = r9.getClassName();
        r3.append(r9);
        r9 = r3.toString();
        r1.putExtra(r2, r9);
        r9 = "android.intent.extra.update_application_message_text";
        if (r10 != 0) goto L_0x0060;
    L_0x005d:
        r2 = "";
        goto L_0x0064;
    L_0x0060:
        r2 = java.lang.Integer.valueOf(r10);
    L_0x0064:
        r2 = java.lang.String.valueOf(r2);
        r1.putExtra(r9, r2);
        r9 = me.leolin.shortcutbadger.p230a.C2457a.m6688a(r8, r1);
        if (r9 == 0) goto L_0x0074;
    L_0x0071:
        r8.sendBroadcast(r1);
    L_0x0074:
        r9 = android.os.Build.MANUFACTURER;
        r1 = "Xiaomi";
        r9 = r9.equalsIgnoreCase(r1);
        if (r9 == 0) goto L_0x00fc;
    L_0x007e:
        r9 = r7.f15860a;
        if (r9 != 0) goto L_0x009a;
    L_0x0082:
        r9 = new android.content.Intent;
        r1 = "android.intent.action.MAIN";
        r9.<init>(r1);
        r1 = "android.intent.category.HOME";
        r9.addCategory(r1);
        r1 = r8.getPackageManager();
        r2 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r9 = r1.resolveActivity(r9, r2);
        r7.f15860a = r9;
    L_0x009a:
        r9 = r7.f15860a;
        if (r9 == 0) goto L_0x00fc;
    L_0x009e:
        r9 = "notification";
        r9 = r8.getSystemService(r9);
        r9 = (android.app.NotificationManager) r9;
        r1 = new android.app.Notification$Builder;
        r1.<init>(r8);
        r8 = "";
        r8 = r1.setContentTitle(r8);
        r1 = "";
        r8 = r8.setContentText(r1);
        r1 = r7.f15860a;
        r1 = r1.getIconResource();
        r8 = r8.setSmallIcon(r1);
        r8 = r8.build();
        r1 = r8.getClass();	 Catch:{ Exception -> 0x00f3 }
        r2 = "extraNotification";	 Catch:{ Exception -> 0x00f3 }
        r1 = r1.getDeclaredField(r2);	 Catch:{ Exception -> 0x00f3 }
        r1 = r1.get(r8);	 Catch:{ Exception -> 0x00f3 }
        r2 = r1.getClass();	 Catch:{ Exception -> 0x00f3 }
        r3 = "setMessageCount";	 Catch:{ Exception -> 0x00f3 }
        r4 = new java.lang.Class[r0];	 Catch:{ Exception -> 0x00f3 }
        r5 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x00f3 }
        r6 = 0;	 Catch:{ Exception -> 0x00f3 }
        r4[r6] = r5;	 Catch:{ Exception -> 0x00f3 }
        r2 = r2.getDeclaredMethod(r3, r4);	 Catch:{ Exception -> 0x00f3 }
        r0 = new java.lang.Object[r0];	 Catch:{ Exception -> 0x00f3 }
        r10 = java.lang.Integer.valueOf(r10);	 Catch:{ Exception -> 0x00f3 }
        r0[r6] = r10;	 Catch:{ Exception -> 0x00f3 }
        r2.invoke(r1, r0);	 Catch:{ Exception -> 0x00f3 }
        r9.notify(r6, r8);	 Catch:{ Exception -> 0x00f3 }
        return;
    L_0x00f3:
        r8 = move-exception;
        r9 = new me.leolin.shortcutbadger.b;
        r10 = "not able to set badge";
        r9.<init>(r10, r8);
        throw r9;
    L_0x00fc:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: me.leolin.shortcutbadger.impl.XiaomiHomeBadger.a(android.content.Context, android.content.ComponentName, int):void");
    }
}
