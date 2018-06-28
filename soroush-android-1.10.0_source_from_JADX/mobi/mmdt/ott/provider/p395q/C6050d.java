package mobi.mmdt.ott.provider.p395q;

import android.net.Uri;
import mobi.mmdt.ott.provider.p381c.C2953a;

public final class C6050d extends C2953a {
    public final Uri mo2224a() {
        return C3020c.f9490a;
    }

    public final C6050d m13591a(Integer num) {
        this.a.put("parent_category_id", num);
        return this;
    }

    public final C6050d m13592a(Long l) {
        this.a.put("channel_creation_date", l);
        return this;
    }

    public final C6050d m13593a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("party must not be null");
        }
        this.a.put("party", str);
        return this;
    }

    public final C6050d m13594a(C3021f c3021f) {
        this.a.put("item_type", c3021f == null ? null : Integer.valueOf(c3021f.ordinal()));
        return this;
    }

    public final C6050d m13595a(boolean z) {
        this.a.put("is_disabled", Boolean.valueOf(z));
        return this;
    }

    public final C6050d m13596b(Integer num) {
        this.a.put("item_index", num);
        return this;
    }

    public final C6050d m13597b(Long l) {
        this.a.put("channel_members_count", l);
        return this;
    }

    public final C6050d m13598b(String str) {
        this.a.put("title", str);
        return this;
    }

    public final C6050d m13599c(Integer num) {
        this.a.put("avatar_res_id", num);
        return this;
    }

    public final C6050d m13600c(Long l) {
        this.a.put("category_updated_at", l);
        return this;
    }

    public final C6050d m13601c(String str) {
        this.a.put("description", str);
        return this;
    }

    public final C6050d m13602d(String str) {
        this.a.put("channel_link", str);
        return this;
    }

    public final C6050d m13603e(String str) {
        this.a.put("avatar_url", str);
        return this;
    }

    public final C6050d m13604f(String str) {
        this.a.put("avatar_thumbnail_url", str);
        return this;
    }

    public final C6050d m13605g(String str) {
        this.a.put("extra", str);
        return this;
    }
}
