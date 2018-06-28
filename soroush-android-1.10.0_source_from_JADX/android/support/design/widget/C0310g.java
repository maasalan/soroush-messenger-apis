package android.support.design.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.v4.p037f.C0462e;
import android.support.v4.view.C0555d;
import android.support.v4.view.C0571r;
import android.support.v7.p041a.C0645a.C0644j;
import android.support.v7.widget.TintTypedArray;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.animation.Interpolator;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

final class C0310g {
    private static final boolean f1166k = (VERSION.SDK_INT < 18);
    private static final Paint f1167l = null;
    private boolean f1168A;
    private boolean f1169B;
    private Bitmap f1170C;
    private Paint f1171D;
    private float f1172E;
    private float f1173F;
    private float f1174G;
    private float f1175H;
    private int[] f1176I;
    private boolean f1177J;
    private final TextPaint f1178K;
    private Interpolator f1179L;
    private float f1180M;
    private float f1181N;
    private float f1182O;
    private int f1183P;
    private float f1184Q;
    private float f1185R;
    private float f1186S;
    private int f1187T;
    float f1188a;
    int f1189b = 16;
    int f1190c = 16;
    float f1191d = 15.0f;
    float f1192e = 15.0f;
    ColorStateList f1193f;
    Typeface f1194g;
    Typeface f1195h;
    CharSequence f1196i;
    Interpolator f1197j;
    private final View f1198m;
    private boolean f1199n;
    private final Rect f1200o;
    private final Rect f1201p;
    private final RectF f1202q;
    private ColorStateList f1203r;
    private float f1204s;
    private float f1205t;
    private float f1206u;
    private float f1207v;
    private float f1208w;
    private float f1209x;
    private Typeface f1210y;
    private CharSequence f1211z;

    public C0310g(View view) {
        this.f1198m = view;
        this.f1178K = new TextPaint(129);
        this.f1201p = new Rect();
        this.f1200o = new Rect();
        this.f1202q = new RectF();
    }

    private static float m579a(float f, float f2, float f3, Interpolator interpolator) {
        if (interpolator != null) {
            f3 = interpolator.getInterpolation(f3);
        }
        return C0296a.m564a(f, f2, f3);
    }

    private static int m580a(int i, int i2, float f) {
        float f2 = BallPulseIndicator.SCALE - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    private static boolean m581a(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    private static boolean m582a(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    static boolean m583a(Typeface typeface, Typeface typeface2) {
        return !(typeface == null || typeface.equals(typeface2)) || (typeface == null && typeface2 != null);
    }

    private void m584b(float f) {
        TextPaint textPaint;
        int a;
        this.f1202q.left = C0310g.m579a((float) this.f1200o.left, (float) this.f1201p.left, f, this.f1197j);
        this.f1202q.top = C0310g.m579a(this.f1204s, this.f1205t, f, this.f1197j);
        this.f1202q.right = C0310g.m579a((float) this.f1200o.right, (float) this.f1201p.right, f, this.f1197j);
        this.f1202q.bottom = C0310g.m579a((float) this.f1200o.bottom, (float) this.f1201p.bottom, f, this.f1197j);
        this.f1208w = C0310g.m579a(this.f1206u, this.f1207v, f, this.f1197j);
        this.f1209x = C0310g.m579a(this.f1204s, this.f1205t, f, this.f1197j);
        m586c(C0310g.m579a(this.f1191d, this.f1192e, f, this.f1179L));
        if (this.f1193f != this.f1203r) {
            textPaint = this.f1178K;
            a = C0310g.m580a(this.f1176I != null ? this.f1203r.getColorForState(this.f1176I, 0) : this.f1203r.getDefaultColor(), m589e(), f);
        } else {
            textPaint = this.f1178K;
            a = m589e();
        }
        textPaint.setColor(a);
        this.f1178K.setShadowLayer(C0310g.m579a(this.f1184Q, this.f1180M, f, null), C0310g.m579a(this.f1185R, this.f1181N, f, null), C0310g.m579a(this.f1186S, this.f1182O, f, null), C0310g.m580a(this.f1187T, this.f1183P, f));
        C0571r.m1361e(this.f1198m);
    }

    private void m585c() {
        boolean z = this.f1201p.width() > 0 && this.f1201p.height() > 0 && this.f1200o.width() > 0 && this.f1200o.height() > 0;
        this.f1199n = z;
    }

    private void m586c(float f) {
        m588d(f);
        boolean z = f1166k && this.f1174G != BallPulseIndicator.SCALE;
        this.f1169B = z;
        if (this.f1169B && this.f1170C == null && !this.f1200o.isEmpty()) {
            if (!TextUtils.isEmpty(this.f1211z)) {
                m584b(0.0f);
                this.f1172E = this.f1178K.ascent();
                this.f1173F = this.f1178K.descent();
                int round = Math.round(this.f1178K.measureText(this.f1211z, 0, this.f1211z.length()));
                int round2 = Math.round(this.f1173F - this.f1172E);
                if (round > 0) {
                    if (round2 > 0) {
                        this.f1170C = Bitmap.createBitmap(round, round2, Config.ARGB_8888);
                        new Canvas(this.f1170C).drawText(this.f1211z, 0, this.f1211z.length(), 0.0f, ((float) round2) - this.f1178K.descent(), this.f1178K);
                        if (this.f1171D == null) {
                            this.f1171D = new Paint(3);
                        }
                    }
                }
            }
        }
        C0571r.m1361e(this.f1198m);
    }

    private void m587d() {
        m584b(this.f1188a);
    }

    private void m588d(float f) {
        if (this.f1196i != null) {
            float f2;
            boolean z;
            float width = (float) this.f1201p.width();
            float width2 = (float) this.f1200o.width();
            boolean z2 = false;
            if (C0310g.m581a(f, this.f1192e)) {
                boolean z3;
                f = this.f1192e;
                this.f1174G = BallPulseIndicator.SCALE;
                if (C0310g.m583a(this.f1210y, this.f1194g)) {
                    this.f1210y = this.f1194g;
                    z3 = true;
                } else {
                    z3 = false;
                }
                f2 = f;
                z = z3;
            } else {
                f2 = this.f1191d;
                if (C0310g.m583a(this.f1210y, this.f1195h)) {
                    this.f1210y = this.f1195h;
                    z = true;
                } else {
                    z = false;
                }
                if (C0310g.m581a(f, this.f1191d)) {
                    this.f1174G = BallPulseIndicator.SCALE;
                } else {
                    this.f1174G = f / this.f1191d;
                }
                f = this.f1192e / this.f1191d;
                width = width2 * f > width ? Math.min(width / f, width2) : width2;
            }
            if (width > 0.0f) {
                if (this.f1175H == f2 && !this.f1177J) {
                    if (!z) {
                        z = false;
                        this.f1175H = f2;
                        this.f1177J = false;
                    }
                }
                z = true;
                this.f1175H = f2;
                this.f1177J = false;
            }
            if (this.f1211z == null || r6) {
                this.f1178K.setTextSize(this.f1175H);
                this.f1178K.setTypeface(this.f1210y);
                this.f1178K.setLinearText(this.f1174G != BallPulseIndicator.SCALE);
                CharSequence ellipsize = TextUtils.ellipsize(this.f1196i, this.f1178K, width, TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.f1211z)) {
                    this.f1211z = ellipsize;
                    ellipsize = this.f1211z;
                    if (C0571r.m1369h(this.f1198m) == 1) {
                        z2 = true;
                    }
                    this.f1168A = (z2 ? C0462e.f1598d : C0462e.f1597c).mo297a(ellipsize, ellipsize.length());
                }
            }
        }
    }

    private int m589e() {
        return this.f1176I != null ? this.f1193f.getColorForState(this.f1176I, 0) : this.f1193f.getDefaultColor();
    }

    private Typeface m590e(int i) {
        TypedArray obtainStyledAttributes = this.f1198m.getContext().obtainStyledAttributes(i, new int[]{16843692});
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                Typeface create = Typeface.create(string, 0);
                return create;
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void m591f() {
        if (this.f1170C != null) {
            this.f1170C.recycle();
            this.f1170C = null;
        }
    }

    final Typeface m592a() {
        return this.f1194g != null ? this.f1194g : Typeface.DEFAULT;
    }

    final void m593a(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > BallPulseIndicator.SCALE) {
            f = BallPulseIndicator.SCALE;
        }
        if (f != this.f1188a) {
            this.f1188a = f;
            m587d();
        }
    }

    final void m594a(int i) {
        if (this.f1189b != i) {
            this.f1189b = i;
            m602b();
        }
    }

    final void m595a(int i, int i2, int i3, int i4) {
        if (!C0310g.m582a(this.f1200o, i, i2, i3, i4)) {
            this.f1200o.set(i, i2, i3, i4);
            this.f1177J = true;
            m585c();
        }
    }

    final void m596a(ColorStateList colorStateList) {
        if (this.f1193f != colorStateList) {
            this.f1193f = colorStateList;
            m602b();
        }
    }

    public final void m597a(Canvas canvas) {
        int save = canvas.save();
        if (this.f1211z != null && this.f1199n) {
            float f;
            float f2 = this.f1208w;
            float f3 = this.f1209x;
            Object obj = (!this.f1169B || this.f1170C == null) ? null : 1;
            if (obj != null) {
                f = this.f1172E * this.f1174G;
            } else {
                this.f1178K.ascent();
                f = 0.0f;
                this.f1178K.descent();
            }
            if (obj != null) {
                f3 += f;
            }
            float f4 = f3;
            if (this.f1174G != BallPulseIndicator.SCALE) {
                canvas.scale(this.f1174G, this.f1174G, f2, f4);
            }
            if (obj != null) {
                canvas.drawBitmap(this.f1170C, f2, f4, this.f1171D);
            } else {
                canvas.drawText(this.f1211z, 0, this.f1211z.length(), f2, f4, this.f1178K);
            }
        }
        canvas.restoreToCount(save);
    }

    final void m598a(Typeface typeface) {
        this.f1195h = typeface;
        this.f1194g = typeface;
        m602b();
    }

    final void m599a(Interpolator interpolator) {
        this.f1179L = interpolator;
        m602b();
    }

    final void m600a(CharSequence charSequence) {
        if (charSequence == null || !charSequence.equals(this.f1196i)) {
            this.f1196i = charSequence;
            this.f1211z = null;
            m591f();
            m602b();
        }
    }

    final boolean m601a(int[] iArr) {
        this.f1176I = iArr;
        boolean z = (this.f1193f != null && this.f1193f.isStateful()) || (this.f1203r != null && this.f1203r.isStateful());
        if (!z) {
            return false;
        }
        m602b();
        return true;
    }

    public final void m602b() {
        if (this.f1198m.getHeight() > 0 && this.f1198m.getWidth() > 0) {
            float ascent;
            float centerX;
            int a;
            int i;
            float ascent2;
            float f = this.f1175H;
            m588d(this.f1192e);
            float f2 = 0.0f;
            float measureText = this.f1211z != null ? this.f1178K.measureText(this.f1211z, 0, this.f1211z.length()) : 0.0f;
            int a2 = C0555d.m1224a(this.f1190c, this.f1168A);
            int i2 = a2 & 112;
            if (i2 == 48) {
                ascent = ((float) this.f1201p.top) - this.f1178K.ascent();
            } else if (i2 != 80) {
                this.f1205t = ((float) this.f1201p.centerY()) + (((this.f1178K.descent() - this.f1178K.ascent()) / 2.0f) - this.f1178K.descent());
                a2 &= 8388615;
                if (a2 != 1) {
                    centerX = (float) this.f1201p.centerX();
                    measureText /= 2.0f;
                } else if (a2 == 5) {
                    this.f1207v = (float) this.f1201p.left;
                    m588d(this.f1191d);
                    if (this.f1211z != null) {
                        f2 = this.f1178K.measureText(this.f1211z, 0, this.f1211z.length());
                    }
                    a = C0555d.m1224a(this.f1189b, this.f1168A);
                    i = a & 112;
                    if (i == 48) {
                        ascent2 = ((float) this.f1200o.top) - this.f1178K.ascent();
                    } else if (i == 80) {
                        this.f1204s = ((float) this.f1200o.centerY()) + (((this.f1178K.descent() - this.f1178K.ascent()) / 2.0f) - this.f1178K.descent());
                        a &= 8388615;
                        if (a == 1) {
                            measureText = (float) this.f1200o.centerX();
                            f2 /= 2.0f;
                            measureText -= f2;
                        } else if (a == 5) {
                            measureText = (float) this.f1200o.left;
                        } else {
                            measureText = (float) this.f1200o.right;
                            measureText -= f2;
                        }
                        this.f1206u = measureText;
                        m591f();
                        m586c(f);
                        m587d();
                    } else {
                        ascent2 = (float) this.f1200o.bottom;
                    }
                    this.f1204s = ascent2;
                    a &= 8388615;
                    if (a == 1) {
                        measureText = (float) this.f1200o.centerX();
                        f2 /= 2.0f;
                        measureText -= f2;
                    } else if (a == 5) {
                        measureText = (float) this.f1200o.right;
                        measureText -= f2;
                    } else {
                        measureText = (float) this.f1200o.left;
                    }
                    this.f1206u = measureText;
                    m591f();
                    m586c(f);
                    m587d();
                } else {
                    centerX = (float) this.f1201p.right;
                }
                this.f1207v = centerX - measureText;
                m588d(this.f1191d);
                if (this.f1211z != null) {
                    f2 = this.f1178K.measureText(this.f1211z, 0, this.f1211z.length());
                }
                a = C0555d.m1224a(this.f1189b, this.f1168A);
                i = a & 112;
                if (i == 48) {
                    ascent2 = ((float) this.f1200o.top) - this.f1178K.ascent();
                } else if (i == 80) {
                    ascent2 = (float) this.f1200o.bottom;
                } else {
                    this.f1204s = ((float) this.f1200o.centerY()) + (((this.f1178K.descent() - this.f1178K.ascent()) / 2.0f) - this.f1178K.descent());
                    a &= 8388615;
                    if (a == 1) {
                        measureText = (float) this.f1200o.centerX();
                        f2 /= 2.0f;
                        measureText -= f2;
                    } else if (a == 5) {
                        measureText = (float) this.f1200o.left;
                    } else {
                        measureText = (float) this.f1200o.right;
                        measureText -= f2;
                    }
                    this.f1206u = measureText;
                    m591f();
                    m586c(f);
                    m587d();
                }
                this.f1204s = ascent2;
                a &= 8388615;
                if (a == 1) {
                    measureText = (float) this.f1200o.centerX();
                    f2 /= 2.0f;
                    measureText -= f2;
                } else if (a == 5) {
                    measureText = (float) this.f1200o.right;
                    measureText -= f2;
                } else {
                    measureText = (float) this.f1200o.left;
                }
                this.f1206u = measureText;
                m591f();
                m586c(f);
                m587d();
            } else {
                ascent = (float) this.f1201p.bottom;
            }
            this.f1205t = ascent;
            a2 &= 8388615;
            if (a2 != 1) {
                centerX = (float) this.f1201p.centerX();
                measureText /= 2.0f;
            } else if (a2 == 5) {
                centerX = (float) this.f1201p.right;
            } else {
                this.f1207v = (float) this.f1201p.left;
                m588d(this.f1191d);
                if (this.f1211z != null) {
                    f2 = this.f1178K.measureText(this.f1211z, 0, this.f1211z.length());
                }
                a = C0555d.m1224a(this.f1189b, this.f1168A);
                i = a & 112;
                if (i == 48) {
                    ascent2 = ((float) this.f1200o.top) - this.f1178K.ascent();
                } else if (i == 80) {
                    this.f1204s = ((float) this.f1200o.centerY()) + (((this.f1178K.descent() - this.f1178K.ascent()) / 2.0f) - this.f1178K.descent());
                    a &= 8388615;
                    if (a == 1) {
                        measureText = (float) this.f1200o.centerX();
                        f2 /= 2.0f;
                        measureText -= f2;
                    } else if (a == 5) {
                        measureText = (float) this.f1200o.left;
                    } else {
                        measureText = (float) this.f1200o.right;
                        measureText -= f2;
                    }
                    this.f1206u = measureText;
                    m591f();
                    m586c(f);
                    m587d();
                } else {
                    ascent2 = (float) this.f1200o.bottom;
                }
                this.f1204s = ascent2;
                a &= 8388615;
                if (a == 1) {
                    measureText = (float) this.f1200o.centerX();
                    f2 /= 2.0f;
                    measureText -= f2;
                } else if (a == 5) {
                    measureText = (float) this.f1200o.right;
                    measureText -= f2;
                } else {
                    measureText = (float) this.f1200o.left;
                }
                this.f1206u = measureText;
                m591f();
                m586c(f);
                m587d();
            }
            this.f1207v = centerX - measureText;
            m588d(this.f1191d);
            if (this.f1211z != null) {
                f2 = this.f1178K.measureText(this.f1211z, 0, this.f1211z.length());
            }
            a = C0555d.m1224a(this.f1189b, this.f1168A);
            i = a & 112;
            if (i == 48) {
                ascent2 = ((float) this.f1200o.top) - this.f1178K.ascent();
            } else if (i == 80) {
                ascent2 = (float) this.f1200o.bottom;
            } else {
                this.f1204s = ((float) this.f1200o.centerY()) + (((this.f1178K.descent() - this.f1178K.ascent()) / 2.0f) - this.f1178K.descent());
                a &= 8388615;
                if (a == 1) {
                    measureText = (float) this.f1200o.centerX();
                    f2 /= 2.0f;
                    measureText -= f2;
                } else if (a == 5) {
                    measureText = (float) this.f1200o.left;
                } else {
                    measureText = (float) this.f1200o.right;
                    measureText -= f2;
                }
                this.f1206u = measureText;
                m591f();
                m586c(f);
                m587d();
            }
            this.f1204s = ascent2;
            a &= 8388615;
            if (a == 1) {
                measureText = (float) this.f1200o.centerX();
                f2 /= 2.0f;
                measureText -= f2;
            } else if (a == 5) {
                measureText = (float) this.f1200o.right;
                measureText -= f2;
            } else {
                measureText = (float) this.f1200o.left;
            }
            this.f1206u = measureText;
            m591f();
            m586c(f);
            m587d();
        }
    }

    final void m603b(int i) {
        if (this.f1190c != i) {
            this.f1190c = i;
            m602b();
        }
    }

    final void m604b(int i, int i2, int i3, int i4) {
        if (!C0310g.m582a(this.f1201p, i, i2, i3, i4)) {
            this.f1201p.set(i, i2, i3, i4);
            this.f1177J = true;
            m585c();
        }
    }

    final void m605b(ColorStateList colorStateList) {
        if (this.f1203r != colorStateList) {
            this.f1203r = colorStateList;
            m602b();
        }
    }

    final void m606c(int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.f1198m.getContext(), i, C0644j.TextAppearance);
        if (obtainStyledAttributes.hasValue(C0644j.TextAppearance_android_textColor)) {
            this.f1193f = obtainStyledAttributes.getColorStateList(C0644j.TextAppearance_android_textColor);
        }
        if (obtainStyledAttributes.hasValue(C0644j.TextAppearance_android_textSize)) {
            this.f1192e = (float) obtainStyledAttributes.getDimensionPixelSize(C0644j.TextAppearance_android_textSize, (int) this.f1192e);
        }
        this.f1183P = obtainStyledAttributes.getInt(C0644j.TextAppearance_android_shadowColor, 0);
        this.f1181N = obtainStyledAttributes.getFloat(C0644j.TextAppearance_android_shadowDx, 0.0f);
        this.f1182O = obtainStyledAttributes.getFloat(C0644j.TextAppearance_android_shadowDy, 0.0f);
        this.f1180M = obtainStyledAttributes.getFloat(C0644j.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        if (VERSION.SDK_INT >= 16) {
            this.f1194g = m590e(i);
        }
        m602b();
    }

    final void m607d(int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.f1198m.getContext(), i, C0644j.TextAppearance);
        if (obtainStyledAttributes.hasValue(C0644j.TextAppearance_android_textColor)) {
            this.f1203r = obtainStyledAttributes.getColorStateList(C0644j.TextAppearance_android_textColor);
        }
        if (obtainStyledAttributes.hasValue(C0644j.TextAppearance_android_textSize)) {
            this.f1191d = (float) obtainStyledAttributes.getDimensionPixelSize(C0644j.TextAppearance_android_textSize, (int) this.f1191d);
        }
        this.f1187T = obtainStyledAttributes.getInt(C0644j.TextAppearance_android_shadowColor, 0);
        this.f1185R = obtainStyledAttributes.getFloat(C0644j.TextAppearance_android_shadowDx, 0.0f);
        this.f1186S = obtainStyledAttributes.getFloat(C0644j.TextAppearance_android_shadowDy, 0.0f);
        this.f1184Q = obtainStyledAttributes.getFloat(C0644j.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        if (VERSION.SDK_INT >= 16) {
            this.f1195h = m590e(i);
        }
        m602b();
    }
}
