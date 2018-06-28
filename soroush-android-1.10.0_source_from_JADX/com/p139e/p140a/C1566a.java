package com.p139e.p140a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.ColorDrawable;
import com.p139e.p140a.p141a.C1565d;

public final class C1566a extends ColorDrawable {
    private float f4865a;
    private Paint f4866b = C1565d.m4079a().m4075a(Style.STROKE).m4073a(this.f4865a).m4074a(-1).f4864a;
    private Paint f4867c = C1565d.m4079a().m4075a(Style.FILL).m4074a(0).f4864a;
    private Paint f4868d = C1565d.m4079a().m4077a(C1565d.m4078a(16)).f4864a;

    public C1566a(int i) {
        super(i);
    }

    public final void draw(Canvas canvas) {
        canvas.drawColor(0);
        float width = ((float) canvas.getWidth()) / 2.0f;
        this.f4865a = width / 12.0f;
        this.f4866b.setStrokeWidth(this.f4865a);
        this.f4867c.setColor(getColor());
        canvas.drawCircle(width, width, width - (this.f4865a * 1.5f), this.f4868d);
        canvas.drawCircle(width, width, width - (this.f4865a * 1.5f), this.f4867c);
        canvas.drawCircle(width, width, width - this.f4865a, this.f4866b);
    }

    public final void setColor(int i) {
        super.setColor(i);
        invalidateSelf();
    }
}
