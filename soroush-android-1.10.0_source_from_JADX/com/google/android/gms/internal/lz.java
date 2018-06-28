package com.google.android.gms.internal;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class lz {
    private static Uri f6121a = Uri.parse("content://com.google.android.gsf.gservices");
    private static Uri f6122b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    private static Pattern f6123c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    private static Pattern f6124d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final AtomicBoolean f6125e = new AtomicBoolean();
    private static HashMap<String, String> f6126f;
    private static HashMap<String, Boolean> f6127g = new HashMap();
    private static HashMap<String, Integer> f6128h = new HashMap();
    private static HashMap<String, Long> f6129i = new HashMap();
    private static HashMap<String, Float> f6130j = new HashMap();
    private static Object f6131k;
    private static boolean f6132l;
    private static String[] f6133m = new String[0];

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> T m4977a(java.util.HashMap<java.lang.String, T> r2, java.lang.String r3, T r4) {
        /*
        r0 = com.google.android.gms.internal.lz.class;
        monitor-enter(r0);
        r1 = r2.containsKey(r3);	 Catch:{ all -> 0x0016 }
        if (r1 == 0) goto L_0x0013;
    L_0x0009:
        r2 = r2.get(r3);	 Catch:{ all -> 0x0016 }
        if (r2 == 0) goto L_0x0010;
    L_0x000f:
        goto L_0x0011;
    L_0x0010:
        r2 = r4;
    L_0x0011:
        monitor-exit(r0);	 Catch:{ all -> 0x0016 }
        return r2;
    L_0x0013:
        monitor-exit(r0);	 Catch:{ all -> 0x0016 }
        r2 = 0;
        return r2;
    L_0x0016:
        r2 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0016 }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.lz.a(java.util.HashMap, java.lang.String, java.lang.Object):T");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m4978a(android.content.ContentResolver r14, java.lang.String r15) {
        /*
        r0 = com.google.android.gms.internal.lz.class;
        monitor-enter(r0);
        m4981a(r14);	 Catch:{ all -> 0x00a6 }
        r1 = f6131k;	 Catch:{ all -> 0x00a6 }
        r2 = f6126f;	 Catch:{ all -> 0x00a6 }
        r2 = r2.containsKey(r15);	 Catch:{ all -> 0x00a6 }
        r3 = 0;
        if (r2 == 0) goto L_0x001f;
    L_0x0011:
        r14 = f6126f;	 Catch:{ all -> 0x00a6 }
        r14 = r14.get(r15);	 Catch:{ all -> 0x00a6 }
        r14 = (java.lang.String) r14;	 Catch:{ all -> 0x00a6 }
        if (r14 == 0) goto L_0x001c;
    L_0x001b:
        goto L_0x001d;
    L_0x001c:
        r14 = r3;
    L_0x001d:
        monitor-exit(r0);	 Catch:{ all -> 0x00a6 }
        return r14;
    L_0x001f:
        r2 = f6133m;	 Catch:{ all -> 0x00a6 }
        r4 = r2.length;	 Catch:{ all -> 0x00a6 }
        r5 = 0;
        r6 = r5;
    L_0x0024:
        r7 = 1;
        if (r6 >= r4) goto L_0x0063;
    L_0x0027:
        r8 = r2[r6];	 Catch:{ all -> 0x00a6 }
        r8 = r15.startsWith(r8);	 Catch:{ all -> 0x00a6 }
        if (r8 == 0) goto L_0x0060;
    L_0x002f:
        r1 = f6132l;	 Catch:{ all -> 0x00a6 }
        if (r1 == 0) goto L_0x003b;
    L_0x0033:
        r1 = f6126f;	 Catch:{ all -> 0x00a6 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x00a6 }
        if (r1 == 0) goto L_0x005e;
    L_0x003b:
        r1 = f6133m;	 Catch:{ all -> 0x00a6 }
        r2 = f6126f;	 Catch:{ all -> 0x00a6 }
        r14 = m4979a(r14, r1);	 Catch:{ all -> 0x00a6 }
        r2.putAll(r14);	 Catch:{ all -> 0x00a6 }
        f6132l = r7;	 Catch:{ all -> 0x00a6 }
        r14 = f6126f;	 Catch:{ all -> 0x00a6 }
        r14 = r14.containsKey(r15);	 Catch:{ all -> 0x00a6 }
        if (r14 == 0) goto L_0x005e;
    L_0x0050:
        r14 = f6126f;	 Catch:{ all -> 0x00a6 }
        r14 = r14.get(r15);	 Catch:{ all -> 0x00a6 }
        r14 = (java.lang.String) r14;	 Catch:{ all -> 0x00a6 }
        if (r14 == 0) goto L_0x005b;
    L_0x005a:
        goto L_0x005c;
    L_0x005b:
        r14 = r3;
    L_0x005c:
        monitor-exit(r0);	 Catch:{ all -> 0x00a6 }
        return r14;
    L_0x005e:
        monitor-exit(r0);	 Catch:{ all -> 0x00a6 }
        return r3;
    L_0x0060:
        r6 = r6 + 1;
        goto L_0x0024;
    L_0x0063:
        monitor-exit(r0);	 Catch:{ all -> 0x00a6 }
        r9 = f6121a;
        r10 = 0;
        r11 = 0;
        r12 = new java.lang.String[r7];
        r12[r5] = r15;
        r13 = 0;
        r8 = r14;
        r14 = r8.query(r9, r10, r11, r12, r13);
        if (r14 == 0) goto L_0x0097;
    L_0x0074:
        r0 = r14.moveToFirst();	 Catch:{ all -> 0x0095 }
        if (r0 != 0) goto L_0x007b;
    L_0x007a:
        goto L_0x0097;
    L_0x007b:
        r0 = r14.getString(r7);	 Catch:{ all -> 0x0095 }
        if (r0 == 0) goto L_0x0088;
    L_0x0081:
        r2 = r0.equals(r3);	 Catch:{ all -> 0x0095 }
        if (r2 == 0) goto L_0x0088;
    L_0x0087:
        r0 = r3;
    L_0x0088:
        m4982a(r1, r15, r0);	 Catch:{ all -> 0x0095 }
        if (r0 == 0) goto L_0x008e;
    L_0x008d:
        goto L_0x008f;
    L_0x008e:
        r0 = r3;
    L_0x008f:
        if (r14 == 0) goto L_0x0094;
    L_0x0091:
        r14.close();
    L_0x0094:
        return r0;
    L_0x0095:
        r15 = move-exception;
        goto L_0x00a0;
    L_0x0097:
        m4982a(r1, r15, r3);	 Catch:{ all -> 0x0095 }
        if (r14 == 0) goto L_0x009f;
    L_0x009c:
        r14.close();
    L_0x009f:
        return r3;
    L_0x00a0:
        if (r14 == 0) goto L_0x00a5;
    L_0x00a2:
        r14.close();
    L_0x00a5:
        throw r15;
    L_0x00a6:
        r14 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00a6 }
        throw r14;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.lz.a(android.content.ContentResolver, java.lang.String):java.lang.String");
    }

    private static Map<String, String> m4979a(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f6122b, null, null, strArr, null);
        Map<String, String> treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }

    private static void m4981a(ContentResolver contentResolver) {
        if (f6126f == null) {
            f6125e.set(false);
            f6126f = new HashMap();
            f6131k = new Object();
            f6132l = false;
            contentResolver.registerContentObserver(f6121a, true, new ma());
            return;
        }
        if (f6125e.getAndSet(false)) {
            f6126f.clear();
            f6127g.clear();
            f6128h.clear();
            f6129i.clear();
            f6130j.clear();
            f6131k = new Object();
            f6132l = false;
        }
    }

    private static void m4982a(Object obj, String str, String str2) {
        synchronized (lz.class) {
            if (obj == f6131k) {
                f6126f.put(str, str2);
            }
        }
    }

    private static <T> void m4983a(Object obj, HashMap<String, T> hashMap, String str, T t) {
        synchronized (lz.class) {
            if (obj == f6131k) {
                hashMap.put(str, t);
                f6126f.remove(str);
            }
        }
    }

    public static long m4984b(android.content.ContentResolver r6, java.lang.String r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = m4985b(r6);
        r1 = f6129i;
        r2 = 0;
        r4 = java.lang.Long.valueOf(r2);
        r1 = m4977a(r1, r7, r4);
        r1 = (java.lang.Long) r1;
        if (r1 == 0) goto L_0x0019;
    L_0x0014:
        r6 = r1.longValue();
        return r6;
    L_0x0019:
        r6 = m4978a(r6, r7);
        if (r6 != 0) goto L_0x0020;
    L_0x001f:
        goto L_0x002a;
    L_0x0020:
        r4 = java.lang.Long.parseLong(r6);	 Catch:{ NumberFormatException -> 0x002a }
        r6 = java.lang.Long.valueOf(r4);	 Catch:{ NumberFormatException -> 0x002a }
        r1 = r6;
        r2 = r4;
    L_0x002a:
        r6 = f6129i;
        m4983a(r0, r6, r7, r1);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.lz.b(android.content.ContentResolver, java.lang.String):long");
    }

    private static Object m4985b(ContentResolver contentResolver) {
        Object obj;
        synchronized (lz.class) {
            m4981a(contentResolver);
            obj = f6131k;
        }
        return obj;
    }

    public static boolean m4986c(ContentResolver contentResolver, String str) {
        Object b = m4985b(contentResolver);
        boolean z = false;
        Object obj = (Boolean) m4977a(f6127g, str, Boolean.valueOf(false));
        if (obj != null) {
            return obj.booleanValue();
        }
        Object a = m4978a(contentResolver, str);
        if (a != null) {
            if (!a.equals("")) {
                if (f6123c.matcher(a).matches()) {
                    obj = Boolean.valueOf(true);
                    z = true;
                } else if (f6124d.matcher(a).matches()) {
                    obj = Boolean.valueOf(false);
                } else {
                    StringBuilder stringBuilder = new StringBuilder("attempt to read gservices key ");
                    stringBuilder.append(str);
                    stringBuilder.append(" (value \"");
                    stringBuilder.append(a);
                    stringBuilder.append("\") as boolean");
                    Log.w("Gservices", stringBuilder.toString());
                }
            }
        }
        m4983a(b, f6127g, str, obj);
        return z;
    }
}
