package uk.co.p616a.p617a.p620c;

import android.content.Context;
import android.widget.Scroller;

public final class C7998c extends C7868d {
    private final Scroller f24978a;

    public C7998c(Context context) {
        this.f24978a = new Scroller(context);
    }

    public final void mo4872a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f24978a.fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    public final boolean mo4873a() {
        return this.f24978a.computeScrollOffset();
    }

    public final void mo4874b() {
        this.f24978a.forceFinished(true);
    }

    public final boolean mo4875c() {
        return this.f24978a.isFinished();
    }

    public final int mo4876d() {
        return this.f24978a.getCurrX();
    }

    public final int mo4877e() {
        return this.f24978a.getCurrY();
    }
}
