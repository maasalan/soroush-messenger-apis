package android.support.v7.widget;

import android.os.SystemClock;
import android.support.v7.view.menu.C0731s;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;

public abstract class ForwardingListener implements OnAttachStateChangeListener, OnTouchListener {
    private int mActivePointerId;
    private Runnable mDisallowIntercept;
    private boolean mForwarding;
    private final int mLongPressTimeout;
    private final float mScaledTouchSlop;
    final View mSrc;
    private final int mTapTimeout;
    private final int[] mTmpLocation = new int[2];
    private Runnable mTriggerLongPress;

    private class DisallowIntercept implements Runnable {
        DisallowIntercept() {
        }

        public void run() {
            ViewParent parent = ForwardingListener.this.mSrc.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class TriggerLongPress implements Runnable {
        TriggerLongPress() {
        }

        public void run() {
            ForwardingListener.this.onLongPress();
        }
    }

    public ForwardingListener(View view) {
        this.mSrc = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.mScaledTouchSlop = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.mTapTimeout = ViewConfiguration.getTapTimeout();
        this.mLongPressTimeout = (this.mTapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void clearCallbacks() {
        if (this.mTriggerLongPress != null) {
            this.mSrc.removeCallbacks(this.mTriggerLongPress);
        }
        if (this.mDisallowIntercept != null) {
            this.mSrc.removeCallbacks(this.mDisallowIntercept);
        }
    }

    private boolean onTouchForwarded(MotionEvent motionEvent) {
        View view = this.mSrc;
        C0731s popup = getPopup();
        if (popup == null || !popup.isShowing()) {
            return false;
        }
        DropDownListView dropDownListView = (DropDownListView) popup.getListView();
        if (dropDownListView == null || !dropDownListView.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        toGlobalMotionEvent(view, obtainNoHistory);
        toLocalMotionEvent(dropDownListView, obtainNoHistory);
        boolean onForwardedEvent = dropDownListView.onForwardedEvent(obtainNoHistory, this.mActivePointerId);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        boolean z = (actionMasked == 1 || actionMasked == 3) ? false : true;
        return onForwardedEvent && z;
    }

    private boolean onTouchObserved(MotionEvent motionEvent) {
        View view = this.mSrc;
        if (!view.isEnabled()) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.mActivePointerId = motionEvent.getPointerId(0);
                if (this.mDisallowIntercept == null) {
                    this.mDisallowIntercept = new DisallowIntercept();
                }
                view.postDelayed(this.mDisallowIntercept, (long) this.mTapTimeout);
                if (this.mTriggerLongPress == null) {
                    this.mTriggerLongPress = new TriggerLongPress();
                }
                view.postDelayed(this.mTriggerLongPress, (long) this.mLongPressTimeout);
                break;
            case 1:
            case 3:
                clearCallbacks();
                return false;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                if (findPointerIndex >= 0 && !pointInView(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.mScaledTouchSlop)) {
                    clearCallbacks();
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
            default:
                return false;
        }
        return false;
    }

    private static boolean pointInView(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    private boolean toGlobalMotionEvent(View view, MotionEvent motionEvent) {
        int[] iArr = this.mTmpLocation;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    private boolean toLocalMotionEvent(View view, MotionEvent motionEvent) {
        int[] iArr = this.mTmpLocation;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    public abstract C0731s getPopup();

    public boolean onForwardingStarted() {
        C0731s popup = getPopup();
        if (!(popup == null || popup.isShowing())) {
            popup.show();
        }
        return true;
    }

    protected boolean onForwardingStopped() {
        C0731s popup = getPopup();
        if (popup != null && popup.isShowing()) {
            popup.dismiss();
        }
        return true;
    }

    void onLongPress() {
        clearCallbacks();
        View view = this.mSrc;
        if (view.isEnabled() && !view.isLongClickable() && onForwardingStarted()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.mForwarding = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.mForwarding;
        if (z2) {
            if (!onTouchForwarded(motionEvent)) {
                if (onForwardingStopped()) {
                    z = false;
                }
            }
            z = true;
        } else {
            z = onTouchObserved(motionEvent) && onForwardingStarted();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.mSrc.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.mForwarding = z;
        return z || z2;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.mForwarding = false;
        this.mActivePointerId = -1;
        if (this.mDisallowIntercept != null) {
            this.mSrc.removeCallbacks(this.mDisallowIntercept);
        }
    }
}
