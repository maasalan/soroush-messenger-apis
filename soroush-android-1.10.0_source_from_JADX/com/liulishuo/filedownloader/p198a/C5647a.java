package com.liulishuo.filedownloader.p198a;

import com.liulishuo.filedownloader.p205h.C2181c.C2176a;

public final class C5647a implements C2176a {
    public final int mo1822a(long j) {
        return j < 1048576 ? 1 : j < 5242880 ? 2 : j < 52428800 ? 3 : j < 104857600 ? 4 : 5;
    }
}
