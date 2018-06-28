package mobi.mmdt.ott.view.conversation.typing;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public abstract class Indicator extends Drawable implements Animatable {
    private static final Rect ZERO_BOUNDS_RECT = new Rect();
    private int alpha = 255;
    protected Rect drawBounds = ZERO_BOUNDS_RECT;
    private ArrayList<ValueAnimator> mAnimators;
    private boolean mHasAnimators;
    private Paint mPaint = new Paint();
    private HashMap<ValueAnimator, AnimatorUpdateListener> mUpdateListeners = new HashMap();

    public Indicator() {
        this.mPaint.setColor(-1);
        this.mPaint.setStyle(Style.FILL);
        this.mPaint.setAntiAlias(true);
    }

    private void ensureAnimators() {
        if (!this.mHasAnimators) {
            this.mAnimators = onCreateAnimators();
            this.mHasAnimators = true;
        }
    }

    private boolean isStarted() {
        Iterator it = this.mAnimators.iterator();
        return it.hasNext() ? ((ValueAnimator) it.next()).isStarted() : false;
    }

    private void startAnimators() {
        for (int i = 0; i < this.mAnimators.size(); i++) {
            ValueAnimator valueAnimator = (ValueAnimator) this.mAnimators.get(i);
            AnimatorUpdateListener animatorUpdateListener = (AnimatorUpdateListener) this.mUpdateListeners.get(valueAnimator);
            if (animatorUpdateListener != null) {
                valueAnimator.addUpdateListener(animatorUpdateListener);
            }
            valueAnimator.start();
        }
    }

    private void stopAnimators() {
        if (this.mAnimators != null) {
            Iterator it = this.mAnimators.iterator();
            while (it.hasNext()) {
                ValueAnimator valueAnimator = (ValueAnimator) it.next();
                if (valueAnimator != null && valueAnimator.isStarted()) {
                    valueAnimator.removeAllUpdateListeners();
                    valueAnimator.end();
                }
            }
        }
    }

    public void addUpdateListener(ValueAnimator valueAnimator, AnimatorUpdateListener animatorUpdateListener) {
        this.mUpdateListeners.put(valueAnimator, animatorUpdateListener);
    }

    public int centerX() {
        return this.drawBounds.centerX();
    }

    public int centerY() {
        return this.drawBounds.centerY();
    }

    public void draw(Canvas canvas) {
        draw(canvas, this.mPaint);
    }

    public abstract void draw(Canvas canvas, Paint paint);

    public float exactCenterX() {
        return this.drawBounds.exactCenterX();
    }

    public float exactCenterY() {
        return this.drawBounds.exactCenterY();
    }

    public int getAlpha() {
        return this.alpha;
    }

    public int getColor() {
        return this.mPaint.getColor();
    }

    public Rect getDrawBounds() {
        return this.drawBounds;
    }

    public int getHeight() {
        return this.drawBounds.height();
    }

    public int getOpacity() {
        return -1;
    }

    public int getWidth() {
        return this.drawBounds.width();
    }

    public boolean isRunning() {
        Iterator it = this.mAnimators.iterator();
        return it.hasNext() ? ((ValueAnimator) it.next()).isRunning() : false;
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setDrawBounds(rect);
    }

    public abstract ArrayList<ValueAnimator> onCreateAnimators();

    public void postInvalidate() {
        invalidateSelf();
    }

    public void setAlpha(int i) {
        this.alpha = i;
    }

    public void setColor(int i) {
        this.mPaint.setColor(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setDrawBounds(int i, int i2, int i3, int i4) {
        this.drawBounds = new Rect(i, i2, i3, i4);
    }

    public void setDrawBounds(Rect rect) {
        setDrawBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void start() {
        ensureAnimators();
        if (this.mAnimators != null && !isStarted()) {
            startAnimators();
            invalidateSelf();
        }
    }

    public void stop() {
        stopAnimators();
    }
}
