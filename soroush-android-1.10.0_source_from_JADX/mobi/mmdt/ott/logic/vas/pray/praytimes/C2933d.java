package mobi.mmdt.ott.logic.vas.pray.praytimes;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.vas.pray.p376a.C2919b;
import mobi.mmdt.ott.logic.vas.pray.p376a.C2920c;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class C2933d {
    private static WeakReference<C2933d> f9138d;
    public C2935e f9139a;
    public Map<C2920c, C2931b> f9140b;
    private Context f9141c;

    private C2933d(Context context) {
        this.f9141c = context;
    }

    public static String m7312a(C2931b c2931b) {
        int i = c2931b.f9133a;
        int i2 = c2931b.f9134b;
        return String.format(Locale.ENGLISH, "%d:%02d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
    }

    public static C2933d m7313a() {
        if (f9138d == null || f9138d.get() == null) {
            f9138d = new WeakReference(new C2933d(MyApplication.m12952b()));
        }
        return (C2933d) f9138d.get();
    }

    private void m7314a(C2920c c2920c, C2931b c2931b, int i) {
        Calendar instance = Calendar.getInstance();
        instance.set(11, c2931b.f9133a);
        instance.set(12, c2931b.f9134b);
        long al = (long) ((C2535a.m6888a().al() * 60) * IjkMediaCodecInfo.RANK_MAX);
        AlarmManager alarmManager = (AlarmManager) this.f9141c.getSystemService("alarm");
        if (System.currentTimeMillis() < instance.getTimeInMillis() + al) {
            Intent intent = new Intent(this.f9141c, PrayNotificationBroadcastReceivers.class);
            intent.setAction("mobi.mmdt.ott.BROADCAST_PRAY_ALARM");
            intent.putExtra("KEY_EXTRA_PRAYER_INDEX", c2920c.ordinal());
            PendingIntent broadcast = PendingIntent.getBroadcast(this.f9141c, i, intent, 0);
            alarmManager.cancel(broadcast);
            if (C2535a.m6888a().aj().booleanValue()) {
                StringBuilder stringBuilder = new StringBuilder("pray time setting alarm for: ");
                stringBuilder.append(instance.getTimeInMillis());
                stringBuilder.append(al);
                C2480b.m6736b(stringBuilder.toString());
                if (VERSION.SDK_INT >= 19) {
                    alarmManager.setExact(0, instance.getTimeInMillis() + al, broadcast);
                    return;
                }
                alarmManager.set(0, instance.getTimeInMillis() + al, broadcast);
            }
        }
    }

    public static void m7315a(boolean z) {
        PendingIntent service = PendingIntent.getService(MyApplication.m12952b(), 1000002, new Intent(MyApplication.m12952b(), SetAlarmService.class), 134217728);
        Calendar instance = Calendar.getInstance();
        if (Calendar.getInstance().get(11) >= 9) {
            instance.add(6, 1);
        }
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 2);
        AlarmManager alarmManager = (AlarmManager) MyApplication.m12952b().getSystemService("alarm");
        if (z) {
            alarmManager.cancel(service);
        } else {
            alarmManager.setInexactRepeating(1, instance.getTimeInMillis(), 86400000, service);
        }
    }

    public static Map<C2920c, C2931b> m7316b(C2919b c2919b) {
        return new C2935e(C2930a.Tehran).m7325a(Calendar.getInstance().getTime(), c2919b);
    }

    public static void m7317b() {
        if (C2535a.m6888a().aj().booleanValue()) {
            C2933d.m7315a(true);
        }
    }

    public final void m7318a(C2919b c2919b) {
        C2480b.m6736b(" Pray time set Alarm");
        if (C2535a.m6888a().aj().booleanValue() && c2919b != null) {
            C2933d.m7313a();
            Map b = C2933d.m7316b(c2919b);
            char[] toCharArray = C2535a.m6888a().ak().toCharArray();
            for (int i = 0; i < toCharArray.length; i++) {
                if (toCharArray[i] == '1') {
                    if (i == C2920c.MorningPray.ordinal()) {
                        m7314a(C2920c.MorningPray, (C2931b) b.get(C2920c.MorningPray), C2920c.MorningPray.ordinal() + 10000);
                    }
                    if (i == C2920c.Sunrise.ordinal()) {
                        m7314a(C2920c.Sunrise, (C2931b) b.get(C2920c.Sunrise), C2920c.Sunrise.ordinal() + 10000);
                    }
                    if (i == C2920c.NoonPray.ordinal()) {
                        m7314a(C2920c.NoonPray, (C2931b) b.get(C2920c.NoonPray), C2920c.NoonPray.ordinal() + 10000);
                    }
                    if (i == C2920c.Sunset.ordinal()) {
                        m7314a(C2920c.Sunset, (C2931b) b.get(C2920c.Sunset), C2920c.Sunset.ordinal() + 10000);
                    }
                    if (i == C2920c.EveningPray.ordinal()) {
                        m7314a(C2920c.EveningPray, (C2931b) b.get(C2920c.EveningPray), C2920c.EveningPray.ordinal() + 10000);
                    }
                    if (i == C2920c.MidNight.ordinal()) {
                        m7314a(C2920c.MidNight, (C2931b) b.get(C2920c.MidNight), 10000 + C2920c.MidNight.ordinal());
                    }
                }
            }
        }
    }
}
