package android.support.v7.widget.helper;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.C0554c;
import android.support.v4.view.C0571r;
import android.support.v7.p047e.C0699a.C0696a;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ChildDrawingOrderCallback;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener;
import android.support.v7.widget.RecyclerView.OnItemTouchListener;
import android.support.v7.widget.RecyclerView.State;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Log;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class ItemTouchHelper extends ItemDecoration implements OnChildAttachStateChangeListener {
    static final int ACTION_MODE_DRAG_MASK = 16711680;
    private static final int ACTION_MODE_IDLE_MASK = 255;
    static final int ACTION_MODE_SWIPE_MASK = 65280;
    public static final int ACTION_STATE_DRAG = 2;
    public static final int ACTION_STATE_IDLE = 0;
    public static final int ACTION_STATE_SWIPE = 1;
    static final int ACTIVE_POINTER_ID_NONE = -1;
    public static final int ANIMATION_TYPE_DRAG = 8;
    public static final int ANIMATION_TYPE_SWIPE_CANCEL = 4;
    public static final int ANIMATION_TYPE_SWIPE_SUCCESS = 2;
    static final boolean DEBUG = false;
    static final int DIRECTION_FLAG_COUNT = 8;
    public static final int DOWN = 2;
    public static final int END = 32;
    public static final int LEFT = 4;
    private static final int PIXELS_PER_SECOND = 1000;
    public static final int RIGHT = 8;
    public static final int START = 16;
    static final String TAG = "ItemTouchHelper";
    public static final int UP = 1;
    int mActionState = 0;
    int mActivePointerId = -1;
    Callback mCallback;
    private ChildDrawingOrderCallback mChildDrawingOrderCallback = null;
    private List<Integer> mDistances;
    private long mDragScrollStartTimeInMs;
    float mDx;
    float mDy;
    C0554c mGestureDetector;
    float mInitialTouchX;
    float mInitialTouchY;
    float mMaxSwipeVelocity;
    private final OnItemTouchListener mOnItemTouchListener = new C49182();
    View mOverdrawChild = null;
    int mOverdrawChildPosition = -1;
    final List<View> mPendingCleanup = new ArrayList();
    List<RecoverAnimation> mRecoverAnimations = new ArrayList();
    RecyclerView mRecyclerView;
    final Runnable mScrollRunnable = new C07891();
    ViewHolder mSelected = null;
    int mSelectedFlags;
    float mSelectedStartX;
    float mSelectedStartY;
    private int mSlop;
    private List<ViewHolder> mSwapTargets;
    float mSwipeEscapeVelocity;
    private final float[] mTmpPosition = new float[2];
    private Rect mTmpRect;
    VelocityTracker mVelocityTracker;

    class C07891 implements Runnable {
        C07891() {
        }

        public void run() {
            if (ItemTouchHelper.this.mSelected != null && ItemTouchHelper.this.scrollIfNecessary()) {
                if (ItemTouchHelper.this.mSelected != null) {
                    ItemTouchHelper.this.moveIfNecessary(ItemTouchHelper.this.mSelected);
                }
                ItemTouchHelper.this.mRecyclerView.removeCallbacks(ItemTouchHelper.this.mScrollRunnable);
                C0571r.m1343a(ItemTouchHelper.this.mRecyclerView, (Runnable) this);
            }
        }
    }

    public static abstract class Callback {
        private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
        static final int RELATIVE_DIR_FLAGS = 3158064;
        private static final Interpolator sDragScrollInterpolator = new C07911();
        private static final Interpolator sDragViewScrollCapInterpolator = new C07922();
        private static final ItemTouchUIUtil sUICallback = (VERSION.SDK_INT >= 21 ? new Api21Impl() : new BaseImpl());
        private int mCachedMaxScrollSpeed = -1;

        static class C07911 implements Interpolator {
            C07911() {
            }

            public final float getInterpolation(float f) {
                return (((f * f) * f) * f) * f;
            }
        }

        static class C07922 implements Interpolator {
            C07922() {
            }

            public final float getInterpolation(float f) {
                f -= BallPulseIndicator.SCALE;
                return ((((f * f) * f) * f) * f) + BallPulseIndicator.SCALE;
            }
        }

        public static int convertToRelativeDirection(int i, int i2) {
            int i3 = i & ABS_HORIZONTAL_DIR_FLAGS;
            if (i3 == 0) {
                return i;
            }
            i &= i3 ^ -1;
            if (i2 == 0) {
                i2 = i3 << 2;
            } else {
                i2 = i3 << 1;
                i |= -789517 & i2;
                i2 = (i2 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
            }
            return i | i2;
        }

        public static ItemTouchUIUtil getDefaultUIUtil() {
            return sUICallback;
        }

        private int getMaxDragScroll(RecyclerView recyclerView) {
            if (this.mCachedMaxScrollSpeed == -1) {
                this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(C0696a.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.mCachedMaxScrollSpeed;
        }

        public static int makeFlag(int i, int i2) {
            return i2 << (i * 8);
        }

        public static int makeMovementFlags(int i, int i2) {
            return makeFlag(2, i) | (makeFlag(1, i2) | makeFlag(0, i2 | i));
        }

        public boolean canDropOver(RecyclerView recyclerView, ViewHolder viewHolder, ViewHolder viewHolder2) {
            return true;
        }

        public ViewHolder chooseDropTarget(ViewHolder viewHolder, List<ViewHolder> list, int i, int i2) {
            ViewHolder viewHolder2 = viewHolder;
            int width = i + viewHolder2.itemView.getWidth();
            int height = i2 + viewHolder2.itemView.getHeight();
            int left = i - viewHolder2.itemView.getLeft();
            int top = i2 - viewHolder2.itemView.getTop();
            int size = list.size();
            ViewHolder viewHolder3 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                int right;
                ViewHolder viewHolder4 = (ViewHolder) list.get(i4);
                if (left > 0) {
                    right = viewHolder4.itemView.getRight() - width;
                    if (right < 0 && viewHolder4.itemView.getRight() > viewHolder2.itemView.getRight()) {
                        right = Math.abs(right);
                        if (right > i3) {
                            viewHolder3 = viewHolder4;
                            i3 = right;
                        }
                    }
                }
                if (left < 0) {
                    right = viewHolder4.itemView.getLeft() - i;
                    if (right > 0 && viewHolder4.itemView.getLeft() < viewHolder2.itemView.getLeft()) {
                        right = Math.abs(right);
                        if (right > i3) {
                            viewHolder3 = viewHolder4;
                            i3 = right;
                        }
                    }
                }
                if (top < 0) {
                    right = viewHolder4.itemView.getTop() - i2;
                    if (right > 0 && viewHolder4.itemView.getTop() < viewHolder2.itemView.getTop()) {
                        right = Math.abs(right);
                        if (right > i3) {
                            viewHolder3 = viewHolder4;
                            i3 = right;
                        }
                    }
                }
                if (top > 0) {
                    right = viewHolder4.itemView.getBottom() - height;
                    if (right < 0 && viewHolder4.itemView.getBottom() > viewHolder2.itemView.getBottom()) {
                        right = Math.abs(right);
                        if (right > i3) {
                            viewHolder3 = viewHolder4;
                            i3 = right;
                        }
                    }
                }
            }
            return viewHolder3;
        }

        public void clearView(RecyclerView recyclerView, ViewHolder viewHolder) {
            sUICallback.clearView(viewHolder.itemView);
        }

        public int convertToAbsoluteDirection(int i, int i2) {
            int i3 = i & RELATIVE_DIR_FLAGS;
            if (i3 == 0) {
                return i;
            }
            i &= i3 ^ -1;
            if (i2 == 0) {
                i2 = i3 >> 2;
            } else {
                i2 = i3 >> 1;
                i |= -3158065 & i2;
                i2 = (i2 & RELATIVE_DIR_FLAGS) >> 2;
            }
            return i | i2;
        }

        final int getAbsoluteMovementFlags(RecyclerView recyclerView, ViewHolder viewHolder) {
            return convertToAbsoluteDirection(getMovementFlags(recyclerView, viewHolder), C0571r.m1369h(recyclerView));
        }

        public long getAnimationDuration(RecyclerView recyclerView, int i, float f, float f2) {
            ItemAnimator itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? i == 8 ? 200 : 250 : i == 8 ? itemAnimator.getMoveDuration() : itemAnimator.getRemoveDuration();
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(ViewHolder viewHolder) {
            return 0.5f;
        }

        public abstract int getMovementFlags(RecyclerView recyclerView, ViewHolder viewHolder);

        public float getSwipeEscapeVelocity(float f) {
            return f;
        }

        public float getSwipeThreshold(ViewHolder viewHolder) {
            return 0.5f;
        }

        public float getSwipeVelocityThreshold(float f) {
            return f;
        }

        boolean hasDragFlag(RecyclerView recyclerView, ViewHolder viewHolder) {
            return (getAbsoluteMovementFlags(recyclerView, viewHolder) & ItemTouchHelper.ACTION_MODE_DRAG_MASK) != 0;
        }

        boolean hasSwipeFlag(RecyclerView recyclerView, ViewHolder viewHolder) {
            return (getAbsoluteMovementFlags(recyclerView, viewHolder) & ItemTouchHelper.ACTION_MODE_SWIPE_MASK) != 0;
        }

        public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            int maxDragScroll = getMaxDragScroll(recyclerView);
            int signum = (int) Math.signum((float) i2);
            float abs = (float) Math.abs(i2);
            float f = BallPulseIndicator.SCALE;
            maxDragScroll = (int) (((float) (signum * maxDragScroll)) * sDragViewScrollCapInterpolator.getInterpolation(Math.min(BallPulseIndicator.SCALE, (abs * BallPulseIndicator.SCALE) / ((float) i))));
            if (j <= DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS) {
                f = ((float) j) / 2000.0f;
            }
            maxDragScroll = (int) (((float) maxDragScroll) * sDragScrollInterpolator.getInterpolation(f));
            if (maxDragScroll == 0) {
                if (i2 > 0) {
                    return 1;
                }
                maxDragScroll = -1;
            }
            return maxDragScroll;
        }

        public boolean isItemViewSwipeEnabled() {
            return true;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            sUICallback.onDraw(canvas, recyclerView, viewHolder.itemView, f, f2, i, z);
        }

        public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            sUICallback.onDrawOver(canvas, recyclerView, viewHolder.itemView, f, f2, i, z);
        }

        void onDraw(Canvas canvas, RecyclerView recyclerView, ViewHolder viewHolder, List<RecoverAnimation> list, int i, float f, float f2) {
            Canvas canvas2 = canvas;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                RecoverAnimation recoverAnimation = (RecoverAnimation) list.get(i2);
                recoverAnimation.update();
                int save = canvas2.save();
                onChildDraw(canvas2, recyclerView, recoverAnimation.mViewHolder, recoverAnimation.mX, recoverAnimation.mY, recoverAnimation.mActionState, false);
                canvas2.restoreToCount(save);
            }
            if (viewHolder != null) {
                size = canvas2.save();
                onChildDraw(canvas2, recyclerView, viewHolder, f, f2, i, true);
                canvas2.restoreToCount(size);
            }
        }

        void onDrawOver(Canvas canvas, RecyclerView recyclerView, ViewHolder viewHolder, List<RecoverAnimation> list, int i, float f, float f2) {
            int i2;
            Canvas canvas2 = canvas;
            List<RecoverAnimation> list2 = list;
            int size = list.size();
            int i3 = 0;
            for (i2 = 0; i2 < size; i2++) {
                RecoverAnimation recoverAnimation = (RecoverAnimation) list2.get(i2);
                int save = canvas2.save();
                onChildDrawOver(canvas2, recyclerView, recoverAnimation.mViewHolder, recoverAnimation.mX, recoverAnimation.mY, recoverAnimation.mActionState, false);
                canvas2.restoreToCount(save);
            }
            if (viewHolder != null) {
                i2 = canvas2.save();
                onChildDrawOver(canvas2, recyclerView, viewHolder, f, f2, i, true);
                canvas2.restoreToCount(i2);
            }
            for (size--; size >= 0; size--) {
                RecoverAnimation recoverAnimation2 = (RecoverAnimation) list2.get(size);
                if (recoverAnimation2.mEnded && !recoverAnimation2.mIsPendingCleanup) {
                    list2.remove(size);
                } else if (!recoverAnimation2.mEnded) {
                    i3 = 1;
                }
            }
            if (i3 != 0) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean onMove(RecyclerView recyclerView, ViewHolder viewHolder, ViewHolder viewHolder2);

        public void onMoved(RecyclerView recyclerView, ViewHolder viewHolder, int i, ViewHolder viewHolder2, int i2, int i3, int i4) {
            LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof ViewDropHandler) {
                ((ViewDropHandler) layoutManager).prepareForDrop(viewHolder.itemView, viewHolder2.itemView, i3, i4);
                return;
            }
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(viewHolder2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.getDecoratedRight(viewHolder2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(viewHolder2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.getDecoratedBottom(viewHolder2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
        }

        public void onSelectedChanged(ViewHolder viewHolder, int i) {
            if (viewHolder != null) {
                sUICallback.onSelected(viewHolder.itemView);
            }
        }

        public abstract void onSwiped(ViewHolder viewHolder, int i);
    }

    private class ItemTouchHelperGestureListener extends SimpleOnGestureListener {
        ItemTouchHelperGestureListener() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            View findChildView = ItemTouchHelper.this.findChildView(motionEvent);
            if (findChildView != null) {
                ViewHolder childViewHolder = ItemTouchHelper.this.mRecyclerView.getChildViewHolder(findChildView);
                if (childViewHolder != null && ItemTouchHelper.this.mCallback.hasDragFlag(ItemTouchHelper.this.mRecyclerView, childViewHolder) && motionEvent.getPointerId(0) == ItemTouchHelper.this.mActivePointerId) {
                    int findPointerIndex = motionEvent.findPointerIndex(ItemTouchHelper.this.mActivePointerId);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    ItemTouchHelper.this.mInitialTouchX = x;
                    ItemTouchHelper.this.mInitialTouchY = y;
                    ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                    ItemTouchHelper.this.mDy = 0.0f;
                    itemTouchHelper.mDx = 0.0f;
                    if (ItemTouchHelper.this.mCallback.isLongPressDragEnabled()) {
                        ItemTouchHelper.this.select(childViewHolder, 2);
                    }
                }
            }
        }
    }

    private static class RecoverAnimation implements AnimatorListener {
        final int mActionState;
        final int mAnimationType;
        boolean mEnded = false;
        private float mFraction;
        public boolean mIsPendingCleanup;
        boolean mOverridden = false;
        final float mStartDx;
        final float mStartDy;
        final float mTargetX;
        final float mTargetY;
        private final ValueAnimator mValueAnimator;
        final ViewHolder mViewHolder;
        float mX;
        float mY;

        class C07931 implements AnimatorUpdateListener {
            C07931() {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RecoverAnimation.this.setFraction(valueAnimator.getAnimatedFraction());
            }
        }

        RecoverAnimation(ViewHolder viewHolder, int i, int i2, float f, float f2, float f3, float f4) {
            this.mActionState = i2;
            this.mAnimationType = i;
            this.mViewHolder = viewHolder;
            this.mStartDx = f;
            this.mStartDy = f2;
            this.mTargetX = f3;
            this.mTargetY = f4;
            this.mValueAnimator = ValueAnimator.ofFloat(new float[]{0.0f, BallPulseIndicator.SCALE});
            this.mValueAnimator.addUpdateListener(new C07931());
            this.mValueAnimator.setTarget(viewHolder.itemView);
            this.mValueAnimator.addListener(this);
            setFraction(0.0f);
        }

        public void cancel() {
            this.mValueAnimator.cancel();
        }

        public void onAnimationCancel(Animator animator) {
            setFraction(BallPulseIndicator.SCALE);
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.mEnded) {
                this.mViewHolder.setIsRecyclable(true);
            }
            this.mEnded = true;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        public void setDuration(long j) {
            this.mValueAnimator.setDuration(j);
        }

        public void setFraction(float f) {
            this.mFraction = f;
        }

        public void start() {
            this.mViewHolder.setIsRecyclable(false);
            this.mValueAnimator.start();
        }

        public void update() {
            this.mX = this.mStartDx == this.mTargetX ? this.mViewHolder.itemView.getTranslationX() : this.mStartDx + (this.mFraction * (this.mTargetX - this.mStartDx));
            this.mY = this.mStartDy == this.mTargetY ? this.mViewHolder.itemView.getTranslationY() : this.mStartDy + (this.mFraction * (this.mTargetY - this.mStartDy));
        }
    }

    public interface ViewDropHandler {
        void prepareForDrop(View view, View view2, int i, int i2);
    }

    class C49182 implements OnItemTouchListener {
        C49182() {
        }

        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            ItemTouchHelper.this.mGestureDetector.m1223a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                ItemTouchHelper.this.mActivePointerId = motionEvent.getPointerId(0);
                ItemTouchHelper.this.mInitialTouchX = motionEvent.getX();
                ItemTouchHelper.this.mInitialTouchY = motionEvent.getY();
                ItemTouchHelper.this.obtainVelocityTracker();
                if (ItemTouchHelper.this.mSelected == null) {
                    RecoverAnimation findAnimation = ItemTouchHelper.this.findAnimation(motionEvent);
                    if (findAnimation != null) {
                        ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                        itemTouchHelper.mInitialTouchX -= findAnimation.mX;
                        itemTouchHelper = ItemTouchHelper.this;
                        itemTouchHelper.mInitialTouchY -= findAnimation.mY;
                        ItemTouchHelper.this.endRecoverAnimation(findAnimation.mViewHolder, true);
                        if (ItemTouchHelper.this.mPendingCleanup.remove(findAnimation.mViewHolder.itemView)) {
                            ItemTouchHelper.this.mCallback.clearView(ItemTouchHelper.this.mRecyclerView, findAnimation.mViewHolder);
                        }
                        ItemTouchHelper.this.select(findAnimation.mViewHolder, findAnimation.mActionState);
                        ItemTouchHelper.this.updateDxDy(motionEvent, ItemTouchHelper.this.mSelectedFlags, 0);
                    }
                }
            } else {
                if (actionMasked != 3) {
                    if (actionMasked != 1) {
                        if (ItemTouchHelper.this.mActivePointerId != -1) {
                            int findPointerIndex = motionEvent.findPointerIndex(ItemTouchHelper.this.mActivePointerId);
                            if (findPointerIndex >= 0) {
                                ItemTouchHelper.this.checkSelectForSwipe(actionMasked, motionEvent, findPointerIndex);
                            }
                        }
                    }
                }
                ItemTouchHelper.this.mActivePointerId = -1;
                ItemTouchHelper.this.select(null, 0);
            }
            if (ItemTouchHelper.this.mVelocityTracker != null) {
                ItemTouchHelper.this.mVelocityTracker.addMovement(motionEvent);
            }
            return ItemTouchHelper.this.mSelected != null;
        }

        public void onRequestDisallowInterceptTouchEvent(boolean z) {
            if (z) {
                ItemTouchHelper.this.select(null, 0);
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onTouchEvent(android.support.v7.widget.RecyclerView r6, android.view.MotionEvent r7) {
            /*
            r5 = this;
            r6 = android.support.v7.widget.helper.ItemTouchHelper.this;
            r6 = r6.mGestureDetector;
            r6.m1223a(r7);
            r6 = android.support.v7.widget.helper.ItemTouchHelper.this;
            r6 = r6.mVelocityTracker;
            if (r6 == 0) goto L_0x0014;
        L_0x000d:
            r6 = android.support.v7.widget.helper.ItemTouchHelper.this;
            r6 = r6.mVelocityTracker;
            r6.addMovement(r7);
        L_0x0014:
            r6 = android.support.v7.widget.helper.ItemTouchHelper.this;
            r6 = r6.mActivePointerId;
            r0 = -1;
            if (r6 != r0) goto L_0x001c;
        L_0x001b:
            return;
        L_0x001c:
            r6 = r7.getActionMasked();
            r1 = android.support.v7.widget.helper.ItemTouchHelper.this;
            r1 = r1.mActivePointerId;
            r1 = r7.findPointerIndex(r1);
            if (r1 < 0) goto L_0x002f;
        L_0x002a:
            r2 = android.support.v7.widget.helper.ItemTouchHelper.this;
            r2.checkSelectForSwipe(r6, r7, r1);
        L_0x002f:
            r2 = android.support.v7.widget.helper.ItemTouchHelper.this;
            r2 = r2.mSelected;
            if (r2 != 0) goto L_0x0036;
        L_0x0035:
            return;
        L_0x0036:
            r3 = 6;
            r4 = 0;
            if (r6 == r3) goto L_0x0081;
        L_0x003a:
            switch(r6) {
                case 1: goto L_0x0076;
                case 2: goto L_0x004c;
                case 3: goto L_0x003e;
                default: goto L_0x003d;
            };
        L_0x003d:
            return;
        L_0x003e:
            r6 = android.support.v7.widget.helper.ItemTouchHelper.this;
            r6 = r6.mVelocityTracker;
            if (r6 == 0) goto L_0x0076;
        L_0x0044:
            r6 = android.support.v7.widget.helper.ItemTouchHelper.this;
            r6 = r6.mVelocityTracker;
            r6.clear();
            goto L_0x0076;
        L_0x004c:
            if (r1 < 0) goto L_0x00a3;
        L_0x004e:
            r6 = android.support.v7.widget.helper.ItemTouchHelper.this;
            r0 = android.support.v7.widget.helper.ItemTouchHelper.this;
            r0 = r0.mSelectedFlags;
            r6.updateDxDy(r7, r0, r1);
            r6 = android.support.v7.widget.helper.ItemTouchHelper.this;
            r6.moveIfNecessary(r2);
            r6 = android.support.v7.widget.helper.ItemTouchHelper.this;
            r6 = r6.mRecyclerView;
            r7 = android.support.v7.widget.helper.ItemTouchHelper.this;
            r7 = r7.mScrollRunnable;
            r6.removeCallbacks(r7);
            r6 = android.support.v7.widget.helper.ItemTouchHelper.this;
            r6 = r6.mScrollRunnable;
            r6.run();
            r6 = android.support.v7.widget.helper.ItemTouchHelper.this;
            r6 = r6.mRecyclerView;
            r6.invalidate();
            return;
        L_0x0076:
            r6 = android.support.v7.widget.helper.ItemTouchHelper.this;
            r7 = 0;
            r6.select(r7, r4);
            r6 = android.support.v7.widget.helper.ItemTouchHelper.this;
            r6.mActivePointerId = r0;
            return;
        L_0x0081:
            r6 = r7.getActionIndex();
            r0 = r7.getPointerId(r6);
            r1 = android.support.v7.widget.helper.ItemTouchHelper.this;
            r1 = r1.mActivePointerId;
            if (r0 != r1) goto L_0x00a3;
        L_0x008f:
            if (r6 != 0) goto L_0x0092;
        L_0x0091:
            r4 = 1;
        L_0x0092:
            r0 = android.support.v7.widget.helper.ItemTouchHelper.this;
            r1 = r7.getPointerId(r4);
            r0.mActivePointerId = r1;
            r0 = android.support.v7.widget.helper.ItemTouchHelper.this;
            r1 = android.support.v7.widget.helper.ItemTouchHelper.this;
            r1 = r1.mSelectedFlags;
            r0.updateDxDy(r7, r1, r6);
        L_0x00a3:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.helper.ItemTouchHelper.2.onTouchEvent(android.support.v7.widget.RecyclerView, android.view.MotionEvent):void");
        }
    }

    class C49205 implements ChildDrawingOrderCallback {
        C49205() {
        }

        public int onGetChildDrawingOrder(int i, int i2) {
            if (ItemTouchHelper.this.mOverdrawChild == null) {
                return i2;
            }
            int i3 = ItemTouchHelper.this.mOverdrawChildPosition;
            if (i3 == -1) {
                i3 = ItemTouchHelper.this.mRecyclerView.indexOfChild(ItemTouchHelper.this.mOverdrawChild);
                ItemTouchHelper.this.mOverdrawChildPosition = i3;
            }
            return i2 == i + -1 ? i3 : i2 < i3 ? i2 : i2 + 1;
        }
    }

    public static abstract class SimpleCallback extends Callback {
        private int mDefaultDragDirs;
        private int mDefaultSwipeDirs;

        public SimpleCallback(int i, int i2) {
            this.mDefaultSwipeDirs = i2;
            this.mDefaultDragDirs = i;
        }

        public int getDragDirs(RecyclerView recyclerView, ViewHolder viewHolder) {
            return this.mDefaultDragDirs;
        }

        public int getMovementFlags(RecyclerView recyclerView, ViewHolder viewHolder) {
            return Callback.makeMovementFlags(getDragDirs(recyclerView, viewHolder), getSwipeDirs(recyclerView, viewHolder));
        }

        public int getSwipeDirs(RecyclerView recyclerView, ViewHolder viewHolder) {
            return this.mDefaultSwipeDirs;
        }

        public void setDefaultDragDirs(int i) {
            this.mDefaultDragDirs = i;
        }

        public void setDefaultSwipeDirs(int i) {
            this.mDefaultSwipeDirs = i;
        }
    }

    public ItemTouchHelper(Callback callback) {
        this.mCallback = callback;
    }

    private void addChildDrawingOrderCallback() {
        if (VERSION.SDK_INT < 21) {
            if (this.mChildDrawingOrderCallback == null) {
                this.mChildDrawingOrderCallback = new C49205();
            }
            this.mRecyclerView.setChildDrawingOrderCallback(this.mChildDrawingOrderCallback);
        }
    }

    private int checkHorizontalSwipe(ViewHolder viewHolder, int i) {
        if ((i & 12) != 0) {
            float abs;
            int i2 = 4;
            int i3 = this.mDx > 0.0f ? 8 : 4;
            if (this.mVelocityTracker != null && this.mActivePointerId >= 0) {
                this.mVelocityTracker.computeCurrentVelocity(1000, this.mCallback.getSwipeVelocityThreshold(this.mMaxSwipeVelocity));
                float xVelocity = this.mVelocityTracker.getXVelocity(this.mActivePointerId);
                float yVelocity = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
                if (xVelocity > 0.0f) {
                    i2 = 8;
                }
                abs = Math.abs(xVelocity);
                if ((i2 & i) != 0 && i3 == i2 && abs >= this.mCallback.getSwipeEscapeVelocity(this.mSwipeEscapeVelocity) && abs > Math.abs(yVelocity)) {
                    return i2;
                }
            }
            abs = ((float) this.mRecyclerView.getWidth()) * this.mCallback.getSwipeThreshold(viewHolder);
            if ((i & i3) != 0 && Math.abs(this.mDx) > abs) {
                return i3;
            }
        }
        return 0;
    }

    private int checkVerticalSwipe(ViewHolder viewHolder, int i) {
        if ((i & 3) != 0) {
            float abs;
            int i2 = 1;
            int i3 = this.mDy > 0.0f ? 2 : 1;
            if (this.mVelocityTracker != null && this.mActivePointerId >= 0) {
                this.mVelocityTracker.computeCurrentVelocity(1000, this.mCallback.getSwipeVelocityThreshold(this.mMaxSwipeVelocity));
                float xVelocity = this.mVelocityTracker.getXVelocity(this.mActivePointerId);
                float yVelocity = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
                if (yVelocity > 0.0f) {
                    i2 = 2;
                }
                abs = Math.abs(yVelocity);
                if ((i2 & i) != 0 && i2 == i3 && abs >= this.mCallback.getSwipeEscapeVelocity(this.mSwipeEscapeVelocity) && abs > Math.abs(xVelocity)) {
                    return i2;
                }
            }
            abs = ((float) this.mRecyclerView.getHeight()) * this.mCallback.getSwipeThreshold(viewHolder);
            if ((i & i3) != 0 && Math.abs(this.mDy) > abs) {
                return i3;
            }
        }
        return 0;
    }

    private void destroyCallbacks() {
        this.mRecyclerView.removeItemDecoration(this);
        this.mRecyclerView.removeOnItemTouchListener(this.mOnItemTouchListener);
        this.mRecyclerView.removeOnChildAttachStateChangeListener(this);
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            this.mCallback.clearView(this.mRecyclerView, ((RecoverAnimation) this.mRecoverAnimations.get(0)).mViewHolder);
        }
        this.mRecoverAnimations.clear();
        this.mOverdrawChild = null;
        this.mOverdrawChildPosition = -1;
        releaseVelocityTracker();
    }

    private List<ViewHolder> findSwapTargets(ViewHolder viewHolder) {
        ViewHolder viewHolder2 = viewHolder;
        if (this.mSwapTargets == null) {
            r0.mSwapTargets = new ArrayList();
            r0.mDistances = new ArrayList();
        } else {
            r0.mSwapTargets.clear();
            r0.mDistances.clear();
        }
        int boundingBoxMargin = r0.mCallback.getBoundingBoxMargin();
        int round = Math.round(r0.mSelectedStartX + r0.mDx) - boundingBoxMargin;
        int round2 = Math.round(r0.mSelectedStartY + r0.mDy) - boundingBoxMargin;
        boundingBoxMargin *= 2;
        int width = (viewHolder2.itemView.getWidth() + round) + boundingBoxMargin;
        int height = (viewHolder2.itemView.getHeight() + round2) + boundingBoxMargin;
        boundingBoxMargin = (round + width) / 2;
        int i = (round2 + height) / 2;
        LayoutManager layoutManager = r0.mRecyclerView.getLayoutManager();
        int childCount = layoutManager.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = layoutManager.getChildAt(i2);
            if (childAt != viewHolder2.itemView && childAt.getBottom() >= round2 && childAt.getTop() <= height && childAt.getRight() >= round && childAt.getLeft() <= width) {
                ViewHolder childViewHolder = r0.mRecyclerView.getChildViewHolder(childAt);
                if (r0.mCallback.canDropOver(r0.mRecyclerView, r0.mSelected, childViewHolder)) {
                    int abs = Math.abs(boundingBoxMargin - ((childAt.getLeft() + childAt.getRight()) / 2));
                    int abs2 = Math.abs(i - ((childAt.getTop() + childAt.getBottom()) / 2));
                    abs = (abs * abs) + (abs2 * abs2);
                    abs2 = r0.mSwapTargets.size();
                    int i3 = 0;
                    int i4 = 0;
                    while (i4 < abs2 && abs > ((Integer) r0.mDistances.get(i4)).intValue()) {
                        i3++;
                        i4++;
                        viewHolder2 = viewHolder;
                    }
                    r0.mSwapTargets.add(i3, childViewHolder);
                    r0.mDistances.add(i3, Integer.valueOf(abs));
                }
            }
            i2++;
            viewHolder2 = viewHolder;
        }
        return r0.mSwapTargets;
    }

    private ViewHolder findSwipedView(MotionEvent motionEvent) {
        LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        if (this.mActivePointerId == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
        float x = motionEvent.getX(findPointerIndex) - this.mInitialTouchX;
        float y = motionEvent.getY(findPointerIndex) - this.mInitialTouchY;
        x = Math.abs(x);
        y = Math.abs(y);
        if (x < ((float) this.mSlop) && y < ((float) this.mSlop)) {
            return null;
        }
        if (x > y && layoutManager.canScrollHorizontally()) {
            return null;
        }
        if (y > x && layoutManager.canScrollVertically()) {
            return null;
        }
        View findChildView = findChildView(motionEvent);
        return findChildView == null ? null : this.mRecyclerView.getChildViewHolder(findChildView);
    }

    private void getSelectedDxDy(float[] fArr) {
        if ((this.mSelectedFlags & 12) != 0) {
            fArr[0] = (this.mSelectedStartX + this.mDx) - ((float) this.mSelected.itemView.getLeft());
        } else {
            fArr[0] = this.mSelected.itemView.getTranslationX();
        }
        if ((this.mSelectedFlags & 3) != 0) {
            fArr[1] = (this.mSelectedStartY + this.mDy) - ((float) this.mSelected.itemView.getTop());
        } else {
            fArr[1] = this.mSelected.itemView.getTranslationY();
        }
    }

    private static boolean hitTest(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    private void initGestureDetector() {
        if (this.mGestureDetector == null) {
            this.mGestureDetector = new C0554c(this.mRecyclerView.getContext(), new ItemTouchHelperGestureListener());
        }
    }

    private void releaseVelocityTracker() {
        if (this.mVelocityTracker != null) {
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private void setupCallbacks() {
        this.mSlop = ViewConfiguration.get(this.mRecyclerView.getContext()).getScaledTouchSlop();
        this.mRecyclerView.addItemDecoration(this);
        this.mRecyclerView.addOnItemTouchListener(this.mOnItemTouchListener);
        this.mRecyclerView.addOnChildAttachStateChangeListener(this);
        initGestureDetector();
    }

    private int swipeIfNecessary(ViewHolder viewHolder) {
        if (this.mActionState == 2) {
            return 0;
        }
        int movementFlags = this.mCallback.getMovementFlags(this.mRecyclerView, viewHolder);
        int convertToAbsoluteDirection = (this.mCallback.convertToAbsoluteDirection(movementFlags, C0571r.m1369h(this.mRecyclerView)) & ACTION_MODE_SWIPE_MASK) >> 8;
        if (convertToAbsoluteDirection == 0) {
            return 0;
        }
        movementFlags = (movementFlags & ACTION_MODE_SWIPE_MASK) >> 8;
        int checkHorizontalSwipe;
        int checkVerticalSwipe;
        if (Math.abs(this.mDx) > Math.abs(this.mDy)) {
            checkHorizontalSwipe = checkHorizontalSwipe(viewHolder, convertToAbsoluteDirection);
            if (checkHorizontalSwipe > 0) {
                return (movementFlags & checkHorizontalSwipe) == 0 ? Callback.convertToRelativeDirection(checkHorizontalSwipe, C0571r.m1369h(this.mRecyclerView)) : checkHorizontalSwipe;
            } else {
                checkVerticalSwipe = checkVerticalSwipe(viewHolder, convertToAbsoluteDirection);
                if (checkVerticalSwipe > 0) {
                    return checkVerticalSwipe;
                }
            }
        }
        checkHorizontalSwipe = checkVerticalSwipe(viewHolder, convertToAbsoluteDirection);
        if (checkHorizontalSwipe > 0) {
            return checkHorizontalSwipe;
        }
        checkVerticalSwipe = checkHorizontalSwipe(viewHolder, convertToAbsoluteDirection);
        if (checkVerticalSwipe > 0) {
            if ((movementFlags & checkVerticalSwipe) == 0) {
                checkVerticalSwipe = Callback.convertToRelativeDirection(checkVerticalSwipe, C0571r.m1369h(this.mRecyclerView));
            }
            return checkVerticalSwipe;
        }
        return 0;
    }

    public void attachToRecyclerView(RecyclerView recyclerView) {
        if (this.mRecyclerView != recyclerView) {
            if (this.mRecyclerView != null) {
                destroyCallbacks();
            }
            this.mRecyclerView = recyclerView;
            if (this.mRecyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.mSwipeEscapeVelocity = resources.getDimension(C0696a.item_touch_helper_swipe_escape_velocity);
                this.mMaxSwipeVelocity = resources.getDimension(C0696a.item_touch_helper_swipe_escape_max_velocity);
                setupCallbacks();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean checkSelectForSwipe(int r9, android.view.MotionEvent r10, int r11) {
        /*
        r8 = this;
        r0 = r8.mSelected;
        r1 = 0;
        if (r0 != 0) goto L_0x0093;
    L_0x0005:
        r0 = 2;
        if (r9 != r0) goto L_0x0093;
    L_0x0008:
        r9 = r8.mActionState;
        if (r9 == r0) goto L_0x0093;
    L_0x000c:
        r9 = r8.mCallback;
        r9 = r9.isItemViewSwipeEnabled();
        if (r9 != 0) goto L_0x0015;
    L_0x0014:
        return r1;
    L_0x0015:
        r9 = r8.mRecyclerView;
        r9 = r9.getScrollState();
        r2 = 1;
        if (r9 != r2) goto L_0x001f;
    L_0x001e:
        return r1;
    L_0x001f:
        r9 = r8.findSwipedView(r10);
        if (r9 != 0) goto L_0x0026;
    L_0x0025:
        return r1;
    L_0x0026:
        r3 = r8.mCallback;
        r4 = r8.mRecyclerView;
        r3 = r3.getAbsoluteMovementFlags(r4, r9);
        r4 = 65280; // 0xff00 float:9.1477E-41 double:3.22526E-319;
        r3 = r3 & r4;
        r3 = r3 >> 8;
        if (r3 != 0) goto L_0x0037;
    L_0x0036:
        return r1;
    L_0x0037:
        r4 = r10.getX(r11);
        r11 = r10.getY(r11);
        r5 = r8.mInitialTouchX;
        r4 = r4 - r5;
        r5 = r8.mInitialTouchY;
        r11 = r11 - r5;
        r5 = java.lang.Math.abs(r4);
        r6 = java.lang.Math.abs(r11);
        r7 = r8.mSlop;
        r7 = (float) r7;
        r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r7 >= 0) goto L_0x005c;
    L_0x0054:
        r7 = r8.mSlop;
        r7 = (float) r7;
        r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r7 >= 0) goto L_0x005c;
    L_0x005b:
        return r1;
    L_0x005c:
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        r6 = 0;
        if (r5 <= 0) goto L_0x0073;
    L_0x0061:
        r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r11 >= 0) goto L_0x006a;
    L_0x0065:
        r11 = r3 & 4;
        if (r11 != 0) goto L_0x006a;
    L_0x0069:
        return r1;
    L_0x006a:
        r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r11 <= 0) goto L_0x0085;
    L_0x006e:
        r11 = r3 & 8;
        if (r11 != 0) goto L_0x0085;
    L_0x0072:
        return r1;
    L_0x0073:
        r4 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1));
        if (r4 >= 0) goto L_0x007c;
    L_0x0077:
        r4 = r3 & 1;
        if (r4 != 0) goto L_0x007c;
    L_0x007b:
        return r1;
    L_0x007c:
        r11 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1));
        if (r11 <= 0) goto L_0x0085;
    L_0x0080:
        r11 = r3 & 2;
        if (r11 != 0) goto L_0x0085;
    L_0x0084:
        return r1;
    L_0x0085:
        r8.mDy = r6;
        r8.mDx = r6;
        r10 = r10.getPointerId(r1);
        r8.mActivePointerId = r10;
        r8.select(r9, r2);
        return r2;
    L_0x0093:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.helper.ItemTouchHelper.checkSelectForSwipe(int, android.view.MotionEvent, int):boolean");
    }

    int endRecoverAnimation(ViewHolder viewHolder, boolean z) {
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            RecoverAnimation recoverAnimation = (RecoverAnimation) this.mRecoverAnimations.get(size);
            if (recoverAnimation.mViewHolder == viewHolder) {
                recoverAnimation.mOverridden |= z;
                if (!recoverAnimation.mEnded) {
                    recoverAnimation.cancel();
                }
                this.mRecoverAnimations.remove(size);
                return recoverAnimation.mAnimationType;
            }
        }
        return 0;
    }

    RecoverAnimation findAnimation(MotionEvent motionEvent) {
        if (this.mRecoverAnimations.isEmpty()) {
            return null;
        }
        View findChildView = findChildView(motionEvent);
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            RecoverAnimation recoverAnimation = (RecoverAnimation) this.mRecoverAnimations.get(size);
            if (recoverAnimation.mViewHolder.itemView == findChildView) {
                return recoverAnimation;
            }
        }
        return null;
    }

    View findChildView(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (this.mSelected != null) {
            View view = this.mSelected.itemView;
            if (hitTest(view, x, y, this.mSelectedStartX + this.mDx, this.mSelectedStartY + this.mDy)) {
                return view;
            }
        }
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            RecoverAnimation recoverAnimation = (RecoverAnimation) this.mRecoverAnimations.get(size);
            View view2 = recoverAnimation.mViewHolder.itemView;
            if (hitTest(view2, x, y, recoverAnimation.mX, recoverAnimation.mY)) {
                return view2;
            }
        }
        return this.mRecyclerView.findChildViewUnder(x, y);
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
        rect.setEmpty();
    }

    boolean hasRunningRecoverAnim() {
        int size = this.mRecoverAnimations.size();
        for (int i = 0; i < size; i++) {
            if (!((RecoverAnimation) this.mRecoverAnimations.get(i)).mEnded) {
                return true;
            }
        }
        return false;
    }

    void moveIfNecessary(ViewHolder viewHolder) {
        if (!this.mRecyclerView.isLayoutRequested() && this.mActionState == 2) {
            float moveThreshold = this.mCallback.getMoveThreshold(viewHolder);
            int i = (int) (this.mSelectedStartX + this.mDx);
            int i2 = (int) (this.mSelectedStartY + this.mDy);
            if (((float) Math.abs(i2 - viewHolder.itemView.getTop())) >= ((float) viewHolder.itemView.getHeight()) * moveThreshold || ((float) Math.abs(i - viewHolder.itemView.getLeft())) >= ((float) viewHolder.itemView.getWidth()) * moveThreshold) {
                List findSwapTargets = findSwapTargets(viewHolder);
                if (findSwapTargets.size() != 0) {
                    ViewHolder chooseDropTarget = this.mCallback.chooseDropTarget(viewHolder, findSwapTargets, i, i2);
                    if (chooseDropTarget == null) {
                        this.mSwapTargets.clear();
                        this.mDistances.clear();
                        return;
                    }
                    int adapterPosition = chooseDropTarget.getAdapterPosition();
                    int adapterPosition2 = viewHolder.getAdapterPosition();
                    if (this.mCallback.onMove(this.mRecyclerView, viewHolder, chooseDropTarget)) {
                        this.mCallback.onMoved(this.mRecyclerView, viewHolder, adapterPosition2, chooseDropTarget, adapterPosition, i, i2);
                    }
                }
            }
        }
    }

    void obtainVelocityTracker() {
        if (this.mVelocityTracker != null) {
            this.mVelocityTracker.recycle();
        }
        this.mVelocityTracker = VelocityTracker.obtain();
    }

    public void onChildViewAttachedToWindow(View view) {
    }

    public void onChildViewDetachedFromWindow(View view) {
        removeChildDrawingOrderCallbackIfNecessary(view);
        ViewHolder childViewHolder = this.mRecyclerView.getChildViewHolder(view);
        if (childViewHolder != null) {
            if (this.mSelected == null || childViewHolder != this.mSelected) {
                endRecoverAnimation(childViewHolder, false);
                if (this.mPendingCleanup.remove(childViewHolder.itemView)) {
                    this.mCallback.clearView(this.mRecyclerView, childViewHolder);
                }
                return;
            }
            select(null, 0);
        }
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, State state) {
        float f;
        float f2;
        this.mOverdrawChildPosition = -1;
        if (this.mSelected != null) {
            getSelectedDxDy(this.mTmpPosition);
            float f3 = this.mTmpPosition[0];
            f = this.mTmpPosition[1];
            f2 = f3;
        } else {
            f2 = 0.0f;
            f = f2;
        }
        this.mCallback.onDraw(canvas, recyclerView, this.mSelected, this.mRecoverAnimations, this.mActionState, f2, f);
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, State state) {
        float f;
        float f2;
        if (this.mSelected != null) {
            getSelectedDxDy(this.mTmpPosition);
            float f3 = this.mTmpPosition[0];
            f = this.mTmpPosition[1];
            f2 = f3;
        } else {
            f2 = 0.0f;
            f = f2;
        }
        this.mCallback.onDrawOver(canvas, recyclerView, this.mSelected, this.mRecoverAnimations, this.mActionState, f2, f);
    }

    void postDispatchSwipe(final RecoverAnimation recoverAnimation, final int i) {
        this.mRecyclerView.post(new Runnable() {
            public void run() {
                if (!(ItemTouchHelper.this.mRecyclerView == null || !ItemTouchHelper.this.mRecyclerView.isAttachedToWindow() || recoverAnimation.mOverridden || recoverAnimation.mViewHolder.getAdapterPosition() == -1)) {
                    ItemAnimator itemAnimator = ItemTouchHelper.this.mRecyclerView.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.isRunning(null)) && !ItemTouchHelper.this.hasRunningRecoverAnim()) {
                        ItemTouchHelper.this.mCallback.onSwiped(recoverAnimation.mViewHolder, i);
                        return;
                    }
                    ItemTouchHelper.this.mRecyclerView.post(this);
                }
            }
        });
    }

    void removeChildDrawingOrderCallbackIfNecessary(View view) {
        if (view == this.mOverdrawChild) {
            this.mOverdrawChild = null;
            if (this.mChildDrawingOrderCallback != null) {
                this.mRecyclerView.setChildDrawingOrderCallback(null);
            }
        }
    }

    boolean scrollIfNecessary() {
        if (this.mSelected == null) {
            r0.mDragScrollStartTimeInMs = Long.MIN_VALUE;
            return false;
        }
        int i;
        int i2;
        int i3;
        long currentTimeMillis = System.currentTimeMillis();
        long j = r0.mDragScrollStartTimeInMs == Long.MIN_VALUE ? 0 : currentTimeMillis - r0.mDragScrollStartTimeInMs;
        LayoutManager layoutManager = r0.mRecyclerView.getLayoutManager();
        if (r0.mTmpRect == null) {
            r0.mTmpRect = new Rect();
        }
        layoutManager.calculateItemDecorationsForChild(r0.mSelected.itemView, r0.mTmpRect);
        if (layoutManager.canScrollHorizontally()) {
            i = (int) (r0.mSelectedStartX + r0.mDx);
            int paddingLeft = (i - r0.mTmpRect.left) - r0.mRecyclerView.getPaddingLeft();
            if (r0.mDx < 0.0f && paddingLeft < 0) {
                i2 = paddingLeft;
                if (layoutManager.canScrollVertically()) {
                    i3 = (int) (r0.mSelectedStartY + r0.mDy);
                    i = (i3 - r0.mTmpRect.top) - r0.mRecyclerView.getPaddingTop();
                    if (r0.mDy >= 0.0f) {
                    }
                    if (r0.mDy > 0.0f) {
                        i3 = ((i3 + r0.mSelected.itemView.getHeight()) + r0.mTmpRect.bottom) - (r0.mRecyclerView.getHeight() - r0.mRecyclerView.getPaddingBottom());
                        if (i3 > 0) {
                            if (i2 != 0) {
                                i2 = r0.mCallback.interpolateOutOfBoundsScroll(r0.mRecyclerView, r0.mSelected.itemView.getWidth(), i2, r0.mRecyclerView.getWidth(), j);
                            }
                            i = i2;
                            if (i3 != 0) {
                                i3 = r0.mCallback.interpolateOutOfBoundsScroll(r0.mRecyclerView, r0.mSelected.itemView.getHeight(), i3, r0.mRecyclerView.getHeight(), j);
                            }
                            if (i == 0) {
                                if (i3 != 0) {
                                    r0.mDragScrollStartTimeInMs = Long.MIN_VALUE;
                                    return false;
                                }
                            }
                            if (r0.mDragScrollStartTimeInMs == Long.MIN_VALUE) {
                                r0.mDragScrollStartTimeInMs = currentTimeMillis;
                            }
                            r0.mRecyclerView.scrollBy(i, i3);
                            return true;
                        }
                    }
                }
                i3 = 0;
                if (i2 != 0) {
                    i2 = r0.mCallback.interpolateOutOfBoundsScroll(r0.mRecyclerView, r0.mSelected.itemView.getWidth(), i2, r0.mRecyclerView.getWidth(), j);
                }
                i = i2;
                if (i3 != 0) {
                    i3 = r0.mCallback.interpolateOutOfBoundsScroll(r0.mRecyclerView, r0.mSelected.itemView.getHeight(), i3, r0.mRecyclerView.getHeight(), j);
                }
                if (i == 0) {
                    if (i3 != 0) {
                        r0.mDragScrollStartTimeInMs = Long.MIN_VALUE;
                        return false;
                    }
                }
                if (r0.mDragScrollStartTimeInMs == Long.MIN_VALUE) {
                    r0.mDragScrollStartTimeInMs = currentTimeMillis;
                }
                r0.mRecyclerView.scrollBy(i, i3);
                return true;
            } else if (r0.mDx > 0.0f) {
                i = ((i + r0.mSelected.itemView.getWidth()) + r0.mTmpRect.right) - (r0.mRecyclerView.getWidth() - r0.mRecyclerView.getPaddingRight());
                if (i > 0) {
                    i2 = i;
                    if (layoutManager.canScrollVertically()) {
                        i3 = (int) (r0.mSelectedStartY + r0.mDy);
                        i = (i3 - r0.mTmpRect.top) - r0.mRecyclerView.getPaddingTop();
                        if (r0.mDy >= 0.0f && i < 0) {
                            i3 = i;
                            if (i2 != 0) {
                                i2 = r0.mCallback.interpolateOutOfBoundsScroll(r0.mRecyclerView, r0.mSelected.itemView.getWidth(), i2, r0.mRecyclerView.getWidth(), j);
                            }
                            i = i2;
                            if (i3 != 0) {
                                i3 = r0.mCallback.interpolateOutOfBoundsScroll(r0.mRecyclerView, r0.mSelected.itemView.getHeight(), i3, r0.mRecyclerView.getHeight(), j);
                            }
                            if (i == 0) {
                                if (i3 != 0) {
                                    r0.mDragScrollStartTimeInMs = Long.MIN_VALUE;
                                    return false;
                                }
                            }
                            if (r0.mDragScrollStartTimeInMs == Long.MIN_VALUE) {
                                r0.mDragScrollStartTimeInMs = currentTimeMillis;
                            }
                            r0.mRecyclerView.scrollBy(i, i3);
                            return true;
                        } else if (r0.mDy > 0.0f) {
                            i3 = ((i3 + r0.mSelected.itemView.getHeight()) + r0.mTmpRect.bottom) - (r0.mRecyclerView.getHeight() - r0.mRecyclerView.getPaddingBottom());
                            if (i3 > 0) {
                                if (i2 != 0) {
                                    i2 = r0.mCallback.interpolateOutOfBoundsScroll(r0.mRecyclerView, r0.mSelected.itemView.getWidth(), i2, r0.mRecyclerView.getWidth(), j);
                                }
                                i = i2;
                                if (i3 != 0) {
                                    i3 = r0.mCallback.interpolateOutOfBoundsScroll(r0.mRecyclerView, r0.mSelected.itemView.getHeight(), i3, r0.mRecyclerView.getHeight(), j);
                                }
                                if (i == 0) {
                                    if (i3 != 0) {
                                        r0.mDragScrollStartTimeInMs = Long.MIN_VALUE;
                                        return false;
                                    }
                                }
                                if (r0.mDragScrollStartTimeInMs == Long.MIN_VALUE) {
                                    r0.mDragScrollStartTimeInMs = currentTimeMillis;
                                }
                                r0.mRecyclerView.scrollBy(i, i3);
                                return true;
                            }
                        }
                    }
                    i3 = 0;
                    if (i2 != 0) {
                        i2 = r0.mCallback.interpolateOutOfBoundsScroll(r0.mRecyclerView, r0.mSelected.itemView.getWidth(), i2, r0.mRecyclerView.getWidth(), j);
                    }
                    i = i2;
                    if (i3 != 0) {
                        i3 = r0.mCallback.interpolateOutOfBoundsScroll(r0.mRecyclerView, r0.mSelected.itemView.getHeight(), i3, r0.mRecyclerView.getHeight(), j);
                    }
                    if (i == 0) {
                        if (i3 != 0) {
                            r0.mDragScrollStartTimeInMs = Long.MIN_VALUE;
                            return false;
                        }
                    }
                    if (r0.mDragScrollStartTimeInMs == Long.MIN_VALUE) {
                        r0.mDragScrollStartTimeInMs = currentTimeMillis;
                    }
                    r0.mRecyclerView.scrollBy(i, i3);
                    return true;
                }
            }
        }
        i2 = 0;
        if (layoutManager.canScrollVertically()) {
            i3 = (int) (r0.mSelectedStartY + r0.mDy);
            i = (i3 - r0.mTmpRect.top) - r0.mRecyclerView.getPaddingTop();
            if (r0.mDy >= 0.0f) {
            }
            if (r0.mDy > 0.0f) {
                i3 = ((i3 + r0.mSelected.itemView.getHeight()) + r0.mTmpRect.bottom) - (r0.mRecyclerView.getHeight() - r0.mRecyclerView.getPaddingBottom());
                if (i3 > 0) {
                    if (i2 != 0) {
                        i2 = r0.mCallback.interpolateOutOfBoundsScroll(r0.mRecyclerView, r0.mSelected.itemView.getWidth(), i2, r0.mRecyclerView.getWidth(), j);
                    }
                    i = i2;
                    if (i3 != 0) {
                        i3 = r0.mCallback.interpolateOutOfBoundsScroll(r0.mRecyclerView, r0.mSelected.itemView.getHeight(), i3, r0.mRecyclerView.getHeight(), j);
                    }
                    if (i == 0) {
                        if (i3 != 0) {
                            r0.mDragScrollStartTimeInMs = Long.MIN_VALUE;
                            return false;
                        }
                    }
                    if (r0.mDragScrollStartTimeInMs == Long.MIN_VALUE) {
                        r0.mDragScrollStartTimeInMs = currentTimeMillis;
                    }
                    r0.mRecyclerView.scrollBy(i, i3);
                    return true;
                }
            }
        }
        i3 = 0;
        if (i2 != 0) {
            i2 = r0.mCallback.interpolateOutOfBoundsScroll(r0.mRecyclerView, r0.mSelected.itemView.getWidth(), i2, r0.mRecyclerView.getWidth(), j);
        }
        i = i2;
        if (i3 != 0) {
            i3 = r0.mCallback.interpolateOutOfBoundsScroll(r0.mRecyclerView, r0.mSelected.itemView.getHeight(), i3, r0.mRecyclerView.getHeight(), j);
        }
        if (i == 0) {
            if (i3 != 0) {
                r0.mDragScrollStartTimeInMs = Long.MIN_VALUE;
                return false;
            }
        }
        if (r0.mDragScrollStartTimeInMs == Long.MIN_VALUE) {
            r0.mDragScrollStartTimeInMs = currentTimeMillis;
        }
        r0.mRecyclerView.scrollBy(i, i3);
        return true;
    }

    void select(ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = viewHolder;
        int i2 = i;
        if (viewHolder2 != this.mSelected || i2 != r11.mActionState) {
            Object obj;
            boolean z;
            ViewParent parent;
            r11.mDragScrollStartTimeInMs = Long.MIN_VALUE;
            int i3 = r11.mActionState;
            endRecoverAnimation(viewHolder2, true);
            r11.mActionState = i2;
            if (i2 == 2) {
                r11.mOverdrawChild = viewHolder2.itemView;
                addChildDrawingOrderCallback();
            }
            int i4 = (1 << ((8 * i2) + 8)) - 1;
            int i5;
            if (r11.mSelected != null) {
                ViewHolder viewHolder3 = r11.mSelected;
                if (viewHolder3.itemView.getParent() != null) {
                    float f;
                    float signum;
                    int swipeIfNecessary = i3 == 2 ? 0 : swipeIfNecessary(viewHolder3);
                    releaseVelocityTracker();
                    if (swipeIfNecessary != 4 && swipeIfNecessary != 8 && swipeIfNecessary != 16 && swipeIfNecessary != 32) {
                        switch (swipeIfNecessary) {
                            case 1:
                            case 2:
                                f = 0.0f;
                                signum = Math.signum(r11.mDy) * ((float) r11.mRecyclerView.getHeight());
                                break;
                            default:
                                f = 0.0f;
                                signum = f;
                                break;
                        }
                    }
                    signum = 0.0f;
                    f = Math.signum(r11.mDx) * ((float) r11.mRecyclerView.getWidth());
                    int i6 = i3 == 2 ? 8 : swipeIfNecessary > 0 ? 2 : 4;
                    getSelectedDxDy(r11.mTmpPosition);
                    float f2 = r11.mTmpPosition[0];
                    float f3 = r11.mTmpPosition[1];
                    RecoverAnimation recoverAnimation = r0;
                    int i7 = i6;
                    final int i8 = swipeIfNecessary;
                    i5 = 8;
                    final ViewHolder viewHolder4 = viewHolder3;
                    RecoverAnimation c49193 = new RecoverAnimation(viewHolder3, i6, i3, f2, f3, f, signum) {
                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            if (!this.mOverridden) {
                                if (i8 <= 0) {
                                    ItemTouchHelper.this.mCallback.clearView(ItemTouchHelper.this.mRecyclerView, viewHolder4);
                                } else {
                                    ItemTouchHelper.this.mPendingCleanup.add(viewHolder4.itemView);
                                    this.mIsPendingCleanup = true;
                                    if (i8 > 0) {
                                        ItemTouchHelper.this.postDispatchSwipe(this, i8);
                                    }
                                }
                                if (ItemTouchHelper.this.mOverdrawChild == viewHolder4.itemView) {
                                    ItemTouchHelper.this.removeChildDrawingOrderCallbackIfNecessary(viewHolder4.itemView);
                                }
                            }
                        }
                    };
                    recoverAnimation.setDuration(r11.mCallback.getAnimationDuration(r11.mRecyclerView, i7, f - f2, signum - f3));
                    r11.mRecoverAnimations.add(recoverAnimation);
                    recoverAnimation.start();
                    obj = 1;
                } else {
                    ViewHolder viewHolder5 = viewHolder3;
                    i5 = 8;
                    removeChildDrawingOrderCallbackIfNecessary(viewHolder5.itemView);
                    r11.mCallback.clearView(r11.mRecyclerView, viewHolder5);
                    obj = null;
                }
                r11.mSelected = null;
            } else {
                i5 = 8;
                obj = null;
            }
            if (viewHolder2 != null) {
                r11.mSelectedFlags = (r11.mCallback.getAbsoluteMovementFlags(r11.mRecyclerView, viewHolder2) & i4) >> (r11.mActionState * 8);
                r11.mSelectedStartX = (float) viewHolder2.itemView.getLeft();
                r11.mSelectedStartY = (float) viewHolder2.itemView.getTop();
                r11.mSelected = viewHolder2;
                if (i2 == 2) {
                    z = false;
                    r11.mSelected.itemView.performHapticFeedback(0);
                    parent = r11.mRecyclerView.getParent();
                    if (parent != null) {
                        if (r11.mSelected != null) {
                            z = true;
                        }
                        parent.requestDisallowInterceptTouchEvent(z);
                    }
                    if (obj == null) {
                        r11.mRecyclerView.getLayoutManager().requestSimpleAnimationsInNextLayout();
                    }
                    r11.mCallback.onSelectedChanged(r11.mSelected, r11.mActionState);
                    r11.mRecyclerView.invalidate();
                }
            }
            z = false;
            parent = r11.mRecyclerView.getParent();
            if (parent != null) {
                if (r11.mSelected != null) {
                    z = true;
                }
                parent.requestDisallowInterceptTouchEvent(z);
            }
            if (obj == null) {
                r11.mRecyclerView.getLayoutManager().requestSimpleAnimationsInNextLayout();
            }
            r11.mCallback.onSelectedChanged(r11.mSelected, r11.mActionState);
            r11.mRecyclerView.invalidate();
        }
    }

    public void startDrag(ViewHolder viewHolder) {
        if (!this.mCallback.hasDragFlag(this.mRecyclerView, viewHolder)) {
            Log.e(TAG, "Start drag has been called but dragging is not enabled");
        } else if (viewHolder.itemView.getParent() != this.mRecyclerView) {
            Log.e(TAG, "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
        } else {
            obtainVelocityTracker();
            this.mDy = 0.0f;
            this.mDx = 0.0f;
            select(viewHolder, 2);
        }
    }

    public void startSwipe(ViewHolder viewHolder) {
        if (!this.mCallback.hasSwipeFlag(this.mRecyclerView, viewHolder)) {
            Log.e(TAG, "Start swipe has been called but swiping is not enabled");
        } else if (viewHolder.itemView.getParent() != this.mRecyclerView) {
            Log.e(TAG, "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
        } else {
            obtainVelocityTracker();
            this.mDy = 0.0f;
            this.mDx = 0.0f;
            select(viewHolder, 1);
        }
    }

    void updateDxDy(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        this.mDx = x - this.mInitialTouchX;
        this.mDy = y - this.mInitialTouchY;
        if ((i & 4) == 0) {
            this.mDx = Math.max(0.0f, this.mDx);
        }
        if ((i & 8) == 0) {
            this.mDx = Math.min(0.0f, this.mDx);
        }
        if ((i & 1) == 0) {
            this.mDy = Math.max(0.0f, this.mDy);
        }
        if ((i & 2) == 0) {
            this.mDy = Math.min(0.0f, this.mDy);
        }
    }
}
