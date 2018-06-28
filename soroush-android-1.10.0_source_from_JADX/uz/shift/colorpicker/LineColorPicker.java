package uz.shift.colorpicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import uz.shift.colorpicker.C7884c.C7883a;

public class LineColorPicker extends View {
    int[] f24954a;
    boolean f24955b;
    private Paint f24956c;
    private Rect f24957d;
    private int f24958e;
    private C7881a f24959f;
    private int f24960g;
    private int f24961h;
    private boolean f24962i;
    private int f24963j;
    private int f24964k;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C78801();
        int f24952a;
        boolean f24953b;

        static class C78801 implements Creator<SavedState> {
            C78801() {
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
            this.f24952a = parcel.readInt();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f24953b = z;
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f24952a);
            parcel.writeInt(this.f24953b);
        }
    }

    public LineColorPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24954a = isInEditMode() ? C7882b.f24965a : new int[1];
        this.f24957d = new Rect();
        boolean z = false;
        this.f24955b = false;
        this.f24958e = this.f24954a[0];
        this.f24961h = 0;
        this.f24962i = false;
        this.f24956c = new Paint();
        this.f24956c.setStyle(Style.FILL);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C7883a.LineColorPicker, 0, 0);
        try {
            this.f24961h = obtainStyledAttributes.getInteger(C7883a.LineColorPicker_orientation, 0);
            if (!isInEditMode()) {
                int resourceId = obtainStyledAttributes.getResourceId(C7883a.LineColorPicker_colors, -1);
                if (resourceId > 0) {
                    setColors(context.getResources().getIntArray(resourceId));
                }
            }
            boolean integer = obtainStyledAttributes.getInteger(C7883a.LineColorPicker_selectedColorIndex, -1);
            if (!integer) {
                int[] colors = getColors();
                if (colors != null) {
                    z = colors.length;
                }
                if (integer < z) {
                    setSelectedColorPosition(integer);
                }
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    private int m22177a() {
        float f;
        int length;
        if (this.f24961h == 0) {
            f = (float) this.f24963j;
            length = this.f24954a.length;
        } else {
            f = (float) this.f24964k;
            length = this.f24954a.length;
        }
        this.f24960g = Math.round(f / (((float) length) * BallPulseIndicator.SCALE));
        return this.f24960g;
    }

    private int m22178a(float f, float f2) {
        int i = 0;
        int i2;
        if (this.f24961h == 0) {
            int i3 = 0;
            while (i < this.f24954a.length) {
                i2 = this.f24960g + i3;
                if (((float) i3) <= f && ((float) i2) >= f) {
                    return this.f24954a[i];
                }
                i++;
                i3 = i2;
            }
        } else {
            int i4 = 0;
            while (i < this.f24954a.length) {
                i2 = this.f24960g + i4;
                if (f2 >= ((float) i4) && f2 <= ((float) i2)) {
                    return this.f24954a[i];
                }
                i++;
                i4 = i2;
            }
        }
        return this.f24958e;
    }

    private static boolean m22179a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public int getColor() {
        return this.f24958e;
    }

    public int[] getColors() {
        return this.f24954a;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int round;
        int i;
        Rect rect;
        int height;
        if (this.f24961h == 0) {
            this.f24957d.left = 0;
            this.f24957d.top = 0;
            this.f24957d.right = 0;
            this.f24957d.bottom = canvas.getHeight();
            round = Math.round(((float) canvas.getHeight()) * 0.08f);
            i = 0;
            while (i < this.f24954a.length) {
                this.f24956c.setColor(this.f24954a[i]);
                this.f24957d.left = this.f24957d.right;
                rect = this.f24957d;
                rect.right += this.f24960g;
                if (this.f24955b && this.f24954a[i] == this.f24958e) {
                    this.f24957d.top = 0;
                    rect = this.f24957d;
                    height = canvas.getHeight();
                } else {
                    this.f24957d.top = round;
                    rect = this.f24957d;
                    height = canvas.getHeight() - round;
                }
                rect.bottom = height;
                canvas.drawRect(this.f24957d, this.f24956c);
                i++;
            }
            return;
        }
        this.f24957d.left = 0;
        this.f24957d.top = 0;
        this.f24957d.right = canvas.getWidth();
        this.f24957d.bottom = 0;
        round = Math.round(((float) canvas.getWidth()) * 0.08f);
        i = 0;
        while (i < this.f24954a.length) {
            this.f24956c.setColor(this.f24954a[i]);
            this.f24957d.top = this.f24957d.bottom;
            rect = this.f24957d;
            rect.bottom += this.f24960g;
            if (this.f24955b && this.f24954a[i] == this.f24958e) {
                this.f24957d.left = 0;
                rect = this.f24957d;
                height = canvas.getWidth();
            } else {
                this.f24957d.left = round;
                rect = this.f24957d;
                height = canvas.getWidth() - round;
            }
            rect.right = height;
            canvas.drawRect(this.f24957d, this.f24956c);
            i++;
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.f24958e = savedState.f24952a;
            this.f24955b = savedState.f24953b;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f24952a = this.f24958e;
        savedState.f24953b = this.f24955b;
        return savedState;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f24963j = i;
        this.f24964k = i2;
        m22177a();
        super.onSizeChanged(i, i2, i3, i4);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f24962i = true;
                break;
            case 1:
                setSelectedColor(m22178a(motionEvent.getX(), motionEvent.getY()));
                if (this.f24962i) {
                    performClick();
                    return true;
                }
                break;
            case 2:
                setSelectedColor(m22178a(motionEvent.getX(), motionEvent.getY()));
                return true;
            case 3:
            case 4:
                this.f24962i = false;
                return true;
            default:
                return true;
        }
        return true;
    }

    public boolean performClick() {
        return super.performClick();
    }

    public void setColors(int[] iArr) {
        this.f24954a = iArr;
        if (!m22179a(iArr, this.f24958e)) {
            this.f24958e = iArr[0];
        }
        m22177a();
        invalidate();
    }

    public void setOnColorChangedListener(C7881a c7881a) {
        this.f24959f = c7881a;
    }

    public void setSelectedColor(int i) {
        if (m22179a(this.f24954a, i)) {
            if (!(this.f24955b && this.f24958e == i)) {
                this.f24958e = i;
                this.f24955b = true;
                invalidate();
            }
        }
    }

    public void setSelectedColorPosition(int i) {
        setSelectedColor(this.f24954a[i]);
    }
}
