package mobi.mmdt.ott.provider.p388j;

import android.net.Uri;
import mobi.mmdt.ott.provider.p381c.C2953a;

public final class C6030d extends C2953a {
    public final Uri mo2224a() {
        return C2997c.f9405a;
    }

    public final C6030d m13476a(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("type must not be null");
        }
        this.a.put("row_type", Integer.valueOf(i - 1));
        return this;
    }

    public final C6030d m13477a(long j) {
        this.a.put("_id", Long.valueOf(j));
        return this;
    }

    public final C6030d m13478a(Boolean bool) {
        this.a.put("row_category_has_more_items", bool);
        return this;
    }

    public final C6030d m13479a(Integer num) {
        this.a.put("row_display_order", num);
        return this;
    }

    public final C6030d m13480a(String str) {
        this.a.put("row_title", str);
        return this;
    }

    public final C6030d m13481b(int i) {
        this.a.put("row_parent_landing_page_id", Integer.valueOf(i));
        return this;
    }

    public final C6030d m13482b(long j) {
        this.a.put("row_updated_at", Long.valueOf(j));
        return this;
    }

    public final C6030d m13483b(Integer num) {
        this.a.put("row_interval", num);
        return this;
    }

    public final C6030d m13484b(String str) {
        this.a.put("row_category_image", str);
        return this;
    }

    public final C6030d m13485c(Integer num) {
        this.a.put("row_category_visible_items_counts", num);
        return this;
    }
}
