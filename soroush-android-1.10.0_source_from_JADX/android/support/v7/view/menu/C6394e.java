package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.C0555d;
import android.support.v4.view.C0571r;
import android.support.v7.p041a.C0645a.C0638d;
import android.support.v7.view.menu.C0727o.C0726a;
import android.support.v7.widget.MenuItemHoverListener;
import android.support.v7.widget.MenuPopupWindow;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

final class C6394e extends C4898m implements C0727o, OnKeyListener, OnDismissListener {
    private OnDismissListener f17497A;
    final Handler f17498a;
    final List<C0719a> f17499b = new ArrayList();
    View f17500c;
    boolean f17501d;
    private final Context f17502f;
    private final int f17503g;
    private final int f17504h;
    private final int f17505i;
    private final boolean f17506j;
    private final List<C4890h> f17507k = new LinkedList();
    private final OnGlobalLayoutListener f17508l = new C07161(this);
    private final OnAttachStateChangeListener f17509m = new C07172(this);
    private final MenuItemHoverListener f17510n = new C48883(this);
    private int f17511o = 0;
    private int f17512p = 0;
    private View f17513q;
    private int f17514r;
    private boolean f17515s;
    private boolean f17516t;
    private int f17517u;
    private int f17518v;
    private boolean f17519w;
    private boolean f17520x;
    private C0726a f17521y;
    private ViewTreeObserver f17522z;

    class C07161 implements OnGlobalLayoutListener {
        final /* synthetic */ C6394e f2372a;

        C07161(C6394e c6394e) {
            this.f2372a = c6394e;
        }

        public final void onGlobalLayout() {
            if (this.f2372a.isShowing() && this.f2372a.f17499b.size() > 0 && !((C0719a) this.f2372a.f17499b.get(0)).f2378a.isModal()) {
                View view = this.f2372a.f17500c;
                if (view != null) {
                    if (view.isShown()) {
                        for (C0719a c0719a : this.f2372a.f17499b) {
                            c0719a.f2378a.show();
                        }
                        return;
                    }
                }
                this.f2372a.dismiss();
            }
        }
    }

    class C07172 implements OnAttachStateChangeListener {
        final /* synthetic */ C6394e f2373a;

        C07172(C6394e c6394e) {
            this.f2373a = c6394e;
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            if (this.f2373a.f17522z != null) {
                if (!this.f2373a.f17522z.isAlive()) {
                    this.f2373a.f17522z = view.getViewTreeObserver();
                }
                this.f2373a.f17522z.removeGlobalOnLayoutListener(this.f2373a.f17508l);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    private static class C0719a {
        public final MenuPopupWindow f2378a;
        public final C4890h f2379b;
        public final int f2380c;

        public C0719a(MenuPopupWindow menuPopupWindow, C4890h c4890h, int i) {
            this.f2378a = menuPopupWindow;
            this.f2379b = c4890h;
            this.f2380c = i;
        }
    }

    class C48883 implements MenuItemHoverListener {
        final /* synthetic */ C6394e f13637a;

        C48883(C6394e c6394e) {
            this.f13637a = c6394e;
        }

        public final void onItemHoverEnter(final C4890h c4890h, final MenuItem menuItem) {
            C0719a c0719a = null;
            this.f13637a.f17498a.removeCallbacksAndMessages(null);
            int size = this.f13637a.f17499b.size();
            int i = 0;
            while (i < size) {
                if (c4890h == ((C0719a) this.f13637a.f17499b.get(i)).f2379b) {
                    break;
                }
                i++;
            }
            i = -1;
            if (i != -1) {
                i++;
                if (i < this.f13637a.f17499b.size()) {
                    c0719a = (C0719a) this.f13637a.f17499b.get(i);
                }
                this.f13637a.f17498a.postAtTime(new Runnable(this) {
                    final /* synthetic */ C48883 f2377d;

                    public final void run() {
                        if (c0719a != null) {
                            this.f2377d.f13637a.f17501d = true;
                            c0719a.f2379b.m9484b(false);
                            this.f2377d.f13637a.f17501d = false;
                        }
                        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                            c4890h.m9481a(menuItem, null, 4);
                        }
                    }
                }, c4890h, SystemClock.uptimeMillis() + 200);
            }
        }

        public final void onItemHoverExit(C4890h c4890h, MenuItem menuItem) {
            this.f13637a.f17498a.removeCallbacksAndMessages(c4890h);
        }
    }

    public C6394e(Context context, View view, int i, int i2, boolean z) {
        this.f17502f = context;
        this.f17513q = view;
        this.f17504h = i;
        this.f17505i = i2;
        this.f17506j = z;
        this.f17519w = false;
        this.f17514r = m15123b();
        Resources resources = context.getResources();
        this.f17503g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0638d.abc_config_prefDialogWidth));
        this.f17498a = new Handler();
    }

    private int m15123b() {
        return C0571r.m1369h(this.f17513q) == 1 ? 0 : 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m15125c(android.support.v7.view.menu.C4890h r18) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        r2 = r0.f17502f;
        r2 = android.view.LayoutInflater.from(r2);
        r3 = new android.support.v7.view.menu.g;
        r4 = r0.f17506j;
        r3.<init>(r1, r2, r4);
        r4 = r17.isShowing();
        r5 = 1;
        if (r4 != 0) goto L_0x001f;
    L_0x0018:
        r4 = r0.f17519w;
        if (r4 == 0) goto L_0x001f;
    L_0x001c:
        r3.f2385c = r5;
        goto L_0x002b;
    L_0x001f:
        r4 = r17.isShowing();
        if (r4 == 0) goto L_0x002b;
    L_0x0025:
        r4 = android.support.v7.view.menu.C4898m.m9522b(r18);
        r3.f2385c = r4;
    L_0x002b:
        r4 = r0.f17502f;
        r6 = r0.f17503g;
        r7 = 0;
        r4 = android.support.v7.view.menu.C4898m.m9520a(r3, r7, r4, r6);
        r6 = new android.support.v7.widget.MenuPopupWindow;
        r8 = r0.f17502f;
        r9 = r0.f17504h;
        r10 = r0.f17505i;
        r6.<init>(r8, r7, r9, r10);
        r8 = r0.f17510n;
        r6.setHoverListener(r8);
        r6.setOnItemClickListener(r0);
        r6.setOnDismissListener(r0);
        r8 = r0.f17513q;
        r6.setAnchorView(r8);
        r8 = r0.f17512p;
        r6.setDropDownGravity(r8);
        r6.setModal(r5);
        r8 = 2;
        r6.setInputMethodMode(r8);
        r6.setAdapter(r3);
        r6.setContentWidth(r4);
        r3 = r0.f17512p;
        r6.setDropDownGravity(r3);
        r3 = r0.f17499b;
        r3 = r3.size();
        r9 = 0;
        if (r3 <= 0) goto L_0x00e9;
    L_0x006f:
        r3 = r0.f17499b;
        r10 = r0.f17499b;
        r10 = r10.size();
        r10 = r10 - r5;
        r3 = r3.get(r10);
        r3 = (android.support.v7.view.menu.C6394e.C0719a) r3;
        r10 = r3.f2379b;
        r11 = r10.size();
        r12 = r9;
    L_0x0085:
        if (r12 >= r11) goto L_0x009b;
    L_0x0087:
        r13 = r10.getItem(r12);
        r14 = r13.hasSubMenu();
        if (r14 == 0) goto L_0x0098;
    L_0x0091:
        r14 = r13.getSubMenu();
        if (r1 != r14) goto L_0x0098;
    L_0x0097:
        goto L_0x009c;
    L_0x0098:
        r12 = r12 + 1;
        goto L_0x0085;
    L_0x009b:
        r13 = r7;
    L_0x009c:
        if (r13 != 0) goto L_0x00a0;
    L_0x009e:
        r5 = r7;
        goto L_0x00eb;
    L_0x00a0:
        r10 = r3.f2378a;
        r10 = r10.getListView();
        r11 = r10.getAdapter();
        r12 = r11 instanceof android.widget.HeaderViewListAdapter;
        if (r12 == 0) goto L_0x00bb;
    L_0x00ae:
        r11 = (android.widget.HeaderViewListAdapter) r11;
        r12 = r11.getHeadersCount();
        r11 = r11.getWrappedAdapter();
        r11 = (android.support.v7.view.menu.C0721g) r11;
        goto L_0x00be;
    L_0x00bb:
        r11 = (android.support.v7.view.menu.C0721g) r11;
        r12 = r9;
    L_0x00be:
        r14 = r11.getCount();
        r15 = r9;
    L_0x00c3:
        r8 = -1;
        if (r15 >= r14) goto L_0x00d1;
    L_0x00c6:
        r5 = r11.m1733a(r15);
        if (r13 != r5) goto L_0x00cd;
    L_0x00cc:
        goto L_0x00d2;
    L_0x00cd:
        r15 = r15 + 1;
        r5 = 1;
        goto L_0x00c3;
    L_0x00d1:
        r15 = r8;
    L_0x00d2:
        if (r15 != r8) goto L_0x00d5;
    L_0x00d4:
        goto L_0x009e;
    L_0x00d5:
        r15 = r15 + r12;
        r5 = r10.getFirstVisiblePosition();
        r15 = r15 - r5;
        if (r15 < 0) goto L_0x009e;
    L_0x00dd:
        r5 = r10.getChildCount();
        if (r15 < r5) goto L_0x00e4;
    L_0x00e3:
        goto L_0x009e;
    L_0x00e4:
        r5 = r10.getChildAt(r15);
        goto L_0x00eb;
    L_0x00e9:
        r3 = r7;
        r5 = r3;
    L_0x00eb:
        if (r5 == 0) goto L_0x0182;
    L_0x00ed:
        r6.setTouchModal(r9);
        r6.setEnterTransition(r7);
        r8 = r0.f17499b;
        r10 = r0.f17499b;
        r10 = r10.size();
        r11 = 1;
        r10 = r10 - r11;
        r8 = r8.get(r10);
        r8 = (android.support.v7.view.menu.C6394e.C0719a) r8;
        r8 = r8.f2378a;
        r8 = r8.getListView();
        r10 = 2;
        r11 = new int[r10];
        r8.getLocationOnScreen(r11);
        r10 = new android.graphics.Rect;
        r10.<init>();
        r12 = r0.f17500c;
        r12.getWindowVisibleDisplayFrame(r10);
        r12 = r0.f17514r;
        r13 = 1;
        if (r12 != r13) goto L_0x012d;
    L_0x011e:
        r11 = r11[r9];
        r8 = r8.getWidth();
        r11 = r11 + r8;
        r11 = r11 + r4;
        r8 = r10.right;
        if (r11 > r8) goto L_0x0133;
    L_0x012a:
        r8 = 1;
    L_0x012b:
        r10 = 1;
        goto L_0x0135;
    L_0x012d:
        r8 = r11[r9];
        r8 = r8 - r4;
        if (r8 >= 0) goto L_0x0133;
    L_0x0132:
        goto L_0x012a;
    L_0x0133:
        r8 = r9;
        goto L_0x012b;
    L_0x0135:
        if (r8 != r10) goto L_0x0139;
    L_0x0137:
        r10 = 1;
        goto L_0x013a;
    L_0x0139:
        r10 = r9;
    L_0x013a:
        r0.f17514r = r8;
        r8 = android.os.Build.VERSION.SDK_INT;
        r11 = 26;
        if (r8 < r11) goto L_0x0148;
    L_0x0142:
        r6.setAnchorView(r5);
        r8 = r9;
        r12 = r8;
        goto L_0x0160;
    L_0x0148:
        r8 = 2;
        r11 = new int[r8];
        r12 = r0.f17513q;
        r12.getLocationOnScreen(r11);
        r8 = new int[r8];
        r5.getLocationOnScreen(r8);
        r12 = r8[r9];
        r13 = r11[r9];
        r12 = r12 - r13;
        r13 = 1;
        r8 = r8[r13];
        r11 = r11[r13];
        r8 = r8 - r11;
    L_0x0160:
        r11 = r0.f17512p;
        r13 = 5;
        r11 = r11 & r13;
        if (r11 != r13) goto L_0x0170;
    L_0x0166:
        if (r10 == 0) goto L_0x016a;
    L_0x0168:
        r12 = r12 + r4;
        goto L_0x0177;
    L_0x016a:
        r4 = r5.getWidth();
    L_0x016e:
        r12 = r12 - r4;
        goto L_0x0177;
    L_0x0170:
        if (r10 == 0) goto L_0x016e;
    L_0x0172:
        r4 = r5.getWidth();
        goto L_0x0168;
    L_0x0177:
        r6.setHorizontalOffset(r12);
        r4 = 1;
        r6.setOverlapAnchor(r4);
        r6.setVerticalOffset(r8);
        goto L_0x0199;
    L_0x0182:
        r4 = r0.f17515s;
        if (r4 == 0) goto L_0x018b;
    L_0x0186:
        r4 = r0.f17517u;
        r6.setHorizontalOffset(r4);
    L_0x018b:
        r4 = r0.f17516t;
        if (r4 == 0) goto L_0x0194;
    L_0x018f:
        r4 = r0.f17518v;
        r6.setVerticalOffset(r4);
    L_0x0194:
        r4 = r0.f13719e;
        r6.setEpicenterBounds(r4);
    L_0x0199:
        r4 = new android.support.v7.view.menu.e$a;
        r5 = r0.f17514r;
        r4.<init>(r6, r1, r5);
        r5 = r0.f17499b;
        r5.add(r4);
        r6.show();
        r4 = r6.getListView();
        r4.setOnKeyListener(r0);
        if (r3 != 0) goto L_0x01d8;
    L_0x01b1:
        r3 = r0.f17520x;
        if (r3 == 0) goto L_0x01d8;
    L_0x01b5:
        r3 = r1.f13654f;
        if (r3 == 0) goto L_0x01d8;
    L_0x01b9:
        r3 = android.support.v7.p041a.C0645a.C0641g.abc_popup_menu_header_item_layout;
        r2 = r2.inflate(r3, r4, r9);
        r2 = (android.widget.FrameLayout) r2;
        r3 = 16908310; // 0x1020016 float:2.387729E-38 double:8.353815E-317;
        r3 = r2.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r2.setEnabled(r9);
        r1 = r1.f13654f;
        r3.setText(r1);
        r4.addHeaderView(r2, r7, r9);
        r6.show();
    L_0x01d8:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.e.c(android.support.v7.view.menu.h):void");
    }

    public final void mo2605a(int i) {
        if (this.f17511o != i) {
            this.f17511o = i;
            this.f17512p = C0555d.m1224a(i, C0571r.m1369h(this.f17513q));
        }
    }

    public final void mo2606a(C4890h c4890h) {
        c4890h.m9477a((C0727o) this, this.f17502f);
        if (isShowing()) {
            m15125c(c4890h);
        } else {
            this.f17507k.add(c4890h);
        }
    }

    public final void mo2607a(View view) {
        if (this.f17513q != view) {
            this.f17513q = view;
            this.f17512p = C0555d.m1224a(this.f17511o, C0571r.m1369h(this.f17513q));
        }
    }

    public final void mo2608a(OnDismissListener onDismissListener) {
        this.f17497A = onDismissListener;
    }

    public final void mo2609a(boolean z) {
        this.f17519w = z;
    }

    protected final boolean mo2610a() {
        return false;
    }

    public final void mo2611b(int i) {
        this.f17515s = true;
        this.f17517u = i;
    }

    public final void mo2612b(boolean z) {
        this.f17520x = z;
    }

    public final void mo2613c(int i) {
        this.f17516t = true;
        this.f17518v = i;
    }

    public final void dismiss() {
        int size = this.f17499b.size();
        if (size > 0) {
            C0719a[] c0719aArr = (C0719a[]) this.f17499b.toArray(new C0719a[size]);
            for (size--; size >= 0; size--) {
                C0719a c0719a = c0719aArr[size];
                if (c0719a.f2378a.isShowing()) {
                    c0719a.f2378a.dismiss();
                }
            }
        }
    }

    public final boolean flagActionItems() {
        return false;
    }

    public final ListView getListView() {
        return this.f17499b.isEmpty() ? null : ((C0719a) this.f17499b.get(this.f17499b.size() - 1)).f2378a.getListView();
    }

    public final boolean isShowing() {
        return this.f17499b.size() > 0 && ((C0719a) this.f17499b.get(0)).f2378a.isShowing();
    }

    public final void onCloseMenu(C4890h c4890h, boolean z) {
        int size = this.f17499b.size();
        int i = 0;
        while (i < size) {
            if (c4890h == ((C0719a) this.f17499b.get(i)).f2379b) {
                break;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            size = i + 1;
            if (size < this.f17499b.size()) {
                ((C0719a) this.f17499b.get(size)).f2379b.m9484b(false);
            }
            C0719a c0719a = (C0719a) this.f17499b.remove(i);
            c0719a.f2379b.m9483b((C0727o) this);
            if (this.f17501d) {
                c0719a.f2378a.setExitTransition(null);
                c0719a.f2378a.setAnimationStyle(0);
            }
            c0719a.f2378a.dismiss();
            size = this.f17499b.size();
            this.f17514r = size > 0 ? ((C0719a) this.f17499b.get(size - 1)).f2380c : m15123b();
            if (size == 0) {
                dismiss();
                if (this.f17521y != null) {
                    this.f17521y.onCloseMenu(c4890h, true);
                }
                if (this.f17522z != null) {
                    if (this.f17522z.isAlive()) {
                        this.f17522z.removeGlobalOnLayoutListener(this.f17508l);
                    }
                    this.f17522z = null;
                }
                this.f17500c.removeOnAttachStateChangeListener(this.f17509m);
                this.f17497A.onDismiss();
                return;
            }
            if (z) {
                ((C0719a) this.f17499b.get(0)).f2379b.m9484b(false);
            }
        }
    }

    public final void onDismiss() {
        C0719a c0719a;
        int size = this.f17499b.size();
        for (int i = 0; i < size; i++) {
            c0719a = (C0719a) this.f17499b.get(i);
            if (!c0719a.f2378a.isShowing()) {
                break;
            }
        }
        c0719a = null;
        if (c0719a != null) {
            c0719a.f2379b.m9484b(false);
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
        for (C0719a c0719a : this.f17499b) {
            if (c6399u == c0719a.f2379b) {
                c0719a.f2378a.getListView().requestFocus();
                return true;
            }
        }
        if (!c6399u.hasVisibleItems()) {
            return false;
        }
        mo2606a((C4890h) c6399u);
        if (this.f17521y != null) {
            this.f17521y.onOpenSubMenu(c6399u);
        }
        return true;
    }

    public final void setCallback(C0726a c0726a) {
        this.f17521y = c0726a;
    }

    public final void show() {
        if (!isShowing()) {
            for (C4890h c : this.f17507k) {
                m15125c(c);
            }
            this.f17507k.clear();
            this.f17500c = this.f17513q;
            if (this.f17500c != null) {
                Object obj = this.f17522z == null ? 1 : null;
                this.f17522z = this.f17500c.getViewTreeObserver();
                if (obj != null) {
                    this.f17522z.addOnGlobalLayoutListener(this.f17508l);
                }
                this.f17500c.addOnAttachStateChangeListener(this.f17509m);
            }
        }
    }

    public final void updateMenuView(boolean z) {
        for (C0719a c0719a : this.f17499b) {
            C4898m.m9521a(c0719a.f2378a.getListView().getAdapter()).notifyDataSetChanged();
        }
    }
}
