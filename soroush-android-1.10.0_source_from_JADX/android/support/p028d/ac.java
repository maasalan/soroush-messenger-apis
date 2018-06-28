package android.support.p028d;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

final class ac implements ad {
    private final ViewGroupOverlay f17325a;

    ac(ViewGroup viewGroup) {
        this.f17325a = viewGroup.getOverlay();
    }

    public final void mo74a(Drawable drawable) {
        this.f17325a.add(drawable);
    }

    public final void mo2504a(View view) {
        this.f17325a.add(view);
    }

    public final void mo75b(Drawable drawable) {
        this.f17325a.remove(drawable);
    }

    public final void mo2505b(View view) {
        this.f17325a.remove(view);
    }
}
