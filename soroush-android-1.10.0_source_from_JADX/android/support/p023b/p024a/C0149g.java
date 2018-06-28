package android.support.p023b.p024a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.v4.p029a.p030a.C0344c;
import android.support.v4.p031b.C0436b;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import org.xmlpull.v1.XmlPullParser;

public final class C0149g implements Interpolator {
    private float[] f436a;
    private float[] f437b;

    public C0149g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private C0149g(Resources resources, Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a = C0344c.m675a(resources, theme, attributeSet, C0140a.f426l);
        if (C0344c.m677a(xmlPullParser, "pathData")) {
            String b = C0344c.m679b(a, xmlPullParser, "pathData", 4);
            Path a2 = C0436b.m915a(b);
            if (a2 == null) {
                StringBuilder stringBuilder = new StringBuilder("The path is null, which is created from ");
                stringBuilder.append(b);
                throw new InflateException(stringBuilder.toString());
            }
            m227a(a2);
        } else if (!C0344c.m677a(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (C0344c.m677a(xmlPullParser, "controlY1")) {
            float a3 = C0344c.m672a(a, xmlPullParser, "controlX1", 0, 0.0f);
            float a4 = C0344c.m672a(a, xmlPullParser, "controlY1", 1, 0.0f);
            boolean a5 = C0344c.m677a(xmlPullParser, "controlX2");
            if (a5 != C0344c.m677a(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            }
            Path path;
            if (a5) {
                float a6 = C0344c.m672a(a, xmlPullParser, "controlX2", 2, 0.0f);
                float a7 = C0344c.m672a(a, xmlPullParser, "controlY2", 3, 0.0f);
                path = new Path();
                path.moveTo(0.0f, 0.0f);
                path.cubicTo(a3, a4, a6, a7, BallPulseIndicator.SCALE, BallPulseIndicator.SCALE);
            } else {
                path = new Path();
                path.moveTo(0.0f, 0.0f);
                path.quadTo(a3, a4, BallPulseIndicator.SCALE, BallPulseIndicator.SCALE);
            }
            m227a(path);
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        a.recycle();
    }

    private void m227a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min <= 0) {
            StringBuilder stringBuilder = new StringBuilder("The Path has a invalid length ");
            stringBuilder.append(length);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        int i2;
        this.f436a = new float[min];
        this.f437b = new float[min];
        float[] fArr = new float[2];
        for (i2 = 0; i2 < min; i2++) {
            pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, null);
            this.f436a[i2] = fArr[0];
            this.f437b[i2] = fArr[1];
        }
        if (((double) Math.abs(this.f436a[0])) <= 1.0E-5d && ((double) Math.abs(this.f437b[0])) <= 1.0E-5d) {
            int i3 = min - 1;
            if (((double) Math.abs(this.f436a[i3] - BallPulseIndicator.SCALE)) <= 1.0E-5d) {
                if (((double) Math.abs(this.f437b[i3] - BallPulseIndicator.SCALE)) <= 1.0E-5d) {
                    float f = 0.0f;
                    int i4 = 0;
                    while (i < min) {
                        i2 = i4 + 1;
                        length = this.f436a[i4];
                        if (length < f) {
                            stringBuilder = new StringBuilder("The Path cannot loop back on itself, x :");
                            stringBuilder.append(length);
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f436a[i] = length;
                        i++;
                        f = length;
                        i4 = i2;
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder("The Path must start at (0,0) and end at (1,1) start: ");
        stringBuilder2.append(this.f436a[0]);
        stringBuilder2.append(",");
        stringBuilder2.append(this.f437b[0]);
        stringBuilder2.append(" end:");
        min--;
        stringBuilder2.append(this.f436a[min]);
        stringBuilder2.append(",");
        stringBuilder2.append(this.f437b[min]);
        throw new IllegalArgumentException(stringBuilder2.toString());
    }

    public final float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= BallPulseIndicator.SCALE) {
            return BallPulseIndicator.SCALE;
        }
        int i = 0;
        int length = this.f436a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f436a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float f2 = this.f436a[length] - this.f436a[i];
        if (f2 == 0.0f) {
            return this.f437b[i];
        }
        f = (f - this.f436a[i]) / f2;
        float f3 = this.f437b[i];
        return f3 + (f * (this.f437b[length] - f3));
    }
}
