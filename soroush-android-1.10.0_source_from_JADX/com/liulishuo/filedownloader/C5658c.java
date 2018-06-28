package com.liulishuo.filedownloader;

import android.text.TextUtils;
import android.util.SparseArray;
import com.liulishuo.filedownloader.C2135a.C2132b;
import com.liulishuo.filedownloader.C2135a.C5647a;
import com.liulishuo.filedownloader.C2186h.C2173a;
import com.liulishuo.filedownloader.C5676w.C2229a;
import com.liulishuo.filedownloader.C6607d.C2160a;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.p205h.C2182d;
import com.liulishuo.filedownloader.p205h.C2185f;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class C5658c implements C2135a, C5647a, C2160a {
    volatile int f15559a = 0;
    boolean f15560b = false;
    private final C5676w f15561c;
    private final C2229a f15562d;
    private int f15563e;
    private ArrayList<Object> f15564f;
    private final String f15565g;
    private String f15566h;
    private String f15567i;
    private boolean f15568j;
    private FileDownloadHeader f15569k;
    private C2187i f15570l;
    private SparseArray<Object> f15571m;
    private Object f15572n;
    private int f15573o = 0;
    private boolean f15574p = false;
    private boolean f15575q = false;
    private int f15576r = 100;
    private int f15577s = 10;
    private boolean f15578t = false;
    private final Object f15579u;
    private final Object f15580v = new Object();
    private volatile boolean f15581w = false;

    private static final class C5656a implements C2132b {
        private final C5658c f15530a;

        private C5656a(C5658c c5658c) {
            this.f15530a = c5658c;
            this.f15530a.f15560b = true;
        }

        public final int mo1863a() {
            int f = this.f15530a.mo1898f();
            if (C2182d.f7249a) {
                C2182d.m5983c(this, "add the task[%d] to the queue", Integer.valueOf(f));
            }
            C2173a.f7243a.m6030c(this.f15530a);
            return f;
        }
    }

    C5658c(String str) {
        this.f15565g = str;
        this.f15579u = new Object();
        Object c6607d = new C6607d(this, this.f15579u);
        this.f15561c = c6607d;
        this.f15562d = c6607d;
    }

    private int m12502P() {
        if ((this.f15561c.mo3086g() != (byte) 0 ? 1 : 0) != 0) {
            int i;
            StringBuilder stringBuilder;
            if (!C2216q.m6073a().m6077d().mo3107a(this)) {
                if (mo1911s() <= (byte) 0) {
                    i = 0;
                    if (i == 0) {
                        throw new IllegalStateException(C2185f.m5996a("This task is running %d, if you want to start the same task, please create a new one by FileDownloader.create", Integer.valueOf(mo1898f())));
                    }
                    stringBuilder = new StringBuilder("This task is dirty to restart, If you want to reuse this task, please invoke #reuse method manually and retry to restart again.");
                    stringBuilder.append(this.f15561c.toString());
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            i = 1;
            if (i == 0) {
                stringBuilder = new StringBuilder("This task is dirty to restart, If you want to reuse this task, please invoke #reuse method manually and retry to restart again.");
                stringBuilder.append(this.f15561c.toString());
                throw new IllegalStateException(stringBuilder.toString());
            }
            throw new IllegalStateException(C2185f.m5996a("This task is running %d, if you want to start the same task, please create a new one by FileDownloader.create", Integer.valueOf(mo1898f())));
        }
        if (!mo1894c()) {
            mo1875F();
        }
        this.f15561c.mo3084e();
        return mo1898f();
    }

    public final boolean mo1870A() {
        return this.f15575q;
    }

    public final C2135a mo1871B() {
        return this;
    }

    public final C2229a mo1872C() {
        return this.f15562d;
    }

    public final boolean mo1873D() {
        return mo1911s() < (byte) 0;
    }

    public final int mo1874E() {
        return this.f15559a;
    }

    public final void mo1875F() {
        this.f15559a = this.f15570l != null ? this.f15570l.hashCode() : hashCode();
    }

    public final boolean mo1876G() {
        return this.f15581w;
    }

    public final void mo1877H() {
        this.f15581w = true;
    }

    public final void mo1878I() {
        this.f15561c.mo3092m();
        if (C2173a.f7243a.m6025a((C5647a) this)) {
            this.f15581w = false;
        }
    }

    public final void mo1879J() {
        m12502P();
    }

    public final Object mo1880K() {
        return this.f15579u;
    }

    public final boolean mo1881L() {
        return this.f15564f != null && this.f15564f.size() > 0;
    }

    public final FileDownloadHeader mo1882M() {
        return this.f15569k;
    }

    public final C5647a mo1883N() {
        return this;
    }

    public final ArrayList<Object> mo1884O() {
        return this.f15564f;
    }

    public final C2135a mo1885a() {
        this.f15577s = IjkMediaCodecInfo.RANK_LAST_CHANCE;
        return this;
    }

    public final C2135a mo1886a(int i) {
        this.f15573o = i;
        return this;
    }

    public final C2135a mo1887a(int i, Object obj) {
        if (this.f15571m == null) {
            this.f15571m = new SparseArray(2);
        }
        this.f15571m.put(i, obj);
        return this;
    }

    public final C2135a mo1888a(C2187i c2187i) {
        this.f15570l = c2187i;
        if (C2182d.f7249a) {
            C2182d.m5983c(this, "setListener %s", c2187i);
        }
        return this;
    }

    public final C2135a mo1889a(String str) {
        this.f15566h = str;
        if (C2182d.f7249a) {
            C2182d.m5983c(this, "setPath %s", str);
        }
        this.f15568j = false;
        this.f15567i = new File(str).getName();
        return this;
    }

    public final C2135a mo1890a(String str, String str2) {
        if (this.f15569k == null) {
            synchronized (this.f15580v) {
                if (this.f15569k == null) {
                    this.f15569k = new FileDownloadHeader();
                }
            }
        }
        FileDownloadHeader fileDownloadHeader = this.f15569k;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        } else if (str2 == null) {
            throw new NullPointerException("value == null");
        } else {
            if (fileDownloadHeader.f7289a == null) {
                fileDownloadHeader.f7289a = new HashMap();
            }
            List list = (List) fileDownloadHeader.f7289a.get(str);
            if (list == null) {
                list = new ArrayList();
                fileDownloadHeader.f7289a.put(str, list);
            }
            if (!list.contains(str2)) {
                list.add(str2);
            }
            return this;
        }
    }

    public final C2132b mo1891b() {
        return new C5656a();
    }

    public final Object mo1892b(int i) {
        return this.f15571m == null ? null : this.f15571m.get(i);
    }

    public final void mo1893b(String str) {
        this.f15567i = str;
    }

    public final boolean mo1894c() {
        return this.f15559a != 0;
    }

    public final boolean mo1895c(int i) {
        return mo1898f() == i;
    }

    public final int mo1896d() {
        if (!this.f15560b) {
            return m12502P();
        }
        throw new IllegalStateException("If you start the task manually, it means this task doesn't belong to a queue, so you must not invoke BaseDownloadTask#ready() or InQueueTask#enqueue() before you start() this method. For detail: If this task doesn't belong to a queue, what is just an isolated task, you just need to invoke BaseDownloadTask#start() to start this task, that's all. In other words, If this task doesn't belong to a queue, you must not invoke BaseDownloadTask#ready() method or InQueueTask#enqueue() method before invoke BaseDownloadTask#start(), If you do that and if there is the same listener object to start a queue in another thread, this task may be assembled by the queue, in that case, when you invoke BaseDownloadTask#start() manually to start this task or this task is started by the queue, there is an exception buried in there, because this task object is started two times without declare BaseDownloadTask#reuse() : 1. you invoke BaseDownloadTask#start() manually;  2. the queue start this task automatically.");
    }

    public final boolean mo1897e() {
        boolean f;
        synchronized (this.f15579u) {
            f = this.f15561c.mo3085f();
        }
        return f;
    }

    public final int mo1898f() {
        if (this.f15563e != 0) {
            return this.f15563e;
        }
        if (TextUtils.isEmpty(this.f15566h) || TextUtils.isEmpty(this.f15565g)) {
            return 0;
        }
        int a = C2185f.m5990a(this.f15565g, this.f15566h, this.f15568j);
        this.f15563e = a;
        return a;
    }

    public final String mo1899g() {
        return this.f15565g;
    }

    public final int mo1900h() {
        return this.f15576r;
    }

    public final int mo1901i() {
        return this.f15577s;
    }

    public final String mo1902j() {
        return this.f15566h;
    }

    public final boolean mo1903k() {
        return this.f15568j;
    }

    public final String mo1904l() {
        return this.f15567i;
    }

    public final String mo1905m() {
        return C2185f.m5995a(this.f15566h, this.f15568j, this.f15567i);
    }

    public final C2187i mo1906n() {
        return this.f15570l;
    }

    public final int mo1907o() {
        return this.f15561c.mo3087h() > 2147483647L ? ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : (int) this.f15561c.mo3087h();
    }

    public final long mo1908p() {
        return this.f15561c.mo3087h();
    }

    public final int mo1909q() {
        return this.f15561c.mo3088i() > 2147483647L ? ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : (int) this.f15561c.mo3088i();
    }

    public final long mo1910r() {
        return this.f15561c.mo3088i();
    }

    public final byte mo1911s() {
        return this.f15561c.mo3086g();
    }

    public final boolean mo1912t() {
        return this.f15578t;
    }

    public final String toString() {
        return C2185f.m5996a("%d@%s", Integer.valueOf(mo1898f()), super.toString());
    }

    public final Throwable mo1913u() {
        return this.f15561c.mo3089j();
    }

    public final Object mo1914v() {
        return this.f15572n;
    }

    public final int mo1915w() {
        return this.f15573o;
    }

    public final int mo1916x() {
        return this.f15561c.mo3090k();
    }

    public final boolean mo1917y() {
        return this.f15574p;
    }

    public final boolean mo1918z() {
        return this.f15561c.mo3091l();
    }
}
