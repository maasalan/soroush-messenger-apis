package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class TintContextWrapper extends ContextWrapper {
    private static final Object CACHE_LOCK = new Object();
    private static ArrayList<WeakReference<TintContextWrapper>> sCache;
    private final Resources mResources;
    private final Theme mTheme;

    private TintContextWrapper(Context context) {
        super(context);
        if (VectorEnabledTintResources.shouldBeUsed()) {
            this.mResources = new VectorEnabledTintResources(this, context.getResources());
            this.mTheme = this.mResources.newTheme();
            this.mTheme.setTo(context.getTheme());
            return;
        }
        this.mResources = new TintResources(this, context.getResources());
        this.mTheme = null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean shouldWrap(android.content.Context r2) {
        /*
        r0 = r2 instanceof android.support.v7.widget.TintContextWrapper;
        r1 = 0;
        if (r0 != 0) goto L_0x0026;
    L_0x0005:
        r0 = r2.getResources();
        r0 = r0 instanceof android.support.v7.widget.TintResources;
        if (r0 != 0) goto L_0x0026;
    L_0x000d:
        r2 = r2.getResources();
        r2 = r2 instanceof android.support.v7.widget.VectorEnabledTintResources;
        if (r2 == 0) goto L_0x0016;
    L_0x0015:
        return r1;
    L_0x0016:
        r2 = android.os.Build.VERSION.SDK_INT;
        r0 = 21;
        if (r2 < r0) goto L_0x0024;
    L_0x001c:
        r2 = android.support.v7.widget.VectorEnabledTintResources.shouldBeUsed();
        if (r2 == 0) goto L_0x0023;
    L_0x0022:
        goto L_0x0024;
    L_0x0023:
        return r1;
    L_0x0024:
        r2 = 1;
        return r2;
    L_0x0026:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.TintContextWrapper.shouldWrap(android.content.Context):boolean");
    }

    public static Context wrap(Context context) {
        if (!shouldWrap(context)) {
            return context;
        }
        synchronized (CACHE_LOCK) {
            if (sCache == null) {
                sCache = new ArrayList();
            } else {
                int size;
                WeakReference weakReference;
                for (size = sCache.size() - 1; size >= 0; size--) {
                    weakReference = (WeakReference) sCache.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        sCache.remove(size);
                    }
                }
                size = sCache.size() - 1;
                while (size >= 0) {
                    weakReference = (WeakReference) sCache.get(size);
                    Context context2 = weakReference != null ? (TintContextWrapper) weakReference.get() : null;
                    if (context2 == null || context2.getBaseContext() != context) {
                        size--;
                    } else {
                        return context2;
                    }
                }
            }
            Context tintContextWrapper = new TintContextWrapper(context);
            sCache.add(new WeakReference(tintContextWrapper));
            return tintContextWrapper;
        }
    }

    public AssetManager getAssets() {
        return this.mResources.getAssets();
    }

    public Resources getResources() {
        return this.mResources;
    }

    public Theme getTheme() {
        return this.mTheme == null ? super.getTheme() : this.mTheme;
    }

    public void setTheme(int i) {
        if (this.mTheme == null) {
            super.setTheme(i);
        } else {
            this.mTheme.applyStyle(i, true);
        }
    }
}
