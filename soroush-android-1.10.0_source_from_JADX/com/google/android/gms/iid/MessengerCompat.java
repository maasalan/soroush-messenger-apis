package com.google.android.gms.iid;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class MessengerCompat implements ReflectedParcelable {
    public static final Creator<MessengerCompat> CREATOR = new C1816c();
    private Messenger f15170a;
    private C1815a f15171b;

    public MessengerCompat(IBinder iBinder) {
        if (VERSION.SDK_INT >= 21) {
            this.f15170a = new Messenger(iBinder);
            return;
        }
        C1815a c1815a;
        if (iBinder == null) {
            c1815a = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.iid.IMessengerCompat");
            c1815a = queryLocalInterface instanceof C1815a ? (C1815a) queryLocalInterface : new C5491b(iBinder);
        }
        this.f15171b = c1815a;
    }

    private final IBinder m11847a() {
        return this.f15170a != null ? this.f15170a.getBinder() : this.f15171b.asBinder();
    }

    public final void m11848a(Message message) {
        if (this.f15170a != null) {
            this.f15170a.send(message);
        } else {
            this.f15171b.mo1584a(message);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object r3) {
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
        r2 = this;
        r0 = 0;
        if (r3 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r2.m11847a();	 Catch:{ ClassCastException -> 0x0013 }
        r3 = (com.google.android.gms.iid.MessengerCompat) r3;	 Catch:{ ClassCastException -> 0x0013 }
        r3 = r3.m11847a();	 Catch:{ ClassCastException -> 0x0013 }
        r3 = r1.equals(r3);	 Catch:{ ClassCastException -> 0x0013 }
        return r3;
    L_0x0013:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.MessengerCompat.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return m11847a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f15170a != null ? this.f15170a.getBinder() : this.f15171b.asBinder());
    }
}
