package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.C1715e;
import com.google.android.gms.common.api.C1717f;
import com.google.android.gms.common.api.C1717f.C1716a;
import com.google.android.gms.common.api.C1719h;
import com.google.android.gms.common.api.C1720i;
import com.google.android.gms.common.api.C1737j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1764o;
import com.google.android.gms.common.internal.ac;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public abstract class as<R extends C1720i> extends C1717f<R> {
    public static final ThreadLocal<Boolean> f15114a = new at();
    public boolean f15115b;
    private final Object f15116c;
    private au<R> f15117d;
    private WeakReference<C1715e> f15118e;
    private final CountDownLatch f15119f;
    private final ArrayList<C1716a> f15120g;
    private C1737j<? super R> f15121h;
    private final AtomicReference<Object> f15122i;
    private R f15123j;
    private Status f15124k;
    private av f15125l;
    private volatile boolean f15126m;
    private boolean f15127n;
    private boolean f15128o;
    private C1764o f15129p;

    @Deprecated
    as() {
        this.f15116c = new Object();
        this.f15119f = new CountDownLatch(1);
        this.f15120g = new ArrayList();
        this.f15122i = new AtomicReference();
        this.f15115b = false;
        this.f15117d = new au(Looper.getMainLooper());
        this.f15118e = new WeakReference(null);
    }

    @Deprecated
    protected as(Looper looper) {
        this.f15116c = new Object();
        this.f15119f = new CountDownLatch(1);
        this.f15120g = new ArrayList();
        this.f15122i = new AtomicReference();
        this.f15115b = false;
        this.f15117d = new au(looper);
        this.f15118e = new WeakReference(null);
    }

    protected as(C1715e c1715e) {
        this.f15116c = new Object();
        this.f15119f = new CountDownLatch(1);
        this.f15120g = new ArrayList();
        this.f15122i = new AtomicReference();
        this.f15115b = false;
        this.f15117d = new au(c1715e != null ? c1715e.mo3015a() : Looper.getMainLooper());
        this.f15118e = new WeakReference(c1715e);
    }

    private boolean m11765a() {
        return this.f15119f.getCount() == 0;
    }

    private final R m11766b() {
        R r;
        synchronized (this.f15116c) {
            ac.m4382a(this.f15126m ^ true, (Object) "Result has already been consumed.");
            ac.m4382a(m11765a(), (Object) "Result is not ready.");
            r = this.f15123j;
            this.f15123j = null;
            this.f15121h = null;
            this.f15126m = true;
        }
        this.f15122i.getAndSet(null);
        return r;
    }

    public static void m11767b(C1720i c1720i) {
        if (c1720i instanceof C1719h) {
            try {
                ((C1719h) c1720i).mo3016a();
            } catch (Throwable e) {
                String valueOf = String.valueOf(c1720i);
                StringBuilder stringBuilder = new StringBuilder(18 + String.valueOf(valueOf).length());
                stringBuilder.append("Unable to release ");
                stringBuilder.append(valueOf);
                Log.w("BasePendingResult", stringBuilder.toString(), e);
            }
        }
    }

    public abstract R mo3008a(Status status);

    public final void mo1547a(C1716a c1716a) {
        ac.m4386b(true, "Callback cannot be null.");
        synchronized (this.f15116c) {
            if (m11765a()) {
                c1716a.mo1548a();
            } else {
                this.f15120g.add(c1716a);
            }
        }
    }

    public final void m11770a(R r) {
        synchronized (this.f15116c) {
            if (this.f15128o || this.f15127n) {
                m11767b(r);
                return;
            }
            m11765a();
            ac.m4382a(m11765a() ^ true, (Object) "Results have already been set");
            ac.m4382a(this.f15126m ^ true, (Object) "Result has already been consumed");
            this.f15123j = r;
            this.f15129p = null;
            this.f15119f.countDown();
            this.f15124k = this.f15123j.mo3007a();
            int i = 0;
            if (this.f15127n) {
                this.f15121h = null;
            } else if (this.f15121h != null) {
                this.f15117d.removeMessages(2);
                au auVar = this.f15117d;
                auVar.sendMessage(auVar.obtainMessage(1, new Pair(this.f15121h, m11766b())));
            } else if (this.f15123j instanceof C1719h) {
                this.f15125l = new av();
            }
            ArrayList arrayList = this.f15120g;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((C1716a) obj).mo1548a();
            }
            this.f15120g.clear();
        }
    }

    public final void m11771c(Status status) {
        synchronized (this.f15116c) {
            if (!m11765a()) {
                m11770a(mo3008a(status));
                this.f15128o = true;
            }
        }
    }
}
