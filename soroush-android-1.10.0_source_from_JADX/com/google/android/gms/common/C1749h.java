package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class C1749h implements ServiceConnection {
    public boolean f5312a = false;
    public final BlockingQueue<IBinder> f5313b = new LinkedBlockingQueue();

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f5313b.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
