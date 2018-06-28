package com.google.firebase.crash;

import android.content.Context;
import android.support.annotation.Keep;
import android.util.Log;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.md;
import com.google.android.gms.internal.me;
import com.google.android.gms.internal.mg;
import com.google.android.gms.internal.mk;
import com.google.android.gms.internal.ml;
import com.google.firebase.C2053a;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@UsedByReflection("FirebaseApp")
public class FirebaseCrash {
    private static volatile FirebaseCrash f6920e;
    final Context f6921a;
    final ExecutorService f6922b;
    final C5632b f6923c;
    ml f6924d;
    private final C2053a f6925f;
    private final CountDownLatch f6926g = new CountDownLatch(1);

    public interface C2058a {
        mg mo1772a();
    }

    class C2059c implements UncaughtExceptionHandler {
        private final UncaughtExceptionHandler f6918a;
        private /* synthetic */ FirebaseCrash f6919b;

        public C2059c(FirebaseCrash firebaseCrash, UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f6919b = firebaseCrash;
            this.f6918a = uncaughtExceptionHandler;
        }

        public final void uncaughtException(Thread thread, Throwable th) {
            Log.e("UncaughtException", "", th);
            if (!this.f6919b.m5603a()) {
                try {
                    Future submit;
                    FirebaseCrash firebaseCrash = this.f6919b;
                    if (th != null) {
                        if (!firebaseCrash.m5603a()) {
                            submit = firebaseCrash.f6922b.submit(new me(firebaseCrash.f6921a, firebaseCrash.f6923c, th, firebaseCrash.f6924d));
                            if (submit != null) {
                                submit.get(10000, TimeUnit.MILLISECONDS);
                            }
                        }
                    }
                    submit = null;
                    if (submit != null) {
                        submit.get(10000, TimeUnit.MILLISECONDS);
                    }
                } catch (Throwable e) {
                    Log.e("UncaughtException", "Ouch! My own exception handler threw an exception.", e);
                }
            }
            if (this.f6918a != null) {
                this.f6918a.uncaughtException(thread, th);
            }
        }
    }

    static final class C5632b implements C2058a {
        final Object f15489a;
        mg f15490b;

        private C5632b() {
            this.f15489a = new Object();
        }

        public final mg mo1772a() {
            mg mgVar;
            synchronized (this.f15489a) {
                mgVar = this.f15490b;
            }
            return mgVar;
        }
    }

    private FirebaseCrash(C2053a c2053a, ExecutorService executorService) {
        this.f6925f = c2053a;
        this.f6922b = executorService;
        this.f6921a = this.f6925f.m5597a();
        this.f6923c = new C5632b();
    }

    static /* synthetic */ void m5600a(FirebaseCrash firebaseCrash) {
        try {
            firebaseCrash.f6926g.await(20000, TimeUnit.MILLISECONDS);
        } catch (Throwable e) {
            Log.e("FirebaseCrash", "Failed waiting for crash api to load.", e);
        }
    }

    public static void m5601a(Throwable th) {
        FirebaseCrash instance = f6920e != null ? f6920e : getInstance(C2053a.m5590c());
        if (th != null && !instance.m5603a()) {
            instance.f6922b.submit(new md(instance.f6921a, instance.f6923c, th, instance.f6924d));
        }
    }

    @Keep
    @UsedByReflection("FirebaseApp")
    public static FirebaseCrash getInstance(C2053a c2053a) {
        if (f6920e == null) {
            synchronized (FirebaseCrash.class) {
                if (f6920e == null) {
                    ExecutorService threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    FirebaseCrash firebaseCrash = new FirebaseCrash(c2053a, threadPoolExecutor);
                    C2061c c2061c = new C2061c(c2053a);
                    Thread.setDefaultUncaughtExceptionHandler(new C2059c(firebaseCrash, Thread.getDefaultUncaughtExceptionHandler()));
                    C2064f c5633b = new C5633b(firebaseCrash);
                    ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
                    newFixedThreadPool.submit(new C2063e(c2061c, newFixedThreadPool.submit(new C2062d(c2061c)), c5633b));
                    newFixedThreadPool.shutdown();
                    firebaseCrash.f6922b.execute(new C2060a(firebaseCrash));
                    f6920e = firebaseCrash;
                }
            }
        }
        return f6920e;
    }

    final void m5602a(mg mgVar) {
        if (mgVar == null) {
            this.f6922b.shutdownNow();
        } else {
            this.f6924d = ml.m4997a(this.f6921a);
            C5632b c5632b = this.f6923c;
            synchronized (c5632b.f15489a) {
                c5632b.f15490b = mgVar;
            }
            if (!(this.f6924d == null || m5603a())) {
                ml mlVar = this.f6924d;
                mlVar.f6138a.registerOnMeasurementEventListener(new mk(this.f6921a, this.f6922b, this.f6923c));
                Log.d("FirebaseCrash", "Firebase Analytics Listener for Firebase Crash is initialized");
            }
        }
        this.f6926g.countDown();
    }

    public final boolean m5603a() {
        return this.f6922b.isShutdown();
    }
}
