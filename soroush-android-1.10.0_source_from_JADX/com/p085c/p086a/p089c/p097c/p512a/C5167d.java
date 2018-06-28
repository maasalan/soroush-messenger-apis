package com.p085c.p086a.p089c.p097c.p512a;

import android.content.Context;
import android.net.Uri;
import com.p085c.p086a.p089c.C1208h;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p090a.p091a.C1092b;
import com.p085c.p086a.p089c.p090a.p091a.C5104c;
import com.p085c.p086a.p089c.p090a.p091a.C5104c.C5103b;
import com.p085c.p086a.p089c.p097c.C1173m;
import com.p085c.p086a.p089c.p097c.C1173m.C1172a;
import com.p085c.p086a.p089c.p097c.C1174n;
import com.p085c.p086a.p089c.p097c.C1180q;
import com.p085c.p086a.p089c.p098d.p099a.C5234s;
import com.p085c.p086a.p108h.C5277c;
import java.io.InputStream;

public final class C5167d implements C1173m<Uri, InputStream> {
    private final Context f14482a;

    public static class C5166a implements C1174n<Uri, InputStream> {
        private final Context f14481a;

        public C5166a(Context context) {
            this.f14481a = context;
        }

        public final C1173m<Uri, InputStream> mo1184a(C1180q c1180q) {
            return new C5167d(this.f14481a);
        }
    }

    C5167d(Context context) {
        this.f14482a = context.getApplicationContext();
    }

    public final /* synthetic */ C1172a mo1185a(Object obj, int i, int i2, C5253j c5253j) {
        Uri uri = (Uri) obj;
        if (C1092b.m2655a(i, i2)) {
            Long l = (Long) c5253j.m10873a(C5234s.f14560a);
            Object obj2 = (l == null || l.longValue() != -1) ? null : 1;
            if (obj2 != null) {
                C1208h c5277c = new C5277c(uri);
                Context context = this.f14482a;
                return new C1172a(c5277c, C5104c.m10453a(context, uri, new C5103b(context.getContentResolver())));
            }
        }
        return null;
    }

    public final /* synthetic */ boolean mo1186a(Object obj) {
        Uri uri = (Uri) obj;
        return C1092b.m2656a(uri) && C1092b.m2657b(uri);
    }
}
