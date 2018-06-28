package com.google.firebase.iid;

public final class C2079o {
    private static final Object f7000a = new Object();
    private final C2067c f7001b;

    C2079o(C2067c c2067c) {
        this.f7001b = c2067c;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final java.lang.String m5676a() {
        /*
        r5 = this;
        r0 = f7000a;
        monitor-enter(r0);
        r1 = r5.f7001b;	 Catch:{ all -> 0x0028 }
        r1 = r1.f6960a;	 Catch:{ all -> 0x0028 }
        r2 = "topic_operaion_queue";
        r3 = 0;
        r1 = r1.getString(r2, r3);	 Catch:{ all -> 0x0028 }
        if (r1 == 0) goto L_0x0026;
    L_0x0010:
        r2 = ",";
        r1 = r1.split(r2);	 Catch:{ all -> 0x0028 }
        r2 = r1.length;	 Catch:{ all -> 0x0028 }
        r4 = 1;
        if (r2 <= r4) goto L_0x0026;
    L_0x001a:
        r2 = r1[r4];	 Catch:{ all -> 0x0028 }
        r2 = android.text.TextUtils.isEmpty(r2);	 Catch:{ all -> 0x0028 }
        if (r2 != 0) goto L_0x0026;
    L_0x0022:
        r1 = r1[r4];	 Catch:{ all -> 0x0028 }
        monitor-exit(r0);	 Catch:{ all -> 0x0028 }
        return r1;
    L_0x0026:
        monitor-exit(r0);	 Catch:{ all -> 0x0028 }
        return r3;
    L_0x0028:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0028 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.o.a():java.lang.String");
    }

    final boolean m5677a(String str) {
        synchronized (f7000a) {
            String string = this.f7001b.f6960a.getString("topic_operaion_queue", "");
            String valueOf = String.valueOf(",");
            String valueOf2 = String.valueOf(str);
            if (string.startsWith(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf))) {
                valueOf = String.valueOf(",");
                str = String.valueOf(str);
                this.f7001b.f6960a.edit().putString("topic_operaion_queue", string.substring((str.length() != 0 ? valueOf.concat(str) : new String(valueOf)).length())).apply();
                return true;
            }
            return false;
        }
    }
}
