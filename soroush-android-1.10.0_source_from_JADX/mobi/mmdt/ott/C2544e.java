package mobi.mmdt.ott;

import java.util.Timer;
import java.util.TimerTask;

public final class C2544e implements Runnable {
    public Timer f8306a;
    public int f8307b = 10000;
    public Runnable f8308c;

    class C25411 extends TimerTask {
        final /* synthetic */ C2544e f8304a;

        public C25411(C2544e c2544e) {
            this.f8304a = c2544e;
        }

        public final void run() {
            new Thread(this.f8304a).start();
        }
    }

    public final void run() {
        if (this.f8308c != null) {
            this.f8308c.run();
        }
    }
}
