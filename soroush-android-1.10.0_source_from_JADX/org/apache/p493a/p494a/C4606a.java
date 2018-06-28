package org.apache.p493a.p494a;

import java.net.DatagramSocket;
import java.nio.charset.Charset;

public abstract class C4606a {
    private static final C4608b f12643e = new C6301c();
    protected int f12644a = 0;
    protected DatagramSocket f12645b = null;
    protected boolean f12646c = false;
    protected C4608b f12647d = f12643e;
    private Charset f12648f = Charset.defaultCharset();

    public final void m8342a() {
        this.f12645b = this.f12647d.mo2450a();
        this.f12645b.setSoTimeout(this.f12644a);
        this.f12646c = true;
    }

    public final boolean m8343b() {
        return this.f12646c;
    }
}
