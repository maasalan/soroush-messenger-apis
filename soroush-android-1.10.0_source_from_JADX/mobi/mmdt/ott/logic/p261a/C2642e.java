package mobi.mmdt.ott.logic.p261a;

import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.net.Uri;
import java.io.File;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.componentsutils.p232b.p238f.C2487a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.C2791c;
import mobi.mmdt.ott.provider.p386h.C2984c;
import mobi.mmdt.ott.provider.p386h.C2986h;
import mobi.mmdt.ott.provider.p386h.C2987i;
import mobi.mmdt.ott.provider.p386h.C2988j;

public final class C2642e {

    private static class C2640a {
        String f8535a;
        int f8536b;
        int f8537c;

        C2640a(String str, int i, int i2) {
            this.f8535a = str;
            this.f8536b = i;
            this.f8537c = i2;
        }
    }

    public static int m7051a(String str) {
        return str == null ? 0 : MediaPlayer.create(MyApplication.m12952b(), Uri.parse(str)).getDuration();
    }

    public static Long m7052a(File file, boolean z, boolean z2, int i, String str, C2988j c2988j, int i2, int i3, long j) {
        C2640a c2640a;
        int i4;
        int i5;
        C2988j c2988j2 = c2988j;
        Uri uri = null;
        C2986h c2986h = z ? C2986h.STOP : null;
        int i6 = z ? 0 : -1;
        if (z2) {
            try {
                Bitmap b;
                String b2 = C2791c.m7109a().m7114b();
                switch (c2988j) {
                    case IMAGE:
                    case GIF:
                        b = C2487a.m6751b(str);
                        break;
                    case VIDEO:
                        b = C2487a.m6749a(str);
                        break;
                    default:
                        c2640a = new C2640a(b2, 0, 0);
                        break;
                }
                C2487a.m6750a(b, b2);
                int width = b.getWidth();
                int height = b.getHeight();
                b.recycle();
                c2640a = new C2640a(b2, width, height);
            } catch (Throwable e) {
                C2480b.m6737b("outOfMemory error in create thumbnail", e);
            }
            if (c2640a != null) {
                if (z2 && new File(c2640a.f8535a).length() != 0) {
                    uri = Uri.fromFile(new File(c2640a.f8535a));
                }
                if (c2988j2.equals(C2988j.VIDEO) || c2988j2.equals(C2988j.GIF)) {
                    i4 = c2640a.f8536b;
                    i5 = c2640a.f8537c;
                    return Long.valueOf(C2984c.m7459a(Uri.fromFile(file), null, null, c2988j2, file.getName(), j, uri, null, i, C2987i.TRANSMITTING, C2987i.TRANSMITTING, c2986h, i6, i4, i5));
                }
            }
            i4 = i2;
            i5 = i3;
            return Long.valueOf(C2984c.m7459a(Uri.fromFile(file), null, null, c2988j2, file.getName(), j, uri, null, i, C2987i.TRANSMITTING, C2987i.TRANSMITTING, c2986h, i6, i4, i5));
        }
        c2640a = null;
        if (c2640a != null) {
            uri = Uri.fromFile(new File(c2640a.f8535a));
            i4 = c2640a.f8536b;
            i5 = c2640a.f8537c;
            return Long.valueOf(C2984c.m7459a(Uri.fromFile(file), null, null, c2988j2, file.getName(), j, uri, null, i, C2987i.TRANSMITTING, C2987i.TRANSMITTING, c2986h, i6, i4, i5));
        }
        i4 = i2;
        i5 = i3;
        return Long.valueOf(C2984c.m7459a(Uri.fromFile(file), null, null, c2988j2, file.getName(), j, uri, null, i, C2987i.TRANSMITTING, C2987i.TRANSMITTING, c2986h, i6, i4, i5));
    }
}
