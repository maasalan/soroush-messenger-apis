package com.p139e.p140a.p143c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import com.p139e.p140a.C1575c;
import com.p139e.p140a.C1582f;
import com.p139e.p140a.p141a.C1565d;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C5391b extends C1573a {
    public int f14998j;
    private Paint f14999k = C1565d.m4079a().f4864a;
    private Paint f15000l = C1565d.m4079a().f4864a;
    private Paint f15001m = C1565d.m4079a().f4864a;
    private Paint f15002n = C1565d.m4079a().m4074a(-1).m4076a(Mode.CLEAR).f4864a;
    private C1575c f15003o;

    public C5391b(Context context) {
        super(context);
    }

    protected final void mo1497a(float f) {
        if (this.f15003o != null) {
            this.f15003o.setAlphaValue(f);
        }
    }

    protected final void mo1498a(Canvas canvas) {
        int width = canvas.getWidth();
        float height = (float) canvas.getHeight();
        canvas.drawRect(0.0f, 0.0f, (float) width, height, this.f14999k);
        int max = Math.max(2, width / 256);
        int i = 0;
        while (i <= width) {
            float f = (float) i;
            float f2 = f / ((float) (width - 1));
            this.f15000l.setColor(this.f14998j);
            this.f15000l.setAlpha(Math.round(f2 * 255.0f));
            i += max;
            canvas.drawRect(f, 0.0f, (float) i, height, this.f15000l);
        }
    }

    protected final void mo1499a(Canvas canvas, float f, float f2) {
        this.f15001m.setColor(this.f14998j);
        this.f15001m.setAlpha(Math.round(this.i * 255.0f));
        canvas.drawCircle(f, f2, (float) this.g, this.f15002n);
        if (this.i < BallPulseIndicator.SCALE) {
            canvas.drawCircle(f, f2, ((float) this.g) * 0.75f, this.f14999k);
        }
        canvas.drawCircle(f, f2, ((float) this.g) * 0.75f, this.f15001m);
    }

    protected final void mo1500b() {
        super.mo1500b();
        this.f14999k.setShader(C1565d.m4078a(this.h / 2));
    }

    public final void setColor(int i) {
        this.f14998j = i;
        this.i = C1582f.m4101a(i);
        if (this.c != null) {
            m4090a();
            invalidate();
        }
    }

    public final void setColorPicker(C1575c c1575c) {
        this.f15003o = c1575c;
    }
}
