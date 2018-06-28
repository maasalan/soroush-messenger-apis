package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;

public final class cf extends C5506v {
    protected boolean f18102a;
    protected int f18103b;
    private String f18104c;
    private String f18105d;
    private int f18106e;
    private boolean f18107g;
    private boolean f18108h;

    public cf(C1827x c1827x) {
        super(c1827x);
    }

    public final String m16014b() {
        m12037k();
        return this.f18104c;
    }

    public final String m16015c() {
        m12037k();
        return this.f18105d;
    }

    protected final void c_() {
        ApplicationInfo applicationInfo;
        Context context = this.f6279f.f6283a;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 129);
        } catch (NameNotFoundException e) {
            m5151d("PackageManager doesn't know about the app package", e);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            m5153e("Couldn't get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null) {
            int i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource");
            if (i > 0) {
                bj bjVar = (bj) new bh(this.f6279f).m11857a(i);
                if (bjVar != null) {
                    String str;
                    int i2;
                    m5143b("Loading global XML config values");
                    boolean z = false;
                    if (bjVar.f15194a != null) {
                        str = bjVar.f15194a;
                        this.f18105d = str;
                        m5144b("XML config - app name", str);
                    }
                    if (bjVar.f15195b != null) {
                        str = bjVar.f15195b;
                        this.f18104c = str;
                        m5144b("XML config - app version", str);
                    }
                    if (bjVar.f15196c != null) {
                        str = bjVar.f15196c.toLowerCase();
                        i2 = "verbose".equals(str) ? 0 : "info".equals(str) ? 1 : "warning".equals(str) ? 2 : "error".equals(str) ? 3 : -1;
                        if (i2 >= 0) {
                            this.f18106e = i2;
                            m5140a("XML config - log level", Integer.valueOf(i2));
                        }
                    }
                    if (bjVar.f15197d >= 0) {
                        i2 = bjVar.f15197d;
                        this.f18103b = i2;
                        this.f18102a = true;
                        m5144b("XML config - dispatch period (sec)", Integer.valueOf(i2));
                    }
                    if (bjVar.f15198e != -1) {
                        if (bjVar.f15198e == 1) {
                            z = true;
                        }
                        this.f18108h = z;
                        this.f18107g = true;
                        m5144b("XML config - dry run", Boolean.valueOf(z));
                    }
                }
            }
        }
    }

    public final boolean m16016d() {
        m12037k();
        return false;
    }

    public final boolean m16017e() {
        m12037k();
        return this.f18107g;
    }

    public final boolean m16018f() {
        m12037k();
        return this.f18108h;
    }
}
