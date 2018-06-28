package com.p085c.p086a.p089c.p092b;

import android.support.v4.p038g.C0480k.C0479a;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p090a.C1098c;
import com.p085c.p086a.p089c.p092b.C1143g.C1142a;
import com.p085c.p086a.p109i.C1271h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class C1158q<Data, ResourceType, Transcode> {
    private final Class<Data> f3714a;
    private final C0479a<List<Exception>> f3715b;
    private final List<? extends C1143g<Data, ResourceType, Transcode>> f3716c;
    private final String f3717d;

    public C1158q(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C1143g<Data, ResourceType, Transcode>> list, C0479a<List<Exception>> c0479a) {
        this.f3714a = cls;
        this.f3715b = c0479a;
        this.f3716c = (List) C1271h.m3014a((Collection) list);
        StringBuilder stringBuilder = new StringBuilder("Failed LoadPath{");
        stringBuilder.append(cls.getSimpleName());
        stringBuilder.append("->");
        stringBuilder.append(cls2.getSimpleName());
        stringBuilder.append("->");
        stringBuilder.append(cls3.getSimpleName());
        stringBuilder.append("}");
        this.f3717d = stringBuilder.toString();
    }

    private C1159s<Transcode> m2771a(C1098c<Data> c1098c, C5253j c5253j, int i, int i2, C1142a<ResourceType> c1142a, List<Exception> list) {
        int size = this.f3716c.size();
        C1159s<Transcode> c1159s = null;
        for (int i3 = 0; i3 < size; i3++) {
            C1143g c1143g = (C1143g) this.f3716c.get(i3);
            try {
                c1159s = c1143g.f3684a.mo1222a(c1142a.mo1163a(c1143g.m2756a(c1098c, i, i2, c5253j)));
            } catch (C1156o e) {
                list.add(e);
            }
            if (c1159s != null) {
                break;
            }
        }
        if (c1159s != null) {
            return c1159s;
        }
        throw new C1156o(this.f3717d, new ArrayList(list));
    }

    public final C1159s<Transcode> m2772a(C1098c<Data> c1098c, C5253j c5253j, int i, int i2, C1142a<ResourceType> c1142a) {
        List list = (List) this.f3715b.mo308a();
        try {
            C1159s<Transcode> a = m2771a(c1098c, c5253j, i, i2, c1142a, list);
            return a;
        } finally {
            this.f3715b.mo309a(list);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LoadPath{decodePaths=");
        stringBuilder.append(Arrays.toString(this.f3716c.toArray(new C1143g[this.f3716c.size()])));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
