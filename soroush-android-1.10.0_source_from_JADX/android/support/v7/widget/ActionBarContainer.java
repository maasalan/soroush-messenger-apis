package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.p041a.C0645a.C0640f;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class ActionBarContainer extends FrameLayout {
    private View mActionBarView;
    Drawable mBackground;
    private View mContextView;
    private int mHeight;
    boolean mIsSplit;
    boolean mIsStacked;
    private boolean mIsTransitioning;
    Drawable mSplitBackground;
    Drawable mStackedBackground;
    private View mTabContainer;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActionBarContainer(android.content.Context r3, android.util.AttributeSet r4) {
        /*
        r2 = this;
        r2.<init>(r3, r4);
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 21;
        if (r0 < r1) goto L_0x000f;
    L_0x0009:
        r0 = new android.support.v7.widget.ActionBarBackgroundDrawableV21;
        r0.<init>(r2);
        goto L_0x0014;
    L_0x000f:
        r0 = new android.support.v7.widget.ActionBarBackgroundDrawable;
        r0.<init>(r2);
    L_0x0014:
        android.support.v4.view.C0571r.m1339a(r2, r0);
        r0 = android.support.v7.p041a.C0645a.C0644j.ActionBar;
        r3 = r3.obtainStyledAttributes(r4, r0);
        r4 = android.support.v7.p041a.C0645a.C0644j.ActionBar_background;
        r4 = r3.getDrawable(r4);
        r2.mBackground = r4;
        r4 = android.support.v7.p041a.C0645a.C0644j.ActionBar_backgroundStacked;
        r4 = r3.getDrawable(r4);
        r2.mStackedBackground = r4;
        r4 = android.support.v7.p041a.C0645a.C0644j.ActionBar_height;
        r0 = -1;
        r4 = r3.getDimensionPixelSize(r4, r0);
        r2.mHeight = r4;
        r4 = r2.getId();
        r0 = android.support.v7.p041a.C0645a.C0640f.split_action_bar;
        r1 = 1;
        if (r4 != r0) goto L_0x0049;
    L_0x003f:
        r2.mIsSplit = r1;
        r4 = android.support.v7.p041a.C0645a.C0644j.ActionBar_backgroundSplit;
        r4 = r3.getDrawable(r4);
        r2.mSplitBackground = r4;
    L_0x0049:
        r3.recycle();
        r3 = r2.mIsSplit;
        r4 = 0;
        if (r3 == 0) goto L_0x0057;
    L_0x0051:
        r3 = r2.mSplitBackground;
        if (r3 != 0) goto L_0x0060;
    L_0x0055:
        r4 = r1;
        goto L_0x0060;
    L_0x0057:
        r3 = r2.mBackground;
        if (r3 != 0) goto L_0x0060;
    L_0x005b:
        r3 = r2.mStackedBackground;
        if (r3 != 0) goto L_0x0060;
    L_0x005f:
        goto L_0x0055;
    L_0x0060:
        r2.setWillNotDraw(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarContainer.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private int getMeasuredHeightWithMargins(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return (view.getMeasuredHeight() + layoutParams.topMargin) + layoutParams.bottomMargin;
    }

    private boolean isCollapsed(View view) {
        if (!(view == null || view.getVisibility() == 8)) {
            if (view.getMeasuredHeight() != 0) {
                return false;
            }
        }
        return true;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.mBackground != null && this.mBackground.isStateful()) {
            this.mBackground.setState(getDrawableState());
        }
        if (this.mStackedBackground != null && this.mStackedBackground.isStateful()) {
            this.mStackedBackground.setState(getDrawableState());
        }
        if (this.mSplitBackground != null && this.mSplitBackground.isStateful()) {
            this.mSplitBackground.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.mTabContainer;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.mBackground != null) {
            this.mBackground.jumpToCurrentState();
        }
        if (this.mStackedBackground != null) {
            this.mStackedBackground.jumpToCurrentState();
        }
        if (this.mSplitBackground != null) {
            this.mSplitBackground.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.mActionBarView = findViewById(C0640f.action_bar);
        this.mContextView = findViewById(C0640f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.mIsTransitioning) {
            if (!super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
        }
        return true;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.mTabContainer;
        i4 = 1;
        int i5 = 0;
        boolean z2 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            i2 = getMeasuredHeight();
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            view.layout(i, (i2 - view.getMeasuredHeight()) - layoutParams.bottomMargin, i3, i2 - layoutParams.bottomMargin);
        }
        if (!this.mIsSplit) {
            if (this.mBackground != null) {
                Drawable drawable;
                View view2;
                if (this.mActionBarView.getVisibility() == 0) {
                    drawable = this.mBackground;
                    i2 = this.mActionBarView.getLeft();
                    i3 = this.mActionBarView.getTop();
                    i5 = this.mActionBarView.getRight();
                    view2 = this.mActionBarView;
                } else if (this.mContextView == null || this.mContextView.getVisibility() != 0) {
                    this.mBackground.setBounds(0, 0, 0, 0);
                    i5 = 1;
                } else {
                    drawable = this.mBackground;
                    i2 = this.mContextView.getLeft();
                    i3 = this.mContextView.getTop();
                    i5 = this.mContextView.getRight();
                    view2 = this.mContextView;
                }
                drawable.setBounds(i2, i3, i5, view2.getBottom());
                i5 = 1;
            }
            this.mIsStacked = z2;
            if (z2 && this.mStackedBackground != null) {
                this.mStackedBackground.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                if (i4 == 0) {
                    invalidate();
                }
            }
        } else if (this.mSplitBackground != null) {
            this.mSplitBackground.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            if (i4 == 0) {
                invalidate();
            }
        }
        i4 = i5;
        if (i4 == 0) {
            invalidate();
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.mActionBarView == null && MeasureSpec.getMode(i2) == Integer.MIN_VALUE && this.mHeight >= 0) {
            i2 = MeasureSpec.makeMeasureSpec(Math.min(this.mHeight, MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.mActionBarView != null) {
            i = MeasureSpec.getMode(i2);
            if (!(this.mTabContainer == null || this.mTabContainer.getVisibility() == 8 || i == 1073741824)) {
                View view;
                int i3;
                if (!isCollapsed(this.mActionBarView)) {
                    view = this.mActionBarView;
                } else if (isCollapsed(this.mContextView)) {
                    i3 = 0;
                    setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + getMeasuredHeightWithMargins(this.mTabContainer), i != Integer.MIN_VALUE ? MeasureSpec.getSize(i2) : ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED));
                } else {
                    view = this.mContextView;
                }
                i3 = getMeasuredHeightWithMargins(view);
                if (i != Integer.MIN_VALUE) {
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + getMeasuredHeightWithMargins(this.mTabContainer), i != Integer.MIN_VALUE ? MeasureSpec.getSize(i2) : ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setPrimaryBackground(android.graphics.drawable.Drawable r5) {
        /*
        r4 = this;
        r0 = r4.mBackground;
        if (r0 == 0) goto L_0x000f;
    L_0x0004:
        r0 = r4.mBackground;
        r1 = 0;
        r0.setCallback(r1);
        r0 = r4.mBackground;
        r4.unscheduleDrawable(r0);
    L_0x000f:
        r4.mBackground = r5;
        if (r5 == 0) goto L_0x0037;
    L_0x0013:
        r5.setCallback(r4);
        r5 = r4.mActionBarView;
        if (r5 == 0) goto L_0x0037;
    L_0x001a:
        r5 = r4.mBackground;
        r0 = r4.mActionBarView;
        r0 = r0.getLeft();
        r1 = r4.mActionBarView;
        r1 = r1.getTop();
        r2 = r4.mActionBarView;
        r2 = r2.getRight();
        r3 = r4.mActionBarView;
        r3 = r3.getBottom();
        r5.setBounds(r0, r1, r2, r3);
    L_0x0037:
        r5 = r4.mIsSplit;
        r0 = 0;
        r1 = 1;
        if (r5 == 0) goto L_0x0043;
    L_0x003d:
        r5 = r4.mSplitBackground;
        if (r5 != 0) goto L_0x004c;
    L_0x0041:
        r0 = r1;
        goto L_0x004c;
    L_0x0043:
        r5 = r4.mBackground;
        if (r5 != 0) goto L_0x004c;
    L_0x0047:
        r5 = r4.mStackedBackground;
        if (r5 != 0) goto L_0x004c;
    L_0x004b:
        goto L_0x0041;
    L_0x004c:
        r4.setWillNotDraw(r0);
        r4.invalidate();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarContainer.setPrimaryBackground(android.graphics.drawable.Drawable):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSplitBackground(android.graphics.drawable.Drawable r4) {
        /*
        r3 = this;
        r0 = r3.mSplitBackground;
        if (r0 == 0) goto L_0x000f;
    L_0x0004:
        r0 = r3.mSplitBackground;
        r1 = 0;
        r0.setCallback(r1);
        r0 = r3.mSplitBackground;
        r3.unscheduleDrawable(r0);
    L_0x000f:
        r3.mSplitBackground = r4;
        r0 = 0;
        if (r4 == 0) goto L_0x002c;
    L_0x0014:
        r4.setCallback(r3);
        r4 = r3.mIsSplit;
        if (r4 == 0) goto L_0x002c;
    L_0x001b:
        r4 = r3.mSplitBackground;
        if (r4 == 0) goto L_0x002c;
    L_0x001f:
        r4 = r3.mSplitBackground;
        r1 = r3.getMeasuredWidth();
        r2 = r3.getMeasuredHeight();
        r4.setBounds(r0, r0, r1, r2);
    L_0x002c:
        r4 = r3.mIsSplit;
        r1 = 1;
        if (r4 == 0) goto L_0x0037;
    L_0x0031:
        r4 = r3.mSplitBackground;
        if (r4 != 0) goto L_0x0040;
    L_0x0035:
        r0 = r1;
        goto L_0x0040;
    L_0x0037:
        r4 = r3.mBackground;
        if (r4 != 0) goto L_0x0040;
    L_0x003b:
        r4 = r3.mStackedBackground;
        if (r4 != 0) goto L_0x0040;
    L_0x003f:
        goto L_0x0035;
    L_0x0040:
        r3.setWillNotDraw(r0);
        r3.invalidate();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarContainer.setSplitBackground(android.graphics.drawable.Drawable):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setStackedBackground(android.graphics.drawable.Drawable r5) {
        /*
        r4 = this;
        r0 = r4.mStackedBackground;
        if (r0 == 0) goto L_0x000f;
    L_0x0004:
        r0 = r4.mStackedBackground;
        r1 = 0;
        r0.setCallback(r1);
        r0 = r4.mStackedBackground;
        r4.unscheduleDrawable(r0);
    L_0x000f:
        r4.mStackedBackground = r5;
        if (r5 == 0) goto L_0x003b;
    L_0x0013:
        r5.setCallback(r4);
        r5 = r4.mIsStacked;
        if (r5 == 0) goto L_0x003b;
    L_0x001a:
        r5 = r4.mStackedBackground;
        if (r5 == 0) goto L_0x003b;
    L_0x001e:
        r5 = r4.mStackedBackground;
        r0 = r4.mTabContainer;
        r0 = r0.getLeft();
        r1 = r4.mTabContainer;
        r1 = r1.getTop();
        r2 = r4.mTabContainer;
        r2 = r2.getRight();
        r3 = r4.mTabContainer;
        r3 = r3.getBottom();
        r5.setBounds(r0, r1, r2, r3);
    L_0x003b:
        r5 = r4.mIsSplit;
        r0 = 0;
        r1 = 1;
        if (r5 == 0) goto L_0x0047;
    L_0x0041:
        r5 = r4.mSplitBackground;
        if (r5 != 0) goto L_0x0050;
    L_0x0045:
        r0 = r1;
        goto L_0x0050;
    L_0x0047:
        r5 = r4.mBackground;
        if (r5 != 0) goto L_0x0050;
    L_0x004b:
        r5 = r4.mStackedBackground;
        if (r5 != 0) goto L_0x0050;
    L_0x004f:
        goto L_0x0045;
    L_0x0050:
        r4.setWillNotDraw(r0);
        r4.invalidate();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarContainer.setStackedBackground(android.graphics.drawable.Drawable):void");
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        if (this.mTabContainer != null) {
            removeView(this.mTabContainer);
        }
        this.mTabContainer = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.mIsTransitioning = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (this.mBackground != null) {
            this.mBackground.setVisible(z, false);
        }
        if (this.mStackedBackground != null) {
            this.mStackedBackground.setVisible(z, false);
        }
        if (this.mSplitBackground != null) {
            this.mSplitBackground.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, Callback callback, int i) {
        return i != 0 ? super.startActionModeForChild(view, callback, i) : null;
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.mBackground && !this.mIsSplit) || ((drawable == this.mStackedBackground && this.mIsStacked) || ((drawable == this.mSplitBackground && this.mIsSplit) || super.verifyDrawable(drawable)));
    }
}
