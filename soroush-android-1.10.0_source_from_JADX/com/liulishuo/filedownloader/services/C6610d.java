package com.liulishuo.filedownloader.services;

import android.app.Notification;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import com.liulishuo.filedownloader.message.C2202c.C2200a;
import com.liulishuo.filedownloader.message.C2202c.C2201b;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.p203f.C2169a;
import com.liulishuo.filedownloader.p203f.C2170b.C5665a;
import com.liulishuo.filedownloader.p205h.C2182d;
import java.lang.ref.WeakReference;

public final class C6610d extends C5665a implements C2201b, C2225h {
    private final RemoteCallbackList<C2169a> f18876a = new RemoteCallbackList();
    private final C5675f f18877b;
    private final WeakReference<FileDownloadService> f18878c;

    C6610d(WeakReference<FileDownloadService> weakReference, C5675f c5675f) {
        this.f18878c = weakReference;
        this.f18877b = c5675f;
        C2200a.f7279a.m6049a((C2201b) this);
    }

    private synchronized int m16973b(MessageSnapshot messageSnapshot) {
        int beginBroadcast;
        RemoteCallbackList remoteCallbackList;
        beginBroadcast = this.f18876a.beginBroadcast();
        int i = 0;
        while (i < beginBroadcast) {
            try {
                ((C2169a) this.f18876a.getBroadcastItem(i)).mo1920a(messageSnapshot);
                i++;
            } catch (Throwable e) {
                try {
                    C2182d.m5981a((Object) this, e, "callback error", new Object[0]);
                    remoteCallbackList = this.f18876a;
                } catch (Throwable th) {
                    this.f18876a.finishBroadcast();
                }
            }
        }
        remoteCallbackList = this.f18876a;
        remoteCallbackList.finishBroadcast();
        return beginBroadcast;
    }

    public final void mo1921a() {
        this.f18877b.m12627a();
    }

    public final void mo1922a(int i, Notification notification) {
        if (this.f18878c != null && this.f18878c.get() != null) {
            ((FileDownloadService) this.f18878c.get()).startForeground(i, notification);
        }
    }

    public final void mo1923a(C2169a c2169a) {
        this.f18876a.register(c2169a);
    }

    public final void mo1966a(MessageSnapshot messageSnapshot) {
        m16973b(messageSnapshot);
    }

    public final void mo1924a(String str, String str2, boolean z, int i, int i2, int i3, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) {
        this.f18877b.m12628a(str, str2, z, i, i2, i3, z2, fileDownloadHeader, z3);
    }

    public final void mo1925a(boolean z) {
        if (this.f18878c != null && this.f18878c.get() != null) {
            ((FileDownloadService) this.f18878c.get()).stopForeground(z);
        }
    }

    public final boolean mo1926a(int i) {
        return this.f18877b.m12629a(i);
    }

    public final boolean mo1927a(String str, String str2) {
        return this.f18877b.m12631a(str, str2);
    }

    public final void mo1928b(C2169a c2169a) {
        this.f18876a.unregister(c2169a);
    }

    public final boolean mo1929b() {
        return this.f18877b.m12633b();
    }

    public final boolean mo1930b(int i) {
        return this.f18877b.m12637e(i);
    }

    public final long mo1931c(int i) {
        return this.f18877b.m12632b(i);
    }

    public final void mo1932c() {
        this.f18877b.m12635c();
    }

    public final long mo1933d(int i) {
        return this.f18877b.m12634c(i);
    }

    public final void mo3103d() {
    }

    public final byte mo1934e(int i) {
        return this.f18877b.m12636d(i);
    }

    public final IBinder mo3104e() {
        return this;
    }

    public final void mo3105f() {
        C2200a.f7279a.m6049a(null);
    }

    public final boolean mo1935f(int i) {
        return this.f18877b.m12638f(i);
    }
}
