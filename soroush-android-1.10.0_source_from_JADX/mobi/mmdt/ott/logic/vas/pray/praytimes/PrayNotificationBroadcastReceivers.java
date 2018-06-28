package mobi.mmdt.ott.logic.vas.pray.praytimes;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.C0425x.C0421d;
import android.support.v4.app.C0425x.C4790b;
import android.support.v7.app.C4872n.C4871a;
import android.widget.RemoteViews;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.vas.pray.C2922a;
import mobi.mmdt.ott.logic.vas.pray.p376a.C2919b;
import mobi.mmdt.ott.logic.vas.pray.p376a.C2920c;
import mobi.mmdt.ott.logic.vas.pray.p378d.C2925a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.vas.owghat.OwghatActivity;

public class PrayNotificationBroadcastReceivers extends BroadcastReceiver {
    private Context f9108a;

    public void onReceive(Context context, Intent intent) {
        C2480b.m6732a("Pray Time Notification Alarm");
        this.f9108a = context;
        if (intent.getAction().equals("mobi.mmdt.ott.BROADCAST_PRAY_ALARM")) {
            int intExtra = intent.getIntExtra("KEY_EXTRA_PRAYER_INDEX", -1);
            C2920c c2920c = intExtra == C2920c.MorningPray.ordinal() ? C2920c.MorningPray : intExtra == C2920c.Sunrise.ordinal() ? C2920c.Sunrise : intExtra == C2920c.NoonPray.ordinal() ? C2920c.NoonPray : intExtra == C2920c.Sunset.ordinal() ? C2920c.Sunset : intExtra == C2920c.EveningPray.ordinal() ? C2920c.EveningPray : intExtra == C2920c.MidNight.ordinal() ? C2920c.MidNight : null;
            C2480b.m6732a("BroadCast Pray Alarm");
            C2922a.m7297a();
            final C2919b g = C2922a.m7303g();
            if (C2535a.m6888a().aj().booleanValue()) {
                if (!((C2535a.m6888a().ak().toCharArray()[c2920c.ordinal()] == '1' ? 1 : null) == null || g == null)) {
                    C2480b.m6732a("Pray Time Notification Enable");
                    new Timer().schedule(new TimerTask(this) {
                        final /* synthetic */ PrayNotificationBroadcastReceivers f9107b;

                        public final void run() {
                            C2933d.m7313a().m7318a(g);
                        }
                    }, 120000);
                    C0421d c4871a = new C4871a(MyApplication.m12952b());
                    C4790b c4790b = new C4790b();
                    RemoteViews remoteViews = new RemoteViews(MyApplication.m12952b().getPackageName(), R.layout.notification_layout_file);
                    C2920c c = C2925a.m7310c(c2920c);
                    C2920c c2 = C2925a.m7310c(c);
                    C2933d.m7313a();
                    C2922a.m7297a();
                    Map b = C2933d.m7316b(C2922a.m7303g());
                    boolean equalsIgnoreCase = C2535a.m6888a().m6919b().equalsIgnoreCase("fa");
                    remoteViews.setImageViewResource(R.id.iv_notificatio_pray_image_1, C2925a.m7309b(c2920c));
                    remoteViews.setTextViewText(R.id.iv_notificatio_pray_name_1, C2925a.m7307a(c2920c));
                    C2933d.m7313a();
                    remoteViews.setTextViewText(R.id.iv_notificatio_pray_time_1, C2491i.m6778a(C2933d.m7312a((C2931b) b.get(c2920c)), equalsIgnoreCase));
                    remoteViews.setImageViewResource(R.id.iv_notificatio_pray_image_2, C2925a.m7309b(c));
                    remoteViews.setTextViewText(R.id.iv_notificatio_pray_name_2, C2925a.m7307a(c));
                    C2933d.m7313a();
                    remoteViews.setTextViewText(R.id.iv_notificatio_pray_time_2, C2491i.m6778a(C2933d.m7312a((C2931b) b.get(c)), equalsIgnoreCase));
                    remoteViews.setImageViewResource(R.id.iv_notificatio_pray_image_3, C2925a.m7309b(c2));
                    remoteViews.setTextViewText(R.id.iv_notificatio_pray_name_3, C2925a.m7307a(c2));
                    C2933d.m7313a();
                    remoteViews.setTextViewText(R.id.iv_notificatio_pray_time_3, C2491i.m6778a(C2933d.m7312a((C2931b) b.get(c2)), equalsIgnoreCase));
                    Intent intent2 = new Intent(MyApplication.m12952b(), OwghatActivity.class);
                    intent2.setFlags(603979776);
                    PendingIntent activity = PendingIntent.getActivity(MyApplication.m12952b(), 100004, intent2, 134217728);
                    c4871a.m849a((int) R.drawable.ic_notification_logo);
                    c4871a.f1508d = activity;
                    c4871a.m856b(16);
                    c4871a.f1503M.contentView = remoteViews;
                    ((NotificationManager) MyApplication.m12952b().getSystemService("notification")).notify(1100, c4871a.m848a());
                }
            }
        }
        if (intent.getAction().equals("android.intent.action.DATE_CHANGED")) {
            C2933d a = C2933d.m7313a();
            C2922a.m7297a();
            a.m7318a(C2922a.m7303g());
        }
    }
}
