package com.p085c.p086a.p089c.p092b.p094b;

import android.content.Context;
import com.p085c.p086a.p089c.p092b.p094b.C5128d.C1119a;
import java.io.File;

public final class C6446f extends C5128d {

    class C51301 implements C1119a {
        final /* synthetic */ Context f14348a;
        final /* synthetic */ String f14349b;

        C51301(Context context, String str) {
            this.f14348a = context;
            this.f14349b = str;
        }

        public final File mo1147a() {
            File cacheDir = this.f14348a.getCacheDir();
            return cacheDir == null ? null : this.f14349b != null ? new File(cacheDir, this.f14349b) : cacheDir;
        }
    }

    public C6446f(Context context) {
        this(context, "image_manager_disk_cache");
    }

    private C6446f(Context context, String str) {
        super(new C51301(context, str));
    }
}
