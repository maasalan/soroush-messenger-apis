package com.p085c.p086a.p089c.p090a;

import android.content.res.AssetManager;
import android.util.Log;
import com.p085c.p086a.C1251g;
import com.p085c.p086a.p089c.C1102a;
import com.p085c.p086a.p089c.p090a.C1096b.C1095a;

public abstract class C5105a<T> implements C1096b<T> {
    private final String f14279a;
    private final AssetManager f14280b;
    private T f14281c;

    public C5105a(AssetManager assetManager, String str) {
        this.f14280b = assetManager;
        this.f14279a = str;
    }

    protected abstract T mo2690a(AssetManager assetManager, String str);

    public final void mo1108a() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.f14281c;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = r1.f14281c;	 Catch:{ IOException -> 0x000a }
        r1.mo2691a(r0);	 Catch:{ IOException -> 0x000a }
    L_0x000a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.c.a.a.a():void");
    }

    public final void mo1109a(C1251g c1251g, C1095a<? super T> c1095a) {
        try {
            this.f14281c = mo2690a(this.f14280b, this.f14279a);
            c1095a.mo1141a(this.f14281c);
        } catch (Exception e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            c1095a.mo1140a(e);
        }
    }

    protected abstract void mo2691a(T t);

    public final void mo1110b() {
    }

    public final C1102a mo1111c() {
        return C1102a.LOCAL;
    }
}
