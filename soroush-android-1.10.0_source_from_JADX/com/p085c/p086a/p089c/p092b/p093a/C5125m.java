package com.p085c.p086a.p089c.p092b.p093a;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.p085c.p086a.p109i.C1273i;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

@TargetApi(19)
public final class C5125m implements C1110k {
    private static final Config[] f14324a = new Config[]{Config.ARGB_8888, null};
    private static final Config[] f14325b = new Config[]{Config.RGB_565};
    private static final Config[] f14326c = new Config[]{Config.ARGB_4444};
    private static final Config[] f14327d = new Config[]{Config.ALPHA_8};
    private final C5124b f14328e = new C5124b();
    private final C1108g<C5123a, Bitmap> f14329f = new C1108g();
    private final Map<Config, NavigableMap<Integer, Integer>> f14330g = new HashMap();

    static /* synthetic */ class C11121 {
        static final /* synthetic */ int[] f3611a = new int[Config.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = android.graphics.Bitmap.Config.values();
            r0 = r0.length;
            r0 = new int[r0];
            f3611a = r0;
            r0 = f3611a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f3611a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = android.graphics.Bitmap.Config.RGB_565;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f3611a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = android.graphics.Bitmap.Config.ARGB_4444;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = f3611a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = android.graphics.Bitmap.Config.ALPHA_8;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.c.a.c.b.a.m.1.<clinit>():void");
        }
    }

    static final class C5123a implements C1111l {
        int f14321a;
        Config f14322b;
        private final C5124b f14323c;

        public C5123a(C5124b c5124b) {
            this.f14323c = c5124b;
        }

        public final void mo1118a() {
            this.f14323c.m2684a(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C5123a) {
                C5123a c5123a = (C5123a) obj;
                if (this.f14321a == c5123a.f14321a && C1273i.m3023a(this.f14322b, c5123a.f14322b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (31 * this.f14321a) + (this.f14322b != null ? this.f14322b.hashCode() : 0);
        }

        public final String toString() {
            return C5125m.m10529a(this.f14321a, this.f14322b);
        }
    }

    static class C5124b extends C1105d<C5123a> {
        C5124b() {
        }

        protected final /* synthetic */ C1111l mo1119a() {
            return new C5123a(this);
        }

        public final C5123a m10528a(int i, Config config) {
            C5123a c5123a = (C5123a) m2685b();
            c5123a.f14321a = i;
            c5123a.f14322b = config;
            return c5123a;
        }
    }

    static String m10529a(int i, Config config) {
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(i);
        stringBuilder.append("](");
        stringBuilder.append(config);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    private NavigableMap<Integer, Integer> m10530a(Config config) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f14330g.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        NavigableMap treeMap = new TreeMap();
        this.f14330g.put(config, treeMap);
        return treeMap;
    }

    private void m10531a(Integer num, Bitmap bitmap) {
        NavigableMap a = m10530a(bitmap.getConfig());
        Integer num2 = (Integer) a.get(num);
        if (num2 == null) {
            StringBuilder stringBuilder = new StringBuilder("Tried to decrement empty size, size: ");
            stringBuilder.append(num);
            stringBuilder.append(", removed: ");
            stringBuilder.append(mo1124b(bitmap));
            stringBuilder.append(", this: ");
            stringBuilder.append(this);
            throw new NullPointerException(stringBuilder.toString());
        } else if (num2.intValue() == 1) {
            a.remove(num);
        } else {
            a.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    public final Bitmap mo1120a() {
        Bitmap bitmap = (Bitmap) this.f14329f.m2696a();
        if (bitmap != null) {
            m10531a(Integer.valueOf(C1273i.m3017a(bitmap)), bitmap);
        }
        return bitmap;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo1121a(int r10, int r11, android.graphics.Bitmap.Config r12) {
        /*
        r9 = this;
        r0 = com.p085c.p086a.p109i.C1273i.m3016a(r10, r11, r12);
        r1 = r9.f14328e;
        r1 = r1.m10528a(r0, r12);
        r2 = com.p085c.p086a.p089c.p092b.p093a.C5125m.C11121.f3611a;
        r3 = r12.ordinal();
        r2 = r2[r3];
        r3 = 0;
        switch(r2) {
            case 1: goto L_0x0025;
            case 2: goto L_0x0022;
            case 3: goto L_0x001f;
            case 4: goto L_0x001c;
            default: goto L_0x0016;
        };
    L_0x0016:
        r2 = 1;
        r2 = new android.graphics.Bitmap.Config[r2];
        r2[r3] = r12;
        goto L_0x0027;
    L_0x001c:
        r2 = f14327d;
        goto L_0x0027;
    L_0x001f:
        r2 = f14326c;
        goto L_0x0027;
    L_0x0022:
        r2 = f14325b;
        goto L_0x0027;
    L_0x0025:
        r2 = f14324a;
    L_0x0027:
        r4 = r2.length;
    L_0x0028:
        if (r3 >= r4) goto L_0x0068;
    L_0x002a:
        r5 = r2[r3];
        r6 = r9.m10530a(r5);
        r7 = java.lang.Integer.valueOf(r0);
        r6 = r6.ceilingKey(r7);
        r6 = (java.lang.Integer) r6;
        if (r6 == 0) goto L_0x0065;
    L_0x003c:
        r7 = r6.intValue();
        r8 = r0 * 8;
        if (r7 > r8) goto L_0x0065;
    L_0x0044:
        r2 = r6.intValue();
        if (r2 != r0) goto L_0x0055;
    L_0x004a:
        if (r5 != 0) goto L_0x004f;
    L_0x004c:
        if (r12 == 0) goto L_0x0068;
    L_0x004e:
        goto L_0x0055;
    L_0x004f:
        r12 = r5.equals(r12);
        if (r12 != 0) goto L_0x0068;
    L_0x0055:
        r12 = r9.f14328e;
        r12.m2684a(r1);
        r12 = r9.f14328e;
        r0 = r6.intValue();
        r1 = r12.m10528a(r0, r5);
        goto L_0x0068;
    L_0x0065:
        r3 = r3 + 1;
        goto L_0x0028;
    L_0x0068:
        r12 = r9.f14329f;
        r12 = r12.m2697a(r1);
        r12 = (android.graphics.Bitmap) r12;
        if (r12 == 0) goto L_0x008b;
    L_0x0072:
        r0 = r1.f14321a;
        r0 = java.lang.Integer.valueOf(r0);
        r9.m10531a(r0, r12);
        r0 = r12.getConfig();
        if (r0 == 0) goto L_0x0086;
    L_0x0081:
        r0 = r12.getConfig();
        goto L_0x0088;
    L_0x0086:
        r0 = android.graphics.Bitmap.Config.ARGB_8888;
    L_0x0088:
        r12.reconfigure(r10, r11, r0);
    L_0x008b:
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.c.b.a.m.a(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    public final void mo1122a(Bitmap bitmap) {
        C5123a a = this.f14328e.m10528a(C1273i.m3017a(bitmap), bitmap.getConfig());
        this.f14329f.m2698a(a, bitmap);
        NavigableMap a2 = m10530a(bitmap.getConfig());
        Integer num = (Integer) a2.get(Integer.valueOf(a.f14321a));
        Integer valueOf = Integer.valueOf(a.f14321a);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        a2.put(valueOf, Integer.valueOf(i));
    }

    public final String mo1123b(int i, int i2, Config config) {
        return C5125m.m10529a(C1273i.m3016a(i, i2, config), config);
    }

    public final String mo1124b(Bitmap bitmap) {
        return C5125m.m10529a(C1273i.m3017a(bitmap), bitmap.getConfig());
    }

    public final int mo1125c(Bitmap bitmap) {
        return C1273i.m3017a(bitmap);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SizeConfigStrategy{groupedMap=");
        stringBuilder.append(this.f14329f);
        stringBuilder.append(", sortedSizes=(");
        for (Entry entry : this.f14330g.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append('[');
            stringBuilder.append(entry.getValue());
            stringBuilder.append("], ");
        }
        if (!this.f14330g.isEmpty()) {
            stringBuilder.replace(stringBuilder.length() - 2, stringBuilder.length(), "");
        }
        stringBuilder.append(")}");
        return stringBuilder.toString();
    }
}
