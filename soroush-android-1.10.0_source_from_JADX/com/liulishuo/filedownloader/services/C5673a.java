package com.liulishuo.filedownloader.services;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.liulishuo.filedownloader.C2226t;
import com.liulishuo.filedownloader.C5666f.C2169a;
import com.liulishuo.filedownloader.p201d.C5659b;
import com.liulishuo.filedownloader.p201d.C5659b.C2161a;
import com.liulishuo.filedownloader.p205h.C2182d;
import com.liulishuo.filedownloader.p205h.C2185f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class C5673a<CALLBACK extends Binder, INTERFACE extends IInterface> implements ServiceConnection, C2226t {
    protected volatile INTERFACE f15600a;
    private final CALLBACK f15601b;
    private final Class<?> f15602c;
    private final HashMap<String, Object> f15603d = new HashMap();
    private final List<Context> f15604e = new ArrayList();
    private final ArrayList<Runnable> f15605f = new ArrayList();

    protected C5673a(Class<?> cls) {
        this.f15602c = cls;
        this.f15601b = mo3100a();
    }

    protected abstract CALLBACK mo3100a();

    protected abstract INTERFACE mo3101a(IBinder iBinder);

    public final void mo1955a(Context context) {
        if (C2185f.m6003a(context)) {
            throw new IllegalStateException("Fatal-Exception: You can't bind the FileDownloadService in :filedownloader process.\n It's the invalid operation and is likely to cause unexpected problems.\n Maybe you want to use non-separate process mode for FileDownloader, More detail about non-separate mode, please move to wiki manually: https://github.com/lingochamp/FileDownloader/wiki/filedownloader.properties");
        }
        if (C2182d.f7249a) {
            C2182d.m5983c(this, "bindStartByContext %s", context.getClass().getSimpleName());
        }
        Intent intent = new Intent(context, this.f15602c);
        if (!this.f15604e.contains(context)) {
            this.f15604e.add(context);
        }
        context.bindService(intent, this, 1);
        context.startService(intent);
    }

    protected abstract void mo3102a(INTERFACE interfaceR, CALLBACK callback);

    public final boolean mo1959b() {
        return this.f15600a != null;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f15600a = mo3101a(iBinder);
        if (C2182d.f7249a) {
            C2182d.m5983c(this, "onServiceConnected %s %s", componentName, this.f15600a);
        }
        try {
            mo3102a(this.f15600a, this.f15601b);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        List<Runnable> list = (List) this.f15605f.clone();
        this.f15605f.clear();
        for (Runnable run : list) {
            run.run();
        }
        C2169a.f7242a.m5935b(new C5659b(C2161a.f7227a, this.f15602c));
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (C2182d.f7249a) {
            C2182d.m5983c(this, "onServiceDisconnected %s %s", componentName, this.f15600a);
        }
        if (C2182d.f7249a) {
            C2182d.m5983c(this, "release connect resources %s", this.f15600a);
        }
        this.f15600a = null;
        C2169a.f7242a.m5935b(new C5659b(C2161a.f7229c, this.f15602c));
    }
}
