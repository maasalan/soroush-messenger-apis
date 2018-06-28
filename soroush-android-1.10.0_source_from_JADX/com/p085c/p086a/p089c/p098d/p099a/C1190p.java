package com.p085c.p086a.p089c.p098d.p099a;

import com.p085c.p086a.p089c.p092b.p093a.C1104b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class C1190p extends FilterInputStream {
    private volatile byte[] f3778a;
    private int f3779b;
    private int f3780c;
    private int f3781d;
    private int f3782e;
    private final C1104b f3783f;

    public static class C1189a extends IOException {
        public C1189a(String str) {
            super(str);
        }
    }

    public C1190p(InputStream inputStream, C1104b c1104b) {
        this(inputStream, c1104b, (byte) 0);
    }

    private C1190p(InputStream inputStream, C1104b c1104b, byte b) {
        super(inputStream);
        this.f3781d = -1;
        this.f3783f = c1104b;
        this.f3778a = (byte[]) c1104b.mo1130a(65536, byte[].class);
    }

    private int m2831a(InputStream inputStream, byte[] bArr) {
        int read;
        if (this.f3781d != -1) {
            if (this.f3782e - this.f3781d < this.f3780c) {
                if (this.f3781d == 0 && this.f3780c > bArr.length && this.f3779b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length > this.f3780c) {
                        length = this.f3780c;
                    }
                    byte[] bArr2 = (byte[]) this.f3783f.mo1130a(length, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f3778a = bArr2;
                    this.f3783f.mo1133a((Object) bArr, byte[].class);
                    bArr = bArr2;
                } else if (this.f3781d > 0) {
                    System.arraycopy(bArr, this.f3781d, bArr, 0, bArr.length - this.f3781d);
                }
                this.f3782e -= this.f3781d;
                this.f3781d = 0;
                this.f3779b = 0;
                read = inputStream.read(bArr, this.f3782e, bArr.length - this.f3782e);
                this.f3779b = read <= 0 ? this.f3782e : this.f3782e + read;
                return read;
            }
        }
        read = inputStream.read(bArr);
        if (read > 0) {
            this.f3781d = -1;
            this.f3782e = 0;
            this.f3779b = read;
        }
        return read;
    }

    private static IOException m2832c() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final synchronized void m2833a() {
        this.f3780c = this.f3778a.length;
    }

    public final synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f3778a != null) {
            if (inputStream != null) {
            }
        }
        throw C1190p.m2832c();
        return (this.f3779b - this.f3782e) + inputStream.available();
    }

    public final synchronized void m2834b() {
        if (this.f3778a != null) {
            this.f3783f.mo1133a(this.f3778a, byte[].class);
            this.f3778a = null;
        }
    }

    public final void close() {
        if (this.f3778a != null) {
            this.f3783f.mo1133a(this.f3778a, byte[].class);
            this.f3778a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final synchronized void mark(int i) {
        this.f3780c = Math.max(this.f3780c, i);
        this.f3781d = this.f3782e;
    }

    public final boolean markSupported() {
        return true;
    }

    public final synchronized int read() {
        byte[] bArr = this.f3778a;
        InputStream inputStream = this.in;
        if (bArr != null) {
            if (inputStream != null) {
                if (this.f3782e >= this.f3779b && m2831a(inputStream, bArr) == -1) {
                    return -1;
                }
                if (bArr != this.f3778a) {
                    bArr = this.f3778a;
                    if (bArr == null) {
                        throw C1190p.m2832c();
                    }
                }
                if (this.f3779b - this.f3782e <= 0) {
                    return -1;
                }
                int i = this.f3782e;
                this.f3782e = i + 1;
                return bArr[i] & 255;
            }
        }
        throw C1190p.m2832c();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read(byte[] r6, int r7, int r8) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.f3778a;	 Catch:{ all -> 0x0098 }
        if (r0 != 0) goto L_0x000a;
    L_0x0005:
        r6 = com.p085c.p086a.p089c.p098d.p099a.C1190p.m2832c();	 Catch:{ all -> 0x0098 }
        throw r6;	 Catch:{ all -> 0x0098 }
    L_0x000a:
        if (r8 != 0) goto L_0x000f;
    L_0x000c:
        r6 = 0;
        monitor-exit(r5);
        return r6;
    L_0x000f:
        r1 = r5.in;	 Catch:{ all -> 0x0098 }
        if (r1 != 0) goto L_0x0018;
    L_0x0013:
        r6 = com.p085c.p086a.p089c.p098d.p099a.C1190p.m2832c();	 Catch:{ all -> 0x0098 }
        throw r6;	 Catch:{ all -> 0x0098 }
    L_0x0018:
        r2 = r5.f3782e;	 Catch:{ all -> 0x0098 }
        r3 = r5.f3779b;	 Catch:{ all -> 0x0098 }
        if (r2 >= r3) goto L_0x0045;
    L_0x001e:
        r2 = r5.f3779b;	 Catch:{ all -> 0x0098 }
        r3 = r5.f3782e;	 Catch:{ all -> 0x0098 }
        r2 = r2 - r3;
        if (r2 < r8) goto L_0x0027;
    L_0x0025:
        r2 = r8;
        goto L_0x002c;
    L_0x0027:
        r2 = r5.f3779b;	 Catch:{ all -> 0x0098 }
        r3 = r5.f3782e;	 Catch:{ all -> 0x0098 }
        r2 = r2 - r3;
    L_0x002c:
        r3 = r5.f3782e;	 Catch:{ all -> 0x0098 }
        java.lang.System.arraycopy(r0, r3, r6, r7, r2);	 Catch:{ all -> 0x0098 }
        r3 = r5.f3782e;	 Catch:{ all -> 0x0098 }
        r3 = r3 + r2;
        r5.f3782e = r3;	 Catch:{ all -> 0x0098 }
        if (r2 == r8) goto L_0x0043;
    L_0x0038:
        r3 = r1.available();	 Catch:{ all -> 0x0098 }
        if (r3 != 0) goto L_0x003f;
    L_0x003e:
        goto L_0x0043;
    L_0x003f:
        r7 = r7 + r2;
        r2 = r8 - r2;
        goto L_0x0046;
    L_0x0043:
        monitor-exit(r5);
        return r2;
    L_0x0045:
        r2 = r8;
    L_0x0046:
        r3 = r5.f3781d;	 Catch:{ all -> 0x0098 }
        r4 = -1;
        if (r3 != r4) goto L_0x005b;
    L_0x004b:
        r3 = r0.length;	 Catch:{ all -> 0x0098 }
        if (r2 < r3) goto L_0x005b;
    L_0x004e:
        r3 = r1.read(r6, r7, r2);	 Catch:{ all -> 0x0098 }
        if (r3 != r4) goto L_0x008a;
    L_0x0054:
        if (r2 != r8) goto L_0x0058;
    L_0x0056:
        monitor-exit(r5);
        return r4;
    L_0x0058:
        r8 = r8 - r2;
        monitor-exit(r5);
        return r8;
    L_0x005b:
        r3 = r5.m2831a(r1, r0);	 Catch:{ all -> 0x0098 }
        if (r3 != r4) goto L_0x0065;
    L_0x0061:
        if (r2 != r8) goto L_0x0058;
    L_0x0063:
        monitor-exit(r5);
        return r4;
    L_0x0065:
        r3 = r5.f3778a;	 Catch:{ all -> 0x0098 }
        if (r0 == r3) goto L_0x0072;
    L_0x0069:
        r0 = r5.f3778a;	 Catch:{ all -> 0x0098 }
        if (r0 != 0) goto L_0x0072;
    L_0x006d:
        r6 = com.p085c.p086a.p089c.p098d.p099a.C1190p.m2832c();	 Catch:{ all -> 0x0098 }
        throw r6;	 Catch:{ all -> 0x0098 }
    L_0x0072:
        r3 = r5.f3779b;	 Catch:{ all -> 0x0098 }
        r4 = r5.f3782e;	 Catch:{ all -> 0x0098 }
        r3 = r3 - r4;
        if (r3 < r2) goto L_0x007b;
    L_0x0079:
        r3 = r2;
        goto L_0x0080;
    L_0x007b:
        r3 = r5.f3779b;	 Catch:{ all -> 0x0098 }
        r4 = r5.f3782e;	 Catch:{ all -> 0x0098 }
        r3 = r3 - r4;
    L_0x0080:
        r4 = r5.f3782e;	 Catch:{ all -> 0x0098 }
        java.lang.System.arraycopy(r0, r4, r6, r7, r3);	 Catch:{ all -> 0x0098 }
        r4 = r5.f3782e;	 Catch:{ all -> 0x0098 }
        r4 = r4 + r3;
        r5.f3782e = r4;	 Catch:{ all -> 0x0098 }
    L_0x008a:
        r2 = r2 - r3;
        if (r2 != 0) goto L_0x008f;
    L_0x008d:
        monitor-exit(r5);
        return r8;
    L_0x008f:
        r4 = r1.available();	 Catch:{ all -> 0x0098 }
        if (r4 != 0) goto L_0x0096;
    L_0x0095:
        goto L_0x0058;
    L_0x0096:
        r7 = r7 + r3;
        goto L_0x0046;
    L_0x0098:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.c.d.a.p.read(byte[], int, int):int");
    }

    public final synchronized void reset() {
        if (this.f3778a == null) {
            throw new IOException("Stream is closed");
        } else if (-1 == this.f3781d) {
            StringBuilder stringBuilder = new StringBuilder("Mark has been invalidated, pos: ");
            stringBuilder.append(this.f3782e);
            stringBuilder.append(" markLimit: ");
            stringBuilder.append(this.f3780c);
            throw new C1189a(stringBuilder.toString());
        } else {
            this.f3782e = this.f3781d;
        }
    }

    public final synchronized long skip(long j) {
        byte[] bArr = this.f3778a;
        InputStream inputStream = this.in;
        if (bArr == null) {
            throw C1190p.m2832c();
        } else if (j < 1) {
            return 0;
        } else {
            if (inputStream == null) {
                throw C1190p.m2832c();
            } else if (((long) (this.f3779b - this.f3782e)) >= j) {
                this.f3782e = (int) (((long) this.f3782e) + j);
                return j;
            } else {
                long j2 = (long) (this.f3779b - this.f3782e);
                this.f3782e = this.f3779b;
                if (this.f3781d == -1 || j > ((long) this.f3780c)) {
                    return j2 + inputStream.skip(j - j2);
                } else if (m2831a(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    long j3 = j - j2;
                    if (((long) (this.f3779b - this.f3782e)) >= j3) {
                        this.f3782e = (int) (((long) this.f3782e) + j3);
                        return j;
                    }
                    j2 = (j2 + ((long) this.f3779b)) - ((long) this.f3782e);
                    this.f3782e = this.f3779b;
                    return j2;
                }
            }
        }
    }
}
