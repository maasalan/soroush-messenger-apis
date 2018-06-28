package com.p085c.p086a.p089c.p097c;

import android.net.Uri;
import android.text.TextUtils;
import com.p085c.p086a.p089c.C1208h;
import com.p085c.p086a.p109i.C1271h;
import java.net.URL;
import java.security.MessageDigest;

public class C5190g implements C1208h {
    public final C1167h f14504b;
    public URL f14505c;
    private final URL f14506d;
    private final String f14507e;
    private String f14508f;
    private volatile byte[] f14509g;
    private int f14510h;

    public C5190g(String str) {
        this(str, C1167h.f3725b);
    }

    public C5190g(String str, C1167h c1167h) {
        this.f14506d = null;
        this.f14507e = C1271h.m3013a(str);
        this.f14504b = (C1167h) C1271h.m3012a((Object) c1167h, "Argument must not be null");
    }

    public C5190g(URL url) {
        this(url, C1167h.f3725b);
    }

    private C5190g(URL url, C1167h c1167h) {
        this.f14506d = (URL) C1271h.m3012a((Object) url, "Argument must not be null");
        this.f14507e = null;
        this.f14504b = (C1167h) C1271h.m3012a((Object) c1167h, "Argument must not be null");
    }

    private String m10714b() {
        return this.f14507e != null ? this.f14507e : this.f14506d.toString();
    }

    public final String m10715a() {
        if (TextUtils.isEmpty(this.f14508f)) {
            String str = this.f14507e;
            if (TextUtils.isEmpty(str)) {
                str = this.f14506d.toString();
            }
            this.f14508f = Uri.encode(str, "@#&=*+-_.,:!?()/~'%");
        }
        return this.f14508f;
    }

    public final void mo1158a(MessageDigest messageDigest) {
        if (this.f14509g == null) {
            this.f14509g = m10714b().getBytes(a);
        }
        messageDigest.update(this.f14509g);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5190g) {
            C5190g c5190g = (C5190g) obj;
            if (m10714b().equals(c5190g.m10714b()) && this.f14504b.equals(c5190g.f14504b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f14510h == 0) {
            this.f14510h = m10714b().hashCode();
            this.f14510h = (31 * this.f14510h) + this.f14504b.hashCode();
        }
        return this.f14510h;
    }

    public String toString() {
        return m10714b();
    }
}
