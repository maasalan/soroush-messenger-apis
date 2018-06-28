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
import java.util.Iterator;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

final class aa {

    public static class C4768a implements C0419v, C0420w {
        private Builder f13215a;
        private int f13216b;

        public C4768a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, String str, ArrayList<String> arrayList, Bundle bundle, int i5, int i6, Notification notification2, String str2, boolean z5, String str3, CharSequence[] charSequenceArr, RemoteViews remoteViews2, RemoteViews remoteViews3, RemoteViews remoteViews4, int i7) {
            PendingIntent pendingIntent3;
            C4768a c4768a = this;
            Notification notification3 = notification;
            RemoteViews remoteViews5 = remoteViews2;
            RemoteViews remoteViews6 = remoteViews3;
            RemoteViews remoteViews7 = remoteViews4;
            boolean z6 = false;
            Builder deleteIntent = new Builder(context).setWhen(notification3.when).setShowWhen(z2).setSmallIcon(notification3.icon, notification3.iconLevel).setContent(notification3.contentView).setTicker(notification3.tickerText, remoteViews).setSound(notification3.sound, notification3.audioStreamType).setVibrate(notification3.vibrate).setLights(notification3.ledARGB, notification3.ledOnMS, notification3.ledOffMS).setOngoing((notification3.flags & 2) != 0).setOnlyAlertOnce((notification3.flags & 8) != 0).setAutoCancel((notification3.flags & 16) != 0).setDefaults(notification3.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification3.deleteIntent);
            if ((notification3.flags & 128) != 0) {
                pendingIntent3 = pendingIntent2;
                z6 = true;
            } else {
                pendingIntent3 = pendingIntent2;
            }
            c4768a.f13215a = deleteIntent.setFullScreenIntent(pendingIntent3, z6).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z4).setExtras(bundle).setGroup(str2).setGroupSummary(z5).setSortKey(str3).setCategory(str).setColor(i5).setVisibility(i6).setPublicVersion(notification2).setRemoteInputHistory(charSequenceArr);
            if (remoteViews5 != null) {
                c4768a.f13215a.setCustomContentView(remoteViews5);
            }
            if (remoteViews6 != null) {
                c4768a.f13215a.setCustomBigContentView(remoteViews6);
            }
            if (remoteViews7 != null) {
                c4768a.f13215a.setCustomHeadsUpContentView(remoteViews7);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c4768a.f13215a.addPerson((String) it.next());
            }
            c4768a.f13216b = i7;
        }

        private static void m8923a(Notification notification) {
            notification.sound = null;
            notification.vibrate = null;
            notification.defaults &= -2;
            notification.defaults &= -3;
        }

        public final Builder mo224a() {
            return this.f13215a;
        }

        public final void mo225a(C0375a c0375a) {
            aa.m724a(this.f13215a, c0375a);
        }

        public final Notification mo226b() {
            Notification build = this.f13215a.build();
            if (this.f13216b != 0) {
                if (!(build.getGroup() == null || (build.flags & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 0 || this.f13216b != 2)) {
                    C4768a.m8923a(build);
                }
                if (build.getGroup() != null && (build.flags & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 0 && this.f13216b == 1) {
                    C4768a.m8923a(build);
                }
            }
            return build;
        }
    }

    public static void m724a(Builder builder, C0375a c0375a) {
        Action.Builder builder2 = new Action.Builder(c0375a.mo272a(), c0375a.mo273b(), c0375a.mo274c());
        if (c0375a.mo278g() != null) {
            for (RemoteInput addRemoteInput : ah.m740a(c0375a.mo278g())) {
                builder2.addRemoteInput(addRemoteInput);
            }
        }
        Bundle bundle = c0375a.mo275d() != null ? new Bundle(c0375a.mo275d()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", c0375a.mo276e());
        builder2.setAllowGeneratedReplies(c0375a.mo276e());
        builder2.addExtras(bundle);
        builder.addAction(builder2.build());
    }
}
