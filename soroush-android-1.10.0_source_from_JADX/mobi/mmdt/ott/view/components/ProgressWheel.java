package mobi.mmdt.ott.view.components;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.provider.Settings.Global;
import android.provider.Settings.System;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import mobi.mmdt.ott.C2540d.C2534a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class ProgressWheel extends View {
    private static final String f9636a = "ProgressWheel";
    private int f9637A = 0;
    private int f9638B = UIThemeManager.getmInstance().getAccent_color();
    private final int f9639b = 16;
    private final int f9640c = 270;
    private final long f9641d = 200;
    private int f9642e = 28;
    private int f9643f = 4;
    private int f9644g = 4;
    private boolean f9645h = false;
    private double f9646i = 0.0d;
    private double f9647j = 460.0d;
    private float f9648k = 0.0f;
    private boolean f9649l = true;
    private long f9650m = 0;
    private int f9651n = -1442840576;
    private int f9652o = 16777215;
    private Paint f9653p = new Paint();
    private Paint f9654q = new Paint();
    private RectF f9655r = new RectF();
    private float f9656s = 230.0f;
    private long f9657t = 0;
    private boolean f9658u;
    private float f9659v = 0.0f;
    private float f9660w = 0.0f;
    private boolean f9661x = false;
    private C3094a f9662y;
    private boolean f9663z;

    static class WheelSavedState extends BaseSavedState {
        public static final Creator<WheelSavedState> CREATOR = new C30931();
        float f9625a;
        float f9626b;
        boolean f9627c;
        float f9628d;
        int f9629e;
        int f9630f;
        int f9631g;
        int f9632h;
        int f9633i;
        boolean f9634j;
        boolean f9635k;

        static class C30931 implements Creator<WheelSavedState> {
            C30931() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new WheelSavedState(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new WheelSavedState[i];
            }
        }

        private WheelSavedState(Parcel parcel) {
            super(parcel);
            this.f9625a = parcel.readFloat();
            this.f9626b = parcel.readFloat();
            boolean z = false;
            this.f9627c = parcel.readByte() != (byte) 0;
            this.f9628d = parcel.readFloat();
            this.f9629e = parcel.readInt();
            this.f9630f = parcel.readInt();
            this.f9631g = parcel.readInt();
            this.f9632h = parcel.readInt();
            this.f9633i = parcel.readInt();
            this.f9634j = parcel.readByte() != (byte) 0;
            if (parcel.readByte() != (byte) 0) {
                z = true;
            }
            this.f9635k = z;
        }

        WheelSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f9625a);
            parcel.writeFloat(this.f9626b);
            parcel.writeByte((byte) this.f9627c);
            parcel.writeFloat(this.f9628d);
            parcel.writeInt(this.f9629e);
            parcel.writeInt(this.f9630f);
            parcel.writeInt(this.f9631g);
            parcel.writeInt(this.f9632h);
            parcel.writeInt(this.f9633i);
            parcel.writeByte((byte) this.f9634j);
            parcel.writeByte((byte) this.f9635k);
        }
    }

    public interface C3094a {
    }

    public ProgressWheel(Context context) {
        super(context);
        m7551b();
    }

    public ProgressWheel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2534a.ProgressWheel);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.f9643f = (int) TypedValue.applyDimension(1, (float) this.f9643f, displayMetrics);
        this.f9644g = (int) TypedValue.applyDimension(1, (float) this.f9644g, displayMetrics);
        this.f9642e = (int) TypedValue.applyDimension(1, (float) this.f9642e, displayMetrics);
        this.f9642e = (int) obtainStyledAttributes.getDimension(3, (float) this.f9642e);
        this.f9645h = obtainStyledAttributes.getBoolean(4, false);
        this.f9643f = (int) obtainStyledAttributes.getDimension(2, (float) this.f9643f);
        this.f9644g = (int) obtainStyledAttributes.getDimension(8, (float) this.f9644g);
        this.f9656s = obtainStyledAttributes.getFloat(9, this.f9656s / 360.0f) * 360.0f;
        this.f9647j = (double) obtainStyledAttributes.getInt(1, (int) this.f9647j);
        this.f9651n = obtainStyledAttributes.getColor(0, this.f9651n);
        this.f9652o = obtainStyledAttributes.getColor(7, this.f9652o);
        this.f9658u = obtainStyledAttributes.getBoolean(5, false);
        if (obtainStyledAttributes.getBoolean(6, false)) {
            m7554a();
        }
        obtainStyledAttributes.recycle();
        m7551b();
    }

    @TargetApi(17)
    private void m7551b() {
        this.f9663z = (VERSION.SDK_INT >= 17 ? Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", BallPulseIndicator.SCALE) : System.getFloat(getContext().getContentResolver(), "animator_duration_scale", BallPulseIndicator.SCALE)) != 0.0f;
    }

    private void m7552c() {
        this.f9653p.setColor(this.f9638B);
        this.f9653p.setAntiAlias(true);
        this.f9653p.setStyle(Style.STROKE);
        this.f9653p.setStrokeWidth((float) this.f9643f);
        this.f9653p.setStrokeCap(Cap.ROUND);
        this.f9654q.setColor(this.f9652o);
        this.f9654q.setAntiAlias(true);
        this.f9654q.setStyle(Style.STROKE);
        this.f9654q.setStrokeWidth((float) this.f9644g);
    }

    private void m7553d() {
        if (this.f9662y != null) {
            Math.round((this.f9659v * 100.0f) / 360.0f);
        }
    }

    public final void m7554a() {
        this.f9657t = SystemClock.uptimeMillis();
        this.f9661x = true;
        invalidate();
    }

    public int getBarColor() {
        return this.f9651n;
    }

    public int getBarWidth() {
        return this.f9643f;
    }

    public int getCircleRadius() {
        return this.f9642e;
    }

    public float getProgress() {
        return this.f9661x ? -1.0f : this.f9659v / 360.0f;
    }

    public int getRimColor() {
        return this.f9652o;
    }

    public int getRimWidth() {
        return this.f9644g;
    }

    public float getSpinSpeed() {
        return this.f9656s / 360.0f;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.f9655r, 360.0f, 360.0f, false, this.f9654q);
        if (this.f9663z) {
            float f;
            if (this.f9661x) {
                float f2;
                float f3;
                long uptimeMillis = SystemClock.uptimeMillis() - this.f9657t;
                f = (((float) uptimeMillis) * this.f9656s) / 1000.0f;
                if (this.f9650m >= 200) {
                    this.f9646i += (double) uptimeMillis;
                    if (this.f9646i > this.f9647j) {
                        this.f9646i -= this.f9647j;
                        this.f9650m = 0;
                        this.f9649l ^= 1;
                    }
                    float cos = (((float) Math.cos(((this.f9646i / this.f9647j) + 1.0d) * 3.141592653589793d)) / 2.0f) + 0.5f;
                    if (this.f9649l) {
                        this.f9648k = cos * 254.0f;
                    } else {
                        f2 = 254.0f * (BallPulseIndicator.SCALE - cos);
                        this.f9659v += this.f9648k - f2;
                        this.f9648k = f2;
                    }
                } else {
                    this.f9650m += uptimeMillis;
                }
                this.f9659v += f;
                if (this.f9659v > 360.0f) {
                    this.f9659v -= 360.0f;
                }
                this.f9657t = SystemClock.uptimeMillis();
                f = this.f9659v - 90.0f;
                float f4 = 16.0f + this.f9648k;
                if (isInEditMode()) {
                    f2 = 135.0f;
                    f3 = 0.0f;
                } else {
                    f3 = f;
                    f2 = f4;
                }
                canvas.drawArc(this.f9655r, f3, f2, false, this.f9653p);
            } else {
                f = this.f9659v;
                if (this.f9659v != this.f9660w) {
                    this.f9659v = Math.min(this.f9659v + ((((float) (SystemClock.uptimeMillis() - this.f9657t)) / 1000.0f) * this.f9656s), this.f9660w);
                    this.f9657t = SystemClock.uptimeMillis();
                }
                if (f != this.f9659v) {
                    m7553d();
                }
                float f5 = (BallPulseIndicator.SCALE - (BallPulseIndicator.SCALE - (this.f9659v / 360.0f))) * 360.0f;
                float f6 = isInEditMode() ? 360.0f : f5 == 0.0f ? 10.0f : f5;
                this.f9637A += 2;
                if (this.f9637A == 360) {
                    this.f9637A = 0;
                }
                canvas.drawArc(this.f9655r, (((float) this.f9637A) + 0.0f) - 90.0f, f6, false, this.f9653p);
            }
            invalidate();
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int paddingLeft = (this.f9642e + getPaddingLeft()) + getPaddingRight();
        int paddingTop = (this.f9642e + getPaddingTop()) + getPaddingBottom();
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        i2 = MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            paddingLeft = i;
        } else if (mode == Integer.MIN_VALUE) {
            paddingLeft = Math.min(paddingLeft, i);
        }
        if (mode2 != 1073741824) {
            if (mode != 1073741824) {
                if (mode2 == Integer.MIN_VALUE) {
                    paddingTop = Math.min(paddingTop, i2);
                }
                setMeasuredDimension(paddingLeft, paddingTop);
            }
        }
        paddingTop = i2;
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof WheelSavedState) {
            WheelSavedState wheelSavedState = (WheelSavedState) parcelable;
            super.onRestoreInstanceState(wheelSavedState.getSuperState());
            this.f9659v = wheelSavedState.f9625a;
            this.f9660w = wheelSavedState.f9626b;
            this.f9661x = wheelSavedState.f9627c;
            this.f9656s = wheelSavedState.f9628d;
            this.f9643f = wheelSavedState.f9629e;
            this.f9651n = wheelSavedState.f9630f;
            this.f9644g = wheelSavedState.f9631g;
            this.f9652o = wheelSavedState.f9632h;
            this.f9642e = wheelSavedState.f9633i;
            this.f9658u = wheelSavedState.f9634j;
            this.f9645h = wheelSavedState.f9635k;
            this.f9657t = SystemClock.uptimeMillis();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable wheelSavedState = new WheelSavedState(super.onSaveInstanceState());
        wheelSavedState.f9625a = this.f9659v;
        wheelSavedState.f9626b = this.f9660w;
        wheelSavedState.f9627c = this.f9661x;
        wheelSavedState.f9628d = this.f9656s;
        wheelSavedState.f9629e = this.f9643f;
        wheelSavedState.f9630f = this.f9651n;
        wheelSavedState.f9631g = this.f9644g;
        wheelSavedState.f9632h = this.f9652o;
        wheelSavedState.f9633i = this.f9642e;
        wheelSavedState.f9634j = this.f9658u;
        wheelSavedState.f9635k = this.f9645h;
        return wheelSavedState;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        i3 = getPaddingTop();
        i4 = getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        if (this.f9645h) {
            this.f9655r = new RectF((float) (paddingLeft + this.f9643f), (float) (i3 + this.f9643f), (float) ((i - paddingRight) - this.f9643f), (float) ((i2 - i4) - this.f9643f));
        } else {
            i = (i - paddingLeft) - paddingRight;
            paddingRight = Math.min(Math.min(i, (i2 - i4) - i3), (this.f9642e * 2) - (this.f9643f * 2));
            i = ((i - paddingRight) / 2) + paddingLeft;
            i2 = ((((i2 - i3) - i4) - paddingRight) / 2) + i3;
            this.f9655r = new RectF((float) (this.f9643f + i), (float) (this.f9643f + i2), (float) ((i + paddingRight) - this.f9643f), (float) ((i2 + paddingRight) - this.f9643f));
        }
        m7552c();
        invalidate();
    }

    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            this.f9657t = SystemClock.uptimeMillis();
        }
    }

    public void setBarColor(int i) {
        this.f9651n = i;
        m7552c();
        if (!this.f9661x) {
            invalidate();
        }
    }

    public void setBarColorInConversation(int i) {
        this.f9638B = i;
    }

    public void setBarWidth(int i) {
        this.f9643f = i;
        if (!this.f9661x) {
            invalidate();
        }
    }

    public void setCallback(C3094a c3094a) {
        this.f9662y = c3094a;
        if (!this.f9661x) {
            m7553d();
        }
    }

    public void setCircleRadius(int i) {
        this.f9642e = i;
        if (!this.f9661x) {
            invalidate();
        }
    }

    public void setInstantProgress(float f) {
        if (this.f9661x) {
            this.f9659v = 0.0f;
            this.f9661x = false;
        }
        if (f > BallPulseIndicator.SCALE) {
            f -= BallPulseIndicator.SCALE;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        if (f != this.f9660w) {
            this.f9660w = Math.min(f * 360.0f, 360.0f);
            this.f9659v = this.f9660w;
            this.f9657t = SystemClock.uptimeMillis();
            invalidate();
        }
    }

    public void setLinearProgress(boolean z) {
        this.f9658u = z;
        if (!this.f9661x) {
            invalidate();
        }
    }

    public void setProgress(float f) {
        if (this.f9661x) {
            this.f9659v = 0.0f;
            this.f9661x = false;
            m7553d();
        }
        if (f > BallPulseIndicator.SCALE) {
            f -= BallPulseIndicator.SCALE;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        if (f != this.f9660w) {
            if (this.f9659v == this.f9660w) {
                this.f9657t = SystemClock.uptimeMillis();
            }
            this.f9660w = Math.min(f * 360.0f, 360.0f);
            invalidate();
        }
    }

    public void setRimColor(int i) {
        this.f9652o = i;
        m7552c();
        if (!this.f9661x) {
            invalidate();
        }
    }

    public void setRimWidth(int i) {
        this.f9644g = i;
        if (!this.f9661x) {
            invalidate();
        }
    }

    public void setSpinSpeed(float f) {
        this.f9656s = f * 360.0f;
    }
}
