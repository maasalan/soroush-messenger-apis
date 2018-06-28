package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C1771k;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.zzc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class ai<T extends IInterface> {
    private static String[] f5343A = new String[]{"service_esmobile", "service_googleme"};
    int f5344a;
    long f5345b;
    protected final Context f5346c;
    final Handler f5347d;
    protected ao f5348e;
    protected AtomicInteger f5349f;
    private long f5350g;
    private int f5351h;
    private long f5352i;
    private C1762k f5353j;
    private final Looper f5354k;
    private final C1758f f5355l;
    private final C1771k f5356m;
    private final Object f5357n;
    private final Object f5358o;
    private C1767u f5359p;
    private T f5360q;
    private final ArrayList<an<?>> f5361r;
    private aq f5362s;
    private int f5363t;
    private final ak f5364u;
    private final al f5365v;
    private final int f5366w;
    private final String f5367x;
    private ConnectionResult f5368y;
    private boolean f5369z;

    protected ai(Context context, Looper looper, ak akVar, al alVar) {
        this(context, looper, C1758f.m4448a(context), C1771k.m4473b(), 93, (ak) ac.m4376a((Object) akVar), (al) ac.m4376a((Object) alVar), null);
    }

    protected ai(Context context, Looper looper, C1758f c1758f, C1771k c1771k, int i, ak akVar, al alVar, String str) {
        this.f5357n = new Object();
        this.f5358o = new Object();
        this.f5361r = new ArrayList();
        this.f5363t = 1;
        this.f5368y = null;
        this.f5369z = false;
        this.f5349f = new AtomicInteger(0);
        this.f5346c = (Context) ac.m4377a((Object) context, (Object) "Context must not be null");
        this.f5354k = (Looper) ac.m4377a((Object) looper, (Object) "Looper must not be null");
        this.f5355l = (C1758f) ac.m4377a((Object) c1758f, (Object) "Supervisor must not be null");
        this.f5356m = (C1771k) ac.m4377a((Object) c1771k, (Object) "API availability must not be null");
        this.f5347d = new am(this, looper);
        this.f5366w = i;
        this.f5364u = akVar;
        this.f5365v = alVar;
        this.f5367x = str;
    }

    private final void m4391a(int i, T t) {
        boolean z = false;
        if ((i == 4) == (t != null)) {
            z = true;
        }
        ac.m4385b(z);
        synchronized (this.f5357n) {
            this.f5363t = i;
            this.f5360q = t;
            ServiceConnection serviceConnection;
            switch (i) {
                case 1:
                    if (this.f5362s != null) {
                        serviceConnection = this.f5362s;
                        m4403j();
                        this.f5355l.m4449a(mo1643h(), "com.google.android.gms", 129, serviceConnection);
                        this.f5362s = null;
                        break;
                    }
                    break;
                case 2:
                case 3:
                    String str;
                    String str2;
                    StringBuilder stringBuilder;
                    C1758f c1758f;
                    int i2;
                    if (!(this.f5362s == null || this.f5353j == null)) {
                        str = this.f5353j.f5409a;
                        str2 = this.f5353j.f5410b;
                        stringBuilder = new StringBuilder((70 + String.valueOf(str).length()) + String.valueOf(str2).length());
                        stringBuilder.append("Calling connect() while still connected, missing disconnect() for ");
                        stringBuilder.append(str);
                        stringBuilder.append(" on ");
                        stringBuilder.append(str2);
                        Log.e("GmsClient", stringBuilder.toString());
                        c1758f = this.f5355l;
                        str = this.f5353j.f5409a;
                        str2 = this.f5353j.f5410b;
                        i2 = this.f5353j.f5411c;
                        serviceConnection = this.f5362s;
                        m4403j();
                        c1758f.m4449a(str, str2, i2, serviceConnection);
                        this.f5349f.incrementAndGet();
                    }
                    this.f5362s = new aq(this, this.f5349f.get());
                    this.f5353j = new C1762k("com.google.android.gms", mo1643h());
                    c1758f = this.f5355l;
                    str = this.f5353j.f5409a;
                    str2 = this.f5353j.f5410b;
                    i2 = this.f5353j.f5411c;
                    serviceConnection = this.f5362s;
                    m4403j();
                    if (!c1758f.mo1568a(new C1759g(str, str2, i2), serviceConnection)) {
                        str = this.f5353j.f5409a;
                        str2 = this.f5353j.f5410b;
                        stringBuilder = new StringBuilder((34 + String.valueOf(str).length()) + String.valueOf(str2).length());
                        stringBuilder.append("unable to connect to service: ");
                        stringBuilder.append(str);
                        stringBuilder.append(" on ");
                        stringBuilder.append(str2);
                        Log.e("GmsClient", stringBuilder.toString());
                        m4409a(16, this.f5349f.get());
                        break;
                    }
                    break;
                case 4:
                    this.f5350g = System.currentTimeMillis();
                    break;
                default:
                    break;
            }
        }
    }

    static /* synthetic */ void m4392a(ai aiVar) {
        int i;
        if (aiVar.m4405o()) {
            i = 5;
            aiVar.f5369z = true;
        } else {
            i = 4;
        }
        aiVar.f5347d.sendMessage(aiVar.f5347d.obtainMessage(i, aiVar.f5349f.get(), 16));
    }

    private final boolean m4394a(int i, int i2, T t) {
        synchronized (this.f5357n) {
            if (this.f5363t != i) {
                return false;
            }
            m4391a(i2, (IInterface) t);
            return true;
        }
    }

    private final String m4403j() {
        return this.f5367x == null ? this.f5346c.getClass().getName() : this.f5367x;
    }

    public static Bundle m4404m() {
        return null;
    }

    private final boolean m4405o() {
        boolean z;
        synchronized (this.f5357n) {
            z = this.f5363t == 3;
        }
        return z;
    }

    private final boolean m4406p() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r2 = this;
        r0 = r2.f5369z;
        r1 = 0;
        if (r0 == 0) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        r0 = r2.mo1644i();
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x0011;
    L_0x0010:
        return r1;
    L_0x0011:
        r0 = 0;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x0019;
    L_0x0018:
        return r1;
    L_0x0019:
        r0 = r2.mo1644i();	 Catch:{ ClassNotFoundException -> 0x0022 }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0022 }
        r0 = 1;
        return r0;
    L_0x0022:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.ai.p():boolean");
    }

    public abstract T mo1642a(IBinder iBinder);

    public final void m4408a() {
        this.f5349f.incrementAndGet();
        synchronized (this.f5361r) {
            int size = this.f5361r.size();
            for (int i = 0; i < size; i++) {
                ((an) this.f5361r.get(i)).m4433d();
            }
            this.f5361r.clear();
        }
        synchronized (this.f5358o) {
            this.f5359p = null;
        }
        m4391a(1, null);
    }

    protected final void m4409a(int i, int i2) {
        this.f5347d.sendMessage(this.f5347d.obtainMessage(7, i2, -1, new at(this, i)));
    }

    protected final void m4410a(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.f5347d.sendMessage(this.f5347d.obtainMessage(1, i2, -1, new as(this, i, iBinder, bundle)));
    }

    protected final void m4411a(ConnectionResult connectionResult) {
        this.f5351h = connectionResult.f17969b;
        this.f5352i = System.currentTimeMillis();
    }

    public final void m4412a(ao aoVar) {
        this.f5348e = (ao) ac.m4377a((Object) aoVar, (Object) "Connection progress callbacks cannot be null.");
        m4391a(2, null);
    }

    public final void m4413a(au auVar) {
        auVar.mo1553a();
    }

    public final void m4414a(C1763l c1763l, Set<Scope> set) {
        Bundle l = mo3415l();
        zzz com_google_android_gms_common_internal_zzz = new zzz(this.f5366w);
        com_google_android_gms_common_internal_zzz.f18050a = this.f5346c.getPackageName();
        com_google_android_gms_common_internal_zzz.f18053d = l;
        if (set != null) {
            com_google_android_gms_common_internal_zzz.f18052c = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo3413d()) {
            com_google_android_gms_common_internal_zzz.f18054e = e_() != null ? e_() : new Account("<<default account>>", "com.google");
            if (c1763l != null) {
                com_google_android_gms_common_internal_zzz.f18051b = c1763l.asBinder();
            }
        }
        com_google_android_gms_common_internal_zzz.f18055f = mo3024g();
        try {
            synchronized (this.f5358o) {
                if (this.f5359p != null) {
                    this.f5359p.mo1573a(new ap(this, this.f5349f.get()), com_google_android_gms_common_internal_zzz);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (Throwable e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            this.f5347d.sendMessage(this.f5347d.obtainMessage(6, this.f5349f.get(), 1));
        } catch (SecurityException e2) {
            throw e2;
        } catch (Throwable e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            m4410a(8, null, null, this.f5349f.get());
        }
    }

    public final boolean m4415b() {
        boolean z;
        synchronized (this.f5357n) {
            z = this.f5363t == 4;
        }
        return z;
    }

    public final boolean m4416c() {
        boolean z;
        synchronized (this.f5357n) {
            if (this.f5363t != 2) {
                if (this.f5363t != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public boolean mo3413d() {
        return false;
    }

    public Account e_() {
        return null;
    }

    protected Set<Scope> mo3023f() {
        return Collections.EMPTY_SET;
    }

    public zzc[] mo3024g() {
        return new zzc[0];
    }

    public abstract String mo1643h();

    public abstract String mo1644i();

    public final void m4422k() {
        int a = this.f5356m.mo1557a(this.f5346c);
        if (a != 0) {
            m4391a(1, null);
            this.f5348e = (ao) ac.m4377a(new ar(this), (Object) "Connection progress callbacks cannot be null.");
            this.f5347d.sendMessage(this.f5347d.obtainMessage(3, this.f5349f.get(), a, null));
            return;
        }
        m4412a(new ar(this));
    }

    public Bundle mo3415l() {
        return new Bundle();
    }

    public final T m4424n() {
        T t;
        synchronized (this.f5357n) {
            if (this.f5363t == 5) {
                throw new DeadObjectException();
            } else if (m4415b()) {
                ac.m4382a(this.f5360q != null, (Object) "Client is connected but service is null");
                t = this.f5360q;
            } else {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
        }
        return t;
    }
}
