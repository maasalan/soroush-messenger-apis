package com.liulishuo.filedownloader.services;

import android.app.Notification;
import android.os.IBinder;
import com.liulishuo.filedownloader.C5671m;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.p203f.C2169a;
import com.liulishuo.filedownloader.p203f.C2170b.C5665a;
import java.lang.ref.WeakReference;

public final class C6611e extends C5665a implements C2225h {
    private final C5675f f18879a;
    private final WeakReference<FileDownloadService> f18880b;

    public interface C2223a {
        void mo1960a();

        void mo1961a(C6611e c6611e);
    }

    C6611e(WeakReference<FileDownloadService> weakReference, C5675f c5675f) {
        this.f18880b = weakReference;
        this.f18879a = c5675f;
    }

    public final void mo1921a() {
        this.f18879a.m12627a();
    }

    public final void mo1922a(int i, Notification notification) {
        if (this.f18880b != null && this.f18880b.get() != null) {
            ((FileDownloadService) this.f18880b.get()).startForeground(i, notification);
        }
    }

    public final void mo1923a(C2169a c2169a) {
    }

    public final void mo1924a(String str, String str2, boolean z, int i, int i2, int i3, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) {
        this.f18879a.m12628a(str, str2, z, i, i2, i3, z2, fileDownloadHeader, z3);
    }

    public final void mo1925a(boolean z) {
        if (this.f18880b != null && this.f18880b.get() != null) {
            ((FileDownloadService) this.f18880b.get()).stopForeground(z);
        }
    }

    public final boolean mo1926a(int i) {
        return this.f18879a.m12629a(i);
    }

    public final boolean mo1927a(String str, String str2) {
        return this.f18879a.m12631a(str, str2);
    }

    public final void mo1928b(C2169a c2169a) {
    }

    public final boolean mo1929b() {
        return this.f18879a.m12633b();
    }

    public final boolean mo1930b(int i) {
        return this.f18879a.m12637e(i);
    }

    public final long mo1931c(int i) {
        return this.f18879a.m12632b(i);
    }

    public final void mo1932c() {
        this.f18879a.m12635c();
    }

    public final long mo1933d(int i) {
        return this.f18879a.m12634c(i);
    }

    public final void mo3103d() {
        C5671m.m12594a().mo1961a(this);
    }

    public final byte mo1934e(int i) {
        return this.f18879a.m12636d(i);
    }

    public final IBinder mo3104e() {
        return null;
    }

    public final void mo3105f() {
        C5671m.m12594a().mo1960a();
    }

    public final boolean mo1935f(int i) {
        return this.f18879a.m12638f(i);
    }
}
