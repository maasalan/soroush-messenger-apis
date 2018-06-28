package mobi.mmdt.ott.view.conversation.typing.indicators;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.conversation.typing.Indicator;

public class BallPulseIndicator extends Indicator {
    public static final float SCALE = 1.0f;
    private float[] scaleFloats = new float[]{SCALE, SCALE, SCALE};

    public void draw(Canvas canvas, Paint paint) {
        float min = (((float) Math.min(getWidth(), getHeight())) - 8.0f) / 6.0f;
        float f = 2.0f * min;
        float width = ((float) (getWidth() / 2)) - (f + 4.0f);
        float height = (float) (getHeight() / 2);
        for (int i = 0; i < 3; i++) {
            canvas.save();
            float f2 = (float) i;
            canvas.translate(((f * f2) + width) + (f2 * 4.0f), height);
            canvas.scale(this.scaleFloats[i], this.scaleFloats[i]);
            canvas.drawCircle(0.0f, 0.0f, min, paint);
            canvas.restore();
        }
    }

    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList();
        int[] iArr = C2535a.m6888a().m6919b().equals("fa") ? new int[]{360, 240, 120} : new int[]{120, 240, 360};
        for (int i = 0; i < 3; i++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{SCALE, 0.3f, SCALE});
            ofFloat.setDuration(750);
            ofFloat.setRepeatCount(-1);
            ofFloat.setStartDelay((long) iArr[i]);
            addUpdateListener(ofFloat, new AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallPulseIndicator.this.scaleFloats[i] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    BallPulseIndicator.this.postInvalidate();
                }
            });
            arrayList.add(ofFloat);
        }
        return arrayList;
    }
}
