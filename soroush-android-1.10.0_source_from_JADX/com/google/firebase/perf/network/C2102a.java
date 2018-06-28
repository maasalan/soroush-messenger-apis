package com.google.firebase.perf.network;

import com.google.android.gms.internal.ms;
import com.google.android.gms.internal.zzevc;
import java.io.IOException;
import java.io.InputStream;

public final class C2102a extends InputStream {
    private final InputStream f7071a;
    private final ms f7072b;
    private final zzevc f7073c;
    private long f7074d = -1;
    private long f7075e;
    private long f7076f = -1;

    public C2102a(InputStream inputStream, ms msVar, zzevc com_google_android_gms_internal_zzevc) {
        this.f7073c = com_google_android_gms_internal_zzevc;
        this.f7071a = inputStream;
        this.f7072b = msVar;
        this.f7075e = this.f7072b.f18327a;
    }

    public final int available() {
        try {
            return this.f7071a.available();
        } catch (IOException e) {
            this.f7072b.m16719e(this.f7073c.m5170b());
            C2108h.m5793a(this.f7072b);
            throw e;
        }
    }

    public final void close() {
        long b = this.f7073c.m5170b();
        if (this.f7076f == -1) {
            this.f7076f = b;
        }
        try {
            this.f7071a.close();
            if (this.f7074d != -1) {
                this.f7072b.m16714b(this.f7074d);
            }
            if (this.f7075e != -1) {
                this.f7072b.m16718d(this.f7075e);
            }
            this.f7072b.m16719e(this.f7076f);
            this.f7072b.m16713a();
        } catch (IOException e) {
            this.f7072b.m16719e(this.f7073c.m5170b());
            C2108h.m5793a(this.f7072b);
            throw e;
        }
    }

    public final void mark(int i) {
        this.f7071a.mark(i);
    }

    public final boolean markSupported() {
        return this.f7071a.markSupported();
    }

    public final int read() {
        try {
            int read = this.f7071a.read();
            long b = this.f7073c.m5170b();
            if (this.f7075e == -1) {
                this.f7075e = b;
            }
            if (read == -1 && this.f7076f == -1) {
                this.f7076f = b;
                this.f7072b.m16719e(this.f7076f);
                this.f7072b.m16713a();
                return read;
            }
            this.f7074d++;
            this.f7072b.m16714b(this.f7074d);
            return read;
        } catch (IOException e) {
            this.f7072b.m16719e(this.f7073c.m5170b());
            C2108h.m5793a(this.f7072b);
            throw e;
        }
    }

    public final int read(byte[] bArr) {
        try {
            int read = this.f7071a.read(bArr);
            long b = this.f7073c.m5170b();
            if (this.f7075e == -1) {
                this.f7075e = b;
            }
            if (read == -1 && this.f7076f == -1) {
                this.f7076f = b;
                this.f7072b.m16719e(this.f7076f);
                this.f7072b.m16713a();
                return read;
            }
            this.f7074d += (long) read;
            this.f7072b.m16714b(this.f7074d);
            return read;
        } catch (IOException e) {
            this.f7072b.m16719e(this.f7073c.m5170b());
            C2108h.m5793a(this.f7072b);
            throw e;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        try {
            int read = this.f7071a.read(bArr, i, i2);
            long b = this.f7073c.m5170b();
            if (this.f7075e == -1) {
                this.f7075e = b;
            }
            if (read == -1 && this.f7076f == -1) {
                this.f7076f = b;
                this.f7072b.m16719e(this.f7076f);
                this.f7072b.m16713a();
                return read;
            }
            this.f7074d += (long) read;
            this.f7072b.m16714b(this.f7074d);
            return read;
        } catch (IOException e) {
            this.f7072b.m16719e(this.f7073c.m5170b());
            C2108h.m5793a(this.f7072b);
            throw e;
        }
    }

    public final void reset() {
        try {
            this.f7071a.reset();
        } catch (IOException e) {
            this.f7072b.m16719e(this.f7073c.m5170b());
            C2108h.m5793a(this.f7072b);
            throw e;
        }
    }

    public final long skip(long j) {
        try {
            j = this.f7071a.skip(j);
            long b = this.f7073c.m5170b();
            if (this.f7075e == -1) {
                this.f7075e = b;
            }
            if (j == -1 && this.f7076f == -1) {
                this.f7076f = b;
                this.f7072b.m16719e(this.f7076f);
                return j;
            }
            this.f7074d += j;
            this.f7072b.m16714b(this.f7074d);
            return j;
        } catch (IOException e) {
            this.f7072b.m16719e(this.f7073c.m5170b());
            C2108h.m5793a(this.f7072b);
            throw e;
        }
    }
}
