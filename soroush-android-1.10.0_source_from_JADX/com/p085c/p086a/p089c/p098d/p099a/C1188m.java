package com.p085c.p086a.p089c.p098d.p099a;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.Log;
import com.p085c.p086a.p089c.C1162b;
import com.p085c.p086a.p089c.C1206f;
import com.p085c.p086a.p089c.C1206f.C1205a;
import com.p085c.p086a.p089c.C1207g;
import com.p085c.p086a.p089c.C1210i;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p092b.C1159s;
import com.p085c.p086a.p089c.p092b.p093a.C1104b;
import com.p085c.p086a.p089c.p092b.p093a.C1106e;
import com.p085c.p086a.p089c.p098d.p099a.C1186l.C1185g;
import com.p085c.p086a.p109i.C1271h;
import com.p085c.p086a.p109i.C1273i;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class C1188m {
    public static final C1210i<C1162b> f3767a = C1210i.m2867a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", C1162b.f3722c);
    public static final C1210i<C1186l> f3768b = C1210i.m2867a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", C1186l.f3762c);
    public static final C1210i<Boolean> f3769c = C1210i.m2867a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", Boolean.valueOf(false));
    static final C1187a f3770d = new C52281();
    private static final Set<String> f3771e = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));
    private static final Set<C1205a> f3772f = Collections.unmodifiableSet(EnumSet.of(C1205a.JPEG, C1205a.PNG_A, C1205a.PNG));
    private static final Queue<Options> f3773g = C1273i.m3020a(0);
    private final C1106e f3774h;
    private final DisplayMetrics f3775i;
    private final C1104b f3776j;
    private final List<C1206f> f3777k;

    public interface C1187a {
        void mo1212a();

        void mo1213a(C1106e c1106e, Bitmap bitmap);
    }

    static class C52281 implements C1187a {
        C52281() {
        }

        public final void mo1212a() {
        }

        public final void mo1213a(C1106e c1106e, Bitmap bitmap) {
        }
    }

    public C1188m(List<C1206f> list, DisplayMetrics displayMetrics, C1106e c1106e, C1104b c1104b) {
        this.f3777k = list;
        this.f3775i = (DisplayMetrics) C1271h.m3012a((Object) displayMetrics, "Argument must not be null");
        this.f3774h = (C1106e) C1271h.m3012a((Object) c1106e, "Argument must not be null");
        this.f3776j = (C1104b) C1271h.m3012a((Object) c1104b, "Argument must not be null");
    }

    private Config m2820a(InputStream inputStream, C1162b c1162b) {
        if (c1162b != C1162b.PREFER_ARGB_8888) {
            if (VERSION.SDK_INT != 16) {
                boolean z;
                try {
                    z = C1207g.m2862a(this.f3777k, inputStream, this.f3776j).f3821i;
                } catch (Throwable e) {
                    if (Log.isLoggable("Downsampler", 3)) {
                        StringBuilder stringBuilder = new StringBuilder("Cannot determine whether the image has alpha or not from header, format ");
                        stringBuilder.append(c1162b);
                        Log.d("Downsampler", stringBuilder.toString(), e);
                    }
                    z = false;
                }
                return z ? Config.ARGB_8888 : Config.RGB_565;
            }
        }
        return Config.ARGB_8888;
    }

    private static android.graphics.Bitmap m2821a(java.io.InputStream r8, android.graphics.BitmapFactory.Options r9, com.p085c.p086a.p089c.p098d.p099a.C1188m.C1187a r10, com.p085c.p086a.p089c.p092b.p093a.C1106e r11) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = r9.inJustDecodeBounds;
        if (r0 == 0) goto L_0x000a;
    L_0x0004:
        r0 = 5242880; // 0x500000 float:7.34684E-39 double:2.590327E-317;
        r8.mark(r0);
        goto L_0x000d;
    L_0x000a:
        r10.mo1212a();
    L_0x000d:
        r0 = r9.outWidth;
        r1 = r9.outHeight;
        r2 = r9.outMimeType;
        r3 = com.p085c.p086a.p089c.p098d.p099a.C1192r.m2839a();
        r3.lock();
        r3 = 0;
        r4 = android.graphics.BitmapFactory.decodeStream(r8, r3, r9);	 Catch:{ IllegalArgumentException -> 0x0030 }
        r10 = com.p085c.p086a.p089c.p098d.p099a.C1192r.m2839a();
        r10.unlock();
        r9 = r9.inJustDecodeBounds;
        if (r9 == 0) goto L_0x002d;
    L_0x002a:
        r8.reset();
    L_0x002d:
        return r4;
    L_0x002e:
        r8 = move-exception;
        goto L_0x008e;
    L_0x0030:
        r4 = move-exception;
        r5 = new java.io.IOException;	 Catch:{ all -> 0x002e }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x002e }
        r7 = "Exception decoding bitmap, outWidth: ";	 Catch:{ all -> 0x002e }
        r6.<init>(r7);	 Catch:{ all -> 0x002e }
        r6.append(r0);	 Catch:{ all -> 0x002e }
        r0 = ", outHeight: ";	 Catch:{ all -> 0x002e }
        r6.append(r0);	 Catch:{ all -> 0x002e }
        r6.append(r1);	 Catch:{ all -> 0x002e }
        r0 = ", outMimeType: ";	 Catch:{ all -> 0x002e }
        r6.append(r0);	 Catch:{ all -> 0x002e }
        r6.append(r2);	 Catch:{ all -> 0x002e }
        r0 = ", inBitmap: ";	 Catch:{ all -> 0x002e }
        r6.append(r0);	 Catch:{ all -> 0x002e }
        r0 = r9.inBitmap;	 Catch:{ all -> 0x002e }
        r0 = com.p085c.p086a.p089c.p098d.p099a.C1188m.m2822a(r0);	 Catch:{ all -> 0x002e }
        r6.append(r0);	 Catch:{ all -> 0x002e }
        r0 = r6.toString();	 Catch:{ all -> 0x002e }
        r5.<init>(r0, r4);	 Catch:{ all -> 0x002e }
        r0 = "Downsampler";	 Catch:{ all -> 0x002e }
        r1 = 3;	 Catch:{ all -> 0x002e }
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x002e }
        if (r0 == 0) goto L_0x0072;	 Catch:{ all -> 0x002e }
    L_0x006b:
        r0 = "Downsampler";	 Catch:{ all -> 0x002e }
        r1 = "Failed to decode with inBitmap, trying again without Bitmap re-use";	 Catch:{ all -> 0x002e }
        android.util.Log.d(r0, r1, r5);	 Catch:{ all -> 0x002e }
    L_0x0072:
        r0 = r9.inBitmap;	 Catch:{ all -> 0x002e }
        if (r0 == 0) goto L_0x008d;
    L_0x0076:
        r8.reset();	 Catch:{ IOException -> 0x008c }
        r0 = r9.inBitmap;	 Catch:{ IOException -> 0x008c }
        r11.mo1138a(r0);	 Catch:{ IOException -> 0x008c }
        r9.inBitmap = r3;	 Catch:{ IOException -> 0x008c }
        r8 = com.p085c.p086a.p089c.p098d.p099a.C1188m.m2821a(r8, r9, r10, r11);	 Catch:{ IOException -> 0x008c }
        r9 = com.p085c.p086a.p089c.p098d.p099a.C1192r.m2839a();
        r9.unlock();
        return r8;
    L_0x008c:
        throw r5;	 Catch:{ all -> 0x002e }
    L_0x008d:
        throw r5;	 Catch:{ all -> 0x002e }
    L_0x008e:
        r9 = com.p085c.p086a.p089c.p098d.p099a.C1192r.m2839a();
        r9.unlock();
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.c.d.a.m.a(java.io.InputStream, android.graphics.BitmapFactory$Options, com.c.a.c.d.a.m$a, com.c.a.c.b.a.e):android.graphics.Bitmap");
    }

    @TargetApi(19)
    private static String m2822a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        String stringBuilder;
        if (VERSION.SDK_INT >= 19) {
            StringBuilder stringBuilder2 = new StringBuilder(" (");
            stringBuilder2.append(bitmap.getAllocationByteCount());
            stringBuilder2.append(")");
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = "";
        }
        StringBuilder stringBuilder3 = new StringBuilder("[");
        stringBuilder3.append(bitmap.getWidth());
        stringBuilder3.append("x");
        stringBuilder3.append(bitmap.getHeight());
        stringBuilder3.append("] ");
        stringBuilder3.append(bitmap.getConfig());
        stringBuilder3.append(stringBuilder);
        return stringBuilder3.toString();
    }

    public static boolean m2823a() {
        return true;
    }

    private static boolean m2824a(Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    private boolean m2825a(InputStream inputStream) {
        if (VERSION.SDK_INT >= 19) {
            return true;
        }
        try {
            return f3772f.contains(C1207g.m2862a(this.f3777k, inputStream, this.f3776j));
        } catch (Throwable e) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Cannot determine the image type from header", e);
            }
            return false;
        }
    }

    private static void m2826b(Options options) {
        C1188m.m2829c(options);
        synchronized (f3773g) {
            f3773g.offer(options);
        }
    }

    public static boolean m2827b() {
        return true;
    }

    private static synchronized Options m2828c() {
        Options options;
        synchronized (C1188m.class) {
            synchronized (f3773g) {
                options = (Options) f3773g.poll();
            }
            if (options == null) {
                options = new Options();
                C1188m.m2829c(options);
            }
        }
        return options;
    }

    private static void m2829c(Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final C1159s<Bitmap> m2830a(InputStream inputStream, int i, int i2, C5253j c5253j, C1187a c1187a) {
        Throwable th;
        Throwable th2;
        InputStream inputStream2 = inputStream;
        int i3 = i;
        int i4 = i2;
        C5253j c5253j2 = c5253j;
        C1187a c1187a2 = c1187a;
        C1271h.m3015a(inputStream.markSupported(), "You must provide an InputStream that supports mark()");
        Object obj = (byte[]) this.f3776j.mo1130a(65536, byte[].class);
        Options c = C1188m.m2828c();
        c.inTempStorage = obj;
        C1162b c1162b = (C1162b) c5253j2.m10873a(f3767a);
        C1186l c1186l = (C1186l) c5253j2.m10873a(f3768b);
        boolean booleanValue = ((Boolean) c5253j2.m10873a(f3769c)).booleanValue();
        try {
            int i5;
            int i6;
            float f;
            String str;
            StringBuilder stringBuilder;
            Object obj2;
            float f2;
            int ceil;
            Bitmap a;
            StringBuilder stringBuilder2;
            Bitmap bitmap;
            C1159s a2;
            C1106e c1106e = r1.f3774h;
            c.inJustDecodeBounds = true;
            C1188m.m2821a(inputStream2, c, c1187a2, c1106e);
            c.inJustDecodeBounds = false;
            int[] iArr = new int[]{c.outWidth, c.outHeight};
            int i7 = iArr[0];
            int i8 = iArr[1];
            String str2 = c.outMimeType;
            int b = C1207g.m2863b(r1.f3777k, inputStream2, r1.f3776j);
            int a3 = C1192r.m2835a(b);
            c.inPreferredConfig = m2820a(inputStream2, c1162b);
            Object obj3 = obj;
            if (c.inPreferredConfig != Config.ARGB_8888) {
                try {
                    c.inDither = true;
                } catch (Throwable th22) {
                    th = th22;
                    obj = obj3;
                    C1188m.m2826b(c);
                    r1.f3776j.mo1133a(obj, byte[].class);
                    throw th;
                }
            }
            int i9 = i3 == Integer.MIN_VALUE ? i7 : i3;
            if (i4 == Integer.MIN_VALUE) {
                i5 = b;
                i6 = i8;
            } else {
                i6 = i4;
                i5 = b;
            }
            float f3 = BallPulseIndicator.SCALE;
            if (i7 > 0) {
                if (i8 > 0) {
                    float a4;
                    StringBuilder stringBuilder3;
                    int a5;
                    if (a3 != 90) {
                        if (a3 != 270) {
                            a4 = c1186l.mo1210a(i7, i8, i9, i6);
                            if (a4 > 0.0f) {
                                stringBuilder3 = new StringBuilder("Cannot scale with factor: ");
                                stringBuilder3.append(a4);
                                stringBuilder3.append(" from: ");
                                stringBuilder3.append(c1186l);
                                throw new IllegalArgumentException(stringBuilder3.toString());
                            }
                            a5 = c1186l.mo1211a();
                            if (a5 != 0) {
                                throw new IllegalArgumentException("Cannot round with null rounding");
                            }
                            a3 = i7 / ((int) ((((float) i7) * a4) + 0.5f));
                            i4 = i8 / ((int) ((((float) i8) * a4) + 0.5f));
                            i3 = a5 != C1185g.f3757a ? Math.max(a3, i4) : Math.min(a3, i4);
                            if (VERSION.SDK_INT <= 23 || !f3771e.contains(c.outMimeType)) {
                                a3 = Math.max(1, Integer.highestOneBit(i3));
                                if (a5 == C1185g.f3757a && ((float) a3) < BallPulseIndicator.SCALE / a4) {
                                    a3 <<= 1;
                                }
                            } else {
                                a3 = 1;
                            }
                            f = ((float) a3) * a4;
                            c.inSampleSize = a3;
                            if (VERSION.SDK_INT >= 19) {
                                c.inTargetDensity = (int) ((1000.0f * f) + 0.5f);
                                c.inDensity = IjkMediaCodecInfo.RANK_MAX;
                            }
                            if (C1188m.m2824a(c)) {
                                c.inTargetDensity = 0;
                                c.inDensity = 0;
                            } else {
                                c.inScaled = true;
                            }
                            if (Log.isLoggable("Downsampler", 2)) {
                                str = str2;
                                stringBuilder = new StringBuilder("Calculate scaling, source: [");
                                stringBuilder.append(i7);
                                stringBuilder.append("x");
                                stringBuilder.append(i8);
                                stringBuilder.append("], target: [");
                                stringBuilder.append(i9);
                                stringBuilder.append("x");
                                stringBuilder.append(i6);
                                stringBuilder.append("], exact scale factor: ");
                                stringBuilder.append(a4);
                                stringBuilder.append(", power of 2 sample size: ");
                                stringBuilder.append(a3);
                                stringBuilder.append(", adjusted scale factor: ");
                                stringBuilder.append(f);
                                stringBuilder.append(", target density: ");
                                stringBuilder.append(c.inTargetDensity);
                                stringBuilder.append(", density: ");
                                stringBuilder.append(c.inDensity);
                                Log.v("Downsampler", stringBuilder.toString());
                                obj2 = VERSION.SDK_INT >= 19 ? 1 : null;
                                if ((c.inSampleSize == 1 || obj2 != null) && m2825a(inputStream)) {
                                    if (booleanValue || obj2 == null) {
                                        if (C1188m.m2824a(c)) {
                                            f3 = ((float) c.inTargetDensity) / ((float) c.inDensity);
                                        }
                                        f = f3;
                                        i4 = c.inSampleSize;
                                        f2 = (float) i4;
                                        ceil = (int) Math.ceil((double) (((float) i7) / f2));
                                        i6 = (int) Math.ceil((double) (((float) i8) / f2));
                                        i9 = Math.round(((float) ceil) * f);
                                        i6 = Math.round(((float) i6) * f);
                                        if (Log.isLoggable("Downsampler", 2)) {
                                            stringBuilder = new StringBuilder("Calculated target [");
                                            stringBuilder.append(i9);
                                            stringBuilder.append("x");
                                            stringBuilder.append(i6);
                                            stringBuilder.append("] for source [");
                                            stringBuilder.append(i7);
                                            stringBuilder.append("x");
                                            stringBuilder.append(i8);
                                            stringBuilder.append("], sampleSize: ");
                                            stringBuilder.append(i4);
                                            stringBuilder.append(", targetDensity: ");
                                            stringBuilder.append(c.inTargetDensity);
                                            stringBuilder.append(", density: ");
                                            stringBuilder.append(c.inDensity);
                                            stringBuilder.append(", density multiplier: ");
                                            stringBuilder.append(f);
                                            Log.v("Downsampler", stringBuilder.toString());
                                        }
                                    }
                                    if (i9 > 0 && i6 > 0) {
                                        c.inBitmap = r1.f3774h.mo1139b(i9, i6, c.inPreferredConfig);
                                    }
                                }
                                a = C1188m.m2821a(inputStream2, c, c1187a2, r1.f3774h);
                                c1187a2.mo1213a(r1.f3774h, a);
                                if (Log.isLoggable("Downsampler", 2)) {
                                    stringBuilder2 = new StringBuilder("Decoded ");
                                    stringBuilder2.append(C1188m.m2822a(a));
                                    stringBuilder2.append(" from [");
                                    stringBuilder2.append(i7);
                                    stringBuilder2.append("x");
                                    stringBuilder2.append(i8);
                                    stringBuilder2.append("] ");
                                    stringBuilder2.append(str);
                                    stringBuilder2.append(" with inBitmap ");
                                    stringBuilder2.append(C1188m.m2822a(c.inBitmap));
                                    stringBuilder2.append(" for [");
                                    stringBuilder2.append(i);
                                    stringBuilder2.append("x");
                                    stringBuilder2.append(i2);
                                    stringBuilder2.append("], sample size: ");
                                    stringBuilder2.append(c.inSampleSize);
                                    stringBuilder2.append(", density: ");
                                    stringBuilder2.append(c.inDensity);
                                    stringBuilder2.append(", target density: ");
                                    stringBuilder2.append(c.inTargetDensity);
                                    stringBuilder2.append(", thread: ");
                                    stringBuilder2.append(Thread.currentThread().getName());
                                    Log.v("Downsampler", stringBuilder2.toString());
                                }
                                bitmap = null;
                                if (a != null) {
                                    a.setDensity(r1.f3775i.densityDpi);
                                    bitmap = C1192r.m2837a(r1.f3774h, a, i5);
                                    if (!a.equals(bitmap)) {
                                        r1.f3774h.mo1138a(a);
                                    }
                                }
                                a2 = C5217e.m10772a(bitmap, r1.f3774h);
                                C1188m.m2826b(c);
                                r1.f3776j.mo1133a(obj3, byte[].class);
                                return a2;
                            }
                        }
                    }
                    a4 = c1186l.mo1210a(i8, i7, i9, i6);
                    if (a4 > 0.0f) {
                        a5 = c1186l.mo1211a();
                        if (a5 != 0) {
                            a3 = i7 / ((int) ((((float) i7) * a4) + 0.5f));
                            i4 = i8 / ((int) ((((float) i8) * a4) + 0.5f));
                            if (a5 != C1185g.f3757a) {
                            }
                            if (VERSION.SDK_INT <= 23) {
                            }
                            a3 = Math.max(1, Integer.highestOneBit(i3));
                            a3 <<= 1;
                            f = ((float) a3) * a4;
                            c.inSampleSize = a3;
                            if (VERSION.SDK_INT >= 19) {
                                c.inTargetDensity = (int) ((1000.0f * f) + 0.5f);
                                c.inDensity = IjkMediaCodecInfo.RANK_MAX;
                            }
                            if (C1188m.m2824a(c)) {
                                c.inTargetDensity = 0;
                                c.inDensity = 0;
                            } else {
                                c.inScaled = true;
                            }
                            if (Log.isLoggable("Downsampler", 2)) {
                                str = str2;
                                stringBuilder = new StringBuilder("Calculate scaling, source: [");
                                stringBuilder.append(i7);
                                stringBuilder.append("x");
                                stringBuilder.append(i8);
                                stringBuilder.append("], target: [");
                                stringBuilder.append(i9);
                                stringBuilder.append("x");
                                stringBuilder.append(i6);
                                stringBuilder.append("], exact scale factor: ");
                                stringBuilder.append(a4);
                                stringBuilder.append(", power of 2 sample size: ");
                                stringBuilder.append(a3);
                                stringBuilder.append(", adjusted scale factor: ");
                                stringBuilder.append(f);
                                stringBuilder.append(", target density: ");
                                stringBuilder.append(c.inTargetDensity);
                                stringBuilder.append(", density: ");
                                stringBuilder.append(c.inDensity);
                                Log.v("Downsampler", stringBuilder.toString());
                                if (VERSION.SDK_INT >= 19) {
                                }
                                if (booleanValue) {
                                }
                                if (C1188m.m2824a(c)) {
                                    f3 = ((float) c.inTargetDensity) / ((float) c.inDensity);
                                }
                                f = f3;
                                i4 = c.inSampleSize;
                                f2 = (float) i4;
                                ceil = (int) Math.ceil((double) (((float) i7) / f2));
                                i6 = (int) Math.ceil((double) (((float) i8) / f2));
                                i9 = Math.round(((float) ceil) * f);
                                i6 = Math.round(((float) i6) * f);
                                if (Log.isLoggable("Downsampler", 2)) {
                                    stringBuilder = new StringBuilder("Calculated target [");
                                    stringBuilder.append(i9);
                                    stringBuilder.append("x");
                                    stringBuilder.append(i6);
                                    stringBuilder.append("] for source [");
                                    stringBuilder.append(i7);
                                    stringBuilder.append("x");
                                    stringBuilder.append(i8);
                                    stringBuilder.append("], sampleSize: ");
                                    stringBuilder.append(i4);
                                    stringBuilder.append(", targetDensity: ");
                                    stringBuilder.append(c.inTargetDensity);
                                    stringBuilder.append(", density: ");
                                    stringBuilder.append(c.inDensity);
                                    stringBuilder.append(", density multiplier: ");
                                    stringBuilder.append(f);
                                    Log.v("Downsampler", stringBuilder.toString());
                                }
                                c.inBitmap = r1.f3774h.mo1139b(i9, i6, c.inPreferredConfig);
                                a = C1188m.m2821a(inputStream2, c, c1187a2, r1.f3774h);
                                c1187a2.mo1213a(r1.f3774h, a);
                                if (Log.isLoggable("Downsampler", 2)) {
                                    stringBuilder2 = new StringBuilder("Decoded ");
                                    stringBuilder2.append(C1188m.m2822a(a));
                                    stringBuilder2.append(" from [");
                                    stringBuilder2.append(i7);
                                    stringBuilder2.append("x");
                                    stringBuilder2.append(i8);
                                    stringBuilder2.append("] ");
                                    stringBuilder2.append(str);
                                    stringBuilder2.append(" with inBitmap ");
                                    stringBuilder2.append(C1188m.m2822a(c.inBitmap));
                                    stringBuilder2.append(" for [");
                                    stringBuilder2.append(i);
                                    stringBuilder2.append("x");
                                    stringBuilder2.append(i2);
                                    stringBuilder2.append("], sample size: ");
                                    stringBuilder2.append(c.inSampleSize);
                                    stringBuilder2.append(", density: ");
                                    stringBuilder2.append(c.inDensity);
                                    stringBuilder2.append(", target density: ");
                                    stringBuilder2.append(c.inTargetDensity);
                                    stringBuilder2.append(", thread: ");
                                    stringBuilder2.append(Thread.currentThread().getName());
                                    Log.v("Downsampler", stringBuilder2.toString());
                                }
                                bitmap = null;
                                if (a != null) {
                                    a.setDensity(r1.f3775i.densityDpi);
                                    bitmap = C1192r.m2837a(r1.f3774h, a, i5);
                                    if (a.equals(bitmap)) {
                                        r1.f3774h.mo1138a(a);
                                    }
                                }
                                a2 = C5217e.m10772a(bitmap, r1.f3774h);
                                C1188m.m2826b(c);
                                r1.f3776j.mo1133a(obj3, byte[].class);
                                return a2;
                            }
                        }
                        throw new IllegalArgumentException("Cannot round with null rounding");
                    }
                    stringBuilder3 = new StringBuilder("Cannot scale with factor: ");
                    stringBuilder3.append(a4);
                    stringBuilder3.append(" from: ");
                    stringBuilder3.append(c1186l);
                    throw new IllegalArgumentException(stringBuilder3.toString());
                }
            }
            str = str2;
            try {
                if (VERSION.SDK_INT >= 19) {
                }
                if (booleanValue) {
                }
                if (C1188m.m2824a(c)) {
                    f3 = ((float) c.inTargetDensity) / ((float) c.inDensity);
                }
                f = f3;
                i4 = c.inSampleSize;
                f2 = (float) i4;
                ceil = (int) Math.ceil((double) (((float) i7) / f2));
                i6 = (int) Math.ceil((double) (((float) i8) / f2));
                i9 = Math.round(((float) ceil) * f);
                i6 = Math.round(((float) i6) * f);
                if (Log.isLoggable("Downsampler", 2)) {
                    stringBuilder = new StringBuilder("Calculated target [");
                    stringBuilder.append(i9);
                    stringBuilder.append("x");
                    stringBuilder.append(i6);
                    stringBuilder.append("] for source [");
                    stringBuilder.append(i7);
                    stringBuilder.append("x");
                    stringBuilder.append(i8);
                    stringBuilder.append("], sampleSize: ");
                    stringBuilder.append(i4);
                    stringBuilder.append(", targetDensity: ");
                    stringBuilder.append(c.inTargetDensity);
                    stringBuilder.append(", density: ");
                    stringBuilder.append(c.inDensity);
                    stringBuilder.append(", density multiplier: ");
                    stringBuilder.append(f);
                    Log.v("Downsampler", stringBuilder.toString());
                }
                c.inBitmap = r1.f3774h.mo1139b(i9, i6, c.inPreferredConfig);
                a = C1188m.m2821a(inputStream2, c, c1187a2, r1.f3774h);
                c1187a2.mo1213a(r1.f3774h, a);
                if (Log.isLoggable("Downsampler", 2)) {
                    stringBuilder2 = new StringBuilder("Decoded ");
                    stringBuilder2.append(C1188m.m2822a(a));
                    stringBuilder2.append(" from [");
                    stringBuilder2.append(i7);
                    stringBuilder2.append("x");
                    stringBuilder2.append(i8);
                    stringBuilder2.append("] ");
                    stringBuilder2.append(str);
                    stringBuilder2.append(" with inBitmap ");
                    stringBuilder2.append(C1188m.m2822a(c.inBitmap));
                    stringBuilder2.append(" for [");
                    stringBuilder2.append(i);
                    stringBuilder2.append("x");
                    stringBuilder2.append(i2);
                    stringBuilder2.append("], sample size: ");
                    stringBuilder2.append(c.inSampleSize);
                    stringBuilder2.append(", density: ");
                    stringBuilder2.append(c.inDensity);
                    stringBuilder2.append(", target density: ");
                    stringBuilder2.append(c.inTargetDensity);
                    stringBuilder2.append(", thread: ");
                    stringBuilder2.append(Thread.currentThread().getName());
                    Log.v("Downsampler", stringBuilder2.toString());
                }
                bitmap = null;
                if (a != null) {
                    a.setDensity(r1.f3775i.densityDpi);
                    bitmap = C1192r.m2837a(r1.f3774h, a, i5);
                    if (a.equals(bitmap)) {
                        r1.f3774h.mo1138a(a);
                    }
                }
                a2 = C5217e.m10772a(bitmap, r1.f3774h);
                C1188m.m2826b(c);
                r1.f3776j.mo1133a(obj3, byte[].class);
                return a2;
            } catch (Throwable th3) {
                th22 = th3;
                obj = obj3;
                th = th22;
                C1188m.m2826b(c);
                r1.f3776j.mo1133a(obj, byte[].class);
                throw th;
            }
        } catch (Throwable th4) {
            th22 = th4;
            th = th22;
            C1188m.m2826b(c);
            r1.f3776j.mo1133a(obj, byte[].class);
            throw th;
        }
    }
}
