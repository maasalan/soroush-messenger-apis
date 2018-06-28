package com.liulishuo.filedownloader;

import android.content.Context;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.p205h.C2184e;
import com.liulishuo.filedownloader.services.C6611e.C2223a;

public final class C5671m implements C2226t {
    private final C2226t f15594a;

    private static final class C2194a {
        private static final C5671m f7278a = new C5671m();
    }

    private C5671m() {
        this.f15594a = C2184e.m5988a().f7254d ? new C5672n() : new C6609o();
    }

    public static C2223a m12594a() {
        return C2194a.f7278a.f15594a instanceof C5672n ? (C2223a) C2194a.f7278a.f15594a : null;
    }

    public final void mo1955a(Context context) {
        this.f15594a.mo1955a(context);
    }

    public final boolean mo1956a(int i) {
        return this.f15594a.mo1956a(i);
    }

    public final boolean mo1957a(String str, String str2, boolean z, int i, int i2, int i3, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) {
        return this.f15594a.mo1957a(str, str2, z, i, i2, i3, z2, fileDownloadHeader, z3);
    }

    public final byte mo1958b(int i) {
        return this.f15594a.mo1958b(i);
    }

    public final boolean mo1959b() {
        return this.f15594a.mo1959b();
    }
}
