package mobi.mmdt.ott.view.components.discreteseekbar.p404b;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.os.SystemClock;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C6086a extends C3147c implements Animatable {
    private float f16276a = 0.0f;
    private Interpolator f16277b = new AccelerateDecelerateInterpolator();
    private long f16278c;
    private boolean f16279d = false;
    private boolean f16280e = false;
    private int f16281f = Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
    private float f16282g;
    private int f16283h;
    private int f16284i;
    private int f16285j;
    private int f16286k;
    private int f16287l;
    private final Runnable f16288m = new C31441(this);

    class C31441 implements Runnable {
        final /* synthetic */ C6086a f9761a;

        C31441(C6086a c6086a) {
            this.f9761a = c6086a;
        }

        public final void run() {
            long uptimeMillis = SystemClock.uptimeMillis();
            long a = uptimeMillis - this.f9761a.f16278c;
            if (a < ((long) this.f9761a.f16281f)) {
                float interpolation = this.f9761a.f16277b.getInterpolation(((float) a) / ((float) this.f9761a.f16281f));
                this.f9761a.scheduleSelf(this.f9761a.f16288m, uptimeMillis + 16);
                C6086a.m13722a(this.f9761a, interpolation);
                return;
            }
            this.f9761a.unscheduleSelf(this.f9761a.f16288m);
            this.f9761a.f16280e = false;
            C6086a.m13722a(this.f9761a, (float) BallPulseIndicator.SCALE);
        }
    }

    public C6086a(ColorStateList colorStateList) {
        super(colorStateList);
        m13728a(colorStateList);
    }

    static /* synthetic */ void m13722a(C6086a c6086a, float f) {
        float f2 = c6086a.f16282g;
        c6086a.f16276a = f2 + (((c6086a.f16279d ? 0.0f : BallPulseIndicator.SCALE) - f2) * f);
        c6086a.invalidateSelf();
    }

    private static int m13723b(int i) {
        return Color.argb((Color.alpha(i) * 131) >> 8, Color.red(i), Color.green(i), Color.blue(i));
    }

    public final void m13728a(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f16284i = colorStateList.getColorForState(new int[]{16842910, 16842908}, defaultColor);
        this.f16283h = colorStateList.getColorForState(new int[]{16842910, 16842919}, defaultColor);
        this.f16285j = colorStateList.getColorForState(new int[]{-16842910}, defaultColor);
        this.f16284i = C6086a.m13723b(this.f16284i);
        this.f16283h = C6086a.m13723b(this.f16283h);
        this.f16285j = C6086a.m13723b(this.f16285j);
    }

    public final void mo2261a(Canvas canvas, Paint paint) {
        Rect bounds = getBounds();
        int min = Math.min(bounds.width(), bounds.height());
        float f = this.f16276a;
        int i = this.f16286k;
        int i2 = this.f16287l;
        float f2 = (float) (min / 2);
        float f3 = f2 * f;
        if (f > 0.0f) {
            if (i2 != 0) {
                paint.setColor(i2);
                paint.setAlpha((Color.alpha(i2) * 100) >> 8);
                canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), f2, paint);
            }
            if (i != 0) {
                paint.setColor(i);
                paint.setAlpha(m7626a(Color.alpha(i)));
                canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), f3, paint);
            }
        }
    }

    public final boolean isRunning() {
        return this.f16280e;
    }

    public final boolean setState(int[] iArr) {
        int[] state = getState();
        int length = state.length;
        int i = 0;
        int i2 = i;
        while (i < length) {
            if (state[i] == 16842919) {
                i2 = true;
            }
            i++;
        }
        super.setState(iArr);
        int length2 = iArr.length;
        length = 0;
        int i3 = length;
        int i4 = i3;
        boolean z = true;
        while (length < length2) {
            int i5 = iArr[length];
            if (i5 == 16842908) {
                i4 = true;
            } else if (i5 == 16842919) {
                i3 = true;
            } else if (i5 == 16842910) {
                z = false;
            }
            length++;
        }
        if (z) {
            unscheduleSelf(this.f16288m);
            this.f16286k = this.f16285j;
            this.f16287l = 0;
            this.f16276a = 0.5f;
        } else if (i3 != 0) {
            unscheduleSelf(this.f16288m);
            if (this.f16276a < BallPulseIndicator.SCALE) {
                this.f16279d = false;
                this.f16280e = true;
                this.f16282g = this.f16276a;
                this.f16281f = (int) (250.0f * (BallPulseIndicator.SCALE - ((this.f16282g - 0.0f) / BallPulseIndicator.SCALE)));
                this.f16278c = SystemClock.uptimeMillis();
                scheduleSelf(this.f16288m, this.f16278c + 16);
            }
            int i6 = this.f16283h;
            this.f16287l = i6;
            this.f16286k = i6;
            return true;
        } else if (i2 != 0) {
            int i7 = this.f16283h;
            this.f16287l = i7;
            this.f16286k = i7;
            unscheduleSelf(this.f16288m);
            if (this.f16276a <= 0.0f) {
                return true;
            }
            this.f16279d = true;
            this.f16280e = true;
            this.f16282g = this.f16276a;
            this.f16281f = (int) (250.0f * (BallPulseIndicator.SCALE - ((this.f16282g - BallPulseIndicator.SCALE) / -1.0f)));
            this.f16278c = SystemClock.uptimeMillis();
            scheduleSelf(this.f16288m, this.f16278c + 16);
            return true;
        } else if (i4 != 0) {
            this.f16286k = this.f16284i;
            this.f16287l = 0;
            this.f16276a = BallPulseIndicator.SCALE;
        } else {
            this.f16286k = 0;
            this.f16287l = 0;
            this.f16276a = 0.0f;
        }
        invalidateSelf();
        return true;
    }

    public final void start() {
    }

    public final void stop() {
    }
}
