package com.p111d.p112a.p114b.p120g;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;
import org.jivesoftware.smack.tcp.XMPPTCPConnection.PacketWriter;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class C1369b extends OutputStream {
    public static final byte[] f4324a = new byte[0];
    public byte[] f4325b;
    public int f4326c;
    private final C1368a f4327d;
    private final LinkedList<byte[]> f4328e;
    private int f4329f;

    public C1369b() {
        this((byte) 0);
    }

    public C1369b(byte b) {
        this((int) PacketWriter.QUEUE_SIZE);
    }

    public C1369b(char c) {
        this(100);
    }

    private C1369b(int i) {
        this.f4328e = new LinkedList();
        this.f4327d = null;
        this.f4325b = new byte[i];
    }

    private void m3317e() {
        this.f4329f += this.f4325b.length;
        int max = Math.max(this.f4329f >> 1, IjkMediaCodecInfo.RANK_MAX);
        if (max > 262144) {
            max = 262144;
        }
        this.f4328e.add(this.f4325b);
        this.f4325b = new byte[max];
        this.f4326c = 0;
    }

    public final void m3318a() {
        this.f4329f = 0;
        this.f4326c = 0;
        if (!this.f4328e.isEmpty()) {
            this.f4328e.clear();
        }
    }

    public final void m3319a(int i) {
        if (this.f4326c >= this.f4325b.length) {
            m3317e();
        }
        byte[] bArr = this.f4325b;
        int i2 = this.f4326c;
        this.f4326c = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public final void m3320b(int i) {
        if (this.f4326c + 1 < this.f4325b.length) {
            byte[] bArr = this.f4325b;
            int i2 = this.f4326c;
            this.f4326c = i2 + 1;
            bArr[i2] = (byte) (i >> 8);
            bArr = this.f4325b;
            i2 = this.f4326c;
            this.f4326c = i2 + 1;
            bArr[i2] = (byte) i;
            return;
        }
        m3319a(i >> 8);
        m3319a(i);
    }

    public final byte[] m3321b() {
        int i = this.f4329f + this.f4326c;
        if (i == 0) {
            return f4324a;
        }
        Object obj = new byte[i];
        Iterator it = this.f4328e.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            byte[] bArr = (byte[]) it.next();
            int length = bArr.length;
            System.arraycopy(bArr, 0, obj, i2, length);
            i2 += length;
        }
        System.arraycopy(this.f4325b, 0, obj, i2, this.f4326c);
        i2 += this.f4326c;
        if (i2 != i) {
            StringBuilder stringBuilder = new StringBuilder("Internal error: total len assumed to be ");
            stringBuilder.append(i);
            stringBuilder.append(", copied ");
            stringBuilder.append(i2);
            stringBuilder.append(" bytes");
            throw new RuntimeException(stringBuilder.toString());
        }
        if (!this.f4328e.isEmpty()) {
            m3318a();
        }
        return obj;
    }

    public final void m3322c(int i) {
        if (this.f4326c + 2 < this.f4325b.length) {
            byte[] bArr = this.f4325b;
            int i2 = this.f4326c;
            this.f4326c = i2 + 1;
            bArr[i2] = (byte) (i >> 16);
            bArr = this.f4325b;
            i2 = this.f4326c;
            this.f4326c = i2 + 1;
            bArr[i2] = (byte) (i >> 8);
            bArr = this.f4325b;
            i2 = this.f4326c;
            this.f4326c = i2 + 1;
            bArr[i2] = (byte) i;
            return;
        }
        m3319a(i >> 16);
        m3319a(i >> 8);
        m3319a(i);
    }

    public final byte[] m3323c() {
        m3318a();
        return this.f4325b;
    }

    public final void close() {
    }

    public final byte[] m3324d() {
        m3317e();
        return this.f4325b;
    }

    public final byte[] m3325d(int i) {
        this.f4326c = i;
        return m3321b();
    }

    public final void flush() {
    }

    public final void write(int i) {
        m3319a(i);
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        while (true) {
            int min = Math.min(this.f4325b.length - this.f4326c, i2);
            if (min > 0) {
                System.arraycopy(bArr, i, this.f4325b, this.f4326c, min);
                i += min;
                this.f4326c += min;
                i2 -= min;
            }
            if (i2 > 0) {
                m3317e();
            } else {
                return;
            }
        }
    }
}
