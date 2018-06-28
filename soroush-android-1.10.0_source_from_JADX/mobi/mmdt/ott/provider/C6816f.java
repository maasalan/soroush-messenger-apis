package mobi.mmdt.ott.provider;

import android.database.Cursor;
import android.net.Uri;
import android.support.v4.os.C0507a;
import android.support.v4.p029a.C0350e.C0347a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.provider.p380b.C6011a;

public abstract class C6816f extends C6011a<Cursor> implements C2952b.C6011a {
    Uri f19441a;
    private C0347a f19442g = new C0347a(this);
    private Cursor f19443h;
    private C0507a f19444i;

    public C6816f() {
        super(MyApplication.m12952b());
    }

    private void m17230a(Cursor cursor) {
        if (this.f1307t) {
            if (cursor != null) {
                cursor.close();
            }
            return;
        }
        Cursor cursor2 = this.f19443h;
        this.f19443h = cursor;
        if (this.f1305r) {
            super.mo2522b(cursor);
        }
        if (!(cursor2 == null || cursor2 == cursor || cursor2.isClosed())) {
            cursor2.close();
        }
    }

    private android.database.Cursor m17231q() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = 0;
        monitor-enter(r3);	 Catch:{ IllegalStateException -> 0x0036 }
        r1 = new android.support.v4.os.a;	 Catch:{ all -> 0x0033 }
        r1.<init>();	 Catch:{ all -> 0x0033 }
        r3.f19444i = r1;	 Catch:{ all -> 0x0033 }
        monitor-exit(r3);	 Catch:{ all -> 0x0033 }
        r1 = r3.mo3570c();	 Catch:{ all -> 0x002a }
        if (r1 == 0) goto L_0x0022;
    L_0x0010:
        r1.getCount();	 Catch:{ RuntimeException -> 0x0019 }
        r2 = r3.f19442g;	 Catch:{ RuntimeException -> 0x0019 }
        r1.registerContentObserver(r2);	 Catch:{ RuntimeException -> 0x0019 }
        goto L_0x0022;
    L_0x0019:
        r2 = r1.isClosed();	 Catch:{ all -> 0x002a }
        if (r2 != 0) goto L_0x0022;	 Catch:{ all -> 0x002a }
    L_0x001f:
        r1.close();	 Catch:{ all -> 0x002a }
    L_0x0022:
        monitor-enter(r3);	 Catch:{ IllegalStateException -> 0x0036 }
        r3.f19444i = r0;	 Catch:{ all -> 0x0027 }
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
        return r1;	 Catch:{ all -> 0x0027 }
    L_0x0027:
        r1 = move-exception;	 Catch:{ all -> 0x0027 }
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
        throw r1;	 Catch:{ IllegalStateException -> 0x0036 }
    L_0x002a:
        r1 = move-exception;	 Catch:{ IllegalStateException -> 0x0036 }
        monitor-enter(r3);	 Catch:{ IllegalStateException -> 0x0036 }
        r3.f19444i = r0;	 Catch:{ all -> 0x0030 }
        monitor-exit(r3);	 Catch:{ all -> 0x0030 }
        throw r1;	 Catch:{ IllegalStateException -> 0x0036 }
    L_0x0030:
        r1 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0030 }
        throw r1;	 Catch:{ IllegalStateException -> 0x0036 }
    L_0x0033:
        r1 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0033 }
        throw r1;	 Catch:{ IllegalStateException -> 0x0036 }
    L_0x0036:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.provider.f.q():android.database.Cursor");
    }

    public final /* synthetic */ void mo3177a(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    public final /* synthetic */ void mo2522b(Object obj) {
        m17230a((Cursor) obj);
    }

    public abstract Cursor mo3570c();

    public final void mo3178d() {
        super.mo3178d();
        synchronized (this) {
            if (this.f19444i != null) {
                this.f19444i.m1115b();
            }
        }
    }

    public final /* synthetic */ Object mo3179e() {
        return m17231q();
    }

    protected final void mo2525f() {
        if (this.f19443h != null) {
            m17230a(this.f19443h);
        }
        if (m703m() || this.f19443h == null) {
            j_();
        }
    }

    protected final void mo2526g() {
        mo219b();
    }

    protected final void mo2527h() {
        super.mo2527h();
        mo219b();
        if (!(this.f19443h == null || this.f19443h.isClosed())) {
            this.f19443h.close();
        }
        this.f19443h = null;
    }
}
