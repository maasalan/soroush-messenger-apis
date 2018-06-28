package com.akexorcist.roundcornerprogressbar.common;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.akexorcist.roundcornerprogressbar.C1009a.C1004a;
import com.akexorcist.roundcornerprogressbar.C1009a.C1005b;
import com.akexorcist.roundcornerprogressbar.C1009a.C1008e;

public abstract class BaseRoundCornerProgressBar extends LinearLayout {
    protected boolean f3232a;
    private LinearLayout f3233b;
    private LinearLayout f3234c;
    private LinearLayout f3235d;
    private int f3236e;
    private int f3237f;
    private int f3238g;
    private float f3239h;
    private float f3240i;
    private float f3241j;
    private int f3242k;
    private int f3243l;
    private int f3244m;
    private C1012a f3245n;

    class C10101 implements Runnable {
        final /* synthetic */ BaseRoundCornerProgressBar f3222a;

        C10101(BaseRoundCornerProgressBar baseRoundCornerProgressBar) {
            this.f3222a = baseRoundCornerProgressBar;
        }

        public final void run() {
            this.f3222a.m2467f();
            this.f3222a.m2468g();
        }
    }

    private static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C10111();
        float f3223a;
        float f3224b;
        float f3225c;
        int f3226d;
        int f3227e;
        int f3228f;
        int f3229g;
        int f3230h;
        boolean f3231i;

        static class C10111 implements Creator<SavedState> {
            C10111() {
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
            this.f3223a = parcel.readFloat();
            this.f3224b = parcel.readFloat();
            this.f3225c = parcel.readFloat();
            this.f3226d = parcel.readInt();
            this.f3227e = parcel.readInt();
            this.f3228f = parcel.readInt();
            this.f3229g = parcel.readInt();
            this.f3230h = parcel.readInt();
            this.f3231i = parcel.readByte() != (byte) 0;
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f3223a);
            parcel.writeFloat(this.f3224b);
            parcel.writeFloat(this.f3225c);
            parcel.writeInt(this.f3226d);
            parcel.writeInt(this.f3227e);
            parcel.writeInt(this.f3228f);
            parcel.writeInt(this.f3229g);
            parcel.writeInt(this.f3230h);
            parcel.writeByte((byte) this.f3231i);
        }
    }

    public interface C1012a {
    }

    public BaseRoundCornerProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            m2461a(context);
        } else {
            m2463b(context, attributeSet);
        }
    }

    @TargetApi(11)
    public BaseRoundCornerProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            m2461a(context);
        } else {
            m2463b(context, attributeSet);
        }
    }

    protected static GradientDrawable m2460a(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    private void m2461a(Context context) {
        setGravity(17);
        View textView = new TextView(context);
        textView.setLayoutParams(new LayoutParams(-1, -1));
        textView.setGravity(17);
        textView.setText(getClass().getSimpleName());
        textView.setTextColor(-1);
        textView.setBackgroundColor(-7829368);
        addView(textView);
    }

    private void m2463b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1008e.RoundCornerProgress);
        this.f3236e = (int) obtainStyledAttributes.getDimension(C1008e.RoundCornerProgress_rcRadius, m2471a(30.0f));
        this.f3237f = (int) obtainStyledAttributes.getDimension(C1008e.RoundCornerProgress_rcBackgroundPadding, m2471a(0.0f));
        this.f3232a = obtainStyledAttributes.getBoolean(C1008e.RoundCornerProgress_rcReverse, false);
        this.f3239h = obtainStyledAttributes.getFloat(C1008e.RoundCornerProgress_rcMax, 100.0f);
        this.f3240i = obtainStyledAttributes.getFloat(C1008e.RoundCornerProgress_rcProgress, 0.0f);
        this.f3241j = obtainStyledAttributes.getFloat(C1008e.RoundCornerProgress_rcSecondaryProgress, 0.0f);
        this.f3242k = obtainStyledAttributes.getColor(C1008e.RoundCornerProgress_rcBackgroundColor, context.getResources().getColor(C1004a.round_corner_progress_bar_background_default));
        this.f3243l = obtainStyledAttributes.getColor(C1008e.RoundCornerProgress_rcProgressColor, context.getResources().getColor(C1004a.round_corner_progress_bar_progress_default));
        this.f3244m = obtainStyledAttributes.getColor(C1008e.RoundCornerProgress_rcSecondaryProgressColor, context.getResources().getColor(C1004a.round_corner_progress_bar_secondary_progress_default));
        obtainStyledAttributes.recycle();
        mo1051a(context, attributeSet);
        removeAllViews();
        LayoutInflater.from(context).inflate(mo1050a(), this);
        this.f3233b = (LinearLayout) findViewById(C1005b.layout_background);
        this.f3234c = (LinearLayout) findViewById(C1005b.layout_progress);
        this.f3235d = (LinearLayout) findViewById(C1005b.layout_secondary_progress);
        mo1053b();
    }

    private void m2465d() {
        m2466e();
        m2470i();
        m2469h();
        m2467f();
        m2468g();
        mo1054c();
    }

    private void m2466e() {
        Drawable a = m2460a(this.f3242k);
        r2 = new float[8];
        float f = (float) (this.f3236e - (this.f3237f / 2));
        r2[0] = f;
        r2[1] = f;
        r2[2] = f;
        r2[3] = f;
        r2[4] = f;
        r2[5] = f;
        r2[6] = f;
        r2[7] = f;
        a.setCornerRadii(r2);
        if (VERSION.SDK_INT >= 16) {
            this.f3233b.setBackground(a);
        } else {
            this.f3233b.setBackgroundDrawable(a);
        }
    }

    private void m2467f() {
        mo1052a(this.f3234c, this.f3239h, this.f3240i, (float) this.f3238g, this.f3236e, this.f3237f, this.f3243l, this.f3232a);
    }

    private void m2468g() {
        mo1052a(this.f3235d, this.f3239h, this.f3241j, (float) this.f3238g, this.f3236e, this.f3237f, this.f3244m, this.f3232a);
    }

    private void m2469h() {
        setupReverse(this.f3234c);
        setupReverse(this.f3235d);
    }

    private void m2470i() {
        this.f3233b.setPadding(this.f3237f, this.f3237f, this.f3237f, this.f3237f);
    }

    private void setupReverse(LinearLayout linearLayout) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
        if (VERSION.SDK_INT >= 17) {
            layoutParams.removeRule(11);
            layoutParams.removeRule(21);
            layoutParams.removeRule(9);
            layoutParams.removeRule(20);
        } else {
            layoutParams.addRule(11, 0);
            layoutParams.addRule(9, 0);
        }
        if (this.f3232a) {
            layoutParams.addRule(11);
            if (VERSION.SDK_INT >= 17) {
                layoutParams.addRule(21);
            }
        } else {
            layoutParams.addRule(9);
            if (VERSION.SDK_INT >= 17) {
                layoutParams.addRule(20);
            }
        }
        linearLayout.setLayoutParams(layoutParams);
    }

    @SuppressLint({"NewApi"})
    protected final float m2471a(float f) {
        return (float) Math.round(f * ((float) (getContext().getResources().getDisplayMetrics().densityDpi / 160)));
    }

    public abstract int mo1050a();

    public abstract void mo1051a(Context context, AttributeSet attributeSet);

    public abstract void mo1052a(LinearLayout linearLayout, float f, float f2, float f3, int i, int i2, int i3, boolean z);

    public abstract void mo1053b();

    public abstract void mo1054c();

    public float getLayoutWidth() {
        return (float) this.f3238g;
    }

    public float getMax() {
        return this.f3239h;
    }

    public int getPadding() {
        return this.f3237f;
    }

    public float getProgress() {
        return this.f3240i;
    }

    public int getProgressBackgroundColor() {
        return this.f3242k;
    }

    public int getProgressColor() {
        return this.f3243l;
    }

    public int getRadius() {
        return this.f3236e;
    }

    public float getSecondaryProgress() {
        return this.f3241j;
    }

    public int getSecondaryProgressColor() {
        return this.f3244m;
    }

    public float getSecondaryProgressWidth() {
        return this.f3235d != null ? (float) this.f3235d.getWidth() : 0.0f;
    }

    public void invalidate() {
        super.invalidate();
        m2465d();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.f3236e = savedState.f3226d;
            this.f3237f = savedState.f3227e;
            this.f3242k = savedState.f3228f;
            this.f3243l = savedState.f3229g;
            this.f3244m = savedState.f3230h;
            this.f3239h = savedState.f3223a;
            this.f3240i = savedState.f3224b;
            this.f3241j = savedState.f3225c;
            this.f3232a = savedState.f3231i;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3226d = this.f3236e;
        savedState.f3227e = this.f3237f;
        savedState.f3228f = this.f3242k;
        savedState.f3229g = this.f3243l;
        savedState.f3230h = this.f3244m;
        savedState.f3223a = this.f3239h;
        savedState.f3224b = this.f3240i;
        savedState.f3225c = this.f3241j;
        savedState.f3231i = this.f3232a;
        return savedState;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!isInEditMode()) {
            this.f3238g = i;
            m2465d();
            postDelayed(new C10101(this), 5);
        }
    }

    public void setMax(float f) {
        if (f >= 0.0f) {
            this.f3239h = f;
        }
        if (this.f3240i > f) {
            this.f3240i = f;
        }
        m2467f();
        m2468g();
    }

    public void setOnProgressChangedListener(C1012a c1012a) {
        this.f3245n = c1012a;
    }

    public void setPadding(int i) {
        if (i >= 0) {
            this.f3237f = i;
        }
        m2470i();
        m2467f();
        m2468g();
    }

    public void setProgress(float f) {
        if (f < 0.0f) {
            this.f3240i = 0.0f;
        } else {
            if (f > this.f3239h) {
                f = this.f3239h;
            }
            this.f3240i = f;
        }
        m2467f();
        if (this.f3245n != null) {
            getId();
        }
    }

    public void setProgressBackgroundColor(int i) {
        this.f3242k = i;
        m2466e();
    }

    public void setProgressColor(int i) {
        this.f3243l = i;
        m2467f();
    }

    public void setRadius(int i) {
        if (i >= 0) {
            this.f3236e = i;
        }
        m2466e();
        m2467f();
        m2468g();
    }

    public void setReverse(boolean z) {
        this.f3232a = z;
        m2469h();
        m2467f();
        m2468g();
    }

    public void setSecondaryProgress(float f) {
        if (f < 0.0f) {
            this.f3241j = 0.0f;
        } else {
            if (f > this.f3239h) {
                f = this.f3239h;
            }
            this.f3241j = f;
        }
        m2468g();
        if (this.f3245n != null) {
            getId();
        }
    }

    public void setSecondaryProgressColor(int i) {
        this.f3244m = i;
        m2468g();
    }
}
