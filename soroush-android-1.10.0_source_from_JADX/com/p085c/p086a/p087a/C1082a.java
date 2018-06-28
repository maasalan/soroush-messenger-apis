package com.p085c.p086a.p087a;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class C1082a implements Closeable {
    final ThreadPoolExecutor f3535a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C1078a());
    private final File f3536b;
    private final File f3537c;
    private final File f3538d;
    private final File f3539e;
    private final int f3540f;
    private long f3541g;
    private final int f3542h;
    private long f3543i = 0;
    private Writer f3544j;
    private final LinkedHashMap<String, C1080c> f3545k = new LinkedHashMap(0, 0.75f, true);
    private int f3546l;
    private long f3547m = 0;
    private final Callable<Void> f3548n = new C10771(this);

    class C10771 implements Callable<Void> {
        final /* synthetic */ C1082a f3517a;

        C10771(C1082a c1082a) {
            this.f3517a = c1082a;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.Void m2600a() {
            /*
            r3 = this;
            r0 = r3.f3517a;
            monitor-enter(r0);
            r1 = r3.f3517a;	 Catch:{ all -> 0x0027 }
            r1 = r1.f3544j;	 Catch:{ all -> 0x0027 }
            r2 = 0;
            if (r1 != 0) goto L_0x000e;
        L_0x000c:
            monitor-exit(r0);	 Catch:{ all -> 0x0027 }
            return r2;
        L_0x000e:
            r1 = r3.f3517a;	 Catch:{ all -> 0x0027 }
            r1.m2624f();	 Catch:{ all -> 0x0027 }
            r1 = r3.f3517a;	 Catch:{ all -> 0x0027 }
            r1 = r1.m2620d();	 Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x0025;
        L_0x001b:
            r1 = r3.f3517a;	 Catch:{ all -> 0x0027 }
            r1.m2616c();	 Catch:{ all -> 0x0027 }
            r1 = r3.f3517a;	 Catch:{ all -> 0x0027 }
            r1.f3546l = 0;	 Catch:{ all -> 0x0027 }
        L_0x0025:
            monitor-exit(r0);	 Catch:{ all -> 0x0027 }
            return r2;
        L_0x0027:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0027 }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.c.a.a.a.1.a():java.lang.Void");
        }

        public final /* synthetic */ Object call() {
            return m2600a();
        }
    }

    private static final class C1078a implements ThreadFactory {
        private C1078a() {
        }

        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    public final class C1079b {
        final C1080c f3518a;
        final boolean[] f3519b;
        public boolean f3520c;
        public final /* synthetic */ C1082a f3521d;

        private C1079b(C1082a c1082a, C1080c c1080c) {
            this.f3521d = c1082a;
            this.f3518a = c1080c;
            this.f3519b = c1080c.f3526e ? null : new boolean[c1082a.f3542h];
        }

        public final File m2601a() {
            File file;
            synchronized (this.f3521d) {
                if (this.f3518a.f3527f != this) {
                    throw new IllegalStateException();
                }
                if (!this.f3518a.f3526e) {
                    this.f3519b[0] = true;
                }
                file = this.f3518a.f3525d[0];
                if (!this.f3521d.f3536b.exists()) {
                    this.f3521d.f3536b.mkdirs();
                }
            }
            return file;
        }

        public final void m2602b() {
            this.f3521d.m2610a(this, false);
        }

        public final void m2603c() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r1 = this;
            r0 = r1.f3520c;
            if (r0 != 0) goto L_0x0007;
        L_0x0004:
            r1.m2602b();	 Catch:{ IOException -> 0x0007 }
        L_0x0007:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.c.a.a.a.b.c():void");
        }
    }

    private final class C1080c {
        final String f3522a;
        final long[] f3523b;
        File[] f3524c;
        File[] f3525d;
        boolean f3526e;
        C1079b f3527f;
        long f3528g;
        final /* synthetic */ C1082a f3529h;

        private C1080c(C1082a c1082a, String str) {
            this.f3529h = c1082a;
            this.f3522a = str;
            this.f3523b = new long[c1082a.f3542h];
            this.f3524c = new File[c1082a.f3542h];
            this.f3525d = new File[c1082a.f3542h];
            StringBuilder stringBuilder = new StringBuilder(str);
            stringBuilder.append('.');
            int length = stringBuilder.length();
            for (int i = 0; i < c1082a.f3542h; i++) {
                stringBuilder.append(i);
                this.f3524c[i] = new File(c1082a.f3536b, stringBuilder.toString());
                stringBuilder.append(".tmp");
                this.f3525d[i] = new File(c1082a.f3536b, stringBuilder.toString());
                stringBuilder.setLength(length);
            }
        }

        private static IOException m2604b(String[] strArr) {
            StringBuilder stringBuilder = new StringBuilder("unexpected journal line: ");
            stringBuilder.append(Arrays.toString(strArr));
            throw new IOException(stringBuilder.toString());
        }

        public final String m2605a() {
            StringBuilder stringBuilder = new StringBuilder();
            for (long j : this.f3523b) {
                stringBuilder.append(' ');
                stringBuilder.append(j);
            }
            return stringBuilder.toString();
        }

        final void m2606a(java.lang.String[] r5) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r4 = this;
            r0 = r5.length;
            r1 = r4.f3529h;
            r1 = r1.f3542h;
            if (r0 == r1) goto L_0x000e;
        L_0x0009:
            r5 = com.p085c.p086a.p087a.C1082a.C1080c.m2604b(r5);
            throw r5;
        L_0x000e:
            r0 = 0;
        L_0x000f:
            r1 = r5.length;	 Catch:{ NumberFormatException -> 0x0020 }
            if (r0 >= r1) goto L_0x001f;	 Catch:{ NumberFormatException -> 0x0020 }
        L_0x0012:
            r1 = r4.f3523b;	 Catch:{ NumberFormatException -> 0x0020 }
            r2 = r5[r0];	 Catch:{ NumberFormatException -> 0x0020 }
            r2 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x0020 }
            r1[r0] = r2;	 Catch:{ NumberFormatException -> 0x0020 }
            r0 = r0 + 1;
            goto L_0x000f;
        L_0x001f:
            return;
        L_0x0020:
            r5 = com.p085c.p086a.p087a.C1082a.C1080c.m2604b(r5);
            throw r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.c.a.a.a.c.a(java.lang.String[]):void");
        }
    }

    public final class C1081d {
        public final File[] f3530a;
        final /* synthetic */ C1082a f3531b;
        private final String f3532c;
        private final long f3533d;
        private final long[] f3534e;

        private C1081d(C1082a c1082a, String str, long j, File[] fileArr, long[] jArr) {
            this.f3531b = c1082a;
            this.f3532c = str;
            this.f3533d = j;
            this.f3530a = fileArr;
            this.f3534e = jArr;
        }
    }

    private C1082a(File file, long j) {
        File file2 = file;
        this.f3536b = file2;
        this.f3540f = 1;
        this.f3537c = new File(file2, "journal");
        this.f3538d = new File(file2, "journal.tmp");
        this.f3539e = new File(file2, "journal.bkp");
        this.f3542h = 1;
        this.f3541g = j;
    }

    public static C1082a m2607a(File file, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                C1082a.m2613a(file2, file3, false);
            }
        }
        C1082a c1082a = new C1082a(file, j);
        if (c1082a.f3537c.exists()) {
            try {
                c1082a.m2609a();
                c1082a.m2614b();
                return c1082a;
            } catch (IOException e) {
                PrintStream printStream = System.out;
                StringBuilder stringBuilder = new StringBuilder("DiskLruCache ");
                stringBuilder.append(file);
                stringBuilder.append(" is corrupt: ");
                stringBuilder.append(e.getMessage());
                stringBuilder.append(", removing");
                printStream.println(stringBuilder.toString());
                c1082a.close();
                C1085c.m2631a(c1082a.f3536b);
            }
        }
        file.mkdirs();
        c1082a = new C1082a(file, j);
        c1082a.m2616c();
        return c1082a;
    }

    private void m2609a() {
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
        r11 = this;
        r0 = new com.c.a.a.b;
        r1 = new java.io.FileInputStream;
        r2 = r11.f3537c;
        r1.<init>(r2);
        r2 = com.p085c.p086a.p087a.C1085c.f3555a;
        r0.<init>(r1, r2);
        r1 = r0.m2629a();	 Catch:{ all -> 0x0167 }
        r2 = r0.m2629a();	 Catch:{ all -> 0x0167 }
        r3 = r0.m2629a();	 Catch:{ all -> 0x0167 }
        r4 = r0.m2629a();	 Catch:{ all -> 0x0167 }
        r5 = r0.m2629a();	 Catch:{ all -> 0x0167 }
        r6 = "libcore.io.DiskLruCache";	 Catch:{ all -> 0x0167 }
        r6 = r6.equals(r1);	 Catch:{ all -> 0x0167 }
        if (r6 == 0) goto L_0x0136;	 Catch:{ all -> 0x0167 }
    L_0x002a:
        r6 = "1";	 Catch:{ all -> 0x0167 }
        r6 = r6.equals(r2);	 Catch:{ all -> 0x0167 }
        if (r6 == 0) goto L_0x0136;	 Catch:{ all -> 0x0167 }
    L_0x0032:
        r6 = r11.f3540f;	 Catch:{ all -> 0x0167 }
        r6 = java.lang.Integer.toString(r6);	 Catch:{ all -> 0x0167 }
        r3 = r6.equals(r3);	 Catch:{ all -> 0x0167 }
        if (r3 == 0) goto L_0x0136;	 Catch:{ all -> 0x0167 }
    L_0x003e:
        r3 = r11.f3542h;	 Catch:{ all -> 0x0167 }
        r3 = java.lang.Integer.toString(r3);	 Catch:{ all -> 0x0167 }
        r3 = r3.equals(r4);	 Catch:{ all -> 0x0167 }
        if (r3 == 0) goto L_0x0136;	 Catch:{ all -> 0x0167 }
    L_0x004a:
        r3 = "";	 Catch:{ all -> 0x0167 }
        r3 = r3.equals(r5);	 Catch:{ all -> 0x0167 }
        if (r3 != 0) goto L_0x0054;
    L_0x0052:
        goto L_0x0136;
    L_0x0054:
        r1 = 0;
        r2 = r1;
    L_0x0056:
        r3 = 1;
        r4 = -1;
        r5 = r0.m2629a();	 Catch:{ EOFException -> 0x0109 }
        r6 = 32;	 Catch:{ EOFException -> 0x0109 }
        r7 = r5.indexOf(r6);	 Catch:{ EOFException -> 0x0109 }
        if (r7 != r4) goto L_0x0078;	 Catch:{ EOFException -> 0x0109 }
    L_0x0064:
        r6 = new java.io.IOException;	 Catch:{ EOFException -> 0x0109 }
        r7 = new java.lang.StringBuilder;	 Catch:{ EOFException -> 0x0109 }
        r8 = "unexpected journal line: ";	 Catch:{ EOFException -> 0x0109 }
        r7.<init>(r8);	 Catch:{ EOFException -> 0x0109 }
        r7.append(r5);	 Catch:{ EOFException -> 0x0109 }
        r5 = r7.toString();	 Catch:{ EOFException -> 0x0109 }
        r6.<init>(r5);	 Catch:{ EOFException -> 0x0109 }
        throw r6;	 Catch:{ EOFException -> 0x0109 }
    L_0x0078:
        r8 = r7 + 1;	 Catch:{ EOFException -> 0x0109 }
        r6 = r5.indexOf(r6, r8);	 Catch:{ EOFException -> 0x0109 }
        if (r6 != r4) goto L_0x0095;	 Catch:{ EOFException -> 0x0109 }
    L_0x0080:
        r8 = r5.substring(r8);	 Catch:{ EOFException -> 0x0109 }
        r9 = 6;	 Catch:{ EOFException -> 0x0109 }
        if (r7 != r9) goto L_0x0099;	 Catch:{ EOFException -> 0x0109 }
    L_0x0087:
        r9 = "REMOVE";	 Catch:{ EOFException -> 0x0109 }
        r9 = r5.startsWith(r9);	 Catch:{ EOFException -> 0x0109 }
        if (r9 == 0) goto L_0x0099;	 Catch:{ EOFException -> 0x0109 }
    L_0x008f:
        r5 = r11.f3545k;	 Catch:{ EOFException -> 0x0109 }
        r5.remove(r8);	 Catch:{ EOFException -> 0x0109 }
        goto L_0x00f1;	 Catch:{ EOFException -> 0x0109 }
    L_0x0095:
        r8 = r5.substring(r8, r6);	 Catch:{ EOFException -> 0x0109 }
    L_0x0099:
        r9 = r11.f3545k;	 Catch:{ EOFException -> 0x0109 }
        r9 = r9.get(r8);	 Catch:{ EOFException -> 0x0109 }
        r9 = (com.p085c.p086a.p087a.C1082a.C1080c) r9;	 Catch:{ EOFException -> 0x0109 }
        if (r9 != 0) goto L_0x00ad;	 Catch:{ EOFException -> 0x0109 }
    L_0x00a3:
        r9 = new com.c.a.a.a$c;	 Catch:{ EOFException -> 0x0109 }
        r9.<init>(r8);	 Catch:{ EOFException -> 0x0109 }
        r10 = r11.f3545k;	 Catch:{ EOFException -> 0x0109 }
        r10.put(r8, r9);	 Catch:{ EOFException -> 0x0109 }
    L_0x00ad:
        r8 = 5;	 Catch:{ EOFException -> 0x0109 }
        if (r6 == r4) goto L_0x00cf;	 Catch:{ EOFException -> 0x0109 }
    L_0x00b0:
        if (r7 != r8) goto L_0x00cf;	 Catch:{ EOFException -> 0x0109 }
    L_0x00b2:
        r10 = "CLEAN";	 Catch:{ EOFException -> 0x0109 }
        r10 = r5.startsWith(r10);	 Catch:{ EOFException -> 0x0109 }
        if (r10 == 0) goto L_0x00cf;	 Catch:{ EOFException -> 0x0109 }
    L_0x00ba:
        r6 = r6 + 1;	 Catch:{ EOFException -> 0x0109 }
        r5 = r5.substring(r6);	 Catch:{ EOFException -> 0x0109 }
        r6 = " ";	 Catch:{ EOFException -> 0x0109 }
        r5 = r5.split(r6);	 Catch:{ EOFException -> 0x0109 }
        r9.f3526e = r3;	 Catch:{ EOFException -> 0x0109 }
        r6 = 0;	 Catch:{ EOFException -> 0x0109 }
        r9.f3527f = r6;	 Catch:{ EOFException -> 0x0109 }
        r9.m2606a(r5);	 Catch:{ EOFException -> 0x0109 }
        goto L_0x00f1;	 Catch:{ EOFException -> 0x0109 }
    L_0x00cf:
        if (r6 != r4) goto L_0x00e3;	 Catch:{ EOFException -> 0x0109 }
    L_0x00d1:
        if (r7 != r8) goto L_0x00e3;	 Catch:{ EOFException -> 0x0109 }
    L_0x00d3:
        r8 = "DIRTY";	 Catch:{ EOFException -> 0x0109 }
        r8 = r5.startsWith(r8);	 Catch:{ EOFException -> 0x0109 }
        if (r8 == 0) goto L_0x00e3;	 Catch:{ EOFException -> 0x0109 }
    L_0x00db:
        r5 = new com.c.a.a.a$b;	 Catch:{ EOFException -> 0x0109 }
        r5.<init>(r9);	 Catch:{ EOFException -> 0x0109 }
        r9.f3527f = r5;	 Catch:{ EOFException -> 0x0109 }
        goto L_0x00f1;	 Catch:{ EOFException -> 0x0109 }
    L_0x00e3:
        if (r6 != r4) goto L_0x00f5;	 Catch:{ EOFException -> 0x0109 }
    L_0x00e5:
        r6 = 4;	 Catch:{ EOFException -> 0x0109 }
        if (r7 != r6) goto L_0x00f5;	 Catch:{ EOFException -> 0x0109 }
    L_0x00e8:
        r6 = "READ";	 Catch:{ EOFException -> 0x0109 }
        r6 = r5.startsWith(r6);	 Catch:{ EOFException -> 0x0109 }
        if (r6 != 0) goto L_0x00f1;	 Catch:{ EOFException -> 0x0109 }
    L_0x00f0:
        goto L_0x00f5;	 Catch:{ EOFException -> 0x0109 }
    L_0x00f1:
        r2 = r2 + 1;	 Catch:{ EOFException -> 0x0109 }
        goto L_0x0056;	 Catch:{ EOFException -> 0x0109 }
    L_0x00f5:
        r6 = new java.io.IOException;	 Catch:{ EOFException -> 0x0109 }
        r7 = new java.lang.StringBuilder;	 Catch:{ EOFException -> 0x0109 }
        r8 = "unexpected journal line: ";	 Catch:{ EOFException -> 0x0109 }
        r7.<init>(r8);	 Catch:{ EOFException -> 0x0109 }
        r7.append(r5);	 Catch:{ EOFException -> 0x0109 }
        r5 = r7.toString();	 Catch:{ EOFException -> 0x0109 }
        r6.<init>(r5);	 Catch:{ EOFException -> 0x0109 }
        throw r6;	 Catch:{ EOFException -> 0x0109 }
    L_0x0109:
        r5 = r11.f3545k;	 Catch:{ all -> 0x0167 }
        r5 = r5.size();	 Catch:{ all -> 0x0167 }
        r2 = r2 - r5;	 Catch:{ all -> 0x0167 }
        r11.f3546l = r2;	 Catch:{ all -> 0x0167 }
        r2 = r0.f3551b;	 Catch:{ all -> 0x0167 }
        if (r2 != r4) goto L_0x0117;	 Catch:{ all -> 0x0167 }
    L_0x0116:
        r1 = r3;	 Catch:{ all -> 0x0167 }
    L_0x0117:
        if (r1 == 0) goto L_0x011d;	 Catch:{ all -> 0x0167 }
    L_0x0119:
        r11.m2616c();	 Catch:{ all -> 0x0167 }
        goto L_0x0132;	 Catch:{ all -> 0x0167 }
    L_0x011d:
        r1 = new java.io.BufferedWriter;	 Catch:{ all -> 0x0167 }
        r2 = new java.io.OutputStreamWriter;	 Catch:{ all -> 0x0167 }
        r4 = new java.io.FileOutputStream;	 Catch:{ all -> 0x0167 }
        r5 = r11.f3537c;	 Catch:{ all -> 0x0167 }
        r4.<init>(r5, r3);	 Catch:{ all -> 0x0167 }
        r3 = com.p085c.p086a.p087a.C1085c.f3555a;	 Catch:{ all -> 0x0167 }
        r2.<init>(r4, r3);	 Catch:{ all -> 0x0167 }
        r1.<init>(r2);	 Catch:{ all -> 0x0167 }
        r11.f3544j = r1;	 Catch:{ all -> 0x0167 }
    L_0x0132:
        com.p085c.p086a.p087a.C1085c.m2630a(r0);
        return;
    L_0x0136:
        r3 = new java.io.IOException;	 Catch:{ all -> 0x0167 }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0167 }
        r7 = "unexpected journal header: [";	 Catch:{ all -> 0x0167 }
        r6.<init>(r7);	 Catch:{ all -> 0x0167 }
        r6.append(r1);	 Catch:{ all -> 0x0167 }
        r1 = ", ";	 Catch:{ all -> 0x0167 }
        r6.append(r1);	 Catch:{ all -> 0x0167 }
        r6.append(r2);	 Catch:{ all -> 0x0167 }
        r1 = ", ";	 Catch:{ all -> 0x0167 }
        r6.append(r1);	 Catch:{ all -> 0x0167 }
        r6.append(r4);	 Catch:{ all -> 0x0167 }
        r1 = ", ";	 Catch:{ all -> 0x0167 }
        r6.append(r1);	 Catch:{ all -> 0x0167 }
        r6.append(r5);	 Catch:{ all -> 0x0167 }
        r1 = "]";	 Catch:{ all -> 0x0167 }
        r6.append(r1);	 Catch:{ all -> 0x0167 }
        r1 = r6.toString();	 Catch:{ all -> 0x0167 }
        r3.<init>(r1);	 Catch:{ all -> 0x0167 }
        throw r3;	 Catch:{ all -> 0x0167 }
    L_0x0167:
        r1 = move-exception;
        com.p085c.p086a.p087a.C1085c.m2630a(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.a.a.a():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m2610a(com.p085c.p086a.p087a.C1082a.C1079b r12, boolean r13) {
        /*
        r11 = this;
        monitor-enter(r11);
        r0 = r12.f3518a;	 Catch:{ all -> 0x00f7 }
        r1 = r0.f3527f;	 Catch:{ all -> 0x00f7 }
        if (r1 == r12) goto L_0x000d;
    L_0x0007:
        r12 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x00f7 }
        r12.<init>();	 Catch:{ all -> 0x00f7 }
        throw r12;	 Catch:{ all -> 0x00f7 }
    L_0x000d:
        r1 = 0;
        if (r13 == 0) goto L_0x0048;
    L_0x0010:
        r2 = r0.f3526e;	 Catch:{ all -> 0x00f7 }
        if (r2 != 0) goto L_0x0048;
    L_0x0014:
        r2 = r1;
    L_0x0015:
        r3 = r11.f3542h;	 Catch:{ all -> 0x00f7 }
        if (r2 >= r3) goto L_0x0048;
    L_0x0019:
        r3 = r12.f3519b;	 Catch:{ all -> 0x00f7 }
        r3 = r3[r2];	 Catch:{ all -> 0x00f7 }
        if (r3 != 0) goto L_0x0036;
    L_0x001f:
        r12.m2602b();	 Catch:{ all -> 0x00f7 }
        r12 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x00f7 }
        r13 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00f7 }
        r0 = "Newly created entry didn't create value for index ";
        r13.<init>(r0);	 Catch:{ all -> 0x00f7 }
        r13.append(r2);	 Catch:{ all -> 0x00f7 }
        r13 = r13.toString();	 Catch:{ all -> 0x00f7 }
        r12.<init>(r13);	 Catch:{ all -> 0x00f7 }
        throw r12;	 Catch:{ all -> 0x00f7 }
    L_0x0036:
        r3 = r0.f3525d;	 Catch:{ all -> 0x00f7 }
        r3 = r3[r2];	 Catch:{ all -> 0x00f7 }
        r3 = r3.exists();	 Catch:{ all -> 0x00f7 }
        if (r3 != 0) goto L_0x0045;
    L_0x0040:
        r12.m2602b();	 Catch:{ all -> 0x00f7 }
        monitor-exit(r11);
        return;
    L_0x0045:
        r2 = r2 + 1;
        goto L_0x0015;
    L_0x0048:
        r12 = r11.f3542h;	 Catch:{ all -> 0x00f7 }
        if (r1 >= r12) goto L_0x007a;
    L_0x004c:
        r12 = r0.f3525d;	 Catch:{ all -> 0x00f7 }
        r12 = r12[r1];	 Catch:{ all -> 0x00f7 }
        if (r13 == 0) goto L_0x0074;
    L_0x0052:
        r2 = r12.exists();	 Catch:{ all -> 0x00f7 }
        if (r2 == 0) goto L_0x0077;
    L_0x0058:
        r2 = r0.f3524c;	 Catch:{ all -> 0x00f7 }
        r2 = r2[r1];	 Catch:{ all -> 0x00f7 }
        r12.renameTo(r2);	 Catch:{ all -> 0x00f7 }
        r12 = r0.f3523b;	 Catch:{ all -> 0x00f7 }
        r3 = r12[r1];	 Catch:{ all -> 0x00f7 }
        r5 = r2.length();	 Catch:{ all -> 0x00f7 }
        r12 = r0.f3523b;	 Catch:{ all -> 0x00f7 }
        r12[r1] = r5;	 Catch:{ all -> 0x00f7 }
        r7 = r11.f3543i;	 Catch:{ all -> 0x00f7 }
        r9 = r7 - r3;
        r2 = r9 + r5;
        r11.f3543i = r2;	 Catch:{ all -> 0x00f7 }
        goto L_0x0077;
    L_0x0074:
        com.p085c.p086a.p087a.C1082a.m2612a(r12);	 Catch:{ all -> 0x00f7 }
    L_0x0077:
        r1 = r1 + 1;
        goto L_0x0048;
    L_0x007a:
        r12 = r11.f3546l;	 Catch:{ all -> 0x00f7 }
        r1 = 1;
        r12 = r12 + r1;
        r11.f3546l = r12;	 Catch:{ all -> 0x00f7 }
        r12 = 0;
        r0.f3527f = r12;	 Catch:{ all -> 0x00f7 }
        r12 = r0.f3526e;	 Catch:{ all -> 0x00f7 }
        r12 = r12 | r13;
        r2 = 10;
        r3 = 32;
        if (r12 == 0) goto L_0x00bc;
    L_0x008c:
        r0.f3526e = r1;	 Catch:{ all -> 0x00f7 }
        r12 = r11.f3544j;	 Catch:{ all -> 0x00f7 }
        r1 = "CLEAN";
        r12.append(r1);	 Catch:{ all -> 0x00f7 }
        r12 = r11.f3544j;	 Catch:{ all -> 0x00f7 }
        r12.append(r3);	 Catch:{ all -> 0x00f7 }
        r12 = r11.f3544j;	 Catch:{ all -> 0x00f7 }
        r1 = r0.f3522a;	 Catch:{ all -> 0x00f7 }
        r12.append(r1);	 Catch:{ all -> 0x00f7 }
        r12 = r11.f3544j;	 Catch:{ all -> 0x00f7 }
        r1 = r0.m2605a();	 Catch:{ all -> 0x00f7 }
        r12.append(r1);	 Catch:{ all -> 0x00f7 }
        r12 = r11.f3544j;	 Catch:{ all -> 0x00f7 }
        r12.append(r2);	 Catch:{ all -> 0x00f7 }
        if (r13 == 0) goto L_0x00db;
    L_0x00b1:
        r12 = r11.f3547m;	 Catch:{ all -> 0x00f7 }
        r1 = 1;
        r3 = r12 + r1;
        r11.f3547m = r3;	 Catch:{ all -> 0x00f7 }
        r0.f3528g = r12;	 Catch:{ all -> 0x00f7 }
        goto L_0x00db;
    L_0x00bc:
        r12 = r11.f3545k;	 Catch:{ all -> 0x00f7 }
        r13 = r0.f3522a;	 Catch:{ all -> 0x00f7 }
        r12.remove(r13);	 Catch:{ all -> 0x00f7 }
        r12 = r11.f3544j;	 Catch:{ all -> 0x00f7 }
        r13 = "REMOVE";
        r12.append(r13);	 Catch:{ all -> 0x00f7 }
        r12 = r11.f3544j;	 Catch:{ all -> 0x00f7 }
        r12.append(r3);	 Catch:{ all -> 0x00f7 }
        r12 = r11.f3544j;	 Catch:{ all -> 0x00f7 }
        r13 = r0.f3522a;	 Catch:{ all -> 0x00f7 }
        r12.append(r13);	 Catch:{ all -> 0x00f7 }
        r12 = r11.f3544j;	 Catch:{ all -> 0x00f7 }
        r12.append(r2);	 Catch:{ all -> 0x00f7 }
    L_0x00db:
        r12 = r11.f3544j;	 Catch:{ all -> 0x00f7 }
        r12.flush();	 Catch:{ all -> 0x00f7 }
        r12 = r11.f3543i;	 Catch:{ all -> 0x00f7 }
        r0 = r11.f3541g;	 Catch:{ all -> 0x00f7 }
        r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1));
        if (r2 > 0) goto L_0x00ee;
    L_0x00e8:
        r12 = r11.m2620d();	 Catch:{ all -> 0x00f7 }
        if (r12 == 0) goto L_0x00f5;
    L_0x00ee:
        r12 = r11.f3535a;	 Catch:{ all -> 0x00f7 }
        r13 = r11.f3548n;	 Catch:{ all -> 0x00f7 }
        r12.submit(r13);	 Catch:{ all -> 0x00f7 }
    L_0x00f5:
        monitor-exit(r11);
        return;
    L_0x00f7:
        r12 = move-exception;
        monitor-exit(r11);
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.a.a.a(com.c.a.a.a$b, boolean):void");
    }

    private static void m2612a(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void m2613a(File file, File file2, boolean z) {
        if (z) {
            C1082a.m2612a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private void m2614b() {
        C1082a.m2612a(this.f3538d);
        Iterator it = this.f3545k.values().iterator();
        while (it.hasNext()) {
            C1080c c1080c = (C1080c) it.next();
            int i = 0;
            if (c1080c.f3527f == null) {
                while (i < this.f3542h) {
                    this.f3543i += c1080c.f3523b[i];
                    i++;
                }
            } else {
                c1080c.f3527f = null;
                while (i < this.f3542h) {
                    C1082a.m2612a(c1080c.f3524c[i]);
                    C1082a.m2612a(c1080c.f3525d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    private synchronized void m2616c() {
        if (this.f3544j != null) {
            this.f3544j.close();
        }
        Writer bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3538d), C1085c.f3555a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f3540f));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f3542h));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C1080c c1080c : this.f3545k.values()) {
                String stringBuilder;
                StringBuilder stringBuilder2;
                if (c1080c.f3527f != null) {
                    stringBuilder2 = new StringBuilder("DIRTY ");
                    stringBuilder2.append(c1080c.f3522a);
                    stringBuilder2.append('\n');
                    stringBuilder = stringBuilder2.toString();
                } else {
                    stringBuilder2 = new StringBuilder("CLEAN ");
                    stringBuilder2.append(c1080c.f3522a);
                    stringBuilder2.append(c1080c.m2605a());
                    stringBuilder2.append('\n');
                    stringBuilder = stringBuilder2.toString();
                }
                bufferedWriter.write(stringBuilder);
            }
            if (this.f3537c.exists()) {
                C1082a.m2613a(this.f3537c, this.f3539e, true);
            }
            C1082a.m2613a(this.f3538d, this.f3537c, false);
            this.f3539e.delete();
            this.f3544j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3537c, true), C1085c.f3555a));
        } finally {
            bufferedWriter.close();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m2618c(java.lang.String r10) {
        /*
        r9 = this;
        monitor-enter(r9);
        r9.m2622e();	 Catch:{ all -> 0x0085 }
        r0 = r9.f3545k;	 Catch:{ all -> 0x0085 }
        r0 = r0.get(r10);	 Catch:{ all -> 0x0085 }
        r0 = (com.p085c.p086a.p087a.C1082a.C1080c) r0;	 Catch:{ all -> 0x0085 }
        r1 = 0;
        if (r0 == 0) goto L_0x0083;
    L_0x000f:
        r2 = r0.f3527f;	 Catch:{ all -> 0x0085 }
        if (r2 == 0) goto L_0x0014;
    L_0x0013:
        goto L_0x0083;
    L_0x0014:
        r2 = r9.f3542h;	 Catch:{ all -> 0x0085 }
        if (r1 >= r2) goto L_0x004f;
    L_0x0018:
        r2 = r0.f3524c;	 Catch:{ all -> 0x0085 }
        r2 = r2[r1];	 Catch:{ all -> 0x0085 }
        r3 = r2.exists();	 Catch:{ all -> 0x0085 }
        if (r3 == 0) goto L_0x003c;
    L_0x0022:
        r3 = r2.delete();	 Catch:{ all -> 0x0085 }
        if (r3 != 0) goto L_0x003c;
    L_0x0028:
        r10 = new java.io.IOException;	 Catch:{ all -> 0x0085 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0085 }
        r1 = "failed to delete ";
        r0.<init>(r1);	 Catch:{ all -> 0x0085 }
        r0.append(r2);	 Catch:{ all -> 0x0085 }
        r0 = r0.toString();	 Catch:{ all -> 0x0085 }
        r10.<init>(r0);	 Catch:{ all -> 0x0085 }
        throw r10;	 Catch:{ all -> 0x0085 }
    L_0x003c:
        r2 = r9.f3543i;	 Catch:{ all -> 0x0085 }
        r4 = r0.f3523b;	 Catch:{ all -> 0x0085 }
        r5 = r4[r1];	 Catch:{ all -> 0x0085 }
        r7 = r2 - r5;
        r9.f3543i = r7;	 Catch:{ all -> 0x0085 }
        r2 = r0.f3523b;	 Catch:{ all -> 0x0085 }
        r3 = 0;
        r2[r1] = r3;	 Catch:{ all -> 0x0085 }
        r1 = r1 + 1;
        goto L_0x0014;
    L_0x004f:
        r0 = r9.f3546l;	 Catch:{ all -> 0x0085 }
        r1 = 1;
        r0 = r0 + r1;
        r9.f3546l = r0;	 Catch:{ all -> 0x0085 }
        r0 = r9.f3544j;	 Catch:{ all -> 0x0085 }
        r2 = "REMOVE";
        r0.append(r2);	 Catch:{ all -> 0x0085 }
        r0 = r9.f3544j;	 Catch:{ all -> 0x0085 }
        r2 = 32;
        r0.append(r2);	 Catch:{ all -> 0x0085 }
        r0 = r9.f3544j;	 Catch:{ all -> 0x0085 }
        r0.append(r10);	 Catch:{ all -> 0x0085 }
        r0 = r9.f3544j;	 Catch:{ all -> 0x0085 }
        r2 = 10;
        r0.append(r2);	 Catch:{ all -> 0x0085 }
        r0 = r9.f3545k;	 Catch:{ all -> 0x0085 }
        r0.remove(r10);	 Catch:{ all -> 0x0085 }
        r10 = r9.m2620d();	 Catch:{ all -> 0x0085 }
        if (r10 == 0) goto L_0x0081;
    L_0x007a:
        r10 = r9.f3535a;	 Catch:{ all -> 0x0085 }
        r0 = r9.f3548n;	 Catch:{ all -> 0x0085 }
        r10.submit(r0);	 Catch:{ all -> 0x0085 }
    L_0x0081:
        monitor-exit(r9);
        return r1;
    L_0x0083:
        monitor-exit(r9);
        return r1;
    L_0x0085:
        r10 = move-exception;
        monitor-exit(r9);
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.a.a.c(java.lang.String):boolean");
    }

    private boolean m2620d() {
        return this.f3546l >= 2000 && this.f3546l >= this.f3545k.size();
    }

    private void m2622e() {
        if (this.f3544j == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private void m2624f() {
        while (this.f3543i > this.f3541g) {
            m2618c((String) ((Entry) this.f3545k.entrySet().iterator().next()).getKey());
        }
    }

    public final synchronized C1081d m2626a(String str) {
        m2622e();
        C1080c c1080c = (C1080c) this.f3545k.get(str);
        if (c1080c == null) {
            return null;
        }
        if (!c1080c.f3526e) {
            return null;
        }
        for (File exists : c1080c.f3524c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.f3546l++;
        this.f3544j.append("READ");
        this.f3544j.append(' ');
        this.f3544j.append(str);
        this.f3544j.append('\n');
        if (m2620d()) {
            this.f3535a.submit(this.f3548n);
        }
        return new C1081d(str, c1080c.f3528g, c1080c.f3524c, c1080c.f3523b);
    }

    public final synchronized C1079b m2627b(String str) {
        m2622e();
        C1080c c1080c = (C1080c) this.f3545k.get(str);
        if (c1080c == null) {
            c1080c = new C1080c(str);
            this.f3545k.put(str, c1080c);
        } else if (c1080c.f3527f != null) {
            return null;
        }
        C1079b c1079b = new C1079b(c1080c);
        c1080c.f3527f = c1079b;
        this.f3544j.append("DIRTY");
        this.f3544j.append(' ');
        this.f3544j.append(str);
        this.f3544j.append('\n');
        this.f3544j.flush();
        return c1079b;
    }

    public final synchronized void close() {
        if (this.f3544j != null) {
            Iterator it = new ArrayList(this.f3545k.values()).iterator();
            while (it.hasNext()) {
                C1080c c1080c = (C1080c) it.next();
                if (c1080c.f3527f != null) {
                    c1080c.f3527f.m2602b();
                }
            }
            m2624f();
            this.f3544j.close();
            this.f3544j = null;
        }
    }
}
