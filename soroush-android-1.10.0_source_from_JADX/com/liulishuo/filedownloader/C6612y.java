package com.liulishuo.filedownloader;

import com.liulishuo.filedownloader.C2135a.C5647a;
import com.liulishuo.filedownloader.C2186h.C2173a;
import com.liulishuo.filedownloader.C5671m.C2194a;
import com.liulishuo.filedownloader.p201d.C5659b.C2161a;
import com.liulishuo.filedownloader.p205h.C2181c;
import com.liulishuo.filedownloader.p205h.C2182d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class C6612y extends C5661e implements C2227u {
    private final ArrayList<C5647a> f18881b = new ArrayList();

    public final void mo3106a() {
        C2228v c = C2216q.m6073a().m6076c();
        if (C2182d.f7249a) {
            C2182d.m5983c(this, "The downloader service is connected.", new Object[0]);
        }
        synchronized (this.f18881b) {
            List<C5647a> list = (List) this.f18881b.clone();
            this.f18881b.clear();
            List arrayList = new ArrayList(c.mo1836b());
            for (C5647a c5647a : list) {
                int E = c5647a.mo1874E();
                if (c.mo1835a(E)) {
                    c5647a.mo1871B().mo1891b().mo1863a();
                    if (!arrayList.contains(Integer.valueOf(E))) {
                        arrayList.add(Integer.valueOf(E));
                    }
                } else {
                    c5647a.mo1879J();
                }
            }
            c.mo1834a(arrayList);
        }
    }

    public final boolean mo3107a(C5647a c5647a) {
        return !this.f18881b.isEmpty() && this.f18881b.contains(c5647a);
    }

    public final void mo3108b() {
        if (this.f15584a == C2161a.f7229c) {
            C2228v c = C2216q.m6073a().m6076c();
            if (C2182d.f7249a) {
                C2182d.m5983c(this, "lost the connection to the file download service, and current active task size is %d", Integer.valueOf(C2173a.f7243a.f7266a.size()));
            }
            if (C2173a.f7243a.f7266a.size() > 0) {
                synchronized (this.f18881b) {
                    C2186h a = C2173a.f7243a;
                    List list = this.f18881b;
                    synchronized (a.f7266a) {
                        Iterator it = a.f7266a.iterator();
                        while (it.hasNext()) {
                            C5647a c5647a = (C5647a) it.next();
                            if (!list.contains(c5647a)) {
                                list.add(c5647a);
                            }
                        }
                        a.f7266a.clear();
                    }
                    Iterator it2 = this.f18881b.iterator();
                    while (it2.hasNext()) {
                        ((C5647a) it2.next()).mo1878I();
                    }
                    c.mo1833a();
                }
                C2216q.m6073a();
                if (!C2216q.m6075b()) {
                    C2194a.f7278a.mo1955a(C2181c.f7248a);
                    return;
                }
            }
            return;
        }
        if (C2173a.f7243a.f7266a.size() > 0) {
            C2182d.m5984d(this, "file download service has be unbound but the size of active tasks are not empty %d ", Integer.valueOf(C2173a.f7243a.f7266a.size()));
        }
    }

    public final void mo3109b(C5647a c5647a) {
        if (!this.f18881b.isEmpty()) {
            synchronized (this.f18881b) {
                this.f18881b.remove(c5647a);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3110c(com.liulishuo.filedownloader.C2135a.C5647a r7) {
        /*
        r6 = this;
        com.liulishuo.filedownloader.C2216q.m6073a();
        r0 = com.liulishuo.filedownloader.C2216q.m6075b();
        r1 = 0;
        if (r0 != 0) goto L_0x0050;
    L_0x000a:
        r0 = r6.f18881b;
        monitor-enter(r0);
        com.liulishuo.filedownloader.C2216q.m6073a();	 Catch:{ all -> 0x004d }
        r2 = com.liulishuo.filedownloader.C2216q.m6075b();	 Catch:{ all -> 0x004d }
        if (r2 != 0) goto L_0x004b;
    L_0x0016:
        r2 = com.liulishuo.filedownloader.p205h.C2182d.f7249a;	 Catch:{ all -> 0x004d }
        r3 = 1;
        if (r2 == 0) goto L_0x0030;
    L_0x001b:
        r2 = "Waiting for connecting with the downloader service... %d";
        r4 = new java.lang.Object[r3];	 Catch:{ all -> 0x004d }
        r5 = r7.mo1871B();	 Catch:{ all -> 0x004d }
        r5 = r5.mo1898f();	 Catch:{ all -> 0x004d }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x004d }
        r4[r1] = r5;	 Catch:{ all -> 0x004d }
        com.liulishuo.filedownloader.p205h.C2182d.m5983c(r6, r2, r4);	 Catch:{ all -> 0x004d }
    L_0x0030:
        r1 = com.liulishuo.filedownloader.C5671m.C2194a.f7278a;	 Catch:{ all -> 0x004d }
        r2 = com.liulishuo.filedownloader.p205h.C2181c.f7248a;	 Catch:{ all -> 0x004d }
        r1.mo1955a(r2);	 Catch:{ all -> 0x004d }
        r1 = r6.f18881b;	 Catch:{ all -> 0x004d }
        r1 = r1.contains(r7);	 Catch:{ all -> 0x004d }
        if (r1 != 0) goto L_0x0049;
    L_0x0041:
        r7.mo1878I();	 Catch:{ all -> 0x004d }
        r1 = r6.f18881b;	 Catch:{ all -> 0x004d }
        r1.add(r7);	 Catch:{ all -> 0x004d }
    L_0x0049:
        monitor-exit(r0);	 Catch:{ all -> 0x004d }
        return r3;
    L_0x004b:
        monitor-exit(r0);	 Catch:{ all -> 0x004d }
        goto L_0x0050;
    L_0x004d:
        r7 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x004d }
        throw r7;
    L_0x0050:
        r6.mo3109b(r7);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.y.c(com.liulishuo.filedownloader.a$a):boolean");
    }
}
