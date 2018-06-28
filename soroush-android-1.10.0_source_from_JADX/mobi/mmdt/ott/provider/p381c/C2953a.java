package mobi.mmdt.ott.provider.p381c;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;

public abstract class C2953a {
    protected final ContentValues f9179a = new ContentValues();

    public abstract Uri mo2224a();

    public final Uri m7349a(Context context) {
        return context.getContentResolver().insert(mo2224a(), this.f9179a);
    }

    public final ContentValues m7350b() {
        return this.f9179a;
    }
}
