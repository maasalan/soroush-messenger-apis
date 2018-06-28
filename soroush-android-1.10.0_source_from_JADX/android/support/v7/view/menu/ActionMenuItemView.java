package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.p041a.C0645a.C0644j;
import android.support.v7.view.menu.C0729p.C0728a;
import android.support.v7.view.menu.C4890h.C0723b;
import android.support.v7.widget.ActionMenuView.ActionMenuChildView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.ForwardingListener;
import android.support.v7.widget.TooltipCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;

public class ActionMenuItemView extends AppCompatTextView implements C0728a, ActionMenuChildView, OnClickListener {
    C4893j f17486a;
    C0723b f17487b;
    C0714b f17488c;
    private CharSequence f17489d;
    private Drawable f17490e;
    private ForwardingListener f17491f;
    private boolean f17492g;
    private boolean f17493h;
    private int f17494i;
    private int f17495j;
    private int f17496k;

    public static abstract class C0714b {
        public abstract C0731s getPopup();
    }

    private class C4884a extends ForwardingListener {
        final /* synthetic */ ActionMenuItemView f13593a;

        public C4884a(ActionMenuItemView actionMenuItemView) {
            this.f13593a = actionMenuItemView;
            super(actionMenuItemView);
        }

        public final C0731s getPopup() {
            return this.f13593a.f17488c != null ? this.f13593a.f17488c.getPopup() : null;
        }

        protected final boolean onForwardingStarted() {
            if (this.f13593a.f17487b != null && this.f13593a.f17487b.invokeItem(this.f13593a.f17486a)) {
                C0731s popup = getPopup();
                if (popup != null && popup.isShowing()) {
                    return true;
                }
            }
            return false;
        }
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f17492g = m15116c();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0644j.ActionMenuItemView, i, 0);
        this.f17494i = obtainStyledAttributes.getDimensionPixelSize(C0644j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f17496k = (int) ((32.0f * resources.getDisplayMetrics().density) + 0.5f);
        setOnClickListener(this);
        this.f17495j = -1;
        setSaveEnabled(false);
    }

    private boolean m15116c() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480 && (i < 640 || i2 < 480)) {
            if (configuration.orientation != 2) {
                return false;
            }
        }
        return true;
    }

    private void m15117d() {
        int i = 1;
        int isEmpty = TextUtils.isEmpty(this.f17489d) ^ 1;
        if (this.f17490e != null) {
            if (((this.f17486a.f13694c & 4) == 4 ? 1 : 0) != 0) {
                if (!this.f17492g) {
                    if (this.f17493h) {
                    }
                }
            }
            i = 0;
        }
        isEmpty &= i;
        CharSequence charSequence = null;
        setText(isEmpty != 0 ? this.f17489d : null);
        CharSequence contentDescription = this.f17486a.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = isEmpty != 0 ? null : this.f17486a.getTitle();
        }
        setContentDescription(contentDescription);
        contentDescription = this.f17486a.getTooltipText();
        if (TextUtils.isEmpty(contentDescription)) {
            if (isEmpty == 0) {
                charSequence = this.f17486a.getTitle();
            }
            TooltipCompat.setTooltipText(this, charSequence);
            return;
        }
        TooltipCompat.setTooltipText(this, contentDescription);
    }

    public final void mo128a(C4893j c4893j) {
        this.f17486a = c4893j;
        setIcon(c4893j.getIcon());
        setTitle(c4893j.m9505a((C0728a) this));
        setId(c4893j.getItemId());
        setVisibility(c4893j.isVisible() ? 0 : 8);
        setEnabled(c4893j.isEnabled());
        if (c4893j.hasSubMenu() && this.f17491f == null) {
            this.f17491f = new C4884a(this);
        }
    }

    public final boolean mo129a() {
        return true;
    }

    public final boolean m15120b() {
        return !TextUtils.isEmpty(getText());
    }

    public C4893j getItemData() {
        return this.f17486a;
    }

    public boolean needsDividerAfter() {
        return m15120b();
    }

    public boolean needsDividerBefore() {
        return m15120b() && this.f17486a.getIcon() == null;
    }

    public void onClick(View view) {
        if (this.f17487b != null) {
            this.f17487b.invokeItem(this.f17486a);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f17492g = m15116c();
        m15117d();
    }

    protected void onMeasure(int i, int i2) {
        boolean b = m15120b();
        if (b && this.f17495j >= 0) {
            super.setPadding(this.f17495j, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        i = mode == Integer.MIN_VALUE ? Math.min(i, this.f17494i) : this.f17494i;
        if (mode != 1073741824 && this.f17494i > 0 && measuredWidth < i) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(i, 1073741824), i2);
        }
        if (!b && this.f17490e != null) {
            super.setPadding((getMeasuredWidth() - this.f17490e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (this.f17486a.hasSubMenu() && this.f17491f != null && this.f17491f.onTouch(this, motionEvent)) ? true : super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f17493h != z) {
            this.f17493h = z;
            if (this.f17486a != null) {
                this.f17486a.f13693b.m9493g();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f17490e = drawable;
        if (drawable != null) {
            float f;
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > this.f17496k) {
                f = ((float) this.f17496k) / ((float) intrinsicWidth);
                intrinsicWidth = this.f17496k;
                intrinsicHeight = (int) (((float) intrinsicHeight) * f);
            }
            if (intrinsicHeight > this.f17496k) {
                f = ((float) this.f17496k) / ((float) intrinsicHeight);
                intrinsicHeight = this.f17496k;
                intrinsicWidth = (int) (((float) intrinsicWidth) * f);
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        m15117d();
    }

    public void setItemInvoker(C0723b c0723b) {
        this.f17487b = c0723b;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f17495j = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0714b c0714b) {
        this.f17488c = c0714b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f17489d = charSequence;
        m15117d();
    }
}
