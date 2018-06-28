package mobi.mmdt.ott.provider.p392n;

import android.net.Uri;
import mobi.mmdt.ott.provider.p381c.C2953a;

public final class C6041d extends C2953a {
    public final Uri mo2224a() {
        return C3010c.f9453a;
    }

    public final C6041d m13542a(String str) {
        this.a.put("report_events_columns_category", str);
        return this;
    }

    public final C6041d m13543b(String str) {
        this.a.put("report_events_columns_action", str);
        return this;
    }

    public final C6041d m13544c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("description must not be null");
        }
        this.a.put("report_events_columns_description", str);
        return this;
    }
}
