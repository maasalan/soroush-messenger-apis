package pl.droidsonroids.gif;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;

final class C7842c extends ScheduledThreadPoolExecutor {

    private static final class C7841a {
        private static final C7842c f24928a = new C7842c();
    }

    private C7842c() {
        super(1, new DiscardPolicy());
    }

    static C7842c m22129a() {
        return C7841a.f24928a;
    }
}
