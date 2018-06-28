package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.p031b.p032a.C0429a;
import android.support.v7.p045d.p046a.C0687a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

public class ListViewCompat extends ListView {
    public static final int INVALID_POSITION = -1;
    public static final int NO_POSITION = -1;
    private static final int[] STATE_SET_NOTHING = new int[]{0};
    private Field mIsChildViewEnabled;
    protected int mMotionPosition;
    int mSelectionBottomPadding;
    int mSelectionLeftPadding;
    int mSelectionRightPadding;
    int mSelectionTopPadding;
    private GateKeeperDrawable mSelector;
    final Rect mSelectorRect;

    private static class GateKeeperDrawable extends C0687a {
        private boolean mEnabled = true;

        public GateKeeperDrawable(Drawable drawable) {
            super(drawable);
        }

        public void draw(Canvas canvas) {
            if (this.mEnabled) {
                super.draw(canvas);
            }
        }

        void setEnabled(boolean z) {
            this.mEnabled = z;
        }

        public void setHotspot(float f, float f2) {
            if (this.mEnabled) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.mEnabled) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            return this.mEnabled ? super.setState(iArr) : false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            return this.mEnabled ? super.setVisible(z, z2) : false;
        }
    }

    public ListViewCompat(Context context) {
        this(context, null);
    }

    public ListViewCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ListViewCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSelectorRect = new Rect();
        this.mSelectionLeftPadding = 0;
        this.mSelectionTopPadding = 0;
        this.mSelectionRightPadding = 0;
        this.mSelectionBottomPadding = 0;
        try {
            this.mIsChildViewEnabled = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.mIsChildViewEnabled.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    protected void dispatchDraw(Canvas canvas) {
        drawSelectorCompat(canvas);
        super.dispatchDraw(canvas);
    }

    protected void drawSelectorCompat(Canvas canvas) {
        if (!this.mSelectorRect.isEmpty()) {
            Drawable selector = getSelector();
            if (selector != null) {
                selector.setBounds(this.mSelectorRect);
                selector.draw(canvas);
            }
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        setSelectorEnabled(true);
        updateSelectorStateCompat();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int lookForSelectablePosition(int r5, boolean r6) {
        /*
        r4 = this;
        r0 = r4.getAdapter();
        r1 = -1;
        if (r0 == 0) goto L_0x004c;
    L_0x0007:
        r2 = r4.isInTouchMode();
        if (r2 == 0) goto L_0x000e;
    L_0x000d:
        return r1;
    L_0x000e:
        r2 = r0.getCount();
        r3 = r4.getAdapter();
        r3 = r3.areAllItemsEnabled();
        if (r3 != 0) goto L_0x0046;
    L_0x001c:
        if (r6 == 0) goto L_0x002e;
    L_0x001e:
        r6 = 0;
        r5 = java.lang.Math.max(r6, r5);
    L_0x0023:
        if (r5 >= r2) goto L_0x003f;
    L_0x0025:
        r6 = r0.isEnabled(r5);
        if (r6 != 0) goto L_0x003f;
    L_0x002b:
        r5 = r5 + 1;
        goto L_0x0023;
    L_0x002e:
        r6 = r2 + -1;
        r5 = java.lang.Math.min(r5, r6);
    L_0x0034:
        if (r5 < 0) goto L_0x003f;
    L_0x0036:
        r6 = r0.isEnabled(r5);
        if (r6 != 0) goto L_0x003f;
    L_0x003c:
        r5 = r5 + -1;
        goto L_0x0034;
    L_0x003f:
        if (r5 < 0) goto L_0x0045;
    L_0x0041:
        if (r5 < r2) goto L_0x0044;
    L_0x0043:
        return r1;
    L_0x0044:
        return r5;
    L_0x0045:
        return r1;
    L_0x0046:
        if (r5 < 0) goto L_0x004c;
    L_0x0048:
        if (r5 < r2) goto L_0x004b;
    L_0x004a:
        return r1;
    L_0x004b:
        return r5;
    L_0x004c:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ListViewCompat.lookForSelectablePosition(int, boolean):int");
    }

    public int measureHeightOfChildrenCompat(int i, int i2, int i3, int i4, int i5) {
        i2 = getListPaddingTop();
        i3 = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return i2 + i3;
        }
        i2 += i3;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i6 = i2;
        i2 = 0;
        int i7 = i2;
        int i8 = i7;
        View view = null;
        while (i2 < count) {
            int itemViewType = adapter.getItemViewType(i2);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i2, view, this);
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            view.measure(i, layoutParams.height > 0 ? MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i2 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i4) {
                return (i5 < 0 || i2 <= i5 || i8 <= 0 || i6 == i4) ? i4 : i8;
            } else {
                if (i5 >= 0 && i2 >= i5) {
                    i8 = i6;
                }
                i2++;
            }
        }
        return i6;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.mMotionPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        return super.onTouchEvent(motionEvent);
    }

    protected void positionSelectorCompat(int i, View view) {
        Rect rect = this.mSelectorRect;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.mSelectionLeftPadding;
        rect.top -= this.mSelectionTopPadding;
        rect.right += this.mSelectionRightPadding;
        rect.bottom += this.mSelectionBottomPadding;
        try {
            boolean z = this.mIsChildViewEnabled.getBoolean(this);
            if (view.isEnabled() != z) {
                this.mIsChildViewEnabled.set(this, Boolean.valueOf(z ^ 1));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    protected void positionSelectorLikeFocusCompat(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        positionSelectorCompat(i, view);
        if (z2) {
            Rect rect = this.mSelectorRect;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C0429a.m882a(selector, exactCenterX, exactCenterY);
        }
    }

    protected void positionSelectorLikeTouchCompat(int i, View view, float f, float f2) {
        positionSelectorLikeFocusCompat(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C0429a.m882a(selector, f, f2);
        }
    }

    public void setSelector(Drawable drawable) {
        this.mSelector = drawable != null ? new GateKeeperDrawable(drawable) : null;
        super.setSelector(this.mSelector);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.mSelectionLeftPadding = rect.left;
        this.mSelectionTopPadding = rect.top;
        this.mSelectionRightPadding = rect.right;
        this.mSelectionBottomPadding = rect.bottom;
    }

    protected void setSelectorEnabled(boolean z) {
        if (this.mSelector != null) {
            this.mSelector.setEnabled(z);
        }
    }

    protected boolean shouldShowSelectorCompat() {
        return touchModeDrawsInPressedStateCompat() && isPressed();
    }

    protected boolean touchModeDrawsInPressedStateCompat() {
        return false;
    }

    protected void updateSelectorStateCompat() {
        Drawable selector = getSelector();
        if (selector != null && shouldShowSelectorCompat()) {
            selector.setState(getDrawableState());
        }
    }
}
