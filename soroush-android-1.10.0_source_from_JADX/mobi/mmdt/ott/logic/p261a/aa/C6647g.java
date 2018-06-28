package mobi.mmdt.ott.logic.p261a.aa;

import com.p072b.p073a.p074a.C1073q;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Timer;
import java.util.TimerTask;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.componentsutils.p232b.p518g.C5762a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import org.apache.p493a.p494a.p495a.C4604c;
import org.apache.p493a.p494a.p495a.C4605d;

public final class C6647g extends C5891a {
    private boolean f18920a = false;
    private long f18921b = 0;

    class C25811 extends TimerTask {
        final /* synthetic */ C6647g f8426a;

        C25811(C6647g c6647g) {
            this.f8426a = c6647g;
        }

        public final void run() {
            C6647g.m17144a(this.f8426a);
        }
    }

    public C6647g() {
        super(C2683h.f8619a);
    }

    static /* synthetic */ void m17144a(C6647g c6647g) {
        if (!c6647g.f18920a) {
            StringBuilder stringBuilder;
            try {
                C4604c a = new C5762a().m12939a(InetAddress.getByName("time-a.nist.gov"));
                long a2 = C4605d.m8339a(a.f12635a.mo2446b().f12641a);
                long longValue = a.f12636b.longValue();
                if (longValue < 1000) {
                    stringBuilder = new StringBuilder("ntp delay : ");
                    stringBuilder.append(longValue);
                    C2480b.m6742f(stringBuilder.toString());
                    long currentTimeMillis = (System.currentTimeMillis() - a2) - (longValue / 2);
                    c6647g.f18920a = true;
                    C2535a.m6888a().m6965q(true);
                    C2535a.m6888a().f8278a.edit().putLong("mobi.mmdt.ott.model.pref.KEY_TIME_DIFFERENCE", currentTimeMillis).apply();
                    StringBuilder stringBuilder2 = new StringBuilder("ntp OK ");
                    stringBuilder2.append(currentTimeMillis);
                    C2480b.m6736b(stringBuilder2.toString());
                    return;
                }
                stringBuilder = new StringBuilder("Ntp Delay: ");
                stringBuilder.append(longValue);
                stringBuilder.append(" > 1000");
                throw new IOException(stringBuilder.toString());
            } catch (Exception e) {
                stringBuilder = new StringBuilder("ntp failed ");
                stringBuilder.append(e.getMessage());
                C2480b.m6736b(stringBuilder.toString());
            }
        }
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        for (int i = 0; i < 20; i++) {
            new Timer().schedule(new C25811(this), this.f18921b);
            this.f18921b += 1000;
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
