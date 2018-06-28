package android.support.p023b.p024a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.support.v4.p029a.p030a.C0343b;
import android.support.v4.p029a.p030a.C0344c;
import android.support.v4.p031b.C0436b;
import android.support.v4.p031b.C0436b.C0435b;
import android.support.v4.p031b.p032a.C0429a;
import android.support.v4.p038g.C4813a;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Stack;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import org.jivesoftware.smack.roster.packet.RosterPacket.Item;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class C6335i extends C4697h {
    static final Mode f17311a = Mode.SRC_IN;
    C0153f f17312c;
    boolean f17313d;
    private PorterDuffColorFilter f17314e;
    private ColorFilter f17315f;
    private boolean f17316g;
    private ConstantState f17317h;
    private final float[] f17318i;
    private final Matrix f17319j;
    private final Rect f17320k;

    private static class C0150c {
        final Matrix f438a = new Matrix();
        final ArrayList<Object> f439b = new ArrayList();
        float f440c = 0.0f;
        float f441d = 0.0f;
        float f442e = 0.0f;
        float f443f = BallPulseIndicator.SCALE;
        float f444g = BallPulseIndicator.SCALE;
        float f445h = 0.0f;
        float f446i = 0.0f;
        final Matrix f447j = new Matrix();
        int f448k;
        int[] f449l;
        String f450m = null;

        public C0150c(C0150c c0150c, C4813a<String, Object> c4813a) {
            this.f440c = c0150c.f440c;
            this.f441d = c0150c.f441d;
            this.f442e = c0150c.f442e;
            this.f443f = c0150c.f443f;
            this.f444g = c0150c.f444g;
            this.f445h = c0150c.f445h;
            this.f446i = c0150c.f446i;
            this.f449l = c0150c.f449l;
            this.f450m = c0150c.f450m;
            this.f448k = c0150c.f448k;
            if (this.f450m != null) {
                c4813a.put(this.f450m, this);
            }
            this.f447j.set(c0150c.f447j);
            ArrayList arrayList = c0150c.f439b;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof C0150c) {
                    this.f439b.add(new C0150c((C0150c) obj, c4813a));
                } else {
                    C0151d c4699b;
                    if (obj instanceof C4699b) {
                        c4699b = new C4699b((C4699b) obj);
                    } else if (obj instanceof C4698a) {
                        c4699b = new C4698a((C4698a) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f439b.add(c4699b);
                    if (c4699b.f452n != null) {
                        c4813a.put(c4699b.f452n, c4699b);
                    }
                }
            }
        }

        final void m228a() {
            this.f447j.reset();
            this.f447j.postTranslate(-this.f441d, -this.f442e);
            this.f447j.postScale(this.f443f, this.f444g);
            this.f447j.postRotate(this.f440c, 0.0f, 0.0f);
            this.f447j.postTranslate(this.f445h + this.f441d, this.f446i + this.f442e);
        }

        public final String getGroupName() {
            return this.f450m;
        }

        public final Matrix getLocalMatrix() {
            return this.f447j;
        }

        public final float getPivotX() {
            return this.f441d;
        }

        public final float getPivotY() {
            return this.f442e;
        }

        public final float getRotation() {
            return this.f440c;
        }

        public final float getScaleX() {
            return this.f443f;
        }

        public final float getScaleY() {
            return this.f444g;
        }

        public final float getTranslateX() {
            return this.f445h;
        }

        public final float getTranslateY() {
            return this.f446i;
        }

        public final void setPivotX(float f) {
            if (f != this.f441d) {
                this.f441d = f;
                m228a();
            }
        }

        public final void setPivotY(float f) {
            if (f != this.f442e) {
                this.f442e = f;
                m228a();
            }
        }

        public final void setRotation(float f) {
            if (f != this.f440c) {
                this.f440c = f;
                m228a();
            }
        }

        public final void setScaleX(float f) {
            if (f != this.f443f) {
                this.f443f = f;
                m228a();
            }
        }

        public final void setScaleY(float f) {
            if (f != this.f444g) {
                this.f444g = f;
                m228a();
            }
        }

        public final void setTranslateX(float f) {
            if (f != this.f445h) {
                this.f445h = f;
                m228a();
            }
        }

        public final void setTranslateY(float f) {
            if (f != this.f446i) {
                this.f446i = f;
                m228a();
            }
        }
    }

    private static class C0151d {
        protected C0435b[] f451m = null;
        String f452n;
        int f453o;

        public C0151d(C0151d c0151d) {
            this.f452n = c0151d.f452n;
            this.f453o = c0151d.f453o;
            this.f451m = C0436b.m919a(c0151d.f451m);
        }

        public final void m229a(Path path) {
            path.reset();
            if (this.f451m != null) {
                C0435b.m912a(this.f451m, path);
            }
        }

        public boolean mo50a() {
            return false;
        }

        public C0435b[] getPathData() {
            return this.f451m;
        }

        public String getPathName() {
            return this.f452n;
        }

        public void setPathData(C0435b[] c0435bArr) {
            if (C0436b.m917a(this.f451m, c0435bArr)) {
                C0435b[] c0435bArr2 = this.f451m;
                for (int i = 0; i < c0435bArr.length; i++) {
                    c0435bArr2[i].f1544a = c0435bArr[i].f1544a;
                    for (int i2 = 0; i2 < c0435bArr[i].f1545b.length; i2++) {
                        c0435bArr2[i].f1545b[i2] = c0435bArr[i].f1545b[i2];
                    }
                }
                return;
            }
            this.f451m = C0436b.m919a(c0435bArr);
        }
    }

    private static class C0152e {
        private static final Matrix f454k = new Matrix();
        final C0150c f455a;
        float f456b;
        float f457c;
        float f458d;
        float f459e;
        int f460f;
        String f461g;
        final C4813a<String, Object> f462h;
        private final Path f463i;
        private final Path f464j;
        private final Matrix f465l;
        private Paint f466m;
        private Paint f467n;
        private PathMeasure f468o;
        private int f469p;

        public C0152e() {
            this.f465l = new Matrix();
            this.f456b = 0.0f;
            this.f457c = 0.0f;
            this.f458d = 0.0f;
            this.f459e = 0.0f;
            this.f460f = 255;
            this.f461g = null;
            this.f462h = new C4813a();
            this.f455a = new C0150c();
            this.f463i = new Path();
            this.f464j = new Path();
        }

        public C0152e(C0152e c0152e) {
            this.f465l = new Matrix();
            this.f456b = 0.0f;
            this.f457c = 0.0f;
            this.f458d = 0.0f;
            this.f459e = 0.0f;
            this.f460f = 255;
            this.f461g = null;
            this.f462h = new C4813a();
            this.f455a = new C0150c(c0152e.f455a, this.f462h);
            this.f463i = new Path(c0152e.f463i);
            this.f464j = new Path(c0152e.f464j);
            this.f456b = c0152e.f456b;
            this.f457c = c0152e.f457c;
            this.f458d = c0152e.f458d;
            this.f459e = c0152e.f459e;
            this.f469p = c0152e.f469p;
            this.f460f = c0152e.f460f;
            this.f461g = c0152e.f461g;
            if (c0152e.f461g != null) {
                this.f462h.put(c0152e.f461g, this);
            }
        }

        private void m233a(C0150c c0150c, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            C0152e c0152e;
            C0152e c0152e2 = this;
            C0150c c0150c2 = c0150c;
            Canvas canvas2 = canvas;
            ColorFilter colorFilter2 = colorFilter;
            c0150c2.f438a.set(matrix);
            c0150c2.f438a.preConcat(c0150c2.f447j);
            canvas.save();
            boolean z = false;
            int i3 = 0;
            while (i3 < c0150c2.f439b.size()) {
                Object obj = c0150c2.f439b.get(i3);
                if (obj instanceof C0150c) {
                    c0152e2.m233a((C0150c) obj, c0150c2.f438a, canvas2, i, i2, colorFilter2);
                } else if (obj instanceof C0151d) {
                    C0151d c0151d = (C0151d) obj;
                    float f = ((float) i) / c0152e2.f458d;
                    float f2 = ((float) i2) / c0152e2.f459e;
                    float min = Math.min(f, f2);
                    Matrix matrix2 = c0150c2.f438a;
                    c0152e2.f465l.set(matrix2);
                    c0152e2.f465l.postScale(f, f2);
                    float[] fArr = new float[]{0.0f, BallPulseIndicator.SCALE, BallPulseIndicator.SCALE, 0.0f};
                    matrix2.mapVectors(fArr);
                    float f3 = min;
                    float f4 = (fArr[z] * fArr[3]) - (fArr[1] * fArr[2]);
                    f = Math.max((float) Math.hypot((double) fArr[z], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
                    f = f > 0.0f ? Math.abs(f4) / f : 0.0f;
                    if (f != 0.0f) {
                        c0151d.m229a(this.f463i);
                        Path path = this.f463i;
                        this.f464j.reset();
                        if (c0151d.mo50a()) {
                            c0152e.f464j.addPath(path, c0152e.f465l);
                            canvas2.clipPath(c0152e.f464j);
                        } else {
                            Paint paint;
                            C4699b c4699b = (C4699b) c0151d;
                            if (!(c4699b.f12906g == 0.0f && c4699b.f12907h == BallPulseIndicator.SCALE)) {
                                float f5;
                                float f6 = (c4699b.f12906g + c4699b.f12908i) % BallPulseIndicator.SCALE;
                                float f7 = (c4699b.f12907h + c4699b.f12908i) % BallPulseIndicator.SCALE;
                                if (c0152e.f468o == null) {
                                    c0152e.f468o = new PathMeasure();
                                }
                                c0152e.f468o.setPath(c0152e.f463i, z);
                                f2 = c0152e.f468o.getLength();
                                f6 *= f2;
                                f7 *= f2;
                                path.reset();
                                if (f6 > f7) {
                                    c0152e.f468o.getSegment(f6, f2, path, true);
                                    f5 = 0.0f;
                                    c0152e.f468o.getSegment(0.0f, f7, path, true);
                                } else {
                                    f5 = 0.0f;
                                    c0152e.f468o.getSegment(f6, f7, path, true);
                                }
                                path.rLineTo(f5, f5);
                            }
                            c0152e.f464j.addPath(path, c0152e.f465l);
                            if (c4699b.f12902c != 0) {
                                if (c0152e.f467n == null) {
                                    c0152e.f467n = new Paint();
                                    c0152e.f467n.setStyle(Style.FILL);
                                    c0152e.f467n.setAntiAlias(true);
                                }
                                paint = c0152e.f467n;
                                paint.setColor(C6335i.m14849a(c4699b.f12902c, c4699b.f12905f));
                                paint.setColorFilter(colorFilter2);
                                c0152e.f464j.setFillType(c4699b.f12904e == 0 ? FillType.WINDING : FillType.EVEN_ODD);
                                canvas2.drawPath(c0152e.f464j, paint);
                            }
                            if (c4699b.f12900a != 0) {
                                if (c0152e.f466m == null) {
                                    c0152e.f466m = new Paint();
                                    c0152e.f466m.setStyle(Style.STROKE);
                                    c0152e.f466m.setAntiAlias(true);
                                }
                                paint = c0152e.f466m;
                                if (c4699b.f12910k != null) {
                                    paint.setStrokeJoin(c4699b.f12910k);
                                }
                                if (c4699b.f12909j != null) {
                                    paint.setStrokeCap(c4699b.f12909j);
                                }
                                paint.setStrokeMiter(c4699b.f12911l);
                                paint.setColor(C6335i.m14849a(c4699b.f12900a, c4699b.f12903d));
                                paint.setColorFilter(colorFilter2);
                                paint.setStrokeWidth(c4699b.f12901b * (f * f3));
                                canvas2.drawPath(c0152e.f464j, paint);
                            }
                        }
                    } else {
                        c0152e = this;
                    }
                    i3++;
                    c0152e2 = c0152e;
                    z = false;
                }
                int i4 = i;
                int i5 = i2;
                c0152e = c0152e2;
                i3++;
                c0152e2 = c0152e;
                z = false;
            }
            c0152e = c0152e2;
            canvas.restore();
        }

        public final void m236a(Canvas canvas, int i, int i2) {
            m233a(this.f455a, f454k, canvas, i, i2, null);
        }

        public final float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public final int getRootAlpha() {
            return this.f460f;
        }

        public final void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public final void setRootAlpha(int i) {
            this.f460f = i;
        }
    }

    private static class C0153f extends ConstantState {
        int f470a;
        C0152e f471b;
        ColorStateList f472c;
        Mode f473d;
        boolean f474e;
        Bitmap f475f;
        ColorStateList f476g;
        Mode f477h;
        int f478i;
        boolean f479j;
        boolean f480k;
        Paint f481l;

        public C0153f() {
            this.f472c = null;
            this.f473d = C6335i.f17311a;
            this.f471b = new C0152e();
        }

        public C0153f(C0153f c0153f) {
            this.f472c = null;
            this.f473d = C6335i.f17311a;
            if (c0153f != null) {
                this.f470a = c0153f.f470a;
                this.f471b = new C0152e(c0153f.f471b);
                if (c0153f.f471b.f467n != null) {
                    this.f471b.f467n = new Paint(c0153f.f471b.f467n);
                }
                if (c0153f.f471b.f466m != null) {
                    this.f471b.f466m = new Paint(c0153f.f471b.f466m);
                }
                this.f472c = c0153f.f472c;
                this.f473d = c0153f.f473d;
                this.f474e = c0153f.f474e;
            }
        }

        public final void m237a(int i, int i2) {
            this.f475f.eraseColor(0);
            this.f471b.m236a(new Canvas(this.f475f), i, i2);
        }

        public final int getChangingConfigurations() {
            return this.f470a;
        }

        public final Drawable newDrawable() {
            return new C6335i(this);
        }

        public final Drawable newDrawable(Resources resources) {
            return new C6335i(this);
        }
    }

    private static class C0154g extends ConstantState {
        private final ConstantState f482a;

        public C0154g(ConstantState constantState) {
            this.f482a = constantState;
        }

        public final boolean canApplyTheme() {
            return this.f482a.canApplyTheme();
        }

        public final int getChangingConfigurations() {
            return this.f482a.getChangingConfigurations();
        }

        public final Drawable newDrawable() {
            Drawable c6335i = new C6335i();
            c6335i.b = (VectorDrawable) this.f482a.newDrawable();
            return c6335i;
        }

        public final Drawable newDrawable(Resources resources) {
            Drawable c6335i = new C6335i();
            c6335i.b = (VectorDrawable) this.f482a.newDrawable(resources);
            return c6335i;
        }

        public final Drawable newDrawable(Resources resources, Theme theme) {
            Drawable c6335i = new C6335i();
            c6335i.b = (VectorDrawable) this.f482a.newDrawable(resources, theme);
            return c6335i;
        }
    }

    private static class C4698a extends C0151d {
        public C4698a(C4698a c4698a) {
            super(c4698a);
        }

        final void m8581a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.n = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.m = C0436b.m920b(string2);
            }
        }

        public final boolean mo50a() {
            return true;
        }
    }

    private static class C4699b extends C0151d {
        int f12900a = 0;
        float f12901b = 0.0f;
        int f12902c = 0;
        float f12903d = BallPulseIndicator.SCALE;
        int f12904e = 0;
        float f12905f = BallPulseIndicator.SCALE;
        float f12906g = 0.0f;
        float f12907h = BallPulseIndicator.SCALE;
        float f12908i = 0.0f;
        Cap f12909j = Cap.BUTT;
        Join f12910k = Join.MITER;
        float f12911l = 4.0f;
        private int[] f12912p;

        public C4699b(C4699b c4699b) {
            super(c4699b);
            this.f12912p = c4699b.f12912p;
            this.f12900a = c4699b.f12900a;
            this.f12901b = c4699b.f12901b;
            this.f12903d = c4699b.f12903d;
            this.f12902c = c4699b.f12902c;
            this.f12904e = c4699b.f12904e;
            this.f12905f = c4699b.f12905f;
            this.f12906g = c4699b.f12906g;
            this.f12907h = c4699b.f12907h;
            this.f12908i = c4699b.f12908i;
            this.f12909j = c4699b.f12909j;
            this.f12910k = c4699b.f12910k;
            this.f12911l = c4699b.f12911l;
        }

        final void m8583a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f12912p = null;
            if (C0344c.m677a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.n = string;
                }
                string = typedArray.getString(2);
                if (string != null) {
                    this.m = C0436b.m920b(string);
                }
                this.f12902c = C0344c.m678b(typedArray, xmlPullParser, "fillColor", 1, this.f12902c);
                this.f12905f = C0344c.m672a(typedArray, xmlPullParser, "fillAlpha", 12, this.f12905f);
                int a = C0344c.m674a(typedArray, xmlPullParser, "strokeLineCap", 8, -1);
                Cap cap = this.f12909j;
                switch (a) {
                    case 0:
                        cap = Cap.BUTT;
                        break;
                    case 1:
                        cap = Cap.ROUND;
                        break;
                    case 2:
                        cap = Cap.SQUARE;
                        break;
                    default:
                        break;
                }
                this.f12909j = cap;
                a = C0344c.m674a(typedArray, xmlPullParser, "strokeLineJoin", 9, -1);
                Join join = this.f12910k;
                switch (a) {
                    case 0:
                        join = Join.MITER;
                        break;
                    case 1:
                        join = Join.ROUND;
                        break;
                    case 2:
                        join = Join.BEVEL;
                        break;
                    default:
                        break;
                }
                this.f12910k = join;
                this.f12911l = C0344c.m672a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f12911l);
                this.f12900a = C0344c.m678b(typedArray, xmlPullParser, "strokeColor", 3, this.f12900a);
                this.f12903d = C0344c.m672a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f12903d);
                this.f12901b = C0344c.m672a(typedArray, xmlPullParser, "strokeWidth", 4, this.f12901b);
                this.f12907h = C0344c.m672a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f12907h);
                this.f12908i = C0344c.m672a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f12908i);
                this.f12906g = C0344c.m672a(typedArray, xmlPullParser, "trimPathStart", 5, this.f12906g);
                this.f12904e = C0344c.m674a(typedArray, xmlPullParser, "fillType", 13, this.f12904e);
            }
        }

        final float getFillAlpha() {
            return this.f12905f;
        }

        final int getFillColor() {
            return this.f12902c;
        }

        final float getStrokeAlpha() {
            return this.f12903d;
        }

        final int getStrokeColor() {
            return this.f12900a;
        }

        final float getStrokeWidth() {
            return this.f12901b;
        }

        final float getTrimPathEnd() {
            return this.f12907h;
        }

        final float getTrimPathOffset() {
            return this.f12908i;
        }

        final float getTrimPathStart() {
            return this.f12906g;
        }

        final void setFillAlpha(float f) {
            this.f12905f = f;
        }

        final void setFillColor(int i) {
            this.f12902c = i;
        }

        final void setStrokeAlpha(float f) {
            this.f12903d = f;
        }

        final void setStrokeColor(int i) {
            this.f12900a = i;
        }

        final void setStrokeWidth(float f) {
            this.f12901b = f;
        }

        final void setTrimPathEnd(float f) {
            this.f12907h = f;
        }

        final void setTrimPathOffset(float f) {
            this.f12908i = f;
        }

        final void setTrimPathStart(float f) {
            this.f12906g = f;
        }
    }

    C6335i() {
        this.f17313d = true;
        this.f17318i = new float[9];
        this.f17319j = new Matrix();
        this.f17320k = new Rect();
        this.f17312c = new C0153f();
    }

    C6335i(C0153f c0153f) {
        this.f17313d = true;
        this.f17318i = new float[9];
        this.f17319j = new Matrix();
        this.f17320k = new Rect();
        this.f17312c = c0153f;
        this.f17314e = m14850a(c0153f.f472c, c0153f.f473d);
    }

    static int m14849a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    private PorterDuffColorFilter m14850a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList != null) {
            if (mode != null) {
                return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            }
        }
        return null;
    }

    public static C6335i m14851a(Resources resources, int i, Theme theme) {
        if (VERSION.SDK_INT >= 24) {
            C6335i c6335i = new C6335i();
            c6335i.b = C0343b.m671a(resources, i, theme);
            c6335i.f17317h = new C0154g(c6335i.b.getConstantState());
            return c6335i;
        }
        try {
            int next;
            XmlPullParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return C6335i.m14852a(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (Throwable e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        }
    }

    public static C6335i m14852a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        C6335i c6335i = new C6335i();
        c6335i.inflate(resources, xmlPullParser, attributeSet, theme);
        return c6335i;
    }

    private void m14853b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        Resources resources2 = resources;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Theme theme2 = theme;
        C0153f c0153f = this.f17312c;
        C0152e c0152e = c0153f.f471b;
        Stack stack = new Stack();
        stack.push(c0152e.f455a);
        int eventType = xmlPullParser.getEventType();
        int i = 1;
        int depth = xmlPullParser.getDepth() + 1;
        int i2 = 1;
        while (eventType != i && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C0150c c0150c = (C0150c) stack.peek();
                if ("path".equals(name)) {
                    C4699b c4699b = new C4699b();
                    TypedArray a = C0344c.m675a(resources2, theme2, attributeSet2, C0140a.f417c);
                    c4699b.m8583a(a, xmlPullParser2);
                    a.recycle();
                    c0150c.f439b.add(c4699b);
                    if (c4699b.getPathName() != null) {
                        c0152e.f462h.put(c4699b.getPathName(), c4699b);
                    }
                    c0153f.f470a = c4699b.o | c0153f.f470a;
                    i2 = 0;
                } else {
                    TypedArray a2;
                    if ("clip-path".equals(name)) {
                        C4698a c4698a = new C4698a();
                        if (C0344c.m677a(xmlPullParser2, "pathData")) {
                            a2 = C0344c.m675a(resources2, theme2, attributeSet2, C0140a.f418d);
                            c4698a.m8581a(a2);
                            a2.recycle();
                        }
                        c0150c.f439b.add(c4698a);
                        if (c4698a.getPathName() != null) {
                            c0152e.f462h.put(c4698a.getPathName(), c4698a);
                        }
                        eventType = c4698a.o | c0153f.f470a;
                    } else if (Item.GROUP.equals(name)) {
                        C0150c c0150c2 = new C0150c();
                        a2 = C0344c.m675a(resources2, theme2, attributeSet2, C0140a.f416b);
                        c0150c2.f449l = null;
                        c0150c2.f440c = C0344c.m672a(a2, xmlPullParser2, "rotation", 5, c0150c2.f440c);
                        c0150c2.f441d = a2.getFloat(1, c0150c2.f441d);
                        c0150c2.f442e = a2.getFloat(2, c0150c2.f442e);
                        c0150c2.f443f = C0344c.m672a(a2, xmlPullParser2, "scaleX", 3, c0150c2.f443f);
                        c0150c2.f444g = C0344c.m672a(a2, xmlPullParser2, "scaleY", 4, c0150c2.f444g);
                        c0150c2.f445h = C0344c.m672a(a2, xmlPullParser2, "translateX", 6, c0150c2.f445h);
                        c0150c2.f446i = C0344c.m672a(a2, xmlPullParser2, "translateY", 7, c0150c2.f446i);
                        String string = a2.getString(0);
                        if (string != null) {
                            c0150c2.f450m = string;
                        }
                        c0150c2.m228a();
                        a2.recycle();
                        c0150c.f439b.add(c0150c2);
                        stack.push(c0150c2);
                        if (c0150c2.getGroupName() != null) {
                            c0152e.f462h.put(c0150c2.getGroupName(), c0150c2);
                        }
                        eventType = c0150c2.f448k | c0153f.f470a;
                    }
                    c0153f.f470a = eventType;
                }
            } else if (eventType == 3) {
                if (Item.GROUP.equals(xmlPullParser.getName())) {
                    stack.pop();
                }
            }
            eventType = xmlPullParser.next();
            i = 1;
        }
        if (i2 != 0) {
            StringBuffer stringBuffer = new StringBuffer();
            if (stringBuffer.length() > 0) {
                stringBuffer.append(" or ");
            }
            stringBuffer.append("path");
            StringBuilder stringBuilder = new StringBuilder("no ");
            stringBuilder.append(stringBuffer);
            stringBuilder.append(" defined");
            throw new XmlPullParserException(stringBuilder.toString());
        }
    }

    public final /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
    }

    public final boolean canApplyTheme() {
        if (this.b != null) {
            C0429a.m893d(this.b);
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r11) {
        /*
        r10 = this;
        r0 = r10.b;
        if (r0 == 0) goto L_0x000a;
    L_0x0004:
        r0 = r10.b;
        r0.draw(r11);
        return;
    L_0x000a:
        r0 = r10.f17320k;
        r10.copyBounds(r0);
        r0 = r10.f17320k;
        r0 = r0.width();
        if (r0 <= 0) goto L_0x0176;
    L_0x0017:
        r0 = r10.f17320k;
        r0 = r0.height();
        if (r0 > 0) goto L_0x0020;
    L_0x001f:
        return;
    L_0x0020:
        r0 = r10.f17315f;
        if (r0 != 0) goto L_0x0027;
    L_0x0024:
        r0 = r10.f17314e;
        goto L_0x0029;
    L_0x0027:
        r0 = r10.f17315f;
    L_0x0029:
        r1 = r10.f17319j;
        r11.getMatrix(r1);
        r1 = r10.f17319j;
        r2 = r10.f17318i;
        r1.getValues(r2);
        r1 = r10.f17318i;
        r2 = 0;
        r1 = r1[r2];
        r1 = java.lang.Math.abs(r1);
        r3 = r10.f17318i;
        r4 = 4;
        r3 = r3[r4];
        r3 = java.lang.Math.abs(r3);
        r4 = r10.f17318i;
        r5 = 1;
        r4 = r4[r5];
        r4 = java.lang.Math.abs(r4);
        r6 = r10.f17318i;
        r7 = 3;
        r6 = r6[r7];
        r6 = java.lang.Math.abs(r6);
        r7 = 0;
        r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
        r8 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r4 != 0) goto L_0x0064;
    L_0x0060:
        r4 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r4 == 0) goto L_0x0066;
    L_0x0064:
        r1 = r8;
        r3 = r1;
    L_0x0066:
        r4 = r10.f17320k;
        r4 = r4.width();
        r4 = (float) r4;
        r4 = r4 * r1;
        r1 = (int) r4;
        r4 = r10.f17320k;
        r4 = r4.height();
        r4 = (float) r4;
        r4 = r4 * r3;
        r3 = (int) r4;
        r4 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        r1 = java.lang.Math.min(r4, r1);
        r3 = java.lang.Math.min(r4, r3);
        if (r1 <= 0) goto L_0x0176;
    L_0x0084:
        if (r3 > 0) goto L_0x0087;
    L_0x0086:
        return;
    L_0x0087:
        r4 = r11.save();
        r6 = r10.f17320k;
        r6 = r6.left;
        r6 = (float) r6;
        r9 = r10.f17320k;
        r9 = r9.top;
        r9 = (float) r9;
        r11.translate(r6, r9);
        r6 = android.os.Build.VERSION.SDK_INT;
        r9 = 17;
        if (r6 < r9) goto L_0x00ac;
    L_0x009e:
        r6 = r10.isAutoMirrored();
        if (r6 == 0) goto L_0x00ac;
    L_0x00a4:
        r6 = android.support.v4.p031b.p032a.C0429a.m898i(r10);
        if (r6 != r5) goto L_0x00ac;
    L_0x00aa:
        r6 = r5;
        goto L_0x00ad;
    L_0x00ac:
        r6 = r2;
    L_0x00ad:
        if (r6 == 0) goto L_0x00be;
    L_0x00af:
        r6 = r10.f17320k;
        r6 = r6.width();
        r6 = (float) r6;
        r11.translate(r6, r7);
        r6 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r11.scale(r6, r8);
    L_0x00be:
        r6 = r10.f17320k;
        r6.offsetTo(r2, r2);
        r6 = r10.f17312c;
        r7 = r6.f475f;
        if (r7 == 0) goto L_0x00de;
    L_0x00c9:
        r7 = r6.f475f;
        r7 = r7.getWidth();
        if (r1 != r7) goto L_0x00db;
    L_0x00d1:
        r7 = r6.f475f;
        r7 = r7.getHeight();
        if (r3 != r7) goto L_0x00db;
    L_0x00d9:
        r7 = r5;
        goto L_0x00dc;
    L_0x00db:
        r7 = r2;
    L_0x00dc:
        if (r7 != 0) goto L_0x00e8;
    L_0x00de:
        r7 = android.graphics.Bitmap.Config.ARGB_8888;
        r7 = android.graphics.Bitmap.createBitmap(r1, r3, r7);
        r6.f475f = r7;
        r6.f480k = r5;
    L_0x00e8:
        r6 = r10.f17313d;
        if (r6 != 0) goto L_0x00f2;
    L_0x00ec:
        r6 = r10.f17312c;
        r6.m237a(r1, r3);
        goto L_0x0136;
    L_0x00f2:
        r6 = r10.f17312c;
        r7 = r6.f480k;
        if (r7 != 0) goto L_0x0116;
    L_0x00f8:
        r7 = r6.f476g;
        r8 = r6.f472c;
        if (r7 != r8) goto L_0x0116;
    L_0x00fe:
        r7 = r6.f477h;
        r8 = r6.f473d;
        if (r7 != r8) goto L_0x0116;
    L_0x0104:
        r7 = r6.f479j;
        r8 = r6.f474e;
        if (r7 != r8) goto L_0x0116;
    L_0x010a:
        r7 = r6.f478i;
        r6 = r6.f471b;
        r6 = r6.getRootAlpha();
        if (r7 != r6) goto L_0x0116;
    L_0x0114:
        r6 = r5;
        goto L_0x0117;
    L_0x0116:
        r6 = r2;
    L_0x0117:
        if (r6 != 0) goto L_0x0136;
    L_0x0119:
        r6 = r10.f17312c;
        r6.m237a(r1, r3);
        r1 = r10.f17312c;
        r3 = r1.f472c;
        r1.f476g = r3;
        r3 = r1.f473d;
        r1.f477h = r3;
        r3 = r1.f471b;
        r3 = r3.getRootAlpha();
        r1.f478i = r3;
        r3 = r1.f474e;
        r1.f479j = r3;
        r1.f480k = r2;
    L_0x0136:
        r1 = r10.f17312c;
        r3 = r10.f17320k;
        r6 = r1.f471b;
        r6 = r6.getRootAlpha();
        r7 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r6 >= r7) goto L_0x0145;
    L_0x0144:
        r2 = r5;
    L_0x0145:
        r6 = 0;
        if (r2 != 0) goto L_0x014c;
    L_0x0148:
        if (r0 != 0) goto L_0x014c;
    L_0x014a:
        r0 = r6;
        goto L_0x016e;
    L_0x014c:
        r2 = r1.f481l;
        if (r2 != 0) goto L_0x015c;
    L_0x0150:
        r2 = new android.graphics.Paint;
        r2.<init>();
        r1.f481l = r2;
        r2 = r1.f481l;
        r2.setFilterBitmap(r5);
    L_0x015c:
        r2 = r1.f481l;
        r5 = r1.f471b;
        r5 = r5.getRootAlpha();
        r2.setAlpha(r5);
        r2 = r1.f481l;
        r2.setColorFilter(r0);
        r0 = r1.f481l;
    L_0x016e:
        r1 = r1.f475f;
        r11.drawBitmap(r1, r6, r3, r0);
        r11.restoreToCount(r4);
    L_0x0176:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.b.a.i.draw(android.graphics.Canvas):void");
    }

    public final int getAlpha() {
        return this.b != null ? C0429a.m892c(this.b) : this.f17312c.f471b.getRootAlpha();
    }

    public final int getChangingConfigurations() {
        return this.b != null ? this.b.getChangingConfigurations() : super.getChangingConfigurations() | this.f17312c.getChangingConfigurations();
    }

    public final /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public final ConstantState getConstantState() {
        if (this.b != null && VERSION.SDK_INT >= 24) {
            return new C0154g(this.b.getConstantState());
        }
        this.f17312c.f470a = getChangingConfigurations();
        return this.f17312c;
    }

    public final /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public final int getIntrinsicHeight() {
        return this.b != null ? this.b.getIntrinsicHeight() : (int) this.f17312c.f471b.f457c;
    }

    public final int getIntrinsicWidth() {
        return this.b != null ? this.b.getIntrinsicWidth() : (int) this.f17312c.f471b.f456b;
    }

    public final /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public final /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.b != null ? this.b.getOpacity() : -3;
    }

    public final /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public final /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public final /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        if (this.b != null) {
            this.b.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        if (this.b != null) {
            C0429a.m887a(this.b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0153f c0153f = this.f17312c;
        c0153f.f471b = new C0152e();
        TypedArray a = C0344c.m675a(resources, theme, attributeSet, C0140a.f415a);
        C0153f c0153f2 = this.f17312c;
        C0152e c0152e = c0153f2.f471b;
        int a2 = C0344c.m674a(a, xmlPullParser, "tintMode", 6, -1);
        Mode mode = Mode.SRC_IN;
        if (a2 == 3) {
            mode = Mode.SRC_OVER;
        } else if (a2 == 5) {
            mode = Mode.SRC_IN;
        } else if (a2 != 9) {
            switch (a2) {
                case 14:
                    mode = Mode.MULTIPLY;
                    break;
                case 15:
                    mode = Mode.SCREEN;
                    break;
                case 16:
                    if (VERSION.SDK_INT >= 11) {
                        mode = Mode.ADD;
                        break;
                    }
                    break;
                default:
                    break;
            }
        } else {
            mode = Mode.SRC_ATOP;
        }
        c0153f2.f473d = mode;
        ColorStateList colorStateList = a.getColorStateList(1);
        if (colorStateList != null) {
            c0153f2.f472c = colorStateList;
        }
        boolean z = c0153f2.f474e;
        if (C0344c.m677a(xmlPullParser, "autoMirrored")) {
            z = a.getBoolean(5, z);
        }
        c0153f2.f474e = z;
        c0152e.f458d = C0344c.m672a(a, xmlPullParser, "viewportWidth", 7, c0152e.f458d);
        c0152e.f459e = C0344c.m672a(a, xmlPullParser, "viewportHeight", 8, c0152e.f459e);
        StringBuilder stringBuilder;
        if (c0152e.f458d <= 0.0f) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(a.getPositionDescription());
            stringBuilder.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(stringBuilder.toString());
        } else if (c0152e.f459e <= 0.0f) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(a.getPositionDescription());
            stringBuilder.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(stringBuilder.toString());
        } else {
            c0152e.f456b = a.getDimension(3, c0152e.f456b);
            c0152e.f457c = a.getDimension(2, c0152e.f457c);
            if (c0152e.f456b <= 0.0f) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(a.getPositionDescription());
                stringBuilder.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(stringBuilder.toString());
            } else if (c0152e.f457c <= 0.0f) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(a.getPositionDescription());
                stringBuilder.append("<vector> tag requires height > 0");
                throw new XmlPullParserException(stringBuilder.toString());
            } else {
                c0152e.setAlpha(C0344c.m672a(a, xmlPullParser, "alpha", 4, c0152e.getAlpha()));
                String string = a.getString(0);
                if (string != null) {
                    c0152e.f461g = string;
                    c0152e.f462h.put(string, c0152e);
                }
                a.recycle();
                c0153f.f470a = getChangingConfigurations();
                c0153f.f480k = true;
                m14853b(resources, xmlPullParser, attributeSet, theme);
                this.f17314e = m14850a(c0153f.f472c, c0153f.f473d);
            }
        }
    }

    public final void invalidateSelf() {
        if (this.b != null) {
            this.b.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        return this.b != null ? C0429a.m890b(this.b) : this.f17312c.f474e;
    }

    public final boolean isStateful() {
        if (this.b != null) {
            return this.b.isStateful();
        }
        if (!super.isStateful()) {
            if (this.f17312c == null || this.f17312c.f472c == null || !this.f17312c.f472c.isStateful()) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public final Drawable mutate() {
        if (this.b != null) {
            this.b.mutate();
            return this;
        }
        if (!this.f17316g && super.mutate() == this) {
            this.f17312c = new C0153f(this.f17312c);
            this.f17316g = true;
        }
        return this;
    }

    protected final void onBoundsChange(Rect rect) {
        if (this.b != null) {
            this.b.setBounds(rect);
        }
    }

    protected final boolean onStateChange(int[] iArr) {
        if (this.b != null) {
            return this.b.setState(iArr);
        }
        C0153f c0153f = this.f17312c;
        if (c0153f.f472c == null || c0153f.f473d == null) {
            return false;
        }
        this.f17314e = m14850a(c0153f.f472c, c0153f.f473d);
        invalidateSelf();
        return true;
    }

    public final void scheduleSelf(Runnable runnable, long j) {
        if (this.b != null) {
            this.b.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public final void setAlpha(int i) {
        if (this.b != null) {
            this.b.setAlpha(i);
            return;
        }
        if (this.f17312c.f471b.getRootAlpha() != i) {
            this.f17312c.f471b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean z) {
        if (this.b != null) {
            C0429a.m889a(this.b, z);
        } else {
            this.f17312c.f474e = z;
        }
    }

    public final /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public final /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.b != null) {
            this.b.setColorFilter(colorFilter);
            return;
        }
        this.f17315f = colorFilter;
        invalidateSelf();
    }

    public final /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public final /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public final /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public final /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public final void setTint(int i) {
        if (this.b != null) {
            C0429a.m883a(this.b, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.b != null) {
            C0429a.m885a(this.b, colorStateList);
            return;
        }
        C0153f c0153f = this.f17312c;
        if (c0153f.f472c != colorStateList) {
            c0153f.f472c = colorStateList;
            this.f17314e = m14850a(colorStateList, c0153f.f473d);
            invalidateSelf();
        }
    }

    public final void setTintMode(Mode mode) {
        if (this.b != null) {
            C0429a.m888a(this.b, mode);
            return;
        }
        C0153f c0153f = this.f17312c;
        if (c0153f.f473d != mode) {
            c0153f.f473d = mode;
            this.f17314e = m14850a(c0153f.f472c, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        return this.b != null ? this.b.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public final void unscheduleSelf(Runnable runnable) {
        if (this.b != null) {
            this.b.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
