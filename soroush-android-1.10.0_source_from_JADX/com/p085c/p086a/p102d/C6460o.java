package com.p085c.p086a.p102d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.util.Log;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C5284j;
import java.util.HashSet;

public final class C6460o extends Fragment {
    final C5256a f17618a;
    final C1221m f17619b;
    C5284j f17620c;
    Fragment f17621d;
    private final HashSet<C6460o> f17622e;
    private C6460o f17623f;

    private class C5263a implements C1221m {
        final /* synthetic */ C6460o f14606a;

        C5263a(C6460o c6460o) {
            this.f14606a = c6460o;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(super.toString());
            stringBuilder.append("{fragment=");
            stringBuilder.append(this.f14606a);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }

    public C6460o() {
        this(new C5256a());
    }

    @SuppressLint({"ValidFragment"})
    private C6460o(C5256a c5256a) {
        this.f17619b = new C5263a(this);
        this.f17622e = new HashSet();
        this.f17618a = c5256a;
    }

    private void m15393e() {
        if (this.f17623f != null) {
            this.f17623f.f17622e.remove(this);
            this.f17623f = null;
        }
    }

    public final void mo2528a(Context context) {
        super.mo2528a(context);
        try {
            context = m8911k();
            m15393e();
            this.f17623f = C1212c.m2871a(context).f3835f.m2891a(context.m19188c());
            if (this.f17623f != this) {
                this.f17623f.f17622e.add(this);
            }
        } catch (Throwable e) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    public final void mo2481b() {
        super.mo2481b();
        this.f17618a.m10880b();
    }

    public final void mo2482c() {
        super.mo2482c();
        this.f17618a.m10882c();
        m15393e();
    }

    public final void mo2534f() {
        super.mo2534f();
        this.f17621d = null;
        m15393e();
    }

    public final void mo2535g() {
        super.mo2535g();
        this.f17618a.m10878a();
    }

    public final void onLowMemory() {
        super.onLowMemory();
        if (this.f17620c != null) {
            this.f17620c.m10951a();
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("{parent=");
        Object obj = this.f13177E;
        if (obj == null) {
            obj = this.f17621d;
        }
        stringBuilder.append(obj);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
