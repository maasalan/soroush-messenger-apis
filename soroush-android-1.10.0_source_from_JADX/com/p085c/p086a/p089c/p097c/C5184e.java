package com.p085c.p086a.p089c.p097c;

import android.util.Base64;
import com.p085c.p086a.C1251g;
import com.p085c.p086a.p089c.C1102a;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p090a.C1096b;
import com.p085c.p086a.p089c.p090a.C1096b.C1095a;
import com.p085c.p086a.p089c.p097c.C1173m.C1172a;
import com.p085c.p086a.p108h.C5277c;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public final class C5184e<Data> implements C1173m<String, Data> {
    private final C1165a<Data> f14498a;

    public interface C1165a<Data> {
        Class<Data> mo1190a();

        Data mo1191a(String str);

        void mo1192a(Data data);
    }

    private static final class C5181b<Data> implements C1096b<Data> {
        private final String f14493a;
        private final C1165a<Data> f14494b;
        private Data f14495c;

        public C5181b(String str, C1165a<Data> c1165a) {
            this.f14493a = str;
            this.f14494b = c1165a;
        }

        public final void mo1108a() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r2 = this;
            r0 = r2.f14494b;	 Catch:{ IOException -> 0x0007 }
            r1 = r2.f14495c;	 Catch:{ IOException -> 0x0007 }
            r0.mo1192a(r1);	 Catch:{ IOException -> 0x0007 }
        L_0x0007:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.c.a.c.c.e.b.a():void");
        }

        public final void mo1109a(C1251g c1251g, C1095a<? super Data> c1095a) {
            try {
                this.f14495c = this.f14494b.mo1191a(this.f14493a);
                c1095a.mo1141a(this.f14495c);
            } catch (Exception e) {
                c1095a.mo1140a(e);
            }
        }

        public final void mo1110b() {
        }

        public final C1102a mo1111c() {
            return C1102a.LOCAL;
        }

        public final Class<Data> mo1112d() {
            return this.f14494b.mo1190a();
        }
    }

    public static final class C5183c implements C1174n<String, InputStream> {
        private final C1165a<InputStream> f14497a = new C51821(this);

        class C51821 implements C1165a<InputStream> {
            final /* synthetic */ C5183c f14496a;

            C51821(C5183c c5183c) {
                this.f14496a = c5183c;
            }

            public final Class<InputStream> mo1190a() {
                return InputStream.class;
            }

            public final /* synthetic */ Object mo1191a(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                }
                throw new IllegalArgumentException("Not a valid image data URL.");
            }

            public final /* synthetic */ void mo1192a(Object obj) {
                ((InputStream) obj).close();
            }
        }

        public final C1173m<String, InputStream> mo1184a(C1180q c1180q) {
            return new C5184e(this.f14497a);
        }
    }

    public C5184e(C1165a<Data> c1165a) {
        this.f14498a = c1165a;
    }

    public final /* synthetic */ C1172a mo1185a(Object obj, int i, int i2, C5253j c5253j) {
        String str = (String) obj;
        return new C1172a(new C5277c(str), new C5181b(str, this.f14498a));
    }

    public final /* synthetic */ boolean mo1186a(Object obj) {
        return ((String) obj).startsWith("data:image");
    }
}
