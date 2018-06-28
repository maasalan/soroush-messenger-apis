package com.p085c.p086a.p089c.p097c;

import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p097c.C1173m.C1172a;
import java.io.InputStream;

public final class C5203r<Data> implements C1173m<Integer, Data> {
    private final C1173m<Uri, Data> f14530a;
    private final Resources f14531b;

    public static class C5201a implements C1174n<Integer, ParcelFileDescriptor> {
        private final Resources f14528a;

        public C5201a(Resources resources) {
            this.f14528a = resources;
        }

        public final C1173m<Integer, ParcelFileDescriptor> mo1184a(C1180q c1180q) {
            return new C5203r(this.f14528a, c1180q.m2803a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class C5202b implements C1174n<Integer, InputStream> {
        private final Resources f14529a;

        public C5202b(Resources resources) {
            this.f14529a = resources;
        }

        public final C1173m<Integer, InputStream> mo1184a(C1180q c1180q) {
            return new C5203r(this.f14529a, c1180q.m2803a(Uri.class, InputStream.class));
        }
    }

    public C5203r(Resources resources, C1173m<Uri, Data> c1173m) {
        this.f14531b = resources;
        this.f14530a = c1173m;
    }

    private Uri m10743a(Integer num) {
        try {
            StringBuilder stringBuilder = new StringBuilder("android.resource://");
            stringBuilder.append(this.f14531b.getResourcePackageName(num.intValue()));
            stringBuilder.append('/');
            stringBuilder.append(this.f14531b.getResourceTypeName(num.intValue()));
            stringBuilder.append('/');
            stringBuilder.append(this.f14531b.getResourceEntryName(num.intValue()));
            return Uri.parse(stringBuilder.toString());
        } catch (Throwable e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                StringBuilder stringBuilder2 = new StringBuilder("Received invalid resource id: ");
                stringBuilder2.append(num);
                Log.w("ResourceLoader", stringBuilder2.toString(), e);
            }
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ C1172a mo1185a(Object obj, int i, int i2, C5253j c5253j) {
        Uri a = m10743a((Integer) obj);
        return a == null ? null : this.f14530a.mo1185a(a, i, i2, c5253j);
    }
}
