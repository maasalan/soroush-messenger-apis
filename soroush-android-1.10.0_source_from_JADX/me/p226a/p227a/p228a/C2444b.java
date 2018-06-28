package me.p226a.p227a.p228a;

import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

public final class C2444b extends HandlerThread {
    private C2441a f8128a;

    class C24431 implements Runnable {
        final /* synthetic */ int f8126a;
        final /* synthetic */ C2444b f8127b;

        public C24431(C2444b c2444b, int i) {
            this.f8127b = c2444b;
            this.f8126a = i;
        }

        public final void run() {
            final Camera a = C2448d.m6683a(this.f8126a);
            new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                final /* synthetic */ C24431 f8125b;

                public final void run() {
                    C2441a a = this.f8125b.f8127b.f8128a;
                    Camera camera = a;
                    a.setupCameraPreview(camera == null ? null : new C2449e(camera, this.f8125b.f8126a));
                }
            });
        }
    }

    public C2444b(C2441a c2441a) {
        super("CameraHandlerThread");
        this.f8128a = c2441a;
        start();
    }
}
