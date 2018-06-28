package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.widget.EdgeEffect;

public final class C0621g {
    private static final C0620b f2047b = (VERSION.SDK_INT >= 21 ? new C4855a() : new C0620b());
    public EdgeEffect f2048a;

    static class C0620b {
        C0620b() {
        }

        public void mo431a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f);
        }
    }

    static class C4855a extends C0620b {
        C4855a() {
        }

        public final void mo431a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    @Deprecated
    public C0621g(Context context) {
        this.f2048a = new EdgeEffect(context);
    }

    public static void m1501a(EdgeEffect edgeEffect, float f, float f2) {
        f2047b.mo431a(edgeEffect, f, f2);
    }

    @Deprecated
    public final void m1502a(int i, int i2) {
        this.f2048a.setSize(i, i2);
    }

    @Deprecated
    public final boolean m1503a() {
        this.f2048a.onRelease();
        return this.f2048a.isFinished();
    }

    @Deprecated
    public final boolean m1504a(float f) {
        this.f2048a.onPull(f);
        return true;
    }

    @Deprecated
    public final boolean m1505a(Canvas canvas) {
        return this.f2048a.draw(canvas);
    }
}
