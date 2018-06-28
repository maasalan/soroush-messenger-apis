package com.google.firebase.perf.network;

import com.google.android.gms.internal.ms;
import com.google.android.gms.internal.zzevc;
import java.io.IOException;
import java.io.OutputStream;

public final class C2103b extends OutputStream {
    private OutputStream f7077a;
    private long f7078b = -1;
    private ms f7079c;
    private final zzevc f7080d;

    public C2103b(OutputStream outputStream, ms msVar, zzevc com_google_android_gms_internal_zzevc) {
        this.f7077a = outputStream;
        this.f7079c = msVar;
        this.f7080d = com_google_android_gms_internal_zzevc;
    }

    public final void close() {
        if (this.f7078b != -1) {
            this.f7079c.m16711a(this.f7078b);
        }
        this.f7079c.f18330d = Long.valueOf(this.f7080d.m5170b());
        try {
            this.f7077a.close();
        } catch (IOException e) {
            this.f7079c.m16719e(this.f7080d.m5170b());
            C2108h.m5793a(this.f7079c);
            throw e;
        }
    }

    public final void flush() {
        try {
            this.f7077a.flush();
        } catch (IOException e) {
            this.f7079c.m16719e(this.f7080d.m5170b());
            C2108h.m5793a(this.f7079c);
            throw e;
        }
    }

    public final void write(int i) {
        try {
            this.f7077a.write(i);
            this.f7078b++;
            this.f7079c.m16711a(this.f7078b);
        } catch (IOException e) {
            this.f7079c.m16719e(this.f7080d.m5170b());
            C2108h.m5793a(this.f7079c);
            throw e;
        }
    }

    public final void write(byte[] bArr) {
        try {
            this.f7077a.write(bArr);
            this.f7078b += (long) bArr.length;
            this.f7079c.m16711a(this.f7078b);
        } catch (IOException e) {
            this.f7079c.m16719e(this.f7080d.m5170b());
            C2108h.m5793a(this.f7079c);
            throw e;
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        try {
            this.f7077a.write(bArr, i, i2);
            this.f7078b += (long) i2;
            this.f7079c.m16711a(this.f7078b);
        } catch (IOException e) {
            this.f7079c.m16719e(this.f7080d.m5170b());
            C2108h.m5793a(this.f7079c);
            throw e;
        }
    }
}
