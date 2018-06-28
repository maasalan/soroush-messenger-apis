package com.astuetz;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.C0523f;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import java.util.Locale;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class PagerSlidingTabStrip extends HorizontalScrollView {
    private static final int[] f3250b = new int[]{16842901, 16842904};
    private int f3251A;
    private int f3252B;
    private Locale f3253C;
    public C0523f f3254a;
    private LayoutParams f3255c;
    private LayoutParams f3256d;
    private final C5066b f3257e;
    private LinearLayout f3258f;
    private ViewPager f3259g;
    private int f3260h;
    private int f3261i;
    private float f3262j;
    private Paint f3263k;
    private Paint f3264l;
    private int f3265m;
    private int f3266n;
    private int f3267o;
    private boolean f3268p;
    private boolean f3269q;
    private int f3270r;
    private int f3271s;
    private int f3272t;
    private int f3273u;
    private int f3274v;
    private int f3275w;
    private int f3276x;
    private Typeface f3277y;
    private int f3278z;

    class C10131 implements OnGlobalLayoutListener {
        final /* synthetic */ PagerSlidingTabStrip f3246a;

        C10131(PagerSlidingTabStrip pagerSlidingTabStrip) {
            this.f3246a = pagerSlidingTabStrip;
        }

        @SuppressLint({"NewApi"})
        public final void onGlobalLayout() {
            if (VERSION.SDK_INT < 16) {
                this.f3246a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            } else {
                this.f3246a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            this.f3246a.f3261i = this.f3246a.f3259g.getCurrentItem();
            PagerSlidingTabStrip.m2483a(this.f3246a, this.f3246a.f3261i, 0);
        }
    }

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C10151();
        int f3249a;

        static class C10151 implements Creator<SavedState> {
            C10151() {
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
            this.f3249a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3249a);
        }
    }

    public interface C1016a {
        int m2477a();
    }

    private class C5066b implements C0523f {
        final /* synthetic */ PagerSlidingTabStrip f14156a;

        public final void mo173a(int i) {
            if (i == 0) {
                PagerSlidingTabStrip.m2483a(this.f14156a, this.f14156a.f3259g.getCurrentItem(), 0);
            }
            if (this.f14156a.f3254a != null) {
                this.f14156a.f3254a.mo173a(i);
            }
        }

        public final void mo174a(int i, float f, int i2) {
            this.f14156a.f3261i = i;
            this.f14156a.f3262j = f;
            PagerSlidingTabStrip.m2483a(this.f14156a, i, (int) (((float) this.f14156a.f3258f.getChildAt(i).getWidth()) * f));
            this.f14156a.invalidate();
            if (this.f14156a.f3254a != null) {
                this.f14156a.f3254a.mo174a(i, f, i2);
            }
        }

        public final void mo175b(int i) {
            if (this.f14156a.f3254a != null) {
                this.f14156a.f3254a.mo175b(i);
            }
        }
    }

    private void m2481a() {
        this.f3258f.removeAllViews();
        this.f3260h = this.f3259g.getAdapter().mo2270b();
        for (int i = 0; i < this.f3260h; i++) {
            View imageButton;
            if (this.f3259g.getAdapter() instanceof C1016a) {
                int a = ((C1016a) this.f3259g.getAdapter()).m2477a();
                imageButton = new ImageButton(getContext());
                imageButton.setImageResource(a);
            } else {
                CharSequence charSequence = this.f3259g.getAdapter().mo2364b(i).toString();
                imageButton = new TextView(getContext());
                imageButton.setText(charSequence);
                imageButton.setGravity(17);
                imageButton.setSingleLine();
            }
            m2482a(i, imageButton);
        }
        m2485b();
        getViewTreeObserver().addOnGlobalLayoutListener(new C10131(this));
    }

    private void m2482a(final int i, View view) {
        view.setFocusable(true);
        view.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ PagerSlidingTabStrip f3248b;

            public final void onClick(View view) {
                this.f3248b.f3259g.setCurrentItem(i);
            }
        });
        view.setPadding(this.f3274v, 0, this.f3274v, 0);
        this.f3258f.addView(view, i, this.f3268p ? this.f3256d : this.f3255c);
    }

    static /* synthetic */ void m2483a(PagerSlidingTabStrip pagerSlidingTabStrip, int i, int i2) {
        if (pagerSlidingTabStrip.f3260h != 0) {
            int left = pagerSlidingTabStrip.f3258f.getChildAt(i).getLeft() + i2;
            if (i > 0 || i2 > 0) {
                left -= pagerSlidingTabStrip.f3270r;
            }
            if (left != pagerSlidingTabStrip.f3251A) {
                pagerSlidingTabStrip.f3251A = left;
                pagerSlidingTabStrip.scrollTo(left, 0);
            }
        }
    }

    private void m2485b() {
        for (int i = 0; i < this.f3260h; i++) {
            View childAt = this.f3258f.getChildAt(i);
            childAt.setBackgroundResource(this.f3252B);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                textView.setTextSize(0, (float) this.f3275w);
                textView.setTypeface(this.f3277y, this.f3278z);
                textView.setTextColor(this.f3276x);
                if (this.f3269q) {
                    if (VERSION.SDK_INT >= 14) {
                        textView.setAllCaps(true);
                    } else {
                        textView.setText(textView.getText().toString().toUpperCase(this.f3253C));
                    }
                }
            }
        }
    }

    public final int getDividerColor() {
        return this.f3267o;
    }

    public final int getDividerPadding() {
        return this.f3273u;
    }

    public final int getIndicatorColor() {
        return this.f3265m;
    }

    public final int getIndicatorHeight() {
        return this.f3271s;
    }

    public final int getScrollOffset() {
        return this.f3270r;
    }

    public final boolean getShouldExpand() {
        return this.f3268p;
    }

    public final int getTabBackground() {
        return this.f3252B;
    }

    public final int getTabPaddingLeftRight() {
        return this.f3274v;
    }

    public final int getTextColor() {
        return this.f3276x;
    }

    public final int getTextSize() {
        return this.f3275w;
    }

    public final int getUnderlineColor() {
        return this.f3266n;
    }

    public final int getUnderlineHeight() {
        return this.f3272t;
    }

    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode() && this.f3260h != 0) {
            int height = getHeight();
            this.f3263k.setColor(this.f3265m);
            View childAt = this.f3258f.getChildAt(this.f3261i);
            float left = (float) childAt.getLeft();
            float right = (float) childAt.getRight();
            if (this.f3262j > 0.0f && this.f3261i < this.f3260h - 1) {
                View childAt2 = this.f3258f.getChildAt(this.f3261i + 1);
                float left2 = (float) childAt2.getLeft();
                left = (this.f3262j * left2) + ((BallPulseIndicator.SCALE - this.f3262j) * left);
                right = (this.f3262j * ((float) childAt2.getRight())) + ((BallPulseIndicator.SCALE - this.f3262j) * right);
            }
            float f = (float) height;
            Canvas canvas2 = canvas;
            canvas2.drawRect(left, (float) (height - this.f3271s), right, f, this.f3263k);
            this.f3263k.setColor(this.f3266n);
            canvas.drawRect(0.0f, (float) (height - this.f3272t), (float) this.f3258f.getWidth(), f, this.f3263k);
            this.f3264l.setColor(this.f3267o);
            for (int i = 0; i < this.f3260h - 1; i++) {
                View childAt3 = this.f3258f.getChildAt(i);
                canvas.drawLine((float) childAt3.getRight(), (float) this.f3273u, (float) childAt3.getRight(), (float) (height - this.f3273u), this.f3264l);
            }
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f3261i = savedState.f3249a;
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3249a = this.f3261i;
        return savedState;
    }

    public final void setAllCaps(boolean z) {
        this.f3269q = z;
    }

    public final void setDividerColor(int i) {
        this.f3267o = i;
        invalidate();
    }

    public final void setDividerColorResource(int i) {
        this.f3267o = getResources().getColor(i);
        invalidate();
    }

    public final void setDividerPadding(int i) {
        this.f3273u = i;
        invalidate();
    }

    public final void setIndicatorColor(int i) {
        this.f3265m = i;
        invalidate();
    }

    public final void setIndicatorColorResource(int i) {
        this.f3265m = getResources().getColor(i);
        invalidate();
    }

    public final void setIndicatorHeight(int i) {
        this.f3271s = i;
        invalidate();
    }

    public final void setOnPageChangeListener(C0523f c0523f) {
        this.f3254a = c0523f;
    }

    public final void setScrollOffset(int i) {
        this.f3270r = i;
        invalidate();
    }

    public final void setShouldExpand(boolean z) {
        this.f3268p = z;
        requestLayout();
    }

    public final void setTabBackground(int i) {
        this.f3252B = i;
    }

    public final void setTabPaddingLeftRight(int i) {
        this.f3274v = i;
        m2485b();
    }

    public final void setTextColor(int i) {
        this.f3276x = i;
        m2485b();
    }

    public final void setTextColorResource(int i) {
        this.f3276x = getResources().getColor(i);
        m2485b();
    }

    public final void setTextSize(int i) {
        this.f3275w = i;
        m2485b();
    }

    public final void setUnderlineColor(int i) {
        this.f3266n = i;
        invalidate();
    }

    public final void setUnderlineColorResource(int i) {
        this.f3266n = getResources().getColor(i);
        invalidate();
    }

    public final void setUnderlineHeight(int i) {
        this.f3272t = i;
        invalidate();
    }

    public final void setViewPager(ViewPager viewPager) {
        this.f3259g = viewPager;
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        viewPager.setOnPageChangeListener(this.f3257e);
        m2481a();
    }
}
