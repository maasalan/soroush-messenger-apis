package mobi.mmdt.ott.logic.player.music;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import mobi.mmdt.ott.MyApplication;

public class MusicPlayerNotificationService extends Service {
    private Notification f9015a;

    private static void m7238a() {
        if (MyApplication.m12950a().f15890E) {
            if (MyApplication.m12950a().f15893H > 0) {
                C2886b.m7241a(null).m7245b();
                return;
            }
            C2886b.m7241a(null).m7242a();
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r7, int r8, int r9) {
        /*
        r6 = this;
        r7 = r7.getAction();
        r8 = r7.hashCode();
        r9 = 2;
        r0 = 1;
        r1 = 0;
        switch(r8) {
            case -273900860: goto L_0x0037;
            case 94705844: goto L_0x002d;
            case 94771445: goto L_0x0023;
            case 94777332: goto L_0x0019;
            case 1567483718: goto L_0x000f;
            default: goto L_0x000e;
        };
    L_0x000e:
        goto L_0x0041;
    L_0x000f:
        r8 = "com.marothiatechs.customnotification.action.stopforeground";
        r7 = r7.equals(r8);
        if (r7 == 0) goto L_0x0041;
    L_0x0017:
        r7 = 4;
        goto L_0x0042;
    L_0x0019:
        r8 = "com.marothiatechs.customnotification.action.prev";
        r7 = r7.equals(r8);
        if (r7 == 0) goto L_0x0041;
    L_0x0021:
        r7 = r0;
        goto L_0x0042;
    L_0x0023:
        r8 = "com.marothiatechs.customnotification.action.play";
        r7 = r7.equals(r8);
        if (r7 == 0) goto L_0x0041;
    L_0x002b:
        r7 = r9;
        goto L_0x0042;
    L_0x002d:
        r8 = "com.marothiatechs.customnotification.action.next";
        r7 = r7.equals(r8);
        if (r7 == 0) goto L_0x0041;
    L_0x0035:
        r7 = 3;
        goto L_0x0042;
    L_0x0037:
        r8 = "com.marothiatechs.customnotification.action.startforeground";
        r7 = r7.equals(r8);
        if (r7 == 0) goto L_0x0041;
    L_0x003f:
        r7 = r1;
        goto L_0x0042;
    L_0x0041:
        r7 = -1;
    L_0x0042:
        switch(r7) {
            case 0: goto L_0x0073;
            case 1: goto L_0x006d;
            case 2: goto L_0x0067;
            case 3: goto L_0x005b;
            case 4: goto L_0x0046;
            default: goto L_0x0045;
        };
    L_0x0045:
        return r0;
    L_0x0046:
        r7 = "Received Stop Foreground Intent";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6740d(r7);
        r7 = "Service Stoped";
        r7 = android.widget.Toast.makeText(r6, r7, r1);
        r7.show();
        r6.stopForeground(r0);
        r6.stopSelf();
        return r0;
    L_0x005b:
        r7 = "Clicked Next";
        r7 = android.widget.Toast.makeText(r6, r7, r1);
        r7.show();
        r7 = "Clicked Next";
        goto L_0x006f;
    L_0x0067:
        m7238a();
        r7 = "Clicked Play";
        goto L_0x006f;
    L_0x006d:
        r7 = "Clicked Previous";
    L_0x006f:
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6740d(r7);
        return r0;
    L_0x0073:
        r7 = new android.widget.RemoteViews;
        r8 = r6.getPackageName();
        r2 = 2131427839; // 0x7f0b01ff float:1.8477306E38 double:1.053065272E-314;
        r7.<init>(r8, r2);
        mobi.mmdt.ott.logic.player.music.C2883a.m7240a(r6);
        r8 = new android.content.Intent;
        r2 = mobi.mmdt.ott.view.newdesign.mainpage.MainActivity.class;
        r8.<init>(r6, r2);
        r2 = "com.marothiatechs.customnotification.action.main";
        r8.setAction(r2);
        r2 = 268468224; // 0x10008000 float:2.5342157E-29 double:1.326409265E-315;
        r8.setFlags(r2);
        r8 = android.app.PendingIntent.getActivity(r6, r1, r8, r1);
        r2 = new android.content.Intent;
        r3 = mobi.mmdt.ott.logic.player.music.MusicPlayerNotificationService.class;
        r2.<init>(r6, r3);
        r3 = "com.marothiatechs.customnotification.action.prev";
        r2.setAction(r3);
        r2 = android.app.PendingIntent.getService(r6, r1, r2, r1);
        r3 = new android.content.Intent;
        r4 = mobi.mmdt.ott.logic.player.music.MusicPlayerNotificationService.class;
        r3.<init>(r6, r4);
        r4 = "com.marothiatechs.customnotification.action.play";
        r3.setAction(r4);
        r3 = android.app.PendingIntent.getService(r6, r1, r3, r1);
        r4 = new android.content.Intent;
        r5 = mobi.mmdt.ott.logic.player.music.MusicPlayerNotificationService.class;
        r4.<init>(r6, r5);
        r5 = "com.marothiatechs.customnotification.action.next";
        r4.setAction(r5);
        r1 = android.app.PendingIntent.getService(r6, r1, r4, r1);
        r4 = new android.content.Intent;
        r5 = mobi.mmdt.ott.logic.player.music.MusicPlayerNotificationService.class;
        r4.<init>(r6, r5);
        r5 = "com.marothiatechs.customnotification.action.stopforeground";
        r4.setAction(r5);
        r4 = 2131296520; // 0x7f090108 float:1.821096E38 double:1.0530003916E-314;
        r7.setOnClickPendingIntent(r4, r3);
        r3 = 2131296518; // 0x7f090106 float:1.8210955E38 double:1.0530003906E-314;
        r7.setOnClickPendingIntent(r3, r1);
        r1 = 2131296521; // 0x7f090109 float:1.8210961E38 double:1.053000392E-314;
        r7.setOnClickPendingIntent(r1, r2);
        r1 = 2131297348; // 0x7f090444 float:1.8212638E38 double:1.0530008007E-314;
        r2 = "Song Title Song TitleSong TitleSong TitleSong TitleSong TitleSong TitleSong TitleSong TitleSong TitleSong TitleSong TitleSong TitleSong TitleSong TitleSong Title";
        r7.setTextViewText(r1, r2);
        r1 = 2131296688; // 0x7f0901b0 float:1.82113E38 double:1.0530004746E-314;
        r2 = "Artist Name Song TitleSong TitleSong TitleSong TitleSong TitleSong TitleSong Title";
        r7.setTextViewText(r1, r2);
        r1 = new android.app.Notification$Builder;
        r1.<init>(r6);
        r1 = r1.build();
        r6.f9015a = r1;
        r1 = r6.f9015a;
        r1.contentView = r7;
        r7 = r6.f9015a;
        r7.flags = r9;
        r7 = r6.f9015a;
        r9 = 2131232224; // 0x7f0805e0 float:1.8080551E38 double:1.052968625E-314;
        r7.icon = r9;
        r7 = r6.f9015a;
        r7.contentIntent = r8;
        r7 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r8 = r6.f9015a;
        r6.startForeground(r7, r8);
        m7238a();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.player.music.MusicPlayerNotificationService.onStartCommand(android.content.Intent, int, int):int");
    }
}
