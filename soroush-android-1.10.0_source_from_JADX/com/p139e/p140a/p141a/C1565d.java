package com.p139e.p140a.p141a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;

public final class C1565d {

    public static class C1564a {
        public Paint f4864a;

        private C1564a() {
            this.f4864a = new Paint(1);
        }

        public final C1564a m4073a(float f) {
            this.f4864a.setStrokeWidth(f);
            return this;
        }

        public final C1564a m4074a(int i) {
            this.f4864a.setColor(i);
            return this;
        }

        public final C1564a m4075a(Style style) {
            this.f4864a.setStyle(style);
            return this;
        }

        public final C1564a m4076a(Mode mode) {
            this.f4864a.setXfermode(new PorterDuffXfermode(mode));
            return this;
        }

        public final C1564a m4077a(Shader shader) {
            this.f4864a.setShader(shader);
            return this;
        }
    }

    public static Shader m4078a(int i) {
        return new BitmapShader(C1565d.m4080b(Math.max(8, (i / 2) * 2)), TileMode.REPEAT, TileMode.REPEAT);
    }

    public static C1564a m4079a() {
        return new C1564a();
    }

    private static Bitmap m4080b(int i) {
        Paint paint = C1565d.m4079a().f4864a;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        i = Math.round(((float) i) / 2.0f);
        for (int i2 = 0; i2 < 2; i2++) {
            int i3 = 0;
            while (i3 < 2) {
                paint.setColor((i2 + i3) % 2 == 0 ? -1 : -3092272);
                int i4 = i3 + 1;
                canvas.drawRect((float) (i2 * i), (float) (i3 * i), (float) ((i2 + 1) * i), (float) (i4 * i), paint);
                i3 = i4;
            }
        }
        return createBitmap;
    }
}
