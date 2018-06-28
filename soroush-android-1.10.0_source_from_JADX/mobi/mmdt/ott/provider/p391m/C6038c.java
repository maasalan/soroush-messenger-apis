package mobi.mmdt.ott.provider.p391m;

import android.net.Uri;
import mobi.mmdt.ott.provider.p381c.C2953a;

public final class C6038c extends C2953a {
    public final Uri mo2224a() {
        return C3007b.f9448a;
    }

    public final C6038c m13535a(int i) {
        this.a.put("recentemoji_usage_count", Integer.valueOf(i));
        return this;
    }

    public final C6038c m13536a(String str) {
        this.a.put("recentemoji_value", str);
        return this;
    }

    public final C6038c m13537b(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("EmojiSource must not be null");
        }
        this.a.put("recentemoji_emoji_source", Integer.valueOf(i - 1));
        return this;
    }
}
