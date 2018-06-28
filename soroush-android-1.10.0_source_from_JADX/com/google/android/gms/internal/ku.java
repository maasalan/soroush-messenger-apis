package com.google.android.gms.internal;

import android.net.Uri;
import com.google.android.gms.common.api.C1708a;
import com.google.android.gms.common.api.C1708a.C5445b;
import com.google.android.gms.common.api.C1708a.C5447g;

public final class ku {
    private static final C5447g<li> f6081a = new C5447g();
    private static final C5445b<li, Object> f6082b = new kv();
    @Deprecated
    private static C1708a<Object> f6083c = new C1708a("Phenotype.API", f6082b, f6081a);
    @Deprecated
    private static kw f6084d = new lh();

    public static Uri m4963a(String str) {
        String str2 = "content://com.google.android.gms.phenotype/";
        str = String.valueOf(Uri.encode(str));
        return Uri.parse(str.length() != 0 ? str2.concat(str) : new String(str2));
    }
}
