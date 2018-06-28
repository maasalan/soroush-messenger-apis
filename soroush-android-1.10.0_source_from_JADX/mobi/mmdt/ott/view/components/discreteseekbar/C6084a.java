package mobi.mmdt.ott.view.components.discreteseekbar;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.support.v4.view.C0571r;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import mobi.mmdt.ott.C2540d.C2534a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.discreteseekbar.p403a.C3143c.C31421;
import mobi.mmdt.ott.view.components.discreteseekbar.p404b.C6087b;
import mobi.mmdt.ott.view.components.discreteseekbar.p404b.C6087b.C3146a;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C6084a extends ViewGroup implements C3146a {
    TextView f16269a;
    C6087b f16270b;
    private int f16271c;
    private int f16272d;

    public C6084a(Context context, AttributeSet attributeSet, int i, String str, int i2, int i3) {
        super(context, attributeSet, i);
        setVisibility(0);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2534a.DiscreteSeekBar, R.attr.discreteSeekBarStyle, R.style.Widget.DiscreteSeekBar);
        int i4 = ((int) (4.0f * displayMetrics.density)) * 2;
        int resourceId = obtainStyledAttributes.getResourceId(6, R.style.Widget.DiscreteIndicatorTextAppearance);
        this.f16269a = new TextView(context);
        this.f16269a.setPadding(i4, 0, i4, 0);
        this.f16269a.setTextAppearance(context, resourceId);
        this.f16269a.setGravity(17);
        AssetManager assets = getContext().getAssets();
        StringBuilder stringBuilder = new StringBuilder("fonts/");
        stringBuilder.append(C2535a.m6888a().at());
        this.f16269a.setTypeface(Typeface.createFromAsset(assets, stringBuilder.toString()));
        this.f16269a.setText(str);
        this.f16269a.setMaxLines(1);
        this.f16269a.setSingleLine(true);
        TextView textView = this.f16269a;
        if (VERSION.SDK_INT >= 17) {
            textView.setTextDirection(5);
        }
        this.f16269a.setVisibility(4);
        setPadding(i4, i4, i4, i4);
        m13715a(str);
        this.f16272d = i3;
        this.f16270b = new C6087b(obtainStyledAttributes.getColorStateList(1), i2);
        this.f16270b.setCallback(this);
        this.f16270b.f16299k = this;
        this.f16270b.f16295g = i4;
        C0571r.m1372i(this, obtainStyledAttributes.getDimension(2, 8.0f * displayMetrics.density));
        if (VERSION.SDK_INT >= 21) {
            C6087b c6087b = this.f16270b;
            if (VERSION.SDK_INT >= 21) {
                setOutlineProvider(new C31421(c6087b));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void mo2254a() {
        if (getParent() instanceof C3146a) {
            ((C3146a) getParent()).mo2254a();
        }
    }

    public final void m13715a(String str) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        TextView textView = this.f16269a;
        StringBuilder stringBuilder = new StringBuilder("-");
        stringBuilder.append(str);
        textView.setText(stringBuilder.toString());
        this.f16269a.measure(MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, Integer.MIN_VALUE));
        this.f16271c = Math.max(this.f16269a.getMeasuredWidth(), this.f16269a.getMeasuredHeight());
        removeView(this.f16269a);
        addView(this.f16269a, new LayoutParams(this.f16271c, this.f16271c, 51));
    }

    public final void mo2255b() {
        this.f16269a.setVisibility(0);
        if (getParent() instanceof C3146a) {
            ((C3146a) getParent()).mo2255b();
        }
    }

    public final void m13717c() {
        this.f16270b.stop();
        C6087b c6087b = this.f16270b;
        c6087b.unscheduleSelf(c6087b.f16300l);
        c6087b.f16291c = false;
        if (c6087b.f16289a < BallPulseIndicator.SCALE) {
            c6087b.f16292d = true;
            c6087b.f16294f = c6087b.f16289a;
            c6087b.f16293e = (int) (250.0f * (BallPulseIndicator.SCALE - c6087b.f16289a));
            c6087b.f16290b = SystemClock.uptimeMillis();
            c6087b.scheduleSelf(c6087b.f16300l, c6087b.f16290b + 16);
            return;
        }
        c6087b.m13738a();
    }

    protected final void dispatchDraw(Canvas canvas) {
        this.f16270b.draw(canvas);
        super.dispatchDraw(canvas);
    }

    public final CharSequence getValue() {
        return this.f16269a.getText();
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m13717c();
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f16270b.stop();
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        i = getPaddingTop();
        i2 = getWidth() - getPaddingRight();
        i3 = getHeight() - getPaddingBottom();
        this.f16269a.layout(paddingLeft, i, this.f16271c + paddingLeft, this.f16271c + i);
        this.f16270b.setBounds(paddingLeft, i, i2, i3);
    }

    protected final void onMeasure(int i, int i2) {
        measureChildren(i, i2);
        setMeasuredDimension((this.f16271c + getPaddingLeft()) + getPaddingRight(), (((this.f16271c + getPaddingTop()) + getPaddingBottom()) + (((int) ((1.41f * ((float) this.f16271c)) - ((float) this.f16271c))) / 2)) + this.f16272d);
    }

    public final void setValue(CharSequence charSequence) {
        this.f16269a.setText(charSequence);
    }

    protected final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f16270b) {
            if (!super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
