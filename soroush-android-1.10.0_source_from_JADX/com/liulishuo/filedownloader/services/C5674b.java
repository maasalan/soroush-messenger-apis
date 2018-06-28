package com.liulishuo.filedownloader.services;

import com.liulishuo.filedownloader.p205h.C2181c.C2179d;
import com.liulishuo.filedownloader.p205h.C2185f;

public final class C5674b implements C2179d {
    public final int mo1962a(String str, String str2, boolean z) {
        return mo1963b(str, str2, z);
    }

    public final int mo1963b(String str, String str2, boolean z) {
        String str3;
        Object[] objArr;
        if (z) {
            str3 = "%sp%s@dir";
            objArr = new Object[]{str, str2};
        } else {
            str3 = "%sp%s";
            objArr = new Object[]{str, str2};
        }
        return C2185f.m6012c(C2185f.m5996a(str3, objArr)).hashCode();
    }
}
