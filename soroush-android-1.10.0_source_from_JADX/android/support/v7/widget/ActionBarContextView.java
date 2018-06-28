package android.support.v7.widget;

import android.content.Context;
import android.support.v4.view.C0571r;
import android.support.v4.view.C0579v;
import android.support.v7.p041a.C0645a.C0635a;
import android.support.v7.p041a.C0645a.C0640f;
import android.support.v7.p041a.C0645a.C0641g;
import android.support.v7.p041a.C0645a.C0644j;
import android.support.v7.view.C0705b;
import android.support.v7.view.menu.C4890h;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActionBarContextView extends AbsActionBarView {
    private static final String TAG = "ActionBarContextView";
    private View mClose;
    private int mCloseItemLayout;
    private View mCustomView;
    private CharSequence mSubtitle;
    private int mSubtitleStyleRes;
    private TextView mSubtitleView;
    private CharSequence mTitle;
    private LinearLayout mTitleLayout;
    private boolean mTitleOptional;
    private int mTitleStyleRes;
    private TextView mTitleView;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0635a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C0644j.ActionMode, i, 0);
        C0571r.m1339a((View) this, obtainStyledAttributes.getDrawable(C0644j.ActionMode_background));
        this.mTitleStyleRes = obtainStyledAttributes.getResourceId(C0644j.ActionMode_titleTextStyle, 0);
        this.mSubtitleStyleRes = obtainStyledAttributes.getResourceId(C0644j.ActionMode_subtitleTextStyle, 0);
        this.mContentHeight = obtainStyledAttributes.getLayoutDimension(C0644j.ActionMode_height, 0);
        this.mCloseItemLayout = obtainStyledAttributes.getResourceId(C0644j.ActionMode_closeItemLayout, C0641g.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    private void initTitle() {
        if (this.mTitleLayout == null) {
            LayoutInflater.from(getContext()).inflate(C0641g.abc_action_bar_title_item, this);
            this.mTitleLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.mTitleView = (TextView) this.mTitleLayout.findViewById(C0640f.action_bar_title);
            this.mSubtitleView = (TextView) this.mTitleLayout.findViewById(C0640f.action_bar_subtitle);
            if (this.mTitleStyleRes != 0) {
                this.mTitleView.setTextAppearance(getContext(), this.mTitleStyleRes);
            }
            if (this.mSubtitleStyleRes != 0) {
                this.mSubtitleView.setTextAppearance(getContext(), this.mSubtitleStyleRes);
            }
        }
        this.mTitleView.setText(this.mTitle);
        this.mSubtitleView.setText(this.mSubtitle);
        int isEmpty = TextUtils.isEmpty(this.mTitle) ^ 1;
        int isEmpty2 = TextUtils.isEmpty(this.mSubtitle) ^ 1;
        int i = 8;
        this.mSubtitleView.setVisibility(isEmpty2 != 0 ? 0 : 8);
        LinearLayout linearLayout = this.mTitleLayout;
        if (!(isEmpty == 0 && isEmpty2 == 0)) {
            i = 0;
        }
        linearLayout.setVisibility(i);
        if (this.mTitleLayout.getParent() == null) {
            addView(this.mTitleLayout);
        }
    }

    public /* bridge */ /* synthetic */ void animateToVisibility(int i) {
        super.animateToVisibility(i);
    }

    public /* bridge */ /* synthetic */ boolean canShowOverflowMenu() {
        return super.canShowOverflowMenu();
    }

    public void closeMode() {
        if (this.mClose == null) {
            killMode();
        }
    }

    public /* bridge */ /* synthetic */ void dismissPopupMenus() {
        super.dismissPopupMenus();
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-1, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.mSubtitle;
    }

    public CharSequence getTitle() {
        return this.mTitle;
    }

    public boolean hideOverflowMenu() {
        return this.mActionMenuPresenter != null ? this.mActionMenuPresenter.hideOverflowMenu() : false;
    }

    public void initForMode(final C0705b c0705b) {
        C4890h c4890h;
        LayoutParams layoutParams;
        if (this.mClose == null) {
            this.mClose = LayoutInflater.from(getContext()).inflate(this.mCloseItemLayout, this, false);
        } else {
            if (this.mClose.getParent() == null) {
            }
            this.mClose.findViewById(C0640f.action_mode_close_button).setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    c0705b.mo498c();
                }
            });
            c4890h = (C4890h) c0705b.mo495b();
            if (this.mActionMenuPresenter != null) {
                this.mActionMenuPresenter.dismissPopupMenus();
            }
            this.mActionMenuPresenter = new ActionMenuPresenter(getContext());
            this.mActionMenuPresenter.setReserveOverflow(true);
            layoutParams = new LayoutParams(-2, -1);
            c4890h.m9477a(this.mActionMenuPresenter, this.mPopupContext);
            this.mMenuView = (ActionMenuView) this.mActionMenuPresenter.getMenuView(this);
            C0571r.m1339a(this.mMenuView, null);
            addView(this.mMenuView, layoutParams);
        }
        addView(this.mClose);
        this.mClose.findViewById(C0640f.action_mode_close_button).setOnClickListener(/* anonymous class already generated */);
        c4890h = (C4890h) c0705b.mo495b();
        if (this.mActionMenuPresenter != null) {
            this.mActionMenuPresenter.dismissPopupMenus();
        }
        this.mActionMenuPresenter = new ActionMenuPresenter(getContext());
        this.mActionMenuPresenter.setReserveOverflow(true);
        layoutParams = new LayoutParams(-2, -1);
        c4890h.m9477a(this.mActionMenuPresenter, this.mPopupContext);
        this.mMenuView = (ActionMenuView) this.mActionMenuPresenter.getMenuView(this);
        C0571r.m1339a(this.mMenuView, null);
        addView(this.mMenuView, layoutParams);
    }

    public /* bridge */ /* synthetic */ boolean isOverflowMenuShowPending() {
        return super.isOverflowMenuShowPending();
    }

    public boolean isOverflowMenuShowing() {
        return this.mActionMenuPresenter != null ? this.mActionMenuPresenter.isOverflowMenuShowing() : false;
    }

    public /* bridge */ /* synthetic */ boolean isOverflowReserved() {
        return super.isOverflowReserved();
    }

    public boolean isTitleOptional() {
        return this.mTitleOptional;
    }

    public void killMode() {
        removeAllViews();
        this.mCustomView = null;
        this.mMenuView = null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mActionMenuPresenter != null) {
            this.mActionMenuPresenter.hideOverflowMenu();
            this.mActionMenuPresenter.hideSubMenus();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.mTitle);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        z = ViewUtils.isLayoutRtl(this);
        int paddingRight = z ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        i2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        if (this.mClose == null || this.mClose.getVisibility() == 8) {
            i4 = paddingRight;
        } else {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mClose.getLayoutParams();
            int i5 = z ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            i4 = z ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int next = AbsActionBarView.next(paddingRight, i5, z);
            i4 = AbsActionBarView.next(next + positionChild(this.mClose, next, paddingTop, i2, z), i4, z);
        }
        if (!(this.mTitleLayout == null || this.mCustomView != null || this.mTitleLayout.getVisibility() == 8)) {
            i4 += positionChild(this.mTitleLayout, i4, paddingTop, i2, z);
        }
        int i6 = i4;
        if (this.mCustomView != null) {
            positionChild(this.mCustomView, i6, paddingTop, i2, z);
        }
        int paddingLeft = z ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.mMenuView != null) {
            positionChild(this.mMenuView, paddingLeft, paddingTop, i2, z ^ 1);
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        StringBuilder stringBuilder;
        if (MeasureSpec.getMode(i) != 1073741824) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(getClass().getSimpleName());
            stringBuilder.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(stringBuilder.toString());
        } else if (MeasureSpec.getMode(i2) == 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(getClass().getSimpleName());
            stringBuilder.append(" can only be used with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(stringBuilder.toString());
        } else {
            int i4;
            i = MeasureSpec.getSize(i);
            i2 = this.mContentHeight > 0 ? this.mContentHeight : MeasureSpec.getSize(i2);
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            int i5 = i2 - paddingTop;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            int i6 = 0;
            if (this.mClose != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mClose.getLayoutParams();
                paddingLeft = measureChildView(this.mClose, paddingLeft, makeMeasureSpec, 0) - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            if (this.mMenuView != null && this.mMenuView.getParent() == this) {
                paddingLeft = measureChildView(this.mMenuView, paddingLeft, makeMeasureSpec, 0);
            }
            if (this.mTitleLayout != null && this.mCustomView == null) {
                if (this.mTitleOptional) {
                    this.mTitleLayout.measure(MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    makeMeasureSpec = this.mTitleLayout.getMeasuredWidth();
                    i4 = makeMeasureSpec <= paddingLeft ? 1 : 0;
                    if (i4 != 0) {
                        paddingLeft -= makeMeasureSpec;
                    }
                    this.mTitleLayout.setVisibility(i4 != 0 ? 0 : 8);
                } else {
                    paddingLeft = measureChildView(this.mTitleLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            if (this.mCustomView != null) {
                LayoutParams layoutParams = this.mCustomView.getLayoutParams();
                i4 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                if (layoutParams.height >= 0) {
                    i5 = Math.min(layoutParams.height, i5);
                }
                this.mCustomView.measure(MeasureSpec.makeMeasureSpec(paddingLeft, i4), MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.mContentHeight <= 0) {
                i2 = getChildCount();
                i3 = 0;
                while (i6 < i2) {
                    paddingLeft = getChildAt(i6).getMeasuredHeight() + paddingTop;
                    if (paddingLeft > i3) {
                        i3 = paddingLeft;
                    }
                    i6++;
                }
                setMeasuredDimension(i, i3);
                return;
            }
            setMeasuredDimension(i, i2);
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public /* bridge */ /* synthetic */ void postShowOverflowMenu() {
        super.postShowOverflowMenu();
    }

    public void setContentHeight(int i) {
        this.mContentHeight = i;
    }

    public void setCustomView(View view) {
        if (this.mCustomView != null) {
            removeView(this.mCustomView);
        }
        this.mCustomView = view;
        if (!(view == null || this.mTitleLayout == null)) {
            removeView(this.mTitleLayout);
            this.mTitleLayout = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.mSubtitle = charSequence;
        initTitle();
    }

    public void setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        initTitle();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.mTitleOptional) {
            requestLayout();
        }
        this.mTitleOptional = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public /* bridge */ /* synthetic */ C0579v setupAnimatorToVisibility(int i, long j) {
        return super.setupAnimatorToVisibility(i, j);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean showOverflowMenu() {
        return this.mActionMenuPresenter != null ? this.mActionMenuPresenter.showOverflowMenu() : false;
    }
}
