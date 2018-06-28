package com.google.firebase.iid;

final /* synthetic */ class C2084t implements Runnable {
    private final C2081q f7015a;

    C2084t(C2081q c2081q) {
        this.f7015a = c2081q;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        r8 = this;
        r0 = r8.f7015a;
    L_0x0002:
        monitor-enter(r0);
        r1 = r0.f7007a;	 Catch:{ all -> 0x00c4 }
        r2 = 2;
        if (r1 == r2) goto L_0x000a;
    L_0x0008:
        monitor-exit(r0);	 Catch:{ all -> 0x00c4 }
        return;
    L_0x000a:
        r1 = r0.f7010d;	 Catch:{ all -> 0x00c4 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x00c4 }
        if (r1 == 0) goto L_0x0017;
    L_0x0012:
        r0.m5683a();	 Catch:{ all -> 0x00c4 }
        monitor-exit(r0);	 Catch:{ all -> 0x00c4 }
        return;
    L_0x0017:
        r1 = r0.f7010d;	 Catch:{ all -> 0x00c4 }
        r1 = r1.poll();	 Catch:{ all -> 0x00c4 }
        r1 = (com.google.firebase.iid.C2087x) r1;	 Catch:{ all -> 0x00c4 }
        r3 = r0.f7011e;	 Catch:{ all -> 0x00c4 }
        r4 = r1.f7021a;	 Catch:{ all -> 0x00c4 }
        r3.put(r4, r1);	 Catch:{ all -> 0x00c4 }
        r3 = r0.f7012f;	 Catch:{ all -> 0x00c4 }
        r3 = r3.f7004b;	 Catch:{ all -> 0x00c4 }
        r4 = new com.google.firebase.iid.u;	 Catch:{ all -> 0x00c4 }
        r4.<init>(r0, r1);	 Catch:{ all -> 0x00c4 }
        r5 = 30;
        r7 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ all -> 0x00c4 }
        r3.schedule(r4, r5, r7);	 Catch:{ all -> 0x00c4 }
        monitor-exit(r0);	 Catch:{ all -> 0x00c4 }
        r3 = "MessengerIpcClient";
        r4 = 3;
        r3 = android.util.Log.isLoggable(r3, r4);
        if (r3 == 0) goto L_0x0065;
    L_0x0040:
        r3 = "MessengerIpcClient";
        r4 = java.lang.String.valueOf(r1);
        r5 = 8;
        r6 = java.lang.String.valueOf(r4);
        r6 = r6.length();
        r5 = r5 + r6;
        r6 = new java.lang.StringBuilder;
        r6.<init>(r5);
        r5 = "Sending ";
        r6.append(r5);
        r6.append(r4);
        r4 = r6.toString();
        android.util.Log.d(r3, r4);
    L_0x0065:
        r3 = r0.f7012f;
        r3 = r3.f7003a;
        r4 = r0.f7008b;
        r5 = android.os.Message.obtain();
        r6 = r1.f7023c;
        r5.what = r6;
        r6 = r1.f7021a;
        r5.arg1 = r6;
        r5.replyTo = r4;
        r4 = new android.os.Bundle;
        r4.<init>();
        r6 = "oneWay";
        r7 = r1.mo1780a();
        r4.putBoolean(r6, r7);
        r6 = "pkg";
        r3 = r3.getPackageName();
        r4.putString(r6, r3);
        r3 = "data";
        r1 = r1.f7024d;
        r4.putBundle(r3, r1);
        r5.setData(r4);
        r1 = r0.f7009c;	 Catch:{ RemoteException -> 0x00ba }
        r3 = r1.f7019a;	 Catch:{ RemoteException -> 0x00ba }
        if (r3 == 0) goto L_0x00a7;
    L_0x00a0:
        r1 = r1.f7019a;	 Catch:{ RemoteException -> 0x00ba }
        r1.send(r5);	 Catch:{ RemoteException -> 0x00ba }
        goto L_0x0002;
    L_0x00a7:
        r3 = r1.f7020b;	 Catch:{ RemoteException -> 0x00ba }
        if (r3 == 0) goto L_0x00b2;
    L_0x00ab:
        r1 = r1.f7020b;	 Catch:{ RemoteException -> 0x00ba }
        r1.m11848a(r5);	 Catch:{ RemoteException -> 0x00ba }
        goto L_0x0002;
    L_0x00b2:
        r1 = new java.lang.IllegalStateException;	 Catch:{ RemoteException -> 0x00ba }
        r3 = "Both messengers are null";
        r1.<init>(r3);	 Catch:{ RemoteException -> 0x00ba }
        throw r1;	 Catch:{ RemoteException -> 0x00ba }
    L_0x00ba:
        r1 = move-exception;
        r1 = r1.getMessage();
        r0.m5685a(r2, r1);
        goto L_0x0002;
    L_0x00c4:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00c4 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.t.run():void");
    }
}
