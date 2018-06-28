package mobi.mmdt.ott;

import android.app.Application;
import android.arch.lifecycle.C0093d.C0091a;
import android.arch.lifecycle.C0095f;
import android.arch.lifecycle.C0102m;
import android.arch.lifecycle.C4683n;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.support.p025c.C0158b;
import android.util.DisplayMetrics;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.liulishuo.filedownloader.C2216q;
import com.liulishuo.filedownloader.p198a.C5649c.C2133a;
import com.liulishuo.filedownloader.p198a.C5649c.C5648b;
import com.liulishuo.filedownloader.services.C2222c.C2221a;
import com.p072b.p073a.p074a.C1063i;
import com.p072b.p073a.p074a.C1067k;
import com.p072b.p073a.p074a.C1067k.C5096a;
import com.p072b.p073a.p074a.C1070n;
import com.p072b.p073a.p074a.C1076t;
import com.p072b.p073a.p074a.p075b.C1020a;
import com.p072b.p073a.p074a.p075b.C1020a.C1019a;
import com.p072b.p073a.p074a.p078e.C1027a;
import com.p072b.p073a.p074a.p079f.p511a.C5083h;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C1237f;
import com.p085c.p086a.p109i.C1273i;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.componentsutils.p232b.p235c.C2481c;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.C2815f;
import mobi.mmdt.ott.logic.core.C2796b;
import mobi.mmdt.ott.logic.p261a.aa.C6644c;
import mobi.mmdt.ott.logic.p261a.ae.p544b.C6660a;
import mobi.mmdt.ott.logic.p261a.ag.p272a.C2616b;
import mobi.mmdt.ott.logic.p261a.ag.p545b.C6675b;
import mobi.mmdt.ott.logic.p261a.p281e.p282a.C2635a;
import mobi.mmdt.ott.logic.p261a.p281e.p282a.C2636b;
import mobi.mmdt.ott.logic.p261a.p323v.C6780a;
import mobi.mmdt.ott.logic.p261a.p323v.p324a.C2748b;
import mobi.mmdt.ott.logic.p261a.p323v.p325b.C6781a;
import mobi.mmdt.ott.logic.p261a.p323v.p325b.C6783e;
import mobi.mmdt.ott.logic.p360l.C2845b;
import mobi.mmdt.ott.logic.p360l.C2849f;
import mobi.mmdt.ott.logic.p368p.C2881b;
import mobi.mmdt.ott.logic.p368p.C6004c;
import mobi.mmdt.ott.p240c.p241a.C5770a;
import mobi.mmdt.ott.p246d.C2534a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.call.FeedbackActivityDialog;
import mobi.mmdt.ott.view.conversation.C3290a;
import mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.emoji.C4031b;
import mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.emoji.C4032c;
import mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.emoji.C4033d;
import mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.emoji.C4034e;
import mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.emoji.C4035f;
import mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.emoji.Emojicon;
import mobi.mmdt.ott.view.conversation.p573f.C7197a;
import mobi.mmdt.ott.view.tools.p478b.C4484a;
import mobi.mmdt.ott.view.tools.p480d.C4503a;
import p000a.p001a.p002a.C0005c;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public class MyApplication extends C0158b {
    private static MyApplication f15874U = null;
    public static int f15875a = 0;
    public static int f15876b = 1;
    public static int f15877c = 2;
    public static int f15878d = 3;
    public static int f15879e = 4;
    public static int f15880f = 5;
    public static int f15881g = 6;
    public static int f15882h = 7;
    public static int f15883i = 8;
    public static int f15884j = 9;
    public static int f15885k = 10;
    public C1067k f15886A;
    public C1067k f15887B;
    public boolean f15888C = false;
    public long f15889D = 8000;
    public boolean f15890E = false;
    public C3290a f15891F = C3290a.NOTHING;
    public Uri f15892G = null;
    public int f15893H = 0;
    public C2796b f15894I;
    public C2845b f15895J;
    public Messenger f15896K;
    public int f15897L = 0;
    public boolean f15898M = false;
    public boolean f15899N = false;
    public long f15900O;
    public long f15901P;
    public boolean f15902Q = false;
    private boolean f15903R = false;
    private FirebaseAnalytics f15904S;
    private Locale f15905T = null;
    public int[] f15906l = new int[f15885k];
    public int f15907m = 0;
    public HashMap<String, C2534a> f15908n = new HashMap();
    public C4484a f15909o;
    public LinkedHashMap<Long, C7197a> f15910p = new LinkedHashMap();
    public String f15911q = "";
    public LinkedHashMap<String, Boolean> f15912r = new LinkedHashMap();
    public LinkedHashMap<String, Boolean> f15913s = new LinkedHashMap();
    public LinkedHashMap<String, Boolean> f15914t = new LinkedHashMap();
    public LinkedHashMap<String, String> f15915u = new LinkedHashMap();
    public LinkedHashMap<String, Boolean> f15916v = new LinkedHashMap();
    public HashMap<String, Bundle> f15917w = new HashMap();
    public String f15918x = null;
    public C2881b f15919y;
    public C1067k f15920z;

    class C24941 extends Thread {
        final /* synthetic */ String f8171a;
        final /* synthetic */ C1063i f8172b;
        final /* synthetic */ MyApplication f8173c;

        public C24941(MyApplication myApplication, String str, C1063i c1063i) {
            this.f8173c = myApplication;
            this.f8171a = str;
            this.f8172b = c1063i;
        }

        public final void run() {
            C1067k a = this.f8173c.f15887B;
            String str = this.f8171a;
            String str2 = "Cannot call this method on main thread.";
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                throw new C1076t(str2);
            }
            str2 = "Cannot call getJobStatus on JobManager's thread";
            if (Thread.currentThread() == a.f3486e) {
                throw new C1076t(str2);
            }
            C5083h c5083h = (C5083h) a.f3485d.m2518a(C5083h.class);
            c5083h.f14191e = 4;
            c5083h.f14192f = str;
            c5083h.f14190d = null;
            if (C1070n.m2590a()[new C5096a(a.f3484c, c5083h).m10410a().intValue()] == C1070n.f3492d) {
                this.f8173c.f15887B.m2577a(this.f8172b);
            }
        }
    }

    class C24952 implements Runnable {
        final /* synthetic */ MyApplication f8174a;

        public C24952(MyApplication myApplication) {
            this.f8174a = myApplication;
        }

        public final void run() {
            if (this.f8174a.f15907m == 0) {
                C1212c.m2871a(this.f8174a.getApplicationContext()).m2878a();
                if (this.f8174a.f15909o != null) {
                    this.f8174a.f15909o.f12423b.evictAll();
                }
                if (this.f8174a.f15898M) {
                    C5770a.m12970c().m12994b(true);
                    this.f8174a.f15898M = false;
                }
            }
        }
    }

    class C24966 implements Runnable {
        final /* synthetic */ MyApplication f8175a;

        public C24966(MyApplication myApplication) {
            this.f8175a = myApplication;
        }

        public final void run() {
            MyApplication myApplication = this.f8175a;
            if (C4484a.f12422a == null) {
                C4484a.f12422a = new C4484a();
            }
            myApplication.f15909o = C4484a.f12422a;
            MyApplication.m12951a(this.f8175a, C4031b.f11587a);
            MyApplication.m12951a(this.f8175a, C4032c.f11588a);
            MyApplication.m12951a(this.f8175a, C4033d.f11589a);
            MyApplication.m12951a(this.f8175a, C4034e.f11590a);
            MyApplication.m12951a(this.f8175a, C4035f.f11591a);
        }
    }

    class C57633 implements C1027a {
        final /* synthetic */ MyApplication f15870a;

        C57633(MyApplication myApplication) {
            this.f15870a = myApplication;
        }

        public final void mo1076a(String str, Object... objArr) {
            C2480b.m6732a(String.format(str, objArr));
        }

        public final void mo1077a(Throwable th, String str, Object... objArr) {
            C2480b.m6737b(String.format(str, objArr), th);
        }

        public final boolean mo1078a() {
            return this.f15870a.f15903R;
        }
    }

    class C57644 implements C1027a {
        final /* synthetic */ MyApplication f15871a;

        C57644(MyApplication myApplication) {
            this.f15871a = myApplication;
        }

        public final void mo1076a(String str, Object... objArr) {
            C2480b.m6732a(String.format(str, objArr));
        }

        public final void mo1077a(Throwable th, String str, Object... objArr) {
            C2480b.m6737b(String.format(str, objArr), th);
        }

        public final boolean mo1078a() {
            return this.f15871a.f15903R;
        }
    }

    class C57655 implements C1027a {
        final /* synthetic */ MyApplication f15872a;

        C57655(MyApplication myApplication) {
            this.f15872a = myApplication;
        }

        public final void mo1076a(String str, Object... objArr) {
            C2480b.m6732a(String.format(str, objArr));
        }

        public final void mo1077a(Throwable th, String str, Object... objArr) {
            C2480b.m6737b(String.format(str, objArr), th);
        }

        public final boolean mo1078a() {
            return this.f15872a.f15903R;
        }
    }

    public class AppLifecycleListener implements C0095f {
        final /* synthetic */ MyApplication f15873a;

        public AppLifecycleListener(MyApplication myApplication) {
            this.f15873a = myApplication;
        }

        @C0102m(a = C0091a.ON_STOP)
        public void onMoveToBackground() {
            C2480b.m6742f("app moved to background");
        }

        @C0102m(a = C0091a.ON_START)
        public void onMoveToForeground() {
            C2480b.m6742f("app moved to foreground");
            C2815f.m7153a();
        }
    }

    public MyApplication() {
        f15874U = this;
    }

    public static MyApplication m12950a() {
        return f15874U;
    }

    static /* synthetic */ void m12951a(MyApplication myApplication, Emojicon[] emojiconArr) {
        for (Emojicon emojicon : emojiconArr) {
            int i = emojicon.f11580e;
            Bitmap decodeResource = BitmapFactory.decodeResource(myApplication.getResources(), i);
            if (!(decodeResource == null || myApplication.f15909o == null)) {
                myApplication.f15909o.m8175a(Integer.valueOf(i), decodeResource);
            }
        }
    }

    public static Context m12952b() {
        return f15874U.getApplicationContext();
    }

    public final Bundle m12956a(String str) {
        if (this.f15917w.containsKey(str)) {
            return (Bundle) this.f15917w.get(str);
        }
        Bundle bundle = new Bundle();
        this.f15917w.put(str, bundle);
        return bundle;
    }

    public final void m12957a(String str, Bundle bundle) {
        this.f15904S.logEvent(str, bundle);
    }

    public final void m12958a(C2845b c2845b) {
        this.f15895J = c2845b;
        C0005c.m0a().m9d(new C2849f());
    }

    public final void m12959b(String str) {
        Locale locale = new Locale(str);
        Resources resources = getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        configuration.locale = locale;
        resources.updateConfiguration(configuration, displayMetrics);
        C2535a.m6888a().f8278a.edit().putString("mobi.mmdt.ott.model.pref.PrefKeys.KEY_SETTING_LANGUAGE", str).apply();
    }

    public final void m12960c(String str) {
        this.f15904S.logEvent(str, null);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f15905T != null) {
            Locale locale = new Locale(C2535a.m6888a().m6919b());
            Locale.setDefault(locale);
            Configuration configuration2 = new Configuration(configuration);
            configuration2.locale = locale;
            getBaseContext().getResources().updateConfiguration(configuration2, getBaseContext().getResources().getDisplayMetrics());
        }
    }

    public void onCreate() {
        super.onCreate();
        m12958a(C2845b.WAITING_FOR_NETWORK);
        C4683n.m8550a().mo39d().mo34a(new AppLifecycleListener(this));
        C0005c.m0a().m6a((Object) this);
        C1020a b = new C1019a(this).m2489a(new C57633(this)).m2487a().m2490b(20).m2492c(10).m2488a((int) IjkMediaCodecInfo.RANK_SECURE).m2491b();
        C1020a b2 = new C1019a(this).m2489a(new C57644(this)).m2487a().m2490b(10).m2492c(5).m2488a(15).m2491b();
        C1020a b3 = new C1019a(this).m2489a(new C57655(this)).m2487a().m2490b(10).m2492c(5).m2488a((int) IjkMediaCodecInfo.RANK_SECURE).m2491b();
        this.f15920z = new C1067k(b);
        this.f15886A = new C1067k(b2);
        this.f15887B = new C1067k(b3);
        C4503a.m8195a();
        Configuration configuration = getBaseContext().getResources().getConfiguration();
        String b4 = C2535a.m6888a().m6919b();
        if (!("".equals(b4) || configuration.locale.getLanguage().equals(b4))) {
            this.f15905T = new Locale(b4);
            Locale.setDefault(this.f15905T);
            configuration.locale = this.f15905T;
            getBaseContext().getResources().updateConfiguration(configuration, getBaseContext().getResources().getDisplayMetrics());
        }
        C2808d.m7147a(new C6660a());
        C2808d.m7149c(new C6780a());
        C1212c a = C1212c.m2871a((Context) this);
        C1237f c1237f = C1237f.LOW;
        C1273i.m3021a();
        a.f3831b.m2717a(c1237f.f3899d);
        a.f3830a.mo1136a(c1237f.f3899d);
        a.f3838i = c1237f;
        this.f15904S = FirebaseAnalytics.getInstance(getApplicationContext());
        C2221a a2 = C2216q.m6074a((Application) this);
        C2133a c2133a = new C2133a();
        c2133a.f7125c = Integer.valueOf(15000);
        c2133a.f7124b = Integer.valueOf(15000);
        a2.f7325d = new C5648b(c2133a);
    }

    public void onEvent(C2481c c2481c) {
        C2808d.m7149c(new C6644c(c2481c));
    }

    public void onEvent(C2616b c2616b) {
        C2808d.m7147a(new C6675b());
    }

    public void onEvent(C2635a c2635a) {
        String str;
        if (c2635a.f8539b != null) {
            str = c2635a.f8539b;
        } else {
            C6004c.m13279a();
            str = C6004c.m13280d();
        }
        C2808d.m7147a(new C6781a(c2635a.f8538a, str));
    }

    public void onEvent(final C2636b c2636b) {
        new Handler(Looper.getMainLooper()).post(new Runnable(this) {
            final /* synthetic */ MyApplication f8178b;

            class C24971 implements Runnable {
                final /* synthetic */ C24987 f8176a;

                C24971(C24987 c24987) {
                    this.f8176a = c24987;
                }

                public final void run() {
                    Intent intent = new Intent(this.f8176a.f8178b, FeedbackActivityDialog.class);
                    intent.putExtra("KEY_CALLER", c2636b.f8541a);
                    intent.putExtra("KEY_CALLEE", c2636b.f8542b);
                    intent.putExtra("KEY_DURATION", c2636b.f8543c);
                    intent.setFlags(268435456);
                    MyApplication.m12952b().startActivity(intent);
                }
            }

            public final void run() {
                new Handler().postDelayed(new C24971(this), 1000);
            }
        });
    }

    public void onEvent(C2748b c2748b) {
        C2480b.m6742f("UpdateNotificationJob OnNeedUpdateNotificationEvent");
        C2808d.m7148b(new C6783e(false, c2748b.f8692a));
    }

    public void onTerminate() {
        super.onTerminate();
        C0005c.m0a().m8c(this);
        unregisterReceiver(this.f15894I);
        this.f15907m = 0;
    }
}
