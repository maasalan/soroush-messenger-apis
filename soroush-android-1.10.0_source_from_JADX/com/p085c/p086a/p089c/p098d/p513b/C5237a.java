package com.p085c.p086a.p089c.p098d.p513b;

import com.p085c.p086a.p089c.p090a.C1098c;
import com.p085c.p086a.p089c.p090a.C1098c.C1097a;
import java.nio.ByteBuffer;

public final class C5237a implements C1098c<ByteBuffer> {
    private final ByteBuffer f14566a;

    public static class C5236a implements C1097a<ByteBuffer> {
        public final /* synthetic */ C1098c mo1113a(Object obj) {
            return new C5237a((ByteBuffer) obj);
        }

        public final Class<ByteBuffer> mo1114a() {
            return ByteBuffer.class;
        }
    }

    public C5237a(ByteBuffer byteBuffer) {
        this.f14566a = byteBuffer;
    }

    public final /* synthetic */ Object mo1115a() {
        this.f14566a.position(0);
        return this.f14566a;
    }

    public final void mo1116b() {
    }
}
