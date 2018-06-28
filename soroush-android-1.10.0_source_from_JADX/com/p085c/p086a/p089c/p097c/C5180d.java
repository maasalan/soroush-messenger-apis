package com.p085c.p086a.p089c.p097c;

import android.util.Log;
import com.p085c.p086a.C1251g;
import com.p085c.p086a.p089c.C1102a;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p090a.C1096b;
import com.p085c.p086a.p089c.p090a.C1096b.C1095a;
import com.p085c.p086a.p089c.p097c.C1173m.C1172a;
import com.p085c.p086a.p108h.C5277c;
import com.p085c.p086a.p109i.C1264a;
import java.io.File;
import java.nio.ByteBuffer;

public final class C5180d implements C1173m<File, ByteBuffer> {

    private static class C5178a implements C1096b<ByteBuffer> {
        private final File f14492a;

        public C5178a(File file) {
            this.f14492a = file;
        }

        public final void mo1108a() {
        }

        public final void mo1109a(C1251g c1251g, C1095a<? super ByteBuffer> c1095a) {
            try {
                c1095a.mo1141a(C1264a.m2989a(this.f14492a));
            } catch (Exception e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                c1095a.mo1140a(e);
            }
        }

        public final void mo1110b() {
        }

        public final C1102a mo1111c() {
            return C1102a.LOCAL;
        }

        public final Class<ByteBuffer> mo1112d() {
            return ByteBuffer.class;
        }
    }

    public static class C5179b implements C1174n<File, ByteBuffer> {
        public final C1173m<File, ByteBuffer> mo1184a(C1180q c1180q) {
            return new C5180d();
        }
    }

    public final /* synthetic */ C1172a mo1185a(Object obj, int i, int i2, C5253j c5253j) {
        File file = (File) obj;
        return new C1172a(new C5277c(file), new C5178a(file));
    }

    public final /* bridge */ /* synthetic */ boolean mo1186a(Object obj) {
        return true;
    }
}
