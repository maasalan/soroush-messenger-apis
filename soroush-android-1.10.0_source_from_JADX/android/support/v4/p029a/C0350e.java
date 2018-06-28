package android.support.v4.p029a;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.support.v4.p038g.C0466d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class C0350e<D> {
    public int f1301n;
    C0349c<D> f1302o;
    public C0348b<D> f1303p;
    protected Context f1304q;
    protected boolean f1305r = false;
    public boolean f1306s = false;
    protected boolean f1307t = true;
    boolean f1308u = false;
    public boolean f1309v = false;

    public final class C0347a extends ContentObserver {
        final /* synthetic */ C0350e f1300a;

        public C0347a(C0350e c0350e) {
            this.f1300a = c0350e;
            super(new Handler());
        }

        public final boolean deliverSelfNotifications() {
            return true;
        }

        public final void onChange(boolean z) {
            this.f1300a.m705o();
        }
    }

    public interface C0348b<D> {
        void mo266d();
    }

    public interface C0349c<D> {
        void mo265a(C0350e<D> c0350e, D d);
    }

    public C0350e(Context context) {
        this.f1304q = context.getApplicationContext();
    }

    public final void m690a(int i, C0349c<D> c0349c) {
        if (this.f1302o != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f1302o = c0349c;
        this.f1301n = i;
    }

    public final void m691a(C0348b<D> c0348b) {
        if (this.f1303p == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.f1303p != c0348b) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            this.f1303p = null;
        }
    }

    public final void m692a(C0349c<D> c0349c) {
        if (this.f1302o == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.f1302o != c0349c) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            this.f1302o = null;
        }
    }

    public void mo218a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f1301n);
        printWriter.print(" mListener=");
        printWriter.println(this.f1302o);
        if (this.f1305r || this.f1308u || this.f1309v) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f1305r);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f1308u);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f1309v);
        }
        if (this.f1306s || this.f1307t) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f1306s);
            printWriter.print(" mReset=");
            printWriter.println(this.f1307t);
        }
    }

    public void mo2522b(D d) {
        if (this.f1302o != null) {
            this.f1302o.mo265a(this, d);
        }
    }

    public boolean mo219b() {
        return false;
    }

    protected void mo2525f() {
    }

    protected void mo2526g() {
    }

    protected void mo2527h() {
    }

    public final void m699i() {
        if (this.f1303p != null) {
            this.f1303p.mo266d();
        }
    }

    public final void m700j() {
        this.f1305r = true;
        this.f1307t = false;
        this.f1306s = false;
        mo2525f();
    }

    public void j_() {
    }

    public final void m701k() {
        this.f1305r = false;
        mo2526g();
    }

    public final void m702l() {
        mo2527h();
        this.f1307t = true;
        this.f1305r = false;
        this.f1306s = false;
        this.f1308u = false;
        this.f1309v = false;
    }

    public final boolean m703m() {
        boolean z = this.f1308u;
        this.f1308u = false;
        this.f1309v |= z;
        return z;
    }

    public final void m704n() {
        if (this.f1309v) {
            m705o();
        }
    }

    public final void m705o() {
        if (this.f1305r) {
            j_();
        } else {
            this.f1308u = true;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        C0466d.m980a(this, stringBuilder);
        stringBuilder.append(" id=");
        stringBuilder.append(this.f1301n);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
