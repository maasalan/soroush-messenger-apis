package android.support.v7.widget;

import android.content.Context;
import android.support.v7.p041a.C0645a.C0635a;
import android.support.v7.view.C0711g;
import android.support.v7.view.menu.C0725n;
import android.support.v7.view.menu.C0731s;
import android.support.v7.view.menu.C4890h;
import android.support.v7.view.menu.C4890h.C0722a;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnTouchListener;

public class PopupMenu {
    private final View mAnchor;
    private final Context mContext;
    private OnTouchListener mDragListener;
    private final C4890h mMenu;
    OnMenuItemClickListener mMenuItemClickListener;
    OnDismissListener mOnDismissListener;
    final C0725n mPopup;

    class C07612 implements android.widget.PopupWindow.OnDismissListener {
        C07612() {
        }

        public void onDismiss() {
            if (PopupMenu.this.mOnDismissListener != null) {
                PopupMenu.this.mOnDismissListener.onDismiss(PopupMenu.this);
            }
        }
    }

    public interface OnDismissListener {
        void onDismiss(PopupMenu popupMenu);
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    class C49091 implements C0722a {
        C49091() {
        }

        public boolean onMenuItemSelected(C4890h c4890h, MenuItem menuItem) {
            return PopupMenu.this.mMenuItemClickListener != null ? PopupMenu.this.mMenuItemClickListener.onMenuItemClick(menuItem) : false;
        }

        public void onMenuModeChange(C4890h c4890h) {
        }
    }

    public PopupMenu(Context context, View view) {
        this(context, view, 0);
    }

    public PopupMenu(Context context, View view, int i) {
        this(context, view, i, C0635a.popupMenuStyle, 0);
    }

    public PopupMenu(Context context, View view, int i, int i2, int i3) {
        this.mContext = context;
        this.mAnchor = view;
        this.mMenu = new C4890h(context);
        this.mMenu.mo2620a(new C49091());
        this.mPopup = new C0725n(context, this.mMenu, view, false, i2, i3);
        this.mPopup.setGravity(i);
        this.mPopup.setOnDismissListener(new C07612());
    }

    public void dismiss() {
        this.mPopup.dismiss();
    }

    public OnTouchListener getDragToOpenListener() {
        if (this.mDragListener == null) {
            this.mDragListener = new ForwardingListener(this.mAnchor) {
                public C0731s getPopup() {
                    return PopupMenu.this.mPopup.getPopup();
                }

                protected boolean onForwardingStarted() {
                    PopupMenu.this.show();
                    return true;
                }

                protected boolean onForwardingStopped() {
                    PopupMenu.this.dismiss();
                    return true;
                }
            };
        }
        return this.mDragListener;
    }

    public int getGravity() {
        return this.mPopup.getGravity();
    }

    public Menu getMenu() {
        return this.mMenu;
    }

    public MenuInflater getMenuInflater() {
        return new C0711g(this.mContext);
    }

    public void inflate(int i) {
        getMenuInflater().inflate(i, this.mMenu);
    }

    public void setGravity(int i) {
        this.mPopup.setGravity(i);
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mMenuItemClickListener = onMenuItemClickListener;
    }

    public void show() {
        this.mPopup.show();
    }
}
