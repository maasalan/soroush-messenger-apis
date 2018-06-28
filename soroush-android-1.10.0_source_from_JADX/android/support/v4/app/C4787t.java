package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.app.C0417s.C0416a;
import android.support.v4.p029a.C0350e;
import android.support.v4.p029a.C0350e.C0348b;
import android.support.v4.p029a.C0350e.C0349c;
import android.support.v4.p038g.C0466d;
import android.support.v4.p038g.C0483n;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

final class C4787t extends C0417s {
    static boolean f13338a = false;
    final C0483n<C4786a> f13339b = new C0483n();
    final C0483n<C4786a> f13340c = new C0483n();
    final String f13341d;
    boolean f13342e;
    boolean f13343f;
    boolean f13344g;
    C4778j f13345h;

    final class C4786a implements C0348b<Object>, C0349c<Object> {
        final int f13323a;
        final Bundle f13324b;
        C0416a<Object> f13325c;
        C0350e<Object> f13326d;
        boolean f13327e;
        boolean f13328f;
        Object f13329g;
        boolean f13330h;
        boolean f13331i;
        boolean f13332j;
        boolean f13333k;
        boolean f13334l;
        boolean f13335m;
        C4786a f13336n;
        final /* synthetic */ C4787t f13337o;

        public C4786a(C4787t c4787t, int i, Bundle bundle, C0416a<Object> c0416a) {
            this.f13337o = c4787t;
            this.f13323a = i;
            this.f13324b = bundle;
            this.f13325c = c0416a;
        }

        final void m9107a() {
            if (this.f13331i && this.f13332j) {
                this.f13330h = true;
            } else if (!this.f13330h) {
                this.f13330h = true;
                if (C4787t.f13338a) {
                    StringBuilder stringBuilder = new StringBuilder("  Starting: ");
                    stringBuilder.append(this);
                    Log.v("LoaderManager", stringBuilder.toString());
                }
                if (this.f13326d == null && this.f13325c != null) {
                    this.f13326d = this.f13325c.mo2226a(this.f13323a, this.f13324b);
                }
                if (this.f13326d != null) {
                    if (!this.f13326d.getClass().isMemberClass() || Modifier.isStatic(this.f13326d.getClass().getModifiers())) {
                        if (!this.f13335m) {
                            this.f13326d.m690a(this.f13323a, this);
                            C0350e c0350e = this.f13326d;
                            if (c0350e.f1303p != null) {
                                throw new IllegalStateException("There is already a listener registered");
                            }
                            c0350e.f1303p = this;
                            this.f13335m = true;
                        }
                        this.f13326d.m700j();
                    } else {
                        StringBuilder stringBuilder2 = new StringBuilder("Object returned from onCreateLoader must not be a non-static inner member class: ");
                        stringBuilder2.append(this.f13326d);
                        throw new IllegalArgumentException(stringBuilder2.toString());
                    }
                }
            }
        }

        public final void mo265a(C0350e<Object> c0350e, Object obj) {
            if (C4787t.f13338a) {
                StringBuilder stringBuilder = new StringBuilder("onLoadComplete: ");
                stringBuilder.append(this);
                Log.v("LoaderManager", stringBuilder.toString());
            }
            if (this.f13334l) {
                if (C4787t.f13338a) {
                    Log.v("LoaderManager", "  Ignoring load complete -- destroyed");
                }
            } else if (this.f13337o.f13339b.m1025a(this.f13323a) != this) {
                if (C4787t.f13338a) {
                    Log.v("LoaderManager", "  Ignoring load complete -- not active");
                }
            } else {
                C4786a c4786a = this.f13336n;
                if (c4786a != null) {
                    if (C4787t.f13338a) {
                        StringBuilder stringBuilder2 = new StringBuilder("  Switching to pending loader: ");
                        stringBuilder2.append(c4786a);
                        Log.v("LoaderManager", stringBuilder2.toString());
                    }
                    this.f13336n = null;
                    this.f13337o.f13339b.m1026a(this.f13323a, null);
                    m9112c();
                    this.f13337o.m9119a(c4786a);
                    return;
                }
                if (!(this.f13329g == obj && this.f13327e)) {
                    this.f13329g = obj;
                    this.f13327e = true;
                    if (this.f13330h) {
                        m9111b(c0350e, obj);
                    }
                }
                C4786a c4786a2 = (C4786a) this.f13337o.f13340c.m1025a(this.f13323a);
                if (!(c4786a2 == null || c4786a2 == this)) {
                    c4786a2.f13328f = false;
                    c4786a2.m9112c();
                    this.f13337o.f13340c.m1028b(this.f13323a);
                }
                if (!(this.f13337o.f13345h == null || this.f13337o.mo271b())) {
                    this.f13337o.f13345h.f13264f.m9070g();
                }
            }
        }

        public final void m9109a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            C4786a c4786a = this;
            while (true) {
                printWriter.print(str);
                printWriter.print("mId=");
                printWriter.print(c4786a.f13323a);
                printWriter.print(" mArgs=");
                printWriter.println(c4786a.f13324b);
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(c4786a.f13325c);
                printWriter.print(str);
                printWriter.print("mLoader=");
                printWriter.println(c4786a.f13326d);
                if (c4786a.f13326d != null) {
                    C0350e c0350e = c4786a.f13326d;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append("  ");
                    c0350e.mo218a(stringBuilder.toString(), fileDescriptor, printWriter, strArr);
                }
                if (c4786a.f13327e || c4786a.f13328f) {
                    printWriter.print(str);
                    printWriter.print("mHaveData=");
                    printWriter.print(c4786a.f13327e);
                    printWriter.print("  mDeliveredData=");
                    printWriter.println(c4786a.f13328f);
                    printWriter.print(str);
                    printWriter.print("mData=");
                    printWriter.println(c4786a.f13329g);
                }
                printWriter.print(str);
                printWriter.print("mStarted=");
                printWriter.print(c4786a.f13330h);
                printWriter.print(" mReportNextStart=");
                printWriter.print(c4786a.f13333k);
                printWriter.print(" mDestroyed=");
                printWriter.println(c4786a.f13334l);
                printWriter.print(str);
                printWriter.print("mRetaining=");
                printWriter.print(c4786a.f13331i);
                printWriter.print(" mRetainingStarted=");
                printWriter.print(c4786a.f13332j);
                printWriter.print(" mListenerRegistered=");
                printWriter.println(c4786a.f13335m);
                if (c4786a.f13336n != null) {
                    printWriter.print(str);
                    printWriter.println("Pending Loader ");
                    printWriter.print(c4786a.f13336n);
                    printWriter.println(":");
                    c4786a = c4786a.f13336n;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(str);
                    stringBuilder2.append("  ");
                    str = stringBuilder2.toString();
                } else {
                    return;
                }
            }
        }

        final void m9110b() {
            if (C4787t.f13338a) {
                StringBuilder stringBuilder = new StringBuilder("  Stopping: ");
                stringBuilder.append(this);
                Log.v("LoaderManager", stringBuilder.toString());
            }
            this.f13330h = false;
            if (!this.f13331i && this.f13326d != null && this.f13335m) {
                this.f13335m = false;
                this.f13326d.m692a((C0349c) this);
                this.f13326d.m691a((C0348b) this);
                this.f13326d.m701k();
            }
        }

        final void m9111b(C0350e<Object> c0350e, Object obj) {
            if (this.f13325c != null) {
                String str = null;
                if (this.f13337o.f13345h != null) {
                    str = this.f13337o.f13345h.f13264f.f13309u;
                    this.f13337o.f13345h.f13264f.f13309u = "onLoadFinished";
                }
                try {
                    if (C4787t.f13338a) {
                        StringBuilder stringBuilder = new StringBuilder("  onLoadFinished in ");
                        stringBuilder.append(c0350e);
                        stringBuilder.append(": ");
                        StringBuilder stringBuilder2 = new StringBuilder(64);
                        C0466d.m980a(obj, stringBuilder2);
                        stringBuilder2.append("}");
                        stringBuilder.append(stringBuilder2.toString());
                        Log.v("LoaderManager", stringBuilder.toString());
                    }
                    this.f13325c.mo2228a((C0350e) c0350e, obj);
                    this.f13328f = true;
                } finally {
                    if (this.f13337o.f13345h != null) {
                        this.f13337o.f13345h.f13264f.f13309u = str;
                    }
                }
            }
        }

        final void m9112c() {
            String str;
            C0348b c0348b = this;
            while (true) {
                if (C4787t.f13338a) {
                    StringBuilder stringBuilder = new StringBuilder("  Destroying: ");
                    stringBuilder.append(c0348b);
                    Log.v("LoaderManager", stringBuilder.toString());
                }
                c0348b.f13334l = true;
                boolean z = c0348b.f13328f;
                c0348b.f13328f = false;
                if (c0348b.f13325c != null && c0348b.f13326d != null && c0348b.f13327e && z) {
                    if (C4787t.f13338a) {
                        StringBuilder stringBuilder2 = new StringBuilder("  Resetting: ");
                        stringBuilder2.append(c0348b);
                        Log.v("LoaderManager", stringBuilder2.toString());
                    }
                    if (c0348b.f13337o.f13345h != null) {
                        str = c0348b.f13337o.f13345h.f13264f.f13309u;
                        c0348b.f13337o.f13345h.f13264f.f13309u = "onLoaderReset";
                    } else {
                        str = null;
                    }
                    try {
                        c0348b.f13325c.mo2227a();
                    } finally {
                        if (c0348b.f13337o.f13345h != null) {
                            c0348b = c0348b.f13337o.f13345h.f13264f;
                            c0348b.f13309u = str;
                        }
                    }
                }
                c0348b.f13325c = null;
                c0348b.f13329g = null;
                c0348b.f13327e = false;
                if (c0348b.f13326d != null) {
                    if (c0348b.f13335m) {
                        c0348b.f13335m = false;
                        c0348b.f13326d.m692a((C0349c) c0348b);
                        c0348b.f13326d.m691a(c0348b);
                    }
                    c0348b.f13326d.m702l();
                }
                if (c0348b.f13336n != null) {
                    c0348b = c0348b.f13336n;
                } else {
                    return;
                }
            }
        }

        public final void mo266d() {
            if (C4787t.f13338a) {
                StringBuilder stringBuilder = new StringBuilder("onLoadCanceled: ");
                stringBuilder.append(this);
                Log.v("LoaderManager", stringBuilder.toString());
            }
            if (this.f13334l) {
                if (C4787t.f13338a) {
                    Log.v("LoaderManager", "  Ignoring load canceled -- destroyed");
                }
            } else if (this.f13337o.f13339b.m1025a(this.f13323a) != this) {
                if (C4787t.f13338a) {
                    Log.v("LoaderManager", "  Ignoring load canceled -- not active");
                }
            } else {
                C4786a c4786a = this.f13336n;
                if (c4786a != null) {
                    if (C4787t.f13338a) {
                        StringBuilder stringBuilder2 = new StringBuilder("  Switching to pending loader: ");
                        stringBuilder2.append(c4786a);
                        Log.v("LoaderManager", stringBuilder2.toString());
                    }
                    this.f13336n = null;
                    this.f13337o.f13339b.m1026a(this.f13323a, null);
                    m9112c();
                    this.f13337o.m9119a(c4786a);
                }
            }
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("LoaderInfo{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" #");
            stringBuilder.append(this.f13323a);
            stringBuilder.append(" : ");
            C0466d.m980a(this.f13326d, stringBuilder);
            stringBuilder.append("}}");
            return stringBuilder.toString();
        }
    }

    C4787t(String str, C4778j c4778j, boolean z) {
        this.f13341d = str;
        this.f13345h = c4778j;
        this.f13342e = z;
    }

    private C4786a m9114c(int i, Bundle bundle, C0416a<Object> c0416a) {
        C4786a c4786a = new C4786a(this, i, bundle, c0416a);
        c4786a.f13326d = c0416a.mo2226a(i, bundle);
        return c4786a;
    }

    private C4786a m9115d(int i, Bundle bundle, C0416a<Object> c0416a) {
        try {
            this.f13344g = true;
            C4786a c = m9114c(i, bundle, c0416a);
            m9119a(c);
            return c;
        } finally {
            this.f13344g = false;
        }
    }

    public final <D> C0350e<D> mo267a() {
        if (this.f13344g) {
            throw new IllegalStateException("Called while creating a loader");
        }
        C4786a c4786a = (C4786a) this.f13339b.m1025a(19);
        return c4786a != null ? c4786a.f13336n != null ? c4786a.f13336n.f13326d : c4786a.f13326d : null;
    }

    public final <D> C0350e<D> mo268a(int i, Bundle bundle, C0416a<D> c0416a) {
        if (this.f13344g) {
            throw new IllegalStateException("Called while creating a loader");
        }
        C4786a c4786a = (C4786a) this.f13339b.m1025a(i);
        if (f13338a) {
            StringBuilder stringBuilder = new StringBuilder("initLoader in ");
            stringBuilder.append(this);
            stringBuilder.append(": args=");
            stringBuilder.append(bundle);
            Log.v("LoaderManager", stringBuilder.toString());
        }
        StringBuilder stringBuilder2;
        if (c4786a == null) {
            c4786a = m9115d(i, bundle, c0416a);
            if (f13338a) {
                stringBuilder2 = new StringBuilder("  Created new loader ");
                stringBuilder2.append(c4786a);
                Log.v("LoaderManager", stringBuilder2.toString());
            }
        } else {
            if (f13338a) {
                stringBuilder2 = new StringBuilder("  Re-using existing loader ");
                stringBuilder2.append(c4786a);
                Log.v("LoaderManager", stringBuilder2.toString());
            }
            c4786a.f13325c = c0416a;
        }
        if (c4786a.f13327e && this.f13342e) {
            c4786a.m9111b(c4786a.f13326d, c4786a.f13329g);
        }
        return c4786a.f13326d;
    }

    public final void mo269a(int i) {
        if (this.f13344g) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (f13338a) {
            StringBuilder stringBuilder = new StringBuilder("destroyLoader in ");
            stringBuilder.append(this);
            stringBuilder.append(" of ");
            stringBuilder.append(i);
            Log.v("LoaderManager", stringBuilder.toString());
        }
        int f = this.f13339b.m1033f(i);
        if (f >= 0) {
            C4786a c4786a = (C4786a) this.f13339b.m1032e(f);
            this.f13339b.m1030c(f);
            c4786a.m9112c();
        }
        i = this.f13340c.m1033f(i);
        if (i >= 0) {
            C4786a c4786a2 = (C4786a) this.f13340c.m1032e(i);
            this.f13340c.m1030c(i);
            c4786a2.m9112c();
        }
        if (this.f13345h != null && !mo271b()) {
            this.f13345h.f13264f.m9070g();
        }
    }

    final void m9119a(C4786a c4786a) {
        this.f13339b.m1026a(c4786a.f13323a, c4786a);
        if (this.f13342e) {
            c4786a.m9107a();
        }
    }

    public final void m9120a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String stringBuilder;
        int i = 0;
        if (this.f13339b.m1024a() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("    ");
            stringBuilder = stringBuilder2.toString();
            for (int i2 = 0; i2 < this.f13339b.m1024a(); i2++) {
                C4786a c4786a = (C4786a) this.f13339b.m1032e(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f13339b.m1031d(i2));
                printWriter.print(": ");
                printWriter.println(c4786a.toString());
                c4786a.m9109a(stringBuilder, fileDescriptor, printWriter, strArr);
            }
        }
        if (this.f13340c.m1024a() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("    ");
            stringBuilder = stringBuilder2.toString();
            while (i < this.f13340c.m1024a()) {
                C4786a c4786a2 = (C4786a) this.f13340c.m1032e(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f13340c.m1031d(i));
                printWriter.print(": ");
                printWriter.println(c4786a2.toString());
                c4786a2.m9109a(stringBuilder, fileDescriptor, printWriter, strArr);
                i++;
            }
        }
    }

    public final <D> C0350e<D> mo270b(int i, Bundle bundle, C0416a<D> c0416a) {
        if (this.f13344g) {
            throw new IllegalStateException("Called while creating a loader");
        }
        C4786a c4786a;
        C4786a c4786a2 = (C4786a) this.f13339b.m1025a(i);
        if (f13338a) {
            StringBuilder stringBuilder = new StringBuilder("restartLoader in ");
            stringBuilder.append(this);
            stringBuilder.append(": args=");
            stringBuilder.append(bundle);
            Log.v("LoaderManager", stringBuilder.toString());
        }
        if (c4786a2 != null) {
            C4786a c4786a3 = (C4786a) this.f13340c.m1025a(i);
            if (c4786a3 != null) {
                boolean z = false;
                if (c4786a2.f13327e) {
                    if (f13338a) {
                        StringBuilder stringBuilder2 = new StringBuilder("  Removing last inactive loader: ");
                        stringBuilder2.append(c4786a2);
                        Log.v("LoaderManager", stringBuilder2.toString());
                    }
                    c4786a3.f13328f = false;
                    c4786a3.m9112c();
                } else {
                    if (f13338a) {
                        stringBuilder = new StringBuilder("  Canceling: ");
                        stringBuilder.append(c4786a2);
                        Log.v("LoaderManager", stringBuilder.toString());
                    }
                    if (c4786a2.f13330h && c4786a2.f13326d != null && c4786a2.f13335m) {
                        z = c4786a2.f13326d.mo219b();
                        if (!z) {
                            c4786a2.mo266d();
                        }
                    }
                    if (z) {
                        if (f13338a) {
                            Log.v("LoaderManager", "  Current loader is running; configuring pending loader");
                        }
                        if (c4786a2.f13336n != null) {
                            if (f13338a) {
                                StringBuilder stringBuilder3 = new StringBuilder("  Removing pending loader: ");
                                stringBuilder3.append(c4786a2.f13336n);
                                Log.v("LoaderManager", stringBuilder3.toString());
                            }
                            c4786a2.f13336n.m9112c();
                            c4786a2.f13336n = null;
                        }
                        if (f13338a) {
                            Log.v("LoaderManager", "  Enqueuing as new pending loader");
                        }
                        c4786a2.f13336n = m9114c(i, bundle, c0416a);
                        c4786a = c4786a2.f13336n;
                        return c4786a.f13326d;
                    }
                    if (f13338a) {
                        Log.v("LoaderManager", "  Current loader is stopped; replacing");
                    }
                    this.f13339b.m1026a(i, null);
                    c4786a2.m9112c();
                }
            } else if (f13338a) {
                stringBuilder = new StringBuilder("  Making last loader inactive: ");
                stringBuilder.append(c4786a2);
                Log.v("LoaderManager", stringBuilder.toString());
            }
            c4786a2.f13326d.f1306s = true;
            this.f13340c.m1026a(i, c4786a2);
        }
        c4786a = m9115d(i, bundle, c0416a);
        return c4786a.f13326d;
    }

    public final boolean mo271b() {
        int a = this.f13339b.m1024a();
        int i = 0;
        boolean z = i;
        while (i < a) {
            C4786a c4786a = (C4786a) this.f13339b.m1032e(i);
            int i2 = (!c4786a.f13330h || c4786a.f13328f) ? 0 : 1;
            z |= i2;
            i++;
        }
        return z;
    }

    final void m9123c() {
        if (f13338a) {
            StringBuilder stringBuilder = new StringBuilder("Starting in ");
            stringBuilder.append(this);
            Log.v("LoaderManager", stringBuilder.toString());
        }
        if (this.f13342e) {
            Throwable runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            StringBuilder stringBuilder2 = new StringBuilder("Called doStart when already started: ");
            stringBuilder2.append(this);
            Log.w("LoaderManager", stringBuilder2.toString(), runtimeException);
            return;
        }
        this.f13342e = true;
        for (int a = this.f13339b.m1024a() - 1; a >= 0; a--) {
            ((C4786a) this.f13339b.m1032e(a)).m9107a();
        }
    }

    final void m9124d() {
        if (f13338a) {
            StringBuilder stringBuilder = new StringBuilder("Stopping in ");
            stringBuilder.append(this);
            Log.v("LoaderManager", stringBuilder.toString());
        }
        if (this.f13342e) {
            for (int a = this.f13339b.m1024a() - 1; a >= 0; a--) {
                ((C4786a) this.f13339b.m1032e(a)).m9110b();
            }
            this.f13342e = false;
            return;
        }
        Throwable runtimeException = new RuntimeException("here");
        runtimeException.fillInStackTrace();
        StringBuilder stringBuilder2 = new StringBuilder("Called doStop when not started: ");
        stringBuilder2.append(this);
        Log.w("LoaderManager", stringBuilder2.toString(), runtimeException);
    }

    final void m9125e() {
        if (f13338a) {
            StringBuilder stringBuilder = new StringBuilder("Retaining in ");
            stringBuilder.append(this);
            Log.v("LoaderManager", stringBuilder.toString());
        }
        if (this.f13342e) {
            this.f13343f = true;
            this.f13342e = false;
            for (int a = this.f13339b.m1024a() - 1; a >= 0; a--) {
                C4786a c4786a = (C4786a) this.f13339b.m1032e(a);
                if (f13338a) {
                    StringBuilder stringBuilder2 = new StringBuilder("  Retaining: ");
                    stringBuilder2.append(c4786a);
                    Log.v("LoaderManager", stringBuilder2.toString());
                }
                c4786a.f13331i = true;
                c4786a.f13332j = c4786a.f13330h;
                c4786a.f13330h = false;
                c4786a.f13325c = null;
            }
            return;
        }
        Throwable runtimeException = new RuntimeException("here");
        runtimeException.fillInStackTrace();
        StringBuilder stringBuilder3 = new StringBuilder("Called doRetain when not started: ");
        stringBuilder3.append(this);
        Log.w("LoaderManager", stringBuilder3.toString(), runtimeException);
    }

    final void m9126f() {
        for (int a = this.f13339b.m1024a() - 1; a >= 0; a--) {
            ((C4786a) this.f13339b.m1032e(a)).f13333k = true;
        }
    }

    final void m9127g() {
        for (int a = this.f13339b.m1024a() - 1; a >= 0; a--) {
            C4786a c4786a = (C4786a) this.f13339b.m1032e(a);
            if (c4786a.f13330h && c4786a.f13333k) {
                c4786a.f13333k = false;
                if (c4786a.f13327e && !c4786a.f13331i) {
                    c4786a.m9111b(c4786a.f13326d, c4786a.f13329g);
                }
            }
        }
    }

    final void m9128h() {
        int a;
        if (!this.f13343f) {
            if (f13338a) {
                StringBuilder stringBuilder = new StringBuilder("Destroying Active in ");
                stringBuilder.append(this);
                Log.v("LoaderManager", stringBuilder.toString());
            }
            for (a = this.f13339b.m1024a() - 1; a >= 0; a--) {
                ((C4786a) this.f13339b.m1032e(a)).m9112c();
            }
            this.f13339b.m1027b();
        }
        if (f13338a) {
            stringBuilder = new StringBuilder("Destroying Inactive in ");
            stringBuilder.append(this);
            Log.v("LoaderManager", stringBuilder.toString());
        }
        for (a = this.f13340c.m1024a() - 1; a >= 0; a--) {
            ((C4786a) this.f13340c.m1032e(a)).m9112c();
        }
        this.f13340c.m1027b();
        this.f13345h = null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        C0466d.m980a(this.f13345h, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}
