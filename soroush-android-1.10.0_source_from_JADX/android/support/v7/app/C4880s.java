package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0571r;
import android.support.v4.view.C0579v;
import android.support.v4.view.C0580w;
import android.support.v4.view.C0581y;
import android.support.v4.view.C4847x;
import android.support.v7.p041a.C0645a.C0635a;
import android.support.v7.p041a.C0645a.C0640f;
import android.support.v7.p041a.C0645a.C0644j;
import android.support.v7.view.C0703a;
import android.support.v7.view.C0705b;
import android.support.v7.view.C0705b.C0704a;
import android.support.v7.view.C0711g;
import android.support.v7.view.C0712h;
import android.support.v7.view.menu.C4890h;
import android.support.v7.view.menu.C4890h.C0722a;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback;
import android.support.v7.widget.DecorToolbar;
import android.support.v7.widget.ScrollingTabContainerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class C4880s extends C0662a implements ActionBarVisibilityCallback {
    static final /* synthetic */ boolean f13548s = true;
    private static final Interpolator f13549t = new AccelerateInterpolator();
    private static final Interpolator f13550u = new DecelerateInterpolator();
    private boolean f13551A;
    private boolean f13552B;
    private ArrayList<Object> f13553C = new ArrayList();
    private boolean f13554D;
    private int f13555E = 0;
    private boolean f13556F;
    private boolean f13557G = true;
    private boolean f13558H;
    Context f13559a;
    ActionBarOverlayLayout f13560b;
    ActionBarContainer f13561c;
    DecorToolbar f13562d;
    ActionBarContextView f13563e;
    View f13564f;
    ScrollingTabContainerView f13565g;
    C4879a f13566h;
    C0705b f13567i;
    C0704a f13568j;
    boolean f13569k = true;
    boolean f13570l;
    boolean f13571m;
    C0712h f13572n;
    boolean f13573o;
    final C0580w f13574p = new C63911(this);
    final C0580w f13575q = new C63922(this);
    final C0581y f13576r = new C48783(this);
    private Context f13577v;
    private Activity f13578w;
    private Dialog f13579x;
    private ArrayList<Object> f13580y = new ArrayList();
    private int f13581z = -1;

    class C48783 implements C0581y {
        final /* synthetic */ C4880s f13542a;

        C48783(C4880s c4880s) {
            this.f13542a = c4880s;
        }

        public final void mo489a() {
            ((View) this.f13542a.f13561c.getParent()).invalidate();
        }
    }

    public class C4879a extends C0705b implements C0722a {
        final C4890h f13543a;
        final /* synthetic */ C4880s f13544b;
        private final Context f13545e;
        private C0704a f13546f;
        private WeakReference<View> f13547g;

        public C4879a(C4880s c4880s, Context context, C0704a c0704a) {
            this.f13544b = c4880s;
            this.f13545e = context;
            this.f13546f = c0704a;
            C4890h c4890h = new C4890h(context);
            this.f13543a = c4890h;
            this.f13543a.mo2620a((C0722a) this);
        }

        public final MenuInflater mo490a() {
            return new C0711g(this.f13545e);
        }

        public final void mo491a(int i) {
            mo497b(this.f13544b.f13559a.getResources().getString(i));
        }

        public final void mo492a(View view) {
            this.f13544b.f13563e.setCustomView(view);
            this.f13547g = new WeakReference(view);
        }

        public final void mo493a(CharSequence charSequence) {
            this.f13544b.f13563e.setSubtitle(charSequence);
        }

        public final void mo494a(boolean z) {
            super.mo494a(z);
            this.f13544b.f13563e.setTitleOptional(z);
        }

        public final Menu mo495b() {
            return this.f13543a;
        }

        public final void mo496b(int i) {
            mo493a(this.f13544b.f13559a.getResources().getString(i));
        }

        public final void mo497b(CharSequence charSequence) {
            this.f13544b.f13563e.setTitle(charSequence);
        }

        public final void mo498c() {
            if (this.f13544b.f13566h == this) {
                if (C4880s.m9412a(this.f13544b.f13570l, this.f13544b.f13571m, false)) {
                    this.f13546f.mo446a(this);
                } else {
                    this.f13544b.f13567i = this;
                    this.f13544b.f13568j = this.f13546f;
                }
                this.f13546f = null;
                this.f13544b.m9432f(false);
                this.f13544b.f13563e.closeMode();
                this.f13544b.f13562d.getViewGroup().sendAccessibilityEvent(32);
                this.f13544b.f13560b.setHideOnContentScrollEnabled(this.f13544b.f13573o);
                this.f13544b.f13566h = null;
            }
        }

        public final void mo499d() {
            if (this.f13544b.f13566h == this) {
                this.f13543a.m9489d();
                try {
                    this.f13546f.mo449b(this, this.f13543a);
                } finally {
                    this.f13543a.m9491e();
                }
            }
        }

        public final boolean m9406e() {
            this.f13543a.m9489d();
            try {
                boolean a = this.f13546f.mo447a((C0705b) this, this.f13543a);
                return a;
            } finally {
                this.f13543a.m9491e();
            }
        }

        public final CharSequence mo500f() {
            return this.f13544b.f13563e.getTitle();
        }

        public final CharSequence mo501g() {
            return this.f13544b.f13563e.getSubtitle();
        }

        public final boolean mo502h() {
            return this.f13544b.f13563e.isTitleOptional();
        }

        public final View mo503i() {
            return this.f13547g != null ? (View) this.f13547g.get() : null;
        }

        public final boolean onMenuItemSelected(C4890h c4890h, MenuItem menuItem) {
            return this.f13546f != null ? this.f13546f.mo448a((C0705b) this, menuItem) : false;
        }

        public final void onMenuModeChange(C4890h c4890h) {
            if (this.f13546f != null) {
                mo499d();
                this.f13544b.f13563e.showOverflowMenu();
            }
        }
    }

    class C63911 extends C4847x {
        final /* synthetic */ C4880s f17481a;

        C63911(C4880s c4880s) {
            this.f17481a = c4880s;
        }

        public final void onAnimationEnd(View view) {
            if (this.f17481a.f13569k && this.f17481a.f13564f != null) {
                this.f17481a.f13564f.setTranslationY(0.0f);
                this.f17481a.f13561c.setTranslationY(0.0f);
            }
            this.f17481a.f13561c.setVisibility(8);
            this.f17481a.f13561c.setTransitioning(false);
            this.f17481a.f13572n = null;
            C4880s c4880s = this.f17481a;
            if (c4880s.f13568j != null) {
                c4880s.f13568j.mo446a(c4880s.f13567i);
                c4880s.f13567i = null;
                c4880s.f13568j = null;
            }
            if (this.f17481a.f13560b != null) {
                C0571r.m1385v(this.f17481a.f13560b);
            }
        }
    }

    class C63922 extends C4847x {
        final /* synthetic */ C4880s f17482a;

        C63922(C4880s c4880s) {
            this.f17482a = c4880s;
        }

        public final void onAnimationEnd(View view) {
            this.f17482a.f13572n = null;
            this.f17482a.f13561c.requestLayout();
        }
    }

    public C4880s(Activity activity, boolean z) {
        this.f13578w = activity;
        View decorView = activity.getWindow().getDecorView();
        m9411a(decorView);
        if (!z) {
            this.f13564f = decorView.findViewById(16908290);
        }
    }

    public C4880s(Dialog dialog) {
        this.f13579x = dialog;
        m9411a(dialog.getWindow().getDecorView());
    }

    private void m9411a(View view) {
        DecorToolbar decorToolbar;
        this.f13560b = (ActionBarOverlayLayout) view.findViewById(C0640f.decor_content_parent);
        if (this.f13560b != null) {
            this.f13560b.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(C0640f.action_bar);
        if (findViewById instanceof DecorToolbar) {
            decorToolbar = (DecorToolbar) findViewById;
        } else if (findViewById instanceof Toolbar) {
            decorToolbar = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder stringBuilder = new StringBuilder("Can't make a decor toolbar out of ");
            stringBuilder.append(findViewById);
            throw new IllegalStateException(stringBuilder.toString() != null ? findViewById.getClass().getSimpleName() : "null");
        }
        this.f13562d = decorToolbar;
        this.f13563e = (ActionBarContextView) view.findViewById(C0640f.action_context_bar);
        this.f13561c = (ActionBarContainer) view.findViewById(C0640f.action_bar_container);
        if (!(this.f13562d == null || this.f13563e == null)) {
            if (this.f13561c != null) {
                TypedArray obtainStyledAttributes;
                int dimensionPixelSize;
                this.f13559a = this.f13562d.getContext();
                boolean z = (this.f13562d.getDisplayOptions() & 4) != 0;
                if (z) {
                    this.f13551A = true;
                }
                C0703a a = C0703a.m1693a(this.f13559a);
                if (!(a.f2313a.getApplicationInfo().targetSdkVersion < 14)) {
                    if (!z) {
                        z = false;
                        mo476b(z);
                        m9413g(a.m1695b());
                        obtainStyledAttributes = this.f13559a.obtainStyledAttributes(null, C0644j.ActionBar, C0635a.actionBarStyle, 0);
                        if (obtainStyledAttributes.getBoolean(C0644j.ActionBar_hideOnContentScroll, false)) {
                            if (this.f13560b.isInOverlayMode()) {
                                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                            }
                            this.f13573o = true;
                            this.f13560b.setHideOnContentScrollEnabled(true);
                        }
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0644j.ActionBar_elevation, 0);
                        if (dimensionPixelSize != 0) {
                            C0571r.m1372i(this.f13561c, (float) dimensionPixelSize);
                        }
                        obtainStyledAttributes.recycle();
                        return;
                    }
                }
                z = true;
                mo476b(z);
                m9413g(a.m1695b());
                obtainStyledAttributes = this.f13559a.obtainStyledAttributes(null, C0644j.ActionBar, C0635a.actionBarStyle, 0);
                if (obtainStyledAttributes.getBoolean(C0644j.ActionBar_hideOnContentScroll, false)) {
                    if (this.f13560b.isInOverlayMode()) {
                        this.f13573o = true;
                        this.f13560b.setHideOnContentScrollEnabled(true);
                    } else {
                        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                    }
                }
                dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0644j.ActionBar_elevation, 0);
                if (dimensionPixelSize != 0) {
                    C0571r.m1372i(this.f13561c, (float) dimensionPixelSize);
                }
                obtainStyledAttributes.recycle();
                return;
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(getClass().getSimpleName());
        stringBuilder2.append(" can only be used with a compatible window decor layout");
        throw new IllegalStateException(stringBuilder2.toString());
    }

    static boolean m9412a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        if (!z) {
            if (!z2) {
                return true;
            }
        }
        return false;
    }

    private void m9413g(boolean z) {
        this.f13554D = z;
        if (this.f13554D) {
            this.f13561c.setTabContainer(null);
            this.f13562d.setEmbeddedTabView(this.f13565g);
        } else {
            this.f13562d.setEmbeddedTabView(null);
            this.f13561c.setTabContainer(this.f13565g);
        }
        boolean z2 = true;
        z = this.f13562d.getNavigationMode() == 2;
        if (this.f13565g != null) {
            if (z) {
                this.f13565g.setVisibility(0);
                if (this.f13560b != null) {
                    C0571r.m1385v(this.f13560b);
                }
            } else {
                this.f13565g.setVisibility(8);
            }
        }
        DecorToolbar decorToolbar = this.f13562d;
        boolean z3 = !this.f13554D && z;
        decorToolbar.setCollapsible(z3);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f13560b;
        if (this.f13554D || !z) {
            z2 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z2);
    }

    private void m9414h(boolean z) {
        int[] iArr;
        if (C4880s.m9412a(this.f13570l, this.f13571m, this.f13556F)) {
            if (!this.f13557G) {
                this.f13557G = true;
                if (this.f13572n != null) {
                    this.f13572n.m1728b();
                }
                this.f13561c.setVisibility(0);
                if (this.f13555E == 0 && (this.f13558H || z)) {
                    this.f13561c.setTranslationY(0.0f);
                    float f = (float) (-this.f13561c.getHeight());
                    if (z) {
                        iArr = new int[]{0, 0};
                        this.f13561c.getLocationInWindow(iArr);
                        f -= (float) iArr[1];
                    }
                    this.f13561c.setTranslationY(f);
                    C0712h c0712h = new C0712h();
                    C0579v c = C0571r.m1380q(this.f13561c).m1418c(0.0f);
                    c.m1413a(this.f13576r);
                    c0712h.m1724a(c);
                    if (this.f13569k && this.f13564f != null) {
                        this.f13564f.setTranslationY(f);
                        c0712h.m1724a(C0571r.m1380q(this.f13564f).m1418c(0.0f));
                    }
                    c0712h.m1726a(f13550u);
                    c0712h.m1729c();
                    c0712h.m1725a(this.f13575q);
                    this.f13572n = c0712h;
                    c0712h.m1727a();
                } else {
                    this.f13561c.setAlpha(BallPulseIndicator.SCALE);
                    this.f13561c.setTranslationY(0.0f);
                    if (this.f13569k && this.f13564f != null) {
                        this.f13564f.setTranslationY(0.0f);
                    }
                    this.f13575q.onAnimationEnd(null);
                }
                if (this.f13560b != null) {
                    C0571r.m1385v(this.f13560b);
                }
            }
        } else if (this.f13557G) {
            this.f13557G = false;
            if (this.f13572n != null) {
                this.f13572n.m1728b();
            }
            if (this.f13555E == 0 && (this.f13558H || z)) {
                this.f13561c.setAlpha(BallPulseIndicator.SCALE);
                this.f13561c.setTransitioning(true);
                C0712h c0712h2 = new C0712h();
                float f2 = (float) (-this.f13561c.getHeight());
                if (z) {
                    iArr = new int[]{0, 0};
                    this.f13561c.getLocationInWindow(iArr);
                    f2 -= (float) iArr[1];
                }
                C0579v c2 = C0571r.m1380q(this.f13561c).m1418c(f2);
                c2.m1413a(this.f13576r);
                c0712h2.m1724a(c2);
                if (this.f13569k && this.f13564f != null) {
                    c0712h2.m1724a(C0571r.m1380q(this.f13564f).m1418c(f2));
                }
                c0712h2.m1726a(f13549t);
                c0712h2.m1729c();
                c0712h2.m1725a(this.f13574p);
                this.f13572n = c0712h2;
                c0712h2.m1727a();
                return;
            }
            this.f13574p.onAnimationEnd(null);
        }
    }

    public final int mo467a() {
        return this.f13562d.getDisplayOptions();
    }

    public final C0705b mo504a(C0704a c0704a) {
        if (this.f13566h != null) {
            this.f13566h.mo498c();
        }
        this.f13560b.setHideOnContentScrollEnabled(false);
        this.f13563e.killMode();
        C0705b c4879a = new C4879a(this, this.f13563e.getContext(), c0704a);
        if (!c4879a.m9406e()) {
            return null;
        }
        this.f13566h = c4879a;
        c4879a.mo499d();
        this.f13563e.initForMode(c4879a);
        m9432f(true);
        this.f13563e.sendAccessibilityEvent(32);
        return c4879a;
    }

    public final void mo468a(Configuration configuration) {
        m9413g(C0703a.m1693a(this.f13559a).m1695b());
    }

    public final void mo469a(Drawable drawable) {
        this.f13562d.setNavigationIcon(drawable);
    }

    public final void mo470a(CharSequence charSequence) {
        this.f13562d.setTitle(charSequence);
    }

    public final void mo471a(boolean z) {
        int i = z ? 4 : 0;
        int displayOptions = this.f13562d.getDisplayOptions();
        this.f13551A = true;
        this.f13562d.setDisplayOptions((i & 4) | (displayOptions & -5));
    }

    public final boolean mo472a(int i, KeyEvent keyEvent) {
        if (this.f13566h == null) {
            return false;
        }
        Menu menu = this.f13566h.f13543a;
        if (menu == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        menu.setQwertyMode(z);
        return menu.performShortcut(i, keyEvent, 0);
    }

    public final void mo474b() {
        if (this.f13570l) {
            this.f13570l = false;
            m9414h(false);
        }
    }

    public final void mo475b(CharSequence charSequence) {
        this.f13562d.setSubtitle(charSequence);
    }

    public final void mo476b(boolean z) {
        this.f13562d.setHomeButtonEnabled(z);
    }

    public final void mo477c() {
        if (!this.f13570l) {
            this.f13570l = true;
            m9414h(false);
        }
    }

    public final void mo478c(CharSequence charSequence) {
        this.f13562d.setWindowTitle(charSequence);
    }

    public final void mo479c(boolean z) {
        if (!this.f13551A) {
            mo471a(z);
        }
    }

    public final Context mo480d() {
        if (this.f13577v == null) {
            TypedValue typedValue = new TypedValue();
            this.f13559a.getTheme().resolveAttribute(C0635a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f13577v = new ContextThemeWrapper(this.f13559a, i);
            } else {
                this.f13577v = this.f13559a;
            }
        }
        return this.f13577v;
    }

    public final void mo481d(boolean z) {
        this.f13558H = z;
        if (!z && this.f13572n != null) {
            this.f13572n.m1728b();
        }
    }

    public final void mo482e() {
        this.f13562d.setNavigationIcon((int) R.drawable.ic_close_white_24dp);
    }

    public final void mo483e(boolean z) {
        if (z != this.f13552B) {
            this.f13552B = z;
            int size = this.f13553C.size();
            for (int i = 0; i < size; i++) {
                this.f13553C.get(i);
            }
        }
    }

    public void enableContentAnimations(boolean z) {
        this.f13569k = z;
    }

    public final void m9432f(boolean z) {
        View view;
        C0579v c0579v;
        C0579v c0579v2;
        long duration;
        if (z) {
            if (!this.f13556F) {
                this.f13556F = true;
                if (this.f13560b != null) {
                    this.f13560b.setShowingForActionMode(true);
                }
            }
            if (!C0571r.m1326D(this.f13561c)) {
                if (z) {
                    c0579v = this.f13562d.setupAnimatorToVisibility(4, 100);
                    c0579v2 = this.f13563e.setupAnimatorToVisibility(0, 200);
                } else {
                    c0579v2 = this.f13562d.setupAnimatorToVisibility(0, 200);
                    c0579v = this.f13563e.setupAnimatorToVisibility(8, 100);
                }
                C0712h c0712h = new C0712h();
                c0712h.f2364a.add(c0579v);
                view = (View) c0579v.f1883a.get();
                duration = view != null ? view.animate().getDuration() : 0;
                view = (View) c0579v2.f1883a.get();
                if (view != null) {
                    view.animate().setStartDelay(duration);
                }
                c0712h.f2364a.add(c0579v2);
                c0712h.m1727a();
            } else if (z) {
                this.f13562d.setVisibility(4);
                this.f13563e.setVisibility(0);
            } else {
                this.f13562d.setVisibility(0);
                this.f13563e.setVisibility(8);
            }
        }
        if (this.f13556F) {
            this.f13556F = false;
            if (this.f13560b != null) {
                this.f13560b.setShowingForActionMode(false);
            }
        }
        if (!C0571r.m1326D(this.f13561c)) {
            if (z) {
                c0579v2 = this.f13562d.setupAnimatorToVisibility(0, 200);
                c0579v = this.f13563e.setupAnimatorToVisibility(8, 100);
            } else {
                c0579v = this.f13562d.setupAnimatorToVisibility(4, 100);
                c0579v2 = this.f13563e.setupAnimatorToVisibility(0, 200);
            }
            C0712h c0712h2 = new C0712h();
            c0712h2.f2364a.add(c0579v);
            view = (View) c0579v.f1883a.get();
            if (view != null) {
            }
            view = (View) c0579v2.f1883a.get();
            if (view != null) {
                view.animate().setStartDelay(duration);
            }
            c0712h2.f2364a.add(c0579v2);
            c0712h2.m1727a();
        } else if (z) {
            this.f13562d.setVisibility(0);
            this.f13563e.setVisibility(8);
        } else {
            this.f13562d.setVisibility(4);
            this.f13563e.setVisibility(0);
        }
        m9414h(false);
        if (!C0571r.m1326D(this.f13561c)) {
            if (z) {
                c0579v = this.f13562d.setupAnimatorToVisibility(4, 100);
                c0579v2 = this.f13563e.setupAnimatorToVisibility(0, 200);
            } else {
                c0579v2 = this.f13562d.setupAnimatorToVisibility(0, 200);
                c0579v = this.f13563e.setupAnimatorToVisibility(8, 100);
            }
            C0712h c0712h22 = new C0712h();
            c0712h22.f2364a.add(c0579v);
            view = (View) c0579v.f1883a.get();
            if (view != null) {
            }
            view = (View) c0579v2.f1883a.get();
            if (view != null) {
                view.animate().setStartDelay(duration);
            }
            c0712h22.f2364a.add(c0579v2);
            c0712h22.m1727a();
        } else if (z) {
            this.f13562d.setVisibility(4);
            this.f13563e.setVisibility(0);
        } else {
            this.f13562d.setVisibility(0);
            this.f13563e.setVisibility(8);
        }
    }

    public void hideForSystem() {
        if (!this.f13571m) {
            this.f13571m = true;
            m9414h(true);
        }
    }

    public final boolean mo487i() {
        if (this.f13562d == null || !this.f13562d.hasExpandedActionView()) {
            return false;
        }
        this.f13562d.collapseActionView();
        return true;
    }

    public void onContentScrollStarted() {
        if (this.f13572n != null) {
            this.f13572n.m1728b();
            this.f13572n = null;
        }
    }

    public void onContentScrollStopped() {
    }

    public void onWindowVisibilityChanged(int i) {
        this.f13555E = i;
    }

    public void showForSystem() {
        if (this.f13571m) {
            this.f13571m = false;
            m9414h(true);
        }
    }
}
