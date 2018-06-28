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

final class ab {

    public static class C4769a implements C0419v, C0420w {
        private Builder f13217a;

        C4769a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, String str, ArrayList<String> arrayList, Bundle bundle, int i5, int i6, Notification notification2, String str2, boolean z5, String str3, CharSequence[] charSequenceArr, RemoteViews remoteViews2, RemoteViews remoteViews3, RemoteViews remoteViews4, String str4, int i7, String str5, long j, boolean z6, boolean z7, int i8) {
            PendingIntent pendingIntent3;
            C4769a c4769a = this;
            Notification notification3 = notification;
            RemoteViews remoteViews5 = remoteViews2;
            RemoteViews remoteViews6 = remoteViews3;
            RemoteViews remoteViews7 = remoteViews4;
            String str6 = str4;
            boolean z8 = false;
            Builder deleteIntent = new Builder(context, str6).setWhen(notification3.when).setShowWhen(z2).setSmallIcon(notification3.icon, notification3.iconLevel).setContent(notification3.contentView).setTicker(notification3.tickerText, remoteViews).setSound(notification3.sound, notification3.audioStreamType).setVibrate(notification3.vibrate).setLights(notification3.ledARGB, notification3.ledOnMS, notification3.ledOffMS).setOngoing((notification3.flags & 2) != 0).setOnlyAlertOnce((notification3.flags & 8) != 0).setAutoCancel((notification3.flags & 16) != 0).setDefaults(notification3.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification3.deleteIntent);
            if ((notification3.flags & 128) != 0) {
                pendingIntent3 = pendingIntent2;
                z8 = true;
            } else {
                pendingIntent3 = pendingIntent2;
            }
            c4769a.f13217a = deleteIntent.setFullScreenIntent(pendingIntent3, z8).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z4).setExtras(bundle).setGroup(str2).setGroupSummary(z5).setSortKey(str3).setCategory(str).setColor(i5).setVisibility(i6).setPublicVersion(notification2).setRemoteInputHistory(charSequenceArr).setChannelId(str6).setBadgeIconType(i7).setShortcutId(str5).setTimeoutAfter(j).setGroupAlertBehavior(i8);
            if (z7) {
                c4769a.f13217a.setColorized(z6);
            }
            if (remoteViews5 != null) {
                c4769a.f13217a.setCustomContentView(remoteViews5);
            }
            if (remoteViews6 != null) {
                c4769a.f13217a.setCustomBigContentView(remoteViews6);
            }
            if (remoteViews7 != null) {
                c4769a.f13217a.setCustomHeadsUpContentView(remoteViews7);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c4769a.f13217a.addPerson((String) it.next());
            }
        }

        public final Builder mo224a() {
            return this.f13217a;
        }

        public final void mo225a(C0375a c0375a) {
            aa.m724a(this.f13217a, c0375a);
        }

        public final Notification mo226b() {
            return this.f13217a.build();
        }
    }
}
