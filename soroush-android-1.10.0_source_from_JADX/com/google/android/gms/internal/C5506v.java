package com.google.android.gms.internal;

public abstract class C5506v extends C1825u {
    private boolean f15302a;

    protected C5506v(C1827x c1827x) {
        super(c1827x);
    }

    public abstract void c_();

    public final boolean m12036j() {
        return this.f15302a;
    }

    protected final void m12037k() {
        if (!m12036j()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void m12038l() {
        c_();
        this.f15302a = true;
    }
}
