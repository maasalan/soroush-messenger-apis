package com.p085c.p086a.p089c.p097c;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p090a.C1096b;
import com.p085c.p086a.p089c.p090a.C6443g;
import com.p085c.p086a.p089c.p090a.C6445l;
import com.p085c.p086a.p089c.p097c.C1173m.C1172a;
import com.p085c.p086a.p108h.C5277c;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class C5213v<Data> implements C1173m<Uri, Data> {
    private static final Set<String> f14537a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));
    private final C1181b<Data> f14538b;

    public interface C1181b<Data> {
        C1096b<Data> mo1198a(Uri uri);
    }

    public static class C5211a implements C1174n<Uri, ParcelFileDescriptor>, C1181b<ParcelFileDescriptor> {
        private final ContentResolver f14535a;

        public C5211a(ContentResolver contentResolver) {
            this.f14535a = contentResolver;
        }

        public final C1096b<ParcelFileDescriptor> mo1198a(Uri uri) {
            return new C6443g(this.f14535a, uri);
        }

        public final C1173m<Uri, ParcelFileDescriptor> mo1184a(C1180q c1180q) {
            return new C5213v(this);
        }
    }

    public static class C5212c implements C1174n<Uri, InputStream>, C1181b<InputStream> {
        private final ContentResolver f14536a;

        public C5212c(ContentResolver contentResolver) {
            this.f14536a = contentResolver;
        }

        public final C1096b<InputStream> mo1198a(Uri uri) {
            return new C6445l(this.f14536a, uri);
        }

        public final C1173m<Uri, InputStream> mo1184a(C1180q c1180q) {
            return new C5213v(this);
        }
    }

    public C5213v(C1181b<Data> c1181b) {
        this.f14538b = c1181b;
    }

    public final /* synthetic */ C1172a mo1185a(Object obj, int i, int i2, C5253j c5253j) {
        Uri uri = (Uri) obj;
        return new C1172a(new C5277c(uri), this.f14538b.mo1198a(uri));
    }

    public final /* synthetic */ boolean mo1186a(Object obj) {
        return f14537a.contains(((Uri) obj).getScheme());
    }
}
