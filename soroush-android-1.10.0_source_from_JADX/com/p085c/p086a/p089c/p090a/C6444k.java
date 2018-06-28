package com.p085c.p086a.p089c.p090a;

import android.content.res.AssetManager;
import java.io.InputStream;

public final class C6444k extends C5105a<InputStream> {
    public C6444k(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    protected final /* synthetic */ Object mo2690a(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }

    protected final /* synthetic */ void mo2691a(Object obj) {
        ((InputStream) obj).close();
    }

    public final Class<InputStream> mo1112d() {
        return InputStream.class;
    }
}
