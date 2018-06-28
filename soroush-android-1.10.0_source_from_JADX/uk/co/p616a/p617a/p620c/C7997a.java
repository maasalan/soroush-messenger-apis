package uk.co.p616a.p617a.p620c;

import android.annotation.TargetApi;
import android.content.Context;
import android.widget.OverScroller;

@TargetApi(9)
public class C7997a extends C7868d {
    protected final OverScroller f24976a;
    private boolean f24977b = false;

    public C7997a(Context context) {
        this.f24976a = new OverScroller(context);
    }

    public final void mo4872a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f24976a.fling(i, i2, i3, i4, i5, i6, i7, i8, 0, 0);
    }

    public boolean mo4873a() {
        if (this.f24977b) {
            this.f24976a.computeScrollOffset();
            this.f24977b = false;
        }
        return this.f24976a.computeScrollOffset();
    }

    public final void mo4874b() {
        this.f24976a.forceFinished(true);
    }

    public final boolean mo4875c() {
        return this.f24976a.isFinished();
    }

    public final int mo4876d() {
        return this.f24976a.getCurrX();
    }

    public final int mo4877e() {
        return this.f24976a.getCurrY();
    }
}
