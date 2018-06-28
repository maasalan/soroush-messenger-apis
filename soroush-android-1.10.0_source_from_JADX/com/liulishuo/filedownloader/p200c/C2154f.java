package com.liulishuo.filedownloader.p200c;

import android.content.Intent;
import android.database.sqlite.SQLiteFullException;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Parcelable;
import com.liulishuo.filedownloader.message.C2202c.C2200a;
import com.liulishuo.filedownloader.message.C2203d;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.liulishuo.filedownloader.p199b.C2137a;
import com.liulishuo.filedownloader.p200c.C2147c.C2146a;
import com.liulishuo.filedownloader.p202e.C2164a;
import com.liulishuo.filedownloader.p202e.C2166d;
import com.liulishuo.filedownloader.p205h.C2181c;
import com.liulishuo.filedownloader.p205h.C2182d;
import com.liulishuo.filedownloader.p205h.C2184e;
import com.liulishuo.filedownloader.p205h.C2185f;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.LockSupport;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C2154f implements Callback {
    public final FileDownloadModel f7183a;
    public final C2137a f7184b;
    final C2153a f7185c;
    final int f7186d;
    final int f7187e;
    long f7188f;
    Handler f7189g;
    HandlerThread f7190h;
    volatile long f7191i = 0;
    final AtomicLong f7192j = new AtomicLong();
    final AtomicBoolean f7193k = new AtomicBoolean(false);
    final AtomicBoolean f7194l = new AtomicBoolean(false);
    final AtomicBoolean f7195m = new AtomicBoolean(true);
    private final int f7196n;
    private volatile boolean f7197o = false;
    private volatile Thread f7198p;

    public static class C2153a {
        public boolean f7180a;
        public Exception f7181b;
        public int f7182c;
    }

    C2154f(FileDownloadModel fileDownloadModel, int i, int i2, int i3) {
        this.f7183a = fileDownloadModel;
        this.f7184b = C2146a.f7150a.m5896b();
        int i4 = 5;
        if (i2 >= 5) {
            i4 = i2;
        }
        this.f7186d = i4;
        this.f7187e = i3;
        this.f7185c = new C2153a();
        this.f7196n = i;
    }

    static long m5909a(long j, long j2) {
        if (j2 <= 0) {
            return -1;
        }
        if (j == -1) {
            return 1;
        }
        j /= j2;
        return j <= 0 ? 1 : j;
    }

    private void m5910a(SQLiteFullException sQLiteFullException) {
        int i = this.f7183a.f7290a;
        if (C2182d.f7249a) {
            C2182d.m5983c(this, "the data of the task[%d] is dirty, because the SQLite full exception[%s], so remove it from the database directly.", Integer.valueOf(i), sQLiteFullException.toString());
        }
        this.f7183a.f7297h = sQLiteFullException.toString();
        this.f7183a.m6058a((byte) -1);
        this.f7184b.mo1856e(i);
        this.f7184b.mo1855d(i);
    }

    private Exception m5911b(Exception exception) {
        String b = this.f7183a.m6061b();
        if ((this.f7183a.m6064d() || C2184e.m5988a().f7256f) && (exception instanceof IOException) && new File(b).exists()) {
            long d = C2185f.m6014d(b);
            if (d <= IjkMediaMeta.AV_CH_TOP_FRONT_LEFT) {
                long length;
                File file = new File(b);
                if (file.exists()) {
                    length = file.length();
                } else {
                    C2182d.m5981a((Object) this, (Throwable) exception, "Exception with: free space isn't enough, and the target file not exist.", new Object[0]);
                    length = 0;
                }
                if (VERSION.SDK_INT >= 9) {
                    return new C2166d(d, length, (Throwable) exception);
                }
                Exception c2166d = new C2166d(d, (long) IjkMediaMeta.AV_CH_TOP_FRONT_LEFT, length);
            }
        }
        return exception;
    }

    final void m5912a() {
        if (this.f7189g != null) {
            this.f7189g.removeCallbacksAndMessages(null);
            this.f7190h.quit();
            this.f7198p = Thread.currentThread();
            while (this.f7197o) {
                LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(100));
            }
            this.f7198p = null;
        }
    }

    public final void m5913a(byte b) {
        if (b == (byte) -2) {
            if (C2182d.f7249a) {
                C2182d.m5983c(this, "High concurrent cause, Already paused and we don't need to call-back to Task in here, %d", Integer.valueOf(this.f7183a.f7290a));
            }
            return;
        }
        C2200a.f7279a.m6048a(C2203d.m6050a(b, this.f7183a, this.f7185c));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final synchronized void m5914a(android.os.Message r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.f7190h;	 Catch:{ all -> 0x0048 }
        r0 = r0.isAlive();	 Catch:{ all -> 0x0048 }
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x0020;
    L_0x000b:
        r0 = com.liulishuo.filedownloader.p205h.C2182d.f7249a;	 Catch:{ all -> 0x0048 }
        if (r0 == 0) goto L_0x001e;
    L_0x000f:
        r0 = "require callback %d but the host thread of the flow has already dead, what is occurred because of there are several reason can final this flow on different thread.";
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x0048 }
        r5 = r5.what;	 Catch:{ all -> 0x0048 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x0048 }
        r2[r1] = r5;	 Catch:{ all -> 0x0048 }
        com.liulishuo.filedownloader.p205h.C2182d.m5983c(r4, r0, r2);	 Catch:{ all -> 0x0048 }
    L_0x001e:
        monitor-exit(r4);
        return;
    L_0x0020:
        r0 = r4.f7189g;	 Catch:{ IllegalStateException -> 0x0027 }
        r0.sendMessage(r5);	 Catch:{ IllegalStateException -> 0x0027 }
        monitor-exit(r4);
        return;
    L_0x0027:
        r0 = move-exception;
        r3 = r4.f7190h;	 Catch:{ all -> 0x0048 }
        r3 = r3.isAlive();	 Catch:{ all -> 0x0048 }
        if (r3 != 0) goto L_0x0047;
    L_0x0030:
        r0 = com.liulishuo.filedownloader.p205h.C2182d.f7249a;	 Catch:{ all -> 0x0048 }
        if (r0 == 0) goto L_0x0045;
    L_0x0034:
        r0 = "require callback %d but the host thread of the flow has already dead, what is occurred because of there are several reason can final this flow on different thread.";
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x0048 }
        r5 = r5.what;	 Catch:{ all -> 0x0048 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x0048 }
        r2[r1] = r5;	 Catch:{ all -> 0x0048 }
        com.liulishuo.filedownloader.p205h.C2182d.m5983c(r4, r0, r2);	 Catch:{ all -> 0x0048 }
        monitor-exit(r4);
        return;
    L_0x0045:
        monitor-exit(r4);
        return;
    L_0x0047:
        throw r0;	 Catch:{ all -> 0x0048 }
    L_0x0048:
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.c.f.a(android.os.Message):void");
    }

    final void m5915a(Exception exception) {
        Exception b = m5911b(exception);
        if (!(b instanceof SQLiteFullException)) {
            try {
                this.f7183a.m6058a((byte) -1);
                this.f7183a.f7297h = exception.toString();
                this.f7184b.mo1848a(this.f7183a.f7290a, (Throwable) b, this.f7183a.f7295f.get());
            } catch (Exception exception2) {
                b = exception2;
            }
            this.f7185c.f7181b = b;
            m5913a((byte) -1);
        }
        m5910a((SQLiteFullException) b);
        this.f7185c.f7181b = b;
        m5913a((byte) -1);
    }

    final void m5916a(Exception exception, int i) {
        Throwable b = m5911b(exception);
        this.f7185c.f7181b = b;
        this.f7185c.f7182c = this.f7196n - i;
        this.f7183a.m6058a((byte) 5);
        this.f7183a.f7297h = b.toString();
        this.f7184b.mo1847a(this.f7183a.f7290a, b);
        m5913a((byte) 5);
    }

    final void m5917b() {
        this.f7183a.m6058a((byte) -2);
        this.f7184b.mo1853b(this.f7183a.f7290a, this.f7183a.f7295f.get());
        m5913a((byte) -2);
    }

    final void m5918c() {
        int i;
        String b;
        String a;
        File file;
        File file2;
        long length;
        int renameTo;
        Throwable th;
        Parcelable parcelable;
        if (this.f7183a.m6064d()) {
            this.f7183a.m6062b(this.f7183a.f7295f.get());
        } else if (this.f7183a.f7295f.get() != this.f7183a.f7296g) {
            m5915a(new C2164a(C2185f.m5996a("sofar[%d] not equal total[%d]", Long.valueOf(this.f7183a.f7295f.get()), Long.valueOf(this.f7183a.f7296g))));
            i = 1;
            if (i != 0) {
                b = this.f7183a.m6061b();
                a = this.f7183a.m6057a();
                file = new File(b);
                try {
                    file2 = new File(a);
                    if (file2.exists()) {
                        length = file2.length();
                        if (file2.delete()) {
                            throw new IOException(C2185f.m5996a("Can't delete the old file([%s], [%d]), so can't replace it with the new downloaded one.", a, Long.valueOf(length)));
                        } else {
                            C2182d.m5984d(this, "The target file([%s], [%d]) will be replaced with the new downloaded file[%d]", a, Long.valueOf(length), Long.valueOf(file.length()));
                        }
                    }
                    renameTo = file.renameTo(file2) ^ 1;
                    if (renameTo == 0) {
                        try {
                            throw new IOException(C2185f.m5996a("Can't rename the  temp downloaded file(%s) to the target file(%s)", b, a));
                        } catch (Throwable th2) {
                            th = th2;
                            if (!(renameTo == 0 || !file.exists() || file.delete())) {
                                C2182d.m5984d(this, "delete the temp file(%s) failed, on completed downloading.", b);
                            }
                            throw th;
                        }
                    }
                    this.f7183a.m6058a((byte) -3);
                    C2137a c2137a = this.f7184b;
                    int i2 = this.f7183a.f7290a;
                    long j = this.f7183a.f7296g;
                    c2137a.mo1857f(i2);
                    this.f7184b.mo1855d(this.f7183a.f7290a);
                    m5913a((byte) -3);
                    if (C2184e.m5988a().f7257g) {
                        parcelable = this.f7183a;
                        if (parcelable == null) {
                            throw new IllegalArgumentException();
                        } else if (parcelable.m6063c() == (byte) -3) {
                            throw new IllegalStateException();
                        } else {
                            Intent intent = new Intent("filedownloader.intent.action.completed");
                            intent.putExtra("model", parcelable);
                            C2181c.f7248a.sendBroadcast(intent);
                        }
                    }
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    renameTo = 1;
                    C2182d.m5984d(this, "delete the temp file(%s) failed, on completed downloading.", b);
                    throw th;
                }
            }
        }
        i = 0;
        if (i != 0) {
            b = this.f7183a.m6061b();
            a = this.f7183a.m6057a();
            file = new File(b);
            file2 = new File(a);
            if (file2.exists()) {
                length = file2.length();
                if (file2.delete()) {
                    C2182d.m5984d(this, "The target file([%s], [%d]) will be replaced with the new downloaded file[%d]", a, Long.valueOf(length), Long.valueOf(file.length()));
                } else {
                    throw new IOException(C2185f.m5996a("Can't delete the old file([%s], [%d]), so can't replace it with the new downloaded one.", a, Long.valueOf(length)));
                }
            }
            renameTo = file.renameTo(file2) ^ 1;
            if (renameTo == 0) {
                this.f7183a.m6058a((byte) -3);
                C2137a c2137a2 = this.f7184b;
                int i22 = this.f7183a.f7290a;
                long j2 = this.f7183a.f7296g;
                c2137a2.mo1857f(i22);
                this.f7184b.mo1855d(this.f7183a.f7290a);
                m5913a((byte) -3);
                if (C2184e.m5988a().f7257g) {
                    parcelable = this.f7183a;
                    if (parcelable == null) {
                        throw new IllegalArgumentException();
                    } else if (parcelable.m6063c() == (byte) -3) {
                        Intent intent2 = new Intent("filedownloader.intent.action.completed");
                        intent2.putExtra("model", parcelable);
                        C2181c.f7248a.sendBroadcast(intent2);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                return;
            }
            throw new IOException(C2185f.m5996a("Can't rename the  temp downloaded file(%s) to the target file(%s)", b, a));
        }
    }

    final void m5919d() {
        if (this.f7183a.f7295f.get() == this.f7183a.f7296g) {
            this.f7184b.mo1844a(this.f7183a.f7290a, this.f7183a.f7295f.get());
            return;
        }
        if (this.f7194l.compareAndSet(true, false)) {
            if (C2182d.f7249a) {
                C2182d.m5982b(this, "handleProgress update model's status with progress", new Object[0]);
            }
            this.f7183a.m6058a((byte) 3);
        }
        if (this.f7193k.compareAndSet(true, false)) {
            if (C2182d.f7249a) {
                C2182d.m5982b(this, "handleProgress notify user progress status", new Object[0]);
            }
            m5913a((byte) 3);
        }
    }

    public final boolean handleMessage(Message message) {
        this.f7197o = true;
        int i = message.what;
        if (i == 3) {
            m5919d();
        } else if (i == 5) {
            try {
                m5916a((Exception) message.obj, message.arg1);
            } catch (Throwable th) {
                this.f7197o = false;
                if (this.f7198p != null) {
                    LockSupport.unpark(this.f7198p);
                }
            }
        }
        this.f7197o = false;
        if (this.f7198p != null) {
            LockSupport.unpark(this.f7198p);
        }
        return true;
    }
}
