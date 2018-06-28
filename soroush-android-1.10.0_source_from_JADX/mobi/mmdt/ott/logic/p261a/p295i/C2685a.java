package mobi.mmdt.ott.logic.p261a.p295i;

import java.util.TimerTask;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2968f;

final class C2685a {

    static class C26841 extends TimerTask {
        final /* synthetic */ String f8623a;
        final /* synthetic */ long f8624b;
        final /* synthetic */ String f8625c;

        C26841(String str, long j, String str2) {
            this.f8623a = str;
            this.f8624b = j;
            this.f8625c = str2;
        }

        public final void run() {
            C2968f a = C2966b.m7400a(this.f8623a);
            if (a != null) {
                Long l = a.f9210f;
                if (l == null || l.longValue() < this.f8624b) {
                    C2966b.m7395a(this.f8623a, this.f8625c, this.f8624b);
                }
            }
        }
    }
}
