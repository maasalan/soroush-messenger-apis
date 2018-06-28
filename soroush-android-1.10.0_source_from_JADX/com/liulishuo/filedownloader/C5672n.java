package com.liulishuo.filedownloader;

import android.content.Context;
import android.content.Intent;
import com.liulishuo.filedownloader.C5666f.C2169a;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.p201d.C5659b;
import com.liulishuo.filedownloader.p201d.C5659b.C2161a;
import com.liulishuo.filedownloader.p205h.C2173a;
import com.liulishuo.filedownloader.services.C6611e;
import com.liulishuo.filedownloader.services.C6611e.C2223a;
import com.liulishuo.filedownloader.services.FileDownloadService.SharedMainProcessService;
import java.util.ArrayList;
import java.util.List;

final class C5672n implements C2223a, C2226t {
    private static final Class<?> f15597a = SharedMainProcessService.class;
    private final ArrayList<Runnable> f15598b = new ArrayList();
    private C6611e f15599c;

    C5672n() {
    }

    public final void mo1960a() {
        this.f15599c = null;
        C2169a.f7242a.m5935b(new C5659b(C2161a.f7228b, f15597a));
    }

    public final void mo1955a(Context context) {
        context.startService(new Intent(context, f15597a));
    }

    public final void mo1961a(C6611e c6611e) {
        this.f15599c = c6611e;
        List<Runnable> list = (List) this.f15598b.clone();
        this.f15598b.clear();
        for (Runnable run : list) {
            run.run();
        }
        C2169a.f7242a.m5935b(new C5659b(C2161a.f7227a, f15597a));
    }

    public final boolean mo1956a(int i) {
        return !mo1959b() ? C2173a.m5964a(i) : this.f15599c.mo1926a(i);
    }

    public final boolean mo1957a(String str, String str2, boolean z, int i, int i2, int i3, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) {
        if (!mo1959b()) {
            return C2173a.m5965a(str, str2, z);
        }
        this.f15599c.mo1924a(str, str2, z, i, i2, i3, z2, fileDownloadHeader, z3);
        return true;
    }

    public final byte mo1958b(int i) {
        return !mo1959b() ? C2173a.m5966b(i) : this.f15599c.mo1934e(i);
    }

    public final boolean mo1959b() {
        return this.f15599c != null;
    }
}
