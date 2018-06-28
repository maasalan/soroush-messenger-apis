package uk.co.p616a.p617a;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import java.lang.ref.WeakReference;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import uk.co.p616a.p617a.p618a.C7862d;
import uk.co.p616a.p617a.p618a.C7863e;
import uk.co.p616a.p617a.p618a.C7995a;
import uk.co.p616a.p617a.p618a.C8035b;
import uk.co.p616a.p617a.p618a.C8041c;
import uk.co.p616a.p617a.p619b.C7865a;
import uk.co.p616a.p617a.p620c.C7868d;
import uk.co.p616a.p617a.p620c.C7997a;
import uk.co.p616a.p617a.p620c.C7998c;
import uk.co.p616a.p617a.p620c.C8036b;

public final class C7999d implements OnTouchListener, OnGlobalLayoutListener, C7863e, C7869c {
    static final Interpolator f24979a = new AccelerateDecelerateInterpolator();
    static int f24980c = 1;
    private static final boolean f24981i = Log.isLoggable("PhotoViewAttacher", 3);
    private C7873b f24982A;
    private int f24983B;
    private float f24984C;
    private boolean f24985D;
    private ScaleType f24986E;
    int f24987b;
    float f24988d;
    float f24989e;
    float f24990f;
    public C7875d f24991g;
    public C7877f f24992h;
    private boolean f24993j;
    private boolean f24994k;
    private WeakReference<ImageView> f24995l;
    private GestureDetector f24996m;
    private C7862d f24997n;
    private final Matrix f24998o;
    private final Matrix f24999p;
    private final Matrix f25000q;
    private final RectF f25001r;
    private final float[] f25002s;
    private C7874c f25003t;
    private OnLongClickListener f25004u;
    private C7876e f25005v;
    private int f25006w;
    private int f25007x;
    private int f25008y;
    private int f25009z;

    class C78701 extends SimpleOnGestureListener {
        final /* synthetic */ C7999d f24940a;

        C78701(C7999d c7999d) {
            this.f24940a = c7999d;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onFling(android.view.MotionEvent r2, android.view.MotionEvent r3, float r4, float r5) {
            /*
            r1 = this;
            r4 = r1.f24940a;
            r4 = r4.f25005v;
            r5 = 0;
            if (r4 == 0) goto L_0x0032;
        L_0x0009:
            r4 = r1.f24940a;
            r4 = r4.m22229c();
            r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
            if (r4 <= 0) goto L_0x0016;
        L_0x0015:
            return r5;
        L_0x0016:
            r2 = r2.getPointerCount();
            r4 = uk.co.p616a.p617a.C7999d.f24980c;
            if (r2 > r4) goto L_0x0032;
        L_0x001e:
            r2 = r3.getPointerCount();
            r3 = uk.co.p616a.p617a.C7999d.f24980c;
            if (r2 <= r3) goto L_0x0027;
        L_0x0026:
            return r5;
        L_0x0027:
            r2 = r1.f24940a;
            r2 = r2.f25005v;
            r2 = r2.m22175a();
            return r2;
        L_0x0032:
            return r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: uk.co.a.a.d.1.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
        }

        public final void onLongPress(MotionEvent motionEvent) {
            if (this.f24940a.f25004u != null) {
                this.f24940a.f25004u.onLongClick(this.f24940a.m22227b());
            }
        }
    }

    static /* synthetic */ class C78712 {
        static final /* synthetic */ int[] f24941a = new int[ScaleType.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = android.widget.ImageView.ScaleType.values();
            r0 = r0.length;
            r0 = new int[r0];
            f24941a = r0;
            r0 = f24941a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = android.widget.ImageView.ScaleType.MATRIX;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f24941a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = android.widget.ImageView.ScaleType.FIT_START;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f24941a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = android.widget.ImageView.ScaleType.FIT_END;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = f24941a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = android.widget.ImageView.ScaleType.FIT_CENTER;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = f24941a;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = android.widget.ImageView.ScaleType.FIT_XY;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: uk.co.a.a.d.2.<clinit>():void");
        }
    }

    private class C7872a implements Runnable {
        final /* synthetic */ C7999d f24942a;
        private final float f24943b;
        private final float f24944c;
        private final long f24945d = System.currentTimeMillis();
        private final float f24946e;
        private final float f24947f;

        public C7872a(C7999d c7999d, float f, float f2, float f3, float f4) {
            this.f24942a = c7999d;
            this.f24943b = f3;
            this.f24944c = f4;
            this.f24946e = f;
            this.f24947f = f2;
        }

        public final void run() {
            View b = this.f24942a.m22227b();
            if (b != null) {
                float interpolation = C7999d.f24979a.getInterpolation(Math.min(BallPulseIndicator.SCALE, (((float) (System.currentTimeMillis() - this.f24945d)) * BallPulseIndicator.SCALE) / ((float) this.f24942a.f24987b)));
                this.f24942a.mo4879a((this.f24946e + ((this.f24947f - this.f24946e) * interpolation)) / this.f24942a.m22229c(), this.f24943b, this.f24944c);
                if (interpolation < BallPulseIndicator.SCALE) {
                    C7864a.m22163a(b, this);
                }
            }
        }
    }

    private class C7873b implements Runnable {
        final C7868d f24948a;
        int f24949b;
        int f24950c;
        final /* synthetic */ C7999d f24951d;

        public C7873b(C7999d c7999d, Context context) {
            this.f24951d = c7999d;
            C7868d c7998c = VERSION.SDK_INT < 9 ? new C7998c(context) : VERSION.SDK_INT < 14 ? new C7997a(context) : new C8036b(context);
            this.f24948a = c7998c;
        }

        public final void run() {
            if (!this.f24948a.mo4875c()) {
                View b = this.f24951d.m22227b();
                if (b != null && this.f24948a.mo4873a()) {
                    int d = this.f24948a.mo4876d();
                    int e = this.f24948a.mo4877e();
                    if (C7999d.f24981i) {
                        StringBuilder stringBuilder = new StringBuilder("fling run(). CurrentX:");
                        stringBuilder.append(this.f24949b);
                        stringBuilder.append(" CurrentY:");
                        stringBuilder.append(this.f24950c);
                        stringBuilder.append(" NewX:");
                        stringBuilder.append(d);
                        stringBuilder.append(" NewY:");
                        stringBuilder.append(e);
                        C7865a.m22164a().mo4870a("PhotoViewAttacher", stringBuilder.toString());
                    }
                    this.f24951d.f25000q.postTranslate((float) (this.f24949b - d), (float) (this.f24950c - e));
                    this.f24951d.m22215b(this.f24951d.m22231e());
                    this.f24949b = d;
                    this.f24950c = e;
                    C7864a.m22163a(b, this);
                }
            }
        }
    }

    public interface C7874c {
    }

    public interface C7875d {
        void m22173a();

        void m22174b();
    }

    public interface C7876e {
        boolean m22175a();
    }

    public interface C7877f {
        void m22176a();
    }

    public C7999d(ImageView imageView) {
        this(imageView, (byte) 0);
    }

    private C7999d(ImageView imageView, byte b) {
        this.f24987b = 200;
        this.f24988d = BallPulseIndicator.SCALE;
        this.f24989e = 1.75f;
        this.f24990f = 3.0f;
        this.f24993j = true;
        this.f24994k = false;
        this.f24998o = new Matrix();
        this.f24999p = new Matrix();
        this.f25000q = new Matrix();
        this.f25001r = new RectF();
        this.f25002s = new float[9];
        this.f24983B = 2;
        this.f24986E = ScaleType.FIT_CENTER;
        this.f24995l = new WeakReference(imageView);
        imageView.setDrawingCacheEnabled(true);
        imageView.setOnTouchListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        C7999d.m22211a(imageView);
        if (!imageView.isInEditMode()) {
            Context context = imageView.getContext();
            int i = VERSION.SDK_INT;
            C7862d c7995a = i < 5 ? new C7995a(context) : i < 8 ? new C8035b(context) : new C8041c(context);
            c7995a.mo4866a(this);
            this.f24997n = c7995a;
            this.f24996m = new GestureDetector(imageView.getContext(), new C78701(this));
            this.f24996m.setOnDoubleTapListener(new C7867b(this));
            this.f24984C = 0.0f;
            this.f24985D = true;
            imageView = m22227b();
            if (imageView != null) {
                if (this.f24985D) {
                    C7999d.m22211a(imageView);
                    m22210a(imageView.getDrawable());
                    return;
                }
                m22222j();
            }
        }
    }

    private float m22207a(Matrix matrix, int i) {
        matrix.getValues(this.f25002s);
        return this.f25002s[i];
    }

    private RectF m22208a(Matrix matrix) {
        ImageView b = m22227b();
        if (b != null) {
            Drawable drawable = b.getDrawable();
            if (drawable != null) {
                this.f25001r.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
                matrix.mapRect(this.f25001r);
                return this.f25001r;
            }
        }
        return null;
    }

    private void m22210a(Drawable drawable) {
        ImageView b = m22227b();
        if (b != null && drawable != null) {
            float b2 = (float) C7999d.m22213b(b);
            float c = (float) C7999d.m22216c(b);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            this.f24998o.reset();
            float f = (float) intrinsicWidth;
            float f2 = b2 / f;
            float f3 = (float) intrinsicHeight;
            float f4 = c / f3;
            if (this.f24986E == ScaleType.CENTER) {
                this.f24998o.postTranslate((b2 - f) / 2.0f, (c - f3) / 2.0f);
            } else {
                if (this.f24986E == ScaleType.CENTER_CROP) {
                    f2 = Math.max(f2, f4);
                } else if (this.f24986E == ScaleType.CENTER_INSIDE) {
                    f2 = Math.min(BallPulseIndicator.SCALE, Math.min(f2, f4));
                } else {
                    Matrix matrix;
                    ScaleToFit scaleToFit;
                    RectF rectF = new RectF(0.0f, 0.0f, f, f3);
                    RectF rectF2 = new RectF(0.0f, 0.0f, b2, c);
                    if (((int) this.f24984C) % 180 != 0) {
                        rectF = new RectF(0.0f, 0.0f, f3, f);
                    }
                    switch (C78712.f24941a[this.f24986E.ordinal()]) {
                        case 2:
                            matrix = this.f24998o;
                            scaleToFit = ScaleToFit.START;
                            break;
                        case 3:
                            matrix = this.f24998o;
                            scaleToFit = ScaleToFit.END;
                            break;
                        case 4:
                            matrix = this.f24998o;
                            scaleToFit = ScaleToFit.CENTER;
                            break;
                        case 5:
                            matrix = this.f24998o;
                            scaleToFit = ScaleToFit.FILL;
                            break;
                        default:
                            break;
                    }
                    matrix.setRectToRect(rectF, rectF2, scaleToFit);
                }
                this.f24998o.postScale(f2, f2);
                this.f24998o.postTranslate((b2 - (f * f2)) / 2.0f, (c - (f3 * f2)) / 2.0f);
            }
            m22222j();
        }
    }

    private static void m22211a(ImageView imageView) {
        if (imageView != null && !(imageView instanceof C7869c) && !ScaleType.MATRIX.equals(imageView.getScaleType())) {
            imageView.setScaleType(ScaleType.MATRIX);
        }
    }

    private static int m22213b(ImageView imageView) {
        return imageView == null ? 0 : (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    private void m22215b(Matrix matrix) {
        ImageView b = m22227b();
        if (b != null) {
            ImageView b2 = m22227b();
            if (b2 == null || (b2 instanceof C7869c) || ScaleType.MATRIX.equals(b2.getScaleType())) {
                b.setImageMatrix(matrix);
                if (this.f25003t != null) {
                    m22208a(matrix);
                    return;
                }
                return;
            }
            throw new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher");
        }
    }

    private static int m22216c(ImageView imageView) {
        return imageView == null ? 0 : (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    private void m22219g() {
        if (this.f24982A != null) {
            C7873b c7873b = this.f24982A;
            if (f24981i) {
                C7865a.m22164a().mo4870a("PhotoViewAttacher", "Cancel Fling");
            }
            c7873b.f24948a.mo4874b();
            this.f24982A = null;
        }
    }

    private void m22220h() {
        if (m22221i()) {
            m22215b(m22231e());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m22221i() {
        /*
        r10 = this;
        r0 = r10.m22227b();
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r2 = r10.m22231e();
        r2 = r10.m22208a(r2);
        if (r2 != 0) goto L_0x0013;
    L_0x0012:
        return r1;
    L_0x0013:
        r3 = r2.height();
        r4 = r2.width();
        r5 = uk.co.p616a.p617a.C7999d.m22216c(r0);
        r5 = (float) r5;
        r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r8 = 0;
        if (r6 > 0) goto L_0x0041;
    L_0x0027:
        r6 = uk.co.p616a.p617a.C7999d.C78712.f24941a;
        r9 = r10.f24986E;
        r9 = r9.ordinal();
        r6 = r6[r9];
        switch(r6) {
            case 2: goto L_0x003d;
            case 3: goto L_0x003b;
            default: goto L_0x0034;
        };
    L_0x0034:
        r5 = r5 - r3;
        r5 = r5 / r7;
    L_0x0036:
        r3 = r2.top;
    L_0x0038:
        r3 = r5 - r3;
        goto L_0x0052;
    L_0x003b:
        r5 = r5 - r3;
        goto L_0x0036;
    L_0x003d:
        r3 = r2.top;
        r3 = -r3;
        goto L_0x0052;
    L_0x0041:
        r3 = r2.top;
        r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1));
        if (r3 <= 0) goto L_0x0048;
    L_0x0047:
        goto L_0x003d;
    L_0x0048:
        r3 = r2.bottom;
        r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r3 >= 0) goto L_0x0051;
    L_0x004e:
        r3 = r2.bottom;
        goto L_0x0038;
    L_0x0051:
        r3 = r8;
    L_0x0052:
        r0 = uk.co.p616a.p617a.C7999d.m22213b(r0);
        r0 = (float) r0;
        r5 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        r6 = 1;
        if (r5 > 0) goto L_0x007a;
    L_0x005c:
        r1 = uk.co.p616a.p617a.C7999d.C78712.f24941a;
        r5 = r10.f24986E;
        r5 = r5.ordinal();
        r1 = r1[r5];
        switch(r1) {
            case 2: goto L_0x0072;
            case 3: goto L_0x0070;
            default: goto L_0x0069;
        };
    L_0x0069:
        r0 = r0 - r4;
        r0 = r0 / r7;
    L_0x006b:
        r1 = r2.left;
        r0 = r0 - r1;
    L_0x006e:
        r8 = r0;
        goto L_0x0076;
    L_0x0070:
        r0 = r0 - r4;
        goto L_0x006b;
    L_0x0072:
        r0 = r2.left;
        r0 = -r0;
        goto L_0x006e;
    L_0x0076:
        r0 = 2;
    L_0x0077:
        r10.f24983B = r0;
        goto L_0x0095;
    L_0x007a:
        r4 = r2.left;
        r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r4 <= 0) goto L_0x0086;
    L_0x0080:
        r10.f24983B = r1;
        r0 = r2.left;
        r8 = -r0;
        goto L_0x0095;
    L_0x0086:
        r1 = r2.right;
        r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1));
        if (r1 >= 0) goto L_0x0093;
    L_0x008c:
        r1 = r2.right;
        r8 = r0 - r1;
        r10.f24983B = r6;
        goto L_0x0095;
    L_0x0093:
        r0 = -1;
        goto L_0x0077;
    L_0x0095:
        r0 = r10.f25000q;
        r0.postTranslate(r8, r3);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: uk.co.a.a.d.i():boolean");
    }

    private void m22222j() {
        this.f25000q.reset();
        this.f25000q.postRotate(this.f24984C % 360.0f);
        m22220h();
        m22215b(m22231e());
        m22221i();
    }

    public final RectF m22223a() {
        m22221i();
        return m22208a(m22231e());
    }

    public final void mo4878a(float f, float f2) {
        if (!this.f24997n.mo4867a()) {
            if (f24981i) {
                C7865a.m22164a().mo4870a("PhotoViewAttacher", String.format("onDrag: dx: %.2f. dy: %.2f", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
            }
            ImageView b = m22227b();
            this.f25000q.postTranslate(f, f2);
            m22220h();
            ViewParent parent = b.getParent();
            if (!this.f24993j || this.f24997n.mo4867a() || this.f24994k) {
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            } else if ((this.f24983B == 2 || ((this.f24983B == 0 && f >= BallPulseIndicator.SCALE) || (this.f24983B == 1 && f <= -1.0f))) && parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        }
    }

    public final void mo4879a(float f, float f2, float f3) {
        if (f24981i) {
            C7865a.m22164a().mo4870a("PhotoViewAttacher", String.format("onScale: scale: %.2f. fX: %.2f. fY: %.2f", new Object[]{Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)}));
        }
        if (m22229c() >= this.f24990f && f >= BallPulseIndicator.SCALE) {
            return;
        }
        if (m22229c() > this.f24988d || f > BallPulseIndicator.SCALE) {
            this.f25000q.postScale(f, f, f2, f3);
            m22220h();
        }
    }

    public final void mo4880a(float f, float f2, float f3, float f4) {
        if (f24981i) {
            StringBuilder stringBuilder = new StringBuilder("onFling. sX: ");
            stringBuilder.append(f);
            stringBuilder.append(" sY: ");
            stringBuilder.append(f2);
            stringBuilder.append(" Vx: ");
            stringBuilder.append(f3);
            stringBuilder.append(" Vy: ");
            stringBuilder.append(f4);
            C7865a.m22164a().mo4870a("PhotoViewAttacher", stringBuilder.toString());
        }
        ImageView b = m22227b();
        this.f24982A = new C7873b(this, b.getContext());
        C7873b c7873b = this.f24982A;
        int b2 = C7999d.m22213b(b);
        int c = C7999d.m22216c(b);
        int i = (int) f3;
        int i2 = (int) f4;
        RectF a = c7873b.f24951d.m22223a();
        if (a != null) {
            int round;
            int i3;
            int round2;
            int i4;
            int round3 = Math.round(-a.left);
            f4 = (float) b2;
            if (f4 < a.width()) {
                round = Math.round(a.width() - f4);
                i3 = 0;
            } else {
                i3 = round3;
                round = i3;
            }
            int round4 = Math.round(-a.top);
            f4 = (float) c;
            if (f4 < a.height()) {
                round2 = Math.round(a.height() - f4);
                i4 = 0;
            } else {
                i4 = round4;
                round2 = i4;
            }
            c7873b.f24949b = round3;
            c7873b.f24950c = round4;
            if (f24981i) {
                StringBuilder stringBuilder2 = new StringBuilder("fling. StartX:");
                stringBuilder2.append(round3);
                stringBuilder2.append(" StartY:");
                stringBuilder2.append(round4);
                stringBuilder2.append(" MaxX:");
                stringBuilder2.append(round);
                stringBuilder2.append(" MaxY:");
                stringBuilder2.append(round2);
                C7865a.m22164a().mo4870a("PhotoViewAttacher", stringBuilder2.toString());
            }
            if (!(round3 == round && round4 == round2)) {
                c7873b.f24948a.mo4872a(round3, round4, i, i2, i3, round, i4, round2);
            }
        }
        b.post(this.f24982A);
    }

    public final ImageView m22227b() {
        ImageView imageView = this.f24995l != null ? (ImageView) this.f24995l.get() : null;
        if (imageView == null) {
            if (this.f24995l != null) {
                ImageView imageView2 = (ImageView) this.f24995l.get();
                if (imageView2 != null) {
                    ViewTreeObserver viewTreeObserver = imageView2.getViewTreeObserver();
                    if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeGlobalOnLayoutListener(this);
                    }
                    imageView2.setOnTouchListener(null);
                    m22219g();
                }
                if (this.f24996m != null) {
                    this.f24996m.setOnDoubleTapListener(null);
                }
                this.f25003t = null;
                this.f24991g = null;
                this.f24992h = null;
                this.f24995l = null;
            }
            C7865a.m22164a().mo4871b("PhotoViewAttacher", "ImageView no longer exists. You should not use this PhotoViewAttacher any more.");
        }
        return imageView;
    }

    public final void m22228b(float f, float f2, float f3) {
        ImageView b = m22227b();
        if (b != null) {
            if (f >= this.f24988d) {
                if (f <= this.f24990f) {
                    b.post(new C7872a(this, m22229c(), f, f2, f3));
                    return;
                }
            }
            C7865a.m22164a().mo4871b("PhotoViewAttacher", "Scale must be within the range of minScale and maxScale");
        }
    }

    public final float m22229c() {
        return (float) Math.sqrt((double) (((float) Math.pow((double) m22207a(this.f25000q, 0), 2.0d)) + ((float) Math.pow((double) m22207a(this.f25000q, 3), 2.0d))));
    }

    public final void m22230d() {
        float f = this.f24988d;
        float f2 = this.f24989e;
        if (f >= f2) {
            throw new IllegalArgumentException("MinZoom has to be less than MidZoom");
        } else if (f2 >= 10.0f) {
            throw new IllegalArgumentException("MidZoom has to be less than MaxZoom");
        } else {
            this.f24990f = 10.0f;
        }
    }

    public final Matrix m22231e() {
        this.f24999p.set(this.f24998o);
        this.f24999p.postConcat(this.f25000q);
        return this.f24999p;
    }

    public final void onGlobalLayout() {
        ImageView b = m22227b();
        if (b != null) {
            if (this.f24985D) {
                int top = b.getTop();
                int right = b.getRight();
                int bottom = b.getBottom();
                int left = b.getLeft();
                if (!(top == this.f25006w && bottom == this.f25008y && left == this.f25009z && right == this.f25007x)) {
                    m22210a(b.getDrawable());
                    this.f25006w = top;
                    this.f25007x = right;
                    this.f25008y = bottom;
                    this.f25009z = left;
                }
                return;
            }
            m22210a(b.getDrawable());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
        r10 = this;
        r0 = r10.f24985D;
        r1 = 0;
        r2 = 1;
        if (r0 == 0) goto L_0x00ac;
    L_0x0006:
        r0 = r11;
        r0 = (android.widget.ImageView) r0;
        if (r0 == 0) goto L_0x0013;
    L_0x000b:
        r0 = r0.getDrawable();
        if (r0 == 0) goto L_0x0013;
    L_0x0011:
        r0 = r2;
        goto L_0x0014;
    L_0x0013:
        r0 = r1;
    L_0x0014:
        if (r0 == 0) goto L_0x00ac;
    L_0x0016:
        r0 = r11.getParent();
        r3 = r12.getAction();
        r4 = 3;
        if (r3 == r4) goto L_0x003a;
    L_0x0021:
        switch(r3) {
            case 0: goto L_0x0025;
            case 1: goto L_0x003a;
            default: goto L_0x0024;
        };
    L_0x0024:
        goto L_0x0064;
    L_0x0025:
        if (r0 == 0) goto L_0x002b;
    L_0x0027:
        r0.requestDisallowInterceptTouchEvent(r2);
        goto L_0x0036;
    L_0x002b:
        r11 = uk.co.p616a.p617a.p619b.C7865a.m22164a();
        r0 = "PhotoViewAttacher";
        r3 = "onTouch getParent() returned null";
        r11.mo4871b(r0, r3);
    L_0x0036:
        r10.m22219g();
        goto L_0x0064;
    L_0x003a:
        r0 = r10.m22229c();
        r3 = r10.f24988d;
        r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r0 >= 0) goto L_0x0064;
    L_0x0044:
        r0 = r10.m22223a();
        if (r0 == 0) goto L_0x0064;
    L_0x004a:
        r9 = new uk.co.a.a.d$a;
        r5 = r10.m22229c();
        r6 = r10.f24988d;
        r7 = r0.centerX();
        r8 = r0.centerY();
        r3 = r9;
        r4 = r10;
        r3.<init>(r4, r5, r6, r7, r8);
        r11.post(r9);
        r11 = r2;
        goto L_0x0065;
    L_0x0064:
        r11 = r1;
    L_0x0065:
        r0 = r10.f24997n;
        if (r0 == 0) goto L_0x009e;
    L_0x0069:
        r11 = r10.f24997n;
        r11 = r11.mo4867a();
        r0 = r10.f24997n;
        r0 = r0.mo4868b();
        r3 = r10.f24997n;
        r3 = r3.mo4869c(r12);
        if (r11 != 0) goto L_0x0087;
    L_0x007d:
        r11 = r10.f24997n;
        r11 = r11.mo4867a();
        if (r11 != 0) goto L_0x0087;
    L_0x0085:
        r11 = r2;
        goto L_0x0088;
    L_0x0087:
        r11 = r1;
    L_0x0088:
        if (r0 != 0) goto L_0x0094;
    L_0x008a:
        r0 = r10.f24997n;
        r0 = r0.mo4868b();
        if (r0 != 0) goto L_0x0094;
    L_0x0092:
        r0 = r2;
        goto L_0x0095;
    L_0x0094:
        r0 = r1;
    L_0x0095:
        if (r11 == 0) goto L_0x009a;
    L_0x0097:
        if (r0 == 0) goto L_0x009a;
    L_0x0099:
        r1 = r2;
    L_0x009a:
        r10.f24994k = r1;
        r1 = r3;
        goto L_0x009f;
    L_0x009e:
        r1 = r11;
    L_0x009f:
        r11 = r10.f24996m;
        if (r11 == 0) goto L_0x00ac;
    L_0x00a3:
        r11 = r10.f24996m;
        r11 = r11.onTouchEvent(r12);
        if (r11 == 0) goto L_0x00ac;
    L_0x00ab:
        r1 = r2;
    L_0x00ac:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: uk.co.a.a.d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
