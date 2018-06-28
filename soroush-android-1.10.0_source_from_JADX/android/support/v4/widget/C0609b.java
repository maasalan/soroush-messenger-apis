package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.support.v4.view.C0571r;
import android.view.View;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

final class C0609b extends ImageView {
    AnimationListener f2005a;
    int f2006b;

    private class C0608a extends OvalShape {
        final /* synthetic */ C0609b f2002a;
        private RadialGradient f2003b;
        private Paint f2004c = new Paint();

        C0608a(C0609b c0609b, int i) {
            this.f2002a = c0609b;
            c0609b.f2006b = i;
            m1472a((int) rect().width());
        }

        private void m1472a(int i) {
            float f = (float) (i / 2);
            this.f2003b = new RadialGradient(f, f, (float) this.f2002a.f2006b, new int[]{1023410176, 0}, null, TileMode.CLAMP);
            this.f2004c.setShader(this.f2003b);
        }

        public final void draw(Canvas canvas, Paint paint) {
            int width = this.f2002a.getWidth() / 2;
            float f = (float) width;
            float height = (float) (this.f2002a.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.f2004c);
            canvas.drawCircle(f, height, (float) (width - this.f2002a.f2006b), paint);
        }

        protected final void onResize(float f, float f2) {
            super.onResize(f, f2);
            m1472a((int) f);
        }
    }

    C0609b(Context context) {
        Drawable shapeDrawable;
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (1.75f * f);
        int i2 = (int) (0.0f * f);
        this.f2006b = (int) (3.5f * f);
        if (C0609b.m1473a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C0571r.m1372i(this, 4.0f * f);
        } else {
            Drawable shapeDrawable2 = new ShapeDrawable(new C0608a(this, this.f2006b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f2006b, (float) i2, (float) i, 503316480);
            int i3 = this.f2006b;
            setPadding(i3, i3, i3, i3);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(-328966);
        C0571r.m1339a((View) this, shapeDrawable);
    }

    private static boolean m1473a() {
        return VERSION.SDK_INT >= 21;
    }

    public final void onAnimationEnd() {
        super.onAnimationEnd();
        if (this.f2005a != null) {
            this.f2005a.onAnimationEnd(getAnimation());
        }
    }

    public final void onAnimationStart() {
        super.onAnimationStart();
        if (this.f2005a != null) {
            this.f2005a.onAnimationStart(getAnimation());
        }
    }

    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!C0609b.m1473a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f2006b * 2), getMeasuredHeight() + (this.f2006b * 2));
        }
    }

    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
