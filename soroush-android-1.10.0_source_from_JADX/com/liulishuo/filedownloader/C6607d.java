package com.liulishuo.filedownloader;

import android.support.v7.widget.ListPopupWindow;
import com.liulishuo.filedownloader.C2135a.C5647a;
import com.liulishuo.filedownloader.C2135a.C5649c;
import com.liulishuo.filedownloader.C2186h.C2173a;
import com.liulishuo.filedownloader.C2214p.C2211a;
import com.liulishuo.filedownloader.C2219r.C2217a;
import com.liulishuo.filedownloader.C2219r.C2218b;
import com.liulishuo.filedownloader.C5671m.C2194a;
import com.liulishuo.filedownloader.C5676w.C2229a;
import com.liulishuo.filedownloader.C5676w.C2230b;
import com.liulishuo.filedownloader.message.C2203d;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.message.MessageSnapshot.C2196a;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.p205h.C2182d;
import com.liulishuo.filedownloader.p205h.C2185f;
import java.util.ArrayList;

public final class C6607d implements C5649c, C5676w, C2229a, C2230b {
    private C2220s f18861a;
    private final Object f18862b;
    private final C2160a f18863c;
    private volatile byte f18864d = (byte) 0;
    private Throwable f18865e = null;
    private final C2218b f18866f;
    private final C2217a f18867g;
    private long f18868h;
    private long f18869i;
    private int f18870j;
    private boolean f18871k;
    private boolean f18872l;
    private String f18873m;
    private boolean f18874n = false;

    interface C2160a {
        FileDownloadHeader mo1882M();

        C5647a mo1883N();

        ArrayList<Object> mo1884O();

        void mo1893b(String str);
    }

    C6607d(C2160a c2160a, Object obj) {
        this.f18862b = obj;
        this.f18863c = c2160a;
        obj = new C5655b();
        this.f18866f = obj;
        this.f18867g = obj;
        this.f18861a = new C5670k(c2160a.mo1883N(), this);
    }

    private void m16939e(MessageSnapshot messageSnapshot) {
        C2135a B = this.f18863c.mo1883N().mo1871B();
        byte b = messageSnapshot.mo3094b();
        this.f18864d = b;
        this.f18871k = messageSnapshot.m12610m();
        int i = 0;
        switch (b) {
            case (byte) -4:
                this.f18866f.mo1859a();
                int a = C2173a.f7243a.m6024a(B.mo1898f());
                int a2 = (a > 1 || !B.mo1903k()) ? 0 : C2173a.f7243a.m6024a(C2185f.m5989a(B.mo1899g(), B.mo1905m()));
                if (a + a2 <= 1) {
                    C2182d.m5984d(this, "warn, but no mListener to receive, switch to pending %d %d", Integer.valueOf(B.mo1898f()), Integer.valueOf(C2194a.f7278a.mo1958b(B.mo1898f())));
                    if (C2194a.f7278a.mo1958b(B.mo1898f()) > (byte) 0) {
                        i = 1;
                    }
                    if (i != 0) {
                        this.f18864d = (byte) 1;
                        this.f18869i = messageSnapshot.mo3098d();
                        this.f18868h = messageSnapshot.mo3099i();
                        this.f18866f.mo1860a(this.f18868h);
                        this.f18861a.mo1942a(((C2196a) messageSnapshot).mo3569l());
                        return;
                    }
                }
                C2173a.f7243a.m6026a(this.f18863c.mo1883N(), messageSnapshot);
                return;
            case (byte) -3:
                this.f18874n = messageSnapshot.mo3432e();
                this.f18868h = messageSnapshot.mo3098d();
                this.f18869i = messageSnapshot.mo3098d();
                C2173a.f7243a.m6026a(this.f18863c.mo1883N(), messageSnapshot);
                return;
            case ListPopupWindow.WRAP_CONTENT /*-2*/:
                break;
            case (byte) -1:
                this.f18865e = messageSnapshot.mo3437j();
                this.f18868h = messageSnapshot.mo3099i();
                C2173a.f7243a.m6026a(this.f18863c.mo1883N(), messageSnapshot);
                break;
            case (byte) 1:
                this.f18868h = messageSnapshot.mo3099i();
                this.f18869i = messageSnapshot.mo3098d();
                this.f18861a.mo1942a(messageSnapshot);
                return;
            case (byte) 2:
                this.f18869i = messageSnapshot.mo3098d();
                this.f18872l = messageSnapshot.mo3435g();
                this.f18873m = messageSnapshot.mo3436h();
                String f = messageSnapshot.mo3434f();
                if (f != null) {
                    if (B.mo1904l() != null) {
                        C2182d.m5984d(this, "already has mFilename[%s], but assign mFilename[%s] again", B.mo1904l(), f);
                    }
                    this.f18863c.mo1893b(f);
                }
                this.f18866f.mo1860a(this.f18868h);
                this.f18861a.mo1946c(messageSnapshot);
                return;
            case (byte) 3:
                this.f18868h = messageSnapshot.mo3099i();
                this.f18866f.mo1862c(messageSnapshot.mo3099i());
                this.f18861a.mo1948d(messageSnapshot);
                return;
            case (byte) 5:
                this.f18868h = messageSnapshot.mo3099i();
                this.f18865e = messageSnapshot.mo3437j();
                this.f18870j = messageSnapshot.mo3568k();
                this.f18866f.mo1859a();
                this.f18861a.mo1951f(messageSnapshot);
                return;
            case (byte) 6:
                this.f18861a.mo1945b(messageSnapshot);
                return;
            default:
                return;
        }
    }

    private int m16940o() {
        return this.f18863c.mo1883N().mo1871B().mo1898f();
    }

    public final MessageSnapshot mo3075a(Throwable th) {
        this.f18864d = (byte) -1;
        this.f18865e = th;
        return C2203d.m6052a(m16940o(), this.f18868h, th);
    }

    public final void mo3076a() {
        if (C2182d.f7249a) {
            C2182d.m5985e(this, "filedownloader:lifecycle:start %s by %d ", toString(), Byte.valueOf(this.f18864d));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3077a(com.liulishuo.filedownloader.message.MessageSnapshot r8) {
        /*
        r7 = this;
        r0 = r7.f18864d;
        r1 = r8.mo3094b();
        r2 = 3;
        r3 = 1;
        r4 = 0;
        if (r0 == r2) goto L_0x0012;
    L_0x000b:
        r5 = 5;
        if (r0 == r5) goto L_0x0012;
    L_0x000e:
        if (r0 != r1) goto L_0x0012;
    L_0x0010:
        r0 = r4;
        goto L_0x0045;
    L_0x0012:
        if (r0 >= 0) goto L_0x0016;
    L_0x0014:
        r5 = r3;
        goto L_0x0017;
    L_0x0016:
        r5 = r4;
    L_0x0017:
        if (r5 == 0) goto L_0x001a;
    L_0x0019:
        goto L_0x0010;
    L_0x001a:
        r5 = 6;
        if (r0 <= 0) goto L_0x0028;
    L_0x001d:
        if (r0 > r5) goto L_0x0028;
    L_0x001f:
        r6 = 10;
        if (r1 < r6) goto L_0x0028;
    L_0x0023:
        r6 = 11;
        if (r1 > r6) goto L_0x0028;
    L_0x0027:
        goto L_0x0010;
    L_0x0028:
        switch(r0) {
            case 1: goto L_0x0042;
            case 2: goto L_0x003c;
            case 3: goto L_0x0036;
            case 4: goto L_0x002b;
            case 5: goto L_0x0031;
            case 6: goto L_0x002d;
            default: goto L_0x002b;
        };
    L_0x002b:
        r0 = r3;
        goto L_0x0045;
    L_0x002d:
        switch(r1) {
            case 0: goto L_0x0010;
            case 1: goto L_0x0010;
            default: goto L_0x0030;
        };
    L_0x0030:
        goto L_0x002b;
    L_0x0031:
        if (r1 == r3) goto L_0x0010;
    L_0x0033:
        if (r1 == r5) goto L_0x0010;
    L_0x0035:
        goto L_0x002b;
    L_0x0036:
        if (r1 == r5) goto L_0x0010;
    L_0x0038:
        switch(r1) {
            case 0: goto L_0x0010;
            case 1: goto L_0x0010;
            case 2: goto L_0x0010;
            default: goto L_0x003b;
        };
    L_0x003b:
        goto L_0x002b;
    L_0x003c:
        if (r1 == r5) goto L_0x0010;
    L_0x003e:
        switch(r1) {
            case 0: goto L_0x0010;
            case 1: goto L_0x0010;
            default: goto L_0x0041;
        };
    L_0x0041:
        goto L_0x002b;
    L_0x0042:
        if (r1 == 0) goto L_0x0010;
    L_0x0044:
        goto L_0x002b;
    L_0x0045:
        if (r0 != 0) goto L_0x006e;
    L_0x0047:
        r8 = com.liulishuo.filedownloader.p205h.C2182d.f7249a;
        if (r8 == 0) goto L_0x006d;
    L_0x004b:
        r8 = "can't update mStatus change by keep ahead, %d, but the current mStatus is %d, %d";
        r0 = new java.lang.Object[r2];
        r1 = r7.f18864d;
        r1 = java.lang.Byte.valueOf(r1);
        r0[r4] = r1;
        r1 = r7.f18864d;
        r1 = java.lang.Byte.valueOf(r1);
        r0[r3] = r1;
        r1 = 2;
        r2 = r7.m16940o();
        r2 = java.lang.Integer.valueOf(r2);
        r0[r1] = r2;
        com.liulishuo.filedownloader.p205h.C2182d.m5983c(r7, r8, r0);
    L_0x006d:
        return r4;
    L_0x006e:
        r7.m16939e(r8);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.d.a(com.liulishuo.filedownloader.message.MessageSnapshot):boolean");
    }

    public final void mo3078b() {
        if (C2193l.m6042a()) {
            byte b = this.f18864d;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3079b(com.liulishuo.filedownloader.message.MessageSnapshot r10) {
        /*
        r9 = this;
        r0 = r9.f18864d;
        r1 = r10.mo3094b();
        r2 = -2;
        r3 = 0;
        r4 = 1;
        if (r2 != r0) goto L_0x0028;
    L_0x000b:
        if (r1 <= 0) goto L_0x000f;
    L_0x000d:
        r5 = r4;
        goto L_0x0010;
    L_0x000f:
        r5 = r3;
    L_0x0010:
        if (r5 == 0) goto L_0x0028;
    L_0x0012:
        r10 = com.liulishuo.filedownloader.p205h.C2182d.f7249a;
        if (r10 == 0) goto L_0x0027;
    L_0x0016:
        r10 = "High concurrent cause, callback pending, but has already be paused %d";
        r0 = new java.lang.Object[r4];
        r1 = r9.m16940o();
        r1 = java.lang.Integer.valueOf(r1);
        r0[r3] = r1;
        com.liulishuo.filedownloader.p205h.C2182d.m5983c(r9, r10, r0);
    L_0x0027:
        return r4;
    L_0x0028:
        r5 = 2;
        r6 = 5;
        r7 = 3;
        if (r0 == r7) goto L_0x0031;
    L_0x002d:
        if (r0 == r6) goto L_0x0031;
    L_0x002f:
        if (r0 == r1) goto L_0x0064;
    L_0x0031:
        if (r0 >= 0) goto L_0x0035;
    L_0x0033:
        r8 = r4;
        goto L_0x0036;
    L_0x0035:
        r8 = r3;
    L_0x0036:
        if (r8 != 0) goto L_0x0064;
    L_0x0038:
        if (r1 != r2) goto L_0x003c;
    L_0x003a:
        r0 = r4;
        goto L_0x0065;
    L_0x003c:
        r2 = -1;
        if (r1 != r2) goto L_0x0040;
    L_0x003f:
        goto L_0x003a;
    L_0x0040:
        switch(r0) {
            case 0: goto L_0x0060;
            case 1: goto L_0x005c;
            case 2: goto L_0x0054;
            case 3: goto L_0x0054;
            case 4: goto L_0x0043;
            case 5: goto L_0x004f;
            case 6: goto L_0x004f;
            case 7: goto L_0x0043;
            case 8: goto L_0x0043;
            case 9: goto L_0x0043;
            case 10: goto L_0x004a;
            case 11: goto L_0x0044;
            default: goto L_0x0043;
        };
    L_0x0043:
        goto L_0x0064;
    L_0x0044:
        if (r1 == r4) goto L_0x003a;
    L_0x0046:
        switch(r1) {
            case -4: goto L_0x003a;
            case -3: goto L_0x003a;
            default: goto L_0x0049;
        };
    L_0x0049:
        goto L_0x0064;
    L_0x004a:
        r0 = 11;
        if (r1 == r0) goto L_0x003a;
    L_0x004e:
        goto L_0x0064;
    L_0x004f:
        if (r1 == r5) goto L_0x003a;
    L_0x0051:
        if (r1 == r6) goto L_0x003a;
    L_0x0053:
        goto L_0x0064;
    L_0x0054:
        r0 = -3;
        if (r1 == r0) goto L_0x003a;
    L_0x0057:
        if (r1 == r7) goto L_0x003a;
    L_0x0059:
        if (r1 == r6) goto L_0x003a;
    L_0x005b:
        goto L_0x0064;
    L_0x005c:
        r0 = 6;
        if (r1 == r0) goto L_0x003a;
    L_0x005f:
        goto L_0x0064;
    L_0x0060:
        r0 = 10;
        if (r1 == r0) goto L_0x003a;
    L_0x0064:
        r0 = r3;
    L_0x0065:
        if (r0 != 0) goto L_0x008d;
    L_0x0067:
        r10 = com.liulishuo.filedownloader.p205h.C2182d.f7249a;
        if (r10 == 0) goto L_0x008c;
    L_0x006b:
        r10 = "can't update mStatus change by keep flow, %d, but the current mStatus is %d, %d";
        r0 = new java.lang.Object[r7];
        r1 = r9.f18864d;
        r1 = java.lang.Byte.valueOf(r1);
        r0[r3] = r1;
        r1 = r9.f18864d;
        r1 = java.lang.Byte.valueOf(r1);
        r0[r4] = r1;
        r1 = r9.m16940o();
        r1 = java.lang.Integer.valueOf(r1);
        r0[r5] = r1;
        com.liulishuo.filedownloader.p205h.C2182d.m5983c(r9, r10, r0);
    L_0x008c:
        return r3;
    L_0x008d:
        r9.m16939e(r10);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.d.b(com.liulishuo.filedownloader.message.MessageSnapshot):boolean");
    }

    public final void mo3080c() {
        int i = 0;
        if (C2182d.f7249a) {
            C2182d.m5985e(this, "filedownloader:lifecycle:over %s by %d ", toString(), Byte.valueOf(this.f18864d));
        }
        this.f18866f.mo1861b(this.f18868h);
        if (this.f18863c.mo1884O() != null) {
            ArrayList arrayList = (ArrayList) this.f18863c.mo1884O().clone();
            int size = arrayList.size();
            while (i < size) {
                arrayList.get(i);
                i++;
            }
        }
        C2216q.m6073a().m6077d().mo3109b(this.f18863c.mo1883N());
    }

    public final boolean mo3081c(MessageSnapshot messageSnapshot) {
        boolean z;
        C2135a B = this.f18863c.mo1883N().mo1871B();
        if (B.mo1911s() != (byte) 0) {
            if (B.mo1911s() != (byte) 3) {
                z = false;
                if (!z) {
                    return false;
                }
                m16939e(messageSnapshot);
                return true;
            }
        }
        z = true;
        if (!z) {
            return false;
        }
        m16939e(messageSnapshot);
        return true;
    }

    public final C2220s mo3082d() {
        return this.f18861a;
    }

    public final boolean mo3083d(MessageSnapshot messageSnapshot) {
        if (!this.f18863c.mo1883N().mo1871B().mo1903k() || messageSnapshot.mo3094b() != (byte) -4 || this.f18864d != (byte) 2) {
            return false;
        }
        m16939e(messageSnapshot);
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3084e() {
        /*
        r8 = this;
        r0 = r8.f18862b;
        monitor-enter(r0);
        r1 = r8.f18864d;	 Catch:{ all -> 0x0114 }
        r2 = 2;
        r3 = 1;
        r4 = 0;
        if (r1 == 0) goto L_0x0025;
    L_0x000a:
        r1 = "High concurrent cause, this task %d will not input to launch pool, because of the status isn't idle : %d";
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x0114 }
        r5 = r8.m16940o();	 Catch:{ all -> 0x0114 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x0114 }
        r2[r4] = r5;	 Catch:{ all -> 0x0114 }
        r4 = r8.f18864d;	 Catch:{ all -> 0x0114 }
        r4 = java.lang.Byte.valueOf(r4);	 Catch:{ all -> 0x0114 }
        r2[r3] = r4;	 Catch:{ all -> 0x0114 }
        com.liulishuo.filedownloader.p205h.C2182d.m5984d(r8, r1, r2);	 Catch:{ all -> 0x0114 }
        monitor-exit(r0);	 Catch:{ all -> 0x0114 }
        return;
    L_0x0025:
        r1 = 10;
        r8.f18864d = r1;	 Catch:{ all -> 0x0114 }
        monitor-exit(r0);	 Catch:{ all -> 0x0114 }
        r0 = r8.f18863c;
        r0 = r0.mo1883N();
        r1 = r0.mo1871B();
        r5 = com.liulishuo.filedownloader.p205h.C2182d.f7249a;
        if (r5 == 0) goto L_0x0059;
    L_0x0038:
        r5 = "call start Url[%s], Path[%s] Listener[%s], Tag[%s]";
        r6 = 4;
        r6 = new java.lang.Object[r6];
        r7 = r1.mo1899g();
        r6[r4] = r7;
        r7 = r1.mo1902j();
        r6[r3] = r7;
        r7 = r1.mo1906n();
        r6[r2] = r7;
        r2 = 3;
        r1 = r1.mo1914v();
        r6[r2] = r1;
        com.liulishuo.filedownloader.p205h.C2182d.m5985e(r8, r5, r6);
    L_0x0059:
        r1 = r8.f18863c;	 Catch:{ Throwable -> 0x00e1 }
        r1 = r1.mo1883N();	 Catch:{ Throwable -> 0x00e1 }
        r1 = r1.mo1871B();	 Catch:{ Throwable -> 0x00e1 }
        r2 = r1.mo1902j();	 Catch:{ Throwable -> 0x00e1 }
        if (r2 != 0) goto L_0x0085;
    L_0x0069:
        r2 = r1.mo1899g();	 Catch:{ Throwable -> 0x00e1 }
        r2 = com.liulishuo.filedownloader.p205h.C2185f.m5994a(r2);	 Catch:{ Throwable -> 0x00e1 }
        r1.mo1889a(r2);	 Catch:{ Throwable -> 0x00e1 }
        r2 = com.liulishuo.filedownloader.p205h.C2182d.f7249a;	 Catch:{ Throwable -> 0x00e1 }
        if (r2 == 0) goto L_0x0085;
    L_0x0078:
        r2 = "save Path is null to %s";
        r5 = new java.lang.Object[r3];	 Catch:{ Throwable -> 0x00e1 }
        r6 = r1.mo1902j();	 Catch:{ Throwable -> 0x00e1 }
        r5[r4] = r6;	 Catch:{ Throwable -> 0x00e1 }
        com.liulishuo.filedownloader.p205h.C2182d.m5983c(r8, r2, r5);	 Catch:{ Throwable -> 0x00e1 }
    L_0x0085:
        r2 = r1.mo1903k();	 Catch:{ Throwable -> 0x00e1 }
        if (r2 == 0) goto L_0x0096;
    L_0x008b:
        r2 = new java.io.File;	 Catch:{ Throwable -> 0x00e1 }
        r1 = r1.mo1902j();	 Catch:{ Throwable -> 0x00e1 }
        r2.<init>(r1);	 Catch:{ Throwable -> 0x00e1 }
        r1 = r2;
        goto L_0x00b9;
    L_0x0096:
        r2 = r1.mo1902j();	 Catch:{ Throwable -> 0x00e1 }
        r2 = com.liulishuo.filedownloader.p205h.C2185f.m6015e(r2);	 Catch:{ Throwable -> 0x00e1 }
        if (r2 != 0) goto L_0x00b4;
    L_0x00a0:
        r2 = new java.security.InvalidParameterException;	 Catch:{ Throwable -> 0x00e1 }
        r5 = "the provided mPath[%s] is invalid, can't find its directory";
        r6 = new java.lang.Object[r3];	 Catch:{ Throwable -> 0x00e1 }
        r1 = r1.mo1902j();	 Catch:{ Throwable -> 0x00e1 }
        r6[r4] = r1;	 Catch:{ Throwable -> 0x00e1 }
        r1 = com.liulishuo.filedownloader.p205h.C2185f.m5996a(r5, r6);	 Catch:{ Throwable -> 0x00e1 }
        r2.<init>(r1);	 Catch:{ Throwable -> 0x00e1 }
        throw r2;	 Catch:{ Throwable -> 0x00e1 }
    L_0x00b4:
        r1 = new java.io.File;	 Catch:{ Throwable -> 0x00e1 }
        r1.<init>(r2);	 Catch:{ Throwable -> 0x00e1 }
    L_0x00b9:
        r2 = r1.exists();	 Catch:{ Throwable -> 0x00e1 }
        if (r2 != 0) goto L_0x00df;
    L_0x00bf:
        r2 = r1.mkdirs();	 Catch:{ Throwable -> 0x00e1 }
        if (r2 != 0) goto L_0x00df;
    L_0x00c5:
        r2 = r1.exists();	 Catch:{ Throwable -> 0x00e1 }
        if (r2 != 0) goto L_0x00df;
    L_0x00cb:
        r2 = new java.io.IOException;	 Catch:{ Throwable -> 0x00e1 }
        r5 = "Create parent directory failed, please make sure you have permission to create file or directory on the path: %s";
        r6 = new java.lang.Object[r3];	 Catch:{ Throwable -> 0x00e1 }
        r1 = r1.getAbsolutePath();	 Catch:{ Throwable -> 0x00e1 }
        r6[r4] = r1;	 Catch:{ Throwable -> 0x00e1 }
        r1 = com.liulishuo.filedownloader.p205h.C2185f.m5996a(r5, r6);	 Catch:{ Throwable -> 0x00e1 }
        r2.<init>(r1);	 Catch:{ Throwable -> 0x00e1 }
        throw r2;	 Catch:{ Throwable -> 0x00e1 }
    L_0x00df:
        r0 = r3;
        goto L_0x00f5;
    L_0x00e1:
        r1 = move-exception;
        r2 = com.liulishuo.filedownloader.C2186h.C2173a.f7243a;
        r2.m6028b(r0);
        r2 = com.liulishuo.filedownloader.C2186h.C2173a.f7243a;
        r1 = r8.mo3075a(r1);
        r2.m6026a(r0, r1);
        r0 = r4;
    L_0x00f5:
        if (r0 == 0) goto L_0x00fe;
    L_0x00f7:
        r0 = com.liulishuo.filedownloader.C2214p.C2211a.f7310a;
        r0.m6069a(r8);
    L_0x00fe:
        r0 = com.liulishuo.filedownloader.p205h.C2182d.f7249a;
        if (r0 == 0) goto L_0x0113;
    L_0x0102:
        r0 = "the task[%d] has been into the launch pool.";
        r1 = new java.lang.Object[r3];
        r2 = r8.m16940o();
        r2 = java.lang.Integer.valueOf(r2);
        r1[r4] = r2;
        com.liulishuo.filedownloader.p205h.C2182d.m5985e(r8, r0, r1);
    L_0x0113:
        return;
    L_0x0114:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0114 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.d.e():void");
    }

    public final boolean mo3085f() {
        if (this.f18864d < (byte) 0) {
            if (C2182d.f7249a) {
                C2182d.m5983c(this, "High concurrent cause, Already is over, can't pause again, %d %d", Byte.valueOf(this.f18864d), Integer.valueOf(this.f18863c.mo1883N().mo1871B().mo1898f()));
            }
            return false;
        }
        this.f18864d = (byte) -2;
        C5647a N = this.f18863c.mo1883N();
        C2135a B = N.mo1871B();
        C2211a.f7310a.m6070b(this);
        if (C2182d.f7249a) {
            C2182d.m5985e(this, "the task[%d] has been expired from the launch pool.", Integer.valueOf(m16940o()));
        }
        C2216q.m6073a();
        if (C2216q.m6075b()) {
            C2194a.f7278a.mo1956a(B.mo1898f());
        } else if (C2182d.f7249a) {
            C2182d.m5983c(this, "request pause the task[%d] to the download service, but the download service isn't connected yet.", Integer.valueOf(B.mo1898f()));
        }
        C2173a.f7243a.m6028b(N);
        C2173a.f7243a.m6026a(N, C2203d.m6054a(B));
        C2216q.m6073a().m6077d().mo3109b(N);
        return true;
    }

    public final byte mo3086g() {
        return this.f18864d;
    }

    public final long mo3087h() {
        return this.f18868h;
    }

    public final long mo3088i() {
        return this.f18869i;
    }

    public final Throwable mo3089j() {
        return this.f18865e;
    }

    public final int mo3090k() {
        return this.f18870j;
    }

    public final boolean mo3091l() {
        return this.f18871k;
    }

    public final void mo3092m() {
        if (C2182d.f7249a) {
            C2182d.m5983c(this, "free the task %d, when the status is %d", Integer.valueOf(m16940o()), Byte.valueOf(this.f18864d));
        }
        this.f18864d = (byte) 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3093n() {
        /*
        r19 = this;
        r1 = r19;
        r2 = r1.f18864d;
        r3 = 2;
        r4 = 10;
        r5 = 0;
        r6 = 1;
        if (r2 == r4) goto L_0x0025;
    L_0x000b:
        r2 = "High concurrent cause, this task %d will not start, because the of status isn't toLaunchPool: %d";
        r3 = new java.lang.Object[r3];
        r4 = r19.m16940o();
        r4 = java.lang.Integer.valueOf(r4);
        r3[r5] = r4;
        r4 = r1.f18864d;
        r4 = java.lang.Byte.valueOf(r4);
        r3[r6] = r4;
        com.liulishuo.filedownloader.p205h.C2182d.m5984d(r1, r2, r3);
        return;
    L_0x0025:
        r2 = r1.f18863c;
        r2 = r2.mo1883N();
        r7 = r2.mo1871B();
        r8 = com.liulishuo.filedownloader.C2216q.m6073a();
        r8 = r8.m6077d();
        r9 = r8.mo3110c(r2);	 Catch:{ Throwable -> 0x0108 }
        if (r9 == 0) goto L_0x003e;
    L_0x003d:
        return;
    L_0x003e:
        r9 = r1.f18862b;	 Catch:{ Throwable -> 0x0108 }
        monitor-enter(r9);	 Catch:{ Throwable -> 0x0108 }
        r10 = r1.f18864d;	 Catch:{ all -> 0x0104 }
        if (r10 == r4) goto L_0x0060;
    L_0x0045:
        r4 = "High concurrent cause, this task %d will not start, the status can't assign to toFileDownloadService, because the status isn't toLaunchPool: %d";
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x0104 }
        r7 = r19.m16940o();	 Catch:{ all -> 0x0104 }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ all -> 0x0104 }
        r3[r5] = r7;	 Catch:{ all -> 0x0104 }
        r5 = r1.f18864d;	 Catch:{ all -> 0x0104 }
        r5 = java.lang.Byte.valueOf(r5);	 Catch:{ all -> 0x0104 }
        r3[r6] = r5;	 Catch:{ all -> 0x0104 }
        com.liulishuo.filedownloader.p205h.C2182d.m5984d(r1, r4, r3);	 Catch:{ all -> 0x0104 }
        monitor-exit(r9);	 Catch:{ all -> 0x0104 }
        return;
    L_0x0060:
        r3 = 11;
        r1.f18864d = r3;	 Catch:{ all -> 0x0104 }
        monitor-exit(r9);	 Catch:{ all -> 0x0104 }
        r3 = com.liulishuo.filedownloader.C2186h.C2173a.f7243a;	 Catch:{ Throwable -> 0x0108 }
        r3.m6028b(r2);	 Catch:{ Throwable -> 0x0108 }
        r3 = r7.mo1898f();	 Catch:{ Throwable -> 0x0108 }
        r4 = r7.mo1905m();	 Catch:{ Throwable -> 0x0108 }
        r9 = r7.mo1912t();	 Catch:{ Throwable -> 0x0108 }
        r3 = com.liulishuo.filedownloader.p205h.C2181c.m5977a(r3, r4, r9, r6);	 Catch:{ Throwable -> 0x0108 }
        if (r3 == 0) goto L_0x007f;
    L_0x007e:
        return;
    L_0x007f:
        r9 = com.liulishuo.filedownloader.C5671m.C2194a.f7278a;	 Catch:{ Throwable -> 0x0108 }
        r10 = r7.mo1899g();	 Catch:{ Throwable -> 0x0108 }
        r11 = r7.mo1902j();	 Catch:{ Throwable -> 0x0108 }
        r12 = r7.mo1903k();	 Catch:{ Throwable -> 0x0108 }
        r13 = r7.mo1900h();	 Catch:{ Throwable -> 0x0108 }
        r14 = r7.mo1901i();	 Catch:{ Throwable -> 0x0108 }
        r15 = r7.mo1915w();	 Catch:{ Throwable -> 0x0108 }
        r16 = r7.mo1912t();	 Catch:{ Throwable -> 0x0108 }
        r3 = r1.f18863c;	 Catch:{ Throwable -> 0x0108 }
        r17 = r3.mo1882M();	 Catch:{ Throwable -> 0x0108 }
        r18 = r7.mo1870A();	 Catch:{ Throwable -> 0x0108 }
        r3 = r9.mo1957a(r10, r11, r12, r13, r14, r15, r16, r17, r18);	 Catch:{ Throwable -> 0x0108 }
        r4 = r1.f18864d;	 Catch:{ Throwable -> 0x0108 }
        r7 = -2;
        if (r4 != r7) goto L_0x00d1;
    L_0x00b2:
        r4 = "High concurrent cause, this task %d will be paused,because of the status is paused, so the pause action must be applied";
        r6 = new java.lang.Object[r6];	 Catch:{ Throwable -> 0x0108 }
        r7 = r19.m16940o();	 Catch:{ Throwable -> 0x0108 }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ Throwable -> 0x0108 }
        r6[r5] = r7;	 Catch:{ Throwable -> 0x0108 }
        com.liulishuo.filedownloader.p205h.C2182d.m5984d(r1, r4, r6);	 Catch:{ Throwable -> 0x0108 }
        if (r3 == 0) goto L_0x00d0;
    L_0x00c5:
        r3 = com.liulishuo.filedownloader.C5671m.C2194a.f7278a;	 Catch:{ Throwable -> 0x0108 }
        r4 = r19.m16940o();	 Catch:{ Throwable -> 0x0108 }
        r3.mo1956a(r4);	 Catch:{ Throwable -> 0x0108 }
    L_0x00d0:
        return;
    L_0x00d1:
        if (r3 != 0) goto L_0x0100;
    L_0x00d3:
        r3 = r8.mo3110c(r2);	 Catch:{ Throwable -> 0x0108 }
        if (r3 != 0) goto L_0x0103;
    L_0x00d9:
        r3 = new java.lang.RuntimeException;	 Catch:{ Throwable -> 0x0108 }
        r4 = "Occur Unknown Error, when request to start maybe some problem in binder, maybe the process was killed in unexpected.";
        r3.<init>(r4);	 Catch:{ Throwable -> 0x0108 }
        r3 = r1.mo3075a(r3);	 Catch:{ Throwable -> 0x0108 }
        r4 = com.liulishuo.filedownloader.C2186h.C2173a.f7243a;	 Catch:{ Throwable -> 0x0108 }
        r4 = r4.m6025a(r2);	 Catch:{ Throwable -> 0x0108 }
        if (r4 == 0) goto L_0x00f8;
    L_0x00ee:
        r8.mo3109b(r2);	 Catch:{ Throwable -> 0x0108 }
        r4 = com.liulishuo.filedownloader.C2186h.C2173a.f7243a;	 Catch:{ Throwable -> 0x0108 }
        r4.m6028b(r2);	 Catch:{ Throwable -> 0x0108 }
    L_0x00f8:
        r4 = com.liulishuo.filedownloader.C2186h.C2173a.f7243a;	 Catch:{ Throwable -> 0x0108 }
        r4.m6026a(r2, r3);	 Catch:{ Throwable -> 0x0108 }
        return;
    L_0x0100:
        r8.mo3109b(r2);	 Catch:{ Throwable -> 0x0108 }
    L_0x0103:
        return;
    L_0x0104:
        r0 = move-exception;
        r3 = r0;
        monitor-exit(r9);	 Catch:{ all -> 0x0104 }
        throw r3;	 Catch:{ Throwable -> 0x0108 }
    L_0x0108:
        r0 = move-exception;
        r3 = r0;
        r3.printStackTrace();
        r4 = com.liulishuo.filedownloader.C2186h.C2173a.f7243a;
        r3 = r1.mo3075a(r3);
        r4.m6026a(r2, r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.d.n():void");
    }
}
