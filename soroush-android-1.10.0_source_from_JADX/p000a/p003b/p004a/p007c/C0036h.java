package p000a.p003b.p004a.p007c;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.msgpack.util.TemplatePrecompiler;
import p000a.p003b.p004a.C0044e;
import p000a.p003b.p004a.C0065j;
import p000a.p003b.p004a.C0076k;
import p000a.p003b.p004a.C0076k.C0070b;
import p000a.p003b.p004a.p007c.C0034g.C4632a;
import p000a.p003b.p004a.p007c.C0034g.C4633b;
import p000a.p003b.p004a.p007c.C0034g.C4635d;
import p000a.p003b.p004a.p007c.p008a.C0029a;
import p000a.p003b.p004a.p014i.C0061g;
import p000a.p003b.p004a.p014i.C4656e;
import p000a.p003b.p004a.p014i.C4657f;
import p000a.p003b.p004a.p014i.C4661l;
import p000a.p003b.p004a.p014i.C4665q;
import p000a.p003b.p004a.p016k.C0069a;

final class C0036h {
    C0029a f104a = C0029a.f98a;

    C0036h() {
    }

    static boolean m44a(C0044e c0044e, C0044e c0044e2, C0044e c0044e3) {
        int c = c0044e2.m83c();
        int c2 = c0044e3.m83c();
        int c3 = c0044e.m83c();
        return (c3 <= c || c0044e.m82b(c0044e2) || c0044e.m78a(c).m77a(c0044e2) >= 0) ? (c3 > c || c0044e.m77a(c0044e2.m78a(c3)) >= 0) ? (c3 <= c2 || c0044e.m82b(c0044e3) || c0044e.m78a(c2).m77a(c0044e3) <= 0) ? c3 > c2 || c0044e.m77a(c0044e3.m78a(c3)) < 0 : false : false : false;
    }

    static byte[] m45a(C4665q c4665q, List<C0076k<? extends C0061g>> list) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            c4665q.m8505b(dataOutputStream);
            C0044e c0044e = ((C0076k) list.get(0)).f340a;
            if (!c0044e.m84d()) {
                if (c0044e.m83c() < c4665q.f12831d) {
                    throw new C0030c("Invalid RRsig record");
                } else if (c0044e.m83c() > c4665q.f12831d) {
                    StringBuilder stringBuilder = new StringBuilder("*.");
                    stringBuilder.append(c0044e.m78a(c4665q.f12831d));
                    c0044e = C0044e.m73a(stringBuilder.toString());
                }
            }
            C0044e c0044e2 = c0044e;
            List<byte[]> arrayList = new ArrayList();
            for (C0076k c0076k : list) {
                arrayList.add(new C0076k(c0044e2, c0076k.f341b, c0076k.f343d, c4665q.f12832e, c0076k.f345f).m129a());
            }
            final int b = c0044e2.m81b() + 10;
            Collections.sort(arrayList, new Comparator<byte[]>() {
                public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                    int i;
                    int i2;
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = (byte[]) obj2;
                    int i3 = b;
                    while (i3 < bArr.length && i3 < bArr2.length) {
                        if (bArr[i3] != bArr2[i3]) {
                            i = bArr[i3] & 255;
                            i2 = bArr2[i3] & 255;
                            break;
                        }
                        i3++;
                    }
                    i = bArr.length;
                    i2 = bArr2.length;
                    return i - i2;
                }
            });
            for (byte[] write : arrayList) {
                dataOutputStream.write(write);
            }
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final C0034g m46a(C0044e c0044e, C0076k<? extends C0061g> c0076k, C0065j c0065j) {
        C4661l c4661l = (C4661l) c0076k.f345f;
        C0032e c0032e = (C0032e) this.f104a.f101d.get(c4661l.f12809a);
        if (c0032e == null) {
            return new C4633b(c4661l.f12810b, "NSEC3", c0076k);
        }
        Object obj = c4661l.f12813e;
        Object a = c0065j.f271a.m80a();
        int i = c4661l.f12812d;
        while (true) {
            int i2 = i - 1;
            int i3 = 0;
            if (i < 0) {
                break;
            }
            Object obj2 = new byte[(a.length + obj.length)];
            System.arraycopy(a, 0, obj2, 0, a.length);
            System.arraycopy(obj, 0, obj2, a.length, obj.length);
            a = c0032e.mo3a(obj2);
            i = i2;
        }
        String a2 = C0069a.m116a(a);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a2);
        stringBuilder.append(TemplatePrecompiler.DEFAULT_DEST);
        stringBuilder.append(c0044e);
        if (c0076k.f340a.equals(C0044e.m73a(stringBuilder.toString()))) {
            C0070b[] c0070bArr = c4661l.f12815g;
            int length = c0070bArr.length;
            while (i3 < length) {
                if (c0070bArr[i3].equals(c0065j.f272b)) {
                    return new C4635d(c0065j, c0076k);
                }
                i3++;
            }
            return null;
        }
        c0044e = c0076k.f340a;
        if (c0044e.f186f == null) {
            String[] split = c0044e.f184d.split("[.。．｡]", 2);
            c0044e.f186f = split[0];
            c0044e.f185e = split.length > 1 ? split[1] : "";
        }
        return C0036h.m44a(C0044e.m73a(a2), C0044e.m73a(c0044e.f186f), C0044e.m73a(C0069a.m116a(c4661l.f12814f))) ? null : new C4635d(c0065j, c0076k);
    }

    public final C0034g m47a(C0076k<C4656e> c0076k, C4657f c4657f) {
        C4656e c4656e = (C4656e) c0076k.f345f;
        C0029a c0029a = this.f104a;
        C0032e c0032e = (C0032e) c0029a.f99b.get(c4657f.f12797d);
        if (c0032e == null) {
            return new C4633b(c4657f.f12798e, "DS", c0076k);
        }
        Object e = c4656e.m107e();
        Object a = c0076k.f340a.m80a();
        Object obj = new byte[(a.length + e.length)];
        System.arraycopy(a, 0, obj, 0, a.length);
        System.arraycopy(e, 0, obj, a.length, e.length);
        try {
            if (c4657f.m8486a(c0032e.mo3a(obj))) {
                return null;
            }
            throw new C0030c((C0076k) c0076k, "SEP is not properly signed by parent DS!");
        } catch (Exception e2) {
            return new C4632a(c4657f.f12797d, "DS", c0076k, e2);
        }
    }
}
