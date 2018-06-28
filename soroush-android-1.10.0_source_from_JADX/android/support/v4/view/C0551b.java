package android.support.v4.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class C0551b {
    private static final String TAG = "ActionProvider(support)";
    private final Context mContext;
    private C4834a mSubUiVisibilityListener;
    private C4835b mVisibilityListener;

    public interface C4834a {
        void onSubUiVisibilityChanged(boolean z);
    }

    public interface C4835b {
        void mo540a();
    }

    public C0551b(Context context) {
        this.mContext = context;
    }

    public Context getContext() {
        return this.mContext;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isVisible() {
        return true;
    }

    public abstract View onCreateActionView();

    public View onCreateActionView(MenuItem menuItem) {
        return onCreateActionView();
    }

    public boolean onPerformDefaultAction() {
        return false;
    }

    public void onPrepareSubMenu(SubMenu subMenu) {
    }

    public boolean overridesItemVisibility() {
        return false;
    }

    public void refreshVisibility() {
        if (this.mVisibilityListener != null && overridesItemVisibility()) {
            C4835b c4835b = this.mVisibilityListener;
            isVisible();
            c4835b.mo540a();
        }
    }

    public void reset() {
        this.mVisibilityListener = null;
        this.mSubUiVisibilityListener = null;
    }

    public void setSubUiVisibilityListener(C4834a c4834a) {
        this.mSubUiVisibilityListener = c4834a;
    }

    public void setVisibilityListener(C4835b c4835b) {
        if (!(this.mVisibilityListener == null || c4835b == null)) {
            String str = TAG;
            StringBuilder stringBuilder = new StringBuilder("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            stringBuilder.append(getClass().getSimpleName());
            stringBuilder.append(" instance while it is still in use somewhere else?");
            Log.w(str, stringBuilder.toString());
        }
        this.mVisibilityListener = c4835b;
    }

    public void subUiVisibilityChanged(boolean z) {
        if (this.mSubUiVisibilityListener != null) {
            this.mSubUiVisibilityListener.onSubUiVisibilityChanged(z);
        }
    }
}
