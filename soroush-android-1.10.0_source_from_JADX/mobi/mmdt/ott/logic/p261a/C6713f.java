package mobi.mmdt.ott.logic.p261a;

import android.content.Intent;
import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.core.StartUpService;
import mobi.mmdt.ott.logic.notifications.C2873a;
import mobi.mmdt.ott.logic.notifications.C2874b;
import mobi.mmdt.ott.logic.notifications.notifsData.UpdateNotificationService;
import mobi.mmdt.ott.logic.p368p.C6004c;
import mobi.mmdt.ott.logic.sync.C2905d;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.C2960d;
import mobi.mmdt.ott.provider.C2963e;
import p000a.p001a.p002a.C0005c;

public final class C6713f extends C5891a {
    public C6713f() {
        super(C2683h.f8620b);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C6004c.m13279a().m13284c();
        C2535a.m6888a().m6923b(true);
        StartUpService.m7130e();
        C2873a.m7225a();
        MyApplication.m12952b().stopService(new Intent(MyApplication.m12952b(), UpdateNotificationService.class));
        C6004c.m13279a().m13284c();
        C2535a.m6888a().m6892C();
        C2963e.m7389a(C2960d.m7386a(MyApplication.m12952b()).getWritableDatabase());
        C2905d.m7283b();
        C2874b.m7230a(0);
        C0005c.m0a().m9d(new C2680g());
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
