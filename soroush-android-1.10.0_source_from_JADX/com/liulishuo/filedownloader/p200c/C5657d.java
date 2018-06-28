package com.liulishuo.filedownloader.p200c;

import android.os.SystemClock;
import com.liulishuo.filedownloader.C2231x;
import com.liulishuo.filedownloader.model.C2210a;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.liulishuo.filedownloader.p199b.C2137a;
import com.liulishuo.filedownloader.p200c.C2145b.C2144a;
import com.liulishuo.filedownloader.p200c.C2147c.C2146a;
import com.liulishuo.filedownloader.p200c.C2152e.C2151a;
import com.liulishuo.filedownloader.p202e.C2164a;
import com.liulishuo.filedownloader.p202e.C2165b;
import com.liulishuo.filedownloader.p205h.C2175b.C2174a;
import com.liulishuo.filedownloader.p205h.C2181c;
import com.liulishuo.filedownloader.p205h.C2182d;
import com.liulishuo.filedownloader.p205h.C2185f;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class C5657d implements C2157h, Runnable {
    private static final ThreadPoolExecutor f15531q = new ThreadPoolExecutor(0, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 15, TimeUnit.SECONDS, new SynchronousQueue(), new C2174a("ConnectionBlock"));
    private long f15532A;
    private long f15533B;
    public final C2154f f15534a;
    public final FileDownloadModel f15535b;
    public final C2137a f15536c;
    int f15537d;
    public final ArrayList<C2152e> f15538e;
    public C2152e f15539f;
    public volatile boolean f15540g;
    private final int f15541h;
    private final FileDownloadHeader f15542i;
    private final boolean f15543j;
    private final boolean f15544k;
    private final C2231x f15545l;
    private boolean f15546m;
    private boolean f15547n;
    private final boolean f15548o;
    private boolean f15549p;
    private boolean f15550r;
    private boolean f15551s;
    private boolean f15552t;
    private final AtomicBoolean f15553u;
    private volatile boolean f15554v;
    private volatile Exception f15555w;
    private String f15556x;
    private long f15557y;
    private long f15558z;

    public static class C2148a {
        public FileDownloadModel f7157a;
        public FileDownloadHeader f7158b;
        public C2231x f7159c;
        public Integer f7160d;
        public Integer f7161e;
        public Boolean f7162f;
        public Boolean f7163g;
        public Integer f7164h;
    }

    class C2149b extends Throwable {
        final /* synthetic */ C5657d f7165a;

        C2149b(C5657d c5657d) {
            this.f7165a = c5657d;
        }
    }

    class C2150c extends Throwable {
        final /* synthetic */ C5657d f7166a;

        C2150c(C5657d c5657d) {
            this.f7166a = c5657d;
        }
    }

    private C5657d(FileDownloadModel fileDownloadModel, FileDownloadHeader fileDownloadHeader, C2231x c2231x, int i, int i2, boolean z, boolean z2, int i3) {
        this.f15541h = 5;
        this.f15547n = false;
        this.f15538e = new ArrayList(5);
        this.f15557y = 0;
        this.f15558z = 0;
        this.f15532A = 0;
        this.f15533B = 0;
        this.f15553u = new AtomicBoolean(true);
        this.f15540g = false;
        this.f15546m = false;
        this.f15535b = fileDownloadModel;
        this.f15542i = fileDownloadHeader;
        this.f15543j = z;
        this.f15544k = z2;
        this.f15536c = C2146a.f7150a.m5896b();
        C2146a.f7150a.m5898d();
        this.f15548o = true;
        this.f15545l = c2231x;
        this.f15537d = i3;
        this.f15534a = new C2154f(fileDownloadModel, i3, i, i2);
    }

    private void m12491a(long j, int i) {
        long j2 = j;
        int i2 = i;
        long j3 = j2 / ((long) i2);
        int i3 = this.f15535b.f7290a;
        List arrayList = new ArrayList();
        long j4 = 0;
        int i4 = 0;
        while (i4 < i2) {
            long j5 = i4 == i2 + -1 ? -1 : (j4 + j3) - 1;
            C2210a c2210a = new C2210a();
            c2210a.f7305a = i3;
            c2210a.f7306b = i4;
            c2210a.f7307c = j4;
            c2210a.f7308d = j4;
            c2210a.f7309e = j5;
            arrayList.add(c2210a);
            r0.f15536c.mo1850a(c2210a);
            i4++;
            j4 += j3;
        }
        r0.f15535b.f7299j = i2;
        r0.f15536c.mo1842a(i3, i2);
        m12492a(arrayList, j2);
    }

    private void m12492a(List<C2210a> list, long j) {
        int i = this.f15535b.f7290a;
        String str = this.f15535b.f7298i;
        String str2 = this.f15556x != null ? r0.f15556x : r0.f15535b.f7291b;
        String b = r0.f15535b.m6061b();
        if (C2182d.f7249a) {
            C2182d.m5983c(r0, "fetch data with multiple connection(count: [%d]) for task[%d] totalLength[%d]", Integer.valueOf(list.size()), Integer.valueOf(i), Long.valueOf(j));
        }
        boolean z = r0.f15550r;
        long j2 = 0;
        long j3 = 0;
        for (C2210a c2210a : list) {
            long j4;
            long j5 = c2210a.f7309e == -1 ? j - c2210a.f7308d : (c2210a.f7309e - c2210a.f7308d) + 1;
            long j6 = j3 + (c2210a.f7308d - c2210a.f7307c);
            if (j5 == j2) {
                if (C2182d.f7249a) {
                    C2182d.m5983c(r0, "pass connection[%d-%d], because it has been completed", Integer.valueOf(c2210a.f7305a), Integer.valueOf(c2210a.f7306b));
                }
                j4 = j6;
            } else {
                C2151a c2151a = new C2151a();
                j4 = j6;
                C2145b a = C2144a.m5891a(c2210a.f7307c, c2210a.f7308d, c2210a.f7309e, j5);
                C2151a a2 = c2151a.m5900a(i);
                a2.f7169c = Integer.valueOf(c2210a.f7306b);
                a2.f7167a = r0;
                C2151a a3 = a2.m5903a(str2).m5906b(z ? str : null).m5902a(r0.f15542i).m5904a(r0.f15544k).m5901a(a);
                a3.f7168b = b;
                C2152e a4 = a3.m5905a();
                if (C2182d.f7249a) {
                    C2182d.m5983c(r0, "enable multiple connection: %s", c2210a);
                }
                r0.f15538e.add(a4);
            }
            j3 = j4;
            j2 = 0;
        }
        if (j3 != r0.f15535b.f7295f.get()) {
            C2182d.m5984d(r0, "correct the sofar[%d] from connection table[%d]", Long.valueOf(r0.f15535b.f7295f.get()), Long.valueOf(j3));
            r0.f15535b.m6059a(j3);
        }
        Collection arrayList = new ArrayList(r0.f15538e.size());
        Iterator it = r0.f15538e.iterator();
        while (it.hasNext()) {
            C2152e c2152e = (C2152e) it.next();
            if (r0.f15540g) {
                c2152e.m5908a();
            } else {
                arrayList.add(Executors.callable(c2152e));
            }
        }
        if (r0.f15540g) {
            r0.f15535b.m6058a((byte) -2);
            return;
        }
        List<Future> invokeAll = f15531q.invokeAll(arrayList);
        if (C2182d.f7249a) {
            for (Future future : invokeAll) {
                C2182d.m5983c(r0, "finish sub-task for [%d] %B %B", Integer.valueOf(i), Boolean.valueOf(future.isDone()), Boolean.valueOf(future.isCancelled()));
            }
        }
    }

    private void m12493c() {
        int i = this.f15535b.f7290a;
        if (this.f15535b.f7293d) {
            String a = this.f15535b.m6057a();
            int a2 = C2185f.m5989a(this.f15535b.f7291b, a);
            if (C2181c.m5977a(i, a, this.f15543j, false)) {
                this.f15536c.mo1856e(i);
                this.f15536c.mo1855d(i);
                throw new C2149b(this);
            }
            FileDownloadModel b = this.f15536c.mo1852b(a2);
            if (b != null) {
                if (C2181c.m5976a(i, b, this.f15545l, false)) {
                    this.f15536c.mo1856e(i);
                    this.f15536c.mo1855d(i);
                    throw new C2149b(this);
                }
                List<C2210a> c = this.f15536c.mo1854c(a2);
                this.f15536c.mo1856e(a2);
                this.f15536c.mo1855d(a2);
                C2185f.m6019i(this.f15535b.m6057a());
                if (C2185f.m6000a(a2, b)) {
                    this.f15535b.m6059a(b.f7295f.get());
                    this.f15535b.m6062b(b.f7296g);
                    this.f15535b.f7298i = b.f7298i;
                    this.f15535b.f7299j = b.f7299j;
                    this.f15536c.mo1849a(this.f15535b);
                    if (c != null) {
                        for (C2210a c2210a : c) {
                            c2210a.f7305a = i;
                            this.f15536c.mo1850a(c2210a);
                        }
                    }
                    throw new C2150c(this);
                }
            }
            if (C2181c.m5975a(i, this.f15535b.f7295f.get(), this.f15535b.m6061b(), a, this.f15545l)) {
                this.f15536c.mo1856e(i);
                this.f15536c.mo1855d(i);
                throw new C2149b(this);
            }
        }
    }

    public final void mo1864a() {
        this.f15536c.mo1844a(this.f15535b.f7290a, this.f15535b.f7295f.get());
    }

    public final void mo1865a(long j) {
        if (!this.f15540g) {
            boolean z;
            C2154f c2154f = this.f15534a;
            c2154f.f7192j.addAndGet(j);
            c2154f.f7183a.f7295f.addAndGet(j);
            j = SystemClock.elapsedRealtime();
            if (!c2154f.f7195m.compareAndSet(true, false)) {
                long j2 = j - c2154f.f7191i;
                if (c2154f.f7188f == -1 || c2154f.f7192j.get() < c2154f.f7188f || j2 < ((long) c2154f.f7186d)) {
                    z = false;
                    if (z && c2154f.f7193k.compareAndSet(false, true)) {
                        if (C2182d.f7249a) {
                            C2182d.m5982b(c2154f, "inspectNeedCallbackToUser need callback to user", new Object[0]);
                        }
                        c2154f.f7191i = j;
                        c2154f.f7192j.set(0);
                    }
                    if (c2154f.f7189g != null) {
                        c2154f.m5919d();
                    }
                    if (c2154f.f7193k.get()) {
                        c2154f.m5914a(c2154f.f7189g.obtainMessage(3));
                    }
                    return;
                }
            }
            z = true;
            if (C2182d.f7249a) {
                C2182d.m5982b(c2154f, "inspectNeedCallbackToUser need callback to user", new Object[0]);
            }
            c2154f.f7191i = j;
            c2154f.f7192j.set(0);
            if (c2154f.f7189g != null) {
                if (c2154f.f7193k.get()) {
                    c2154f.m5914a(c2154f.f7189g.obtainMessage(3));
                }
                return;
            }
            c2154f.m5919d();
        }
    }

    public final void mo1866a(C2152e c2152e, long j, long j2) {
        if (this.f15540g) {
            if (C2182d.f7249a) {
                C2182d.m5983c(this, "the task[%d] has already been paused, so pass the completed callback", Integer.valueOf(this.f15535b.f7290a));
            }
            return;
        }
        int i = c2152e.f7172a;
        if (C2182d.f7249a) {
            C2182d.m5983c(this, "the connection has been completed(%d): [%d, %d)  %d", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(this.f15535b.f7296g));
        }
        if (this.f15549p) {
            if (!(j == 0 || j2 == this.f15535b.f7296g)) {
                C2182d.m5980a(this, "the single task not completed corrected(%d, %d != %d) for task(%d)", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(this.f15535b.f7296g), Integer.valueOf(this.f15535b.f7290a));
            }
            return;
        }
        synchronized (this.f15538e) {
            this.f15538e.remove(c2152e);
        }
    }

    public final void m12497a(List<C2210a> list) {
        long length;
        int i = this.f15535b.f7299j;
        String b = this.f15535b.m6061b();
        String a = this.f15535b.m6057a();
        boolean z = false;
        boolean z2 = i > 1;
        if (!this.f15547n && ((!z2 || this.f15548o) && C2185f.m6000a(this.f15535b.f7290a, this.f15535b))) {
            if (!this.f15548o) {
                length = new File(b).length();
            } else if (!z2) {
                length = this.f15535b.f7295f.get();
            } else if (i == list.size()) {
                length = C2210a.m6066a(list);
            }
            this.f15535b.m6059a(length);
            if (length > 0) {
                z = true;
            }
            this.f15550r = z;
            if (!this.f15550r) {
                this.f15536c.mo1855d(this.f15535b.f7290a);
                C2185f.m6008b(a, b);
            }
        }
        length = 0;
        this.f15535b.m6059a(length);
        if (length > 0) {
            z = true;
        }
        this.f15550r = z;
        if (!this.f15550r) {
            this.f15536c.mo1855d(this.f15535b.f7290a);
            C2185f.m6008b(a, b);
        }
    }

    public final boolean mo1867a(Exception exception) {
        if (exception instanceof C2165b) {
            int i = ((C2165b) exception).f7233a;
            if (this.f15549p && i == 416 && !this.f15546m) {
                C2185f.m6008b(this.f15535b.m6057a(), this.f15535b.m6061b());
                this.f15546m = true;
                return true;
            }
        }
        return this.f15537d > 0 && !(exception instanceof C2164a);
    }

    public final void mo1868b(Exception exception) {
        this.f15554v = true;
        this.f15555w = exception;
        if (this.f15540g) {
            if (C2182d.f7249a) {
                C2182d.m5983c(this, "the task[%d] has already been paused, so pass the error callback", Integer.valueOf(this.f15535b.f7290a));
            }
            return;
        }
        Iterator it = ((ArrayList) this.f15538e.clone()).iterator();
        while (it.hasNext()) {
            C2152e c2152e = (C2152e) it.next();
            if (c2152e != null) {
                c2152e.m5908a();
            }
        }
    }

    public final boolean m12500b() {
        if (this.f15553u.get()) {
            return true;
        }
        C2154f c2154f = this.f15534a;
        boolean z = c2154f.f7190h != null && c2154f.f7190h.isAlive();
        return z;
    }

    public final void mo1869c(Exception exception) {
        if (this.f15540g) {
            if (C2182d.f7249a) {
                C2182d.m5983c(this, "the task[%d] has already been paused, so pass the retry callback", Integer.valueOf(this.f15535b.f7290a));
            }
            return;
        }
        int i = this.f15537d;
        this.f15537d = i - 1;
        if (i < 0) {
            C2182d.m5980a(this, "valid retry times is less than 0(%d) for download task(%d)", Integer.valueOf(this.f15537d), Integer.valueOf(this.f15535b.f7290a));
        }
        C2154f c2154f = this.f15534a;
        int i2 = this.f15537d;
        c2154f.f7192j.set(0);
        if (c2154f.f7189g == null) {
            c2154f.m5916a(exception, i2);
        } else {
            c2154f.m5914a(c2154f.f7189g.obtainMessage(5, i2, 0, exception));
        }
    }

    public final void run() {
        /* JADX: method processing error */
/*
Error: java.lang.OutOfMemoryError: Java heap space
	at java.util.Arrays.copyOf(Arrays.java:3181)
	at java.util.ArrayList.grow(ArrayList.java:261)
	at java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:235)
	at java.util.ArrayList.ensureCapacityInternal(ArrayList.java:227)
	at java.util.ArrayList.add(ArrayList.java:458)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:463)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
*/
        /*
        r23 = this;
        r1 = r23;
        r2 = 10;
        r3 = 0;
        android.os.Process.setThreadPriority(r2);	 Catch:{ all -> 0x0637 }
        r2 = r1.f15535b;	 Catch:{ all -> 0x0637 }
        r2 = r2.m6063c();	 Catch:{ all -> 0x0637 }
        r4 = 3;	 Catch:{ all -> 0x0637 }
        r5 = -2;	 Catch:{ all -> 0x0637 }
        r6 = 2;	 Catch:{ all -> 0x0637 }
        r7 = 1;	 Catch:{ all -> 0x0637 }
        if (r2 == r7) goto L_0x008c;	 Catch:{ all -> 0x0637 }
    L_0x0014:
        r2 = r1.f15535b;	 Catch:{ all -> 0x0637 }
        r2 = r2.m6063c();	 Catch:{ all -> 0x0637 }
        if (r2 != r5) goto L_0x0032;	 Catch:{ all -> 0x0637 }
    L_0x001c:
        r2 = com.liulishuo.filedownloader.p205h.C2182d.f7249a;	 Catch:{ all -> 0x0637 }
        if (r2 == 0) goto L_0x005e;	 Catch:{ all -> 0x0637 }
    L_0x0020:
        r2 = "High concurrent cause, start runnable but already paused %d";	 Catch:{ all -> 0x0637 }
        r4 = new java.lang.Object[r7];	 Catch:{ all -> 0x0637 }
        r5 = r1.f15535b;	 Catch:{ all -> 0x0637 }
        r5 = r5.f7290a;	 Catch:{ all -> 0x0637 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x0637 }
        r4[r3] = r5;	 Catch:{ all -> 0x0637 }
        com.liulishuo.filedownloader.p205h.C2182d.m5983c(r1, r2, r4);	 Catch:{ all -> 0x0637 }
        goto L_0x005e;	 Catch:{ all -> 0x0637 }
    L_0x0032:
        r2 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0637 }
        r5 = "Task[%d] can't start the download runnable, because its status is %d not %d";	 Catch:{ all -> 0x0637 }
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x0637 }
        r8 = r1.f15535b;	 Catch:{ all -> 0x0637 }
        r8 = r8.f7290a;	 Catch:{ all -> 0x0637 }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ all -> 0x0637 }
        r4[r3] = r8;	 Catch:{ all -> 0x0637 }
        r8 = r1.f15535b;	 Catch:{ all -> 0x0637 }
        r8 = r8.m6063c();	 Catch:{ all -> 0x0637 }
        r8 = java.lang.Byte.valueOf(r8);	 Catch:{ all -> 0x0637 }
        r4[r7] = r8;	 Catch:{ all -> 0x0637 }
        r7 = java.lang.Byte.valueOf(r7);	 Catch:{ all -> 0x0637 }
        r4[r6] = r7;	 Catch:{ all -> 0x0637 }
        r4 = com.liulishuo.filedownloader.p205h.C2185f.m5996a(r5, r4);	 Catch:{ all -> 0x0637 }
        r2.<init>(r4);	 Catch:{ all -> 0x0637 }
        r1.mo1868b(r2);	 Catch:{ all -> 0x0637 }
    L_0x005e:
        r2 = r1.f15534a;
        r2.m5912a();
        r2 = r1.f15540g;
        if (r2 == 0) goto L_0x006d;
    L_0x0067:
        r2 = r1.f15534a;
        r2.m5917b();
        goto L_0x0086;
    L_0x006d:
        r2 = r1.f15554v;
        if (r2 == 0) goto L_0x0079;
    L_0x0071:
        r2 = r1.f15534a;
        r4 = r1.f15555w;
        r2.m5915a(r4);
        goto L_0x0086;
    L_0x0079:
        r2 = r1.f15534a;	 Catch:{ IOException -> 0x007f }
        r2.m5918c();	 Catch:{ IOException -> 0x007f }
        goto L_0x0086;
    L_0x007f:
        r0 = move-exception;
        r2 = r0;
    L_0x0081:
        r4 = r1.f15534a;
        r4.m5915a(r2);
    L_0x0086:
        r2 = r1.f15553u;
    L_0x0088:
        r2.set(r3);
        return;
    L_0x008c:
        r2 = r1.f15540g;	 Catch:{ all -> 0x0637 }
        if (r2 != 0) goto L_0x00a4;	 Catch:{ all -> 0x0637 }
    L_0x0090:
        r2 = r1.f15534a;	 Catch:{ all -> 0x0637 }
        r8 = r2.f7183a;	 Catch:{ all -> 0x0637 }
        r9 = 6;	 Catch:{ all -> 0x0637 }
        r8.m6058a(r9);	 Catch:{ all -> 0x0637 }
        r2.m5913a(r9);	 Catch:{ all -> 0x0637 }
        r8 = r2.f7184b;	 Catch:{ all -> 0x0637 }
        r2 = r2.f7183a;	 Catch:{ all -> 0x0637 }
        r2 = r2.f7290a;	 Catch:{ all -> 0x0637 }
        r8.mo1841a(r2);	 Catch:{ all -> 0x0637 }
    L_0x00a4:
        r2 = r1.f15540g;	 Catch:{ all -> 0x0637 }
        if (r2 == 0) goto L_0x00d5;	 Catch:{ all -> 0x0637 }
    L_0x00a8:
        r2 = com.liulishuo.filedownloader.p205h.C2182d.f7249a;	 Catch:{ all -> 0x0637 }
        if (r2 == 0) goto L_0x00bd;	 Catch:{ all -> 0x0637 }
    L_0x00ac:
        r2 = "High concurrent cause, start runnable but already paused %d";	 Catch:{ all -> 0x0637 }
        r4 = new java.lang.Object[r7];	 Catch:{ all -> 0x0637 }
        r5 = r1.f15535b;	 Catch:{ all -> 0x0637 }
        r5 = r5.f7290a;	 Catch:{ all -> 0x0637 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x0637 }
        r4[r3] = r5;	 Catch:{ all -> 0x0637 }
        com.liulishuo.filedownloader.p205h.C2182d.m5983c(r1, r2, r4);	 Catch:{ all -> 0x0637 }
    L_0x00bd:
        r2 = r1.f15534a;
        r2.m5912a();
        r2 = r1.f15540g;
        if (r2 == 0) goto L_0x00c7;
    L_0x00c6:
        goto L_0x0067;
    L_0x00c7:
        r2 = r1.f15554v;
        if (r2 == 0) goto L_0x00cc;
    L_0x00cb:
        goto L_0x0071;
    L_0x00cc:
        r2 = r1.f15534a;	 Catch:{ IOException -> 0x00d2 }
        r2.m5918c();	 Catch:{ IOException -> 0x00d2 }
        goto L_0x0086;
    L_0x00d2:
        r0 = move-exception;
        r2 = r0;
        goto L_0x0081;
    L_0x00d5:
        r2 = r1.f15544k;	 Catch:{ IOException -> 0x0605, IOException -> 0x0605, IOException -> 0x0605, IOException -> 0x0605, IOException -> 0x0605, b -> 0x05e9, c -> 0x05d2 }
        if (r2 == 0) goto L_0x0108;
    L_0x00d9:
        r2 = "android.permission.ACCESS_NETWORK_STATE";	 Catch:{ IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, b -> 0x05e9, c -> 0x05d2 }
        r2 = com.liulishuo.filedownloader.p205h.C2185f.m6017g(r2);	 Catch:{ IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, b -> 0x05e9, c -> 0x05d2 }
        if (r2 != 0) goto L_0x0108;	 Catch:{ IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, b -> 0x05e9, c -> 0x05d2 }
    L_0x00e1:
        r2 = new com.liulishuo.filedownloader.e.a;	 Catch:{ IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, b -> 0x05e9, c -> 0x05d2 }
        r8 = "Task[%d] can't start the download runnable, because this task require wifi, but user application nor current process has %s, so we can't check whether the network type connection.";	 Catch:{ IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, b -> 0x05e9, c -> 0x05d2 }
        r9 = new java.lang.Object[r6];	 Catch:{ IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, b -> 0x05e9, c -> 0x05d2 }
        r10 = r1.f15535b;	 Catch:{ IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, b -> 0x05e9, c -> 0x05d2 }
        r10 = r10.f7290a;	 Catch:{ IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, b -> 0x05e9, c -> 0x05d2 }
        r10 = java.lang.Integer.valueOf(r10);	 Catch:{ IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, b -> 0x05e9, c -> 0x05d2 }
        r9[r3] = r10;	 Catch:{ IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, b -> 0x05e9, c -> 0x05d2 }
        r10 = "android.permission.ACCESS_NETWORK_STATE";	 Catch:{ IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, b -> 0x05e9, c -> 0x05d2 }
        r9[r7] = r10;	 Catch:{ IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, b -> 0x05e9, c -> 0x05d2 }
        r8 = com.liulishuo.filedownloader.p205h.C2185f.m5996a(r8, r9);	 Catch:{ IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, b -> 0x05e9, c -> 0x05d2 }
        r2.<init>(r8);	 Catch:{ IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, b -> 0x05e9, c -> 0x05d2 }
        throw r2;	 Catch:{ IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, b -> 0x05e9, c -> 0x05d2 }
    L_0x00fd:
        r0 = move-exception;
        r2 = r6;
        r3 = r7;
        r6 = r0;
        r22 = r5;
        r5 = r4;
        r4 = r22;
        goto L_0x060e;
    L_0x0108:
        r2 = r1.f15544k;	 Catch:{ IOException -> 0x0605, IOException -> 0x0605, IOException -> 0x0605, IOException -> 0x0605, IOException -> 0x0605, b -> 0x05e9, c -> 0x05d2 }
        if (r2 == 0) goto L_0x0118;
    L_0x010c:
        r2 = com.liulishuo.filedownloader.p205h.C2185f.m5999a();	 Catch:{ IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, b -> 0x05e9, c -> 0x05d2 }
        if (r2 == 0) goto L_0x0118;	 Catch:{ IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, b -> 0x05e9, c -> 0x05d2 }
    L_0x0112:
        r2 = new com.liulishuo.filedownloader.e.c;	 Catch:{ IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, b -> 0x05e9, c -> 0x05d2 }
        r2.<init>();	 Catch:{ IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, b -> 0x05e9, c -> 0x05d2 }
        throw r2;	 Catch:{ IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, IOException -> 0x00fd, b -> 0x05e9, c -> 0x05d2 }
    L_0x0118:
        r8 = r1.f15547n;	 Catch:{ all -> 0x05bf }
        if (r8 == 0) goto L_0x012e;
    L_0x011c:
        r8 = new com.liulishuo.filedownloader.c.b;	 Catch:{ all -> 0x0122 }
        r8.<init>();	 Catch:{ all -> 0x0122 }
        goto L_0x0133;
    L_0x0122:
        r0 = move-exception;
        r2 = r6;
        r3 = r7;
        r9 = 0;
        r6 = r0;
        r22 = r5;
        r5 = r4;
        r4 = r22;
        goto L_0x05c9;
    L_0x012e:
        r8 = new com.liulishuo.filedownloader.c.b;	 Catch:{ all -> 0x05bf }
        r8.<init>();	 Catch:{ all -> 0x05bf }
    L_0x0133:
        r9 = new com.liulishuo.filedownloader.c.a$a;	 Catch:{ all -> 0x05bf }
        r9.<init>();	 Catch:{ all -> 0x05bf }
        r10 = r1.f15535b;	 Catch:{ all -> 0x05bf }
        r10 = r10.f7290a;	 Catch:{ all -> 0x05bf }
        r9 = r9.m5888a(r10);	 Catch:{ all -> 0x05bf }
        r10 = r1.f15535b;	 Catch:{ all -> 0x05bf }
        r10 = r10.f7291b;	 Catch:{ all -> 0x05bf }
        r9.f7132a = r10;	 Catch:{ all -> 0x05bf }
        r10 = r1.f15535b;	 Catch:{ all -> 0x05bf }
        r10 = r10.f7298i;	 Catch:{ all -> 0x05bf }
        r9.f7133b = r10;	 Catch:{ all -> 0x05bf }
        r10 = r1.f15542i;	 Catch:{ all -> 0x05bf }
        r9.f7134c = r10;	 Catch:{ all -> 0x05bf }
        r9.f7135d = r8;	 Catch:{ all -> 0x05bf }
        r8 = r9.m5889a();	 Catch:{ all -> 0x05bf }
        r9 = r8.m5890a();	 Catch:{ all -> 0x05bf }
        r10 = r8.f7141e;	 Catch:{ all -> 0x05b5 }
        r11 = r1.f15535b;	 Catch:{ all -> 0x05b5 }
        r13 = r11.f7290a;	 Catch:{ all -> 0x05b5 }
        r11 = r9.mo1831e();	 Catch:{ all -> 0x05b5 }
        r12 = com.liulishuo.filedownloader.p205h.C2185f.m6009b(r11, r9);	 Catch:{ all -> 0x05b5 }
        r1.f15551s = r12;	 Catch:{ all -> 0x05b5 }
        r12 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ all -> 0x05b5 }
        r14 = 201; // 0xc9 float:2.82E-43 double:9.93E-322;	 Catch:{ all -> 0x05b5 }
        if (r11 == r12) goto L_0x0177;	 Catch:{ all -> 0x05b5 }
    L_0x0170:
        if (r11 == r14) goto L_0x0177;	 Catch:{ all -> 0x05b5 }
    L_0x0172:
        if (r11 != 0) goto L_0x0175;	 Catch:{ all -> 0x05b5 }
    L_0x0174:
        goto L_0x0177;	 Catch:{ all -> 0x05b5 }
    L_0x0175:
        r12 = r3;	 Catch:{ all -> 0x05b5 }
        goto L_0x0178;	 Catch:{ all -> 0x05b5 }
    L_0x0177:
        r12 = r7;	 Catch:{ all -> 0x05b5 }
    L_0x0178:
        r15 = r1.f15535b;	 Catch:{ all -> 0x05b5 }
        r15 = r15.f7298i;	 Catch:{ all -> 0x05b5 }
        r2 = com.liulishuo.filedownloader.p205h.C2185f.m5992a(r13, r9);	 Catch:{ all -> 0x05b5 }
        r5 = 412; // 0x19c float:5.77E-43 double:2.036E-321;
        r3 = 0;
        if (r11 != r5) goto L_0x0187;
    L_0x0186:
        goto L_0x01d4;
    L_0x0187:
        if (r15 == 0) goto L_0x019d;
    L_0x0189:
        r5 = r15.equals(r2);	 Catch:{ all -> 0x0196 }
        if (r5 != 0) goto L_0x019d;	 Catch:{ all -> 0x0196 }
    L_0x018f:
        if (r12 != 0) goto L_0x01d4;	 Catch:{ all -> 0x0196 }
    L_0x0191:
        r5 = r1.f15551s;	 Catch:{ all -> 0x0196 }
        if (r5 == 0) goto L_0x019d;	 Catch:{ all -> 0x0196 }
    L_0x0195:
        goto L_0x01d4;	 Catch:{ all -> 0x0196 }
    L_0x0196:
        r0 = move-exception;	 Catch:{ all -> 0x0196 }
        r2 = r6;	 Catch:{ all -> 0x0196 }
        r3 = r7;	 Catch:{ all -> 0x0196 }
        r4 = -2;	 Catch:{ all -> 0x0196 }
        r5 = 3;	 Catch:{ all -> 0x0196 }
        goto L_0x05bd;	 Catch:{ all -> 0x0196 }
    L_0x019d:
        if (r11 != r14) goto L_0x01b6;	 Catch:{ all -> 0x0196 }
    L_0x019f:
        r5 = r8.f7140d;	 Catch:{ all -> 0x0196 }
        r6 = r5.f7145b;	 Catch:{ all -> 0x01ae }
        r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1));	 Catch:{ all -> 0x01ae }
        if (r5 <= 0) goto L_0x01a9;	 Catch:{ all -> 0x01ae }
    L_0x01a7:
        r5 = 1;	 Catch:{ all -> 0x01ae }
        goto L_0x01aa;	 Catch:{ all -> 0x01ae }
    L_0x01a9:
        r5 = 0;	 Catch:{ all -> 0x01ae }
    L_0x01aa:
        if (r5 == 0) goto L_0x01b6;	 Catch:{ all -> 0x01ae }
    L_0x01ac:
        r7 = 1;	 Catch:{ all -> 0x01ae }
        goto L_0x01d4;	 Catch:{ all -> 0x01ae }
    L_0x01ae:
        r0 = move-exception;	 Catch:{ all -> 0x01ae }
        r6 = r0;	 Catch:{ all -> 0x01ae }
        r2 = 2;	 Catch:{ all -> 0x01ae }
    L_0x01b1:
        r3 = 1;	 Catch:{ all -> 0x01ae }
    L_0x01b2:
        r4 = -2;	 Catch:{ all -> 0x01ae }
        r5 = 3;	 Catch:{ all -> 0x01ae }
        goto L_0x05c9;	 Catch:{ all -> 0x01ae }
    L_0x01b6:
        r5 = 416; // 0x1a0 float:5.83E-43 double:2.055E-321;	 Catch:{ all -> 0x01ae }
        if (r11 != r5) goto L_0x01d3;	 Catch:{ all -> 0x01ae }
    L_0x01ba:
        r5 = r1.f15535b;	 Catch:{ all -> 0x01ae }
        r5 = r5.f7295f;	 Catch:{ all -> 0x01ae }
        r5 = r5.get();	 Catch:{ all -> 0x01ae }
        r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));	 Catch:{ all -> 0x01ae }
        if (r7 <= 0) goto L_0x01c7;	 Catch:{ all -> 0x01ae }
    L_0x01c6:
        goto L_0x01ac;	 Catch:{ all -> 0x01ae }
    L_0x01c7:
        r5 = r1.f15547n;	 Catch:{ all -> 0x01ae }
        if (r5 != 0) goto L_0x01d3;
    L_0x01cb:
        r5 = 1;
        r1.f15547n = r5;	 Catch:{ all -> 0x01cf }
        goto L_0x01ac;
    L_0x01cf:
        r0 = move-exception;
        r6 = r0;
        r3 = r5;
        goto L_0x0203;
    L_0x01d3:
        r7 = 0;
    L_0x01d4:
        if (r7 == 0) goto L_0x0287;
    L_0x01d6:
        r5 = r1.f15550r;	 Catch:{ all -> 0x027f }
        r6 = 4;
        if (r5 == 0) goto L_0x0205;
    L_0x01db:
        r5 = "there is precondition failed on this request[%d] with old etag[%s]、new etag[%s]、response code is %d";	 Catch:{ all -> 0x01ae }
        r7 = new java.lang.Object[r6];	 Catch:{ all -> 0x01ae }
        r8 = java.lang.Integer.valueOf(r13);	 Catch:{ all -> 0x01ae }
        r10 = 0;	 Catch:{ all -> 0x01ae }
        r7[r10] = r8;	 Catch:{ all -> 0x01ae }
        r8 = 1;
        r7[r8] = r15;	 Catch:{ all -> 0x0200 }
        r8 = 2;
        r7[r8] = r2;	 Catch:{ all -> 0x01fc }
        r8 = java.lang.Integer.valueOf(r11);	 Catch:{ all -> 0x01ae }
        r10 = 3;
        r7[r10] = r8;	 Catch:{ all -> 0x01f7 }
        com.liulishuo.filedownloader.p205h.C2182d.m5984d(r1, r5, r7);	 Catch:{ all -> 0x01ae }
        goto L_0x0205;
    L_0x01f7:
        r0 = move-exception;
        r6 = r0;
        r5 = r10;
        goto L_0x0282;
    L_0x01fc:
        r0 = move-exception;
        r6 = r0;
        r2 = r8;
        goto L_0x01b1;
    L_0x0200:
        r0 = move-exception;
        r6 = r0;
        r3 = r8;
    L_0x0203:
        r2 = 2;
        goto L_0x01b2;
    L_0x0205:
        r5 = r1.f15536c;	 Catch:{ all -> 0x027f }
        r7 = r1.f15535b;	 Catch:{ all -> 0x027f }
        r7 = r7.f7290a;	 Catch:{ all -> 0x027f }
        r5.mo1855d(r7);	 Catch:{ all -> 0x027f }
        r5 = r1.f15535b;	 Catch:{ all -> 0x027f }
        r5 = r5.m6057a();	 Catch:{ all -> 0x027f }
        r7 = r1.f15535b;	 Catch:{ all -> 0x027f }
        r7 = r7.m6061b();	 Catch:{ all -> 0x027f }
        com.liulishuo.filedownloader.p205h.C2185f.m6008b(r5, r7);	 Catch:{ all -> 0x027f }
        r5 = 0;	 Catch:{ all -> 0x027f }
        r1.f15550r = r5;	 Catch:{ all -> 0x027f }
        if (r15 == 0) goto L_0x0244;	 Catch:{ all -> 0x027f }
    L_0x0222:
        r7 = r15.equals(r2);	 Catch:{ all -> 0x027f }
        if (r7 == 0) goto L_0x0244;	 Catch:{ all -> 0x027f }
    L_0x0228:
        r7 = "the old etag[%s] is the same to the new etag[%s], but the response status code is %d not Partial(206), so wo have to start this task from very beginning for task[%d]!";	 Catch:{ all -> 0x027f }
        r6 = new java.lang.Object[r6];	 Catch:{ all -> 0x027f }
        r6[r5] = r15;	 Catch:{ all -> 0x027f }
        r5 = 1;	 Catch:{ all -> 0x027f }
        r6[r5] = r2;	 Catch:{ all -> 0x027f }
        r2 = java.lang.Integer.valueOf(r11);	 Catch:{ all -> 0x027f }
        r5 = 2;	 Catch:{ all -> 0x027f }
        r6[r5] = r2;	 Catch:{ all -> 0x027f }
        r2 = java.lang.Integer.valueOf(r13);	 Catch:{ all -> 0x027f }
        r5 = 3;
        r6[r5] = r2;	 Catch:{ all -> 0x02a5 }
        com.liulishuo.filedownloader.p205h.C2182d.m5984d(r1, r7, r6);	 Catch:{ all -> 0x02a5 }
        r2 = 0;	 Catch:{ all -> 0x02a5 }
        goto L_0x0245;	 Catch:{ all -> 0x02a5 }
    L_0x0244:
        r5 = 3;	 Catch:{ all -> 0x02a5 }
    L_0x0245:
        r6 = r1.f15535b;	 Catch:{ all -> 0x02a5 }
        r6.m6059a(r3);	 Catch:{ all -> 0x02a5 }
        r6 = r1.f15535b;	 Catch:{ all -> 0x02a5 }
        r6.m6062b(r3);	 Catch:{ all -> 0x02a5 }
        r3 = r1.f15535b;	 Catch:{ all -> 0x02a5 }
        r3.f7298i = r2;	 Catch:{ all -> 0x02a5 }
        r2 = r1.f15535b;	 Catch:{ all -> 0x02a5 }
        r3 = 1;
        r2.f7299j = r3;	 Catch:{ all -> 0x027b }
        r12 = r1.f15536c;	 Catch:{ all -> 0x02a5 }
        r2 = r1.f15535b;	 Catch:{ all -> 0x02a5 }
        r14 = r2.f7298i;	 Catch:{ all -> 0x02a5 }
        r2 = r1.f15535b;	 Catch:{ all -> 0x02a5 }
        r2 = r2.f7295f;	 Catch:{ all -> 0x02a5 }
        r15 = r2.get();	 Catch:{ all -> 0x02a5 }
        r2 = r1.f15535b;	 Catch:{ all -> 0x02a5 }
        r2 = r2.f7296g;	 Catch:{ all -> 0x02a5 }
        r4 = r1.f15535b;	 Catch:{ all -> 0x02a5 }
        r4 = r4.f7299j;	 Catch:{ all -> 0x02a5 }
        r17 = r2;	 Catch:{ all -> 0x02a5 }
        r19 = r4;	 Catch:{ all -> 0x02a5 }
        r12.mo1846a(r13, r14, r15, r17, r19);	 Catch:{ all -> 0x02a5 }
        r2 = new com.liulishuo.filedownloader.c.d$c;	 Catch:{ all -> 0x02a5 }
        r2.<init>(r1);	 Catch:{ all -> 0x02a5 }
        throw r2;	 Catch:{ all -> 0x02a5 }
    L_0x027b:
        r0 = move-exception;
        r6 = r0;
    L_0x027d:
        r2 = 2;
        goto L_0x0284;
    L_0x027f:
        r0 = move-exception;
        r5 = 3;
    L_0x0281:
        r6 = r0;
    L_0x0282:
        r2 = 2;
        r3 = 1;
    L_0x0284:
        r4 = -2;
        goto L_0x05c9;
    L_0x0287:
        r5 = 3;
        r6 = r8.f7142f;	 Catch:{ all -> 0x05b0 }
        if (r6 == 0) goto L_0x02a7;
    L_0x028c:
        r6 = r8.f7142f;	 Catch:{ all -> 0x02a5 }
        r6 = r6.isEmpty();	 Catch:{ all -> 0x02a5 }
        if (r6 != 0) goto L_0x02a7;	 Catch:{ all -> 0x02a5 }
    L_0x0294:
        r6 = r8.f7142f;	 Catch:{ all -> 0x02a5 }
        r7 = r8.f7142f;	 Catch:{ all -> 0x02a5 }
        r7 = r7.size();	 Catch:{ all -> 0x02a5 }
        r8 = 1;	 Catch:{ all -> 0x02a5 }
        r7 = r7 - r8;	 Catch:{ all -> 0x02a5 }
        r6 = r6.get(r7);	 Catch:{ all -> 0x02a5 }
        r6 = (java.lang.String) r6;	 Catch:{ all -> 0x02a5 }
        goto L_0x02a8;
    L_0x02a5:
        r0 = move-exception;
        goto L_0x0281;
    L_0x02a7:
        r6 = 0;
    L_0x02a8:
        r1.f15556x = r6;	 Catch:{ all -> 0x05b0 }
        r6 = r1.f15551s;	 Catch:{ all -> 0x05b0 }
        if (r6 != 0) goto L_0x02bb;
    L_0x02ae:
        if (r12 == 0) goto L_0x02b1;
    L_0x02b0:
        goto L_0x02bb;
    L_0x02b1:
        r2 = new com.liulishuo.filedownloader.e.b;	 Catch:{ all -> 0x02a5 }
        r3 = r9.mo1829c();	 Catch:{ all -> 0x02a5 }
        r2.<init>(r11, r10, r3);	 Catch:{ all -> 0x02a5 }
        throw r2;	 Catch:{ all -> 0x02a5 }
    L_0x02bb:
        r6 = com.liulishuo.filedownloader.p205h.C2185f.m5991a(r9);	 Catch:{ all -> 0x05b0 }
        r8 = r1.f15535b;	 Catch:{ all -> 0x05b0 }
        r8 = r8.f7293d;	 Catch:{ all -> 0x05b0 }
        if (r8 == 0) goto L_0x02ce;
    L_0x02c5:
        r8 = r1.f15535b;	 Catch:{ all -> 0x02a5 }
        r8 = r8.f7291b;	 Catch:{ all -> 0x02a5 }
        r8 = com.liulishuo.filedownloader.p205h.C2185f.m5993a(r9, r8);	 Catch:{ all -> 0x02a5 }
        goto L_0x02cf;
    L_0x02ce:
        r8 = 0;
    L_0x02cf:
        r10 = -1;
        r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1));
        if (r12 != 0) goto L_0x02d7;
    L_0x02d5:
        r12 = 1;
        goto L_0x02d8;
    L_0x02d7:
        r12 = 0;
    L_0x02d8:
        r1.f15552t = r12;	 Catch:{ all -> 0x05b0 }
        r12 = r1.f15534a;	 Catch:{ all -> 0x05b0 }
        r13 = r1.f15550r;	 Catch:{ all -> 0x05b0 }
        if (r13 == 0) goto L_0x02e6;
    L_0x02e0:
        r13 = r1.f15551s;	 Catch:{ all -> 0x02a5 }
        if (r13 == 0) goto L_0x02e6;
    L_0x02e4:
        r13 = 1;
        goto L_0x02e7;
    L_0x02e6:
        r13 = 0;
    L_0x02e7:
        r14 = r12.f7183a;	 Catch:{ all -> 0x05b0 }
        r14 = r14.f7298i;	 Catch:{ all -> 0x05b0 }
        if (r14 == 0) goto L_0x0311;
    L_0x02ed:
        r15 = r14.equals(r2);	 Catch:{ all -> 0x02a5 }
        if (r15 != 0) goto L_0x0311;	 Catch:{ all -> 0x02a5 }
    L_0x02f3:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x02a5 }
        r4 = "callback onConnected must with precondition succeed, but the etag is changes(%s != %s)";	 Catch:{ all -> 0x02a5 }
        r6 = 2;
        r7 = new java.lang.Object[r6];	 Catch:{ all -> 0x030d }
        r6 = 0;
        r7[r6] = r2;	 Catch:{ all -> 0x02a5 }
        r2 = 1;
        r7[r2] = r14;	 Catch:{ all -> 0x0308 }
        r2 = com.liulishuo.filedownloader.p205h.C2185f.m5996a(r4, r7);	 Catch:{ all -> 0x02a5 }
        r3.<init>(r2);	 Catch:{ all -> 0x02a5 }
        throw r3;	 Catch:{ all -> 0x02a5 }
    L_0x0308:
        r0 = move-exception;
        r6 = r0;
        r3 = r2;
        goto L_0x027d;
    L_0x030d:
        r0 = move-exception;
        r2 = r6;
        goto L_0x05b2;
    L_0x0311:
        r14 = r12.f7185c;	 Catch:{ all -> 0x05b0 }
        r14.f7180a = r13;	 Catch:{ all -> 0x05b0 }
        r13 = r12.f7183a;	 Catch:{ all -> 0x05b0 }
        r14 = 2;
        r13.m6058a(r14);	 Catch:{ all -> 0x05ad }
        r13 = r12.f7183a;	 Catch:{ all -> 0x05b0 }
        r13.m6062b(r6);	 Catch:{ all -> 0x05b0 }
        r13 = r12.f7183a;	 Catch:{ all -> 0x05b0 }
        r13.f7298i = r2;	 Catch:{ all -> 0x05b0 }
        r13 = r12.f7183a;	 Catch:{ all -> 0x05b0 }
        r13.f7294e = r8;	 Catch:{ all -> 0x05b0 }
        r13 = r12.f7184b;	 Catch:{ all -> 0x05b0 }
        r14 = r12.f7183a;	 Catch:{ all -> 0x05b0 }
        r14 = r14.f7290a;	 Catch:{ all -> 0x05b0 }
        r16 = r13;	 Catch:{ all -> 0x05b0 }
        r17 = r14;	 Catch:{ all -> 0x05b0 }
        r18 = r6;	 Catch:{ all -> 0x05b0 }
        r20 = r2;	 Catch:{ all -> 0x05b0 }
        r21 = r8;	 Catch:{ all -> 0x05b0 }
        r16.mo1845a(r17, r18, r20, r21);	 Catch:{ all -> 0x05b0 }
        r2 = 2;
        r12.m5913a(r2);	 Catch:{ all -> 0x05ab }
        r8 = r12.f7187e;	 Catch:{ all -> 0x05ab }
        r13 = (long) r8;	 Catch:{ all -> 0x05ab }
        r6 = com.liulishuo.filedownloader.p200c.C2154f.m5909a(r6, r13);	 Catch:{ all -> 0x05ab }
        r12.f7188f = r6;	 Catch:{ all -> 0x05ab }
        r6 = r12.f7194l;	 Catch:{ all -> 0x05ab }
        r7 = 1;
        r8 = 0;
        r6.compareAndSet(r8, r7);	 Catch:{ all -> 0x05a8 }
        if (r9 == 0) goto L_0x035f;
    L_0x0351:
        r9.mo1832f();	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        goto L_0x035f;
    L_0x0355:
        r3 = 1;
    L_0x0356:
        r4 = -2;
        goto L_0x05d9;
    L_0x0359:
        r0 = move-exception;
        r6 = r0;
        r3 = 1;
        r4 = -2;
        goto L_0x060e;
    L_0x035f:
        r23.m12493c();	 Catch:{ IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, b -> 0x05e9, c -> 0x0355 }
        r6 = r1.f15536c;	 Catch:{ IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, b -> 0x05e9, c -> 0x0355 }
        r7 = r1.f15535b;	 Catch:{ IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, b -> 0x05e9, c -> 0x0355 }
        r7 = r7.f7290a;	 Catch:{ IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, b -> 0x05e9, c -> 0x0355 }
        r6 = r6.mo1854c(r7);	 Catch:{ IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, b -> 0x05e9, c -> 0x0355 }
        r1.m12497a(r6);	 Catch:{ IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, b -> 0x05e9, c -> 0x0355 }
        r7 = r1.f15540g;	 Catch:{ IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, b -> 0x05e9, c -> 0x0355 }
        if (r7 == 0) goto L_0x03ae;
    L_0x0373:
        r3 = r1.f15535b;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        r4 = -2;
        r3.m6058a(r4);	 Catch:{ IOException -> 0x03a9, IOException -> 0x03a9, IOException -> 0x03a9, IOException -> 0x03a9, IOException -> 0x03a9, b -> 0x05e9, c -> 0x03a6 }
        r2 = r1.f15534a;
        r2.m5912a();
        r2 = r1.f15540g;
        if (r2 == 0) goto L_0x0388;
    L_0x0382:
        r2 = r1.f15534a;
        r2.m5917b();
        goto L_0x03a1;
    L_0x0388:
        r2 = r1.f15554v;
        if (r2 == 0) goto L_0x0394;
    L_0x038c:
        r2 = r1.f15534a;
        r3 = r1.f15555w;
        r2.m5915a(r3);
        goto L_0x03a1;
    L_0x0394:
        r2 = r1.f15534a;	 Catch:{ IOException -> 0x039a }
        r2.m5918c();	 Catch:{ IOException -> 0x039a }
        goto L_0x03a1;
    L_0x039a:
        r0 = move-exception;
        r2 = r0;
    L_0x039c:
        r3 = r1.f15534a;
        r3.m5915a(r2);
    L_0x03a1:
        r2 = r1.f15553u;
        r3 = 0;
        goto L_0x0088;
    L_0x03a6:
        r3 = 1;
        goto L_0x05d9;
    L_0x03a9:
        r0 = move-exception;
    L_0x03aa:
        r6 = r0;
        r3 = 1;
        goto L_0x060e;
    L_0x03ae:
        r7 = r1.f15535b;	 Catch:{ IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, b -> 0x05e9, c -> 0x0355 }
        r7 = r7.f7296g;	 Catch:{ IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, b -> 0x05e9, c -> 0x0355 }
        r9 = r1.f15535b;	 Catch:{ IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, b -> 0x05e9, c -> 0x0355 }
        r9 = r9.m6061b();	 Catch:{ IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, b -> 0x05e9, c -> 0x0355 }
        r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1));
        if (r12 == 0) goto L_0x03f8;
    L_0x03bc:
        r10 = r1.f15535b;	 Catch:{ all -> 0x03ef }
        r10 = r10.m6061b();	 Catch:{ all -> 0x03ef }
        r10 = com.liulishuo.filedownloader.p205h.C2185f.m6018h(r10);	 Catch:{ all -> 0x03ef }
        r11 = new java.io.File;	 Catch:{ all -> 0x03ec }
        r11.<init>(r9);	 Catch:{ all -> 0x03ec }
        r17 = r11.length();	 Catch:{ all -> 0x03ec }
        r15 = r7 - r17;	 Catch:{ all -> 0x03ec }
        r13 = com.liulishuo.filedownloader.p205h.C2185f.m6014d(r9);	 Catch:{ all -> 0x03ec }
        r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1));	 Catch:{ all -> 0x03ec }
        if (r9 >= 0) goto L_0x03e0;	 Catch:{ all -> 0x03ec }
    L_0x03d9:
        r3 = new com.liulishuo.filedownloader.e.d;	 Catch:{ all -> 0x03ec }
        r12 = r3;	 Catch:{ all -> 0x03ec }
        r12.<init>(r13, r15, r17);	 Catch:{ all -> 0x03ec }
        throw r3;	 Catch:{ all -> 0x03ec }
    L_0x03e0:
        r9 = com.liulishuo.filedownloader.p205h.C2184e.m5988a();	 Catch:{ all -> 0x03ec }
        r9 = r9.f7256f;	 Catch:{ all -> 0x03ec }
        if (r9 != 0) goto L_0x03f9;	 Catch:{ all -> 0x03ec }
    L_0x03e8:
        r10.mo1941b(r7);	 Catch:{ all -> 0x03ec }
        goto L_0x03f9;
    L_0x03ec:
        r0 = move-exception;
        r3 = r0;
        goto L_0x03f2;
    L_0x03ef:
        r0 = move-exception;
        r3 = r0;
        r10 = 0;
    L_0x03f2:
        if (r10 == 0) goto L_0x03f7;
    L_0x03f4:
        r10.mo1940b();	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
    L_0x03f7:
        throw r3;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
    L_0x03f8:
        r10 = 0;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
    L_0x03f9:
        if (r10 == 0) goto L_0x03fe;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
    L_0x03fb:
        r10.mo1940b();	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
    L_0x03fe:
        r9 = r1.f15550r;	 Catch:{ IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, b -> 0x05e9, c -> 0x0355 }
        if (r9 == 0) goto L_0x0409;
    L_0x0402:
        r9 = r1.f15535b;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        r9 = r9.f7299j;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        r10 = 1;
        if (r9 <= r10) goto L_0x0417;
    L_0x0409:
        r9 = r1.f15551s;	 Catch:{ IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, b -> 0x05e9, c -> 0x0355 }
        if (r9 == 0) goto L_0x0417;
    L_0x040d:
        r9 = r1.f15548o;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        if (r9 == 0) goto L_0x0417;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
    L_0x0411:
        r9 = r1.f15552t;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        if (r9 != 0) goto L_0x0417;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
    L_0x0415:
        r9 = 1;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        goto L_0x0418;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
    L_0x0417:
        r9 = 0;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
    L_0x0418:
        if (r9 == 0) goto L_0x043c;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
    L_0x041a:
        r9 = r1.f15550r;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        if (r9 == 0) goto L_0x0423;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
    L_0x041e:
        r9 = r1.f15535b;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        r9 = r9.f7299j;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        goto L_0x043d;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
    L_0x0423:
        r9 = com.liulishuo.filedownloader.p200c.C2147c.C2146a.f7150a;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        r10 = r1.f15535b;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        r10 = r10.f7290a;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        r10 = r1.f15535b;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        r10 = r10.f7291b;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        r10 = r1.f15535b;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        r10 = r10.f7292c;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        r9 = r9.m5897c();	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        r9 = r9.mo1822a(r7);	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        goto L_0x043d;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
    L_0x043c:
        r9 = 1;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
    L_0x043d:
        if (r9 > 0) goto L_0x045c;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
    L_0x043f:
        r3 = new java.lang.IllegalAccessException;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        r4 = "invalid connection count %d, the connection count must be larger than 0";	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        r6 = 1;
        r7 = new java.lang.Object[r6];	 Catch:{ IOException -> 0x0458, IOException -> 0x0458, IOException -> 0x0458, IOException -> 0x0458, IOException -> 0x0458, b -> 0x05e9, c -> 0x0455 }
        r6 = java.lang.Integer.valueOf(r9);	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        r8 = 0;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        r7[r8] = r6;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        r4 = com.liulishuo.filedownloader.p205h.C2185f.m5996a(r4, r7);	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        r3.<init>(r4);	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        throw r3;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
    L_0x0455:
        r3 = r6;
        goto L_0x0356;
    L_0x0458:
        r0 = move-exception;
        r3 = r6;
        goto L_0x05a5;
    L_0x045c:
        r10 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));
        if (r10 != 0) goto L_0x047c;
    L_0x0460:
        r2 = r1.f15534a;
        r2.m5912a();
        r2 = r1.f15540g;
        if (r2 == 0) goto L_0x046b;
    L_0x0469:
        goto L_0x0382;
    L_0x046b:
        r2 = r1.f15554v;
        if (r2 == 0) goto L_0x0471;
    L_0x046f:
        goto L_0x038c;
    L_0x0471:
        r2 = r1.f15534a;	 Catch:{ IOException -> 0x0478 }
        r2.m5918c();	 Catch:{ IOException -> 0x0478 }
        goto L_0x03a1;
    L_0x0478:
        r0 = move-exception;
        r2 = r0;
        goto L_0x039c;
    L_0x047c:
        r10 = r1.f15540g;	 Catch:{ IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, b -> 0x05e9, c -> 0x0355 }
        if (r10 == 0) goto L_0x04a2;
    L_0x0480:
        r3 = r1.f15535b;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        r4 = -2;
        r3.m6058a(r4);	 Catch:{ IOException -> 0x03a9, IOException -> 0x03a9, IOException -> 0x03a9, IOException -> 0x03a9, IOException -> 0x03a9, b -> 0x05e9, c -> 0x03a6 }
        r2 = r1.f15534a;
        r2.m5912a();
        r2 = r1.f15540g;
        if (r2 == 0) goto L_0x0491;
    L_0x048f:
        goto L_0x0382;
    L_0x0491:
        r2 = r1.f15554v;
        if (r2 == 0) goto L_0x0497;
    L_0x0495:
        goto L_0x038c;
    L_0x0497:
        r2 = r1.f15534a;	 Catch:{ IOException -> 0x049e }
        r2.m5918c();	 Catch:{ IOException -> 0x049e }
        goto L_0x03a1;
    L_0x049e:
        r0 = move-exception;
        r2 = r0;
        goto L_0x039c;
    L_0x04a2:
        r10 = 1;
        if (r9 != r10) goto L_0x04a7;
    L_0x04a5:
        r10 = 1;
        goto L_0x04a8;
    L_0x04a7:
        r10 = 0;
    L_0x04a8:
        r1.f15549p = r10;	 Catch:{ IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, b -> 0x05e9, c -> 0x0355 }
        r10 = r1.f15549p;	 Catch:{ IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, IOException -> 0x05a3, b -> 0x05e9, c -> 0x0355 }
        if (r10 == 0) goto L_0x055e;
    L_0x04ae:
        r6 = r1.f15551s;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        if (r6 != 0) goto L_0x04c8;
    L_0x04b2:
        r6 = r1.f15535b;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        r6.m6059a(r3);	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        r3 = new com.liulishuo.filedownloader.c.b;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        r13 = 0;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        r15 = 0;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        r17 = -1;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        r21 = 0;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        r12 = r3;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        r19 = r7;	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        r12.<init>(r13, r15, r17, r19);	 Catch:{ IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, IOException -> 0x0359, b -> 0x05e9, c -> 0x0355 }
        goto L_0x04ec;
    L_0x04c8:
        r3 = r1.f15535b;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r3 = r3.f7295f;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r10 = r3.get();	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r3 = r1.f15535b;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r3 = r3.f7295f;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r12 = r3.get();	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r3 = r1.f15535b;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r3 = r3.f7295f;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r3 = r3.get();	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r16 = r7 - r3;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r3 = new com.liulishuo.filedownloader.c.b;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r14 = -1;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r18 = 0;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r9 = r3;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r9.<init>(r10, r12, r14, r16);	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
    L_0x04ec:
        r4 = new com.liulishuo.filedownloader.c.e$a;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r4.<init>();	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r6 = r1.f15535b;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r6 = r6.f7290a;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r4 = r4.m5900a(r6);	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r6 = -1;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r4.f7169c = r6;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r4.f7167a = r1;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r6 = r1.f15535b;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r6 = r6.f7291b;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r4 = r4.m5903a(r6);	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r6 = r1.f15535b;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r6 = r6.f7298i;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r4 = r4.m5906b(r6);	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r6 = r1.f15542i;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r4 = r4.m5902a(r6);	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r6 = r1.f15544k;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r4 = r4.m5904a(r6);	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r3 = r4.m5901a(r3);	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r4 = r1.f15535b;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r4 = r4.m6061b();	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r3.f7168b = r4;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r3 = r3.m5905a();	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r1.f15539f = r3;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r3 = r1.f15535b;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r4 = 1;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r3.f7299j = r4;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r3 = r1.f15536c;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r6 = r1.f15535b;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r6 = r6.f7290a;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r3.mo1842a(r6, r4);	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r3 = r1.f15540g;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        if (r3 == 0) goto L_0x054f;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
    L_0x0542:
        r3 = r1.f15535b;	 Catch:{ IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, IOException -> 0x055a, b -> 0x05e9, c -> 0x0557 }
        r4 = -2;
        r3.m6058a(r4);	 Catch:{ IOException -> 0x03a9, IOException -> 0x03a9, IOException -> 0x03a9, IOException -> 0x03a9, IOException -> 0x03a9, b -> 0x05e9, c -> 0x03a6 }
        r3 = r1.f15539f;	 Catch:{ IOException -> 0x03a9, IOException -> 0x03a9, IOException -> 0x03a9, IOException -> 0x03a9, IOException -> 0x03a9, b -> 0x05e9, c -> 0x03a6 }
        r3.m5908a();	 Catch:{ IOException -> 0x03a9, IOException -> 0x03a9, IOException -> 0x03a9, IOException -> 0x03a9, IOException -> 0x03a9, b -> 0x05e9, c -> 0x03a6 }
        goto L_0x061b;	 Catch:{ IOException -> 0x03a9, IOException -> 0x03a9, IOException -> 0x03a9, IOException -> 0x03a9, IOException -> 0x03a9, b -> 0x05e9, c -> 0x03a6 }
    L_0x054f:
        r4 = -2;	 Catch:{ IOException -> 0x03a9, IOException -> 0x03a9, IOException -> 0x03a9, IOException -> 0x03a9, IOException -> 0x03a9, b -> 0x05e9, c -> 0x03a6 }
        r3 = r1.f15539f;	 Catch:{ IOException -> 0x03a9, IOException -> 0x03a9, IOException -> 0x03a9, IOException -> 0x03a9, IOException -> 0x03a9, b -> 0x05e9, c -> 0x03a6 }
        r3.run();	 Catch:{ IOException -> 0x03a9, IOException -> 0x03a9, IOException -> 0x03a9, IOException -> 0x03a9, IOException -> 0x03a9, b -> 0x05e9, c -> 0x03a6 }
        goto L_0x061b;
    L_0x0557:
        r4 = -2;
        goto L_0x03a6;
    L_0x055a:
        r0 = move-exception;
        r4 = -2;
        goto L_0x03aa;
    L_0x055e:
        r4 = -2;
        r3 = r1.f15534a;	 Catch:{ IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, b -> 0x05e9, c -> 0x03a6 }
        r10 = new android.os.HandlerThread;	 Catch:{ IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, b -> 0x05e9, c -> 0x03a6 }
        r11 = "source-status-callback";	 Catch:{ IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, b -> 0x05e9, c -> 0x03a6 }
        r10.<init>(r11);	 Catch:{ IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, b -> 0x05e9, c -> 0x03a6 }
        r3.f7190h = r10;	 Catch:{ IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, b -> 0x05e9, c -> 0x03a6 }
        r10 = r3.f7190h;	 Catch:{ IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, b -> 0x05e9, c -> 0x03a6 }
        r10.start();	 Catch:{ IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, b -> 0x05e9, c -> 0x03a6 }
        r10 = new android.os.Handler;	 Catch:{ IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, b -> 0x05e9, c -> 0x03a6 }
        r11 = r3.f7190h;	 Catch:{ IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, b -> 0x05e9, c -> 0x03a6 }
        r11 = r11.getLooper();	 Catch:{ IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, b -> 0x05e9, c -> 0x03a6 }
        r10.<init>(r11, r3);	 Catch:{ IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, b -> 0x05e9, c -> 0x03a6 }
        r3.f7189g = r10;	 Catch:{ IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, b -> 0x05e9, c -> 0x03a6 }
        r3 = r1.f15550r;	 Catch:{ IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, IOException -> 0x059f, b -> 0x05e9, c -> 0x03a6 }
        if (r3 == 0) goto L_0x0599;
    L_0x0580:
        r3 = 1;
        if (r9 <= r3) goto L_0x0593;
    L_0x0583:
        r7 = r6.size();	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        if (r7 == r9) goto L_0x058a;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
    L_0x0589:
        goto L_0x0593;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
    L_0x058a:
        r7 = r1.f15535b;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        r7 = r7.f7296g;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        r1.m12492a(r6, r7);	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        goto L_0x061b;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
    L_0x0593:
        r6 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        r6.<init>();	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        throw r6;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
    L_0x0599:
        r3 = 1;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        r1.m12491a(r7, r9);	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        goto L_0x061b;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
    L_0x059f:
        r0 = move-exception;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        r3 = 1;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        goto L_0x060d;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
    L_0x05a3:
        r0 = move-exception;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        r3 = 1;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
    L_0x05a5:
        r4 = -2;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        goto L_0x060d;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
    L_0x05a8:
        r0 = move-exception;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        r3 = r7;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        goto L_0x05b3;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
    L_0x05ab:
        r0 = move-exception;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        goto L_0x05b2;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
    L_0x05ad:
        r0 = move-exception;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        r2 = r14;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        goto L_0x05b2;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
    L_0x05b0:
        r0 = move-exception;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        r2 = 2;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
    L_0x05b2:
        r3 = 1;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
    L_0x05b3:
        r4 = -2;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        goto L_0x05bd;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
    L_0x05b5:
        r0 = move-exception;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        r2 = r6;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        r3 = r7;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        r22 = r5;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        r5 = r4;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        r4 = r22;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
    L_0x05bd:
        r6 = r0;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        goto L_0x05c9;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
    L_0x05bf:
        r0 = move-exception;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        r2 = r6;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        r3 = r7;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        r22 = r5;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        r5 = r4;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        r4 = r22;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        r6 = r0;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        r9 = 0;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
    L_0x05c9:
        if (r9 == 0) goto L_0x05d1;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
    L_0x05cb:
        r9.mo1832f();	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        goto L_0x05d1;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
    L_0x05cf:
        r0 = move-exception;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
        goto L_0x060d;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
    L_0x05d1:
        throw r6;	 Catch:{ IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, IOException -> 0x05cf, b -> 0x05e9, c -> 0x05d9 }
    L_0x05d2:
        r2 = r6;
        r3 = r7;
        r22 = r5;
        r5 = r4;
        r4 = r22;
    L_0x05d9:
        r6 = r1.f15535b;	 Catch:{ all -> 0x0637 }
        r7 = 5;	 Catch:{ all -> 0x0637 }
        r6.m6058a(r7);	 Catch:{ all -> 0x0637 }
    L_0x05df:
        r6 = r2;
        r7 = r3;
        r3 = 0;
        r22 = r5;
        r5 = r4;
        r4 = r22;
        goto L_0x00a4;
    L_0x05e9:
        r2 = r1.f15534a;
        r2.m5912a();
        r2 = r1.f15540g;
        if (r2 == 0) goto L_0x05f4;
    L_0x05f2:
        goto L_0x0382;
    L_0x05f4:
        r2 = r1.f15554v;
        if (r2 == 0) goto L_0x05fa;
    L_0x05f8:
        goto L_0x038c;
    L_0x05fa:
        r2 = r1.f15534a;	 Catch:{ IOException -> 0x0601 }
        r2.m5918c();	 Catch:{ IOException -> 0x0601 }
        goto L_0x03a1;
    L_0x0601:
        r0 = move-exception;
        r2 = r0;
        goto L_0x039c;
    L_0x0605:
        r0 = move-exception;
        r2 = r6;
        r3 = r7;
        r22 = r5;
        r5 = r4;
        r4 = r22;
    L_0x060d:
        r6 = r0;
    L_0x060e:
        r7 = r1.mo1867a(r6);	 Catch:{ all -> 0x0637 }
        if (r7 == 0) goto L_0x0618;	 Catch:{ all -> 0x0637 }
    L_0x0614:
        r1.mo1869c(r6);	 Catch:{ all -> 0x0637 }
        goto L_0x05df;	 Catch:{ all -> 0x0637 }
    L_0x0618:
        r1.mo1868b(r6);	 Catch:{ all -> 0x0637 }
    L_0x061b:
        r2 = r1.f15534a;
        r2.m5912a();
        r2 = r1.f15540g;
        if (r2 == 0) goto L_0x0626;
    L_0x0624:
        goto L_0x0382;
    L_0x0626:
        r2 = r1.f15554v;
        if (r2 == 0) goto L_0x062c;
    L_0x062a:
        goto L_0x038c;
    L_0x062c:
        r2 = r1.f15534a;	 Catch:{ IOException -> 0x0633 }
        r2.m5918c();	 Catch:{ IOException -> 0x0633 }
        goto L_0x03a1;
    L_0x0633:
        r0 = move-exception;
        r2 = r0;
        goto L_0x039c;
    L_0x0637:
        r0 = move-exception;
        r2 = r0;
        r3 = r1.f15534a;
        r3.m5912a();
        r3 = r1.f15540g;
        if (r3 == 0) goto L_0x0648;
    L_0x0642:
        r3 = r1.f15534a;
        r3.m5917b();
        goto L_0x0661;
    L_0x0648:
        r3 = r1.f15554v;
        if (r3 == 0) goto L_0x0654;
    L_0x064c:
        r3 = r1.f15534a;
        r4 = r1.f15555w;
        r3.m5915a(r4);
        goto L_0x0661;
    L_0x0654:
        r3 = r1.f15534a;	 Catch:{ IOException -> 0x065a }
        r3.m5918c();	 Catch:{ IOException -> 0x065a }
        goto L_0x0661;
    L_0x065a:
        r0 = move-exception;
        r3 = r0;
        r4 = r1.f15534a;
        r4.m5915a(r3);
    L_0x0661:
        r3 = r1.f15553u;
        r4 = 0;
        r3.set(r4);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.c.d.run():void");
    }
}
