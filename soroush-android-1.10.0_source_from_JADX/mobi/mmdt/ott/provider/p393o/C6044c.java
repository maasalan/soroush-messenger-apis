package mobi.mmdt.ott.provider.p393o;

import android.content.Context;
import android.net.Uri;
import mobi.mmdt.ott.provider.p381c.C2953a;

public final class C6044c extends C2953a {
    public final int m13547a(Context context, C6046e c6046e) {
        return context.getContentResolver().update(C3012b.f9455a, m7350b(), c6046e.f9181a.toString(), c6046e.m7370e());
    }

    public final Uri mo2224a() {
        return C3012b.f9455a;
    }

    public final C6044c m13549a(int i) {
        this.a.put("stickers_sticker_id", Integer.valueOf(i));
        return this;
    }

    public final C6044c m13550a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("completeStickerId must not be null");
        }
        this.a.put("stickers_complete_sticker_id", str);
        return this;
    }

    public final C6044c m13551b(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("downloadState must not be null");
        }
        this.a.put("stickers_download_state", Integer.valueOf(i - 1));
        return this;
    }

    public final C6044c m13552b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("originalUri must not be null");
        }
        this.a.put("stickers_original_uri", str);
        return this;
    }

    public final C6044c m13553c(int i) {
        this.a.put("stickers_package_id", Integer.valueOf(i));
        return this;
    }

    public final C6044c m13554c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("thumbnailUri must not be null");
        }
        this.a.put("stickers_thumbnail_uri", str);
        return this;
    }

    public final C6044c m13555d(int i) {
        this.a.put("stickers_sticker_version", Integer.valueOf(i));
        return this;
    }

    public final C6044c m13556e(int i) {
        this.a.put("stickers_x_axis", Integer.valueOf(i));
        return this;
    }

    public final C6044c m13557f(int i) {
        this.a.put("stickers_y_axis", Integer.valueOf(i));
        return this;
    }

    public final C6044c m13558g(int i) {
        this.a.put("stickers_ver_span", Integer.valueOf(i));
        return this;
    }

    public final C6044c m13559h(int i) {
        this.a.put("stickers_hor_span", Integer.valueOf(i));
        return this;
    }

    public final C6044c m13560i(int i) {
        this.a.put("stickers_view_multiplier", Integer.valueOf(i));
        return this;
    }
}
