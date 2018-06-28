package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p138m.C1522e;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class C7107g extends ak<ByteBuffer> {
    public C7107g() {
        super(ByteBuffer.class);
    }

    public final /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (byteBuffer.hasArray()) {
            c5301g.writeBinary(byteBuffer.array(), 0, byteBuffer.limit());
            return;
        }
        byteBuffer = byteBuffer.asReadOnlyBuffer();
        if (byteBuffer.position() > 0) {
            byteBuffer.rewind();
        }
        InputStream c1522e = new C1522e(byteBuffer);
        c5301g.writeBinary(c1522e, byteBuffer.remaining());
        c1522e.close();
    }
}
