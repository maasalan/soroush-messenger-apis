package com.p085c.p086a.p089c.p092b.p093a;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class C5122j implements C1106e {
    private static final Config f14310a = Config.ARGB_8888;
    private final C1110k f14311b;
    private final Set<Config> f14312c;
    private final int f14313d;
    private final C1109a f14314e;
    private int f14315f;
    private int f14316g;
    private int f14317h;
    private int f14318i;
    private int f14319j;
    private int f14320k;

    private interface C1109a {
    }

    private static class C5121b implements C1109a {
        C5121b() {
        }
    }

    public C5122j(int i) {
        C1110k c5125m = VERSION.SDK_INT >= 19 ? new C5125m() : new C5115c();
        Set hashSet = new HashSet();
        hashSet.addAll(Arrays.asList(Config.values()));
        if (VERSION.SDK_INT >= 19) {
            hashSet.add(null);
        }
        this(i, c5125m, Collections.unmodifiableSet(hashSet));
    }

    private C5122j(int i, C1110k c1110k, Set<Config> set) {
        this.f14313d = i;
        this.f14315f = i;
        this.f14311b = c1110k;
        this.f14312c = set;
        this.f14314e = new C5121b();
    }

    private void m10515b() {
        m10516b(this.f14315f);
    }

    private synchronized void m10516b(int i) {
        while (this.f14316g > i) {
            Bitmap a = this.f14311b.mo1120a();
            if (a == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m10519d();
                }
                this.f14316g = 0;
                return;
            }
            this.f14316g -= this.f14311b.mo1125c(a);
            this.f14320k++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder stringBuilder = new StringBuilder("Evicting bitmap=");
                stringBuilder.append(this.f14311b.mo1124b(a));
                Log.d("LruBitmapPool", stringBuilder.toString());
            }
            m10518c();
            a.recycle();
        }
    }

    private synchronized Bitmap m10517c(int i, int i2, Config config) {
        Bitmap a;
        a = this.f14311b.mo1121a(i, i2, config != null ? config : f14310a);
        if (a == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder stringBuilder = new StringBuilder("Missing bitmap=");
                stringBuilder.append(this.f14311b.mo1123b(i, i2, config));
                Log.d("LruBitmapPool", stringBuilder.toString());
            }
            this.f14318i++;
        } else {
            this.f14317h++;
            this.f14316g -= this.f14311b.mo1125c(a);
            a.setHasAlpha(true);
            if (VERSION.SDK_INT >= 19) {
                a.setPremultiplied(true);
            }
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder stringBuilder2 = new StringBuilder("Get bitmap=");
            stringBuilder2.append(this.f14311b.mo1123b(i, i2, config));
            Log.v("LruBitmapPool", stringBuilder2.toString());
        }
        m10518c();
        return a;
    }

    private void m10518c() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m10519d();
        }
    }

    private void m10519d() {
        StringBuilder stringBuilder = new StringBuilder("Hits=");
        stringBuilder.append(this.f14317h);
        stringBuilder.append(", misses=");
        stringBuilder.append(this.f14318i);
        stringBuilder.append(", puts=");
        stringBuilder.append(this.f14319j);
        stringBuilder.append(", evictions=");
        stringBuilder.append(this.f14320k);
        stringBuilder.append(", currentSize=");
        stringBuilder.append(this.f14316g);
        stringBuilder.append(", maxSize=");
        stringBuilder.append(this.f14315f);
        stringBuilder.append("\nStrategy=");
        stringBuilder.append(this.f14311b);
        Log.v("LruBitmapPool", stringBuilder.toString());
    }

    public final Bitmap mo1134a(int i, int i2, Config config) {
        Bitmap c = m10517c(i, i2, config);
        if (c == null) {
            return Bitmap.createBitmap(i, i2, config);
        }
        c.eraseColor(0);
        return c;
    }

    public final void mo1135a() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m10516b(0);
    }

    public final synchronized void mo1136a(float f) {
        this.f14315f = Math.round(((float) this.f14313d) * f);
        m10515b();
    }

    @SuppressLint({"InlinedApi"})
    public final void mo1137a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            StringBuilder stringBuilder = new StringBuilder("trimMemory, level=");
            stringBuilder.append(i);
            Log.d("LruBitmapPool", stringBuilder.toString());
        }
        if (i >= 40) {
            mo1135a();
            return;
        }
        if (i >= 20) {
            m10516b(this.f14315f / 2);
        }
    }

    public final synchronized void mo1138a(Bitmap bitmap) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        } else if (bitmap.isRecycled()) {
            throw new IllegalStateException("Cannot pool recycled bitmap");
        } else {
            StringBuilder stringBuilder;
            if (bitmap.isMutable() && this.f14311b.mo1125c(bitmap) <= this.f14315f) {
                if (this.f14312c.contains(bitmap.getConfig())) {
                    int c = this.f14311b.mo1125c(bitmap);
                    this.f14311b.mo1122a(bitmap);
                    this.f14319j++;
                    this.f14316g += c;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        stringBuilder = new StringBuilder("Put bitmap in pool=");
                        stringBuilder.append(this.f14311b.mo1124b(bitmap));
                        Log.v("LruBitmapPool", stringBuilder.toString());
                    }
                    m10518c();
                    m10515b();
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                stringBuilder = new StringBuilder("Reject bitmap from pool, bitmap: ");
                stringBuilder.append(this.f14311b.mo1124b(bitmap));
                stringBuilder.append(", is mutable: ");
                stringBuilder.append(bitmap.isMutable());
                stringBuilder.append(", is allowed config: ");
                stringBuilder.append(this.f14312c.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", stringBuilder.toString());
            }
            bitmap.recycle();
        }
    }

    public final Bitmap mo1139b(int i, int i2, Config config) {
        Bitmap c = m10517c(i, i2, config);
        return c == null ? Bitmap.createBitmap(i, i2, config) : c;
    }
}
