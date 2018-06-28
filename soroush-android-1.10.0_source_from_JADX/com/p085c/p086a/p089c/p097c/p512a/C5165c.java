package com.p085c.p086a.p089c.p097c.p512a;

import android.content.Context;
import android.net.Uri;
import com.p085c.p086a.p089c.C1208h;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p090a.p091a.C1092b;
import com.p085c.p086a.p089c.p090a.p091a.C5104c;
import com.p085c.p086a.p089c.p090a.p091a.C5104c.C5102a;
import com.p085c.p086a.p089c.p097c.C1173m;
import com.p085c.p086a.p089c.p097c.C1173m.C1172a;
import com.p085c.p086a.p089c.p097c.C1174n;
import com.p085c.p086a.p089c.p097c.C1180q;
import com.p085c.p086a.p108h.C5277c;
import java.io.InputStream;

public final class C5165c implements C1173m<Uri, InputStream> {
    public final Context f14480a;

    public static class C5164a implements C1174n<Uri, InputStream> {
        private final Context f14479a;

        public C5164a(Context context) {
            this.f14479a = context;
        }

        public final C1173m<Uri, InputStream> mo1184a(C1180q c1180q) {
            return new C5165c(this.f14479a);
        }
    }

    public C5165c(Context context) {
        this.f14480a = context.getApplicationContext();
    }

    public final /* synthetic */ C1172a mo1185a(Object obj, int i, int i2, C5253j c5253j) {
        Uri uri = (Uri) obj;
        if (!C1092b.m2655a(i, i2)) {
            return null;
        }
        C1208h c5277c = new C5277c(uri);
        Context context = this.f14480a;
        return new C1172a(c5277c, C5104c.m10453a(context, uri, new C5102a(context.getContentResolver())));
    }

    public final /* synthetic */ boolean mo1186a(Object obj) {
        Uri uri = (Uri) obj;
        return C1092b.m2656a(uri) && !C1092b.m2657b(uri);
    }
}
