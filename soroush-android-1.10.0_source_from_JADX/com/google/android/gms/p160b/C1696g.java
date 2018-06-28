package com.google.android.gms.p160b;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;

public final class C1696g {

    interface C5439b extends C1689a, C1690b {
    }

    static final class C6570a implements C5439b {
        public final CountDownLatch f17967a;

        private C6570a() {
            this.f17967a = new CountDownLatch(1);
        }

        public final void mo3005a() {
            this.f17967a.countDown();
        }

        public final void mo3006b() {
            this.f17967a.countDown();
        }
    }

    public static <TResult> TResult m4299a(C1692d<TResult> c1692d) {
        if (c1692d.mo1543b()) {
            return c1692d.mo1544c();
        }
        throw new ExecutionException(c1692d.mo1545d());
    }
}
