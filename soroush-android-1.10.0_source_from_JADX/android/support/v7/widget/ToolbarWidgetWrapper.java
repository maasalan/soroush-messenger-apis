package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.view.C0571r;
import android.support.v4.view.C0579v;
import android.support.v4.view.C4847x;
import android.support.v7.p041a.C0645a.C0635a;
import android.support.v7.p041a.C0645a.C0639e;
import android.support.v7.p041a.C0645a.C0640f;
import android.support.v7.p041a.C0645a.C0642h;
import android.support.v7.p041a.C0645a.C0644j;
import android.support.v7.p043c.p044a.C0683b;
import android.support.v7.view.menu.C0727o.C0726a;
import android.support.v7.view.menu.C4885a;
import android.support.v7.view.menu.C4890h;
import android.support.v7.view.menu.C4890h.C0722a;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class ToolbarWidgetWrapper implements DecorToolbar {
    private static final int AFFECTS_LOGO_MASK = 3;
    private static final long DEFAULT_FADE_DURATION_MS = 200;
    private static final String TAG = "ToolbarWidgetWrapper";
    private ActionMenuPresenter mActionMenuPresenter;
    private View mCustomView;
    private int mDefaultNavigationContentDescription;
    private Drawable mDefaultNavigationIcon;
    private int mDisplayOpts;
    private CharSequence mHomeDescription;
    private Drawable mIcon;
    private Drawable mLogo;
    boolean mMenuPrepared;
    private Drawable mNavIcon;
    private int mNavigationMode;
    private Spinner mSpinner;
    private CharSequence mSubtitle;
    private View mTabView;
    CharSequence mTitle;
    private boolean mTitleSet;
    Toolbar mToolbar;
    Callback mWindowCallback;

    class C07851 implements OnClickListener {
        final C4885a mNavItem = new C4885a(ToolbarWidgetWrapper.this.mToolbar.getContext(), ToolbarWidgetWrapper.this.mTitle);

        C07851() {
        }

        public void onClick(View view) {
            if (ToolbarWidgetWrapper.this.mWindowCallback != null && ToolbarWidgetWrapper.this.mMenuPrepared) {
                ToolbarWidgetWrapper.this.mWindowCallback.onMenuItemSelected(0, this.mNavItem);
            }
        }
    }

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z) {
        this(toolbar, z, C0642h.abc_action_bar_up_description, C0639e.abc_ic_ab_back_material);
    }

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z, int i, int i2) {
        this.mNavigationMode = 0;
        this.mDefaultNavigationContentDescription = 0;
        this.mToolbar = toolbar;
        this.mTitle = toolbar.getTitle();
        this.mSubtitle = toolbar.getSubtitle();
        this.mTitleSet = this.mTitle != null;
        this.mNavIcon = toolbar.getNavigationIcon();
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(toolbar.getContext(), null, C0644j.ActionBar, C0635a.actionBarStyle, 0);
        this.mDefaultNavigationIcon = obtainStyledAttributes.getDrawable(C0644j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence text = obtainStyledAttributes.getText(C0644j.ActionBar_title);
            if (!TextUtils.isEmpty(text)) {
                setTitle(text);
            }
            text = obtainStyledAttributes.getText(C0644j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(text)) {
                setSubtitle(text);
            }
            Drawable drawable = obtainStyledAttributes.getDrawable(C0644j.ActionBar_logo);
            if (drawable != null) {
                setLogo(drawable);
            }
            drawable = obtainStyledAttributes.getDrawable(C0644j.ActionBar_icon);
            if (drawable != null) {
                setIcon(drawable);
            }
            if (this.mNavIcon == null && this.mDefaultNavigationIcon != null) {
                setNavigationIcon(this.mDefaultNavigationIcon);
            }
            setDisplayOptions(obtainStyledAttributes.getInt(C0644j.ActionBar_displayOptions, 0));
            int resourceId = obtainStyledAttributes.getResourceId(C0644j.ActionBar_customNavigationLayout, 0);
            if (resourceId != 0) {
                setCustomView(LayoutInflater.from(this.mToolbar.getContext()).inflate(resourceId, this.mToolbar, false));
                setDisplayOptions(this.mDisplayOpts | 16);
            }
            resourceId = obtainStyledAttributes.getLayoutDimension(C0644j.ActionBar_height, 0);
            if (resourceId > 0) {
                LayoutParams layoutParams = this.mToolbar.getLayoutParams();
                layoutParams.height = resourceId;
                this.mToolbar.setLayoutParams(layoutParams);
            }
            resourceId = obtainStyledAttributes.getDimensionPixelOffset(C0644j.ActionBar_contentInsetStart, -1);
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C0644j.ActionBar_contentInsetEnd, -1);
            if (resourceId >= 0 || dimensionPixelOffset >= 0) {
                this.mToolbar.setContentInsetsRelative(Math.max(resourceId, 0), Math.max(dimensionPixelOffset, 0));
            }
            resourceId = obtainStyledAttributes.getResourceId(C0644j.ActionBar_titleTextStyle, 0);
            if (resourceId != 0) {
                this.mToolbar.setTitleTextAppearance(this.mToolbar.getContext(), resourceId);
            }
            resourceId = obtainStyledAttributes.getResourceId(C0644j.ActionBar_subtitleTextStyle, 0);
            if (resourceId != 0) {
                this.mToolbar.setSubtitleTextAppearance(this.mToolbar.getContext(), resourceId);
            }
            resourceId = obtainStyledAttributes.getResourceId(C0644j.ActionBar_popupTheme, 0);
            if (resourceId != 0) {
                this.mToolbar.setPopupTheme(resourceId);
            }
        } else {
            this.mDisplayOpts = detectDisplayOptions();
        }
        obtainStyledAttributes.recycle();
        setDefaultNavigationContentDescription(i);
        this.mHomeDescription = this.mToolbar.getNavigationContentDescription();
        this.mToolbar.setNavigationOnClickListener(new C07851());
    }

    private int detectDisplayOptions() {
        if (this.mToolbar.getNavigationIcon() == null) {
            return 11;
        }
        this.mDefaultNavigationIcon = this.mToolbar.getNavigationIcon();
        return 15;
    }

    private void ensureSpinner() {
        if (this.mSpinner == null) {
            this.mSpinner = new AppCompatSpinner(getContext(), null, C0635a.actionDropDownStyle);
            this.mSpinner.setLayoutParams(new Toolbar.LayoutParams(-2, -2, 8388627));
        }
    }

    private void setTitleInt(CharSequence charSequence) {
        this.mTitle = charSequence;
        if ((this.mDisplayOpts & 8) != 0) {
            this.mToolbar.setTitle(charSequence);
        }
    }

    private void updateHomeAccessibility() {
        if ((this.mDisplayOpts & 4) != 0) {
            if (TextUtils.isEmpty(this.mHomeDescription)) {
                this.mToolbar.setNavigationContentDescription(this.mDefaultNavigationContentDescription);
                return;
            }
            this.mToolbar.setNavigationContentDescription(this.mHomeDescription);
        }
    }

    private void updateNavigationIcon() {
        if ((this.mDisplayOpts & 4) != 0) {
            this.mToolbar.setNavigationIcon(this.mNavIcon != null ? this.mNavIcon : this.mDefaultNavigationIcon);
        } else {
            this.mToolbar.setNavigationIcon(null);
        }
    }

    private void updateToolbarLogo() {
        Drawable drawable = (this.mDisplayOpts & 2) != 0 ? ((this.mDisplayOpts & 1) == 0 || this.mLogo == null) ? this.mIcon : this.mLogo : null;
        this.mToolbar.setLogo(drawable);
    }

    public void animateToVisibility(int i) {
        C0579v c0579v = setupAnimatorToVisibility(i, DEFAULT_FADE_DURATION_MS);
        if (c0579v != null) {
            c0579v.m1417b();
        }
    }

    public boolean canShowOverflowMenu() {
        return this.mToolbar.canShowOverflowMenu();
    }

    public void collapseActionView() {
        this.mToolbar.collapseActionView();
    }

    public void dismissPopupMenus() {
        this.mToolbar.dismissPopupMenus();
    }

    public Context getContext() {
        return this.mToolbar.getContext();
    }

    public View getCustomView() {
        return this.mCustomView;
    }

    public int getDisplayOptions() {
        return this.mDisplayOpts;
    }

    public int getDropdownItemCount() {
        return this.mSpinner != null ? this.mSpinner.getCount() : 0;
    }

    public int getDropdownSelectedPosition() {
        return this.mSpinner != null ? this.mSpinner.getSelectedItemPosition() : 0;
    }

    public int getHeight() {
        return this.mToolbar.getHeight();
    }

    public Menu getMenu() {
        return this.mToolbar.getMenu();
    }

    public int getNavigationMode() {
        return this.mNavigationMode;
    }

    public CharSequence getSubtitle() {
        return this.mToolbar.getSubtitle();
    }

    public CharSequence getTitle() {
        return this.mToolbar.getTitle();
    }

    public ViewGroup getViewGroup() {
        return this.mToolbar;
    }

    public int getVisibility() {
        return this.mToolbar.getVisibility();
    }

    public boolean hasEmbeddedTabs() {
        return this.mTabView != null;
    }

    public boolean hasExpandedActionView() {
        return this.mToolbar.hasExpandedActionView();
    }

    public boolean hasIcon() {
        return this.mIcon != null;
    }

    public boolean hasLogo() {
        return this.mLogo != null;
    }

    public boolean hideOverflowMenu() {
        return this.mToolbar.hideOverflowMenu();
    }

    public void initIndeterminateProgress() {
        Log.i(TAG, "Progress display unsupported");
    }

    public void initProgress() {
        Log.i(TAG, "Progress display unsupported");
    }

    public boolean isOverflowMenuShowPending() {
        return this.mToolbar.isOverflowMenuShowPending();
    }

    public boolean isOverflowMenuShowing() {
        return this.mToolbar.isOverflowMenuShowing();
    }

    public boolean isTitleTruncated() {
        return this.mToolbar.isTitleTruncated();
    }

    public void restoreHierarchyState(SparseArray<Parcelable> sparseArray) {
        this.mToolbar.restoreHierarchyState(sparseArray);
    }

    public void saveHierarchyState(SparseArray<Parcelable> sparseArray) {
        this.mToolbar.saveHierarchyState(sparseArray);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        C0571r.m1339a(this.mToolbar, drawable);
    }

    public void setCollapsible(boolean z) {
        this.mToolbar.setCollapsible(z);
    }

    public void setCustomView(View view) {
        if (!(this.mCustomView == null || (this.mDisplayOpts & 16) == 0)) {
            this.mToolbar.removeView(this.mCustomView);
        }
        this.mCustomView = view;
        if (view != null && (this.mDisplayOpts & 16) != 0) {
            this.mToolbar.addView(this.mCustomView);
        }
    }

    public void setDefaultNavigationContentDescription(int i) {
        if (i != this.mDefaultNavigationContentDescription) {
            this.mDefaultNavigationContentDescription = i;
            if (TextUtils.isEmpty(this.mToolbar.getNavigationContentDescription())) {
                setNavigationContentDescription(this.mDefaultNavigationContentDescription);
            }
        }
    }

    public void setDefaultNavigationIcon(Drawable drawable) {
        if (this.mDefaultNavigationIcon != drawable) {
            this.mDefaultNavigationIcon = drawable;
            updateNavigationIcon();
        }
    }

    public void setDisplayOptions(int i) {
        int i2 = this.mDisplayOpts ^ i;
        this.mDisplayOpts = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    updateHomeAccessibility();
                }
                updateNavigationIcon();
            }
            if ((i2 & 3) != 0) {
                updateToolbarLogo();
            }
            if ((i2 & 8) != 0) {
                Toolbar toolbar;
                CharSequence charSequence;
                if ((i & 8) != 0) {
                    this.mToolbar.setTitle(this.mTitle);
                    toolbar = this.mToolbar;
                    charSequence = this.mSubtitle;
                } else {
                    charSequence = null;
                    this.mToolbar.setTitle(null);
                    toolbar = this.mToolbar;
                }
                toolbar.setSubtitle(charSequence);
            }
            if (!((i2 & 16) == 0 || this.mCustomView == null)) {
                if ((i & 16) != 0) {
                    this.mToolbar.addView(this.mCustomView);
                    return;
                }
                this.mToolbar.removeView(this.mCustomView);
            }
        }
    }

    public void setDropdownParams(SpinnerAdapter spinnerAdapter, OnItemSelectedListener onItemSelectedListener) {
        ensureSpinner();
        this.mSpinner.setAdapter(spinnerAdapter);
        this.mSpinner.setOnItemSelectedListener(onItemSelectedListener);
    }

    public void setDropdownSelectedPosition(int i) {
        if (this.mSpinner == null) {
            throw new IllegalStateException("Can't set dropdown selected position without an adapter");
        }
        this.mSpinner.setSelection(i);
    }

    public void setEmbeddedTabView(ScrollingTabContainerView scrollingTabContainerView) {
        if (this.mTabView != null && this.mTabView.getParent() == this.mToolbar) {
            this.mToolbar.removeView(this.mTabView);
        }
        this.mTabView = scrollingTabContainerView;
        if (scrollingTabContainerView != null && this.mNavigationMode == 2) {
            this.mToolbar.addView(this.mTabView, 0);
            Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.mTabView.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.gravity = 8388691;
            scrollingTabContainerView.setAllowCollapse(true);
        }
    }

    public void setHomeButtonEnabled(boolean z) {
    }

    public void setIcon(int i) {
        setIcon(i != 0 ? C0683b.m1656b(getContext(), i) : null);
    }

    public void setIcon(Drawable drawable) {
        this.mIcon = drawable;
        updateToolbarLogo();
    }

    public void setLogo(int i) {
        setLogo(i != 0 ? C0683b.m1656b(getContext(), i) : null);
    }

    public void setLogo(Drawable drawable) {
        this.mLogo = drawable;
        updateToolbarLogo();
    }

    public void setMenu(Menu menu, C0726a c0726a) {
        if (this.mActionMenuPresenter == null) {
            this.mActionMenuPresenter = new ActionMenuPresenter(this.mToolbar.getContext());
            this.mActionMenuPresenter.setId(C0640f.action_menu_presenter);
        }
        this.mActionMenuPresenter.setCallback(c0726a);
        this.mToolbar.setMenu((C4890h) menu, this.mActionMenuPresenter);
    }

    public void setMenuCallbacks(C0726a c0726a, C0722a c0722a) {
        this.mToolbar.setMenuCallbacks(c0726a, c0722a);
    }

    public void setMenuPrepared() {
        this.mMenuPrepared = true;
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i == 0 ? null : getContext().getString(i));
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        this.mHomeDescription = charSequence;
        updateHomeAccessibility();
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(i != 0 ? C0683b.m1656b(getContext(), i) : null);
    }

    public void setNavigationIcon(Drawable drawable) {
        this.mNavIcon = drawable;
        updateNavigationIcon();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setNavigationMode(int r4) {
        /*
        r3 = this;
        r0 = r3.mNavigationMode;
        if (r4 == r0) goto L_0x0072;
    L_0x0004:
        switch(r0) {
            case 1: goto L_0x001b;
            case 2: goto L_0x0008;
            default: goto L_0x0007;
        };
    L_0x0007:
        goto L_0x0030;
    L_0x0008:
        r0 = r3.mTabView;
        if (r0 == 0) goto L_0x0030;
    L_0x000c:
        r0 = r3.mTabView;
        r0 = r0.getParent();
        r1 = r3.mToolbar;
        if (r0 != r1) goto L_0x0030;
    L_0x0016:
        r0 = r3.mToolbar;
        r1 = r3.mTabView;
        goto L_0x002d;
    L_0x001b:
        r0 = r3.mSpinner;
        if (r0 == 0) goto L_0x0030;
    L_0x001f:
        r0 = r3.mSpinner;
        r0 = r0.getParent();
        r1 = r3.mToolbar;
        if (r0 != r1) goto L_0x0030;
    L_0x0029:
        r0 = r3.mToolbar;
        r1 = r3.mSpinner;
    L_0x002d:
        r0.removeView(r1);
    L_0x0030:
        r3.mNavigationMode = r4;
        r0 = 0;
        switch(r4) {
            case 0: goto L_0x0072;
            case 1: goto L_0x0068;
            case 2: goto L_0x004a;
            default: goto L_0x0036;
        };
    L_0x0036:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r2 = "Invalid navigation mode ";
        r1.<init>(r2);
        r1.append(r4);
        r4 = r1.toString();
        r0.<init>(r4);
        throw r0;
    L_0x004a:
        r4 = r3.mTabView;
        if (r4 == 0) goto L_0x0072;
    L_0x004e:
        r4 = r3.mToolbar;
        r1 = r3.mTabView;
        r4.addView(r1, r0);
        r4 = r3.mTabView;
        r4 = r4.getLayoutParams();
        r4 = (android.support.v7.widget.Toolbar.LayoutParams) r4;
        r0 = -2;
        r4.width = r0;
        r4.height = r0;
        r0 = 8388691; // 0x800053 float:1.175506E-38 double:4.144564E-317;
        r4.gravity = r0;
        return;
    L_0x0068:
        r3.ensureSpinner();
        r4 = r3.mToolbar;
        r1 = r3.mSpinner;
        r4.addView(r1, r0);
    L_0x0072:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ToolbarWidgetWrapper.setNavigationMode(int):void");
    }

    public void setSubtitle(CharSequence charSequence) {
        this.mSubtitle = charSequence;
        if ((this.mDisplayOpts & 8) != 0) {
            this.mToolbar.setSubtitle(charSequence);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.mTitleSet = true;
        setTitleInt(charSequence);
    }

    public void setVisibility(int i) {
        this.mToolbar.setVisibility(i);
    }

    public void setWindowCallback(Callback callback) {
        this.mWindowCallback = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.mTitleSet) {
            setTitleInt(charSequence);
        }
    }

    public C0579v setupAnimatorToVisibility(final int i, long j) {
        return C0571r.m1380q(this.mToolbar).m1410a(i == 0 ? BallPulseIndicator.SCALE : 0.0f).m1411a(j).m1412a(new C4847x() {
            private boolean mCanceled = false;

            public void onAnimationCancel(View view) {
                this.mCanceled = true;
            }

            public void onAnimationEnd(View view) {
                if (!this.mCanceled) {
                    ToolbarWidgetWrapper.this.mToolbar.setVisibility(i);
                }
            }

            public void onAnimationStart(View view) {
                ToolbarWidgetWrapper.this.mToolbar.setVisibility(0);
            }
        });
    }

    public boolean showOverflowMenu() {
        return this.mToolbar.showOverflowMenu();
    }
}
