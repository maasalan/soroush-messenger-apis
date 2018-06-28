package com.google.android.gms.p158a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

final class C5429g implements C1648k {
    private /* synthetic */ FrameLayout f15079a;
    private /* synthetic */ LayoutInflater f15080b;
    private /* synthetic */ ViewGroup f15081c;
    private /* synthetic */ Bundle f15082d;
    private /* synthetic */ C1646c f15083e;

    C5429g(C1646c c1646c, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f15083e = c1646c;
        this.f15079a = frameLayout;
        this.f15080b = layoutInflater;
        this.f15081c = viewGroup;
        this.f15082d = bundle;
    }

    public final int mo1530a() {
        return 2;
    }

    public final void mo1531b() {
        this.f15079a.removeAllViews();
        this.f15079a.addView(this.f15083e.f5103a.mo3045a(this.f15080b, this.f15081c, this.f15082d));
    }
}
