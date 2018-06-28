package mobi.mmdt.ott.logic.p261a.p323v;

import android.content.IntentFilter;
import com.google.android.gms.common.C5462e;
import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.core.C2796b;
import mobi.mmdt.ott.logic.core.StartUpService;
import mobi.mmdt.ott.logic.fcm.C6803a;
import mobi.mmdt.ott.logic.notifications.C2874b;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.aa.C6647g;
import mobi.mmdt.ott.logic.p261a.aa.p265a.C2577a;
import mobi.mmdt.ott.logic.p261a.af.C2608b;
import mobi.mmdt.ott.logic.p351h.p352a.p353a.C6804a;
import mobi.mmdt.ott.logic.p368p.C6004c;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p384f.C6019d;
import mobi.mmdt.ott.provider.p384f.C6021g;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.view.tools.C4502c;
import p000a.p001a.p002a.C0005c;

public final class C6780a extends C5891a {
    public C6780a() {
        super(C2683h.f8622d);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        MyApplication.m12950a().f15900O = C2778b.m7093a();
        C2808d.m7148b(new C6647g());
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            MyApplication.m12950a().f15894I = new C2796b();
            MyApplication.m12952b().registerReceiver(MyApplication.m12950a().f15894I, intentFilter);
        } catch (Throwable e) {
            C2480b.m6737b("Problem in screen observer receiver", e);
        }
        if (C4502c.f12455a == null) {
            C4502c.f12455a = new C4502c();
        }
        C6004c.m13279a().m13284c();
        StartUpService.m7128c();
        C2874b.m7229a();
        if (!C2535a.m6888a().f8278a.getBoolean("mobi.mmdt.ott.model.pref.KEY_IS_SEEN_INITIALIZED", false)) {
            C6019d c6019d = new C6019d();
            c6019d.m13351d();
            C6021g c6021g = new C6021g();
            c6021g.m13388b(C2971k.NOT_READ);
            c6019d.m13332a(c6021g);
            C2535a.m6888a().f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_IS_SEEN_INITIALIZED", true).apply();
        }
        if (!(C2535a.m6888a().m6905Q() || !C2535a.m6888a().m6952j() || C2535a.m6888a().m6902N())) {
            C2808d.m7147a(new C6803a());
        }
        C2808d.m7148b(new C6804a());
        MyApplication.m12950a().f15897L = C2999a.m7510c();
        C0005c.m0a().m9d(new C2577a());
        if (C5462e.m11799a(MyApplication.m12952b()) == 0) {
            C2480b.m6742f("google play service available");
            C2535a.m6888a().m6971t(true);
        } else {
            C2535a.m6888a().m6971t(false);
            C2480b.m6742f(" google play service unavailable");
        }
        C2608b.m7039a();
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
