package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0571r;
import android.support.v7.p041a.C0645a.C0635a;
import android.support.v7.p041a.C0645a.C0640f;
import android.support.v7.p041a.C0645a.C0641g;
import android.support.v7.p041a.C0645a.C0644j;
import android.support.v7.view.menu.C0729p.C0728a;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListMenuItemView extends LinearLayout implements C0728a {
    private C4893j f13597a;
    private ImageView f13598b;
    private RadioButton f13599c;
    private TextView f13600d;
    private CheckBox f13601e;
    private TextView f13602f;
    private ImageView f13603g;
    private Drawable f13604h;
    private int f13605i;
    private Context f13606j;
    private boolean f13607k;
    private Drawable f13608l;
    private int f13609m;
    private LayoutInflater f13610n;
    private boolean f13611o;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0635a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, C0644j.MenuView, i, 0);
        this.f13604h = obtainStyledAttributes.getDrawable(C0644j.MenuView_android_itemBackground);
        this.f13605i = obtainStyledAttributes.getResourceId(C0644j.MenuView_android_itemTextAppearance, -1);
        this.f13607k = obtainStyledAttributes.getBoolean(C0644j.MenuView_preserveIconSpacing, false);
        this.f13606j = context;
        this.f13608l = obtainStyledAttributes.getDrawable(C0644j.MenuView_subMenuArrow);
        obtainStyledAttributes.recycle();
    }

    private void m9455b() {
        this.f13599c = (RadioButton) getInflater().inflate(C0641g.abc_list_menu_item_radio, this, false);
        addView(this.f13599c);
    }

    private void m9456c() {
        this.f13601e = (CheckBox) getInflater().inflate(C0641g.abc_list_menu_item_checkbox, this, false);
        addView(this.f13601e);
    }

    private LayoutInflater getInflater() {
        if (this.f13610n == null) {
            this.f13610n = LayoutInflater.from(getContext());
        }
        return this.f13610n;
    }

    private void setShortcut$25d965e(boolean z) {
        int i = (z && this.f13597a.m9514d()) ? 0 : 8;
        if (i == 0) {
            CharSequence charSequence;
            TextView textView = this.f13602f;
            char c = this.f13597a.m9511c();
            if (c == '\u0000') {
                charSequence = "";
            } else {
                String str;
                StringBuilder stringBuilder = new StringBuilder(C4893j.f13679f);
                if (c == '\b') {
                    str = C4893j.f13681h;
                } else if (c == '\n') {
                    str = C4893j.f13680g;
                } else if (c != ' ') {
                    stringBuilder.append(c);
                    charSequence = stringBuilder.toString();
                } else {
                    str = C4893j.f13682i;
                }
                stringBuilder.append(str);
                charSequence = stringBuilder.toString();
            }
            textView.setText(charSequence);
        }
        if (this.f13602f.getVisibility() != i) {
            this.f13602f.setVisibility(i);
        }
    }

    private void setSubMenuArrowVisible(boolean z) {
        if (this.f13603g != null) {
            this.f13603g.setVisibility(z ? 0 : 8);
        }
    }

    public final void mo128a(C4893j c4893j) {
        this.f13597a = c4893j;
        int i = 0;
        this.f13609m = 0;
        setVisibility(c4893j.isVisible() ? 0 : 8);
        setTitle(c4893j.m9505a((C0728a) this));
        setCheckable(c4893j.isCheckable());
        boolean d = c4893j.m9514d();
        c4893j.m9511c();
        if (!d || !this.f13597a.m9514d()) {
            i = 8;
        }
        if (i == 0) {
            CharSequence charSequence;
            TextView textView = this.f13602f;
            char c = this.f13597a.m9511c();
            if (c == '\u0000') {
                charSequence = "";
            } else {
                String str;
                StringBuilder stringBuilder = new StringBuilder(C4893j.f13679f);
                if (c == '\b') {
                    str = C4893j.f13681h;
                } else if (c == '\n') {
                    str = C4893j.f13680g;
                } else if (c != ' ') {
                    stringBuilder.append(c);
                    charSequence = stringBuilder.toString();
                } else {
                    str = C4893j.f13682i;
                }
                stringBuilder.append(str);
                charSequence = stringBuilder.toString();
            }
            textView.setText(charSequence);
        }
        if (this.f13602f.getVisibility() != i) {
            this.f13602f.setVisibility(i);
        }
        setIcon(c4893j.getIcon());
        setEnabled(c4893j.isEnabled());
        setSubMenuArrowVisible(c4893j.hasSubMenu());
        setContentDescription(c4893j.getContentDescription());
    }

    public final boolean mo129a() {
        return false;
    }

    public C4893j getItemData() {
        return this.f13597a;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        C0571r.m1339a((View) this, this.f13604h);
        this.f13600d = (TextView) findViewById(C0640f.title);
        if (this.f13605i != -1) {
            this.f13600d.setTextAppearance(this.f13606j, this.f13605i);
        }
        this.f13602f = (TextView) findViewById(C0640f.shortcut);
        this.f13603g = (ImageView) findViewById(C0640f.submenuarrow);
        if (this.f13603g != null) {
            this.f13603g.setImageDrawable(this.f13608l);
        }
    }

    protected void onMeasure(int i, int i2) {
        if (this.f13598b != null && this.f13607k) {
            LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f13598b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        if (z || this.f13599c != null || this.f13601e != null) {
            CompoundButton compoundButton;
            CompoundButton compoundButton2;
            if (this.f13597a.m9515e()) {
                if (this.f13599c == null) {
                    m9455b();
                }
                compoundButton = this.f13599c;
                compoundButton2 = this.f13601e;
            } else {
                if (this.f13601e == null) {
                    m9456c();
                }
                compoundButton = this.f13601e;
                compoundButton2 = this.f13599c;
            }
            if (z) {
                compoundButton.setChecked(this.f13597a.isChecked());
                int i = z ? 0 : 8;
                if (compoundButton.getVisibility() != i) {
                    compoundButton.setVisibility(i);
                }
                if (!(compoundButton2 == null || compoundButton2.getVisibility() == 8)) {
                    compoundButton2.setVisibility(8);
                }
                return;
            }
            if (this.f13601e != null) {
                this.f13601e.setVisibility(8);
            }
            if (this.f13599c != null) {
                this.f13599c.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f13597a.m9515e()) {
            if (this.f13599c == null) {
                m9455b();
            }
            compoundButton = this.f13599c;
        } else {
            if (this.f13601e == null) {
                m9456c();
            }
            compoundButton = this.f13601e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f13611o = z;
        this.f13607k = z;
    }

    public void setIcon(Drawable drawable) {
        boolean z;
        ImageView imageView;
        if (!this.f13597a.f13693b.f13657i) {
            if (!this.f13611o) {
                z = false;
                if (z && !this.f13607k) {
                    return;
                }
                if (this.f13598b == null || drawable != null || this.f13607k) {
                    if (this.f13598b == null) {
                        this.f13598b = (ImageView) getInflater().inflate(C0641g.abc_list_menu_item_icon, this, false);
                        addView(this.f13598b, 0);
                    }
                    if (drawable == null) {
                        if (this.f13607k) {
                            this.f13598b.setVisibility(8);
                            return;
                        }
                    }
                    imageView = this.f13598b;
                    if (z) {
                        drawable = null;
                    }
                    imageView.setImageDrawable(drawable);
                    if (this.f13598b.getVisibility() != 0) {
                        this.f13598b.setVisibility(0);
                    }
                }
                return;
            }
        }
        z = true;
        if (z) {
        }
        if (this.f13598b == null) {
        }
        if (this.f13598b == null) {
            this.f13598b = (ImageView) getInflater().inflate(C0641g.abc_list_menu_item_icon, this, false);
            addView(this.f13598b, 0);
        }
        if (drawable == null) {
            if (this.f13607k) {
                this.f13598b.setVisibility(8);
                return;
            }
        }
        imageView = this.f13598b;
        if (z) {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        if (this.f13598b.getVisibility() != 0) {
            this.f13598b.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f13600d.setText(charSequence);
            if (this.f13600d.getVisibility() != 0) {
                this.f13600d.setVisibility(0);
            }
        } else if (this.f13600d.getVisibility() != 8) {
            this.f13600d.setVisibility(8);
        }
    }
}
