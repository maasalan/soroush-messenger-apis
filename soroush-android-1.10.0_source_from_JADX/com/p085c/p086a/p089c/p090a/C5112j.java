package com.p085c.p086a.p089c.p090a;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.p085c.p086a.C1251g;
import com.p085c.p086a.p089c.C1102a;
import com.p085c.p086a.p089c.p090a.C1096b.C1095a;

public abstract class C5112j<T> implements C1096b<T> {
    private final Uri f14292a;
    private final ContentResolver f14293b;
    private T f14294c;

    public C5112j(ContentResolver contentResolver, Uri uri) {
        this.f14293b = contentResolver;
        this.f14292a = uri;
    }

    protected abstract T mo2692a(Uri uri, ContentResolver contentResolver);

    public final void mo1108a() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.f14294c;
        if (r0 == 0) goto L_0x0009;
    L_0x0004:
        r0 = r1.f14294c;	 Catch:{ IOException -> 0x0009 }
        r1.mo2693a(r0);	 Catch:{ IOException -> 0x0009 }
    L_0x0009:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.c.a.j.a():void");
    }

    public final void mo1109a(C1251g c1251g, C1095a<? super T> c1095a) {
        try {
            this.f14294c = mo2692a(this.f14292a, this.f14293b);
            c1095a.mo1141a(this.f14294c);
        } catch (Exception e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            c1095a.mo1140a(e);
        }
    }

    protected abstract void mo2693a(T t);

    public final void mo1110b() {
    }

    public final C1102a mo1111c() {
        return C1102a.LOCAL;
    }
}
