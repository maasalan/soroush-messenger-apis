package com.liulishuo.filedownloader;

import android.os.Binder;
import android.os.IInterface;
import android.os.RemoteException;
import com.liulishuo.filedownloader.message.C2202c.C2200a;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.p203f.C2169a.C5663a;
import com.liulishuo.filedownloader.p203f.C2170b;
import com.liulishuo.filedownloader.p205h.C2173a;
import com.liulishuo.filedownloader.services.C5673a;
import com.liulishuo.filedownloader.services.FileDownloadService.SeparateProcessService;

final class C6609o extends C5673a<C6608a, C2170b> {

    protected static class C6608a extends C5663a {
        protected C6608a() {
        }

        public final void mo1920a(MessageSnapshot messageSnapshot) {
            C2200a.f7279a.m6048a(messageSnapshot);
        }
    }

    C6609o() {
        super(SeparateProcessService.class);
    }

    protected final /* synthetic */ Binder mo3100a() {
        return new C6608a();
    }

    protected final /* bridge */ /* synthetic */ void mo3102a(IInterface iInterface, Binder binder) {
        ((C2170b) iInterface).mo1923a((C6608a) binder);
    }

    public final boolean mo1956a(int i) {
        if (!mo1959b()) {
            return C2173a.m5964a(i);
        }
        try {
            return ((C2170b) this.f15600a).mo1926a(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public final boolean mo1957a(String str, String str2, boolean z, int i, int i2, int i3, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) {
        if (!mo1959b()) {
            return C2173a.m5965a(str, str2, z);
        }
        try {
            ((C2170b) this.f15600a).mo1924a(str, str2, z, i, i2, i3, z2, fileDownloadHeader, z3);
            return true;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public final byte mo1958b(int i) {
        if (!mo1959b()) {
            return C2173a.m5966b(i);
        }
        try {
            return ((C2170b) this.f15600a).mo1934e(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return (byte) 0;
        }
    }
}
