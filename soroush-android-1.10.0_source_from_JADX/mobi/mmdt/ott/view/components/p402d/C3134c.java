package mobi.mmdt.ott.view.components.p402d;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.jivesoftware.smack.roster.Roster;

public class C3134c implements Runnable {
    private static C3134c f9713j;
    final List<C3133d> f9714a;
    final HashMap<View, String> f9715b;
    final ReentrantReadWriteLock f9716c;
    View f9717d;
    final ReentrantReadWriteLock f9718e;
    private ServerSocket f9719f;
    private final int f9720g;
    private Thread f9721h;
    private ExecutorService f9722i;

    private static class C3132b extends OutputStream {
        private final OutputStream f9712a;

        C3132b(OutputStream outputStream) {
            this.f9712a = outputStream;
        }

        public final void close() {
        }

        public final boolean equals(Object obj) {
            return this.f9712a.equals(obj);
        }

        public final void flush() {
            this.f9712a.flush();
        }

        public final int hashCode() {
            return this.f9712a.hashCode();
        }

        public final String toString() {
            return this.f9712a.toString();
        }

        public final void write(int i) {
            this.f9712a.write(i);
        }

        public final void write(byte[] bArr) {
            this.f9712a.write(bArr);
        }

        public final void write(byte[] bArr, int i, int i2) {
            this.f9712a.write(bArr, i, i2);
        }
    }

    private interface C3133d {
        void mo2251a();

        void mo2252b();
    }

    private static class C6077a extends C3134c {
        private C6077a() {
            super();
        }

        public final void mo2242a(Activity activity) {
        }

        public final void mo2243a(View view) {
        }

        public final void mo2244a(View view, String str) {
        }

        public final boolean mo2245a() {
            return false;
        }

        public final void mo2246b(Activity activity) {
        }

        public final void mo2247b(View view) {
        }

        public final boolean mo2248b() {
            return false;
        }

        public final void mo2249c(Activity activity) {
        }

        public final void run() {
        }
    }

    private class C6078c implements Runnable, C3133d {
        final /* synthetic */ C3134c f16259a;
        private Socket f16260b;
        private boolean f16261c;
        private boolean f16262d;
        private final Object[] f16263e = new Object[0];

        public C6078c(C3134c c3134c, Socket socket) {
            this.f16259a = c3134c;
            this.f16260b = socket;
            this.f16261c = false;
            this.f16262d = false;
        }

        private View m13695a(int i) {
            View view;
            if (i == -1) {
                this.f16259a.f9716c.readLock().lock();
                try {
                    view = this.f16259a.f9717d;
                    return view;
                } finally {
                    this.f16259a.f9716c.readLock().unlock();
                }
            } else {
                this.f16259a.f9716c.readLock().lock();
                try {
                    for (Entry entry : this.f16259a.f9715b.entrySet()) {
                        if (System.identityHashCode(entry.getKey()) == i) {
                            view = (View) entry.getKey();
                            return view;
                        }
                    }
                    this.f16259a.f9716c.readLock().unlock();
                    return null;
                } finally {
                    this.f16259a.f9716c.readLock().unlock();
                }
            }
        }

        private boolean m13696a(java.net.Socket r5) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r4 = this;
            r0 = 0;
            r1 = 0;
            r2 = r4.f16259a;	 Catch:{ Exception -> 0x0087, all -> 0x0074 }
            r2 = r2.f9716c;	 Catch:{ Exception -> 0x0087, all -> 0x0074 }
            r2 = r2.readLock();	 Catch:{ Exception -> 0x0087, all -> 0x0074 }
            r2.lock();	 Catch:{ Exception -> 0x0087, all -> 0x0074 }
            r5 = r5.getOutputStream();	 Catch:{ Exception -> 0x0087, all -> 0x0074 }
            r2 = new java.io.BufferedWriter;	 Catch:{ Exception -> 0x0087, all -> 0x0074 }
            r3 = new java.io.OutputStreamWriter;	 Catch:{ Exception -> 0x0087, all -> 0x0074 }
            r3.<init>(r5);	 Catch:{ Exception -> 0x0087, all -> 0x0074 }
            r5 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;	 Catch:{ Exception -> 0x0087, all -> 0x0074 }
            r2.<init>(r3, r5);	 Catch:{ Exception -> 0x0087, all -> 0x0074 }
            r5 = r4.f16259a;	 Catch:{ Exception -> 0x0072, all -> 0x0070 }
            r5 = r5.f9715b;	 Catch:{ Exception -> 0x0072, all -> 0x0070 }
            r5 = r5.entrySet();	 Catch:{ Exception -> 0x0072, all -> 0x0070 }
            r5 = r5.iterator();	 Catch:{ Exception -> 0x0072, all -> 0x0070 }
        L_0x0029:
            r1 = r5.hasNext();	 Catch:{ Exception -> 0x0072, all -> 0x0070 }
            if (r1 == 0) goto L_0x0058;	 Catch:{ Exception -> 0x0072, all -> 0x0070 }
        L_0x002f:
            r1 = r5.next();	 Catch:{ Exception -> 0x0072, all -> 0x0070 }
            r1 = (java.util.Map.Entry) r1;	 Catch:{ Exception -> 0x0072, all -> 0x0070 }
            r3 = r1.getKey();	 Catch:{ Exception -> 0x0072, all -> 0x0070 }
            r3 = java.lang.System.identityHashCode(r3);	 Catch:{ Exception -> 0x0072, all -> 0x0070 }
            r3 = java.lang.Integer.toHexString(r3);	 Catch:{ Exception -> 0x0072, all -> 0x0070 }
            r2.write(r3);	 Catch:{ Exception -> 0x0072, all -> 0x0070 }
            r3 = 32;	 Catch:{ Exception -> 0x0072, all -> 0x0070 }
            r2.write(r3);	 Catch:{ Exception -> 0x0072, all -> 0x0070 }
            r1 = r1.getValue();	 Catch:{ Exception -> 0x0072, all -> 0x0070 }
            r1 = (java.lang.CharSequence) r1;	 Catch:{ Exception -> 0x0072, all -> 0x0070 }
            r2.append(r1);	 Catch:{ Exception -> 0x0072, all -> 0x0070 }
            r1 = 10;	 Catch:{ Exception -> 0x0072, all -> 0x0070 }
            r2.write(r1);	 Catch:{ Exception -> 0x0072, all -> 0x0070 }
            goto L_0x0029;	 Catch:{ Exception -> 0x0072, all -> 0x0070 }
        L_0x0058:
            r5 = "DONE.\n";	 Catch:{ Exception -> 0x0072, all -> 0x0070 }
            r2.write(r5);	 Catch:{ Exception -> 0x0072, all -> 0x0070 }
            r2.flush();	 Catch:{ Exception -> 0x0072, all -> 0x0070 }
            r5 = r4.f16259a;
            r5 = r5.f9716c;
            r5 = r5.readLock();
            r5.unlock();
            r2.close();	 Catch:{ IOException -> 0x0097 }
            r0 = 1;
            return r0;
        L_0x0070:
            r5 = move-exception;
            goto L_0x0076;
        L_0x0072:
            r1 = r2;
            goto L_0x0087;
        L_0x0074:
            r5 = move-exception;
            r2 = r1;
        L_0x0076:
            r0 = r4.f16259a;
            r0 = r0.f9716c;
            r0 = r0.readLock();
            r0.unlock();
            if (r2 == 0) goto L_0x0086;
        L_0x0083:
            r2.close();	 Catch:{ IOException -> 0x0086 }
        L_0x0086:
            throw r5;
        L_0x0087:
            r5 = r4.f16259a;
            r5 = r5.f9716c;
            r5 = r5.readLock();
            r5.unlock();
            if (r1 == 0) goto L_0x0097;
        L_0x0094:
            r1.close();	 Catch:{ IOException -> 0x0097 }
        L_0x0097:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.d.c.c.a(java.net.Socket):boolean");
        }

        private boolean m13697a(java.net.Socket r12, java.lang.String r13, java.lang.String r14) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r11 = this;
            r0 = 32;
            r1 = 0;
            r2 = 1;
            r3 = 0;
            r0 = r14.indexOf(r0);	 Catch:{ Exception -> 0x0095 }
            r4 = -1;	 Catch:{ Exception -> 0x0095 }
            if (r0 != r4) goto L_0x0010;	 Catch:{ Exception -> 0x0095 }
        L_0x000c:
            r0 = r14.length();	 Catch:{ Exception -> 0x0095 }
        L_0x0010:
            r4 = r14.substring(r3, r0);	 Catch:{ Exception -> 0x0095 }
            r5 = 16;	 Catch:{ Exception -> 0x0095 }
            r4 = java.lang.Long.parseLong(r4, r5);	 Catch:{ Exception -> 0x0095 }
            r4 = (int) r4;	 Catch:{ Exception -> 0x0095 }
            r5 = r14.length();	 Catch:{ Exception -> 0x0095 }
            if (r0 >= r5) goto L_0x0028;	 Catch:{ Exception -> 0x0095 }
        L_0x0021:
            r0 = r0 + r2;	 Catch:{ Exception -> 0x0095 }
            r0 = r14.substring(r0);	 Catch:{ Exception -> 0x0095 }
        L_0x0026:
            r14 = r0;	 Catch:{ Exception -> 0x0095 }
            goto L_0x002b;	 Catch:{ Exception -> 0x0095 }
        L_0x0028:
            r0 = "";	 Catch:{ Exception -> 0x0095 }
            goto L_0x0026;	 Catch:{ Exception -> 0x0095 }
        L_0x002b:
            r0 = r11.m13695a(r4);	 Catch:{ Exception -> 0x0095 }
            if (r0 != 0) goto L_0x0032;	 Catch:{ Exception -> 0x0095 }
        L_0x0031:
            return r3;	 Catch:{ Exception -> 0x0095 }
        L_0x0032:
            r4 = android.view.ViewDebug.class;	 Catch:{ Exception -> 0x0095 }
            r5 = "dispatchCommand";	 Catch:{ Exception -> 0x0095 }
            r6 = 4;	 Catch:{ Exception -> 0x0095 }
            r7 = new java.lang.Class[r6];	 Catch:{ Exception -> 0x0095 }
            r8 = android.view.View.class;	 Catch:{ Exception -> 0x0095 }
            r7[r3] = r8;	 Catch:{ Exception -> 0x0095 }
            r8 = java.lang.String.class;	 Catch:{ Exception -> 0x0095 }
            r7[r2] = r8;	 Catch:{ Exception -> 0x0095 }
            r8 = java.lang.String.class;	 Catch:{ Exception -> 0x0095 }
            r9 = 2;	 Catch:{ Exception -> 0x0095 }
            r7[r9] = r8;	 Catch:{ Exception -> 0x0095 }
            r8 = java.io.OutputStream.class;	 Catch:{ Exception -> 0x0095 }
            r10 = 3;	 Catch:{ Exception -> 0x0095 }
            r7[r10] = r8;	 Catch:{ Exception -> 0x0095 }
            r4 = r4.getDeclaredMethod(r5, r7);	 Catch:{ Exception -> 0x0095 }
            r4.setAccessible(r2);	 Catch:{ Exception -> 0x0095 }
            r5 = new java.lang.Object[r6];	 Catch:{ Exception -> 0x0095 }
            r5[r3] = r0;	 Catch:{ Exception -> 0x0095 }
            r5[r2] = r13;	 Catch:{ Exception -> 0x0095 }
            r5[r9] = r14;	 Catch:{ Exception -> 0x0095 }
            r0 = new mobi.mmdt.ott.view.components.d.c$b;	 Catch:{ Exception -> 0x0095 }
            r6 = r12.getOutputStream();	 Catch:{ Exception -> 0x0095 }
            r0.<init>(r6);	 Catch:{ Exception -> 0x0095 }
            r5[r10] = r0;	 Catch:{ Exception -> 0x0095 }
            r4.invoke(r1, r5);	 Catch:{ Exception -> 0x0095 }
            r0 = r12.isOutputShutdown();	 Catch:{ Exception -> 0x0095 }
            if (r0 != 0) goto L_0x008b;	 Catch:{ Exception -> 0x0095 }
        L_0x006e:
            r0 = new java.io.BufferedWriter;	 Catch:{ Exception -> 0x0095 }
            r4 = new java.io.OutputStreamWriter;	 Catch:{ Exception -> 0x0095 }
            r12 = r12.getOutputStream();	 Catch:{ Exception -> 0x0095 }
            r4.<init>(r12);	 Catch:{ Exception -> 0x0095 }
            r0.<init>(r4);	 Catch:{ Exception -> 0x0095 }
            r12 = "DONE\n";	 Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r0.write(r12);	 Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r0.flush();	 Catch:{ Exception -> 0x0088, all -> 0x0085 }
            goto L_0x008c;
        L_0x0085:
            r12 = move-exception;
            r1 = r0;
            goto L_0x00b7;
        L_0x0088:
            r12 = move-exception;
            r1 = r0;
            goto L_0x0096;
        L_0x008b:
            r0 = r1;
        L_0x008c:
            if (r0 == 0) goto L_0x0091;
        L_0x008e:
            r0.close();	 Catch:{ IOException -> 0x00b6 }
        L_0x0091:
            r3 = r2;
            return r3;
        L_0x0093:
            r12 = move-exception;
            goto L_0x00b7;
        L_0x0095:
            r12 = move-exception;
        L_0x0096:
            r0 = "ViewServer";	 Catch:{ all -> 0x0093 }
            r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0093 }
            r4 = "Could not send command ";	 Catch:{ all -> 0x0093 }
            r2.<init>(r4);	 Catch:{ all -> 0x0093 }
            r2.append(r13);	 Catch:{ all -> 0x0093 }
            r13 = " with parameters ";	 Catch:{ all -> 0x0093 }
            r2.append(r13);	 Catch:{ all -> 0x0093 }
            r2.append(r14);	 Catch:{ all -> 0x0093 }
            r13 = r2.toString();	 Catch:{ all -> 0x0093 }
            android.util.Log.w(r0, r13, r12);	 Catch:{ all -> 0x0093 }
            if (r1 == 0) goto L_0x00b6;
        L_0x00b3:
            r1.close();	 Catch:{ IOException -> 0x00b6 }
        L_0x00b6:
            return r3;
        L_0x00b7:
            if (r1 == 0) goto L_0x00bc;
        L_0x00b9:
            r1.close();	 Catch:{ IOException -> 0x00bc }
        L_0x00bc:
            throw r12;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.d.c.c.a(java.net.Socket, java.lang.String, java.lang.String):boolean");
        }

        private boolean m13698b(java.net.Socket r5) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r4 = this;
            r0 = 0;
            r1 = 0;
            r5 = r5.getOutputStream();	 Catch:{ Exception -> 0x0099, all -> 0x0091 }
            r2 = new java.io.BufferedWriter;	 Catch:{ Exception -> 0x0099, all -> 0x0091 }
            r3 = new java.io.OutputStreamWriter;	 Catch:{ Exception -> 0x0099, all -> 0x0091 }
            r3.<init>(r5);	 Catch:{ Exception -> 0x0099, all -> 0x0091 }
            r5 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;	 Catch:{ Exception -> 0x0099, all -> 0x0091 }
            r2.<init>(r3, r5);	 Catch:{ Exception -> 0x0099, all -> 0x0091 }
            r5 = r4.f16259a;	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r5 = r5.f9718e;	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r5 = r5.readLock();	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r5.lock();	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r5 = r4.f16259a;	 Catch:{ all -> 0x0080 }
            r5 = r5.f9717d;	 Catch:{ all -> 0x0080 }
            r1 = r4.f16259a;	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r1 = r1.f9718e;	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r1 = r1.readLock();	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r1.unlock();	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            if (r5 == 0) goto L_0x0073;	 Catch:{ Exception -> 0x008f, all -> 0x008d }
        L_0x002e:
            r1 = r4.f16259a;	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r1 = r1.f9716c;	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r1 = r1.readLock();	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r1.lock();	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r1 = r4.f16259a;	 Catch:{ all -> 0x0066 }
            r1 = r1.f9715b;	 Catch:{ all -> 0x0066 }
            r3 = r4.f16259a;	 Catch:{ all -> 0x0066 }
            r3 = r3.f9717d;	 Catch:{ all -> 0x0066 }
            r1 = r1.get(r3);	 Catch:{ all -> 0x0066 }
            r1 = (java.lang.String) r1;	 Catch:{ all -> 0x0066 }
            r3 = r4.f16259a;	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r3 = r3.f9716c;	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r3 = r3.readLock();	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r3.unlock();	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r5 = java.lang.System.identityHashCode(r5);	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r5 = java.lang.Integer.toHexString(r5);	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r2.write(r5);	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r5 = 32;	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r2.write(r5);	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r2.append(r1);	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            goto L_0x0073;	 Catch:{ Exception -> 0x008f, all -> 0x008d }
        L_0x0066:
            r5 = move-exception;	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r1 = r4.f16259a;	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r1 = r1.f9716c;	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r1 = r1.readLock();	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r1.unlock();	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            throw r5;	 Catch:{ Exception -> 0x008f, all -> 0x008d }
        L_0x0073:
            r5 = 10;	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r2.write(r5);	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r2.flush();	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r2.close();	 Catch:{ IOException -> 0x009e }
            r0 = 1;
            return r0;
        L_0x0080:
            r5 = move-exception;
            r1 = r4.f16259a;	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r1 = r1.f9718e;	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r1 = r1.readLock();	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            r1.unlock();	 Catch:{ Exception -> 0x008f, all -> 0x008d }
            throw r5;	 Catch:{ Exception -> 0x008f, all -> 0x008d }
        L_0x008d:
            r5 = move-exception;
            goto L_0x0093;
        L_0x008f:
            r1 = r2;
            goto L_0x0099;
        L_0x0091:
            r5 = move-exception;
            r2 = r1;
        L_0x0093:
            if (r2 == 0) goto L_0x0098;
        L_0x0095:
            r2.close();	 Catch:{ IOException -> 0x0098 }
        L_0x0098:
            throw r5;
        L_0x0099:
            if (r1 == 0) goto L_0x009e;
        L_0x009b:
            r1.close();	 Catch:{ IOException -> 0x009e }
        L_0x009e:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.d.c.c.b(java.net.Socket):boolean");
        }

        private boolean m13699c() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r7 = this;
            r0 = r7.f16259a;
            r1 = r0.f9714a;
            r1 = r1.contains(r7);
            if (r1 != 0) goto L_0x000f;
        L_0x000a:
            r0 = r0.f9714a;
            r0.add(r7);
        L_0x000f:
            r0 = 0;
            r1 = 1;
            r2 = new java.io.BufferedWriter;	 Catch:{ Exception -> 0x0068, all -> 0x0064 }
            r3 = new java.io.OutputStreamWriter;	 Catch:{ Exception -> 0x0068, all -> 0x0064 }
            r4 = r7.f16260b;	 Catch:{ Exception -> 0x0068, all -> 0x0064 }
            r4 = r4.getOutputStream();	 Catch:{ Exception -> 0x0068, all -> 0x0064 }
            r3.<init>(r4);	 Catch:{ Exception -> 0x0068, all -> 0x0064 }
            r2.<init>(r3);	 Catch:{ Exception -> 0x0068, all -> 0x0064 }
        L_0x0021:
            r0 = java.lang.Thread.interrupted();	 Catch:{ Exception -> 0x0062 }
            if (r0 != 0) goto L_0x0075;	 Catch:{ Exception -> 0x0062 }
        L_0x0027:
            r0 = r7.f16263e;	 Catch:{ Exception -> 0x0062 }
            monitor-enter(r0);	 Catch:{ Exception -> 0x0062 }
        L_0x002a:
            r3 = r7.f16261c;	 Catch:{ all -> 0x005f }
            if (r3 != 0) goto L_0x0038;	 Catch:{ all -> 0x005f }
        L_0x002e:
            r3 = r7.f16262d;	 Catch:{ all -> 0x005f }
            if (r3 != 0) goto L_0x0038;	 Catch:{ all -> 0x005f }
        L_0x0032:
            r3 = r7.f16263e;	 Catch:{ all -> 0x005f }
            r3.wait();	 Catch:{ all -> 0x005f }
            goto L_0x002a;	 Catch:{ all -> 0x005f }
        L_0x0038:
            r3 = r7.f16261c;	 Catch:{ all -> 0x005f }
            r4 = 0;	 Catch:{ all -> 0x005f }
            if (r3 == 0) goto L_0x0041;	 Catch:{ all -> 0x005f }
        L_0x003d:
            r7.f16261c = r4;	 Catch:{ all -> 0x005f }
            r3 = r1;	 Catch:{ all -> 0x005f }
            goto L_0x0042;	 Catch:{ all -> 0x005f }
        L_0x0041:
            r3 = r4;	 Catch:{ all -> 0x005f }
        L_0x0042:
            r5 = r7.f16262d;	 Catch:{ all -> 0x005f }
            if (r5 == 0) goto L_0x0049;	 Catch:{ all -> 0x005f }
        L_0x0046:
            r7.f16262d = r4;	 Catch:{ all -> 0x005f }
            r4 = r1;	 Catch:{ all -> 0x005f }
        L_0x0049:
            monitor-exit(r0);	 Catch:{ all -> 0x005f }
            if (r3 == 0) goto L_0x0054;
        L_0x004c:
            r0 = "LIST UPDATE\n";	 Catch:{ Exception -> 0x0062 }
            r2.write(r0);	 Catch:{ Exception -> 0x0062 }
            r2.flush();	 Catch:{ Exception -> 0x0062 }
        L_0x0054:
            if (r4 == 0) goto L_0x0021;	 Catch:{ Exception -> 0x0062 }
        L_0x0056:
            r0 = "FOCUS UPDATE\n";	 Catch:{ Exception -> 0x0062 }
            r2.write(r0);	 Catch:{ Exception -> 0x0062 }
            r2.flush();	 Catch:{ Exception -> 0x0062 }
            goto L_0x0021;
        L_0x005f:
            r3 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x005f }
            throw r3;	 Catch:{ Exception -> 0x0062 }
        L_0x0062:
            r0 = move-exception;
            goto L_0x006c;
        L_0x0064:
            r1 = move-exception;
            r2 = r0;
            r0 = r1;
            goto L_0x007f;
        L_0x0068:
            r2 = move-exception;
            r6 = r2;
            r2 = r0;
            r0 = r6;
        L_0x006c:
            r3 = "ViewServer";	 Catch:{ all -> 0x007e }
            r4 = "Connection error: ";	 Catch:{ all -> 0x007e }
            android.util.Log.w(r3, r4, r0);	 Catch:{ all -> 0x007e }
            if (r2 == 0) goto L_0x0078;
        L_0x0075:
            r2.close();	 Catch:{ IOException -> 0x0078 }
        L_0x0078:
            r0 = r7.f16259a;
            r0.f9714a.remove(r7);
            return r1;
        L_0x007e:
            r0 = move-exception;
        L_0x007f:
            if (r2 == 0) goto L_0x0084;
        L_0x0081:
            r2.close();	 Catch:{ IOException -> 0x0084 }
        L_0x0084:
            r1 = r7.f16259a;
            r1.f9714a.remove(r7);
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.d.c.c.c():boolean");
        }

        public final void mo2251a() {
            synchronized (this.f16263e) {
                this.f16261c = true;
                this.f16263e.notifyAll();
            }
        }

        public final void mo2252b() {
            synchronized (this.f16263e) {
                this.f16262d = true;
                this.f16263e.notifyAll();
            }
        }

        public final void run() {
            Throwable e;
            Throwable th;
            BufferedReader bufferedReader;
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(this.f16260b.getInputStream()), Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE);
                try {
                    String str;
                    String substring;
                    Socket socket;
                    boolean a;
                    StringBuilder stringBuilder;
                    String readLine = bufferedReader.readLine();
                    int indexOf = readLine.indexOf(32);
                    if (indexOf == -1) {
                        str = "";
                    } else {
                        substring = readLine.substring(0, indexOf);
                        str = readLine.substring(indexOf + 1);
                        readLine = substring;
                    }
                    if ("PROTOCOL".equalsIgnoreCase(readLine)) {
                        socket = this.f16260b;
                        substring = "4";
                    } else if ("SERVER".equalsIgnoreCase(readLine)) {
                        socket = this.f16260b;
                        substring = "4";
                    } else {
                        a = "LIST".equalsIgnoreCase(readLine) ? m13696a(this.f16260b) : "GET_FOCUS".equalsIgnoreCase(readLine) ? m13698b(this.f16260b) : "AUTOLIST".equalsIgnoreCase(readLine) ? m13699c() : m13697a(this.f16260b, readLine, str);
                        if (!a) {
                            stringBuilder = new StringBuilder("An error occurred with the command: ");
                            stringBuilder.append(readLine);
                            Log.w("ViewServer", stringBuilder.toString());
                        }
                        bufferedReader.close();
                        if (this.f16260b != null) {
                            try {
                                this.f16260b.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                                return;
                            }
                        }
                    }
                    a = C3134c.m7583a(socket, substring);
                    if (a) {
                        stringBuilder = new StringBuilder("An error occurred with the command: ");
                        stringBuilder.append(readLine);
                        Log.w("ViewServer", stringBuilder.toString());
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException e22) {
                        e22.printStackTrace();
                    }
                    if (this.f16260b != null) {
                        this.f16260b.close();
                    }
                } catch (IOException e3) {
                    e = e3;
                    try {
                        Log.w("ViewServer", "Connection error: ", e);
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e222) {
                                e222.printStackTrace();
                            }
                        }
                        if (this.f16260b != null) {
                            try {
                                this.f16260b.close();
                            } catch (IOException e2222) {
                                e2222.printStackTrace();
                            }
                        }
                    } catch (Throwable th2) {
                        e = th2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        if (this.f16260b != null) {
                            try {
                                this.f16260b.close();
                            } catch (IOException e42) {
                                e42.printStackTrace();
                            }
                        }
                        throw e;
                    }
                }
            } catch (Throwable e5) {
                th = e5;
                bufferedReader = null;
                e = th;
                Log.w("ViewServer", "Connection error: ", e);
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (this.f16260b != null) {
                    this.f16260b.close();
                }
            } catch (Throwable e52) {
                th = e52;
                bufferedReader = null;
                e = th;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (this.f16260b != null) {
                    this.f16260b.close();
                }
                throw e;
            }
        }
    }

    private C3134c() {
        this.f9714a = new CopyOnWriteArrayList();
        this.f9715b = new HashMap();
        this.f9716c = new ReentrantReadWriteLock();
        this.f9718e = new ReentrantReadWriteLock();
        this.f9720g = -1;
    }

    private C3134c(byte b) {
        this.f9714a = new CopyOnWriteArrayList();
        this.f9715b = new HashMap();
        this.f9716c = new ReentrantReadWriteLock();
        this.f9718e = new ReentrantReadWriteLock();
        this.f9720g = 4939;
    }

    public static C3134c m7581a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (!"user".equals(Build.TYPE) || (applicationInfo.flags & 2) == 0) {
            f9713j = new C6077a();
        } else {
            if (f9713j == null) {
                f9713j = new C3134c((byte) 0);
            }
            if (!f9713j.mo2248b()) {
                try {
                    f9713j.mo2245a();
                } catch (Throwable e) {
                    Log.d("ViewServer", "Error:", e);
                }
            }
        }
        return f9713j;
    }

    static boolean m7583a(java.net.Socket r4, java.lang.String r5) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = 0;
        r1 = 0;
        r4 = r4.getOutputStream();	 Catch:{ Exception -> 0x002f, all -> 0x0028 }
        r2 = new java.io.BufferedWriter;	 Catch:{ Exception -> 0x002f, all -> 0x0028 }
        r3 = new java.io.OutputStreamWriter;	 Catch:{ Exception -> 0x002f, all -> 0x0028 }
        r3.<init>(r4);	 Catch:{ Exception -> 0x002f, all -> 0x0028 }
        r4 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;	 Catch:{ Exception -> 0x002f, all -> 0x0028 }
        r2.<init>(r3, r4);	 Catch:{ Exception -> 0x002f, all -> 0x0028 }
        r2.write(r5);	 Catch:{ Exception -> 0x0026, all -> 0x0023 }
        r4 = "\n";	 Catch:{ Exception -> 0x0026, all -> 0x0023 }
        r2.write(r4);	 Catch:{ Exception -> 0x0026, all -> 0x0023 }
        r2.flush();	 Catch:{ Exception -> 0x0026, all -> 0x0023 }
        r4 = 1;
        r2.close();	 Catch:{ IOException -> 0x0034 }
        r0 = r4;
        return r0;
    L_0x0023:
        r4 = move-exception;
        r1 = r2;
        goto L_0x0029;
    L_0x0026:
        r1 = r2;
        goto L_0x002f;
    L_0x0028:
        r4 = move-exception;
    L_0x0029:
        if (r1 == 0) goto L_0x002e;
    L_0x002b:
        r1.close();	 Catch:{ IOException -> 0x002e }
    L_0x002e:
        throw r4;
    L_0x002f:
        if (r1 == 0) goto L_0x0034;
    L_0x0031:
        r1.close();	 Catch:{ IOException -> 0x0034 }
    L_0x0034:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.d.c.a(java.net.Socket, java.lang.String):boolean");
    }

    private void m7584c() {
        for (C3133d a : this.f9714a) {
            a.mo2251a();
        }
    }

    public void mo2242a(Activity activity) {
        String stringBuilder;
        Object charSequence = activity.getTitle().toString();
        if (TextUtils.isEmpty(charSequence)) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(activity.getClass().getCanonicalName());
            stringBuilder2.append("/0x");
            stringBuilder2.append(System.identityHashCode(activity));
            stringBuilder = stringBuilder2.toString();
        } else {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(charSequence);
            stringBuilder3.append("(");
            stringBuilder3.append(activity.getClass().getCanonicalName());
            stringBuilder3.append(")");
            stringBuilder = stringBuilder3.toString();
        }
        mo2244a(activity.getWindow().getDecorView(), stringBuilder);
    }

    public void mo2243a(View view) {
        this.f9716c.writeLock().lock();
        try {
            view = view.getRootView();
            this.f9715b.remove(view);
            this.f9718e.writeLock().lock();
            try {
                if (this.f9717d == view) {
                    this.f9717d = null;
                }
                this.f9718e.writeLock().unlock();
                m7584c();
            } catch (Throwable th) {
                this.f9718e.writeLock().unlock();
            }
        } finally {
            this.f9716c.writeLock().unlock();
        }
    }

    public void mo2244a(View view, String str) {
        this.f9716c.writeLock().lock();
        try {
            this.f9715b.put(view.getRootView(), str);
            m7584c();
        } finally {
            this.f9716c.writeLock().unlock();
        }
    }

    public boolean mo2245a() {
        if (this.f9721h != null) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder("Local View Server [port=");
        stringBuilder.append(this.f9720g);
        stringBuilder.append("]");
        this.f9721h = new Thread(this, stringBuilder.toString());
        this.f9722i = Executors.newFixedThreadPool(10);
        this.f9721h.start();
        return true;
    }

    public void mo2246b(Activity activity) {
        mo2243a(activity.getWindow().getDecorView());
    }

    public void mo2247b(View view) {
        this.f9718e.writeLock().lock();
        if (view == null) {
            view = null;
        } else {
            try {
                view = view.getRootView();
            } catch (Throwable th) {
                this.f9718e.writeLock().unlock();
            }
        }
        this.f9717d = view;
        this.f9718e.writeLock().unlock();
        for (C3133d b : this.f9714a) {
            b.mo2252b();
        }
    }

    public boolean mo2248b() {
        return this.f9721h != null && this.f9721h.isAlive();
    }

    public void mo2249c(Activity activity) {
        mo2247b(activity.getWindow().getDecorView());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r4 = this;
        r0 = new java.net.ServerSocket;	 Catch:{ Exception -> 0x0010 }
        r1 = r4.f9720g;	 Catch:{ Exception -> 0x0010 }
        r2 = 10;
        r3 = java.net.InetAddress.getLocalHost();	 Catch:{ Exception -> 0x0010 }
        r0.<init>(r1, r2, r3);	 Catch:{ Exception -> 0x0010 }
        r4.f9719f = r0;	 Catch:{ Exception -> 0x0010 }
        goto L_0x0018;
    L_0x0010:
        r0 = move-exception;
        r1 = "ViewServer";
        r2 = "Starting ServerSocket error: ";
    L_0x0015:
        android.util.Log.w(r1, r2, r0);
    L_0x0018:
        r0 = r4.f9719f;
        if (r0 == 0) goto L_0x0048;
    L_0x001c:
        r0 = java.lang.Thread.currentThread();
        r1 = r4.f9721h;
        if (r0 != r1) goto L_0x0048;
    L_0x0024:
        r0 = r4.f9719f;	 Catch:{ Exception -> 0x0042 }
        r0 = r0.accept();	 Catch:{ Exception -> 0x0042 }
        r1 = r4.f9722i;	 Catch:{ Exception -> 0x0042 }
        if (r1 == 0) goto L_0x0039;
    L_0x002e:
        r1 = r4.f9722i;	 Catch:{ Exception -> 0x0042 }
        r2 = new mobi.mmdt.ott.view.components.d.c$c;	 Catch:{ Exception -> 0x0042 }
        r2.<init>(r4, r0);	 Catch:{ Exception -> 0x0042 }
        r1.submit(r2);	 Catch:{ Exception -> 0x0042 }
        goto L_0x0018;
    L_0x0039:
        r0.close();	 Catch:{ IOException -> 0x003d }
        goto L_0x0018;
    L_0x003d:
        r0 = move-exception;
        r0.printStackTrace();	 Catch:{ Exception -> 0x0042 }
        goto L_0x0018;
    L_0x0042:
        r0 = move-exception;
        r1 = "ViewServer";
        r2 = "Connection error: ";
        goto L_0x0015;
    L_0x0048:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.d.c.run():void");
    }
}
