package android.support.v7.p043c.p044a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p029a.C0346c;
import android.support.v7.widget.AppCompatDrawableManager;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

public final class C0683b {
    private static final ThreadLocal<TypedValue> f2256a = new ThreadLocal();
    private static final WeakHashMap<Context, SparseArray<C0682a>> f2257b = new WeakHashMap(0);
    private static final Object f2258c = new Object();

    private static class C0682a {
        final ColorStateList f2254a;
        final Configuration f2255b;

        C0682a(ColorStateList colorStateList, Configuration configuration) {
            this.f2254a = colorStateList;
            this.f2255b = configuration;
        }
    }

    public static ColorStateList m1655a(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList d = C0683b.m1658d(context, i);
        if (d != null) {
            return d;
        }
        d = C0683b.m1657c(context, i);
        if (d == null) {
            return C0346c.m686b(context, i);
        }
        synchronized (f2258c) {
            SparseArray sparseArray = (SparseArray) f2257b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f2257b.put(context, sparseArray);
            }
            sparseArray.append(i, new C0682a(d, context.getResources().getConfiguration()));
        }
        return d;
    }

    public static Drawable m1656b(Context context, int i) {
        return AppCompatDrawableManager.get().getDrawable(context, i);
    }

    private static ColorStateList m1657c(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue typedValue = (TypedValue) f2256a.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f2256a.set(typedValue);
        }
        boolean z = true;
        resources.getValue(i, typedValue, true);
        if (typedValue.type < 28 || typedValue.type > 31) {
            z = false;
        }
        if (z) {
            return null;
        }
        Resources resources2 = context.getResources();
        try {
            return C0681a.m1653a(resources2, resources2.getXml(i), context.getTheme());
        } catch (Throwable e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m1658d(android.content.Context r4, int r5) {
        /*
        r0 = f2258c;
        monitor-enter(r0);
        r1 = f2257b;	 Catch:{ all -> 0x0035 }
        r1 = r1.get(r4);	 Catch:{ all -> 0x0035 }
        r1 = (android.util.SparseArray) r1;	 Catch:{ all -> 0x0035 }
        if (r1 == 0) goto L_0x0032;
    L_0x000d:
        r2 = r1.size();	 Catch:{ all -> 0x0035 }
        if (r2 <= 0) goto L_0x0032;
    L_0x0013:
        r2 = r1.get(r5);	 Catch:{ all -> 0x0035 }
        r2 = (android.support.v7.p043c.p044a.C0683b.C0682a) r2;	 Catch:{ all -> 0x0035 }
        if (r2 == 0) goto L_0x0032;
    L_0x001b:
        r3 = r2.f2255b;	 Catch:{ all -> 0x0035 }
        r4 = r4.getResources();	 Catch:{ all -> 0x0035 }
        r4 = r4.getConfiguration();	 Catch:{ all -> 0x0035 }
        r4 = r3.equals(r4);	 Catch:{ all -> 0x0035 }
        if (r4 == 0) goto L_0x002f;
    L_0x002b:
        r4 = r2.f2254a;	 Catch:{ all -> 0x0035 }
        monitor-exit(r0);	 Catch:{ all -> 0x0035 }
        return r4;
    L_0x002f:
        r1.remove(r5);	 Catch:{ all -> 0x0035 }
    L_0x0032:
        monitor-exit(r0);	 Catch:{ all -> 0x0035 }
        r4 = 0;
        return r4;
    L_0x0035:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0035 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.c.a.b.d(android.content.Context, int):android.content.res.ColorStateList");
    }
}
