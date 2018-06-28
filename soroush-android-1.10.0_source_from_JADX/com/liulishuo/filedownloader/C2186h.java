package com.liulishuo.filedownloader;

import android.support.v7.widget.ListPopupWindow;
import com.liulishuo.filedownloader.C2135a.C5647a;
import com.liulishuo.filedownloader.message.C2203d;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.p205h.C2182d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class C2186h {
    final ArrayList<C5647a> f7266a;

    private static final class C2173a {
        private static final C2186h f7243a = new C2186h();
    }

    private C2186h() {
        this.f7266a = new ArrayList();
    }

    final int m6024a(int i) {
        int i2;
        synchronized (this.f7266a) {
            Iterator it = this.f7266a.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (((C5647a) it.next()).mo1895c(i)) {
                    i2++;
                }
            }
        }
        return i2;
    }

    final boolean m6025a(C5647a c5647a) {
        if (!this.f7266a.isEmpty()) {
            if (this.f7266a.contains(c5647a)) {
                return false;
            }
        }
        return true;
    }

    public final boolean m6026a(C5647a c5647a, MessageSnapshot messageSnapshot) {
        byte b = messageSnapshot.mo3094b();
        synchronized (this.f7266a) {
            boolean remove = this.f7266a.remove(c5647a);
        }
        if (C2182d.f7249a && this.f7266a.size() == 0) {
            C2182d.m5985e(this, "remove %s left %d %d", c5647a, Byte.valueOf(b), Integer.valueOf(this.f7266a.size()));
        }
        if (remove) {
            C2220s d = c5647a.mo1872C().mo3082d();
            switch (b) {
                case (byte) -4:
                    d.mo1952g(messageSnapshot);
                    return remove;
                case (byte) -3:
                    d.mo1950e(C2203d.m6055a(messageSnapshot));
                    return remove;
                case ListPopupWindow.WRAP_CONTENT /*-2*/:
                    d.mo1954i(messageSnapshot);
                    return remove;
                case (byte) -1:
                    d.mo1953h(messageSnapshot);
                    return remove;
                default:
                    return remove;
            }
        }
        C2182d.m5980a(this, "remove error, not exist: %s %d", c5647a, Byte.valueOf(b));
        return remove;
    }

    public final C5647a m6027b(int i) {
        synchronized (this.f7266a) {
            Iterator it = this.f7266a.iterator();
            while (it.hasNext()) {
                C5647a c5647a = (C5647a) it.next();
                if (c5647a.mo1895c(i)) {
                    return c5647a;
                }
            }
            return null;
        }
    }

    final void m6028b(C5647a c5647a) {
        if (!c5647a.mo1871B().mo1894c()) {
            c5647a.mo1875F();
        }
        if (c5647a.mo1872C().mo3082d().mo1943a()) {
            m6030c(c5647a);
        }
    }

    final List<C5647a> m6029c(int i) {
        List<C5647a> arrayList = new ArrayList();
        synchronized (this.f7266a) {
            Iterator it = this.f7266a.iterator();
            while (it.hasNext()) {
                C5647a c5647a = (C5647a) it.next();
                if (c5647a.mo1895c(i) && !c5647a.mo1873D()) {
                    byte s = c5647a.mo1871B().mo1911s();
                    if (!(s == (byte) 0 || s == (byte) 10)) {
                        arrayList.add(c5647a);
                    }
                }
            }
        }
        return arrayList;
    }

    final void m6030c(C5647a c5647a) {
        if (!c5647a.mo1876G()) {
            synchronized (this.f7266a) {
                if (this.f7266a.contains(c5647a)) {
                    C2182d.m5984d(this, "already has %s", c5647a);
                } else {
                    c5647a.mo1877H();
                    this.f7266a.add(c5647a);
                    if (C2182d.f7249a) {
                        C2182d.m5985e(this, "add list in all %s %d %d", c5647a, Byte.valueOf(c5647a.mo1871B().mo1911s()), Integer.valueOf(this.f7266a.size()));
                    }
                }
            }
        }
    }
}
