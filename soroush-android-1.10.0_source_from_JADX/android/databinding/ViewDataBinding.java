package android.databinding;

import android.annotation.TargetApi;
import android.arch.lifecycle.C0093d.C0091a;
import android.arch.lifecycle.C0095f;
import android.arch.lifecycle.C0096g;
import android.arch.lifecycle.C0101l;
import android.arch.lifecycle.C0102m;
import android.arch.lifecycle.LiveData;
import android.databinding.C0128c.C0127a;
import android.databinding.C0133h.C0132a;
import android.databinding.C0135j.C0134a;
import android.databinding.C0137k.C0136a;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.p067a.p068a.p069a.C0966a.C0965a;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public abstract class ViewDataBinding extends C4693a {
    static int f17281a = VERSION.SDK_INT;
    private static final int f17282d = 8;
    private static final boolean f17283e = (f17281a >= 16);
    private static final C0119a f17284f = new C46841();
    private static final C0119a f17285g = new C46852();
    private static final C0119a f17286h = new C46863();
    private static final C0119a f17287i = new C46874();
    private static final C0127a<Object, ViewDataBinding, Void> f17288j = new C46885();
    private static final ReferenceQueue<ViewDataBinding> f17289k = new ReferenceQueue();
    private static final OnAttachStateChangeListener f17290l = (VERSION.SDK_INT < 19 ? null : new C01166());
    public final View f17291b;
    protected final C0130f f17292c;
    private final Runnable f17293m = new C01177(this);
    private boolean f17294n = false;
    private boolean f17295o = false;
    private C0122f[] f17296p;
    private C0128c<Object, ViewDataBinding, Void> f17297q;
    private boolean f17298r;
    private Choreographer f17299s;
    private final FrameCallback f17300t;
    private Handler f17301u;
    private ViewDataBinding f17302v;
    private C0096g f17303w;
    private boolean f17304x;

    static class C01166 implements OnAttachStateChangeListener {
        C01166() {
        }

        @TargetApi(19)
        public final void onViewAttachedToWindow(View view) {
            ViewDataBinding.m14833b(view).f17293m.run();
            view.removeOnAttachStateChangeListener(this);
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    class C01177 implements Runnable {
        final /* synthetic */ ViewDataBinding f396a;

        C01177(ViewDataBinding viewDataBinding) {
            this.f396a = viewDataBinding;
        }

        public final void run() {
            synchronized (this) {
                this.f396a.f17294n = false;
            }
            ViewDataBinding.m14836f();
            if (VERSION.SDK_INT < 19 || this.f396a.f17291b.isAttachedToWindow()) {
                this.f396a.m14843b();
                return;
            }
            this.f396a.f17291b.removeOnAttachStateChangeListener(ViewDataBinding.f17290l);
            this.f396a.f17291b.addOnAttachStateChangeListener(ViewDataBinding.f17290l);
        }
    }

    class C01188 implements FrameCallback {
        final /* synthetic */ ViewDataBinding f397a;

        C01188(ViewDataBinding viewDataBinding) {
            this.f397a = viewDataBinding;
        }

        public final void doFrame(long j) {
            this.f397a.f17293m.run();
        }
    }

    private interface C0119a {
        C0122f mo40a(ViewDataBinding viewDataBinding);
    }

    protected static class C0120b {
        public final String[][] f398a;
        public final int[][] f399b;
        public final int[][] f400c;
    }

    private interface C0121d<T> {
        void mo43a(C0096g c0096g);

        void mo44a(T t);

        void mo45b(T t);
    }

    private static class C0122f<T> extends WeakReference<ViewDataBinding> {
        final C0121d<T> f401a;
        protected final int f402b = 0;
        T f403c;

        public C0122f(ViewDataBinding viewDataBinding, int i, C0121d<T> c0121d) {
            super(viewDataBinding, ViewDataBinding.f17289k);
            this.f401a = c0121d;
        }

        public final boolean m191a() {
            boolean z;
            if (this.f403c != null) {
                this.f401a.mo44a(this.f403c);
                z = true;
            } else {
                z = false;
            }
            this.f403c = null;
            return z;
        }

        protected final ViewDataBinding m192b() {
            ViewDataBinding viewDataBinding = (ViewDataBinding) get();
            if (viewDataBinding == null) {
                m191a();
            }
            return viewDataBinding;
        }
    }

    static class C46841 implements C0119a {
        C46841() {
        }

        public final C0122f mo40a(ViewDataBinding viewDataBinding) {
            return new C4692h(viewDataBinding).f12896a;
        }
    }

    static class C46852 implements C0119a {
        C46852() {
        }

        public final C0122f mo40a(ViewDataBinding viewDataBinding) {
            return new C4690e(viewDataBinding).f12894a;
        }
    }

    static class C46863 implements C0119a {
        C46863() {
        }

        public final C0122f mo40a(ViewDataBinding viewDataBinding) {
            return new C4691g(viewDataBinding).f12895a;
        }
    }

    static class C46874 implements C0119a {
        C46874() {
        }

        public final C0122f mo40a(ViewDataBinding viewDataBinding) {
            return new C4689c(viewDataBinding).f12892a;
        }
    }

    static class C46885 extends C0127a<Object, ViewDataBinding, Void> {
        C46885() {
        }

        public final /* bridge */ /* synthetic */ void mo41a(Object obj, Object obj2, int i) {
        }
    }

    public class OnStartListener implements C0095f {
        final /* synthetic */ ViewDataBinding f12891a;

        @C0102m(a = C0091a.ON_START)
        public void onStart() {
            this.f12891a.m14843b();
        }
    }

    private static class C4689c implements C0101l, C0121d<LiveData<?>> {
        final C0122f<LiveData<?>> f12892a;
        C0096g f12893b;

        public C4689c(ViewDataBinding viewDataBinding) {
            this.f12892a = new C0122f(viewDataBinding, 0, this);
        }

        public final void mo42a() {
            ViewDataBinding.m14827a(this.f12892a.m192b(), this.f12892a.f402b, 0);
        }

        public final void mo43a(C0096g c0096g) {
            LiveData liveData = (LiveData) this.f12892a.f403c;
            if (liveData != null) {
                if (this.f12893b != null) {
                    liveData.m156a((C0101l) this);
                }
                if (c0096g != null) {
                    liveData.m155a(c0096g, (C0101l) this);
                }
            }
            this.f12893b = c0096g;
        }

        public final /* synthetic */ void mo45b(Object obj) {
            LiveData liveData = (LiveData) obj;
            if (this.f12893b != null) {
                liveData.m155a(this.f12893b, (C0101l) this);
            }
        }
    }

    private static class C4690e extends C0134a implements C0121d<C0135j> {
        final C0122f<C0135j> f12894a;

        public C4690e(ViewDataBinding viewDataBinding) {
            this.f12894a = new C0122f(viewDataBinding, 0, this);
        }

        public final void mo43a(C0096g c0096g) {
        }

        public final /* bridge */ /* synthetic */ void mo45b(Object obj) {
        }
    }

    private static class C4691g extends C0136a implements C0121d<C0137k> {
        final C0122f<C0137k> f12895a;

        public C4691g(ViewDataBinding viewDataBinding) {
            this.f12895a = new C0122f(viewDataBinding, 0, this);
        }

        public final void mo43a(C0096g c0096g) {
        }

        public final /* bridge */ /* synthetic */ void mo45b(Object obj) {
        }
    }

    private static class C4692h extends C0132a implements C0121d<C0133h> {
        final C0122f<C0133h> f12896a;

        public C4692h(ViewDataBinding viewDataBinding) {
            this.f12896a = new C0122f(viewDataBinding, 0, this);
        }

        public final void mo43a(C0096g c0096g) {
        }

        public final void mo46a(C0133h c0133h, int i) {
            ViewDataBinding b = this.f12896a.m192b();
            if (b != null && ((C0133h) this.f12896a.f403c) == c0133h) {
                ViewDataBinding.m14827a(b, this.f12896a.f402b, i);
            }
        }

        public final /* synthetic */ void mo44a(Object obj) {
            ((C0133h) obj).mo48b(this);
        }

        public final /* synthetic */ void mo45b(Object obj) {
            ((C0133h) obj).mo47a(this);
        }
    }

    protected ViewDataBinding(C0130f c0130f, View view, int i) {
        this.f17292c = c0130f;
        this.f17296p = new C0122f[i];
        this.f17291b = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        } else if (f17283e) {
            this.f17299s = Choreographer.getInstance();
            this.f17300t = new C01188(this);
        } else {
            this.f17300t = null;
            this.f17301u = new Handler(Looper.myLooper());
        }
    }

    protected static Drawable m14825a(View view, int i) {
        return VERSION.SDK_INT >= 21 ? view.getContext().getDrawable(i) : view.getResources().getDrawable(i);
    }

    static /* synthetic */ void m14827a(ViewDataBinding viewDataBinding, int i, int i2) {
        if (!viewDataBinding.f17304x && viewDataBinding.mo3441a(i, i2)) {
            viewDataBinding.m14846e();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m14828a(android.databinding.C0130f r20, android.view.View r21, java.lang.Object[] r22, android.databinding.ViewDataBinding.C0120b r23, android.util.SparseIntArray r24, boolean r25) {
        /*
        r0 = r21;
        r6 = r23;
        r7 = r24;
        r1 = m14833b(r21);
        if (r1 == 0) goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r1 = r21.getTag();
        r2 = r1 instanceof java.lang.String;
        if (r2 == 0) goto L_0x0018;
    L_0x0015:
        r1 = (java.lang.String) r1;
        goto L_0x0019;
    L_0x0018:
        r1 = 0;
    L_0x0019:
        r9 = -1;
        r10 = 0;
        r11 = 1;
        if (r25 == 0) goto L_0x0044;
    L_0x001e:
        if (r1 == 0) goto L_0x0044;
    L_0x0020:
        r2 = "layout";
        r2 = r1.startsWith(r2);
        if (r2 == 0) goto L_0x0044;
    L_0x0028:
        r2 = 95;
        r2 = r1.lastIndexOf(r2);
        if (r2 <= 0) goto L_0x0060;
    L_0x0030:
        r2 = r2 + r11;
        r3 = m14830a(r1, r2);
        if (r3 == 0) goto L_0x0060;
    L_0x0037:
        r1 = m14832b(r1, r2);
        r2 = r22[r1];
        if (r2 != 0) goto L_0x0041;
    L_0x003f:
        r22[r1] = r0;
    L_0x0041:
        if (r6 != 0) goto L_0x005d;
    L_0x0043:
        goto L_0x005c;
    L_0x0044:
        if (r1 == 0) goto L_0x0060;
    L_0x0046:
        r2 = "binding_";
        r2 = r1.startsWith(r2);
        if (r2 == 0) goto L_0x0060;
    L_0x004e:
        r2 = f17282d;
        r1 = m14832b(r1, r2);
        r2 = r22[r1];
        if (r2 != 0) goto L_0x005a;
    L_0x0058:
        r22[r1] = r0;
    L_0x005a:
        if (r6 != 0) goto L_0x005d;
    L_0x005c:
        r1 = r9;
    L_0x005d:
        r12 = r1;
        r1 = r11;
        goto L_0x0062;
    L_0x0060:
        r12 = r9;
        r1 = r10;
    L_0x0062:
        if (r1 != 0) goto L_0x0078;
    L_0x0064:
        r1 = r21.getId();
        if (r1 <= 0) goto L_0x0078;
    L_0x006a:
        if (r7 == 0) goto L_0x0078;
    L_0x006c:
        r1 = r7.get(r1, r9);
        if (r1 < 0) goto L_0x0078;
    L_0x0072:
        r2 = r22[r1];
        if (r2 != 0) goto L_0x0078;
    L_0x0076:
        r22[r1] = r0;
    L_0x0078:
        r1 = r0 instanceof android.view.ViewGroup;
        if (r1 == 0) goto L_0x01a7;
    L_0x007c:
        r13 = r0;
        r13 = (android.view.ViewGroup) r13;
        r14 = r13.getChildCount();
        r0 = r10;
        r1 = r0;
    L_0x0085:
        if (r0 >= r14) goto L_0x01a7;
    L_0x0087:
        r2 = r13.getChildAt(r0);
        if (r12 < 0) goto L_0x0186;
    L_0x008d:
        r3 = r2.getTag();
        r3 = r3 instanceof java.lang.String;
        if (r3 == 0) goto L_0x0186;
    L_0x0095:
        r3 = r2.getTag();
        r3 = (java.lang.String) r3;
        r4 = "_0";
        r4 = r3.endsWith(r4);
        if (r4 == 0) goto L_0x0186;
    L_0x00a3:
        r4 = "layout";
        r4 = r3.startsWith(r4);
        if (r4 == 0) goto L_0x0186;
    L_0x00ab:
        r4 = 47;
        r5 = r3.indexOf(r4);
        if (r5 <= 0) goto L_0x0186;
    L_0x00b3:
        r4 = r3.indexOf(r4);
        r4 = r4 + r11;
        r5 = r3.length();
        r5 = r5 + -2;
        r3 = r3.subSequence(r4, r5);
        r4 = r6.f398a;
        r4 = r4[r12];
        r5 = r4.length;
        r8 = r1;
    L_0x00c8:
        if (r8 >= r5) goto L_0x00d7;
    L_0x00ca:
        r9 = r4[r8];
        r9 = android.text.TextUtils.equals(r3, r9);
        if (r9 == 0) goto L_0x00d3;
    L_0x00d2:
        goto L_0x00d8;
    L_0x00d3:
        r8 = r8 + 1;
        r9 = -1;
        goto L_0x00c8;
    L_0x00d7:
        r8 = -1;
    L_0x00d8:
        if (r8 < 0) goto L_0x0186;
    L_0x00da:
        r1 = r8 + 1;
        r3 = r6.f399b;
        r3 = r3[r12];
        r3 = r3[r8];
        r4 = r6.f400c;
        r4 = r4[r12];
        r4 = r4[r8];
        r5 = r13.getChildAt(r0);
        r5 = r5.getTag();
        r5 = (java.lang.String) r5;
        r8 = r5.length();
        r8 = r8 - r11;
        r8 = r5.substring(r10, r8);
        r9 = r8.length();
        r10 = r13.getChildCount();
        r15 = r0 + 1;
        r16 = r1;
        r11 = r15;
        r1 = r0;
    L_0x0109:
        if (r11 >= r10) goto L_0x0158;
    L_0x010b:
        r17 = r10;
        r10 = r13.getChildAt(r11);
        r18 = r12;
        r12 = r10.getTag();
        r12 = r12 instanceof java.lang.String;
        if (r12 == 0) goto L_0x0122;
    L_0x011b:
        r10 = r10.getTag();
        r10 = (java.lang.String) r10;
        goto L_0x0123;
    L_0x0122:
        r10 = 0;
    L_0x0123:
        if (r10 == 0) goto L_0x014d;
    L_0x0125:
        r12 = r10.startsWith(r8);
        if (r12 == 0) goto L_0x014d;
    L_0x012b:
        r12 = r10.length();
        r19 = r8;
        r8 = r5.length();
        if (r12 != r8) goto L_0x0145;
    L_0x0137:
        r8 = r10.length();
        r12 = 1;
        r8 = r8 - r12;
        r8 = r10.charAt(r8);
        r12 = 48;
        if (r8 == r12) goto L_0x015a;
    L_0x0145:
        r8 = m14830a(r10, r9);
        if (r8 == 0) goto L_0x014f;
    L_0x014b:
        r1 = r11;
        goto L_0x014f;
    L_0x014d:
        r19 = r8;
    L_0x014f:
        r11 = r11 + 1;
        r10 = r17;
        r12 = r18;
        r8 = r19;
        goto L_0x0109;
    L_0x0158:
        r18 = r12;
    L_0x015a:
        if (r1 != r0) goto L_0x0167;
    L_0x015c:
        r8 = r20;
        r1 = android.databinding.C0131g.m205a(r8, r2, r4);
        r22[r3] = r1;
    L_0x0164:
        r9 = r0;
        r0 = 1;
        goto L_0x018e;
    L_0x0167:
        r8 = r20;
        r1 = r1 - r0;
        r4 = 1;
        r1 = r1 + r4;
        r4 = new android.view.View[r1];
        r5 = 0;
    L_0x016f:
        if (r5 >= r1) goto L_0x017c;
    L_0x0171:
        r9 = r0 + r5;
        r9 = r13.getChildAt(r9);
        r4[r5] = r9;
        r5 = r5 + 1;
        goto L_0x016f;
    L_0x017c:
        r4 = android.databinding.C0131g.m209b();
        r22[r3] = r4;
        r1 = r1 + -1;
        r0 = r0 + r1;
        goto L_0x0164;
    L_0x0186:
        r8 = r20;
        r18 = r12;
        r9 = r0;
        r16 = r1;
        r0 = 0;
    L_0x018e:
        if (r0 != 0) goto L_0x019a;
    L_0x0190:
        r5 = 0;
        r0 = r8;
        r1 = r2;
        r2 = r22;
        r3 = r6;
        r4 = r7;
        m14828a(r0, r1, r2, r3, r4, r5);
    L_0x019a:
        r0 = 1;
        r1 = r9 + 1;
        r11 = r0;
        r0 = r1;
        r1 = r16;
        r12 = r18;
        r9 = -1;
        r10 = 0;
        goto L_0x0085;
    L_0x01a7:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.databinding.ViewDataBinding.a(android.databinding.f, android.view.View, java.lang.Object[], android.databinding.ViewDataBinding$b, android.util.SparseIntArray, boolean):void");
    }

    private void m14829a(Object obj, C0119a c0119a) {
        if (obj != null) {
            C0122f c0122f = this.f17296p[0];
            if (c0122f == null) {
                c0122f = c0119a.mo40a(this);
                this.f17296p[0] = c0122f;
                if (this.f17303w != null) {
                    c0122f.f401a.mo43a(this.f17303w);
                }
            }
            c0122f.m191a();
            c0122f.f403c = obj;
            if (c0122f.f403c != null) {
                c0122f.f401a.mo45b(c0122f.f403c);
            }
        }
    }

    private static boolean m14830a(String str, int i) {
        int length = str.length();
        if (length == i) {
            return false;
        }
        while (i < length) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    protected static Object[] m14831a(C0130f c0130f, View view, int i, C0120b c0120b, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        m14828a(c0130f, view, objArr, c0120b, sparseIntArray, true);
        return objArr;
    }

    private static int m14832b(String str, int i) {
        int i2 = 0;
        while (i < str.length()) {
            i2 = (i2 * 10) + (str.charAt(i) - 48);
            i++;
        }
        return i2;
    }

    static ViewDataBinding m14833b(View view) {
        return view != null ? (ViewDataBinding) view.getTag(C0965a.dataBinding) : null;
    }

    static /* synthetic */ void m14836f() {
        while (true) {
            Reference poll = f17289k.poll();
            if (poll == null) {
                return;
            }
            if (poll instanceof C0122f) {
                ((C0122f) poll).m191a();
            }
        }
    }

    private boolean m14839i() {
        C0122f c0122f = this.f17296p[0];
        return c0122f != null ? c0122f.m191a() : false;
    }

    protected final void m14840a(View view) {
        view.setTag(C0965a.dataBinding, this);
    }

    public abstract boolean mo3441a(int i, int i2);

    protected final boolean m14842a(C0133h c0133h) {
        C0119a c0119a = f17284f;
        if (c0133h == null) {
            return m14839i();
        }
        C0122f c0122f = this.f17296p[0];
        if (c0122f == null) {
            m14829a((Object) c0133h, c0119a);
            return true;
        } else if (c0122f.f403c == c0133h) {
            return false;
        } else {
            m14839i();
            m14829a((Object) c0133h, c0119a);
            return true;
        }
    }

    public final void m14843b() {
        Object obj = this;
        while (obj.f17302v != null) {
            obj = obj.f17302v;
        }
        if (obj.f17298r) {
            obj.m14846e();
            return;
        }
        if (obj.mo3443d()) {
            obj.f17298r = true;
            obj.f17295o = false;
            if (obj.f17297q != null) {
                obj.f17297q.m202a(obj, 1);
                if (obj.f17295o) {
                    obj.f17297q.m202a(obj, 2);
                }
            }
            if (!obj.f17295o) {
                obj.mo3442c();
                if (obj.f17297q != null) {
                    obj.f17297q.m202a(obj, 3);
                }
            }
            obj.f17298r = false;
        }
    }

    public abstract void mo3442c();

    public abstract boolean mo3443d();

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void m14846e() {
        /*
        r3 = this;
        r0 = r3;
    L_0x0001:
        r1 = r0.f17302v;
        if (r1 == 0) goto L_0x0008;
    L_0x0005:
        r0 = r0.f17302v;
        goto L_0x0001;
    L_0x0008:
        monitor-enter(r0);
        r1 = r0.f17294n;	 Catch:{ all -> 0x003e }
        if (r1 == 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r0);	 Catch:{ all -> 0x003e }
        return;
    L_0x000f:
        r1 = 1;
        r0.f17294n = r1;	 Catch:{ all -> 0x003e }
        monitor-exit(r0);	 Catch:{ all -> 0x003e }
        r1 = r0.f17303w;
        if (r1 == 0) goto L_0x002a;
    L_0x0017:
        r1 = r0.f17303w;
        r1 = r1.mo39d();
        r1 = r1.mo33a();
        r2 = android.arch.lifecycle.C0093d.C0092b.STARTED;
        r1 = r1.m163a(r2);
        if (r1 != 0) goto L_0x002a;
    L_0x0029:
        return;
    L_0x002a:
        r1 = f17283e;
        if (r1 == 0) goto L_0x0036;
    L_0x002e:
        r1 = r0.f17299s;
        r0 = r0.f17300t;
        r1.postFrameCallback(r0);
        return;
    L_0x0036:
        r1 = r0.f17301u;
        r0 = r0.f17293m;
        r1.post(r0);
        return;
    L_0x003e:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x003e }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.databinding.ViewDataBinding.e():void");
    }
}
