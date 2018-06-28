package mobi.mmdt.ott.provider.p395q;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import mobi.mmdt.ott.provider.p381c.C2955c;

public final class C6052g extends C2955c<C6052g> {
    public final C6052g m13606a(Integer... numArr) {
        m7365a("parent_category_id", (Object[]) numArr);
        return this;
    }

    public final C6052g m13607a(String... strArr) {
        m7365a("party", (Object[]) strArr);
        return this;
    }

    public final C6051e m13608b(Context context) {
        Cursor query = context.getContentResolver().query(m7372g(), null, this.f9181a.toString(), m7370e(), m7371f());
        return query == null ? null : new C6051e(query);
    }

    protected final Uri mo2223h() {
        return C3020c.f9490a;
    }
}
