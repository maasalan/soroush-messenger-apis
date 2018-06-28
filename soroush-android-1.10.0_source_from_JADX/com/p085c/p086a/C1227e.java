package com.p085c.p086a;

import android.annotation.TargetApi;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import com.p085c.p086a.p089c.p092b.C5149i;
import com.p085c.p086a.p105g.C1248f;
import com.p085c.p086a.p105g.p106a.C1238e;

@TargetApi(14)
public final class C1227e extends ContextWrapper implements ComponentCallbacks2 {
    final Handler f3873a = new Handler(Looper.getMainLooper());
    public final C1254h f3874b;
    final C1248f f3875c;
    final C5149i f3876d;
    public final int f3877e;
    private final C1238e f3878f;
    private final ComponentCallbacks2 f3879g;

    public C1227e(Context context, C1254h c1254h, C1238e c1238e, C1248f c1248f, C5149i c5149i, ComponentCallbacks2 componentCallbacks2, int i) {
        super(context.getApplicationContext());
        this.f3874b = c1254h;
        this.f3878f = c1238e;
        this.f3875c = c1248f;
        this.f3876d = c5149i;
        this.f3879g = componentCallbacks2;
        this.f3877e = i;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.f3879g.onConfigurationChanged(configuration);
    }

    public final void onLowMemory() {
        this.f3879g.onLowMemory();
    }

    public final void onTrimMemory(int i) {
        this.f3879g.onTrimMemory(i);
    }
}
