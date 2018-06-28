package android.support.v7.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.view.C0579v;
import android.support.v4.widget.C4857i;
import android.support.v7.p041a.C0645a.C0635a;
import android.view.MotionEvent;
import android.view.View;

class DropDownListView extends ListViewCompat {
    private C0579v mClickAnimation;
    private boolean mDrawsInPressedState;
    private boolean mHijackFocus;
    private boolean mListSelectionHidden;
    private C4857i mScrollHelper;

    public DropDownListView(Context context, boolean z) {
        super(context, null, C0635a.dropDownListViewStyle);
        this.mHijackFocus = z;
        setCacheColorHint(0);
    }

    private void clearPressedItem() {
        this.mDrawsInPressedState = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.mMotionPosition - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        if (this.mClickAnimation != null) {
            this.mClickAnimation.m1415a();
            this.mClickAnimation = null;
        }
    }

    private void clickPressedItem(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    private void setPressedItem(View view, int i, float f, float f2) {
        this.mDrawsInPressedState = true;
        if (VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        if (this.mMotionPosition != -1) {
            View childAt = getChildAt(this.mMotionPosition - getFirstVisiblePosition());
            if (!(childAt == null || childAt == view || !childAt.isPressed())) {
                childAt.setPressed(false);
            }
        }
        this.mMotionPosition = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        positionSelectorLikeTouchCompat(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    public boolean hasFocus() {
        if (!this.mHijackFocus) {
            if (!super.hasFocus()) {
                return false;
            }
        }
        return true;
    }

    public boolean hasWindowFocus() {
        if (!this.mHijackFocus) {
            if (!super.hasWindowFocus()) {
                return false;
            }
        }
        return true;
    }

    public boolean isFocused() {
        if (!this.mHijackFocus) {
            if (!super.isFocused()) {
                return false;
            }
        }
        return true;
    }

    public boolean isInTouchMode() {
        return (this.mHijackFocus && this.mListSelectionHidden) || super.isInTouchMode();
    }

    public boolean onForwardedEvent(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        switch (actionMasked) {
            case 1:
                z = false;
                break;
            case 2:
                z = true;
                break;
            case 3:
                z2 = false;
                z = z2;
                break;
            default:
                z2 = false;
                z = true;
                break;
        }
        i = motionEvent.findPointerIndex(i);
        if (i < 0) {
            z2 = false;
            z = z2;
            if (!z || r9) {
                clearPressedItem();
            }
            if (z) {
                if (this.mScrollHelper == null) {
                    this.mScrollHelper = new C4857i(this);
                }
                this.mScrollHelper.m1468a(true);
                this.mScrollHelper.onTouch(this, motionEvent);
                return z;
            }
            if (this.mScrollHelper != null) {
                this.mScrollHelper.m1468a(false);
            }
            return z;
        }
        int x = (int) motionEvent.getX(i);
        i = (int) motionEvent.getY(i);
        int pointToPosition = pointToPosition(x, i);
        if (pointToPosition == -1) {
            z2 = true;
            clearPressedItem();
            if (z) {
                if (this.mScrollHelper != null) {
                    this.mScrollHelper.m1468a(false);
                }
                return z;
            }
            if (this.mScrollHelper == null) {
                this.mScrollHelper = new C4857i(this);
            }
            this.mScrollHelper.m1468a(true);
            this.mScrollHelper.onTouch(this, motionEvent);
            return z;
        }
        View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
        setPressedItem(childAt, pointToPosition, (float) x, (float) i);
        if (actionMasked == 1) {
            clickPressedItem(childAt, pointToPosition);
        }
        z2 = false;
        z = true;
        clearPressedItem();
        if (z) {
            if (this.mScrollHelper == null) {
                this.mScrollHelper = new C4857i(this);
            }
            this.mScrollHelper.m1468a(true);
            this.mScrollHelper.onTouch(this, motionEvent);
            return z;
        }
        if (this.mScrollHelper != null) {
            this.mScrollHelper.m1468a(false);
        }
        return z;
    }

    void setListSelectionHidden(boolean z) {
        this.mListSelectionHidden = z;
    }

    protected boolean touchModeDrawsInPressedStateCompat() {
        if (!this.mDrawsInPressedState) {
            if (!super.touchModeDrawsInPressedStateCompat()) {
                return false;
            }
        }
        return true;
    }
}
