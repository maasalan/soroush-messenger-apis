package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C1715e.C1713a;
import com.google.android.gms.common.api.C1715e.C1714b;
import com.google.android.gms.common.internal.C6579c;
import com.google.android.gms.common.internal.ar;
import com.google.android.gms.common.internal.aw;

public final class lv extends C6579c<lt> implements lm {
    private final boolean f20400g;
    private final aw f20401h;
    private final Bundle f20402i;
    private Integer f20403j;

    private lv(Context context, Looper looper, aw awVar, Bundle bundle, C1713a c1713a, C1714b c1714b) {
        super(context, looper, 44, awVar, c1713a, c1714b);
        this.f20400g = true;
        this.f20401h = awVar;
        this.f20402i = bundle;
        this.f20403j = awVar.f5382g;
    }

    public lv(Context context, Looper looper, aw awVar, C1713a c1713a, C1714b c1714b) {
        ln lnVar = awVar.f5381f;
        Integer num = awVar.f5382g;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", awVar.f5376a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        if (lnVar != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", lnVar.f20392b);
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", lnVar.f20393c);
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", lnVar.f20394d);
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", lnVar.f20395e);
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", lnVar.f20396f);
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", lnVar.f20397g);
            if (lnVar.f20398h != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", lnVar.f20398h.longValue());
            }
            if (lnVar.f20399i != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", lnVar.f20399i.longValue());
            }
        }
        this(context, looper, awVar, bundle, c1713a, c1714b);
    }

    protected final /* synthetic */ IInterface mo1642a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof lt ? (lt) queryLocalInterface : new lu(iBinder);
    }

    public final void mo3412a(com.google.android.gms.internal.lr r5) {
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
        r4 = this;
        r0 = "Expecting a valid ISignInCallbacks";
        com.google.android.gms.common.internal.ac.m4377a(r5, r0);
        r0 = r4.f20401h;	 Catch:{ RemoteException -> 0x004c }
        r1 = r0.f5376a;	 Catch:{ RemoteException -> 0x004c }
        if (r1 == 0) goto L_0x000e;	 Catch:{ RemoteException -> 0x004c }
    L_0x000b:
        r0 = r0.f5376a;	 Catch:{ RemoteException -> 0x004c }
        goto L_0x0017;	 Catch:{ RemoteException -> 0x004c }
    L_0x000e:
        r0 = new android.accounts.Account;	 Catch:{ RemoteException -> 0x004c }
        r1 = "<<default account>>";	 Catch:{ RemoteException -> 0x004c }
        r2 = "com.google";	 Catch:{ RemoteException -> 0x004c }
        r0.<init>(r1, r2);	 Catch:{ RemoteException -> 0x004c }
    L_0x0017:
        r1 = 0;	 Catch:{ RemoteException -> 0x004c }
        r2 = "<<default account>>";	 Catch:{ RemoteException -> 0x004c }
        r3 = r0.name;	 Catch:{ RemoteException -> 0x004c }
        r2 = r2.equals(r3);	 Catch:{ RemoteException -> 0x004c }
        if (r2 == 0) goto L_0x0032;	 Catch:{ RemoteException -> 0x004c }
    L_0x0022:
        r1 = r4.f5346c;	 Catch:{ RemoteException -> 0x004c }
        r1 = com.google.android.gms.auth.api.signin.internal.C1688c.m4285a(r1);	 Catch:{ RemoteException -> 0x004c }
        r2 = "defaultGoogleSignInAccount";	 Catch:{ RemoteException -> 0x004c }
        r2 = r1.m4287b(r2);	 Catch:{ RemoteException -> 0x004c }
        r1 = r1.m4286a(r2);	 Catch:{ RemoteException -> 0x004c }
    L_0x0032:
        r2 = new com.google.android.gms.common.internal.zzbr;	 Catch:{ RemoteException -> 0x004c }
        r3 = r4.f20403j;	 Catch:{ RemoteException -> 0x004c }
        r3 = r3.intValue();	 Catch:{ RemoteException -> 0x004c }
        r2.<init>(r0, r3, r1);	 Catch:{ RemoteException -> 0x004c }
        r0 = r4.m4424n();	 Catch:{ RemoteException -> 0x004c }
        r0 = (com.google.android.gms.internal.lt) r0;	 Catch:{ RemoteException -> 0x004c }
        r1 = new com.google.android.gms.internal.zzcwm;	 Catch:{ RemoteException -> 0x004c }
        r1.<init>(r2);	 Catch:{ RemoteException -> 0x004c }
        r0.mo1652a(r1, r5);	 Catch:{ RemoteException -> 0x004c }
        return;
    L_0x004c:
        r0 = move-exception;
        r1 = "SignInClientImpl";
        r2 = "Remote service probably died when signIn is called";
        android.util.Log.w(r1, r2);
        r1 = new com.google.android.gms.internal.zzcwo;	 Catch:{ RemoteException -> 0x005d }
        r1.<init>();	 Catch:{ RemoteException -> 0x005d }
        r5.mo3039a(r1);	 Catch:{ RemoteException -> 0x005d }
        return;
    L_0x005d:
        r5 = "SignInClientImpl";
        r1 = "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.";
        android.util.Log.wtf(r5, r1, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.lv.a(com.google.android.gms.internal.lr):void");
    }

    public final boolean mo3413d() {
        return this.f20400g;
    }

    public final void mo3414e() {
        m4412a(new ar(this));
    }

    protected final String mo1643h() {
        return "com.google.android.gms.signin.service.START";
    }

    protected final String mo1644i() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    protected final Bundle mo3415l() {
        if (!this.f5346c.getPackageName().equals(this.f20401h.f5379d)) {
            this.f20402i.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f20401h.f5379d);
        }
        return this.f20402i;
    }
}
