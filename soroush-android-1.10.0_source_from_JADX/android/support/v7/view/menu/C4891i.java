package android.support.v7.view.menu;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.support.v7.app.C6389b;
import android.support.v7.view.menu.C0727o.C0726a;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;

final class C4891i implements OnClickListener, OnDismissListener, OnKeyListener, C0726a {
    C4890h f13674a;
    C6389b f13675b;
    C4889f f13676c;
    private C0726a f13677d;

    public C4891i(C4890h c4890h) {
        this.f13674a = c4890h;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f13674a.m9481a((C4893j) this.f13676c.m9466a().getItem(i), null, 0);
    }

    public final void onCloseMenu(C4890h c4890h, boolean z) {
        if ((z || c4890h == this.f13674a) && this.f13675b != null) {
            this.f13675b.dismiss();
        }
        if (this.f13677d != null) {
            this.f13677d.onCloseMenu(c4890h, z);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f13676c.onCloseMenu(this.f13674a, true);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window = this.f13675b.getWindow();
                if (window != null) {
                    View decorView = window.getDecorView();
                    if (decorView != null) {
                        DispatcherState keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, this);
                            return true;
                        }
                    }
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                Window window2 = this.f13675b.getWindow();
                if (window2 != null) {
                    View decorView2 = window2.getDecorView();
                    if (decorView2 != null) {
                        DispatcherState keyDispatcherState2 = decorView2.getKeyDispatcherState();
                        if (keyDispatcherState2 != null && keyDispatcherState2.isTracking(keyEvent)) {
                            this.f13674a.m9484b(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.f13674a.performShortcut(i, keyEvent, 0);
    }

    public final boolean onOpenSubMenu(C4890h c4890h) {
        return this.f13677d != null ? this.f13677d.onOpenSubMenu(c4890h) : false;
    }
}
