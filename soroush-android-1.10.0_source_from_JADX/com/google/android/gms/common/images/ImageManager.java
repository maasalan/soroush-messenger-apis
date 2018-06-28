package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.p038g.C0469g;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.dj;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

public final class ImageManager {
    private static final Object f5325a = new Object();
    private static HashSet<Uri> f5326b = new HashSet();
    private final Context f5327c;
    private final Handler f5328d;
    private final ExecutorService f5329e;
    private final C5463b f5330f;
    private final dj f5331g;
    private final Map<C1754a, ImageReceiver> f5332h;
    private final Map<Uri, ImageReceiver> f5333i;
    private final Map<Uri, Long> f5334j;

    @KeepName
    final class ImageReceiver extends ResultReceiver {
        private final Uri f5314a;
        private final ArrayList<C1754a> f5315b;
        private /* synthetic */ ImageManager f5316c;

        public final void onReceiveResult(int i, Bundle bundle) {
            this.f5316c.f5329e.execute(new C1752c(this.f5316c, this.f5314a, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    public interface C1751a {
    }

    final class C1752c implements Runnable {
        private final Uri f5317a;
        private final ParcelFileDescriptor f5318b;
        private /* synthetic */ ImageManager f5319c;

        public C1752c(ImageManager imageManager, Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
            this.f5319c = imageManager;
            this.f5317a = uri;
            this.f5318b = parcelFileDescriptor;
        }

        public final void run() {
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
            r12 = this;
            r0 = "LoadBitmapFromDiskRunnable can't be executed in the main thread";
            r1 = android.os.Looper.getMainLooper();
            r1 = r1.getThread();
            r2 = java.lang.Thread.currentThread();
            if (r1 != r2) goto L_0x0061;
        L_0x0010:
            r1 = "Asserts";
            r2 = java.lang.Thread.currentThread();
            r2 = java.lang.String.valueOf(r2);
            r3 = android.os.Looper.getMainLooper();
            r3 = r3.getThread();
            r3 = java.lang.String.valueOf(r3);
            r4 = 56;
            r5 = java.lang.String.valueOf(r2);
            r5 = r5.length();
            r4 = r4 + r5;
            r5 = java.lang.String.valueOf(r3);
            r5 = r5.length();
            r4 = r4 + r5;
            r5 = new java.lang.StringBuilder;
            r5.<init>(r4);
            r4 = "checkNotMainThread: current thread ";
            r5.append(r4);
            r5.append(r2);
            r2 = " IS the main thread ";
            r5.append(r2);
            r5.append(r3);
            r2 = "!";
            r5.append(r2);
            r2 = r5.toString();
            android.util.Log.e(r1, r2);
            r1 = new java.lang.IllegalStateException;
            r1.<init>(r0);
            throw r1;
        L_0x0061:
            r0 = 0;
            r1 = 0;
            r2 = r12.f5318b;
            r3 = 1;
            if (r2 == 0) goto L_0x00ab;
        L_0x0068:
            r2 = r12.f5318b;	 Catch:{ OutOfMemoryError -> 0x0074 }
            r2 = r2.getFileDescriptor();	 Catch:{ OutOfMemoryError -> 0x0074 }
            r2 = android.graphics.BitmapFactory.decodeFileDescriptor(r2);	 Catch:{ OutOfMemoryError -> 0x0074 }
            r1 = r2;
            goto L_0x009d;
        L_0x0074:
            r0 = move-exception;
            r2 = "ImageManager";
            r4 = r12.f5317a;
            r4 = java.lang.String.valueOf(r4);
            r5 = 34;
            r6 = java.lang.String.valueOf(r4);
            r6 = r6.length();
            r5 = r5 + r6;
            r6 = new java.lang.StringBuilder;
            r6.<init>(r5);
            r5 = "OOM while loading bitmap for uri: ";
            r6.append(r5);
            r6.append(r4);
            r4 = r6.toString();
            android.util.Log.e(r2, r4, r0);
            r0 = r3;
        L_0x009d:
            r2 = r12.f5318b;	 Catch:{ IOException -> 0x00a3 }
            r2.close();	 Catch:{ IOException -> 0x00a3 }
            goto L_0x00ab;
        L_0x00a3:
            r2 = move-exception;
            r4 = "ImageManager";
            r5 = "closed failed";
            android.util.Log.e(r4, r5, r2);
        L_0x00ab:
            r10 = r0;
            r9 = r1;
            r0 = new java.util.concurrent.CountDownLatch;
            r0.<init>(r3);
            r1 = r12.f5319c;
            r1 = r1.f5328d;
            r2 = new com.google.android.gms.common.images.ImageManager$d;
            r7 = r12.f5319c;
            r8 = r12.f5317a;
            r6 = r2;
            r11 = r0;
            r6.<init>(r7, r8, r9, r10, r11);
            r1.post(r2);
            r0.await();	 Catch:{ InterruptedException -> 0x00ca }
            return;
        L_0x00ca:
            r0 = "ImageManager";
            r1 = r12.f5317a;
            r1 = java.lang.String.valueOf(r1);
            r2 = 32;
            r3 = java.lang.String.valueOf(r1);
            r3 = r3.length();
            r2 = r2 + r3;
            r3 = new java.lang.StringBuilder;
            r3.<init>(r2);
            r2 = "Latch interrupted while posting ";
            r3.append(r2);
            r3.append(r1);
            r1 = r3.toString();
            android.util.Log.w(r0, r1);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.images.ImageManager.c.run():void");
        }
    }

    final class C1753d implements Runnable {
        private final Uri f5320a;
        private final Bitmap f5321b;
        private final CountDownLatch f5322c;
        private boolean f5323d;
        private /* synthetic */ ImageManager f5324e;

        public C1753d(ImageManager imageManager, Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
            this.f5324e = imageManager;
            this.f5320a = uri;
            this.f5321b = bitmap;
            this.f5323d = z;
            this.f5322c = countDownLatch;
        }

        public final void run() {
            String str = "OnBitmapLoadedRunnable must be executed in the main thread";
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                String valueOf = String.valueOf(Thread.currentThread());
                String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
                StringBuilder stringBuilder = new StringBuilder((57 + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length());
                stringBuilder.append("checkMainThread: current thread ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" IS NOT the main thread ");
                stringBuilder.append(valueOf2);
                stringBuilder.append("!");
                Log.e("Asserts", stringBuilder.toString());
                throw new IllegalStateException(str);
            }
            int i = 0;
            int i2 = this.f5321b != null ? 1 : 0;
            if (this.f5324e.f5330f != null) {
                if (this.f5323d) {
                    this.f5324e.f5330f.evictAll();
                    System.gc();
                    this.f5323d = false;
                    this.f5324e.f5328d.post(this);
                    return;
                } else if (i2 != 0) {
                    this.f5324e.f5330f.put(new C1755b(this.f5320a), this.f5321b);
                }
            }
            ImageReceiver imageReceiver = (ImageReceiver) this.f5324e.f5333i.remove(this.f5320a);
            if (imageReceiver != null) {
                ArrayList a = imageReceiver.f5315b;
                int size = a.size();
                while (i < size) {
                    C1754a c1754a = (C1754a) a.get(i);
                    if (i2 != 0) {
                        c1754a.m4372a(this.f5324e.f5327c, this.f5321b);
                    } else {
                        this.f5324e.f5334j.put(this.f5320a, Long.valueOf(SystemClock.elapsedRealtime()));
                        Context b = this.f5324e.f5327c;
                        this.f5324e.f5331g;
                        c1754a.m4371a(b);
                    }
                    if (!(c1754a instanceof C5464c)) {
                        this.f5324e.f5332h.remove(c1754a);
                    }
                    i++;
                }
            }
            this.f5322c.countDown();
            synchronized (ImageManager.f5325a) {
                ImageManager.f5326b.remove(this.f5320a);
            }
        }
    }

    static final class C5463b extends C0469g<C1755b, Bitmap> {
        protected final /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
            super.entryRemoved(z, (C1755b) obj, (Bitmap) obj2, (Bitmap) obj3);
        }

        protected final /* synthetic */ int sizeOf(Object obj, Object obj2) {
            Bitmap bitmap = (Bitmap) obj2;
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
    }
}
