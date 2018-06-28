package mobi.mmdt.ott.logic.notifications;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.v4.app.C0425x.C0421d;
import android.support.v4.app.C0425x.C0424o;
import android.support.v4.app.C0425x.C4791c;
import android.support.v4.app.C0425x.C4792f;
import android.support.v7.app.C4872n.C4871a;
import java.util.ArrayList;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.p261a.p323v.p325b.C2752d;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.p246d.p248b.C2539e;
import mobi.mmdt.ott.provider.p385g.C2978e;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.view.newdesign.mainpage.MainActivity;
import mobi.mmdt.ott.view.tools.C4522p;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class C2873a {
    private static final long[] f8973a = new long[]{0, 0};
    private static final long[] f8974b = new long[]{0, 500};
    private static final long[] f8975c = new long[]{0, 1000};
    private static final long[] f8976d = new long[]{0, 100, 0, 100};

    static /* synthetic */ class C28691 {
        static final /* synthetic */ int[] f8966a = new int[C2752d.m7078a().length];
        static final /* synthetic */ int[] f8967b = new int[C2539e.m6982a().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r0 = mobi.mmdt.ott.p246d.p248b.C2539e.m6982a();
            r0 = r0.length;
            r0 = new int[r0];
            f8967b = r0;
            r0 = 1;
            r1 = f8967b;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = mobi.mmdt.ott.p246d.p248b.C2539e.f8299b;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = 2;
            r2 = f8967b;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = mobi.mmdt.ott.p246d.p248b.C2539e.f8298a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = r3 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r2 = f8967b;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r3 = mobi.mmdt.ott.p246d.p248b.C2539e.f8301d;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r3 = r3 - r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r4 = 3;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2[r3] = r4;	 Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            r2 = f8967b;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r3 = mobi.mmdt.ott.p246d.p248b.C2539e.f8300c;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r3 = r3 - r0;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r4 = 4;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r2[r3] = r4;	 Catch:{ NoSuchFieldError -> 0x0029 }
        L_0x0029:
            r2 = f8967b;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r3 = mobi.mmdt.ott.p246d.p248b.C2539e.f8302e;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r3 = r3 - r0;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r4 = 5;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r2[r3] = r4;	 Catch:{ NoSuchFieldError -> 0x0031 }
        L_0x0031:
            r2 = mobi.mmdt.ott.logic.p261a.p323v.p325b.C2752d.m7078a();
            r2 = r2.length;
            r2 = new int[r2];
            f8966a = r2;
            r2 = f8966a;	 Catch:{ NoSuchFieldError -> 0x0041 }
            r3 = mobi.mmdt.ott.logic.p261a.p323v.p325b.C2752d.f8704d;	 Catch:{ NoSuchFieldError -> 0x0041 }
            r3 = r3 - r0;	 Catch:{ NoSuchFieldError -> 0x0041 }
            r2[r3] = r0;	 Catch:{ NoSuchFieldError -> 0x0041 }
        L_0x0041:
            r2 = f8966a;	 Catch:{ NoSuchFieldError -> 0x0048 }
            r3 = mobi.mmdt.ott.logic.p261a.p323v.p325b.C2752d.f8703c;	 Catch:{ NoSuchFieldError -> 0x0048 }
            r3 = r3 - r0;	 Catch:{ NoSuchFieldError -> 0x0048 }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x0048 }
        L_0x0048:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.notifications.a.1.<clinit>():void");
        }
    }

    public static void m7225a() {
        ((NotificationManager) MyApplication.m12952b().getSystemService("notification")).cancel(110);
    }

    public static void m7226a(Bitmap bitmap, String str, String str2, String str3, String str4, int i, String str5, boolean z) {
        String str6;
        CharSequence charSequence = str;
        int i2 = i;
        C0421d c4871a = new C4871a(MyApplication.m12952b());
        C0424o c4791c = new C4791c();
        c4791c.m9137a(charSequence).m9140c(str2);
        if (i2 > 1) {
            str6 = str3;
            c4791c.m9139b(str6);
        } else {
            str6 = str3;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(charSequence);
        stringBuilder.append(": ");
        stringBuilder.append(str4);
        C2873a.m7227a(c4871a, c4791c, charSequence, str6, bitmap, stringBuilder.toString(), str5, z, false, 0);
        NotificationManager notificationManager = (NotificationManager) MyApplication.m12952b().getSystemService("notification");
        if (i2 > 1) {
            c4871a.f1513i = i2;
        }
        notificationManager.notify(110, c4871a.m848a());
    }

    private static void m7227a(C4871a c4871a, C0424o c0424o, String str, String str2, Bitmap bitmap, String str3, String str4, boolean z, boolean z2, int i) {
        Intent intent;
        long[] jArr;
        PendingIntent activity;
        C0421d b = c4871a.m852a(c0424o).m849a((int) R.drawable.ic_notification_logo).m853a((CharSequence) str).m855b((CharSequence) str2);
        b.f1511g = bitmap;
        b.m856b(16);
        b.f1530z = "msg";
        int i2 = 1;
        CharSequence stringBuilder;
        C0421d a;
        if (str4 == null || str4.isEmpty()) {
            if (z2) {
                switch (C28691.f8966a[i - 1]) {
                    case 1:
                        intent = new Intent(MyApplication.m12952b(), MainActivity.class);
                        break;
                    case 2:
                        intent = new Intent(MyApplication.m12952b(), MainActivity.class);
                        break;
                    default:
                        intent = new Intent(MyApplication.m12952b(), MainActivity.class);
                        break;
                }
            }
            jArr = null;
            if (z) {
                Uri E = C2535a.m6888a().m6894E();
                if (str3.length() > 140) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(str3.substring(0, 140));
                    stringBuilder2.append("...");
                    stringBuilder = stringBuilder2.toString();
                }
                if (VERSION.SDK_INT >= 16) {
                    c4871a.f1514j = 1;
                }
                switch (C28691.f8967b[C2535a.m6888a().m6890A() - 1]) {
                    case 1:
                        jArr = f8974b;
                        break;
                    case 2:
                        jArr = f8973a;
                        break;
                    case 3:
                        jArr = f8975c;
                        break;
                    case 4:
                        jArr = f8976d;
                        break;
                    case 5:
                        c4871a.f1503M.defaults = 2;
                        break;
                    default:
                        break;
                }
                if (jArr != null) {
                    c4871a.m854a(jArr);
                }
                int K = C2535a.m6888a().m6899K();
                a = c4871a.m857c(stringBuilder).m851a(E);
                a.f1503M.ledARGB = K;
                a.f1503M.ledOnMS = IjkMediaCodecInfo.RANK_MAX;
                a.f1503M.ledOffMS = IjkMediaCodecInfo.RANK_MAX;
                if (a.f1503M.ledOnMS != 0 || a.f1503M.ledOffMS == 0) {
                    i2 = 0;
                }
                a.f1503M.flags = (a.f1503M.flags & -2) | i2;
                return;
            }
            c4871a.m857c(null).m851a(null).m854a(f8973a);
        }
        Intent intent2;
        String str5;
        if (C2999a.m7500a(str4) != null) {
            intent2 = new Intent(MyApplication.m12952b(), MainActivity.class);
            intent2.setFlags(603979776);
            str5 = "KEY_START_SINGLE_PARTY";
        } else if (C2980g.m7433a(str4).f9299s.equals(C2978e.GROUP)) {
            intent2 = new Intent(MyApplication.m12952b(), MainActivity.class);
            intent2.setFlags(603979776);
            str5 = "KEY_START_GROUP_PARTY";
        } else if (C2980g.m7433a(str4) != null) {
            intent2 = new Intent(MyApplication.m12952b(), MainActivity.class);
            intent2.setFlags(603979776);
            str5 = "KEY_START_CHANNEL_PARTY";
        } else {
            intent = new Intent(MyApplication.m12952b(), MainActivity.class);
        }
        intent2.putExtra(str5, str4);
        activity = PendingIntent.getActivity(MyApplication.m12952b(), 110, intent2, 134217728);
        c4871a.f1508d = activity;
        jArr = null;
        if (z) {
            c4871a.m857c(null).m851a(null).m854a(f8973a);
        }
        Uri E2 = C2535a.m6888a().m6894E();
        if (str3.length() > 140) {
            StringBuilder stringBuilder22 = new StringBuilder();
            stringBuilder22.append(str3.substring(0, 140));
            stringBuilder22.append("...");
            stringBuilder = stringBuilder22.toString();
        }
        if (VERSION.SDK_INT >= 16) {
            c4871a.f1514j = 1;
        }
        switch (C28691.f8967b[C2535a.m6888a().m6890A() - 1]) {
            case 1:
                jArr = f8974b;
                break;
            case 2:
                jArr = f8973a;
                break;
            case 3:
                jArr = f8975c;
                break;
            case 4:
                jArr = f8976d;
                break;
            case 5:
                c4871a.f1503M.defaults = 2;
                break;
            default:
                break;
        }
        if (jArr != null) {
            c4871a.m854a(jArr);
        }
        int K2 = C2535a.m6888a().m6899K();
        a = c4871a.m857c(stringBuilder).m851a(E2);
        a.f1503M.ledARGB = K2;
        a.f1503M.ledOnMS = IjkMediaCodecInfo.RANK_MAX;
        a.f1503M.ledOffMS = IjkMediaCodecInfo.RANK_MAX;
        if (a.f1503M.ledOnMS != 0) {
        }
        i2 = 0;
        a.f1503M.flags = (a.f1503M.flags & -2) | i2;
        return;
        intent.setFlags(603979776);
        activity = PendingIntent.getActivity(MyApplication.m12952b(), 110, intent, 134217728);
        c4871a.f1508d = activity;
        jArr = null;
        if (z) {
            Uri E22 = C2535a.m6888a().m6894E();
            if (str3.length() > 140) {
                StringBuilder stringBuilder222 = new StringBuilder();
                stringBuilder222.append(str3.substring(0, 140));
                stringBuilder222.append("...");
                stringBuilder = stringBuilder222.toString();
            }
            if (VERSION.SDK_INT >= 16) {
                c4871a.f1514j = 1;
            }
            switch (C28691.f8967b[C2535a.m6888a().m6890A() - 1]) {
                case 1:
                    jArr = f8974b;
                    break;
                case 2:
                    jArr = f8973a;
                    break;
                case 3:
                    jArr = f8975c;
                    break;
                case 4:
                    jArr = f8976d;
                    break;
                case 5:
                    c4871a.f1503M.defaults = 2;
                    break;
                default:
                    break;
            }
            if (jArr != null) {
                c4871a.m854a(jArr);
            }
            int K22 = C2535a.m6888a().m6899K();
            a = c4871a.m857c(stringBuilder).m851a(E22);
            a.f1503M.ledARGB = K22;
            a.f1503M.ledOnMS = IjkMediaCodecInfo.RANK_MAX;
            a.f1503M.ledOffMS = IjkMediaCodecInfo.RANK_MAX;
            if (a.f1503M.ledOnMS != 0) {
            }
            i2 = 0;
            a.f1503M.flags = (a.f1503M.flags & -2) | i2;
            return;
        }
        c4871a.m857c(null).m851a(null).m854a(f8973a);
    }

    public static void m7228a(ArrayList<String> arrayList, String str, String str2, int i, boolean z, int i2) {
        C0421d c4871a = new C4871a(MyApplication.m12952b());
        C0424o c4792f = new C4792f();
        CharSequence a = C4522p.m8236a(R.string.app_name);
        String str3 = str2;
        c4792f.m9141a(a).m9143b(str3);
        for (int i3 = 0; i3 < Math.min(arrayList.size(), 10); i3++) {
            c4792f.m9144c((CharSequence) arrayList.get(i3));
        }
        C2873a.m7227a(c4871a, c4792f, a, str3, C2875c.m7231a(), str, "", z, true, i2);
        NotificationManager notificationManager = (NotificationManager) MyApplication.m12952b().getSystemService("notification");
        c4871a.f1513i = i;
        notificationManager.notify(110, c4871a.m848a());
    }
}
