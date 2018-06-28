package android.support.v7.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.C0571r;
import android.support.v4.widget.C0625j;
import android.support.v7.app.AppCompatDelegateImplV9.C06585;
import android.support.v7.app.AppCompatDelegateImplV9.C4865b;
import android.support.v7.app.AppCompatDelegateImplV9.C63876;
import android.support.v7.app.C4869f.C4868a;
import android.support.v7.p041a.C0645a.C0635a;
import android.support.v7.p041a.C0645a.C0640f;
import android.support.v7.view.C0705b;
import android.support.v7.view.C0705b.C0704a;
import android.support.v7.view.C0707d;
import android.support.v7.view.C0708f.C4883a;
import android.support.v7.view.C4882e;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ViewStubCompat;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;
import android.widget.PopupWindow;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

class C7256i extends C7022h {
    private C0668b f20948A;
    boolean f20949p = true;
    private int f20950y = -100;
    private boolean f20951z;

    final class C0668b {
        C0675r f2217a;
        boolean f2218b;
        BroadcastReceiver f2219c;
        IntentFilter f2220d;
        final /* synthetic */ C7256i f2221e;

        class C06671 extends BroadcastReceiver {
            final /* synthetic */ C0668b f2216a;

            C06671(C0668b c0668b) {
                this.f2216a = c0668b;
            }

            public final void onReceive(Context context, Intent intent) {
                C0668b c0668b = this.f2216a;
                boolean a = c0668b.f2217a.m1652a();
                if (a != c0668b.f2218b) {
                    c0668b.f2218b = a;
                    c0668b.f2221e.mo464j();
                }
            }
        }

        C0668b(C7256i c7256i, C0675r c0675r) {
            this.f2221e = c7256i;
            this.f2217a = c0675r;
            this.f2218b = c0675r.m1652a();
        }

        final void m1641a() {
            if (this.f2219c != null) {
                this.f2221e.b.unregisterReceiver(this.f2219c);
                this.f2219c = null;
            }
        }
    }

    class C6390a extends C4868a {
        final /* synthetic */ C7256i f17480c;

        C6390a(C7256i c7256i, Callback callback) {
            this.f17480c = c7256i;
            super(c7256i, callback);
        }

        final ActionMode m15115a(ActionMode.Callback callback) {
            Object c4883a = new C4883a(this.f17480c.b, callback);
            AppCompatDelegateImplV9 appCompatDelegateImplV9 = this.f17480c;
            if (appCompatDelegateImplV9.f17469q != null) {
                appCompatDelegateImplV9.f17469q.mo498c();
            }
            C0704a c4865b = new C4865b(appCompatDelegateImplV9, c4883a);
            C0662a a = appCompatDelegateImplV9.mo457a();
            if (a != null) {
                appCompatDelegateImplV9.f17469q = a.mo504a(c4865b);
            }
            if (appCompatDelegateImplV9.f17469q == null) {
                Context c0707d;
                appCompatDelegateImplV9.m15110o();
                if (appCompatDelegateImplV9.f17469q != null) {
                    appCompatDelegateImplV9.f17469q.mo498c();
                }
                boolean z = true;
                if (appCompatDelegateImplV9.f17470r == null) {
                    if (appCompatDelegateImplV9.l) {
                        TypedValue typedValue = new TypedValue();
                        Theme theme = appCompatDelegateImplV9.b.getTheme();
                        theme.resolveAttribute(C0635a.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Theme newTheme = appCompatDelegateImplV9.b.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            c0707d = new C0707d(appCompatDelegateImplV9.b, 0);
                            c0707d.getTheme().setTo(newTheme);
                        } else {
                            c0707d = appCompatDelegateImplV9.b;
                        }
                        appCompatDelegateImplV9.f17470r = new ActionBarContextView(c0707d);
                        appCompatDelegateImplV9.f17471s = new PopupWindow(c0707d, null, C0635a.actionModePopupWindowStyle);
                        C0625j.m1518a(appCompatDelegateImplV9.f17471s, 2);
                        appCompatDelegateImplV9.f17471s.setContentView(appCompatDelegateImplV9.f17470r);
                        appCompatDelegateImplV9.f17471s.setWidth(-1);
                        c0707d.getTheme().resolveAttribute(C0635a.actionBarSize, typedValue, true);
                        appCompatDelegateImplV9.f17470r.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, c0707d.getResources().getDisplayMetrics()));
                        appCompatDelegateImplV9.f17471s.setHeight(-2);
                        appCompatDelegateImplV9.f17472t = new C06585(appCompatDelegateImplV9);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) appCompatDelegateImplV9.f17474v.findViewById(C0640f.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(appCompatDelegateImplV9.m9369m()));
                            appCompatDelegateImplV9.f17470r = (ActionBarContextView) viewStubCompat.inflate();
                        }
                    }
                }
                if (appCompatDelegateImplV9.f17470r != null) {
                    appCompatDelegateImplV9.m15110o();
                    appCompatDelegateImplV9.f17470r.killMode();
                    c0707d = appCompatDelegateImplV9.f17470r.getContext();
                    ActionBarContextView actionBarContextView = appCompatDelegateImplV9.f17470r;
                    if (appCompatDelegateImplV9.f17471s != null) {
                        z = false;
                    }
                    C0705b c4882e = new C4882e(c0707d, actionBarContextView, c4865b, z);
                    if (c4865b.mo447a(c4882e, c4882e.mo495b())) {
                        c4882e.mo499d();
                        appCompatDelegateImplV9.f17470r.initForMode(c4882e);
                        appCompatDelegateImplV9.f17469q = c4882e;
                        if (appCompatDelegateImplV9.m15109n()) {
                            appCompatDelegateImplV9.f17470r.setAlpha(0.0f);
                            appCompatDelegateImplV9.f17473u = C0571r.m1380q(appCompatDelegateImplV9.f17470r).m1410a((float) BallPulseIndicator.SCALE);
                            appCompatDelegateImplV9.f17473u.m1412a(new C63876(appCompatDelegateImplV9));
                        } else {
                            appCompatDelegateImplV9.f17470r.setAlpha(BallPulseIndicator.SCALE);
                            appCompatDelegateImplV9.f17470r.setVisibility(0);
                            appCompatDelegateImplV9.f17470r.sendAccessibilityEvent(32);
                            if (appCompatDelegateImplV9.f17470r.getParent() instanceof View) {
                                C0571r.m1385v((View) appCompatDelegateImplV9.f17470r.getParent());
                            }
                        }
                        if (appCompatDelegateImplV9.f17471s != null) {
                            appCompatDelegateImplV9.c.getDecorView().post(appCompatDelegateImplV9.f17472t);
                        }
                    } else {
                        appCompatDelegateImplV9.f17469q = null;
                    }
                }
                appCompatDelegateImplV9.f17469q = appCompatDelegateImplV9.f17469q;
            }
            C0705b c0705b = appCompatDelegateImplV9.f17469q;
            return c0705b != null ? c4883a.m9453b(c0705b) : null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return this.f17480c.f20949p ? m15115a(callback) : super.onWindowStartingActionMode(callback);
        }
    }

    C7256i(Context context, Window window, C0664d c0664d) {
        super(context, window, c0664d);
    }

    private void m19206r() {
        if (this.f20948A == null) {
            Context context = this.b;
            if (C0675r.f2250a == null) {
                context = context.getApplicationContext();
                C0675r.f2250a = new C0675r(context, (LocationManager) context.getSystemService("location"));
            }
            this.f20948A = new C0668b(this, C0675r.f2250a);
        }
    }

    private boolean m19207s() {
        if (!this.f20951z || !(this.b instanceof Activity)) {
            return false;
        }
        try {
            return (this.b.getPackageManager().getActivityInfo(new ComponentName(this.b, this.b.getClass()), 0).configChanges & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 0;
        } catch (Throwable e) {
            Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
            return true;
        }
    }

    Callback mo3504a(Callback callback) {
        return new C6390a(this, callback);
    }

    public final void mo2584a(Bundle bundle) {
        super.mo2584a(bundle);
        if (bundle != null && this.f20950y == -100) {
            this.f20950y = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    public final void mo460b(Bundle bundle) {
        super.mo460b(bundle);
        if (this.f20950y != -100) {
            bundle.putInt("appcompat:local_night_mode", this.f20950y);
        }
    }

    public final void mo461d() {
        super.mo461d();
        mo464j();
    }

    public final void mo462e() {
        super.mo462e();
        if (this.f20948A != null) {
            this.f20948A.m1641a();
        }
    }

    int mo3505f(int i) {
        if (i == -100) {
            return -1;
        }
        if (i != 0) {
            return i;
        }
        m19206r();
        C0668b c0668b = this.f20948A;
        c0668b.f2218b = c0668b.f2217a.m1652a();
        return c0668b.f2218b ? 2 : 1;
    }

    public final void mo463h() {
        super.mo463h();
        if (this.f20948A != null) {
            this.f20948A.m1641a();
        }
    }

    public final boolean mo464j() {
        int i = this.f20950y != -100 ? this.f20950y : C0665e.f2213a;
        int f = mo3505f(i);
        boolean z = false;
        if (f != -1) {
            Resources resources = this.b.getResources();
            Configuration configuration = resources.getConfiguration();
            int i2 = configuration.uiMode & 48;
            f = f == 2 ? 32 : 16;
            if (i2 != f) {
                if (m19207s()) {
                    ((Activity) this.b).recreate();
                } else {
                    Configuration configuration2 = new Configuration(configuration);
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    configuration2.uiMode = f | (configuration2.uiMode & -49);
                    resources.updateConfiguration(configuration2, displayMetrics);
                    if (VERSION.SDK_INT < 26) {
                        if (VERSION.SDK_INT >= 24) {
                            C0671o.m1649c(resources);
                        } else if (VERSION.SDK_INT >= 23) {
                            C0671o.m1648b(resources);
                        } else if (VERSION.SDK_INT >= 21) {
                            C0671o.m1646a(resources);
                        }
                    }
                }
                z = true;
            }
        }
        if (i == 0) {
            m19206r();
            C0668b c0668b = this.f20948A;
            c0668b.m1641a();
            if (c0668b.f2219c == null) {
                c0668b.f2219c = new C06671(c0668b);
            }
            if (c0668b.f2220d == null) {
                c0668b.f2220d = new IntentFilter();
                c0668b.f2220d.addAction("android.intent.action.TIME_SET");
                c0668b.f2220d.addAction("android.intent.action.TIMEZONE_CHANGED");
                c0668b.f2220d.addAction("android.intent.action.TIME_TICK");
            }
            c0668b.f2221e.b.registerReceiver(c0668b.f2219c, c0668b.f2220d);
        }
        this.f20951z = true;
        return z;
    }
}
