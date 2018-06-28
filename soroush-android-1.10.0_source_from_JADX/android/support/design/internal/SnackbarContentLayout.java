package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.C0249a.C0241d;
import android.support.design.C0249a.C0243f;
import android.support.design.C0249a.C0248k;
import android.support.design.widget.C0306b.C0302b;
import android.support.v4.view.C0571r;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class SnackbarContentLayout extends LinearLayout implements C0302b {
    private TextView f12976a;
    private Button f12977b;
    private int f12978c;
    private int f12979d;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0248k.SnackbarLayout);
        this.f12978c = obtainStyledAttributes.getDimensionPixelSize(C0248k.SnackbarLayout_android_maxWidth, -1);
        this.f12979d = obtainStyledAttributes.getDimensionPixelSize(C0248k.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    private boolean m8703a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f12976a.getPaddingTop() == i2 && this.f12976a.getPaddingBottom() == i3) {
            return z;
        }
        View view = this.f12976a;
        if (C0571r.m1388y(view)) {
            C0571r.m1353b(view, C0571r.m1374k(view), i2, C0571r.m1375l(view), i3);
        } else {
            view.setPadding(view.getPaddingLeft(), i2, view.getPaddingRight(), i3);
        }
        return true;
    }

    public final void mo126a() {
        this.f12976a.setAlpha(0.0f);
        this.f12976a.animate().alpha(BallPulseIndicator.SCALE).setDuration(180).setStartDelay(70).start();
        if (this.f12977b.getVisibility() == 0) {
            this.f12977b.setAlpha(0.0f);
            this.f12977b.animate().alpha(BallPulseIndicator.SCALE).setDuration(180).setStartDelay(70).start();
        }
    }

    public final void mo127b() {
        this.f12976a.setAlpha(BallPulseIndicator.SCALE);
        this.f12976a.animate().alpha(0.0f).setDuration(180).setStartDelay(0).start();
        if (this.f12977b.getVisibility() == 0) {
            this.f12977b.setAlpha(BallPulseIndicator.SCALE);
            this.f12977b.animate().alpha(0.0f).setDuration(180).setStartDelay(0).start();
        }
    }

    public Button getActionView() {
        return this.f12977b;
    }

    public TextView getMessageView() {
        return this.f12976a;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f12976a = (TextView) findViewById(C0243f.snackbar_text);
        this.f12977b = (Button) findViewById(C0243f.snackbar_action);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f12978c > 0 && getMeasuredWidth() > this.f12978c) {
            i = MeasureSpec.makeMeasureSpec(this.f12978c, 1073741824);
            super.onMeasure(i, i2);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0241d.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0241d.design_snackbar_padding_vertical);
        int i3 = 1;
        int i4 = this.f12976a.getLayout().getLineCount() > 1 ? 1 : 0;
        if (i4 == 0 || this.f12979d <= 0 || this.f12977b.getMeasuredWidth() <= this.f12979d) {
            if (i4 == 0) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (m8703a(0, dimensionPixelSize, dimensionPixelSize)) {
                if (i3 == 0) {
                    super.onMeasure(i, i2);
                }
            }
        } else if (m8703a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            if (i3 == 0) {
                super.onMeasure(i, i2);
            }
        }
        i3 = 0;
        if (i3 == 0) {
            super.onMeasure(i, i2);
        }
    }
}
