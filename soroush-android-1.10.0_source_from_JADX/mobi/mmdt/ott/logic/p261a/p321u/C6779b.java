package mobi.mmdt.ott.logic.p261a.p321u;

import android.content.Intent;
import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.notifications.C2873a;
import mobi.mmdt.ott.logic.notifications.C2874b;
import mobi.mmdt.ott.logic.notifications.notifsData.UpdateNotificationService;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p368p.C6004c;

public final class C6779b extends C5891a {
    public C6779b() {
        super(C2683h.f8622d);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C6004c.m13279a().m13284c();
        C2873a.m7225a();
        MyApplication.m12952b().stopService(new Intent(MyApplication.m12952b(), UpdateNotificationService.class));
        C2874b.m7230a(0);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
