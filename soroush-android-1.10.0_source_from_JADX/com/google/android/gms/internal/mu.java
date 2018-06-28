package com.google.android.gms.internal;

import com.google.android.gms.internal.mt.C1819a;
import java.lang.ref.WeakReference;

public class mu implements C1819a {
    private boolean f15295a = false;
    private WeakReference<C1819a> f15296b;
    protected mt f15297e;
    protected int f15298f = 0;

    protected mu(mt mtVar) {
        this.f15297e = mtVar;
        this.f15296b = new WeakReference(this);
    }

    protected final void m12014b() {
        if (!this.f15295a) {
            this.f15298f = this.f15297e.f6159b;
            mt mtVar = this.f15297e;
            WeakReference weakReference = this.f15296b;
            synchronized (mtVar.f6160c) {
                mtVar.f6160c.add(weakReference);
            }
            this.f15295a = true;
        }
    }

    public final void mo1663b(int i) {
        this.f15298f = i | this.f15298f;
    }

    protected final void m12016c() {
        if (this.f15295a) {
            mt mtVar = this.f15297e;
            WeakReference weakReference = this.f15296b;
            synchronized (mtVar.f6160c) {
                mtVar.f6160c.remove(weakReference);
            }
            this.f15295a = false;
        }
    }
}
