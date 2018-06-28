package fr.castorflex.android.smoothprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.shapes.Shape;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C2324a extends Shape {
    private float f7654a;
    private int[] f7655b;

    public C2324a(float f, int[] iArr) {
        this.f7654a = f;
        this.f7655b = iArr;
    }

    public final void draw(Canvas canvas, Paint paint) {
        int i = 0;
        float length = BallPulseIndicator.SCALE / ((float) this.f7655b.length);
        paint.setStrokeWidth(this.f7654a);
        int[] iArr = this.f7655b;
        int length2 = iArr.length;
        int i2 = 0;
        while (i < length2) {
            paint.setColor(iArr[i]);
            i2++;
            canvas.drawLine((((float) i2) * length) * getWidth(), getHeight() / 2.0f, (((float) i2) * length) * getWidth(), getHeight() / 2.0f, paint);
            i++;
        }
    }
}
