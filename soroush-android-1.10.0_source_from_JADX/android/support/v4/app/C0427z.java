package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.ac.C0375a;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

final class C0427z {

    public static class C4796a implements C0419v, C0420w {
        private Builder f13365a;
        private Bundle f13366b;
        private RemoteViews f13367c;
        private RemoteViews f13368d;
        private RemoteViews f13369e;
        private int f13370f;

        public C4796a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, String str, ArrayList<String> arrayList, Bundle bundle, int i5, int i6, Notification notification2, String str2, boolean z5, String str3, RemoteViews remoteViews2, RemoteViews remoteViews3, RemoteViews remoteViews4, int i7) {
            PendingIntent pendingIntent3;
            C4796a c4796a = this;
            Notification notification3 = notification;
            Bundle bundle2 = bundle;
            boolean z6 = false;
            Builder deleteIntent = new Builder(context).setWhen(notification3.when).setShowWhen(z2).setSmallIcon(notification3.icon, notification3.iconLevel).setContent(notification3.contentView).setTicker(notification3.tickerText, remoteViews).setSound(notification3.sound, notification3.audioStreamType).setVibrate(notification3.vibrate).setLights(notification3.ledARGB, notification3.ledOnMS, notification3.ledOffMS).setOngoing((notification3.flags & 2) != 0).setOnlyAlertOnce((notification3.flags & 8) != 0).setAutoCancel((notification3.flags & 16) != 0).setDefaults(notification3.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification3.deleteIntent);
            if ((notification3.flags & 128) != 0) {
                pendingIntent3 = pendingIntent2;
                z6 = true;
            } else {
                pendingIntent3 = pendingIntent2;
            }
            c4796a.f13365a = deleteIntent.setFullScreenIntent(pendingIntent3, z6).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z4).setGroup(str2).setGroupSummary(z5).setSortKey(str3).setCategory(str).setColor(i5).setVisibility(i6).setPublicVersion(notification2);
            c4796a.f13366b = new Bundle();
            if (bundle2 != null) {
                c4796a.f13366b.putAll(bundle2);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c4796a.f13365a.addPerson((String) it.next());
            }
            c4796a.f13367c = remoteViews2;
            c4796a.f13368d = remoteViews3;
            c4796a.f13369e = remoteViews4;
            c4796a.f13370f = i7;
        }

        private static void m9152a(Notification notification) {
            notification.sound = null;
            notification.vibrate = null;
            notification.defaults &= -2;
            notification.defaults &= -3;
        }

        public final Builder mo224a() {
            return this.f13365a;
        }

        public final void mo225a(C0375a c0375a) {
            C0426y.m864a(this.f13365a, c0375a);
        }

        public final Notification mo226b() {
            this.f13365a.setExtras(this.f13366b);
            Notification build = this.f13365a.build();
            if (this.f13367c != null) {
                build.contentView = this.f13367c;
            }
            if (this.f13368d != null) {
                build.bigContentView = this.f13368d;
            }
            if (this.f13369e != null) {
                build.headsUpContentView = this.f13369e;
            }
            if (this.f13370f != 0) {
                if (!(build.getGroup() == null || (build.flags & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 0 || this.f13370f != 2)) {
                    C4796a.m9152a(build);
                }
                if (build.getGroup() != null && (build.flags & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 0 && this.f13370f == 1) {
                    C4796a.m9152a(build);
                }
            }
            return build;
        }
    }
}
