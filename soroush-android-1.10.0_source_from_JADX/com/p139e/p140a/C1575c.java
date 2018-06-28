package com.p139e.p140a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p139e.p140a.C1581e.C1578b;
import com.p139e.p140a.C1581e.C1580d;
import com.p139e.p140a.p141a.C1563c;
import com.p139e.p140a.p141a.C1565d;
import com.p139e.p140a.p142b.C1567b;
import com.p139e.p140a.p142b.C1568c;
import com.p139e.p140a.p143c.C5391b;
import com.p139e.p140a.p143c.C5392c;
import java.util.ArrayList;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C1575c extends View {
    public Integer[] f4895a = new Integer[]{null, null, null, null, null};
    public int f4896b = 0;
    public ArrayList<C1576d> f4897c = new ArrayList();
    private Bitmap f4898d;
    private Canvas f4899e;
    private int f4900f = 10;
    private float f4901g = BallPulseIndicator.SCALE;
    private float f4902h = BallPulseIndicator.SCALE;
    private int f4903i = 0;
    private Integer f4904j;
    private Paint f4905k = C1565d.m4079a().m4074a(0).f4864a;
    private Paint f4906l = C1565d.m4079a().m4074a(-1).f4864a;
    private Paint f4907m = C1565d.m4079a().m4074a(-16777216).f4864a;
    private Paint f4908n = C1565d.m4079a().f4864a;
    private C1569b f4909o;
    private C5392c f4910p;
    private C5391b f4911q;
    private EditText f4912r;
    private TextWatcher f4913s = new C15701(this);
    private LinearLayout f4914t;
    private C1568c f4915u;
    private int f4916v;
    private int f4917w;

    class C15701 implements TextWatcher {
        final /* synthetic */ C1575c f4881a;

        C15701(C1575c c1575c) {
            this.f4881a = c1575c;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r0 = this;
            r1 = r1.toString();	 Catch:{ Exception -> 0x000e }
            r1 = android.graphics.Color.parseColor(r1);	 Catch:{ Exception -> 0x000e }
            r2 = r0.f4881a;	 Catch:{ Exception -> 0x000e }
            r3 = 0;	 Catch:{ Exception -> 0x000e }
            r2.m4099b(r1, r3);	 Catch:{ Exception -> 0x000e }
        L_0x000e:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.e.a.c.1.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    class C15712 implements OnClickListener {
        final /* synthetic */ C1575c f4882a;

        C15712(C1575c c1575c) {
            this.f4882a = c1575c;
        }

        public final void onClick(View view) {
            if (view != null) {
                Object tag = view.getTag();
                if (tag != null && (tag instanceof Integer)) {
                    this.f4882a.setSelectedColor(((Integer) tag).intValue());
                }
            }
        }
    }

    public enum C1573a {
        ;
        
        public static final int f4883a = 1;
        public static final int f4884b = 2;

        static {
            f4885c = new int[]{f4883a, f4884b};
        }

        public static int m4089a(int i) {
            switch (i) {
                case 0:
                    return f4883a;
                case 1:
                    return f4884b;
                default:
                    return f4883a;
            }
        }

        public static int[] m4088a() {
            return (int[]) f4885c.clone();
        }
    }

    public C1575c(Context context) {
        super(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C1580d.ColorPickerPreference);
        this.f4900f = obtainStyledAttributes.getInt(C1580d.ColorPickerPreference_density, 10);
        this.f4904j = Integer.valueOf(obtainStyledAttributes.getInt(C1580d.ColorPickerPreference_initialColor, -1));
        C1568c a = C1563c.m4072a(C1573a.m4089a(obtainStyledAttributes.getInt(C1580d.ColorPickerPreference_wheelType, 0)));
        this.f4916v = obtainStyledAttributes.getResourceId(C1580d.ColorPickerPreference_alphaSliderView, 0);
        this.f4917w = obtainStyledAttributes.getResourceId(C1580d.ColorPickerPreference_lightnessSliderView, 0);
        setRenderer(a);
        setDensity(this.f4900f);
        m4097a(this.f4904j.intValue(), true);
        obtainStyledAttributes.recycle();
    }

    private C1569b m4095a(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        int i2 = 1;
        int i3 = 0;
        double cos = ((double) fArr[1]) * Math.cos((((double) fArr[0]) * 3.141592653589793d) / 180.0d);
        double sin = ((double) fArr[1]) * Math.sin((((double) fArr[0]) * 3.141592653589793d) / 180.0d);
        C1569b c1569b = null;
        double d = Double.MAX_VALUE;
        for (C1569b c1569b2 : this.f4915u.mo1496b()) {
            float[] fArr2 = c1569b2.f4878c;
            double d2 = cos;
            double d3 = sin;
            double cos2 = d2 - (((double) fArr2[i2]) * Math.cos((((double) fArr2[i3]) * 3.141592653589793d) / 180.0d));
            double sin2 = d3 - (((double) fArr2[1]) * Math.sin((((double) fArr2[0]) * 3.141592653589793d) / 180.0d));
            cos2 = (cos2 * cos2) + (sin2 * sin2);
            if (cos2 < d) {
                d = cos2;
                c1569b = c1569b2;
            }
            i2 = 1;
            i3 = 0;
            double d4 = 180.0d;
            cos = d2;
            sin = d3;
        }
        return c1569b;
    }

    private void m4096a() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredHeight < measuredWidth) {
            measuredWidth = measuredHeight;
        }
        if (measuredWidth > 0) {
            if (this.f4898d == null) {
                this.f4898d = Bitmap.createBitmap(measuredWidth, measuredWidth, Config.ARGB_8888);
                this.f4899e = new Canvas(this.f4898d);
                this.f4908n.setShader(C1565d.m4078a(8));
            }
            this.f4899e.drawColor(0, Mode.CLEAR);
            if (this.f4915u != null) {
                float width = ((float) this.f4899e.getWidth()) / 2.0f;
                float f = (width - 2.05f) - (width / ((float) this.f4900f));
                width = (f / ((float) (this.f4900f - 1))) / 2.0f;
                C1567b a = this.f4915u.mo1494a();
                a.f4869a = this.f4900f;
                a.f4870b = f;
                a.f4871c = width;
                a.f4872d = 2.05f;
                a.f4873e = this.f4902h;
                a.f4874f = this.f4901g;
                a.f4875g = this.f4899e;
                this.f4915u.mo1495a(a);
                this.f4915u.mo2985d();
            }
            invalidate();
        }
    }

    private void setColorPreviewColor(int i) {
        if (this.f4914t != null && this.f4895a != null && this.f4896b <= this.f4895a.length && this.f4895a[this.f4896b] != null && this.f4914t.getChildCount() != 0 && this.f4914t.getVisibility() == 0) {
            View childAt = this.f4914t.getChildAt(this.f4896b);
            if (childAt instanceof LinearLayout) {
                ((ImageView) ((LinearLayout) childAt).findViewById(C1578b.image_preview)).setImageDrawable(new C1566a(i));
            }
        }
    }

    private void setColorText(int i) {
        if (this.f4912r != null) {
            EditText editText = this.f4912r;
            StringBuilder stringBuilder = new StringBuilder("#");
            stringBuilder.append(Integer.toHexString(i));
            editText.setText(stringBuilder.toString());
        }
    }

    private void setColorToSliders(int i) {
        if (this.f4910p != null) {
            this.f4910p.setColor(i);
        }
        if (this.f4911q != null) {
            this.f4911q.setColor(i);
        }
    }

    private void setHighlightedColor(int i) {
        int childCount = this.f4914t.getChildCount();
        if (childCount != 0 && this.f4914t.getVisibility() == 0) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f4914t.getChildAt(i2);
                if (childAt instanceof LinearLayout) {
                    LinearLayout linearLayout = (LinearLayout) childAt;
                    if (i2 == i) {
                        linearLayout.setBackgroundColor(-1);
                    } else {
                        linearLayout.setBackgroundColor(0);
                    }
                }
            }
        }
    }

    public final void m4097a(int i, boolean z) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        this.f4902h = C1582f.m4101a(i);
        this.f4901g = fArr[2];
        this.f4895a[this.f4896b] = Integer.valueOf(i);
        this.f4904j = Integer.valueOf(i);
        setColorPreviewColor(i);
        setColorToSliders(i);
        if (this.f4912r != null && z) {
            setColorText(i);
        }
        if (this.f4915u.mo1496b() != null) {
            this.f4909o = m4095a(i);
        }
    }

    public final void m4098a(LinearLayout linearLayout, Integer num) {
        if (linearLayout != null) {
            this.f4914t = linearLayout;
            int i = 0;
            if (num == null) {
                num = Integer.valueOf(0);
            }
            int childCount = linearLayout.getChildCount();
            if (childCount != 0 && linearLayout.getVisibility() == 0) {
                while (i < childCount) {
                    View childAt = linearLayout.getChildAt(i);
                    if (childAt instanceof LinearLayout) {
                        LinearLayout linearLayout2 = (LinearLayout) childAt;
                        if (i == num.intValue()) {
                            linearLayout2.setBackgroundColor(-1);
                        }
                        ImageView imageView = (ImageView) linearLayout2.findViewById(C1578b.image_preview);
                        imageView.setClickable(true);
                        imageView.setTag(Integer.valueOf(i));
                        imageView.setOnClickListener(new C15712(this));
                    }
                    i++;
                }
            }
        }
    }

    public final void m4099b(int i, boolean z) {
        m4097a(i, z);
        m4096a();
        invalidate();
    }

    public final Integer[] getAllColors() {
        return this.f4895a;
    }

    public final int getSelectedColor() {
        return ((this.f4909o != null ? Color.HSVToColor(this.f4909o.m4086a(this.f4901g)) : 0) & 16777215) | (Math.round(this.f4902h * 255.0f) << 24);
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4916v != 0) {
            setAlphaSlider((C5391b) getRootView().findViewById(this.f4916v));
        }
        if (this.f4917w != 0) {
            setLightnessSlider((C5392c) getRootView().findViewById(this.f4917w));
        }
    }

    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(this.f4903i);
        if (this.f4898d != null) {
            canvas.drawBitmap(this.f4898d, 0.0f, 0.0f, null);
        }
        if (this.f4909o != null) {
            float width = (((((float) canvas.getWidth()) / 2.0f) - 2.05f) / ((float) this.f4900f)) / 2.0f;
            this.f4905k.setColor(Color.HSVToColor(this.f4909o.m4086a(this.f4901g)));
            this.f4905k.setAlpha((int) (this.f4902h * 255.0f));
            canvas.drawCircle(this.f4909o.f4876a, this.f4909o.f4877b, 2.0f * width, this.f4906l);
            canvas.drawCircle(this.f4909o.f4876a, this.f4909o.f4877b, 1.5f * width, this.f4907m);
            canvas.drawCircle(this.f4909o.f4876a, this.f4909o.f4877b, width, this.f4908n);
            canvas.drawCircle(this.f4909o.f4876a, this.f4909o.f4877b, width, this.f4905k);
        }
    }

    protected final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        if (mode == 0) {
            i3 = i;
        } else {
            if (mode != Integer.MIN_VALUE) {
                if (mode != 1073741824) {
                    i3 = 0;
                }
            }
            i3 = MeasureSpec.getSize(i);
        }
        int mode2 = MeasureSpec.getMode(i2);
        if (mode2 != 0) {
            if (mode2 != Integer.MIN_VALUE) {
                if (mode != 1073741824) {
                    i = 0;
                }
            }
            i = MeasureSpec.getSize(i2);
        }
        if (i >= i3) {
            i = i3;
        }
        setMeasuredDimension(i, i);
    }

    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r10 = this;
        r0 = r11.getAction();
        switch(r0) {
            case 0: goto L_0x0034;
            case 1: goto L_0x0009;
            case 2: goto L_0x0034;
            default: goto L_0x0007;
        };
    L_0x0007:
        goto L_0x007a;
    L_0x0009:
        r11 = r10.getSelectedColor();
        r0 = r10.f4897c;
        if (r0 == 0) goto L_0x0027;
    L_0x0011:
        r0 = r10.f4897c;
        r0 = r0.iterator();
    L_0x0017:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0027;
    L_0x001d:
        r1 = r0.next();
        r1 = (com.p139e.p140a.C1576d) r1;
        r1.mo2428a(r11);	 Catch:{ Exception -> 0x0017 }
        goto L_0x0017;
    L_0x0027:
        r10.setColorToSliders(r11);
        r10.setColorText(r11);
        r10.setColorPreviewColor(r11);
    L_0x0030:
        r10.invalidate();
        goto L_0x007a;
    L_0x0034:
        r0 = r11.getX();
        r11 = r11.getY();
        r1 = 0;
        r2 = 9218868437227405311; // 0x7fefffffffffffff float:NaN double:1.7976931348623157E308;
        r4 = r10.f4915u;
        r4 = r4.mo1496b();
        r4 = r4.iterator();
    L_0x004c:
        r5 = r4.hasNext();
        if (r5 == 0) goto L_0x006a;
    L_0x0052:
        r5 = r4.next();
        r5 = (com.p139e.p140a.C1569b) r5;
        r6 = r5.f4876a;
        r6 = r6 - r0;
        r6 = (double) r6;
        r8 = r5.f4877b;
        r8 = r8 - r11;
        r8 = (double) r8;
        r6 = r6 * r6;
        r8 = r8 * r8;
        r6 = r6 + r8;
        r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r8 <= 0) goto L_0x004c;
    L_0x0067:
        r1 = r5;
        r2 = r6;
        goto L_0x004c;
    L_0x006a:
        r10.f4909o = r1;
        r11 = r10.getSelectedColor();
        r0 = java.lang.Integer.valueOf(r11);
        r10.f4904j = r0;
        r10.setColorToSliders(r11);
        goto L_0x0030;
    L_0x007a:
        r11 = 1;
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.e.a.c.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m4096a();
        this.f4909o = m4095a(this.f4904j.intValue());
    }

    public final void setAlphaSlider(C5391b c5391b) {
        this.f4911q = c5391b;
        if (c5391b != null) {
            this.f4911q.setColorPicker(this);
            this.f4911q.setColor(getSelectedColor());
        }
    }

    public final void setAlphaValue(float f) {
        this.f4902h = f;
        this.f4904j = Integer.valueOf(Color.HSVToColor(Math.round(this.f4902h * 255.0f), this.f4909o.m4086a(this.f4901g)));
        if (this.f4912r != null) {
            EditText editText = this.f4912r;
            StringBuilder stringBuilder = new StringBuilder("#");
            stringBuilder.append(Integer.toHexString(this.f4904j.intValue()).toUpperCase());
            editText.setText(stringBuilder.toString());
        }
        if (!(this.f4910p == null || this.f4904j == null)) {
            this.f4910p.setColor(this.f4904j.intValue());
        }
        m4096a();
        invalidate();
    }

    public final void setColorEdit(EditText editText) {
        this.f4912r = editText;
        if (this.f4912r != null) {
            this.f4912r.setVisibility(0);
            this.f4912r.addTextChangedListener(this.f4913s);
        }
    }

    public final void setDensity(int i) {
        this.f4900f = Math.max(2, i);
        invalidate();
    }

    public final void setLightness(float f) {
        this.f4901g = f;
        this.f4904j = Integer.valueOf(Color.HSVToColor(Math.round(this.f4902h * 255.0f), this.f4909o.m4086a(f)));
        if (this.f4912r != null) {
            EditText editText = this.f4912r;
            StringBuilder stringBuilder = new StringBuilder("#");
            stringBuilder.append(Integer.toHexString(this.f4904j.intValue()).toUpperCase());
            editText.setText(stringBuilder.toString());
        }
        if (!(this.f4911q == null || this.f4904j == null)) {
            this.f4911q.setColor(this.f4904j.intValue());
        }
        m4096a();
        invalidate();
    }

    public final void setLightnessSlider(C5392c c5392c) {
        this.f4910p = c5392c;
        if (c5392c != null) {
            this.f4910p.setColorPicker(this);
            this.f4910p.setColor(getSelectedColor());
        }
    }

    public final void setRenderer(C1568c c1568c) {
        this.f4915u = c1568c;
        invalidate();
    }

    public final void setSelectedColor(int i) {
        if (this.f4895a != null && this.f4895a.length >= i) {
            this.f4896b = i;
            setHighlightedColor(i);
            Integer num = this.f4895a[i];
            if (num != null) {
                m4099b(num.intValue(), true);
            }
        }
    }
}
