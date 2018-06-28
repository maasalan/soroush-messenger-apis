package com.p139e.p140a;

import android.graphics.Color;

public final class C1569b {
    float f4876a;
    float f4877b;
    float[] f4878c = new float[3];
    private float[] f4879d;
    private int f4880e;

    public C1569b(float f, float f2, float[] fArr) {
        m4085a(f, f2, fArr);
    }

    public final void m4085a(float f, float f2, float[] fArr) {
        this.f4876a = f;
        this.f4877b = f2;
        this.f4878c[0] = fArr[0];
        this.f4878c[1] = fArr[1];
        this.f4878c[2] = fArr[2];
        this.f4880e = Color.HSVToColor(this.f4878c);
    }

    public final float[] m4086a(float f) {
        if (this.f4879d == null) {
            this.f4879d = (float[]) this.f4878c.clone();
        }
        this.f4879d[0] = this.f4878c[0];
        this.f4879d[1] = this.f4878c[1];
        this.f4879d[2] = f;
        return this.f4879d;
    }
}
