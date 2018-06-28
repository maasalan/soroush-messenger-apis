package com.akexorcist.roundcornerprogressbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View.BaseSavedState;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.akexorcist.roundcornerprogressbar.C1009a.C1005b;
import com.akexorcist.roundcornerprogressbar.C1009a.C1006c;
import com.akexorcist.roundcornerprogressbar.C1009a.C1008e;
import com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar;

public class TextRoundCornerProgressBar extends BaseRoundCornerProgressBar implements OnGlobalLayoutListener {
    private TextView f14151b;
    private int f14152c;
    private int f14153d;
    private int f14154e;
    private String f14155f;

    private static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C10031();
        int f3218a;
        int f3219b;
        int f3220c;
        String f3221d;

        static class C10031 implements Creator<SavedState> {
            C10031() {
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
            this.f3218a = parcel.readInt();
            this.f3219b = parcel.readInt();
            this.f3220c = parcel.readInt();
            this.f3221d = parcel.readString();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3218a);
            parcel.writeInt(this.f3219b);
            parcel.writeInt(this.f3220c);
            parcel.writeString(this.f3221d);
        }
    }

    public TextRoundCornerProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TextRoundCornerProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private void m10301d() {
        this.f14151b.setText(this.f14155f);
    }

    private void m10302e() {
        this.f14151b.setTextColor(this.f14152c);
    }

    private void m10303f() {
        this.f14151b.setTextSize(0, (float) this.f14153d);
    }

    private void m10304g() {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f14151b.getLayoutParams();
        marginLayoutParams.setMargins(this.f14154e, 0, this.f14154e, 0);
        this.f14151b.setLayoutParams(marginLayoutParams);
    }

    private void m10305h() {
        LayoutParams layoutParams;
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f14151b.getLayoutParams();
        layoutParams2.addRule(5, 0);
        layoutParams2.addRule(7, 0);
        layoutParams2.addRule(0, 0);
        layoutParams2.addRule(1, 0);
        if (VERSION.SDK_INT >= 17) {
            layoutParams2.removeRule(16);
            layoutParams2.removeRule(17);
            layoutParams2.removeRule(18);
            layoutParams2.removeRule(19);
        }
        this.f14151b.setLayoutParams(layoutParams2);
        if ((this.f14151b.getMeasuredWidth() + (getTextProgressMargin() * 2)) + this.f14154e < ((int) ((getLayoutWidth() - ((float) (getPadding() * 2))) / (getMax() / getProgress())))) {
            layoutParams = (RelativeLayout.LayoutParams) this.f14151b.getLayoutParams();
            if (this.f3232a) {
                layoutParams.addRule(5, C1005b.layout_progress);
                if (VERSION.SDK_INT >= 17) {
                    layoutParams.addRule(18, C1005b.layout_progress);
                }
            } else {
                layoutParams.addRule(7, C1005b.layout_progress);
                if (VERSION.SDK_INT >= 17) {
                    layoutParams.addRule(19, C1005b.layout_progress);
                }
            }
        } else {
            layoutParams2 = (RelativeLayout.LayoutParams) this.f14151b.getLayoutParams();
            if (this.f3232a) {
                layoutParams2.addRule(0, C1005b.layout_progress);
                if (VERSION.SDK_INT >= 17) {
                    layoutParams2.addRule(16, C1005b.layout_progress);
                }
            } else {
                layoutParams2.addRule(1, C1005b.layout_progress);
                if (VERSION.SDK_INT >= 17) {
                    layoutParams2.addRule(17, C1005b.layout_progress);
                }
            }
        }
        this.f14151b.setLayoutParams(layoutParams);
    }

    protected final int mo1050a() {
        return C1006c.layout_text_round_corner_progress_bar;
    }

    protected final void mo1051a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1008e.TextRoundCornerProgress);
        this.f14152c = obtainStyledAttributes.getColor(C1008e.TextRoundCornerProgress_rcTextProgressColor, -1);
        this.f14153d = (int) obtainStyledAttributes.getDimension(C1008e.TextRoundCornerProgress_rcTextProgressSize, m2471a(16.0f));
        this.f14154e = (int) obtainStyledAttributes.getDimension(C1008e.TextRoundCornerProgress_rcTextProgressMargin, m2471a(10.0f));
        this.f14155f = obtainStyledAttributes.getString(C1008e.TextRoundCornerProgress_rcTextProgress);
        obtainStyledAttributes.recycle();
    }

    protected final void mo1052a(LinearLayout linearLayout, float f, float f2, float f3, int i, int i2, int i3, boolean z) {
        Drawable a = BaseRoundCornerProgressBar.m2460a(i3);
        r10 = new float[8];
        float f4 = (float) (i - (i2 / 2));
        r10[0] = f4;
        r10[1] = f4;
        r10[2] = f4;
        r10[3] = f4;
        r10[4] = f4;
        r10[5] = f4;
        r10[6] = f4;
        r10[7] = f4;
        a.setCornerRadii(r10);
        if (VERSION.SDK_INT >= 16) {
            linearLayout.setBackground(a);
        } else {
            linearLayout.setBackgroundDrawable(a);
        }
        int i4 = (int) ((f3 - ((float) (i2 * 2))) / (f / f2));
        LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.width = i4;
        linearLayout.setLayoutParams(layoutParams);
    }

    protected final void mo1053b() {
        this.f14151b = (TextView) findViewById(C1005b.tv_progress);
        this.f14151b.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    protected final void mo1054c() {
        m10301d();
        m10303f();
        m10304g();
        m10305h();
        m10302e();
    }

    public String getProgressText() {
        return this.f14155f;
    }

    public int getTextProgressColor() {
        return this.f14152c;
    }

    public int getTextProgressMargin() {
        return this.f14154e;
    }

    public int getTextProgressSize() {
        return this.f14153d;
    }

    public void onGlobalLayout() {
        if (VERSION.SDK_INT >= 16) {
            this.f14151b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        } else {
            this.f14151b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
        m10305h();
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.f14152c = savedState.f3218a;
            this.f14153d = savedState.f3219b;
            this.f14154e = savedState.f3220c;
            this.f14155f = savedState.f3221d;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3218a = this.f14152c;
        savedState.f3219b = this.f14153d;
        savedState.f3220c = this.f14154e;
        savedState.f3221d = this.f14155f;
        return savedState;
    }

    public void setProgress(float f) {
        super.setProgress(f);
        m10305h();
    }

    public void setProgressText(String str) {
        this.f14155f = str;
        m10301d();
        m10305h();
    }

    public void setTextProgressColor(int i) {
        this.f14152c = i;
        m10302e();
    }

    public void setTextProgressMargin(int i) {
        this.f14154e = i;
        m10304g();
        m10305h();
    }

    public void setTextProgressSize(int i) {
        this.f14153d = i;
        m10303f();
        m10305h();
    }
}
