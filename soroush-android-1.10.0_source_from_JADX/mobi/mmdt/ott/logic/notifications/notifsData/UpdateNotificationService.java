package mobi.mmdt.ott.logic.notifications.notifsData;

import android.app.Service;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.support.v4.p029a.C0350e;
import android.support.v4.p029a.C0350e.C0349c;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.notifications.C2873a;
import mobi.mmdt.ott.logic.notifications.C2874b;
import mobi.mmdt.ott.logic.p261a.p323v.p324a.C2747a;
import mobi.mmdt.ott.logic.p261a.p323v.p325b.C6783e;
import mobi.mmdt.ott.provider.p384f.C2967c;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p384f.C6019d;
import mobi.mmdt.ott.provider.p384f.C6021g;
import mobi.mmdt.ott.provider.p384f.C7316h;
import p000a.p001a.p002a.C0005c;

public class UpdateNotificationService extends Service implements C0349c<Cursor> {
    private C7316h f16158a;

    public static void m13273a() {
        C2480b.m6742f("UpdateNotificationJob BadgeManager clearNotification");
        C2874b.m7229a();
        C2873a.m7225a();
        C0005c.m0a().m9d(new C2747a());
    }

    public final /* synthetic */ void mo265a(C0350e c0350e, Object obj) {
        Cursor cursor = (Cursor) obj;
        long a = C2778b.m7093a();
        if (cursor != null && cursor.getCount() != 0) {
            C6019d c6019d = new C6019d();
            c6019d.m13343a(false);
            C6021g c6021g = new C6021g();
            c6021g.m13389c(a);
            c6019d.m13332a(c6021g);
            StringBuilder stringBuilder = new StringBuilder("UpdateNotificationJob UpdateNotificationService count: ");
            stringBuilder.append(cursor.getCount());
            C2480b.m6742f(stringBuilder.toString());
            C2808d.m7147a(new C6783e(true, true));
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        StringBuilder stringBuilder = new StringBuilder("SELECT conversations._id FROM conversations WHERE conversations_event_state = ");
        stringBuilder.append(C2971k.NOT_READ.ordinal());
        stringBuilder.append(" AND conversations_is_need_notify = 1  AND conversations_direction_type = ");
        stringBuilder.append(C2970j.IN.ordinal());
        String stringBuilder2 = stringBuilder.toString();
        this.f16158a = new C7316h(C2967c.f9203a, stringBuilder2, C2967c.f9203a);
        this.f16158a.m13294a(1500);
        this.f16158a.m690a(2513, this);
        this.f16158a.m700j();
    }

    public void onDestroy() {
        if (this.f16158a != null) {
            this.f16158a.m692a((C0349c) this);
            if (VERSION.SDK_INT >= 16) {
                this.f16158a.mo219b();
            }
            this.f16158a.m701k();
        }
        super.onDestroy();
    }
}
