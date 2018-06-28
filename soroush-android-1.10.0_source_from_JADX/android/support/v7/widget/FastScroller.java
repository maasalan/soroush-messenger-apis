package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.view.C0571r;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.OnItemTouchListener;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.view.MotionEvent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import org.jivesoftware.smack.tcp.XMPPTCPConnection.PacketWriter;

class FastScroller extends ItemDecoration implements OnItemTouchListener {
    private static final int ANIMATION_STATE_FADING_IN = 1;
    private static final int ANIMATION_STATE_FADING_OUT = 3;
    private static final int ANIMATION_STATE_IN = 2;
    private static final int ANIMATION_STATE_OUT = 0;
    private static final int DRAG_NONE = 0;
    private static final int DRAG_X = 1;
    private static final int DRAG_Y = 2;
    private static final int[] EMPTY_STATE_SET = new int[0];
    private static final int HIDE_DELAY_AFTER_DRAGGING_MS = 1200;
    private static final int HIDE_DELAY_AFTER_VISIBLE_MS = 1500;
    private static final int HIDE_DURATION_MS = 500;
    private static final int[] PRESSED_STATE_SET = new int[]{16842919};
    private static final int SCROLLBAR_FULL_OPAQUE = 255;
    private static final int SHOW_DURATION_MS = 500;
    private static final int STATE_DRAGGING = 2;
    private static final int STATE_HIDDEN = 0;
    private static final int STATE_VISIBLE = 1;
    private int mAnimationState = 0;
    private int mDragState = 0;
    private final Runnable mHideRunnable = new C07561();
    float mHorizontalDragX;
    private final int[] mHorizontalRange = new int[2];
    int mHorizontalThumbCenterX;
    private final StateListDrawable mHorizontalThumbDrawable;
    private final int mHorizontalThumbHeight;
    int mHorizontalThumbWidth;
    private final Drawable mHorizontalTrackDrawable;
    private final int mHorizontalTrackHeight;
    private final int mMargin;
    private boolean mNeedHorizontalScrollbar = false;
    private boolean mNeedVerticalScrollbar = false;
    private final OnScrollListener mOnScrollListener = new C49052();
    private RecyclerView mRecyclerView;
    private int mRecyclerViewHeight = 0;
    private int mRecyclerViewWidth = 0;
    private final int mScrollbarMinimumRange;
    private final ValueAnimator mShowHideAnimator = ValueAnimator.ofFloat(new float[]{0.0f, BallPulseIndicator.SCALE});
    private int mState = 0;
    float mVerticalDragY;
    private final int[] mVerticalRange = new int[2];
    int mVerticalThumbCenterY;
    private final StateListDrawable mVerticalThumbDrawable;
    int mVerticalThumbHeight;
    private final int mVerticalThumbWidth;
    private final Drawable mVerticalTrackDrawable;
    private final int mVerticalTrackWidth;

    class C07561 implements Runnable {
        C07561() {
        }

        public void run() {
            FastScroller.this.hide(PacketWriter.QUEUE_SIZE);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    private @interface AnimationState {
    }

    private class AnimatorListener extends AnimatorListenerAdapter {
        private boolean mCanceled;

        private AnimatorListener() {
            this.mCanceled = false;
        }

        public void onAnimationCancel(Animator animator) {
            this.mCanceled = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.mCanceled) {
                this.mCanceled = false;
            } else if (((Float) FastScroller.this.mShowHideAnimator.getAnimatedValue()).floatValue() == 0.0f) {
                FastScroller.this.mAnimationState = 0;
                FastScroller.this.setState(0);
            } else {
                FastScroller.this.mAnimationState = 2;
                FastScroller.this.requestRedraw();
            }
        }
    }

    private class AnimatorUpdater implements AnimatorUpdateListener {
        private AnimatorUpdater() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (255.0f * ((Float) valueAnimator.getAnimatedValue()).floatValue());
            FastScroller.this.mVerticalThumbDrawable.setAlpha(floatValue);
            FastScroller.this.mVerticalTrackDrawable.setAlpha(floatValue);
            FastScroller.this.requestRedraw();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    private @interface DragState {
    }

    @Retention(RetentionPolicy.SOURCE)
    private @interface State {
    }

    class C49052 extends OnScrollListener {
        C49052() {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            FastScroller.this.updateScrollPosition(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    FastScroller(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.mVerticalThumbDrawable = stateListDrawable;
        this.mVerticalTrackDrawable = drawable;
        this.mHorizontalThumbDrawable = stateListDrawable2;
        this.mHorizontalTrackDrawable = drawable2;
        this.mVerticalThumbWidth = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.mVerticalTrackWidth = Math.max(i, drawable.getIntrinsicWidth());
        this.mHorizontalThumbHeight = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.mHorizontalTrackHeight = Math.max(i, drawable2.getIntrinsicWidth());
        this.mScrollbarMinimumRange = i2;
        this.mMargin = i3;
        this.mVerticalThumbDrawable.setAlpha(SCROLLBAR_FULL_OPAQUE);
        this.mVerticalTrackDrawable.setAlpha(SCROLLBAR_FULL_OPAQUE);
        this.mShowHideAnimator.addListener(new AnimatorListener());
        this.mShowHideAnimator.addUpdateListener(new AnimatorUpdater());
        attachToRecyclerView(recyclerView);
    }

    private void cancelHide() {
        this.mRecyclerView.removeCallbacks(this.mHideRunnable);
    }

    private void destroyCallbacks() {
        this.mRecyclerView.removeItemDecoration(this);
        this.mRecyclerView.removeOnItemTouchListener(this);
        this.mRecyclerView.removeOnScrollListener(this.mOnScrollListener);
        cancelHide();
    }

    private void drawHorizontalScrollbar(Canvas canvas) {
        int i = this.mRecyclerViewHeight - this.mHorizontalThumbHeight;
        int i2 = this.mHorizontalThumbCenterX - (this.mHorizontalThumbWidth / 2);
        this.mHorizontalThumbDrawable.setBounds(0, 0, this.mHorizontalThumbWidth, this.mHorizontalThumbHeight);
        this.mHorizontalTrackDrawable.setBounds(0, 0, this.mRecyclerViewWidth, this.mHorizontalTrackHeight);
        canvas.translate(0.0f, (float) i);
        this.mHorizontalTrackDrawable.draw(canvas);
        canvas.translate((float) i2, 0.0f);
        this.mHorizontalThumbDrawable.draw(canvas);
        canvas.translate((float) (-i2), (float) (-i));
    }

    private void drawVerticalScrollbar(Canvas canvas) {
        int i = this.mRecyclerViewWidth - this.mVerticalThumbWidth;
        int i2 = this.mVerticalThumbCenterY - (this.mVerticalThumbHeight / 2);
        this.mVerticalThumbDrawable.setBounds(0, 0, this.mVerticalThumbWidth, this.mVerticalThumbHeight);
        this.mVerticalTrackDrawable.setBounds(0, 0, this.mVerticalTrackWidth, this.mRecyclerViewHeight);
        if (isLayoutRTL()) {
            this.mVerticalTrackDrawable.draw(canvas);
            canvas.translate((float) this.mVerticalThumbWidth, (float) i2);
            canvas.scale(-1.0f, BallPulseIndicator.SCALE);
            this.mVerticalThumbDrawable.draw(canvas);
            canvas.scale(BallPulseIndicator.SCALE, BallPulseIndicator.SCALE);
            i = this.mVerticalThumbWidth;
        } else {
            canvas.translate((float) i, 0.0f);
            this.mVerticalTrackDrawable.draw(canvas);
            canvas.translate(0.0f, (float) i2);
            this.mVerticalThumbDrawable.draw(canvas);
        }
        canvas.translate((float) (-i), (float) (-i2));
    }

    private int[] getHorizontalRange() {
        this.mHorizontalRange[0] = this.mMargin;
        this.mHorizontalRange[1] = this.mRecyclerViewWidth - this.mMargin;
        return this.mHorizontalRange;
    }

    private int[] getVerticalRange() {
        this.mVerticalRange[0] = this.mMargin;
        this.mVerticalRange[1] = this.mRecyclerViewHeight - this.mMargin;
        return this.mVerticalRange;
    }

    private void horizontalScrollTo(float f) {
        int[] horizontalRange = getHorizontalRange();
        f = Math.max((float) horizontalRange[0], Math.min((float) horizontalRange[1], f));
        if (Math.abs(((float) this.mHorizontalThumbCenterX) - f) >= 2.0f) {
            int scrollTo = scrollTo(this.mHorizontalDragX, f, horizontalRange, this.mRecyclerView.computeHorizontalScrollRange(), this.mRecyclerView.computeHorizontalScrollOffset(), this.mRecyclerViewWidth);
            if (scrollTo != 0) {
                this.mRecyclerView.scrollBy(scrollTo, 0);
            }
            this.mHorizontalDragX = f;
        }
    }

    private boolean isLayoutRTL() {
        return C0571r.m1369h(this.mRecyclerView) == 1;
    }

    private void requestRedraw() {
        this.mRecyclerView.invalidate();
    }

    private void resetHideDelay(int i) {
        cancelHide();
        this.mRecyclerView.postDelayed(this.mHideRunnable, (long) i);
    }

    private int scrollTo(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        i -= i3;
        int i5 = (int) (((f2 - f) / ((float) i4)) * ((float) i));
        i2 += i5;
        return (i2 >= i || i2 < 0) ? 0 : i5;
    }

    private void setState(int i) {
        int i2;
        if (i == 2 && this.mState != 2) {
            this.mVerticalThumbDrawable.setState(PRESSED_STATE_SET);
            cancelHide();
        }
        if (i == 0) {
            requestRedraw();
        } else {
            show();
        }
        if (this.mState != 2 || i == 2) {
            if (i == 1) {
                i2 = HIDE_DELAY_AFTER_VISIBLE_MS;
            }
            this.mState = i;
        }
        this.mVerticalThumbDrawable.setState(EMPTY_STATE_SET);
        i2 = HIDE_DELAY_AFTER_DRAGGING_MS;
        resetHideDelay(i2);
        this.mState = i;
    }

    private void setupCallbacks() {
        this.mRecyclerView.addItemDecoration(this);
        this.mRecyclerView.addOnItemTouchListener(this);
        this.mRecyclerView.addOnScrollListener(this.mOnScrollListener);
    }

    private void verticalScrollTo(float f) {
        int[] verticalRange = getVerticalRange();
        f = Math.max((float) verticalRange[0], Math.min((float) verticalRange[1], f));
        if (Math.abs(((float) this.mVerticalThumbCenterY) - f) >= 2.0f) {
            int scrollTo = scrollTo(this.mVerticalDragY, f, verticalRange, this.mRecyclerView.computeVerticalScrollRange(), this.mRecyclerView.computeVerticalScrollOffset(), this.mRecyclerViewHeight);
            if (scrollTo != 0) {
                this.mRecyclerView.scrollBy(0, scrollTo);
            }
            this.mVerticalDragY = f;
        }
    }

    public void attachToRecyclerView(RecyclerView recyclerView) {
        if (this.mRecyclerView != recyclerView) {
            if (this.mRecyclerView != null) {
                destroyCallbacks();
            }
            this.mRecyclerView = recyclerView;
            if (this.mRecyclerView != null) {
                setupCallbacks();
            }
        }
    }

    Drawable getHorizontalThumbDrawable() {
        return this.mHorizontalThumbDrawable;
    }

    Drawable getHorizontalTrackDrawable() {
        return this.mHorizontalTrackDrawable;
    }

    Drawable getVerticalThumbDrawable() {
        return this.mVerticalThumbDrawable;
    }

    Drawable getVerticalTrackDrawable() {
        return this.mVerticalTrackDrawable;
    }

    public void hide() {
        hide(0);
    }

    void hide(int i) {
        switch (this.mAnimationState) {
            case 1:
                this.mShowHideAnimator.cancel();
                break;
            case 2:
                break;
            default:
                return;
        }
        this.mAnimationState = 3;
        this.mShowHideAnimator.setFloatValues(new float[]{((Float) this.mShowHideAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.mShowHideAnimator.setDuration((long) i);
        this.mShowHideAnimator.start();
    }

    public boolean isDragging() {
        return this.mState == 2;
    }

    boolean isHidden() {
        return this.mState == 0;
    }

    boolean isPointInsideHorizontalThumb(float f, float f2) {
        return f2 >= ((float) (this.mRecyclerViewHeight - this.mHorizontalThumbHeight)) && f >= ((float) (this.mHorizontalThumbCenterX - (this.mHorizontalThumbWidth / 2))) && f <= ((float) (this.mHorizontalThumbCenterX + (this.mHorizontalThumbWidth / 2)));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean isPointInsideVerticalThumb(float r3, float r4) {
        /*
        r2 = this;
        r0 = r2.isLayoutRTL();
        if (r0 == 0) goto L_0x0010;
    L_0x0006:
        r0 = r2.mVerticalThumbWidth;
        r0 = r0 / 2;
        r0 = (float) r0;
        r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1));
        if (r3 > 0) goto L_0x0034;
    L_0x000f:
        goto L_0x001a;
    L_0x0010:
        r0 = r2.mRecyclerViewWidth;
        r1 = r2.mVerticalThumbWidth;
        r0 = r0 - r1;
        r0 = (float) r0;
        r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1));
        if (r3 < 0) goto L_0x0034;
    L_0x001a:
        r3 = r2.mVerticalThumbCenterY;
        r0 = r2.mVerticalThumbHeight;
        r0 = r0 / 2;
        r3 = r3 - r0;
        r3 = (float) r3;
        r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1));
        if (r3 < 0) goto L_0x0034;
    L_0x0026:
        r3 = r2.mVerticalThumbCenterY;
        r0 = r2.mVerticalThumbHeight;
        r0 = r0 / 2;
        r3 = r3 + r0;
        r3 = (float) r3;
        r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1));
        if (r3 > 0) goto L_0x0034;
    L_0x0032:
        r3 = 1;
        return r3;
    L_0x0034:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.FastScroller.isPointInsideVerticalThumb(float, float):boolean");
    }

    boolean isVisible() {
        return this.mState == 1;
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, android.support.v7.widget.RecyclerView.State state) {
        if (this.mRecyclerViewWidth == this.mRecyclerView.getWidth()) {
            if (this.mRecyclerViewHeight == this.mRecyclerView.getHeight()) {
                if (this.mAnimationState != 0) {
                    if (this.mNeedVerticalScrollbar) {
                        drawVerticalScrollbar(canvas);
                    }
                    if (this.mNeedHorizontalScrollbar) {
                        drawHorizontalScrollbar(canvas);
                    }
                }
                return;
            }
        }
        this.mRecyclerViewWidth = this.mRecyclerView.getWidth();
        this.mRecyclerViewHeight = this.mRecyclerView.getHeight();
        setState(0);
    }

    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.mState == 1) {
            boolean isPointInsideVerticalThumb = isPointInsideVerticalThumb(motionEvent.getX(), motionEvent.getY());
            boolean isPointInsideHorizontalThumb = isPointInsideHorizontalThumb(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!isPointInsideVerticalThumb && !isPointInsideHorizontalThumb) {
                return false;
            }
            if (isPointInsideHorizontalThumb) {
                this.mDragState = 1;
                this.mHorizontalDragX = (float) ((int) motionEvent.getX());
            } else if (isPointInsideVerticalThumb) {
                this.mDragState = 2;
                this.mVerticalDragY = (float) ((int) motionEvent.getY());
            }
            setState(2);
        } else if (this.mState != 2) {
            return false;
        }
        return true;
    }

    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.mState != 0) {
            if (motionEvent.getAction() == 0) {
                boolean isPointInsideVerticalThumb = isPointInsideVerticalThumb(motionEvent.getX(), motionEvent.getY());
                boolean isPointInsideHorizontalThumb = isPointInsideHorizontalThumb(motionEvent.getX(), motionEvent.getY());
                if (isPointInsideVerticalThumb || isPointInsideHorizontalThumb) {
                    if (isPointInsideHorizontalThumb) {
                        this.mDragState = 1;
                        this.mHorizontalDragX = (float) ((int) motionEvent.getX());
                    } else if (isPointInsideVerticalThumb) {
                        this.mDragState = 2;
                        this.mVerticalDragY = (float) ((int) motionEvent.getY());
                    }
                    setState(2);
                }
            } else if (motionEvent.getAction() == 1 && this.mState == 2) {
                this.mVerticalDragY = 0.0f;
                this.mHorizontalDragX = 0.0f;
                setState(1);
                this.mDragState = 0;
            } else {
                if (motionEvent.getAction() == 2 && this.mState == 2) {
                    show();
                    if (this.mDragState == 1) {
                        horizontalScrollTo(motionEvent.getX());
                    }
                    if (this.mDragState == 2) {
                        verticalScrollTo(motionEvent.getY());
                    }
                }
            }
        }
    }

    public void show() {
        int i = this.mAnimationState;
        if (i != 0) {
            if (i == 3) {
                this.mShowHideAnimator.cancel();
            } else {
                return;
            }
        }
        this.mAnimationState = 1;
        this.mShowHideAnimator.setFloatValues(new float[]{((Float) this.mShowHideAnimator.getAnimatedValue()).floatValue(), BallPulseIndicator.SCALE});
        this.mShowHideAnimator.setDuration(500);
        this.mShowHideAnimator.setStartDelay(0);
        this.mShowHideAnimator.start();
    }

    void updateScrollPosition(int i, int i2) {
        int computeVerticalScrollRange = this.mRecyclerView.computeVerticalScrollRange();
        int i3 = this.mRecyclerViewHeight;
        boolean z = computeVerticalScrollRange - i3 > 0 && this.mRecyclerViewHeight >= this.mScrollbarMinimumRange;
        this.mNeedVerticalScrollbar = z;
        int computeHorizontalScrollRange = this.mRecyclerView.computeHorizontalScrollRange();
        int i4 = this.mRecyclerViewWidth;
        boolean z2 = computeHorizontalScrollRange - i4 > 0 && this.mRecyclerViewWidth >= this.mScrollbarMinimumRange;
        this.mNeedHorizontalScrollbar = z2;
        if (this.mNeedVerticalScrollbar || this.mNeedHorizontalScrollbar) {
            if (this.mNeedVerticalScrollbar) {
                float f = (float) i3;
                this.mVerticalThumbCenterY = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.mVerticalThumbHeight = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.mNeedHorizontalScrollbar) {
                float f2 = (float) i4;
                this.mHorizontalThumbCenterX = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.mHorizontalThumbWidth = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            if (this.mState == 0 || this.mState == 1) {
                setState(1);
            }
            return;
        }
        if (this.mState != 0) {
            setState(0);
        }
    }
}
