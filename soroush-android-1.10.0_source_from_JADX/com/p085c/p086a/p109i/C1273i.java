package com.p085c.p086a.p109i;

import android.graphics.Bitmap.Config;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

public final class C1273i {
    private static final char[] f3981a = "0123456789abcdef".toCharArray();
    private static final char[] f3982b = new char[64];

    static /* synthetic */ class C12721 {
        static final /* synthetic */ int[] f3980a = new int[Config.values().length];

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
            r0 = android.graphics.Bitmap.Config.values();
            r0 = r0.length;
            r0 = new int[r0];
            f3980a = r0;
            r0 = f3980a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = android.graphics.Bitmap.Config.ALPHA_8;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f3980a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = android.graphics.Bitmap.Config.RGB_565;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f3980a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = android.graphics.Bitmap.Config.ARGB_4444;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = f3980a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.c.a.i.i.1.<clinit>():void");
        }
    }

    public static int m3016a(int i, int i2, Config config) {
        i *= i2;
        if (config == null) {
            config = Config.ARGB_8888;
        }
        switch (C12721.f3980a[config.ordinal()]) {
            case 1:
                i2 = 1;
                break;
            case 2:
            case 3:
                i2 = 2;
                break;
            default:
                i2 = 4;
                break;
        }
        return i * i2;
    }

    @android.annotation.TargetApi(19)
    public static int m3017a(android.graphics.Bitmap r3) {
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
        r0 = r3.isRecycled();
        if (r0 == 0) goto L_0x003e;
    L_0x0006:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Cannot obtain size for recycled Bitmap: ";
        r1.<init>(r2);
        r1.append(r3);
        r2 = "[";
        r1.append(r2);
        r2 = r3.getWidth();
        r1.append(r2);
        r2 = "x";
        r1.append(r2);
        r2 = r3.getHeight();
        r1.append(r2);
        r2 = "] ";
        r1.append(r2);
        r3 = r3.getConfig();
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
    L_0x003e:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 19;
        if (r0 < r1) goto L_0x0049;
    L_0x0044:
        r0 = r3.getAllocationByteCount();	 Catch:{ NullPointerException -> 0x0049 }
        return r0;
    L_0x0049:
        r0 = r3.getHeight();
        r3 = r3.getRowBytes();
        r0 = r0 * r3;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.i.i.a(android.graphics.Bitmap):int");
    }

    public static String m3018a(byte[] bArr) {
        String str;
        synchronized (f3982b) {
            char[] cArr = f3982b;
            for (int i = 0; i < bArr.length; i++) {
                int i2 = bArr[i] & 255;
                int i3 = i * 2;
                cArr[i3] = f3981a[i2 >>> 4];
                cArr[i3 + 1] = f3981a[i2 & 15];
            }
            str = new String(cArr);
        }
        return str;
    }

    public static <T> List<T> m3019a(Collection<T> collection) {
        List<T> arrayList = new ArrayList(collection.size());
        for (T add : collection) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public static <T> Queue<T> m3020a(int i) {
        return new ArrayDeque(i);
    }

    public static void m3021a() {
        if (!C1273i.m3026c()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean m3022a(int i, int i2) {
        return C1273i.m3025b(i) && C1273i.m3025b(i2);
    }

    public static boolean m3023a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void m3024b() {
        if (!C1273i.m3027d()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    private static boolean m3025b(int i) {
        if (i <= 0) {
            if (i != Integer.MIN_VALUE) {
                return false;
            }
        }
        return true;
    }

    public static boolean m3026c() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean m3027d() {
        return !C1273i.m3026c();
    }
}
