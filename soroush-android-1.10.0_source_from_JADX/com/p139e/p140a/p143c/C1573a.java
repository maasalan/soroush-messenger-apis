package com.p139e.p140a.p143c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import com.p139e.p140a.C1581e.C1577a;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public abstract class C1573a extends View {
    protected Bitmap f4886a;
    protected Canvas f4887b;
    protected Bitmap f4888c;
    protected Canvas f4889d;
    protected C1574d f4890e;
    protected int f4891f;
    protected int f4892g = 20;
    protected int f4893h = 5;
    protected float f4894i = BallPulseIndicator.SCALE;

    public C1573a(Context context) {
        super(context);
    }

    private int m4089a(int i) {
        return getResources().getDimensionPixelSize(i);
    }

    protected final void m4090a() {
        this.f4892g = m4089a(C1577a.default_slider_handler_radius);
        this.f4893h = m4089a(C1577a.default_slider_bar_height);
        this.f4891f = this.f4892g;
        if (this.f4888c == null) {
            mo1500b();
        }
        mo1498a(this.f4889d);
        invalidate();
    }

    protected abstract void mo1497a(float f);

    protected abstract void mo1498a(Canvas canvas);

    protected abstract void mo1499a(Canvas canvas, float f, float f2);

    protected void mo1500b() {
        int width = getWidth();
        int height = getHeight();
        this.f4888c = Bitmap.createBitmap(width - (this.f4891f * 2), this.f4893h, Config.ARGB_8888);
        this.f4889d = new Canvas(this.f4888c);
        if (this.f4886a == null || this.f4886a.getWidth() != width || this.f4886a.getHeight() != height) {
            if (this.f4886a != null) {
                this.f4886a.recycle();
            }
            this.f4886a = Bitmap.createBitmap(width, height, Config.ARGB_8888);
            this.f4887b = new Canvas(this.f4886a);
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f4888c != null && this.f4887b != null) {
            this.f4887b.drawColor(0, Mode.CLEAR);
            this.f4887b.drawBitmap(this.f4888c, (float) this.f4891f, (float) ((getHeight() - this.f4888c.getHeight()) / 2), null);
            mo1499a(this.f4887b, ((float) this.f4892g) + (this.f4894i * ((float) (getWidth() - (this.f4892g * 2)))), ((float) getHeight()) / 2.0f);
            canvas.drawBitmap(this.f4886a, 0.0f, 0.0f, null);
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        if (mode != 0) {
            if (mode != Integer.MIN_VALUE) {
                if (mode != 1073741824) {
                    i = 0;
                }
            }
            i = MeasureSpec.getSize(i);
        }
        mode = MeasureSpec.getMode(i2);
        if (mode != 0) {
            if (mode != Integer.MIN_VALUE) {
                if (mode != 1073741824) {
                    i2 = 0;
                }
            }
            i2 = MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(i, i2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
            case 2:
                this.f4894i = (motionEvent.getX() - ((float) this.f4891f)) / ((float) this.f4888c.getWidth());
                this.f4894i = Math.max(0.0f, Math.min(this.f4894i, BallPulseIndicator.SCALE));
                break;
            case 1:
                break;
            default:
                break;
        }
        mo1497a(this.f4894i);
        invalidate();
        return true;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m4090a();
    }

    public void setOnValueChangedListener(C1574d c1574d) {
        this.f4890e = c1574d;
    }
}
