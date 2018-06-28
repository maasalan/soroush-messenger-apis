package android.support.constraint.p026a.p027a;

import android.support.constraint.p026a.C0182c;
import android.support.constraint.p026a.C0184e;
import android.support.constraint.p026a.C0185f;
import android.support.constraint.p026a.C0189h;
import android.support.constraint.p026a.C4705b;
import android.support.constraint.p026a.p027a.C0171c.C0169b;
import android.support.constraint.p026a.p027a.C0171c.C0170c;
import java.util.ArrayList;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class C0174d {
    public static float f597T = 0.5f;
    C0171c f598A = new C0171c(this, C0170c.CENTER_Y);
    C0171c f599B = new C0171c(this, C0170c.CENTER);
    protected C0171c[] f600C = new C0171c[]{this.f643u, this.f645w, this.f644v, this.f646x, this.f647y, this.f599B};
    protected ArrayList<C0171c> f601D = new ArrayList();
    protected int[] f602E = new int[]{C0173a.f592a, C0173a.f592a};
    C0174d f603F = null;
    int f604G = 0;
    int f605H = 0;
    protected float f606I = 0.0f;
    protected int f607J = -1;
    protected int f608K = 0;
    protected int f609L = 0;
    protected int f610M = 0;
    protected int f611N = 0;
    public int f612O = 0;
    protected int f613P;
    protected int f614Q;
    public int f615R;
    public int f616S;
    public float f617U = f597T;
    public float f618V = f597T;
    public Object f619W;
    public int f620X = 0;
    public String f621Y = null;
    boolean f622Z;
    private int f623a = 0;
    boolean aa;
    public int ab = 0;
    public int ac = 0;
    boolean ad;
    boolean ae;
    public float[] af = new float[]{0.0f, 0.0f};
    protected C0174d[] ag = new C0174d[]{null, null};
    protected C0174d[] ah = new C0174d[]{null, null};
    C0174d ai = null;
    C0174d aj = null;
    private int ak = 0;
    private int al = 0;
    private int am = 0;
    private String an = null;
    private int f624b = 0;
    public int f625c = -1;
    public int f626d = -1;
    C4703k f627e;
    C4703k f628f;
    public int f629g = 0;
    public int f630h = 0;
    public int f631i = 0;
    public int f632j = 0;
    public float f633k = BallPulseIndicator.SCALE;
    public int f634l = 0;
    public int f635m = 0;
    public float f636n = BallPulseIndicator.SCALE;
    public boolean f637o;
    public boolean f638p;
    int f639q = -1;
    float f640r = BallPulseIndicator.SCALE;
    public int[] f641s = new int[]{ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED};
    public float f642t = 0.0f;
    C0171c f643u = new C0171c(this, C0170c.LEFT);
    C0171c f644v = new C0171c(this, C0170c.TOP);
    C0171c f645w = new C0171c(this, C0170c.RIGHT);
    C0171c f646x = new C0171c(this, C0170c.BOTTOM);
    C0171c f647y = new C0171c(this, C0170c.BASELINE);
    C0171c f648z = new C0171c(this, C0170c.CENTER_X);

    static /* synthetic */ class C01721 {
        static final /* synthetic */ int[] f591b = new int[C0173a.m277a().length];

        static {
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
            r0 = android.support.constraint.p026a.p027a.C0174d.C0173a.m277a();
            r0 = r0.length;
            r0 = new int[r0];
            f591b = r0;
            r0 = 1;
            r1 = f591b;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = android.support.constraint.p026a.p027a.C0174d.C0173a.f592a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = 2;
            r2 = f591b;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = android.support.constraint.p026a.p027a.C0174d.C0173a.f593b;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = r3 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r2 = 3;
            r3 = f591b;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r4 = android.support.constraint.p026a.p027a.C0174d.C0173a.f595d;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r4 = r4 - r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            r3 = 4;
            r4 = f591b;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r5 = android.support.constraint.p026a.p027a.C0174d.C0173a.f594c;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r5 = r5 - r0;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0029 }
        L_0x0029:
            r4 = android.support.constraint.p026a.p027a.C0171c.C0170c.values();
            r4 = r4.length;
            r4 = new int[r4];
            f590a = r4;
            r4 = f590a;	 Catch:{ NoSuchFieldError -> 0x003c }
            r5 = android.support.constraint.p026a.p027a.C0171c.C0170c.LEFT;	 Catch:{ NoSuchFieldError -> 0x003c }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x003c }
            r4[r5] = r0;	 Catch:{ NoSuchFieldError -> 0x003c }
        L_0x003c:
            r0 = f590a;	 Catch:{ NoSuchFieldError -> 0x0046 }
            r4 = android.support.constraint.p026a.p027a.C0171c.C0170c.TOP;	 Catch:{ NoSuchFieldError -> 0x0046 }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x0046 }
            r0[r4] = r1;	 Catch:{ NoSuchFieldError -> 0x0046 }
        L_0x0046:
            r0 = f590a;	 Catch:{ NoSuchFieldError -> 0x0050 }
            r1 = android.support.constraint.p026a.p027a.C0171c.C0170c.RIGHT;	 Catch:{ NoSuchFieldError -> 0x0050 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0050 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0050 }
        L_0x0050:
            r0 = f590a;	 Catch:{ NoSuchFieldError -> 0x005a }
            r1 = android.support.constraint.p026a.p027a.C0171c.C0170c.BOTTOM;	 Catch:{ NoSuchFieldError -> 0x005a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x005a }
            r0[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x005a }
        L_0x005a:
            r0 = f590a;	 Catch:{ NoSuchFieldError -> 0x0065 }
            r1 = android.support.constraint.p026a.p027a.C0171c.C0170c.BASELINE;	 Catch:{ NoSuchFieldError -> 0x0065 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0065 }
            r2 = 5;	 Catch:{ NoSuchFieldError -> 0x0065 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0065 }
        L_0x0065:
            r0 = f590a;	 Catch:{ NoSuchFieldError -> 0x0070 }
            r1 = android.support.constraint.p026a.p027a.C0171c.C0170c.CENTER;	 Catch:{ NoSuchFieldError -> 0x0070 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0070 }
            r2 = 6;	 Catch:{ NoSuchFieldError -> 0x0070 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0070 }
        L_0x0070:
            r0 = f590a;	 Catch:{ NoSuchFieldError -> 0x007b }
            r1 = android.support.constraint.p026a.p027a.C0171c.C0170c.CENTER_X;	 Catch:{ NoSuchFieldError -> 0x007b }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x007b }
            r2 = 7;	 Catch:{ NoSuchFieldError -> 0x007b }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x007b }
        L_0x007b:
            r0 = f590a;	 Catch:{ NoSuchFieldError -> 0x0087 }
            r1 = android.support.constraint.p026a.p027a.C0171c.C0170c.CENTER_Y;	 Catch:{ NoSuchFieldError -> 0x0087 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0087 }
            r2 = 8;	 Catch:{ NoSuchFieldError -> 0x0087 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0087 }
        L_0x0087:
            r0 = f590a;	 Catch:{ NoSuchFieldError -> 0x0093 }
            r1 = android.support.constraint.p026a.p027a.C0171c.C0170c.NONE;	 Catch:{ NoSuchFieldError -> 0x0093 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0093 }
            r2 = 9;	 Catch:{ NoSuchFieldError -> 0x0093 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0093 }
        L_0x0093:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.a.a.d.1.<clinit>():void");
        }
    }

    public enum C0173a {
        ;
        
        public static final int f592a = 1;
        public static final int f593b = 2;
        public static final int f594c = 3;
        public static final int f595d = 4;

        static {
            f596e = new int[]{f592a, f593b, f594c, f595d};
        }

        public static int[] m277a() {
            return (int[]) f596e.clone();
        }
    }

    public C0174d() {
        this.f601D.add(this.f643u);
        this.f601D.add(this.f644v);
        this.f601D.add(this.f645w);
        this.f601D.add(this.f646x);
        this.f601D.add(this.f648z);
        this.f601D.add(this.f598A);
        this.f601D.add(this.f599B);
        this.f601D.add(this.f647y);
    }

    private void m278a(C0184e c0184e, boolean z, C0189h c0189h, C0189h c0189h2, int i, boolean z2, C0171c c0171c, C0171c c0171c2, int i2, int i3, int i4, int i5, float f, boolean z3, boolean z4, int i6, int i7, int i8, float f2, boolean z5) {
        C0174d c0174d = this;
        C0184e c0184e2 = c0184e;
        C0189h c0189h3 = c0189h;
        C0189h c0189h4 = c0189h2;
        Object obj = c0171c;
        Object obj2 = c0171c2;
        int i9 = i4;
        int i10 = i5;
        C0189h a = c0184e2.m358a(obj);
        C0189h a2 = c0184e2.m358a(obj2);
        C0189h a3 = c0184e2.m358a(obj.f583d);
        C0189h a4 = c0184e2.m358a(obj2.f583d);
        if (c0184e2.f682d && obj.f580a.i == 1 && obj2.f580a.i == 1) {
            if (C0184e.m349a() != null) {
                C0185f a5 = C0184e.m349a();
                a5.f717s++;
            }
            obj.f580a.m8601a(c0184e2);
            obj2.f580a.m8601a(c0184e2);
            if (!z4 && z) {
                c0184e2.m364a(c0189h4, a2, 0, 6);
            }
            return;
        }
        Object obj3;
        int i11;
        boolean z6;
        int i12;
        int i13;
        C0189h c0189h5;
        int i14;
        boolean z7;
        int i15;
        C0189h a6;
        C0189h c0189h6;
        int max;
        C0189h a7;
        int i16;
        C0189h c0189h7;
        C0189h c0189h8;
        int i17;
        Object obj4;
        C0189h c0189h9;
        C0189h c0189h10;
        C0189h c0189h11;
        C0189h c0189h12;
        if (C0184e.m349a() != null) {
            C0185f a8 = C0184e.m349a();
            a8.f696B++;
        }
        boolean d = c0171c.m276d();
        boolean d2 = c0171c2.m276d();
        boolean d3 = c0174d.f599B.m276d();
        int i18 = d ? 1 : 0;
        if (d2) {
            i18++;
        }
        if (d3) {
            i18++;
        }
        int i19 = z3 ? 3 : i6;
        switch (C01721.f591b[i - 1]) {
            case 4:
                obj3 = 1;
                break;
            default:
                obj3 = null;
                break;
        }
        if (c0174d.f620X == 8) {
            i11 = 0;
            obj3 = null;
        } else {
            i11 = i3;
        }
        if (z5) {
            if (!d && !d2 && !d3) {
                c0184e2.m362a(a, i2);
            } else if (d && !d2) {
                z6 = d3;
                i12 = 6;
                c0184e2.m369c(a, a3, c0171c.m274b(), 6);
                if (obj3 != null) {
                    if (z2) {
                        i13 = i12;
                        c0189h5 = a3;
                        i12 = i4;
                        c0184e2.m369c(a2, a, i11, i13);
                    } else {
                        c0184e2.m369c(a2, a, 0, 3);
                        i12 = i4;
                        if (i12 <= 0) {
                            i13 = 6;
                            c0184e2.m364a(a2, a, i12, 6);
                        } else {
                            i13 = 6;
                        }
                        c0189h5 = a3;
                        i14 = i5;
                        if (i14 < ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
                            c0184e2.m367b(a2, a, i14, i13);
                        }
                    }
                    i12 = i7;
                    i13 = i8;
                    z7 = d2;
                    i15 = i19;
                } else {
                    i13 = i12;
                    c0189h5 = a3;
                    i12 = i4;
                    i13 = i7;
                    if (i13 != -2) {
                        i13 = i8;
                        i12 = i11;
                    } else {
                        i12 = i13;
                        i13 = i8;
                    }
                    if (i13 == -2) {
                        i13 = i11;
                    }
                    if (i12 <= 0) {
                        i14 = 6;
                        c0184e2.m364a(a2, a, i12, 6);
                        i11 = Math.max(i11, i12);
                    } else {
                        i14 = 6;
                    }
                    if (i13 > 0) {
                        if (z) {
                            c0184e2.m367b(a2, a, i13, i14);
                        } else {
                            c0184e2.m367b(a2, a, i13, 1);
                        }
                        i11 = Math.min(i11, i13);
                    }
                    z7 = d2;
                    i14 = i11;
                    i11 = i19;
                    if (i11 == 1) {
                        i10 = z ? 6 : z4 ? 4 : 1;
                        c0184e2.m369c(a2, a, i14, i10);
                    } else if (i11 == 2) {
                        i15 = i11;
                        if (obj.f582c != C0170c.TOP) {
                            if (obj.f582c == C0170c.BOTTOM) {
                                C0189h a9 = c0184e2.m358a(c0174d.f603F.mo51a(C0170c.LEFT));
                                a6 = c0184e2.m358a(c0174d.f603F.mo51a(C0170c.RIGHT));
                                c0189h6 = a9;
                                c0184e2.m359a(c0184e.m368c().m8619a(a2, a, a6, c0189h6, f2));
                                obj3 = null;
                                if (!(obj3 == null || i18 == 2 || z3)) {
                                    max = Math.max(i12, i14);
                                    if (i13 > 0) {
                                        max = Math.min(i13, max);
                                    }
                                    c0184e2.m369c(a2, a, max, 6);
                                    obj3 = null;
                                }
                            }
                        }
                        a7 = c0184e2.m358a(c0174d.f603F.mo51a(C0170c.TOP));
                        a6 = c0184e2.m358a(c0174d.f603F.mo51a(C0170c.BOTTOM));
                        c0189h6 = a7;
                        c0184e2.m359a(c0184e.m368c().m8619a(a2, a, a6, c0189h6, f2));
                        obj3 = null;
                        max = Math.max(i12, i14);
                        if (i13 > 0) {
                            max = Math.min(i13, max);
                        }
                        c0184e2.m369c(a2, a, max, 6);
                        obj3 = null;
                    }
                    i15 = i11;
                    max = Math.max(i12, i14);
                    if (i13 > 0) {
                        max = Math.min(i13, max);
                    }
                    c0184e2.m369c(a2, a, max, 6);
                    obj3 = null;
                }
                if (z5) {
                    if (z4) {
                        max = 5;
                        if (!d || r26 || r24) {
                            i14 = 0;
                            c0189h4 = c0189h2;
                            if (!d && !r26) {
                                if (z) {
                                }
                                i16 = i14;
                                c0189h7 = a2;
                                i9 = 6;
                                if (z) {
                                    c0184e2.m364a(c0189h2, c0189h7, i16, i9);
                                }
                                return;
                            } else if (d && r26) {
                                c0184e2.m369c(a2, a4, -c0171c2.m274b(), 6);
                                if (z) {
                                    c0184e2.m364a(a, c0189h, 0, 5);
                                }
                                i16 = i14;
                                c0189h7 = a2;
                                i9 = 6;
                                if (z) {
                                    c0184e2.m364a(c0189h2, c0189h7, i16, i9);
                                }
                                return;
                            } else {
                                c0189h3 = a4;
                                c0189h8 = c0189h;
                                if (d && r26) {
                                    if (obj3 == null) {
                                        if (z || i4 != 0) {
                                            i17 = 6;
                                        } else {
                                            i17 = 6;
                                            c0184e2.m364a(a2, a, 0, 6);
                                        }
                                        if (i15 != 0) {
                                            if (i13 <= 0) {
                                                if (i12 > 0) {
                                                    i9 = i17;
                                                    i10 = 0;
                                                    a3 = c0189h5;
                                                    c0184e2.m369c(a, a3, c0171c.m274b(), i9);
                                                    c0184e2.m369c(a2, c0189h3, -c0171c2.m274b(), i9);
                                                    if (i13 <= 0) {
                                                        if (i12 <= 0) {
                                                            obj4 = null;
                                                            i13 = i10;
                                                        }
                                                    }
                                                    obj4 = 1;
                                                    i13 = i10;
                                                }
                                            }
                                            i9 = 4;
                                            i10 = 1;
                                            a3 = c0189h5;
                                            c0184e2.m369c(a, a3, c0171c.m274b(), i9);
                                            c0184e2.m369c(a2, c0189h3, -c0171c2.m274b(), i9);
                                            if (i13 <= 0) {
                                                if (i12 <= 0) {
                                                    obj4 = null;
                                                    i13 = i10;
                                                }
                                            }
                                            obj4 = 1;
                                            i13 = i10;
                                        } else {
                                            a3 = c0189h5;
                                            i9 = i15;
                                            obj4 = 1;
                                            if (i9 == 1) {
                                                max = i17;
                                            } else if (i9 != 3) {
                                                i9 = z3 ? i17 : 4;
                                                c0184e2.m369c(a, a3, c0171c.m274b(), i9);
                                                c0184e2.m369c(a2, c0189h3, -c0171c2.m274b(), i9);
                                            } else {
                                                obj4 = null;
                                            }
                                            i13 = 1;
                                        }
                                        if (obj4 == null) {
                                            c0189h9 = c0189h3;
                                            i11 = i17;
                                            c0189h3 = c0189h8;
                                            c0189h4 = a3;
                                            c0189h3 = a2;
                                            c0189h10 = a;
                                            c0184e2.m363a(a, a3, c0171c.m274b(), f, c0189h9, a2, c0171c2.m274b(), max);
                                        } else {
                                            c0189h4 = a3;
                                            c0189h10 = a;
                                            c0189h9 = c0189h3;
                                            c0189h3 = a2;
                                        }
                                        if (i13 == 0) {
                                            i9 = 6;
                                            c0184e2.m364a(c0189h10, c0189h4, c0171c.m274b(), 6);
                                            c0184e2.m367b(c0189h3, c0189h9, -c0171c2.m274b(), 6);
                                        } else {
                                            i9 = 6;
                                        }
                                        a7 = c0189h10;
                                        if (z) {
                                            c0189h7 = c0189h3;
                                            i16 = 0;
                                            if (z) {
                                                c0184e2.m364a(c0189h2, c0189h7, i16, i9);
                                            }
                                            return;
                                        }
                                        c0189h7 = c0189h3;
                                        i16 = 0;
                                        c0184e2.m364a(a7, c0189h, 0, i9);
                                        if (z) {
                                            c0184e2.m364a(c0189h2, c0189h7, i16, i9);
                                        }
                                        return;
                                    }
                                    a3 = c0189h5;
                                    i17 = 6;
                                    obj4 = 1;
                                    if (z) {
                                        c0184e2.m364a(a, a3, c0171c.m274b(), 5);
                                        c0184e2.m367b(a2, c0189h3, -c0171c2.m274b(), 5);
                                    }
                                    i13 = 0;
                                    if (obj4 == null) {
                                        c0189h4 = a3;
                                        c0189h10 = a;
                                        c0189h9 = c0189h3;
                                        c0189h3 = a2;
                                    } else {
                                        c0189h9 = c0189h3;
                                        i11 = i17;
                                        c0189h3 = c0189h8;
                                        c0189h4 = a3;
                                        c0189h3 = a2;
                                        c0189h10 = a;
                                        c0184e2.m363a(a, a3, c0171c.m274b(), f, c0189h9, a2, c0171c2.m274b(), max);
                                    }
                                    if (i13 == 0) {
                                        i9 = 6;
                                    } else {
                                        i9 = 6;
                                        c0184e2.m364a(c0189h10, c0189h4, c0171c.m274b(), 6);
                                        c0184e2.m367b(c0189h3, c0189h9, -c0171c2.m274b(), 6);
                                    }
                                    a7 = c0189h10;
                                    if (z) {
                                        c0189h7 = c0189h3;
                                        i16 = 0;
                                        if (z) {
                                            c0184e2.m364a(c0189h2, c0189h7, i16, i9);
                                        }
                                        return;
                                    }
                                    c0189h7 = c0189h3;
                                    i16 = 0;
                                    c0184e2.m364a(a7, c0189h, 0, i9);
                                    if (z) {
                                        c0184e2.m364a(c0189h2, c0189h7, i16, i9);
                                    }
                                    return;
                                }
                                i16 = i14;
                                c0189h7 = a2;
                                i9 = 6;
                                if (z) {
                                    c0184e2.m364a(c0189h2, c0189h7, i16, i9);
                                }
                                return;
                            }
                        } else if (z) {
                            i14 = 0;
                            c0189h4 = c0189h2;
                        } else {
                            c0189h7 = a2;
                            i9 = 6;
                            i16 = 0;
                            if (z) {
                                c0184e2.m364a(c0189h2, c0189h7, i16, i9);
                            }
                            return;
                        }
                        c0184e2.m364a(c0189h4, a2, i14, 5);
                        i16 = i14;
                        c0189h7 = a2;
                        i9 = 6;
                        if (z) {
                            c0184e2.m364a(c0189h2, c0189h7, i16, i9);
                        }
                        return;
                    }
                }
                c0189h7 = a2;
                a7 = a;
                c0189h11 = c0189h2;
                c0189h12 = c0189h;
                if (i18 < 2 && z) {
                    c0184e2.m364a(a7, c0189h12, 0, 6);
                    c0184e2.m364a(c0189h11, c0189h7, 0, 6);
                }
            }
        }
        z6 = d3;
        i12 = 6;
        if (obj3 != null) {
            i13 = i12;
            c0189h5 = a3;
            i12 = i4;
            i13 = i7;
            if (i13 != -2) {
                i12 = i13;
                i13 = i8;
            } else {
                i13 = i8;
                i12 = i11;
            }
            if (i13 == -2) {
                i13 = i11;
            }
            if (i12 <= 0) {
                i14 = 6;
            } else {
                i14 = 6;
                c0184e2.m364a(a2, a, i12, 6);
                i11 = Math.max(i11, i12);
            }
            if (i13 > 0) {
                if (z) {
                    c0184e2.m367b(a2, a, i13, i14);
                } else {
                    c0184e2.m367b(a2, a, i13, 1);
                }
                i11 = Math.min(i11, i13);
            }
            z7 = d2;
            i14 = i11;
            i11 = i19;
            if (i11 == 1) {
                if (z) {
                }
                c0184e2.m369c(a2, a, i14, i10);
            } else if (i11 == 2) {
                i15 = i11;
                if (obj.f582c != C0170c.TOP) {
                    if (obj.f582c == C0170c.BOTTOM) {
                        C0189h a92 = c0184e2.m358a(c0174d.f603F.mo51a(C0170c.LEFT));
                        a6 = c0184e2.m358a(c0174d.f603F.mo51a(C0170c.RIGHT));
                        c0189h6 = a92;
                        c0184e2.m359a(c0184e.m368c().m8619a(a2, a, a6, c0189h6, f2));
                        obj3 = null;
                        max = Math.max(i12, i14);
                        if (i13 > 0) {
                            max = Math.min(i13, max);
                        }
                        c0184e2.m369c(a2, a, max, 6);
                        obj3 = null;
                    }
                }
                a7 = c0184e2.m358a(c0174d.f603F.mo51a(C0170c.TOP));
                a6 = c0184e2.m358a(c0174d.f603F.mo51a(C0170c.BOTTOM));
                c0189h6 = a7;
                c0184e2.m359a(c0184e.m368c().m8619a(a2, a, a6, c0189h6, f2));
                obj3 = null;
                max = Math.max(i12, i14);
                if (i13 > 0) {
                    max = Math.min(i13, max);
                }
                c0184e2.m369c(a2, a, max, 6);
                obj3 = null;
            }
            i15 = i11;
            max = Math.max(i12, i14);
            if (i13 > 0) {
                max = Math.min(i13, max);
            }
            c0184e2.m369c(a2, a, max, 6);
            obj3 = null;
        } else {
            if (z2) {
                i13 = i12;
                c0189h5 = a3;
                i12 = i4;
                c0184e2.m369c(a2, a, i11, i13);
            } else {
                c0184e2.m369c(a2, a, 0, 3);
                i12 = i4;
                if (i12 <= 0) {
                    i13 = 6;
                } else {
                    i13 = 6;
                    c0184e2.m364a(a2, a, i12, 6);
                }
                c0189h5 = a3;
                i14 = i5;
                if (i14 < ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
                    c0184e2.m367b(a2, a, i14, i13);
                }
            }
            i12 = i7;
            i13 = i8;
            z7 = d2;
            i15 = i19;
        }
        if (z5) {
            if (z4) {
                max = 5;
                if (d) {
                }
                i14 = 0;
                c0189h4 = c0189h2;
                if (!d) {
                }
                if (d) {
                }
                c0189h3 = a4;
                c0189h8 = c0189h;
                if (obj3 == null) {
                    a3 = c0189h5;
                    i17 = 6;
                    obj4 = 1;
                    if (z) {
                        c0184e2.m364a(a, a3, c0171c.m274b(), 5);
                        c0184e2.m367b(a2, c0189h3, -c0171c2.m274b(), 5);
                    }
                } else {
                    if (z) {
                    }
                    i17 = 6;
                    if (i15 != 0) {
                        a3 = c0189h5;
                        i9 = i15;
                        obj4 = 1;
                        if (i9 == 1) {
                            max = i17;
                        } else if (i9 != 3) {
                            obj4 = null;
                        } else {
                            if (z3) {
                            }
                            c0184e2.m369c(a, a3, c0171c.m274b(), i9);
                            c0184e2.m369c(a2, c0189h3, -c0171c2.m274b(), i9);
                        }
                        i13 = 1;
                    } else {
                        if (i13 <= 0) {
                            if (i12 > 0) {
                                i9 = i17;
                                i10 = 0;
                                a3 = c0189h5;
                                c0184e2.m369c(a, a3, c0171c.m274b(), i9);
                                c0184e2.m369c(a2, c0189h3, -c0171c2.m274b(), i9);
                                if (i13 <= 0) {
                                    if (i12 <= 0) {
                                        obj4 = null;
                                        i13 = i10;
                                    }
                                }
                                obj4 = 1;
                                i13 = i10;
                            }
                        }
                        i9 = 4;
                        i10 = 1;
                        a3 = c0189h5;
                        c0184e2.m369c(a, a3, c0171c.m274b(), i9);
                        c0184e2.m369c(a2, c0189h3, -c0171c2.m274b(), i9);
                        if (i13 <= 0) {
                            if (i12 <= 0) {
                                obj4 = null;
                                i13 = i10;
                            }
                        }
                        obj4 = 1;
                        i13 = i10;
                    }
                    if (obj4 == null) {
                        c0189h9 = c0189h3;
                        i11 = i17;
                        c0189h3 = c0189h8;
                        c0189h4 = a3;
                        c0189h3 = a2;
                        c0189h10 = a;
                        c0184e2.m363a(a, a3, c0171c.m274b(), f, c0189h9, a2, c0171c2.m274b(), max);
                    } else {
                        c0189h4 = a3;
                        c0189h10 = a;
                        c0189h9 = c0189h3;
                        c0189h3 = a2;
                    }
                    if (i13 == 0) {
                        i9 = 6;
                        c0184e2.m364a(c0189h10, c0189h4, c0171c.m274b(), 6);
                        c0184e2.m367b(c0189h3, c0189h9, -c0171c2.m274b(), 6);
                    } else {
                        i9 = 6;
                    }
                    a7 = c0189h10;
                    if (z) {
                        c0189h7 = c0189h3;
                        i16 = 0;
                        c0184e2.m364a(a7, c0189h, 0, i9);
                        if (z) {
                            c0184e2.m364a(c0189h2, c0189h7, i16, i9);
                        }
                        return;
                    }
                    c0189h7 = c0189h3;
                    i16 = 0;
                    if (z) {
                        c0184e2.m364a(c0189h2, c0189h7, i16, i9);
                    }
                    return;
                }
                i13 = 0;
                if (obj4 == null) {
                    c0189h4 = a3;
                    c0189h10 = a;
                    c0189h9 = c0189h3;
                    c0189h3 = a2;
                } else {
                    c0189h9 = c0189h3;
                    i11 = i17;
                    c0189h3 = c0189h8;
                    c0189h4 = a3;
                    c0189h3 = a2;
                    c0189h10 = a;
                    c0184e2.m363a(a, a3, c0171c.m274b(), f, c0189h9, a2, c0171c2.m274b(), max);
                }
                if (i13 == 0) {
                    i9 = 6;
                } else {
                    i9 = 6;
                    c0184e2.m364a(c0189h10, c0189h4, c0171c.m274b(), 6);
                    c0184e2.m367b(c0189h3, c0189h9, -c0171c2.m274b(), 6);
                }
                a7 = c0189h10;
                if (z) {
                    c0189h7 = c0189h3;
                    i16 = 0;
                    if (z) {
                        c0184e2.m364a(c0189h2, c0189h7, i16, i9);
                    }
                    return;
                }
                c0189h7 = c0189h3;
                i16 = 0;
                c0184e2.m364a(a7, c0189h, 0, i9);
                if (z) {
                    c0184e2.m364a(c0189h2, c0189h7, i16, i9);
                }
                return;
            }
        }
        c0189h7 = a2;
        a7 = a;
        c0189h11 = c0189h2;
        c0189h12 = c0189h;
        c0184e2.m364a(a7, c0189h12, 0, 6);
        c0184e2.m364a(c0189h11, c0189h7, 0, 6);
    }

    public C0171c mo51a(C0170c c0170c) {
        switch (c0170c) {
            case LEFT:
                return this.f643u;
            case TOP:
                return this.f644v;
            case RIGHT:
                return this.f645w;
            case BOTTOM:
                return this.f646x;
            case BASELINE:
                return this.f647y;
            case CENTER:
                return this.f599B;
            case CENTER_X:
                return this.f648z;
            case CENTER_Y:
                return this.f598A;
            case NONE:
                return null;
            default:
                throw new AssertionError(c0170c.name());
        }
    }

    public void mo52a(int i) {
        C0176h.m323a(i, this);
    }

    public final void m281a(int i, int i2) {
        this.f608K = i;
        this.f609L = i2;
    }

    public final void m282a(C0170c c0170c, C0174d c0174d, C0170c c0170c2, int i, int i2) {
        mo51a(c0170c).m273a(c0174d.mo51a(c0170c2), i, i2, C0169b.f567b, 0, true);
    }

    public void mo59a(C0182c c0182c) {
        this.f643u.m272a();
        this.f644v.m272a();
        this.f645w.m272a();
        this.f646x.m272a();
        this.f647y.m272a();
        this.f599B.m272a();
        this.f648z.m272a();
        this.f598A.m272a();
    }

    public void mo53a(C0184e c0184e) {
        C0174d c0174d;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3;
        C0189h c0189h;
        C0189h c0189h2;
        C0189h c0189h3;
        C0189h c0189h4;
        C0184e c0184e2 = c0184e;
        C0189h a = c0184e2.m358a(this.f643u);
        C0189h a2 = c0184e2.m358a(this.f645w);
        C0189h a3 = c0184e2.m358a(this.f644v);
        C0189h a4 = c0184e2.m358a(this.f646x);
        C0189h a5 = c0184e2.m358a(this.f647y);
        if (this.f603F != null) {
            boolean z5;
            boolean z6;
            boolean z7 = c0174d.f603F != null && c0174d.f603F.f602E[0] == C0173a.f593b;
            z = c0174d.f603F != null && c0174d.f603F.f602E[1] == C0173a.f593b;
            if ((c0174d.f643u.f583d == null || c0174d.f643u.f583d.f583d != c0174d.f643u) && (c0174d.f645w.f583d == null || c0174d.f645w.f583d.f583d != c0174d.f645w)) {
                z5 = false;
            } else {
                ((C6337e) c0174d.f603F).m14864a(c0174d, 0);
                z5 = true;
            }
            if ((c0174d.f644v.f583d == null || c0174d.f644v.f583d.f583d != c0174d.f644v) && (c0174d.f646x.f583d == null || c0174d.f646x.f583d.f583d != c0174d.f646x)) {
                z6 = false;
            } else {
                ((C6337e) c0174d.f603F).m14864a(c0174d, 1);
                z6 = true;
            }
            if (z7 && c0174d.f620X != 8 && c0174d.f643u.f583d == null && c0174d.f645w.f583d == null) {
                c0184e2.m364a(c0184e2.m358a(c0174d.f603F.f645w), a2, 0, 1);
            }
            if (z && c0174d.f620X != 8 && c0174d.f644v.f583d == null && c0174d.f646x.f583d == null && c0174d.f647y == null) {
                c0184e2.m364a(c0184e2.m358a(c0174d.f603F.f646x), a4, 0, 1);
            }
            z2 = z;
            z3 = z5;
            z4 = z6;
            z = z7;
        } else {
            z = false;
            z3 = z;
            z2 = z3;
            z4 = z2;
        }
        int i4 = c0174d.f604G;
        if (i4 < c0174d.f613P) {
            i4 = c0174d.f613P;
        }
        int i5 = c0174d.f605H;
        if (i5 < c0174d.f614Q) {
            i5 = c0174d.f614Q;
        }
        int i6 = c0174d.f602E[0] != C0173a.f594c ? 1 : 0;
        int i7 = c0174d.f602E[1] != C0173a.f594c ? 1 : 0;
        c0174d.f639q = c0174d.f607J;
        c0174d.f640r = c0174d.f606I;
        if (c0174d.f606I <= 0.0f || c0174d.f620X == 8) {
            i = i4;
            i2 = i5;
            i3 = 0;
        } else {
            if (c0174d.f602E[0] == C0173a.f594c && c0174d.f602E[1] == C0173a.f594c) {
                if (c0174d.f629g == 0) {
                    c0174d.f629g = 3;
                }
                if (c0174d.f630h == 0) {
                    c0174d.f630h = 3;
                }
                if (c0174d.f639q == -1) {
                    if (i6 != 0 && i7 == 0) {
                        c0174d.f639q = 0;
                    } else if (i6 == 0 && i7 != 0) {
                        c0174d.f639q = 1;
                        if (c0174d.f607J == -1) {
                            c0174d.f640r = BallPulseIndicator.SCALE / c0174d.f640r;
                        }
                    }
                }
                if (c0174d.f639q == 0 && (!c0174d.f644v.m276d() || !c0174d.f646x.m276d())) {
                    c0174d.f639q = 1;
                } else if (c0174d.f639q == 1 && !(c0174d.f643u.m276d() && c0174d.f645w.m276d())) {
                    c0174d.f639q = 0;
                }
                if (c0174d.f639q == -1 && !(c0174d.f644v.m276d() && c0174d.f646x.m276d() && c0174d.f643u.m276d() && c0174d.f645w.m276d())) {
                    if (c0174d.f644v.m276d() && c0174d.f646x.m276d()) {
                        c0174d.f639q = 0;
                    } else if (c0174d.f643u.m276d() && c0174d.f645w.m276d()) {
                        c0174d.f640r = BallPulseIndicator.SCALE / c0174d.f640r;
                        c0174d.f639q = 1;
                    }
                }
                if (c0174d.f639q == -1) {
                    if (z && !z2) {
                        c0174d.f639q = 0;
                    } else if (!z && z2) {
                        c0174d.f640r = BallPulseIndicator.SCALE / c0174d.f640r;
                        c0174d.f639q = 1;
                    }
                }
                if (c0174d.f639q == -1) {
                    if (c0174d.f631i <= 0 || c0174d.f634l != 0) {
                        c0174d.f640r = BallPulseIndicator.SCALE / c0174d.f640r;
                        c0174d.f639q = 1;
                    } else {
                        c0174d.f639q = 0;
                    }
                }
            } else if (c0174d.f602E[0] == C0173a.f594c) {
                c0174d.f639q = 0;
                i4 = (int) (c0174d.f640r * ((float) c0174d.f605H));
            } else if (c0174d.f602E[1] == C0173a.f594c) {
                c0174d.f639q = 1;
                if (c0174d.f607J == -1) {
                    c0174d.f640r = BallPulseIndicator.SCALE / c0174d.f640r;
                }
                i = i4;
                i2 = (int) (c0174d.f640r * ((float) c0174d.f604G));
                i3 = 1;
            }
            i = i4;
            i2 = i5;
            i3 = 1;
        }
        boolean z8 = i3 != 0 && (c0174d.f639q == 0 || c0174d.f639q == -1);
        boolean z9 = c0174d.f602E[0] == C0173a.f593b && (c0174d instanceof C6337e);
        boolean d = c0174d.f599B.m276d() ^ 1;
        if (c0174d.f625c != 2) {
            c0189h = a5;
            c0189h2 = a4;
            c0189h3 = a3;
            c0189h4 = a2;
            m278a(c0184e2, z, c0174d.f603F != null ? c0184e2.m358a(c0174d.f603F.f643u) : null, c0174d.f603F != null ? c0184e2.m358a(c0174d.f603F.f645w) : null, c0174d.f602E[0], z9, c0174d.f643u, c0174d.f645w, c0174d.f608K, i, c0174d.f613P, c0174d.f641s[0], c0174d.f617U, z8, z3, c0174d.f629g, c0174d.f631i, c0174d.f632j, c0174d.f633k, d);
            c0174d = this;
        } else {
            c0189h = a5;
            c0189h2 = a4;
            c0189h3 = a3;
            c0189h4 = a2;
        }
        if (c0174d.f626d != 2) {
            C0184e c0184e3;
            C0189h c0189h5;
            boolean z10;
            int i8;
            C0189h c0189h6;
            float f;
            C0174d c0174d2;
            C0184e c0184e4;
            C0189h c0189h7;
            C0189h c0189h8;
            C0189h c0189h9;
            C0174d c0174d3;
            float toRadians;
            int b;
            C0184e c0184e5;
            C0189h a6;
            C0189h a7;
            C0189h a8;
            C4705b c;
            double d2;
            double d3;
            C0189h c0189h10;
            z9 = c0174d.f602E[1] == C0173a.f593b && (c0174d instanceof C6337e);
            z3 = i3 != 0 && (c0174d.f639q == 1 || c0174d.f639q == -1);
            if (c0174d.f612O <= 0) {
                a3 = c0189h3;
                c0184e3 = c0184e;
            } else if (c0174d.f647y.f580a.i == 1) {
                c0184e3 = c0184e;
                c0174d.f647y.f580a.m8601a(c0184e3);
                a3 = c0189h3;
            } else {
                c0184e3 = c0184e;
                c0189h5 = c0189h;
                a3 = c0189h3;
                c0184e3.m369c(c0189h5, a3, c0174d.f612O, 6);
                if (c0174d.f647y.f583d != null) {
                    c0184e3.m369c(c0189h5, c0184e3.m358a(c0174d.f647y.f583d), 0, 6);
                    z10 = false;
                    i8 = i2;
                    c0189h6 = a3;
                    c0174d.m278a(c0184e3, z2, c0174d.f603F == null ? c0184e3.m358a(c0174d.f603F.f644v) : null, c0174d.f603F == null ? c0184e3.m358a(c0174d.f603F.f646x) : null, c0174d.f602E[1], z9, c0174d.f644v, c0174d.f646x, c0174d.f609L, i8, c0174d.f614Q, c0174d.f641s[1], c0174d.f618V, z3, z4, c0174d.f630h, c0174d.f634l, c0174d.f635m, c0174d.f636n, z10);
                    if (i3 == 0) {
                        if (this.f639q != 1) {
                            f = c0174d2.f640r;
                            c0184e4 = c0184e;
                            c0189h7 = c0189h2;
                            c0189h5 = c0189h6;
                            c0189h8 = c0189h4;
                            c0189h9 = a;
                        } else {
                            f = c0174d2.f640r;
                            c0184e4 = c0184e;
                            c0189h7 = c0189h4;
                            c0189h5 = a;
                            c0189h8 = c0189h2;
                            c0189h9 = c0189h6;
                        }
                        c0184e4.m365a(c0189h7, c0189h5, c0189h8, c0189h9, f);
                    } else {
                        c0174d2 = this;
                    }
                    if (c0174d2.f599B.m276d()) {
                        c0174d3 = c0174d2.f599B.f583d.f581b;
                        toRadians = (float) Math.toRadians((double) (c0174d2.f642t + 90.0f));
                        b = c0174d2.f599B.m274b();
                        c0184e5 = c0184e;
                        a6 = c0184e5.m358a(c0174d2.mo51a(C0170c.LEFT));
                        a5 = c0184e5.m358a(c0174d2.mo51a(C0170c.TOP));
                        c0189h8 = c0184e5.m358a(c0174d2.mo51a(C0170c.RIGHT));
                        a4 = c0184e5.m358a(c0174d2.mo51a(C0170c.BOTTOM));
                        a7 = c0184e5.m358a(c0174d3.mo51a(C0170c.LEFT));
                        a3 = c0184e5.m358a(c0174d3.mo51a(C0170c.TOP));
                        a8 = c0184e5.m358a(c0174d3.mo51a(C0170c.RIGHT));
                        a2 = c0184e5.m358a(c0174d3.mo51a(C0170c.BOTTOM));
                        c = c0184e.m368c();
                        d2 = (double) toRadians;
                        d3 = (double) b;
                        c0189h10 = a8;
                        c.m8625b(a5, a4, a3, a2, (float) (Math.sin(d2) * d3));
                        c0184e5.m359a(c);
                        c = c0184e.m368c();
                        c.m8625b(a6, c0189h8, a7, c0189h10, (float) (Math.cos(d2) * d3));
                        c0184e5.m359a(c);
                    }
                }
            }
            z10 = d;
            if (c0174d.f603F == null) {
            }
            if (c0174d.f603F == null) {
            }
            i8 = i2;
            c0189h6 = a3;
            c0174d.m278a(c0184e3, z2, c0174d.f603F == null ? c0184e3.m358a(c0174d.f603F.f644v) : null, c0174d.f603F == null ? c0184e3.m358a(c0174d.f603F.f646x) : null, c0174d.f602E[1], z9, c0174d.f644v, c0174d.f646x, c0174d.f609L, i8, c0174d.f614Q, c0174d.f641s[1], c0174d.f618V, z3, z4, c0174d.f630h, c0174d.f634l, c0174d.f635m, c0174d.f636n, z10);
            if (i3 == 0) {
                c0174d2 = this;
            } else {
                if (this.f639q != 1) {
                    f = c0174d2.f640r;
                    c0184e4 = c0184e;
                    c0189h7 = c0189h4;
                    c0189h5 = a;
                    c0189h8 = c0189h2;
                    c0189h9 = c0189h6;
                } else {
                    f = c0174d2.f640r;
                    c0184e4 = c0184e;
                    c0189h7 = c0189h2;
                    c0189h5 = c0189h6;
                    c0189h8 = c0189h4;
                    c0189h9 = a;
                }
                c0184e4.m365a(c0189h7, c0189h5, c0189h8, c0189h9, f);
            }
            if (c0174d2.f599B.m276d()) {
                c0174d3 = c0174d2.f599B.f583d.f581b;
                toRadians = (float) Math.toRadians((double) (c0174d2.f642t + 90.0f));
                b = c0174d2.f599B.m274b();
                c0184e5 = c0184e;
                a6 = c0184e5.m358a(c0174d2.mo51a(C0170c.LEFT));
                a5 = c0184e5.m358a(c0174d2.mo51a(C0170c.TOP));
                c0189h8 = c0184e5.m358a(c0174d2.mo51a(C0170c.RIGHT));
                a4 = c0184e5.m358a(c0174d2.mo51a(C0170c.BOTTOM));
                a7 = c0184e5.m358a(c0174d3.mo51a(C0170c.LEFT));
                a3 = c0184e5.m358a(c0174d3.mo51a(C0170c.TOP));
                a8 = c0184e5.m358a(c0174d3.mo51a(C0170c.RIGHT));
                a2 = c0184e5.m358a(c0174d3.mo51a(C0170c.BOTTOM));
                c = c0184e.m368c();
                d2 = (double) toRadians;
                d3 = (double) b;
                c0189h10 = a8;
                c.m8625b(a5, a4, a3, a2, (float) (Math.sin(d2) * d3));
                c0184e5.m359a(c);
                c = c0184e.m368c();
                c.m8625b(a6, c0189h8, a7, c0189h10, (float) (Math.cos(d2) * d3));
                c0184e5.m359a(c);
            }
        }
    }

    public final void m285a(java.lang.String r9) {
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
        r8 = this;
        r0 = 0;
        if (r9 == 0) goto L_0x008e;
    L_0x0003:
        r1 = r9.length();
        if (r1 != 0) goto L_0x000b;
    L_0x0009:
        goto L_0x008e;
    L_0x000b:
        r1 = -1;
        r2 = r9.length();
        r3 = 44;
        r3 = r9.indexOf(r3);
        r4 = 0;
        r5 = 1;
        if (r3 <= 0) goto L_0x0037;
    L_0x001a:
        r6 = r2 + -1;
        if (r3 >= r6) goto L_0x0037;
    L_0x001e:
        r6 = r9.substring(r4, r3);
        r7 = "W";
        r7 = r6.equalsIgnoreCase(r7);
        if (r7 == 0) goto L_0x002c;
    L_0x002a:
        r1 = r4;
        goto L_0x0035;
    L_0x002c:
        r4 = "H";
        r4 = r6.equalsIgnoreCase(r4);
        if (r4 == 0) goto L_0x0035;
    L_0x0034:
        r1 = r5;
    L_0x0035:
        r4 = r3 + 1;
    L_0x0037:
        r3 = 58;
        r3 = r9.indexOf(r3);
        if (r3 < 0) goto L_0x0075;
    L_0x003f:
        r2 = r2 - r5;
        if (r3 >= r2) goto L_0x0075;
    L_0x0042:
        r2 = r9.substring(r4, r3);
        r3 = r3 + r5;
        r9 = r9.substring(r3);
        r3 = r2.length();
        if (r3 <= 0) goto L_0x0084;
    L_0x0051:
        r3 = r9.length();
        if (r3 <= 0) goto L_0x0084;
    L_0x0057:
        r2 = java.lang.Float.parseFloat(r2);	 Catch:{ NumberFormatException -> 0x0084 }
        r9 = java.lang.Float.parseFloat(r9);	 Catch:{ NumberFormatException -> 0x0084 }
        r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));	 Catch:{ NumberFormatException -> 0x0084 }
        if (r3 <= 0) goto L_0x0084;	 Catch:{ NumberFormatException -> 0x0084 }
    L_0x0063:
        r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));	 Catch:{ NumberFormatException -> 0x0084 }
        if (r3 <= 0) goto L_0x0084;	 Catch:{ NumberFormatException -> 0x0084 }
    L_0x0067:
        if (r1 != r5) goto L_0x006f;	 Catch:{ NumberFormatException -> 0x0084 }
    L_0x0069:
        r9 = r9 / r2;	 Catch:{ NumberFormatException -> 0x0084 }
        r9 = java.lang.Math.abs(r9);	 Catch:{ NumberFormatException -> 0x0084 }
        goto L_0x0085;	 Catch:{ NumberFormatException -> 0x0084 }
    L_0x006f:
        r2 = r2 / r9;	 Catch:{ NumberFormatException -> 0x0084 }
        r9 = java.lang.Math.abs(r2);	 Catch:{ NumberFormatException -> 0x0084 }
        goto L_0x0085;
    L_0x0075:
        r9 = r9.substring(r4);
        r2 = r9.length();
        if (r2 <= 0) goto L_0x0084;
    L_0x007f:
        r9 = java.lang.Float.parseFloat(r9);	 Catch:{ NumberFormatException -> 0x0084 }
        goto L_0x0085;
    L_0x0084:
        r9 = r0;
    L_0x0085:
        r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x008d;
    L_0x0089:
        r8.f606I = r9;
        r8.f607J = r1;
    L_0x008d:
        return;
    L_0x008e:
        r8.f606I = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.a.a.d.a(java.lang.String):void");
    }

    public boolean mo54a() {
        return this.f620X != 8;
    }

    public void mo2501b() {
        for (int i = 0; i < 6; i++) {
            this.f600C[i].f580a.mo58b();
        }
    }

    public final void m288b(int i) {
        this.f608K = i;
    }

    public void mo60b(int i, int i2) {
        this.f610M = i;
        this.f611N = i2;
    }

    public void mo2502c() {
    }

    public final void m291c(int i) {
        this.f609L = i;
    }

    public final void m292c(int i, int i2) {
        this.f608K = i;
        this.f604G = i2 - i;
        if (this.f604G < this.f613P) {
            this.f604G = this.f613P;
        }
    }

    public final void m293d(int i) {
        this.f604G = i;
        if (this.f604G < this.f613P) {
            this.f604G = this.f613P;
        }
    }

    public final void m294d(int i, int i2) {
        this.f609L = i;
        this.f605H = i2 - i;
        if (this.f605H < this.f614Q) {
            this.f605H = this.f614Q;
        }
    }

    public final boolean m295d() {
        return this.f629g == 0 && this.f606I == 0.0f && this.f631i == 0 && this.f632j == 0 && this.f602E[0] == C0173a.f594c;
    }

    public final void m296e(int i) {
        this.f605H = i;
        if (this.f605H < this.f614Q) {
            this.f605H = this.f614Q;
        }
    }

    public final boolean m297e() {
        return this.f630h == 0 && this.f606I == 0.0f && this.f634l == 0 && this.f635m == 0 && this.f602E[1] == C0173a.f594c;
    }

    public void mo61f() {
        this.f643u.m275c();
        this.f644v.m275c();
        this.f645w.m275c();
        this.f646x.m275c();
        this.f647y.m275c();
        this.f648z.m275c();
        this.f598A.m275c();
        this.f599B.m275c();
        this.f603F = null;
        this.f642t = 0.0f;
        this.f604G = 0;
        this.f605H = 0;
        this.f606I = 0.0f;
        this.f607J = -1;
        this.f608K = 0;
        this.f609L = 0;
        this.f623a = 0;
        this.f624b = 0;
        this.ak = 0;
        this.al = 0;
        this.f610M = 0;
        this.f611N = 0;
        this.f612O = 0;
        this.f613P = 0;
        this.f614Q = 0;
        this.f615R = 0;
        this.f616S = 0;
        this.f617U = f597T;
        this.f618V = f597T;
        this.f602E[0] = C0173a.f592a;
        this.f602E[1] = C0173a.f592a;
        this.f619W = null;
        this.am = 0;
        this.f620X = 0;
        this.an = null;
        this.f622Z = false;
        this.aa = false;
        this.ab = 0;
        this.ac = 0;
        this.ad = false;
        this.ae = false;
        this.af[0] = 0.0f;
        this.af[1] = 0.0f;
        this.f625c = -1;
        this.f626d = -1;
        this.f641s[0] = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f641s[1] = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f629g = 0;
        this.f630h = 0;
        this.f633k = BallPulseIndicator.SCALE;
        this.f636n = BallPulseIndicator.SCALE;
        this.f632j = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f635m = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f631i = 0;
        this.f634l = 0;
        this.f639q = -1;
        this.f640r = BallPulseIndicator.SCALE;
        if (this.f627e != null) {
            this.f627e.mo58b();
        }
        if (this.f628f != null) {
            this.f628f.mo58b();
        }
    }

    public final void m299f(int i) {
        if (i < 0) {
            this.f613P = 0;
        } else {
            this.f613P = i;
        }
    }

    public final void m300g() {
        for (int i = 0; i < 6; i++) {
            C4702j c4702j = this.f600C[i].f580a;
            C0171c c0171c = c4702j.f12915a.f583d;
            if (c0171c != null) {
                if (c0171c.f583d == c4702j.f12915a) {
                    c4702j.f12921g = 4;
                    c0171c.f580a.f12921g = 4;
                }
                int b = c4702j.f12915a.m274b();
                if (c4702j.f12915a.f582c == C0170c.RIGHT || c4702j.f12915a.f582c == C0170c.BOTTOM) {
                    b = -b;
                }
                c4702j.m8604b(c0171c.f580a, b);
            }
        }
    }

    public final void m301g(int i) {
        if (i < 0) {
            this.f614Q = 0;
        } else {
            this.f614Q = i;
        }
    }

    public final C4703k m302h() {
        if (this.f627e == null) {
            this.f627e = new C4703k();
        }
        return this.f627e;
    }

    public final void m303h(int i) {
        this.f602E[0] = i;
        if (i == C0173a.f593b) {
            m293d(this.f615R);
        }
    }

    public final C4703k m304i() {
        if (this.f628f == null) {
            this.f628f = new C4703k();
        }
        return this.f628f;
    }

    public final void m305i(int i) {
        this.f602E[1] = i;
        if (i == C0173a.f593b) {
            m296e(this.f616S);
        }
    }

    public final int m306j() {
        return this.f608K;
    }

    public final int m307k() {
        return this.f609L;
    }

    public final int m308l() {
        return this.f620X == 8 ? 0 : this.f604G;
    }

    public final int m309m() {
        return this.f620X == 8 ? 0 : this.f605H;
    }

    public final int m310n() {
        return this.f623a + this.f610M;
    }

    public final int m311o() {
        return this.f624b + this.f611N;
    }

    protected final int m312p() {
        return this.f608K + this.f610M;
    }

    protected final int m313q() {
        return this.f609L + this.f611N;
    }

    public final int m314r() {
        return this.f608K + this.f604G;
    }

    public final int m315s() {
        return this.f609L + this.f605H;
    }

    public final boolean m316t() {
        return this.f612O > 0;
    }

    public String toString() {
        String stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        if (this.an != null) {
            StringBuilder stringBuilder3 = new StringBuilder("type: ");
            stringBuilder3.append(this.an);
            stringBuilder3.append(" ");
            stringBuilder = stringBuilder3.toString();
        } else {
            stringBuilder = "";
        }
        stringBuilder2.append(stringBuilder);
        if (this.f621Y != null) {
            stringBuilder3 = new StringBuilder("id: ");
            stringBuilder3.append(this.f621Y);
            stringBuilder3.append(" ");
            stringBuilder = stringBuilder3.toString();
        } else {
            stringBuilder = "";
        }
        stringBuilder2.append(stringBuilder);
        stringBuilder2.append("(");
        stringBuilder2.append(this.f608K);
        stringBuilder2.append(", ");
        stringBuilder2.append(this.f609L);
        stringBuilder2.append(") - (");
        stringBuilder2.append(this.f604G);
        stringBuilder2.append(" x ");
        stringBuilder2.append(this.f605H);
        stringBuilder2.append(") wrap: (");
        stringBuilder2.append(this.f615R);
        stringBuilder2.append(" x ");
        stringBuilder2.append(this.f616S);
        stringBuilder2.append(")");
        return stringBuilder2.toString();
    }

    public ArrayList<C0171c> mo55u() {
        return this.f601D;
    }

    public void mo62v() {
        int i = this.f608K;
        int i2 = this.f609L;
        int i3 = this.f608K + this.f604G;
        int i4 = this.f609L + this.f605H;
        this.f623a = i;
        this.f624b = i2;
        this.ak = i3 - i;
        this.al = i4 - i2;
    }

    public final void m319w() {
        int size = this.f601D.size();
        for (int i = 0; i < size; i++) {
            ((C0171c) this.f601D.get(i)).m275c();
        }
    }

    public final int m320x() {
        return this.f602E[0];
    }

    public final int m321y() {
        return this.f602E[1];
    }

    public void mo56z() {
        int b = C0184e.m351b(this.f643u);
        int b2 = C0184e.m351b(this.f644v);
        int b3 = C0184e.m351b(this.f645w) - b;
        int b4 = C0184e.m351b(this.f646x) - b2;
        this.f608K = b;
        this.f609L = b2;
        if (this.f620X == 8) {
            this.f604G = 0;
            this.f605H = 0;
            return;
        }
        if (this.f602E[0] == C0173a.f592a && b3 < this.f604G) {
            b3 = this.f604G;
        }
        if (this.f602E[1] == C0173a.f592a && b4 < this.f605H) {
            b4 = this.f605H;
        }
        this.f604G = b3;
        this.f605H = b4;
        if (this.f605H < this.f614Q) {
            this.f605H = this.f614Q;
        }
        if (this.f604G < this.f613P) {
            this.f604G = this.f613P;
        }
    }
}
