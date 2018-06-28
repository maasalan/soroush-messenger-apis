package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.support.v4.p038g.C0464b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.C1708a.C1704a;
import com.google.android.gms.common.api.C1708a.C1704a.C6571a;
import com.google.android.gms.common.api.C1708a.C1704a.C6572b;
import com.google.android.gms.common.api.C1708a.C1705c;
import com.google.android.gms.common.api.internal.C1723g;
import com.google.android.gms.common.api.internal.C1735y;
import com.google.android.gms.common.api.internal.C5457q;
import com.google.android.gms.common.api.internal.C6576p;
import com.google.android.gms.common.api.internal.ae;
import com.google.android.gms.common.api.internal.aj;
import com.google.android.gms.common.api.internal.an;
import com.google.android.gms.common.api.internal.as;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.internal.ax;
import java.util.Collection;
import java.util.Collections;

public class C1712d<O extends C1704a> {
    public final Context f5221a;
    public final C1708a<O> f5222b;
    public final O f5223c;
    public final aj<O> f5224d;
    public final Looper f5225e;
    public final int f5226f;
    protected final C1715e f5227g;
    protected final C1723g f5228h;
    private final ae f5229i;

    public static class C1711a {
        public static final C1711a f5218a = new C1738k().m4357a();
        public final ae f5219b;
        public final Looper f5220c;

        private C1711a(ae aeVar, Looper looper) {
            this.f5219b = aeVar;
            this.f5220c = looper;
        }
    }

    private C1712d(Context context, C1708a<O> c1708a, C1711a c1711a) {
        ac.m4377a((Object) context, (Object) "Null context is not permitted.");
        ac.m4377a((Object) c1708a, (Object) "Api must not be null.");
        ac.m4377a((Object) c1711a, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f5221a = context.getApplicationContext();
        this.f5222b = c1708a;
        this.f5223c = null;
        this.f5225e = c1711a.f5220c;
        this.f5224d = new aj(this.f5222b, this.f5223c);
        this.f5227g = new C6576p(this);
        this.f5228h = C1723g.m4333a(this.f5221a);
        this.f5226f = this.f5228h.f5262b.getAndIncrement();
        this.f5229i = c1711a.f5219b;
        C1723g c1723g = this.f5228h;
        c1723g.f5264d.sendMessage(c1723g.f5264d.obtainMessage(7, this));
    }

    @Deprecated
    public C1712d(Context context, C1708a<O> c1708a, ae aeVar) {
        C1738k c1738k = new C1738k();
        ac.m4377a((Object) aeVar, (Object) "StatusExceptionMapper must not be null.");
        c1738k.f5295a = aeVar;
        this(context, (C1708a) c1708a, c1738k.m4357a());
    }

    public final <A extends C1705c, T extends an<? extends C1720i, A>> T m4306a(T t) {
        boolean z;
        C1723g c1723g;
        if (!t.f15115b) {
            if (!((Boolean) as.f15114a.get()).booleanValue()) {
                z = false;
                t.f15115b = z;
                c1723g = this.f5228h;
                c1723g.f5264d.sendMessage(c1723g.f5264d.obtainMessage(4, new C1735y(new C5457q(t), c1723g.f5263c.get(), this)));
                return t;
            }
        }
        z = true;
        t.f15115b = z;
        c1723g = this.f5228h;
        c1723g.f5264d.sendMessage(c1723g.f5264d.obtainMessage(4, new C1735y(new C5457q(t), c1723g.f5263c.get(), this)));
        return t;
    }

    public final ax m4307a() {
        GoogleSignInAccount a;
        Account account;
        Collection a2;
        ax axVar = new ax();
        if (this.f5223c instanceof C6572b) {
            a = ((C6572b) this.f5223c).m15874a();
            if (a.f17952a != null) {
                account = new Account(a.f17952a, "com.google");
                axVar.f5386a = account;
                if (this.f5223c instanceof C6572b) {
                    a = ((C6572b) this.f5223c).m15874a();
                    if (a != null) {
                        a2 = a.m15865a();
                        if (axVar.f5387b == null) {
                            axVar.f5387b = new C0464b();
                        }
                        axVar.f5387b.addAll(a2);
                        return axVar;
                    }
                }
                a2 = Collections.emptySet();
                if (axVar.f5387b == null) {
                    axVar.f5387b = new C0464b();
                }
                axVar.f5387b.addAll(a2);
                return axVar;
            }
        } else if (this.f5223c instanceof C6571a) {
            account = ((C6571a) this.f5223c).m15873a();
            axVar.f5386a = account;
            if (this.f5223c instanceof C6572b) {
                a = ((C6572b) this.f5223c).m15874a();
                if (a != null) {
                    a2 = a.m15865a();
                    if (axVar.f5387b == null) {
                        axVar.f5387b = new C0464b();
                    }
                    axVar.f5387b.addAll(a2);
                    return axVar;
                }
            }
            a2 = Collections.emptySet();
            if (axVar.f5387b == null) {
                axVar.f5387b = new C0464b();
            }
            axVar.f5387b.addAll(a2);
            return axVar;
        }
        account = null;
        axVar.f5386a = account;
        if (this.f5223c instanceof C6572b) {
            a = ((C6572b) this.f5223c).m15874a();
            if (a != null) {
                a2 = a.m15865a();
                if (axVar.f5387b == null) {
                    axVar.f5387b = new C0464b();
                }
                axVar.f5387b.addAll(a2);
                return axVar;
            }
        }
        a2 = Collections.emptySet();
        if (axVar.f5387b == null) {
            axVar.f5387b = new C0464b();
        }
        axVar.f5387b.addAll(a2);
        return axVar;
    }
}
