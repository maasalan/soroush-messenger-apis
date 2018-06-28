package android.support.p028d;

import android.view.View;
import android.view.WindowId;

final class au implements av {
    private final WindowId f12955a;

    au(View view) {
        this.f12955a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof au) && ((au) obj).f12955a.equals(this.f12955a);
    }

    public final int hashCode() {
        return this.f12955a.hashCode();
    }
}
