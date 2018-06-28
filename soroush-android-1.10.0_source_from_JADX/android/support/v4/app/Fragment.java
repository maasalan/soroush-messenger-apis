package android.support.v4.app;

import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.C0093d;
import android.arch.lifecycle.C0093d.C0091a;
import android.arch.lifecycle.C0096g;
import android.arch.lifecycle.C4679h;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.p038g.C0466d;
import android.support.v4.p038g.C0482m;
import android.support.v4.view.C0557e;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;

public class Fragment implements C0096g, ComponentCallbacks, OnCreateContextMenuListener {
    private static final C0482m<String, Class<?>> f13171a = new C0482m();
    static final Object f13172j = new Object();
    C4783l f13173A;
    public C4778j f13174B;
    C4783l f13175C;
    C0400m f13176D;
    protected Fragment f13177E;
    int f13178F;
    int f13179G;
    public String f13180H;
    boolean f13181I;
    boolean f13182J;
    boolean f13183K;
    boolean f13184L;
    boolean f13185M;
    boolean f13186N = true;
    boolean f13187O;
    ViewGroup f13188P;
    protected View f13189Q;
    View f13190R;
    boolean f13191S;
    boolean f13192T = true;
    C4787t f13193U;
    boolean f13194V;
    boolean f13195W;
    C0364a f13196X;
    boolean f13197Y;
    boolean f13198Z;
    float aa;
    LayoutInflater ab;
    boolean ac;
    C4679h ad = new C4679h(this);
    int f13199k = 0;
    Bundle f13200l;
    SparseArray<Parcelable> f13201m;
    int f13202n = -1;
    String f13203o;
    public Bundle f13204p;
    Fragment f13205q;
    int f13206r = -1;
    int f13207s;
    boolean f13208t;
    boolean f13209u;
    boolean f13210v;
    boolean f13211w;
    boolean f13212x;
    boolean f13213y;
    int f13214z;

    class C03621 implements Runnable {
        final /* synthetic */ Fragment f1344a;

        C03621(Fragment fragment) {
            this.f1344a = fragment;
        }

        public final void run() {
            this.f1344a.m8919z();
        }
    }

    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new C03631();
        final Bundle f1345a;

        static class C03631 implements Creator<SavedState> {
            C03631() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Bundle bundle) {
            this.f1345a = bundle;
        }

        SavedState(Parcel parcel) {
            this.f1345a = parcel.readBundle();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f1345a);
        }
    }

    static class C0364a {
        View f1346a;
        Animator f1347b;
        int f1348c;
        int f1349d;
        int f1350e;
        int f1351f;
        Object f1352g = null;
        Object f1353h = Fragment.f13172j;
        Object f1354i = null;
        Object f1355j = Fragment.f13172j;
        Object f1356k = null;
        Object f1357l = Fragment.f13172j;
        Boolean f1358m;
        Boolean f1359n;
        ak f1360o = null;
        ak f1361p = null;
        boolean f1362q;
        C0366c f1363r;
        boolean f1364s;

        C0364a() {
        }
    }

    public static class C0365b extends RuntimeException {
        public C0365b(String str, Exception exception) {
            super(str, exception);
        }
    }

    interface C0366c {
        void mo248a();

        void mo249b();
    }

    class C47662 extends C0386h {
        final /* synthetic */ Fragment f13170a;

        C47662(Fragment fragment) {
            this.f13170a = fragment;
        }

        public final Fragment mo221a(Context context, String str, Bundle bundle) {
            return this.f13170a.f13174B.mo221a(context, str, bundle);
        }

        public final View mo222a(int i) {
            if (this.f13170a.f13189Q != null) {
                return this.f13170a.f13189Q.findViewById(i);
            }
            throw new IllegalStateException("Fragment does not have a view");
        }

        public final boolean mo223a() {
            return this.f13170a.f13189Q != null;
        }
    }

    public static Fragment m8850a(Context context, String str, Bundle bundle) {
        StringBuilder stringBuilder;
        try {
            Class cls = (Class) f13171a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f13171a.put(str, cls);
            }
            Fragment fragment = (Fragment) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.mo3059e(bundle);
            }
            return fragment;
        } catch (Exception e) {
            stringBuilder = new StringBuilder("Unable to instantiate fragment ");
            stringBuilder.append(str);
            stringBuilder.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new C0365b(stringBuilder.toString(), e);
        } catch (Exception e2) {
            stringBuilder = new StringBuilder("Unable to instantiate fragment ");
            stringBuilder.append(str);
            stringBuilder.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new C0365b(stringBuilder.toString(), e2);
        } catch (Exception e22) {
            stringBuilder = new StringBuilder("Unable to instantiate fragment ");
            stringBuilder.append(str);
            stringBuilder.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new C0365b(stringBuilder.toString(), e22);
        } catch (Exception e222) {
            stringBuilder = new StringBuilder("Unable to instantiate fragment ");
            stringBuilder.append(str);
            stringBuilder.append(": could not find Fragment constructor");
            throw new C0365b(stringBuilder.toString(), e222);
        } catch (Exception e2222) {
            stringBuilder = new StringBuilder("Unable to instantiate fragment ");
            stringBuilder.append(str);
            stringBuilder.append(": calling Fragment constructor caused an exception");
            throw new C0365b(stringBuilder.toString(), e2222);
        }
    }

    static boolean m8852a(android.content.Context r1, java.lang.String r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = f13171a;	 Catch:{ ClassNotFoundException -> 0x001e }
        r0 = r0.get(r2);	 Catch:{ ClassNotFoundException -> 0x001e }
        r0 = (java.lang.Class) r0;	 Catch:{ ClassNotFoundException -> 0x001e }
        if (r0 != 0) goto L_0x0017;	 Catch:{ ClassNotFoundException -> 0x001e }
    L_0x000a:
        r1 = r1.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x001e }
        r0 = r1.loadClass(r2);	 Catch:{ ClassNotFoundException -> 0x001e }
        r1 = f13171a;	 Catch:{ ClassNotFoundException -> 0x001e }
        r1.put(r2, r0);	 Catch:{ ClassNotFoundException -> 0x001e }
    L_0x0017:
        r1 = android.support.v4.app.Fragment.class;	 Catch:{ ClassNotFoundException -> 0x001e }
        r1 = r1.isAssignableFrom(r0);	 Catch:{ ClassNotFoundException -> 0x001e }
        return r1;
    L_0x001e:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.Fragment.a(android.content.Context, java.lang.String):boolean");
    }

    private void mo2533e() {
        if (this.f13174B == null) {
            throw new IllegalStateException("Fragment has not been attached yet.");
        }
        this.f13175C = new C4783l();
        this.f13175C.m9044a(this.f13174B, new C47662(this), this);
    }

    public static void m8854o() {
    }

    public static void m8855q() {
    }

    public static void m8856r() {
    }

    public static void m8857s() {
    }

    public static Animation m8858t() {
        return null;
    }

    public static Animator m8859u() {
        return null;
    }

    public static void m8860w() {
    }

    final void m8861A() {
        if (this.f13175C != null) {
            this.f13175C.m9080n();
            this.f13175C.m9076j();
        }
        this.f13199k = 4;
        this.f13187O = false;
        mo2535g();
        if (this.f13187O) {
            if (this.f13175C != null) {
                this.f13175C.m9083q();
            }
            if (this.f13193U != null) {
                this.f13193U.m9127g();
            }
            this.ad.m8543a(C0091a.ON_START);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onStart()");
        throw new al(stringBuilder.toString());
    }

    final void m8862B() {
        if (this.f13175C != null) {
            this.f13175C.m9080n();
            this.f13175C.m9076j();
        }
        this.f13199k = 5;
        this.f13187O = false;
        mo3060v();
        if (this.f13187O) {
            if (this.f13175C != null) {
                this.f13175C.m9084r();
                this.f13175C.m9076j();
            }
            this.ad.m8543a(C0091a.ON_RESUME);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onResume()");
        throw new al(stringBuilder.toString());
    }

    final void m8863C() {
        if (this.f13175C != null) {
            this.f13175C.m9065d(2);
        }
        this.f13199k = 2;
        if (this.f13194V) {
            this.f13194V = false;
            if (!this.f13195W) {
                this.f13195W = true;
                this.f13193U = this.f13174B.m8972a(this.f13203o, this.f13194V, false);
            }
            if (this.f13193U != null) {
                if (this.f13174B.f13266h) {
                    this.f13193U.m9125e();
                    return;
                }
                this.f13193U.m9124d();
            }
        }
    }

    final C0364a m8864D() {
        if (this.f13196X == null) {
            this.f13196X = new C0364a();
        }
        return this.f13196X;
    }

    final int m8865E() {
        return this.f13196X == null ? 0 : this.f13196X.f1349d;
    }

    final int m8866F() {
        return this.f13196X == null ? 0 : this.f13196X.f1350e;
    }

    final int m8867G() {
        return this.f13196X == null ? 0 : this.f13196X.f1351f;
    }

    final ak m8868H() {
        return this.f13196X == null ? null : this.f13196X.f1360o;
    }

    final ak m8869I() {
        return this.f13196X == null ? null : this.f13196X.f1361p;
    }

    final View m8870J() {
        return this.f13196X == null ? null : this.f13196X.f1346a;
    }

    final Animator m8871K() {
        return this.f13196X == null ? null : this.f13196X.f1347b;
    }

    final int m8872L() {
        return this.f13196X == null ? 0 : this.f13196X.f1348c;
    }

    final boolean m8873M() {
        return this.f13196X == null ? false : this.f13196X.f1362q;
    }

    final boolean m8874N() {
        return this.f13196X == null ? false : this.f13196X.f1364s;
    }

    public View mo3056a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public final String m8876a(int i) {
        return m8912l().getString(i);
    }

    public void mo2480a() {
        this.f13187O = true;
    }

    final void m8878a(int i, int i2) {
        if (this.f13196X != null || i != 0 || i2 != 0) {
            m8864D();
            this.f13196X.f1350e = i;
            this.f13196X.f1351f = i2;
        }
    }

    final void m8879a(int i, Fragment fragment) {
        StringBuilder stringBuilder;
        this.f13202n = i;
        if (fragment != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(fragment.f13203o);
            stringBuilder.append(":");
        } else {
            stringBuilder = new StringBuilder("android:fragment:");
        }
        stringBuilder.append(this.f13202n);
        this.f13203o = stringBuilder.toString();
    }

    final void m8880a(Animator animator) {
        m8864D().f1347b = animator;
    }

    @Deprecated
    public void mo3057a(Activity activity) {
        this.f13187O = true;
    }

    @Deprecated
    public void mo3058a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f13187O = true;
    }

    public void mo2528a(Context context) {
        this.f13187O = true;
        Activity activity = this.f13174B == null ? null : this.f13174B.f13260b;
        if (activity != null) {
            this.f13187O = false;
            mo3057a(activity);
        }
    }

    final void m8884a(C0366c c0366c) {
        m8864D();
        if (c0366c != this.f13196X.f1363r) {
            if (c0366c == null || this.f13196X.f1363r == null) {
                if (this.f13196X.f1362q) {
                    this.f13196X.f1363r = c0366c;
                }
                if (c0366c != null) {
                    c0366c.mo249b();
                }
                return;
            }
            StringBuilder stringBuilder = new StringBuilder("Trying to set a replacement startPostponedEnterTransition on ");
            stringBuilder.append(this);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final void m8885a(AttributeSet attributeSet, Bundle bundle) {
        this.f13187O = true;
        Activity activity = this.f13174B == null ? null : this.f13174B.f13260b;
        if (activity != null) {
            this.f13187O = false;
            mo3058a(activity, attributeSet, bundle);
        }
    }

    public void mo3467a(Menu menu, MenuInflater menuInflater) {
    }

    final void m8887a(View view) {
        m8864D().f1346a = view;
    }

    public void mo3453a(View view, Bundle bundle) {
    }

    public boolean mo3468a(MenuItem menuItem) {
        return false;
    }

    public void a_(Bundle bundle) {
        boolean z = true;
        this.f13187O = true;
        m8904g(bundle);
        if (this.f13175C != null) {
            if (this.f13175C.f13301l <= 0) {
                z = false;
            }
            if (!z) {
                this.f13175C.m9081o();
            }
        }
    }

    public LayoutInflater mo2530b(Bundle bundle) {
        if (this.f13174B == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater c = this.f13174B.mo2540c();
        m8913m();
        C0557e.m1228b(c, this.f13175C);
        return c;
    }

    final View m8891b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f13175C != null) {
            this.f13175C.m9080n();
        }
        this.f13213y = true;
        return mo3056a(layoutInflater, viewGroup, bundle);
    }

    public void mo2481b() {
        this.f13187O = true;
    }

    public final void m8893b(boolean z) {
        if (this.f13186N != z) {
            this.f13186N = z;
            if (this.f13185M && m8914n() && !this.f13181I) {
                this.f13174B.mo2541d();
            }
        }
    }

    public void mo2482c() {
        this.f13187O = true;
        if (!this.f13195W) {
            this.f13195W = true;
            this.f13193U = this.f13174B.m8972a(this.f13203o, this.f13194V, false);
        }
        if (this.f13193U != null) {
            this.f13193U.m9128h();
        }
    }

    public void mo2531c(Bundle bundle) {
        this.f13187O = true;
    }

    public final void m8896c(boolean z) {
        if (!this.f13192T && z && this.f13199k < 4 && this.f13173A != null && m8914n()) {
            this.f13173A.m9056b(this);
        }
        this.f13192T = z;
        z = this.f13199k < 4 && !z;
        this.f13191S = z;
    }

    public final C0093d mo39d() {
        return this.ad;
    }

    public void mo2532d(Bundle bundle) {
    }

    final void m8899d(boolean z) {
        m8864D().f1364s = z;
    }

    final void d_(int i) {
        if (this.f13196X != null || i != 0) {
            m8864D().f1349d = i;
        }
    }

    public void mo3059e(Bundle bundle) {
        if (this.f13202n >= 0) {
            if (this.f13173A == null ? false : this.f13173A.f13307s) {
                throw new IllegalStateException("Fragment already active and state has been saved");
            }
        }
        this.f13204p = bundle;
    }

    final void e_(int i) {
        m8864D().f1348c = i;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    final LayoutInflater m8901f(Bundle bundle) {
        this.ab = mo2530b(bundle);
        return this.ab;
    }

    public void mo2534f() {
        this.f13187O = true;
    }

    public void mo2535g() {
        this.f13187O = true;
        if (!this.f13194V) {
            this.f13194V = true;
            if (!this.f13195W) {
                this.f13195W = true;
                this.f13193U = this.f13174B.m8972a(this.f13203o, this.f13194V, false);
            } else if (this.f13193U != null) {
                this.f13193U.m9123c();
            }
        }
    }

    final void m8904g(Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                if (this.f13175C == null) {
                    mo2533e();
                }
                this.f13175C.m9041a(parcelable, this.f13176D);
                this.f13176D = null;
                this.f13175C.m9081o();
            }
        }
    }

    public void mo2536h() {
        this.f13187O = true;
    }

    final void m8906h(Bundle bundle) {
        if (this.f13175C != null) {
            this.f13175C.m9080n();
        }
        this.f13199k = 1;
        this.f13187O = false;
        a_(bundle);
        this.ac = true;
        if (this.f13187O) {
            this.ad.m8543a(C0091a.ON_CREATE);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onCreate()");
        throw new al(stringBuilder.toString());
    }

    public final int hashCode() {
        return super.hashCode();
    }

    final void m8907i(Bundle bundle) {
        if (this.f13175C != null) {
            this.f13175C.m9080n();
        }
        this.f13199k = 2;
        this.f13187O = false;
        mo2531c(bundle);
        if (!this.f13187O) {
            StringBuilder stringBuilder = new StringBuilder("Fragment ");
            stringBuilder.append(this);
            stringBuilder.append(" did not call through to super.onActivityCreated()");
            throw new al(stringBuilder.toString());
        } else if (this.f13175C != null) {
            this.f13175C.m9082p();
        }
    }

    final boolean m8908i() {
        return this.f13214z > 0;
    }

    public final Context m8909j() {
        return this.f13174B == null ? null : this.f13174B.f13261c;
    }

    final void m8910j(Bundle bundle) {
        mo2532d(bundle);
        if (this.f13175C != null) {
            Parcelable l = this.f13175C.m9078l();
            if (l != null) {
                bundle.putParcelable("android:support:fragments", l);
            }
        }
    }

    public final C7249g m8911k() {
        return this.f13174B == null ? null : (C7249g) this.f13174B.f13260b;
    }

    public final Resources m8912l() {
        if (this.f13174B != null) {
            return this.f13174B.f13261c.getResources();
        }
        StringBuilder stringBuilder = new StringBuilder("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not attached to Activity");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final C0390k m8913m() {
        if (this.f13175C == null) {
            mo2533e();
            if (this.f13199k >= 5) {
                this.f13175C.m9084r();
            } else if (this.f13199k >= 4) {
                this.f13175C.m9083q();
            } else if (this.f13199k >= 2) {
                this.f13175C.m9082p();
            } else if (this.f13199k > 0) {
                this.f13175C.m9081o();
            }
        }
        return this.f13175C;
    }

    public final boolean m8914n() {
        return this.f13174B != null && this.f13208t;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f13187O = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        m8911k().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.f13187O = true;
    }

    public final void m8915p() {
        if (!this.f13185M) {
            this.f13185M = true;
            if (m8914n() && !this.f13181I) {
                this.f13174B.mo2541d();
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        C0466d.m980a(this, stringBuilder);
        if (this.f13202n >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.f13202n);
        }
        if (this.f13178F != 0) {
            stringBuilder.append(" id=0x");
            stringBuilder.append(Integer.toHexString(this.f13178F));
        }
        if (this.f13180H != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.f13180H);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void mo3060v() {
        this.f13187O = true;
    }

    public final Object m8917x() {
        return this.f13196X == null ? null : this.f13196X.f1352g;
    }

    public final Object m8918y() {
        return this.f13196X == null ? null : this.f13196X.f1354i;
    }

    final void m8919z() {
        C0366c c0366c;
        if (this.f13196X == null) {
            c0366c = null;
        } else {
            this.f13196X.f1362q = false;
            c0366c = this.f13196X.f1363r;
            this.f13196X.f1363r = null;
        }
        if (c0366c != null) {
            c0366c.mo248a();
        }
    }
}
