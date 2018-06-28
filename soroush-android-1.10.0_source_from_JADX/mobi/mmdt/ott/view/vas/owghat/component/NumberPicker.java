package mobi.mmdt.ott.view.vas.owghat.component;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p029a.C0346c;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Scroller;
import java.text.DecimalFormatSymbols;
import java.util.Formatter;
import java.util.Locale;
import mobi.mmdt.ott.C2540d.C2534a;
import mobi.mmdt.ott.R;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public class NumberPicker extends LinearLayout {
    private static final C6280f f12507a = new C6280f();
    private static final char[] al = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '٠', '١', '٢', '٣', '٤', '٥', '٦', '٧', '٨', '٩', '۰', '۱', '۲', '۳', '۴', '۵', '۶', '۷', '۸', '۹', '-'};
    private final Paint f12508A;
    private int f12509B;
    private int f12510C;
    private int f12511D;
    private final Scroller f12512E;
    private final Scroller f12513F;
    private int f12514G;
    private int f12515H;
    private C4545e f12516I;
    private C4541a f12517J;
    private float f12518K;
    private float f12519L;
    private float f12520M;
    private float f12521N;
    private VelocityTracker f12522O;
    private int f12523P;
    private int f12524Q;
    private int f12525R;
    private boolean f12526S;
    private Drawable f12527T;
    private int f12528U;
    private int f12529V;
    private int f12530W;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private float ag;
    private float ah;
    private int ai;
    private int aj;
    private Context ak;
    private final EditText f12531b;
    private int f12532c;
    private int f12533d;
    private int f12534e;
    private int f12535f;
    private final boolean f12536g;
    private int f12537h;
    private int f12538i;
    private float f12539j;
    private float f12540k;
    private Typeface f12541l;
    private int f12542m;
    private int f12543n;
    private String[] f12544o;
    private int f12545p;
    private int f12546q;
    private int f12547r;
    private C4544d f12548s;
    private C4543c f12549t;
    private C4542b f12550u;
    private long f12551v;
    private final SparseArray<String> f12552w;
    private int f12553x;
    private int f12554y;
    private int[] f12555z;

    class C4541a implements Runnable {
        final /* synthetic */ NumberPicker f12502a;
        private boolean f12503b;

        C4541a(NumberPicker numberPicker) {
            this.f12502a = numberPicker;
        }

        public final void run() {
            this.f12502a.m8271a(this.f12503b);
            this.f12502a.postDelayed(this, this.f12502a.f12551v);
        }
    }

    public interface C4542b {
        String mo2438a(int i);
    }

    public interface C4543c {
    }

    public interface C4544d {
    }

    class C4545e implements Runnable {
        final /* synthetic */ NumberPicker f12504a;
        private int f12505b;
        private int f12506c;

        public final void run() {
            this.f12504a.f12531b.setSelection(this.f12505b, this.f12506c);
        }
    }

    private static class C6280f implements C4542b {
        final StringBuilder f17138a = new StringBuilder();
        char f17139b;
        Formatter f17140c;
        final Object[] f17141d = new Object[1];

        C6280f() {
            m14659a(Locale.getDefault());
        }

        private void m14659a(Locale locale) {
            this.f17140c = new Formatter(this.f17138a, locale);
            this.f17139b = C6280f.m14660b(locale);
        }

        private static char m14660b(Locale locale) {
            return new DecimalFormatSymbols(locale).getZeroDigit();
        }

        public final String mo2438a(int i) {
            Locale locale = Locale.getDefault();
            if (this.f17139b != C6280f.m14660b(locale)) {
                m14659a(locale);
            }
            this.f17141d[0] = Integer.valueOf(i);
            this.f17138a.delete(0, this.f17138a.length());
            this.f17140c.format("%02d", this.f17141d);
            return this.f17140c.toString();
        }
    }

    public NumberPicker(Context context) {
        this(context, null);
    }

    public NumberPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NumberPicker(Context context, AttributeSet attributeSet, int i) {
        float f;
        int i2;
        ViewConfiguration viewConfiguration;
        super(context, attributeSet);
        this.f12537h = -16777216;
        this.f12538i = -16777216;
        this.f12539j = 25.0f;
        this.f12540k = 25.0f;
        this.f12545p = 1;
        this.f12546q = 100;
        this.f12551v = 300;
        this.f12552w = new SparseArray();
        this.f12553x = 3;
        this.f12554y = this.f12553x / 2;
        this.f12555z = new int[this.f12553x];
        this.f12510C = Integer.MIN_VALUE;
        this.f12528U = -16777216;
        this.aa = 0;
        this.af = -1;
        this.ak = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2534a.NumberPicker, i, 0);
        this.f12527T = C0346c.m682a(context, (int) R.drawable.np_numberpicker_selection_divider);
        this.f12528U = obtainStyledAttributes.getColor(0, this.f12528U);
        this.f12529V = obtainStyledAttributes.getDimensionPixelSize(1, (int) TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics()));
        this.f12530W = obtainStyledAttributes.getDimensionPixelSize(2, (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics()));
        this.aj = obtainStyledAttributes.getInt(7, 0);
        this.ai = obtainStyledAttributes.getInt(8, 1);
        this.ag = (float) obtainStyledAttributes.getDimensionPixelSize(16, -1);
        this.ah = (float) obtainStyledAttributes.getDimensionPixelSize(4, -1);
        m8288f();
        this.f12536g = true;
        this.f12547r = obtainStyledAttributes.getInt(14, this.f12547r);
        this.f12546q = obtainStyledAttributes.getInt(5, this.f12546q);
        this.f12545p = obtainStyledAttributes.getInt(6, this.f12545p);
        this.f12537h = obtainStyledAttributes.getColor(9, this.f12537h);
        this.f12540k = obtainStyledAttributes.getDimension(10, m8280c(this.f12540k));
        this.f12538i = obtainStyledAttributes.getColor(11, this.f12538i);
        this.f12539j = obtainStyledAttributes.getDimension(12, m8280c(this.f12539j));
        this.f12541l = Typeface.create(obtainStyledAttributes.getString(13), 0);
        this.f12550u = m8267a(obtainStyledAttributes.getString(3));
        this.f12553x = obtainStyledAttributes.getInt(15, this.f12553x);
        setWillNotDraw(false);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.number_picker_with_selector_wheel, this, true);
        this.f12531b = (EditText) findViewById(R.id.np__numberpicker_input);
        this.f12531b.setEnabled(false);
        this.f12531b.setFocusable(false);
        this.f12531b.setImeOptions(1);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Align.CENTER);
        this.f12508A = paint;
        setSelectedTextColor(this.f12537h);
        setTextColor(this.f12538i);
        setTextSize(this.f12539j);
        setSelectedTextSize(this.f12540k);
        setTypeface(this.f12541l);
        setFormatter(this.f12550u);
        m8282c();
        setValue(this.f12547r);
        setMaxValue(this.f12546q);
        setMinValue(this.f12545p);
        setDividerColor(this.f12528U);
        setWheelItemCount(this.f12553x);
        this.f12526S = obtainStyledAttributes.getBoolean(17, this.f12526S);
        setWrapSelectorWheel(this.f12526S);
        if (this.ag != -1.0f && this.ah != -1.0f) {
            f = this.ag;
            i2 = this.f12534e;
        } else if (this.ag != -1.0f) {
            setScaleX(this.ag / ((float) this.f12534e));
            f = this.ag;
            i2 = this.f12534e;
            setScaleY(f / ((float) i2));
            viewConfiguration = ViewConfiguration.get(context);
            this.f12523P = viewConfiguration.getScaledTouchSlop();
            this.f12524Q = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f12525R = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
            this.f12512E = new Scroller(context, null, true);
            this.f12513F = new Scroller(context, new DecelerateInterpolator(2.5f));
            if (VERSION.SDK_INT >= 16 && getImportantForAccessibility() == 0) {
                setImportantForAccessibility(1);
            }
            obtainStyledAttributes.recycle();
        } else {
            if (this.ah != -1.0f) {
                f = this.ah;
                i2 = this.f12533d;
            }
            viewConfiguration = ViewConfiguration.get(context);
            this.f12523P = viewConfiguration.getScaledTouchSlop();
            this.f12524Q = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f12525R = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
            this.f12512E = new Scroller(context, null, true);
            this.f12513F = new Scroller(context, new DecelerateInterpolator(2.5f));
            setImportantForAccessibility(1);
            obtainStyledAttributes.recycle();
        }
        setScaleX(f / ((float) i2));
        f = this.ah;
        i2 = this.f12533d;
        setScaleY(f / ((float) i2));
        viewConfiguration = ViewConfiguration.get(context);
        this.f12523P = viewConfiguration.getScaledTouchSlop();
        this.f12524Q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f12525R = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        this.f12512E = new Scroller(context, null, true);
        this.f12513F = new Scroller(context, new DecelerateInterpolator(2.5f));
        setImportantForAccessibility(1);
        obtainStyledAttributes.recycle();
    }

    private float m8263a(float f) {
        return f * getResources().getDisplayMetrics().density;
    }

    private static int m8264a(int i, int i2) {
        if (i2 == -1) {
            return i;
        }
        int size = MeasureSpec.getSize(i);
        int mode = MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            return MeasureSpec.makeMeasureSpec(Math.min(size, i2), 1073741824);
        }
        if (mode == 0) {
            return MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        if (mode == 1073741824) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder("Unknown measure mode: ");
        stringBuilder.append(mode);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private static int m8265a(int i, int i2, int i3) {
        if (i == -1) {
            return i2;
        }
        i = Math.max(i, i2);
        i2 = MeasureSpec.getMode(i3);
        i3 = MeasureSpec.getSize(i3);
        if (i2 != Integer.MIN_VALUE) {
            if (i2 != 0) {
                if (i2 == 1073741824) {
                    i = i3;
                }
            }
        } else if (i3 < i) {
            i = 16777216 | i3;
        }
        return i | 0;
    }

    private C4542b m8267a(final String str) {
        return TextUtils.isEmpty(str) ? null : new C4542b(this) {
            final /* synthetic */ NumberPicker f17137b;

            public final String mo2438a(int i) {
                return String.format(Locale.getDefault(), str, new Object[]{Integer.valueOf(i)});
            }
        };
    }

    private void m8268a() {
        if (this.f12536g) {
            int i;
            int i2 = 0;
            float measureText;
            if (this.f12544o == null) {
                float f = 0.0f;
                for (i = 0; i <= 9; i++) {
                    measureText = this.f12508A.measureText(m8287f(i));
                    if (measureText > f) {
                        f = measureText;
                    }
                }
                for (i = this.f12546q; i > 0; i /= 10) {
                    i2++;
                }
                i = (int) (((float) i2) * f);
            } else {
                i = this.f12544o.length;
                int i3 = 0;
                while (i2 < i) {
                    measureText = this.f12508A.measureText(this.f12544o[i2]);
                    if (measureText > ((float) i3)) {
                        i3 = (int) measureText;
                    }
                    i2++;
                }
                i = i3;
            }
            i += this.f12531b.getPaddingLeft() + this.f12531b.getPaddingRight();
            if (this.f12535f != i) {
                if (i <= this.f12534e) {
                    i = this.f12534e;
                }
                this.f12535f = i;
                invalidate();
            }
        }
    }

    private void m8269a(int i) {
        if (this.aa != i) {
            this.aa = i;
        }
    }

    private void m8271a(boolean z) {
        this.f12531b.setVisibility(4);
        if (!m8274a(this.f12512E)) {
            m8274a(this.f12513F);
        }
        if (m8289g()) {
            this.f12514G = 0;
            if (z) {
                this.f12512E.startScroll(0, 0, -this.f12509B, 0, IjkMediaCodecInfo.RANK_SECURE);
            } else {
                this.f12512E.startScroll(0, 0, this.f12509B, 0, IjkMediaCodecInfo.RANK_SECURE);
            }
        } else {
            this.f12515H = 0;
            if (z) {
                this.f12512E.startScroll(0, 0, 0, -this.f12509B, IjkMediaCodecInfo.RANK_SECURE);
            } else {
                this.f12512E.startScroll(0, 0, 0, this.f12509B, IjkMediaCodecInfo.RANK_SECURE);
            }
        }
        invalidate();
    }

    private void m8272a(boolean z, long j) {
        if (this.f12517J == null) {
            this.f12517J = new C4541a(this);
        } else {
            removeCallbacks(this.f12517J);
        }
        this.f12517J.f12503b = z;
        postDelayed(this.f12517J, j);
    }

    private void m8273a(int[] iArr) {
        int i = 0;
        while (i < iArr.length - 1) {
            int i2 = i + 1;
            iArr[i] = iArr[i2];
            i = i2;
        }
        i = iArr[iArr.length - 2] + 1;
        if (this.f12526S && i > this.f12546q) {
            i = this.f12545p;
        }
        iArr[iArr.length - 1] = i;
        m8284d(i);
    }

    private boolean m8274a(Scroller scroller) {
        scroller.forceFinished(true);
        int finalX;
        int i;
        if (m8289g()) {
            finalX = scroller.getFinalX() - scroller.getCurrX();
            i = this.f12510C - ((this.f12511D + finalX) % this.f12509B);
            if (i != 0) {
                if (Math.abs(i) > this.f12509B / 2) {
                    i = i > 0 ? i - this.f12509B : i + this.f12509B;
                }
                scrollBy(finalX + i, 0);
                return true;
            }
        }
        finalX = scroller.getFinalY() - scroller.getCurrY();
        i = this.f12510C - ((this.f12511D + finalX) % this.f12509B);
        if (i != 0) {
            if (Math.abs(i) > this.f12509B / 2) {
                i = i > 0 ? i - this.f12509B : i + this.f12509B;
            }
            scrollBy(0, finalX + i);
            return true;
        }
        return false;
    }

    private float m8275b(float f) {
        return f / getResources().getDisplayMetrics().density;
    }

    private void m8277b() {
        this.f12552w.clear();
        int[] selectorIndices = getSelectorIndices();
        int value = getValue();
        for (int i = 0; i < this.f12555z.length; i++) {
            int i2 = (i - this.f12554y) + value;
            if (this.f12526S) {
                i2 = m8281c(i2);
            }
            selectorIndices[i] = i2;
            m8284d(selectorIndices[i]);
        }
    }

    private void m8278b(int i) {
        Scroller scroller;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (m8289g()) {
            this.f12514G = 0;
            if (i > 0) {
                scroller = this.f12512E;
                i2 = 0;
            } else {
                scroller = this.f12512E;
                i2 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            }
            i3 = 0;
            i4 = i;
            i5 = 0;
            i6 = 0;
            i7 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            i8 = 0;
            i9 = 0;
        } else {
            this.f12515H = 0;
            if (i > 0) {
                scroller = this.f12512E;
                i2 = 0;
                i3 = 0;
            } else {
                scroller = this.f12512E;
                i2 = 0;
                i3 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            }
            i4 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
            i9 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            i5 = i;
        }
        scroller.fling(i2, i3, i4, i5, i6, i7, i8, i9);
        invalidate();
    }

    private void m8279b(int[] iArr) {
        int length;
        for (length = iArr.length - 1; length > 0; length--) {
            iArr[length] = iArr[length - 1];
        }
        length = iArr[1] - 1;
        if (this.f12526S && length < this.f12545p) {
            length = this.f12546q;
        }
        iArr[0] = length;
        m8284d(length);
    }

    private float m8280c(float f) {
        return TypedValue.applyDimension(2, f, getResources().getDisplayMetrics());
    }

    private int m8281c(int i) {
        return i > this.f12546q ? (this.f12545p + ((i - this.f12546q) % (this.f12546q - this.f12545p))) - 1 : i < this.f12545p ? (this.f12546q - ((this.f12545p - i) % (this.f12546q - this.f12545p))) + 1 : i;
    }

    private boolean m8282c() {
        CharSequence e = this.f12544o == null ? m8285e(this.f12547r) : this.f12544o[this.f12547r - this.f12545p];
        if (TextUtils.isEmpty(e) || e.equals(this.f12531b.getText().toString())) {
            return false;
        }
        this.f12531b.setText(e);
        return true;
    }

    private void m8283d() {
        if (this.f12517J != null) {
            removeCallbacks(this.f12517J);
        }
        if (this.f12516I != null) {
            removeCallbacks(this.f12516I);
        }
    }

    private void m8284d(int i) {
        SparseArray sparseArray = this.f12552w;
        if (((String) sparseArray.get(i)) == null) {
            Object obj;
            if (i >= this.f12545p) {
                if (i <= this.f12546q) {
                    if (this.f12544o != null) {
                        obj = this.f12544o[i - this.f12545p];
                    } else {
                        obj = m8285e(i);
                    }
                    sparseArray.put(i, obj);
                }
            }
            obj = "";
            sparseArray.put(i, obj);
        }
    }

    private String m8285e(int i) {
        return this.f12550u != null ? this.f12550u.mo2438a(i) : m8287f(i);
    }

    private boolean m8286e() {
        int i = this.f12510C - this.f12511D;
        if (i == 0) {
            return false;
        }
        Scroller scroller;
        int i2;
        int i3;
        int i4;
        int i5;
        if (Math.abs(i) > this.f12509B / 2) {
            i += i > 0 ? -this.f12509B : this.f12509B;
        }
        int i6 = i;
        if (m8289g()) {
            this.f12514G = 0;
            scroller = this.f12513F;
            i2 = 0;
            i3 = 0;
            i4 = 800;
            i5 = i6;
            i6 = 0;
        } else {
            this.f12515H = 0;
            scroller = this.f12513F;
            i2 = 0;
            i3 = 0;
            i5 = 0;
            i4 = 800;
        }
        scroller.startScroll(i2, i3, i5, i6, i4);
        invalidate();
        return true;
    }

    private static String m8287f(int i) {
        return String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i)});
    }

    private void m8288f() {
        float a;
        if (m8289g()) {
            this.f12532c = -1;
            this.f12533d = (int) m8263a(64.0f);
            a = m8263a(180.0f);
        } else {
            this.f12532c = -1;
            this.f12533d = (int) m8263a(180.0f);
            a = m8263a(64.0f);
        }
        this.f12534e = (int) a;
        this.f12535f = -1;
    }

    private boolean m8289g() {
        return getOrientation() == 0;
    }

    private int[] getSelectorIndices() {
        return this.f12555z;
    }

    public static final C4542b getTwoDigitFormatter() {
        return f12507a;
    }

    private boolean m8290h() {
        return getOrder() == 0;
    }

    private void setTypeface$505cff1c(String str) {
        if (!TextUtils.isEmpty(str)) {
            setTypeface(Typeface.create(str, 0));
        }
    }

    private void setValueInternal$2563266(int i) {
        if (this.f12547r != i) {
            this.f12547r = this.f12526S ? m8281c(i) : Math.min(Math.max(i, this.f12545p), this.f12546q);
            m8282c();
            m8277b();
            invalidate();
        }
    }

    public void computeScroll() {
        Scroller scroller = this.f12512E;
        if (scroller.isFinished()) {
            scroller = this.f12513F;
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        int currX;
        if (m8289g()) {
            currX = scroller.getCurrX();
            if (this.f12514G == 0) {
                this.f12514G = scroller.getStartX();
            }
            scrollBy(currX - this.f12514G, 0);
            this.f12514G = currX;
        } else {
            currX = scroller.getCurrY();
            if (this.f12515H == 0) {
                this.f12515H = scroller.getStartY();
            }
            scrollBy(0, currX - this.f12515H);
            this.f12515H = currX;
        }
        if (!scroller.isFinished()) {
            invalidate();
        } else if (scroller == this.f12512E) {
            if (!m8286e()) {
                m8282c();
            }
            m8269a(0);
        } else {
            if (this.aa != 1) {
                m8282c();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
        r5 = this;
        r0 = r6.getKeyCode();
        r1 = 23;
        if (r0 == r1) goto L_0x0058;
    L_0x0008:
        r1 = 66;
        if (r0 == r1) goto L_0x0058;
    L_0x000c:
        switch(r0) {
            case 19: goto L_0x0010;
            case 20: goto L_0x0010;
            default: goto L_0x000f;
        };
    L_0x000f:
        goto L_0x005b;
    L_0x0010:
        r1 = r6.getAction();
        r2 = 1;
        switch(r1) {
            case 0: goto L_0x0021;
            case 1: goto L_0x0019;
            default: goto L_0x0018;
        };
    L_0x0018:
        goto L_0x005b;
    L_0x0019:
        r1 = r5.af;
        if (r1 != r0) goto L_0x005b;
    L_0x001d:
        r6 = -1;
        r5.af = r6;
        return r2;
    L_0x0021:
        r1 = r5.f12526S;
        r3 = 20;
        if (r1 != 0) goto L_0x0035;
    L_0x0027:
        if (r0 != r3) goto L_0x002a;
    L_0x0029:
        goto L_0x0035;
    L_0x002a:
        r1 = r5.getValue();
        r4 = r5.getMinValue();
        if (r1 <= r4) goto L_0x005b;
    L_0x0034:
        goto L_0x003f;
    L_0x0035:
        r1 = r5.getValue();
        r4 = r5.getMaxValue();
        if (r1 >= r4) goto L_0x005b;
    L_0x003f:
        r5.requestFocus();
        r5.af = r0;
        r5.m8283d();
        r6 = r5.f12512E;
        r6 = r6.isFinished();
        if (r6 == 0) goto L_0x0057;
    L_0x004f:
        if (r0 != r3) goto L_0x0053;
    L_0x0051:
        r6 = r2;
        goto L_0x0054;
    L_0x0053:
        r6 = 0;
    L_0x0054:
        r5.m8271a(r6);
    L_0x0057:
        return r2;
    L_0x0058:
        r5.m8283d();
    L_0x005b:
        r6 = super.dispatchKeyEvent(r6);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.vas.owghat.component.NumberPicker.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            m8283d();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            m8283d();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    protected float getBottomFadingEdgeStrength() {
        return m8289g() ? 0.0f : 0.9f;
    }

    public String[] getDisplayedValues() {
        return this.f12544o;
    }

    public int getDividerColor() {
        return this.f12528U;
    }

    public float getDividerDistance() {
        return m8275b((float) this.f12529V);
    }

    public float getDividerThickness() {
        return m8275b((float) this.f12530W);
    }

    public C4542b getFormatter() {
        return this.f12550u;
    }

    protected float getLeftFadingEdgeStrength() {
        return m8289g() ? 0.9f : 0.0f;
    }

    public int getMaxValue() {
        return this.f12546q;
    }

    public int getMinValue() {
        return this.f12545p;
    }

    public int getOrder() {
        return this.aj;
    }

    public int getOrientation() {
        return this.ai;
    }

    protected float getRightFadingEdgeStrength() {
        return m8289g() ? 0.9f : 0.0f;
    }

    public int getSelectedTextColor() {
        return this.f12537h;
    }

    public float getSelectedTextSize() {
        return this.f12540k;
    }

    public int getTextColor() {
        return this.f12538i;
    }

    public float getTextSize() {
        return m8280c(this.f12539j);
    }

    protected float getTopFadingEdgeStrength() {
        return m8289g() ? 0.0f : 0.9f;
    }

    public Typeface getTypeface() {
        return this.f12541l;
    }

    public int getValue() {
        return this.f12547r;
    }

    public int getWheelItemCount() {
        return this.f12553x;
    }

    public boolean getWrapSelectorWheel() {
        return this.f12526S;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m8283d();
    }

    protected void onDraw(Canvas canvas) {
        float f;
        int baseline;
        int i;
        if (m8289g()) {
            f = (float) this.f12511D;
            baseline = this.f12531b.getBaseline() + this.f12531b.getTop();
        } else {
            f = (float) ((getRight() - getLeft()) / 2);
            baseline = this.f12511D;
        }
        float f2 = (float) baseline;
        int[] selectorIndices = getSelectorIndices();
        float f3 = f2;
        f2 = f;
        for (i = 0; i < selectorIndices.length; i++) {
            Paint paint;
            int i2;
            if (i == this.f12554y) {
                this.f12508A.setTextSize(this.f12540k);
                paint = this.f12508A;
                i2 = this.f12537h;
            } else {
                this.f12508A.setTextSize(this.f12539j);
                paint = this.f12508A;
                i2 = this.f12538i;
            }
            paint.setColor(i2);
            String str = (String) this.f12552w.get(selectorIndices[m8290h() ? i : (selectorIndices.length - i) - 1]);
            if (!(i == this.f12554y && this.f12531b.getVisibility() == 0)) {
                canvas.drawText(str, f2, f3, this.f12508A);
            }
            if (m8289g()) {
                f2 += (float) this.f12509B;
            } else {
                f3 += (float) this.f12509B;
            }
        }
        if (this.f12527T != null) {
            if (m8289g()) {
                i = this.ad;
                this.f12527T.setBounds(i, 0, this.f12530W + i, getBottom());
                this.f12527T.draw(canvas);
                i = this.ae;
                this.f12527T.setBounds(i - this.f12530W, 0, i, getBottom());
                this.f12527T.draw(canvas);
                return;
            }
            i = this.ab;
            this.f12527T.setBounds(0, i, getRight(), this.f12530W + i);
            this.f12527T.draw(canvas);
            i = this.ac;
            this.f12527T.setBounds(0, i - this.f12530W, getRight(), i);
            this.f12527T.draw(canvas);
        }
    }

    @TargetApi(15)
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(NumberPicker.class.getName());
        accessibilityEvent.setScrollable(true);
        int i = (this.f12545p + this.f12547r) * this.f12509B;
        int i2 = (this.f12546q - this.f12545p) * this.f12509B;
        if (m8289g()) {
            accessibilityEvent.setScrollX(i);
            accessibilityEvent.setMaxScrollX(i2);
            return;
        }
        accessibilityEvent.setScrollY(i);
        accessibilityEvent.setMaxScrollY(i2);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || (motionEvent.getAction() & 255) != 0) {
            return false;
        }
        m8283d();
        this.f12531b.setVisibility(4);
        if (m8289g()) {
            float x = motionEvent.getX();
            this.f12518K = x;
            this.f12520M = x;
            getParent().requestDisallowInterceptTouchEvent(true);
            if (!this.f12512E.isFinished()) {
                this.f12512E.forceFinished(true);
                this.f12513F.forceFinished(true);
                m8269a(0);
                return true;
            } else if (!this.f12513F.isFinished()) {
                this.f12512E.forceFinished(true);
                this.f12513F.forceFinished(true);
                return true;
            } else if (this.f12518K < ((float) this.ad)) {
                m8272a(false, (long) ViewConfiguration.getLongPressTimeout());
                return true;
            } else {
                if (this.f12518K > ((float) this.ae)) {
                    m8272a(true, (long) ViewConfiguration.getLongPressTimeout());
                }
                return true;
            }
        }
        x = motionEvent.getY();
        this.f12519L = x;
        this.f12521N = x;
        getParent().requestDisallowInterceptTouchEvent(true);
        if (!this.f12512E.isFinished()) {
            this.f12512E.forceFinished(true);
            this.f12513F.forceFinished(true);
            m8269a(0);
            return true;
        } else if (!this.f12513F.isFinished()) {
            this.f12512E.forceFinished(true);
            this.f12513F.forceFinished(true);
            return true;
        } else if (this.f12519L < ((float) this.ab)) {
            m8272a(false, (long) ViewConfiguration.getLongPressTimeout());
            return true;
        } else {
            if (this.f12519L > ((float) this.ac)) {
                m8272a(true, (long) ViewConfiguration.getLongPressTimeout());
            }
            return true;
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        i = getMeasuredWidth();
        i2 = getMeasuredHeight();
        i3 = this.f12531b.getMeasuredWidth();
        i4 = this.f12531b.getMeasuredHeight();
        i = (i - i3) / 2;
        i2 = (i2 - i4) / 2;
        this.f12531b.layout(i, i2, i3 + i, i4 + i2);
        if (z) {
            int right;
            m8277b();
            int[] selectorIndices = getSelectorIndices();
            i2 = selectorIndices.length * ((int) this.f12539j);
            float length = (float) selectorIndices.length;
            if (m8289g()) {
                this.f12542m = (int) ((((float) ((getRight() - getLeft()) - i2)) / length) + 0.5f);
                this.f12509B = ((int) this.f12539j) + this.f12542m;
                right = this.f12531b.getRight() / 2;
            } else {
                this.f12543n = (int) ((((float) ((getBottom() - getTop()) - i2)) / length) + 0.5f);
                this.f12509B = ((int) this.f12539j) + this.f12543n;
                right = this.f12531b.getBaseline() + this.f12531b.getTop();
            }
            this.f12510C = right - (this.f12509B * this.f12554y);
            this.f12511D = this.f12510C;
            m8282c();
            if (m8289g()) {
                setHorizontalFadingEdgeEnabled(true);
                right = getRight();
                i = getLeft();
            } else {
                setVerticalFadingEdgeEnabled(true);
                right = getBottom();
                i = getTop();
            }
            setFadingEdgeLength(((right - i) - ((int) this.f12539j)) / 2);
            if (m8289g()) {
                this.ad = ((getWidth() - this.f12529V) / 2) - this.f12530W;
                this.ae = (this.ad + (2 * this.f12530W)) + this.f12529V;
                return;
            }
            this.ab = ((getHeight() - this.f12529V) / 2) - this.f12530W;
            this.ac = (this.ab + (2 * this.f12530W)) + this.f12529V;
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(m8264a(i, this.f12535f), m8264a(i2, this.f12533d));
        setMeasuredDimension(m8265a(this.f12534e, getMeasuredWidth(), i), m8265a(this.f12532c, getMeasuredHeight(), i2));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
        r6 = this;
        r0 = r6.isEnabled();
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = r6.f12522O;
        if (r0 != 0) goto L_0x0012;
    L_0x000c:
        r0 = android.view.VelocityTracker.obtain();
        r6.f12522O = r0;
    L_0x0012:
        r0 = r6.f12522O;
        r0.addMovement(r7);
        r0 = r7.getAction();
        r0 = r0 & 255;
        r2 = 1;
        switch(r0) {
            case 1: goto L_0x007c;
            case 2: goto L_0x0022;
            default: goto L_0x0021;
        };
    L_0x0021:
        return r2;
    L_0x0022:
        r0 = r6.m8289g();
        if (r0 == 0) goto L_0x0052;
    L_0x0028:
        r7 = r7.getX();
        r0 = r6.aa;
        if (r0 == r2) goto L_0x0044;
    L_0x0030:
        r0 = r6.f12518K;
        r0 = r7 - r0;
        r0 = java.lang.Math.abs(r0);
        r0 = (int) r0;
        r1 = r6.f12523P;
        if (r0 <= r1) goto L_0x004f;
    L_0x003d:
        r6.m8283d();
        r6.m8269a(r2);
        goto L_0x004f;
    L_0x0044:
        r0 = r6.f12520M;
        r0 = r7 - r0;
        r0 = (int) r0;
        r6.scrollBy(r0, r1);
        r6.invalidate();
    L_0x004f:
        r6.f12520M = r7;
        return r2;
    L_0x0052:
        r7 = r7.getY();
        r0 = r6.aa;
        if (r0 == r2) goto L_0x006e;
    L_0x005a:
        r0 = r6.f12519L;
        r0 = r7 - r0;
        r0 = java.lang.Math.abs(r0);
        r0 = (int) r0;
        r1 = r6.f12523P;
        if (r0 <= r1) goto L_0x0079;
    L_0x0067:
        r6.m8283d();
        r6.m8269a(r2);
        goto L_0x0079;
    L_0x006e:
        r0 = r6.f12521N;
        r0 = r7 - r0;
        r0 = (int) r0;
        r6.scrollBy(r1, r0);
        r6.invalidate();
    L_0x0079:
        r6.f12521N = r7;
        return r2;
    L_0x007c:
        r0 = r6.f12517J;
        if (r0 == 0) goto L_0x0085;
    L_0x0080:
        r0 = r6.f12517J;
        r6.removeCallbacks(r0);
    L_0x0085:
        r0 = r6.f12522O;
        r3 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r6.f12525R;
        r4 = (float) r4;
        r0.computeCurrentVelocity(r3, r4);
        r3 = r6.m8289g();
        r4 = 2;
        if (r3 == 0) goto L_0x00d5;
    L_0x0096:
        r0 = r0.getXVelocity();
        r0 = (int) r0;
        r3 = java.lang.Math.abs(r0);
        r5 = r6.f12524Q;
        if (r3 <= r5) goto L_0x00aa;
    L_0x00a3:
        r6.m8278b(r0);
        r6.m8269a(r4);
        goto L_0x0101;
    L_0x00aa:
        r7 = r7.getX();
        r7 = (int) r7;
        r0 = (float) r7;
        r3 = r6.f12518K;
        r0 = r0 - r3;
        r0 = java.lang.Math.abs(r0);
        r0 = (int) r0;
        r3 = r6.f12523P;
        if (r0 > r3) goto L_0x00ce;
    L_0x00bc:
        r0 = r6.f12509B;
        r7 = r7 / r0;
        r0 = r6.f12554y;
        r7 = r7 - r0;
        if (r7 <= 0) goto L_0x00c8;
    L_0x00c4:
        r6.m8271a(r2);
        goto L_0x00d1;
    L_0x00c8:
        if (r7 >= 0) goto L_0x00ce;
    L_0x00ca:
        r6.m8271a(r1);
        goto L_0x00d1;
    L_0x00ce:
        r6.m8286e();
    L_0x00d1:
        r6.m8269a(r1);
        goto L_0x0101;
    L_0x00d5:
        r0 = r0.getYVelocity();
        r0 = (int) r0;
        r3 = java.lang.Math.abs(r0);
        r5 = r6.f12524Q;
        if (r3 <= r5) goto L_0x00e3;
    L_0x00e2:
        goto L_0x00a3;
    L_0x00e3:
        r7 = r7.getY();
        r7 = (int) r7;
        r0 = (float) r7;
        r3 = r6.f12519L;
        r0 = r0 - r3;
        r0 = java.lang.Math.abs(r0);
        r0 = (int) r0;
        r3 = r6.f12523P;
        if (r0 > r3) goto L_0x00ce;
    L_0x00f5:
        r0 = r6.f12509B;
        r7 = r7 / r0;
        r0 = r6.f12554y;
        r7 = r7 - r0;
        if (r7 <= 0) goto L_0x00fe;
    L_0x00fd:
        goto L_0x00c4;
    L_0x00fe:
        if (r7 >= 0) goto L_0x00ce;
    L_0x0100:
        goto L_0x00ca;
    L_0x0101:
        r7 = r6.f12522O;
        r7.recycle();
        r7 = 0;
        r6.f12522O = r7;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.vas.owghat.component.NumberPicker.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void scrollBy(int i, int i2) {
        int[] selectorIndices = getSelectorIndices();
        if (m8289g()) {
            if (m8290h()) {
                if (this.f12526S || i <= 0 || selectorIndices[this.f12554y] > this.f12545p) {
                    if (!this.f12526S && i < 0 && selectorIndices[this.f12554y] >= this.f12546q) {
                    }
                }
            } else if (this.f12526S || i <= 0 || selectorIndices[this.f12554y] < this.f12546q) {
                if (!this.f12526S && i < 0 && selectorIndices[this.f12554y] <= this.f12545p) {
                }
            }
            this.f12511D += i;
            i = this.f12542m;
            while (this.f12511D - this.f12510C > i) {
                this.f12511D -= this.f12509B;
                if (m8290h()) {
                    m8273a(selectorIndices);
                } else {
                    m8279b(selectorIndices);
                }
                setValueInternal$2563266(selectorIndices[this.f12554y]);
                if (!this.f12526S && selectorIndices[this.f12554y] < this.f12545p) {
                    this.f12511D = this.f12510C;
                }
            }
            while (this.f12511D - this.f12510C < (-i)) {
                this.f12511D += this.f12509B;
                if (m8290h()) {
                    m8279b(selectorIndices);
                } else {
                    m8273a(selectorIndices);
                }
                setValueInternal$2563266(selectorIndices[this.f12554y]);
                if (!this.f12526S && selectorIndices[this.f12554y] > this.f12546q) {
                    this.f12511D = this.f12510C;
                }
            }
            return;
        }
        if (m8290h()) {
            if (this.f12526S || i2 <= 0 || selectorIndices[this.f12554y] > this.f12545p) {
                if (!this.f12526S && i2 < 0 && selectorIndices[this.f12554y] >= this.f12546q) {
                }
            }
        } else if (this.f12526S || i2 <= 0 || selectorIndices[this.f12554y] < this.f12546q) {
            if (!this.f12526S && i2 < 0 && selectorIndices[this.f12554y] <= this.f12545p) {
            }
        }
        this.f12511D += i2;
        i = this.f12543n;
        while (this.f12511D - this.f12510C > i) {
            this.f12511D -= this.f12509B;
            if (m8290h()) {
                m8273a(selectorIndices);
            } else {
                m8279b(selectorIndices);
            }
            setValueInternal$2563266(selectorIndices[this.f12554y]);
            this.f12511D = this.f12510C;
        }
        while (this.f12511D - this.f12510C < (-i)) {
            this.f12511D += this.f12509B;
            if (m8290h()) {
                m8279b(selectorIndices);
            } else {
                m8273a(selectorIndices);
            }
            setValueInternal$2563266(selectorIndices[this.f12554y]);
            this.f12511D = this.f12510C;
        }
        return;
        this.f12511D = this.f12510C;
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.f12544o != strArr) {
            EditText editText;
            int i;
            this.f12544o = strArr;
            if (this.f12544o != null) {
                editText = this.f12531b;
                i = 524289;
            } else {
                editText = this.f12531b;
                i = 2;
            }
            editText.setRawInputType(i);
            m8282c();
            m8277b();
            m8268a();
        }
    }

    public void setDividerColor(int i) {
        this.f12528U = i;
        this.f12527T = new ColorDrawable(i);
    }

    public void setDividerColorResource(int i) {
        setDividerColor(C0346c.m687c(this.ak, i));
    }

    public void setDividerDistance(int i) {
        this.f12529V = (int) m8263a((float) i);
    }

    public void setDividerThickness(int i) {
        this.f12530W = (int) m8263a((float) i);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f12531b.setEnabled(z);
    }

    public void setFormatter(int i) {
        setFormatter(getResources().getString(i));
    }

    public void setFormatter(String str) {
        if (!TextUtils.isEmpty(str)) {
            setFormatter(m8267a(str));
        }
    }

    public void setFormatter(C4542b c4542b) {
        if (c4542b != this.f12550u) {
            this.f12550u = c4542b;
            m8277b();
            m8282c();
        }
    }

    public void setMaxValue(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
        this.f12546q = i;
        if (this.f12546q < this.f12547r) {
            this.f12547r = this.f12546q;
        }
        setWrapSelectorWheel(this.f12546q - this.f12545p > this.f12555z.length);
        m8277b();
        m8282c();
        m8268a();
        invalidate();
    }

    public void setMinValue(int i) {
        this.f12545p = i;
        if (this.f12545p > this.f12547r) {
            this.f12547r = this.f12545p;
        }
        setWrapSelectorWheel(this.f12546q - this.f12545p > this.f12555z.length);
        m8277b();
        m8282c();
        m8268a();
        invalidate();
    }

    public void setOnLongPressUpdateInterval(long j) {
        this.f12551v = j;
    }

    public void setOnScrollListener(C4543c c4543c) {
        this.f12549t = c4543c;
    }

    public void setOnValueChangedListener(C4544d c4544d) {
        this.f12548s = c4544d;
    }

    public void setOrder(int i) {
        this.aj = i;
    }

    public void setOrientation(int i) {
        this.ai = i;
        m8288f();
    }

    public void setSelectedTextColor(int i) {
        this.f12537h = i;
        this.f12531b.setTextColor(this.f12537h);
    }

    public void setSelectedTextColorResource(int i) {
        setSelectedTextColor(C0346c.m687c(this.ak, i));
    }

    public void setSelectedTextSize(float f) {
        this.f12540k = f;
        this.f12531b.setTextSize(this.f12540k / getResources().getDisplayMetrics().scaledDensity);
    }

    public void setSelectedTextSize(int i) {
        setSelectedTextSize(getResources().getDimension(i));
    }

    public void setTextColor(int i) {
        this.f12538i = i;
        this.f12508A.setColor(this.f12538i);
    }

    public void setTextColorResource(int i) {
        setTextColor(C0346c.m687c(this.ak, i));
    }

    public void setTextSize(float f) {
        this.f12539j = f;
        this.f12508A.setTextSize(this.f12539j);
    }

    public void setTextSize(int i) {
        setTextSize(getResources().getDimension(i));
    }

    public void setTypeface(int i) {
        setTypeface$505cff1c(getResources().getString(i));
    }

    public void setTypeface(Typeface typeface) {
        Paint paint;
        Typeface typeface2;
        this.f12541l = typeface;
        if (this.f12541l != null) {
            this.f12531b.setTypeface(this.f12541l);
            paint = this.f12508A;
            typeface2 = this.f12541l;
        } else {
            this.f12531b.setTypeface(Typeface.MONOSPACE);
            paint = this.f12508A;
            typeface2 = Typeface.MONOSPACE;
        }
        paint.setTypeface(typeface2);
    }

    public void setTypeface(String str) {
        setTypeface$505cff1c(str);
    }

    public void setValue(int i) {
        setValueInternal$2563266(i);
    }

    public void setWheelItemCount(int i) {
        this.f12553x = i;
        this.f12554y = this.f12553x / 2;
        this.f12555z = new int[this.f12553x];
    }

    public void setWrapSelectorWheel(boolean z) {
        Object obj = this.f12546q - this.f12545p >= this.f12555z.length ? 1 : null;
        if ((!z || obj != null) && z != this.f12526S) {
            this.f12526S = z;
        }
    }
}
