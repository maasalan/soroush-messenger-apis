package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.p033c.p034a.C0442b;
import android.support.v4.view.C0551b.C4835b;
import android.support.v7.view.menu.C6395k.C4894a;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

final class C7025l extends C6395k {

    class C6396a extends C4894a implements VisibilityListener {
        C4835b f17524c;
        final /* synthetic */ C7025l f17525d;

        public C6396a(C7025l c7025l, Context context, ActionProvider actionProvider) {
            this.f17525d = c7025l;
            super(c7025l, context, actionProvider);
        }

        public final boolean isVisible() {
            return this.a.isVisible();
        }

        public final void onActionProviderVisibilityChanged(boolean z) {
            if (this.f17524c != null) {
                this.f17524c.mo540a();
            }
        }

        public final View onCreateActionView(MenuItem menuItem) {
            return this.a.onCreateActionView(menuItem);
        }

        public final boolean overridesItemVisibility() {
            return this.a.overridesItemVisibility();
        }

        public final void refreshVisibility() {
            this.a.refreshVisibility();
        }

        public final void setVisibilityListener(C4835b c4835b) {
            this.f17524c = c4835b;
            this.a.setVisibilityListener(c4835b != null ? this : null);
        }
    }

    C7025l(Context context, C0442b c0442b) {
        super(context, c0442b);
    }

    final C4894a mo3306a(ActionProvider actionProvider) {
        return new C6396a(this, this.a, actionProvider);
    }
}
