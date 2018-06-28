package com.liulishuo.filedownloader.p201d;

import com.liulishuo.filedownloader.p205h.C2175b;
import com.liulishuo.filedownloader.p205h.C2182d;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.Executor;

public class C2160a {
    private final Executor f7225a = C2175b.m5967a(10, "EventPool");
    private final HashMap<String, LinkedList<C2163d>> f7226b = new HashMap();

    private static void m5932a(LinkedList<C2163d> linkedList, C2162c c2162c) {
        for (Object obj : linkedList.toArray()) {
            if (obj != null) {
                ((C2163d) obj).mo1919a(c2162c);
            }
        }
        if (c2162c.f7231b != null) {
            c2162c.f7231b.run();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m5933a(com.liulishuo.filedownloader.p201d.C2162c r6) {
        /*
        r5 = this;
        r0 = com.liulishuo.filedownloader.p205h.C2182d.f7249a;
        r1 = 0;
        r2 = 1;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r0 = "publish %s";
        r3 = new java.lang.Object[r2];
        r4 = r6.m5936a();
        r3[r1] = r4;
        com.liulishuo.filedownloader.p205h.C2182d.m5985e(r5, r0, r3);
    L_0x0013:
        if (r6 != 0) goto L_0x001d;
    L_0x0015:
        r6 = new java.lang.IllegalArgumentException;
        r0 = "event must not be null!";
        r6.<init>(r0);
        throw r6;
    L_0x001d:
        r0 = r6.m5936a();
        r3 = r5.f7226b;
        r3 = r3.get(r0);
        r3 = (java.util.LinkedList) r3;
        if (r3 != 0) goto L_0x004e;
    L_0x002b:
        r4 = r0.intern();
        monitor-enter(r4);
        r3 = r5.f7226b;	 Catch:{ all -> 0x004b }
        r3 = r3.get(r0);	 Catch:{ all -> 0x004b }
        r3 = (java.util.LinkedList) r3;	 Catch:{ all -> 0x004b }
        if (r3 != 0) goto L_0x0049;
    L_0x003a:
        r6 = com.liulishuo.filedownloader.p205h.C2182d.f7249a;	 Catch:{ all -> 0x004b }
        if (r6 == 0) goto L_0x0047;
    L_0x003e:
        r6 = "No listener for this event %s";
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x004b }
        r2[r1] = r0;	 Catch:{ all -> 0x004b }
        com.liulishuo.filedownloader.p205h.C2182d.m5983c(r5, r6, r2);	 Catch:{ all -> 0x004b }
    L_0x0047:
        monitor-exit(r4);	 Catch:{ all -> 0x004b }
        return r1;
    L_0x0049:
        monitor-exit(r4);	 Catch:{ all -> 0x004b }
        goto L_0x004e;
    L_0x004b:
        r6 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x004b }
        throw r6;
    L_0x004e:
        com.liulishuo.filedownloader.p201d.C2160a.m5932a(r3, r6);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.d.a.a(com.liulishuo.filedownloader.d.c):boolean");
    }

    public final boolean m5934a(String str, C2163d c2163d) {
        if (C2182d.f7249a) {
            C2182d.m5985e(this, "setListener %s", str);
        }
        if (c2163d == null) {
            throw new IllegalArgumentException("listener must not be null!");
        }
        boolean add;
        LinkedList linkedList = (LinkedList) this.f7226b.get(str);
        if (linkedList == null) {
            synchronized (str.intern()) {
                linkedList = (LinkedList) this.f7226b.get(str);
                if (linkedList == null) {
                    HashMap hashMap = this.f7226b;
                    LinkedList linkedList2 = new LinkedList();
                    hashMap.put(str, linkedList2);
                    linkedList = linkedList2;
                }
            }
        }
        synchronized (str.intern()) {
            add = linkedList.add(c2163d);
        }
        return add;
    }

    public final void m5935b(final C2162c c2162c) {
        if (C2182d.f7249a) {
            C2182d.m5985e(this, "asyncPublishInNewThread %s", c2162c.m5936a());
        }
        this.f7225a.execute(new Runnable(this) {
            final /* synthetic */ C2160a f7224b;

            public final void run() {
                this.f7224b.m5933a(c2162c);
            }
        });
    }
}
