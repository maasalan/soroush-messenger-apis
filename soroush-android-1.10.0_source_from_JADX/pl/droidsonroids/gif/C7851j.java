package pl.droidsonroids.gif;

import java.lang.Thread.UncaughtExceptionHandler;

abstract class C7851j implements Runnable {
    final C7839a f24936c;

    C7851j(C7839a c7839a) {
        this.f24936c = c7839a;
    }

    abstract void mo4806a();

    public final void run() {
        try {
            if (!this.f24936c.f24890f.m22117j()) {
                mo4806a();
            }
        } catch (Throwable th) {
            UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
