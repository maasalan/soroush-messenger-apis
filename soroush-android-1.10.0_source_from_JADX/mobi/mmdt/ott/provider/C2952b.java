package mobi.mmdt.ott.provider;

import android.database.ContentObserver;
import android.net.Uri;
import mobi.mmdt.ott.MyApplication;

public final class C2952b extends ContentObserver {
    private C6011a f9178a;

    public interface C6011a {
        void mo3447a();
    }

    public C2952b(C6011a c6011a, Uri... uriArr) {
        super(null);
        this.f9178a = c6011a;
        for (Uri registerContentObserver : uriArr) {
            MyApplication.m12952b().getContentResolver().registerContentObserver(registerContentObserver, false, this);
        }
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        this.f9178a.mo3447a();
    }
}
