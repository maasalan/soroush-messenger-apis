package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.view.menu.C0727o.C0726a;
import android.support.v7.view.menu.C0729p.C0728a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class C4886b implements C0727o {
    private C0726a mCallback;
    protected Context mContext;
    private int mId;
    protected LayoutInflater mInflater;
    private int mItemLayoutRes;
    protected C4890h mMenu;
    private int mMenuLayoutRes;
    protected C0729p mMenuView;
    protected Context mSystemContext;
    protected LayoutInflater mSystemInflater;

    public C4886b(Context context, int i, int i2) {
        this.mSystemContext = context;
        this.mSystemInflater = LayoutInflater.from(context);
        this.mMenuLayoutRes = i;
        this.mItemLayoutRes = i2;
    }

    protected void addItemView(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.mMenuView).addView(view, i);
    }

    public abstract void bindItemView(C4893j c4893j, C0728a c0728a);

    public boolean collapseItemActionView(C4890h c4890h, C4893j c4893j) {
        return false;
    }

    public C0728a createItemView(ViewGroup viewGroup) {
        return (C0728a) this.mSystemInflater.inflate(this.mItemLayoutRes, viewGroup, false);
    }

    public boolean expandItemActionView(C4890h c4890h, C4893j c4893j) {
        return false;
    }

    public boolean filterLeftoverView(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public boolean flagActionItems() {
        return false;
    }

    public C0726a getCallback() {
        return this.mCallback;
    }

    public int getId() {
        return this.mId;
    }

    public View getItemView(C4893j c4893j, View view, ViewGroup viewGroup) {
        C0728a createItemView = view instanceof C0728a ? (C0728a) view : createItemView(viewGroup);
        bindItemView(c4893j, createItemView);
        return (View) createItemView;
    }

    public C0729p getMenuView(ViewGroup viewGroup) {
        if (this.mMenuView == null) {
            this.mMenuView = (C0729p) this.mSystemInflater.inflate(this.mMenuLayoutRes, viewGroup, false);
            this.mMenuView.initialize(this.mMenu);
            updateMenuView(true);
        }
        return this.mMenuView;
    }

    public void initForMenu(Context context, C4890h c4890h) {
        this.mContext = context;
        this.mInflater = LayoutInflater.from(this.mContext);
        this.mMenu = c4890h;
    }

    public void onCloseMenu(C4890h c4890h, boolean z) {
        if (this.mCallback != null) {
            this.mCallback.onCloseMenu(c4890h, z);
        }
    }

    public boolean onSubMenuSelected(C6399u c6399u) {
        return this.mCallback != null ? this.mCallback.onOpenSubMenu(c6399u) : false;
    }

    public void setCallback(C0726a c0726a) {
        this.mCallback = c0726a;
    }

    public void setId(int i) {
        this.mId = i;
    }

    public boolean shouldIncludeItem(int i, C4893j c4893j) {
        return true;
    }

    public void updateMenuView(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.mMenuView;
        if (viewGroup != null) {
            int i = 0;
            if (this.mMenu != null) {
                this.mMenu.m9495i();
                ArrayList h = this.mMenu.m9494h();
                int size = h.size();
                int i2 = 0;
                int i3 = i2;
                while (i2 < size) {
                    C4893j c4893j = (C4893j) h.get(i2);
                    if (shouldIncludeItem(i3, c4893j)) {
                        View childAt = viewGroup.getChildAt(i3);
                        C4893j itemData = childAt instanceof C0728a ? ((C0728a) childAt).getItemData() : null;
                        View itemView = getItemView(c4893j, childAt, viewGroup);
                        if (c4893j != itemData) {
                            itemView.setPressed(false);
                            itemView.jumpDrawablesToCurrentState();
                        }
                        if (itemView != childAt) {
                            addItemView(itemView, i3);
                        }
                        i3++;
                    }
                    i2++;
                }
                i = i3;
            }
            while (i < viewGroup.getChildCount()) {
                if (!filterLeftoverView(viewGroup, i)) {
                    i++;
                }
            }
        }
    }
}
