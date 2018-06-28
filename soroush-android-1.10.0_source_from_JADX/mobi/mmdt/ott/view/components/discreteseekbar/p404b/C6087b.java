package mobi.mmdt.ott.view.components.discreteseekbar.p404b;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.os.SystemClock;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C6087b extends C3147c implements Animatable {
    public float f16289a = 0.0f;
    public long f16290b;
    public boolean f16291c = false;
    public boolean f16292d = false;
    public int f16293e = Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
    public float f16294f;
    public int f16295g;
    public Path f16296h = new Path();
    RectF f16297i = new RectF();
    Matrix f16298j = new Matrix();
    public C3146a f16299k;
    public final Runnable f16300l = new C31451(this);
    private Interpolator f16301m = new AccelerateDecelerateInterpolator();
    private float f16302n;
    private int f16303o;
    private int f16304p;

    class C31451 implements Runnable {
        final /* synthetic */ C6087b f9762a;

        C31451(C6087b c6087b) {
            this.f9762a = c6087b;
        }

        public final void run() {
            long uptimeMillis = SystemClock.uptimeMillis();
            long a = uptimeMillis - this.f9762a.f16290b;
            if (a < ((long) this.f9762a.f16293e)) {
                float interpolation = this.f9762a.f16301m.getInterpolation(((float) a) / ((float) this.f9762a.f16293e));
                this.f9762a.scheduleSelf(this.f9762a.f16300l, uptimeMillis + 16);
                C6087b.m13732a(this.f9762a, interpolation);
                return;
            }
            this.f9762a.unscheduleSelf(this.f9762a.f16300l);
            this.f9762a.f16292d = false;
            C6087b.m13732a(this.f9762a, (float) BallPulseIndicator.SCALE);
            this.f9762a.m13738a();
        }
    }

    public interface C3146a {
        void mo2254a();

        void mo2255b();
    }

    public C6087b(ColorStateList colorStateList, int i) {
        super(colorStateList);
        this.f16302n = (float) i;
        this.f16303o = colorStateList.getColorForState(new int[]{16842910, 16842919}, colorStateList.getDefaultColor());
        this.f16304p = colorStateList.getDefaultColor();
    }

    private void m13731a(Rect rect) {
        float f = this.f16289a;
        Path path = this.f16296h;
        RectF rectF = this.f16297i;
        Matrix matrix = this.f16298j;
        path.reset();
        int min = Math.min(rect.width(), rect.height());
        float f2 = this.f16302n;
        f2 += (((float) min) - f2) * f;
        float f3 = f2 / 2.0f;
        float f4 = BallPulseIndicator.SCALE - f;
        f = f3 * f4;
        float[] fArr = new float[]{f3, f3, f3, f3, f3, f3, f, f};
        rectF.set((float) rect.left, (float) rect.top, ((float) rect.left) + f2, ((float) rect.top) + f2);
        path.addRoundRect(rectF, fArr, Direction.CCW);
        matrix.reset();
        matrix.postRotate(-45.0f, ((float) rect.left) + f3, ((float) rect.top) + f3);
        matrix.postTranslate((((float) rect.width()) - f2) / 2.0f, 0.0f);
        matrix.postTranslate(0.0f, ((((float) rect.bottom) - f2) - ((float) this.f16295g)) * f4);
        path.transform(matrix);
    }

    static /* synthetic */ void m13732a(C6087b c6087b, float f) {
        float f2 = c6087b.f16294f;
        c6087b.f16289a = f2 + (((c6087b.f16291c ? 0.0f : BallPulseIndicator.SCALE) - f2) * f);
        c6087b.m13731a(c6087b.getBounds());
        c6087b.invalidateSelf();
    }

    public final void m13738a() {
        if (this.f16299k != null) {
            if (this.f16291c) {
                this.f16299k.mo2254a();
                return;
            }
            this.f16299k.mo2255b();
        }
    }

    final void mo2261a(Canvas canvas, Paint paint) {
        if (!this.f16296h.isEmpty()) {
            paint.setStyle(Style.FILL);
            int i = this.f16303o;
            int i2 = this.f16304p;
            float f = this.f16289a;
            float f2 = BallPulseIndicator.SCALE - f;
            paint.setColor(Color.argb((int) ((((float) Color.alpha(i)) * f) + (((float) Color.alpha(i2)) * f2)), (int) ((((float) Color.red(i)) * f) + (((float) Color.red(i2)) * f2)), (int) ((((float) Color.green(i)) * f) + (((float) Color.green(i2)) * f2)), (int) ((((float) Color.blue(i)) * f) + (((float) Color.blue(i2)) * f2))));
            canvas.drawPath(this.f16296h, paint);
        }
    }

    public final boolean isRunning() {
        return this.f16292d;
    }

    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m13731a(rect);
    }

    public final void start() {
    }

    public final void stop() {
        unscheduleSelf(this.f16300l);
    }
}
