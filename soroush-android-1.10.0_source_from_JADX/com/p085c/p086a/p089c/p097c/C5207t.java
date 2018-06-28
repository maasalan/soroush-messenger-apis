package com.p085c.p086a.p089c.p097c;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p097c.C1173m.C1172a;
import java.io.File;
import java.io.InputStream;

public final class C5207t<Data> implements C1173m<String, Data> {
    private final C1173m<Uri, Data> f14533a;

    public static class C5205a implements C1174n<String, ParcelFileDescriptor> {
        public final C1173m<String, ParcelFileDescriptor> mo1184a(C1180q c1180q) {
            return new C5207t(c1180q.m2803a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class C5206b implements C1174n<String, InputStream> {
        public final C1173m<String, InputStream> mo1184a(C1180q c1180q) {
            return new C5207t(c1180q.m2803a(Uri.class, InputStream.class));
        }
    }

    public C5207t(C1173m<Uri, Data> c1173m) {
        this.f14533a = c1173m;
    }

    private static Uri m10750a(String str) {
        return Uri.fromFile(new File(str));
    }

    public final /* synthetic */ C1172a mo1185a(Object obj, int i, int i2, C5253j c5253j) {
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            obj = null;
        } else {
            if (!str.startsWith("/")) {
                Uri parse = Uri.parse(str);
                if (parse.getScheme() != null) {
                    obj = parse;
                }
            }
            obj = C5207t.m10750a(str);
        }
        return obj == null ? null : this.f14533a.mo1185a(obj, i, i2, c5253j);
    }
}
