package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.v4.app.C0418u;
import android.support.v4.view.C0557e;
import android.support.v4.view.C0564m;
import android.support.v4.view.C0571r;
import android.support.v4.view.C0579v;
import android.support.v4.view.C0582z;
import android.support.v4.view.C4847x;
import android.support.v7.p041a.C0645a.C0635a;
import android.support.v7.p041a.C0645a.C0637c;
import android.support.v7.p041a.C0645a.C0640f;
import android.support.v7.p041a.C0645a.C0641g;
import android.support.v7.p041a.C0645a.C0643i;
import android.support.v7.p041a.C0645a.C0644j;
import android.support.v7.p043c.p044a.C0683b;
import android.support.v7.view.C0705b;
import android.support.v7.view.C0705b.C0704a;
import android.support.v7.view.C0707d;
import android.support.v7.view.menu.C0727o.C0726a;
import android.support.v7.view.menu.C4889f;
import android.support.v7.view.menu.C4889f.C0720a;
import android.support.v7.view.menu.C4890h;
import android.support.v7.view.menu.C4890h.C0722a;
import android.support.v7.view.menu.ExpandedMenuView;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.AppCompatDrawableManager;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.ContentFrameLayout.OnAttachListener;
import android.support.v7.widget.DecorContentParent;
import android.support.v7.widget.FitWindowsViewGroup;
import android.support.v7.widget.FitWindowsViewGroup.OnFitSystemWindowsListener;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ViewUtils;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

class AppCompatDelegateImplV9 extends C4869f implements C0722a, Factory2 {
    private static final boolean f17453p = (VERSION.SDK_INT < 21);
    private C4867d f17454A;
    private boolean f17455B;
    private TextView f17456C;
    private View f17457D;
    private boolean f17458E;
    private boolean f17459F;
    private boolean f17460G;
    private PanelFeatureState[] f17461H;
    private PanelFeatureState f17462I;
    private boolean f17463J;
    private final Runnable f17464K = new C06571(this);
    private boolean f17465L;
    private Rect f17466M;
    private Rect f17467N;
    private C0670m f17468O;
    C0705b f17469q;
    ActionBarContextView f17470r;
    PopupWindow f17471s;
    Runnable f17472t;
    C0579v f17473u = null;
    ViewGroup f17474v;
    boolean f17475w;
    int f17476x;
    private DecorContentParent f17477y;
    private C4864a f17478z;

    class C06571 implements Runnable {
        final /* synthetic */ AppCompatDelegateImplV9 f2187a;

        C06571(AppCompatDelegateImplV9 appCompatDelegateImplV9) {
            this.f2187a = appCompatDelegateImplV9;
        }

        public final void run() {
            if ((this.f2187a.f17476x & 1) != 0) {
                this.f2187a.m15105h(0);
            }
            if ((this.f2187a.f17476x & ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                this.f2187a.m15105h(108);
            }
            this.f2187a.f17475w = false;
            this.f2187a.f17476x = 0;
        }
    }

    class C06585 implements Runnable {
        final /* synthetic */ AppCompatDelegateImplV9 f2188a;

        class C63861 extends C4847x {
            final /* synthetic */ C06585 f17450a;

            C63861(C06585 c06585) {
                this.f17450a = c06585;
            }

            public final void onAnimationEnd(View view) {
                this.f17450a.f2188a.f17470r.setAlpha(BallPulseIndicator.SCALE);
                this.f17450a.f2188a.f17473u.m1412a(null);
                this.f17450a.f2188a.f17473u = null;
            }

            public final void onAnimationStart(View view) {
                this.f17450a.f2188a.f17470r.setVisibility(0);
            }
        }

        C06585(AppCompatDelegateImplV9 appCompatDelegateImplV9) {
            this.f2188a = appCompatDelegateImplV9;
        }

        public final void run() {
            this.f2188a.f17471s.showAtLocation(this.f2188a.f17470r, 55, 0, 0);
            this.f2188a.m15110o();
            if (this.f2188a.m15109n()) {
                this.f2188a.f17470r.setAlpha(0.0f);
                this.f2188a.f17473u = C0571r.m1380q(this.f2188a.f17470r).m1410a((float) BallPulseIndicator.SCALE);
                this.f2188a.f17473u.m1412a(new C63861(this));
                return;
            }
            this.f2188a.f17470r.setAlpha(BallPulseIndicator.SCALE);
            this.f2188a.f17470r.setVisibility(0);
        }
    }

    protected static final class PanelFeatureState {
        int f2192a;
        int f2193b;
        int f2194c;
        int f2195d;
        int f2196e;
        int f2197f;
        ViewGroup f2198g;
        View f2199h;
        View f2200i;
        C4890h f2201j;
        C4889f f2202k;
        Context f2203l;
        boolean f2204m;
        boolean f2205n;
        boolean f2206o;
        public boolean f2207p;
        boolean f2208q = false;
        boolean f2209r;
        Bundle f2210s;

        private static class SavedState implements Parcelable {
            public static final Creator<SavedState> CREATOR = new C06591();
            int f2189a;
            boolean f2190b;
            Bundle f2191c;

            static class C06591 implements ClassLoaderCreator<SavedState> {
                C06591() {
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return SavedState.m1578a(parcel, null);
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.m1578a(parcel, classLoader);
                }

                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new SavedState[i];
                }
            }

            SavedState() {
            }

            static SavedState m1578a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f2189a = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.f2190b = z;
                if (savedState.f2190b) {
                    savedState.f2191c = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f2189a);
                parcel.writeInt(this.f2190b);
                if (this.f2190b) {
                    parcel.writeBundle(this.f2191c);
                }
            }
        }

        PanelFeatureState(int i) {
            this.f2192a = i;
        }

        final void m1579a(C4890h c4890h) {
            if (c4890h != this.f2201j) {
                if (this.f2201j != null) {
                    this.f2201j.m9483b(this.f2202k);
                }
                this.f2201j = c4890h;
                if (!(c4890h == null || this.f2202k == null)) {
                    c4890h.m9476a(this.f2202k);
                }
            }
        }
    }

    class C48612 implements C0564m {
        final /* synthetic */ AppCompatDelegateImplV9 f13501a;

        C48612(AppCompatDelegateImplV9 appCompatDelegateImplV9) {
            this.f13501a = appCompatDelegateImplV9;
        }

        public final C0582z mo139a(View view, C0582z c0582z) {
            int b = c0582z.m1428b();
            int i = this.f13501a.m15106i(b);
            if (b != i) {
                c0582z = c0582z.m1427a(c0582z.m1426a(), i, c0582z.m1429c(), c0582z.m1430d());
            }
            return C0571r.m1332a(view, c0582z);
        }
    }

    class C48623 implements OnFitSystemWindowsListener {
        final /* synthetic */ AppCompatDelegateImplV9 f13502a;

        C48623(AppCompatDelegateImplV9 appCompatDelegateImplV9) {
            this.f13502a = appCompatDelegateImplV9;
        }

        public final void onFitSystemWindows(Rect rect) {
            rect.top = this.f13502a.m15106i(rect.top);
        }
    }

    class C48634 implements OnAttachListener {
        final /* synthetic */ AppCompatDelegateImplV9 f13503a;

        C48634(AppCompatDelegateImplV9 appCompatDelegateImplV9) {
            this.f13503a = appCompatDelegateImplV9;
        }

        public final void onAttachedFromWindow() {
        }

        public final void onDetachedFromWindow() {
            this.f13503a.m15112q();
        }
    }

    private final class C4864a implements C0726a {
        final /* synthetic */ AppCompatDelegateImplV9 f13504a;

        C4864a(AppCompatDelegateImplV9 appCompatDelegateImplV9) {
            this.f13504a = appCompatDelegateImplV9;
        }

        public final void onCloseMenu(C4890h c4890h, boolean z) {
            this.f13504a.m15087a(c4890h);
        }

        public final boolean onOpenSubMenu(C4890h c4890h) {
            Callback callback = this.f13504a.f13514c.getCallback();
            if (callback != null) {
                callback.onMenuOpened(108, c4890h);
            }
            return true;
        }
    }

    class C4865b implements C0704a {
        final /* synthetic */ AppCompatDelegateImplV9 f13505a;
        private C0704a f13506b;

        class C63881 extends C4847x {
            final /* synthetic */ C4865b f17452a;

            C63881(C4865b c4865b) {
                this.f17452a = c4865b;
            }

            public final void onAnimationEnd(View view) {
                this.f17452a.f13505a.f17470r.setVisibility(8);
                if (this.f17452a.f13505a.f17471s != null) {
                    this.f17452a.f13505a.f17471s.dismiss();
                } else if (this.f17452a.f13505a.f17470r.getParent() instanceof View) {
                    C0571r.m1385v((View) this.f17452a.f13505a.f17470r.getParent());
                }
                this.f17452a.f13505a.f17470r.removeAllViews();
                this.f17452a.f13505a.f17473u.m1412a(null);
                this.f17452a.f13505a.f17473u = null;
            }
        }

        public C4865b(AppCompatDelegateImplV9 appCompatDelegateImplV9, C0704a c0704a) {
            this.f13505a = appCompatDelegateImplV9;
            this.f13506b = c0704a;
        }

        public final void mo446a(C0705b c0705b) {
            this.f13506b.mo446a(c0705b);
            if (this.f13505a.f17471s != null) {
                this.f13505a.c.getDecorView().removeCallbacks(this.f13505a.f17472t);
            }
            if (this.f13505a.f17470r != null) {
                this.f13505a.m15110o();
                this.f13505a.f17473u = C0571r.m1380q(this.f13505a.f17470r).m1410a(0.0f);
                this.f13505a.f17473u.m1412a(new C63881(this));
            }
            if (this.f13505a.f != null) {
                C0664d c0664d = this.f13505a.f;
                c0705b = this.f13505a.f17469q;
            }
            this.f13505a.f17469q = null;
        }

        public final boolean mo447a(C0705b c0705b, Menu menu) {
            return this.f13506b.mo447a(c0705b, menu);
        }

        public final boolean mo448a(C0705b c0705b, MenuItem menuItem) {
            return this.f13506b.mo448a(c0705b, menuItem);
        }

        public final boolean mo449b(C0705b c0705b, Menu menu) {
            return this.f13506b.mo449b(c0705b, menu);
        }
    }

    private class C4866c extends ContentFrameLayout {
        final /* synthetic */ AppCompatDelegateImplV9 f13507a;

        public C4866c(AppCompatDelegateImplV9 appCompatDelegateImplV9, Context context) {
            this.f13507a = appCompatDelegateImplV9;
            super(context);
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!this.f13507a.mo2589a(keyEvent)) {
                if (!super.dispatchKeyEvent(keyEvent)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                boolean z;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x >= -5 && y >= -5 && x <= getWidth() + 5) {
                    if (y <= getHeight() + 5) {
                        z = false;
                        if (z) {
                            this.f13507a.m15111p();
                            return true;
                        }
                    }
                }
                z = true;
                if (z) {
                    this.f13507a.m15111p();
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public final void setBackgroundResource(int i) {
            setBackgroundDrawable(C0683b.m1656b(getContext(), i));
        }
    }

    private final class C4867d implements C0726a {
        final /* synthetic */ AppCompatDelegateImplV9 f13508a;

        C4867d(AppCompatDelegateImplV9 appCompatDelegateImplV9) {
            this.f13508a = appCompatDelegateImplV9;
        }

        public final void onCloseMenu(C4890h c4890h, boolean z) {
            Menu menu;
            Menu k = c4890h.mo2626k();
            boolean z2 = k != c4890h;
            AppCompatDelegateImplV9 appCompatDelegateImplV9 = this.f13508a;
            if (z2) {
                menu = k;
            }
            PanelFeatureState a = appCompatDelegateImplV9.m15080a(menu);
            if (a != null) {
                if (z2) {
                    this.f13508a.m15083a(a.f2192a, a, k);
                    this.f13508a.m15086a(a, true);
                    return;
                }
                this.f13508a.m15086a(a, z);
            }
        }

        public final boolean onOpenSubMenu(C4890h c4890h) {
            if (c4890h == null && this.f13508a.i) {
                Callback callback = this.f13508a.f13514c.getCallback();
                if (!(callback == null || this.f13508a.f13526o)) {
                    callback.onMenuOpened(108, c4890h);
                }
            }
            return true;
        }
    }

    class C63876 extends C4847x {
        final /* synthetic */ AppCompatDelegateImplV9 f17451a;

        C63876(AppCompatDelegateImplV9 appCompatDelegateImplV9) {
            this.f17451a = appCompatDelegateImplV9;
        }

        public final void onAnimationEnd(View view) {
            this.f17451a.f17470r.setAlpha(BallPulseIndicator.SCALE);
            this.f17451a.f17473u.m1412a(null);
            this.f17451a.f17473u = null;
        }

        public final void onAnimationStart(View view) {
            this.f17451a.f17470r.setVisibility(0);
            this.f17451a.f17470r.sendAccessibilityEvent(32);
            if (this.f17451a.f17470r.getParent() instanceof View) {
                C0571r.m1385v((View) this.f17451a.f17470r.getParent());
            }
        }
    }

    AppCompatDelegateImplV9(Context context, Window window, C0664d c0664d) {
        super(context, window, c0664d);
    }

    private void m15074a(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        if (!panelFeatureState.f2206o && !this.f13526o) {
            if (panelFeatureState.f2192a == 0) {
                Context context = this.b;
                boolean z = (context.getResources().getConfiguration().screenLayout & 15) == 4;
                boolean z2 = context.getApplicationInfo().targetSdkVersion >= 11;
                if (z && z2) {
                    return;
                }
            }
            Callback callback = this.f13514c.getCallback();
            if (callback == null || callback.onMenuOpened(panelFeatureState.f2192a, panelFeatureState.f2201j)) {
                WindowManager windowManager = (WindowManager) this.b.getSystemService("window");
                if (windowManager != null && m15076b(panelFeatureState, keyEvent)) {
                    LayoutParams layoutParams;
                    int i;
                    LayoutParams layoutParams2;
                    boolean z3;
                    ViewParent parent;
                    if (panelFeatureState.f2198g != null) {
                        if (!panelFeatureState.f2208q) {
                            if (panelFeatureState.f2200i != null) {
                                layoutParams = panelFeatureState.f2200i.getLayoutParams();
                                if (layoutParams != null && layoutParams.width == -1) {
                                    i = -1;
                                    panelFeatureState.f2205n = false;
                                    layoutParams2 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f2195d, panelFeatureState.f2196e, 1002, 8519680, -3);
                                    layoutParams2.gravity = panelFeatureState.f2194c;
                                    layoutParams2.windowAnimations = panelFeatureState.f2197f;
                                    windowManager.addView(panelFeatureState.f2198g, layoutParams2);
                                    panelFeatureState.f2206o = true;
                                    return;
                                }
                            }
                            i = -2;
                            panelFeatureState.f2205n = false;
                            layoutParams2 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f2195d, panelFeatureState.f2196e, 1002, 8519680, -3);
                            layoutParams2.gravity = panelFeatureState.f2194c;
                            layoutParams2.windowAnimations = panelFeatureState.f2197f;
                            windowManager.addView(panelFeatureState.f2198g, layoutParams2);
                            panelFeatureState.f2206o = true;
                            return;
                        }
                    }
                    if (panelFeatureState.f2198g == null) {
                        Context m = m9369m();
                        TypedValue typedValue = new TypedValue();
                        Theme newTheme = m.getResources().newTheme();
                        newTheme.setTo(m.getTheme());
                        newTheme.resolveAttribute(C0635a.actionBarPopupTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            newTheme.applyStyle(typedValue.resourceId, true);
                        }
                        newTheme.resolveAttribute(C0635a.panelMenuListTheme, typedValue, true);
                        newTheme.applyStyle(typedValue.resourceId != 0 ? typedValue.resourceId : C0643i.Theme_AppCompat_CompactMenu, true);
                        Context c0707d = new C0707d(m, 0);
                        c0707d.getTheme().setTo(newTheme);
                        panelFeatureState.f2203l = c0707d;
                        TypedArray obtainStyledAttributes = c0707d.obtainStyledAttributes(C0644j.AppCompatTheme);
                        panelFeatureState.f2193b = obtainStyledAttributes.getResourceId(C0644j.AppCompatTheme_panelBackground, 0);
                        panelFeatureState.f2197f = obtainStyledAttributes.getResourceId(C0644j.AppCompatTheme_android_windowAnimationStyle, 0);
                        obtainStyledAttributes.recycle();
                        panelFeatureState.f2198g = new C4866c(this, panelFeatureState.f2203l);
                        panelFeatureState.f2194c = 81;
                        if (panelFeatureState.f2198g == null) {
                            return;
                        }
                    } else if (panelFeatureState.f2208q && panelFeatureState.f2198g.getChildCount() > 0) {
                        panelFeatureState.f2198g.removeAllViews();
                    }
                    if (panelFeatureState.f2200i != null) {
                        panelFeatureState.f2199h = panelFeatureState.f2200i;
                    } else {
                        if (panelFeatureState.f2201j != null) {
                            ExpandedMenuView expandedMenuView;
                            if (this.f17454A == null) {
                                this.f17454A = new C4867d(this);
                            }
                            C0726a c0726a = this.f17454A;
                            if (panelFeatureState.f2201j == null) {
                                expandedMenuView = null;
                            } else {
                                if (panelFeatureState.f2202k == null) {
                                    panelFeatureState.f2202k = new C4889f(panelFeatureState.f2203l, C0641g.abc_list_menu_item_layout);
                                    panelFeatureState.f2202k.setCallback(c0726a);
                                    panelFeatureState.f2201j.m9476a(panelFeatureState.f2202k);
                                }
                                Object obj = panelFeatureState.f2202k;
                                ViewGroup viewGroup = panelFeatureState.f2198g;
                                if (obj.f13641d == null) {
                                    obj.f13641d = (ExpandedMenuView) obj.f13639b.inflate(C0641g.abc_expanded_menu_layout, viewGroup, false);
                                    if (obj.f13645h == null) {
                                        obj.f13645h = new C0720a(obj);
                                    }
                                    obj.f13641d.setAdapter(obj.f13645h);
                                    obj.f13641d.setOnItemClickListener(obj);
                                }
                                expandedMenuView = obj.f13641d;
                            }
                            panelFeatureState.f2199h = expandedMenuView;
                            if (panelFeatureState.f2199h != null) {
                            }
                        }
                        z3 = false;
                        if (z3) {
                            if (panelFeatureState.f2199h != null) {
                                if (panelFeatureState.f2200i == null) {
                                    if (panelFeatureState.f2202k.m9466a().getCount() > 0) {
                                    }
                                }
                                z3 = true;
                                if (z3) {
                                    layoutParams = panelFeatureState.f2199h.getLayoutParams();
                                    if (layoutParams == null) {
                                        layoutParams = new LayoutParams(-2, -2);
                                    }
                                    panelFeatureState.f2198g.setBackgroundResource(panelFeatureState.f2193b);
                                    parent = panelFeatureState.f2199h.getParent();
                                    if (parent != null && (parent instanceof ViewGroup)) {
                                        ((ViewGroup) parent).removeView(panelFeatureState.f2199h);
                                    }
                                    panelFeatureState.f2198g.addView(panelFeatureState.f2199h, layoutParams);
                                    if (!panelFeatureState.f2199h.hasFocus()) {
                                        panelFeatureState.f2199h.requestFocus();
                                    }
                                    i = -2;
                                    panelFeatureState.f2205n = false;
                                    layoutParams2 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f2195d, panelFeatureState.f2196e, 1002, 8519680, -3);
                                    layoutParams2.gravity = panelFeatureState.f2194c;
                                    layoutParams2.windowAnimations = panelFeatureState.f2197f;
                                    windowManager.addView(panelFeatureState.f2198g, layoutParams2);
                                    panelFeatureState.f2206o = true;
                                } else {
                                    return;
                                }
                            }
                            z3 = false;
                            if (z3) {
                                layoutParams = panelFeatureState.f2199h.getLayoutParams();
                                if (layoutParams == null) {
                                    layoutParams = new LayoutParams(-2, -2);
                                }
                                panelFeatureState.f2198g.setBackgroundResource(panelFeatureState.f2193b);
                                parent = panelFeatureState.f2199h.getParent();
                                ((ViewGroup) parent).removeView(panelFeatureState.f2199h);
                                panelFeatureState.f2198g.addView(panelFeatureState.f2199h, layoutParams);
                                if (panelFeatureState.f2199h.hasFocus()) {
                                    panelFeatureState.f2199h.requestFocus();
                                }
                                i = -2;
                                panelFeatureState.f2205n = false;
                                layoutParams2 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f2195d, panelFeatureState.f2196e, 1002, 8519680, -3);
                                layoutParams2.gravity = panelFeatureState.f2194c;
                                layoutParams2.windowAnimations = panelFeatureState.f2197f;
                                windowManager.addView(panelFeatureState.f2198g, layoutParams2);
                                panelFeatureState.f2206o = true;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    z3 = true;
                    if (z3) {
                        if (panelFeatureState.f2199h != null) {
                            if (panelFeatureState.f2200i == null) {
                                if (panelFeatureState.f2202k.m9466a().getCount() > 0) {
                                }
                            }
                            z3 = true;
                            if (z3) {
                                layoutParams = panelFeatureState.f2199h.getLayoutParams();
                                if (layoutParams == null) {
                                    layoutParams = new LayoutParams(-2, -2);
                                }
                                panelFeatureState.f2198g.setBackgroundResource(panelFeatureState.f2193b);
                                parent = panelFeatureState.f2199h.getParent();
                                ((ViewGroup) parent).removeView(panelFeatureState.f2199h);
                                panelFeatureState.f2198g.addView(panelFeatureState.f2199h, layoutParams);
                                if (panelFeatureState.f2199h.hasFocus()) {
                                    panelFeatureState.f2199h.requestFocus();
                                }
                                i = -2;
                                panelFeatureState.f2205n = false;
                                layoutParams2 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f2195d, panelFeatureState.f2196e, 1002, 8519680, -3);
                                layoutParams2.gravity = panelFeatureState.f2194c;
                                layoutParams2.windowAnimations = panelFeatureState.f2197f;
                                windowManager.addView(panelFeatureState.f2198g, layoutParams2);
                                panelFeatureState.f2206o = true;
                            } else {
                                return;
                            }
                        }
                        z3 = false;
                        if (z3) {
                            layoutParams = panelFeatureState.f2199h.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams = new LayoutParams(-2, -2);
                            }
                            panelFeatureState.f2198g.setBackgroundResource(panelFeatureState.f2193b);
                            parent = panelFeatureState.f2199h.getParent();
                            ((ViewGroup) parent).removeView(panelFeatureState.f2199h);
                            panelFeatureState.f2198g.addView(panelFeatureState.f2199h, layoutParams);
                            if (panelFeatureState.f2199h.hasFocus()) {
                                panelFeatureState.f2199h.requestFocus();
                            }
                            i = -2;
                            panelFeatureState.f2205n = false;
                            layoutParams2 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f2195d, panelFeatureState.f2196e, 1002, 8519680, -3);
                            layoutParams2.gravity = panelFeatureState.f2194c;
                            layoutParams2.windowAnimations = panelFeatureState.f2197f;
                            windowManager.addView(panelFeatureState.f2198g, layoutParams2);
                            panelFeatureState.f2206o = true;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            m15086a(panelFeatureState, true);
        }
    }

    private boolean m15075a(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent) {
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f2204m || m15076b(panelFeatureState, keyEvent)) && panelFeatureState.f2201j != null) {
            z = panelFeatureState.f2201j.performShortcut(i, keyEvent, 1);
        }
        return z;
    }

    private boolean m15076b(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        if (this.f13526o) {
            return false;
        }
        if (panelFeatureState.f2204m) {
            return true;
        }
        boolean z;
        Context context;
        TypedValue typedValue;
        Theme theme;
        Theme newTheme;
        Context c0707d;
        C4890h c4890h;
        if (!(this.f17462I == null || this.f17462I == panelFeatureState)) {
            m15086a(this.f17462I, false);
        }
        Callback callback = this.f13514c.getCallback();
        if (callback != null) {
            panelFeatureState.f2200i = callback.onCreatePanelView(panelFeatureState.f2192a);
        }
        if (panelFeatureState.f2192a != 0) {
            if (panelFeatureState.f2192a != 108) {
                z = false;
                if (z && this.f17477y != null) {
                    this.f17477y.setMenuPrepared();
                }
                if (panelFeatureState.f2200i == null && !(z && (this.f13518g instanceof C4877p))) {
                    if (panelFeatureState.f2201j == null || panelFeatureState.f2209r) {
                        if (panelFeatureState.f2201j == null) {
                            context = this.b;
                            if ((panelFeatureState.f2192a == 0 || panelFeatureState.f2192a == 108) && this.f17477y != null) {
                                typedValue = new TypedValue();
                                theme = context.getTheme();
                                theme.resolveAttribute(C0635a.actionBarTheme, typedValue, true);
                                if (typedValue.resourceId == 0) {
                                    newTheme = context.getResources().newTheme();
                                    newTheme.setTo(theme);
                                    newTheme.applyStyle(typedValue.resourceId, true);
                                    newTheme.resolveAttribute(C0635a.actionBarWidgetTheme, typedValue, true);
                                } else {
                                    theme.resolveAttribute(C0635a.actionBarWidgetTheme, typedValue, true);
                                    newTheme = null;
                                }
                                if (typedValue.resourceId != 0) {
                                    if (newTheme == null) {
                                        newTheme = context.getResources().newTheme();
                                        newTheme.setTo(theme);
                                    }
                                    newTheme.applyStyle(typedValue.resourceId, true);
                                }
                                if (newTheme != null) {
                                    c0707d = new C0707d(context, 0);
                                    c0707d.getTheme().setTo(newTheme);
                                    c4890h = new C4890h(c0707d);
                                    c4890h.mo2620a((C0722a) this);
                                    panelFeatureState.m1579a(c4890h);
                                    if (panelFeatureState.f2201j == null) {
                                        return false;
                                    }
                                }
                            }
                            c0707d = context;
                            c4890h = new C4890h(c0707d);
                            c4890h.mo2620a((C0722a) this);
                            panelFeatureState.m1579a(c4890h);
                            if (panelFeatureState.f2201j == null) {
                                return false;
                            }
                        }
                        if (z && this.f17477y != null) {
                            if (this.f17478z == null) {
                                this.f17478z = new C4864a(this);
                            }
                            this.f17477y.setMenu(panelFeatureState.f2201j, this.f17478z);
                        }
                        panelFeatureState.f2201j.m9489d();
                        if (callback.onCreatePanelMenu(panelFeatureState.f2192a, panelFeatureState.f2201j)) {
                            panelFeatureState.m1579a(null);
                            if (z && this.f17477y != null) {
                                this.f17477y.setMenu(null, this.f17478z);
                            }
                            return false;
                        }
                        panelFeatureState.f2209r = false;
                    }
                    panelFeatureState.f2201j.m9489d();
                    if (panelFeatureState.f2210s != null) {
                        panelFeatureState.f2201j.m9490d(panelFeatureState.f2210s);
                        panelFeatureState.f2210s = null;
                    }
                    if (callback.onPreparePanel(0, panelFeatureState.f2200i, panelFeatureState.f2201j)) {
                        if (z && this.f17477y != null) {
                            this.f17477y.setMenu(null, this.f17478z);
                        }
                        panelFeatureState.f2201j.m9491e();
                        return false;
                    }
                    panelFeatureState.f2207p = KeyCharacterMap.load(keyEvent == null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1;
                    panelFeatureState.f2201j.setQwertyMode(panelFeatureState.f2207p);
                    panelFeatureState.f2201j.m9491e();
                }
                panelFeatureState.f2204m = true;
                panelFeatureState.f2205n = false;
                this.f17462I = panelFeatureState;
                return true;
            }
        }
        z = true;
        this.f17477y.setMenuPrepared();
        if (panelFeatureState.f2201j == null) {
            context = this.b;
            typedValue = new TypedValue();
            theme = context.getTheme();
            theme.resolveAttribute(C0635a.actionBarTheme, typedValue, true);
            if (typedValue.resourceId == 0) {
                theme.resolveAttribute(C0635a.actionBarWidgetTheme, typedValue, true);
                newTheme = null;
            } else {
                newTheme = context.getResources().newTheme();
                newTheme.setTo(theme);
                newTheme.applyStyle(typedValue.resourceId, true);
                newTheme.resolveAttribute(C0635a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (newTheme == null) {
                    newTheme = context.getResources().newTheme();
                    newTheme.setTo(theme);
                }
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            if (newTheme != null) {
                c0707d = new C0707d(context, 0);
                c0707d.getTheme().setTo(newTheme);
                c4890h = new C4890h(c0707d);
                c4890h.mo2620a((C0722a) this);
                panelFeatureState.m1579a(c4890h);
                if (panelFeatureState.f2201j == null) {
                    return false;
                }
            }
            c0707d = context;
            c4890h = new C4890h(c0707d);
            c4890h.mo2620a((C0722a) this);
            panelFeatureState.m1579a(c4890h);
            if (panelFeatureState.f2201j == null) {
                return false;
            }
        }
        if (this.f17478z == null) {
            this.f17478z = new C4864a(this);
        }
        this.f17477y.setMenu(panelFeatureState.f2201j, this.f17478z);
        panelFeatureState.f2201j.m9489d();
        if (callback.onCreatePanelMenu(panelFeatureState.f2192a, panelFeatureState.f2201j)) {
            panelFeatureState.f2209r = false;
            panelFeatureState.f2201j.m9489d();
            if (panelFeatureState.f2210s != null) {
                panelFeatureState.f2201j.m9490d(panelFeatureState.f2210s);
                panelFeatureState.f2210s = null;
            }
            if (callback.onPreparePanel(0, panelFeatureState.f2200i, panelFeatureState.f2201j)) {
                if (keyEvent == null) {
                }
                if (KeyCharacterMap.load(keyEvent == null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
                }
                panelFeatureState.f2207p = KeyCharacterMap.load(keyEvent == null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1;
                panelFeatureState.f2201j.setQwertyMode(panelFeatureState.f2207p);
                panelFeatureState.f2201j.m9491e();
                panelFeatureState.f2204m = true;
                panelFeatureState.f2205n = false;
                this.f17462I = panelFeatureState;
                return true;
            }
            this.f17477y.setMenu(null, this.f17478z);
            panelFeatureState.f2201j.m9491e();
            return false;
        }
        panelFeatureState.m1579a(null);
        this.f17477y.setMenu(null, this.f17478z);
        return false;
    }

    private void mo3505f(int i) {
        this.f17476x = (1 << i) | this.f17476x;
        if (!this.f17475w) {
            C0571r.m1343a(this.c.getDecorView(), this.f17464K);
            this.f17475w = true;
        }
    }

    private void m15078r() {
        if (!this.f17455B) {
            TypedArray obtainStyledAttributes = this.b.obtainStyledAttributes(C0644j.AppCompatTheme);
            if (obtainStyledAttributes.hasValue(C0644j.AppCompatTheme_windowActionBar)) {
                View view;
                if (obtainStyledAttributes.getBoolean(C0644j.AppCompatTheme_windowNoTitle, false)) {
                    mo2594c(1);
                } else if (obtainStyledAttributes.getBoolean(C0644j.AppCompatTheme_windowActionBar, false)) {
                    mo2594c(108);
                }
                if (obtainStyledAttributes.getBoolean(C0644j.AppCompatTheme_windowActionBarOverlay, false)) {
                    mo2594c(109);
                }
                if (obtainStyledAttributes.getBoolean(C0644j.AppCompatTheme_windowActionModeOverlay, false)) {
                    mo2594c(10);
                }
                this.l = obtainStyledAttributes.getBoolean(C0644j.AppCompatTheme_android_windowIsFloating, false);
                obtainStyledAttributes.recycle();
                this.c.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.b);
                if (this.m) {
                    view = (ViewGroup) from.inflate(this.k ? C0641g.abc_screen_simple_overlay_action_mode : C0641g.abc_screen_simple, null);
                    if (VERSION.SDK_INT >= 21) {
                        C0571r.m1341a(view, new C48612(this));
                    } else {
                        ((FitWindowsViewGroup) view).setOnFitSystemWindowsListener(new C48623(this));
                    }
                } else if (this.l) {
                    view = (ViewGroup) from.inflate(C0641g.abc_dialog_title_material, null);
                    this.j = false;
                    this.i = false;
                } else if (this.i) {
                    TypedValue typedValue = new TypedValue();
                    this.b.getTheme().resolveAttribute(C0635a.actionBarTheme, typedValue, true);
                    view = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0707d(this.b, typedValue.resourceId) : this.b).inflate(C0641g.abc_screen_toolbar, null);
                    this.f17477y = (DecorContentParent) view.findViewById(C0640f.decor_content_parent);
                    this.f17477y.setWindowCallback(this.f13514c.getCallback());
                    if (this.j) {
                        this.f17477y.initFeature(109);
                    }
                    if (this.f17458E) {
                        this.f17477y.initFeature(2);
                    }
                    if (this.f17459F) {
                        this.f17477y.initFeature(5);
                    }
                } else {
                    view = null;
                }
                if (view == null) {
                    StringBuilder stringBuilder = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
                    stringBuilder.append(this.i);
                    stringBuilder.append(", windowActionBarOverlay: ");
                    stringBuilder.append(this.j);
                    stringBuilder.append(", android:windowIsFloating: ");
                    stringBuilder.append(this.l);
                    stringBuilder.append(", windowActionModeOverlay: ");
                    stringBuilder.append(this.k);
                    stringBuilder.append(", windowNoTitle: ");
                    stringBuilder.append(this.m);
                    stringBuilder.append(" }");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                if (this.f17477y == null) {
                    this.f17456C = (TextView) view.findViewById(C0640f.title);
                }
                ViewUtils.makeOptionalFitsSystemWindows(view);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) view.findViewById(C0640f.action_bar_activity_content);
                ViewGroup viewGroup = (ViewGroup) this.c.findViewById(16908290);
                if (viewGroup != null) {
                    while (viewGroup.getChildCount() > 0) {
                        View childAt = viewGroup.getChildAt(0);
                        viewGroup.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup instanceof FrameLayout) {
                        ((FrameLayout) viewGroup).setForeground(null);
                    }
                }
                this.c.setContentView(view);
                contentFrameLayout.setAttachListener(new C48634(this));
                this.f17474v = view;
                CharSequence title = this.f13515d instanceof Activity ? ((Activity) this.f13515d).getTitle() : this.f13525n;
                if (!TextUtils.isEmpty(title)) {
                    mo2592b(title);
                }
                ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f17474v.findViewById(16908290);
                View decorView = this.c.getDecorView();
                contentFrameLayout2.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                TypedArray obtainStyledAttributes2 = this.b.obtainStyledAttributes(C0644j.AppCompatTheme);
                obtainStyledAttributes2.getValue(C0644j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
                obtainStyledAttributes2.getValue(C0644j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
                if (obtainStyledAttributes2.hasValue(C0644j.AppCompatTheme_windowFixedWidthMajor)) {
                    obtainStyledAttributes2.getValue(C0644j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.getFixedWidthMajor());
                }
                if (obtainStyledAttributes2.hasValue(C0644j.AppCompatTheme_windowFixedWidthMinor)) {
                    obtainStyledAttributes2.getValue(C0644j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.getFixedWidthMinor());
                }
                if (obtainStyledAttributes2.hasValue(C0644j.AppCompatTheme_windowFixedHeightMajor)) {
                    obtainStyledAttributes2.getValue(C0644j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.getFixedHeightMajor());
                }
                if (obtainStyledAttributes2.hasValue(C0644j.AppCompatTheme_windowFixedHeightMinor)) {
                    obtainStyledAttributes2.getValue(C0644j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.getFixedHeightMinor());
                }
                obtainStyledAttributes2.recycle();
                contentFrameLayout2.requestLayout();
                this.f17455B = true;
                PanelFeatureState g = m15102g(0);
                if (!this.f13526o) {
                    if (g == null || g.f2201j == null) {
                        mo3505f(108);
                        return;
                    }
                    return;
                }
                return;
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    private void m15079s() {
        if (this.f17455B) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    final PanelFeatureState m15080a(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.f17461H;
        int i = 0;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        while (i < length) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.f2201j == menu) {
                return panelFeatureState;
            }
            i++;
        }
        return null;
    }

    public final <T extends View> T mo2582a(int i) {
        m15078r();
        return this.c.findViewById(i);
    }

    View mo3303a(String str, Context context, AttributeSet attributeSet) {
        if (this.d instanceof Factory) {
            View onCreateView = ((Factory) this.d).onCreateView(str, context, attributeSet);
            if (onCreateView != null) {
                return onCreateView;
            }
        }
        return null;
    }

    final void m15083a(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0 && i < this.f17461H.length) {
                panelFeatureState = this.f17461H[i];
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f2201j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f2206o) && !this.f13526o) {
            this.d.onPanelClosed(i, menu);
        }
    }

    public final void mo2583a(Configuration configuration) {
        if (this.i && this.f17455B) {
            C0662a a = mo457a();
            if (a != null) {
                a.mo468a(configuration);
            }
        }
        AppCompatDrawableManager.get().onConfigurationChanged(this.b);
        mo464j();
    }

    public void mo2584a(Bundle bundle) {
        if ((this.d instanceof Activity) && C0418u.m842b((Activity) this.d) != null) {
            C0662a c0662a = this.f13518g;
            if (c0662a == null) {
                this.f17465L = true;
                return;
            }
            c0662a.mo479c(true);
        }
    }

    final void m15086a(PanelFeatureState panelFeatureState, boolean z) {
        if (z && panelFeatureState.f2192a == 0 && this.f17477y != null && this.f17477y.isOverflowMenuShowing()) {
            m15087a(panelFeatureState.f2201j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.b.getSystemService("window");
        if (!(windowManager == null || !panelFeatureState.f2206o || panelFeatureState.f2198g == null)) {
            windowManager.removeView(panelFeatureState.f2198g);
            if (z) {
                m15083a(panelFeatureState.f2192a, panelFeatureState, null);
            }
        }
        panelFeatureState.f2204m = false;
        panelFeatureState.f2205n = false;
        panelFeatureState.f2206o = false;
        panelFeatureState.f2199h = null;
        panelFeatureState.f2208q = true;
        if (this.f17462I == panelFeatureState) {
            this.f17462I = null;
        }
    }

    final void m15087a(C4890h c4890h) {
        if (!this.f17460G) {
            this.f17460G = true;
            this.f17477y.dismissPopups();
            Callback callback = this.f13514c.getCallback();
            if (!(callback == null || this.f13526o)) {
                callback.onPanelClosed(108, c4890h);
            }
            this.f17460G = false;
        }
    }

    public final void mo2585a(Toolbar toolbar) {
        if (this.d instanceof Activity) {
            C0662a a = mo457a();
            if (a instanceof C4880s) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            Window window;
            Callback callback;
            this.h = null;
            if (a != null) {
                a.mo488j();
            }
            if (toolbar != null) {
                a = new C4877p(toolbar, ((Activity) this.d).getTitle(), this.e);
                this.g = a;
                window = this.c;
                callback = a.f13536c;
            } else {
                this.g = null;
                window = this.c;
                callback = this.e;
            }
            window.setCallback(callback);
            mo2598g();
        }
    }

    public final void mo2586a(View view) {
        m15078r();
        ViewGroup viewGroup = (ViewGroup) this.f17474v.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.d.onContentChanged();
    }

    public final void mo2587a(View view, LayoutParams layoutParams) {
        m15078r();
        ViewGroup viewGroup = (ViewGroup) this.f17474v.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.d.onContentChanged();
    }

    final boolean mo2588a(int i, KeyEvent keyEvent) {
        C0662a a = mo457a();
        if (a != null && a.mo472a(i, keyEvent)) {
            return true;
        }
        if (this.f17462I == null || !m15075a(this.f17462I, keyEvent.getKeyCode(), keyEvent)) {
            if (this.f17462I == null) {
                PanelFeatureState g = m15102g(0);
                m15076b(g, keyEvent);
                boolean a2 = m15075a(g, keyEvent.getKeyCode(), keyEvent);
                g.f2204m = false;
                if (a2) {
                    return true;
                }
            }
            return false;
        }
        if (this.f17462I != null) {
            this.f17462I.f2205n = true;
        }
        return true;
    }

    final boolean mo2589a(KeyEvent keyEvent) {
        boolean z = true;
        if (keyEvent.getKeyCode() == 82 && this.d.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        PanelFeatureState g;
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                if ((keyEvent.getFlags() & 128) == 0) {
                    z = false;
                }
                this.f17463J = z;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() == 0) {
                    g = m15102g(0);
                    if (!g.f2206o) {
                        m15076b(g, keyEvent);
                    }
                }
                return true;
            }
            if (VERSION.SDK_INT < 11) {
                mo2588a(keyCode, keyEvent);
            }
            return false;
        } else if (keyCode == 4) {
            r7 = this.f17463J;
            this.f17463J = false;
            g = m15102g(0);
            if (g == null || !g.f2206o) {
                if (this.f17469q != null) {
                    this.f17469q.mo498c();
                } else {
                    C0662a a = mo457a();
                    if (a == null || !a.mo487i()) {
                        r7 = false;
                        return r7;
                    }
                }
                r7 = true;
                if (r7) {
                }
            }
            if (!r7) {
                m15086a(g, true);
            }
            return true;
        } else if (keyCode != 82) {
            return false;
        } else {
            if (this.f17469q == null) {
                AudioManager audioManager;
                g = m15102g(0);
                if (this.f17477y == null || !this.f17477y.canShowOverflowMenu() || ViewConfiguration.get(this.b).hasPermanentMenuKey()) {
                    if (!g.f2206o) {
                        if (!g.f2205n) {
                            if (g.f2204m) {
                                boolean b;
                                if (g.f2209r) {
                                    g.f2204m = false;
                                    b = m15076b(g, keyEvent);
                                } else {
                                    b = true;
                                }
                                if (b) {
                                    m15074a(g, keyEvent);
                                    r7 = true;
                                    if (r7) {
                                        audioManager = (AudioManager) this.b.getSystemService("audio");
                                        if (audioManager == null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                    }
                                }
                            }
                        }
                    }
                    r7 = g.f2206o;
                    m15086a(g, true);
                    if (r7) {
                        audioManager = (AudioManager) this.b.getSystemService("audio");
                        if (audioManager == null) {
                            Log.w("AppCompatDelegate", "Couldn't get audio manager");
                        } else {
                            audioManager.playSoundEffect(0);
                            return true;
                        }
                    }
                }
                if (this.f17477y.isOverflowMenuShowing()) {
                    r7 = this.f17477y.hideOverflowMenu();
                } else if (!this.f13526o && m15076b(g, keyEvent)) {
                    r7 = this.f17477y.showOverflowMenu();
                }
                if (r7) {
                    audioManager = (AudioManager) this.b.getSystemService("audio");
                    if (audioManager == null) {
                        audioManager.playSoundEffect(0);
                        return true;
                    }
                    Log.w("AppCompatDelegate", "Couldn't get audio manager");
                }
                r7 = false;
                if (r7) {
                    audioManager = (AudioManager) this.b.getSystemService("audio");
                    if (audioManager == null) {
                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                    } else {
                        audioManager.playSoundEffect(0);
                        return true;
                    }
                }
            }
            return true;
        }
    }

    public final void mo2590b(int i) {
        m15078r();
        ViewGroup viewGroup = (ViewGroup) this.f17474v.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.b).inflate(i, viewGroup);
        this.d.onContentChanged();
    }

    public final void mo2591b(View view, LayoutParams layoutParams) {
        m15078r();
        ((ViewGroup) this.f17474v.findViewById(16908290)).addView(view, layoutParams);
        this.d.onContentChanged();
    }

    final void mo2592b(CharSequence charSequence) {
        if (this.f17477y != null) {
            this.f17477y.setWindowTitle(charSequence);
        } else if (this.f13518g != null) {
            this.f13518g.mo478c(charSequence);
        } else {
            if (this.f17456C != null) {
                this.f17456C.setText(charSequence);
            }
        }
    }

    public final void mo2593c() {
        m15078r();
    }

    public final boolean mo2594c(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.m && i == 108) {
            return false;
        }
        if (this.i && i == 1) {
            this.i = false;
        }
        switch (i) {
            case 1:
                m15079s();
                this.m = true;
                return true;
            case 2:
                m15079s();
                this.f17458E = true;
                return true;
            case 5:
                m15079s();
                this.f17459F = true;
                return true;
            case 10:
                m15079s();
                this.k = true;
                return true;
            case 108:
                m15079s();
                this.i = true;
                return true;
            case 109:
                m15079s();
                this.j = true;
                return true;
            default:
                return this.c.requestFeature(i);
        }
    }

    final void mo2595d(int i) {
        if (i == 108) {
            C0662a a = mo457a();
            if (a != null) {
                a.mo483e(false);
            }
            return;
        }
        if (i == 0) {
            PanelFeatureState g = m15102g(i);
            if (g.f2206o) {
                m15086a(g, false);
            }
        }
    }

    public void mo462e() {
        C0662a a = mo457a();
        if (a != null) {
            a.mo481d(false);
        }
    }

    final boolean mo2596e(int i) {
        if (i != 108) {
            return false;
        }
        C0662a a = mo457a();
        if (a != null) {
            a.mo483e(true);
        }
        return true;
    }

    public final void mo2597f() {
        C0662a a = mo457a();
        if (a != null) {
            a.mo481d(true);
        }
    }

    protected final PanelFeatureState m15102g(int i) {
        Object obj = this.f17461H;
        if (obj == null || obj.length <= i) {
            Object obj2 = new PanelFeatureState[(i + 1)];
            if (obj != null) {
                System.arraycopy(obj, 0, obj2, 0, obj.length);
            }
            this.f17461H = obj2;
            obj = obj2;
        }
        PanelFeatureState panelFeatureState = obj[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        panelFeatureState = new PanelFeatureState(i);
        obj[i] = panelFeatureState;
        return panelFeatureState;
    }

    public final void mo2598g() {
        C0662a a = mo457a();
        if (a == null || !a.mo486h()) {
            mo3505f(0);
        }
    }

    public void mo463h() {
        if (this.f17475w) {
            this.c.getDecorView().removeCallbacks(this.f17464K);
        }
        super.mo463h();
        if (this.g != null) {
            this.g.mo488j();
        }
    }

    final void m15105h(int i) {
        PanelFeatureState g = m15102g(i);
        if (g.f2201j != null) {
            Bundle bundle = new Bundle();
            g.f2201j.m9487c(bundle);
            if (bundle.size() > 0) {
                g.f2210s = bundle;
            }
            g.f2201j.m9489d();
            g.f2201j.clear();
        }
        g.f2209r = true;
        g.f2208q = true;
        if ((i == 108 || i == 0) && this.f17477y != null) {
            g = m15102g(0);
            if (g != null) {
                g.f2204m = false;
                m15076b(g, null);
            }
        }
    }

    final int m15106i(int i) {
        int i2;
        int i3 = 0;
        if (this.f17470r == null || !(this.f17470r.getLayoutParams() instanceof MarginLayoutParams)) {
            i2 = 0;
        } else {
            int i4;
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f17470r.getLayoutParams();
            i2 = 1;
            if (this.f17470r.isShown()) {
                if (this.f17466M == null) {
                    this.f17466M = new Rect();
                    this.f17467N = new Rect();
                }
                Rect rect = this.f17466M;
                Rect rect2 = this.f17467N;
                rect.set(0, i, 0, 0);
                ViewUtils.computeFitSystemWindows(this.f17474v, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    if (this.f17457D == null) {
                        this.f17457D = new View(this.b);
                        this.f17457D.setBackgroundColor(this.b.getResources().getColor(C0637c.abc_input_method_navigation_guard));
                        this.f17474v.addView(this.f17457D, -1, new LayoutParams(-1, i));
                    } else {
                        LayoutParams layoutParams = this.f17457D.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f17457D.setLayoutParams(layoutParams);
                        }
                    }
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (this.f17457D == null) {
                    i2 = 0;
                }
                if (!(this.k || r3 == 0)) {
                    i = 0;
                }
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                i4 = 1;
                i2 = 0;
            } else {
                i4 = 0;
                i2 = i4;
            }
            if (i4 != 0) {
                this.f17470r.setLayoutParams(marginLayoutParams);
            }
        }
        if (this.f17457D != null) {
            View view = this.f17457D;
            if (i2 == 0) {
                i3 = 8;
            }
            view.setVisibility(i3);
        }
        return i;
    }

    public final void mo2599i() {
        LayoutInflater from = LayoutInflater.from(this.b);
        if (from.getFactory() == null) {
            C0557e.m1228b(from, this);
            return;
        }
        if (!(from.getFactory2() instanceof AppCompatDelegateImplV9)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final void mo2600l() {
        m15078r();
        if (this.i && this.g == null) {
            C0662a c4880s;
            if (this.d instanceof Activity) {
                c4880s = new C4880s((Activity) this.d, this.j);
            } else {
                if (this.d instanceof Dialog) {
                    c4880s = new C4880s((Dialog) this.d);
                }
                if (this.g != null) {
                    this.g.mo479c(this.f17465L);
                }
            }
            this.g = c4880s;
            if (this.g != null) {
                this.g.mo479c(this.f17465L);
            }
        }
    }

    final boolean m15109n() {
        return this.f17455B && this.f17474v != null && C0571r.m1326D(this.f17474v);
    }

    final void m15110o() {
        if (this.f17473u != null) {
            this.f17473u.m1415a();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r7, java.lang.String r8, android.content.Context r9, android.util.AttributeSet r10) {
        /*
        r6 = this;
        r0 = r6.mo3303a(r8, r9, r10);
        if (r0 == 0) goto L_0x0007;
    L_0x0006:
        return r0;
    L_0x0007:
        r0 = r6.f17468O;
        if (r0 != 0) goto L_0x0012;
    L_0x000b:
        r0 = new android.support.v7.app.m;
        r0.<init>();
        r6.f17468O = r0;
    L_0x0012:
        r0 = f17453p;
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x004b;
    L_0x0018:
        r0 = r10 instanceof org.xmlpull.v1.XmlPullParser;
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r10;
        r0 = (org.xmlpull.v1.XmlPullParser) r0;
        r0 = r0.getDepth();
        if (r0 <= r1) goto L_0x004b;
    L_0x0025:
        r0 = r1;
        goto L_0x004c;
    L_0x0027:
        r0 = r7;
        r0 = (android.view.ViewParent) r0;
        if (r0 != 0) goto L_0x002d;
    L_0x002c:
        goto L_0x004b;
    L_0x002d:
        r3 = r6.c;
        r3 = r3.getDecorView();
    L_0x0033:
        if (r0 != 0) goto L_0x0036;
    L_0x0035:
        goto L_0x0025;
    L_0x0036:
        if (r0 == r3) goto L_0x004b;
    L_0x0038:
        r4 = r0 instanceof android.view.View;
        if (r4 == 0) goto L_0x004b;
    L_0x003c:
        r4 = r0;
        r4 = (android.view.View) r4;
        r4 = android.support.v4.view.C0571r.m1329G(r4);
        if (r4 == 0) goto L_0x0046;
    L_0x0045:
        goto L_0x004b;
    L_0x0046:
        r0 = r0.getParent();
        goto L_0x0033;
    L_0x004b:
        r0 = r2;
    L_0x004c:
        r3 = r6.f17468O;
        r4 = f17453p;
        r5 = android.support.v7.widget.VectorEnabledTintResources.shouldBeUsed();
        if (r0 == 0) goto L_0x005d;
    L_0x0056:
        if (r7 == 0) goto L_0x005d;
    L_0x0058:
        r7 = r7.getContext();
        goto L_0x005e;
    L_0x005d:
        r7 = r9;
    L_0x005e:
        r7 = android.support.v7.app.C0670m.m1642a(r7, r10, r4);
        if (r5 == 0) goto L_0x0068;
    L_0x0064:
        r7 = android.support.v7.widget.TintContextWrapper.wrap(r7);
    L_0x0068:
        r0 = 0;
        r4 = -1;
        r5 = r8.hashCode();
        switch(r5) {
            case -1946472170: goto L_0x00f2;
            case -1455429095: goto L_0x00e7;
            case -1346021293: goto L_0x00dc;
            case -938935918: goto L_0x00d2;
            case -937446323: goto L_0x00c8;
            case -658531749: goto L_0x00bd;
            case -339785223: goto L_0x00b3;
            case 776382189: goto L_0x00a9;
            case 1125864064: goto L_0x00a0;
            case 1413872058: goto L_0x0094;
            case 1601505219: goto L_0x0089;
            case 1666676343: goto L_0x007e;
            case 2001146706: goto L_0x0073;
            default: goto L_0x0071;
        };
    L_0x0071:
        goto L_0x00fd;
    L_0x0073:
        r1 = "Button";
        r1 = r8.equals(r1);
        if (r1 == 0) goto L_0x00fd;
    L_0x007b:
        r1 = 2;
        goto L_0x00fe;
    L_0x007e:
        r1 = "EditText";
        r1 = r8.equals(r1);
        if (r1 == 0) goto L_0x00fd;
    L_0x0086:
        r1 = 3;
        goto L_0x00fe;
    L_0x0089:
        r1 = "CheckBox";
        r1 = r8.equals(r1);
        if (r1 == 0) goto L_0x00fd;
    L_0x0091:
        r1 = 6;
        goto L_0x00fe;
    L_0x0094:
        r1 = "AutoCompleteTextView";
        r1 = r8.equals(r1);
        if (r1 == 0) goto L_0x00fd;
    L_0x009c:
        r1 = 9;
        goto L_0x00fe;
    L_0x00a0:
        r2 = "ImageView";
        r2 = r8.equals(r2);
        if (r2 == 0) goto L_0x00fd;
    L_0x00a8:
        goto L_0x00fe;
    L_0x00a9:
        r1 = "RadioButton";
        r1 = r8.equals(r1);
        if (r1 == 0) goto L_0x00fd;
    L_0x00b1:
        r1 = 7;
        goto L_0x00fe;
    L_0x00b3:
        r1 = "Spinner";
        r1 = r8.equals(r1);
        if (r1 == 0) goto L_0x00fd;
    L_0x00bb:
        r1 = 4;
        goto L_0x00fe;
    L_0x00bd:
        r1 = "SeekBar";
        r1 = r8.equals(r1);
        if (r1 == 0) goto L_0x00fd;
    L_0x00c5:
        r1 = 12;
        goto L_0x00fe;
    L_0x00c8:
        r1 = "ImageButton";
        r1 = r8.equals(r1);
        if (r1 == 0) goto L_0x00fd;
    L_0x00d0:
        r1 = 5;
        goto L_0x00fe;
    L_0x00d2:
        r1 = "TextView";
        r1 = r8.equals(r1);
        if (r1 == 0) goto L_0x00fd;
    L_0x00da:
        r1 = r2;
        goto L_0x00fe;
    L_0x00dc:
        r1 = "MultiAutoCompleteTextView";
        r1 = r8.equals(r1);
        if (r1 == 0) goto L_0x00fd;
    L_0x00e4:
        r1 = 10;
        goto L_0x00fe;
    L_0x00e7:
        r1 = "CheckedTextView";
        r1 = r8.equals(r1);
        if (r1 == 0) goto L_0x00fd;
    L_0x00ef:
        r1 = 8;
        goto L_0x00fe;
    L_0x00f2:
        r1 = "RatingBar";
        r1 = r8.equals(r1);
        if (r1 == 0) goto L_0x00fd;
    L_0x00fa:
        r1 = 11;
        goto L_0x00fe;
    L_0x00fd:
        r1 = r4;
    L_0x00fe:
        switch(r1) {
            case 0: goto L_0x014a;
            case 1: goto L_0x0144;
            case 2: goto L_0x013e;
            case 3: goto L_0x0138;
            case 4: goto L_0x0132;
            case 5: goto L_0x012c;
            case 6: goto L_0x0126;
            case 7: goto L_0x0120;
            case 8: goto L_0x011a;
            case 9: goto L_0x0114;
            case 10: goto L_0x010e;
            case 11: goto L_0x0108;
            case 12: goto L_0x0102;
            default: goto L_0x0101;
        };
    L_0x0101:
        goto L_0x014f;
    L_0x0102:
        r0 = new android.support.v7.widget.AppCompatSeekBar;
        r0.<init>(r7, r10);
        goto L_0x014f;
    L_0x0108:
        r0 = new android.support.v7.widget.AppCompatRatingBar;
        r0.<init>(r7, r10);
        goto L_0x014f;
    L_0x010e:
        r0 = new android.support.v7.widget.AppCompatMultiAutoCompleteTextView;
        r0.<init>(r7, r10);
        goto L_0x014f;
    L_0x0114:
        r0 = new android.support.v7.widget.AppCompatAutoCompleteTextView;
        r0.<init>(r7, r10);
        goto L_0x014f;
    L_0x011a:
        r0 = new android.support.v7.widget.AppCompatCheckedTextView;
        r0.<init>(r7, r10);
        goto L_0x014f;
    L_0x0120:
        r0 = new android.support.v7.widget.AppCompatRadioButton;
        r0.<init>(r7, r10);
        goto L_0x014f;
    L_0x0126:
        r0 = new android.support.v7.widget.AppCompatCheckBox;
        r0.<init>(r7, r10);
        goto L_0x014f;
    L_0x012c:
        r0 = new android.support.v7.widget.AppCompatImageButton;
        r0.<init>(r7, r10);
        goto L_0x014f;
    L_0x0132:
        r0 = new android.support.v7.widget.AppCompatSpinner;
        r0.<init>(r7, r10);
        goto L_0x014f;
    L_0x0138:
        r0 = new android.support.v7.widget.AppCompatEditText;
        r0.<init>(r7, r10);
        goto L_0x014f;
    L_0x013e:
        r0 = new android.support.v7.widget.AppCompatButton;
        r0.<init>(r7, r10);
        goto L_0x014f;
    L_0x0144:
        r0 = new android.support.v7.widget.AppCompatImageView;
        r0.<init>(r7, r10);
        goto L_0x014f;
    L_0x014a:
        r0 = new android.support.v7.widget.AppCompatTextView;
        r0.<init>(r7, r10);
    L_0x014f:
        if (r0 != 0) goto L_0x0157;
    L_0x0151:
        if (r9 == r7) goto L_0x0157;
    L_0x0153:
        r0 = r3.m1645a(r7, r8, r10);
    L_0x0157:
        if (r0 == 0) goto L_0x015c;
    L_0x0159:
        android.support.v7.app.C0670m.m1644a(r0, r10);
    L_0x015c:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImplV9.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public boolean onMenuItemSelected(C4890h c4890h, MenuItem menuItem) {
        Callback callback = this.f13514c.getCallback();
        if (!(callback == null || this.f13526o)) {
            PanelFeatureState a = m15080a(c4890h.mo2626k());
            if (a != null) {
                return callback.onMenuItemSelected(a.f2192a, menuItem);
            }
        }
        return false;
    }

    public void onMenuModeChange(C4890h c4890h) {
        if (this.f17477y == null || !this.f17477y.canShowOverflowMenu() || (ViewConfiguration.get(this.b).hasPermanentMenuKey() && !this.f17477y.isOverflowMenuShowPending())) {
            PanelFeatureState g = m15102g(0);
            g.f2208q = true;
            m15086a(g, false);
            m15074a(g, null);
            return;
        }
        Callback callback = this.f13514c.getCallback();
        if (this.f17477y.isOverflowMenuShowing()) {
            this.f17477y.hideOverflowMenu();
            if (!this.f13526o) {
                callback.onPanelClosed(108, m15102g(0).f2201j);
            }
        } else if (!(callback == null || this.f13526o)) {
            if (this.f17475w && (1 & this.f17476x) != 0) {
                this.c.getDecorView().removeCallbacks(this.f17464K);
                this.f17464K.run();
            }
            PanelFeatureState g2 = m15102g(0);
            if (!(g2.f2201j == null || g2.f2209r || !callback.onPreparePanel(0, g2.f2200i, g2.f2201j))) {
                callback.onMenuOpened(108, g2.f2201j);
                this.f17477y.showOverflowMenu();
            }
        }
    }

    final void m15111p() {
        m15086a(m15102g(0), true);
    }

    final void m15112q() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.f17477y;
        if (r0 == 0) goto L_0x0009;
    L_0x0004:
        r0 = r2.f17477y;
        r0.dismissPopups();
    L_0x0009:
        r0 = r2.f17471s;
        if (r0 == 0) goto L_0x0028;
    L_0x000d:
        r0 = r2.c;
        r0 = r0.getDecorView();
        r1 = r2.f17472t;
        r0.removeCallbacks(r1);
        r0 = r2.f17471s;
        r0 = r0.isShowing();
        if (r0 == 0) goto L_0x0025;
    L_0x0020:
        r0 = r2.f17471s;	 Catch:{ IllegalArgumentException -> 0x0025 }
        r0.dismiss();	 Catch:{ IllegalArgumentException -> 0x0025 }
    L_0x0025:
        r0 = 0;
        r2.f17471s = r0;
    L_0x0028:
        r2.m15110o();
        r0 = 0;
        r0 = r2.m15102g(r0);
        if (r0 == 0) goto L_0x003b;
    L_0x0032:
        r1 = r0.f2201j;
        if (r1 == 0) goto L_0x003b;
    L_0x0036:
        r0 = r0.f2201j;
        r0.close();
    L_0x003b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImplV9.q():void");
    }
}
