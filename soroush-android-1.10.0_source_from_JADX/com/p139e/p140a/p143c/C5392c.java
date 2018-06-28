package com.p139e.p140a.p143c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import com.p139e.p140a.C1575c;
import com.p139e.p140a.p141a.C1565d;

public final class C5392c extends C1573a {
    private int f15004j;
    private Paint f15005k = C1565d.m4079a().f4864a;
    private Paint f15006l = C1565d.m4079a().f4864a;
    private Paint f15007m = C1565d.m4079a().m4074a(-1).m4076a(Mode.CLEAR).f4864a;
    private C1575c f15008n;

    public C5392c(Context context) {
        super(context);
    }

    protected final void mo1497a(float f) {
        if (this.f15008n != null) {
            this.f15008n.setLightness(f);
        }
    }

    protected final void mo1498a(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        float[] fArr = new float[3];
        Color.colorToHSV(this.f15004j, fArr);
        int max = Math.max(2, width / 256);
        int i = 0;
        while (i <= width) {
            float f = (float) i;
            fArr[2] = f / ((float) (width - 1));
            this.f15005k.setColor(Color.HSVToColor(fArr));
            i += max;
            canvas.drawRect(f, 0.0f, (float) i, (float) height, this.f15005k);
        }
    }

    protected final void mo1499a(Canvas canvas, float f, float f2) {
        Paint paint = this.f15006l;
        int i = this.f15004j;
        float f3 = this.i;
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = f3;
        paint.setColor(Color.HSVToColor(fArr));
        canvas.drawCircle(f, f2, (float) this.g, this.f15007m);
        canvas.drawCircle(f, f2, ((float) this.g) * 0.75f, this.f15006l);
    }

    public final void setColor(int i) {
        this.f15004j = i;
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        this.i = fArr[2];
        if (this.c != null) {
            m4090a();
            invalidate();
        }
    }

    public final void setColorPicker(C1575c c1575c) {
        this.f15008n = c1575c;
    }
}
