package com.liulishuo.filedownloader.services;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.liulishuo.filedownloader.p205h.C2181c;
import com.liulishuo.filedownloader.p205h.C2184e;
import com.liulishuo.filedownloader.p205h.C2185f;
import java.lang.ref.WeakReference;

@SuppressLint({"Registered"})
public class FileDownloadService extends Service {
    private C2225h f7321a;

    public static class SeparateProcessService extends FileDownloadService {
    }

    public static class SharedMainProcessService extends FileDownloadService {
    }

    public IBinder onBind(Intent intent) {
        return this.f7321a.mo3104e();
    }

    public void onCreate() {
        super.onCreate();
        C2181c.f7248a = this;
        try {
            C2185f.m5997a(C2184e.m5988a().f7251a);
            C2185f.m5998a(C2184e.m5988a().f7252b);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        C5675f c5675f = new C5675f();
        this.f7321a = C2184e.m5988a().f7254d ? new C6611e(new WeakReference(this), c5675f) : new C6610d(new WeakReference(this), c5675f);
    }

    public void onDestroy() {
        this.f7321a.mo3105f();
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        this.f7321a.mo3103d();
        return 1;
    }
}
