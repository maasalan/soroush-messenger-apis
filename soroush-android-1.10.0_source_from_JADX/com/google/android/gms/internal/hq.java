package com.google.android.gms.internal;

abstract class hq extends hp {
    private boolean f15246a;

    hq(gr grVar) {
        super(grVar);
        grVar = this.s;
        grVar.f5877k++;
    }

    final boolean m11974K() {
        return this.f15246a;
    }

    protected final void m11975L() {
        if (!m11974K()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void m11976M() {
        if (this.f15246a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo3036w()) {
            this.s.m4923w();
            this.f15246a = true;
        }
    }

    public final void m11977N() {
        if (this.f15246a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        d_();
        this.s.m4923w();
        this.f15246a = true;
    }

    protected void d_() {
    }

    protected abstract boolean mo3036w();
}
