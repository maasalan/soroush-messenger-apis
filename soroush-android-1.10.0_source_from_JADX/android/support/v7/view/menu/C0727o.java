package android.support.v7.view.menu;

import android.content.Context;
import android.os.Parcelable;

public interface C0727o {

    public interface C0726a {
        void onCloseMenu(C4890h c4890h, boolean z);

        boolean onOpenSubMenu(C4890h c4890h);
    }

    boolean collapseItemActionView(C4890h c4890h, C4893j c4893j);

    boolean expandItemActionView(C4890h c4890h, C4893j c4893j);

    boolean flagActionItems();

    int getId();

    void initForMenu(Context context, C4890h c4890h);

    void onCloseMenu(C4890h c4890h, boolean z);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(C6399u c6399u);

    void setCallback(C0726a c0726a);

    void updateMenuView(boolean z);
}
