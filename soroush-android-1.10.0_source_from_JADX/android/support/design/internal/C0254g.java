package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.C0249a.C0247j;
import android.support.design.C0249a.C0248k;
import android.support.v4.view.C0564m;
import android.support.v4.view.C0571r;
import android.support.v4.view.C0582z;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;

public class C0254g extends FrameLayout {
    Drawable f928a;
    Rect f929b;
    private Rect f930c;

    class C47301 implements C0564m {
        final /* synthetic */ C0254g f13038a;

        C47301(C0254g c0254g) {
            this.f13038a = c0254g;
        }

        public final C0582z mo139a(View view, C0582z c0582z) {
            if (this.f13038a.f929b == null) {
                this.f13038a.f929b = new Rect();
            }
            this.f13038a.f929b.set(c0582z.m1426a(), c0582z.m1428b(), c0582z.m1429c(), c0582z.m1430d());
            this.f13038a.mo169a(c0582z);
            C0254g c0254g = this.f13038a;
            boolean z = false;
            if (!(VERSION.SDK_INT >= 20 ? ((WindowInsets) c0582z.f1887a).hasSystemWindowInsets() : false) || this.f13038a.f928a == null) {
                z = true;
            }
            c0254g.setWillNotDraw(z);
            C0571r.m1361e(this.f13038a);
            return c0582z.m1432f();
        }
    }

    public C0254g(Context context) {
        this(context, null);
    }

    public C0254g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0254g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f930c = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0248k.ScrimInsetsFrameLayout, i, C0247j.Widget_Design_ScrimInsetsFrameLayout);
        this.f928a = obtainStyledAttributes.getDrawable(C0248k.ScrimInsetsFrameLayout_insetForeground);
        obtainStyledAttributes.recycle();
        setWillNotDraw(true);
        C0571r.m1341a((View) this, new C47301(this));
    }

    public void mo169a(C0582z c0582z) {
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f929b != null && this.f928a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            this.f930c.set(0, 0, width, this.f929b.top);
            this.f928a.setBounds(this.f930c);
            this.f928a.draw(canvas);
            this.f930c.set(0, height - this.f929b.bottom, width, height);
            this.f928a.setBounds(this.f930c);
            this.f928a.draw(canvas);
            this.f930c.set(0, this.f929b.top, this.f929b.left, height - this.f929b.bottom);
            this.f928a.setBounds(this.f930c);
            this.f928a.draw(canvas);
            this.f930c.set(width - this.f929b.right, this.f929b.top, width, height - this.f929b.bottom);
            this.f928a.setBounds(this.f930c);
            this.f928a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f928a != null) {
            this.f928a.setCallback(this);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f928a != null) {
            this.f928a.setCallback(null);
        }
    }
}
