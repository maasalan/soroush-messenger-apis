package mobi.mmdt.ott.view.components.avatartoolbar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.AppBarLayout.C0259b;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import mobi.mmdt.ott.C2540d.C2534a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class CollapsingAvatarToolbar extends LinearLayout implements C0259b {
    private View f16226a;
    private float f16227b;
    private float f16228c;
    private float f16229d;
    private float f16230e;
    private boolean f16231f;
    private Toolbar f16232g;
    private AppBarLayout f16233h;
    private float f16234i;
    private float f16235j;
    private float f16236k;

    public CollapsingAvatarToolbar(Context context) {
        this(context, null);
    }

    public CollapsingAvatarToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16231f = false;
        setOrientation(0);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C2534a.CollapsingAvatarToolbar, 0, 0);
        try {
            this.f16227b = obtainStyledAttributes.getDimension(1, -1.0f);
            this.f16228c = obtainStyledAttributes.getDimension(4, -1.0f);
            this.f16230e = obtainStyledAttributes.getDimension(0, -1.0f);
            this.f16229d = obtainStyledAttributes.getDimension(3, -1.0f);
            Resources resources = getResources();
            if (this.f16227b < 0.0f) {
                this.f16227b = resources.getDimension(R.dimen.default_collapsed_padding);
            }
            if (this.f16228c < 0.0f) {
                this.f16228c = resources.getDimension(R.dimen.default_expanded_padding);
            }
            if (this.f16230e < 0.0f) {
                this.f16230e = resources.getDimension(R.dimen.default_collapsed_image_size);
            }
            if (this.f16229d < 0.0f) {
                this.f16229d = resources.getDimension(R.dimen.default_expanded_image_size);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private Toolbar m13646a() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof Toolbar) {
                return (Toolbar) childAt;
            }
        }
        throw new IllegalStateException("No toolbar found as sibling");
    }

    private void m13647a(float f, int i) {
        float f2 = BallPulseIndicator.SCALE - f;
        float f3 = (float) (((double) this.f16234i) + (((double) ((this.f16235j - this.f16234i) * f2)) * 1.5d));
        f = (float) (((double) this.f16228c) + (((double) ((this.f16227b - this.f16228c) * f)) * 0.75d));
        setContainerOffset(((float) (-i)) + (((float) this.f16232g.getHeight()) * f2));
        setContainerHeight((int) f3);
        setPadding((int) f);
        setAvatarSize((int) ((float) (((double) this.f16230e) + (((double) ((this.f16229d - this.f16230e) * f2)) * 1.5d))));
    }

    private void m13648b() {
        this.f16234i = (float) this.f16232g.getHeight();
        this.f16235j = (float) (this.f16233h.getHeight() - this.f16232g.getHeight());
        this.f16236k = this.f16235j;
    }

    private void setAvatarSize(int i) {
        this.f16226a.getLayoutParams().height = i;
        this.f16226a.getLayoutParams().width = i;
    }

    private void setContainerHeight(int i) {
        getLayoutParams().height = i;
    }

    private void setContainerOffset(float f) {
        setTranslationY(f);
    }

    private void setPadding(int i) {
        setPadding(i, 0, 0, 0);
    }

    public final void mo158a(int i) {
        if (!this.f16231f) {
            m13648b();
            this.f16231f = true;
        }
        m13647a(((float) (-i)) / this.f16236k, i);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof AppBarLayout)) {
            if (parent.getParent() instanceof AppBarLayout) {
                parent = parent.getParent();
            } else {
                throw new IllegalStateException("Must be inside an AppBarLayout");
            }
        }
        this.f16233h = (AppBarLayout) parent;
        this.f16232g = m13646a();
        View findViewById = findViewById(R.id.cat_avatar);
        if (findViewById == null) {
            throw new IllegalStateException("View with id ta_avatar not found");
        }
        this.f16226a = findViewById;
        if (isInEditMode()) {
            m13648b();
            m13647a(BallPulseIndicator.SCALE, 0);
            return;
        }
        this.f16233h.m476a((C0259b) this);
    }
}
