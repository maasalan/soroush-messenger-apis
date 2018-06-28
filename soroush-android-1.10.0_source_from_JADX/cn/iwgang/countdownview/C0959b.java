package cn.iwgang.countdownview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import cn.iwgang.countdownview.C0963d.C0962a;

public class C0959b {
    protected Paint f3069A;
    protected Paint f3070B;
    protected Paint f3071C;
    protected float f3072D;
    protected float f3073E;
    protected float f3074F;
    protected float f3075G;
    protected float f3076H;
    protected float f3077I;
    protected float f3078J;
    protected float f3079K;
    protected float f3080L;
    protected float f3081M;
    protected float f3082N;
    protected float f3083O;
    protected float f3084P;
    protected float f3085Q;
    protected float f3086R;
    protected float f3087S;
    protected float f3088T;
    protected float f3089U;
    protected int f3090V;
    private boolean f3091W;
    private boolean f3092X;
    private boolean f3093Y;
    private boolean f3094Z;
    public int f3095a;
    private boolean aa;
    private boolean ab;
    private float ac;
    private int ad;
    private float ae;
    private boolean af;
    private int ag;
    private float ah;
    private boolean ai;
    private float aj;
    private float ak;
    private float al;
    private float am;
    private float an;
    private float ao;
    private float ap;
    private float aq;
    private float ar;
    private float as;
    private float at;
    private float au;
    private String av;
    private String aw;
    public int f3096b;
    public int f3097c;
    public int f3098d;
    public int f3099e;
    public boolean f3100f;
    public boolean f3101g;
    public boolean f3102h;
    public boolean f3103i;
    public boolean f3104j;
    public boolean f3105k;
    public boolean f3106l;
    public boolean f3107m;
    protected Context f3108n;
    protected String f3109o;
    protected String f3110p;
    protected String f3111q;
    protected String f3112r;
    protected String f3113s;
    protected String f3114t;
    protected float f3115u;
    protected float f3116v;
    protected float f3117w;
    protected float f3118x;
    protected float f3119y;
    protected boolean f3120z;

    C0959b() {
    }

    private float m2397a(String str) {
        float f;
        int i;
        Rect rect = new Rect();
        this.f3070B.getTextBounds(str, 0, str.length(), rect);
        int i2 = this.f3090V;
        if (i2 == 0) {
            f = this.al - this.f3088T;
            i = rect.top;
        } else if (i2 != 2) {
            return (this.al - (this.f3088T / 2.0f)) + ((float) (rect.height() / 2));
        } else {
            f = this.al;
            i = rect.bottom;
        }
        return f - ((float) i);
    }

    private boolean m2398a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = false;
        if (!z4) {
            z5 = false;
        }
        if (this.f3100f != z) {
            this.f3100f = z;
            if (z) {
                this.f3073E = this.am;
                this.f3074F = this.an;
            }
        }
        if (this.f3101g != z2) {
            this.f3101g = z2;
            if (z2) {
                this.f3077I = this.ao;
                this.f3078J = this.ap;
            }
        }
        if (this.f3102h != z3) {
            this.f3102h = z3;
            if (z3) {
                this.f3079K = this.aq;
                this.f3080L = this.ar;
                this.f3112r = this.av;
            }
        }
        if (this.f3103i != z4) {
            this.f3103i = z4;
            if (z4) {
                this.f3075G = this.as;
                this.f3076H = this.at;
                this.f3113s = this.aw;
            } else {
                this.f3112r = this.av;
            }
            this.f3079K = this.aq;
            this.f3080L = this.ar;
            z6 = true;
        }
        if (this.f3104j == z5) {
            return z6;
        }
        this.f3104j = z5;
        if (z5) {
            this.f3081M = this.au;
        } else {
            this.f3113s = this.aw;
        }
        this.f3075G = this.as;
        this.f3076H = this.at;
        return true;
    }

    private void m2399i() {
        Object obj;
        float f;
        int a;
        float measureText = this.f3070B.measureText(":");
        Object obj2 = null;
        if (TextUtils.isEmpty(this.f3109o)) {
            obj = 1;
            f = 0.0f;
        } else {
            f = this.f3070B.measureText(this.f3109o);
            obj = null;
        }
        if (!this.f3100f) {
            this.f3115u = 0.0f;
        } else if (this.f3091W) {
            this.f3115u = this.f3070B.measureText(this.f3110p);
        } else if (obj == null) {
            this.f3110p = this.f3109o;
            this.f3115u = f;
        } else if (!this.ab) {
            this.f3110p = ":";
            this.f3115u = measureText;
        }
        if (!this.f3101g) {
            this.f3116v = 0.0f;
        } else if (this.f3092X) {
            this.f3116v = this.f3070B.measureText(this.f3111q);
        } else if (obj == null) {
            this.f3111q = this.f3109o;
            this.f3116v = f;
        } else if (!this.ab) {
            this.f3111q = ":";
            this.f3116v = measureText;
        }
        if (this.f3102h) {
            if (this.f3093Y) {
                this.f3117w = this.f3070B.measureText(this.f3112r);
            } else if (this.f3103i) {
                if (obj == null) {
                    this.f3112r = this.f3109o;
                    this.f3117w = f;
                } else if (!this.ab) {
                    this.f3112r = ":";
                    this.f3117w = measureText;
                }
            }
            if (this.f3103i) {
                if (this.f3094Z) {
                    measureText = this.f3070B.measureText(this.f3113s);
                } else if (this.f3104j) {
                    if (obj == null) {
                        this.f3113s = this.f3109o;
                        this.f3118x = f;
                    } else if (!this.ab) {
                        this.f3113s = ":";
                    }
                    if (!this.f3104j && this.ab && this.aa) {
                        this.f3119y = this.f3070B.measureText(this.f3114t);
                    } else {
                        this.f3119y = 0.0f;
                    }
                    a = C0964e.m2419a(this.f3108n, 3.0f);
                    if (this.ac >= 0.0f) {
                        obj2 = 1;
                    }
                    if (this.f3100f || this.f3115u <= 0.0f) {
                        this.f3073E = 0.0f;
                        this.f3074F = 0.0f;
                    } else {
                        if (this.f3073E < 0.0f) {
                            this.f3073E = obj2 == null ? this.ac : (float) a;
                        }
                        if (this.f3074F < 0.0f) {
                            this.f3074F = obj2 == null ? this.ac : (float) a;
                        }
                    }
                    if (this.f3101g || this.f3116v <= 0.0f) {
                        this.f3077I = 0.0f;
                        this.f3078J = 0.0f;
                    } else {
                        if (this.f3077I < 0.0f) {
                            this.f3077I = obj2 == null ? this.ac : (float) a;
                        }
                        if (this.f3078J < 0.0f) {
                            this.f3078J = obj2 == null ? this.ac : (float) a;
                        }
                    }
                    if (this.f3102h || this.f3117w <= 0.0f) {
                        this.f3079K = 0.0f;
                    } else {
                        if (this.f3079K < 0.0f) {
                            this.f3079K = obj2 == null ? this.ac : (float) a;
                        }
                        if (this.f3103i) {
                            if (this.f3080L < 0.0f) {
                                this.f3080L = obj2 == null ? this.ac : (float) a;
                            }
                            if (this.f3103i) {
                                if (this.f3118x > 0.0f) {
                                    if (this.f3075G < 0.0f) {
                                        this.f3075G = obj2 == null ? this.ac : (float) a;
                                    }
                                    if (this.f3104j) {
                                        if (this.f3076H < 0.0f) {
                                            this.f3076H = obj2 == null ? this.ac : (float) a;
                                        }
                                        if (this.f3104j || this.f3119y <= 0.0f) {
                                            this.f3081M = 0.0f;
                                            return;
                                        } else if (this.f3081M < 0.0f) {
                                            this.f3081M = obj2 == null ? this.ac : (float) a;
                                            return;
                                        }
                                    }
                                }
                                this.f3075G = 0.0f;
                                this.f3076H = 0.0f;
                                if (this.f3104j) {
                                }
                                this.f3081M = 0.0f;
                                return;
                            }
                            this.f3075G = 0.0f;
                            this.f3076H = 0.0f;
                            this.f3081M = 0.0f;
                        }
                    }
                    this.f3080L = 0.0f;
                    if (this.f3103i) {
                        this.f3075G = 0.0f;
                        this.f3076H = 0.0f;
                        this.f3081M = 0.0f;
                    } else {
                        if (this.f3118x > 0.0f) {
                            this.f3075G = 0.0f;
                        } else {
                            if (this.f3075G < 0.0f) {
                                if (obj2 == null) {
                                }
                                this.f3075G = obj2 == null ? this.ac : (float) a;
                            }
                            if (this.f3104j) {
                                if (this.f3076H < 0.0f) {
                                    if (obj2 == null) {
                                    }
                                    this.f3076H = obj2 == null ? this.ac : (float) a;
                                }
                                if (this.f3104j) {
                                }
                                this.f3081M = 0.0f;
                                return;
                            }
                        }
                        this.f3076H = 0.0f;
                        if (this.f3104j) {
                        }
                        this.f3081M = 0.0f;
                        return;
                    }
                }
                this.f3118x = measureText;
                if (!this.f3104j) {
                }
                this.f3119y = 0.0f;
                a = C0964e.m2419a(this.f3108n, 3.0f);
                if (this.ac >= 0.0f) {
                    obj2 = 1;
                }
                if (this.f3100f) {
                }
                this.f3073E = 0.0f;
                this.f3074F = 0.0f;
                if (this.f3101g) {
                }
                this.f3077I = 0.0f;
                this.f3078J = 0.0f;
                if (this.f3102h) {
                }
                this.f3079K = 0.0f;
                this.f3080L = 0.0f;
                if (this.f3103i) {
                    if (this.f3118x > 0.0f) {
                        if (this.f3075G < 0.0f) {
                            if (obj2 == null) {
                            }
                            this.f3075G = obj2 == null ? this.ac : (float) a;
                        }
                        if (this.f3104j) {
                            if (this.f3076H < 0.0f) {
                                if (obj2 == null) {
                                }
                                this.f3076H = obj2 == null ? this.ac : (float) a;
                            }
                            if (this.f3104j) {
                            }
                            this.f3081M = 0.0f;
                            return;
                        }
                    }
                    this.f3075G = 0.0f;
                    this.f3076H = 0.0f;
                    if (this.f3104j) {
                    }
                    this.f3081M = 0.0f;
                    return;
                }
                this.f3075G = 0.0f;
                this.f3076H = 0.0f;
                this.f3081M = 0.0f;
            }
            this.f3118x = 0.0f;
            if (!this.f3104j) {
            }
            this.f3119y = 0.0f;
            a = C0964e.m2419a(this.f3108n, 3.0f);
            if (this.ac >= 0.0f) {
                obj2 = 1;
            }
            if (this.f3100f) {
            }
            this.f3073E = 0.0f;
            this.f3074F = 0.0f;
            if (this.f3101g) {
            }
            this.f3077I = 0.0f;
            this.f3078J = 0.0f;
            if (this.f3102h) {
            }
            this.f3079K = 0.0f;
            this.f3080L = 0.0f;
            if (this.f3103i) {
                this.f3075G = 0.0f;
                this.f3076H = 0.0f;
                this.f3081M = 0.0f;
            } else {
                if (this.f3118x > 0.0f) {
                    this.f3075G = 0.0f;
                } else {
                    if (this.f3075G < 0.0f) {
                        if (obj2 == null) {
                        }
                        this.f3075G = obj2 == null ? this.ac : (float) a;
                    }
                    if (this.f3104j) {
                        if (this.f3076H < 0.0f) {
                            if (obj2 == null) {
                            }
                            this.f3076H = obj2 == null ? this.ac : (float) a;
                        }
                        if (this.f3104j) {
                        }
                        this.f3081M = 0.0f;
                        return;
                    }
                }
                this.f3076H = 0.0f;
                if (this.f3104j) {
                }
                this.f3081M = 0.0f;
                return;
            }
        }
        this.f3117w = 0.0f;
        if (this.f3103i) {
            if (this.f3094Z) {
                measureText = this.f3070B.measureText(this.f3113s);
            } else if (this.f3104j) {
                if (obj == null) {
                    this.f3113s = this.f3109o;
                    this.f3118x = f;
                } else if (this.ab) {
                    this.f3113s = ":";
                }
                if (!this.f3104j) {
                }
                this.f3119y = 0.0f;
                a = C0964e.m2419a(this.f3108n, 3.0f);
                if (this.ac >= 0.0f) {
                    obj2 = 1;
                }
                if (this.f3100f) {
                }
                this.f3073E = 0.0f;
                this.f3074F = 0.0f;
                if (this.f3101g) {
                }
                this.f3077I = 0.0f;
                this.f3078J = 0.0f;
                if (this.f3102h) {
                }
                this.f3079K = 0.0f;
                this.f3080L = 0.0f;
                if (this.f3103i) {
                    if (this.f3118x > 0.0f) {
                        if (this.f3075G < 0.0f) {
                            if (obj2 == null) {
                            }
                            this.f3075G = obj2 == null ? this.ac : (float) a;
                        }
                        if (this.f3104j) {
                            if (this.f3076H < 0.0f) {
                                if (obj2 == null) {
                                }
                                this.f3076H = obj2 == null ? this.ac : (float) a;
                            }
                            if (this.f3104j) {
                            }
                            this.f3081M = 0.0f;
                            return;
                        }
                    }
                    this.f3075G = 0.0f;
                    this.f3076H = 0.0f;
                    if (this.f3104j) {
                    }
                    this.f3081M = 0.0f;
                    return;
                }
                this.f3075G = 0.0f;
                this.f3076H = 0.0f;
                this.f3081M = 0.0f;
            }
            this.f3118x = measureText;
            if (!this.f3104j) {
            }
            this.f3119y = 0.0f;
            a = C0964e.m2419a(this.f3108n, 3.0f);
            if (this.ac >= 0.0f) {
                obj2 = 1;
            }
            if (this.f3100f) {
            }
            this.f3073E = 0.0f;
            this.f3074F = 0.0f;
            if (this.f3101g) {
            }
            this.f3077I = 0.0f;
            this.f3078J = 0.0f;
            if (this.f3102h) {
            }
            this.f3079K = 0.0f;
            this.f3080L = 0.0f;
            if (this.f3103i) {
                this.f3075G = 0.0f;
                this.f3076H = 0.0f;
                this.f3081M = 0.0f;
            } else {
                if (this.f3118x > 0.0f) {
                    this.f3075G = 0.0f;
                } else {
                    if (this.f3075G < 0.0f) {
                        if (obj2 == null) {
                        }
                        this.f3075G = obj2 == null ? this.ac : (float) a;
                    }
                    if (this.f3104j) {
                        if (this.f3076H < 0.0f) {
                            if (obj2 == null) {
                            }
                            this.f3076H = obj2 == null ? this.ac : (float) a;
                        }
                        if (this.f3104j) {
                        }
                        this.f3081M = 0.0f;
                        return;
                    }
                }
                this.f3076H = 0.0f;
                if (this.f3104j) {
                }
                this.f3081M = 0.0f;
                return;
            }
        }
        this.f3118x = 0.0f;
        if (!this.f3104j) {
        }
        this.f3119y = 0.0f;
        a = C0964e.m2419a(this.f3108n, 3.0f);
        if (this.ac >= 0.0f) {
            obj2 = 1;
        }
        if (this.f3100f) {
        }
        this.f3073E = 0.0f;
        this.f3074F = 0.0f;
        if (this.f3101g) {
        }
        this.f3077I = 0.0f;
        this.f3078J = 0.0f;
        if (this.f3102h) {
        }
        this.f3079K = 0.0f;
        this.f3080L = 0.0f;
        if (this.f3103i) {
            if (this.f3118x > 0.0f) {
                if (this.f3075G < 0.0f) {
                    if (obj2 == null) {
                    }
                    this.f3075G = obj2 == null ? this.ac : (float) a;
                }
                if (this.f3104j) {
                    if (this.f3076H < 0.0f) {
                        if (obj2 == null) {
                        }
                        this.f3076H = obj2 == null ? this.ac : (float) a;
                    }
                    if (this.f3104j) {
                    }
                    this.f3081M = 0.0f;
                    return;
                }
            }
            this.f3075G = 0.0f;
            this.f3076H = 0.0f;
            if (this.f3104j) {
            }
            this.f3081M = 0.0f;
            return;
        }
        this.f3075G = 0.0f;
        this.f3076H = 0.0f;
        this.f3081M = 0.0f;
    }

    protected final float m2400a(float f) {
        float f2 = ((((this.f3115u + this.f3116v) + this.f3117w) + this.f3118x) + this.f3119y) + ((((((((this.f3073E + this.f3074F) + this.f3077I) + this.f3078J) + this.f3079K) + this.f3080L) + this.f3075G) + this.f3076H) + this.f3081M);
        if (this.f3105k) {
            String a;
            Rect rect = new Rect();
            float f3 = 0.0f;
            if (this.f3100f) {
                a = C0964e.m2420a(this.f3095a);
                this.f3069A.getTextBounds(a, 0, a.length(), rect);
                this.aj = (float) rect.width();
                f3 = 0.0f + this.aj;
            }
            if (this.f3101g) {
                a = C0964e.m2420a(this.f3096b);
                this.f3071C.getTextBounds(a, 0, a.length(), rect);
                this.ak = (float) rect.width();
                f3 += this.ak;
            }
            f2 += f3;
        } else if (this.f3101g) {
            f2 += f;
        }
        if (this.f3102h) {
            f2 += f;
        }
        if (this.f3103i) {
            f2 += f;
        }
        return this.f3104j ? f2 + f : f2;
    }

    protected void mo1024a() {
        this.f3069A = new Paint(1);
        this.f3069A.setColor(this.ad);
        this.f3069A.setTextAlign(Align.CENTER);
        this.f3069A.setTextSize(this.ae);
        if (this.af) {
            this.f3069A.setFakeBoldText(true);
        }
        this.f3070B = new Paint(1);
        this.f3070B.setColor(this.ag);
        this.f3070B.setTextSize(this.ah);
        if (this.ai) {
            this.f3070B.setFakeBoldText(true);
        }
        this.f3071C = new Paint();
        this.f3071C.setTextSize(this.ae);
        if (this.af) {
            this.f3071C.setFakeBoldText(true);
        }
    }

    public final void m2402a(int i, int i2, int i3, int i4, int i5) {
        this.f3095a = i;
        this.f3096b = i2;
        this.f3097c = i3;
        this.f3098d = i4;
        this.f3099e = i5;
    }

    public void mo1025a(Context context, TypedArray typedArray) {
        this.f3108n = context;
        this.af = typedArray.getBoolean(C0962a.CountdownView_isTimeTextBold, false);
        this.ae = typedArray.getDimension(C0962a.CountdownView_timeTextSize, C0964e.m2418a(this.f3108n));
        this.ad = typedArray.getColor(C0962a.CountdownView_timeTextColor, -16777216);
        this.f3100f = typedArray.getBoolean(C0962a.CountdownView_isShowDay, false);
        this.f3101g = typedArray.getBoolean(C0962a.CountdownView_isShowHour, false);
        this.f3102h = typedArray.getBoolean(C0962a.CountdownView_isShowMinute, true);
        this.f3103i = typedArray.getBoolean(C0962a.CountdownView_isShowSecond, true);
        this.f3104j = typedArray.getBoolean(C0962a.CountdownView_isShowMillisecond, false);
        if (typedArray.getBoolean(C0962a.CountdownView_isHideTimeBackground, true)) {
            this.f3105k = typedArray.getBoolean(C0962a.CountdownView_isConvertDaysToHours, false);
        }
        this.ai = typedArray.getBoolean(C0962a.CountdownView_isSuffixTextBold, false);
        this.ah = typedArray.getDimension(C0962a.CountdownView_suffixTextSize, C0964e.m2418a(this.f3108n));
        this.ag = typedArray.getColor(C0962a.CountdownView_suffixTextColor, -16777216);
        this.f3109o = typedArray.getString(C0962a.CountdownView_suffix);
        this.f3110p = typedArray.getString(C0962a.CountdownView_suffixDay);
        this.f3111q = typedArray.getString(C0962a.CountdownView_suffixHour);
        this.f3112r = typedArray.getString(C0962a.CountdownView_suffixMinute);
        this.f3113s = typedArray.getString(C0962a.CountdownView_suffixSecond);
        this.f3114t = typedArray.getString(C0962a.CountdownView_suffixMillisecond);
        this.f3090V = typedArray.getInt(C0962a.CountdownView_suffixGravity, 1);
        this.ac = typedArray.getDimension(C0962a.CountdownView_suffixLRMargin, -1.0f);
        this.f3073E = typedArray.getDimension(C0962a.CountdownView_suffixDayLeftMargin, -1.0f);
        this.f3074F = typedArray.getDimension(C0962a.CountdownView_suffixDayRightMargin, -1.0f);
        this.f3077I = typedArray.getDimension(C0962a.CountdownView_suffixHourLeftMargin, -1.0f);
        this.f3078J = typedArray.getDimension(C0962a.CountdownView_suffixHourRightMargin, -1.0f);
        this.f3079K = typedArray.getDimension(C0962a.CountdownView_suffixMinuteLeftMargin, -1.0f);
        this.f3080L = typedArray.getDimension(C0962a.CountdownView_suffixMinuteRightMargin, -1.0f);
        this.f3075G = typedArray.getDimension(C0962a.CountdownView_suffixSecondLeftMargin, -1.0f);
        this.f3076H = typedArray.getDimension(C0962a.CountdownView_suffixSecondRightMargin, -1.0f);
        this.f3081M = typedArray.getDimension(C0962a.CountdownView_suffixMillisecondLeftMargin, -1.0f);
        this.f3106l = typedArray.hasValue(C0962a.CountdownView_isShowDay);
        this.f3107m = typedArray.hasValue(C0962a.CountdownView_isShowHour);
        this.am = this.f3073E;
        this.an = this.f3074F;
        this.ao = this.f3077I;
        this.ap = this.f3078J;
        this.aq = this.f3079K;
        this.ar = this.f3080L;
        this.as = this.f3075G;
        this.at = this.f3076H;
        this.au = this.f3081M;
        if (!(this.f3100f || this.f3101g || this.f3102h)) {
            this.f3103i = true;
        }
        if (!this.f3103i) {
            this.f3104j = false;
        }
    }

    public void mo1026a(Canvas canvas) {
        float f;
        if (this.f3100f) {
            canvas.drawText(C0964e.m2420a(this.f3095a), this.f3072D + (this.aj / 2.0f), this.al, this.f3069A);
            if (this.f3115u > 0.0f) {
                canvas.drawText(this.f3110p, (this.f3072D + this.aj) + this.f3073E, this.f3082N, this.f3070B);
            }
            f = (((this.f3072D + this.aj) + this.f3115u) + this.f3073E) + this.f3074F;
        } else {
            f = this.f3072D;
        }
        if (this.f3101g) {
            float f2 = this.f3105k ? this.ak : this.f3087S;
            canvas.drawText(C0964e.m2420a(this.f3096b), (f2 / 2.0f) + f, this.al, this.f3069A);
            if (this.f3116v > 0.0f) {
                canvas.drawText(this.f3111q, (f + f2) + this.f3077I, this.f3083O, this.f3070B);
            }
            f = (((f + f2) + this.f3116v) + this.f3077I) + this.f3078J;
        }
        if (this.f3102h) {
            canvas.drawText(C0964e.m2420a(this.f3097c), (this.f3087S / 2.0f) + f, this.al, this.f3069A);
            if (this.f3117w > 0.0f) {
                canvas.drawText(this.f3112r, (this.f3087S + f) + this.f3079K, this.f3084P, this.f3070B);
            }
            f = (((f + this.f3087S) + this.f3117w) + this.f3079K) + this.f3080L;
        }
        if (this.f3103i) {
            canvas.drawText(C0964e.m2420a(this.f3098d), (this.f3087S / 2.0f) + f, this.al, this.f3069A);
            if (this.f3118x > 0.0f) {
                canvas.drawText(this.f3113s, (this.f3087S + f) + this.f3075G, this.f3085Q, this.f3070B);
            }
            if (this.f3104j) {
                f = (((f + this.f3087S) + this.f3118x) + this.f3075G) + this.f3076H;
                canvas.drawText(C0964e.m2421b(this.f3099e), (this.f3087S / 2.0f) + f, this.al, this.f3069A);
                if (this.f3119y > 0.0f) {
                    canvas.drawText(this.f3114t, (f + this.f3087S) + this.f3081M, this.f3086R, this.f3070B);
                }
            }
        }
    }

    public void mo1027a(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        i4 = view.getPaddingTop();
        if (i4 == view.getPaddingBottom()) {
            f = (float) (i2 / 2);
            f2 = this.f3088T / 2.0f;
        } else {
            f = (float) (i2 - (i2 - i4));
            f2 = this.f3088T;
        }
        this.al = (f + f2) - this.f3089U;
        if (this.f3100f && this.f3115u > 0.0f) {
            this.f3082N = m2397a(this.f3110p);
        }
        if (this.f3101g && this.f3116v > 0.0f) {
            this.f3083O = m2397a(this.f3111q);
        }
        if (this.f3102h && this.f3117w > 0.0f) {
            this.f3084P = m2397a(this.f3112r);
        }
        if (this.f3118x > 0.0f) {
            this.f3085Q = m2397a(this.f3113s);
        }
        if (this.f3104j && this.f3119y > 0.0f) {
            this.f3086R = m2397a(this.f3114t);
        }
        this.f3072D = view.getPaddingLeft() == view.getPaddingRight() ? (float) ((i - i3) / 2) : (float) view.getPaddingLeft();
    }

    protected void mo1028b() {
        Rect rect = new Rect();
        this.f3069A.getTextBounds("00", 0, 2, rect);
        this.f3087S = (float) rect.width();
        this.f3088T = (float) rect.height();
        this.f3089U = (float) rect.bottom;
    }

    public int mo1029c() {
        float a = m2400a(this.f3087S);
        if (!this.f3105k && this.f3100f) {
            float f;
            if (this.f3120z) {
                Rect rect = new Rect();
                String valueOf = String.valueOf(this.f3095a);
                this.f3069A.getTextBounds(valueOf, 0, valueOf.length(), rect);
                this.aj = (float) rect.width();
                f = this.aj;
            } else {
                this.aj = this.f3087S;
                f = this.f3087S;
            }
            a += f;
        }
        return (int) Math.ceil((double) a);
    }

    public int mo1030d() {
        return (int) this.f3088T;
    }

    public final void m2409e() {
        this.f3091W = TextUtils.isEmpty(this.f3110p) ^ true;
        this.f3092X = TextUtils.isEmpty(this.f3111q) ^ true;
        this.f3093Y = TextUtils.isEmpty(this.f3112r) ^ true;
        this.f3094Z = TextUtils.isEmpty(this.f3113s) ^ true;
        this.aa = TextUtils.isEmpty(this.f3114t) ^ true;
        if ((this.f3100f && this.f3091W) || ((this.f3101g && this.f3092X) || ((this.f3102h && this.f3093Y) || ((this.f3103i && this.f3094Z) || (this.f3104j && this.aa))))) {
            this.ab = true;
        }
        this.av = this.f3112r;
        this.aw = this.f3113s;
        mo1024a();
        m2399i();
        if (!this.f3103i) {
            this.f3104j = false;
        }
        mo1028b();
    }

    public final boolean m2410f() {
        boolean z;
        boolean z2;
        if (this.f3106l) {
            if (!this.f3107m) {
                if (this.f3101g || (this.f3095a <= 0 && this.f3096b <= 0)) {
                    if (this.f3101g && this.f3095a == 0 && this.f3096b == 0) {
                        z = this.f3100f;
                        z2 = false;
                    }
                }
                z = this.f3100f;
                z2 = true;
            }
            return false;
        } else if (this.f3100f || this.f3095a <= 0) {
            if (this.f3100f && this.f3095a == 0) {
                z = false;
                z2 = this.f3101g;
            } else {
                if (!this.f3107m) {
                    if (!this.f3101g) {
                        if (this.f3095a <= 0) {
                            if (this.f3096b > 0) {
                            }
                        }
                        z = this.f3100f;
                        z2 = true;
                    }
                    if (this.f3101g && this.f3095a == 0 && this.f3096b == 0) {
                        z = false;
                        z2 = false;
                    }
                }
                return false;
            }
        } else if (this.f3107m) {
            m2398a(true, this.f3101g, this.f3102h, this.f3103i, this.f3104j);
            return true;
        } else {
            z = true;
            z2 = true;
        }
        m2398a(z, z2, this.f3102h, this.f3103i, this.f3104j);
        return true;
    }

    public final boolean m2411g() {
        if (this.f3100f) {
            if (!this.f3120z && this.f3095a > 99) {
                this.f3120z = true;
                return true;
            } else if (this.f3120z && this.f3095a <= 99) {
                this.f3120z = false;
                return true;
            }
        }
        return false;
    }

    public final void m2412h() {
        m2399i();
        mo1028b();
    }
}
