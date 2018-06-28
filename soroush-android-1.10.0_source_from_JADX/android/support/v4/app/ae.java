package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.ac.C0375a;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;

final class ae {

    public static class C4771a implements C0419v, C0420w {
        private Builder f13223a;
        private Bundle f13224b;
        private List<Bundle> f13225c = new ArrayList();
        private RemoteViews f13226d;
        private RemoteViews f13227e;

        public C4771a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, ArrayList<String> arrayList, Bundle bundle, String str, boolean z5, String str2, RemoteViews remoteViews2, RemoteViews remoteViews3) {
            PendingIntent pendingIntent3;
            Notification notification2 = notification;
            ArrayList<String> arrayList2 = arrayList;
            Bundle bundle2 = bundle;
            String str3 = str;
            String str4 = str2;
            boolean z6 = false;
            Builder deleteIntent = new Builder(context).setWhen(notification2.when).setShowWhen(z2).setSmallIcon(notification2.icon, notification2.iconLevel).setContent(notification2.contentView).setTicker(notification2.tickerText, remoteViews).setSound(notification2.sound, notification2.audioStreamType).setVibrate(notification2.vibrate).setLights(notification2.ledARGB, notification2.ledOnMS, notification2.ledOffMS).setOngoing((notification2.flags & 2) != 0).setOnlyAlertOnce((notification2.flags & 8) != 0).setAutoCancel((notification2.flags & 16) != 0).setDefaults(notification2.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification2.deleteIntent);
            if ((notification2.flags & 128) != 0) {
                pendingIntent3 = pendingIntent2;
                z6 = true;
            } else {
                pendingIntent3 = pendingIntent2;
            }
            r0.f13223a = deleteIntent.setFullScreenIntent(pendingIntent3, z6).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z);
            r0.f13224b = new Bundle();
            if (bundle2 != null) {
                r0.f13224b.putAll(bundle2);
            }
            if (!(arrayList2 == null || arrayList.isEmpty())) {
                r0.f13224b.putStringArray("android.people", (String[]) arrayList2.toArray(new String[arrayList.size()]));
            }
            if (z4) {
                r0.f13224b.putBoolean("android.support.localOnly", true);
            }
            if (str3 != null) {
                Bundle bundle3;
                String str5;
                r0.f13224b.putString("android.support.groupKey", str3);
                if (z5) {
                    bundle3 = r0.f13224b;
                    str5 = "android.support.isGroupSummary";
                } else {
                    bundle3 = r0.f13224b;
                    str5 = "android.support.useSideChannel";
                }
                bundle3.putBoolean(str5, true);
            }
            if (str4 != null) {
                r0.f13224b.putString("android.support.sortKey", str4);
            }
            r0.f13226d = remoteViews2;
            r0.f13227e = remoteViews3;
        }

        public final Builder mo224a() {
            return this.f13223a;
        }

        public final void mo225a(C0375a c0375a) {
            this.f13225c.add(ad.m732a(this.f13223a, c0375a));
        }

        public final Notification mo226b() {
            SparseArray a = ad.m734a(this.f13225c);
            if (a != null) {
                this.f13224b.putSparseParcelableArray("android.support.actionExtras", a);
            }
            this.f13223a.setExtras(this.f13224b);
            Notification build = this.f13223a.build();
            if (this.f13226d != null) {
                build.contentView = this.f13226d;
            }
            if (this.f13227e != null) {
                build.bigContentView = this.f13227e;
            }
            return build;
        }
    }
}
