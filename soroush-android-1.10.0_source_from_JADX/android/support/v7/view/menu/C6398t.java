package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v7.p041a.C0645a.C0638d;
import android.support.v7.p041a.C0645a.C0641g;
import android.support.v7.view.menu.C0727o.C0726a;
import android.support.v7.widget.MenuPopupWindow;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;

final class C6398t extends C4898m implements C0727o, OnKeyListener, OnItemClickListener, OnDismissListener {
    final MenuPopupWindow f17526a;
    View f17527b;
    private final Context f17528c;
    private final C4890h f17529d;
    private final C0721g f17530f;
    private final boolean f17531g;
    private final int f17532h;
    private final int f17533i;
    private final int f17534j;
    private final OnGlobalLayoutListener f17535k = new C07321(this);
    private final OnAttachStateChangeListener f17536l = new C07332(this);
    private OnDismissListener f17537m;
    private View f17538n;
    private C0726a f17539o;
    private ViewTreeObserver f17540p;
    private boolean f17541q;
    private boolean f17542r;
    private int f17543s;
    private int f17544t = 0;
    private boolean f17545u;

    class C07321 implements OnGlobalLayoutListener {
        final /* synthetic */ C6398t f2390a;

        C07321(C6398t c6398t) {
            this.f2390a = c6398t;
        }

        public final void onGlobalLayout() {
            if (this.f2390a.isShowing() && !this.f2390a.f17526a.isModal()) {
                View view = this.f2390a.f17527b;
                if (view != null) {
                    if (view.isShown()) {
                        this.f2390a.f17526a.show();
                        return;
                    }
                }
                this.f2390a.dismiss();
            }
        }
    }

    class C07332 implements OnAttachStateChangeListener {
        final /* synthetic */ C6398t f2391a;

        C07332(C6398t c6398t) {
            this.f2391a = c6398t;
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            if (this.f2391a.f17540p != null) {
                if (!this.f2391a.f17540p.isAlive()) {
                    this.f2391a.f17540p = view.getViewTreeObserver();
                }
                this.f2391a.f17540p.removeGlobalOnLayoutListener(this.f2391a.f17535k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public C6398t(Context context, C4890h c4890h, View view, int i, int i2, boolean z) {
        this.f17528c = context;
        this.f17529d = c4890h;
        this.f17531g = z;
        this.f17530f = new C0721g(c4890h, LayoutInflater.from(context), this.f17531g);
        this.f17533i = i;
        this.f17534j = i2;
        Resources resources = context.getResources();
        this.f17532h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0638d.abc_config_prefDialogWidth));
        this.f17538n = view;
        this.f17526a = new MenuPopupWindow(this.f17528c, null, this.f17533i, this.f17534j);
        c4890h.m9477a((C0727o) this, context);
    }

    public final void mo2605a(int i) {
        this.f17544t = i;
    }

    public final void mo2606a(C4890h c4890h) {
    }

    public final void mo2607a(View view) {
        this.f17538n = view;
    }

    public final void mo2608a(OnDismissListener onDismissListener) {
        this.f17537m = onDismissListener;
    }

    public final void mo2609a(boolean z) {
        this.f17530f.f2385c = z;
    }

    public final void mo2611b(int i) {
        this.f17526a.setHorizontalOffset(i);
    }

    public final void mo2612b(boolean z) {
        this.f17545u = z;
    }

    public final void mo2613c(int i) {
        this.f17526a.setVerticalOffset(i);
    }

    public final void dismiss() {
        if (isShowing()) {
            this.f17526a.dismiss();
        }
    }

    public final boolean flagActionItems() {
        return false;
    }

    public final ListView getListView() {
        return this.f17526a.getListView();
    }

    public final boolean isShowing() {
        return !this.f17541q && this.f17526a.isShowing();
    }

    public final void onCloseMenu(C4890h c4890h, boolean z) {
        if (c4890h == this.f17529d) {
            dismiss();
            if (this.f17539o != null) {
                this.f17539o.onCloseMenu(c4890h, z);
            }
        }
    }

    public final void onDismiss() {
        this.f17541q = true;
        this.f17529d.close();
        if (this.f17540p != null) {
            if (!this.f17540p.isAlive()) {
                this.f17540p = this.f17527b.getViewTreeObserver();
            }
            this.f17540p.removeGlobalOnLayoutListener(this.f17535k);
            this.f17540p = null;
        }
        this.f17527b.removeOnAttachStateChangeListener(this.f17536l);
        if (this.f17537m != null) {
            this.f17537m.onDismiss();
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
    }

    public final Parcelable onSaveInstanceState() {
        return null;
    }

    public final boolean onSubMenuSelected(C6399u c6399u) {
        if (c6399u.hasVisibleItems()) {
            C0725n c0725n = new C0725n(this.f17528c, c6399u, this.f17527b, this.f17531g, this.f17533i, this.f17534j);
            c0725n.setPresenterCallback(this.f17539o);
            c0725n.setForceShowIcon(C4898m.m9522b((C4890h) c6399u));
            c0725n.setGravity(this.f17544t);
            c0725n.setOnDismissListener(this.f17537m);
            this.f17537m = null;
            this.f17529d.m9484b(false);
            if (c0725n.tryShow(this.f17526a.getHorizontalOffset(), this.f17526a.getVerticalOffset())) {
                if (this.f17539o != null) {
                    this.f17539o.onOpenSubMenu(c6399u);
                }
                return true;
            }
        }
        return false;
    }

    public final void setCallback(C0726a c0726a) {
        this.f17539o = c0726a;
    }

    public final void show() {
        boolean z = true;
        if (!isShowing()) {
            if (!this.f17541q) {
                if (this.f17538n != null) {
                    this.f17527b = this.f17538n;
                    this.f17526a.setOnDismissListener(this);
                    this.f17526a.setOnItemClickListener(this);
                    this.f17526a.setModal(true);
                    View view = this.f17527b;
                    boolean z2 = this.f17540p == null;
                    this.f17540p = view.getViewTreeObserver();
                    if (z2) {
                        this.f17540p.addOnGlobalLayoutListener(this.f17535k);
                    }
                    view.addOnAttachStateChangeListener(this.f17536l);
                    this.f17526a.setAnchorView(view);
                    this.f17526a.setDropDownGravity(this.f17544t);
                    if (!this.f17542r) {
                        this.f17543s = C4898m.m9520a(this.f17530f, null, this.f17528c, this.f17532h);
                        this.f17542r = true;
                    }
                    this.f17526a.setContentWidth(this.f17543s);
                    this.f17526a.setInputMethodMode(2);
                    this.f17526a.setEpicenterBounds(this.f13719e);
                    this.f17526a.show();
                    ViewGroup listView = this.f17526a.getListView();
                    listView.setOnKeyListener(this);
                    if (this.f17545u && this.f17529d.f13654f != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f17528c).inflate(C0641g.abc_popup_menu_header_item_layout, listView, false);
                        TextView textView = (TextView) frameLayout.findViewById(16908310);
                        if (textView != null) {
                            textView.setText(this.f17529d.f13654f);
                        }
                        frameLayout.setEnabled(false);
                        listView.addHeaderView(frameLayout, null, false);
                    }
                    this.f17526a.setAdapter(this.f17530f);
                    this.f17526a.show();
                }
            }
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public final void updateMenuView(boolean z) {
        this.f17542r = false;
        if (this.f17530f != null) {
            this.f17530f.notifyDataSetChanged();
        }
    }
}
