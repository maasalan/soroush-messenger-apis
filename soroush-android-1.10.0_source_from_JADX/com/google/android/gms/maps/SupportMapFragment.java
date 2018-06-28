package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.maps.model.C1877e;
import com.google.android.gms.maps.p162a.C1852c;
import com.google.android.gms.maps.p162a.C1856k;
import com.google.android.gms.maps.p162a.C5511d;
import com.google.android.gms.p158a.C1644a;
import com.google.android.gms.p158a.C1646c;
import com.google.android.gms.p158a.C1649n;
import com.google.android.gms.p158a.C6566m;
import java.util.ArrayList;
import java.util.List;

public class SupportMapFragment extends Fragment {
    private final C5510b f18702a = new C5510b(this);

    static class C5510b extends C1646c<C6584a> {
        final List<C1864e> f15303d = new ArrayList();
        private final Fragment f15304e;
        private C1649n<C6584a> f15305f;
        private Activity f15306g;

        C5510b(Fragment fragment) {
            this.f15304e = fragment;
        }

        static /* synthetic */ void m12043a(C5510b c5510b, Activity activity) {
            c5510b.f15306g = activity;
            c5510b.m12044c();
        }

        private final void m12044c() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r4 = this;
            r0 = r4.f15306g;
            if (r0 == 0) goto L_0x0057;
        L_0x0004:
            r0 = r4.f15305f;
            if (r0 == 0) goto L_0x0057;
        L_0x0008:
            r0 = r4.f5103a;
            if (r0 != 0) goto L_0x0057;
        L_0x000c:
            r0 = r4.f15306g;	 Catch:{ RemoteException -> 0x0050, c -> 0x0057 }
            com.google.android.gms.maps.C1863d.m5214a(r0);	 Catch:{ RemoteException -> 0x0050, c -> 0x0057 }
            r0 = r4.f15306g;	 Catch:{ RemoteException -> 0x0050, c -> 0x0057 }
            r0 = com.google.android.gms.maps.p162a.C1857l.m5198a(r0);	 Catch:{ RemoteException -> 0x0050, c -> 0x0057 }
            r1 = r4.f15306g;	 Catch:{ RemoteException -> 0x0050, c -> 0x0057 }
            r1 = com.google.android.gms.p158a.C6566m.m15848a(r1);	 Catch:{ RemoteException -> 0x0050, c -> 0x0057 }
            r0 = r0.mo1677a(r1);	 Catch:{ RemoteException -> 0x0050, c -> 0x0057 }
            if (r0 != 0) goto L_0x0024;	 Catch:{ RemoteException -> 0x0050, c -> 0x0057 }
        L_0x0023:
            return;	 Catch:{ RemoteException -> 0x0050, c -> 0x0057 }
        L_0x0024:
            r1 = r4.f15305f;	 Catch:{ RemoteException -> 0x0050, c -> 0x0057 }
            r2 = new com.google.android.gms.maps.SupportMapFragment$a;	 Catch:{ RemoteException -> 0x0050, c -> 0x0057 }
            r3 = r4.f15304e;	 Catch:{ RemoteException -> 0x0050, c -> 0x0057 }
            r2.<init>(r3, r0);	 Catch:{ RemoteException -> 0x0050, c -> 0x0057 }
            r1.mo1529a(r2);	 Catch:{ RemoteException -> 0x0050, c -> 0x0057 }
            r0 = r4.f15303d;	 Catch:{ RemoteException -> 0x0050, c -> 0x0057 }
            r0 = r0.iterator();	 Catch:{ RemoteException -> 0x0050, c -> 0x0057 }
        L_0x0036:
            r1 = r0.hasNext();	 Catch:{ RemoteException -> 0x0050, c -> 0x0057 }
            if (r1 == 0) goto L_0x004a;	 Catch:{ RemoteException -> 0x0050, c -> 0x0057 }
        L_0x003c:
            r1 = r0.next();	 Catch:{ RemoteException -> 0x0050, c -> 0x0057 }
            r1 = (com.google.android.gms.maps.C1864e) r1;	 Catch:{ RemoteException -> 0x0050, c -> 0x0057 }
            r2 = r4.f5103a;	 Catch:{ RemoteException -> 0x0050, c -> 0x0057 }
            r2 = (com.google.android.gms.maps.SupportMapFragment.C6584a) r2;	 Catch:{ RemoteException -> 0x0050, c -> 0x0057 }
            r2.m16857a(r1);	 Catch:{ RemoteException -> 0x0050, c -> 0x0057 }
            goto L_0x0036;	 Catch:{ RemoteException -> 0x0050, c -> 0x0057 }
        L_0x004a:
            r0 = r4.f15303d;	 Catch:{ RemoteException -> 0x0050, c -> 0x0057 }
            r0.clear();	 Catch:{ RemoteException -> 0x0050, c -> 0x0057 }
            return;
        L_0x0050:
            r0 = move-exception;
            r1 = new com.google.android.gms.maps.model.e;
            r1.<init>(r0);
            throw r1;
        L_0x0057:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.SupportMapFragment.b.c():void");
        }

        protected final void mo1674a(C1649n<C6584a> c1649n) {
            this.f15305f = c1649n;
            m12044c();
        }
    }

    static class C6584a implements C5511d {
        private final Fragment f18700a;
        private final C1852c f18701b;

        public C6584a(Fragment fragment, C1852c c1852c) {
            this.f18701b = (C1852c) ac.m4376a((Object) c1852c);
            this.f18700a = (Fragment) ac.m4376a((Object) fragment);
        }

        public final View mo3045a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C1856k.m5196a(bundle, bundle2);
                C1644a a = this.f18701b.mo1685a(C6566m.m15848a((Object) layoutInflater), C6566m.m15848a((Object) viewGroup), bundle2);
                C1856k.m5196a(bundle2, bundle);
                return (View) C6566m.m15849a(a);
            } catch (RemoteException e) {
                throw new C1877e(e);
            }
        }

        public final void mo3046a() {
            try {
                this.f18701b.mo1695f();
            } catch (RemoteException e) {
                throw new C1877e(e);
            }
        }

        public final void mo3047a(Activity activity, Bundle bundle, Bundle bundle2) {
            GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
            try {
                Bundle bundle3 = new Bundle();
                C1856k.m5196a(bundle2, bundle3);
                this.f18701b.mo1688a(C6566m.m15848a((Object) activity), googleMapOptions, bundle3);
                C1856k.m5196a(bundle3, bundle2);
            } catch (RemoteException e) {
                throw new C1877e(e);
            }
        }

        public final void mo3048a(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C1856k.m5196a(bundle, bundle2);
                Bundle bundle3 = this.f18700a.f13204p;
                if (bundle3 != null && bundle3.containsKey("MapOptions")) {
                    C1856k.m5197a(bundle2, "MapOptions", bundle3.getParcelable("MapOptions"));
                }
                this.f18701b.mo1687a(bundle2);
                C1856k.m5196a(bundle2, bundle);
            } catch (RemoteException e) {
                throw new C1877e(e);
            }
        }

        public final void m16857a(C1864e c1864e) {
            try {
                this.f18701b.mo1689a(new C6585h(c1864e));
            } catch (RemoteException e) {
                throw new C1877e(e);
            }
        }

        public final void mo3049b() {
            try {
                this.f18701b.mo1686a();
            } catch (RemoteException e) {
                throw new C1877e(e);
            }
        }

        public final void mo3050b(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C1856k.m5196a(bundle, bundle2);
                this.f18701b.mo1691b(bundle2);
                C1856k.m5196a(bundle2, bundle);
            } catch (RemoteException e) {
                throw new C1877e(e);
            }
        }

        public final void mo3051c() {
            try {
                this.f18701b.mo1690b();
            } catch (RemoteException e) {
                throw new C1877e(e);
            }
        }

        public final void mo3052d() {
            try {
                this.f18701b.mo1696g();
            } catch (RemoteException e) {
                throw new C1877e(e);
            }
        }

        public final void mo3053e() {
            try {
                this.f18701b.mo1692c();
            } catch (RemoteException e) {
                throw new C1877e(e);
            }
        }

        public final void mo3054f() {
            try {
                this.f18701b.mo1693d();
            } catch (RemoteException e) {
                throw new C1877e(e);
            }
        }

        public final void mo3055g() {
            try {
                this.f18701b.mo1694e();
            } catch (RemoteException e) {
                throw new C1877e(e);
            }
        }
    }

    public final View mo3056a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = this.f18702a.m4225a(layoutInflater, viewGroup, bundle);
        a.setClickable(true);
        return a;
    }

    public final void mo2480a() {
        C1646c c1646c = this.f18702a;
        if (c1646c.f5103a != null) {
            c1646c.f5103a.mo3051c();
        } else {
            c1646c.m4227a(5);
        }
        super.mo2480a();
    }

    public final void mo3057a(Activity activity) {
        super.mo3057a(activity);
        C5510b.m12043a(this.f18702a, activity);
    }

    public final void mo3058a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new Builder(threadPolicy).permitAll().build());
        try {
            super.mo3058a(activity, attributeSet, bundle);
            C5510b.m12043a(this.f18702a, activity);
            Parcelable a = GoogleMapOptions.m16852a(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", a);
            this.f18702a.m4228a(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void m16869a(C1864e c1864e) {
        ac.m4384b("getMapAsync must be called on the main thread.");
        C1646c c1646c = this.f18702a;
        if (c1646c.f5103a != null) {
            ((C6584a) c1646c.f5103a).m16857a(c1864e);
        } else {
            c1646c.f15303d.add(c1864e);
        }
    }

    public final void a_(Bundle bundle) {
        super.a_(bundle);
        this.f18702a.m4229a(bundle);
    }

    public final void mo2481b() {
        C1646c c1646c = this.f18702a;
        if (c1646c.f5103a != null) {
            c1646c.f5103a.mo3052d();
        } else {
            c1646c.m4227a(4);
        }
        super.mo2481b();
    }

    public final void mo2482c() {
        C1646c c1646c = this.f18702a;
        if (c1646c.f5103a != null) {
            c1646c.f5103a.mo3054f();
        } else {
            c1646c.m4227a(1);
        }
        super.mo2482c();
    }

    public final void mo2531c(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.mo2531c(bundle);
    }

    public final void mo2532d(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.mo2532d(bundle);
        C1646c c1646c = this.f18702a;
        if (c1646c.f5103a != null) {
            c1646c.f5103a.mo3050b(bundle);
            return;
        }
        if (c1646c.f5104b != null) {
            bundle.putAll(c1646c.f5104b);
        }
    }

    public final void mo3059e(Bundle bundle) {
        super.mo3059e(bundle);
    }

    public final void mo2535g() {
        super.mo2535g();
        this.f18702a.m4226a();
    }

    public final void mo2536h() {
        C1646c c1646c = this.f18702a;
        if (c1646c.f5103a != null) {
            c1646c.f5103a.mo3053e();
        } else {
            c1646c.m4227a(2);
        }
        super.mo2536h();
    }

    public void onLowMemory() {
        C1646c c1646c = this.f18702a;
        if (c1646c.f5103a != null) {
            c1646c.f5103a.mo3055g();
        }
        super.onLowMemory();
    }

    public final void mo3060v() {
        super.mo3060v();
        this.f18702a.m4231b();
    }
}
