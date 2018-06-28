package com.pnikosis.materialishprogress;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class ProgressWheel extends View {
    private static final String f7347a = "ProgressWheel";
    private int f7348b;
    private int f7349c;
    private int f7350d;
    private boolean f7351e;
    private double f7352f;
    private double f7353g;
    private float f7354h;
    private boolean f7355i;
    private long f7356j;
    private int f7357k;
    private int f7358l;
    private Paint f7359m;
    private Paint f7360n;
    private RectF f7361o;
    private float f7362p;
    private long f7363q;
    private boolean f7364r;
    private float f7365s;
    private float f7366t;
    private boolean f7367u;
    private C2242a f7368v;

    static class WheelSavedState extends BaseSavedState {
        public static final Creator<WheelSavedState> CREATOR = new C22411();
        float f7336a;
        float f7337b;
        boolean f7338c;
        float f7339d;
        int f7340e;
        int f7341f;
        int f7342g;
        int f7343h;
        int f7344i;
        boolean f7345j;
        boolean f7346k;

        static class C22411 implements Creator<WheelSavedState> {
            C22411() {
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
            this.f7336a = parcel.readFloat();
            this.f7337b = parcel.readFloat();
            boolean z = false;
            this.f7338c = parcel.readByte() != (byte) 0;
            this.f7339d = parcel.readFloat();
            this.f7340e = parcel.readInt();
            this.f7341f = parcel.readInt();
            this.f7342g = parcel.readInt();
            this.f7343h = parcel.readInt();
            this.f7344i = parcel.readInt();
            this.f7345j = parcel.readByte() != (byte) 0;
            if (parcel.readByte() != (byte) 0) {
                z = true;
            }
            this.f7346k = z;
        }

        WheelSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f7336a);
            parcel.writeFloat(this.f7337b);
            parcel.writeByte((byte) this.f7338c);
            parcel.writeFloat(this.f7339d);
            parcel.writeInt(this.f7340e);
            parcel.writeInt(this.f7341f);
            parcel.writeInt(this.f7342g);
            parcel.writeInt(this.f7343h);
            parcel.writeInt(this.f7344i);
            parcel.writeByte((byte) this.f7345j);
            parcel.writeByte((byte) this.f7346k);
        }
    }

    public interface C2242a {
    }

    private void m6127a() {
        this.f7359m.setColor(this.f7357k);
        this.f7359m.setAntiAlias(true);
        this.f7359m.setStyle(Style.STROKE);
        this.f7359m.setStrokeWidth((float) this.f7349c);
        this.f7360n.setColor(this.f7358l);
        this.f7360n.setAntiAlias(true);
        this.f7360n.setStyle(Style.STROKE);
        this.f7360n.setStrokeWidth((float) this.f7350d);
    }

    private void m6128b() {
        if (this.f7368v != null) {
            Math.round((this.f7365s * 100.0f) / 360.0f);
        }
    }

    public int getBarColor() {
        return this.f7357k;
    }

    public int getBarWidth() {
        return this.f7349c;
    }

    public int getCircleRadius() {
        return this.f7348b;
    }

    public float getProgress() {
        return this.f7367u ? -1.0f : this.f7365s / 360.0f;
    }

    public int getRimColor() {
        return this.f7358l;
    }

    public int getRimWidth() {
        return this.f7350d;
    }

    public float getSpinSpeed() {
        return this.f7362p / 360.0f;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.f7361o, 360.0f, 360.0f, false, this.f7360n);
        float f = 0.0f;
        int i = 1;
        float f2;
        if (this.f7367u) {
            float f3;
            long uptimeMillis = SystemClock.uptimeMillis() - r0.f7363q;
            f2 = (((float) uptimeMillis) * r0.f7362p) / 1000.0f;
            if (r0.f7356j >= 200) {
                r0.f7352f += (double) uptimeMillis;
                if (r0.f7352f > r0.f7353g) {
                    r0.f7352f -= r0.f7353g;
                    r0.f7356j = 0;
                    r0.f7355i ^= true;
                }
                float cos = (((float) Math.cos(((r0.f7352f / r0.f7353g) + 1.0d) * 3.141592653589793d)) / 2.0f) + 0.5f;
                if (r0.f7355i) {
                    r0.f7354h = cos * 254.0f;
                } else {
                    float f4 = 254.0f * (BallPulseIndicator.SCALE - cos);
                    r0.f7365s += r0.f7354h - f4;
                    r0.f7354h = f4;
                }
            } else {
                r0.f7356j += uptimeMillis;
            }
            r0.f7365s += f2;
            if (r0.f7365s > 360.0f) {
                r0.f7365s -= 360.0f;
            }
            r0.f7363q = SystemClock.uptimeMillis();
            f2 = r0.f7365s - 90.0f;
            float f5 = 16.0f + r0.f7354h;
            if (isInEditMode()) {
                f5 = 135.0f;
                f3 = 0.0f;
            } else {
                f3 = f2;
            }
            canvas.drawArc(r0.f7361o, f3, f5, false, r0.f7359m);
        } else {
            f2 = r0.f7365s;
            if (r0.f7365s != r0.f7366t) {
                r0.f7365s = Math.min(r0.f7365s + ((((float) (SystemClock.uptimeMillis() - r0.f7363q)) / 1000.0f) * r0.f7362p), r0.f7366t);
                r0.f7363q = SystemClock.uptimeMillis();
            } else {
                i = 0;
            }
            if (f2 != r0.f7365s) {
                m6128b();
            }
            f2 = r0.f7365s;
            if (!r0.f7364r) {
                f = ((float) (1.0d - Math.pow((double) (BallPulseIndicator.SCALE - (r0.f7365s / 360.0f)), 4.0d))) * 360.0f;
                f2 = ((float) (1.0d - Math.pow((double) (BallPulseIndicator.SCALE - (r0.f7365s / 360.0f)), 2.0d))) * 360.0f;
            }
            canvas.drawArc(r0.f7361o, f - 90.0f, isInEditMode() ? 360.0f : f2, false, r0.f7359m);
        }
        if (i != 0) {
            invalidate();
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int paddingLeft = (this.f7348b + getPaddingLeft()) + getPaddingRight();
        int paddingTop = (this.f7348b + getPaddingTop()) + getPaddingBottom();
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
            this.f7365s = wheelSavedState.f7336a;
            this.f7366t = wheelSavedState.f7337b;
            this.f7367u = wheelSavedState.f7338c;
            this.f7362p = wheelSavedState.f7339d;
            this.f7349c = wheelSavedState.f7340e;
            this.f7357k = wheelSavedState.f7341f;
            this.f7350d = wheelSavedState.f7342g;
            this.f7358l = wheelSavedState.f7343h;
            this.f7348b = wheelSavedState.f7344i;
            this.f7364r = wheelSavedState.f7345j;
            this.f7351e = wheelSavedState.f7346k;
            this.f7363q = SystemClock.uptimeMillis();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable wheelSavedState = new WheelSavedState(super.onSaveInstanceState());
        wheelSavedState.f7336a = this.f7365s;
        wheelSavedState.f7337b = this.f7366t;
        wheelSavedState.f7338c = this.f7367u;
        wheelSavedState.f7339d = this.f7362p;
        wheelSavedState.f7340e = this.f7349c;
        wheelSavedState.f7341f = this.f7357k;
        wheelSavedState.f7342g = this.f7350d;
        wheelSavedState.f7343h = this.f7358l;
        wheelSavedState.f7344i = this.f7348b;
        wheelSavedState.f7345j = this.f7364r;
        wheelSavedState.f7346k = this.f7351e;
        return wheelSavedState;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        i3 = getPaddingTop();
        i4 = getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        if (this.f7351e) {
            this.f7361o = new RectF((float) (paddingLeft + this.f7349c), (float) (i3 + this.f7349c), (float) ((i - paddingRight) - this.f7349c), (float) ((i2 - i4) - this.f7349c));
        } else {
            i = (i - paddingLeft) - paddingRight;
            paddingRight = Math.min(Math.min(i, (i2 - i4) - i3), (this.f7348b * 2) - (this.f7349c * 2));
            i = ((i - paddingRight) / 2) + paddingLeft;
            i2 = ((((i2 - i3) - i4) - paddingRight) / 2) + i3;
            this.f7361o = new RectF((float) (this.f7349c + i), (float) (this.f7349c + i2), (float) ((i + paddingRight) - this.f7349c), (float) ((i2 + paddingRight) - this.f7349c));
        }
        m6127a();
        invalidate();
    }

    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            this.f7363q = SystemClock.uptimeMillis();
        }
    }

    public void setBarColor(int i) {
        this.f7357k = i;
        m6127a();
        if (!this.f7367u) {
            invalidate();
        }
    }

    public void setBarWidth(int i) {
        this.f7349c = i;
        if (!this.f7367u) {
            invalidate();
        }
    }

    public void setCallback(C2242a c2242a) {
        this.f7368v = c2242a;
        if (!this.f7367u) {
            m6128b();
        }
    }

    public void setCircleRadius(int i) {
        this.f7348b = i;
        if (!this.f7367u) {
            invalidate();
        }
    }

    public void setInstantProgress(float f) {
        if (this.f7367u) {
            this.f7365s = 0.0f;
            this.f7367u = false;
        }
        if (f > BallPulseIndicator.SCALE) {
            f -= BallPulseIndicator.SCALE;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        if (f != this.f7366t) {
            this.f7366t = Math.min(f * 360.0f, 360.0f);
            this.f7365s = this.f7366t;
            this.f7363q = SystemClock.uptimeMillis();
            invalidate();
        }
    }

    public void setLinearProgress(boolean z) {
        this.f7364r = z;
        if (!this.f7367u) {
            invalidate();
        }
    }

    public void setProgress(float f) {
        if (this.f7367u) {
            this.f7365s = 0.0f;
            this.f7367u = false;
            m6128b();
        }
        if (f > BallPulseIndicator.SCALE) {
            f -= BallPulseIndicator.SCALE;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        if (f != this.f7366t) {
            if (this.f7365s == this.f7366t) {
                this.f7363q = SystemClock.uptimeMillis();
            }
            this.f7366t = Math.min(f * 360.0f, 360.0f);
            invalidate();
        }
    }

    public void setRimColor(int i) {
        this.f7358l = i;
        m6127a();
        if (!this.f7367u) {
            invalidate();
        }
    }

    public void setRimWidth(int i) {
        this.f7350d = i;
        if (!this.f7367u) {
            invalidate();
        }
    }

    public void setSpinSpeed(float f) {
        this.f7362p = f * 360.0f;
    }
}
