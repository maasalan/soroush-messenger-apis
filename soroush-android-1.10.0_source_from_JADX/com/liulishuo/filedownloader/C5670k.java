package com.liulishuo.filedownloader;

import android.support.v7.widget.ListPopupWindow;
import com.liulishuo.filedownloader.C2135a.C5647a;
import com.liulishuo.filedownloader.C2135a.C5649c;
import com.liulishuo.filedownloader.C2191j.C21881;
import com.liulishuo.filedownloader.C5676w.C2229a;
import com.liulishuo.filedownloader.message.BlockCompleteMessage;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.p205h.C2182d;
import com.liulishuo.filedownloader.p205h.C2185f;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

final class C5670k implements C2220s {
    private C5647a f15590a;
    private C5649c f15591b;
    private Queue<MessageSnapshot> f15592c;
    private boolean f15593d = false;

    C5670k(C5647a c5647a, C5649c c5649c) {
        this.f15590a = c5647a;
        this.f15591b = c5649c;
        this.f15592c = new LinkedBlockingQueue();
    }

    private void m12579a(int i) {
        if ((i < 0 ? 1 : 0) != 0) {
            if (!this.f15592c.isEmpty()) {
                MessageSnapshot messageSnapshot = (MessageSnapshot) this.f15592c.peek();
                C2182d.m5984d(this, "the messenger[%s](with id[%d]) has already accomplished all his job, but there still are some messages in parcel queue[%d] queue-top-status[%d]", this, Integer.valueOf(messageSnapshot.f15595a), Integer.valueOf(this.f15592c.size()), Byte.valueOf(messageSnapshot.mo3094b()));
            }
            this.f15590a = null;
        }
    }

    private void m12580j(MessageSnapshot messageSnapshot) {
        if (this.f15590a == null) {
            if (C2182d.f7249a) {
                C2182d.m5983c(this, "occur this case, it would be the host task of this messenger has been over(paused/warn/completed/error) on the other thread before receiving the snapshot(id[%d], status[%d])", Integer.valueOf(messageSnapshot.f15595a), Byte.valueOf(messageSnapshot.mo3094b()));
            }
            return;
        }
        if (!this.f15593d) {
            if (this.f15590a.mo1871B().mo1906n() != null) {
                this.f15592c.offer(messageSnapshot);
                C2191j a = C2191j.m6037a();
                if (mo1947c()) {
                    mo1944b();
                    return;
                } else if (mo1949d()) {
                    a.f7272a.execute(new C21881(a, this));
                    return;
                } else {
                    if (!(C2191j.m6039c() || a.f7273b.isEmpty())) {
                        synchronized (a.f7274c) {
                            if (!a.f7273b.isEmpty()) {
                                Iterator it = a.f7273b.iterator();
                                while (it.hasNext()) {
                                    a.m6040a((C2220s) it.next());
                                }
                            }
                            a.f7273b.clear();
                        }
                    }
                    if (C2191j.m6039c()) {
                        synchronized (a.f7274c) {
                            a.f7273b.offer(this);
                        }
                        a.m6041b();
                        return;
                    }
                    a.m6040a((C2220s) this);
                    return;
                }
            }
        }
        if ((C2193l.m6042a() || this.f15590a.mo1881L()) && messageSnapshot.mo3094b() == (byte) 4) {
            this.f15591b.mo3080c();
        }
        m12579a(messageSnapshot.mo3094b());
    }

    public final void mo1942a(MessageSnapshot messageSnapshot) {
        if (C2182d.f7249a) {
            C2182d.m5983c(this, "notify pending %s", this.f15590a);
        }
        this.f15591b.mo3078b();
        m12580j(messageSnapshot);
    }

    public final boolean mo1943a() {
        if (C2182d.f7249a) {
            C2182d.m5983c(this, "notify begin %s", this.f15590a);
        }
        if (this.f15590a == null) {
            C2182d.m5984d(this, "can't begin the task, the holder fo the messenger is nil, %d", Integer.valueOf(this.f15592c.size()));
            return false;
        }
        this.f15591b.mo3076a();
        return true;
    }

    public final void mo1944b() {
        if (!this.f15593d) {
            MessageSnapshot messageSnapshot = (MessageSnapshot) this.f15592c.poll();
            byte b = messageSnapshot.mo3094b();
            C5647a c5647a = this.f15590a;
            if (c5647a == null) {
                throw new IllegalArgumentException(C2185f.m5996a("can't handover the message, no master to receive this message(status[%d]) size[%d]", Integer.valueOf(b), Integer.valueOf(this.f15592c.size())));
            }
            C2135a B = c5647a.mo1871B();
            C2187i n = B.mo1906n();
            C2229a C = c5647a.mo1872C();
            m12579a((int) b);
            if (n != null) {
                if (b == (byte) 4) {
                    try {
                        messageSnapshot = ((BlockCompleteMessage) messageSnapshot).g_();
                        if (C2182d.f7249a) {
                            C2182d.m5983c(this, "notify completed %s", this.f15590a);
                        }
                        this.f15591b.mo3080c();
                        m12580j(messageSnapshot);
                        return;
                    } catch (Throwable th) {
                        mo1953h(C.mo3075a(th));
                        return;
                    }
                }
                C5669g c5669g = null;
                if (n instanceof C5669g) {
                    c5669g = (C5669g) n;
                }
                switch (b) {
                    case (byte) -3:
                        n.mo2179b(B);
                        return;
                    case ListPopupWindow.WRAP_CONTENT /*-2*/:
                        if (c5669g != null) {
                            messageSnapshot.mo3099i();
                            messageSnapshot.mo3098d();
                            return;
                        }
                        n.mo2180b(B, messageSnapshot.mo3096a(), messageSnapshot.mo3097c());
                        return;
                    case (byte) -1:
                        n.mo2178a(B, messageSnapshot.mo3437j());
                        return;
                    case (byte) 1:
                        if (c5669g != null) {
                            messageSnapshot.mo3099i();
                            messageSnapshot.mo3098d();
                            return;
                        }
                        messageSnapshot.mo3096a();
                        messageSnapshot.mo3097c();
                        n.mo2176a(B);
                        return;
                    case (byte) 2:
                        if (c5669g != null) {
                            messageSnapshot.mo3436h();
                            messageSnapshot.mo3435g();
                            messageSnapshot.mo3098d();
                            return;
                        }
                        messageSnapshot.mo3436h();
                        messageSnapshot.mo3435g();
                        messageSnapshot.mo3097c();
                        return;
                    case (byte) 3:
                        if (c5669g != null) {
                            messageSnapshot.mo3099i();
                            return;
                        } else {
                            n.mo2177a(B, messageSnapshot.mo3096a(), B.mo1909q());
                            return;
                        }
                    case (byte) 5:
                        if (c5669g != null) {
                            messageSnapshot.mo3437j();
                            messageSnapshot.mo3568k();
                            messageSnapshot.mo3099i();
                            return;
                        }
                        messageSnapshot.mo3437j();
                        messageSnapshot.mo3568k();
                        messageSnapshot.mo3096a();
                        return;
                    case (byte) 6:
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public final void mo1945b(MessageSnapshot messageSnapshot) {
        if (C2182d.f7249a) {
            C2182d.m5983c(this, "notify started %s", this.f15590a);
        }
        this.f15591b.mo3078b();
        m12580j(messageSnapshot);
    }

    public final void mo1946c(MessageSnapshot messageSnapshot) {
        if (C2182d.f7249a) {
            C2182d.m5983c(this, "notify connected %s", this.f15590a);
        }
        this.f15591b.mo3078b();
        m12580j(messageSnapshot);
    }

    public final boolean mo1947c() {
        return this.f15590a.mo1871B().mo1917y();
    }

    public final void mo1948d(MessageSnapshot messageSnapshot) {
        C2135a B = this.f15590a.mo1871B();
        if (C2182d.f7249a) {
            C2182d.m5983c(this, "notify progress %s %d %d", B, Long.valueOf(B.mo1908p()), Long.valueOf(B.mo1910r()));
        }
        if (B.mo1900h() <= 0) {
            if (C2182d.f7249a) {
                C2182d.m5983c(this, "notify progress but client not request notify %s", this.f15590a);
            }
            return;
        }
        this.f15591b.mo3078b();
        m12580j(messageSnapshot);
    }

    public final boolean mo1949d() {
        return ((MessageSnapshot) this.f15592c.peek()).mo3094b() == (byte) 4;
    }

    public final void mo1950e(MessageSnapshot messageSnapshot) {
        if (C2182d.f7249a) {
            C2182d.m5983c(this, "notify block completed %s %s", this.f15590a, Thread.currentThread().getName());
        }
        this.f15591b.mo3078b();
        m12580j(messageSnapshot);
    }

    public final void mo1951f(MessageSnapshot messageSnapshot) {
        if (C2182d.f7249a) {
            C2135a B = this.f15590a.mo1871B();
            C2182d.m5983c(this, "notify retry %s %d %d %s", this.f15590a, Integer.valueOf(B.mo1915w()), Integer.valueOf(B.mo1916x()), B.mo1913u());
        }
        this.f15591b.mo3078b();
        m12580j(messageSnapshot);
    }

    public final void mo1952g(MessageSnapshot messageSnapshot) {
        if (C2182d.f7249a) {
            C2182d.m5983c(this, "notify warn %s", this.f15590a);
        }
        this.f15591b.mo3080c();
        m12580j(messageSnapshot);
    }

    public final void mo1953h(MessageSnapshot messageSnapshot) {
        if (C2182d.f7249a) {
            C2182d.m5983c(this, "notify error %s %s", this.f15590a, this.f15590a.mo1871B().mo1913u());
        }
        this.f15591b.mo3080c();
        m12580j(messageSnapshot);
    }

    public final void mo1954i(MessageSnapshot messageSnapshot) {
        if (C2182d.f7249a) {
            C2182d.m5983c(this, "notify paused %s", this.f15590a);
        }
        this.f15591b.mo3080c();
        m12580j(messageSnapshot);
    }

    public final String toString() {
        String str = "%d:%s";
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.f15590a == null ? -1 : this.f15590a.mo1871B().mo1898f());
        objArr[1] = super.toString();
        return C2185f.m5996a(str, objArr);
    }
}
