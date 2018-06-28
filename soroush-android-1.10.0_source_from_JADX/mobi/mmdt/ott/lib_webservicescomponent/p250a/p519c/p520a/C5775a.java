package mobi.mmdt.ott.lib_webservicescomponent.p250a.p519c.p520a;

import android.net.Uri;
import java.io.File;
import mobi.mmdt.ott.lib_webservicescomponent.p250a.p251a.C2547a;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2557c;

public final class C5775a extends C2547a {
    public C5775a(Uri uri, String str, String str2, String str3) {
        put("FileHash", C2557c.m7004b(uri.getPath()));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(new File(uri.getPath()).length());
        put("FileSize", stringBuilder.toString());
        put("FileName", new File(uri.getPath()).getName());
        put("Username", str);
        put("HashMethod", str2);
        put("AuthValue", "");
        put("AuthValue", C2547a.m6987a(this, str3));
    }
}
