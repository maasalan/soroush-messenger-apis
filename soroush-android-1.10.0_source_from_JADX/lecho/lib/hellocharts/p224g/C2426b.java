package lecho.lib.hellocharts.p224g;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextUtils;
import java.lang.reflect.Array;
import lecho.lib.hellocharts.model.C2432b;
import lecho.lib.hellocharts.model.C2433c;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.p219b.C2410a;
import lecho.lib.hellocharts.p225h.C2428a;
import lecho.lib.hellocharts.p225h.C2429b;
import lecho.lib.hellocharts.p225h.C2430c;
import lecho.lib.hellocharts.view.C2440b;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C2426b {
    private static final char[] f8010c = new char[]{'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'};
    private C2428a[] f8011A = new C2428a[]{new C2428a(), new C2428a(), new C2428a(), new C2428a()};
    public C2440b f8012a;
    public C2410a f8013b;
    private int f8014d;
    private float f8015e;
    private float f8016f;
    private Paint[] f8017g;
    private Paint[] f8018h = new Paint[]{new Paint(), new Paint(), new Paint(), new Paint()};
    private Paint[] f8019i = new Paint[]{new Paint(), new Paint(), new Paint(), new Paint()};
    private float[] f8020j = new float[4];
    private float[] f8021k = new float[4];
    private float[] f8022l = new float[4];
    private int[] f8023m = new int[4];
    private int[] f8024n = new int[4];
    private int[] f8025o = new int[4];
    private int[] f8026p = new int[4];
    private int[] f8027q = new int[4];
    private int[] f8028r = new int[4];
    private int[] f8029s = new int[4];
    private FontMetricsInt[] f8030t = new FontMetricsInt[]{new FontMetricsInt(), new FontMetricsInt(), new FontMetricsInt(), new FontMetricsInt()};
    private char[] f8031u = new char[64];
    private int[] f8032v = new int[4];
    private float[][] f8033w = ((float[][]) Array.newInstance(float.class, new int[]{4, 0}));
    private float[][] f8034x = ((float[][]) Array.newInstance(float.class, new int[]{4, 0}));
    private C2433c[][] f8035y = ((C2433c[][]) Array.newInstance(C2433c.class, new int[]{4, 0}));
    private float[][] f8036z = ((float[][]) Array.newInstance(float.class, new int[]{4, 0}));

    public C2426b(Context context, C2440b c2440b) {
        r1 = new Paint[4];
        int i = 0;
        r1[0] = new Paint();
        r1[1] = new Paint();
        r1[2] = new Paint();
        r1[3] = new Paint();
        this.f8017g = r1;
        this.f8012a = c2440b;
        this.f8013b = c2440b.getChartComputator();
        this.f8015e = context.getResources().getDisplayMetrics().density;
        this.f8016f = context.getResources().getDisplayMetrics().scaledDensity;
        this.f8014d = C2429b.m6640a(this.f8015e, 2);
        while (i < 4) {
            this.f8017g[i].setStyle(Style.FILL);
            this.f8017g[i].setAntiAlias(true);
            this.f8018h[i].setStyle(Style.FILL);
            this.f8018h[i].setAntiAlias(true);
            this.f8019i[i].setStyle(Style.STROKE);
            this.f8019i[i].setAntiAlias(true);
            i++;
        }
    }

    private static boolean m6618a(int i) {
        if (1 == i || 2 == i) {
            return true;
        }
        if (i != 0) {
            if (3 != i) {
                StringBuilder stringBuilder = new StringBuilder("Invalid axis position ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return false;
    }

    private boolean m6619a(Rect rect, float f, boolean z, int i, boolean z2) {
        if (!z) {
            return true;
        }
        if (z2) {
            return f <= ((float) rect.bottom) - ((float) (this.f8024n[3] + this.f8014d)) && f >= ((float) rect.top) + ((float) (this.f8024n[0] + this.f8014d));
        } else {
            float f2 = (float) (this.f8023m[i] / 2);
            return f >= ((float) rect.left) + f2 && f <= ((float) rect.right) - f2;
        }
    }

    private void m6620b(C2432b c2432b, int i) {
        if (c2432b != null) {
            Paint paint;
            Align align;
            int sqrt;
            int sqrt2;
            StringBuilder stringBuilder;
            Typeface typeface = c2432b.f8063j;
            if (typeface != null) {
                this.f8017g[i].setTypeface(typeface);
                this.f8018h[i].setTypeface(typeface);
            }
            this.f8017g[i].setColor(c2432b.f8061h);
            this.f8017g[i].setTextSize((float) C2429b.m6642b(this.f8016f, c2432b.f8054a));
            this.f8017g[i].getFontMetricsInt(this.f8030t[i]);
            this.f8018h[i].setColor(c2432b.f8061h);
            this.f8018h[i].setTextSize((float) C2429b.m6642b(this.f8016f, c2432b.f8054a));
            this.f8019i[i].setColor(c2432b.f8062i);
            this.f8024n[i] = Math.abs(this.f8030t[i].ascent);
            this.f8025o[i] = Math.abs(this.f8030t[i].descent);
            this.f8023m[i] = (int) this.f8017g[i].measureText(f8010c, 0, c2432b.f8055b);
            this.f8018h[i].setTextAlign(Align.CENTER);
            if (i != 0) {
                if (3 != i) {
                    if (1 == i) {
                        if (!c2432b.f8060g) {
                            paint = this.f8017g[i];
                        }
                        paint = this.f8017g[i];
                        align = Align.LEFT;
                        paint.setTextAlign(align);
                        if (c2432b.f8066m) {
                            if (1 != i) {
                                if (2 != i) {
                                    if (i == 0 || 3 == i) {
                                        this.f8026p[i] = this.f8024n[i] + this.f8025o[i];
                                        this.f8027q[i] = this.f8023m[i];
                                    }
                                }
                            }
                            this.f8026p[i] = this.f8023m[i];
                            this.f8027q[i] = this.f8024n[i];
                        } else {
                            this.f8026p[i] = ((int) Math.sqrt(Math.pow((double) this.f8024n[i], 2.0d) / 2.0d)) + ((int) Math.sqrt(Math.pow((double) this.f8023m[i], 2.0d) / 2.0d));
                            this.f8027q[i] = Math.round(((float) this.f8026p[i]) * 0.75f);
                            sqrt = (int) Math.sqrt(Math.pow((double) this.f8023m[i], 2.0d) / 2.0d);
                            sqrt2 = (int) Math.sqrt(Math.pow((double) this.f8024n[i], 2.0d) / 2.0d);
                            if (!c2432b.f8060g) {
                                if (1 != i) {
                                    if (2 != i) {
                                        if (i != 0) {
                                            if (3 == i) {
                                                sqrt2 += sqrt / 2;
                                                sqrt = this.f8024n[i];
                                            }
                                            sqrt = 0;
                                            sqrt2 = sqrt;
                                            this.f8028r[i] = sqrt2;
                                            this.f8029s[i] = sqrt;
                                        }
                                    }
                                    sqrt = 0;
                                    this.f8028r[i] = sqrt2;
                                    this.f8029s[i] = sqrt;
                                }
                                sqrt = (-sqrt) / 2;
                                sqrt2 = 0;
                                this.f8028r[i] = sqrt2;
                                this.f8029s[i] = sqrt;
                            } else if (1 != i) {
                                sqrt = 0;
                                this.f8028r[i] = sqrt2;
                                this.f8029s[i] = sqrt;
                            } else {
                                if (2 != i) {
                                    if (i != 0) {
                                        sqrt2 += sqrt / 2;
                                        sqrt = this.f8024n[i];
                                    } else {
                                        if (3 == i) {
                                        }
                                        sqrt = 0;
                                        sqrt2 = sqrt;
                                        this.f8028r[i] = sqrt2;
                                        this.f8029s[i] = sqrt;
                                    }
                                }
                                sqrt = (-sqrt) / 2;
                                sqrt2 = 0;
                                this.f8028r[i] = sqrt2;
                                this.f8029s[i] = sqrt;
                            }
                            sqrt = sqrt2 - sqrt;
                            sqrt2 = 0;
                            this.f8028r[i] = sqrt2;
                            this.f8029s[i] = sqrt;
                        }
                        sqrt = (c2432b.f8060g || (!c2432b.f8058e && c2432b.f8056c.isEmpty())) ? 0 : (this.f8014d + this.f8026p[i]) + 0;
                        sqrt += TextUtils.isEmpty(c2432b.f8057d) ? ((this.f8024n[i] + 0) + this.f8025o[i]) + this.f8014d : 0;
                        if (1 != i) {
                            this.f8012a.getChartComputator().m6581a(sqrt, 0, 0, 0);
                        } else if (2 != i) {
                            this.f8012a.getChartComputator().m6581a(0, 0, sqrt, 0);
                        } else if (i != 0) {
                            this.f8012a.getChartComputator().m6581a(0, sqrt, 0, 0);
                        } else if (3 == i) {
                            this.f8012a.getChartComputator().m6581a(0, 0, 0, sqrt);
                        }
                        if (1 != i) {
                            if (c2432b.f8060g) {
                                this.f8021k[i] = (float) (this.f8013b.m6592c().left - this.f8014d);
                                this.f8020j[i] = ((this.f8021k[i] - ((float) this.f8014d)) - ((float) this.f8025o[i])) - ((float) this.f8026p[i]);
                            } else {
                                this.f8021k[i] = (float) (this.f8013b.m6589b().left + this.f8014d);
                                this.f8020j[i] = (float) ((this.f8013b.m6592c().left - this.f8014d) - this.f8025o[i]);
                            }
                            this.f8022l[i] = (float) this.f8013b.m6589b().left;
                        } else if (2 != i) {
                            if (c2432b.f8060g) {
                                this.f8021k[i] = (float) (this.f8013b.m6592c().right + this.f8014d);
                                this.f8020j[i] = ((this.f8021k[i] + ((float) this.f8014d)) + ((float) this.f8024n[i])) + ((float) this.f8026p[i]);
                            } else {
                                this.f8021k[i] = (float) (this.f8013b.m6589b().right - this.f8014d);
                                this.f8020j[i] = (float) ((this.f8013b.m6592c().right + this.f8014d) + this.f8024n[i]);
                            }
                            this.f8022l[i] = (float) this.f8013b.m6589b().right;
                        } else if (3 != i) {
                            if (c2432b.f8060g) {
                                this.f8021k[i] = (float) ((this.f8013b.m6592c().bottom + this.f8014d) + this.f8024n[i]);
                                this.f8020j[i] = (this.f8021k[i] + ((float) this.f8014d)) + ((float) this.f8026p[i]);
                            } else {
                                this.f8021k[i] = (float) ((this.f8013b.m6589b().bottom - this.f8014d) - this.f8025o[i]);
                                this.f8020j[i] = (float) ((this.f8013b.m6592c().bottom + this.f8014d) + this.f8024n[i]);
                            }
                            this.f8022l[i] = (float) this.f8013b.m6589b().bottom;
                        } else if (i != 0) {
                            if (c2432b.f8060g) {
                                this.f8021k[i] = (float) ((this.f8013b.m6592c().top - this.f8014d) - this.f8025o[i]);
                                this.f8020j[i] = (this.f8021k[i] - ((float) this.f8014d)) - ((float) this.f8026p[i]);
                            } else {
                                this.f8021k[i] = (float) ((this.f8013b.m6589b().top + this.f8014d) + this.f8024n[i]);
                                this.f8020j[i] = (float) ((this.f8013b.m6592c().top - this.f8014d) - this.f8025o[i]);
                            }
                            this.f8022l[i] = (float) this.f8013b.m6589b().top;
                        } else {
                            stringBuilder = new StringBuilder("Invalid axis position: ");
                            stringBuilder.append(i);
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    if (2 == i) {
                        if (c2432b.f8060g) {
                            paint = this.f8017g[i];
                        }
                        paint = this.f8017g[i];
                        align = Align.LEFT;
                        paint.setTextAlign(align);
                    }
                    if (c2432b.f8066m) {
                        if (1 != i) {
                            if (2 != i) {
                                this.f8026p[i] = this.f8024n[i] + this.f8025o[i];
                                this.f8027q[i] = this.f8023m[i];
                            }
                        }
                        this.f8026p[i] = this.f8023m[i];
                        this.f8027q[i] = this.f8024n[i];
                    } else {
                        this.f8026p[i] = ((int) Math.sqrt(Math.pow((double) this.f8024n[i], 2.0d) / 2.0d)) + ((int) Math.sqrt(Math.pow((double) this.f8023m[i], 2.0d) / 2.0d));
                        this.f8027q[i] = Math.round(((float) this.f8026p[i]) * 0.75f);
                        sqrt = (int) Math.sqrt(Math.pow((double) this.f8023m[i], 2.0d) / 2.0d);
                        sqrt2 = (int) Math.sqrt(Math.pow((double) this.f8024n[i], 2.0d) / 2.0d);
                        if (!c2432b.f8060g) {
                            if (1 != i) {
                                if (2 != i) {
                                    if (i != 0) {
                                        if (3 == i) {
                                            sqrt2 += sqrt / 2;
                                            sqrt = this.f8024n[i];
                                        }
                                        sqrt = 0;
                                        sqrt2 = sqrt;
                                        this.f8028r[i] = sqrt2;
                                        this.f8029s[i] = sqrt;
                                    }
                                }
                                sqrt = 0;
                                this.f8028r[i] = sqrt2;
                                this.f8029s[i] = sqrt;
                            }
                            sqrt = (-sqrt) / 2;
                            sqrt2 = 0;
                            this.f8028r[i] = sqrt2;
                            this.f8029s[i] = sqrt;
                        } else if (1 != i) {
                            if (2 != i) {
                                if (i != 0) {
                                    if (3 == i) {
                                    }
                                    sqrt = 0;
                                    sqrt2 = sqrt;
                                    this.f8028r[i] = sqrt2;
                                    this.f8029s[i] = sqrt;
                                } else {
                                    sqrt2 += sqrt / 2;
                                    sqrt = this.f8024n[i];
                                }
                            }
                            sqrt = (-sqrt) / 2;
                            sqrt2 = 0;
                            this.f8028r[i] = sqrt2;
                            this.f8029s[i] = sqrt;
                        } else {
                            sqrt = 0;
                            this.f8028r[i] = sqrt2;
                            this.f8029s[i] = sqrt;
                        }
                        sqrt = sqrt2 - sqrt;
                        sqrt2 = 0;
                        this.f8028r[i] = sqrt2;
                        this.f8029s[i] = sqrt;
                    }
                    if (!c2432b.f8060g) {
                    }
                    if (TextUtils.isEmpty(c2432b.f8057d)) {
                    }
                    sqrt += TextUtils.isEmpty(c2432b.f8057d) ? ((this.f8024n[i] + 0) + this.f8025o[i]) + this.f8014d : 0;
                    if (1 != i) {
                        this.f8012a.getChartComputator().m6581a(sqrt, 0, 0, 0);
                    } else if (2 != i) {
                        this.f8012a.getChartComputator().m6581a(0, 0, sqrt, 0);
                    } else if (i != 0) {
                        this.f8012a.getChartComputator().m6581a(0, sqrt, 0, 0);
                    } else if (3 == i) {
                        this.f8012a.getChartComputator().m6581a(0, 0, 0, sqrt);
                    }
                    if (1 != i) {
                        if (c2432b.f8060g) {
                            this.f8021k[i] = (float) (this.f8013b.m6592c().left - this.f8014d);
                            this.f8020j[i] = ((this.f8021k[i] - ((float) this.f8014d)) - ((float) this.f8025o[i])) - ((float) this.f8026p[i]);
                        } else {
                            this.f8021k[i] = (float) (this.f8013b.m6589b().left + this.f8014d);
                            this.f8020j[i] = (float) ((this.f8013b.m6592c().left - this.f8014d) - this.f8025o[i]);
                        }
                        this.f8022l[i] = (float) this.f8013b.m6589b().left;
                    } else if (2 != i) {
                        if (c2432b.f8060g) {
                            this.f8021k[i] = (float) (this.f8013b.m6592c().right + this.f8014d);
                            this.f8020j[i] = ((this.f8021k[i] + ((float) this.f8014d)) + ((float) this.f8024n[i])) + ((float) this.f8026p[i]);
                        } else {
                            this.f8021k[i] = (float) (this.f8013b.m6589b().right - this.f8014d);
                            this.f8020j[i] = (float) ((this.f8013b.m6592c().right + this.f8014d) + this.f8024n[i]);
                        }
                        this.f8022l[i] = (float) this.f8013b.m6589b().right;
                    } else if (3 != i) {
                        if (c2432b.f8060g) {
                            this.f8021k[i] = (float) ((this.f8013b.m6592c().bottom + this.f8014d) + this.f8024n[i]);
                            this.f8020j[i] = (this.f8021k[i] + ((float) this.f8014d)) + ((float) this.f8026p[i]);
                        } else {
                            this.f8021k[i] = (float) ((this.f8013b.m6589b().bottom - this.f8014d) - this.f8025o[i]);
                            this.f8020j[i] = (float) ((this.f8013b.m6592c().bottom + this.f8014d) + this.f8024n[i]);
                        }
                        this.f8022l[i] = (float) this.f8013b.m6589b().bottom;
                    } else if (i != 0) {
                        stringBuilder = new StringBuilder("Invalid axis position: ");
                        stringBuilder.append(i);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    } else {
                        if (c2432b.f8060g) {
                            this.f8021k[i] = (float) ((this.f8013b.m6592c().top - this.f8014d) - this.f8025o[i]);
                            this.f8020j[i] = (this.f8021k[i] - ((float) this.f8014d)) - ((float) this.f8026p[i]);
                        } else {
                            this.f8021k[i] = (float) ((this.f8013b.m6589b().top + this.f8014d) + this.f8024n[i]);
                            this.f8020j[i] = (float) ((this.f8013b.m6592c().top - this.f8014d) - this.f8025o[i]);
                        }
                        this.f8022l[i] = (float) this.f8013b.m6589b().top;
                    }
                    align = Align.RIGHT;
                    paint.setTextAlign(align);
                    if (c2432b.f8066m) {
                        this.f8026p[i] = ((int) Math.sqrt(Math.pow((double) this.f8024n[i], 2.0d) / 2.0d)) + ((int) Math.sqrt(Math.pow((double) this.f8023m[i], 2.0d) / 2.0d));
                        this.f8027q[i] = Math.round(((float) this.f8026p[i]) * 0.75f);
                        sqrt = (int) Math.sqrt(Math.pow((double) this.f8023m[i], 2.0d) / 2.0d);
                        sqrt2 = (int) Math.sqrt(Math.pow((double) this.f8024n[i], 2.0d) / 2.0d);
                        if (!c2432b.f8060g) {
                            if (1 != i) {
                                if (2 != i) {
                                    if (i != 0) {
                                        if (3 == i) {
                                            sqrt2 += sqrt / 2;
                                            sqrt = this.f8024n[i];
                                        }
                                        sqrt = 0;
                                        sqrt2 = sqrt;
                                        this.f8028r[i] = sqrt2;
                                        this.f8029s[i] = sqrt;
                                    }
                                }
                                sqrt = 0;
                                this.f8028r[i] = sqrt2;
                                this.f8029s[i] = sqrt;
                            }
                            sqrt = (-sqrt) / 2;
                            sqrt2 = 0;
                            this.f8028r[i] = sqrt2;
                            this.f8029s[i] = sqrt;
                        } else if (1 != i) {
                            sqrt = 0;
                            this.f8028r[i] = sqrt2;
                            this.f8029s[i] = sqrt;
                        } else {
                            if (2 != i) {
                                if (i != 0) {
                                    sqrt2 += sqrt / 2;
                                    sqrt = this.f8024n[i];
                                } else {
                                    if (3 == i) {
                                    }
                                    sqrt = 0;
                                    sqrt2 = sqrt;
                                    this.f8028r[i] = sqrt2;
                                    this.f8029s[i] = sqrt;
                                }
                            }
                            sqrt = (-sqrt) / 2;
                            sqrt2 = 0;
                            this.f8028r[i] = sqrt2;
                            this.f8029s[i] = sqrt;
                        }
                        sqrt = sqrt2 - sqrt;
                        sqrt2 = 0;
                        this.f8028r[i] = sqrt2;
                        this.f8029s[i] = sqrt;
                    } else {
                        if (1 != i) {
                            if (2 != i) {
                                this.f8026p[i] = this.f8024n[i] + this.f8025o[i];
                                this.f8027q[i] = this.f8023m[i];
                            }
                        }
                        this.f8026p[i] = this.f8023m[i];
                        this.f8027q[i] = this.f8024n[i];
                    }
                    if (c2432b.f8060g) {
                    }
                    if (TextUtils.isEmpty(c2432b.f8057d)) {
                    }
                    sqrt += TextUtils.isEmpty(c2432b.f8057d) ? ((this.f8024n[i] + 0) + this.f8025o[i]) + this.f8014d : 0;
                    if (1 != i) {
                        this.f8012a.getChartComputator().m6581a(sqrt, 0, 0, 0);
                    } else if (2 != i) {
                        this.f8012a.getChartComputator().m6581a(0, 0, sqrt, 0);
                    } else if (i != 0) {
                        this.f8012a.getChartComputator().m6581a(0, sqrt, 0, 0);
                    } else if (3 == i) {
                        this.f8012a.getChartComputator().m6581a(0, 0, 0, sqrt);
                    }
                    if (1 != i) {
                        if (c2432b.f8060g) {
                            this.f8021k[i] = (float) (this.f8013b.m6589b().left + this.f8014d);
                            this.f8020j[i] = (float) ((this.f8013b.m6592c().left - this.f8014d) - this.f8025o[i]);
                        } else {
                            this.f8021k[i] = (float) (this.f8013b.m6592c().left - this.f8014d);
                            this.f8020j[i] = ((this.f8021k[i] - ((float) this.f8014d)) - ((float) this.f8025o[i])) - ((float) this.f8026p[i]);
                        }
                        this.f8022l[i] = (float) this.f8013b.m6589b().left;
                    } else if (2 != i) {
                        if (c2432b.f8060g) {
                            this.f8021k[i] = (float) (this.f8013b.m6589b().right - this.f8014d);
                            this.f8020j[i] = (float) ((this.f8013b.m6592c().right + this.f8014d) + this.f8024n[i]);
                        } else {
                            this.f8021k[i] = (float) (this.f8013b.m6592c().right + this.f8014d);
                            this.f8020j[i] = ((this.f8021k[i] + ((float) this.f8014d)) + ((float) this.f8024n[i])) + ((float) this.f8026p[i]);
                        }
                        this.f8022l[i] = (float) this.f8013b.m6589b().right;
                    } else if (3 != i) {
                        if (c2432b.f8060g) {
                            this.f8021k[i] = (float) ((this.f8013b.m6589b().bottom - this.f8014d) - this.f8025o[i]);
                            this.f8020j[i] = (float) ((this.f8013b.m6592c().bottom + this.f8014d) + this.f8024n[i]);
                        } else {
                            this.f8021k[i] = (float) ((this.f8013b.m6592c().bottom + this.f8014d) + this.f8024n[i]);
                            this.f8020j[i] = (this.f8021k[i] + ((float) this.f8014d)) + ((float) this.f8026p[i]);
                        }
                        this.f8022l[i] = (float) this.f8013b.m6589b().bottom;
                    } else if (i != 0) {
                        if (c2432b.f8060g) {
                            this.f8021k[i] = (float) ((this.f8013b.m6589b().top + this.f8014d) + this.f8024n[i]);
                            this.f8020j[i] = (float) ((this.f8013b.m6592c().top - this.f8014d) - this.f8025o[i]);
                        } else {
                            this.f8021k[i] = (float) ((this.f8013b.m6592c().top - this.f8014d) - this.f8025o[i]);
                            this.f8020j[i] = (this.f8021k[i] - ((float) this.f8014d)) - ((float) this.f8026p[i]);
                        }
                        this.f8022l[i] = (float) this.f8013b.m6589b().top;
                    } else {
                        stringBuilder = new StringBuilder("Invalid axis position: ");
                        stringBuilder.append(i);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
            }
            paint = this.f8017g[i];
            align = Align.CENTER;
            paint.setTextAlign(align);
            if (c2432b.f8066m) {
                if (1 != i) {
                    if (2 != i) {
                        this.f8026p[i] = this.f8024n[i] + this.f8025o[i];
                        this.f8027q[i] = this.f8023m[i];
                    }
                }
                this.f8026p[i] = this.f8023m[i];
                this.f8027q[i] = this.f8024n[i];
            } else {
                this.f8026p[i] = ((int) Math.sqrt(Math.pow((double) this.f8024n[i], 2.0d) / 2.0d)) + ((int) Math.sqrt(Math.pow((double) this.f8023m[i], 2.0d) / 2.0d));
                this.f8027q[i] = Math.round(((float) this.f8026p[i]) * 0.75f);
                sqrt = (int) Math.sqrt(Math.pow((double) this.f8023m[i], 2.0d) / 2.0d);
                sqrt2 = (int) Math.sqrt(Math.pow((double) this.f8024n[i], 2.0d) / 2.0d);
                if (!c2432b.f8060g) {
                    if (1 != i) {
                        if (2 != i) {
                            if (i != 0) {
                                if (3 == i) {
                                    sqrt2 += sqrt / 2;
                                    sqrt = this.f8024n[i];
                                }
                                sqrt = 0;
                                sqrt2 = sqrt;
                                this.f8028r[i] = sqrt2;
                                this.f8029s[i] = sqrt;
                            }
                        }
                        sqrt = 0;
                        this.f8028r[i] = sqrt2;
                        this.f8029s[i] = sqrt;
                    }
                    sqrt = (-sqrt) / 2;
                    sqrt2 = 0;
                    this.f8028r[i] = sqrt2;
                    this.f8029s[i] = sqrt;
                } else if (1 != i) {
                    if (2 != i) {
                        if (i != 0) {
                            if (3 == i) {
                            }
                            sqrt = 0;
                            sqrt2 = sqrt;
                            this.f8028r[i] = sqrt2;
                            this.f8029s[i] = sqrt;
                        } else {
                            sqrt2 += sqrt / 2;
                            sqrt = this.f8024n[i];
                        }
                    }
                    sqrt = (-sqrt) / 2;
                    sqrt2 = 0;
                    this.f8028r[i] = sqrt2;
                    this.f8029s[i] = sqrt;
                } else {
                    sqrt = 0;
                    this.f8028r[i] = sqrt2;
                    this.f8029s[i] = sqrt;
                }
                sqrt = sqrt2 - sqrt;
                sqrt2 = 0;
                this.f8028r[i] = sqrt2;
                this.f8029s[i] = sqrt;
            }
            if (c2432b.f8060g) {
            }
            if (TextUtils.isEmpty(c2432b.f8057d)) {
            }
            sqrt += TextUtils.isEmpty(c2432b.f8057d) ? ((this.f8024n[i] + 0) + this.f8025o[i]) + this.f8014d : 0;
            if (1 != i) {
                this.f8012a.getChartComputator().m6581a(sqrt, 0, 0, 0);
            } else if (2 != i) {
                this.f8012a.getChartComputator().m6581a(0, 0, sqrt, 0);
            } else if (i != 0) {
                this.f8012a.getChartComputator().m6581a(0, sqrt, 0, 0);
            } else if (3 == i) {
                this.f8012a.getChartComputator().m6581a(0, 0, 0, sqrt);
            }
            if (1 != i) {
                if (c2432b.f8060g) {
                    this.f8021k[i] = (float) (this.f8013b.m6592c().left - this.f8014d);
                    this.f8020j[i] = ((this.f8021k[i] - ((float) this.f8014d)) - ((float) this.f8025o[i])) - ((float) this.f8026p[i]);
                } else {
                    this.f8021k[i] = (float) (this.f8013b.m6589b().left + this.f8014d);
                    this.f8020j[i] = (float) ((this.f8013b.m6592c().left - this.f8014d) - this.f8025o[i]);
                }
                this.f8022l[i] = (float) this.f8013b.m6589b().left;
            } else if (2 != i) {
                if (c2432b.f8060g) {
                    this.f8021k[i] = (float) (this.f8013b.m6592c().right + this.f8014d);
                    this.f8020j[i] = ((this.f8021k[i] + ((float) this.f8014d)) + ((float) this.f8024n[i])) + ((float) this.f8026p[i]);
                } else {
                    this.f8021k[i] = (float) (this.f8013b.m6589b().right - this.f8014d);
                    this.f8020j[i] = (float) ((this.f8013b.m6592c().right + this.f8014d) + this.f8024n[i]);
                }
                this.f8022l[i] = (float) this.f8013b.m6589b().right;
            } else if (3 != i) {
                if (c2432b.f8060g) {
                    this.f8021k[i] = (float) ((this.f8013b.m6592c().bottom + this.f8014d) + this.f8024n[i]);
                    this.f8020j[i] = (this.f8021k[i] + ((float) this.f8014d)) + ((float) this.f8026p[i]);
                } else {
                    this.f8021k[i] = (float) ((this.f8013b.m6589b().bottom - this.f8014d) - this.f8025o[i]);
                    this.f8020j[i] = (float) ((this.f8013b.m6592c().bottom + this.f8014d) + this.f8024n[i]);
                }
                this.f8022l[i] = (float) this.f8013b.m6589b().bottom;
            } else if (i != 0) {
                stringBuilder = new StringBuilder("Invalid axis position: ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else {
                if (c2432b.f8060g) {
                    this.f8021k[i] = (float) ((this.f8013b.m6592c().top - this.f8014d) - this.f8025o[i]);
                    this.f8020j[i] = (this.f8021k[i] - ((float) this.f8014d)) - ((float) this.f8026p[i]);
                } else {
                    this.f8021k[i] = (float) ((this.f8013b.m6589b().top + this.f8014d) + this.f8024n[i]);
                    this.f8020j[i] = (float) ((this.f8013b.m6592c().top - this.f8014d) - this.f8025o[i]);
                }
                this.f8022l[i] = (float) this.f8013b.m6589b().top;
            }
        }
    }

    public final void m6621a() {
        m6620b(this.f8012a.getChartData().mo2109c(), 0);
        m6620b(this.f8012a.getChartData().mo2107a(), 3);
        m6620b(this.f8012a.getChartData().mo2108b(), 1);
        m6620b(this.f8012a.getChartData().mo2110d(), 2);
    }

    public final void m6622a(Canvas canvas, C2432b c2432b, int i) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        int i2;
        int i3;
        C2432b c2432b2 = c2432b;
        int i4 = i;
        Rect c = this.f8013b.m6592c();
        boolean a = C2426b.m6618a(i);
        float f9 = 0.0f;
        if (1 != i4) {
            if (2 != i4) {
                if (i4 != 0) {
                    if (3 != i4) {
                        f = 0.0f;
                        f2 = f;
                        f3 = f2;
                        f4 = f3;
                        f5 = f4;
                        f6 = f5;
                        f7 = f6;
                        if (c2432b2.f8065l) {
                            canvas.drawLine(f4, f5, f6, f7, r0.f8017g[i4]);
                        }
                        if (!c2432b2.f8059f) {
                            f8 = f9;
                            f9 = f;
                            i2 = 0;
                            while (i2 < r0.f8032v[i4]) {
                                if (a) {
                                    f8 = r0.f8033w[i4][i2];
                                    f3 = f8;
                                } else {
                                    f9 = r0.f8033w[i4][i2];
                                    f2 = f9;
                                }
                                i3 = i2 * 4;
                                r0.f8036z[i4][i3 + 0] = f2;
                                r0.f8036z[i4][i3 + 1] = f3;
                                r0.f8036z[i4][i3 + 2] = f9;
                                r0.f8036z[i4][i3 + 3] = f8;
                                i2++;
                            }
                            canvas.drawLines(r0.f8036z[i4], 0, i2 * 4, r0.f8019i[i4]);
                        }
                    }
                }
                f2 = (float) c.left;
                f8 = (float) c.right;
                f3 = (float) c.top;
                f4 = f2;
                f6 = f8;
                f5 = r0.f8022l[i4];
                f7 = f5;
                f2 = 0.0f;
                f9 = (float) c.bottom;
                f = f2;
                if (c2432b2.f8065l) {
                    canvas.drawLine(f4, f5, f6, f7, r0.f8017g[i4]);
                }
                if (!c2432b2.f8059f) {
                    f8 = f9;
                    f9 = f;
                    i2 = 0;
                    while (i2 < r0.f8032v[i4]) {
                        if (a) {
                            f9 = r0.f8033w[i4][i2];
                            f2 = f9;
                        } else {
                            f8 = r0.f8033w[i4][i2];
                            f3 = f8;
                        }
                        i3 = i2 * 4;
                        r0.f8036z[i4][i3 + 0] = f2;
                        r0.f8036z[i4][i3 + 1] = f3;
                        r0.f8036z[i4][i3 + 2] = f9;
                        r0.f8036z[i4][i3 + 3] = f8;
                        i2++;
                    }
                    canvas.drawLines(r0.f8036z[i4], 0, i2 * 4, r0.f8019i[i4]);
                }
            }
        }
        f8 = (float) c.bottom;
        float f10 = (float) c.top;
        f3 = (float) c.left;
        f = (float) c.right;
        f4 = r0.f8022l[i4];
        f6 = f4;
        f5 = f8;
        f7 = f10;
        f2 = f3;
        f3 = 0.0f;
        if (c2432b2.f8065l) {
            canvas.drawLine(f4, f5, f6, f7, r0.f8017g[i4]);
        }
        if (!c2432b2.f8059f) {
            f8 = f9;
            f9 = f;
            i2 = 0;
            while (i2 < r0.f8032v[i4]) {
                if (a) {
                    f8 = r0.f8033w[i4][i2];
                    f3 = f8;
                } else {
                    f9 = r0.f8033w[i4][i2];
                    f2 = f9;
                }
                i3 = i2 * 4;
                r0.f8036z[i4][i3 + 0] = f2;
                r0.f8036z[i4][i3 + 1] = f3;
                r0.f8036z[i4][i3 + 2] = f9;
                r0.f8036z[i4][i3 + 3] = f8;
                i2++;
            }
            canvas.drawLines(r0.f8036z[i4], 0, i2 * 4, r0.f8019i[i4]);
        }
    }

    public final void m6623a(C2432b c2432b, int i) {
        C2426b c2426b = this;
        C2432b c2432b2 = c2432b;
        Viewport f;
        Rect b;
        boolean a;
        float f2;
        float f3;
        if (c2432b2.f8058e) {
            int height;
            f = c2426b.f8013b.m6596f();
            b = c2426b.f8013b.m6589b();
            a = C2426b.m6618a(i);
            if (a) {
                f2 = f.f8053d;
                f3 = f.f8051b;
                height = b.height();
            } else {
                f2 = f.f8050a;
                f3 = f.f8052c;
                height = b.width();
            }
            C2430c.m6644a(f2, f3, (height / c2426b.f8027q[i]) / 2, c2426b.f8011A[i]);
            if (c2432b2.f8059f && c2426b.f8036z[i].length < c2426b.f8011A[i].f8038b * 4) {
                c2426b.f8036z[i] = new float[(c2426b.f8011A[i].f8038b * 4)];
            }
            if (c2426b.f8033w[i].length < c2426b.f8011A[i].f8038b) {
                c2426b.f8033w[i] = new float[c2426b.f8011A[i].f8038b];
            }
            if (c2426b.f8034x[i].length < c2426b.f8011A[i].f8038b) {
                c2426b.f8034x[i] = new float[c2426b.f8011A[i].f8038b];
            }
            int i2 = 0;
            int i3 = i2;
            while (i2 < c2426b.f8011A[i].f8038b) {
                float b2 = a ? c2426b.f8013b.m6588b(c2426b.f8011A[i].f8037a[i2]) : c2426b.f8013b.m6577a(c2426b.f8011A[i].f8037a[i2]);
                if (m6619a(b, b2, c2432b2.f8060g, i, a)) {
                    c2426b.f8033w[i][i3] = b2;
                    c2426b.f8034x[i][i3] = c2426b.f8011A[i].f8037a[i2];
                    i3++;
                }
                i2++;
            }
            c2426b.f8032v[i] = i3;
            return;
        }
        float f4;
        f = c2426b.f8013b.m6595e();
        Viewport f5 = c2426b.f8013b.m6596f();
        b = c2426b.f8013b.m6589b();
        a = C2426b.m6618a(i);
        if (a) {
            f3 = (f.m6648b() <= 0.0f || f5.m6648b() <= 0.0f) ? BallPulseIndicator.SCALE : (f.m6648b() / f5.m6648b()) * ((float) b.height());
            f4 = f5.f8053d;
            f2 = f5.f8051b;
        } else {
            f3 = (f.m6645a() <= 0.0f || f5.m6645a() <= 0.0f) ? BallPulseIndicator.SCALE : (f.m6645a() / f5.m6645a()) * ((float) b.width());
            f4 = f5.f8050a;
            f2 = f5.f8052c;
        }
        float f6 = f2;
        float f7 = f4;
        if (f3 == 0.0f) {
            f3 = BallPulseIndicator.SCALE;
        }
        int max = (int) Math.max(1.0d, Math.ceil((((double) (c2432b2.f8056c.size() * c2426b.f8027q[i])) * 1.5d) / ((double) f3)));
        if (c2432b2.f8059f && c2426b.f8036z[i].length < c2432b2.f8056c.size() * 4) {
            c2426b.f8036z[i] = new float[(c2432b2.f8056c.size() * 4)];
        }
        if (c2426b.f8033w[i].length < c2432b2.f8056c.size()) {
            c2426b.f8033w[i] = new float[c2432b2.f8056c.size()];
        }
        if (c2426b.f8035y[i].length < c2432b2.f8056c.size()) {
            c2426b.f8035y[i] = new C2433c[c2432b2.f8056c.size()];
        }
        int i4 = 0;
        int i5 = i4;
        for (C2433c c2433c : c2432b2.f8056c) {
            f3 = c2433c.f8067a;
            if (f3 >= f7 && f3 <= f6) {
                if (i5 % max == 0) {
                    float b3 = a ? c2426b.f8013b.m6588b(f3) : c2426b.f8013b.m6577a(f3);
                    C2433c c2433c2 = c2433c;
                    if (m6619a(b, b3, c2432b2.f8060g, i, a)) {
                        c2426b.f8033w[i][i4] = b3;
                        c2426b.f8035y[i][i4] = c2433c2;
                        i4++;
                    }
                }
                i5++;
            }
        }
        c2426b.f8032v[i] = i4;
    }

    public final void m6624b(Canvas canvas, C2432b c2432b, int i) {
        float f;
        int i2;
        int b;
        float f2;
        float f3;
        Rect c;
        C2426b c2426b = this;
        Canvas canvas2 = canvas;
        C2432b c2432b2 = c2432b;
        int i3 = i;
        boolean a = C2426b.m6618a(i);
        float f4 = 0.0f;
        if (1 != i3) {
            if (2 != i3) {
                if (i3 != 0) {
                    if (3 != i3) {
                        f = 0.0f;
                        i2 = 0;
                        while (i2 < c2426b.f8032v[i3]) {
                            b = c2432b2.f8058e ? c2432b2.f8064k.m6601b() : c2432b2.f8064k.m6600a();
                            if (a) {
                                f4 = c2426b.f8033w[i3][i2];
                            } else {
                                f = c2426b.f8033w[i3][i2];
                            }
                            f2 = f;
                            f3 = f4;
                            if (c2432b2.f8066m) {
                                canvas.save();
                                canvas2.translate((float) c2426b.f8028r[i3], (float) c2426b.f8029s[i3]);
                                canvas2.rotate(-45.0f, f2, f3);
                                canvas2.drawText(c2426b.f8031u, c2426b.f8031u.length - b, b, f2, f3, c2426b.f8017g[i3]);
                                canvas.restore();
                            } else {
                                canvas2.drawText(c2426b.f8031u, c2426b.f8031u.length - b, b, f2, f3, c2426b.f8017g[i3]);
                            }
                            i2++;
                            f = f2;
                            f4 = f3;
                        }
                        c = c2426b.f8013b.m6592c();
                        if (!TextUtils.isEmpty(c2432b2.f8057d)) {
                            if (a) {
                                canvas.save();
                                canvas2.rotate(-90.0f, (float) c.centerY(), (float) c.centerY());
                                canvas2.drawText(c2432b2.f8057d, (float) c.centerY(), c2426b.f8020j[i3], c2426b.f8018h[i3]);
                                canvas.restore();
                                return;
                            }
                            canvas2.drawText(c2432b2.f8057d, (float) c.centerX(), c2426b.f8020j[i3], c2426b.f8018h[i3]);
                        }
                    }
                }
                f4 = c2426b.f8021k[i3];
                f = 0.0f;
                i2 = 0;
                while (i2 < c2426b.f8032v[i3]) {
                    if (c2432b2.f8058e) {
                    }
                    b = c2432b2.f8058e ? c2432b2.f8064k.m6601b() : c2432b2.f8064k.m6600a();
                    if (a) {
                        f = c2426b.f8033w[i3][i2];
                    } else {
                        f4 = c2426b.f8033w[i3][i2];
                    }
                    f2 = f;
                    f3 = f4;
                    if (c2432b2.f8066m) {
                        canvas2.drawText(c2426b.f8031u, c2426b.f8031u.length - b, b, f2, f3, c2426b.f8017g[i3]);
                    } else {
                        canvas.save();
                        canvas2.translate((float) c2426b.f8028r[i3], (float) c2426b.f8029s[i3]);
                        canvas2.rotate(-45.0f, f2, f3);
                        canvas2.drawText(c2426b.f8031u, c2426b.f8031u.length - b, b, f2, f3, c2426b.f8017g[i3]);
                        canvas.restore();
                    }
                    i2++;
                    f = f2;
                    f4 = f3;
                }
                c = c2426b.f8013b.m6592c();
                if (TextUtils.isEmpty(c2432b2.f8057d)) {
                    if (a) {
                        canvas2.drawText(c2432b2.f8057d, (float) c.centerX(), c2426b.f8020j[i3], c2426b.f8018h[i3]);
                    } else {
                        canvas.save();
                        canvas2.rotate(-90.0f, (float) c.centerY(), (float) c.centerY());
                        canvas2.drawText(c2432b2.f8057d, (float) c.centerY(), c2426b.f8020j[i3], c2426b.f8018h[i3]);
                        canvas.restore();
                        return;
                    }
                }
            }
        }
        f = c2426b.f8021k[i3];
        i2 = 0;
        while (i2 < c2426b.f8032v[i3]) {
            if (c2432b2.f8058e) {
            }
            b = c2432b2.f8058e ? c2432b2.f8064k.m6601b() : c2432b2.f8064k.m6600a();
            if (a) {
                f4 = c2426b.f8033w[i3][i2];
            } else {
                f = c2426b.f8033w[i3][i2];
            }
            f2 = f;
            f3 = f4;
            if (c2432b2.f8066m) {
                canvas.save();
                canvas2.translate((float) c2426b.f8028r[i3], (float) c2426b.f8029s[i3]);
                canvas2.rotate(-45.0f, f2, f3);
                canvas2.drawText(c2426b.f8031u, c2426b.f8031u.length - b, b, f2, f3, c2426b.f8017g[i3]);
                canvas.restore();
            } else {
                canvas2.drawText(c2426b.f8031u, c2426b.f8031u.length - b, b, f2, f3, c2426b.f8017g[i3]);
            }
            i2++;
            f = f2;
            f4 = f3;
        }
        c = c2426b.f8013b.m6592c();
        if (TextUtils.isEmpty(c2432b2.f8057d)) {
            if (a) {
                canvas.save();
                canvas2.rotate(-90.0f, (float) c.centerY(), (float) c.centerY());
                canvas2.drawText(c2432b2.f8057d, (float) c.centerY(), c2426b.f8020j[i3], c2426b.f8018h[i3]);
                canvas.restore();
                return;
            }
            canvas2.drawText(c2432b2.f8057d, (float) c.centerX(), c2426b.f8020j[i3], c2426b.f8018h[i3]);
        }
    }
}
