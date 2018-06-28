package fr.castorflex.android.smoothprogressbar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import fr.castorflex.android.smoothprogressbar.C2332b.C2325a;
import fr.castorflex.android.smoothprogressbar.C2332b.C2326b;
import fr.castorflex.android.smoothprogressbar.C2332b.C2327c;
import fr.castorflex.android.smoothprogressbar.C2332b.C2328d;
import fr.castorflex.android.smoothprogressbar.C2332b.C2329e;
import fr.castorflex.android.smoothprogressbar.C2332b.C2330f;
import fr.castorflex.android.smoothprogressbar.C2332b.C2331g;
import fr.castorflex.android.smoothprogressbar.C2337d.C2335a;
import fr.castorflex.android.smoothprogressbar.C2337d.C2336b;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class SmoothProgressBar extends ProgressBar {
    public SmoothProgressBar(Context context) {
        this(context, null);
    }

    public SmoothProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2325a.spbStyle);
    }

    public SmoothProgressBar(Context context, AttributeSet attributeSet, int i) {
        C2335a c2335a;
        SmoothProgressBar smoothProgressBar = this;
        Context context2 = context;
        super(context, attributeSet, i);
        if (isInEditMode()) {
            c2335a = new C2335a(context2, true);
        } else {
            Resources resources = context.getResources();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C2331g.SmoothProgressBar, i, 0);
            int color = obtainStyledAttributes.getColor(C2331g.SmoothProgressBar_spb_color, resources.getColor(C2327c.spb_default_color));
            int integer = obtainStyledAttributes.getInteger(C2331g.SmoothProgressBar_spb_sections_count, resources.getInteger(C2329e.spb_default_sections_count));
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C2331g.SmoothProgressBar_spb_stroke_separator_length, resources.getDimensionPixelSize(C2328d.spb_default_stroke_separator_length));
            float dimension = obtainStyledAttributes.getDimension(C2331g.SmoothProgressBar_spb_stroke_width, resources.getDimension(C2328d.spb_default_stroke_width));
            float f = obtainStyledAttributes.getFloat(C2331g.SmoothProgressBar_spb_speed, Float.parseFloat(resources.getString(C2330f.spb_default_speed)));
            float f2 = obtainStyledAttributes.getFloat(C2331g.SmoothProgressBar_spb_progressiveStart_speed, f);
            float f3 = obtainStyledAttributes.getFloat(C2331g.SmoothProgressBar_spb_progressiveStop_speed, f);
            int integer2 = obtainStyledAttributes.getInteger(C2331g.SmoothProgressBar_spb_interpolator, -1);
            boolean z = obtainStyledAttributes.getBoolean(C2331g.SmoothProgressBar_spb_reversed, resources.getBoolean(C2326b.spb_default_reversed));
            boolean z2 = obtainStyledAttributes.getBoolean(C2331g.SmoothProgressBar_spb_mirror_mode, resources.getBoolean(C2326b.spb_default_mirror_mode));
            int resourceId = obtainStyledAttributes.getResourceId(C2331g.SmoothProgressBar_spb_colors, 0);
            int i2 = color;
            boolean z3 = obtainStyledAttributes.getBoolean(C2331g.SmoothProgressBar_spb_progressiveStart_activated, resources.getBoolean(C2326b.spb_default_progressiveStart_activated));
            Drawable drawable = obtainStyledAttributes.getDrawable(C2331g.SmoothProgressBar_spb_background);
            boolean z4 = z3;
            boolean z5 = obtainStyledAttributes.getBoolean(C2331g.SmoothProgressBar_spb_generate_background_with_colors, false);
            boolean z6 = obtainStyledAttributes.getBoolean(C2331g.SmoothProgressBar_spb_gradients, false);
            obtainStyledAttributes.recycle();
            int[] iArr = null;
            Interpolator interpolator = integer2 == -1 ? getInterpolator() : null;
            if (interpolator == null) {
                switch (integer2) {
                    case 1:
                        interpolator = new LinearInterpolator();
                        break;
                    case 2:
                        interpolator = new AccelerateDecelerateInterpolator();
                        break;
                    case 3:
                        interpolator = new DecelerateInterpolator();
                        break;
                    default:
                        interpolator = new AccelerateInterpolator();
                        break;
                }
            }
            if (resourceId != 0) {
                iArr = resources.getIntArray(resourceId);
            }
            c2335a = new C2335a(context2);
            C2333c.m6321a(f);
            c2335a.f7660d = f;
            C2333c.m6321a(f2);
            c2335a.f7661e = f2;
            C2333c.m6321a(f3);
            c2335a.f7662f = f3;
            String str = "Interpolator";
            if (interpolator == null) {
                throw new IllegalArgumentException(String.format("%s must be not null", new Object[]{str}));
            }
            c2335a.f7657a = interpolator;
            str = "Sections count";
            if (integer <= 0) {
                throw new IllegalArgumentException(String.format("%s must not be null", new Object[]{str}));
            }
            c2335a.f7658b = integer;
            C2333c.m6322a((float) dimensionPixelSize, "Separator length");
            c2335a.f7666j = dimensionPixelSize;
            C2333c.m6322a(dimension, "Width");
            c2335a.f7665i = dimension;
            c2335a.f7663g = z;
            c2335a.f7664h = z2;
            c2335a.f7667k = z4;
            c2335a.f7669m = z6;
            if (drawable != null) {
                c2335a.f7670n = drawable;
            }
            if (z5) {
                c2335a.f7668l = true;
            }
            if (iArr == null || iArr.length <= 0) {
                c2335a.f7659c = new int[]{i2};
            } else {
                if (iArr != null) {
                    if (iArr.length != 0) {
                        c2335a.f7659c = iArr;
                    }
                }
                throw new IllegalArgumentException("You must provide at least 1 color");
            }
        }
        setIndeterminateDrawable(c2335a.m6323a());
    }

    private C2337d m6320a() {
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            if (indeterminateDrawable instanceof C2337d) {
                return (C2337d) indeterminateDrawable;
            }
        }
        throw new RuntimeException("The drawable is not a SmoothProgressDrawable");
    }

    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isIndeterminate() && (getIndeterminateDrawable() instanceof C2337d) && !((C2337d) getIndeterminateDrawable()).isRunning()) {
            getIndeterminateDrawable().draw(canvas);
        }
    }

    public void setInterpolator(Interpolator interpolator) {
        super.setInterpolator(interpolator);
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null && (indeterminateDrawable instanceof C2337d)) {
            ((C2337d) indeterminateDrawable).m6337a(interpolator);
        }
    }

    public void setProgressiveStartActivated(boolean z) {
        m6320a().f7687m = z;
    }

    public void setSmoothProgressDrawableBackgroundDrawable(Drawable drawable) {
        C2337d a = m6320a();
        if (a.f7688n != drawable) {
            a.f7688n = drawable;
            a.invalidateSelf();
        }
    }

    public void setSmoothProgressDrawableCallbacks(C2336b c2336b) {
        m6320a().f7675a = c2336b;
    }

    public void setSmoothProgressDrawableColor(int i) {
        m6320a().m6338a(new int[]{i});
    }

    public void setSmoothProgressDrawableColors(int[] iArr) {
        m6320a().m6338a(iArr);
    }

    public void setSmoothProgressDrawableInterpolator(Interpolator interpolator) {
        m6320a().m6337a(interpolator);
    }

    public void setSmoothProgressDrawableMirrorMode(boolean z) {
        C2337d a = m6320a();
        if (a.f7684j != z) {
            a.f7684j = z;
            a.invalidateSelf();
        }
    }

    public void setSmoothProgressDrawableProgressiveStartSpeed(float f) {
        C2337d a = m6320a();
        if (f < 0.0f) {
            throw new IllegalArgumentException("SpeedProgressiveStart must be >= 0");
        }
        a.f7681g = f;
        a.invalidateSelf();
    }

    public void setSmoothProgressDrawableProgressiveStopSpeed(float f) {
        C2337d a = m6320a();
        if (f < 0.0f) {
            throw new IllegalArgumentException("SpeedProgressiveStop must be >= 0");
        }
        a.f7682h = f;
        a.invalidateSelf();
    }

    public void setSmoothProgressDrawableReversed(boolean z) {
        C2337d a = m6320a();
        if (a.f7683i != z) {
            a.f7683i = z;
            a.invalidateSelf();
        }
    }

    public void setSmoothProgressDrawableSectionsCount(int i) {
        C2337d a = m6320a();
        if (i <= 0) {
            throw new IllegalArgumentException("SectionsCount must be > 0");
        }
        a.f7679e = i;
        a.f7685k = BallPulseIndicator.SCALE / ((float) a.f7679e);
        a.f7677c %= a.f7685k;
        a.m6336a();
        a.invalidateSelf();
    }

    public void setSmoothProgressDrawableSeparatorLength(int i) {
        C2337d a = m6320a();
        if (i < 0) {
            throw new IllegalArgumentException("SeparatorLength must be >= 0");
        }
        a.f7678d = i;
        a.invalidateSelf();
    }

    public void setSmoothProgressDrawableSpeed(float f) {
        C2337d a = m6320a();
        if (f < 0.0f) {
            throw new IllegalArgumentException("Speed must be >= 0");
        }
        a.f7680f = f;
        a.invalidateSelf();
    }

    public void setSmoothProgressDrawableStrokeWidth(float f) {
        C2337d a = m6320a();
        if (f < 0.0f) {
            throw new IllegalArgumentException("The strokeWidth must be >= 0");
        }
        a.f7676b.setStrokeWidth(f);
        a.invalidateSelf();
    }

    public void setSmoothProgressDrawableUseGradients(boolean z) {
        C2337d a = m6320a();
        if (a.f7689o != z) {
            a.f7689o = z;
            a.m6336a();
            a.invalidateSelf();
        }
    }
}
