package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.C0555d;
import android.support.v4.view.C0571r;
import android.support.v7.p041a.C0645a.C0635a;
import android.support.v7.p041a.C0645a.C0638d;
import android.support.v7.view.menu.C0727o.C0726a;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow.OnDismissListener;

public class C0725n {
    private static final int TOUCH_EPICENTER_SIZE_DP = 48;
    private View mAnchorView;
    private final Context mContext;
    private int mDropDownGravity;
    private boolean mForceShowIcon;
    private final OnDismissListener mInternalOnDismissListener;
    private final C4890h mMenu;
    private OnDismissListener mOnDismissListener;
    private final boolean mOverflowOnly;
    private C4898m mPopup;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    private C0726a mPresenterCallback;

    class C07241 implements OnDismissListener {
        final /* synthetic */ C0725n f2389a;

        C07241(C0725n c0725n) {
            this.f2389a = c0725n;
        }

        public final void onDismiss() {
            this.f2389a.onDismiss();
        }
    }

    public C0725n(Context context, C4890h c4890h) {
        this(context, c4890h, null, false, C0635a.popupMenuStyle, 0);
    }

    public C0725n(Context context, C4890h c4890h, View view) {
        this(context, c4890h, view, false, C0635a.popupMenuStyle, 0);
    }

    public C0725n(Context context, C4890h c4890h, View view, boolean z, int i) {
        this(context, c4890h, view, z, i, 0);
    }

    public C0725n(Context context, C4890h c4890h, View view, boolean z, int i, int i2) {
        this.mDropDownGravity = 8388611;
        this.mInternalOnDismissListener = new C07241(this);
        this.mContext = context;
        this.mMenu = c4890h;
        this.mAnchorView = view;
        this.mOverflowOnly = z;
        this.mPopupStyleAttr = i;
        this.mPopupStyleRes = i2;
    }

    private C4898m createPopup() {
        Display defaultDisplay = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        if ((Math.min(point.x, point.y) >= this.mContext.getResources().getDimensionPixelSize(C0638d.abc_cascading_menus_min_smallest_width) ? 1 : null) != null) {
            C4898m c6394e = new C6394e(this.mContext, this.mAnchorView, this.mPopupStyleAttr, this.mPopupStyleRes, this.mOverflowOnly);
        } else {
            C4898m c6398t = new C6398t(this.mContext, this.mMenu, this.mAnchorView, this.mPopupStyleAttr, this.mPopupStyleRes, this.mOverflowOnly);
        }
        r0.mo2606a(this.mMenu);
        r0.mo2608a(this.mInternalOnDismissListener);
        r0.mo2607a(this.mAnchorView);
        r0.setCallback(this.mPresenterCallback);
        r0.mo2609a(this.mForceShowIcon);
        r0.mo2605a(this.mDropDownGravity);
        return r0;
    }

    private void showPopup(int i, int i2, boolean z, boolean z2) {
        C4898m popup = getPopup();
        popup.mo2612b(z2);
        if (z) {
            if ((C0555d.m1224a(this.mDropDownGravity, C0571r.m1369h(this.mAnchorView)) & 7) == 5) {
                i += this.mAnchorView.getWidth();
            }
            popup.mo2611b(i);
            popup.mo2613c(i2);
            int i3 = (int) ((48.0f * this.mContext.getResources().getDisplayMetrics().density) / 2.0f);
            popup.f13719e = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        popup.show();
    }

    public void dismiss() {
        if (isShowing()) {
            this.mPopup.dismiss();
        }
    }

    public int getGravity() {
        return this.mDropDownGravity;
    }

    public C4898m getPopup() {
        if (this.mPopup == null) {
            this.mPopup = createPopup();
        }
        return this.mPopup;
    }

    public boolean isShowing() {
        return this.mPopup != null && this.mPopup.isShowing();
    }

    protected void onDismiss() {
        this.mPopup = null;
        if (this.mOnDismissListener != null) {
            this.mOnDismissListener.onDismiss();
        }
    }

    public void setAnchorView(View view) {
        this.mAnchorView = view;
    }

    public void setForceShowIcon(boolean z) {
        this.mForceShowIcon = z;
        if (this.mPopup != null) {
            this.mPopup.mo2609a(z);
        }
    }

    public void setGravity(int i) {
        this.mDropDownGravity = i;
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setPresenterCallback(C0726a c0726a) {
        this.mPresenterCallback = c0726a;
        if (this.mPopup != null) {
            this.mPopup.setCallback(c0726a);
        }
    }

    public void show() {
        if (!tryShow()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public void show(int i, int i2) {
        if (!tryShow(i, i2)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean tryShow() {
        if (isShowing()) {
            return true;
        }
        if (this.mAnchorView == null) {
            return false;
        }
        showPopup(0, 0, false, false);
        return true;
    }

    public boolean tryShow(int i, int i2) {
        if (isShowing()) {
            return true;
        }
        if (this.mAnchorView == null) {
            return false;
        }
        showPopup(i, i2, true, true);
        return true;
    }
}
