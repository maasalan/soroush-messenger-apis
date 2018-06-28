package com.p085c.p086a.p089c.p098d.p099a;

import android.graphics.Bitmap;
import com.p085c.p086a.p089c.C1211k;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p092b.C1159s;
import com.p085c.p086a.p089c.p092b.p093a.C1104b;
import com.p085c.p086a.p089c.p092b.p093a.C1106e;
import com.p085c.p086a.p089c.p098d.p099a.C1188m.C1187a;
import com.p085c.p086a.p109i.C1266c;
import com.p085c.p086a.p109i.C1269f;
import java.io.IOException;
import java.io.InputStream;

public final class C5231q implements C1211k<InputStream, Bitmap> {
    private final C1188m f14556a;
    private final C1104b f14557b;

    static class C5230a implements C1187a {
        private final C1190p f14554a;
        private final C1266c f14555b;

        public C5230a(C1190p c1190p, C1266c c1266c) {
            this.f14554a = c1190p;
            this.f14555b = c1266c;
        }

        public final void mo1212a() {
            this.f14554a.m2833a();
        }

        public final void mo1213a(C1106e c1106e, Bitmap bitmap) {
            IOException iOException = this.f14555b.f3969a;
            if (iOException != null) {
                if (bitmap != null) {
                    c1106e.mo1138a(bitmap);
                }
                throw iOException;
            }
        }
    }

    public C5231q(C1188m c1188m, C1104b c1104b) {
        this.f14556a = c1188m;
        this.f14557b = c1104b;
    }

    private C1159s<Bitmap> m10820a(InputStream inputStream, int i, int i2, C5253j c5253j) {
        Object obj;
        if (inputStream instanceof C1190p) {
            inputStream = (C1190p) inputStream;
            obj = null;
        } else {
            InputStream c1190p = new C1190p(inputStream, this.f14557b);
            obj = 1;
            inputStream = c1190p;
        }
        InputStream a = C1266c.m2995a(inputStream);
        try {
            C1159s<Bitmap> a2 = this.f14556a.m2830a(new C1269f(a), i, i2, c5253j, new C5230a(inputStream, a));
            return a2;
        } finally {
            a.m2996a();
            if (obj != null) {
                inputStream.m2834b();
            }
        }
    }

    public final /* bridge */ /* synthetic */ boolean mo1200a(Object obj, C5253j c5253j) {
        return C1188m.m2823a();
    }
}
