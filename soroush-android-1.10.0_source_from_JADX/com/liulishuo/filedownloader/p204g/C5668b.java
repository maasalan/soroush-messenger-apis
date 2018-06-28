package com.liulishuo.filedownloader.p204g;

import com.liulishuo.filedownloader.p205h.C2181c.C2180e;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;

public final class C5668b implements C2171a {
    private final BufferedOutputStream f15587a = new BufferedOutputStream(new FileOutputStream(this.f15589c.getFD()));
    private final FileDescriptor f15588b = this.f15589c.getFD();
    private final RandomAccessFile f15589c;

    public static class C5667a implements C2180e {
        public final C2171a mo1936a(File file) {
            return new C5668b(file);
        }
    }

    C5668b(File file) {
        this.f15589c = new RandomAccessFile(file, "rw");
    }

    public final void mo1937a() {
        this.f15587a.flush();
        this.f15588b.sync();
    }

    public final void mo1938a(long j) {
        this.f15589c.seek(j);
    }

    public final void mo1939a(byte[] bArr, int i) {
        this.f15587a.write(bArr, 0, i);
    }

    public final void mo1940b() {
        this.f15587a.close();
        this.f15589c.close();
    }

    public final void mo1941b(long j) {
        this.f15589c.setLength(j);
    }
}
