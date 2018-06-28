package com.dd.morphingbutton.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.support.v4.view.C0571r;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.dd.morphingbutton.C1558R;
import com.dd.morphingbutton.MorphingAnimation.Listener;
import com.dd.morphingbutton.MorphingButton;
import com.dd.morphingbutton.MorphingButton.Params;

public class IndeterminateProgressButton extends MorphingButton {
    private int mColor1;
    private int mColor2;
    private int mColor3;
    private int mColor4;
    private boolean mIsRunning;
    private ProgressBar mProgressBar;
    private int mProgressCornerRadius;

    public static class ProgressBar {
        private static final int ANIMATION_DURATION_MS = 2000;
        private static final int COLOR1 = -1291845632;
        private static final int COLOR2 = Integer.MIN_VALUE;
        private static final int COLOR3 = 1291845632;
        private static final int COLOR4 = 436207616;
        private static final int FINISH_ANIMATION_DURATION_MS = 1000;
        private static final Interpolator INTERPOLATOR = new AccelerateDecelerateInterpolator();
        private RectF mBounds = new RectF();
        private final RectF mClipRect = new RectF();
        private int mColor1;
        private int mColor2;
        private int mColor3;
        private int mColor4;
        private int mCornerRadius;
        private long mFinishTime;
        private final Paint mPaint = new Paint();
        private View mParent;
        private boolean mRunning;
        private long mStartTime;
        private float mTriggerPercentage;

        public ProgressBar(View view) {
            this.mParent = view;
            this.mColor1 = COLOR1;
            this.mColor2 = Integer.MIN_VALUE;
            this.mColor3 = COLOR3;
            this.mColor4 = COLOR4;
        }

        private void drawCircle(Canvas canvas, float f, float f2, int i, float f3) {
            this.mPaint.setColor(i);
            canvas.save();
            canvas.translate(f, f2);
            f2 = INTERPOLATOR.getInterpolation(f3);
            canvas.scale(f2, f2);
            canvas.drawCircle(0.0f, 0.0f, f, this.mPaint);
            canvas.restore();
        }

        private void drawTrigger(Canvas canvas, int i, int i2) {
            this.mPaint.setColor(this.mColor1);
            float f = (float) i;
            canvas.drawCircle(f, (float) i2, this.mTriggerPercentage * f, this.mPaint);
        }

        void draw(Canvas canvas) {
            int i;
            int i2;
            Canvas canvas2 = canvas;
            Path path = new Path();
            path.addRoundRect(this.mBounds, (float) this.mCornerRadius, (float) this.mCornerRadius, Direction.CW);
            int height = (int) this.mBounds.height();
            int width = ((int) this.mBounds.width()) / 2;
            int i3 = height / 2;
            int save = canvas.save();
            canvas2.clipPath(path);
            if (!this.mRunning) {
                if (r6.mFinishTime <= 0) {
                    if (r6.mTriggerPercentage > 0.0f && ((double) r6.mTriggerPercentage) <= 1.0d) {
                        drawTrigger(canvas2, width, i3);
                    }
                    canvas2.restoreToCount(save);
                }
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            int i4 = i3;
            int i5 = save;
            long j = (currentAnimationTimeMillis - r6.mStartTime) / 2000;
            float f = ((float) ((currentAnimationTimeMillis - r6.mStartTime) % 2000)) / 20.0f;
            Object obj;
            if (r6.mRunning) {
                obj = null;
            } else if (currentAnimationTimeMillis - r6.mFinishTime >= 1000) {
                r6.mFinishTime = 0;
                return;
            } else {
                float f2 = (float) width;
                float interpolation = INTERPOLATOR.getInterpolation((((float) ((currentAnimationTimeMillis - r6.mFinishTime) % 1000)) / 10.0f) / 100.0f) * f2;
                r6.mClipRect.set(f2 - interpolation, 0.0f, f2 + interpolation, (float) height);
                canvas2.saveLayerAlpha(r6.mClipRect, 0, 0);
                obj = 1;
            }
            if (j != 0) {
                if (f >= 0.0f && f < 25.0f) {
                    i = r6.mColor4;
                    canvas2.drawColor(i);
                    if (f >= 0.0f) {
                    }
                    i2 = i4;
                    drawCircle(canvas2, (float) width, (float) i2, r6.mColor2, (f * 2.0f) / 100.0f);
                    drawCircle(canvas2, (float) width, (float) i2, r6.mColor3, ((f - 25.0f) * 2.0f) / 100.0f);
                    drawCircle(canvas2, (float) width, (float) i2, r6.mColor4, ((f - 50.0f) * 2.0f) / 100.0f);
                    drawCircle(canvas2, (float) width, (float) i2, r6.mColor1, ((f - 75.0f) * 2.0f) / 100.0f);
                    if (r6.mTriggerPercentage > 0.0f) {
                    }
                    i = i5;
                    save = i;
                    C0571r.m1361e(r6.mParent);
                    canvas2.restoreToCount(save);
                } else if (f < 25.0f || f >= 50.0f) {
                    i = (f < 50.0f || f >= 75.0f) ? r6.mColor3 : r6.mColor2;
                    canvas2.drawColor(i);
                    if (f >= 0.0f || f > 25.0f) {
                        i2 = i4;
                    } else {
                        int i6 = i4;
                        i2 = i6;
                        drawCircle(canvas2, (float) width, (float) i6, r6.mColor1, ((f + 25.0f) * 2.0f) / 100.0f);
                    }
                    if (f >= 0.0f && f <= 50.0f) {
                        drawCircle(canvas2, (float) width, (float) i2, r6.mColor2, (f * 2.0f) / 100.0f);
                    }
                    if (f >= 25.0f && f <= 75.0f) {
                        drawCircle(canvas2, (float) width, (float) i2, r6.mColor3, ((f - 25.0f) * 2.0f) / 100.0f);
                    }
                    if (f >= 50.0f && f <= 100.0f) {
                        drawCircle(canvas2, (float) width, (float) i2, r6.mColor4, ((f - 50.0f) * 2.0f) / 100.0f);
                    }
                    if (f >= 75.0f && f <= 100.0f) {
                        drawCircle(canvas2, (float) width, (float) i2, r6.mColor1, ((f - 75.0f) * 2.0f) / 100.0f);
                    }
                    if (r6.mTriggerPercentage > 0.0f || r13 == null) {
                        i = i5;
                    } else {
                        canvas2.restoreToCount(i5);
                        i = canvas.save();
                        canvas2.clipPath(path);
                        drawTrigger(canvas2, width, i2);
                    }
                    save = i;
                    C0571r.m1361e(r6.mParent);
                    canvas2.restoreToCount(save);
                }
            }
            i = r6.mColor1;
            canvas2.drawColor(i);
            if (f >= 0.0f) {
            }
            i2 = i4;
            drawCircle(canvas2, (float) width, (float) i2, r6.mColor2, (f * 2.0f) / 100.0f);
            drawCircle(canvas2, (float) width, (float) i2, r6.mColor3, ((f - 25.0f) * 2.0f) / 100.0f);
            drawCircle(canvas2, (float) width, (float) i2, r6.mColor4, ((f - 50.0f) * 2.0f) / 100.0f);
            drawCircle(canvas2, (float) width, (float) i2, r6.mColor1, ((f - 75.0f) * 2.0f) / 100.0f);
            if (r6.mTriggerPercentage > 0.0f) {
            }
            i = i5;
            save = i;
            C0571r.m1361e(r6.mParent);
            canvas2.restoreToCount(save);
        }

        void setBounds(int i, int i2, int i3, int i4, int i5) {
            this.mBounds.left = (float) i;
            this.mBounds.top = (float) i2;
            this.mBounds.right = (float) i3;
            this.mBounds.bottom = (float) i4;
            this.mCornerRadius = i5;
        }

        void setColorScheme(int i, int i2, int i3, int i4) {
            this.mColor1 = i;
            this.mColor2 = i2;
            this.mColor3 = i3;
            this.mColor4 = i4;
        }

        void start() {
            if (!this.mRunning) {
                this.mTriggerPercentage = 0.0f;
                this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
                this.mRunning = true;
                this.mParent.postInvalidate();
            }
        }
    }

    class C53891 implements Listener {
        C53891() {
        }

        public void onAnimationEnd() {
            IndeterminateProgressButton.this.mIsRunning = true;
            IndeterminateProgressButton.this.invalidate();
        }
    }

    public IndeterminateProgressButton(Context context) {
        super(context);
        init(context);
    }

    public IndeterminateProgressButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public IndeterminateProgressButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    private void init(Context context) {
        Resources resources = context.getResources();
        this.mColor1 = resources.getColor(C1558R.color.mb_gray);
        this.mColor2 = resources.getColor(C1558R.color.mb_blue);
        this.mColor3 = resources.getColor(C1558R.color.mb_gray);
        this.mColor4 = resources.getColor(C1558R.color.mb_blue);
        if (VERSION.SDK_INT <= 18) {
            setLayerType(1, null);
        }
    }

    private void setupProgressBarBounds() {
        this.mProgressBar.setBounds(0, (int) (((double) getMeasuredHeight()) - ((double) getHeight())), getMeasuredWidth(), getMeasuredHeight(), this.mProgressCornerRadius);
    }

    public void morph(Params params) {
        this.mIsRunning = false;
        super.morph(params);
    }

    public void morphToProgress(int i, int i2, int i3, int i4, int i5, int i6) {
        morphToProgress(i, i2, i3, i4, i5, i, i6, i, i6);
    }

    public void morphToProgress(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        morphToProgress(i, i2, i3, i4, i5, i6, i7, i6, i7);
    }

    public void morphToProgress(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.mProgressCornerRadius = i2;
        this.mColor1 = i6;
        this.mColor2 = i7;
        this.mColor3 = i8;
        this.mColor4 = i9;
        morph(Params.create().duration(i5).cornerRadius(this.mProgressCornerRadius).width(i3).height(i4).color(i).colorPressed(i).animationListener(new C53891()));
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mAnimationInProgress && this.mIsRunning) {
            if (this.mProgressBar == null) {
                this.mProgressBar = new ProgressBar(this);
                setupProgressBarBounds();
                this.mProgressBar.setColorScheme(this.mColor1, this.mColor2, this.mColor3, this.mColor4);
                this.mProgressBar.start();
            }
            this.mProgressBar.draw(canvas);
        }
    }
}
