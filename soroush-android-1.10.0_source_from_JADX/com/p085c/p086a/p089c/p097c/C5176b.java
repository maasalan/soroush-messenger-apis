package com.p085c.p086a.p089c.p097c;

import com.p085c.p086a.C1251g;
import com.p085c.p086a.p089c.C1102a;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p090a.C1096b;
import com.p085c.p086a.p089c.p090a.C1096b.C1095a;
import com.p085c.p086a.p089c.p097c.C1173m.C1172a;
import com.p085c.p086a.p108h.C5276b;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class C5176b<Data> implements C1173m<byte[], Data> {
    private final C1164b<Data> f14491a;

    public interface C1164b<Data> {
        Class<Data> mo1187a();

        Data mo1188a(byte[] bArr);
    }

    public static class C5172a implements C1174n<byte[], ByteBuffer> {

        class C51711 implements C1164b<ByteBuffer> {
            final /* synthetic */ C5172a f14487a;

            C51711(C5172a c5172a) {
                this.f14487a = c5172a;
            }

            public final Class<ByteBuffer> mo1187a() {
                return ByteBuffer.class;
            }

            public final /* synthetic */ Object mo1188a(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        public final C1173m<byte[], ByteBuffer> mo1184a(C1180q c1180q) {
            return new C5176b(new C51711(this));
        }
    }

    private static class C5173c<Data> implements C1096b<Data> {
        private final byte[] f14488a;
        private final C1164b<Data> f14489b;

        public C5173c(byte[] bArr, C1164b<Data> c1164b) {
            this.f14488a = bArr;
            this.f14489b = c1164b;
        }

        public final void mo1108a() {
        }

        public final void mo1109a(C1251g c1251g, C1095a<? super Data> c1095a) {
            c1095a.mo1141a(this.f14489b.mo1188a(this.f14488a));
        }

        public final void mo1110b() {
        }

        public final C1102a mo1111c() {
            return C1102a.LOCAL;
        }

        public final Class<Data> mo1112d() {
            return this.f14489b.mo1187a();
        }
    }

    public static class C5175d implements C1174n<byte[], InputStream> {

        class C51741 implements C1164b<InputStream> {
            final /* synthetic */ C5175d f14490a;

            C51741(C5175d c5175d) {
                this.f14490a = c5175d;
            }

            public final Class<InputStream> mo1187a() {
                return InputStream.class;
            }

            public final /* synthetic */ Object mo1188a(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        public final C1173m<byte[], InputStream> mo1184a(C1180q c1180q) {
            return new C5176b(new C51741(this));
        }
    }

    public C5176b(C1164b<Data> c1164b) {
        this.f14491a = c1164b;
    }

    public final /* synthetic */ C1172a mo1185a(Object obj, int i, int i2, C5253j c5253j) {
        return new C1172a(C5276b.m10937a(), new C5173c((byte[]) obj, this.f14491a));
    }

    public final /* bridge */ /* synthetic */ boolean mo1186a(Object obj) {
        return true;
    }
}
