package com.p085c.p086a.p089c.p097c.p512a;

import android.net.Uri;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p097c.C1173m;
import com.p085c.p086a.p089c.p097c.C1173m.C1172a;
import com.p085c.p086a.p089c.p097c.C1174n;
import com.p085c.p086a.p089c.p097c.C1180q;
import com.p085c.p086a.p089c.p097c.C5190g;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class C5163b implements C1173m<Uri, InputStream> {
    private static final Set<String> f14477a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));
    private final C1173m<C5190g, InputStream> f14478b;

    public static class C5162a implements C1174n<Uri, InputStream> {
        public final C1173m<Uri, InputStream> mo1184a(C1180q c1180q) {
            return new C5163b(c1180q.m2803a(C5190g.class, InputStream.class));
        }
    }

    public C5163b(C1173m<C5190g, InputStream> c1173m) {
        this.f14478b = c1173m;
    }

    public final /* synthetic */ C1172a mo1185a(Object obj, int i, int i2, C5253j c5253j) {
        return this.f14478b.mo1185a(new C5190g(((Uri) obj).toString()), i, i2, c5253j);
    }

    public final /* synthetic */ boolean mo1186a(Object obj) {
        return f14477a.contains(((Uri) obj).getScheme());
    }
}
