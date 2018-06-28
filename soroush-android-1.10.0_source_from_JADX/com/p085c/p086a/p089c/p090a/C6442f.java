package com.p085c.p086a.p089c.p090a;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;

public final class C6442f extends C5105a<ParcelFileDescriptor> {
    public C6442f(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    protected final /* synthetic */ Object mo2690a(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }

    protected final /* synthetic */ void mo2691a(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }

    public final Class<ParcelFileDescriptor> mo1112d() {
        return ParcelFileDescriptor.class;
    }
}
