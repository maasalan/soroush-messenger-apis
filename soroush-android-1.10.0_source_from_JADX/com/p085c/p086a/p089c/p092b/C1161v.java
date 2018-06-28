package com.p085c.p086a.p089c.p092b;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.p085c.p086a.p109i.C1273i;

final class C1161v {
    private boolean f3718a;
    private final Handler f3719b = new Handler(Looper.getMainLooper(), new C1160a());

    private static class C1160a implements Callback {
        C1160a() {
        }

        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((C1159s) message.obj).mo1182d();
            return true;
        }
    }

    C1161v() {
    }

    public final void m2777a(C1159s<?> c1159s) {
        C1273i.m3021a();
        if (this.f3718a) {
            this.f3719b.obtainMessage(1, c1159s).sendToTarget();
            return;
        }
        this.f3718a = true;
        c1159s.mo1182d();
        this.f3718a = false;
    }
}
