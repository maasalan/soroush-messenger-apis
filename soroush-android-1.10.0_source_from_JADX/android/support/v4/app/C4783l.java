package android.support.v4.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.C0390k.C0388a;
import android.support.v4.app.C0390k.C0389b;
import android.support.v4.app.Fragment.C03621;
import android.support.v4.app.Fragment.C0366c;
import android.support.v4.app.Fragment.SavedState;
import android.support.v4.p038g.C0464b;
import android.support.v4.p038g.C0466d;
import android.support.v4.p038g.C0467e;
import android.support.v4.p038g.C0478j;
import android.support.v4.view.C0571r;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class C4783l extends C0390k implements Factory2 {
    static final Interpolator f13280E = new DecelerateInterpolator(2.5f);
    static final Interpolator f13281F = new DecelerateInterpolator(1.5f);
    static final Interpolator f13282G = new AccelerateInterpolator(2.5f);
    static final Interpolator f13283H = new AccelerateInterpolator(1.5f);
    static boolean f13284a = false;
    static Field f13285q;
    SparseArray<Parcelable> f13286A = null;
    ArrayList<C4782h> f13287B;
    C0400m f13288C;
    Runnable f13289D = new C03911(this);
    private final CopyOnWriteArrayList<C0478j<C0389b, Boolean>> f13290I = new CopyOnWriteArrayList();
    ArrayList<C0399f> f13291b;
    boolean f13292c;
    int f13293d = 0;
    final ArrayList<Fragment> f13294e = new ArrayList();
    SparseArray<Fragment> f13295f;
    ArrayList<C4777b> f13296g;
    ArrayList<Fragment> f13297h;
    ArrayList<C4777b> f13298i;
    ArrayList<Integer> f13299j;
    ArrayList<Object> f13300k;
    int f13301l = 0;
    C4778j f13302m;
    C0386h f13303n;
    Fragment f13304o;
    Fragment f13305p;
    boolean f13306r;
    boolean f13307s;
    boolean f13308t;
    String f13309u;
    boolean f13310v;
    ArrayList<C4777b> f13311w;
    ArrayList<Boolean> f13312x;
    ArrayList<Fragment> f13313y;
    Bundle f13314z = null;

    class C03911 implements Runnable {
        final /* synthetic */ C4783l f1423a;

        C03911(C4783l c4783l) {
            this.f1423a = c4783l;
        }

        public final void run() {
            this.f1423a.m9076j();
        }
    }

    private static class C0395b implements AnimationListener {
        private final AnimationListener f1433a;

        private C0395b(AnimationListener animationListener) {
            this.f1433a = animationListener;
        }

        public void onAnimationEnd(Animation animation) {
            if (this.f1433a != null) {
                this.f1433a.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            if (this.f1433a != null) {
                this.f1433a.onAnimationRepeat(animation);
            }
        }

        public void onAnimationStart(Animation animation) {
            if (this.f1433a != null) {
                this.f1433a.onAnimationStart(animation);
            }
        }
    }

    private static class C0396c {
        public final Animation f1434a;
        public final Animator f1435b;

        private C0396c(Animator animator) {
            this.f1434a = null;
            this.f1435b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        private C0396c(Animation animation) {
            this.f1434a = animation;
            this.f1435b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    private static class C0397d extends AnimatorListenerAdapter {
        View f1436a;

        C0397d(View view) {
            this.f1436a = view;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f1436a.setLayerType(0, null);
            animator.removeListener(this);
        }

        public final void onAnimationStart(Animator animator) {
            this.f1436a.setLayerType(2, null);
        }
    }

    static class C0398e {
        public static final int[] f1437a = new int[]{16842755, 16842960, 16842961};
    }

    interface C0399f {
        boolean mo239a(ArrayList<C4777b> arrayList, ArrayList<Boolean> arrayList2);
    }

    private static class C4780a extends C0395b {
        View f13272a;

        class C03941 implements Runnable {
            final /* synthetic */ C4780a f1432a;

            C03941(C4780a c4780a) {
                this.f1432a = c4780a;
            }

            public final void run() {
                this.f1432a.f13272a.setLayerType(0, null);
            }
        }

        C4780a(View view, AnimationListener animationListener) {
            super(animationListener);
            this.f13272a = view;
        }

        public final void onAnimationEnd(Animation animation) {
            if (!C0571r.m1329G(this.f13272a)) {
                if (VERSION.SDK_INT < 24) {
                    this.f13272a.setLayerType(0, null);
                    super.onAnimationEnd(animation);
                }
            }
            this.f13272a.post(new C03941(this));
            super.onAnimationEnd(animation);
        }
    }

    private class C4781g implements C0399f {
        final String f13273a = null;
        final int f13274b;
        final int f13275c;
        final /* synthetic */ C4783l f13276d;

        C4781g(C4783l c4783l, int i) {
            this.f13276d = c4783l;
            this.f13274b = i;
            this.f13275c = 1;
        }

        public final boolean mo239a(ArrayList<C4777b> arrayList, ArrayList<Boolean> arrayList2) {
            if (this.f13276d.f13305p != null && this.f13274b < 0 && this.f13273a == null) {
                C0390k c0390k = this.f13276d.f13305p.f13175C;
                if (c0390k != null && c0390k.mo261c()) {
                    return false;
                }
            }
            return this.f13276d.m9053a((ArrayList) arrayList, (ArrayList) arrayList2, this.f13273a, this.f13274b, this.f13275c);
        }
    }

    static class C4782h implements C0366c {
        final boolean f13277a;
        final C4777b f13278b;
        int f13279c;

        C4782h(C4777b c4777b, boolean z) {
            this.f13277a = z;
            this.f13278b = c4777b;
        }

        public final void mo248a() {
            this.f13279c--;
            if (this.f13279c == 0) {
                this.f13278b.f13239b.m9029x();
            }
        }

        public final void mo249b() {
            this.f13279c++;
        }

        public final void m8986c() {
            int i = this.f13279c > 0 ? 1 : 0;
            C4783l c4783l = this.f13278b.f13239b;
            int size = c4783l.f13294e.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = (Fragment) c4783l.f13294e.get(i2);
                fragment.m8884a(null);
                if (i != 0 && fragment.m8873M()) {
                    if (fragment.f13173A != null) {
                        if (fragment.f13173A.f13302m != null) {
                            if (Looper.myLooper() != fragment.f13173A.f13302m.f13262d.getLooper()) {
                                fragment.f13173A.f13302m.f13262d.postAtFrontOfQueue(new C03621(fragment));
                            } else {
                                fragment.m8919z();
                            }
                        }
                    }
                    fragment.m8864D().f1362q = false;
                }
            }
            C4783l.m8999a(this.f13278b.f13239b, this.f13278b, this.f13277a, i ^ true, true);
        }

        public final void m8987d() {
            C4783l.m8999a(this.f13278b.f13239b, this.f13278b, this.f13277a, false, false);
        }
    }

    C4783l() {
    }

    private void m8988A() {
        List list;
        List list2;
        if (this.f13295f != null) {
            list = null;
            list2 = list;
            for (int i = 0; i < this.f13295f.size(); i++) {
                Fragment fragment = (Fragment) this.f13295f.valueAt(i);
                if (fragment != null) {
                    Object obj;
                    if (fragment.f13183K) {
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(fragment);
                        fragment.f13206r = fragment.f13205q != null ? fragment.f13205q.f13202n : -1;
                        if (f13284a) {
                            StringBuilder stringBuilder = new StringBuilder("retainNonConfig: keeping retained ");
                            stringBuilder.append(fragment);
                            Log.v("FragmentManager", stringBuilder.toString());
                        }
                    }
                    if (fragment.f13175C != null) {
                        fragment.f13175C.m8988A();
                        obj = fragment.f13175C.f13288C;
                    } else {
                        obj = fragment.f13176D;
                    }
                    if (list2 == null && obj != null) {
                        list2 = new ArrayList(this.f13295f.size());
                        for (int i2 = 0; i2 < i; i2++) {
                            list2.add(null);
                        }
                    }
                    if (list2 != null) {
                        list2.add(obj);
                    }
                }
            }
        } else {
            list = null;
            list2 = list;
        }
        if (list == null && list2 == null) {
            this.f13288C = null;
        } else {
            this.f13288C = new C0400m(list, list2);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m8989a(java.util.ArrayList<android.support.v4.app.C4777b> r9, java.util.ArrayList<java.lang.Boolean> r10, int r11, int r12, android.support.v4.p038g.C0464b<android.support.v4.app.Fragment> r13) {
        /*
        r8 = this;
        r0 = r12 + -1;
        r1 = r12;
    L_0x0003:
        if (r0 < r11) goto L_0x0073;
    L_0x0005:
        r2 = r9.get(r0);
        r2 = (android.support.v4.app.C4777b) r2;
        r3 = r10.get(r0);
        r3 = (java.lang.Boolean) r3;
        r3 = r3.booleanValue();
        r4 = 0;
        r5 = r4;
    L_0x0017:
        r6 = r2.f13240c;
        r6 = r6.size();
        r7 = 1;
        if (r5 >= r6) goto L_0x0033;
    L_0x0020:
        r6 = r2.f13240c;
        r6 = r6.get(r5);
        r6 = (android.support.v4.app.C4777b.C0381a) r6;
        r6 = android.support.v4.app.C4777b.m8945b(r6);
        if (r6 == 0) goto L_0x0030;
    L_0x002e:
        r5 = r7;
        goto L_0x0034;
    L_0x0030:
        r5 = r5 + 1;
        goto L_0x0017;
    L_0x0033:
        r5 = r4;
    L_0x0034:
        if (r5 == 0) goto L_0x003f;
    L_0x0036:
        r5 = r0 + 1;
        r5 = r2.m8959a(r9, r5, r12);
        if (r5 != 0) goto L_0x003f;
    L_0x003e:
        goto L_0x0040;
    L_0x003f:
        r7 = r4;
    L_0x0040:
        if (r7 == 0) goto L_0x0070;
    L_0x0042:
        r5 = r8.f13287B;
        if (r5 != 0) goto L_0x004d;
    L_0x0046:
        r5 = new java.util.ArrayList;
        r5.<init>();
        r8.f13287B = r5;
    L_0x004d:
        r5 = new android.support.v4.app.l$h;
        r5.<init>(r2, r3);
        r6 = r8.f13287B;
        r6.add(r5);
        r2.m8954a(r5);
        if (r3 == 0) goto L_0x0060;
    L_0x005c:
        r2.m8970f();
        goto L_0x0063;
    L_0x0060:
        r2.m8958a(r4);
    L_0x0063:
        r1 = r1 + -1;
        if (r0 == r1) goto L_0x006d;
    L_0x0067:
        r9.remove(r0);
        r9.add(r1, r2);
    L_0x006d:
        r8.m9009b(r13);
    L_0x0070:
        r0 = r0 + -1;
        goto L_0x0003;
    L_0x0073:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.l.a(java.util.ArrayList, java.util.ArrayList, int, int, android.support.v4.g.b):int");
    }

    private static C0396c m8990a(float f, float f2) {
        Animation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f13281F);
        alphaAnimation.setDuration(220);
        return new C0396c(alphaAnimation);
    }

    private static C0396c m8991a(float f, float f2, float f3, float f4) {
        Animation animationSet = new AnimationSet(false);
        Animation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f13280E);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        scaleAnimation = new AlphaAnimation(f3, f4);
        scaleAnimation.setInterpolator(f13281F);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        return new C0396c(animationSet);
    }

    private android.support.v4.app.C4783l.C0396c m8992a(android.support.v4.app.Fragment r6, int r7, boolean r8, int r9) {
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
        r5 = this;
        r6 = r6.m8865E();
        android.support.v4.app.Fragment.m8858t();
        android.support.v4.app.Fragment.m8859u();
        r0 = 1;
        if (r6 == 0) goto L_0x005d;
    L_0x000d:
        r1 = r5.f13302m;
        r1 = r1.f13261c;
        r1 = r1.getResources();
        r1 = r1.getResourceTypeName(r6);
        r2 = "anim";
        r1 = r2.equals(r1);
        r2 = 0;
        if (r1 == 0) goto L_0x0036;
    L_0x0022:
        r3 = r5.f13302m;	 Catch:{ NotFoundException -> 0x0034, RuntimeException -> 0x0036 }
        r3 = r3.f13261c;	 Catch:{ NotFoundException -> 0x0034, RuntimeException -> 0x0036 }
        r3 = android.view.animation.AnimationUtils.loadAnimation(r3, r6);	 Catch:{ NotFoundException -> 0x0034, RuntimeException -> 0x0036 }
        if (r3 == 0) goto L_0x0032;	 Catch:{ NotFoundException -> 0x0034, RuntimeException -> 0x0036 }
    L_0x002c:
        r4 = new android.support.v4.app.l$c;	 Catch:{ NotFoundException -> 0x0034, RuntimeException -> 0x0036 }
        r4.<init>(r3);	 Catch:{ NotFoundException -> 0x0034, RuntimeException -> 0x0036 }
        return r4;
    L_0x0032:
        r3 = r0;
        goto L_0x0037;
    L_0x0034:
        r6 = move-exception;
        throw r6;
    L_0x0036:
        r3 = r2;
    L_0x0037:
        if (r3 != 0) goto L_0x005d;
    L_0x0039:
        r3 = r5.f13302m;	 Catch:{ RuntimeException -> 0x0049 }
        r3 = r3.f13261c;	 Catch:{ RuntimeException -> 0x0049 }
        r3 = android.animation.AnimatorInflater.loadAnimator(r3, r6);	 Catch:{ RuntimeException -> 0x0049 }
        if (r3 == 0) goto L_0x005d;	 Catch:{ RuntimeException -> 0x0049 }
    L_0x0043:
        r4 = new android.support.v4.app.l$c;	 Catch:{ RuntimeException -> 0x0049 }
        r4.<init>(r3);	 Catch:{ RuntimeException -> 0x0049 }
        return r4;
    L_0x0049:
        r3 = move-exception;
        if (r1 == 0) goto L_0x004d;
    L_0x004c:
        throw r3;
    L_0x004d:
        r1 = r5.f13302m;
        r1 = r1.f13261c;
        r6 = android.view.animation.AnimationUtils.loadAnimation(r1, r6);
        if (r6 == 0) goto L_0x005d;
    L_0x0057:
        r7 = new android.support.v4.app.l$c;
        r7.<init>(r6);
        return r7;
    L_0x005d:
        r6 = 0;
        if (r7 != 0) goto L_0x0061;
    L_0x0060:
        return r6;
    L_0x0061:
        r1 = -1;
        r2 = 4097; // 0x1001 float:5.741E-42 double:2.024E-320;
        if (r7 == r2) goto L_0x007c;
    L_0x0066:
        r0 = 4099; // 0x1003 float:5.744E-42 double:2.025E-320;
        if (r7 == r0) goto L_0x0076;
    L_0x006a:
        r0 = 8194; // 0x2002 float:1.1482E-41 double:4.0484E-320;
        if (r7 == r0) goto L_0x006f;
    L_0x006e:
        goto L_0x0082;
    L_0x006f:
        if (r8 == 0) goto L_0x0074;
    L_0x0071:
        r7 = 3;
    L_0x0072:
        r1 = r7;
        goto L_0x0082;
    L_0x0074:
        r7 = 4;
        goto L_0x0072;
    L_0x0076:
        if (r8 == 0) goto L_0x007a;
    L_0x0078:
        r7 = 5;
        goto L_0x0072;
    L_0x007a:
        r7 = 6;
        goto L_0x0072;
    L_0x007c:
        if (r8 == 0) goto L_0x0080;
    L_0x007e:
        r1 = r0;
        goto L_0x0082;
    L_0x0080:
        r0 = 2;
        goto L_0x007e;
    L_0x0082:
        if (r1 >= 0) goto L_0x0085;
    L_0x0084:
        return r6;
    L_0x0085:
        r7 = 1064933786; // 0x3f79999a float:0.975 double:5.26147199E-315;
        r8 = 0;
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        switch(r1) {
            case 1: goto L_0x00bb;
            case 2: goto L_0x00b6;
            case 3: goto L_0x00b1;
            case 4: goto L_0x00a9;
            case 5: goto L_0x00a4;
            case 6: goto L_0x009f;
            default: goto L_0x008e;
        };
    L_0x008e:
        if (r9 != 0) goto L_0x00c2;
    L_0x0090:
        r7 = r5.f13302m;
        r7 = r7.mo2542e();
        if (r7 == 0) goto L_0x00c2;
    L_0x0098:
        r7 = r5.f13302m;
        r9 = r7.mo2543f();
        goto L_0x00c2;
    L_0x009f:
        r6 = android.support.v4.app.C4783l.m8990a(r0, r8);
        return r6;
    L_0x00a4:
        r6 = android.support.v4.app.C4783l.m8990a(r8, r0);
        return r6;
    L_0x00a9:
        r6 = 1065982362; // 0x3f89999a float:1.075 double:5.26665264E-315;
        r6 = android.support.v4.app.C4783l.m8991a(r0, r6, r0, r8);
        return r6;
    L_0x00b1:
        r6 = android.support.v4.app.C4783l.m8991a(r7, r0, r8, r0);
        return r6;
    L_0x00b6:
        r6 = android.support.v4.app.C4783l.m8991a(r0, r7, r0, r8);
        return r6;
    L_0x00bb:
        r6 = 1066401792; // 0x3f900000 float:1.125 double:5.2687249E-315;
        r6 = android.support.v4.app.C4783l.m8991a(r6, r0, r8, r0);
        return r6;
    L_0x00c2:
        if (r9 != 0) goto L_0x00c4;
    L_0x00c4:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.l.a(android.support.v4.app.Fragment, int, boolean, int):android.support.v4.app.l$c");
    }

    private static AnimationListener m8993a(Animation animation) {
        Throwable e;
        String str;
        String str2;
        try {
            if (f13285q == null) {
                Field declaredField = Animation.class.getDeclaredField("mListener");
                f13285q = declaredField;
                declaredField.setAccessible(true);
            }
            return (AnimationListener) f13285q.get(animation);
        } catch (NoSuchFieldException e2) {
            e = e2;
            str = "FragmentManager";
            str2 = "No field with the name mListener is found in Animation class";
            Log.e(str, str2, e);
            return null;
        } catch (IllegalAccessException e3) {
            e = e3;
            str = "FragmentManager";
            str2 = "Cannot access Animation's mListener field";
            Log.e(str, str2, e);
            return null;
        }
    }

    private void m8994a(int i, C4777b c4777b) {
        synchronized (this) {
            if (this.f13298i == null) {
                this.f13298i = new ArrayList();
            }
            int size = this.f13298i.size();
            StringBuilder stringBuilder;
            if (i < size) {
                if (f13284a) {
                    stringBuilder = new StringBuilder("Setting back stack index ");
                    stringBuilder.append(i);
                    stringBuilder.append(" to ");
                    stringBuilder.append(c4777b);
                    Log.v("FragmentManager", stringBuilder.toString());
                }
                this.f13298i.set(i, c4777b);
            } else {
                while (size < i) {
                    this.f13298i.add(null);
                    if (this.f13299j == null) {
                        this.f13299j = new ArrayList();
                    }
                    if (f13284a) {
                        StringBuilder stringBuilder2 = new StringBuilder("Adding available back stack index ");
                        stringBuilder2.append(size);
                        Log.v("FragmentManager", stringBuilder2.toString());
                    }
                    this.f13299j.add(Integer.valueOf(size));
                    size++;
                }
                if (f13284a) {
                    stringBuilder = new StringBuilder("Adding back stack index ");
                    stringBuilder.append(i);
                    stringBuilder.append(" with ");
                    stringBuilder.append(c4777b);
                    Log.v("FragmentManager", stringBuilder.toString());
                }
                this.f13298i.add(c4777b);
            }
        }
    }

    private void m8995a(Fragment fragment, Context context, boolean z) {
        if (this.f13304o != null) {
            C4783l c4783l = this.f13304o.f13173A;
            if (c4783l instanceof C4783l) {
                c4783l.m8995a(fragment, context, true);
            }
        }
        Iterator it = this.f13290I.iterator();
        while (it.hasNext()) {
            C0478j c0478j = (C0478j) it.next();
            if (z) {
                ((Boolean) c0478j.f1640b).booleanValue();
            }
        }
    }

    private void m8996a(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f13304o != null) {
            C4783l c4783l = this.f13304o.f13173A;
            if (c4783l instanceof C4783l) {
                c4783l.m8996a(fragment, bundle, true);
            }
        }
        Iterator it = this.f13290I.iterator();
        while (it.hasNext()) {
            C0478j c0478j = (C0478j) it.next();
            if (z) {
                ((Boolean) c0478j.f1640b).booleanValue();
            }
        }
    }

    private void m8997a(Fragment fragment, View view, Bundle bundle, boolean z) {
        if (this.f13304o != null) {
            C4783l c4783l = this.f13304o.f13173A;
            if (c4783l instanceof C4783l) {
                c4783l.m8997a(fragment, view, bundle, true);
            }
        }
        Iterator it = this.f13290I.iterator();
        while (it.hasNext()) {
            C0478j c0478j = (C0478j) it.next();
            if (z) {
                ((Boolean) c0478j.f1640b).booleanValue();
            }
        }
    }

    static /* synthetic */ void m8999a(C4783l c4783l, C4777b c4777b, boolean z, boolean z2, boolean z3) {
        if (z) {
            c4777b.m8958a(z3);
        } else {
            c4777b.m8970f();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c4777b);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0407q.m803a(c4783l, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            c4783l.m9038a(c4783l.f13301l, true);
        }
        if (c4783l.f13295f != null) {
            int size = c4783l.f13295f.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) c4783l.f13295f.valueAt(i);
                if (fragment != null && fragment.f13189Q != null && fragment.f13197Y && c4777b.m8965b(fragment.f13179G)) {
                    if (fragment.aa > 0.0f) {
                        fragment.f13189Q.setAlpha(fragment.aa);
                    }
                    if (z3) {
                        fragment.aa = 0.0f;
                    } else {
                        fragment.aa = -1.0f;
                        fragment.f13197Y = false;
                    }
                }
            }
        }
    }

    static void m9000a(C0400m c0400m) {
        if (c0400m != null) {
            List<Fragment> list = c0400m.f1438a;
            if (list != null) {
                for (Fragment fragment : list) {
                    fragment.f13184L = true;
                }
            }
            List<C0400m> list2 = c0400m.f1439b;
            if (list2 != null) {
                for (C0400m a : list2) {
                    C4783l.m9000a(a);
                }
            }
        }
    }

    private static void m9001a(C0464b<Fragment> c0464b) {
        int size = c0464b.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) c0464b.f1610g[i];
            if (!fragment.f13208t) {
                View view = fragment.f13189Q;
                fragment.aa = view.getAlpha();
                view.setAlpha(0.0f);
            }
        }
    }

    private static void m9002a(View view, C0396c c0396c) {
        if (view != null && c0396c != null) {
            Object obj = null;
            if (view != null) {
                if (c0396c != null) {
                    if (VERSION.SDK_INT >= 19 && view.getLayerType() == 0 && C0571r.m1387x(view)) {
                        boolean z;
                        if (!(c0396c.f1434a instanceof AlphaAnimation)) {
                            if (c0396c.f1434a instanceof AnimationSet) {
                                List animations = ((AnimationSet) c0396c.f1434a).getAnimations();
                                int i = 0;
                                while (i < animations.size()) {
                                    if (!(animations.get(i) instanceof AlphaAnimation)) {
                                        i++;
                                    }
                                }
                                z = false;
                            } else {
                                z = C4783l.m9005a(c0396c.f1435b);
                            }
                            if (z) {
                                obj = 1;
                            }
                        }
                        z = true;
                        if (z) {
                            obj = 1;
                        }
                    }
                }
            }
            if (obj != null) {
                if (c0396c.f1435b != null) {
                    c0396c.f1435b.addListener(new C0397d(view));
                    return;
                }
                AnimationListener a = C4783l.m8993a(c0396c.f1434a);
                view.setLayerType(2, null);
                c0396c.f1434a.setAnimationListener(new C4780a(view, a));
            }
        }
    }

    private void m9003a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0467e("FragmentManager"));
        if (this.f13302m != null) {
            try {
                this.f13302m.mo2538a("  ", printWriter, new String[0]);
            } catch (Throwable e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            mo257a("  ", null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    private void m9004a(ArrayList<C4777b> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        int i4;
        ArrayList<C4777b> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i5 = i;
        int i6 = i2;
        boolean z = ((C4777b) arrayList3.get(i5)).f13258u;
        if (this.f13313y == null) {
            r7.f13313y = new ArrayList();
        } else {
            r7.f13313y.clear();
        }
        r7.f13313y.addAll(r7.f13294e);
        Fragment fragment = r7.f13305p;
        boolean z2 = false;
        for (i3 = i5; i3 < i6; i3++) {
            C4777b c4777b = (C4777b) arrayList3.get(i3);
            fragment = !((Boolean) arrayList4.get(i3)).booleanValue() ? c4777b.m8946a(r7.f13313y, fragment) : c4777b.m8961b(r7.f13313y, fragment);
            if (!z2) {
                if (!c4777b.f13247j) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        r7.f13313y.clear();
        if (!z) {
            C0407q.m803a(r7, arrayList3, arrayList4, i5, i6, false);
        }
        C4783l.m9011b(arrayList, arrayList2, i, i2);
        if (z) {
            C0464b c0464b = new C0464b();
            m9009b(c0464b);
            i3 = m8989a((ArrayList) arrayList3, (ArrayList) arrayList4, i5, i6, c0464b);
            C4783l.m9001a(c0464b);
            i4 = i3;
        } else {
            i4 = i6;
        }
        if (i4 != i5 && z) {
            C0407q.m803a(r7, arrayList3, arrayList4, i5, i4, true);
            m9038a(r7.f13301l, true);
        }
        while (i5 < i6) {
            C4777b c4777b2 = (C4777b) arrayList3.get(i5);
            if (((Boolean) arrayList4.get(i5)).booleanValue() && c4777b2.f13251n >= 0) {
                int i7 = c4777b2.f13251n;
                synchronized (this) {
                    try {
                        r7.f13298i.set(i7, null);
                        if (r7.f13299j == null) {
                            r7.f13299j = new ArrayList();
                        }
                        if (f13284a) {
                            StringBuilder stringBuilder = new StringBuilder("Freeing back stack index ");
                            stringBuilder.append(i7);
                            Log.v("FragmentManager", stringBuilder.toString());
                        }
                        r7.f13299j.add(Integer.valueOf(i7));
                    } catch (Throwable th) {
                        while (true) {
                            Throwable th2 = th;
                        }
                    }
                }
                c4777b2.f13251n = -1;
            }
            c4777b2.m8964b();
            i5++;
        }
        if (z2) {
            m9031z();
        }
    }

    private static boolean m9005a(Animator animator) {
        if (animator == null) {
            return false;
        }
        int i;
        if (animator instanceof ValueAnimator) {
            PropertyValuesHolder[] values = ((ValueAnimator) animator).getValues();
            for (PropertyValuesHolder propertyName : values) {
                if ("alpha".equals(propertyName.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            List childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (i = 0; i < childAnimations.size(); i++) {
                if (C4783l.m9005a((Animator) childAnimations.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    private void m9006b(Fragment fragment, Context context, boolean z) {
        if (this.f13304o != null) {
            C4783l c4783l = this.f13304o.f13173A;
            if (c4783l instanceof C4783l) {
                c4783l.m9006b(fragment, context, true);
            }
        }
        Iterator it = this.f13290I.iterator();
        while (it.hasNext()) {
            C0478j c0478j = (C0478j) it.next();
            if (z) {
                ((Boolean) c0478j.f1640b).booleanValue();
            }
        }
    }

    private void m9007b(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f13304o != null) {
            C4783l c4783l = this.f13304o.f13173A;
            if (c4783l instanceof C4783l) {
                c4783l.m9007b(fragment, bundle, true);
            }
        }
        Iterator it = this.f13290I.iterator();
        while (it.hasNext()) {
            C0478j c0478j = (C0478j) it.next();
            if (!z || ((Boolean) c0478j.f1640b).booleanValue()) {
                ((C0389b) c0478j.f1639a).mo30a(fragment);
            }
        }
    }

    private void m9008b(Fragment fragment, boolean z) {
        if (this.f13304o != null) {
            C4783l c4783l = this.f13304o.f13173A;
            if (c4783l instanceof C4783l) {
                c4783l.m9008b(fragment, true);
            }
        }
        Iterator it = this.f13290I.iterator();
        while (it.hasNext()) {
            C0478j c0478j = (C0478j) it.next();
            if (!z || ((Boolean) c0478j.f1640b).booleanValue()) {
                ((C0389b) c0478j.f1639a).mo31b(fragment);
            }
        }
    }

    private void m9009b(C0464b<Fragment> c0464b) {
        if (this.f13301l > 0) {
            int min = Math.min(this.f13301l, 4);
            int size = this.f13294e.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) this.f13294e.get(i);
                if (fragment.f13199k < min) {
                    m9042a(fragment, min, fragment.m8865E(), fragment.m8866F(), false);
                    if (!(fragment.f13189Q == null || fragment.f13181I || !fragment.f13197Y)) {
                        c0464b.add(fragment);
                    }
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9010b(java.util.ArrayList<android.support.v4.app.C4777b> r9, java.util.ArrayList<java.lang.Boolean> r10) {
        /*
        r8 = this;
        r0 = r8.f13287B;
        r1 = 0;
        if (r0 != 0) goto L_0x0007;
    L_0x0005:
        r0 = r1;
        goto L_0x000d;
    L_0x0007:
        r0 = r8.f13287B;
        r0 = r0.size();
    L_0x000d:
        r2 = r0;
        r0 = r1;
    L_0x000f:
        if (r0 >= r2) goto L_0x0079;
    L_0x0011:
        r3 = r8.f13287B;
        r3 = r3.get(r0);
        r3 = (android.support.v4.app.C4783l.C4782h) r3;
        r4 = 1;
        r5 = -1;
        if (r9 == 0) goto L_0x0039;
    L_0x001d:
        r6 = r3.f13277a;
        if (r6 != 0) goto L_0x0039;
    L_0x0021:
        r6 = r3.f13278b;
        r6 = r9.indexOf(r6);
        if (r6 == r5) goto L_0x0039;
    L_0x0029:
        r6 = r10.get(r6);
        r6 = (java.lang.Boolean) r6;
        r6 = r6.booleanValue();
        if (r6 == 0) goto L_0x0039;
    L_0x0035:
        r3.m8987d();
        goto L_0x0077;
    L_0x0039:
        r6 = r3.f13279c;
        if (r6 != 0) goto L_0x003f;
    L_0x003d:
        r6 = r4;
        goto L_0x0040;
    L_0x003f:
        r6 = r1;
    L_0x0040:
        if (r6 != 0) goto L_0x0050;
    L_0x0042:
        if (r9 == 0) goto L_0x0077;
    L_0x0044:
        r6 = r3.f13278b;
        r7 = r9.size();
        r6 = r6.m8959a(r9, r1, r7);
        if (r6 == 0) goto L_0x0077;
    L_0x0050:
        r6 = r8.f13287B;
        r6.remove(r0);
        r0 = r0 + -1;
        r2 = r2 + -1;
        if (r9 == 0) goto L_0x0074;
    L_0x005b:
        r6 = r3.f13277a;
        if (r6 != 0) goto L_0x0074;
    L_0x005f:
        r6 = r3.f13278b;
        r6 = r9.indexOf(r6);
        if (r6 == r5) goto L_0x0074;
    L_0x0067:
        r5 = r10.get(r6);
        r5 = (java.lang.Boolean) r5;
        r5 = r5.booleanValue();
        if (r5 == 0) goto L_0x0074;
    L_0x0073:
        goto L_0x0035;
    L_0x0074:
        r3.m8986c();
    L_0x0077:
        r0 = r0 + r4;
        goto L_0x000f;
    L_0x0079:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.l.b(java.util.ArrayList, java.util.ArrayList):void");
    }

    private static void m9011b(ArrayList<C4777b> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C4777b c4777b = (C4777b) arrayList.get(i);
            boolean z = true;
            if (((Boolean) arrayList2.get(i)).booleanValue()) {
                c4777b.m8953a(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                c4777b.m8958a(z);
            } else {
                c4777b.m8953a(1);
                c4777b.m8970f();
            }
            i++;
        }
    }

    private void m9012c(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f13304o != null) {
            C4783l c4783l = this.f13304o.f13173A;
            if (c4783l instanceof C4783l) {
                c4783l.m9012c(fragment, bundle, true);
            }
        }
        Iterator it = this.f13290I.iterator();
        while (it.hasNext()) {
            C0478j c0478j = (C0478j) it.next();
            if (z) {
                ((Boolean) c0478j.f1640b).booleanValue();
            }
        }
    }

    private void m9013c(Fragment fragment, boolean z) {
        if (this.f13304o != null) {
            C4783l c4783l = this.f13304o.f13173A;
            if (c4783l instanceof C4783l) {
                c4783l.m9013c(fragment, true);
            }
        }
        Iterator it = this.f13290I.iterator();
        while (it.hasNext()) {
            C0478j c0478j = (C0478j) it.next();
            if (!z || ((Boolean) c0478j.f1640b).booleanValue()) {
                ((C0389b) c0478j.f1639a).mo32c(fragment);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m9014c(java.util.ArrayList<android.support.v4.app.C4777b> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.f13291b;	 Catch:{ all -> 0x003a }
        r1 = 0;
        if (r0 == 0) goto L_0x0038;
    L_0x0006:
        r0 = r4.f13291b;	 Catch:{ all -> 0x003a }
        r0 = r0.size();	 Catch:{ all -> 0x003a }
        if (r0 != 0) goto L_0x000f;
    L_0x000e:
        goto L_0x0038;
    L_0x000f:
        r0 = r4.f13291b;	 Catch:{ all -> 0x003a }
        r0 = r0.size();	 Catch:{ all -> 0x003a }
        r2 = r1;
    L_0x0016:
        if (r1 >= r0) goto L_0x0028;
    L_0x0018:
        r3 = r4.f13291b;	 Catch:{ all -> 0x003a }
        r3 = r3.get(r1);	 Catch:{ all -> 0x003a }
        r3 = (android.support.v4.app.C4783l.C0399f) r3;	 Catch:{ all -> 0x003a }
        r3 = r3.mo239a(r5, r6);	 Catch:{ all -> 0x003a }
        r2 = r2 | r3;
        r1 = r1 + 1;
        goto L_0x0016;
    L_0x0028:
        r5 = r4.f13291b;	 Catch:{ all -> 0x003a }
        r5.clear();	 Catch:{ all -> 0x003a }
        r5 = r4.f13302m;	 Catch:{ all -> 0x003a }
        r5 = r5.f13262d;	 Catch:{ all -> 0x003a }
        r6 = r4.f13289D;	 Catch:{ all -> 0x003a }
        r5.removeCallbacks(r6);	 Catch:{ all -> 0x003a }
        monitor-exit(r4);	 Catch:{ all -> 0x003a }
        return r2;
    L_0x0038:
        monitor-exit(r4);	 Catch:{ all -> 0x003a }
        return r1;
    L_0x003a:
        r5 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x003a }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.l.c(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    private void m9015d(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f13304o != null) {
            C4783l c4783l = this.f13304o.f13173A;
            if (c4783l instanceof C4783l) {
                c4783l.m9015d(fragment, bundle, true);
            }
        }
        Iterator it = this.f13290I.iterator();
        while (it.hasNext()) {
            C0478j c0478j = (C0478j) it.next();
            if (z) {
                ((Boolean) c0478j.f1640b).booleanValue();
            }
        }
    }

    private void m9016d(Fragment fragment, boolean z) {
        if (this.f13304o != null) {
            C4783l c4783l = this.f13304o.f13173A;
            if (c4783l instanceof C4783l) {
                c4783l.m9016d(fragment, true);
            }
        }
        Iterator it = this.f13290I.iterator();
        while (it.hasNext()) {
            C0478j c0478j = (C0478j) it.next();
            if (z) {
                ((Boolean) c0478j.f1640b).booleanValue();
            }
        }
    }

    public static int m9017e(int i) {
        int i2 = 8194;
        if (i != 4097) {
            if (i != 4099) {
                return i != 8194 ? 0 : 4097;
            } else {
                i2 = 4099;
            }
        }
        return i2;
    }

    private void m9018e(Fragment fragment, boolean z) {
        if (this.f13304o != null) {
            C4783l c4783l = this.f13304o.f13173A;
            if (c4783l instanceof C4783l) {
                c4783l.m9018e(fragment, true);
            }
        }
        Iterator it = this.f13290I.iterator();
        while (it.hasNext()) {
            C0478j c0478j = (C0478j) it.next();
            if (z) {
                ((Boolean) c0478j.f1640b).booleanValue();
            }
        }
    }

    public static void m9019f(Fragment fragment) {
        if (f13284a) {
            StringBuilder stringBuilder = new StringBuilder("hide: ");
            stringBuilder.append(fragment);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        if (!fragment.f13181I) {
            fragment.f13181I = true;
            fragment.f13198Z = true ^ fragment.f13198Z;
        }
    }

    private void m9020f(Fragment fragment, boolean z) {
        if (this.f13304o != null) {
            C4783l c4783l = this.f13304o.f13173A;
            if (c4783l instanceof C4783l) {
                c4783l.m9020f(fragment, true);
            }
        }
        Iterator it = this.f13290I.iterator();
        while (it.hasNext()) {
            C0478j c0478j = (C0478j) it.next();
            if (z) {
                ((Boolean) c0478j.f1640b).booleanValue();
            }
        }
    }

    public static void m9021g(Fragment fragment) {
        if (f13284a) {
            StringBuilder stringBuilder = new StringBuilder("show: ");
            stringBuilder.append(fragment);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        if (fragment.f13181I) {
            fragment.f13181I = false;
            fragment.f13198Z ^= 1;
        }
    }

    private void m9022g(Fragment fragment, boolean z) {
        if (this.f13304o != null) {
            C4783l c4783l = this.f13304o.f13173A;
            if (c4783l instanceof C4783l) {
                c4783l.m9022g(fragment, true);
            }
        }
        Iterator it = this.f13290I.iterator();
        while (it.hasNext()) {
            C0478j c0478j = (C0478j) it.next();
            if (z) {
                ((Boolean) c0478j.f1640b).booleanValue();
            }
        }
    }

    private void m9023h(Fragment fragment, boolean z) {
        if (this.f13304o != null) {
            C4783l c4783l = this.f13304o.f13173A;
            if (c4783l instanceof C4783l) {
                c4783l.m9023h(fragment, true);
            }
        }
        Iterator it = this.f13290I.iterator();
        while (it.hasNext()) {
            C0478j c0478j = (C0478j) it.next();
            if (z) {
                ((Boolean) c0478j.f1640b).booleanValue();
            }
        }
    }

    private void m9024k(Fragment fragment) {
        m9042a(fragment, this.f13301l, 0, 0, false);
    }

    private void m9025l(Fragment fragment) {
        if (fragment.f13190R != null) {
            if (this.f13286A == null) {
                this.f13286A = new SparseArray();
            } else {
                this.f13286A.clear();
            }
            fragment.f13190R.saveHierarchyState(this.f13286A);
            if (this.f13286A.size() > 0) {
                fragment.f13201m = this.f13286A;
                this.f13286A = null;
            }
        }
    }

    private Bundle m9026m(Fragment fragment) {
        Bundle bundle;
        if (this.f13314z == null) {
            this.f13314z = new Bundle();
        }
        fragment.m8910j(this.f13314z);
        m9015d(fragment, this.f13314z, false);
        if (this.f13314z.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.f13314z;
            this.f13314z = null;
        }
        if (fragment.f13189Q != null) {
            m9025l(fragment);
        }
        if (fragment.f13201m != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.f13201m);
        }
        if (!fragment.f13192T) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.f13192T);
        }
        return bundle;
    }

    private boolean m9027v() {
        m9076j();
        m9071h();
        if (this.f13305p != null) {
            C0390k c0390k = this.f13305p.f13175C;
            if (c0390k != null && c0390k.mo261c()) {
                return true;
            }
        }
        boolean a = m9053a(this.f13311w, this.f13312x, null, -1, 0);
        if (a) {
            this.f13292c = true;
            try {
                m9048a(this.f13311w, this.f13312x);
            } finally {
                m9073i();
            }
        }
        m9077k();
        m9079m();
        return a;
    }

    private void m9028w() {
        if (this.f13307s) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f13309u != null) {
            StringBuilder stringBuilder = new StringBuilder("Can not perform this action inside of ");
            stringBuilder.append(this.f13309u);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private void m9029x() {
        synchronized (this) {
            Object obj = null;
            Object obj2 = (this.f13287B == null || this.f13287B.isEmpty()) ? null : 1;
            if (this.f13291b != null && this.f13291b.size() == 1) {
                obj = 1;
            }
            if (!(obj2 == null && r1 == null)) {
                this.f13302m.f13262d.removeCallbacks(this.f13289D);
                this.f13302m.f13262d.post(this.f13289D);
            }
        }
    }

    private void m9030y() {
        if (this.f13287B != null) {
            while (!this.f13287B.isEmpty()) {
                ((C4782h) this.f13287B.remove(0)).m8986c();
            }
        }
    }

    private void m9031z() {
        if (this.f13300k != null) {
            for (int i = 0; i < this.f13300k.size(); i++) {
                this.f13300k.get(i);
            }
        }
    }

    public final int m9032a(C4777b c4777b) {
        synchronized (this) {
            int intValue;
            if (this.f13299j != null) {
                if (this.f13299j.size() > 0) {
                    intValue = ((Integer) this.f13299j.remove(this.f13299j.size() - 1)).intValue();
                    if (f13284a) {
                        StringBuilder stringBuilder = new StringBuilder("Adding back stack index ");
                        stringBuilder.append(intValue);
                        stringBuilder.append(" with ");
                        stringBuilder.append(c4777b);
                        Log.v("FragmentManager", stringBuilder.toString());
                    }
                    this.f13298i.set(intValue, c4777b);
                    return intValue;
                }
            }
            if (this.f13298i == null) {
                this.f13298i = new ArrayList();
            }
            intValue = this.f13298i.size();
            if (f13284a) {
                stringBuilder = new StringBuilder("Setting back stack index ");
                stringBuilder.append(intValue);
                stringBuilder.append(" to ");
                stringBuilder.append(c4777b);
                Log.v("FragmentManager", stringBuilder.toString());
            }
            this.f13298i.add(c4777b);
            return intValue;
        }
    }

    public final SavedState mo250a(Fragment fragment) {
        if (fragment.f13202n < 0) {
            StringBuilder stringBuilder = new StringBuilder("Fragment ");
            stringBuilder.append(fragment);
            stringBuilder.append(" is not currently in the FragmentManager");
            m9003a(new IllegalStateException(stringBuilder.toString()));
        }
        if (fragment.f13199k > 0) {
            Bundle m = m9026m(fragment);
            if (m != null) {
                return new SavedState(m);
            }
        }
        return null;
    }

    public final Fragment mo251a(int i) {
        int size;
        for (size = this.f13294e.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f13294e.get(size);
            if (fragment != null && fragment.f13178F == i) {
                return fragment;
            }
        }
        if (this.f13295f != null) {
            for (size = this.f13295f.size() - 1; size >= 0; size--) {
                fragment = (Fragment) this.f13295f.valueAt(size);
                if (fragment != null && fragment.f13178F == i) {
                    return fragment;
                }
            }
        }
        return null;
    }

    public final Fragment mo252a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        Fragment fragment = (Fragment) this.f13295f.get(i);
        if (fragment == null) {
            StringBuilder stringBuilder = new StringBuilder("Fragment no longer exists for key ");
            stringBuilder.append(str);
            stringBuilder.append(": index ");
            stringBuilder.append(i);
            m9003a(new IllegalStateException(stringBuilder.toString()));
        }
        return fragment;
    }

    public final Fragment mo253a(String str) {
        int size;
        Fragment fragment;
        if (str != null) {
            for (size = this.f13294e.size() - 1; size >= 0; size--) {
                fragment = (Fragment) this.f13294e.get(size);
                if (fragment != null && str.equals(fragment.f13180H)) {
                    return fragment;
                }
            }
        }
        if (!(this.f13295f == null || str == null)) {
            for (size = this.f13295f.size() - 1; size >= 0; size--) {
                fragment = (Fragment) this.f13295f.valueAt(size);
                if (fragment != null && str.equals(fragment.f13180H)) {
                    return fragment;
                }
            }
        }
        return null;
    }

    public final C0401p mo254a() {
        return new C4777b(this);
    }

    final void m9038a(int i, boolean z) {
        if (this.f13302m == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f13301l) {
            this.f13301l = i;
            if (this.f13295f != null) {
                Fragment fragment;
                i = this.f13294e.size();
                int i2 = 0;
                int i3 = i2;
                while (i2 < i) {
                    fragment = (Fragment) this.f13294e.get(i2);
                    m9062c(fragment);
                    if (fragment.f13193U != null) {
                        i3 |= fragment.f13193U.mo271b();
                    }
                    i2++;
                }
                i = this.f13295f.size();
                for (i2 = 0; i2 < i; i2++) {
                    fragment = (Fragment) this.f13295f.valueAt(i2);
                    if (fragment != null && ((fragment.f13209u || fragment.f13182J) && !fragment.f13197Y)) {
                        m9062c(fragment);
                        if (fragment.f13193U != null) {
                            i3 |= fragment.f13193U.mo271b();
                        }
                    }
                }
                if (i3 == 0) {
                    m9070g();
                }
                if (this.f13306r && this.f13302m != null && this.f13301l == 5) {
                    this.f13302m.mo2541d();
                    this.f13306r = false;
                }
            }
        }
    }

    public final void m9039a(Configuration configuration) {
        for (int i = 0; i < this.f13294e.size(); i++) {
            Fragment fragment = (Fragment) this.f13294e.get(i);
            if (fragment != null) {
                fragment.onConfigurationChanged(configuration);
                if (fragment.f13175C != null) {
                    fragment.f13175C.m9039a(configuration);
                }
            }
        }
    }

    public final void mo255a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f13202n < 0) {
            StringBuilder stringBuilder = new StringBuilder("Fragment ");
            stringBuilder.append(fragment);
            stringBuilder.append(" is not currently in the FragmentManager");
            m9003a(new IllegalStateException(stringBuilder.toString()));
        }
        bundle.putInt(str, fragment.f13202n);
    }

    final void m9041a(Parcelable parcelable, C0400m c0400m) {
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f1365a != null) {
                List list;
                StringBuilder stringBuilder;
                int i;
                if (c0400m != null) {
                    List list2 = c0400m.f1438a;
                    list = c0400m.f1439b;
                    int size = list2 != null ? list2.size() : 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        Fragment fragment = (Fragment) list2.get(i2);
                        if (f13284a) {
                            StringBuilder stringBuilder2 = new StringBuilder("restoreAllState: re-attaching retained ");
                            stringBuilder2.append(fragment);
                            Log.v("FragmentManager", stringBuilder2.toString());
                        }
                        int i3 = 0;
                        while (i3 < fragmentManagerState.f1365a.length && fragmentManagerState.f1365a[i3].f1371b != fragment.f13202n) {
                            i3++;
                        }
                        if (i3 == fragmentManagerState.f1365a.length) {
                            StringBuilder stringBuilder3 = new StringBuilder("Could not find active fragment with index ");
                            stringBuilder3.append(fragment.f13202n);
                            m9003a(new IllegalStateException(stringBuilder3.toString()));
                        }
                        FragmentState fragmentState = fragmentManagerState.f1365a[i3];
                        fragmentState.f1381l = fragment;
                        fragment.f13201m = null;
                        fragment.f13214z = 0;
                        fragment.f13211w = false;
                        fragment.f13208t = false;
                        fragment.f13205q = null;
                        if (fragmentState.f1380k != null) {
                            fragmentState.f1380k.setClassLoader(this.f13302m.f13261c.getClassLoader());
                            fragment.f13201m = fragmentState.f1380k.getSparseParcelableArray("android:view_state");
                            fragment.f13200l = fragmentState.f1380k;
                        }
                    }
                } else {
                    list = null;
                }
                this.f13295f = new SparseArray(fragmentManagerState.f1365a.length);
                int i4 = 0;
                while (i4 < fragmentManagerState.f1365a.length) {
                    FragmentState fragmentState2 = fragmentManagerState.f1365a[i4];
                    if (fragmentState2 != null) {
                        C0400m c0400m2 = (list == null || i4 >= list.size()) ? null : (C0400m) list.get(i4);
                        C4778j c4778j = this.f13302m;
                        C0386h c0386h = this.f13303n;
                        Fragment fragment2 = this.f13304o;
                        if (fragmentState2.f1381l == null) {
                            Context context = c4778j.f13261c;
                            if (fragmentState2.f1378i != null) {
                                fragmentState2.f1378i.setClassLoader(context.getClassLoader());
                            }
                            fragmentState2.f1381l = c0386h != null ? c0386h.mo221a(context, fragmentState2.f1370a, fragmentState2.f1378i) : Fragment.m8850a(context, fragmentState2.f1370a, fragmentState2.f1378i);
                            if (fragmentState2.f1380k != null) {
                                fragmentState2.f1380k.setClassLoader(context.getClassLoader());
                                fragmentState2.f1381l.f13200l = fragmentState2.f1380k;
                            }
                            fragmentState2.f1381l.m8879a(fragmentState2.f1371b, fragment2);
                            fragmentState2.f1381l.f13210v = fragmentState2.f1372c;
                            fragmentState2.f1381l.f13212x = true;
                            fragmentState2.f1381l.f13178F = fragmentState2.f1373d;
                            fragmentState2.f1381l.f13179G = fragmentState2.f1374e;
                            fragmentState2.f1381l.f13180H = fragmentState2.f1375f;
                            fragmentState2.f1381l.f13183K = fragmentState2.f1376g;
                            fragmentState2.f1381l.f13182J = fragmentState2.f1377h;
                            fragmentState2.f1381l.f13181I = fragmentState2.f1379j;
                            fragmentState2.f1381l.f13173A = c4778j.f13264f;
                            if (f13284a) {
                                stringBuilder = new StringBuilder("Instantiated fragment ");
                                stringBuilder.append(fragmentState2.f1381l);
                                Log.v("FragmentManager", stringBuilder.toString());
                            }
                        }
                        fragmentState2.f1381l.f13176D = c0400m2;
                        Fragment fragment3 = fragmentState2.f1381l;
                        if (f13284a) {
                            stringBuilder = new StringBuilder("restoreAllState: active #");
                            stringBuilder.append(i4);
                            stringBuilder.append(": ");
                            stringBuilder.append(fragment3);
                            Log.v("FragmentManager", stringBuilder.toString());
                        }
                        this.f13295f.put(fragment3.f13202n, fragment3);
                        fragmentState2.f1381l = null;
                    }
                    i4++;
                }
                if (c0400m != null) {
                    List list3 = c0400m.f1438a;
                    i4 = list3 != null ? list3.size() : 0;
                    for (int i5 = 0; i5 < i4; i5++) {
                        Fragment fragment4 = (Fragment) list3.get(i5);
                        if (fragment4.f13206r >= 0) {
                            fragment4.f13205q = (Fragment) this.f13295f.get(fragment4.f13206r);
                            if (fragment4.f13205q == null) {
                                stringBuilder = new StringBuilder("Re-attaching retained fragment ");
                                stringBuilder.append(fragment4);
                                stringBuilder.append(" target no longer exists: ");
                                stringBuilder.append(fragment4.f13206r);
                                Log.w("FragmentManager", stringBuilder.toString());
                            }
                        }
                    }
                }
                this.f13294e.clear();
                if (fragmentManagerState.f1366b != null) {
                    for (i = 0; i < fragmentManagerState.f1366b.length; i++) {
                        StringBuilder stringBuilder4;
                        Fragment fragment5 = (Fragment) this.f13295f.get(fragmentManagerState.f1366b[i]);
                        if (fragment5 == null) {
                            stringBuilder4 = new StringBuilder("No instantiated fragment for index #");
                            stringBuilder4.append(fragmentManagerState.f1366b[i]);
                            m9003a(new IllegalStateException(stringBuilder4.toString()));
                        }
                        fragment5.f13208t = true;
                        if (f13284a) {
                            stringBuilder4 = new StringBuilder("restoreAllState: added #");
                            stringBuilder4.append(i);
                            stringBuilder4.append(": ");
                            stringBuilder4.append(fragment5);
                            Log.v("FragmentManager", stringBuilder4.toString());
                        }
                        if (this.f13294e.contains(fragment5)) {
                            throw new IllegalStateException("Already added!");
                        }
                        synchronized (this.f13294e) {
                            this.f13294e.add(fragment5);
                        }
                    }
                }
                if (fragmentManagerState.f1367c != null) {
                    this.f13296g = new ArrayList(fragmentManagerState.f1367c.length);
                    for (i = 0; i < fragmentManagerState.f1367c.length; i++) {
                        C4777b a = fragmentManagerState.f1367c[i].m719a(this);
                        if (f13284a) {
                            StringBuilder stringBuilder5 = new StringBuilder("restoreAllState: back stack #");
                            stringBuilder5.append(i);
                            stringBuilder5.append(" (index ");
                            stringBuilder5.append(a.f13251n);
                            stringBuilder5.append("): ");
                            stringBuilder5.append(a);
                            Log.v("FragmentManager", stringBuilder5.toString());
                            PrintWriter printWriter = new PrintWriter(new C0467e("FragmentManager"));
                            a.m8957a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f13296g.add(a);
                        if (a.f13251n >= 0) {
                            m8994a(a.f13251n, a);
                        }
                    }
                } else {
                    this.f13296g = null;
                }
                if (fragmentManagerState.f1368d >= 0) {
                    this.f13305p = (Fragment) this.f13295f.get(fragmentManagerState.f1368d);
                }
                this.f13293d = fragmentManagerState.f1369e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void m9042a(android.support.v4.app.Fragment r17, int r18, int r19, int r20, boolean r21) {
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
        r16 = this;
        r6 = r16;
        r7 = r17;
        r0 = r7.f13208t;
        r8 = 1;
        if (r0 == 0) goto L_0x0011;
    L_0x0009:
        r0 = r7.f13182J;
        if (r0 == 0) goto L_0x000e;
    L_0x000d:
        goto L_0x0011;
    L_0x000e:
        r0 = r18;
        goto L_0x0016;
    L_0x0011:
        r0 = r18;
        if (r0 <= r8) goto L_0x0016;
    L_0x0015:
        r0 = r8;
    L_0x0016:
        r1 = r7.f13209u;
        if (r1 == 0) goto L_0x002c;
    L_0x001a:
        r1 = r7.f13199k;
        if (r0 <= r1) goto L_0x002c;
    L_0x001e:
        r0 = r7.f13199k;
        if (r0 != 0) goto L_0x002a;
    L_0x0022:
        r0 = r17.m8908i();
        if (r0 == 0) goto L_0x002a;
    L_0x0028:
        r0 = r8;
        goto L_0x002c;
    L_0x002a:
        r0 = r7.f13199k;
    L_0x002c:
        r1 = r7.f13191S;
        r9 = 4;
        r10 = 3;
        if (r1 == 0) goto L_0x003a;
    L_0x0032:
        r1 = r7.f13199k;
        if (r1 >= r9) goto L_0x003a;
    L_0x0036:
        if (r0 <= r10) goto L_0x003a;
    L_0x0038:
        r11 = r10;
        goto L_0x003b;
    L_0x003a:
        r11 = r0;
    L_0x003b:
        r0 = r7.f13199k;
        r12 = 2;
        r13 = -1;
        r14 = 0;
        r15 = 0;
        if (r0 > r11) goto L_0x0327;
    L_0x0043:
        r0 = r7.f13210v;
        if (r0 == 0) goto L_0x004c;
    L_0x0047:
        r0 = r7.f13211w;
        if (r0 != 0) goto L_0x004c;
    L_0x004b:
        return;
    L_0x004c:
        r0 = r17.m8870J();
        if (r0 != 0) goto L_0x0058;
    L_0x0052:
        r0 = r17.m8871K();
        if (r0 == 0) goto L_0x006a;
    L_0x0058:
        r7.m8887a(r14);
        r7.m8880a(r14);
        r2 = r17.m8872L();
        r3 = 0;
        r4 = 0;
        r5 = 1;
        r0 = r6;
        r1 = r7;
        r0.m9042a(r1, r2, r3, r4, r5);
    L_0x006a:
        r0 = r7.f13199k;
        switch(r0) {
            case 0: goto L_0x0071;
            case 1: goto L_0x0186;
            case 2: goto L_0x02df;
            case 3: goto L_0x02e3;
            case 4: goto L_0x0302;
            default: goto L_0x006f;
        };
    L_0x006f:
        goto L_0x0626;
    L_0x0071:
        if (r11 <= 0) goto L_0x0186;
    L_0x0073:
        r0 = f13284a;
        if (r0 == 0) goto L_0x008a;
    L_0x0077:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r2 = "moveto CREATED: ";
        r1.<init>(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x008a:
        r0 = r7.f13200l;
        if (r0 == 0) goto L_0x00d0;
    L_0x008e:
        r0 = r7.f13200l;
        r1 = r6.f13302m;
        r1 = r1.f13261c;
        r1 = r1.getClassLoader();
        r0.setClassLoader(r1);
        r0 = r7.f13200l;
        r1 = "android:view_state";
        r0 = r0.getSparseParcelableArray(r1);
        r7.f13201m = r0;
        r0 = r7.f13200l;
        r1 = "android:target_state";
        r0 = r6.mo252a(r0, r1);
        r7.f13205q = r0;
        r0 = r7.f13205q;
        if (r0 == 0) goto L_0x00bd;
    L_0x00b3:
        r0 = r7.f13200l;
        r1 = "android:target_req_state";
        r0 = r0.getInt(r1, r15);
        r7.f13207s = r0;
    L_0x00bd:
        r0 = r7.f13200l;
        r1 = "android:user_visible_hint";
        r0 = r0.getBoolean(r1, r8);
        r7.f13192T = r0;
        r0 = r7.f13192T;
        if (r0 != 0) goto L_0x00d0;
    L_0x00cb:
        r7.f13191S = r8;
        if (r11 <= r10) goto L_0x00d0;
    L_0x00cf:
        r11 = r10;
    L_0x00d0:
        r0 = r6.f13302m;
        r7.f13174B = r0;
        r0 = r6.f13304o;
        r7.f13177E = r0;
        r0 = r6.f13304o;
        if (r0 == 0) goto L_0x00e1;
    L_0x00dc:
        r0 = r6.f13304o;
        r0 = r0.f13175C;
        goto L_0x00e5;
    L_0x00e1:
        r0 = r6.f13302m;
        r0 = r0.f13264f;
    L_0x00e5:
        r7.f13173A = r0;
        r0 = r7.f13205q;
        if (r0 == 0) goto L_0x012c;
    L_0x00eb:
        r0 = r6.f13295f;
        r1 = r7.f13205q;
        r1 = r1.f13202n;
        r0 = r0.get(r1);
        r1 = r7.f13205q;
        if (r0 == r1) goto L_0x011c;
    L_0x00f9:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Fragment ";
        r1.<init>(r2);
        r1.append(r7);
        r2 = " declared target fragment ";
        r1.append(r2);
        r2 = r7.f13205q;
        r1.append(r2);
        r2 = " that does not belong to this FragmentManager!";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x011c:
        r0 = r7.f13205q;
        r0 = r0.f13199k;
        if (r0 > 0) goto L_0x012c;
    L_0x0122:
        r1 = r7.f13205q;
        r2 = 1;
        r3 = 0;
        r4 = 0;
        r5 = 1;
        r0 = r6;
        r0.m9042a(r1, r2, r3, r4, r5);
    L_0x012c:
        r0 = r6.f13302m;
        r0 = r0.f13261c;
        r6.m8995a(r7, r0, r15);
        r7.f13187O = r15;
        r0 = r6.f13302m;
        r0 = r0.f13261c;
        r7.mo2528a(r0);
        r0 = r7.f13187O;
        if (r0 != 0) goto L_0x0159;
    L_0x0140:
        r0 = new android.support.v4.app.al;
        r1 = new java.lang.StringBuilder;
        r2 = "Fragment ";
        r1.<init>(r2);
        r1.append(r7);
        r2 = " did not call through to super.onAttach()";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0159:
        r0 = r7.f13177E;
        if (r0 == 0) goto L_0x0162;
    L_0x015d:
        r0 = r7.f13177E;
        android.support.v4.app.Fragment.m8857s();
    L_0x0162:
        r0 = r6.f13302m;
        r0 = r0.f13261c;
        r6.m9006b(r7, r0, r15);
        r0 = r7.ac;
        if (r0 != 0) goto L_0x017d;
    L_0x016d:
        r0 = r7.f13200l;
        r6.m8996a(r7, r0, r15);
        r0 = r7.f13200l;
        r7.m8906h(r0);
        r0 = r7.f13200l;
        r6.m9007b(r7, r0, r15);
        goto L_0x0184;
    L_0x017d:
        r0 = r7.f13200l;
        r7.m8904g(r0);
        r7.f13199k = r8;
    L_0x0184:
        r7.f13184L = r15;
    L_0x0186:
        r0 = r7.f13210v;
        r1 = 8;
        if (r0 == 0) goto L_0x01c5;
    L_0x018c:
        r0 = r7.f13213y;
        if (r0 != 0) goto L_0x01c5;
    L_0x0190:
        r0 = r7.f13200l;
        r0 = r7.m8901f(r0);
        r2 = r7.f13200l;
        r0 = r7.m8891b(r0, r14, r2);
        r7.f13189Q = r0;
        r0 = r7.f13189Q;
        if (r0 == 0) goto L_0x01c3;
    L_0x01a2:
        r0 = r7.f13189Q;
        r7.f13190R = r0;
        r0 = r7.f13189Q;
        r0.setSaveFromParentEnabled(r15);
        r0 = r7.f13181I;
        if (r0 == 0) goto L_0x01b4;
    L_0x01af:
        r0 = r7.f13189Q;
        r0.setVisibility(r1);
    L_0x01b4:
        r0 = r7.f13189Q;
        r2 = r7.f13200l;
        r7.mo3453a(r0, r2);
        r0 = r7.f13189Q;
        r2 = r7.f13200l;
        r6.m8997a(r7, r0, r2, r15);
        goto L_0x01c5;
    L_0x01c3:
        r7.f13190R = r14;
    L_0x01c5:
        if (r11 <= r8) goto L_0x02df;
    L_0x01c7:
        r0 = f13284a;
        if (r0 == 0) goto L_0x01de;
    L_0x01cb:
        r0 = "FragmentManager";
        r2 = new java.lang.StringBuilder;
        r3 = "moveto ACTIVITY_CREATED: ";
        r2.<init>(r3);
        r2.append(r7);
        r2 = r2.toString();
        android.util.Log.v(r0, r2);
    L_0x01de:
        r0 = r7.f13210v;
        if (r0 != 0) goto L_0x029f;
    L_0x01e2:
        r0 = r7.f13179G;
        if (r0 == 0) goto L_0x024f;
    L_0x01e6:
        r0 = r7.f13179G;
        if (r0 != r13) goto L_0x0205;
    L_0x01ea:
        r0 = new java.lang.IllegalArgumentException;
        r2 = new java.lang.StringBuilder;
        r3 = "Cannot create fragment ";
        r2.<init>(r3);
        r2.append(r7);
        r3 = " for a container view with no id";
        r2.append(r3);
        r2 = r2.toString();
        r0.<init>(r2);
        r6.m9003a(r0);
    L_0x0205:
        r0 = r6.f13303n;
        r2 = r7.f13179G;
        r0 = r0.mo222a(r2);
        r0 = (android.view.ViewGroup) r0;
        if (r0 != 0) goto L_0x0250;
    L_0x0211:
        r2 = r7.f13212x;
        if (r2 != 0) goto L_0x0250;
    L_0x0215:
        r2 = r17.m8912l();	 Catch:{ NotFoundException -> 0x0220 }
        r3 = r7.f13179G;	 Catch:{ NotFoundException -> 0x0220 }
        r2 = r2.getResourceName(r3);	 Catch:{ NotFoundException -> 0x0220 }
        goto L_0x0222;
    L_0x0220:
        r2 = "unknown";
    L_0x0222:
        r3 = new java.lang.IllegalArgumentException;
        r4 = new java.lang.StringBuilder;
        r5 = "No view found for id 0x";
        r4.<init>(r5);
        r5 = r7.f13179G;
        r5 = java.lang.Integer.toHexString(r5);
        r4.append(r5);
        r5 = " (";
        r4.append(r5);
        r4.append(r2);
        r2 = ") for fragment ";
        r4.append(r2);
        r4.append(r7);
        r2 = r4.toString();
        r3.<init>(r2);
        r6.m9003a(r3);
        goto L_0x0250;
    L_0x024f:
        r0 = r14;
    L_0x0250:
        r7.f13188P = r0;
        r2 = r7.f13200l;
        r2 = r7.m8901f(r2);
        r3 = r7.f13200l;
        r2 = r7.m8891b(r2, r0, r3);
        r7.f13189Q = r2;
        r2 = r7.f13189Q;
        if (r2 == 0) goto L_0x029d;
    L_0x0264:
        r2 = r7.f13189Q;
        r7.f13190R = r2;
        r2 = r7.f13189Q;
        r2.setSaveFromParentEnabled(r15);
        if (r0 == 0) goto L_0x0274;
    L_0x026f:
        r2 = r7.f13189Q;
        r0.addView(r2);
    L_0x0274:
        r0 = r7.f13181I;
        if (r0 == 0) goto L_0x027d;
    L_0x0278:
        r0 = r7.f13189Q;
        r0.setVisibility(r1);
    L_0x027d:
        r0 = r7.f13189Q;
        r1 = r7.f13200l;
        r7.mo3453a(r0, r1);
        r0 = r7.f13189Q;
        r1 = r7.f13200l;
        r6.m8997a(r7, r0, r1, r15);
        r0 = r7.f13189Q;
        r0 = r0.getVisibility();
        if (r0 != 0) goto L_0x0299;
    L_0x0293:
        r0 = r7.f13188P;
        if (r0 == 0) goto L_0x0299;
    L_0x0297:
        r0 = r8;
        goto L_0x029a;
    L_0x0299:
        r0 = r15;
    L_0x029a:
        r7.f13197Y = r0;
        goto L_0x029f;
    L_0x029d:
        r7.f13190R = r14;
    L_0x029f:
        r0 = r7.f13200l;
        r7.m8907i(r0);
        r0 = r7.f13200l;
        r6.m9012c(r7, r0, r15);
        r0 = r7.f13189Q;
        if (r0 == 0) goto L_0x02dd;
    L_0x02ad:
        r0 = r7.f13200l;
        r0 = r7.f13201m;
        if (r0 == 0) goto L_0x02bc;
    L_0x02b3:
        r0 = r7.f13190R;
        r1 = r7.f13201m;
        r0.restoreHierarchyState(r1);
        r7.f13201m = r14;
    L_0x02bc:
        r7.f13187O = r15;
        r7.f13187O = r8;
        r0 = r7.f13187O;
        if (r0 != 0) goto L_0x02dd;
    L_0x02c4:
        r0 = new android.support.v4.app.al;
        r1 = new java.lang.StringBuilder;
        r2 = "Fragment ";
        r1.<init>(r2);
        r1.append(r7);
        r2 = " did not call through to super.onViewStateRestored()";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x02dd:
        r7.f13200l = r14;
    L_0x02df:
        if (r11 <= r12) goto L_0x02e3;
    L_0x02e1:
        r7.f13199k = r10;
    L_0x02e3:
        if (r11 <= r10) goto L_0x0302;
    L_0x02e5:
        r0 = f13284a;
        if (r0 == 0) goto L_0x02fc;
    L_0x02e9:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r2 = "moveto STARTED: ";
        r1.<init>(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x02fc:
        r17.m8861A();
        r6.m9008b(r7, r15);
    L_0x0302:
        if (r11 <= r9) goto L_0x0626;
    L_0x0304:
        r0 = f13284a;
        if (r0 == 0) goto L_0x031b;
    L_0x0308:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r2 = "moveto RESUMED: ";
        r1.<init>(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x031b:
        r17.m8862B();
        r6.m9013c(r7, r15);
        r7.f13200l = r14;
        r7.f13201m = r14;
        goto L_0x0626;
    L_0x0327:
        r0 = r7.f13199k;
        if (r0 <= r11) goto L_0x0626;
    L_0x032b:
        r0 = r7.f13199k;
        switch(r0) {
            case 1: goto L_0x04e6;
            case 2: goto L_0x03ef;
            case 3: goto L_0x03d3;
            case 4: goto L_0x0383;
            case 5: goto L_0x0332;
            default: goto L_0x0330;
        };
    L_0x0330:
        goto L_0x0626;
    L_0x0332:
        r0 = 5;
        if (r11 >= r0) goto L_0x0383;
    L_0x0335:
        r0 = f13284a;
        if (r0 == 0) goto L_0x034c;
    L_0x0339:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r2 = "movefrom RESUMED: ";
        r1.<init>(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x034c:
        r0 = r7.ad;
        r1 = android.arch.lifecycle.C0093d.C0091a.ON_PAUSE;
        r0.m8543a(r1);
        r0 = r7.f13175C;
        if (r0 == 0) goto L_0x035c;
    L_0x0357:
        r0 = r7.f13175C;
        r0.m9065d(r9);
    L_0x035c:
        r7.f13199k = r9;
        r7.f13187O = r15;
        r17.mo2480a();
        r0 = r7.f13187O;
        if (r0 != 0) goto L_0x0380;
    L_0x0367:
        r0 = new android.support.v4.app.al;
        r1 = new java.lang.StringBuilder;
        r2 = "Fragment ";
        r1.<init>(r2);
        r1.append(r7);
        r2 = " did not call through to super.onPause()";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0380:
        r6.m9016d(r7, r15);
    L_0x0383:
        if (r11 >= r9) goto L_0x03d3;
    L_0x0385:
        r0 = f13284a;
        if (r0 == 0) goto L_0x039c;
    L_0x0389:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r2 = "movefrom STARTED: ";
        r1.<init>(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x039c:
        r0 = r7.ad;
        r1 = android.arch.lifecycle.C0093d.C0091a.ON_STOP;
        r0.m8543a(r1);
        r0 = r7.f13175C;
        if (r0 == 0) goto L_0x03ac;
    L_0x03a7:
        r0 = r7.f13175C;
        r0.m9085s();
    L_0x03ac:
        r7.f13199k = r10;
        r7.f13187O = r15;
        r17.mo2481b();
        r0 = r7.f13187O;
        if (r0 != 0) goto L_0x03d0;
    L_0x03b7:
        r0 = new android.support.v4.app.al;
        r1 = new java.lang.StringBuilder;
        r2 = "Fragment ";
        r1.<init>(r2);
        r1.append(r7);
        r2 = " did not call through to super.onStop()";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x03d0:
        r6.m9018e(r7, r15);
    L_0x03d3:
        if (r11 >= r10) goto L_0x03ef;
    L_0x03d5:
        r0 = f13284a;
        if (r0 == 0) goto L_0x03ec;
    L_0x03d9:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r2 = "movefrom STOPPED: ";
        r1.<init>(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x03ec:
        r17.m8863C();
    L_0x03ef:
        if (r11 >= r12) goto L_0x04e6;
    L_0x03f1:
        r0 = f13284a;
        if (r0 == 0) goto L_0x0408;
    L_0x03f5:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r2 = "movefrom ACTIVITY_CREATED: ";
        r1.<init>(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0408:
        r0 = r7.f13189Q;
        if (r0 == 0) goto L_0x041b;
    L_0x040c:
        r0 = r6.f13302m;
        r0 = r0.mo2539b();
        if (r0 == 0) goto L_0x041b;
    L_0x0414:
        r0 = r7.f13201m;
        if (r0 != 0) goto L_0x041b;
    L_0x0418:
        r16.m9025l(r17);
    L_0x041b:
        r0 = r7.f13175C;
        if (r0 == 0) goto L_0x0424;
    L_0x041f:
        r0 = r7.f13175C;
        r0.m9065d(r8);
    L_0x0424:
        r7.f13199k = r8;
        r7.f13187O = r15;
        r17.mo2536h();
        r0 = r7.f13187O;
        if (r0 != 0) goto L_0x0448;
    L_0x042f:
        r0 = new android.support.v4.app.al;
        r1 = new java.lang.StringBuilder;
        r2 = "Fragment ";
        r1.<init>(r2);
        r1.append(r7);
        r2 = " did not call through to super.onDestroyView()";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0448:
        r0 = r7.f13193U;
        if (r0 == 0) goto L_0x0451;
    L_0x044c:
        r0 = r7.f13193U;
        r0.m9126f();
    L_0x0451:
        r7.f13213y = r15;
        r6.m9020f(r7, r15);
        r0 = r7.f13189Q;
        if (r0 == 0) goto L_0x04de;
    L_0x045a:
        r0 = r7.f13188P;
        if (r0 == 0) goto L_0x04de;
    L_0x045e:
        r0 = r7.f13189Q;
        r0.clearAnimation();
        r0 = r7.f13188P;
        r1 = r7.f13189Q;
        r0.endViewTransition(r1);
        r0 = r6.f13301l;
        r1 = 0;
        if (r0 <= 0) goto L_0x048a;
    L_0x046f:
        r0 = r6.f13308t;
        if (r0 != 0) goto L_0x048a;
    L_0x0473:
        r0 = r7.f13189Q;
        r0 = r0.getVisibility();
        if (r0 != 0) goto L_0x048a;
    L_0x047b:
        r0 = r7.aa;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 < 0) goto L_0x048a;
    L_0x0481:
        r0 = r19;
        r2 = r20;
        r0 = r6.m8992a(r7, r0, r15, r2);
        goto L_0x048b;
    L_0x048a:
        r0 = r14;
    L_0x048b:
        r7.aa = r1;
        if (r0 == 0) goto L_0x04d7;
    L_0x048f:
        r1 = r7.f13189Q;
        r7.e_(r11);
        r2 = r0.f1434a;
        if (r2 == 0) goto L_0x04b4;
    L_0x0498:
        r2 = r0.f1434a;
        r3 = r7.f13189Q;
        r7.m8887a(r3);
        r3 = android.support.v4.app.C4783l.m8993a(r2);
        r4 = new android.support.v4.app.l$2;
        r4.<init>(r6, r3, r7);
        r2.setAnimationListener(r4);
        android.support.v4.app.C4783l.m9002a(r1, r0);
        r0 = r7.f13189Q;
        r0.startAnimation(r2);
        goto L_0x04d7;
    L_0x04b4:
        r2 = r0.f1435b;
        r3 = r0.f1435b;
        r7.m8880a(r3);
        r3 = r7.f13188P;
        if (r3 == 0) goto L_0x04c2;
    L_0x04bf:
        r3.startViewTransition(r1);
    L_0x04c2:
        r4 = new android.support.v4.app.l$3;
        r4.<init>(r6, r3, r1, r7);
        r2.addListener(r4);
        r1 = r7.f13189Q;
        r2.setTarget(r1);
        r1 = r7.f13189Q;
        android.support.v4.app.C4783l.m9002a(r1, r0);
        r2.start();
    L_0x04d7:
        r0 = r7.f13188P;
        r1 = r7.f13189Q;
        r0.removeView(r1);
    L_0x04de:
        r7.f13188P = r14;
        r7.f13189Q = r14;
        r7.f13190R = r14;
        r7.f13211w = r15;
    L_0x04e6:
        if (r11 > 0) goto L_0x0626;
    L_0x04e8:
        r0 = r6.f13308t;
        if (r0 == 0) goto L_0x050d;
    L_0x04ec:
        r0 = r17.m8870J();
        if (r0 == 0) goto L_0x04fd;
    L_0x04f2:
        r0 = r17.m8870J();
        r7.m8887a(r14);
        r0.clearAnimation();
        goto L_0x050d;
    L_0x04fd:
        r0 = r17.m8871K();
        if (r0 == 0) goto L_0x050d;
    L_0x0503:
        r0 = r17.m8871K();
        r7.m8880a(r14);
        r0.cancel();
    L_0x050d:
        r0 = r17.m8870J();
        if (r0 != 0) goto L_0x0622;
    L_0x0513:
        r0 = r17.m8871K();
        if (r0 == 0) goto L_0x051b;
    L_0x0519:
        goto L_0x0622;
    L_0x051b:
        r0 = f13284a;
        if (r0 == 0) goto L_0x0532;
    L_0x051f:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r2 = "movefrom CREATED: ";
        r1.<init>(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0532:
        r0 = r7.f13184L;
        if (r0 != 0) goto L_0x0572;
    L_0x0536:
        r0 = r7.ad;
        r1 = android.arch.lifecycle.C0093d.C0091a.ON_DESTROY;
        r0.m8543a(r1);
        r0 = r7.f13175C;
        if (r0 == 0) goto L_0x0546;
    L_0x0541:
        r0 = r7.f13175C;
        r0.m9086t();
    L_0x0546:
        r7.f13199k = r15;
        r7.f13187O = r15;
        r7.ac = r15;
        r17.mo2482c();
        r0 = r7.f13187O;
        if (r0 != 0) goto L_0x056c;
    L_0x0553:
        r0 = new android.support.v4.app.al;
        r1 = new java.lang.StringBuilder;
        r2 = "Fragment ";
        r1.<init>(r2);
        r1.append(r7);
        r2 = " did not call through to super.onDestroy()";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x056c:
        r7.f13175C = r14;
        r6.m9022g(r7, r15);
        goto L_0x0574;
    L_0x0572:
        r7.f13199k = r15;
    L_0x0574:
        r7.f13187O = r15;
        r17.mo2534f();
        r7.ab = r14;
        r0 = r7.f13187O;
        if (r0 != 0) goto L_0x0598;
    L_0x057f:
        r0 = new android.support.v4.app.al;
        r1 = new java.lang.StringBuilder;
        r2 = "Fragment ";
        r1.<init>(r2);
        r1.append(r7);
        r2 = " did not call through to super.onDetach()";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0598:
        r0 = r7.f13175C;
        if (r0 == 0) goto L_0x05c0;
    L_0x059c:
        r0 = r7.f13184L;
        if (r0 != 0) goto L_0x05b9;
    L_0x05a0:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Child FragmentManager of ";
        r1.<init>(r2);
        r1.append(r7);
        r2 = " was not  destroyed and this fragment is not retaining instance";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x05b9:
        r0 = r7.f13175C;
        r0.m9086t();
        r7.f13175C = r14;
    L_0x05c0:
        r6.m9023h(r7, r15);
        if (r21 != 0) goto L_0x0626;
    L_0x05c5:
        r0 = r7.f13184L;
        if (r0 != 0) goto L_0x061b;
    L_0x05c9:
        r0 = r7.f13202n;
        if (r0 < 0) goto L_0x0626;
    L_0x05cd:
        r0 = f13284a;
        if (r0 == 0) goto L_0x05e4;
    L_0x05d1:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r2 = "Freeing fragment index ";
        r1.<init>(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x05e4:
        r0 = r6.f13295f;
        r1 = r7.f13202n;
        r0.put(r1, r14);
        r0 = r6.f13302m;
        r1 = r7.f13203o;
        r0.m8975a(r1);
        r7.f13202n = r13;
        r7.f13203o = r14;
        r7.f13208t = r15;
        r7.f13209u = r15;
        r7.f13210v = r15;
        r7.f13211w = r15;
        r7.f13212x = r15;
        r7.f13214z = r15;
        r7.f13173A = r14;
        r7.f13175C = r14;
        r7.f13174B = r14;
        r7.f13178F = r15;
        r7.f13179G = r15;
        r7.f13180H = r14;
        r7.f13181I = r15;
        r7.f13182J = r15;
        r7.f13184L = r15;
        r7.f13193U = r14;
        r7.f13194V = r15;
        r7.f13195W = r15;
        goto L_0x0626;
    L_0x061b:
        r7.f13174B = r14;
        r7.f13177E = r14;
        r7.f13173A = r14;
        goto L_0x0626;
    L_0x0622:
        r7.e_(r11);
        goto L_0x0627;
    L_0x0626:
        r8 = r11;
    L_0x0627:
        r0 = r7.f13199k;
        if (r0 == r8) goto L_0x0652;
    L_0x062b:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r2 = "moveToState: Fragment state for ";
        r1.<init>(r2);
        r1.append(r7);
        r2 = " not updated inline; expected state ";
        r1.append(r2);
        r1.append(r8);
        r2 = " found ";
        r1.append(r2);
        r2 = r7.f13199k;
        r1.append(r2);
        r1 = r1.toString();
        android.util.Log.w(r0, r1);
        r7.f13199k = r8;
    L_0x0652:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.l.a(android.support.v4.app.Fragment, int, int, int, boolean):void");
    }

    public final void m9043a(Fragment fragment, boolean z) {
        if (f13284a) {
            StringBuilder stringBuilder = new StringBuilder("add: ");
            stringBuilder.append(fragment);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        m9066d(fragment);
        if (!fragment.f13182J) {
            if (this.f13294e.contains(fragment)) {
                StringBuilder stringBuilder2 = new StringBuilder("Fragment already added: ");
                stringBuilder2.append(fragment);
                throw new IllegalStateException(stringBuilder2.toString());
            }
            synchronized (this.f13294e) {
                this.f13294e.add(fragment);
            }
            fragment.f13208t = true;
            fragment.f13209u = false;
            if (fragment.f13189Q == null) {
                fragment.f13198Z = false;
            }
            if (fragment.f13185M && fragment.f13186N) {
                this.f13306r = true;
            }
            if (z) {
                m9024k(fragment);
            }
        }
    }

    public final void m9044a(C4778j c4778j, C0386h c0386h, Fragment fragment) {
        if (this.f13302m != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f13302m = c4778j;
        this.f13303n = c0386h;
        this.f13304o = fragment;
    }

    public final void mo256a(C0389b c0389b) {
        this.f13290I.add(new C0478j(c0389b, Boolean.valueOf(true)));
    }

    public final void m9046a(C0399f c0399f, boolean z) {
        if (!z) {
            m9028w();
        }
        synchronized (this) {
            if (!this.f13308t) {
                if (this.f13302m != null) {
                    if (this.f13291b == null) {
                        this.f13291b = new ArrayList();
                    }
                    this.f13291b.add(c0399f);
                    m9029x();
                    return;
                }
            }
            if (z) {
                return;
            }
            throw new IllegalStateException("Activity has been destroyed");
        }
    }

    public final void mo257a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("    ");
        String stringBuilder2 = stringBuilder.toString();
        int i2 = 0;
        if (this.f13295f != null) {
            int size = this.f13295f.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.print("Active Fragments in ");
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                for (int i3 = 0; i3 < size; i3++) {
                    Fragment fragment = (Fragment) this.f13295f.valueAt(i3);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(fragment);
                    if (fragment != null) {
                        printWriter.print(stringBuilder2);
                        printWriter.print("mFragmentId=#");
                        printWriter.print(Integer.toHexString(fragment.f13178F));
                        printWriter.print(" mContainerId=#");
                        printWriter.print(Integer.toHexString(fragment.f13179G));
                        printWriter.print(" mTag=");
                        printWriter.println(fragment.f13180H);
                        printWriter.print(stringBuilder2);
                        printWriter.print("mState=");
                        printWriter.print(fragment.f13199k);
                        printWriter.print(" mIndex=");
                        printWriter.print(fragment.f13202n);
                        printWriter.print(" mWho=");
                        printWriter.print(fragment.f13203o);
                        printWriter.print(" mBackStackNesting=");
                        printWriter.println(fragment.f13214z);
                        printWriter.print(stringBuilder2);
                        printWriter.print("mAdded=");
                        printWriter.print(fragment.f13208t);
                        printWriter.print(" mRemoving=");
                        printWriter.print(fragment.f13209u);
                        printWriter.print(" mFromLayout=");
                        printWriter.print(fragment.f13210v);
                        printWriter.print(" mInLayout=");
                        printWriter.println(fragment.f13211w);
                        printWriter.print(stringBuilder2);
                        printWriter.print("mHidden=");
                        printWriter.print(fragment.f13181I);
                        printWriter.print(" mDetached=");
                        printWriter.print(fragment.f13182J);
                        printWriter.print(" mMenuVisible=");
                        printWriter.print(fragment.f13186N);
                        printWriter.print(" mHasMenu=");
                        printWriter.println(fragment.f13185M);
                        printWriter.print(stringBuilder2);
                        printWriter.print("mRetainInstance=");
                        printWriter.print(fragment.f13183K);
                        printWriter.print(" mRetaining=");
                        printWriter.print(fragment.f13184L);
                        printWriter.print(" mUserVisibleHint=");
                        printWriter.println(fragment.f13192T);
                        if (fragment.f13173A != null) {
                            printWriter.print(stringBuilder2);
                            printWriter.print("mFragmentManager=");
                            printWriter.println(fragment.f13173A);
                        }
                        if (fragment.f13174B != null) {
                            printWriter.print(stringBuilder2);
                            printWriter.print("mHost=");
                            printWriter.println(fragment.f13174B);
                        }
                        if (fragment.f13177E != null) {
                            printWriter.print(stringBuilder2);
                            printWriter.print("mParentFragment=");
                            printWriter.println(fragment.f13177E);
                        }
                        if (fragment.f13204p != null) {
                            printWriter.print(stringBuilder2);
                            printWriter.print("mArguments=");
                            printWriter.println(fragment.f13204p);
                        }
                        if (fragment.f13200l != null) {
                            printWriter.print(stringBuilder2);
                            printWriter.print("mSavedFragmentState=");
                            printWriter.println(fragment.f13200l);
                        }
                        if (fragment.f13201m != null) {
                            printWriter.print(stringBuilder2);
                            printWriter.print("mSavedViewState=");
                            printWriter.println(fragment.f13201m);
                        }
                        if (fragment.f13205q != null) {
                            printWriter.print(stringBuilder2);
                            printWriter.print("mTarget=");
                            printWriter.print(fragment.f13205q);
                            printWriter.print(" mTargetRequestCode=");
                            printWriter.println(fragment.f13207s);
                        }
                        if (fragment.m8865E() != 0) {
                            printWriter.print(stringBuilder2);
                            printWriter.print("mNextAnim=");
                            printWriter.println(fragment.m8865E());
                        }
                        if (fragment.f13188P != null) {
                            printWriter.print(stringBuilder2);
                            printWriter.print("mContainer=");
                            printWriter.println(fragment.f13188P);
                        }
                        if (fragment.f13189Q != null) {
                            printWriter.print(stringBuilder2);
                            printWriter.print("mView=");
                            printWriter.println(fragment.f13189Q);
                        }
                        if (fragment.f13190R != null) {
                            printWriter.print(stringBuilder2);
                            printWriter.print("mInnerView=");
                            printWriter.println(fragment.f13189Q);
                        }
                        if (fragment.m8870J() != null) {
                            printWriter.print(stringBuilder2);
                            printWriter.print("mAnimatingAway=");
                            printWriter.println(fragment.m8870J());
                            printWriter.print(stringBuilder2);
                            printWriter.print("mStateAfterAnimating=");
                            printWriter.println(fragment.m8872L());
                        }
                        if (fragment.f13193U != null) {
                            printWriter.print(stringBuilder2);
                            printWriter.println("Loader Manager:");
                            C4787t c4787t = fragment.f13193U;
                            StringBuilder stringBuilder3 = new StringBuilder();
                            stringBuilder3.append(stringBuilder2);
                            stringBuilder3.append("  ");
                            c4787t.m9120a(stringBuilder3.toString(), fileDescriptor, printWriter, strArr);
                        }
                        if (fragment.f13175C != null) {
                            printWriter.print(stringBuilder2);
                            StringBuilder stringBuilder4 = new StringBuilder("Child ");
                            stringBuilder4.append(fragment.f13175C);
                            stringBuilder4.append(":");
                            printWriter.println(stringBuilder4.toString());
                            C4783l c4783l = fragment.f13175C;
                            stringBuilder4 = new StringBuilder();
                            stringBuilder4.append(stringBuilder2);
                            stringBuilder4.append("  ");
                            c4783l.mo257a(stringBuilder4.toString(), fileDescriptor, printWriter, strArr);
                        }
                    }
                }
            }
        }
        int size2 = this.f13294e.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (i = 0; i < size2; i++) {
                Fragment fragment2 = (Fragment) this.f13294e.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        if (this.f13297h != null) {
            size2 = this.f13297h.size();
            if (size2 > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (i = 0; i < size2; i++) {
                    fragment2 = (Fragment) this.f13297h.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(fragment2.toString());
                }
            }
        }
        if (this.f13296g != null) {
            size2 = this.f13296g.size();
            if (size2 > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (i = 0; i < size2; i++) {
                    C4777b c4777b = (C4777b) this.f13296g.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(c4777b.toString());
                    c4777b.m8956a(stringBuilder2, printWriter);
                }
            }
        }
        synchronized (this) {
            if (this.f13298i != null) {
                size2 = this.f13298i.size();
                if (size2 > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (i = 0; i < size2; i++) {
                        C4777b c4777b2 = (C4777b) this.f13298i.get(i);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i);
                        printWriter.print(": ");
                        printWriter.println(c4777b2);
                    }
                }
            }
            if (this.f13299j != null && this.f13299j.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f13299j.toArray()));
            }
        }
        if (this.f13291b != null) {
            size2 = this.f13291b.size();
            if (size2 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                while (i2 < size2) {
                    C0399f c0399f = (C0399f) this.f13291b.get(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.println(c0399f);
                    i2++;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f13302m);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f13303n);
        if (this.f13304o != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f13304o);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f13301l);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f13307s);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f13308t);
        if (this.f13306r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f13306r);
        }
        if (this.f13309u != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f13309u);
        }
    }

    final void m9048a(ArrayList<C4777b> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 != null) {
                if (arrayList.size() == arrayList2.size()) {
                    m9010b((ArrayList) arrayList, (ArrayList) arrayList2);
                    int size = arrayList.size();
                    int i = 0;
                    int i2 = 0;
                    while (i < size) {
                        if (!((C4777b) arrayList.get(i)).f13258u) {
                            if (i2 != i) {
                                m9004a((ArrayList) arrayList, (ArrayList) arrayList2, i2, i);
                            }
                            i2 = i + 1;
                            if (((Boolean) arrayList2.get(i)).booleanValue()) {
                                while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C4777b) arrayList.get(i2)).f13258u) {
                                    i2++;
                                }
                            }
                            m9004a((ArrayList) arrayList, (ArrayList) arrayList2, i, i2);
                            i = i2 - 1;
                        }
                        i++;
                    }
                    if (i2 != size) {
                        m9004a((ArrayList) arrayList, (ArrayList) arrayList2, i2, size);
                    }
                    return;
                }
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public final void m9049a(boolean z) {
        for (int size = this.f13294e.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f13294e.get(size);
            if (!(fragment == null || fragment.f13175C == null)) {
                fragment.f13175C.m9049a(z);
            }
        }
    }

    public final boolean m9050a(Menu menu) {
        int i = 0;
        boolean z = i;
        while (i < this.f13294e.size()) {
            Fragment fragment = (Fragment) this.f13294e.get(i);
            if (fragment != null) {
                int i2;
                if (fragment.f13181I) {
                    i2 = 0;
                } else {
                    int i3 = (fragment.f13185M && fragment.f13186N) ? 1 : 0;
                    i2 = fragment.f13175C != null ? fragment.f13175C.m9050a(menu) | i3 : i3;
                }
                if (i2 != 0) {
                    z = true;
                }
            }
            i++;
        }
        return z;
    }

    public final boolean m9051a(Menu menu, MenuInflater menuInflater) {
        int i = 0;
        boolean z = false;
        ArrayList arrayList = null;
        for (int i2 = z; i2 < this.f13294e.size(); i2++) {
            Fragment fragment = (Fragment) this.f13294e.get(i2);
            if (fragment != null) {
                int i3;
                if (fragment.f13181I) {
                    i3 = 0;
                } else {
                    if (fragment.f13185M && fragment.f13186N) {
                        fragment.mo3467a(menu, menuInflater);
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    if (fragment.f13175C != null) {
                        i3 |= fragment.f13175C.m9051a(menu, menuInflater);
                    }
                }
                if (i3 != 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(fragment);
                    z = true;
                }
            }
        }
        if (this.f13297h != null) {
            while (i < this.f13297h.size()) {
                Fragment fragment2 = (Fragment) this.f13297h.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    Fragment.m8860w();
                }
                i++;
            }
        }
        this.f13297h = arrayList;
        return z;
    }

    public final boolean m9052a(MenuItem menuItem) {
        for (int i = 0; i < this.f13294e.size(); i++) {
            Fragment fragment = (Fragment) this.f13294e.get(i);
            if (fragment != null) {
                boolean z;
                if (!fragment.f13181I) {
                    if (!(fragment.f13185M && fragment.f13186N && fragment.mo3468a(menuItem))) {
                        if (fragment.f13175C != null && fragment.f13175C.m9052a(menuItem)) {
                        }
                    }
                    z = true;
                    if (z) {
                        return true;
                    }
                }
                z = false;
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    final boolean m9053a(ArrayList<C4777b> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        if (this.f13296g == null) {
            return false;
        }
        int size;
        if (str == null && i < 0 && (i2 & 1) == 0) {
            size = this.f13296g.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f13296g.remove(size));
            arrayList2.add(Boolean.valueOf(true));
            return true;
        }
        int i3;
        if (str == null) {
            if (i < 0) {
                i3 = -1;
                if (i3 == this.f13296g.size() - 1) {
                    return false;
                }
                for (size = this.f13296g.size() - 1; size > i3; size--) {
                    arrayList.add(this.f13296g.remove(size));
                    arrayList2.add(Boolean.valueOf(true));
                }
                return true;
            }
        }
        i3 = this.f13296g.size() - 1;
        while (i3 >= 0) {
            C4777b c4777b = (C4777b) this.f13296g.get(i3);
            if ((str != null && str.equals(c4777b.f13249l)) || (i >= 0 && i == c4777b.f13251n)) {
                break;
            }
            i3--;
        }
        if (i3 < 0) {
            return false;
        }
        if ((i2 & 1) != 0) {
            while (true) {
                i3--;
                if (i3 < 0) {
                    break;
                }
                C4777b c4777b2 = (C4777b) this.f13296g.get(i3);
                if (str == null || !str.equals(c4777b2.f13249l)) {
                    if (i < 0 || i != c4777b2.f13251n) {
                        break;
                    }
                }
            }
        }
        if (i3 == this.f13296g.size() - 1) {
            return false;
        }
        for (size = this.f13296g.size() - 1; size > i3; size--) {
            arrayList.add(this.f13296g.remove(size));
            arrayList2.add(Boolean.valueOf(true));
        }
        return true;
    }

    public final Fragment m9054b(String str) {
        if (!(this.f13295f == null || str == null)) {
            for (int size = this.f13295f.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f13295f.valueAt(size);
                if (fragment != null) {
                    if (!str.equals(fragment.f13203o)) {
                        fragment = fragment.f13175C != null ? fragment.f13175C.m9054b(str) : null;
                    }
                    if (fragment != null) {
                        return fragment;
                    }
                }
            }
        }
        return null;
    }

    public final void mo258b(int i) {
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder("Bad id: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        m9046a(new C4781g(this, i), false);
    }

    public final void m9056b(Fragment fragment) {
        if (fragment.f13191S) {
            if (this.f13292c) {
                this.f13310v = true;
                return;
            }
            fragment.f13191S = false;
            m9042a(fragment, this.f13301l, 0, 0, false);
        }
    }

    public final void m9057b(Menu menu) {
        for (int i = 0; i < this.f13294e.size(); i++) {
            Fragment fragment = (Fragment) this.f13294e.get(i);
            if (!(fragment == null || fragment.f13181I || fragment.f13175C == null)) {
                fragment.f13175C.m9057b(menu);
            }
        }
    }

    public final void m9058b(boolean z) {
        for (int size = this.f13294e.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f13294e.get(size);
            if (!(fragment == null || fragment.f13175C == null)) {
                fragment.f13175C.m9058b(z);
            }
        }
    }

    public final boolean mo259b() {
        boolean j = m9076j();
        m9030y();
        return j;
    }

    public final boolean m9060b(MenuItem menuItem) {
        for (int i = 0; i < this.f13294e.size(); i++) {
            Fragment fragment = (Fragment) this.f13294e.get(i);
            if (fragment != null) {
                boolean z = (fragment.f13181I || fragment.f13175C == null || !fragment.f13175C.m9060b(menuItem)) ? false : true;
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final C0388a mo260c(int i) {
        return (C0388a) this.f13296g.get(i);
    }

    final void m9062c(final Fragment fragment) {
        if (fragment != null) {
            ViewGroup viewGroup;
            C0396c a;
            int i = this.f13301l;
            if (fragment.f13209u) {
                i = fragment.m8908i() ? Math.min(i, 1) : Math.min(i, 0);
            }
            m9042a(fragment, i, fragment.m8866F(), fragment.m8867G(), false);
            if (fragment.f13189Q != null) {
                ViewGroup viewGroup2 = fragment.f13188P;
                View view = fragment.f13189Q;
                Fragment fragment2 = null;
                if (viewGroup2 != null) {
                    if (view != null) {
                        for (int indexOf = this.f13294e.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                            Fragment fragment3 = (Fragment) this.f13294e.get(indexOf);
                            if (fragment3.f13188P == viewGroup2 && fragment3.f13189Q != null) {
                                fragment2 = fragment3;
                                break;
                            }
                        }
                    }
                }
                if (fragment2 != null) {
                    View view2 = fragment2.f13189Q;
                    viewGroup = fragment.f13188P;
                    i = viewGroup.indexOfChild(view2);
                    int indexOfChild = viewGroup.indexOfChild(fragment.f13189Q);
                    if (indexOfChild < i) {
                        viewGroup.removeViewAt(indexOfChild);
                        viewGroup.addView(fragment.f13189Q, i);
                    }
                }
                if (fragment.f13197Y && fragment.f13188P != null) {
                    if (fragment.aa > 0.0f) {
                        fragment.f13189Q.setAlpha(fragment.aa);
                    }
                    fragment.aa = 0.0f;
                    fragment.f13197Y = false;
                    a = m8992a(fragment, fragment.m8866F(), true, fragment.m8867G());
                    if (a != null) {
                        C4783l.m9002a(fragment.f13189Q, a);
                        if (a.f1434a != null) {
                            fragment.f13189Q.startAnimation(a.f1434a);
                        } else {
                            a.f1435b.setTarget(fragment.f13189Q);
                            a.f1435b.start();
                        }
                    }
                }
            }
            if (fragment.f13198Z) {
                if (fragment.f13189Q != null) {
                    a = m8992a(fragment, fragment.m8866F(), fragment.f13181I ^ true, fragment.m8867G());
                    if (a == null || a.f1435b == null) {
                        if (a != null) {
                            C4783l.m9002a(fragment.f13189Q, a);
                            fragment.f13189Q.startAnimation(a.f1434a);
                            a.f1434a.start();
                        }
                        i = (!fragment.f13181I || fragment.m8874N()) ? 0 : 8;
                        fragment.f13189Q.setVisibility(i);
                        if (fragment.m8874N()) {
                            fragment.m8899d(false);
                        }
                    } else {
                        a.f1435b.setTarget(fragment.f13189Q);
                        if (!fragment.f13181I) {
                            fragment.f13189Q.setVisibility(0);
                        } else if (fragment.m8874N()) {
                            fragment.m8899d(false);
                        } else {
                            viewGroup = fragment.f13188P;
                            final View view3 = fragment.f13189Q;
                            viewGroup.startViewTransition(view3);
                            a.f1435b.addListener(new AnimatorListenerAdapter(this) {
                                final /* synthetic */ C4783l f1431d;

                                public final void onAnimationEnd(Animator animator) {
                                    viewGroup.endViewTransition(view3);
                                    animator.removeListener(this);
                                    if (fragment.f13189Q != null) {
                                        fragment.f13189Q.setVisibility(8);
                                    }
                                }
                            });
                        }
                        C4783l.m9002a(fragment.f13189Q, a);
                        a.f1435b.start();
                    }
                }
                if (fragment.f13208t && fragment.f13185M && fragment.f13186N) {
                    this.f13306r = true;
                }
                fragment.f13198Z = false;
                boolean z = fragment.f13181I;
                Fragment.m8854o();
            }
        }
    }

    public final boolean mo261c() {
        m9028w();
        return m9027v();
    }

    public final int mo262d() {
        return this.f13296g != null ? this.f13296g.size() : 0;
    }

    final void m9065d(int i) {
        try {
            this.f13292c = true;
            m9038a(i, false);
            m9076j();
        } finally {
            this.f13292c = false;
        }
    }

    final void m9066d(Fragment fragment) {
        if (fragment.f13202n < 0) {
            int i = this.f13293d;
            this.f13293d = i + 1;
            fragment.m8879a(i, this.f13304o);
            if (this.f13295f == null) {
                this.f13295f = new SparseArray();
            }
            this.f13295f.put(fragment.f13202n, fragment);
            if (f13284a) {
                StringBuilder stringBuilder = new StringBuilder("Allocated fragment index ");
                stringBuilder.append(fragment);
                Log.v("FragmentManager", stringBuilder.toString());
            }
        }
    }

    public final List<Fragment> mo263e() {
        if (this.f13294e.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        List<Fragment> list;
        synchronized (this.f13294e) {
            list = (List) this.f13294e.clone();
        }
        return list;
    }

    public final void m9068e(Fragment fragment) {
        if (f13284a) {
            StringBuilder stringBuilder = new StringBuilder("remove: ");
            stringBuilder.append(fragment);
            stringBuilder.append(" nesting=");
            stringBuilder.append(fragment.f13214z);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        int i = fragment.m8908i() ^ 1;
        if (!fragment.f13182J || i != 0) {
            synchronized (this.f13294e) {
                this.f13294e.remove(fragment);
            }
            if (fragment.f13185M && fragment.f13186N) {
                this.f13306r = true;
            }
            fragment.f13208t = false;
            fragment.f13209u = true;
        }
    }

    public final boolean mo264f() {
        return this.f13307s;
    }

    final void m9070g() {
        if (this.f13295f != null) {
            for (int i = 0; i < this.f13295f.size(); i++) {
                Fragment fragment = (Fragment) this.f13295f.valueAt(i);
                if (fragment != null) {
                    m9056b(fragment);
                }
            }
        }
    }

    final void m9071h() {
        if (this.f13292c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (Looper.myLooper() != this.f13302m.f13262d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else {
            if (this.f13311w == null) {
                this.f13311w = new ArrayList();
                this.f13312x = new ArrayList();
            }
            this.f13292c = true;
            try {
                m9010b(null, null);
            } finally {
                this.f13292c = false;
            }
        }
    }

    public final void m9072h(Fragment fragment) {
        if (f13284a) {
            StringBuilder stringBuilder = new StringBuilder("detach: ");
            stringBuilder.append(fragment);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        if (!fragment.f13182J) {
            fragment.f13182J = true;
            if (fragment.f13208t) {
                if (f13284a) {
                    StringBuilder stringBuilder2 = new StringBuilder("remove from detach: ");
                    stringBuilder2.append(fragment);
                    Log.v("FragmentManager", stringBuilder2.toString());
                }
                synchronized (this.f13294e) {
                    this.f13294e.remove(fragment);
                }
                if (fragment.f13185M && fragment.f13186N) {
                    this.f13306r = true;
                }
                fragment.f13208t = false;
            }
        }
    }

    final void m9073i() {
        this.f13292c = false;
        this.f13312x.clear();
        this.f13311w.clear();
    }

    public final void m9074i(Fragment fragment) {
        if (f13284a) {
            StringBuilder stringBuilder = new StringBuilder("attach: ");
            stringBuilder.append(fragment);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        if (fragment.f13182J) {
            fragment.f13182J = false;
            if (!fragment.f13208t) {
                if (this.f13294e.contains(fragment)) {
                    stringBuilder = new StringBuilder("Fragment already added: ");
                    stringBuilder.append(fragment);
                    throw new IllegalStateException(stringBuilder.toString());
                }
                if (f13284a) {
                    stringBuilder = new StringBuilder("add from attach: ");
                    stringBuilder.append(fragment);
                    Log.v("FragmentManager", stringBuilder.toString());
                }
                synchronized (this.f13294e) {
                    this.f13294e.add(fragment);
                }
                fragment.f13208t = true;
                if (fragment.f13185M && fragment.f13186N) {
                    this.f13306r = true;
                }
            }
        }
    }

    public final void m9075j(Fragment fragment) {
        if (fragment == null || (this.f13295f.get(fragment.f13202n) == fragment && (fragment.f13174B == null || fragment.f13173A == this))) {
            this.f13305p = fragment;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Fragment ");
        stringBuilder.append(fragment);
        stringBuilder.append(" is not an active fragment of FragmentManager ");
        stringBuilder.append(this);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final boolean m9076j() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.ssa.SSATransform.placePhi(SSATransform.java:82)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:50)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
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
        r4 = this;
        r4.m9071h();
        r0 = 1;
        r1 = 0;
    L_0x0005:
        r2 = r4.f13311w;
        r3 = r4.f13312x;
        r2 = r4.m9014c(r2, r3);
        if (r2 == 0) goto L_0x0022;
    L_0x000f:
        r4.f13292c = r0;
        r1 = r4.f13311w;	 Catch:{ all -> 0x001d }
        r2 = r4.f13312x;	 Catch:{ all -> 0x001d }
        r4.m9048a(r1, r2);	 Catch:{ all -> 0x001d }
        r4.m9073i();
        r1 = r0;
        goto L_0x0005;
    L_0x001d:
        r0 = move-exception;
        r4.m9073i();
        throw r0;
    L_0x0022:
        r4.m9077k();
        r4.m9079m();
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.l.j():boolean");
    }

    final void m9077k() {
        if (this.f13310v) {
            int i = 0;
            int i2 = i;
            while (i < this.f13295f.size()) {
                Fragment fragment = (Fragment) this.f13295f.valueAt(i);
                if (!(fragment == null || fragment.f13193U == null)) {
                    i2 |= fragment.f13193U.mo271b();
                }
                i++;
            }
            if (i2 == 0) {
                this.f13310v = false;
                m9070g();
            }
        }
    }

    final Parcelable m9078l() {
        m9030y();
        int i = 0;
        int size = this.f13295f == null ? 0 : this.f13295f.size();
        int i2 = 0;
        while (true) {
            BackStackState[] backStackStateArr = null;
            if (i2 >= size) {
                break;
            }
            Fragment fragment = (Fragment) this.f13295f.valueAt(i2);
            if (fragment != null) {
                if (fragment.m8870J() != null) {
                    int L = fragment.m8872L();
                    View J = fragment.m8870J();
                    fragment.m8887a(null);
                    Animation animation = J.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        J.clearAnimation();
                    }
                    m9042a(fragment, L, 0, 0, false);
                } else if (fragment.m8871K() != null) {
                    fragment.m8871K().end();
                }
            }
            i2++;
        }
        m9076j();
        this.f13307s = true;
        this.f13288C = null;
        if (this.f13295f == null || this.f13295f.size() <= 0) {
            return null;
        }
        i2 = this.f13295f.size();
        FragmentState[] fragmentStateArr = new FragmentState[i2];
        int i3 = 0;
        int i4 = i3;
        while (i3 < i2) {
            Fragment fragment2 = (Fragment) this.f13295f.valueAt(i3);
            if (fragment2 != null) {
                StringBuilder stringBuilder;
                if (fragment2.f13202n < 0) {
                    StringBuilder stringBuilder2 = new StringBuilder("Failure saving state: active ");
                    stringBuilder2.append(fragment2);
                    stringBuilder2.append(" has cleared index: ");
                    stringBuilder2.append(fragment2.f13202n);
                    m9003a(new IllegalStateException(stringBuilder2.toString()));
                }
                FragmentState fragmentState = new FragmentState(fragment2);
                fragmentStateArr[i3] = fragmentState;
                if (fragment2.f13199k <= 0 || fragmentState.f1380k != null) {
                    fragmentState.f1380k = fragment2.f13200l;
                } else {
                    fragmentState.f1380k = m9026m(fragment2);
                    if (fragment2.f13205q != null) {
                        if (fragment2.f13205q.f13202n < 0) {
                            stringBuilder = new StringBuilder("Failure saving state: ");
                            stringBuilder.append(fragment2);
                            stringBuilder.append(" has target not in fragment manager: ");
                            stringBuilder.append(fragment2.f13205q);
                            m9003a(new IllegalStateException(stringBuilder.toString()));
                        }
                        if (fragmentState.f1380k == null) {
                            fragmentState.f1380k = new Bundle();
                        }
                        mo255a(fragmentState.f1380k, "android:target_state", fragment2.f13205q);
                        if (fragment2.f13207s != 0) {
                            fragmentState.f1380k.putInt("android:target_req_state", fragment2.f13207s);
                        }
                    }
                }
                if (f13284a) {
                    stringBuilder = new StringBuilder("Saved state of ");
                    stringBuilder.append(fragment2);
                    stringBuilder.append(": ");
                    stringBuilder.append(fragmentState.f1380k);
                    Log.v("FragmentManager", stringBuilder.toString());
                }
                i4 = true;
            }
            i3++;
        }
        if (i4 == 0) {
            if (f13284a) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int[] iArr;
        size = this.f13294e.size();
        if (size > 0) {
            iArr = new int[size];
            for (i3 = 0; i3 < size; i3++) {
                StringBuilder stringBuilder3;
                iArr[i3] = ((Fragment) this.f13294e.get(i3)).f13202n;
                if (iArr[i3] < 0) {
                    stringBuilder3 = new StringBuilder("Failure saving state: active ");
                    stringBuilder3.append(this.f13294e.get(i3));
                    stringBuilder3.append(" has cleared index: ");
                    stringBuilder3.append(iArr[i3]);
                    m9003a(new IllegalStateException(stringBuilder3.toString()));
                }
                if (f13284a) {
                    stringBuilder3 = new StringBuilder("saveAllState: adding fragment #");
                    stringBuilder3.append(i3);
                    stringBuilder3.append(": ");
                    stringBuilder3.append(this.f13294e.get(i3));
                    Log.v("FragmentManager", stringBuilder3.toString());
                }
            }
        } else {
            iArr = null;
        }
        if (this.f13296g != null) {
            size = this.f13296g.size();
            if (size > 0) {
                backStackStateArr = new BackStackState[size];
                while (i < size) {
                    backStackStateArr[i] = new BackStackState((C4777b) this.f13296g.get(i));
                    if (f13284a) {
                        StringBuilder stringBuilder4 = new StringBuilder("saveAllState: adding back stack #");
                        stringBuilder4.append(i);
                        stringBuilder4.append(": ");
                        stringBuilder4.append(this.f13296g.get(i));
                        Log.v("FragmentManager", stringBuilder4.toString());
                    }
                    i++;
                }
            }
        }
        Parcelable fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f1365a = fragmentStateArr;
        fragmentManagerState.f1366b = iArr;
        fragmentManagerState.f1367c = backStackStateArr;
        if (this.f13305p != null) {
            fragmentManagerState.f1368d = this.f13305p.f13202n;
        }
        fragmentManagerState.f1369e = this.f13293d;
        m8988A();
        return fragmentManagerState;
    }

    final void m9079m() {
        if (this.f13295f != null) {
            for (int size = this.f13295f.size() - 1; size >= 0; size--) {
                if (this.f13295f.valueAt(size) == null) {
                    this.f13295f.delete(this.f13295f.keyAt(size));
                }
            }
        }
    }

    public final void m9080n() {
        this.f13288C = null;
        int i = 0;
        this.f13307s = false;
        int size = this.f13294e.size();
        while (i < size) {
            Fragment fragment = (Fragment) this.f13294e.get(i);
            if (!(fragment == null || fragment.f13175C == null)) {
                fragment.f13175C.m9080n();
            }
            i++;
        }
    }

    public final void m9081o() {
        this.f13307s = false;
        m9065d(1);
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C4783l c4783l = this;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet2.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, C0398e.f1437a);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!Fragment.m8852a(c4783l.f13302m.f13261c, str2)) {
            return null;
        }
        if (view != null) {
            i = view.getId();
        }
        if (i == -1 && resourceId == -1 && string == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(attributeSet.getPositionDescription());
            stringBuilder.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
            stringBuilder.append(str2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        Fragment fragment;
        Fragment a = resourceId != -1 ? mo251a(resourceId) : null;
        if (a == null && string != null) {
            a = mo253a(string);
        }
        if (a == null && i != -1) {
            a = mo251a(i);
        }
        if (f13284a) {
            StringBuilder stringBuilder2 = new StringBuilder("onCreateView: id=0x");
            stringBuilder2.append(Integer.toHexString(resourceId));
            stringBuilder2.append(" fname=");
            stringBuilder2.append(str2);
            stringBuilder2.append(" existing=");
            stringBuilder2.append(a);
            Log.v("FragmentManager", stringBuilder2.toString());
        }
        if (a == null) {
            Fragment a2 = c4783l.f13303n.mo221a(context2, str2, null);
            a2.f13210v = true;
            a2.f13178F = resourceId != 0 ? resourceId : i;
            a2.f13179G = i;
            a2.f13180H = string;
            a2.f13211w = true;
            a2.f13173A = c4783l;
            a2.f13174B = c4783l.f13302m;
            a2.m8885a(attributeSet2, a2.f13200l);
            m9043a(a2, true);
            fragment = a2;
        } else if (a.f13211w) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(attributeSet.getPositionDescription());
            stringBuilder.append(": Duplicate id 0x");
            stringBuilder.append(Integer.toHexString(resourceId));
            stringBuilder.append(", tag ");
            stringBuilder.append(string);
            stringBuilder.append(", or parent id 0x");
            stringBuilder.append(Integer.toHexString(i));
            stringBuilder.append(" with another fragment for ");
            stringBuilder.append(str2);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            a.f13211w = true;
            a.f13174B = c4783l.f13302m;
            if (!a.f13184L) {
                a.m8885a(attributeSet2, a.f13200l);
            }
            fragment = a;
        }
        if (c4783l.f13301l > 0 || !fragment.f13210v) {
            m9024k(fragment);
        } else {
            m9042a(fragment, 1, 0, 0, false);
        }
        if (fragment.f13189Q == null) {
            StringBuilder stringBuilder3 = new StringBuilder("Fragment ");
            stringBuilder3.append(str2);
            stringBuilder3.append(" did not create a view.");
            throw new IllegalStateException(stringBuilder3.toString());
        }
        if (resourceId != 0) {
            fragment.f13189Q.setId(resourceId);
        }
        if (fragment.f13189Q.getTag() == null) {
            fragment.f13189Q.setTag(string);
        }
        return fragment.f13189Q;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public final void m9082p() {
        this.f13307s = false;
        m9065d(2);
    }

    public final void m9083q() {
        this.f13307s = false;
        m9065d(4);
    }

    public final void m9084r() {
        this.f13307s = false;
        m9065d(5);
    }

    public final void m9085s() {
        this.f13307s = true;
        m9065d(3);
    }

    public final void m9086t() {
        this.f13308t = true;
        m9076j();
        m9065d(0);
        this.f13302m = null;
        this.f13303n = null;
        this.f13304o = null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("FragmentManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        C0466d.m980a(this.f13304o != null ? this.f13304o : this.f13302m, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    public final void m9087u() {
        for (int i = 0; i < this.f13294e.size(); i++) {
            Fragment fragment = (Fragment) this.f13294e.get(i);
            if (fragment != null) {
                fragment.onLowMemory();
                if (fragment.f13175C != null) {
                    fragment.f13175C.m9087u();
                }
            }
        }
    }
}
