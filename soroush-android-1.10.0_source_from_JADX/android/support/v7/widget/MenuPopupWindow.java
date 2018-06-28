package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.support.v7.view.menu.C0721g;
import android.support.v7.view.menu.C4890h;
import android.support.v7.view.menu.ListMenuItemView;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import java.lang.reflect.Method;

public class MenuPopupWindow extends ListPopupWindow implements MenuItemHoverListener {
    private static final String TAG = "MenuPopupWindow";
    private static Method sSetTouchModalMethod;
    private MenuItemHoverListener mHoverListener;

    public static class MenuDropDownListView extends DropDownListView {
        final int mAdvanceKey;
        private MenuItemHoverListener mHoverListener;
        private MenuItem mHoveredMenuItem;
        final int mRetreatKey;

        public MenuDropDownListView(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.mAdvanceKey = 22;
                this.mRetreatKey = 21;
                return;
            }
            this.mAdvanceKey = 21;
            this.mRetreatKey = 22;
        }

        public void clearSelection() {
            setSelection(-1);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public /* bridge */ /* synthetic */ boolean onForwardedEvent(MotionEvent motionEvent, int i) {
            return super.onForwardedEvent(motionEvent, i);
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            if (this.mHoverListener != null) {
                int headersCount;
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    headersCount = 0;
                }
                C0721g c0721g = (C0721g) adapter;
                MenuItem menuItem = null;
                if (motionEvent.getAction() != 10) {
                    int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (pointToPosition != -1) {
                        pointToPosition -= headersCount;
                        if (pointToPosition >= 0 && pointToPosition < c0721g.getCount()) {
                            menuItem = c0721g.m1733a(pointToPosition);
                        }
                    }
                }
                MenuItem menuItem2 = this.mHoveredMenuItem;
                if (menuItem2 != menuItem) {
                    C4890h c4890h = c0721g.f2384b;
                    if (menuItem2 != null) {
                        this.mHoverListener.onItemHoverExit(c4890h, menuItem2);
                    }
                    this.mHoveredMenuItem = menuItem;
                    if (menuItem != null) {
                        this.mHoverListener.onItemHoverEnter(c4890h, menuItem);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.mAdvanceKey) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.mRetreatKey) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C0721g) getAdapter()).f2384b.m9484b(false);
                return true;
            }
        }

        public void setHoverListener(MenuItemHoverListener menuItemHoverListener) {
            this.mHoverListener = menuItemHoverListener;
        }
    }

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = android.widget.PopupWindow.class;	 Catch:{ NoSuchMethodException -> 0x0013 }
        r1 = "setTouchModal";	 Catch:{ NoSuchMethodException -> 0x0013 }
        r2 = 1;	 Catch:{ NoSuchMethodException -> 0x0013 }
        r2 = new java.lang.Class[r2];	 Catch:{ NoSuchMethodException -> 0x0013 }
        r3 = 0;	 Catch:{ NoSuchMethodException -> 0x0013 }
        r4 = java.lang.Boolean.TYPE;	 Catch:{ NoSuchMethodException -> 0x0013 }
        r2[r3] = r4;	 Catch:{ NoSuchMethodException -> 0x0013 }
        r0 = r0.getDeclaredMethod(r1, r2);	 Catch:{ NoSuchMethodException -> 0x0013 }
        sSetTouchModalMethod = r0;	 Catch:{ NoSuchMethodException -> 0x0013 }
        return;
    L_0x0013:
        r0 = "MenuPopupWindow";
        r1 = "Could not find method setTouchModal() on PopupWindow. Oh well.";
        android.util.Log.i(r0, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.MenuPopupWindow.<clinit>():void");
    }

    public MenuPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    DropDownListView createDropDownListView(Context context, boolean z) {
        DropDownListView menuDropDownListView = new MenuDropDownListView(context, z);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }

    public void onItemHoverEnter(C4890h c4890h, MenuItem menuItem) {
        if (this.mHoverListener != null) {
            this.mHoverListener.onItemHoverEnter(c4890h, menuItem);
        }
    }

    public void onItemHoverExit(C4890h c4890h, MenuItem menuItem) {
        if (this.mHoverListener != null) {
            this.mHoverListener.onItemHoverExit(c4890h, menuItem);
        }
    }

    public void setEnterTransition(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.mPopup.setEnterTransition((Transition) obj);
        }
    }

    public void setExitTransition(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.mPopup.setExitTransition((Transition) obj);
        }
    }

    public void setHoverListener(MenuItemHoverListener menuItemHoverListener) {
        this.mHoverListener = menuItemHoverListener;
    }

    public void setTouchModal(boolean r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = sSetTouchModalMethod;
        if (r0 == 0) goto L_0x001d;
    L_0x0004:
        r0 = sSetTouchModalMethod;	 Catch:{ Exception -> 0x0016 }
        r1 = r4.mPopup;	 Catch:{ Exception -> 0x0016 }
        r2 = 1;	 Catch:{ Exception -> 0x0016 }
        r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0016 }
        r3 = 0;	 Catch:{ Exception -> 0x0016 }
        r5 = java.lang.Boolean.valueOf(r5);	 Catch:{ Exception -> 0x0016 }
        r2[r3] = r5;	 Catch:{ Exception -> 0x0016 }
        r0.invoke(r1, r2);	 Catch:{ Exception -> 0x0016 }
        return;
    L_0x0016:
        r5 = "MenuPopupWindow";
        r0 = "Could not invoke setTouchModal() on PopupWindow. Oh well.";
        android.util.Log.i(r5, r0);
    L_0x001d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.MenuPopupWindow.setTouchModal(boolean):void");
    }
}
