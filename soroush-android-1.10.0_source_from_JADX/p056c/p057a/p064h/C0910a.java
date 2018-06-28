package p056c.p057a.p064h;

import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import p056c.p057a.C0885c;

public final class C0910a {
    private static final byte[] f2776a = new byte[]{(byte) 42};
    private static final String[] f2777b = new String[0];
    private static final String[] f2778c = new String[]{"*"};
    private static final C0910a f2779d = new C0910a();
    private final AtomicBoolean f2780e = new AtomicBoolean(false);
    private final CountDownLatch f2781f = new CountDownLatch(1);
    private byte[] f2782g;
    private byte[] f2783h;

    public static C0910a m2227a() {
        return f2779d;
    }

    private static String m2228a(byte[] bArr, byte[][] bArr2, int i) {
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3;
            int i4;
            int i5 = (i2 + length) / 2;
            while (i5 >= 0 && bArr[i5] != (byte) 10) {
                i5--;
            }
            i5++;
            int i6 = 1;
            while (true) {
                i3 = i5 + i6;
                if (bArr[i3] == (byte) 10) {
                    break;
                }
                i6++;
            }
            int i7 = i3 - i5;
            int i8 = i;
            i6 = 0;
            int i9 = i6;
            int i10 = i9;
            while (true) {
                if (i6 != 0) {
                    i4 = 46;
                    i6 = 0;
                } else {
                    i4 = bArr2[i8][i9] & 255;
                }
                i4 -= bArr[i5 + i10] & 255;
                if (i4 != 0) {
                    break;
                }
                i10++;
                i9++;
                if (i10 != i7) {
                    if (bArr2[i8].length == i9) {
                        if (i8 == bArr2.length - 1) {
                            break;
                        }
                        i8++;
                        i9 = -1;
                        i6 = 1;
                    }
                } else {
                    break;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i11 = i7 - i10;
                    i6 = bArr2[i8].length - i9;
                    while (true) {
                        i8++;
                        if (i8 >= bArr2.length) {
                            break;
                        }
                        i6 += bArr2[i8].length;
                    }
                    if (i6 >= i11) {
                        if (i6 <= i11) {
                            return new String(bArr, i5, i7, C0885c.f2637e);
                        }
                    }
                }
                i2 = i3 + 1;
            }
            length = i5 - 1;
        }
        return null;
    }

    private java.lang.String[] m2229a(java.lang.String[] r8) {
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
        r7 = this;
        r0 = r7.f2780e;
        r0 = r0.get();
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x0079;
    L_0x000a:
        r0 = r7.f2780e;
        r0 = r0.compareAndSet(r1, r2);
        if (r0 == 0) goto L_0x0079;
    L_0x0012:
        r0 = r1;
    L_0x0013:
        r3 = p056c.p057a.p064h.C0910a.class;	 Catch:{ InterruptedIOException -> 0x0077, IOException -> 0x005f }
        r4 = "publicsuffixes.gz";	 Catch:{ InterruptedIOException -> 0x0077, IOException -> 0x005f }
        r3 = r3.getResourceAsStream(r4);	 Catch:{ InterruptedIOException -> 0x0077, IOException -> 0x005f }
        if (r3 == 0) goto L_0x0053;	 Catch:{ InterruptedIOException -> 0x0077, IOException -> 0x005f }
    L_0x001d:
        r4 = new d.j;	 Catch:{ InterruptedIOException -> 0x0077, IOException -> 0x005f }
        r3 = p206d.C2273l.m6213a(r3);	 Catch:{ InterruptedIOException -> 0x0077, IOException -> 0x005f }
        r4.<init>(r3);	 Catch:{ InterruptedIOException -> 0x0077, IOException -> 0x005f }
        r3 = p206d.C2273l.m6209a(r4);	 Catch:{ InterruptedIOException -> 0x0077, IOException -> 0x005f }
        r4 = r3.mo3140h();	 Catch:{ all -> 0x004e }
        r4 = new byte[r4];	 Catch:{ all -> 0x004e }
        r3.mo3123a(r4);	 Catch:{ all -> 0x004e }
        r5 = r3.mo3140h();	 Catch:{ all -> 0x004e }
        r5 = new byte[r5];	 Catch:{ all -> 0x004e }
        r3.mo3123a(r5);	 Catch:{ all -> 0x004e }
        p056c.p057a.C0885c.m2098a(r3);	 Catch:{ InterruptedIOException -> 0x0077, IOException -> 0x005f }
        monitor-enter(r7);	 Catch:{ InterruptedIOException -> 0x0077, IOException -> 0x005f }
        r7.f2782g = r4;	 Catch:{ all -> 0x004b }
        r7.f2783h = r5;	 Catch:{ all -> 0x004b }
        monitor-exit(r7);	 Catch:{ all -> 0x004b }
        r3 = r7.f2781f;	 Catch:{ InterruptedIOException -> 0x0077, IOException -> 0x005f }
        r3.countDown();	 Catch:{ InterruptedIOException -> 0x0077, IOException -> 0x005f }
        goto L_0x0053;
    L_0x004b:
        r3 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x004b }
        throw r3;	 Catch:{ InterruptedIOException -> 0x0077, IOException -> 0x005f }
    L_0x004e:
        r4 = move-exception;	 Catch:{ InterruptedIOException -> 0x0077, IOException -> 0x005f }
        p056c.p057a.C0885c.m2098a(r3);	 Catch:{ InterruptedIOException -> 0x0077, IOException -> 0x005f }
        throw r4;	 Catch:{ InterruptedIOException -> 0x0077, IOException -> 0x005f }
    L_0x0053:
        if (r0 == 0) goto L_0x007e;
    L_0x0055:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
        goto L_0x007e;
    L_0x005d:
        r8 = move-exception;
        goto L_0x006d;
    L_0x005f:
        r3 = move-exception;
        r4 = p056c.p057a.p063g.C0909f.m2216c();	 Catch:{ all -> 0x005d }
        r5 = 5;	 Catch:{ all -> 0x005d }
        r6 = "Failed to read public suffix list";	 Catch:{ all -> 0x005d }
        r4.mo990a(r5, r6, r3);	 Catch:{ all -> 0x005d }
        if (r0 == 0) goto L_0x007e;
    L_0x006c:
        goto L_0x0055;
    L_0x006d:
        if (r0 == 0) goto L_0x0076;
    L_0x006f:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x0076:
        throw r8;
    L_0x0077:
        r0 = r2;
        goto L_0x0013;
    L_0x0079:
        r0 = r7.f2781f;	 Catch:{ InterruptedException -> 0x007e }
        r0.await();	 Catch:{ InterruptedException -> 0x007e }
    L_0x007e:
        monitor-enter(r7);
        r0 = r7.f2782g;	 Catch:{ all -> 0x011e }
        if (r0 != 0) goto L_0x008b;	 Catch:{ all -> 0x011e }
    L_0x0083:
        r8 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x011e }
        r0 = "Unable to load publicsuffixes.gz resource from the classpath.";	 Catch:{ all -> 0x011e }
        r8.<init>(r0);	 Catch:{ all -> 0x011e }
        throw r8;	 Catch:{ all -> 0x011e }
    L_0x008b:
        monitor-exit(r7);	 Catch:{ all -> 0x011e }
        r0 = r8.length;
        r0 = new byte[r0][];
        r3 = r1;
    L_0x0090:
        r4 = r8.length;
        if (r3 >= r4) goto L_0x00a0;
    L_0x0093:
        r4 = r8[r3];
        r5 = p056c.p057a.C0885c.f2637e;
        r4 = r4.getBytes(r5);
        r0[r3] = r4;
        r3 = r3 + 1;
        goto L_0x0090;
    L_0x00a0:
        r8 = r1;
    L_0x00a1:
        r3 = 0;
        r4 = r0.length;
        if (r8 >= r4) goto L_0x00b1;
    L_0x00a5:
        r4 = r7.f2782g;
        r4 = p056c.p057a.p064h.C0910a.m2228a(r4, r0, r8);
        if (r4 == 0) goto L_0x00ae;
    L_0x00ad:
        goto L_0x00b2;
    L_0x00ae:
        r8 = r8 + 1;
        goto L_0x00a1;
    L_0x00b1:
        r4 = r3;
    L_0x00b2:
        r8 = r0.length;
        if (r8 <= r2) goto L_0x00d0;
    L_0x00b5:
        r8 = r0.clone();
        r8 = (byte[][]) r8;
        r5 = r1;
    L_0x00bc:
        r6 = r8.length;
        r6 = r6 - r2;
        if (r5 >= r6) goto L_0x00d0;
    L_0x00c0:
        r6 = f2776a;
        r8[r5] = r6;
        r6 = r7.f2782g;
        r6 = p056c.p057a.p064h.C0910a.m2228a(r6, r8, r5);
        if (r6 == 0) goto L_0x00cd;
    L_0x00cc:
        goto L_0x00d1;
    L_0x00cd:
        r5 = r5 + 1;
        goto L_0x00bc;
    L_0x00d0:
        r6 = r3;
    L_0x00d1:
        if (r6 == 0) goto L_0x00e3;
    L_0x00d3:
        r8 = r0.length;
        r8 = r8 - r2;
        if (r1 >= r8) goto L_0x00e3;
    L_0x00d7:
        r8 = r7.f2783h;
        r8 = p056c.p057a.p064h.C0910a.m2228a(r8, r0, r1);
        if (r8 == 0) goto L_0x00e0;
    L_0x00df:
        goto L_0x00e4;
    L_0x00e0:
        r1 = r1 + 1;
        goto L_0x00d3;
    L_0x00e3:
        r8 = r3;
    L_0x00e4:
        if (r8 == 0) goto L_0x00fb;
    L_0x00e6:
        r0 = new java.lang.StringBuilder;
        r1 = "!";
        r0.<init>(r1);
        r0.append(r8);
        r8 = r0.toString();
        r0 = "\\.";
        r8 = r8.split(r0);
        return r8;
    L_0x00fb:
        if (r4 != 0) goto L_0x0102;
    L_0x00fd:
        if (r6 != 0) goto L_0x0102;
    L_0x00ff:
        r8 = f2778c;
        return r8;
    L_0x0102:
        if (r4 == 0) goto L_0x010b;
    L_0x0104:
        r8 = "\\.";
        r8 = r4.split(r8);
        goto L_0x010d;
    L_0x010b:
        r8 = f2777b;
    L_0x010d:
        if (r6 == 0) goto L_0x0116;
    L_0x010f:
        r0 = "\\.";
        r0 = r6.split(r0);
        goto L_0x0118;
    L_0x0116:
        r0 = f2777b;
    L_0x0118:
        r1 = r8.length;
        r2 = r0.length;
        if (r1 <= r2) goto L_0x011d;
    L_0x011c:
        return r8;
    L_0x011d:
        return r0;
    L_0x011e:
        r8 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x011e }
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.h.a.a(java.lang.String[]):java.lang.String[]");
    }

    public final String m2230a(String str) {
        if (str == null) {
            throw new NullPointerException("domain == null");
        }
        String[] split = IDN.toUnicode(str).split("\\.");
        String[] a = m2229a(split);
        if (split.length == a.length && a[0].charAt(0) != '!') {
            return null;
        }
        int length;
        int length2;
        if (a[0].charAt(0) == '!') {
            length = split.length;
            length2 = a.length;
        } else {
            length = split.length;
            length2 = a.length + 1;
        }
        StringBuilder stringBuilder = new StringBuilder();
        String[] split2 = str.split("\\.");
        for (length -= length2; length < split2.length; length++) {
            stringBuilder.append(split2[length]);
            stringBuilder.append('.');
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }
}
