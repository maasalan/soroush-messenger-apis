package com.akexorcist.roundcornerprogressbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.akexorcist.roundcornerprogressbar.C1009a.C1004a;
import com.akexorcist.roundcornerprogressbar.C1009a.C1005b;
import com.akexorcist.roundcornerprogressbar.C1009a.C1006c;
import com.akexorcist.roundcornerprogressbar.C1009a.C1007d;
import com.akexorcist.roundcornerprogressbar.C1009a.C1008e;
import com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar;

public final class IconRoundCornerProgressBar extends BaseRoundCornerProgressBar implements OnClickListener {
    private ImageView f14139b;
    private int f14140c;
    private int f14141d;
    private int f14142e;
    private int f14143f;
    private int f14144g;
    private int f14145h;
    private int f14146i;
    private int f14147j;
    private int f14148k;
    private int f14149l;
    private C1002a f14150m;

    private static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C10011();
        int f3208a;
        int f3209b;
        int f3210c;
        int f3211d;
        int f3212e;
        int f3213f;
        int f3214g;
        int f3215h;
        int f3216i;
        int f3217j;

        static class C10011 implements Creator<SavedState> {
            C10011() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f3208a = parcel.readInt();
            this.f3209b = parcel.readInt();
            this.f3210c = parcel.readInt();
            this.f3211d = parcel.readInt();
            this.f3212e = parcel.readInt();
            this.f3213f = parcel.readInt();
            this.f3214g = parcel.readInt();
            this.f3215h = parcel.readInt();
            this.f3216i = parcel.readInt();
            this.f3217j = parcel.readInt();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3208a);
            parcel.writeInt(this.f3209b);
            parcel.writeInt(this.f3210c);
            parcel.writeInt(this.f3211d);
            parcel.writeInt(this.f3212e);
            parcel.writeInt(this.f3213f);
            parcel.writeInt(this.f3214g);
            parcel.writeInt(this.f3215h);
            parcel.writeInt(this.f3216i);
            parcel.writeInt(this.f3217j);
        }
    }

    public interface C1002a {
    }

    private void m10292d() {
        this.f14139b.setImageResource(this.f14140c);
    }

    private void m10293e() {
        ImageView imageView;
        LayoutParams layoutParams;
        if (this.f14141d == -1) {
            imageView = this.f14139b;
            layoutParams = new LinearLayout.LayoutParams(this.f14142e, this.f14143f);
        } else {
            imageView = this.f14139b;
            layoutParams = new LinearLayout.LayoutParams(this.f14141d, this.f14141d);
        }
        imageView.setLayoutParams(layoutParams);
    }

    private void m10294f() {
        ImageView imageView;
        int i;
        int i2;
        int i3;
        int i4;
        if (this.f14144g != -1) {
            if (this.f14144g != 0) {
                imageView = this.f14139b;
                i = this.f14144g;
                i2 = this.f14144g;
                i3 = this.f14144g;
                i4 = this.f14144g;
                imageView.setPadding(i, i2, i3, i4);
                this.f14139b.invalidate();
            }
        }
        imageView = this.f14139b;
        i = this.f14145h;
        i2 = this.f14147j;
        i3 = this.f14146i;
        i4 = this.f14148k;
        imageView.setPadding(i, i2, i3, i4);
        this.f14139b.invalidate();
    }

    private void m10295g() {
        Drawable a = BaseRoundCornerProgressBar.m2460a(this.f14149l);
        r2 = new float[8];
        float radius = (float) (getRadius() - (getPadding() / 2));
        r2[0] = radius;
        r2[1] = radius;
        r2[2] = 0.0f;
        r2[3] = 0.0f;
        r2[4] = 0.0f;
        r2[5] = 0.0f;
        r2[6] = radius;
        r2[7] = radius;
        a.setCornerRadii(r2);
        if (VERSION.SDK_INT >= 16) {
            this.f14139b.setBackground(a);
        } else {
            this.f14139b.setBackgroundDrawable(a);
        }
    }

    public final int mo1050a() {
        return C1006c.layout_icon_round_corner_progress_bar;
    }

    protected final void mo1051a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1008e.IconRoundCornerProgress);
        this.f14140c = obtainStyledAttributes.getResourceId(C1008e.IconRoundCornerProgress_rcIconSrc, C1007d.round_corner_progress_icon);
        this.f14141d = (int) obtainStyledAttributes.getDimension(C1008e.IconRoundCornerProgress_rcIconSize, -1.0f);
        this.f14142e = (int) obtainStyledAttributes.getDimension(C1008e.IconRoundCornerProgress_rcIconWidth, m2471a(20.0f));
        this.f14143f = (int) obtainStyledAttributes.getDimension(C1008e.IconRoundCornerProgress_rcIconHeight, m2471a(20.0f));
        this.f14144g = (int) obtainStyledAttributes.getDimension(C1008e.IconRoundCornerProgress_rcIconPadding, -1.0f);
        this.f14145h = (int) obtainStyledAttributes.getDimension(C1008e.IconRoundCornerProgress_rcIconPaddingLeft, m2471a(0.0f));
        this.f14146i = (int) obtainStyledAttributes.getDimension(C1008e.IconRoundCornerProgress_rcIconPaddingRight, m2471a(0.0f));
        this.f14147j = (int) obtainStyledAttributes.getDimension(C1008e.IconRoundCornerProgress_rcIconPaddingTop, m2471a(0.0f));
        this.f14148k = (int) obtainStyledAttributes.getDimension(C1008e.IconRoundCornerProgress_rcIconPaddingBottom, m2471a(0.0f));
        this.f14149l = obtainStyledAttributes.getColor(C1008e.IconRoundCornerProgress_rcIconBackgroundColor, context.getResources().getColor(C1004a.round_corner_progress_bar_background_default));
        obtainStyledAttributes.recycle();
    }

    protected final void mo1052a(LinearLayout linearLayout, float f, float f2, float f3, int i, int i2, int i3, boolean z) {
        float[] fArr;
        LinearLayout linearLayout2 = linearLayout;
        Drawable a = BaseRoundCornerProgressBar.m2460a(i3);
        int i4 = i - (i2 / 2);
        float f4;
        if (!z || f2 == f) {
            fArr = new float[8];
            f4 = (float) i4;
            fArr[2] = f4;
            fArr[3] = f4;
            fArr[4] = f4;
            fArr[5] = f4;
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
        } else {
            fArr = new float[8];
            f4 = (float) i4;
            fArr[0] = f4;
            fArr[1] = f4;
            fArr[2] = f4;
            fArr[3] = f4;
            fArr[4] = f4;
            fArr[5] = f4;
            fArr[6] = f4;
            fArr[7] = f4;
        }
        a.setCornerRadii(fArr);
        if (VERSION.SDK_INT >= 16) {
            linearLayout2.setBackground(a);
        } else {
            linearLayout2.setBackgroundDrawable(a);
        }
        int width = (int) ((f3 - ((float) ((i2 * 2) + this.f14139b.getWidth()))) / (f / f2));
        LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.width = width;
        linearLayout2.setLayoutParams(layoutParams);
    }

    protected final void mo1053b() {
        this.f14139b = (ImageView) findViewById(C1005b.iv_progress_icon);
        this.f14139b.setOnClickListener(this);
    }

    protected final void mo1054c() {
        m10292d();
        m10293e();
        m10294f();
        m10295g();
    }

    public final int getColorIconBackground() {
        return this.f14149l;
    }

    public final int getIconImageResource() {
        return this.f14140c;
    }

    public final int getIconPadding() {
        return this.f14144g;
    }

    public final int getIconPaddingBottom() {
        return this.f14148k;
    }

    public final int getIconPaddingLeft() {
        return this.f14145h;
    }

    public final int getIconPaddingRight() {
        return this.f14146i;
    }

    public final int getIconPaddingTop() {
        return this.f14147j;
    }

    public final int getIconSize() {
        return this.f14141d;
    }

    public final void onClick(View view) {
        view.getId();
    }

    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.f14140c = savedState.f3208a;
            this.f14141d = savedState.f3209b;
            this.f14142e = savedState.f3210c;
            this.f14143f = savedState.f3211d;
            this.f14144g = savedState.f3212e;
            this.f14145h = savedState.f3213f;
            this.f14146i = savedState.f3214g;
            this.f14147j = savedState.f3215h;
            this.f14148k = savedState.f3216i;
            this.f14149l = savedState.f3217j;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected final Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3208a = this.f14140c;
        savedState.f3209b = this.f14141d;
        savedState.f3210c = this.f14142e;
        savedState.f3211d = this.f14143f;
        savedState.f3212e = this.f14144g;
        savedState.f3213f = this.f14145h;
        savedState.f3214g = this.f14146i;
        savedState.f3215h = this.f14147j;
        savedState.f3216i = this.f14148k;
        savedState.f3217j = this.f14149l;
        return savedState;
    }

    public final void setIconBackgroundColor(int i) {
        this.f14149l = i;
        m10295g();
    }

    public final void setIconImageResource(int i) {
        this.f14140c = i;
        m10292d();
    }

    public final void setIconPadding(int i) {
        if (i >= 0) {
            this.f14144g = i;
        }
        m10294f();
    }

    public final void setIconPaddingBottom(int i) {
        if (i > 0) {
            this.f14148k = i;
        }
        m10294f();
    }

    public final void setIconPaddingLeft(int i) {
        if (i > 0) {
            this.f14145h = i;
        }
        m10294f();
    }

    public final void setIconPaddingRight(int i) {
        if (i > 0) {
            this.f14146i = i;
        }
        m10294f();
    }

    public final void setIconPaddingTop(int i) {
        if (i > 0) {
            this.f14147j = i;
        }
        m10294f();
    }

    public final void setIconSize(int i) {
        if (i >= 0) {
            this.f14141d = i;
        }
        m10293e();
    }

    public final void setOnIconClickListener(C1002a c1002a) {
        this.f14150m = c1002a;
    }
}
