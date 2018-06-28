package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.app.C0662a.C0661b;
import android.support.v7.p041a.C0645a.C0635a;
import android.support.v7.view.C0703a;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class ScrollingTabContainerView extends HorizontalScrollView implements OnItemSelectedListener {
    private static final int FADE_DURATION = 200;
    private static final String TAG = "ScrollingTabContainerView";
    private static final Interpolator sAlphaInterpolator = new DecelerateInterpolator();
    private boolean mAllowCollapse;
    private int mContentHeight;
    int mMaxTabWidth;
    private int mSelectedTabIndex;
    int mStackedTabMaxWidth;
    private TabClickListener mTabClickListener;
    LinearLayoutCompat mTabLayout;
    Runnable mTabSelector;
    private Spinner mTabSpinner;
    protected final VisibilityAnimListener mVisAnimListener = new VisibilityAnimListener();
    protected ViewPropertyAnimator mVisibilityAnim;

    private class TabAdapter extends BaseAdapter {
        TabAdapter() {
        }

        public int getCount() {
            return ScrollingTabContainerView.this.mTabLayout.getChildCount();
        }

        public Object getItem(int i) {
            return ((TabView) ScrollingTabContainerView.this.mTabLayout.getChildAt(i)).getTab();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return ScrollingTabContainerView.this.createTabView((C0661b) getItem(i), true);
            }
            ((TabView) view).bindTab((C0661b) getItem(i));
            return view;
        }
    }

    private class TabClickListener implements OnClickListener {
        TabClickListener() {
        }

        public void onClick(View view) {
            ((TabView) view).getTab();
            int childCount = ScrollingTabContainerView.this.mTabLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ScrollingTabContainerView.this.mTabLayout.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    protected class VisibilityAnimListener extends AnimatorListenerAdapter {
        private boolean mCanceled = false;
        private int mFinalVisibility;

        protected VisibilityAnimListener() {
        }

        public void onAnimationCancel(Animator animator) {
            this.mCanceled = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.mCanceled) {
                ScrollingTabContainerView.this.mVisibilityAnim = null;
                ScrollingTabContainerView.this.setVisibility(this.mFinalVisibility);
            }
        }

        public void onAnimationStart(Animator animator) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.mCanceled = false;
        }

        public VisibilityAnimListener withFinalVisibility(ViewPropertyAnimator viewPropertyAnimator, int i) {
            this.mFinalVisibility = i;
            ScrollingTabContainerView.this.mVisibilityAnim = viewPropertyAnimator;
            return this;
        }
    }

    private class TabView extends LinearLayoutCompat {
        private final int[] BG_ATTRS = new int[]{16842964};
        private View mCustomView;
        private ImageView mIconView;
        private C0661b mTab;
        private TextView mTextView;

        public TabView(Context context, C0661b c0661b, boolean z) {
            super(context, null, C0635a.actionBarTabStyle);
            this.mTab = c0661b;
            TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, null, this.BG_ATTRS, C0635a.actionBarTabStyle, 0);
            if (obtainStyledAttributes.hasValue(0)) {
                setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
            }
            obtainStyledAttributes.recycle();
            if (z) {
                setGravity(8388627);
            }
            update();
        }

        public void bindTab(C0661b c0661b) {
            this.mTab = c0661b;
            update();
        }

        public C0661b getTab() {
            return this.mTab;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C0661b.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(C0661b.class.getName());
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (ScrollingTabContainerView.this.mMaxTabWidth > 0 && getMeasuredWidth() > ScrollingTabContainerView.this.mMaxTabWidth) {
                super.onMeasure(MeasureSpec.makeMeasureSpec(ScrollingTabContainerView.this.mMaxTabWidth, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            Object obj = isSelected() != z ? 1 : null;
            super.setSelected(z);
            if (obj != null && z) {
                sendAccessibilityEvent(4);
            }
        }

        public void update() {
            C0661b c0661b = this.mTab;
            View c = c0661b.m1582c();
            CharSequence charSequence = null;
            if (c != null) {
                TabView parent = c.getParent();
                if (parent != this) {
                    if (parent != null) {
                        parent.removeView(c);
                    }
                    addView(c);
                }
                this.mCustomView = c;
                if (this.mTextView != null) {
                    this.mTextView.setVisibility(8);
                }
                if (this.mIconView != null) {
                    this.mIconView.setVisibility(8);
                    this.mIconView.setImageDrawable(null);
                }
                return;
            }
            if (this.mCustomView != null) {
                removeView(this.mCustomView);
                this.mCustomView = null;
            }
            Drawable a = c0661b.m1580a();
            CharSequence b = c0661b.m1581b();
            if (a != null) {
                if (this.mIconView == null) {
                    View appCompatImageView = new AppCompatImageView(getContext());
                    LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.mIconView = appCompatImageView;
                }
                this.mIconView.setImageDrawable(a);
                this.mIconView.setVisibility(0);
            } else if (this.mIconView != null) {
                this.mIconView.setVisibility(8);
                this.mIconView.setImageDrawable(null);
            }
            int isEmpty = TextUtils.isEmpty(b) ^ 1;
            if (isEmpty != 0) {
                if (this.mTextView == null) {
                    View appCompatTextView = new AppCompatTextView(getContext(), null, C0635a.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TruncateAt.END);
                    LayoutParams layoutParams2 = new LinearLayoutCompat.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.mTextView = appCompatTextView;
                }
                this.mTextView.setText(b);
                this.mTextView.setVisibility(0);
            } else if (this.mTextView != null) {
                this.mTextView.setVisibility(8);
                this.mTextView.setText(null);
            }
            if (this.mIconView != null) {
                this.mIconView.setContentDescription(c0661b.m1583d());
            }
            if (isEmpty == 0) {
                charSequence = c0661b.m1583d();
            }
            TooltipCompat.setTooltipText(this, charSequence);
        }
    }

    public ScrollingTabContainerView(Context context) {
        super(context);
        setHorizontalScrollBarEnabled(false);
        C0703a a = C0703a.m1693a(context);
        setContentHeight(a.m1696c());
        this.mStackedTabMaxWidth = a.m1697d();
        this.mTabLayout = createTabLayout();
        addView(this.mTabLayout, new LayoutParams(-2, -1));
    }

    private Spinner createSpinner() {
        Spinner appCompatSpinner = new AppCompatSpinner(getContext(), null, C0635a.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    private LinearLayoutCompat createTabLayout() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, C0635a.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        return linearLayoutCompat;
    }

    private boolean isCollapsed() {
        return this.mTabSpinner != null && this.mTabSpinner.getParent() == this;
    }

    private void performCollapse() {
        if (!isCollapsed()) {
            if (this.mTabSpinner == null) {
                this.mTabSpinner = createSpinner();
            }
            removeView(this.mTabLayout);
            addView(this.mTabSpinner, new LayoutParams(-2, -1));
            if (this.mTabSpinner.getAdapter() == null) {
                this.mTabSpinner.setAdapter(new TabAdapter());
            }
            if (this.mTabSelector != null) {
                removeCallbacks(this.mTabSelector);
                this.mTabSelector = null;
            }
            this.mTabSpinner.setSelection(this.mSelectedTabIndex);
        }
    }

    private boolean performExpand() {
        if (!isCollapsed()) {
            return false;
        }
        removeView(this.mTabSpinner);
        addView(this.mTabLayout, new LayoutParams(-2, -1));
        setTabSelected(this.mTabSpinner.getSelectedItemPosition());
        return false;
    }

    public void addTab(C0661b c0661b, int i, boolean z) {
        View createTabView = createTabView(c0661b, false);
        this.mTabLayout.addView(createTabView, i, new LinearLayoutCompat.LayoutParams(0, -1, BallPulseIndicator.SCALE));
        if (this.mTabSpinner != null) {
            ((TabAdapter) this.mTabSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            createTabView.setSelected(true);
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }

    public void addTab(C0661b c0661b, boolean z) {
        View createTabView = createTabView(c0661b, false);
        this.mTabLayout.addView(createTabView, new LinearLayoutCompat.LayoutParams(0, -1, BallPulseIndicator.SCALE));
        if (this.mTabSpinner != null) {
            ((TabAdapter) this.mTabSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            createTabView.setSelected(true);
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }

    public void animateToTab(int i) {
        final View childAt = this.mTabLayout.getChildAt(i);
        if (this.mTabSelector != null) {
            removeCallbacks(this.mTabSelector);
        }
        this.mTabSelector = new Runnable() {
            public void run() {
                ScrollingTabContainerView.this.smoothScrollTo(childAt.getLeft() - ((ScrollingTabContainerView.this.getWidth() - childAt.getWidth()) / 2), 0);
                ScrollingTabContainerView.this.mTabSelector = null;
            }
        };
        post(this.mTabSelector);
    }

    public void animateToVisibility(int i) {
        ViewPropertyAnimator alpha;
        if (this.mVisibilityAnim != null) {
            this.mVisibilityAnim.cancel();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            alpha = animate().alpha(BallPulseIndicator.SCALE);
        } else {
            alpha = animate().alpha(0.0f);
        }
        alpha.setDuration(200);
        alpha.setInterpolator(sAlphaInterpolator);
        alpha.setListener(this.mVisAnimListener.withFinalVisibility(alpha, i));
        alpha.start();
    }

    TabView createTabView(C0661b c0661b, boolean z) {
        TabView tabView = new TabView(getContext(), c0661b, z);
        if (z) {
            tabView.setBackgroundDrawable(null);
            tabView.setLayoutParams(new AbsListView.LayoutParams(-1, this.mContentHeight));
            return tabView;
        }
        tabView.setFocusable(true);
        if (this.mTabClickListener == null) {
            this.mTabClickListener = new TabClickListener();
        }
        tabView.setOnClickListener(this.mTabClickListener);
        return tabView;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mTabSelector != null) {
            post(this.mTabSelector);
        }
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0703a a = C0703a.m1693a(getContext());
        setContentHeight(a.m1696c());
        this.mStackedTabMaxWidth = a.m1697d();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mTabSelector != null) {
            removeCallbacks(this.mTabSelector);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((TabView) view).getTab();
    }

    public void onMeasure(int i, int i2) {
        int measuredWidth;
        i2 = MeasureSpec.getMode(i);
        int i3 = 1;
        boolean z = i2 == 1073741824;
        setFillViewport(z);
        int childCount = this.mTabLayout.getChildCount();
        if (childCount <= 1 || !(i2 == 1073741824 || i2 == Integer.MIN_VALUE)) {
            i2 = -1;
        } else {
            if (childCount > 2) {
                this.mMaxTabWidth = (int) (((float) MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.mMaxTabWidth = MeasureSpec.getSize(i) / 2;
            }
            i2 = Math.min(this.mMaxTabWidth, this.mStackedTabMaxWidth);
        }
        this.mMaxTabWidth = i2;
        i2 = MeasureSpec.makeMeasureSpec(this.mContentHeight, 1073741824);
        if (z || !this.mAllowCollapse) {
            i3 = 0;
        }
        if (i3 != 0) {
            this.mTabLayout.measure(0, i2);
            if (this.mTabLayout.getMeasuredWidth() > MeasureSpec.getSize(i)) {
                performCollapse();
                measuredWidth = getMeasuredWidth();
                super.onMeasure(i, i2);
                i = getMeasuredWidth();
                if (z && measuredWidth != i) {
                    setTabSelected(this.mSelectedTabIndex);
                    return;
                }
            }
        }
        performExpand();
        measuredWidth = getMeasuredWidth();
        super.onMeasure(i, i2);
        i = getMeasuredWidth();
        if (z) {
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void removeAllTabs() {
        this.mTabLayout.removeAllViews();
        if (this.mTabSpinner != null) {
            ((TabAdapter) this.mTabSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }

    public void removeTabAt(int i) {
        this.mTabLayout.removeViewAt(i);
        if (this.mTabSpinner != null) {
            ((TabAdapter) this.mTabSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }

    public void setAllowCollapse(boolean z) {
        this.mAllowCollapse = z;
    }

    public void setContentHeight(int i) {
        this.mContentHeight = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.mSelectedTabIndex = i;
        int childCount = this.mTabLayout.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.mTabLayout.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                animateToTab(i);
            }
            i2++;
        }
        if (this.mTabSpinner != null && i >= 0) {
            this.mTabSpinner.setSelection(i);
        }
    }

    public void updateTab(int i) {
        ((TabView) this.mTabLayout.getChildAt(i)).update();
        if (this.mTabSpinner != null) {
            ((TabAdapter) this.mTabSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }
}
