package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.ac.C0375a;
import android.widget.RemoteViews;
import java.util.ArrayList;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

final class C0426y {

    public static class C4795a implements C0419v, C0420w {
        private Builder f13360a;
        private Bundle f13361b;
        private RemoteViews f13362c;
        private RemoteViews f13363d;
        private int f13364e;

        public C4795a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, ArrayList<String> arrayList, Bundle bundle, String str, boolean z5, String str2, RemoteViews remoteViews2, RemoteViews remoteViews3, int i5) {
            PendingIntent pendingIntent3;
            C4795a c4795a = this;
            Notification notification2 = notification;
            ArrayList<String> arrayList2 = arrayList;
            Bundle bundle2 = bundle;
            boolean z6 = false;
            Builder deleteIntent = new Builder(context).setWhen(notification2.when).setShowWhen(z2).setSmallIcon(notification2.icon, notification2.iconLevel).setContent(notification2.contentView).setTicker(notification2.tickerText, remoteViews).setSound(notification2.sound, notification2.audioStreamType).setVibrate(notification2.vibrate).setLights(notification2.ledARGB, notification2.ledOnMS, notification2.ledOffMS).setOngoing((notification2.flags & 2) != 0).setOnlyAlertOnce((notification2.flags & 8) != 0).setAutoCancel((notification2.flags & 16) != 0).setDefaults(notification2.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification2.deleteIntent);
            if ((notification2.flags & 128) != 0) {
                pendingIntent3 = pendingIntent2;
                z6 = true;
            } else {
                pendingIntent3 = pendingIntent2;
            }
            c4795a.f13360a = deleteIntent.setFullScreenIntent(pendingIntent3, z6).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z4).setGroup(str).setGroupSummary(z5).setSortKey(str2);
            c4795a.f13361b = new Bundle();
            if (bundle2 != null) {
                c4795a.f13361b.putAll(bundle2);
            }
            if (!(arrayList2 == null || arrayList.isEmpty())) {
                c4795a.f13361b.putStringArray("android.people", (String[]) arrayList2.toArray(new String[arrayList.size()]));
            }
            c4795a.f13362c = remoteViews2;
            c4795a.f13363d = remoteViews3;
            c4795a.f13364e = i5;
        }

        private static void m9148a(Notification notification) {
            notification.sound = null;
            notification.vibrate = null;
            notification.defaults &= -2;
            notification.defaults &= -3;
        }

        public final Builder mo224a() {
            return this.f13360a;
        }

        public final void mo225a(C0375a c0375a) {
            C0426y.m864a(this.f13360a, c0375a);
        }

        public final Notification mo226b() {
            this.f13360a.setExtras(this.f13361b);
            Notification build = this.f13360a.build();
            if (this.f13362c != null) {
                build.contentView = this.f13362c;
            }
            if (this.f13363d != null) {
                build.bigContentView = this.f13363d;
            }
            if (this.f13364e != 0) {
                if (!(build.getGroup() == null || (build.flags & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 0 || this.f13364e != 2)) {
                    C4795a.m9148a(build);
                }
                if (build.getGroup() != null && (build.flags & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 0 && this.f13364e == 1) {
                    C4795a.m9148a(build);
                }
            }
            return build;
        }
    }

    public static void m864a(Builder builder, C0375a c0375a) {
        Action.Builder builder2 = new Action.Builder(c0375a.mo272a(), c0375a.mo273b(), c0375a.mo274c());
        if (c0375a.mo278g() != null) {
            for (RemoteInput addRemoteInput : ah.m740a(c0375a.mo278g())) {
                builder2.addRemoteInput(addRemoteInput);
            }
        }
        Bundle bundle = c0375a.mo275d() != null ? new Bundle(c0375a.mo275d()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", c0375a.mo276e());
        builder2.addExtras(bundle);
        builder.addAction(builder2.build());
    }
}
