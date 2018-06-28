package com.p139e.p140a.p142b;

import android.graphics.Color;
import android.graphics.Paint;
import com.p139e.p140a.C1569b;
import com.p139e.p140a.p141a.C1565d;

public final class C6532e extends C5390a {
    private Paint f17812c = C1565d.m4079a().f4864a;
    private float[] f17813d = new float[3];

    public final void mo2985d() {
        int size = this.b.size();
        float width = ((float) this.a.f4875g.getWidth()) / 2.0f;
        int i = this.a.f4869a;
        float f = this.a.f4870b;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            float f2 = (((float) i2) / ((float) (i - 1))) * f;
            float f3 = r0.a.f4871c;
            int a = C5390a.m11637a(f2, f3);
            int i4 = i3;
            i3 = 0;
            while (i3 < a) {
                double d = (double) a;
                int i5 = i2;
                double d2 = ((6.283185307179586d * ((double) i3)) / d) + ((3.141592653589793d / d) * ((double) ((i2 + 1) % 2)));
                double d3 = (double) f2;
                float cos = ((float) (Math.cos(d2) * d3)) + width;
                float sin = ((float) (d3 * Math.sin(d2))) + width;
                r0.f17813d[0] = (float) ((d2 * 180.0d) / 3.141592653589793d);
                r0.f17813d[1] = f2 / f;
                r0.f17813d[2] = r0.a.f4874f;
                r0.f17812c.setColor(Color.HSVToColor(r0.f17813d));
                r0.f17812c.setAlpha(m11641c());
                r0.a.f4875g.drawCircle(cos, sin, f3 - r0.a.f4872d, r0.f17812c);
                if (i4 >= size) {
                    r0.b.add(new C1569b(cos, sin, r0.f17813d));
                } else {
                    ((C1569b) r0.b.get(i4)).m4085a(cos, sin, r0.f17813d);
                }
                i4++;
                i3++;
                i2 = i5;
            }
            i2++;
            i3 = i4;
        }
    }
}
