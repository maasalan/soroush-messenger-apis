package com.p085c.p086a.p102d;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C5284j;
import java.util.HashSet;

public final class C1218k extends Fragment {
    final C5256a f3842a;
    final C1221m f3843b;
    C5284j f3844c;
    Fragment f3845d;
    private final HashSet<C1218k> f3846e;
    private C1218k f3847f;

    private class C5261a implements C1221m {
        final /* synthetic */ C1218k f14605a;

        C5261a(C1218k c1218k) {
            this.f14605a = c1218k;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(super.toString());
            stringBuilder.append("{fragment=");
            stringBuilder.append(this.f14605a);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }

    public C1218k() {
        this(new C5256a());
    }

    @SuppressLint({"ValidFragment"})
    private C1218k(C5256a c5256a) {
        this.f3843b = new C5261a(this);
        this.f3846e = new HashSet();
        this.f3842a = c5256a;
    }

    private void m2886a() {
        if (this.f3847f != null) {
            this.f3847f.f3846e.remove(this);
            this.f3847f = null;
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m2886a();
            this.f3847f = C1212c.m2871a((Context) activity).f3835f.m2890a(activity.getFragmentManager());
            if (this.f3847f != this) {
                this.f3847f.f3846e.add(this);
            }
        } catch (Throwable e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f3842a.m10882c();
        m2886a();
    }

    public final void onDetach() {
        super.onDetach();
        m2886a();
    }

    public final void onLowMemory() {
        super.onLowMemory();
        if (this.f3844c != null) {
            this.f3844c.m10951a();
        }
    }

    public final void onStart() {
        super.onStart();
        this.f3842a.m10878a();
    }

    public final void onStop() {
        super.onStop();
        this.f3842a.m10880b();
    }

    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (this.f3844c != null) {
            this.f3844c.m10952a(i);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("{parent=");
        Object parentFragment = VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        if (parentFragment == null) {
            parentFragment = this.f3845d;
        }
        stringBuilder.append(parentFragment);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
