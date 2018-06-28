package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

class CardViewApi17Impl extends CardViewBaseImpl {

    class C49031 implements RoundRectHelper {
        C49031() {
        }

        public void drawRoundRect(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    CardViewApi17Impl() {
    }

    public void initStatic() {
        RoundRectDrawableWithShadow.sRoundRectHelper = new C49031();
    }
}
