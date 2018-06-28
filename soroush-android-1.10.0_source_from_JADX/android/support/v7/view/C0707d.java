package android.support.v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.support.v7.p041a.C0645a.C0643i;
import android.view.LayoutInflater;

public final class C0707d extends ContextWrapper {
    public int f2316a;
    private Theme f2317b;
    private LayoutInflater f2318c;
    private Configuration f2319d;
    private Resources f2320e;

    public C0707d() {
        super(null);
    }

    public C0707d(Context context, int i) {
        super(context);
        this.f2316a = i;
    }

    public C0707d(Context context, Theme theme) {
        super(context);
        this.f2317b = theme;
    }

    private void m1716a() {
        if (this.f2317b == null) {
            this.f2317b = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2317b.setTo(theme);
            }
        }
        this.f2317b.applyStyle(this.f2316a, true);
    }

    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final Resources getResources() {
        if (this.f2320e == null) {
            Resources resources;
            if (this.f2319d == null) {
                resources = super.getResources();
            } else if (VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(this.f2319d).getResources();
            }
            this.f2320e = resources;
        }
        return this.f2320e;
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2318c == null) {
            this.f2318c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2318c;
    }

    public final Theme getTheme() {
        if (this.f2317b != null) {
            return this.f2317b;
        }
        if (this.f2316a == 0) {
            this.f2316a = C0643i.Theme_AppCompat_Light;
        }
        m1716a();
        return this.f2317b;
    }

    public final void setTheme(int i) {
        if (this.f2316a != i) {
            this.f2316a = i;
            m1716a();
        }
    }
}
