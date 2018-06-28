package mobi.mmdt.ott.logic.p261a.p295i;

import java.util.TimerTask;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2968f;

final class C2690e {

    static class C26891 extends TimerTask {
        final /* synthetic */ String f8627a;
        final /* synthetic */ long f8628b;
        final /* synthetic */ String f8629c;

        C26891(String str, long j, String str2) {
            this.f8627a = str;
            this.f8628b = j;
            this.f8629c = str2;
        }

        public final void run() {
            C2968f a = C2966b.m7400a(this.f8627a);
            if (a != null) {
                Long l = a.f9210f;
                if (l == null || l.longValue() < this.f8628b) {
                    C2966b.m7395a(this.f8627a, this.f8629c, this.f8628b);
                }
            }
        }
    }
}
