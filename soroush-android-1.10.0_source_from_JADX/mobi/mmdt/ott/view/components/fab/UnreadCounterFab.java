package mobi.mmdt.ott.view.components.fab;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.C0571r;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View.BaseSavedState;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import org.msgpack.util.TemplatePrecompiler;

public class UnreadCounterFab extends FloatingActionButton {
    private static final int f19505e = Color.parseColor("#33000000");
    private static final Interpolator f19506f = new OvershootInterpolator();
    private final Property<UnreadCounterFab, Float> f19507d;
    private final Rect f19508g;
    private final Paint f19509h;
    private final float f19510i;
    private final Paint f19511j;
    private final Rect f19512k;
    private final Paint f19513l;
    private final int f19514m;
    private final boolean f19515n;
    private float f19516o;
    private int f19517p;
    private String f19518q;
    private float f19519r;
    private ObjectAnimator f19520s;

    private static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C31521();
        private int f9776a;

        static class C31521 implements Creator<SavedState> {
            C31521() {
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
            this.f9776a = parcel.readInt();
        }

        private SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(UnreadCounterFab.class.getSimpleName());
            stringBuilder.append(TemplatePrecompiler.DEFAULT_DEST);
            stringBuilder.append(SavedState.class.getSimpleName());
            stringBuilder.append("{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" count=");
            stringBuilder.append(this.f9776a);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f9776a);
        }
    }

    public UnreadCounterFab(Context context) {
        this(context, null, 0);
    }

    public UnreadCounterFab(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UnreadCounterFab(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19507d = new Property<UnreadCounterFab, Float>(this, Float.class, "animation") {
            final /* synthetic */ UnreadCounterFab f9775a;

            public final /* synthetic */ Object get(Object obj) {
                return Float.valueOf(0.0f);
            }

            public final /* synthetic */ void set(Object obj, Object obj2) {
                this.f9775a.f19516o = ((Float) obj2).floatValue();
                if (VERSION.SDK_INT >= 16) {
                    this.f9775a.postInvalidateOnAnimation();
                } else {
                    this.f9775a.postInvalidate();
                }
            }
        };
        setUseCompatPadding(true);
        this.f19515n = C2535a.m6888a().m6919b().equals("fa");
        float f = getResources().getDisplayMetrics().density;
        this.f19510i = 11.0f * f;
        f *= 2.0f;
        this.f19514m = getResources().getInteger(17694720);
        this.f19516o = BallPulseIndicator.SCALE;
        this.f19509h = new Paint(1);
        this.f19509h.setStyle(Style.STROKE);
        this.f19509h.setColor(-1);
        this.f19509h.setTextSize(this.f19510i);
        this.f19509h.setTextAlign(Align.CENTER);
        this.f19509h.setTypeface(Typeface.SANS_SERIF);
        this.f19511j = new Paint(1);
        this.f19511j.setStyle(Style.FILL);
        this.f19511j.setColor(UIThemeManager.getmInstance().getAccent_color());
        this.f19513l = new Paint(1);
        this.f19513l.setStyle(Style.FILL);
        this.f19513l.setColor(f19505e);
        Rect rect = new Rect();
        this.f19509h.getTextBounds("+99", 0, 3, rect);
        this.f19519r = (float) rect.height();
        int max = (int) (((Math.max(this.f19509h.measureText("+99"), this.f19519r) / 2.0f) + f) * 2.0f);
        this.f19512k = new Rect(0, 0, max, max);
        this.f19508g = new Rect();
        m17267a();
    }

    private void m17267a() {
        String b;
        if (this.f19517p > 99) {
            this.f19518q = String.valueOf("+99");
            if (this.f19515n) {
                b = C2491i.m6814b("+99");
            } else {
                return;
            }
        }
        b = this.f19517p == 0 ? "" : this.f19515n ? C2491i.m6809b(this.f19517p) : String.valueOf(this.f19517p);
        this.f19518q = b;
    }

    private boolean m17268b() {
        return this.f19520s != null && this.f19520s.isRunning();
    }

    public int getCount() {
        return this.f19517p;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f19517p > 0 || m17268b()) {
            if (m8765a(this.f19508g)) {
                this.f19512k.offsetTo((this.f19508g.left + (this.f19508g.width() / 2)) - (this.f19512k.width() / 2), (this.f19508g.top - (this.f19512k.height() / 2)) + 5);
            }
            float centerX = (float) this.f19512k.centerX();
            float centerY = (float) this.f19512k.centerY();
            float width = (((float) this.f19512k.width()) / 2.0f) * this.f19516o;
            canvas.drawCircle(centerX, centerY, width, this.f19511j);
            canvas.drawCircle(centerX, centerY, width, this.f19513l);
            this.f19509h.setTextSize(this.f19510i * this.f19516o);
            canvas.drawText(this.f19518q, centerX, centerY + (this.f19519r / 2.0f), this.f19509h);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCount(savedState.f9776a);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9776a = this.f19517p;
        return savedState;
    }

    public void setCount(int i) {
        if (i != this.f19517p) {
            if (i <= 0) {
                i = 0;
            }
            this.f19517p = i;
            m17267a();
            if (C0571r.m1326D(this)) {
                i = this.f19517p;
                float f = BallPulseIndicator.SCALE;
                float f2 = 0.0f;
                if (i != 0) {
                    f2 = BallPulseIndicator.SCALE;
                    f = 0.0f;
                }
                if (m17268b()) {
                    this.f19520s.cancel();
                }
                this.f19520s = ObjectAnimator.ofObject(this, this.f19507d, null, new Float[]{Float.valueOf(f), Float.valueOf(f2)});
                this.f19520s.setInterpolator(f19506f);
                this.f19520s.setDuration((long) this.f19514m);
                this.f19520s.start();
            }
        }
    }
}
