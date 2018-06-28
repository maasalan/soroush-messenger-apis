package mobi.mmdt.ott.provider.p393o;

import android.net.Uri;
import mobi.mmdt.ott.provider.p381c.C2955c;

public final class C6046e extends C2955c<C6046e> {
    public final C6046e m13562a(String... strArr) {
        m7365a("stickers_complete_sticker_id", (Object[]) strArr);
        return this;
    }

    public final C6046e m13563b(int... iArr) {
        m7365a("stickers_sticker_id", C2955c.m7358a(iArr));
        return this;
    }

    public final C6046e m13564c(int... iArr) {
        m7365a("stickers_package_id", C2955c.m7358a(iArr));
        return this;
    }

    protected final Uri mo2223h() {
        return C3012b.f9455a;
    }
}
