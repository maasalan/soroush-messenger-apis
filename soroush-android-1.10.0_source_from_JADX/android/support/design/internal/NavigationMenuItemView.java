package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.StateListDrawable;
import android.support.design.C0249a.C0241d;
import android.support.design.C0249a.C0242e;
import android.support.design.C0249a.C0243f;
import android.support.design.C0249a.C0245h;
import android.support.v4.p029a.p030a.C0343b;
import android.support.v4.p031b.p032a.C0429a;
import android.support.v4.view.C0547a;
import android.support.v4.view.C0571r;
import android.support.v4.view.p039a.C0536b;
import android.support.v4.widget.C0628m;
import android.support.v7.p041a.C0645a.C0635a;
import android.support.v7.view.menu.C0729p.C0728a;
import android.support.v7.view.menu.C4893j;
import android.support.v7.widget.LinearLayoutCompat.LayoutParams;
import android.support.v7.widget.TooltipCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;

public class NavigationMenuItemView extends C4723c implements C0728a {
    private static final int[] f17338f = new int[]{16842912};
    boolean f17339c;
    final CheckedTextView f17340d;
    FrameLayout f17341e;
    private final int f17342g;
    private boolean f17343h;
    private C4893j f17344i;
    private ColorStateList f17345j;
    private boolean f17346k;
    private Drawable f17347l;
    private final C0547a f17348m;

    class C47201 extends C0547a {
        final /* synthetic */ NavigationMenuItemView f12975a;

        C47201(NavigationMenuItemView navigationMenuItemView) {
            this.f12975a = navigationMenuItemView;
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C0536b c0536b) {
            super.onInitializeAccessibilityNodeInfo(view, c0536b);
            c0536b.m1197a(this.f12975a.f17339c);
        }
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17348m = new C47201(this);
        setOrientation(0);
        LayoutInflater.from(context).inflate(C0245h.design_navigation_menu_item, this, true);
        this.f17342g = context.getResources().getDimensionPixelSize(C0241d.design_navigation_icon_size);
        this.f17340d = (CheckedTextView) findViewById(C0243f.design_menu_item_text);
        this.f17340d.setDuplicateParentStateEnabled(true);
        C0571r.m1340a(this.f17340d, this.f17348m);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f17341e == null) {
                this.f17341e = (FrameLayout) ((ViewStub) findViewById(C0243f.design_menu_item_action_area_stub)).inflate();
            }
            this.f17341e.removeAllViews();
            this.f17341e.addView(view);
        }
    }

    public final void mo128a(C4893j c4893j) {
        this.f17344i = c4893j;
        setVisibility(c4893j.isVisible() ? 0 : 8);
        boolean z = true;
        if (getBackground() == null) {
            Drawable stateListDrawable;
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(C0635a.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f17338f, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            C0571r.m1339a((View) this, stateListDrawable);
        }
        setCheckable(c4893j.isCheckable());
        setChecked(c4893j.isChecked());
        setEnabled(c4893j.isEnabled());
        setTitle(c4893j.getTitle());
        setIcon(c4893j.getIcon());
        setActionView(c4893j.getActionView());
        setContentDescription(c4893j.getContentDescription());
        TooltipCompat.setTooltipText(this, c4893j.getTooltipText());
        if (this.f17344i.getTitle() != null || this.f17344i.getIcon() != null || this.f17344i.getActionView() == null) {
            z = false;
        }
        if (z) {
            this.f17340d.setVisibility(8);
            if (this.f17341e != null) {
                LayoutParams layoutParams = (LayoutParams) this.f17341e.getLayoutParams();
                layoutParams.width = -1;
                this.f17341e.setLayoutParams(layoutParams);
                return;
            }
        }
        this.f17340d.setVisibility(0);
        if (this.f17341e != null) {
            layoutParams = (LayoutParams) this.f17341e.getLayoutParams();
            layoutParams.width = -2;
            this.f17341e.setLayoutParams(layoutParams);
        }
    }

    public final boolean mo129a() {
        return false;
    }

    public C4893j getItemData() {
        return this.f17344i;
    }

    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f17344i != null && this.f17344i.isCheckable() && this.f17344i.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f17338f);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f17339c != z) {
            this.f17339c = z;
            this.f17348m.sendAccessibilityEvent(this.f17340d, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f17340d.setChecked(z);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f17346k) {
                ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0429a.m896g(drawable).mutate();
                C0429a.m885a(drawable, this.f17345j);
            }
            drawable.setBounds(0, 0, this.f17342g, this.f17342g);
        } else if (this.f17343h) {
            if (this.f17347l == null) {
                this.f17347l = C0343b.m671a(getResources(), C0242e.navigation_empty_icon, getContext().getTheme());
                if (this.f17347l != null) {
                    this.f17347l.setBounds(0, 0, this.f17342g, this.f17342g);
                }
            }
            drawable = this.f17347l;
        }
        C0628m.m1530a(this.f17340d, drawable, null, null, null);
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.f17345j = colorStateList;
        this.f17346k = this.f17345j != null;
        if (this.f17344i != null) {
            setIcon(this.f17344i.getIcon());
        }
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f17343h = z;
    }

    public void setTextAppearance(int i) {
        C0628m.m1529a(this.f17340d, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f17340d.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f17340d.setText(charSequence);
    }
}
