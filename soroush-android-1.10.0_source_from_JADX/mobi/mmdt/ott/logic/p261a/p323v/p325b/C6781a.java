package mobi.mmdt.ott.logic.p261a.p323v.p325b;

import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.support.v7.app.C4872n.C4871a;
import com.p072b.p073a.p074a.C1073q;
import java.util.Timer;
import java.util.TimerTask;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.notifications.C2875c;
import mobi.mmdt.ott.logic.notifications.p365a.C2872a;
import mobi.mmdt.ott.logic.notifications.p365a.C2872a.C2871a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.aa.C6643b;
import mobi.mmdt.ott.logic.p368p.C2881b;
import mobi.mmdt.ott.logic.p368p.C6004c;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p389k.C3001e;
import mobi.mmdt.ott.view.tools.C4508f;
import mobi.mmdt.ott.view.tools.C4522p;
import org.linphone.customized.CustomizedCallManager;

public final class C6781a extends C5891a {
    private C2881b f19361a;
    private String f19362b;
    private C3001e f19363c;

    public C6781a(C2881b c2881b, String str) {
        super(C2683h.f8621c);
        this.f19361a = c2881b;
        this.f19362b = str;
    }

    public final void onAdded() {
        this.f19363c = C2999a.m7500a(this.f19362b);
        if (this.f19362b != null && this.f19363c == null) {
            C2808d.m7148b(new C6643b(new String[]{this.f19362b}, false, false));
        }
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        Bitmap a;
        if (this.f19363c == null) {
            this.f19363c = C2999a.m7500a(this.f19362b);
        }
        String str = null;
        if (this.f19363c != null) {
            str = this.f19363c.f9422h ? C4508f.m8221a(this.f19363c.f9425k, this.f19363c.f9420f) : C4508f.m8220a(this.f19363c.f9416b);
            a = (this.f19363c.f9417c == null || this.f19363c.f9417c.isEmpty()) ? C2875c.m7231a() : C2491i.m6761a(MyApplication.m12952b(), C2556b.m6998a(this.f19363c.f9417c));
        } else {
            a = null;
        }
        if (!this.f19361a.equals(C2881b.f8993a)) {
            String str2;
            C4871a a2;
            if (this.f19361a.equals(C2881b.f8994b)) {
                str2 = this.f19362b;
                a2 = C2872a.m7222a(str, C4522p.m8236a(R.string.incoming_call_notification), a);
                C2872a.m7224a(str2, C2871a.f8969a, a2);
                ((NotificationManager) MyApplication.m12952b().getSystemService("notification")).notify(120, a2.m848a());
            } else if (this.f19361a.equals(C2881b.f8995c)) {
                str2 = this.f19362b;
                a2 = C2872a.m7222a(str, C4522p.m8236a(R.string.dialing_notification), a);
                C2872a.m7224a(str2, C2871a.f8971c, a2);
                ((NotificationManager) MyApplication.m12952b().getSystemService("notification")).notify(120, a2.m848a());
                C2751b a3 = C2751b.m7076a();
                str = this.f19362b;
                a3.f8698a = C2970j.OUT;
                a3.f8699b = str;
            } else if (!(this.f19361a.equals(C2881b.f8996d) || this.f19361a.equals(C2881b.f8997e) || this.f19361a.equals(C2881b.f8998f) || this.f19361a.equals(C2881b.f8999g))) {
                if (this.f19361a.equals(C2881b.f9000h)) {
                    str2 = this.f19362b;
                    a2 = C2872a.m7222a(str, C4522p.m8236a(R.string.in_call_notification), a);
                    C2872a.m7224a(str2, C2871a.f8970b, a2);
                    ((NotificationManager) MyApplication.m12952b().getSystemService("notification")).notify(120, a2.m848a());
                    final Timer timer = new Timer();
                    timer.schedule(new TimerTask(this) {
                        final /* synthetic */ C6781a f8696b;

                        public final void run() {
                            C2480b.m6742f("run timer for call duration");
                            long duration = (long) CustomizedCallManager.getInstance().getDuration(MyApplication.m12952b());
                            if (duration != -1) {
                                C2751b.m7076a().f8700c = duration;
                                return;
                            }
                            timer.cancel();
                            timer.purge();
                        }
                    }, 1000, 1000);
                } else if (!(this.f19361a.equals(C2881b.f9001i) || this.f19361a.equals(C2881b.f9002j) || this.f19361a.equals(C2881b.f9003k) || this.f19361a.equals(C2881b.f9004l))) {
                    if (!this.f19361a.equals(C2881b.f9005m)) {
                        if (!this.f19361a.equals(C2881b.f9006n)) {
                            if (!(this.f19361a.equals(C2881b.f9007o) || this.f19361a.equals(C2881b.f9008p) || this.f19361a.equals(C2881b.f9009q) || this.f19361a.equals(C2881b.f9010r) || !this.f19361a.equals(C2881b.f9011s))) {
                                C2872a.m7223a();
                                C2751b.m7076a().m7077a("");
                                C6004c.m13279a().m13284c();
                            }
                        }
                    }
                    C2872a.m7223a();
                    C2751b.m7076a().m7077a("");
                }
            }
        }
        MyApplication.m12950a().f15919y = this.f19361a;
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
