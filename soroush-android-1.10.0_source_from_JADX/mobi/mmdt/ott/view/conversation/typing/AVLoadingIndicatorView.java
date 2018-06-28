package mobi.mmdt.ott.view.conversation.typing;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import mobi.mmdt.ott.C2540d.C2534a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class AVLoadingIndicatorView extends View {
    private static final BallPulseIndicator DEFAULT_INDICATOR = new BallPulseIndicator();
    private static final int MIN_DELAY = 100;
    private static final int MIN_SHOW_TIME = 100;
    private static final String TAG = "AVLoadingIndicatorView";
    private final Runnable mDelayedHide = new C40941();
    private final Runnable mDelayedShow = new C40952();
    private boolean mDismissed = false;
    private Indicator mIndicator;
    private int mIndicatorColor;
    int mMaxHeight;
    int mMaxWidth;
    int mMinHeight;
    int mMinWidth;
    private boolean mPostedHide = false;
    private boolean mPostedShow = false;
    private boolean mShouldStartAnimationDrawable;
    private long mStartTime = -1;

    class C40941 implements Runnable {
        C40941() {
        }

        public void run() {
            AVLoadingIndicatorView.this.mPostedHide = false;
            AVLoadingIndicatorView.this.mStartTime = -1;
            AVLoadingIndicatorView.this.setVisibility(8);
        }
    }

    class C40952 implements Runnable {
        C40952() {
        }

        public void run() {
            AVLoadingIndicatorView.this.mPostedShow = false;
            if (!AVLoadingIndicatorView.this.mDismissed) {
                AVLoadingIndicatorView.this.mStartTime = System.currentTimeMillis();
                AVLoadingIndicatorView.this.setVisibility(0);
            }
        }
    }

    public AVLoadingIndicatorView(Context context) {
        super(context);
        init(context, null, 0, 0);
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet, 0, R.style.AVLoadingIndicatorView);
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet, i, R.style.AVLoadingIndicatorView);
    }

    @TargetApi(21)
    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context, attributeSet, i, R.style.AVLoadingIndicatorView);
    }

    private void init(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mMinWidth = 24;
        this.mMaxWidth = 48;
        this.mMinHeight = 24;
        this.mMaxHeight = 48;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2534a.AVLoadingIndicatorView, i, i2);
        this.mMinWidth = obtainStyledAttributes.getDimensionPixelSize(5, this.mMinWidth);
        this.mMaxWidth = obtainStyledAttributes.getDimensionPixelSize(3, this.mMaxWidth);
        this.mMinHeight = obtainStyledAttributes.getDimensionPixelSize(4, this.mMinHeight);
        this.mMaxHeight = obtainStyledAttributes.getDimensionPixelSize(2, this.mMaxHeight);
        String string = obtainStyledAttributes.getString(1);
        this.mIndicatorColor = obtainStyledAttributes.getColor(0, -1);
        setIndicator(string);
        if (this.mIndicator == null) {
            setIndicator(DEFAULT_INDICATOR);
        }
        obtainStyledAttributes.recycle();
    }

    private void removeCallbacks() {
        removeCallbacks(this.mDelayedHide);
        removeCallbacks(this.mDelayedShow);
    }

    private void updateDrawableBounds(int i, int i2) {
        i -= getPaddingRight() + getPaddingLeft();
        i2 -= getPaddingTop() + getPaddingBottom();
        if (this.mIndicator != null) {
            int i3;
            float intrinsicWidth = ((float) this.mIndicator.getIntrinsicWidth()) / ((float) this.mIndicator.getIntrinsicHeight());
            float f = (float) i;
            float f2 = (float) i2;
            float f3 = f / f2;
            int i4 = 0;
            if (intrinsicWidth == f3) {
                i3 = i2;
                i2 = 0;
            } else if (f3 > intrinsicWidth) {
                i3 = (int) (f2 * intrinsicWidth);
                i = (i - i3) / 2;
                i4 = i;
                i = i3 + i;
                i3 = i2;
                i2 = 0;
            } else {
                i3 = (int) (f * (BallPulseIndicator.SCALE / intrinsicWidth));
                i2 = (i2 - i3) / 2;
                i3 += i2;
            }
            this.mIndicator.setBounds(i4, i2, i, i3);
        }
    }

    private void updateDrawableState() {
        int[] drawableState = getDrawableState();
        if (this.mIndicator != null && this.mIndicator.isStateful()) {
            this.mIndicator.setState(drawableState);
        }
    }

    void drawTrack(Canvas canvas) {
        Drawable drawable = this.mIndicator;
        if (drawable != null) {
            int save = canvas.save();
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            drawable.draw(canvas);
            canvas.restoreToCount(save);
            if (this.mShouldStartAnimationDrawable) {
                ((Animatable) drawable).start();
                this.mShouldStartAnimationDrawable = false;
            }
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        if (this.mIndicator != null) {
            this.mIndicator.setHotspot(f, f2);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        updateDrawableState();
    }

    public Indicator getIndicator() {
        return this.mIndicator;
    }

    public void hide() {
        this.mDismissed = true;
        removeCallbacks(this.mDelayedShow);
        long currentTimeMillis = System.currentTimeMillis() - this.mStartTime;
        if (currentTimeMillis < 100) {
            if (this.mStartTime != -1) {
                if (!this.mPostedHide) {
                    postDelayed(this.mDelayedHide, 100 - currentTimeMillis);
                    this.mPostedHide = true;
                }
                return;
            }
        }
        setVisibility(8);
    }

    public void invalidateDrawable(Drawable drawable) {
        if (verifyDrawable(drawable)) {
            Rect bounds = drawable.getBounds();
            int scrollX = getScrollX() + getPaddingLeft();
            int scrollY = getScrollY() + getPaddingTop();
            invalidate(bounds.left + scrollX, bounds.top + scrollY, bounds.right + scrollX, bounds.bottom + scrollY);
            return;
        }
        super.invalidateDrawable(drawable);
    }

    public boolean isHide() {
        return this.mDismissed;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        startAnimation();
        removeCallbacks();
    }

    protected void onDetachedFromWindow() {
        stopAnimation();
        super.onDetachedFromWindow();
        removeCallbacks();
    }

    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawTrack(canvas);
    }

    protected synchronized void onMeasure(int i, int i2) {
        int max;
        int max2;
        Drawable drawable = this.mIndicator;
        if (drawable != null) {
            max = Math.max(this.mMinWidth, Math.min(this.mMaxWidth, drawable.getIntrinsicWidth()));
            max2 = Math.max(this.mMinHeight, Math.min(this.mMaxHeight, drawable.getIntrinsicHeight()));
        } else {
            max2 = 0;
            max = max2;
        }
        updateDrawableState();
        setMeasuredDimension(resolveSizeAndState(max + (getPaddingLeft() + getPaddingRight()), i, 0), resolveSizeAndState(max2 + (getPaddingTop() + getPaddingBottom()), i2, 0));
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        updateDrawableBounds(i, i2);
    }

    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 8) {
            if (i != 4) {
                startAnimation();
                return;
            }
        }
        stopAnimation();
    }

    public void setIndicator(java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = android.text.TextUtils.isEmpty(r3);
        if (r0 == 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = ".";
        r1 = r3.contains(r1);
        if (r1 != 0) goto L_0x0028;
    L_0x0014:
        r1 = r2.getClass();
        r1 = r1.getPackage();
        r1 = r1.getName();
        r0.append(r1);
        r1 = ".indicators.";
        r0.append(r1);
    L_0x0028:
        r0.append(r3);
        r3 = r0.toString();	 Catch:{ ClassNotFoundException -> 0x0047, InstantiationException -> 0x0042, IllegalAccessException -> 0x003d }
        r3 = java.lang.Class.forName(r3);	 Catch:{ ClassNotFoundException -> 0x0047, InstantiationException -> 0x0042, IllegalAccessException -> 0x003d }
        r3 = r3.newInstance();	 Catch:{ ClassNotFoundException -> 0x0047, InstantiationException -> 0x0042, IllegalAccessException -> 0x003d }
        r3 = (mobi.mmdt.ott.view.conversation.typing.Indicator) r3;	 Catch:{ ClassNotFoundException -> 0x0047, InstantiationException -> 0x0042, IllegalAccessException -> 0x003d }
        r2.setIndicator(r3);	 Catch:{ ClassNotFoundException -> 0x0047, InstantiationException -> 0x0042, IllegalAccessException -> 0x003d }
        return;
    L_0x003d:
        r3 = move-exception;
        r3.printStackTrace();
        return;
    L_0x0042:
        r3 = move-exception;
        r3.printStackTrace();
        return;
    L_0x0047:
        r3 = "AVLoadingIndicatorView";
        r0 = "Didn't find your class , check the name again !";
        android.util.Log.e(r3, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.typing.AVLoadingIndicatorView.setIndicator(java.lang.String):void");
    }

    public void setIndicator(Indicator indicator) {
        if (this.mIndicator != indicator) {
            if (this.mIndicator != null) {
                this.mIndicator.setCallback(null);
                unscheduleDrawable(this.mIndicator);
            }
            this.mIndicator = indicator;
            setIndicatorColor(this.mIndicatorColor);
            if (indicator != null) {
                indicator.setCallback(this);
            }
            postInvalidate();
        }
    }

    public void setIndicatorColor(int i) {
        this.mIndicatorColor = i;
        this.mIndicator.setColor(i);
    }

    public void setVisibility(int i) {
        if (getVisibility() != i) {
            super.setVisibility(i);
            if (i != 8) {
                if (i != 4) {
                    startAnimation();
                    return;
                }
            }
            stopAnimation();
        }
    }

    public void show() {
        this.mStartTime = -1;
        this.mDismissed = false;
        removeCallbacks(this.mDelayedHide);
        if (!this.mPostedShow) {
            postDelayed(this.mDelayedShow, 100);
            this.mPostedShow = true;
        }
    }

    public void smoothToHide() {
        startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
        setVisibility(8);
    }

    public void smoothToShow() {
        startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
        setVisibility(0);
    }

    void startAnimation() {
        if (getVisibility() == 0) {
            if (this.mIndicator != null) {
                this.mShouldStartAnimationDrawable = true;
            }
            postInvalidate();
        }
    }

    void stopAnimation() {
        if (this.mIndicator != null) {
            this.mIndicator.stop();
            this.mShouldStartAnimationDrawable = false;
        }
        postInvalidate();
    }

    protected boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.mIndicator) {
            if (!super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
