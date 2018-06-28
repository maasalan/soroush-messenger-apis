package com.theartofdev.edmodo.cropper;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.util.Pair;
import java.io.Closeable;
import java.lang.ref.WeakReference;

final class C2258c {
    static final Rect f7511a = new Rect();
    static final RectF f7512b = new RectF();
    static final RectF f7513c = new RectF();
    static int f7514d;
    static Pair<String, WeakReference<Bitmap>> f7515e;

    public static final class C2256a {
        public final Bitmap f7507a;
        public final int f7508b;

        C2256a(Bitmap bitmap, int i) {
            this.f7508b = i;
            this.f7507a = bitmap;
        }
    }

    public static final class C2257b {
        public final Bitmap f7509a;
        public final int f7510b;

        C2257b(Bitmap bitmap, int i) {
            this.f7509a = bitmap;
            this.f7510b = i;
        }
    }

    private static int m6150a() {
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
        r0 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        r1 = javax.microedition.khronos.egl.EGLContext.getEGL();	 Catch:{ Exception -> 0x0045 }
        r1 = (javax.microedition.khronos.egl.EGL10) r1;	 Catch:{ Exception -> 0x0045 }
        r2 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY;	 Catch:{ Exception -> 0x0045 }
        r2 = r1.eglGetDisplay(r2);	 Catch:{ Exception -> 0x0045 }
        r3 = 2;	 Catch:{ Exception -> 0x0045 }
        r3 = new int[r3];	 Catch:{ Exception -> 0x0045 }
        r1.eglInitialize(r2, r3);	 Catch:{ Exception -> 0x0045 }
        r3 = 1;	 Catch:{ Exception -> 0x0045 }
        r4 = new int[r3];	 Catch:{ Exception -> 0x0045 }
        r5 = 0;	 Catch:{ Exception -> 0x0045 }
        r6 = 0;	 Catch:{ Exception -> 0x0045 }
        r1.eglGetConfigs(r2, r5, r6, r4);	 Catch:{ Exception -> 0x0045 }
        r5 = r4[r6];	 Catch:{ Exception -> 0x0045 }
        r5 = new javax.microedition.khronos.egl.EGLConfig[r5];	 Catch:{ Exception -> 0x0045 }
        r7 = r4[r6];	 Catch:{ Exception -> 0x0045 }
        r1.eglGetConfigs(r2, r5, r7, r4);	 Catch:{ Exception -> 0x0045 }
        r3 = new int[r3];	 Catch:{ Exception -> 0x0045 }
        r7 = r6;	 Catch:{ Exception -> 0x0045 }
        r8 = r7;	 Catch:{ Exception -> 0x0045 }
    L_0x0029:
        r9 = r4[r6];	 Catch:{ Exception -> 0x0045 }
        if (r7 >= r9) goto L_0x003d;	 Catch:{ Exception -> 0x0045 }
    L_0x002d:
        r9 = r5[r7];	 Catch:{ Exception -> 0x0045 }
        r10 = 12332; // 0x302c float:1.7281E-41 double:6.093E-320;	 Catch:{ Exception -> 0x0045 }
        r1.eglGetConfigAttrib(r2, r9, r10, r3);	 Catch:{ Exception -> 0x0045 }
        r9 = r3[r6];	 Catch:{ Exception -> 0x0045 }
        if (r8 >= r9) goto L_0x003a;	 Catch:{ Exception -> 0x0045 }
    L_0x0038:
        r8 = r3[r6];	 Catch:{ Exception -> 0x0045 }
    L_0x003a:
        r7 = r7 + 1;	 Catch:{ Exception -> 0x0045 }
        goto L_0x0029;	 Catch:{ Exception -> 0x0045 }
    L_0x003d:
        r1.eglTerminate(r2);	 Catch:{ Exception -> 0x0045 }
        r1 = java.lang.Math.max(r8, r0);	 Catch:{ Exception -> 0x0045 }
        return r1;
    L_0x0045:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.c.a():int");
    }

    private static int m6151a(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 > i4 || i > i3) {
            while ((i2 / 2) / i5 > i4 && (i / 2) / i5 > i3) {
                i5 *= 2;
            }
        }
        return i5;
    }

    private static android.graphics.Bitmap m6152a(android.content.ContentResolver r2, android.net.Uri r3, android.graphics.BitmapFactory.Options r4) {
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
    L_0x0000:
        r0 = 0;
        r1 = r2.openInputStream(r3);	 Catch:{ OutOfMemoryError -> 0x0016 }
        r0 = f7511a;	 Catch:{ OutOfMemoryError -> 0x0012, all -> 0x000f }
        r0 = android.graphics.BitmapFactory.decodeStream(r1, r0, r4);	 Catch:{ OutOfMemoryError -> 0x0012, all -> 0x000f }
        com.theartofdev.edmodo.cropper.C2258c.m6164a(r1);
        return r0;
    L_0x000f:
        r2 = move-exception;
        r0 = r1;
        goto L_0x0039;
    L_0x0012:
        r0 = r1;
        goto L_0x0016;
    L_0x0014:
        r2 = move-exception;
        goto L_0x0039;
    L_0x0016:
        r1 = r4.inSampleSize;	 Catch:{ all -> 0x0014 }
        r1 = r1 * 2;	 Catch:{ all -> 0x0014 }
        r4.inSampleSize = r1;	 Catch:{ all -> 0x0014 }
        com.theartofdev.edmodo.cropper.C2258c.m6164a(r0);
        r0 = r4.inSampleSize;
        r1 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        if (r0 <= r1) goto L_0x0000;
    L_0x0025:
        r2 = new java.lang.RuntimeException;
        r4 = new java.lang.StringBuilder;
        r0 = "Failed to decode image: ";
        r4.<init>(r0);
        r4.append(r3);
        r3 = r4.toString();
        r2.<init>(r3);
        throw r2;
    L_0x0039:
        com.theartofdev.edmodo.cropper.C2258c.m6164a(r0);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.c.a(android.content.ContentResolver, android.net.Uri, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    private static android.graphics.Bitmap m6153a(android.content.Context r4, android.net.Uri r5, android.graphics.Rect r6, int r7, int r8) {
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
        r0 = 0;
        r1 = new android.graphics.BitmapFactory$Options;	 Catch:{ Exception -> 0x0052, all -> 0x004f }
        r1.<init>();	 Catch:{ Exception -> 0x0052, all -> 0x004f }
        r2 = r6.width();	 Catch:{ Exception -> 0x0052, all -> 0x004f }
        r3 = r6.height();	 Catch:{ Exception -> 0x0052, all -> 0x004f }
        r7 = com.theartofdev.edmodo.cropper.C2258c.m6151a(r2, r3, r7, r8);	 Catch:{ Exception -> 0x0052, all -> 0x004f }
        r1.inSampleSize = r7;	 Catch:{ Exception -> 0x0052, all -> 0x004f }
        r4 = r4.getContentResolver();	 Catch:{ Exception -> 0x0052, all -> 0x004f }
        r4 = r4.openInputStream(r5);	 Catch:{ Exception -> 0x0052, all -> 0x004f }
        r7 = 0;
        r7 = android.graphics.BitmapRegionDecoder.newInstance(r4, r7);	 Catch:{ Exception -> 0x004b, all -> 0x0047 }
    L_0x0021:
        r8 = r7.decodeRegion(r6, r1);	 Catch:{ OutOfMemoryError -> 0x0032 }
        com.theartofdev.edmodo.cropper.C2258c.m6164a(r4);
        if (r7 == 0) goto L_0x002d;
    L_0x002a:
        r7.recycle();
    L_0x002d:
        return r8;
    L_0x002e:
        r5 = move-exception;
        goto L_0x0049;
    L_0x0030:
        r6 = move-exception;
        goto L_0x004d;
    L_0x0032:
        r8 = r1.inSampleSize;	 Catch:{ Exception -> 0x0030, all -> 0x002e }
        r8 = r8 * 2;	 Catch:{ Exception -> 0x0030, all -> 0x002e }
        r1.inSampleSize = r8;	 Catch:{ Exception -> 0x0030, all -> 0x002e }
        r8 = r1.inSampleSize;	 Catch:{ Exception -> 0x0030, all -> 0x002e }
        r2 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        if (r8 <= r2) goto L_0x0021;
    L_0x003e:
        com.theartofdev.edmodo.cropper.C2258c.m6164a(r4);
        if (r7 == 0) goto L_0x0046;
    L_0x0043:
        r7.recycle();
    L_0x0046:
        return r0;
    L_0x0047:
        r5 = move-exception;
        r7 = r0;
    L_0x0049:
        r0 = r4;
        goto L_0x0069;
    L_0x004b:
        r6 = move-exception;
        r7 = r0;
    L_0x004d:
        r0 = r4;
        goto L_0x0054;
    L_0x004f:
        r5 = move-exception;
        r7 = r0;
        goto L_0x0069;
    L_0x0052:
        r6 = move-exception;
        r7 = r0;
    L_0x0054:
        r4 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0068 }
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0068 }
        r1 = "Failed to load sampled bitmap: ";	 Catch:{ all -> 0x0068 }
        r8.<init>(r1);	 Catch:{ all -> 0x0068 }
        r8.append(r5);	 Catch:{ all -> 0x0068 }
        r5 = r8.toString();	 Catch:{ all -> 0x0068 }
        r4.<init>(r5, r6);	 Catch:{ all -> 0x0068 }
        throw r4;	 Catch:{ all -> 0x0068 }
    L_0x0068:
        r5 = move-exception;
    L_0x0069:
        com.theartofdev.edmodo.cropper.C2258c.m6164a(r0);
        if (r7 == 0) goto L_0x0071;
    L_0x006e:
        r7.recycle();
    L_0x0071:
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.c.a(android.content.Context, android.net.Uri, android.graphics.Rect, int, int):android.graphics.Bitmap");
    }

    public static android.graphics.Bitmap m6154a(android.content.Context r16, android.net.Uri r17, float[] r18, int r19, int r20, int r21, boolean r22, int r23, int r24, int r25, int r26) {
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
        r1 = r17;
        r4 = r19;
        r2 = r25;
        r3 = r26;
        r5 = r18;
        r6 = r20;
        r7 = r21;
        r8 = r22;
        r9 = r23;
        r10 = r24;
        r5 = com.theartofdev.edmodo.cropper.C2258c.m6158a(r5, r6, r7, r8, r9, r10);
        if (r2 <= 0) goto L_0x001c;
    L_0x001a:
        r6 = r2;
        goto L_0x0020;
    L_0x001c:
        r6 = r5.width();
    L_0x0020:
        if (r3 <= 0) goto L_0x0024;
    L_0x0022:
        r7 = r3;
        goto L_0x0028;
    L_0x0024:
        r7 = r5.height();
    L_0x0028:
        r8 = 0;
        r9 = r16;
        r6 = com.theartofdev.edmodo.cropper.C2258c.m6153a(r9, r1, r5, r6, r7);	 Catch:{ Exception -> 0x0030 }
        goto L_0x0031;
    L_0x0030:
        r6 = r8;
    L_0x0031:
        if (r6 == 0) goto L_0x0067;
    L_0x0033:
        if (r4 <= 0) goto L_0x0054;
    L_0x0035:
        r14 = new android.graphics.Matrix;
        r14.<init>();
        r1 = (float) r4;
        r14.setRotate(r1);
        r10 = 0;
        r11 = 0;
        r12 = r6.getWidth();
        r13 = r6.getHeight();
        r15 = 0;
        r9 = r6;
        r1 = android.graphics.Bitmap.createBitmap(r9, r10, r11, r12, r13, r14, r15);
        if (r1 == r6) goto L_0x0055;
    L_0x0050:
        r6.recycle();
        goto L_0x0055;
    L_0x0054:
        r1 = r6;
    L_0x0055:
        r2 = r4 % 90;
        if (r2 == 0) goto L_0x0095;
    L_0x0059:
        r2 = r18;
        r3 = r5;
        r5 = r22;
        r6 = r23;
        r7 = r24;
        r1 = com.theartofdev.edmodo.cropper.C2258c.m6156a(r1, r2, r3, r4, r5, r6, r7);
        return r1;
    L_0x0067:
        r7 = new android.graphics.BitmapFactory$Options;	 Catch:{ Exception -> 0x0096 }
        r7.<init>();	 Catch:{ Exception -> 0x0096 }
        r8 = r5.width();	 Catch:{ Exception -> 0x0096 }
        r5 = r5.height();	 Catch:{ Exception -> 0x0096 }
        r2 = com.theartofdev.edmodo.cropper.C2258c.m6151a(r8, r5, r2, r3);	 Catch:{ Exception -> 0x0096 }
        r7.inSampleSize = r2;	 Catch:{ Exception -> 0x0096 }
        r2 = r16.getContentResolver();	 Catch:{ Exception -> 0x0096 }
        r8 = com.theartofdev.edmodo.cropper.C2258c.m6152a(r2, r1, r7);	 Catch:{ Exception -> 0x0096 }
        if (r8 == 0) goto L_0x0094;	 Catch:{ Exception -> 0x0096 }
    L_0x0084:
        r2 = r8;	 Catch:{ Exception -> 0x0096 }
        r3 = r18;	 Catch:{ Exception -> 0x0096 }
        r5 = r22;	 Catch:{ Exception -> 0x0096 }
        r6 = r23;	 Catch:{ Exception -> 0x0096 }
        r7 = r24;	 Catch:{ Exception -> 0x0096 }
        r6 = com.theartofdev.edmodo.cropper.C2258c.m6155a(r2, r3, r4, r5, r6, r7);	 Catch:{ Exception -> 0x0096 }
        r8.recycle();	 Catch:{ Exception -> 0x0096 }
    L_0x0094:
        r1 = r6;
    L_0x0095:
        return r1;
    L_0x0096:
        r0 = move-exception;
        r2 = r0;
        r3 = new java.lang.RuntimeException;
        r4 = new java.lang.StringBuilder;
        r5 = "Failed to load sampled bitmap: ";
        r4.<init>(r5);
        r4.append(r1);
        r1 = r4.toString();
        r3.<init>(r1, r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.c.a(android.content.Context, android.net.Uri, float[], int, int, int, boolean, int, int, int, int):android.graphics.Bitmap");
    }

    public static Bitmap m6155a(Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3) {
        Rect a = C2258c.m6158a(fArr, bitmap.getWidth(), bitmap.getHeight(), z, i2, i3);
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i, (float) (bitmap.getWidth() / 2), (float) (bitmap.getHeight() / 2));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, a.left, a.top, a.width(), a.height(), matrix, true);
        if (createBitmap == bitmap) {
            createBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        return i % 90 != 0 ? C2258c.m6156a(createBitmap, fArr, a, i, z, i2, i3) : createBitmap;
    }

    private static Bitmap m6156a(Bitmap bitmap, float[] fArr, Rect rect, int i, boolean z, int i2, int i3) {
        if (i % 90 == 0) {
            return bitmap;
        }
        int i4;
        int i5;
        int abs;
        int abs2;
        Bitmap createBitmap;
        double toRadians = Math.toRadians((double) i);
        if (i >= 90) {
            if (i <= 180 || i >= 270) {
                i = rect.right;
                i4 = 0;
                for (i5 = 0; i5 < fArr.length; i5 += 2) {
                    if (((int) fArr[i5]) == i) {
                        i5++;
                        i4 = (int) Math.abs(Math.sin(toRadians) * ((double) (((float) rect.bottom) - fArr[i5])));
                        i = (int) Math.abs(Math.cos(toRadians) * ((double) (fArr[i5] - ((float) rect.top))));
                        abs = (int) Math.abs(((double) (fArr[i5] - ((float) rect.top))) / Math.sin(toRadians));
                        abs2 = (int) Math.abs(((double) (((float) rect.bottom) - fArr[i5])) / Math.cos(toRadians));
                        break;
                    }
                }
                abs2 = 0;
                i = abs2;
                abs = i;
                rect.set(i4, i, abs + i4, abs2 + i);
                if (z) {
                    C2258c.m6163a(rect, i2, i3);
                }
                createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
                bitmap.recycle();
                return createBitmap;
            }
        }
        i = rect.left;
        i4 = 0;
        for (i5 = 0; i5 < fArr.length; i5 += 2) {
            if (((int) fArr[i5]) == i) {
                i5++;
                i4 = (int) Math.abs(Math.sin(toRadians) * ((double) (((float) rect.bottom) - fArr[i5])));
                i = (int) Math.abs(Math.cos(toRadians) * ((double) (fArr[i5] - ((float) rect.top))));
                abs = (int) Math.abs(((double) (fArr[i5] - ((float) rect.top))) / Math.sin(toRadians));
                abs2 = (int) Math.abs(((double) (((float) rect.bottom) - fArr[i5])) / Math.cos(toRadians));
                break;
            }
        }
        abs2 = 0;
        i = abs2;
        abs = i;
        rect.set(i4, i, abs + i4, abs2 + i);
        if (z) {
            C2258c.m6163a(rect, i2, i3);
        }
        createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        bitmap.recycle();
        return createBitmap;
    }

    private static Options m6157a(ContentResolver contentResolver, Uri uri) {
        Throwable th;
        Closeable openInputStream;
        try {
            openInputStream = contentResolver.openInputStream(uri);
            try {
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(openInputStream, f7511a, options);
                options.inJustDecodeBounds = false;
                C2258c.m6164a(openInputStream);
                return options;
            } catch (Throwable th2) {
                th = th2;
                C2258c.m6164a(openInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            openInputStream = null;
            C2258c.m6164a(openInputStream);
            throw th;
        }
    }

    public static Rect m6158a(float[] fArr, int i, int i2, boolean z, int i3, int i4) {
        Rect rect = new Rect(Math.round(Math.max(0.0f, Math.min(Math.min(Math.min(fArr[0], fArr[2]), fArr[4]), fArr[6]))), Math.round(Math.max(0.0f, Math.min(Math.min(Math.min(fArr[1], fArr[3]), fArr[5]), fArr[7]))), Math.round(Math.min((float) i, Math.max(Math.max(Math.max(fArr[0], fArr[2]), fArr[4]), fArr[6]))), Math.round(Math.min((float) i2, Math.max(Math.max(Math.max(fArr[1], fArr[3]), fArr[5]), fArr[7]))));
        if (z) {
            C2258c.m6163a(rect, i3, i4);
        }
        return rect;
    }

    public static C2256a m6159a(Context context, Uri uri, int i, int i2) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Options a = C2258c.m6157a(contentResolver, uri);
            i = C2258c.m6151a(a.outWidth, a.outHeight, i, i2);
            i2 = a.outWidth;
            int i3 = a.outHeight;
            int i4 = 1;
            if (f7514d == 0) {
                f7514d = C2258c.m6150a();
            }
            if (f7514d > 0) {
                while (true) {
                    if (i3 / i4 <= f7514d && i2 / i4 <= f7514d) {
                        break;
                    }
                    i4 *= 2;
                }
            }
            a.inSampleSize = Math.max(i, i4);
            return new C2256a(C2258c.m6152a(contentResolver, uri, a), a.inSampleSize);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder("Failed to load sampled bitmap: ");
            stringBuilder.append(uri);
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }

    public static com.theartofdev.edmodo.cropper.C2258c.C2257b m6160a(android.graphics.Bitmap r2, android.content.Context r3, android.net.Uri r4) {
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
        r0 = 0;
        r3 = com.theartofdev.edmodo.cropper.C2258c.m6161a(r3, r4);	 Catch:{ Exception -> 0x0035 }
        r4 = r3.exists();	 Catch:{ Exception -> 0x0035 }
        if (r4 == 0) goto L_0x0035;	 Catch:{ Exception -> 0x0035 }
    L_0x000b:
        r4 = new android.media.ExifInterface;	 Catch:{ Exception -> 0x0035 }
        r3 = r3.getAbsolutePath();	 Catch:{ Exception -> 0x0035 }
        r4.<init>(r3);	 Catch:{ Exception -> 0x0035 }
        r3 = "Orientation";	 Catch:{ Exception -> 0x0035 }
        r1 = 1;	 Catch:{ Exception -> 0x0035 }
        r3 = r4.getAttributeInt(r3, r1);	 Catch:{ Exception -> 0x0035 }
        r4 = 3;	 Catch:{ Exception -> 0x0035 }
        if (r3 == r4) goto L_0x002d;	 Catch:{ Exception -> 0x0035 }
    L_0x001e:
        r4 = 6;	 Catch:{ Exception -> 0x0035 }
        if (r3 == r4) goto L_0x002a;	 Catch:{ Exception -> 0x0035 }
    L_0x0021:
        r4 = 8;	 Catch:{ Exception -> 0x0035 }
        if (r3 == r4) goto L_0x0027;	 Catch:{ Exception -> 0x0035 }
    L_0x0025:
        r3 = r0;	 Catch:{ Exception -> 0x0035 }
        goto L_0x002f;	 Catch:{ Exception -> 0x0035 }
    L_0x0027:
        r3 = 270; // 0x10e float:3.78E-43 double:1.334E-321;	 Catch:{ Exception -> 0x0035 }
        goto L_0x002f;	 Catch:{ Exception -> 0x0035 }
    L_0x002a:
        r3 = 90;	 Catch:{ Exception -> 0x0035 }
        goto L_0x002f;	 Catch:{ Exception -> 0x0035 }
    L_0x002d:
        r3 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;	 Catch:{ Exception -> 0x0035 }
    L_0x002f:
        r4 = new com.theartofdev.edmodo.cropper.c$b;	 Catch:{ Exception -> 0x0035 }
        r4.<init>(r2, r3);	 Catch:{ Exception -> 0x0035 }
        return r4;
    L_0x0035:
        r3 = new com.theartofdev.edmodo.cropper.c$b;
        r3.<init>(r2, r0);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.c.a(android.graphics.Bitmap, android.content.Context, android.net.Uri):com.theartofdev.edmodo.cropper.c$b");
    }

    private static java.io.File m6161a(android.content.Context r9, android.net.Uri r10) {
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
        r0 = new java.io.File;
        r1 = r10.getPath();
        r0.<init>(r1);
        r1 = r0.exists();
        if (r1 == 0) goto L_0x0010;
    L_0x000f:
        return r0;
    L_0x0010:
        r1 = 0;
        r2 = 1;
        r5 = new java.lang.String[r2];	 Catch:{ Exception -> 0x0048, all -> 0x0040 }
        r2 = 0;	 Catch:{ Exception -> 0x0048, all -> 0x0040 }
        r3 = "_data";	 Catch:{ Exception -> 0x0048, all -> 0x0040 }
        r5[r2] = r3;	 Catch:{ Exception -> 0x0048, all -> 0x0040 }
        r3 = r9.getContentResolver();	 Catch:{ Exception -> 0x0048, all -> 0x0040 }
        r6 = 0;	 Catch:{ Exception -> 0x0048, all -> 0x0040 }
        r7 = 0;	 Catch:{ Exception -> 0x0048, all -> 0x0040 }
        r8 = 0;	 Catch:{ Exception -> 0x0048, all -> 0x0040 }
        r4 = r10;	 Catch:{ Exception -> 0x0048, all -> 0x0040 }
        r9 = r3.query(r4, r5, r6, r7, r8);	 Catch:{ Exception -> 0x0048, all -> 0x0040 }
        r10 = "_data";	 Catch:{ Exception -> 0x0049, all -> 0x003e }
        r10 = r9.getColumnIndexOrThrow(r10);	 Catch:{ Exception -> 0x0049, all -> 0x003e }
        r9.moveToFirst();	 Catch:{ Exception -> 0x0049, all -> 0x003e }
        r10 = r9.getString(r10);	 Catch:{ Exception -> 0x0049, all -> 0x003e }
        r1 = new java.io.File;	 Catch:{ Exception -> 0x0049, all -> 0x003e }
        r1.<init>(r10);	 Catch:{ Exception -> 0x0049, all -> 0x003e }
        if (r9 == 0) goto L_0x003c;
    L_0x0039:
        r9.close();
    L_0x003c:
        r0 = r1;
        return r0;
    L_0x003e:
        r10 = move-exception;
        goto L_0x0042;
    L_0x0040:
        r10 = move-exception;
        r9 = r1;
    L_0x0042:
        if (r9 == 0) goto L_0x0047;
    L_0x0044:
        r9.close();
    L_0x0047:
        throw r10;
    L_0x0048:
        r9 = r1;
    L_0x0049:
        if (r9 == 0) goto L_0x004e;
    L_0x004b:
        r9.close();
    L_0x004e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.c.a(android.content.Context, android.net.Uri):java.io.File");
    }

    public static void m6162a(Context context, Bitmap bitmap, Uri uri, CompressFormat compressFormat, int i) {
        Throwable th;
        Closeable closeable = null;
        try {
            Closeable openOutputStream = context.getContentResolver().openOutputStream(uri);
            try {
                bitmap.compress(compressFormat, i, openOutputStream);
                C2258c.m6164a(openOutputStream);
            } catch (Throwable th2) {
                th = th2;
                closeable = openOutputStream;
                C2258c.m6164a(closeable);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            C2258c.m6164a(closeable);
            throw th;
        }
    }

    private static void m6163a(Rect rect, int i, int i2) {
        if (i == i2 && rect.width() != rect.height()) {
            if (rect.height() > rect.width()) {
                rect.bottom -= rect.height() - rect.width();
                return;
            }
            rect.right -= rect.width() - rect.height();
        }
    }

    private static void m6164a(java.io.Closeable r0) {
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
        if (r0 == 0) goto L_0x0005;
    L_0x0002:
        r0.close();	 Catch:{ IOException -> 0x0005 }
    L_0x0005:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.c.a(java.io.Closeable):void");
    }
}
