package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0555d;
import android.support.v4.view.C0571r;
import android.support.v7.app.C0662a.C0660a;
import android.support.v7.p041a.C0645a.C0635a;
import android.support.v7.p041a.C0645a.C0644j;
import android.support.v7.p043c.p044a.C0683b;
import android.support.v7.view.C0706c;
import android.support.v7.view.C0711g;
import android.support.v7.view.menu.C0727o;
import android.support.v7.view.menu.C0727o.C0726a;
import android.support.v7.view.menu.C0729p;
import android.support.v7.view.menu.C4890h;
import android.support.v7.view.menu.C4890h.C0722a;
import android.support.v7.view.menu.C4893j;
import android.support.v7.view.menu.C6399u;
import android.text.Layout;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
    private static final String TAG = "Toolbar";
    private C0726a mActionMenuPresenterCallback;
    int mButtonGravity;
    ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private RtlSpacingHelper mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    View mExpandedActionView;
    private ExpandedActionViewMenuPresenter mExpandedMenuPresenter;
    private int mGravity;
    private final ArrayList<View> mHiddenViews;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    private C0722a mMenuBuilderCallback;
    private ActionMenuView mMenuView;
    private final android.support.v7.widget.ActionMenuView.OnMenuItemClickListener mMenuViewItemClickListener;
    private ImageButton mNavButtonView;
    OnMenuItemClickListener mOnMenuItemClickListener;
    private ActionMenuPresenter mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private int mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final ArrayList<View> mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private int mTitleTextColor;
    private TextView mTitleTextView;
    private ToolbarWidgetWrapper mWrapper;

    class C07822 implements Runnable {
        C07822() {
        }

        public void run() {
            Toolbar.this.showOverflowMenu();
        }
    }

    class C07833 implements OnClickListener {
        C07833() {
        }

        public void onClick(View view) {
            Toolbar.this.collapseActionView();
        }
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    class C49171 implements android.support.v7.widget.ActionMenuView.OnMenuItemClickListener {
        C49171() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return Toolbar.this.mOnMenuItemClickListener != null ? Toolbar.this.mOnMenuItemClickListener.onMenuItemClick(menuItem) : false;
        }
    }

    private class ExpandedActionViewMenuPresenter implements C0727o {
        C4893j mCurrentExpandedItem;
        C4890h mMenu;

        ExpandedActionViewMenuPresenter() {
        }

        public boolean collapseItemActionView(C4890h c4890h, C4893j c4893j) {
            if (Toolbar.this.mExpandedActionView instanceof C0706c) {
                ((C0706c) Toolbar.this.mExpandedActionView).onActionViewCollapsed();
            }
            Toolbar.this.removeView(Toolbar.this.mExpandedActionView);
            Toolbar.this.removeView(Toolbar.this.mCollapseButtonView);
            Toolbar.this.mExpandedActionView = null;
            Toolbar.this.addChildrenForExpandedActionView();
            this.mCurrentExpandedItem = null;
            Toolbar.this.requestLayout();
            c4893j.m9513d(false);
            return true;
        }

        public boolean expandItemActionView(C4890h c4890h, C4893j c4893j) {
            Toolbar.this.ensureCollapseButtonView();
            if (Toolbar.this.mCollapseButtonView.getParent() != Toolbar.this) {
                Toolbar.this.addView(Toolbar.this.mCollapseButtonView);
            }
            Toolbar.this.mExpandedActionView = c4893j.getActionView();
            this.mCurrentExpandedItem = c4893j;
            if (Toolbar.this.mExpandedActionView.getParent() != Toolbar.this) {
                android.view.ViewGroup.LayoutParams generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                generateDefaultLayoutParams.gravity = 8388611 | (Toolbar.this.mButtonGravity & 112);
                generateDefaultLayoutParams.mViewType = 2;
                Toolbar.this.mExpandedActionView.setLayoutParams(generateDefaultLayoutParams);
                Toolbar.this.addView(Toolbar.this.mExpandedActionView);
            }
            Toolbar.this.removeChildrenForExpandedActionView();
            Toolbar.this.requestLayout();
            c4893j.m9513d(true);
            if (Toolbar.this.mExpandedActionView instanceof C0706c) {
                ((C0706c) Toolbar.this.mExpandedActionView).onActionViewExpanded();
            }
            return true;
        }

        public boolean flagActionItems() {
            return false;
        }

        public int getId() {
            return 0;
        }

        public C0729p getMenuView(ViewGroup viewGroup) {
            return null;
        }

        public void initForMenu(Context context, C4890h c4890h) {
            if (!(this.mMenu == null || this.mCurrentExpandedItem == null)) {
                this.mMenu.mo2624b(this.mCurrentExpandedItem);
            }
            this.mMenu = c4890h;
        }

        public void onCloseMenu(C4890h c4890h, boolean z) {
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        public boolean onSubMenuSelected(C6399u c6399u) {
            return false;
        }

        public void setCallback(C0726a c0726a) {
        }

        public void updateMenuView(boolean z) {
            if (this.mCurrentExpandedItem != null) {
                Object obj = null;
                if (this.mMenu != null) {
                    int size = this.mMenu.size();
                    for (int i = 0; i < size; i++) {
                        if (this.mMenu.getItem(i) == this.mCurrentExpandedItem) {
                            obj = 1;
                            break;
                        }
                    }
                }
                if (obj == null) {
                    collapseItemActionView(this.mMenu, this.mCurrentExpandedItem);
                }
            }
        }
    }

    public static class LayoutParams extends C0660a {
        static final int CUSTOM = 0;
        static final int EXPANDED = 2;
        static final int SYSTEM = 1;
        int mViewType;

        public LayoutParams(int i) {
            this(-2, -1, i);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.mViewType = 0;
            this.gravity = 8388627;
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2);
            this.mViewType = 0;
            this.gravity = i3;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mViewType = 0;
        }

        public LayoutParams(C0660a c0660a) {
            super(c0660a);
            this.mViewType = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((C0660a) layoutParams);
            this.mViewType = 0;
            this.mViewType = layoutParams.mViewType;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mViewType = 0;
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super((android.view.ViewGroup.LayoutParams) marginLayoutParams);
            this.mViewType = 0;
            copyMarginsFromCompat(marginLayoutParams);
        }

        void copyMarginsFromCompat(MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C07841();
        int expandedMenuItemId;
        boolean isOverflowOpen;

        static class C07841 implements ClassLoaderCreator<SavedState> {
            C07841() {
            }

            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.expandedMenuItemId = parcel.readInt();
            this.isOverflowOpen = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.expandedMenuItemId);
            parcel.writeInt(this.isOverflowOpen);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0635a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList();
        this.mHiddenViews = new ArrayList();
        this.mTempMargins = new int[2];
        this.mMenuViewItemClickListener = new C49171();
        this.mShowOverflowMenuRunnable = new C07822();
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, C0644j.Toolbar, i, 0);
        this.mTitleTextAppearance = obtainStyledAttributes.getResourceId(C0644j.Toolbar_titleTextAppearance, 0);
        this.mSubtitleTextAppearance = obtainStyledAttributes.getResourceId(C0644j.Toolbar_subtitleTextAppearance, 0);
        this.mGravity = obtainStyledAttributes.getInteger(C0644j.Toolbar_android_gravity, this.mGravity);
        this.mButtonGravity = obtainStyledAttributes.getInteger(C0644j.Toolbar_buttonGravity, 48);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C0644j.Toolbar_titleMargin, 0);
        if (obtainStyledAttributes.hasValue(C0644j.Toolbar_titleMargins)) {
            dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C0644j.Toolbar_titleMargins, dimensionPixelOffset);
        }
        this.mTitleMarginBottom = dimensionPixelOffset;
        this.mTitleMarginTop = dimensionPixelOffset;
        this.mTitleMarginEnd = dimensionPixelOffset;
        this.mTitleMarginStart = dimensionPixelOffset;
        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C0644j.Toolbar_titleMarginStart, -1);
        if (dimensionPixelOffset >= 0) {
            this.mTitleMarginStart = dimensionPixelOffset;
        }
        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C0644j.Toolbar_titleMarginEnd, -1);
        if (dimensionPixelOffset >= 0) {
            this.mTitleMarginEnd = dimensionPixelOffset;
        }
        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C0644j.Toolbar_titleMarginTop, -1);
        if (dimensionPixelOffset >= 0) {
            this.mTitleMarginTop = dimensionPixelOffset;
        }
        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C0644j.Toolbar_titleMarginBottom, -1);
        if (dimensionPixelOffset >= 0) {
            this.mTitleMarginBottom = dimensionPixelOffset;
        }
        this.mMaxButtonHeight = obtainStyledAttributes.getDimensionPixelSize(C0644j.Toolbar_maxButtonHeight, -1);
        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C0644j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(C0644j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0644j.Toolbar_contentInsetLeft, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(C0644j.Toolbar_contentInsetRight, 0);
        ensureContentInsets();
        this.mContentInsets.setAbsolute(dimensionPixelSize, dimensionPixelSize2);
        if (!(dimensionPixelOffset == Integer.MIN_VALUE && dimensionPixelOffset2 == Integer.MIN_VALUE)) {
            this.mContentInsets.setRelative(dimensionPixelOffset, dimensionPixelOffset2);
        }
        this.mContentInsetStartWithNavigation = obtainStyledAttributes.getDimensionPixelOffset(C0644j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = obtainStyledAttributes.getDimensionPixelOffset(C0644j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.mCollapseIcon = obtainStyledAttributes.getDrawable(C0644j.Toolbar_collapseIcon);
        this.mCollapseDescription = obtainStyledAttributes.getText(C0644j.Toolbar_collapseContentDescription);
        CharSequence text = obtainStyledAttributes.getText(C0644j.Toolbar_title);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        text = obtainStyledAttributes.getText(C0644j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(text)) {
            setSubtitle(text);
        }
        this.mPopupContext = getContext();
        setPopupTheme(obtainStyledAttributes.getResourceId(C0644j.Toolbar_popupTheme, 0));
        Drawable drawable = obtainStyledAttributes.getDrawable(C0644j.Toolbar_navigationIcon);
        if (drawable != null) {
            setNavigationIcon(drawable);
        }
        text = obtainStyledAttributes.getText(C0644j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(text)) {
            setNavigationContentDescription(text);
        }
        drawable = obtainStyledAttributes.getDrawable(C0644j.Toolbar_logo);
        if (drawable != null) {
            setLogo(drawable);
        }
        text = obtainStyledAttributes.getText(C0644j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(text)) {
            setLogoDescription(text);
        }
        if (obtainStyledAttributes.hasValue(C0644j.Toolbar_titleTextColor)) {
            setTitleTextColor(obtainStyledAttributes.getColor(C0644j.Toolbar_titleTextColor, -1));
        }
        if (obtainStyledAttributes.hasValue(C0644j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(obtainStyledAttributes.getColor(C0644j.Toolbar_subtitleTextColor, -1));
        }
        obtainStyledAttributes.recycle();
    }

    private void addCustomViewsWithGravity(List<View> list, int i) {
        int i2 = 0;
        int i3 = C0571r.m1369h(this) == 1 ? 1 : 0;
        int childCount = getChildCount();
        i = C0555d.m1224a(i, C0571r.m1369h(this));
        list.clear();
        View childAt;
        if (i3 != 0) {
            for (childCount--; childCount >= 0; childCount--) {
                childAt = getChildAt(childCount);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.mViewType == 0 && shouldLayout(childAt) && getChildHorizontalGravity(layoutParams.gravity) == i) {
                    list.add(childAt);
                }
            }
            return;
        }
        while (i2 < childCount) {
            childAt = getChildAt(i2);
            LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams2.mViewType == 0 && shouldLayout(childAt) && getChildHorizontalGravity(layoutParams2.gravity) == i) {
                list.add(childAt);
            }
            i2++;
        }
    }

    private void addSystemView(View view, boolean z) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (LayoutParams) layoutParams;
        layoutParams.mViewType = 1;
        if (!z || this.mExpandedActionView == null) {
            addView(view, layoutParams);
            return;
        }
        view.setLayoutParams(layoutParams);
        this.mHiddenViews.add(view);
    }

    private void ensureContentInsets() {
        if (this.mContentInsets == null) {
            this.mContentInsets = new RtlSpacingHelper();
        }
    }

    private void ensureLogoView() {
        if (this.mLogoView == null) {
            this.mLogoView = new AppCompatImageView(getContext());
        }
    }

    private void ensureMenu() {
        ensureMenuView();
        if (this.mMenuView.peekMenu() == null) {
            C4890h c4890h = (C4890h) this.mMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new ExpandedActionViewMenuPresenter();
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            c4890h.m9477a(this.mExpandedMenuPresenter, this.mPopupContext);
        }
    }

    private void ensureMenuView() {
        if (this.mMenuView == null) {
            this.mMenuView = new ActionMenuView(getContext());
            this.mMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            this.mMenuView.setMenuCallbacks(this.mActionMenuPresenterCallback, this.mMenuBuilderCallback);
            android.view.ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.gravity = 8388613 | (this.mButtonGravity & 112);
            this.mMenuView.setLayoutParams(generateDefaultLayoutParams);
            addSystemView(this.mMenuView, false);
        }
    }

    private void ensureNavButtonView() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new AppCompatImageButton(getContext(), null, C0635a.toolbarNavigationButtonStyle);
            android.view.ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.gravity = 8388611 | (this.mButtonGravity & 112);
            this.mNavButtonView.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private int getChildHorizontalGravity(int i) {
        int h = C0571r.m1369h(this);
        i = C0555d.m1224a(i, h) & 7;
        return (i == 1 || i == 3 || i == 5) ? i : h == 1 ? 5 : 3;
    }

    private int getChildTop(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        i = i > 0 ? (measuredHeight - i) / 2 : 0;
        int childVerticalGravity = getChildVerticalGravity(layoutParams.gravity);
        if (childVerticalGravity == 48) {
            return getPaddingTop() - i;
        }
        if (childVerticalGravity == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - layoutParams.bottomMargin) - i;
        }
        i = getPaddingTop();
        childVerticalGravity = getPaddingBottom();
        int height = getHeight();
        int i2 = (((height - i) - childVerticalGravity) - measuredHeight) / 2;
        if (i2 < layoutParams.topMargin) {
            i2 = layoutParams.topMargin;
        } else {
            height = (((height - childVerticalGravity) - measuredHeight) - i2) - i;
            if (height < layoutParams.bottomMargin) {
                i2 = Math.max(0, i2 - (layoutParams.bottomMargin - height));
            }
        }
        return i + i2;
    }

    private int getChildVerticalGravity(int i) {
        i &= 112;
        return (i == 16 || i == 48 || i == 80) ? i : this.mGravity & 112;
    }

    private int getHorizontalMargins(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return (VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginStart() : marginLayoutParams.leftMargin) + (VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginEnd() : marginLayoutParams.rightMargin);
    }

    private MenuInflater getMenuInflater() {
        return new C0711g(getContext());
    }

    private int getVerticalMargins(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int getViewListMeasuredWidth(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = i2;
        i2 = 0;
        int i4 = i2;
        while (i2 < size) {
            View view = (View) list.get(i2);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i5 = layoutParams.leftMargin - i;
            i = layoutParams.rightMargin - i3;
            i3 = Math.max(0, i5);
            int max = Math.max(0, i);
            i5 = Math.max(0, -i5);
            i4 += (i3 + view.getMeasuredWidth()) + max;
            i2++;
            i3 = Math.max(0, -i);
            i = i5;
        }
        return i4;
    }

    private boolean isChildOrHidden(View view) {
        if (view.getParent() != this) {
            if (!this.mHiddenViews.contains(view)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isCustomView(View view) {
        return ((LayoutParams) view.getLayoutParams()).mViewType == 0;
    }

    private int layoutChildLeft(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.leftMargin - iArr[0];
        i += Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int childTop = getChildTop(view, i2);
        i2 = view.getMeasuredWidth();
        view.layout(i, childTop, i + i2, view.getMeasuredHeight() + childTop);
        return i + (i2 + layoutParams.rightMargin);
    }

    private int layoutChildRight(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.rightMargin - iArr[1];
        i -= Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int childTop = getChildTop(view, i2);
        i2 = view.getMeasuredWidth();
        view.layout(i - i2, childTop, i, view.getMeasuredHeight() + childTop);
        return i - (i2 + layoutParams.leftMargin);
    }

    private int measureChildCollapseMargins(View view, int i, int i2, int i3, int i4, int[] iArr) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + max) + i2, marginLayoutParams.width), getChildMeasureSpec(i3, (((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void measureChildConstrained(View view, int i, int i2, int i3, int i4, int i5) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        i = getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width);
        i2 = getChildMeasureSpec(i3, (((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i4, marginLayoutParams.height);
        i3 = MeasureSpec.getMode(i2);
        if (i3 != 1073741824 && i5 >= 0) {
            if (i3 != 0) {
                i5 = Math.min(MeasureSpec.getSize(i2), i5);
            }
            i2 = MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(i, i2);
    }

    private void postShowOverflowMenu() {
        removeCallbacks(this.mShowOverflowMenuRunnable);
        post(this.mShowOverflowMenuRunnable);
    }

    private boolean shouldCollapse() {
        if (!this.mCollapsible) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (shouldLayout(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean shouldLayout(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    void addChildrenForExpandedActionView() {
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            addView((View) this.mHiddenViews.get(size));
        }
        this.mHiddenViews.clear();
    }

    public boolean canShowOverflowMenu() {
        return getVisibility() == 0 && this.mMenuView != null && this.mMenuView.isOverflowReserved();
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public void collapseActionView() {
        C4893j c4893j = this.mExpandedMenuPresenter == null ? null : this.mExpandedMenuPresenter.mCurrentExpandedItem;
        if (c4893j != null) {
            c4893j.collapseActionView();
        }
    }

    public void dismissPopupMenus() {
        if (this.mMenuView != null) {
            this.mMenuView.dismissPopupMenus();
        }
    }

    void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            this.mCollapseButtonView = new AppCompatImageButton(getContext(), null, C0635a.toolbarNavigationButtonStyle);
            this.mCollapseButtonView.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            android.view.ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.gravity = 8388611 | (this.mButtonGravity & 112);
            generateDefaultLayoutParams.mViewType = 2;
            this.mCollapseButtonView.setLayoutParams(generateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new C07833());
        }
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof C0660a ? new LayoutParams((C0660a) layoutParams) : layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getContentInsetEnd() {
        return this.mContentInsets != null ? this.mContentInsets.getEnd() : 0;
    }

    public int getContentInsetEndWithActions() {
        return this.mContentInsetEndWithActions != Integer.MIN_VALUE ? this.mContentInsetEndWithActions : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        return this.mContentInsets != null ? this.mContentInsets.getLeft() : 0;
    }

    public int getContentInsetRight() {
        return this.mContentInsets != null ? this.mContentInsets.getRight() : 0;
    }

    public int getContentInsetStart() {
        return this.mContentInsets != null ? this.mContentInsets.getStart() : 0;
    }

    public int getContentInsetStartWithNavigation() {
        return this.mContentInsetStartWithNavigation != Integer.MIN_VALUE ? this.mContentInsetStartWithNavigation : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        int i;
        if (this.mMenuView != null) {
            C4890h peekMenu = this.mMenuView.peekMenu();
            if (peekMenu != null && peekMenu.hasVisibleItems()) {
                i = 1;
                return i == 0 ? Math.max(getContentInsetEnd(), Math.max(this.mContentInsetEndWithActions, 0)) : getContentInsetEnd();
            }
        }
        i = 0;
        if (i == 0) {
        }
    }

    public int getCurrentContentInsetLeft() {
        return C0571r.m1369h(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C0571r.m1369h(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.mContentInsetStartWithNavigation, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        return this.mLogoView != null ? this.mLogoView.getDrawable() : null;
    }

    public CharSequence getLogoDescription() {
        return this.mLogoView != null ? this.mLogoView.getContentDescription() : null;
    }

    public Menu getMenu() {
        ensureMenu();
        return this.mMenuView.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        return this.mNavButtonView != null ? this.mNavButtonView.getContentDescription() : null;
    }

    public Drawable getNavigationIcon() {
        return this.mNavButtonView != null ? this.mNavButtonView.getDrawable() : null;
    }

    ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    public Drawable getOverflowIcon() {
        ensureMenu();
        return this.mMenuView.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.mPopupContext;
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    public DecorToolbar getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new ToolbarWidgetWrapper(this, true);
        }
        return this.mWrapper;
    }

    public boolean hasExpandedActionView() {
        return (this.mExpandedMenuPresenter == null || this.mExpandedMenuPresenter.mCurrentExpandedItem == null) ? false : true;
    }

    public boolean hideOverflowMenu() {
        return this.mMenuView != null && this.mMenuView.hideOverflowMenu();
    }

    public void inflateMenu(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public boolean isOverflowMenuShowPending() {
        return this.mMenuView != null && this.mMenuView.isOverflowMenuShowPending();
    }

    public boolean isOverflowMenuShowing() {
        return this.mMenuView != null && this.mMenuView.isOverflowMenuShowing();
    }

    public boolean isTitleTruncated() {
        if (this.mTitleTextView == null) {
            return false;
        }
        Layout layout = this.mTitleTextView.getLayout();
        if (layout == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return true;
            }
        }
        return false;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int layoutChildRight;
        int currentContentInsetLeft;
        int currentContentInsetRight;
        int max;
        boolean shouldLayout;
        boolean shouldLayout2;
        int i6;
        int i7;
        int i8;
        LayoutParams layoutParams;
        int i9;
        int i10;
        LayoutParams layoutParams2;
        Object obj;
        int i11;
        LayoutParams layoutParams3;
        int i12;
        Toolbar toolbar = this;
        int i13 = C0571r.m1369h(this) == 1 ? 1 : 0;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i14 = width - paddingRight;
        int[] iArr = toolbar.mTempMargins;
        iArr[1] = 0;
        iArr[0] = 0;
        int p = C0571r.m1379p(this);
        p = p >= 0 ? Math.min(p, i4 - i2) : 0;
        if (!shouldLayout(toolbar.mNavButtonView)) {
            i5 = paddingLeft;
        } else if (i13 != 0) {
            layoutChildRight = layoutChildRight(toolbar.mNavButtonView, i14, iArr, p);
            i5 = paddingLeft;
            if (shouldLayout(toolbar.mCollapseButtonView)) {
                if (i13 == 0) {
                    layoutChildRight = layoutChildRight(toolbar.mCollapseButtonView, layoutChildRight, iArr, p);
                } else {
                    i5 = layoutChildLeft(toolbar.mCollapseButtonView, i5, iArr, p);
                }
            }
            if (shouldLayout(toolbar.mMenuView)) {
                if (i13 == 0) {
                    i5 = layoutChildLeft(toolbar.mMenuView, i5, iArr, p);
                } else {
                    layoutChildRight = layoutChildRight(toolbar.mMenuView, layoutChildRight, iArr, p);
                }
            }
            currentContentInsetLeft = getCurrentContentInsetLeft();
            currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - i5);
            iArr[1] = Math.max(0, currentContentInsetRight - (i14 - layoutChildRight));
            max = Math.max(i5, currentContentInsetLeft);
            i14 = Math.min(layoutChildRight, i14 - currentContentInsetRight);
            if (shouldLayout(toolbar.mExpandedActionView)) {
                if (i13 == 0) {
                    i14 = layoutChildRight(toolbar.mExpandedActionView, i14, iArr, p);
                } else {
                    max = layoutChildLeft(toolbar.mExpandedActionView, max, iArr, p);
                }
            }
            if (shouldLayout(toolbar.mLogoView)) {
                if (i13 == 0) {
                    i14 = layoutChildRight(toolbar.mLogoView, i14, iArr, p);
                } else {
                    max = layoutChildLeft(toolbar.mLogoView, max, iArr, p);
                }
            }
            shouldLayout = shouldLayout(toolbar.mTitleTextView);
            shouldLayout2 = shouldLayout(toolbar.mSubtitleTextView);
            if (shouldLayout) {
                i6 = paddingRight;
                i7 = 0;
            } else {
                LayoutParams layoutParams4 = (LayoutParams) toolbar.mTitleTextView.getLayoutParams();
                i6 = paddingRight;
                i7 = ((layoutParams4.topMargin + toolbar.mTitleTextView.getMeasuredHeight()) + layoutParams4.bottomMargin) + 0;
            }
            if (shouldLayout2) {
                i8 = width;
            } else {
                layoutParams = (LayoutParams) toolbar.mSubtitleTextView.getLayoutParams();
                i8 = width;
                i7 += (layoutParams.topMargin + toolbar.mSubtitleTextView.getMeasuredHeight()) + layoutParams.bottomMargin;
            }
            if (!shouldLayout) {
                if (shouldLayout2) {
                    i9 = paddingLeft;
                    i10 = p;
                    paddingRight = 0;
                    addCustomViewsWithGravity(toolbar.mTempViews, 3);
                    i13 = toolbar.mTempViews.size();
                    i7 = max;
                    for (max = paddingRight; max < i13; max++) {
                        i7 = layoutChildLeft((View) toolbar.mTempViews.get(max), i7, iArr, i10);
                    }
                    p = i10;
                    addCustomViewsWithGravity(toolbar.mTempViews, 5);
                    i13 = toolbar.mTempViews.size();
                    for (max = paddingRight; max < i13; max++) {
                        i14 = layoutChildRight((View) toolbar.mTempViews.get(max), i14, iArr, p);
                    }
                    addCustomViewsWithGravity(toolbar.mTempViews, 1);
                    i13 = getViewListMeasuredWidth(toolbar.mTempViews, iArr);
                    max = (i9 + (((i8 - i9) - i6) / 2)) - (i13 / 2);
                    i13 += max;
                    if (max < i7) {
                        i7 = i13 <= i14 ? max - (i13 - i14) : max;
                    }
                    i13 = toolbar.mTempViews.size();
                    while (paddingRight < i13) {
                        i7 = layoutChildLeft((View) toolbar.mTempViews.get(paddingRight), i7, iArr, p);
                        paddingRight++;
                    }
                    toolbar.mTempViews.clear();
                }
            }
            layoutParams2 = (LayoutParams) (shouldLayout ? toolbar.mTitleTextView : toolbar.mSubtitleTextView).getLayoutParams();
            layoutParams = (LayoutParams) (shouldLayout2 ? toolbar.mSubtitleTextView : toolbar.mTitleTextView).getLayoutParams();
            if ((shouldLayout || toolbar.mTitleTextView.getMeasuredWidth() <= 0) && (!shouldLayout2 || toolbar.mSubtitleTextView.getMeasuredWidth() <= 0)) {
                i9 = paddingLeft;
                obj = null;
            } else {
                i9 = paddingLeft;
                obj = 1;
            }
            paddingLeft = toolbar.mGravity & 112;
            i10 = p;
            if (paddingLeft != 48) {
                i11 = max;
                paddingTop = (getPaddingTop() + layoutParams2.topMargin) + toolbar.mTitleMarginTop;
            } else if (paddingLeft == 80) {
                paddingLeft = (((height - paddingTop) - paddingBottom) - i7) / 2;
                i11 = max;
                if (paddingLeft >= layoutParams2.topMargin + toolbar.mTitleMarginTop) {
                    paddingLeft = layoutParams2.topMargin + toolbar.mTitleMarginTop;
                } else {
                    height = (((height - paddingBottom) - i7) - paddingLeft) - paddingTop;
                    if (height < layoutParams2.bottomMargin + toolbar.mTitleMarginBottom) {
                        paddingLeft = Math.max(0, paddingLeft - ((layoutParams.bottomMargin + toolbar.mTitleMarginBottom) - height));
                    }
                }
                paddingTop += paddingLeft;
            } else {
                i11 = max;
                paddingTop = (((height - paddingBottom) - layoutParams.bottomMargin) - toolbar.mTitleMarginBottom) - i7;
            }
            if (i13 == 0) {
                if (obj == null) {
                    i7 = toolbar.mTitleMarginStart;
                    i13 = 1;
                } else {
                    i13 = 1;
                    i7 = 0;
                }
                i7 -= iArr[i13];
                i14 -= Math.max(0, i7);
                iArr[i13] = Math.max(0, -i7);
                if (shouldLayout) {
                    max = i14;
                } else {
                    layoutParams3 = (LayoutParams) toolbar.mTitleTextView.getLayoutParams();
                    max = i14 - toolbar.mTitleTextView.getMeasuredWidth();
                    i7 = toolbar.mTitleTextView.getMeasuredHeight() + paddingTop;
                    toolbar.mTitleTextView.layout(max, paddingTop, i14, i7);
                    max -= toolbar.mTitleMarginEnd;
                    paddingTop = i7 + layoutParams3.bottomMargin;
                }
                if (shouldLayout2) {
                    i7 = i14;
                } else {
                    layoutParams3 = (LayoutParams) toolbar.mSubtitleTextView.getLayoutParams();
                    paddingTop += layoutParams3.topMargin;
                    toolbar.mSubtitleTextView.layout(i14 - toolbar.mSubtitleTextView.getMeasuredWidth(), paddingTop, i14, toolbar.mSubtitleTextView.getMeasuredHeight() + paddingTop);
                    i7 = i14 - toolbar.mTitleMarginEnd;
                    i13 = layoutParams3.bottomMargin;
                }
                if (obj != null) {
                    i14 = Math.min(max, i7);
                }
                max = i11;
                paddingRight = 0;
                addCustomViewsWithGravity(toolbar.mTempViews, 3);
                i13 = toolbar.mTempViews.size();
                i7 = max;
                for (max = paddingRight; max < i13; max++) {
                    i7 = layoutChildLeft((View) toolbar.mTempViews.get(max), i7, iArr, i10);
                }
                p = i10;
                addCustomViewsWithGravity(toolbar.mTempViews, 5);
                i13 = toolbar.mTempViews.size();
                for (max = paddingRight; max < i13; max++) {
                    i14 = layoutChildRight((View) toolbar.mTempViews.get(max), i14, iArr, p);
                }
                addCustomViewsWithGravity(toolbar.mTempViews, 1);
                i13 = getViewListMeasuredWidth(toolbar.mTempViews, iArr);
                max = (i9 + (((i8 - i9) - i6) / 2)) - (i13 / 2);
                i13 += max;
                if (max < i7) {
                    if (i13 <= i14) {
                    }
                }
                i13 = toolbar.mTempViews.size();
                while (paddingRight < i13) {
                    i7 = layoutChildLeft((View) toolbar.mTempViews.get(paddingRight), i7, iArr, p);
                    paddingRight++;
                }
                toolbar.mTempViews.clear();
            }
            if (obj == null) {
                i12 = toolbar.mTitleMarginStart;
                paddingRight = 0;
            } else {
                paddingRight = 0;
                i12 = 0;
            }
            i13 = i12 - iArr[paddingRight];
            max = i11 + Math.max(paddingRight, i13);
            iArr[paddingRight] = Math.max(paddingRight, -i13);
            if (shouldLayout) {
                i7 = max;
            } else {
                layoutParams3 = (LayoutParams) toolbar.mTitleTextView.getLayoutParams();
                i7 = toolbar.mTitleTextView.getMeasuredWidth() + max;
                width = toolbar.mTitleTextView.getMeasuredHeight() + paddingTop;
                toolbar.mTitleTextView.layout(max, paddingTop, i7, width);
                i7 += toolbar.mTitleMarginEnd;
                paddingTop = width + layoutParams3.bottomMargin;
            }
            if (shouldLayout2) {
                width = max;
            } else {
                layoutParams3 = (LayoutParams) toolbar.mSubtitleTextView.getLayoutParams();
                paddingTop += layoutParams3.topMargin;
                width = toolbar.mSubtitleTextView.getMeasuredWidth() + max;
                toolbar.mSubtitleTextView.layout(max, paddingTop, width, toolbar.mSubtitleTextView.getMeasuredHeight() + paddingTop);
                width += toolbar.mTitleMarginEnd;
                i13 = layoutParams3.bottomMargin;
            }
            if (obj != null) {
                max = Math.max(i7, width);
            }
            addCustomViewsWithGravity(toolbar.mTempViews, 3);
            i13 = toolbar.mTempViews.size();
            i7 = max;
            for (max = paddingRight; max < i13; max++) {
                i7 = layoutChildLeft((View) toolbar.mTempViews.get(max), i7, iArr, i10);
            }
            p = i10;
            addCustomViewsWithGravity(toolbar.mTempViews, 5);
            i13 = toolbar.mTempViews.size();
            for (max = paddingRight; max < i13; max++) {
                i14 = layoutChildRight((View) toolbar.mTempViews.get(max), i14, iArr, p);
            }
            addCustomViewsWithGravity(toolbar.mTempViews, 1);
            i13 = getViewListMeasuredWidth(toolbar.mTempViews, iArr);
            max = (i9 + (((i8 - i9) - i6) / 2)) - (i13 / 2);
            i13 += max;
            if (max < i7) {
                if (i13 <= i14) {
                }
            }
            i13 = toolbar.mTempViews.size();
            while (paddingRight < i13) {
                i7 = layoutChildLeft((View) toolbar.mTempViews.get(paddingRight), i7, iArr, p);
                paddingRight++;
            }
            toolbar.mTempViews.clear();
        } else {
            i5 = layoutChildLeft(toolbar.mNavButtonView, paddingLeft, iArr, p);
        }
        layoutChildRight = i14;
        if (shouldLayout(toolbar.mCollapseButtonView)) {
            if (i13 == 0) {
                i5 = layoutChildLeft(toolbar.mCollapseButtonView, i5, iArr, p);
            } else {
                layoutChildRight = layoutChildRight(toolbar.mCollapseButtonView, layoutChildRight, iArr, p);
            }
        }
        if (shouldLayout(toolbar.mMenuView)) {
            if (i13 == 0) {
                layoutChildRight = layoutChildRight(toolbar.mMenuView, layoutChildRight, iArr, p);
            } else {
                i5 = layoutChildLeft(toolbar.mMenuView, i5, iArr, p);
            }
        }
        currentContentInsetLeft = getCurrentContentInsetLeft();
        currentContentInsetRight = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft - i5);
        iArr[1] = Math.max(0, currentContentInsetRight - (i14 - layoutChildRight));
        max = Math.max(i5, currentContentInsetLeft);
        i14 = Math.min(layoutChildRight, i14 - currentContentInsetRight);
        if (shouldLayout(toolbar.mExpandedActionView)) {
            if (i13 == 0) {
                max = layoutChildLeft(toolbar.mExpandedActionView, max, iArr, p);
            } else {
                i14 = layoutChildRight(toolbar.mExpandedActionView, i14, iArr, p);
            }
        }
        if (shouldLayout(toolbar.mLogoView)) {
            if (i13 == 0) {
                max = layoutChildLeft(toolbar.mLogoView, max, iArr, p);
            } else {
                i14 = layoutChildRight(toolbar.mLogoView, i14, iArr, p);
            }
        }
        shouldLayout = shouldLayout(toolbar.mTitleTextView);
        shouldLayout2 = shouldLayout(toolbar.mSubtitleTextView);
        if (shouldLayout) {
            i6 = paddingRight;
            i7 = 0;
        } else {
            LayoutParams layoutParams42 = (LayoutParams) toolbar.mTitleTextView.getLayoutParams();
            i6 = paddingRight;
            i7 = ((layoutParams42.topMargin + toolbar.mTitleTextView.getMeasuredHeight()) + layoutParams42.bottomMargin) + 0;
        }
        if (shouldLayout2) {
            i8 = width;
        } else {
            layoutParams = (LayoutParams) toolbar.mSubtitleTextView.getLayoutParams();
            i8 = width;
            i7 += (layoutParams.topMargin + toolbar.mSubtitleTextView.getMeasuredHeight()) + layoutParams.bottomMargin;
        }
        if (shouldLayout) {
            if (shouldLayout2) {
                i9 = paddingLeft;
                i10 = p;
                paddingRight = 0;
                addCustomViewsWithGravity(toolbar.mTempViews, 3);
                i13 = toolbar.mTempViews.size();
                i7 = max;
                for (max = paddingRight; max < i13; max++) {
                    i7 = layoutChildLeft((View) toolbar.mTempViews.get(max), i7, iArr, i10);
                }
                p = i10;
                addCustomViewsWithGravity(toolbar.mTempViews, 5);
                i13 = toolbar.mTempViews.size();
                for (max = paddingRight; max < i13; max++) {
                    i14 = layoutChildRight((View) toolbar.mTempViews.get(max), i14, iArr, p);
                }
                addCustomViewsWithGravity(toolbar.mTempViews, 1);
                i13 = getViewListMeasuredWidth(toolbar.mTempViews, iArr);
                max = (i9 + (((i8 - i9) - i6) / 2)) - (i13 / 2);
                i13 += max;
                if (max < i7) {
                    if (i13 <= i14) {
                    }
                }
                i13 = toolbar.mTempViews.size();
                while (paddingRight < i13) {
                    i7 = layoutChildLeft((View) toolbar.mTempViews.get(paddingRight), i7, iArr, p);
                    paddingRight++;
                }
                toolbar.mTempViews.clear();
            }
        }
        if (shouldLayout) {
        }
        if (shouldLayout2) {
        }
        layoutParams2 = (LayoutParams) (shouldLayout ? toolbar.mTitleTextView : toolbar.mSubtitleTextView).getLayoutParams();
        layoutParams = (LayoutParams) (shouldLayout2 ? toolbar.mSubtitleTextView : toolbar.mTitleTextView).getLayoutParams();
        if (shouldLayout) {
        }
        i9 = paddingLeft;
        obj = null;
        paddingLeft = toolbar.mGravity & 112;
        i10 = p;
        if (paddingLeft != 48) {
            i11 = max;
            paddingTop = (getPaddingTop() + layoutParams2.topMargin) + toolbar.mTitleMarginTop;
        } else if (paddingLeft == 80) {
            i11 = max;
            paddingTop = (((height - paddingBottom) - layoutParams.bottomMargin) - toolbar.mTitleMarginBottom) - i7;
        } else {
            paddingLeft = (((height - paddingTop) - paddingBottom) - i7) / 2;
            i11 = max;
            if (paddingLeft >= layoutParams2.topMargin + toolbar.mTitleMarginTop) {
                height = (((height - paddingBottom) - i7) - paddingLeft) - paddingTop;
                if (height < layoutParams2.bottomMargin + toolbar.mTitleMarginBottom) {
                    paddingLeft = Math.max(0, paddingLeft - ((layoutParams.bottomMargin + toolbar.mTitleMarginBottom) - height));
                }
            } else {
                paddingLeft = layoutParams2.topMargin + toolbar.mTitleMarginTop;
            }
            paddingTop += paddingLeft;
        }
        if (i13 == 0) {
            if (obj == null) {
                paddingRight = 0;
                i12 = 0;
            } else {
                i12 = toolbar.mTitleMarginStart;
                paddingRight = 0;
            }
            i13 = i12 - iArr[paddingRight];
            max = i11 + Math.max(paddingRight, i13);
            iArr[paddingRight] = Math.max(paddingRight, -i13);
            if (shouldLayout) {
                i7 = max;
            } else {
                layoutParams3 = (LayoutParams) toolbar.mTitleTextView.getLayoutParams();
                i7 = toolbar.mTitleTextView.getMeasuredWidth() + max;
                width = toolbar.mTitleTextView.getMeasuredHeight() + paddingTop;
                toolbar.mTitleTextView.layout(max, paddingTop, i7, width);
                i7 += toolbar.mTitleMarginEnd;
                paddingTop = width + layoutParams3.bottomMargin;
            }
            if (shouldLayout2) {
                width = max;
            } else {
                layoutParams3 = (LayoutParams) toolbar.mSubtitleTextView.getLayoutParams();
                paddingTop += layoutParams3.topMargin;
                width = toolbar.mSubtitleTextView.getMeasuredWidth() + max;
                toolbar.mSubtitleTextView.layout(max, paddingTop, width, toolbar.mSubtitleTextView.getMeasuredHeight() + paddingTop);
                width += toolbar.mTitleMarginEnd;
                i13 = layoutParams3.bottomMargin;
            }
            if (obj != null) {
                max = Math.max(i7, width);
            }
            addCustomViewsWithGravity(toolbar.mTempViews, 3);
            i13 = toolbar.mTempViews.size();
            i7 = max;
            for (max = paddingRight; max < i13; max++) {
                i7 = layoutChildLeft((View) toolbar.mTempViews.get(max), i7, iArr, i10);
            }
            p = i10;
            addCustomViewsWithGravity(toolbar.mTempViews, 5);
            i13 = toolbar.mTempViews.size();
            for (max = paddingRight; max < i13; max++) {
                i14 = layoutChildRight((View) toolbar.mTempViews.get(max), i14, iArr, p);
            }
            addCustomViewsWithGravity(toolbar.mTempViews, 1);
            i13 = getViewListMeasuredWidth(toolbar.mTempViews, iArr);
            max = (i9 + (((i8 - i9) - i6) / 2)) - (i13 / 2);
            i13 += max;
            if (max < i7) {
                if (i13 <= i14) {
                }
            }
            i13 = toolbar.mTempViews.size();
            while (paddingRight < i13) {
                i7 = layoutChildLeft((View) toolbar.mTempViews.get(paddingRight), i7, iArr, p);
                paddingRight++;
            }
            toolbar.mTempViews.clear();
        }
        if (obj == null) {
            i13 = 1;
            i7 = 0;
        } else {
            i7 = toolbar.mTitleMarginStart;
            i13 = 1;
        }
        i7 -= iArr[i13];
        i14 -= Math.max(0, i7);
        iArr[i13] = Math.max(0, -i7);
        if (shouldLayout) {
            max = i14;
        } else {
            layoutParams3 = (LayoutParams) toolbar.mTitleTextView.getLayoutParams();
            max = i14 - toolbar.mTitleTextView.getMeasuredWidth();
            i7 = toolbar.mTitleTextView.getMeasuredHeight() + paddingTop;
            toolbar.mTitleTextView.layout(max, paddingTop, i14, i7);
            max -= toolbar.mTitleMarginEnd;
            paddingTop = i7 + layoutParams3.bottomMargin;
        }
        if (shouldLayout2) {
            i7 = i14;
        } else {
            layoutParams3 = (LayoutParams) toolbar.mSubtitleTextView.getLayoutParams();
            paddingTop += layoutParams3.topMargin;
            toolbar.mSubtitleTextView.layout(i14 - toolbar.mSubtitleTextView.getMeasuredWidth(), paddingTop, i14, toolbar.mSubtitleTextView.getMeasuredHeight() + paddingTop);
            i7 = i14 - toolbar.mTitleMarginEnd;
            i13 = layoutParams3.bottomMargin;
        }
        if (obj != null) {
            i14 = Math.min(max, i7);
        }
        max = i11;
        paddingRight = 0;
        addCustomViewsWithGravity(toolbar.mTempViews, 3);
        i13 = toolbar.mTempViews.size();
        i7 = max;
        for (max = paddingRight; max < i13; max++) {
            i7 = layoutChildLeft((View) toolbar.mTempViews.get(max), i7, iArr, i10);
        }
        p = i10;
        addCustomViewsWithGravity(toolbar.mTempViews, 5);
        i13 = toolbar.mTempViews.size();
        for (max = paddingRight; max < i13; max++) {
            i14 = layoutChildRight((View) toolbar.mTempViews.get(max), i14, iArr, p);
        }
        addCustomViewsWithGravity(toolbar.mTempViews, 1);
        i13 = getViewListMeasuredWidth(toolbar.mTempViews, iArr);
        max = (i9 + (((i8 - i9) - i6) / 2)) - (i13 / 2);
        i13 += max;
        if (max < i7) {
            if (i13 <= i14) {
            }
        }
        i13 = toolbar.mTempViews.size();
        while (paddingRight < i13) {
            i7 = layoutChildLeft((View) toolbar.mTempViews.get(paddingRight), i7, iArr, p);
            paddingRight++;
        }
        toolbar.mTempViews.clear();
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int measuredWidth;
        int max;
        int combineMeasuredStates;
        int measuredHeight;
        int combineMeasuredStates2;
        int[] iArr = this.mTempMargins;
        if (ViewUtils.isLayoutRtl(this)) {
            i3 = 1;
            i4 = 0;
        } else {
            i4 = 1;
            i3 = 0;
        }
        if (shouldLayout(r7.mNavButtonView)) {
            measureChildConstrained(r7.mNavButtonView, i, 0, i2, 0, r7.mMaxButtonHeight);
            measuredWidth = r7.mNavButtonView.getMeasuredWidth() + getHorizontalMargins(r7.mNavButtonView);
            max = Math.max(0, r7.mNavButtonView.getMeasuredHeight() + getVerticalMargins(r7.mNavButtonView));
            combineMeasuredStates = View.combineMeasuredStates(0, r7.mNavButtonView.getMeasuredState());
        } else {
            measuredWidth = 0;
            max = measuredWidth;
            combineMeasuredStates = max;
        }
        if (shouldLayout(r7.mCollapseButtonView)) {
            measureChildConstrained(r7.mCollapseButtonView, i, 0, i2, 0, r7.mMaxButtonHeight);
            measuredWidth = r7.mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(r7.mCollapseButtonView);
            max = Math.max(max, r7.mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(r7.mCollapseButtonView));
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, r7.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max2 = 0 + Math.max(currentContentInsetStart, measuredWidth);
        iArr[i3] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (shouldLayout(r7.mMenuView)) {
            measureChildConstrained(r7.mMenuView, i, max2, i2, 0, r7.mMaxButtonHeight);
            measuredWidth = r7.mMenuView.getMeasuredWidth() + getHorizontalMargins(r7.mMenuView);
            max = Math.max(max, r7.mMenuView.getMeasuredHeight() + getVerticalMargins(r7.mMenuView));
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, r7.mMenuView.getMeasuredState());
        } else {
            measuredWidth = 0;
        }
        currentContentInsetStart = getCurrentContentInsetEnd();
        i3 = max2 + Math.max(currentContentInsetStart, measuredWidth);
        iArr[i4] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (shouldLayout(r7.mExpandedActionView)) {
            i3 += measureChildCollapseMargins(r7.mExpandedActionView, i, i3, i2, 0, iArr);
            max = Math.max(max, r7.mExpandedActionView.getMeasuredHeight() + getVerticalMargins(r7.mExpandedActionView));
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, r7.mExpandedActionView.getMeasuredState());
        }
        if (shouldLayout(r7.mLogoView)) {
            i3 += measureChildCollapseMargins(r7.mLogoView, i, i3, i2, 0, iArr);
            max = Math.max(max, r7.mLogoView.getMeasuredHeight() + getVerticalMargins(r7.mLogoView));
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, r7.mLogoView.getMeasuredState());
        }
        i4 = getChildCount();
        max2 = max;
        max = i3;
        for (i3 = 0; i3 < i4; i3++) {
            View childAt = getChildAt(i3);
            if (((LayoutParams) childAt.getLayoutParams()).mViewType == 0 && shouldLayout(childAt)) {
                max += measureChildCollapseMargins(childAt, i, max, i2, 0, iArr);
                max2 = Math.max(max2, childAt.getMeasuredHeight() + getVerticalMargins(childAt));
                combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, childAt.getMeasuredState());
            }
        }
        i3 = r7.mTitleMarginTop + r7.mTitleMarginBottom;
        i4 = r7.mTitleMarginStart + r7.mTitleMarginEnd;
        if (shouldLayout(r7.mTitleTextView)) {
            measureChildCollapseMargins(r7.mTitleTextView, i, max + i4, i2, i3, iArr);
            measuredWidth = r7.mTitleTextView.getMeasuredWidth() + getHorizontalMargins(r7.mTitleTextView);
            measuredHeight = r7.mTitleTextView.getMeasuredHeight() + getVerticalMargins(r7.mTitleTextView);
            combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, r7.mTitleTextView.getMeasuredState());
            combineMeasuredStates = measuredWidth;
        } else {
            measuredHeight = 0;
            combineMeasuredStates2 = combineMeasuredStates;
            combineMeasuredStates = measuredHeight;
        }
        if (shouldLayout(r7.mSubtitleTextView)) {
            int i5 = measuredHeight + i3;
            i3 = combineMeasuredStates2;
            combineMeasuredStates = Math.max(combineMeasuredStates, measureChildCollapseMargins(r7.mSubtitleTextView, i, max + i4, i2, i5, iArr));
            measuredHeight += r7.mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(r7.mSubtitleTextView);
            combineMeasuredStates2 = View.combineMeasuredStates(i3, r7.mSubtitleTextView.getMeasuredState());
        } else {
            i3 = combineMeasuredStates2;
        }
        max += combineMeasuredStates;
        measuredWidth = Math.max(max2, measuredHeight) + (getPaddingTop() + getPaddingBottom());
        int i6 = i;
        currentContentInsetStart = View.resolveSizeAndState(Math.max(max + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i6, -16777216 & combineMeasuredStates2);
        measuredWidth = View.resolveSizeAndState(Math.max(measuredWidth, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16);
        if (shouldCollapse()) {
            measuredWidth = 0;
        }
        setMeasuredDimension(currentContentInsetStart, measuredWidth);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            Menu peekMenu = this.mMenuView != null ? this.mMenuView.peekMenu() : null;
            if (!(savedState.expandedMenuItemId == 0 || this.mExpandedMenuPresenter == null || peekMenu == null)) {
                MenuItem findItem = peekMenu.findItem(savedState.expandedMenuItemId);
                if (findItem != null) {
                    findItem.expandActionView();
                }
            }
            if (savedState.isOverflowOpen) {
                postShowOverflowMenu();
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void onRtlPropertiesChanged(int i) {
        if (VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        ensureContentInsets();
        RtlSpacingHelper rtlSpacingHelper = this.mContentInsets;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        rtlSpacingHelper.setDirection(z);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        if (!(this.mExpandedMenuPresenter == null || this.mExpandedMenuPresenter.mCurrentExpandedItem == null)) {
            savedState.expandedMenuItemId = this.mExpandedMenuPresenter.mCurrentExpandedItem.getItemId();
        }
        savedState.isOverflowOpen = isOverflowMenuShowing();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    void removeChildrenForExpandedActionView() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((LayoutParams) childAt.getLayoutParams()).mViewType == 2 || childAt == this.mMenuView)) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.mCollapsible = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        ensureContentInsets();
        this.mContentInsets.setAbsolute(i, i2);
    }

    public void setContentInsetsRelative(int i, int i2) {
        ensureContentInsets();
        this.mContentInsets.setRelative(i, i2);
    }

    public void setLogo(int i) {
        setLogo(C0683b.m1656b(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            ensureLogoView();
            if (!isChildOrHidden(this.mLogoView)) {
                addSystemView(this.mLogoView, true);
            }
        } else if (this.mLogoView != null && isChildOrHidden(this.mLogoView)) {
            removeView(this.mLogoView);
            this.mHiddenViews.remove(this.mLogoView);
        }
        if (this.mLogoView != null) {
            this.mLogoView.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureLogoView();
        }
        if (this.mLogoView != null) {
            this.mLogoView.setContentDescription(charSequence);
        }
    }

    public void setMenu(C4890h c4890h, ActionMenuPresenter actionMenuPresenter) {
        if (c4890h != null || this.mMenuView != null) {
            ensureMenuView();
            C4890h peekMenu = this.mMenuView.peekMenu();
            if (peekMenu != c4890h) {
                if (peekMenu != null) {
                    peekMenu.m9483b(this.mOuterActionMenuPresenter);
                    peekMenu.m9483b(this.mExpandedMenuPresenter);
                }
                if (this.mExpandedMenuPresenter == null) {
                    this.mExpandedMenuPresenter = new ExpandedActionViewMenuPresenter();
                }
                actionMenuPresenter.setExpandedActionViewsExclusive(true);
                if (c4890h != null) {
                    c4890h.m9477a((C0727o) actionMenuPresenter, this.mPopupContext);
                    c4890h.m9477a(this.mExpandedMenuPresenter, this.mPopupContext);
                } else {
                    actionMenuPresenter.initForMenu(this.mPopupContext, null);
                    this.mExpandedMenuPresenter.initForMenu(this.mPopupContext, null);
                    actionMenuPresenter.updateMenuView(true);
                    this.mExpandedMenuPresenter.updateMenuView(true);
                }
                this.mMenuView.setPopupTheme(this.mPopupTheme);
                this.mMenuView.setPresenter(actionMenuPresenter);
                this.mOuterActionMenuPresenter = actionMenuPresenter;
            }
        }
    }

    public void setMenuCallbacks(C0726a c0726a, C0722a c0722a) {
        this.mActionMenuPresenterCallback = c0726a;
        this.mMenuBuilderCallback = c0722a;
        if (this.mMenuView != null) {
            this.mMenuView.setMenuCallbacks(c0726a, c0722a);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureNavButtonView();
        }
        if (this.mNavButtonView != null) {
            this.mNavButtonView.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0683b.m1656b(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            ensureNavButtonView();
            if (!isChildOrHidden(this.mNavButtonView)) {
                addSystemView(this.mNavButtonView, true);
            }
        } else if (this.mNavButtonView != null && isChildOrHidden(this.mNavButtonView)) {
            removeView(this.mNavButtonView);
            this.mHiddenViews.remove(this.mNavButtonView);
        }
        if (this.mNavButtonView != null) {
            this.mNavButtonView.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(OnClickListener onClickListener) {
        ensureNavButtonView();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mOnMenuItemClickListener = onMenuItemClickListener;
    }

    public void setOverflowIcon(Drawable drawable) {
        ensureMenu();
        this.mMenuView.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.mPopupTheme != i) {
            this.mPopupTheme = i;
            if (i == 0) {
                this.mPopupContext = getContext();
                return;
            }
            this.mPopupContext = new ContextThemeWrapper(getContext(), i);
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mSubtitleTextView == null) {
                Context context = getContext();
                this.mSubtitleTextView = new AppCompatTextView(context);
                this.mSubtitleTextView.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TruncateAt.END);
                if (this.mSubtitleTextAppearance != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, this.mSubtitleTextAppearance);
                }
                if (this.mSubtitleTextColor != 0) {
                    this.mSubtitleTextView.setTextColor(this.mSubtitleTextColor);
                }
            }
            if (!isChildOrHidden(this.mSubtitleTextView)) {
                addSystemView(this.mSubtitleTextView, true);
            }
        } else if (this.mSubtitleTextView != null && isChildOrHidden(this.mSubtitleTextView)) {
            removeView(this.mSubtitleTextView);
            this.mHiddenViews.remove(this.mSubtitleTextView);
        }
        if (this.mSubtitleTextView != null) {
            this.mSubtitleTextView.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setSubtitleTextAppearance(Context context, int i) {
        this.mSubtitleTextAppearance = i;
        if (this.mSubtitleTextView != null) {
            this.mSubtitleTextView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextColor(int i) {
        this.mSubtitleTextColor = i;
        if (this.mSubtitleTextView != null) {
            this.mSubtitleTextView.setTextColor(i);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                this.mTitleTextView = new AppCompatTextView(context);
                this.mTitleTextView.setSingleLine();
                this.mTitleTextView.setEllipsize(TruncateAt.END);
                if (this.mTitleTextAppearance != 0) {
                    this.mTitleTextView.setTextAppearance(context, this.mTitleTextAppearance);
                }
                if (this.mTitleTextColor != 0) {
                    this.mTitleTextView.setTextColor(this.mTitleTextColor);
                }
            }
            if (!isChildOrHidden(this.mTitleTextView)) {
                addSystemView(this.mTitleTextView, true);
            }
        } else if (this.mTitleTextView != null && isChildOrHidden(this.mTitleTextView)) {
            removeView(this.mTitleTextView);
            this.mHiddenViews.remove(this.mTitleTextView);
        }
        if (this.mTitleTextView != null) {
            this.mTitleTextView.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.mTitleMarginStart = i;
        this.mTitleMarginTop = i2;
        this.mTitleMarginEnd = i3;
        this.mTitleMarginBottom = i4;
        requestLayout();
    }

    public void setTitleMarginBottom(int i) {
        this.mTitleMarginBottom = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.mTitleMarginEnd = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.mTitleMarginStart = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.mTitleMarginTop = i;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, int i) {
        this.mTitleTextAppearance = i;
        if (this.mTitleTextView != null) {
            this.mTitleTextView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i) {
        this.mTitleTextColor = i;
        if (this.mTitleTextView != null) {
            this.mTitleTextView.setTextColor(i);
        }
    }

    public boolean showOverflowMenu() {
        return this.mMenuView != null && this.mMenuView.showOverflowMenu();
    }
}
