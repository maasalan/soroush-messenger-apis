package mobi.mmdt.ott.view.components.discreteseekbar;

import android.content.Context;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import mobi.mmdt.ott.view.components.discreteseekbar.p404b.C6087b.C3146a;

public final class C3149b {
    final WindowManager f9768a;
    boolean f9769b;
    C6086a f9770c;
    C3146a f9771d;
    int[] f9772e = new int[2];
    Point f9773f = new Point();

    private class C6086a extends FrameLayout implements C3146a {
        C6084a f16273a;
        int f16274b;
        final /* synthetic */ C3149b f16275c;

        public C6086a(C3149b c3149b, Context context, AttributeSet attributeSet, int i, String str, int i2, int i3) {
            this.f16275c = c3149b;
            super(context);
            this.f16273a = new C6084a(context, attributeSet, i, str, i2, i3);
            addView(this.f16273a, new LayoutParams(-2, -2, 51));
        }

        public final void mo2254a() {
            if (this.f16275c.f9771d != null) {
                this.f16275c.f9771d.mo2254a();
            }
            this.f16275c.m7629a();
        }

        public final void mo2255b() {
            if (this.f16275c.f9771d != null) {
                this.f16275c.f9771d.mo2255b();
            }
        }

        protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            i = this.f16274b - (this.f16273a.getMeasuredWidth() / 2);
            this.f16273a.layout(i, 0, this.f16273a.getMeasuredWidth() + i, this.f16273a.getMeasuredHeight());
        }

        protected final void onMeasure(int i, int i2) {
            measureChildren(i, i2);
            setMeasuredDimension(MeasureSpec.getSize(i), this.f16273a.getMeasuredHeight());
        }
    }

    public C3149b(Context context, AttributeSet attributeSet, int i, String str, int i2, int i3) {
        this.f9768a = (WindowManager) context.getSystemService("window");
        this.f9770c = new C6086a(this, context, attributeSet, i, str, i2, i3);
    }

    public final void m7629a() {
        if (this.f9769b) {
            this.f9769b = false;
            this.f9768a.removeViewImmediate(this.f9770c);
        }
    }

    final void m7630a(int i) {
        View view = this.f9770c;
        int i2 = 0;
        i += this.f9772e[0];
        view.f16274b = i;
        view.f16273a.offsetLeftAndRight((i - (view.f16273a.getMeasuredWidth() / 2)) - view.f16273a.getLeft());
        if (VERSION.SDK_INT >= 11) {
            i2 = view.isHardwareAccelerated();
        }
        if (i2 == 0) {
            view.invalidate();
        }
    }
}
