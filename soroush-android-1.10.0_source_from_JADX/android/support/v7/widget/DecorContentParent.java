package android.support.v7.widget;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.view.menu.C0727o.C0726a;
import android.util.SparseArray;
import android.view.Menu;
import android.view.Window.Callback;

public interface DecorContentParent {
    boolean canShowOverflowMenu();

    void dismissPopups();

    CharSequence getTitle();

    boolean hasIcon();

    boolean hasLogo();

    boolean hideOverflowMenu();

    void initFeature(int i);

    boolean isOverflowMenuShowPending();

    boolean isOverflowMenuShowing();

    void restoreToolbarHierarchyState(SparseArray<Parcelable> sparseArray);

    void saveToolbarHierarchyState(SparseArray<Parcelable> sparseArray);

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setLogo(int i);

    void setMenu(Menu menu, C0726a c0726a);

    void setMenuPrepared();

    void setUiOptions(int i);

    void setWindowCallback(Callback callback);

    void setWindowTitle(CharSequence charSequence);

    boolean showOverflowMenu();
}
