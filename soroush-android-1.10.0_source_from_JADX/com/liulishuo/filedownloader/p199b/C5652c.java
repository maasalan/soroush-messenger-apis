package com.liulishuo.filedownloader.p199b;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import com.liulishuo.filedownloader.model.C2210a;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.liulishuo.filedownloader.p199b.C2137a.C2136a;
import com.liulishuo.filedownloader.p199b.C5654d.C5653a;
import com.liulishuo.filedownloader.p205h.C2182d;
import com.liulishuo.filedownloader.p205h.C2184e;
import com.liulishuo.filedownloader.p205h.C2185f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

public final class C5652c implements C2137a {
    private final C5651b f15511a = new C5651b();
    private final C5654d f15512b = new C5654d();
    private Handler f15513c;
    private final long f15514d = C2184e.m5988a().f7252b;
    private final List<Integer> f15515e = new ArrayList();
    private AtomicInteger f15516f = new AtomicInteger();
    private volatile Thread f15517g;

    class C21391 implements Callback {
        final /* synthetic */ C5652c f7127a;

        C21391(C5652c c5652c) {
            this.f7127a = c5652c;
        }

        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                if (this.f7127a.f15517g != null) {
                    LockSupport.unpark(this.f7127a.f15517g);
                    this.f7127a.f15517g = null;
                }
                return false;
            }
            try {
                this.f7127a.f15516f.set(i);
                this.f7127a.m12438h(i);
                this.f7127a.f15515e.add(Integer.valueOf(i));
                this.f7127a.f15516f.set(0);
                if (this.f7127a.f15517g != null) {
                    LockSupport.unpark(this.f7127a.f15517g);
                    this.f7127a.f15517g = null;
                }
                return false;
            } catch (Throwable th) {
                this.f7127a.f15516f.set(0);
                if (this.f7127a.f15517g != null) {
                    LockSupport.unpark(this.f7127a.f15517g);
                    this.f7127a.f15517g = null;
                }
            }
        }
    }

    public C5652c() {
        HandlerThread handlerThread = new HandlerThread(C2185f.m6016f("RemitHandoverToDB"));
        handlerThread.start();
        this.f15513c = new Handler(handlerThread.getLooper(), new C21391(this));
    }

    private void m12438h(int i) {
        if (C2182d.f7249a) {
            C2182d.m5983c(this, "sync cache to db %d", Integer.valueOf(i));
        }
        this.f15512b.mo1849a(this.f15511a.mo1852b(i));
        List<C2210a> c = this.f15511a.mo1854c(i);
        this.f15512b.mo1855d(i);
        for (C2210a a : c) {
            this.f15512b.mo1850a(a);
        }
    }

    private boolean m12439i(int i) {
        return !this.f15515e.contains(Integer.valueOf(i));
    }

    private void m12440j(int i) {
        this.f15513c.removeMessages(i);
        if (this.f15516f.get() == i) {
            this.f15517g = Thread.currentThread();
            this.f15513c.sendEmptyMessage(0);
            LockSupport.park();
            return;
        }
        m12438h(i);
    }

    public final void mo1840a() {
        this.f15511a.f15509a.clear();
        this.f15512b.mo1840a();
    }

    public final void mo1841a(int i) {
        this.f15513c.sendEmptyMessageDelayed(i, this.f15514d);
    }

    public final void mo1842a(int i, int i2) {
        if (!m12439i(i)) {
            this.f15512b.mo1842a(i, i2);
        }
    }

    public final void mo1843a(int i, int i2, long j) {
        this.f15511a.mo1843a(i, i2, j);
        if (!m12439i(i)) {
            this.f15512b.mo1843a(i, i2, j);
        }
    }

    public final void mo1844a(int i, long j) {
        if (!m12439i(i)) {
            this.f15512b.mo1844a(i, j);
        }
    }

    public final void mo1845a(int i, long j, String str, String str2) {
        if (!m12439i(i)) {
            this.f15512b.mo1845a(i, j, str, str2);
        }
    }

    public final void mo1846a(int i, String str, long j, long j2, int i2) {
        if (!m12439i(i)) {
            this.f15512b.mo1846a(i, str, j, j2, i2);
        }
    }

    public final void mo1847a(int i, Throwable th) {
        if (!m12439i(i)) {
            this.f15512b.mo1847a(i, th);
        }
    }

    public final void mo1848a(int i, Throwable th, long j) {
        if (m12439i(i)) {
            m12440j(i);
        }
        this.f15512b.mo1848a(i, th, j);
        this.f15515e.remove(Integer.valueOf(i));
    }

    public final void mo1849a(FileDownloadModel fileDownloadModel) {
        this.f15511a.mo1849a(fileDownloadModel);
        if (!m12439i(fileDownloadModel.f7290a)) {
            this.f15512b.mo1849a(fileDownloadModel);
        }
    }

    public final void mo1850a(C2210a c2210a) {
        this.f15511a.mo1850a(c2210a);
        if (!m12439i(c2210a.f7305a)) {
            this.f15512b.mo1850a(c2210a);
        }
    }

    public final C2136a mo1851b() {
        return new C5653a(this.f15512b, this.f15511a.f15509a, this.f15511a.f15510b);
    }

    public final FileDownloadModel mo1852b(int i) {
        return this.f15511a.mo1852b(i);
    }

    public final void mo1853b(int i, long j) {
        if (m12439i(i)) {
            m12440j(i);
        }
        this.f15512b.mo1853b(i, j);
        this.f15515e.remove(Integer.valueOf(i));
    }

    public final List<C2210a> mo1854c(int i) {
        return this.f15511a.mo1854c(i);
    }

    public final void mo1855d(int i) {
        this.f15511a.mo1855d(i);
        if (!m12439i(i)) {
            this.f15512b.mo1855d(i);
        }
    }

    public final boolean mo1856e(int i) {
        this.f15512b.mo1856e(i);
        return this.f15511a.mo1856e(i);
    }

    public final void mo1857f(int i) {
        this.f15511a.mo1856e(i);
        if (m12439i(i)) {
            this.f15513c.removeMessages(i);
            if (this.f15516f.get() == i) {
                this.f15517g = Thread.currentThread();
                this.f15513c.sendEmptyMessage(0);
                LockSupport.park();
            }
            this.f15515e.remove(Integer.valueOf(i));
        }
        this.f15512b.mo1856e(i);
        this.f15515e.remove(Integer.valueOf(i));
    }

    public final void mo1858g(int i) {
        if (!m12439i(i)) {
        }
    }
}
