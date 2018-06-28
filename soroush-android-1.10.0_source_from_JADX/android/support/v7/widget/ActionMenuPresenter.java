package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.p031b.p032a.C0429a;
import android.support.v4.view.C0551b;
import android.support.v4.view.C0551b.C4834a;
import android.support.v7.p041a.C0645a.C0635a;
import android.support.v7.p041a.C0645a.C0641g;
import android.support.v7.view.C0703a;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.ActionMenuItemView.C0714b;
import android.support.v7.view.menu.C0725n;
import android.support.v7.view.menu.C0727o.C0726a;
import android.support.v7.view.menu.C0729p;
import android.support.v7.view.menu.C0729p.C0728a;
import android.support.v7.view.menu.C0731s;
import android.support.v7.view.menu.C4886b;
import android.support.v7.view.menu.C4890h;
import android.support.v7.view.menu.C4893j;
import android.support.v7.view.menu.C6399u;
import android.support.v7.widget.ActionMenuView.ActionMenuChildView;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

class ActionMenuPresenter extends C4886b implements C4834a {
    private static final String TAG = "ActionMenuPresenter";
    private final SparseBooleanArray mActionButtonGroups = new SparseBooleanArray();
    ActionButtonSubmenu mActionButtonPopup;
    private int mActionItemWidthLimit;
    private boolean mExpandedActionViewsExclusive;
    private int mMaxItems;
    private boolean mMaxItemsSet;
    private int mMinCellSize;
    int mOpenSubMenuId;
    OverflowMenuButton mOverflowButton;
    OverflowPopup mOverflowPopup;
    private Drawable mPendingOverflowIcon;
    private boolean mPendingOverflowIconSet;
    private ActionMenuPopupCallback mPopupCallback;
    final PopupPresenterCallback mPopupPresenterCallback = new PopupPresenterCallback();
    OpenOverflowRunnable mPostedOpenRunnable;
    private boolean mReserveOverflow;
    private boolean mReserveOverflowSet;
    private View mScrapActionButtonView;
    private boolean mStrictWidthLimit;
    private int mWidthLimit;
    private boolean mWidthLimitSet;

    private class OpenOverflowRunnable implements Runnable {
        private OverflowPopup mPopup;

        public OpenOverflowRunnable(OverflowPopup overflowPopup) {
            this.mPopup = overflowPopup;
        }

        public void run() {
            if (ActionMenuPresenter.this.mMenu != null) {
                C4890h access$400 = ActionMenuPresenter.this.mMenu;
                if (access$400.f13650b != null) {
                    access$400.f13650b.onMenuModeChange(access$400);
                }
            }
            View view = (View) ActionMenuPresenter.this.mMenuView;
            if (!(view == null || view.getWindowToken() == null || !this.mPopup.tryShow())) {
                ActionMenuPresenter.this.mOverflowPopup = this.mPopup;
            }
            ActionMenuPresenter.this.mPostedOpenRunnable = null;
        }
    }

    private static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new C07391();
        public int openSubMenuId;

        static class C07391 implements Creator<SavedState> {
            C07391() {
            }

            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.openSubMenuId = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.openSubMenuId);
        }
    }

    private class ActionButtonSubmenu extends C0725n {
        public ActionButtonSubmenu(Context context, C6399u c6399u, View view) {
            super(context, c6399u, view, false, C0635a.actionOverflowMenuStyle);
            if (!((C4893j) c6399u.getItem()).m9516f()) {
                setAnchorView(ActionMenuPresenter.this.mOverflowButton == null ? (View) ActionMenuPresenter.this.mMenuView : ActionMenuPresenter.this.mOverflowButton);
            }
            setPresenterCallback(ActionMenuPresenter.this.mPopupPresenterCallback);
        }

        protected void onDismiss() {
            ActionMenuPresenter.this.mActionButtonPopup = null;
            ActionMenuPresenter.this.mOpenSubMenuId = 0;
            super.onDismiss();
        }
    }

    private class ActionMenuPopupCallback extends C0714b {
        ActionMenuPopupCallback() {
        }

        public C0731s getPopup() {
            return ActionMenuPresenter.this.mActionButtonPopup != null ? ActionMenuPresenter.this.mActionButtonPopup.getPopup() : null;
        }
    }

    private class OverflowPopup extends C0725n {
        public OverflowPopup(Context context, C4890h c4890h, View view, boolean z) {
            super(context, c4890h, view, z, C0635a.actionOverflowMenuStyle);
            setGravity(8388613);
            setPresenterCallback(ActionMenuPresenter.this.mPopupPresenterCallback);
        }

        protected void onDismiss() {
            if (ActionMenuPresenter.this.mMenu != null) {
                ActionMenuPresenter.this.mMenu.close();
            }
            ActionMenuPresenter.this.mOverflowPopup = null;
            super.onDismiss();
        }
    }

    private class PopupPresenterCallback implements C0726a {
        PopupPresenterCallback() {
        }

        public void onCloseMenu(C4890h c4890h, boolean z) {
            if (c4890h instanceof C6399u) {
                c4890h.mo2626k().m9484b(false);
            }
            C0726a callback = ActionMenuPresenter.this.getCallback();
            if (callback != null) {
                callback.onCloseMenu(c4890h, z);
            }
        }

        public boolean onOpenSubMenu(C4890h c4890h) {
            if (c4890h == null) {
                return false;
            }
            ActionMenuPresenter.this.mOpenSubMenuId = ((C6399u) c4890h).getItem().getItemId();
            C0726a callback = ActionMenuPresenter.this.getCallback();
            return callback != null ? callback.onOpenSubMenu(c4890h) : false;
        }
    }

    private class OverflowMenuButton extends AppCompatImageView implements ActionMenuChildView {
        private final float[] mTempPts = new float[2];

        public OverflowMenuButton(Context context) {
            super(context, null, C0635a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            TooltipCompat.setTooltipText(this, getContentDescription());
            setOnTouchListener(new ForwardingListener(this, ActionMenuPresenter.this) {
                public C0731s getPopup() {
                    return ActionMenuPresenter.this.mOverflowPopup == null ? null : ActionMenuPresenter.this.mOverflowPopup.getPopup();
                }

                public boolean onForwardingStarted() {
                    ActionMenuPresenter.this.showOverflowMenu();
                    return true;
                }

                public boolean onForwardingStopped() {
                    if (ActionMenuPresenter.this.mPostedOpenRunnable != null) {
                        return false;
                    }
                    ActionMenuPresenter.this.hideOverflowMenu();
                    return true;
                }
            });
        }

        public boolean needsDividerAfter() {
            return false;
        }

        public boolean needsDividerBefore() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.showOverflowMenu();
            return true;
        }

        protected boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                i2 = getWidth();
                i4 = getHeight();
                int max = Math.max(i2, i4) / 2;
                i2 = (i2 + (getPaddingLeft() - getPaddingRight())) / 2;
                i4 = (i4 + (getPaddingTop() - getPaddingBottom())) / 2;
                C0429a.m884a(background, i2 - max, i4 - max, i2 + max, i4 + max);
            }
            return frame;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, C0641g.abc_action_menu_layout, C0641g.abc_action_menu_item_layout);
    }

    private View findViewForItem(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.mMenuView;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0728a) && ((C0728a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public void bindItemView(C4893j c4893j, C0728a c0728a) {
        c0728a.mo128a(c4893j);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) c0728a;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.mMenuView);
        if (this.mPopupCallback == null) {
            this.mPopupCallback = new ActionMenuPopupCallback();
        }
        actionMenuItemView.setPopupCallback(this.mPopupCallback);
    }

    public boolean dismissPopupMenus() {
        return hideOverflowMenu() | hideSubMenus();
    }

    public boolean filterLeftoverView(ViewGroup viewGroup, int i) {
        return viewGroup.getChildAt(i) == this.mOverflowButton ? false : super.filterLeftoverView(viewGroup, i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean flagActionItems() {
        /*
        r20 = this;
        r0 = r20;
        r1 = r0.mMenu;
        r2 = 0;
        if (r1 == 0) goto L_0x0012;
    L_0x0007:
        r1 = r0.mMenu;
        r1 = r1.m9494h();
        r3 = r1.size();
        goto L_0x0014;
    L_0x0012:
        r1 = 0;
        r3 = r2;
    L_0x0014:
        r4 = r0.mMaxItems;
        r5 = r0.mActionItemWidthLimit;
        r6 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2);
        r7 = r0.mMenuView;
        r7 = (android.view.ViewGroup) r7;
        r8 = r2;
        r9 = r8;
        r10 = r9;
        r11 = r4;
        r4 = r10;
    L_0x0025:
        if (r4 >= r3) goto L_0x004e;
    L_0x0027:
        r13 = r1.get(r4);
        r13 = (android.support.v7.view.menu.C4893j) r13;
        r14 = r13.m9518h();
        if (r14 == 0) goto L_0x0036;
    L_0x0033:
        r8 = r8 + 1;
        goto L_0x0040;
    L_0x0036:
        r14 = r13.m9517g();
        if (r14 == 0) goto L_0x003f;
    L_0x003c:
        r10 = r10 + 1;
        goto L_0x0040;
    L_0x003f:
        r9 = 1;
    L_0x0040:
        r12 = r0.mExpandedActionViewsExclusive;
        if (r12 == 0) goto L_0x004b;
    L_0x0044:
        r12 = r13.isActionViewExpanded();
        if (r12 == 0) goto L_0x004b;
    L_0x004a:
        r11 = r2;
    L_0x004b:
        r4 = r4 + 1;
        goto L_0x0025;
    L_0x004e:
        r4 = r0.mReserveOverflow;
        if (r4 == 0) goto L_0x0059;
    L_0x0052:
        if (r9 != 0) goto L_0x0057;
    L_0x0054:
        r10 = r10 + r8;
        if (r10 <= r11) goto L_0x0059;
    L_0x0057:
        r11 = r11 + -1;
    L_0x0059:
        r11 = r11 - r8;
        r4 = r0.mActionButtonGroups;
        r4.clear();
        r8 = r0.mStrictWidthLimit;
        if (r8 == 0) goto L_0x0070;
    L_0x0063:
        r8 = r0.mMinCellSize;
        r8 = r5 / r8;
        r9 = r0.mMinCellSize;
        r9 = r5 % r9;
        r10 = r0.mMinCellSize;
        r9 = r9 / r8;
        r9 = r9 + r10;
        goto L_0x0072;
    L_0x0070:
        r8 = r2;
        r9 = r8;
    L_0x0072:
        r13 = r2;
        r10 = r5;
        r5 = r13;
    L_0x0075:
        if (r5 >= r3) goto L_0x015e;
    L_0x0077:
        r14 = r1.get(r5);
        r14 = (android.support.v7.view.menu.C4893j) r14;
        r15 = r14.m9518h();
        if (r15 == 0) goto L_0x00b8;
    L_0x0083:
        r15 = r0.mScrapActionButtonView;
        r15 = r0.getItemView(r14, r15, r7);
        r12 = r0.mScrapActionButtonView;
        if (r12 != 0) goto L_0x008f;
    L_0x008d:
        r0.mScrapActionButtonView = r15;
    L_0x008f:
        r12 = r0.mStrictWidthLimit;
        if (r12 == 0) goto L_0x0099;
    L_0x0093:
        r12 = android.support.v7.widget.ActionMenuView.measureChildForCells(r15, r9, r8, r6, r2);
        r8 = r8 - r12;
        goto L_0x009c;
    L_0x0099:
        r15.measure(r6, r6);
    L_0x009c:
        r12 = r15.getMeasuredWidth();
        r10 = r10 - r12;
        if (r13 != 0) goto L_0x00a4;
    L_0x00a3:
        r13 = r12;
    L_0x00a4:
        r12 = r14.getGroupId();
        if (r12 == 0) goto L_0x00af;
    L_0x00aa:
        r15 = 1;
        r4.put(r12, r15);
        goto L_0x00b0;
    L_0x00af:
        r15 = 1;
    L_0x00b0:
        r14.m9512c(r15);
        r0 = r2;
        r17 = r3;
        goto L_0x0155;
    L_0x00b8:
        r12 = r14.m9517g();
        if (r12 == 0) goto L_0x014f;
    L_0x00be:
        r12 = r14.getGroupId();
        r15 = r4.get(r12);
        if (r11 > 0) goto L_0x00ca;
    L_0x00c8:
        if (r15 == 0) goto L_0x00d4;
    L_0x00ca:
        if (r10 <= 0) goto L_0x00d4;
    L_0x00cc:
        r2 = r0.mStrictWidthLimit;
        if (r2 == 0) goto L_0x00d2;
    L_0x00d0:
        if (r8 <= 0) goto L_0x00d4;
    L_0x00d2:
        r2 = 1;
        goto L_0x00d5;
    L_0x00d4:
        r2 = 0;
    L_0x00d5:
        if (r2 == 0) goto L_0x0113;
    L_0x00d7:
        r16 = r2;
        r2 = r0.mScrapActionButtonView;
        r2 = r0.getItemView(r14, r2, r7);
        r17 = r3;
        r3 = r0.mScrapActionButtonView;
        if (r3 != 0) goto L_0x00e7;
    L_0x00e5:
        r0.mScrapActionButtonView = r2;
    L_0x00e7:
        r3 = r0.mStrictWidthLimit;
        if (r3 == 0) goto L_0x00f7;
    L_0x00eb:
        r3 = 0;
        r18 = android.support.v7.widget.ActionMenuView.measureChildForCells(r2, r9, r8, r6, r3);
        r8 = r8 - r18;
        if (r18 != 0) goto L_0x00fa;
    L_0x00f4:
        r16 = 0;
        goto L_0x00fa;
    L_0x00f7:
        r2.measure(r6, r6);
    L_0x00fa:
        r2 = r2.getMeasuredWidth();
        r10 = r10 - r2;
        if (r13 != 0) goto L_0x0102;
    L_0x0101:
        r13 = r2;
    L_0x0102:
        r2 = r0.mStrictWidthLimit;
        if (r2 == 0) goto L_0x010e;
    L_0x0106:
        if (r10 < 0) goto L_0x010a;
    L_0x0108:
        r2 = 1;
        goto L_0x010b;
    L_0x010a:
        r2 = 0;
    L_0x010b:
        r2 = r16 & r2;
        goto L_0x0117;
    L_0x010e:
        r2 = r10 + r13;
        if (r2 <= 0) goto L_0x010a;
    L_0x0112:
        goto L_0x0108;
    L_0x0113:
        r16 = r2;
        r17 = r3;
    L_0x0117:
        if (r2 == 0) goto L_0x0120;
    L_0x0119:
        if (r12 == 0) goto L_0x0120;
    L_0x011b:
        r3 = 1;
        r4.put(r12, r3);
        goto L_0x0146;
    L_0x0120:
        if (r15 == 0) goto L_0x0146;
    L_0x0122:
        r3 = 0;
        r4.put(r12, r3);
        r3 = 0;
    L_0x0127:
        if (r3 >= r5) goto L_0x0146;
    L_0x0129:
        r15 = r1.get(r3);
        r15 = (android.support.v7.view.menu.C4893j) r15;
        r0 = r15.getGroupId();
        if (r0 != r12) goto L_0x0141;
    L_0x0135:
        r0 = r15.m9516f();
        if (r0 == 0) goto L_0x013d;
    L_0x013b:
        r11 = r11 + 1;
    L_0x013d:
        r0 = 0;
        r15.m9512c(r0);
    L_0x0141:
        r3 = r3 + 1;
        r0 = r20;
        goto L_0x0127;
    L_0x0146:
        if (r2 == 0) goto L_0x014a;
    L_0x0148:
        r11 = r11 + -1;
    L_0x014a:
        r14.m9512c(r2);
        r0 = 0;
        goto L_0x0155;
    L_0x014f:
        r0 = r2;
        r17 = r3;
        r14.m9512c(r0);
    L_0x0155:
        r5 = r5 + 1;
        r2 = r0;
        r3 = r17;
        r0 = r20;
        goto L_0x0075;
    L_0x015e:
        r2 = 1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionMenuPresenter.flagActionItems():boolean");
    }

    public View getItemView(C4893j c4893j, View view, ViewGroup viewGroup) {
        View actionView = c4893j.getActionView();
        if (actionView == null || c4893j.m9519i()) {
            actionView = super.getItemView(c4893j, view, viewGroup);
        }
        actionView.setVisibility(c4893j.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    public C0729p getMenuView(ViewGroup viewGroup) {
        C0729p c0729p = this.mMenuView;
        C0729p menuView = super.getMenuView(viewGroup);
        if (c0729p != menuView) {
            ((ActionMenuView) menuView).setPresenter(this);
        }
        return menuView;
    }

    public Drawable getOverflowIcon() {
        return this.mOverflowButton != null ? this.mOverflowButton.getDrawable() : this.mPendingOverflowIconSet ? this.mPendingOverflowIcon : null;
    }

    public boolean hideOverflowMenu() {
        if (this.mPostedOpenRunnable == null || this.mMenuView == null) {
            C0725n c0725n = this.mOverflowPopup;
            if (c0725n == null) {
                return false;
            }
            c0725n.dismiss();
            return true;
        }
        ((View) this.mMenuView).removeCallbacks(this.mPostedOpenRunnable);
        this.mPostedOpenRunnable = null;
        return true;
    }

    public boolean hideSubMenus() {
        if (this.mActionButtonPopup == null) {
            return false;
        }
        this.mActionButtonPopup.dismiss();
        return true;
    }

    public void initForMenu(Context context, C4890h c4890h) {
        super.initForMenu(context, c4890h);
        Resources resources = context.getResources();
        C0703a a = C0703a.m1693a(context);
        if (!this.mReserveOverflowSet) {
            boolean z = true;
            if (VERSION.SDK_INT < 19) {
                if (ViewConfiguration.get(a.f2313a).hasPermanentMenuKey()) {
                    z = false;
                }
            }
            this.mReserveOverflow = z;
        }
        if (!this.mWidthLimitSet) {
            this.mWidthLimit = a.f2313a.getResources().getDisplayMetrics().widthPixels / 2;
        }
        if (!this.mMaxItemsSet) {
            this.mMaxItems = a.m1694a();
        }
        int i = this.mWidthLimit;
        if (this.mReserveOverflow) {
            if (this.mOverflowButton == null) {
                this.mOverflowButton = new OverflowMenuButton(this.mSystemContext);
                if (this.mPendingOverflowIconSet) {
                    this.mOverflowButton.setImageDrawable(this.mPendingOverflowIcon);
                    this.mPendingOverflowIcon = null;
                    this.mPendingOverflowIconSet = false;
                }
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                this.mOverflowButton.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.mOverflowButton.getMeasuredWidth();
        } else {
            this.mOverflowButton = null;
        }
        this.mActionItemWidthLimit = i;
        this.mMinCellSize = (int) (56.0f * resources.getDisplayMetrics().density);
        this.mScrapActionButtonView = null;
    }

    public boolean isOverflowMenuShowPending() {
        if (this.mPostedOpenRunnable == null) {
            if (!isOverflowMenuShowing()) {
                return false;
            }
        }
        return true;
    }

    public boolean isOverflowMenuShowing() {
        return this.mOverflowPopup != null && this.mOverflowPopup.isShowing();
    }

    public boolean isOverflowReserved() {
        return this.mReserveOverflow;
    }

    public void onCloseMenu(C4890h c4890h, boolean z) {
        dismissPopupMenus();
        super.onCloseMenu(c4890h, z);
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (!this.mMaxItemsSet) {
            this.mMaxItems = C0703a.m1693a(this.mContext).m1694a();
        }
        if (this.mMenu != null) {
            this.mMenu.mo3264a(true);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            if (savedState.openSubMenuId > 0) {
                MenuItem findItem = this.mMenu.findItem(savedState.openSubMenuId);
                if (findItem != null) {
                    onSubMenuSelected((C6399u) findItem.getSubMenu());
                }
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState();
        savedState.openSubMenuId = this.mOpenSubMenuId;
        return savedState;
    }

    public boolean onSubMenuSelected(C6399u c6399u) {
        boolean z = false;
        if (!c6399u.hasVisibleItems()) {
            return false;
        }
        C6399u c6399u2 = c6399u;
        while (c6399u2.f17546l != this.mMenu) {
            c6399u2 = (C6399u) c6399u2.f17546l;
        }
        View findViewForItem = findViewForItem(c6399u2.getItem());
        if (findViewForItem == null) {
            return false;
        }
        this.mOpenSubMenuId = c6399u.getItem().getItemId();
        int size = c6399u.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c6399u.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
        }
        this.mActionButtonPopup = new ActionButtonSubmenu(this.mContext, c6399u, findViewForItem);
        this.mActionButtonPopup.setForceShowIcon(z);
        this.mActionButtonPopup.show();
        super.onSubMenuSelected(c6399u);
        return true;
    }

    public void onSubUiVisibilityChanged(boolean z) {
        if (z) {
            super.onSubMenuSelected(null);
            return;
        }
        if (this.mMenu != null) {
            this.mMenu.m9484b(false);
        }
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.mExpandedActionViewsExclusive = z;
    }

    public void setItemLimit(int i) {
        this.mMaxItems = i;
        this.mMaxItemsSet = true;
    }

    public void setMenuView(ActionMenuView actionMenuView) {
        this.mMenuView = actionMenuView;
        actionMenuView.initialize(this.mMenu);
    }

    public void setOverflowIcon(Drawable drawable) {
        if (this.mOverflowButton != null) {
            this.mOverflowButton.setImageDrawable(drawable);
            return;
        }
        this.mPendingOverflowIconSet = true;
        this.mPendingOverflowIcon = drawable;
    }

    public void setReserveOverflow(boolean z) {
        this.mReserveOverflow = z;
        this.mReserveOverflowSet = true;
    }

    public void setWidthLimit(int i, boolean z) {
        this.mWidthLimit = i;
        this.mStrictWidthLimit = z;
        this.mWidthLimitSet = true;
    }

    public boolean shouldIncludeItem(int i, C4893j c4893j) {
        return c4893j.m9516f();
    }

    public boolean showOverflowMenu() {
        if (!this.mReserveOverflow || isOverflowMenuShowing() || this.mMenu == null || this.mMenuView == null || this.mPostedOpenRunnable != null || this.mMenu.m9496j().isEmpty()) {
            return false;
        }
        this.mPostedOpenRunnable = new OpenOverflowRunnable(new OverflowPopup(this.mContext, this.mMenu, this.mOverflowButton, true));
        ((View) this.mMenuView).post(this.mPostedOpenRunnable);
        super.onSubMenuSelected(null);
        return true;
    }

    public void updateMenuView(boolean z) {
        ArrayList arrayList;
        int size;
        super.updateMenuView(z);
        ((View) this.mMenuView).requestLayout();
        int i = 0;
        if (this.mMenu != null) {
            C4890h c4890h = this.mMenu;
            c4890h.m9495i();
            arrayList = c4890h.f13652d;
            size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0551b c0551b = ((C4893j) arrayList.get(i2)).f13695d;
                if (c0551b != null) {
                    c0551b.setSubUiVisibilityListener(this);
                }
            }
        }
        arrayList = this.mMenu != null ? this.mMenu.m9496j() : null;
        if (this.mReserveOverflow && arrayList != null) {
            size = arrayList.size();
            if (size == 1) {
                i = ((C4893j) arrayList.get(0)).isActionViewExpanded() ^ 1;
            } else if (size > 0) {
                i = 1;
            }
        }
        if (i != 0) {
            if (this.mOverflowButton == null) {
                this.mOverflowButton = new OverflowMenuButton(this.mSystemContext);
            }
            ViewGroup viewGroup = (ViewGroup) this.mOverflowButton.getParent();
            if (viewGroup != this.mMenuView) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.mOverflowButton);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.mMenuView;
                actionMenuView.addView(this.mOverflowButton, actionMenuView.generateOverflowButtonLayoutParams());
            }
        } else if (this.mOverflowButton != null && this.mOverflowButton.getParent() == this.mMenuView) {
            ((ViewGroup) this.mMenuView).removeView(this.mOverflowButton);
        }
        ((ActionMenuView) this.mMenuView).setOverflowReserved(this.mReserveOverflow);
    }
}
