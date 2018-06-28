package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.C0426y.C4795a;
import android.support.v4.app.C0427z.C4796a;
import android.support.v4.app.aa.C4768a;
import android.support.v4.app.ab.C4769a;
import android.support.v4.app.ac.C0375a;
import android.support.v4.app.ac.C0375a.C0374a;
import android.support.v4.app.ad.C4770a;
import android.support.v4.app.ae.C4771a;
import android.support.v4.app.ai.C0378a;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;

public class C0425x {
    static final C0423n f1535a;

    public static class C0421d {
        Bundle f1491A;
        public int f1492B;
        int f1493C;
        Notification f1494D;
        RemoteViews f1495E;
        RemoteViews f1496F;
        RemoteViews f1497G;
        String f1498H;
        int f1499I;
        String f1500J;
        long f1501K;
        int f1502L;
        public Notification f1503M;
        public ArrayList<String> f1504N;
        public Context f1505a;
        public CharSequence f1506b;
        public CharSequence f1507c;
        public PendingIntent f1508d;
        PendingIntent f1509e;
        RemoteViews f1510f;
        public Bitmap f1511g;
        public CharSequence f1512h;
        public int f1513i;
        public int f1514j;
        boolean f1515k;
        public boolean f1516l;
        public C0424o f1517m;
        public CharSequence f1518n;
        public CharSequence[] f1519o;
        int f1520p;
        int f1521q;
        boolean f1522r;
        String f1523s;
        boolean f1524t;
        String f1525u;
        public ArrayList<C4789a> f1526v;
        public boolean f1527w;
        boolean f1528x;
        boolean f1529y;
        public String f1530z;

        private C0421d(Context context) {
            this.f1515k = true;
            this.f1526v = new ArrayList();
            this.f1527w = false;
            this.f1492B = 0;
            this.f1493C = 0;
            this.f1499I = 0;
            this.f1502L = 0;
            this.f1503M = new Notification();
            this.f1505a = context;
            this.f1498H = null;
            this.f1503M.when = System.currentTimeMillis();
            this.f1503M.audioStreamType = -1;
            this.f1514j = 0;
            this.f1504N = new ArrayList();
        }

        @Deprecated
        public C0421d(Context context, byte b) {
            this(context);
        }

        protected static CharSequence m847d(CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            if (charSequence.length() > 5120) {
                charSequence = charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        public final Notification m848a() {
            C0423n c0423n = C0425x.f1535a;
            C0422e c0422e = new C0422e();
            return c0423n.mo280a(this);
        }

        public final C0421d m849a(int i) {
            this.f1503M.icon = i;
            return this;
        }

        public final C0421d m850a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f1526v.add(new C4789a(i, charSequence, pendingIntent));
            return this;
        }

        public final C0421d m851a(Uri uri) {
            this.f1503M.sound = uri;
            this.f1503M.audioStreamType = -1;
            return this;
        }

        public final C0421d m852a(C0424o c0424o) {
            if (this.f1517m != c0424o) {
                this.f1517m = c0424o;
                if (this.f1517m != null) {
                    this.f1517m.m861a(this);
                }
            }
            return this;
        }

        public final C0421d m853a(CharSequence charSequence) {
            this.f1506b = C0421d.m847d(charSequence);
            return this;
        }

        public final C0421d m854a(long[] jArr) {
            this.f1503M.vibrate = jArr;
            return this;
        }

        public final C0421d m855b(CharSequence charSequence) {
            this.f1507c = C0421d.m847d(charSequence);
            return this;
        }

        public final void m856b(int i) {
            Notification notification = this.f1503M;
            notification.flags = i | notification.flags;
        }

        public final C0421d m857c(CharSequence charSequence) {
            this.f1503M.tickerText = C0421d.m847d(charSequence);
            return this;
        }
    }

    protected static class C0422e {
        protected C0422e() {
        }

        public static Notification m858a(C0421d c0421d, C0420w c0420w) {
            Notification b = c0420w.mo226b();
            if (c0421d.f1495E != null) {
                b.contentView = c0421d.f1495E;
            }
            int i = VERSION.SDK_INT;
            i = VERSION.SDK_INT;
            return b;
        }
    }

    interface C0423n {
        Notification mo280a(C0421d c0421d);
    }

    public static abstract class C0424o {
        protected C0421d f1531a;
        CharSequence f1532b;
        CharSequence f1533c;
        boolean f1534d = false;

        public void mo279a(C0420w c0420w) {
        }

        public final void m861a(C0421d c0421d) {
            if (this.f1531a != c0421d) {
                this.f1531a = c0421d;
                if (this.f1531a != null) {
                    this.f1531a.m852a(this);
                }
            }
        }
    }

    public static class C4789a extends C0375a {
        public static final C0374a f13346e = new C47881();
        final Bundle f13347a;
        public int f13348b;
        public CharSequence f13349c;
        public PendingIntent f13350d;
        private final ag[] f13351f;
        private final ag[] f13352g;
        private boolean f13353h;

        static class C47881 implements C0374a {
            C47881() {
            }
        }

        public C4789a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i, charSequence, pendingIntent, new Bundle());
        }

        private C4789a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
            this.f13348b = i;
            this.f13349c = C0421d.m847d(charSequence);
            this.f13350d = pendingIntent;
            this.f13347a = bundle;
            this.f13351f = null;
            this.f13352g = null;
            this.f13353h = true;
        }

        public final int mo272a() {
            return this.f13348b;
        }

        public final CharSequence mo273b() {
            return this.f13349c;
        }

        public final PendingIntent mo274c() {
            return this.f13350d;
        }

        public final Bundle mo275d() {
            return this.f13347a;
        }

        public final boolean mo276e() {
            return this.f13353h;
        }

        public final /* bridge */ /* synthetic */ C0378a[] mo277f() {
            return this.f13352g;
        }

        public final /* bridge */ /* synthetic */ C0378a[] mo278g() {
            return this.f13351f;
        }
    }

    public static class C4790b extends C0424o {
        private Bitmap f13354e;
        private Bitmap f13355f;
        private boolean f13356g;

        public final void mo279a(C0420w c0420w) {
            if (VERSION.SDK_INT >= 16) {
                ad.m735a(c0420w, this.b, this.d, this.c, this.f13354e, this.f13355f, this.f13356g);
            }
        }
    }

    public static class C4791c extends C0424o {
        private CharSequence f13357e;

        public final C4791c m9137a(CharSequence charSequence) {
            this.b = C0421d.m847d(charSequence);
            return this;
        }

        public final void mo279a(C0420w c0420w) {
            if (VERSION.SDK_INT >= 16) {
                ad.m736a(c0420w, this.b, this.d, this.c, this.f13357e);
            }
        }

        public final C4791c m9139b(CharSequence charSequence) {
            this.c = C0421d.m847d(charSequence);
            this.d = true;
            return this;
        }

        public final C4791c m9140c(CharSequence charSequence) {
            this.f13357e = C0421d.m847d(charSequence);
            return this;
        }
    }

    public static class C4792f extends C0424o {
        private ArrayList<CharSequence> f13358e = new ArrayList();

        public final C4792f m9141a(CharSequence charSequence) {
            this.b = C0421d.m847d(charSequence);
            return this;
        }

        public final void mo279a(C0420w c0420w) {
            if (VERSION.SDK_INT >= 16) {
                ad.m737a(c0420w, this.b, this.d, this.c, this.f13358e);
            }
        }

        public final C4792f m9143b(CharSequence charSequence) {
            this.c = C0421d.m847d(charSequence);
            this.d = true;
            return this;
        }

        public final C4792f m9144c(CharSequence charSequence) {
            this.f13358e.add(C0421d.m847d(charSequence));
            return this;
        }
    }

    static class C4794m implements C0423n {

        public static class C4793a implements C0420w {
            private Builder f13359a;

            C4793a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z) {
                PendingIntent pendingIntent3;
                Notification notification2 = notification;
                boolean z2 = false;
                Builder deleteIntent = new Builder(context).setWhen(notification2.when).setSmallIcon(notification2.icon, notification2.iconLevel).setContent(notification2.contentView).setTicker(notification2.tickerText, remoteViews).setSound(notification2.sound, notification2.audioStreamType).setVibrate(notification2.vibrate).setLights(notification2.ledARGB, notification2.ledOnMS, notification2.ledOffMS).setOngoing((notification2.flags & 2) != 0).setOnlyAlertOnce((notification2.flags & 8) != 0).setAutoCancel((notification2.flags & 16) != 0).setDefaults(notification2.defaults).setContentTitle(charSequence).setContentText(charSequence2).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification2.deleteIntent);
                if ((notification2.flags & 128) != 0) {
                    pendingIntent3 = pendingIntent2;
                    z2 = true;
                } else {
                    pendingIntent3 = pendingIntent2;
                }
                this.f13359a = deleteIntent.setFullScreenIntent(pendingIntent3, z2).setLargeIcon(bitmap).setNumber(i).setProgress(i2, i3, z);
            }

            public final Builder mo224a() {
                return this.f13359a;
            }

            public final Notification mo226b() {
                return this.f13359a.getNotification();
            }
        }

        C4794m() {
        }

        public Notification mo280a(C0421d c0421d) {
            C0421d c0421d2 = c0421d;
            return C0422e.m858a(c0421d2, new C4793a(c0421d2.f1505a, c0421d2.f1503M, c0421d2.f1506b, c0421d2.f1507c, c0421d2.f1512h, c0421d2.f1510f, c0421d2.f1513i, c0421d2.f1508d, c0421d2.f1509e, c0421d2.f1511g, c0421d2.f1520p, c0421d2.f1521q, c0421d2.f1522r));
        }
    }

    static class C6360g extends C4794m {
        C6360g() {
        }

        public Notification mo280a(C0421d c0421d) {
            C0421d c0421d2 = c0421d;
            Context context = c0421d2.f1505a;
            Notification notification = c0421d2.f1503M;
            CharSequence charSequence = c0421d2.f1506b;
            CharSequence charSequence2 = c0421d2.f1507c;
            CharSequence charSequence3 = c0421d2.f1512h;
            RemoteViews remoteViews = c0421d2.f1510f;
            int i = c0421d2.f1513i;
            PendingIntent pendingIntent = c0421d2.f1508d;
            PendingIntent pendingIntent2 = c0421d2.f1509e;
            Bitmap bitmap = c0421d2.f1511g;
            int i2 = c0421d2.f1520p;
            int i3 = c0421d2.f1521q;
            boolean z = c0421d2.f1522r;
            boolean z2 = c0421d2.f1516l;
            boolean z3 = z;
            int i4 = c0421d2.f1514j;
            int i5 = i4;
            C4770a c4770a = r1;
            C4770a c4770a2 = new C4770a(context, notification, charSequence, charSequence2, charSequence3, remoteViews, i, pendingIntent, pendingIntent2, bitmap, i2, i3, z3, z2, i5, c0421d2.f1518n, c0421d2.f1527w, c0421d2.f1491A, c0421d2.f1523s, c0421d2.f1524t, c0421d2.f1525u, c0421d2.f1495E, c0421d2.f1496F);
            C0420w c0420w = c4770a;
            C0425x.m863a(c0420w, c0421d2.f1526v);
            if (c0421d2.f1517m != null) {
                c0421d2.f1517m.mo279a(c0420w);
            }
            Notification a = C0422e.m858a(c0421d2, c0420w);
            if (c0421d2.f1517m != null) {
                C0425x.m862a(a);
            }
            return a;
        }
    }

    static class C7013h extends C6360g {
        C7013h() {
        }

        public Notification mo280a(C0421d c0421d) {
            C0421d c0421d2 = c0421d;
            Context context = c0421d2.f1505a;
            Notification notification = c0421d2.f1503M;
            CharSequence charSequence = c0421d2.f1506b;
            CharSequence charSequence2 = c0421d2.f1507c;
            CharSequence charSequence3 = c0421d2.f1512h;
            RemoteViews remoteViews = c0421d2.f1510f;
            int i = c0421d2.f1513i;
            PendingIntent pendingIntent = c0421d2.f1508d;
            PendingIntent pendingIntent2 = c0421d2.f1509e;
            Bitmap bitmap = c0421d2.f1511g;
            int i2 = c0421d2.f1520p;
            int i3 = c0421d2.f1521q;
            boolean z = c0421d2.f1522r;
            boolean z2 = c0421d2.f1515k;
            boolean z3 = z;
            boolean z4 = c0421d2.f1516l;
            boolean z5 = z4;
            C4771a c4771a = r1;
            C4771a c4771a2 = new C4771a(context, notification, charSequence, charSequence2, charSequence3, remoteViews, i, pendingIntent, pendingIntent2, bitmap, i2, i3, z3, z2, z5, c0421d2.f1514j, c0421d2.f1518n, c0421d2.f1527w, c0421d2.f1504N, c0421d2.f1491A, c0421d2.f1523s, c0421d2.f1524t, c0421d2.f1525u, c0421d2.f1495E, c0421d2.f1496F);
            C0420w c0420w = c4771a;
            C0425x.m863a(c0420w, c0421d2.f1526v);
            if (c0421d2.f1517m != null) {
                c0421d2.f1517m.mo279a(c0420w);
            }
            return C0422e.m858a(c0421d2, c0420w);
        }
    }

    static class C7250i extends C7013h {
        C7250i() {
        }

        public Notification mo280a(C0421d c0421d) {
            C0421d c0421d2 = c0421d;
            Context context = c0421d2.f1505a;
            Notification notification = c0421d2.f1503M;
            CharSequence charSequence = c0421d2.f1506b;
            CharSequence charSequence2 = c0421d2.f1507c;
            CharSequence charSequence3 = c0421d2.f1512h;
            RemoteViews remoteViews = c0421d2.f1510f;
            int i = c0421d2.f1513i;
            PendingIntent pendingIntent = c0421d2.f1508d;
            PendingIntent pendingIntent2 = c0421d2.f1509e;
            Bitmap bitmap = c0421d2.f1511g;
            int i2 = c0421d2.f1520p;
            int i3 = c0421d2.f1521q;
            boolean z = c0421d2.f1522r;
            boolean z2 = c0421d2.f1515k;
            boolean z3 = z;
            boolean z4 = c0421d2.f1516l;
            boolean z5 = z4;
            C4795a c4795a = r1;
            C4795a c4795a2 = new C4795a(context, notification, charSequence, charSequence2, charSequence3, remoteViews, i, pendingIntent, pendingIntent2, bitmap, i2, i3, z3, z2, z5, c0421d2.f1514j, c0421d2.f1518n, c0421d2.f1527w, c0421d2.f1504N, c0421d2.f1491A, c0421d2.f1523s, c0421d2.f1524t, c0421d2.f1525u, c0421d2.f1495E, c0421d2.f1496F, c0421d2.f1502L);
            C0420w c0420w = c4795a;
            C0425x.m863a(c0420w, c0421d2.f1526v);
            if (c0421d2.f1517m != null) {
                c0421d2.f1517m.mo279a(c0420w);
            }
            Notification a = C0422e.m858a(c0421d2, c0420w);
            if (c0421d2.f1517m != null) {
                C0425x.m862a(a);
            }
            return a;
        }
    }

    static class C7402j extends C7250i {
        C7402j() {
        }

        public Notification mo280a(C0421d c0421d) {
            C0421d c0421d2 = c0421d;
            Context context = c0421d2.f1505a;
            Notification notification = c0421d2.f1503M;
            CharSequence charSequence = c0421d2.f1506b;
            CharSequence charSequence2 = c0421d2.f1507c;
            CharSequence charSequence3 = c0421d2.f1512h;
            RemoteViews remoteViews = c0421d2.f1510f;
            int i = c0421d2.f1513i;
            PendingIntent pendingIntent = c0421d2.f1508d;
            PendingIntent pendingIntent2 = c0421d2.f1509e;
            Bitmap bitmap = c0421d2.f1511g;
            int i2 = c0421d2.f1520p;
            int i3 = c0421d2.f1521q;
            boolean z = c0421d2.f1522r;
            boolean z2 = c0421d2.f1515k;
            boolean z3 = z;
            boolean z4 = c0421d2.f1516l;
            boolean z5 = z4;
            C4796a c4796a = r1;
            C4796a c4796a2 = new C4796a(context, notification, charSequence, charSequence2, charSequence3, remoteViews, i, pendingIntent, pendingIntent2, bitmap, i2, i3, z3, z2, z5, c0421d2.f1514j, c0421d2.f1518n, c0421d2.f1527w, c0421d2.f1530z, c0421d2.f1504N, c0421d2.f1491A, c0421d2.f1492B, c0421d2.f1493C, c0421d2.f1494D, c0421d2.f1523s, c0421d2.f1524t, c0421d2.f1525u, c0421d2.f1495E, c0421d2.f1496F, c0421d2.f1497G, c0421d2.f1502L);
            C0420w c0420w = c4796a;
            C0425x.m863a(c0420w, c0421d2.f1526v);
            if (c0421d2.f1517m != null) {
                c0421d2.f1517m.mo279a(c0420w);
            }
            Notification a = C0422e.m858a(c0421d2, c0420w);
            if (c0421d2.f1517m != null) {
                C0425x.m862a(a);
            }
            return a;
        }
    }

    static class C7565k extends C7402j {
        C7565k() {
        }

        public Notification mo280a(C0421d c0421d) {
            C0421d c0421d2 = c0421d;
            Context context = c0421d2.f1505a;
            Notification notification = c0421d2.f1503M;
            CharSequence charSequence = c0421d2.f1506b;
            CharSequence charSequence2 = c0421d2.f1507c;
            CharSequence charSequence3 = c0421d2.f1512h;
            RemoteViews remoteViews = c0421d2.f1510f;
            int i = c0421d2.f1513i;
            PendingIntent pendingIntent = c0421d2.f1508d;
            PendingIntent pendingIntent2 = c0421d2.f1509e;
            Bitmap bitmap = c0421d2.f1511g;
            int i2 = c0421d2.f1520p;
            int i3 = c0421d2.f1521q;
            boolean z = c0421d2.f1522r;
            boolean z2 = c0421d2.f1515k;
            boolean z3 = z;
            boolean z4 = c0421d2.f1516l;
            boolean z5 = z4;
            C4768a c4768a = r1;
            C4768a c4768a2 = new C4768a(context, notification, charSequence, charSequence2, charSequence3, remoteViews, i, pendingIntent, pendingIntent2, bitmap, i2, i3, z3, z2, z5, c0421d2.f1514j, c0421d2.f1518n, c0421d2.f1527w, c0421d2.f1530z, c0421d2.f1504N, c0421d2.f1491A, c0421d2.f1492B, c0421d2.f1493C, c0421d2.f1494D, c0421d2.f1523s, c0421d2.f1524t, c0421d2.f1525u, c0421d2.f1519o, c0421d2.f1495E, c0421d2.f1496F, c0421d2.f1497G, c0421d2.f1502L);
            C0420w c0420w = c4768a;
            C0425x.m863a(c0420w, c0421d2.f1526v);
            if (c0421d2.f1517m != null) {
                c0421d2.f1517m.mo279a(c0420w);
            }
            Notification a = C0422e.m858a(c0421d2, c0420w);
            if (c0421d2.f1517m != null) {
                C0425x.m862a(a);
            }
            return a;
        }
    }

    static class C7692l extends C7565k {
        C7692l() {
        }

        public final Notification mo280a(C0421d c0421d) {
            C0421d c0421d2 = c0421d;
            Context context = c0421d2.f1505a;
            Notification notification = c0421d2.f1503M;
            CharSequence charSequence = c0421d2.f1506b;
            CharSequence charSequence2 = c0421d2.f1507c;
            CharSequence charSequence3 = c0421d2.f1512h;
            RemoteViews remoteViews = c0421d2.f1510f;
            int i = c0421d2.f1513i;
            PendingIntent pendingIntent = c0421d2.f1508d;
            PendingIntent pendingIntent2 = c0421d2.f1509e;
            Bitmap bitmap = c0421d2.f1511g;
            int i2 = c0421d2.f1520p;
            int i3 = c0421d2.f1521q;
            boolean z = c0421d2.f1522r;
            boolean z2 = c0421d2.f1515k;
            boolean z3 = z;
            boolean z4 = c0421d2.f1516l;
            int i4 = c0421d2.f1514j;
            CharSequence charSequence4 = c0421d2.f1518n;
            boolean z5 = c0421d2.f1527w;
            String str = c0421d2.f1530z;
            ArrayList arrayList = c0421d2.f1504N;
            Bundle bundle = c0421d2.f1491A;
            int i5 = c0421d2.f1492B;
            int i6 = c0421d2.f1493C;
            Notification notification2 = c0421d2.f1494D;
            String str2 = c0421d2.f1523s;
            boolean z6 = c0421d2.f1524t;
            String str3 = c0421d2.f1525u;
            CharSequence[] charSequenceArr = c0421d2.f1519o;
            RemoteViews remoteViews2 = c0421d2.f1495E;
            RemoteViews remoteViews3 = c0421d2.f1496F;
            RemoteViews remoteViews4 = c0421d2.f1497G;
            String str4 = c0421d2.f1498H;
            int i7 = c0421d2.f1499I;
            int i8 = i3;
            String str5 = c0421d2.f1500J;
            long j = c0421d2.f1501K;
            z = c0421d2.f1528x;
            boolean z7 = c0421d2.f1529y;
            i3 = i8;
            boolean z8 = z4;
            z = z3;
            C4769a c4769a = r1;
            boolean z9 = z2;
            boolean z10 = z8;
            int i9 = i4;
            CharSequence charSequence5 = charSequence4;
            boolean z11 = z5;
            String str6 = str;
            ArrayList arrayList2 = arrayList;
            Bundle bundle2 = bundle;
            int i10 = i5;
            int i11 = i6;
            Notification notification3 = notification2;
            String str7 = str2;
            boolean z12 = z6;
            String str8 = str3;
            CharSequence[] charSequenceArr2 = charSequenceArr;
            RemoteViews remoteViews5 = remoteViews2;
            RemoteViews remoteViews6 = remoteViews3;
            RemoteViews remoteViews7 = remoteViews4;
            String str9 = str4;
            int i12 = i7;
            String str10 = str5;
            C4769a c4769a2 = new C4769a(context, notification, charSequence, charSequence2, charSequence3, remoteViews, i, pendingIntent, pendingIntent2, bitmap, i2, i3, z, z9, z10, i9, charSequence5, z11, str6, arrayList2, bundle2, i10, i11, notification3, str7, z12, str8, charSequenceArr2, remoteViews5, remoteViews6, remoteViews7, str9, i12, str10, j, z, z7, c0421d2.f1502L);
            C0420w c0420w = c4769a;
            C0425x.m863a(c0420w, c0421d2.f1526v);
            if (c0421d2.f1517m != null) {
                c0421d2.f1517m.mo279a(c0420w);
            }
            Notification a = C0422e.m858a(c0421d2, c0420w);
            if (c0421d2.f1517m != null) {
                C0425x.m862a(a);
            }
            return a;
        }
    }

    static {
        C0423n c7692l = VERSION.SDK_INT >= 26 ? new C7692l() : VERSION.SDK_INT >= 24 ? new C7565k() : VERSION.SDK_INT >= 21 ? new C7402j() : VERSION.SDK_INT >= 20 ? new C7250i() : VERSION.SDK_INT >= 19 ? new C7013h() : VERSION.SDK_INT >= 16 ? new C6360g() : new C4794m();
        f1535a = c7692l;
    }

    public static Bundle m862a(Notification notification) {
        return VERSION.SDK_INT >= 19 ? notification.extras : VERSION.SDK_INT >= 16 ? ad.m733a(notification) : null;
    }

    static void m863a(C0419v c0419v, ArrayList<C4789a> arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c0419v.mo225a((C4789a) it.next());
        }
    }
}
