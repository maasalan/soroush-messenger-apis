package com.p085c.p086a.p089c.p097c;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p090a.C1096b;
import com.p085c.p086a.p089c.p090a.C6442f;
import com.p085c.p086a.p089c.p090a.C6444k;
import com.p085c.p086a.p089c.p097c.C1173m.C1172a;
import com.p085c.p086a.p108h.C5277c;
import java.io.InputStream;

public final class C5170a<Data> implements C1173m<Uri, Data> {
    private static final int f14484a = 22;
    private final AssetManager f14485b;
    private final C5161a<Data> f14486c;

    public interface C5161a<Data> {
        C1096b<Data> mo1183a(AssetManager assetManager, String str);
    }

    public static class C5163b implements C5161a<ParcelFileDescriptor>, C1174n<Uri, ParcelFileDescriptor> {
        private final AssetManager f14472a;

        public C5163b(AssetManager assetManager) {
            this.f14472a = assetManager;
        }

        public final C1096b<ParcelFileDescriptor> mo1183a(AssetManager assetManager, String str) {
            return new C6442f(assetManager, str);
        }

        public final C1173m<Uri, ParcelFileDescriptor> mo1184a(C1180q c1180q) {
            return new C5170a(this.f14472a, this);
        }
    }

    public static class C5165c implements C5161a<InputStream>, C1174n<Uri, InputStream> {
        private final AssetManager f14473a;

        public C5165c(AssetManager assetManager) {
            this.f14473a = assetManager;
        }

        public final C1096b<InputStream> mo1183a(AssetManager assetManager, String str) {
            return new C6444k(assetManager, str);
        }

        public final C1173m<Uri, InputStream> mo1184a(C1180q c1180q) {
            return new C5170a(this.f14473a, this);
        }
    }

    public C5170a(AssetManager assetManager, C5161a<Data> c5161a) {
        this.f14485b = assetManager;
        this.f14486c = c5161a;
    }

    public final /* synthetic */ C1172a mo1185a(Object obj, int i, int i2, C5253j c5253j) {
        Uri uri = (Uri) obj;
        return new C1172a(new C5277c(uri), this.f14486c.mo1183a(this.f14485b, uri.toString().substring(f14484a)));
    }

    public final /* synthetic */ boolean mo1186a(Object obj) {
        Uri uri = (Uri) obj;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
