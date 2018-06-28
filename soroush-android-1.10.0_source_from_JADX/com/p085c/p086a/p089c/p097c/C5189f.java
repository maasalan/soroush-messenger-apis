package com.p085c.p086a.p089c.p097c;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.p085c.p086a.C1251g;
import com.p085c.p086a.p089c.C1102a;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p090a.C1096b;
import com.p085c.p086a.p089c.p090a.C1096b.C1095a;
import com.p085c.p086a.p089c.p097c.C1173m.C1172a;
import com.p085c.p086a.p108h.C5277c;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public final class C5189f<Data> implements C1173m<File, Data> {
    private final C1166d<Data> f14503a;

    public interface C1166d<Data> {
        Class<Data> mo1193a();

        Data mo1194a(File file);

        void mo1195a(Data data);
    }

    public static class C5185a<Data> implements C1174n<File, Data> {
        private final C1166d<Data> f14499a;

        public C5185a(C1166d<Data> c1166d) {
            this.f14499a = c1166d;
        }

        public final C1173m<File, Data> mo1184a(C1180q c1180q) {
            return new C5189f(this.f14499a);
        }
    }

    private static class C5187c<Data> implements C1096b<Data> {
        private final File f14500a;
        private final C1166d<Data> f14501b;
        private Data f14502c;

        public C5187c(File file, C1166d<Data> c1166d) {
            this.f14500a = file;
            this.f14501b = c1166d;
        }

        public final void mo1108a() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r2 = this;
            r0 = r2.f14502c;
            if (r0 == 0) goto L_0x000b;
        L_0x0004:
            r0 = r2.f14501b;	 Catch:{ IOException -> 0x000b }
            r1 = r2.f14502c;	 Catch:{ IOException -> 0x000b }
            r0.mo1195a(r1);	 Catch:{ IOException -> 0x000b }
        L_0x000b:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.c.a.c.c.f.c.a():void");
        }

        public final void mo1109a(C1251g c1251g, C1095a<? super Data> c1095a) {
            try {
                this.f14502c = this.f14501b.mo1194a(this.f14500a);
                c1095a.mo1141a(this.f14502c);
            } catch (Exception e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
                c1095a.mo1140a(e);
            }
        }

        public final void mo1110b() {
        }

        public final C1102a mo1111c() {
            return C1102a.LOCAL;
        }

        public final Class<Data> mo1112d() {
            return this.f14501b.mo1193a();
        }
    }

    public static class C6447b extends C5185a<ParcelFileDescriptor> {

        class C51861 implements C1166d<ParcelFileDescriptor> {
            C51861() {
            }

            public final Class<ParcelFileDescriptor> mo1193a() {
                return ParcelFileDescriptor.class;
            }

            public final /* synthetic */ Object mo1194a(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            public final /* synthetic */ void mo1195a(Object obj) {
                ((ParcelFileDescriptor) obj).close();
            }
        }

        public C6447b() {
            super(new C51861());
        }
    }

    public static class C6448e extends C5185a<InputStream> {

        class C51881 implements C1166d<InputStream> {
            C51881() {
            }

            public final Class<InputStream> mo1193a() {
                return InputStream.class;
            }

            public final /* synthetic */ Object mo1194a(File file) {
                return new FileInputStream(file);
            }

            public final /* synthetic */ void mo1195a(Object obj) {
                ((InputStream) obj).close();
            }
        }

        public C6448e() {
            super(new C51881());
        }
    }

    public C5189f(C1166d<Data> c1166d) {
        this.f14503a = c1166d;
    }

    public final /* synthetic */ C1172a mo1185a(Object obj, int i, int i2, C5253j c5253j) {
        File file = (File) obj;
        return new C1172a(new C5277c(file), new C5187c(file, this.f14503a));
    }

    public final /* bridge */ /* synthetic */ boolean mo1186a(Object obj) {
        return true;
    }
}
