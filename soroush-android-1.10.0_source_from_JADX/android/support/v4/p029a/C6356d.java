package android.support.v4.p029a;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.os.C0507a;
import android.support.v4.os.C0509c;
import android.support.v4.p029a.C0350e.C0347a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

public final class C6356d extends C4764a<Cursor> {
    final C0347a f17391f = new C0347a(this);
    Uri f17392g;
    String[] f17393h;
    String f17394i;
    String[] f17395j;
    String f17396k;
    Cursor f17397l;
    C0507a f17398m;

    public C6356d(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.f17392g = uri;
        this.f17393h = strArr;
        this.f17394i = str;
        this.f17395j = strArr2;
        this.f17396k = str2;
    }

    private void m14941a(Cursor cursor) {
        if (this.f1307t) {
            if (cursor != null) {
                cursor.close();
            }
            return;
        }
        Cursor cursor2 = this.f17397l;
        this.f17397l = cursor;
        if (this.f1305r) {
            super.mo2522b(cursor);
        }
        if (!(cursor2 == null || cursor2 == cursor || cursor2.isClosed())) {
            cursor2.close();
        }
    }

    private Cursor m14942p() {
        synchronized (this) {
            if ((this.f13164b != null ? 1 : null) != null) {
                throw new C0509c();
            }
            this.f17398m = new C0507a();
        }
        Cursor a;
        try {
            a = C0345b.m680a(this.f1304q.getContentResolver(), this.f17392g, this.f17393h, this.f17394i, this.f17395j, this.f17396k, this.f17398m);
            if (a != null) {
                a.getCount();
                a.registerContentObserver(this.f17391f);
            }
            synchronized (this) {
                this.f17398m = null;
            }
            return a;
        } catch (RuntimeException e) {
            a.close();
            throw e;
        } catch (Throwable th) {
            synchronized (this) {
                this.f17398m = null;
            }
        }
    }

    public final /* synthetic */ void mo2521a(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    public final void mo218a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo218a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f17392g);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f17393h));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f17394i);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f17395j));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f17396k);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f17397l);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.u);
    }

    public final /* synthetic */ void mo2522b(Object obj) {
        m14941a((Cursor) obj);
    }

    public final /* synthetic */ Object mo2523d() {
        return m14942p();
    }

    public final void mo2524e() {
        super.mo2524e();
        synchronized (this) {
            if (this.f17398m != null) {
                this.f17398m.m1115b();
            }
        }
    }

    protected final void mo2525f() {
        if (this.f17397l != null) {
            m14941a(this.f17397l);
        }
        if (m703m() || this.f17397l == null) {
            j_();
        }
    }

    protected final void mo2526g() {
        mo219b();
    }

    protected final void mo2527h() {
        super.mo2527h();
        mo219b();
        if (!(this.f17397l == null || this.f17397l.isClosed())) {
            this.f17397l.close();
        }
        this.f17397l = null;
    }
}
