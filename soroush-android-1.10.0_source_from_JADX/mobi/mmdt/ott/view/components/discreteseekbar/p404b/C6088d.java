package mobi.mmdt.ott.view.components.discreteseekbar.p404b;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;

public final class C6088d extends C3147c implements Animatable {
    public boolean f16305a;
    public Runnable f16306b = new C31481(this);
    private final int f16307c;
    private boolean f16308d;

    class C31481 implements Runnable {
        final /* synthetic */ C6088d f9767a;

        C31481(C6088d c6088d) {
            this.f9767a = c6088d;
        }

        public final void run() {
            this.f9767a.f16308d = true;
            this.f9767a.invalidateSelf();
            this.f9767a.f16305a = false;
        }
    }

    public C6088d(ColorStateList colorStateList, int i) {
        super(colorStateList);
        this.f16307c = i;
    }

    public final void m13742a() {
        this.f16308d = false;
        this.f16305a = false;
        unscheduleSelf(this.f16306b);
        invalidateSelf();
    }

    public final void mo2261a(Canvas canvas, Paint paint) {
        if (!this.f16308d) {
            Rect bounds = getBounds();
            canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), (float) (this.f16307c / 2), paint);
        }
    }

    public final int getIntrinsicHeight() {
        return this.f16307c;
    }

    public final int getIntrinsicWidth() {
        return this.f16307c;
    }

    public final boolean isRunning() {
        return this.f16305a;
    }

    public final void start() {
    }

    public final void stop() {
        m13742a();
    }
}
