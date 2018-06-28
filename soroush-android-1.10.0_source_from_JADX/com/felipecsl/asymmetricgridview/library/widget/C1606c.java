package com.felipecsl.asymmetricgridview.library.widget;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

public final class C1606c extends Drawable {
    private int f4997a;
    private final Paint f4998b = new Paint();

    public C1606c(ColorDrawable colorDrawable) {
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Config.ARGB_8888);
        colorDrawable.draw(new Canvas(createBitmap));
        this.f4997a = createBitmap.getPixel(0, 0);
        createBitmap.recycle();
    }

    public final void draw(Canvas canvas) {
        if ((this.f4997a >>> 24) != 0) {
            this.f4998b.setColor(this.f4997a);
            canvas.drawRect(getBounds(), this.f4998b);
        }
    }

    public final int getOpacity() {
        return this.f4997a >>> 24;
    }

    public final void setAlpha(int i) {
        if (i != (this.f4997a >>> 24)) {
            this.f4997a = (i << 24) | (this.f4997a & 16777215);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
