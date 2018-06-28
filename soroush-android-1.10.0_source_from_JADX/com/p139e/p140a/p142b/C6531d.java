package com.p139e.p140a.p142b;

import android.graphics.Color;
import android.graphics.Paint;
import com.p139e.p140a.C1569b;
import com.p139e.p140a.p141a.C1565d;

public final class C6531d extends C5390a {
    private Paint f17809c = C1565d.m4079a().f4864a;
    private float[] f17810d = new float[3];
    private float f17811e = 1.2f;

    public final void mo2985d() {
        int size = this.b.size();
        float f = 2.0f;
        float width = ((float) this.a.f4875g.getWidth()) / 2.0f;
        int i = this.a.f4869a;
        float f2 = this.a.f4872d;
        float f3 = this.a.f4870b;
        float f4 = this.a.f4871c;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            float f5;
            float f6 = (float) i2;
            float f7 = f6 / ((float) (i - 1));
            float f8 = (float) i;
            f7 *= f3;
            f6 = Math.max(1.5f + f2, (i2 == 0 ? 0.0f : ((f6 - (f8 / f)) / f8) * (r0.f17811e * f4)) + f4);
            int min = Math.min(C5390a.m11637a(f7, f6), i * 2);
            int i4 = i3;
            i3 = 0;
            while (i3 < min) {
                int i5 = i;
                double d = (double) min;
                f5 = f4;
                d = ((3.141592653589793d / d) * ((double) ((i2 + 1) % 2))) + ((6.283185307179586d * ((double) i3)) / d);
                double d2 = (double) f7;
                int i6 = i2;
                int i7 = i3;
                float cos = ((float) (d2 * Math.cos(d))) + width;
                f4 = ((float) (d2 * Math.sin(d))) + width;
                r0.f17810d[0] = (float) ((d * 180.0d) / 3.141592653589793d);
                r0.f17810d[1] = f7 / f3;
                r0.f17810d[2] = r0.a.f4874f;
                r0.f17809c.setColor(Color.HSVToColor(r0.f17810d));
                r0.f17809c.setAlpha(m11641c());
                r0.a.f4875g.drawCircle(cos, f4, f6 - f2, r0.f17809c);
                if (i4 >= size) {
                    r0.b.add(new C1569b(cos, f4, r0.f17810d));
                } else {
                    ((C1569b) r0.b.get(i4)).m4085a(cos, f4, r0.f17810d);
                }
                i4++;
                i3 = i7 + 1;
                i = i5;
                f4 = f5;
                i2 = i6;
            }
            f5 = f4;
            i2++;
            i3 = i4;
            i = i;
            f = 2.0f;
        }
    }
}
