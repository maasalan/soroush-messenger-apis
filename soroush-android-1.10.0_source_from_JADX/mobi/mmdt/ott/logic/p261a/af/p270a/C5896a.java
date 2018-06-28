package mobi.mmdt.ott.logic.p261a.af.p270a;

import android.net.Uri;
import java.io.File;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;

public final class C5896a extends C2600f {
    public C5896a(Uri uri, Uri uri2, boolean z, String str, String str2, C2606l c2606l, int i) {
        String stringBuilder;
        super(uri, uri2, z, str, str2, c2606l.toString().toLowerCase(), i);
        if (z) {
            StringBuilder stringBuilder2 = new StringBuilder("##### Upload File Info: < Local Address File: ");
            stringBuilder2.append(uri);
            stringBuilder2.append(" > < Local Address Thumbnail: ");
            stringBuilder2.append(uri2);
            stringBuilder2.append(" > < Upload File Length: ");
            stringBuilder2.append(C2491i.m6824c(MyApplication.m12952b(), new File(uri.getPath()).length()));
            stringBuilder2.append("  > < Upload Thumbnail Length: ");
            stringBuilder2.append(C2491i.m6824c(MyApplication.m12952b(), new File(uri2.getPath()).length()));
            stringBuilder2.append(" >");
            stringBuilder = stringBuilder2.toString();
        } else {
            StringBuilder stringBuilder3 = new StringBuilder("##### Upload File Info: < Local Address File: ");
            stringBuilder3.append(uri);
            stringBuilder3.append(" > < Upload File Length: ");
            stringBuilder3.append(C2491i.m6824c(MyApplication.m12952b(), new File(uri.getPath()).length()));
            stringBuilder3.append("  > ");
            stringBuilder = stringBuilder3.toString();
        }
        C2480b.m6736b(stringBuilder);
    }

    public C5896a(Uri uri, String str, String str2, int i) {
        super(uri, str, str2, i);
    }
}
