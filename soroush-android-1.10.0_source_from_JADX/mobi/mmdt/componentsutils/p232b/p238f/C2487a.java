package mobi.mmdt.componentsutils.p232b.p238f;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.media.ThumbnailUtils;
import java.io.FileOutputStream;
import java.io.OutputStream;
import mobi.mmdt.componentsutils.p232b.C2486e;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C2487a {
    public static synchronized Bitmap m6749a(String str) {
        Bitmap createVideoThumbnail;
        synchronized (C2487a.class) {
            createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(str, 1);
            int width = createVideoThumbnail.getWidth();
            int height = createVideoThumbnail.getHeight();
            int i = IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
            if (width < height) {
                width = (createVideoThumbnail.getWidth() * IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) / createVideoThumbnail.getHeight();
            } else {
                i = (createVideoThumbnail.getHeight() * IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) / createVideoThumbnail.getWidth();
                width = IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
            }
            createVideoThumbnail = ThumbnailUtils.extractThumbnail(createVideoThumbnail, width, i);
        }
        return createVideoThumbnail;
    }

    public static void m6750a(Bitmap bitmap, String str) {
        OutputStream fileOutputStream = new FileOutputStream(str);
        bitmap.compress(CompressFormat.JPEG, 50, fileOutputStream);
        fileOutputStream.close();
    }

    public static synchronized Bitmap m6751b(String str) {
        Bitmap a;
        synchronized (C2487a.class) {
            int width;
            a = C2486e.m6746a(str);
            int i = 256;
            if (a.getWidth() < a.getHeight()) {
                width = (a.getWidth() * 256) / a.getHeight();
            } else {
                i = (a.getHeight() * 256) / a.getWidth();
                width = 256;
            }
            a = ThumbnailUtils.extractThumbnail(a, width, i);
        }
        return a;
    }
}
