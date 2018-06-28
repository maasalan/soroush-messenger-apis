package com.p085c.p086a.p109i;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

public final class C1264a {
    private static final AtomicReference<byte[]> f3965a = new AtomicReference();

    private static class C1262a extends InputStream {
        private final ByteBuffer f3959a;
        private int f3960b = -1;

        public C1262a(ByteBuffer byteBuffer) {
            this.f3959a = byteBuffer;
        }

        public final int available() {
            return this.f3959a.remaining();
        }

        public final synchronized void mark(int i) {
            this.f3960b = this.f3959a.position();
        }

        public final boolean markSupported() {
            return true;
        }

        public final int read() {
            return !this.f3959a.hasRemaining() ? -1 : this.f3959a.get();
        }

        public final int read(byte[] bArr, int i, int i2) {
            if (!this.f3959a.hasRemaining()) {
                return -1;
            }
            i2 = Math.min(i2, available());
            this.f3959a.get(bArr, i, i2);
            return i2;
        }

        public final synchronized void reset() {
            if (this.f3960b == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f3959a.position(this.f3960b);
        }

        public final long skip(long j) {
            if (!this.f3959a.hasRemaining()) {
                return -1;
            }
            j = Math.min(j, (long) available());
            this.f3959a.position((int) (((long) this.f3959a.position()) + j));
            return j;
        }
    }

    static final class C1263b {
        final int f3961a;
        final int f3962b;
        final byte[] f3963c;

        public C1263b(byte[] bArr, int i, int i2) {
            this.f3963c = bArr;
            this.f3961a = i;
            this.f3962b = i2;
        }
    }

    public static java.nio.ByteBuffer m2989a(java.io.File r9) {
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
        r0 = 0;
        r1 = new java.io.RandomAccessFile;	 Catch:{ all -> 0x002b }
        r2 = "r";	 Catch:{ all -> 0x002b }
        r1.<init>(r9, r2);	 Catch:{ all -> 0x002b }
        r2 = r1.getChannel();	 Catch:{ all -> 0x0029 }
        r4 = java.nio.channels.FileChannel.MapMode.READ_ONLY;	 Catch:{ all -> 0x0026 }
        r5 = 0;	 Catch:{ all -> 0x0026 }
        r7 = r9.length();	 Catch:{ all -> 0x0026 }
        r3 = r2;	 Catch:{ all -> 0x0026 }
        r9 = r3.map(r4, r5, r7);	 Catch:{ all -> 0x0026 }
        r9 = r9.load();	 Catch:{ all -> 0x0026 }
        if (r2 == 0) goto L_0x0022;
    L_0x001f:
        r2.close();	 Catch:{ IOException -> 0x0022 }
    L_0x0022:
        r1.close();	 Catch:{ IOException -> 0x0025 }
    L_0x0025:
        return r9;
    L_0x0026:
        r9 = move-exception;
        r0 = r2;
        goto L_0x002d;
    L_0x0029:
        r9 = move-exception;
        goto L_0x002d;
    L_0x002b:
        r9 = move-exception;
        r1 = r0;
    L_0x002d:
        if (r0 == 0) goto L_0x0032;
    L_0x002f:
        r0.close();	 Catch:{ IOException -> 0x0032 }
    L_0x0032:
        if (r1 == 0) goto L_0x0037;
    L_0x0034:
        r1.close();	 Catch:{ IOException -> 0x0037 }
    L_0x0037:
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.i.a.a(java.io.File):java.nio.ByteBuffer");
    }

    public static void m2990a(java.nio.ByteBuffer r3, java.io.File r4) {
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
        r0 = 0;
        r1 = new java.io.RandomAccessFile;	 Catch:{ all -> 0x0027 }
        r2 = "rw";	 Catch:{ all -> 0x0027 }
        r1.<init>(r4, r2);	 Catch:{ all -> 0x0027 }
        r4 = r1.getChannel();	 Catch:{ all -> 0x0024 }
        r4.write(r3);	 Catch:{ all -> 0x0022 }
        r3 = 0;	 Catch:{ all -> 0x0022 }
        r4.force(r3);	 Catch:{ all -> 0x0022 }
        r4.close();	 Catch:{ all -> 0x0022 }
        r1.close();	 Catch:{ all -> 0x0022 }
        if (r4 == 0) goto L_0x001e;
    L_0x001b:
        r4.close();	 Catch:{ IOException -> 0x001e }
    L_0x001e:
        r1.close();	 Catch:{ IOException -> 0x0021 }
    L_0x0021:
        return;
    L_0x0022:
        r3 = move-exception;
        goto L_0x002a;
    L_0x0024:
        r3 = move-exception;
        r4 = r0;
        goto L_0x002a;
    L_0x0027:
        r3 = move-exception;
        r4 = r0;
        r1 = r4;
    L_0x002a:
        if (r4 == 0) goto L_0x002f;
    L_0x002c:
        r4.close();	 Catch:{ IOException -> 0x002f }
    L_0x002f:
        if (r1 == 0) goto L_0x0034;
    L_0x0031:
        r1.close();	 Catch:{ IOException -> 0x0034 }
    L_0x0034:
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.i.a.a(java.nio.ByteBuffer, java.io.File):void");
    }

    public static byte[] m2991a(ByteBuffer byteBuffer) {
        C1263b c1263b = (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) ? null : new C1263b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        if (c1263b != null && c1263b.f3961a == 0 && c1263b.f3962b == c1263b.f3963c.length) {
            return byteBuffer.array();
        }
        byteBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.position(0);
        byteBuffer.get(bArr);
        return bArr;
    }

    public static InputStream m2992b(ByteBuffer byteBuffer) {
        return new C1262a(byteBuffer);
    }
}
