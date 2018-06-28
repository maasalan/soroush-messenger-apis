package cn.iwgang.countdownview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import cn.iwgang.countdownview.C0963d.C0962a;

public class CountdownView extends View {
    public C0959b f3061a;
    public C0961c f3062b;
    public long f3063c;
    private C0957a f3064d;
    private C0958b f3065e;
    private boolean f3066f;
    private long f3067g;
    private long f3068h;

    public interface C0957a {
        void mo2437a();
    }

    public interface C0958b {
    }

    class C50501 extends C0961c {
        final /* synthetic */ CountdownView f14114a;

        public C50501(CountdownView countdownView, long j, long j2) {
            this.f14114a = countdownView;
            super(j, j2);
        }

        public final void mo1022a() {
            CountdownView countdownView = this.f14114a;
            countdownView.f3061a.m2402a(0, 0, 0, 0, 0);
            countdownView.invalidate();
            if (this.f14114a.f3064d != null) {
                this.f14114a.f3064d.mo2437a();
            }
        }

        public final void mo1023a(long j) {
            this.f14114a.m2396a(j);
        }
    }

    public CountdownView(Context context) {
        this(context, null);
    }

    public CountdownView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CountdownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0962a.CountdownView);
        this.f3066f = obtainStyledAttributes.getBoolean(C0962a.CountdownView_isHideTimeBackground, true);
        this.f3061a = this.f3066f ? new C0959b() : new C5051a();
        this.f3061a.mo1025a(context, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        this.f3061a.m2409e();
    }

    private int m2394a(int r3, int r4, int r5) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x0028 in {3, 6, 8, 9} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r2 = this;
        r0 = android.view.View.MeasureSpec.getMode(r5);
        r5 = android.view.View.MeasureSpec.getSize(r5);
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r0 != r1) goto L_0x0011;
    L_0x000c:
        r3 = java.lang.Math.max(r4, r5);
        return r3;
    L_0x0011:
        r5 = 1;
        if (r3 != r5) goto L_0x001f;
    L_0x0014:
        r3 = r2.getPaddingLeft();
        r5 = r2.getPaddingRight();
    L_0x001c:
        r3 = r3 + r5;
        r3 = r3 + r4;
        return r3;
    L_0x001f:
        r3 = r2.getPaddingTop();
        r5 = r2.getPaddingBottom();
        goto L_0x001c;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.iwgang.countdownview.CountdownView.a(int, int, int):int");
    }

    public final void m2396a(long j) {
        int i;
        int i2;
        this.f3068h = j;
        if (this.f3061a.f3105k) {
            i = (int) (j / 3600000);
            i2 = 0;
        } else {
            i2 = (int) (j / 86400000);
            i = (int) ((j % 86400000) / 3600000);
        }
        this.f3061a.m2402a(i2, i, (int) ((j % 3600000) / 60000), (int) ((j % 60000) / 1000), (int) (j % 1000));
        if (this.f3067g > 0 && this.f3065e != null) {
            if (this.f3063c != 0) {
                if (j + this.f3067g <= this.f3063c) {
                }
            }
            this.f3063c = j;
        }
        if (!this.f3061a.m2410f()) {
            if (!this.f3061a.m2411g()) {
                invalidate();
                return;
            }
        }
        this.f3061a.m2412h();
        requestLayout();
    }

    public int getDay() {
        return this.f3061a.f3095a;
    }

    public int getHour() {
        return this.f3061a.f3096b;
    }

    public int getMinute() {
        return this.f3061a.f3097c;
    }

    public long getRemainTime() {
        return this.f3068h;
    }

    public int getSecond() {
        return this.f3061a.f3098d;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f3062b != null) {
            this.f3062b.m2417c();
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f3061a.mo1026a(canvas);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int c = this.f3061a.mo1029c();
        int d = this.f3061a.mo1030d();
        int a = m2394a(1, c, i);
        int a2 = m2394a(2, d, i2);
        setMeasuredDimension(a, a2);
        this.f3061a.mo1027a((View) this, a, a2, c, d);
    }

    public void setOnCountdownEndListener(C0957a c0957a) {
        this.f3064d = c0957a;
    }
}
