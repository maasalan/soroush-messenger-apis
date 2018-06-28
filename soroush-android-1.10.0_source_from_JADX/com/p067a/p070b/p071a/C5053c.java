package com.p067a.p070b.p071a;

import com.p067a.p070b.C0978b;
import com.p067a.p070b.C0978b.C0977a;
import com.p067a.p070b.C1000v;
import java.io.EOFException;
import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.jivesoftware.smack.util.StringUtils;

public final class C5053c implements C0978b {
    private final Map<String, C0969a> f14124a;
    private long f14125b;
    private final File f14126c;
    private final int f14127d;

    static class C0969a {
        public long f3133a;
        public String f3134b;
        public String f3135c;
        public long f3136d;
        public long f3137e;
        public long f3138f;
        public long f3139g;
        public Map<String, String> f3140h;

        private C0969a() {
        }

        public C0969a(String str, C0977a c0977a) {
            this.f3134b = str;
            this.f3133a = (long) c0977a.f3143a.length;
            this.f3135c = c0977a.f3144b;
            this.f3136d = c0977a.f3145c;
            this.f3137e = c0977a.f3146d;
            this.f3138f = c0977a.f3147e;
            this.f3139g = c0977a.f3148f;
            this.f3140h = c0977a.f3149g;
        }

        public static C0969a m2425a(InputStream inputStream) {
            C0969a c0969a = new C0969a();
            if (C5053c.m10263a(inputStream) != 538247942) {
                throw new IOException();
            }
            c0969a.f3134b = C5053c.m10271c(inputStream);
            c0969a.f3135c = C5053c.m10271c(inputStream);
            if (c0969a.f3135c.equals("")) {
                c0969a.f3135c = null;
            }
            c0969a.f3136d = C5053c.m10269b(inputStream);
            c0969a.f3137e = C5053c.m10269b(inputStream);
            c0969a.f3138f = C5053c.m10269b(inputStream);
            c0969a.f3139g = C5053c.m10269b(inputStream);
            c0969a.f3140h = C5053c.m10274d(inputStream);
            return c0969a;
        }

        public final boolean m2426a(OutputStream outputStream) {
            try {
                C5053c.m10264a(outputStream, 538247942);
                C5053c.m10266a(outputStream, this.f3134b);
                C5053c.m10266a(outputStream, this.f3135c == null ? "" : this.f3135c);
                C5053c.m10265a(outputStream, this.f3136d);
                C5053c.m10265a(outputStream, this.f3137e);
                C5053c.m10265a(outputStream, this.f3138f);
                C5053c.m10265a(outputStream, this.f3139g);
                Map map = this.f3140h;
                if (map != null) {
                    C5053c.m10264a(outputStream, map.size());
                    for (Entry entry : map.entrySet()) {
                        C5053c.m10266a(outputStream, (String) entry.getKey());
                        C5053c.m10266a(outputStream, (String) entry.getValue());
                    }
                } else {
                    C5053c.m10264a(outputStream, 0);
                }
                outputStream.flush();
                return true;
            } catch (IOException e) {
                C1000v.m2456b("%s", e.toString());
                return false;
            }
        }
    }

    private static class C0970b extends FilterInputStream {
        private int f3141a;

        private C0970b(InputStream inputStream) {
            super(inputStream);
            this.f3141a = 0;
        }

        public final int read() {
            int read = super.read();
            if (read != -1) {
                this.f3141a++;
            }
            return read;
        }

        public final int read(byte[] bArr, int i, int i2) {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.f3141a += read;
            }
            return read;
        }
    }

    private C5053c(File file) {
        this.f14124a = new LinkedHashMap(16, 0.75f, true);
        this.f14125b = 0;
        this.f14126c = file;
        this.f14127d = 5242880;
    }

    public C5053c(File file, byte b) {
        this(file);
    }

    static int m10263a(InputStream inputStream) {
        return (C5053c.m10275e(inputStream) << 24) | ((((C5053c.m10275e(inputStream) << 0) | 0) | (C5053c.m10275e(inputStream) << 8)) | (C5053c.m10275e(inputStream) << 16));
    }

    static void m10264a(OutputStream outputStream, int i) {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static void m10265a(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) (j >>> null)));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    static void m10266a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes(StringUtils.UTF8);
        C5053c.m10265a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    private void m10267a(String str, C0969a c0969a) {
        if (this.f14124a.containsKey(str)) {
            this.f14125b += c0969a.f3133a - ((C0969a) this.f14124a.get(str)).f3133a;
        } else {
            this.f14125b += c0969a.f3133a;
        }
        this.f14124a.put(str, c0969a);
    }

    private static byte[] m10268a(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 == i) {
            return bArr;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected ");
        stringBuilder.append(i);
        stringBuilder.append(" bytes, read ");
        stringBuilder.append(i2);
        stringBuilder.append(" bytes");
        throw new IOException(stringBuilder.toString());
    }

    static long m10269b(InputStream inputStream) {
        return (((((((0 | ((((long) C5053c.m10275e(inputStream)) & 255) << null)) | ((((long) C5053c.m10275e(inputStream)) & 255) << 8)) | ((((long) C5053c.m10275e(inputStream)) & 255) << 16)) | ((((long) C5053c.m10275e(inputStream)) & 255) << 24)) | ((((long) C5053c.m10275e(inputStream)) & 255) << 32)) | ((((long) C5053c.m10275e(inputStream)) & 255) << 40)) | ((((long) C5053c.m10275e(inputStream)) & 255) << 48)) | ((((long) C5053c.m10275e(inputStream)) & 255) << 56);
    }

    private synchronized void m10270b(String str) {
        boolean delete = m10273d(str).delete();
        C0969a c0969a = (C0969a) this.f14124a.get(str);
        if (c0969a != null) {
            this.f14125b -= c0969a.f3133a;
            this.f14124a.remove(str);
        }
        if (!delete) {
            C1000v.m2456b("Could not delete cache entry for key=%s, filename=%s", str, C5053c.m10272c(str));
        }
    }

    static String m10271c(InputStream inputStream) {
        return new String(C5053c.m10268a(inputStream, (int) C5053c.m10269b(inputStream)), StringUtils.UTF8);
    }

    private static String m10272c(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(str.substring(0, length).hashCode());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(valueOf);
        stringBuilder.append(String.valueOf(str.substring(length).hashCode()));
        return stringBuilder.toString();
    }

    private File m10273d(String str) {
        return new File(this.f14126c, C5053c.m10272c(str));
    }

    static Map<String, String> m10274d(InputStream inputStream) {
        int a = C5053c.m10263a(inputStream);
        Map<String, String> emptyMap = a == 0 ? Collections.emptyMap() : new HashMap(a);
        for (int i = 0; i < a; i++) {
            emptyMap.put(C5053c.m10271c(inputStream).intern(), C5053c.m10271c(inputStream).intern());
        }
        return emptyMap;
    }

    private static int m10275e(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    public final synchronized com.p067a.p070b.C0978b.C0977a mo1032a(java.lang.String r14) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r13 = this;
        monitor-enter(r13);
        r0 = r13.f14124a;	 Catch:{ all -> 0x00b2 }
        r0 = r0.get(r14);	 Catch:{ all -> 0x00b2 }
        r0 = (com.p067a.p070b.p071a.C5053c.C0969a) r0;	 Catch:{ all -> 0x00b2 }
        r1 = 0;
        if (r0 != 0) goto L_0x000e;
    L_0x000c:
        monitor-exit(r13);
        return r1;
    L_0x000e:
        r2 = r13.m10273d(r14);	 Catch:{ all -> 0x00b2 }
        r3 = 1;
        r4 = 2;
        r5 = 0;
        r6 = new com.a.b.a.c$b;	 Catch:{ IOException -> 0x0086, NegativeArraySizeException -> 0x0064, all -> 0x0061 }
        r7 = new java.io.BufferedInputStream;	 Catch:{ IOException -> 0x0086, NegativeArraySizeException -> 0x0064, all -> 0x0061 }
        r8 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x0086, NegativeArraySizeException -> 0x0064, all -> 0x0061 }
        r8.<init>(r2);	 Catch:{ IOException -> 0x0086, NegativeArraySizeException -> 0x0064, all -> 0x0061 }
        r7.<init>(r8);	 Catch:{ IOException -> 0x0086, NegativeArraySizeException -> 0x0064, all -> 0x0061 }
        r6.<init>(r7);	 Catch:{ IOException -> 0x0086, NegativeArraySizeException -> 0x0064, all -> 0x0061 }
        com.p067a.p070b.p071a.C5053c.C0969a.m2425a(r6);	 Catch:{ IOException -> 0x005f, NegativeArraySizeException -> 0x005d }
        r7 = r2.length();	 Catch:{ IOException -> 0x005f, NegativeArraySizeException -> 0x005d }
        r9 = r6.f3141a;	 Catch:{ IOException -> 0x005f, NegativeArraySizeException -> 0x005d }
        r9 = (long) r9;	 Catch:{ IOException -> 0x005f, NegativeArraySizeException -> 0x005d }
        r11 = r7 - r9;	 Catch:{ IOException -> 0x005f, NegativeArraySizeException -> 0x005d }
        r7 = (int) r11;	 Catch:{ IOException -> 0x005f, NegativeArraySizeException -> 0x005d }
        r7 = com.p067a.p070b.p071a.C5053c.m10268a(r6, r7);	 Catch:{ IOException -> 0x005f, NegativeArraySizeException -> 0x005d }
        r8 = new com.a.b.b$a;	 Catch:{ IOException -> 0x005f, NegativeArraySizeException -> 0x005d }
        r8.<init>();	 Catch:{ IOException -> 0x005f, NegativeArraySizeException -> 0x005d }
        r8.f3143a = r7;	 Catch:{ IOException -> 0x005f, NegativeArraySizeException -> 0x005d }
        r7 = r0.f3135c;	 Catch:{ IOException -> 0x005f, NegativeArraySizeException -> 0x005d }
        r8.f3144b = r7;	 Catch:{ IOException -> 0x005f, NegativeArraySizeException -> 0x005d }
        r9 = r0.f3136d;	 Catch:{ IOException -> 0x005f, NegativeArraySizeException -> 0x005d }
        r8.f3145c = r9;	 Catch:{ IOException -> 0x005f, NegativeArraySizeException -> 0x005d }
        r9 = r0.f3137e;	 Catch:{ IOException -> 0x005f, NegativeArraySizeException -> 0x005d }
        r8.f3146d = r9;	 Catch:{ IOException -> 0x005f, NegativeArraySizeException -> 0x005d }
        r9 = r0.f3138f;	 Catch:{ IOException -> 0x005f, NegativeArraySizeException -> 0x005d }
        r8.f3147e = r9;	 Catch:{ IOException -> 0x005f, NegativeArraySizeException -> 0x005d }
        r9 = r0.f3139g;	 Catch:{ IOException -> 0x005f, NegativeArraySizeException -> 0x005d }
        r8.f3148f = r9;	 Catch:{ IOException -> 0x005f, NegativeArraySizeException -> 0x005d }
        r0 = r0.f3140h;	 Catch:{ IOException -> 0x005f, NegativeArraySizeException -> 0x005d }
        r8.f3149g = r0;	 Catch:{ IOException -> 0x005f, NegativeArraySizeException -> 0x005d }
        r6.close();	 Catch:{ IOException -> 0x005b }
        monitor-exit(r13);
        return r8;
    L_0x005b:
        monitor-exit(r13);
        return r1;
    L_0x005d:
        r0 = move-exception;
        goto L_0x0066;
    L_0x005f:
        r0 = move-exception;
        goto L_0x0088;
    L_0x0061:
        r14 = move-exception;
        r6 = r1;
        goto L_0x00a9;
    L_0x0064:
        r0 = move-exception;
        r6 = r1;
    L_0x0066:
        r7 = "%s: %s";	 Catch:{ all -> 0x00a8 }
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x00a8 }
        r2 = r2.getAbsolutePath();	 Catch:{ all -> 0x00a8 }
        r4[r5] = r2;	 Catch:{ all -> 0x00a8 }
        r0 = r0.toString();	 Catch:{ all -> 0x00a8 }
        r4[r3] = r0;	 Catch:{ all -> 0x00a8 }
        com.p067a.p070b.C1000v.m2456b(r7, r4);	 Catch:{ all -> 0x00a8 }
        r13.m10270b(r14);	 Catch:{ all -> 0x00a8 }
        if (r6 == 0) goto L_0x0084;
    L_0x007e:
        r6.close();	 Catch:{ IOException -> 0x0082 }
        goto L_0x0084;
    L_0x0082:
        monitor-exit(r13);
        return r1;
    L_0x0084:
        monitor-exit(r13);
        return r1;
    L_0x0086:
        r0 = move-exception;
        r6 = r1;
    L_0x0088:
        r7 = "%s: %s";	 Catch:{ all -> 0x00a8 }
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x00a8 }
        r2 = r2.getAbsolutePath();	 Catch:{ all -> 0x00a8 }
        r4[r5] = r2;	 Catch:{ all -> 0x00a8 }
        r0 = r0.toString();	 Catch:{ all -> 0x00a8 }
        r4[r3] = r0;	 Catch:{ all -> 0x00a8 }
        com.p067a.p070b.C1000v.m2456b(r7, r4);	 Catch:{ all -> 0x00a8 }
        r13.m10270b(r14);	 Catch:{ all -> 0x00a8 }
        if (r6 == 0) goto L_0x00a6;
    L_0x00a0:
        r6.close();	 Catch:{ IOException -> 0x00a4 }
        goto L_0x00a6;
    L_0x00a4:
        monitor-exit(r13);
        return r1;
    L_0x00a6:
        monitor-exit(r13);
        return r1;
    L_0x00a8:
        r14 = move-exception;
    L_0x00a9:
        if (r6 == 0) goto L_0x00b1;
    L_0x00ab:
        r6.close();	 Catch:{ IOException -> 0x00af }
        goto L_0x00b1;
    L_0x00af:
        monitor-exit(r13);
        return r1;
    L_0x00b1:
        throw r14;	 Catch:{ all -> 0x00b2 }
    L_0x00b2:
        r14 = move-exception;
        monitor-exit(r13);
        throw r14;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.b.a.c.a(java.lang.String):com.a.b.b$a");
    }

    public final synchronized void mo1033a() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r8 = this;
        monitor-enter(r8);
        r0 = r8.f14126c;	 Catch:{ all -> 0x006e }
        r0 = r0.exists();	 Catch:{ all -> 0x006e }
        r1 = 0;	 Catch:{ all -> 0x006e }
        if (r0 != 0) goto L_0x0024;	 Catch:{ all -> 0x006e }
    L_0x000a:
        r0 = r8.f14126c;	 Catch:{ all -> 0x006e }
        r0 = r0.mkdirs();	 Catch:{ all -> 0x006e }
        if (r0 != 0) goto L_0x0022;	 Catch:{ all -> 0x006e }
    L_0x0012:
        r0 = "Unable to create cache dir %s";	 Catch:{ all -> 0x006e }
        r2 = 1;	 Catch:{ all -> 0x006e }
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x006e }
        r3 = r8.f14126c;	 Catch:{ all -> 0x006e }
        r3 = r3.getAbsolutePath();	 Catch:{ all -> 0x006e }
        r2[r1] = r3;	 Catch:{ all -> 0x006e }
        com.p067a.p070b.C1000v.m2457c(r0, r2);	 Catch:{ all -> 0x006e }
    L_0x0022:
        monitor-exit(r8);
        return;
    L_0x0024:
        r0 = r8.f14126c;	 Catch:{ all -> 0x006e }
        r0 = r0.listFiles();	 Catch:{ all -> 0x006e }
        if (r0 != 0) goto L_0x002e;
    L_0x002c:
        monitor-exit(r8);
        return;
    L_0x002e:
        r2 = r0.length;	 Catch:{ all -> 0x006e }
    L_0x002f:
        if (r1 >= r2) goto L_0x006c;	 Catch:{ all -> 0x006e }
    L_0x0031:
        r3 = r0[r1];	 Catch:{ all -> 0x006e }
        r4 = 0;
        r5 = new java.io.BufferedInputStream;	 Catch:{ IOException -> 0x0058 }
        r6 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x0058 }
        r6.<init>(r3);	 Catch:{ IOException -> 0x0058 }
        r5.<init>(r6);	 Catch:{ IOException -> 0x0058 }
        r4 = com.p067a.p070b.p071a.C5053c.C0969a.m2425a(r5);	 Catch:{ IOException -> 0x0054, all -> 0x0051 }
        r6 = r3.length();	 Catch:{ IOException -> 0x0054, all -> 0x0051 }
        r4.f3133a = r6;	 Catch:{ IOException -> 0x0054, all -> 0x0051 }
        r6 = r4.f3134b;	 Catch:{ IOException -> 0x0054, all -> 0x0051 }
        r8.m10267a(r6, r4);	 Catch:{ IOException -> 0x0054, all -> 0x0051 }
        r5.close();	 Catch:{ IOException -> 0x0069 }
        goto L_0x0069;
    L_0x0051:
        r0 = move-exception;
        r4 = r5;
        goto L_0x005e;
    L_0x0054:
        r4 = r5;
        goto L_0x0058;
    L_0x0056:
        r0 = move-exception;
        goto L_0x005e;
    L_0x0058:
        if (r3 == 0) goto L_0x0064;
    L_0x005a:
        r3.delete();	 Catch:{ all -> 0x0056 }
        goto L_0x0064;
    L_0x005e:
        if (r4 == 0) goto L_0x0063;
    L_0x0060:
        r4.close();	 Catch:{ IOException -> 0x0063 }
    L_0x0063:
        throw r0;	 Catch:{ all -> 0x006e }
    L_0x0064:
        if (r4 == 0) goto L_0x0069;
    L_0x0066:
        r4.close();	 Catch:{ IOException -> 0x0069 }
    L_0x0069:
        r1 = r1 + 1;
        goto L_0x002f;
    L_0x006c:
        monitor-exit(r8);
        return;
    L_0x006e:
        r0 = move-exception;
        monitor-exit(r8);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.b.a.c.a():void");
    }

    public final synchronized void mo1034a(java.lang.String r20, com.p067a.p070b.C0978b.C0977a r21) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r19 = this;
        r1 = r19;
        r2 = r20;
        r3 = r21;
        monitor-enter(r19);
        r4 = r3.f3143a;	 Catch:{ all -> 0x011b }
        r4 = r4.length;	 Catch:{ all -> 0x011b }
        r5 = r1.f14125b;	 Catch:{ all -> 0x011b }
        r7 = (long) r4;	 Catch:{ all -> 0x011b }
        r9 = r5 + r7;	 Catch:{ all -> 0x011b }
        r4 = r1.f14127d;	 Catch:{ all -> 0x011b }
        r4 = (long) r4;	 Catch:{ all -> 0x011b }
        r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1));	 Catch:{ all -> 0x011b }
        r5 = 0;	 Catch:{ all -> 0x011b }
        if (r6 < 0) goto L_0x00c4;	 Catch:{ all -> 0x011b }
    L_0x0017:
        r6 = com.p067a.p070b.C1000v.f3207b;	 Catch:{ all -> 0x011b }
        if (r6 == 0) goto L_0x0022;	 Catch:{ all -> 0x011b }
    L_0x001b:
        r6 = "Pruning old cache entries.";	 Catch:{ all -> 0x011b }
        r9 = new java.lang.Object[r5];	 Catch:{ all -> 0x011b }
        com.p067a.p070b.C1000v.m2454a(r6, r9);	 Catch:{ all -> 0x011b }
    L_0x0022:
        r9 = r1.f14125b;	 Catch:{ all -> 0x011b }
        r11 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x011b }
        r6 = r1.f14124a;	 Catch:{ all -> 0x011b }
        r6 = r6.entrySet();	 Catch:{ all -> 0x011b }
        r6 = r6.iterator();	 Catch:{ all -> 0x011b }
        r13 = r5;	 Catch:{ all -> 0x011b }
    L_0x0033:
        r14 = r6.hasNext();	 Catch:{ all -> 0x011b }
        r15 = 2;	 Catch:{ all -> 0x011b }
        if (r14 == 0) goto L_0x0098;	 Catch:{ all -> 0x011b }
    L_0x003a:
        r14 = r6.next();	 Catch:{ all -> 0x011b }
        r14 = (java.util.Map.Entry) r14;	 Catch:{ all -> 0x011b }
        r14 = r14.getValue();	 Catch:{ all -> 0x011b }
        r14 = (com.p067a.p070b.p071a.C5053c.C0969a) r14;	 Catch:{ all -> 0x011b }
        r4 = r14.f3134b;	 Catch:{ all -> 0x011b }
        r4 = r1.m10273d(r4);	 Catch:{ all -> 0x011b }
        r4 = r4.delete();	 Catch:{ all -> 0x011b }
        if (r4 == 0) goto L_0x0061;	 Catch:{ all -> 0x011b }
    L_0x0052:
        r16 = r6;	 Catch:{ all -> 0x011b }
        r5 = r1.f14125b;	 Catch:{ all -> 0x011b }
        r3 = r14.f3133a;	 Catch:{ all -> 0x011b }
        r17 = r11;	 Catch:{ all -> 0x011b }
        r11 = r5 - r3;	 Catch:{ all -> 0x011b }
        r1.f14125b = r11;	 Catch:{ all -> 0x011b }
    L_0x005e:
        r3 = r16;	 Catch:{ all -> 0x011b }
        goto L_0x007b;	 Catch:{ all -> 0x011b }
    L_0x0061:
        r16 = r6;	 Catch:{ all -> 0x011b }
        r17 = r11;	 Catch:{ all -> 0x011b }
        r3 = "Could not delete cache entry for key=%s, filename=%s";	 Catch:{ all -> 0x011b }
        r4 = new java.lang.Object[r15];	 Catch:{ all -> 0x011b }
        r5 = r14.f3134b;	 Catch:{ all -> 0x011b }
        r6 = 0;	 Catch:{ all -> 0x011b }
        r4[r6] = r5;	 Catch:{ all -> 0x011b }
        r5 = r14.f3134b;	 Catch:{ all -> 0x011b }
        r5 = com.p067a.p070b.p071a.C5053c.m10272c(r5);	 Catch:{ all -> 0x011b }
        r6 = 1;	 Catch:{ all -> 0x011b }
        r4[r6] = r5;	 Catch:{ all -> 0x011b }
        com.p067a.p070b.C1000v.m2456b(r3, r4);	 Catch:{ all -> 0x011b }
        goto L_0x005e;	 Catch:{ all -> 0x011b }
    L_0x007b:
        r3.remove();	 Catch:{ all -> 0x011b }
        r13 = r13 + 1;	 Catch:{ all -> 0x011b }
        r4 = r1.f14125b;	 Catch:{ all -> 0x011b }
        r11 = r4 + r7;	 Catch:{ all -> 0x011b }
        r4 = (float) r11;	 Catch:{ all -> 0x011b }
        r5 = r1.f14127d;	 Catch:{ all -> 0x011b }
        r5 = (float) r5;	 Catch:{ all -> 0x011b }
        r6 = 1063675494; // 0x3f666666 float:0.9 double:5.2552552E-315;	 Catch:{ all -> 0x011b }
        r5 = r5 * r6;	 Catch:{ all -> 0x011b }
        r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));	 Catch:{ all -> 0x011b }
        if (r4 >= 0) goto L_0x0091;	 Catch:{ all -> 0x011b }
    L_0x0090:
        goto L_0x009a;	 Catch:{ all -> 0x011b }
    L_0x0091:
        r6 = r3;	 Catch:{ all -> 0x011b }
        r11 = r17;	 Catch:{ all -> 0x011b }
        r3 = r21;	 Catch:{ all -> 0x011b }
        r5 = 0;	 Catch:{ all -> 0x011b }
        goto L_0x0033;	 Catch:{ all -> 0x011b }
    L_0x0098:
        r17 = r11;	 Catch:{ all -> 0x011b }
    L_0x009a:
        r3 = com.p067a.p070b.C1000v.f3207b;	 Catch:{ all -> 0x011b }
        if (r3 == 0) goto L_0x00c4;	 Catch:{ all -> 0x011b }
    L_0x009e:
        r3 = "pruned %d files, %d bytes, %d ms";	 Catch:{ all -> 0x011b }
        r4 = 3;	 Catch:{ all -> 0x011b }
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x011b }
        r5 = java.lang.Integer.valueOf(r13);	 Catch:{ all -> 0x011b }
        r6 = 0;	 Catch:{ all -> 0x011b }
        r4[r6] = r5;	 Catch:{ all -> 0x011b }
        r5 = r1.f14125b;	 Catch:{ all -> 0x011b }
        r7 = r5 - r9;	 Catch:{ all -> 0x011b }
        r5 = java.lang.Long.valueOf(r7);	 Catch:{ all -> 0x011b }
        r6 = 1;	 Catch:{ all -> 0x011b }
        r4[r6] = r5;	 Catch:{ all -> 0x011b }
        r5 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x011b }
        r7 = r5 - r17;	 Catch:{ all -> 0x011b }
        r5 = java.lang.Long.valueOf(r7);	 Catch:{ all -> 0x011b }
        r4[r15] = r5;	 Catch:{ all -> 0x011b }
        com.p067a.p070b.C1000v.m2454a(r3, r4);	 Catch:{ all -> 0x011b }
    L_0x00c4:
        r3 = r19.m10273d(r20);	 Catch:{ all -> 0x011b }
        r4 = new java.io.BufferedOutputStream;	 Catch:{ IOException -> 0x0104 }
        r5 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0104 }
        r5.<init>(r3);	 Catch:{ IOException -> 0x0104 }
        r4.<init>(r5);	 Catch:{ IOException -> 0x0104 }
        r5 = new com.a.b.a.c$a;	 Catch:{ IOException -> 0x0104 }
        r6 = r21;	 Catch:{ IOException -> 0x0104 }
        r5.<init>(r2, r6);	 Catch:{ IOException -> 0x0104 }
        r7 = r5.m2426a(r4);	 Catch:{ IOException -> 0x0104 }
        if (r7 != 0) goto L_0x00f7;	 Catch:{ IOException -> 0x0104 }
    L_0x00df:
        r4.close();	 Catch:{ IOException -> 0x0104 }
        r2 = "Failed to write header for %s";	 Catch:{ IOException -> 0x0104 }
        r4 = 1;	 Catch:{ IOException -> 0x0104 }
        r5 = new java.lang.Object[r4];	 Catch:{ IOException -> 0x0104 }
        r4 = r3.getAbsolutePath();	 Catch:{ IOException -> 0x0104 }
        r6 = 0;	 Catch:{ IOException -> 0x0104 }
        r5[r6] = r4;	 Catch:{ IOException -> 0x0104 }
        com.p067a.p070b.C1000v.m2456b(r2, r5);	 Catch:{ IOException -> 0x0104 }
        r2 = new java.io.IOException;	 Catch:{ IOException -> 0x0104 }
        r2.<init>();	 Catch:{ IOException -> 0x0104 }
        throw r2;	 Catch:{ IOException -> 0x0104 }
    L_0x00f7:
        r6 = r6.f3143a;	 Catch:{ IOException -> 0x0104 }
        r4.write(r6);	 Catch:{ IOException -> 0x0104 }
        r4.close();	 Catch:{ IOException -> 0x0104 }
        r1.m10267a(r2, r5);	 Catch:{ IOException -> 0x0104 }
        monitor-exit(r19);
        return;
    L_0x0104:
        r2 = r3.delete();	 Catch:{ all -> 0x011b }
        if (r2 != 0) goto L_0x0119;	 Catch:{ all -> 0x011b }
    L_0x010a:
        r2 = "Could not clean up file %s";	 Catch:{ all -> 0x011b }
        r4 = 1;	 Catch:{ all -> 0x011b }
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x011b }
        r3 = r3.getAbsolutePath();	 Catch:{ all -> 0x011b }
        r5 = 0;	 Catch:{ all -> 0x011b }
        r4[r5] = r3;	 Catch:{ all -> 0x011b }
        com.p067a.p070b.C1000v.m2456b(r2, r4);	 Catch:{ all -> 0x011b }
    L_0x0119:
        monitor-exit(r19);
        return;
    L_0x011b:
        r0 = move-exception;
        r2 = r0;
        monitor-exit(r19);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.b.a.c.a(java.lang.String, com.a.b.b$a):void");
    }
}
