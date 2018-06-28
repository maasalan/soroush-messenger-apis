package com.p111d.p112a.p121c.p124c.p126b;

import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.p138m.C1523f;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public final class C7055e extends aa<ByteBuffer> {
    protected C7055e() {
        super(ByteBuffer.class);
    }

    public final /* synthetic */ Object mo1304a(C5303j c5303j, C5347g c5347g) {
        return ByteBuffer.wrap(c5303j.getBinaryValue());
    }

    public final /* synthetic */ Object mo1309a(C5303j c5303j, C5347g c5347g, Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        OutputStream c1523f = new C1523f(byteBuffer);
        c5303j.readBinaryValue(c5347g.m11473l(), c1523f);
        c1523f.close();
        return byteBuffer;
    }
}
