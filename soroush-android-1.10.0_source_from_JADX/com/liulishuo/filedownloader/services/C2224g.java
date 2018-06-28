package com.liulishuo.filedownloader.services;

import android.util.SparseArray;
import com.liulishuo.filedownloader.p200c.C5657d;
import com.liulishuo.filedownloader.p205h.C2175b;
import com.liulishuo.filedownloader.p205h.C2182d;
import com.liulishuo.filedownloader.p205h.C2184e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

final class C2224g {
    SparseArray<C5657d> f7329a = new SparseArray();
    ThreadPoolExecutor f7330b;
    int f7331c = 0;
    private final String f7332d = "Network";
    private int f7333e;

    C2224g(int i) {
        this.f7330b = C2175b.m5967a(i, "Network");
        this.f7333e = i;
    }

    final synchronized void m6097a() {
        SparseArray sparseArray = new SparseArray();
        int size = this.f7329a.size();
        for (int i = 0; i < size; i++) {
            int keyAt = this.f7329a.keyAt(i);
            C5657d c5657d = (C5657d) this.f7329a.get(keyAt);
            if (c5657d.m12500b()) {
                sparseArray.put(keyAt, c5657d);
            }
        }
        this.f7329a = sparseArray;
    }

    public final synchronized boolean m6098a(int i) {
        if (m6099b() > 0) {
            C2182d.m5984d(this, "Can't change the max network thread count, because the  network thread pool isn't in IDLE, please try again after all running tasks are completed or invoking FileDownloader#pauseAll directly.", new Object[0]);
            return false;
        }
        i = C2184e.m5987a(i);
        if (C2182d.f7249a) {
            C2182d.m5983c(this, "change the max network thread count, from %d to %d", Integer.valueOf(this.f7333e), Integer.valueOf(i));
        }
        List shutdownNow = this.f7330b.shutdownNow();
        this.f7330b = C2175b.m5967a(i, "Network");
        if (shutdownNow.size() > 0) {
            C2182d.m5984d(this, "recreate the network thread pool and discard %d tasks", Integer.valueOf(shutdownNow.size()));
        }
        this.f7333e = i;
        return true;
    }

    public final synchronized int m6099b() {
        m6097a();
        return this.f7329a.size();
    }

    public final synchronized List<Integer> m6100c() {
        List<Integer> arrayList;
        m6097a();
        arrayList = new ArrayList();
        for (int i = 0; i < this.f7329a.size(); i++) {
            arrayList.add(Integer.valueOf(((C5657d) this.f7329a.get(this.f7329a.keyAt(i))).f15535b.f7290a));
        }
        return arrayList;
    }
}
