package p000a.p003b.p004a.p014i;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public abstract class C0061g {
    private transient Integer f261a;
    public byte[] f262h;

    C0061g() {
    }

    protected abstract void mo18a(DataOutputStream dataOutputStream);

    public final void m105c() {
        if (this.f262h == null) {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                mo18a(new DataOutputStream(byteArrayOutputStream));
                this.f262h = byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    public final int m106d() {
        m105c();
        return this.f262h.length;
    }

    public final byte[] m107e() {
        m105c();
        return (byte[]) this.f262h.clone();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0061g)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0061g c0061g = (C0061g) obj;
        c0061g.m105c();
        m105c();
        return Arrays.equals(this.f262h, c0061g.f262h);
    }

    public final int hashCode() {
        if (this.f261a == null) {
            m105c();
            this.f261a = Integer.valueOf(this.f262h.hashCode());
        }
        return this.f261a.intValue();
    }
}
