package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.Notification.InboxStyle;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.ac.C0375a;
import android.util.Log;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class ad {
    private static final Object f1397a = new Object();
    private static Field f1398b;
    private static boolean f1399c;
    private static final Object f1400d = new Object();

    public static class C4770a implements C0419v, C0420w {
        private Builder f13218a;
        private final Bundle f13219b;
        private List<Bundle> f13220c = new ArrayList();
        private RemoteViews f13221d;
        private RemoteViews f13222e;

        public C4770a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, int i4, CharSequence charSequence4, boolean z3, Bundle bundle, String str, boolean z4, String str2, RemoteViews remoteViews2, RemoteViews remoteViews3) {
            PendingIntent pendingIntent3;
            Notification notification2 = notification;
            Bundle bundle2 = bundle;
            String str3 = str;
            String str4 = str2;
            boolean z5 = false;
            Builder deleteIntent = new Builder(context).setWhen(notification2.when).setSmallIcon(notification2.icon, notification2.iconLevel).setContent(notification2.contentView).setTicker(notification2.tickerText, remoteViews).setSound(notification2.sound, notification2.audioStreamType).setVibrate(notification2.vibrate).setLights(notification2.ledARGB, notification2.ledOnMS, notification2.ledOffMS).setOngoing((notification2.flags & 2) != 0).setOnlyAlertOnce((notification2.flags & 8) != 0).setAutoCancel((notification2.flags & 16) != 0).setDefaults(notification2.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification2.deleteIntent);
            if ((notification2.flags & 128) != 0) {
                pendingIntent3 = pendingIntent2;
                z5 = true;
            } else {
                pendingIntent3 = pendingIntent2;
            }
            r0.f13218a = deleteIntent.setFullScreenIntent(pendingIntent3, z5).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z2).setPriority(i4).setProgress(i2, i3, z);
            r0.f13219b = new Bundle();
            if (bundle2 != null) {
                r0.f13219b.putAll(bundle2);
            }
            if (z3) {
                r0.f13219b.putBoolean("android.support.localOnly", true);
            }
            if (str3 != null) {
                Bundle bundle3;
                String str5;
                r0.f13219b.putString("android.support.groupKey", str3);
                if (z4) {
                    bundle3 = r0.f13219b;
                    str5 = "android.support.isGroupSummary";
                } else {
                    bundle3 = r0.f13219b;
                    str5 = "android.support.useSideChannel";
                }
                bundle3.putBoolean(str5, true);
            }
            if (str4 != null) {
                r0.f13219b.putString("android.support.sortKey", str4);
            }
            r0.f13221d = remoteViews2;
            r0.f13222e = remoteViews3;
        }

        public final Builder mo224a() {
            return this.f13218a;
        }

        public final void mo225a(C0375a c0375a) {
            this.f13220c.add(ad.m732a(this.f13218a, c0375a));
        }

        public final Notification mo226b() {
            Notification build = this.f13218a.build();
            Bundle a = ad.m733a(build);
            Bundle bundle = new Bundle(this.f13219b);
            for (String str : this.f13219b.keySet()) {
                if (a.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a.putAll(bundle);
            SparseArray a2 = ad.m734a(this.f13220c);
            if (a2 != null) {
                ad.m733a(build).putSparseParcelableArray("android.support.actionExtras", a2);
            }
            if (this.f13221d != null) {
                build.contentView = this.f13221d;
            }
            if (this.f13222e != null) {
                build.bigContentView = this.f13222e;
            }
            return build;
        }
    }

    public static Bundle m732a(Builder builder, C0375a c0375a) {
        builder.addAction(c0375a.mo272a(), c0375a.mo273b(), c0375a.mo274c());
        Bundle bundle = new Bundle(c0375a.mo275d());
        if (c0375a.mo278g() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", aj.m747a(c0375a.mo278g()));
        }
        if (c0375a.mo277f() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", aj.m747a(c0375a.mo277f()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", c0375a.mo276e());
        return bundle;
    }

    public static Bundle m733a(Notification notification) {
        Throwable e;
        String str;
        String str2;
        synchronized (f1397a) {
            if (f1399c) {
                return null;
            }
            try {
                if (f1398b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (Bundle.class.isAssignableFrom(declaredField.getType())) {
                        declaredField.setAccessible(true);
                        f1398b = declaredField;
                    } else {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f1399c = true;
                        return null;
                    }
                }
                Bundle bundle = (Bundle) f1398b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f1398b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e2) {
                e = e2;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f1399c = true;
                return null;
            } catch (NoSuchFieldException e3) {
                e = e3;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f1399c = true;
                return null;
            }
        }
    }

    public static SparseArray<Bundle> m734a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = (Bundle) list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    public static void m735a(C0420w c0420w, CharSequence charSequence, boolean z, CharSequence charSequence2, Bitmap bitmap, Bitmap bitmap2, boolean z2) {
        BigPictureStyle bigPicture = new BigPictureStyle(c0420w.mo224a()).setBigContentTitle(charSequence).bigPicture(bitmap);
        if (z2) {
            bigPicture.bigLargeIcon(bitmap2);
        }
        if (z) {
            bigPicture.setSummaryText(charSequence2);
        }
    }

    public static void m736a(C0420w c0420w, CharSequence charSequence, boolean z, CharSequence charSequence2, CharSequence charSequence3) {
        BigTextStyle bigText = new BigTextStyle(c0420w.mo224a()).setBigContentTitle(charSequence).bigText(charSequence3);
        if (z) {
            bigText.setSummaryText(charSequence2);
        }
    }

    public static void m737a(C0420w c0420w, CharSequence charSequence, boolean z, CharSequence charSequence2, ArrayList<CharSequence> arrayList) {
        InboxStyle bigContentTitle = new InboxStyle(c0420w.mo224a()).setBigContentTitle(charSequence);
        if (z) {
            bigContentTitle.setSummaryText(charSequence2);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bigContentTitle.addLine((CharSequence) it.next());
        }
    }
}
