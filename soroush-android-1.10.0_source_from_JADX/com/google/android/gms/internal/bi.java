package com.google.android.gms.internal;

final class bi implements aw<bj> {
    private final C1827x f15192a;
    private final bj f15193b = new bj();

    public bi(C1827x c1827x) {
        this.f15192a = c1827x;
    }

    public final /* synthetic */ au mo1589a() {
        return this.f15193b;
    }

    public final void mo1590a(String str, int i) {
        if ("ga_dispatchPeriod".equals(str)) {
            this.f15193b.f15197d = i;
        } else {
            this.f15192a.m5160a().m5151d("Int xml configuration name not recognized", str);
        }
    }

    public final void mo1591a(String str, String str2) {
    }

    public final void mo1592a(String str, boolean z) {
        if ("ga_dryRun".equals(str)) {
            this.f15193b.f15198e = z;
        } else {
            this.f15192a.m5160a().m5151d("Bool xml configuration name not recognized", str);
        }
    }

    public final void mo1593b(String str, String str2) {
        if ("ga_appName".equals(str)) {
            this.f15193b.f15194a = str2;
        } else if ("ga_appVersion".equals(str)) {
            this.f15193b.f15195b = str2;
        } else if ("ga_logLevel".equals(str)) {
            this.f15193b.f15196c = str2;
        } else {
            this.f15192a.m5160a().m5151d("String xml configuration name not recognized", str);
        }
    }
}
