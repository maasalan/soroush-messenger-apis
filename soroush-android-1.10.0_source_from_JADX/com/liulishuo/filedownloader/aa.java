package com.liulishuo.filedownloader;

import android.os.Handler;
import android.util.SparseArray;
import java.util.List;

final class aa implements C2228v {
    private final SparseArray<Handler> f15507a = new SparseArray();

    aa() {
    }

    public final void mo1833a() {
        for (int i = 0; i < this.f15507a.size(); i++) {
            ((Handler) this.f15507a.get(this.f15507a.keyAt(i))).sendEmptyMessage(2);
        }
    }

    public final void mo1834a(List<Integer> list) {
        for (Integer intValue : list) {
            ((Handler) this.f15507a.get(intValue.intValue())).sendEmptyMessage(3);
        }
    }

    public final boolean mo1835a(int i) {
        return this.f15507a.get(i) != null;
    }

    public final int mo1836b() {
        return this.f15507a.size();
    }
}
