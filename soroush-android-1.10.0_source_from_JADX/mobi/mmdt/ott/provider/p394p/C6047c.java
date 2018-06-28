package mobi.mmdt.ott.provider.p394p;

import android.content.Context;
import android.net.Uri;
import mobi.mmdt.ott.provider.p381c.C2953a;

public final class C6047c extends C2953a {
    public final int m13566a(Context context, C6049e c6049e) {
        return context.getContentResolver().update(C3015b.f9463a, m7350b(), c6049e.f9181a.toString(), c6049e.m7370e());
    }

    public final Uri mo2224a() {
        return C3015b.f9463a;
    }

    public final C6047c m13568a(int i) {
        this.a.put("stickerspackage_package_version", Integer.valueOf(i));
        return this;
    }

    public final C6047c m13569a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("price must not be null");
        }
        this.a.put("stickerspackage_price", str);
        return this;
    }

    public final C6047c m13570a(C3016f c3016f) {
        if (c3016f == null) {
            throw new IllegalArgumentException("downloadState must not be null");
        }
        this.a.put("stickerspackage_download_state", Integer.valueOf(c3016f.ordinal()));
        return this;
    }

    public final C6047c m13571a(boolean z) {
        this.a.put("stickerspackage_is_hidden", Boolean.valueOf(z));
        return this;
    }

    public final C6047c m13572b(int i) {
        this.a.put("stickerspackage_progress", Integer.valueOf(i));
        return this;
    }

    public final C6047c m13573b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("designer must not be null");
        }
        this.a.put("stickerspackage_designer", str);
        return this;
    }

    public final C6047c m13574c(int i) {
        this.a.put("stickerspackage_download_id", Integer.valueOf(i));
        return this;
    }

    public final C6047c m13575c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("field must not be null");
        }
        this.a.put("stickerspackage_field", str);
        return this;
    }

    public final C6047c m13576d(int i) {
        this.a.put("stickerspackage_package_id", Integer.valueOf(i));
        return this;
    }

    public final C6047c m13577d(String str) {
        if (str == null) {
            throw new IllegalArgumentException("name must not be null");
        }
        this.a.put("stickerspackage_name", str);
        return this;
    }

    public final C6047c m13578e(int i) {
        this.a.put("stickerspackage_count", Integer.valueOf(i));
        return this;
    }

    public final C6047c m13579e(String str) {
        if (str == null) {
            throw new IllegalArgumentException("thumbnailUri must not be null");
        }
        this.a.put("stickerspackage_thumbnail_uri", str);
        return this;
    }

    public final C6047c m13580f(String str) {
        this.a.put("stickerspackage_description", str);
        return this;
    }
}
