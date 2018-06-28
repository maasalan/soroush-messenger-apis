package com.p085c.p086a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.p085c.p086a.p089c.C5255m;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p089c.p098d.p099a.C1186l;
import com.p085c.p086a.p089c.p098d.p099a.C7034h;
import com.p085c.p086a.p089c.p098d.p099a.C7037n;
import com.p085c.p086a.p102d.C1222n;
import com.p085c.p086a.p105g.C1244b;
import com.p085c.p086a.p105g.C1245c;
import com.p085c.p086a.p105g.C1247e;
import com.p085c.p086a.p105g.C1248f;
import com.p085c.p086a.p105g.C5270h;
import com.p085c.p086a.p105g.C5271i;
import com.p085c.p086a.p105g.C6462a;
import com.p085c.p086a.p105g.C7040d;
import com.p085c.p086a.p105g.p106a.C5266h;
import com.p085c.p086a.p105g.p106a.C7408b;
import com.p085c.p086a.p105g.p106a.C7409c;
import com.p085c.p086a.p108h.C1253a;
import com.p085c.p086a.p109i.C1271h;
import com.p085c.p086a.p109i.C1273i;

public final class C1274i<TranscodeType> implements Cloneable {
    protected static final C1248f f3983a = new C1248f().m2955b(C1144h.f3691c).m2952a(C1251g.LOW).m2956c();
    private static final C1277k<?, ?> f3984e = new C5101b();
    protected C1248f f3985b;
    public C1247e<TranscodeType> f3986c;
    public C1274i<TranscodeType> f3987d;
    private final C1227e f3988f;
    private final C5284j f3989g;
    private final Class<TranscodeType> f3990h;
    private final C1248f f3991i;
    private final C1212c f3992j;
    private C1277k<?, ? super TranscodeType> f3993k = f3984e;
    private Object f3994l;
    private Float f3995m;
    private boolean f3996n;
    private boolean f3997o;

    static /* synthetic */ class C12562 {
        static final /* synthetic */ int[] f3957a = new int[ScaleType.values().length];

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
            r0 = com.p085c.p086a.C1251g.values();
            r0 = r0.length;
            r0 = new int[r0];
            f3958b = r0;
            r0 = 1;
            r1 = f3958b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = com.p085c.p086a.C1251g.LOW;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = f3958b;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = com.p085c.p086a.C1251g.NORMAL;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = f3958b;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = com.p085c.p086a.C1251g.HIGH;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = 4;
            r4 = f3958b;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = com.p085c.p086a.C1251g.IMMEDIATE;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r4 = android.widget.ImageView.ScaleType.values();
            r4 = r4.length;
            r4 = new int[r4];
            f3957a = r4;
            r4 = f3957a;	 Catch:{ NoSuchFieldError -> 0x0048 }
            r5 = android.widget.ImageView.ScaleType.CENTER_CROP;	 Catch:{ NoSuchFieldError -> 0x0048 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0048 }
            r4[r5] = r0;	 Catch:{ NoSuchFieldError -> 0x0048 }
        L_0x0048:
            r0 = f3957a;	 Catch:{ NoSuchFieldError -> 0x0052 }
            r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE;	 Catch:{ NoSuchFieldError -> 0x0052 }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x0052 }
            r0[r4] = r1;	 Catch:{ NoSuchFieldError -> 0x0052 }
        L_0x0052:
            r0 = f3957a;	 Catch:{ NoSuchFieldError -> 0x005c }
            r1 = android.widget.ImageView.ScaleType.FIT_CENTER;	 Catch:{ NoSuchFieldError -> 0x005c }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x005c }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x005c }
        L_0x005c:
            r0 = f3957a;	 Catch:{ NoSuchFieldError -> 0x0066 }
            r1 = android.widget.ImageView.ScaleType.FIT_START;	 Catch:{ NoSuchFieldError -> 0x0066 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0066 }
            r0[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x0066 }
        L_0x0066:
            r0 = f3957a;	 Catch:{ NoSuchFieldError -> 0x0071 }
            r1 = android.widget.ImageView.ScaleType.FIT_END;	 Catch:{ NoSuchFieldError -> 0x0071 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0071 }
            r2 = 5;	 Catch:{ NoSuchFieldError -> 0x0071 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0071 }
        L_0x0071:
            r0 = f3957a;	 Catch:{ NoSuchFieldError -> 0x007c }
            r1 = android.widget.ImageView.ScaleType.FIT_XY;	 Catch:{ NoSuchFieldError -> 0x007c }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x007c }
            r2 = 6;	 Catch:{ NoSuchFieldError -> 0x007c }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x007c }
        L_0x007c:
            r0 = f3957a;	 Catch:{ NoSuchFieldError -> 0x0087 }
            r1 = android.widget.ImageView.ScaleType.CENTER;	 Catch:{ NoSuchFieldError -> 0x0087 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0087 }
            r2 = 7;	 Catch:{ NoSuchFieldError -> 0x0087 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0087 }
        L_0x0087:
            r0 = f3957a;	 Catch:{ NoSuchFieldError -> 0x0093 }
            r1 = android.widget.ImageView.ScaleType.MATRIX;	 Catch:{ NoSuchFieldError -> 0x0093 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0093 }
            r2 = 8;	 Catch:{ NoSuchFieldError -> 0x0093 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0093 }
        L_0x0093:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.c.a.i.2.<clinit>():void");
        }
    }

    protected C1274i(C1212c c1212c, C5284j c5284j, Class<TranscodeType> cls) {
        this.f3992j = c1212c;
        this.f3989g = c5284j;
        this.f3988f = c1212c.f3832c;
        this.f3990h = cls;
        this.f3991i = c5284j.f14653e;
        this.f3985b = this.f3991i;
    }

    private C1244b m3028a(C5266h<TranscodeType> c5266h, C1248f c1248f, C1245c c1245c, C1277k<?, ? super TranscodeType> c1277k, C1251g c1251g, int i, int i2) {
        C1248f c1248f2 = c1248f;
        c1248f2.f3925t = true;
        return C5270h.m10903a(this.f3988f, this.f3994l, this.f3990h, c1248f2, i, i2, c1251g, c5266h, this.f3986c, c1245c, this.f3988f.f3876d, c1277k.f4001a);
    }

    private C1244b m3029a(C5266h<TranscodeType> c5266h, C5271i c5271i, C1277k<?, ? super TranscodeType> c1277k, C1251g c1251g, int i, int i2) {
        C5271i c5271i2 = c5271i;
        C1251g c1251g2 = c1251g;
        if (this.f3987d != null) {
            if (r8.f3997o) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            C1277k c1277k2 = r8.f3987d.f3993k;
            C1277k c1277k3 = f3984e.equals(c1277k2) ? c1277k : c1277k2;
            C1251g a = r8.f3987d.f3985b.m2957c(8) ? r8.f3987d.f3985b.f3909d : m3030a(c1251g2);
            int i3 = r8.f3987d.f3985b.f3916k;
            int i4 = r8.f3987d.f3985b.f3915j;
            if (C1273i.m3022a(i, i2)) {
                C1248f c1248f = r8.f3987d.f3985b;
                if (!C1273i.m3022a(c1248f.f3916k, c1248f.f3915j)) {
                    i3 = r8.f3985b.f3916k;
                    i4 = r8.f3985b.f3915j;
                }
            }
            int i5 = i3;
            int i6 = i4;
            C5271i c5271i3 = new C5271i(c5271i2);
            C1244b a2 = m3028a(c5266h, r8.f3985b, c5271i3, c1277k, c1251g2, i, i2);
            r8.f3997o = true;
            C5271i c5271i4 = c5271i3;
            C1244b a3 = r8.f3987d.m3029a(c5266h, c5271i3, c1277k3, a, i5, i6);
            r8.f3997o = false;
            c5271i4.m10925a(a2, a3);
            return c5271i4;
        } else if (r8.f3995m != null) {
            C1244b c5271i5 = new C5271i(c5271i2);
            C1244b c1244b = c5271i5;
            C1277k<?, ? super TranscodeType> c1277k4 = c1277k;
            int i7 = i;
            int i8 = i2;
            c5271i5.m10925a(m3028a(c5266h, r8.f3985b, c1244b, c1277k4, c1251g2, i7, i8), m3028a(c5266h, r8.f3985b.m2958d().m2948a(r8.f3995m.floatValue()), c1244b, c1277k4, m3030a(c1251g2), i7, i8));
            return c5271i5;
        } else {
            return m3028a(c5266h, r8.f3985b, c5271i2, c1277k, c1251g2, i, i2);
        }
    }

    private C1251g m3030a(C1251g c1251g) {
        switch (c1251g) {
            case LOW:
                return C1251g.NORMAL;
            case NORMAL:
                return C1251g.HIGH;
            case HIGH:
            case IMMEDIATE:
                return C1251g.IMMEDIATE;
            default:
                StringBuilder stringBuilder = new StringBuilder("unknown priority: ");
                stringBuilder.append(this.f3985b.f3909d);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public final C5266h<TranscodeType> m3031a(ImageView imageView) {
        C5266h c7408b;
        C1273i.m3021a();
        C1271h.m3012a((Object) imageView, "Argument must not be null");
        if (!(this.f3985b.m2957c(2048) || !this.f3985b.f3919n || imageView.getScaleType() == null)) {
            C1248f c1248f;
            C1186l c1186l;
            C5255m c7034h;
            if (this.f3985b.f3925t) {
                this.f3985b = this.f3985b.m2958d();
            }
            switch (C12562.f3957a[imageView.getScaleType().ordinal()]) {
                case 1:
                    c1248f = this.f3985b;
                    c1186l = C1186l.f3761b;
                    c7034h = new C7034h();
                    break;
                case 2:
                case 6:
                    this.f3985b.m2961g();
                    break;
                case 3:
                case 4:
                case 5:
                    c1248f = this.f3985b;
                    c1186l = C1186l.f3760a;
                    c7034h = new C7037n();
                    break;
                default:
                    break;
            }
            c1248f.m2950a(c1186l, c7034h);
        }
        Class cls = this.f3990h;
        if (Bitmap.class.equals(cls)) {
            c7408b = new C7408b(imageView);
        } else if (Drawable.class.isAssignableFrom(cls)) {
            c7408b = new C7409c(imageView);
        } else {
            StringBuilder stringBuilder = new StringBuilder("Unhandled class: ");
            stringBuilder.append(cls);
            stringBuilder.append(", try .as*(Class).transcode(ResourceTranscoder)");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return m3032a(c7408b);
    }

    public final <Y extends C5266h<TranscodeType>> Y m3032a(Y y) {
        C1273i.m3021a();
        C1271h.m3012a((Object) y, "Argument must not be null");
        if (this.f3996n) {
            if (y.mo2698a() != null) {
                this.f3989g.m10954a((C5266h) y);
            }
            this.f3985b.f3925t = true;
            C1244b a = m3029a(y, null, this.f3993k, this.f3985b.f3909d, this.f3985b.f3916k, this.f3985b.f3915j);
            y.mo2700a(a);
            C5284j c5284j = this.f3989g;
            c5284j.f14652d.f14607a.add(y);
            C1222n c1222n = c5284j.f14651c;
            c1222n.f3857a.add(a);
            if (c1222n.f3859c) {
                c1222n.f3858b.add(a);
                return y;
            }
            a.mo1231a();
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public final C1274i<TranscodeType> m3033a() {
        this.f3995m = Float.valueOf(0.25f);
        return this;
    }

    public final com.p085c.p086a.C1274i<TranscodeType> m3034a(com.p085c.p086a.p105g.C1248f r4) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r3 = this;
        r0 = "Argument must not be null";
        com.p085c.p086a.p109i.C1271h.m3012a(r4, r0);
        r0 = r3.f3991i;
        r1 = r3.f3985b;
        if (r0 != r1) goto L_0x000e;
    L_0x000b:
        r0 = r3.f3985b;
        goto L_0x0014;
    L_0x000e:
        r0 = r3.f3985b;
    L_0x0010:
        r1 = r0.f3927v;
        if (r1 == 0) goto L_0x0019;
    L_0x0014:
        r0 = r0.m2958d();
        goto L_0x0010;
    L_0x0019:
        r1 = r4.f3906a;
        r2 = 2;
        r1 = com.p085c.p086a.p105g.C1248f.m2944a(r1, r2);
        if (r1 == 0) goto L_0x0026;
    L_0x0022:
        r1 = r4.f3907b;
        r0.f3907b = r1;
    L_0x0026:
        r1 = r4.f3906a;
        r2 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        r1 = com.p085c.p086a.p105g.C1248f.m2944a(r1, r2);
        if (r1 == 0) goto L_0x0034;
    L_0x0030:
        r1 = r4.f3928w;
        r0.f3928w = r1;
    L_0x0034:
        r1 = r4.f3906a;
        r2 = 4;
        r1 = com.p085c.p086a.p105g.C1248f.m2944a(r1, r2);
        if (r1 == 0) goto L_0x0041;
    L_0x003d:
        r1 = r4.f3908c;
        r0.f3908c = r1;
    L_0x0041:
        r1 = r4.f3906a;
        r2 = 8;
        r1 = com.p085c.p086a.p105g.C1248f.m2944a(r1, r2);
        if (r1 == 0) goto L_0x004f;
    L_0x004b:
        r1 = r4.f3909d;
        r0.f3909d = r1;
    L_0x004f:
        r1 = r4.f3906a;
        r2 = 16;
        r1 = com.p085c.p086a.p105g.C1248f.m2944a(r1, r2);
        if (r1 == 0) goto L_0x005d;
    L_0x0059:
        r1 = r4.f3910e;
        r0.f3910e = r1;
    L_0x005d:
        r1 = r4.f3906a;
        r2 = 32;
        r1 = com.p085c.p086a.p105g.C1248f.m2944a(r1, r2);
        if (r1 == 0) goto L_0x006b;
    L_0x0067:
        r1 = r4.f3911f;
        r0.f3911f = r1;
    L_0x006b:
        r1 = r4.f3906a;
        r2 = 64;
        r1 = com.p085c.p086a.p105g.C1248f.m2944a(r1, r2);
        if (r1 == 0) goto L_0x0079;
    L_0x0075:
        r1 = r4.f3912g;
        r0.f3912g = r1;
    L_0x0079:
        r1 = r4.f3906a;
        r2 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r1 = com.p085c.p086a.p105g.C1248f.m2944a(r1, r2);
        if (r1 == 0) goto L_0x0087;
    L_0x0083:
        r1 = r4.f3913h;
        r0.f3913h = r1;
    L_0x0087:
        r1 = r4.f3906a;
        r2 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r1 = com.p085c.p086a.p105g.C1248f.m2944a(r1, r2);
        if (r1 == 0) goto L_0x0095;
    L_0x0091:
        r1 = r4.f3914i;
        r0.f3914i = r1;
    L_0x0095:
        r1 = r4.f3906a;
        r2 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r1 = com.p085c.p086a.p105g.C1248f.m2944a(r1, r2);
        if (r1 == 0) goto L_0x00a7;
    L_0x009f:
        r1 = r4.f3916k;
        r0.f3916k = r1;
        r1 = r4.f3915j;
        r0.f3915j = r1;
    L_0x00a7:
        r1 = r4.f3906a;
        r2 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r1 = com.p085c.p086a.p105g.C1248f.m2944a(r1, r2);
        if (r1 == 0) goto L_0x00b5;
    L_0x00b1:
        r1 = r4.f3917l;
        r0.f3917l = r1;
    L_0x00b5:
        r1 = r4.f3906a;
        r2 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r1 = com.p085c.p086a.p105g.C1248f.m2944a(r1, r2);
        if (r1 == 0) goto L_0x00c3;
    L_0x00bf:
        r1 = r4.f3924s;
        r0.f3924s = r1;
    L_0x00c3:
        r1 = r4.f3906a;
        r2 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r1 = com.p085c.p086a.p105g.C1248f.m2944a(r1, r2);
        if (r1 == 0) goto L_0x00d1;
    L_0x00cd:
        r1 = r4.f3920o;
        r0.f3920o = r1;
    L_0x00d1:
        r1 = r4.f3906a;
        r2 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        r1 = com.p085c.p086a.p105g.C1248f.m2944a(r1, r2);
        if (r1 == 0) goto L_0x00df;
    L_0x00db:
        r1 = r4.f3921p;
        r0.f3921p = r1;
    L_0x00df:
        r1 = r4.f3906a;
        r2 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r1 = com.p085c.p086a.p105g.C1248f.m2944a(r1, r2);
        if (r1 == 0) goto L_0x00ee;
    L_0x00ea:
        r1 = r4.f3926u;
        r0.f3926u = r1;
    L_0x00ee:
        r1 = r4.f3906a;
        r2 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r1 = com.p085c.p086a.p105g.C1248f.m2944a(r1, r2);
        if (r1 == 0) goto L_0x00fc;
    L_0x00f8:
        r1 = r4.f3919n;
        r0.f3919n = r1;
    L_0x00fc:
        r1 = r4.f3906a;
        r2 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r1 = com.p085c.p086a.p105g.C1248f.m2944a(r1, r2);
        if (r1 == 0) goto L_0x010a;
    L_0x0106:
        r1 = r4.f3918m;
        r0.f3918m = r1;
    L_0x010a:
        r1 = r4.f3906a;
        r2 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        r1 = com.p085c.p086a.p105g.C1248f.m2944a(r1, r2);
        if (r1 == 0) goto L_0x011b;
    L_0x0114:
        r1 = r0.f3923r;
        r2 = r4.f3923r;
        r1.putAll(r2);
    L_0x011b:
        r1 = r4.f3906a;
        r2 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r1 = com.p085c.p086a.p105g.C1248f.m2944a(r1, r2);
        if (r1 == 0) goto L_0x0129;
    L_0x0125:
        r1 = r4.f3929x;
        r0.f3929x = r1;
    L_0x0129:
        r1 = r0.f3919n;
        if (r1 != 0) goto L_0x0143;
    L_0x012d:
        r1 = r0.f3923r;
        r1.clear();
        r1 = r0.f3906a;
        r1 = r1 & -2049;
        r0.f3906a = r1;
        r1 = 0;
        r0.f3918m = r1;
        r1 = r0.f3906a;
        r2 = -131073; // 0xfffffffffffdffff float:NaN double:NaN;
        r1 = r1 & r2;
        r0.f3906a = r1;
    L_0x0143:
        r1 = r0.f3906a;
        r2 = r4.f3906a;
        r1 = r1 | r2;
        r0.f3906a = r1;
        r1 = r0.f3922q;
        r4 = r4.f3922q;
        r1.m10874a(r4);
        r4 = r0.m2964j();
        r3.f3985b = r4;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.i.a(com.c.a.g.f):com.c.a.i<TranscodeType>");
    }

    public final C1274i<TranscodeType> m3035a(C1277k<?, ? super TranscodeType> c1277k) {
        this.f3993k = (C1277k) C1271h.m3012a((Object) c1277k, "Argument must not be null");
        return this;
    }

    public final C1274i<TranscodeType> m3036a(Integer num) {
        return m3037a((Object) num).m3034a(C1248f.m2940a(C1253a.m2967a(this.f3988f)));
    }

    public final C1274i<TranscodeType> m3037a(Object obj) {
        this.f3994l = obj;
        this.f3996n = true;
        return this;
    }

    public final C1274i<TranscodeType> m3038b() {
        try {
            C1274i<TranscodeType> c1274i = (C1274i) super.clone();
            c1274i.f3985b = c1274i.f3985b.m2958d();
            c1274i.f3993k = c1274i.f3993k.m3040a();
            return c1274i;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    @Deprecated
    public final C6462a<TranscodeType> m3039c() {
        final C5266h c7040d = new C7040d(this.f3988f.f3873a);
        if (C1273i.m3027d()) {
            this.f3988f.f3873a.post(new Runnable(this) {
                final /* synthetic */ C1274i f3956b;

                public final void run() {
                    if (!c7040d.isCancelled()) {
                        this.f3956b.m3032a(c7040d);
                    }
                }
            });
            return c7040d;
        }
        m3032a(c7040d);
        return c7040d;
    }

    public final /* synthetic */ Object clone() {
        return m3038b();
    }
}
