package android.support.p028d;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

final class aj implements ak {
    private final ViewOverlay f12945a;

    aj(View view) {
        this.f12945a = view.getOverlay();
    }

    public final void mo74a(Drawable drawable) {
        this.f12945a.add(drawable);
    }

    public final void mo75b(Drawable drawable) {
        this.f12945a.remove(drawable);
    }
}
