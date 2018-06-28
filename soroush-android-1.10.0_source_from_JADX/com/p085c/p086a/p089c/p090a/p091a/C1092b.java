package com.p085c.p086a.p089c.p090a.p091a;

import android.net.Uri;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C1092b {
    public static boolean m2655a(int i, int i2) {
        return i <= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED && i2 <= 384;
    }

    public static boolean m2656a(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean m2657b(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
