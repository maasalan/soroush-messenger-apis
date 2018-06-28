package com.p085c.p086a.p089c.p092b;

import android.support.v4.p038g.C0480k.C0479a;
import android.util.Log;
import com.p085c.p086a.p089c.C1211k;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p090a.C1098c;
import com.p085c.p086a.p089c.p098d.p101f.C1200d;
import java.util.ArrayList;
import java.util.List;

public final class C1143g<DataType, ResourceType, Transcode> {
    final C1200d<ResourceType, Transcode> f3684a;
    private final Class<DataType> f3685b;
    private final List<? extends C1211k<DataType, ResourceType>> f3686c;
    private final C0479a<List<Exception>> f3687d;
    private final String f3688e;

    interface C1142a<ResourceType> {
        C1159s<ResourceType> mo1163a(C1159s<ResourceType> c1159s);
    }

    public C1143g(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends C1211k<DataType, ResourceType>> list, C1200d<ResourceType, Transcode> c1200d, C0479a<List<Exception>> c0479a) {
        this.f3685b = cls;
        this.f3686c = list;
        this.f3684a = c1200d;
        this.f3687d = c0479a;
        StringBuilder stringBuilder = new StringBuilder("Failed DecodePath{");
        stringBuilder.append(cls.getSimpleName());
        stringBuilder.append("->");
        stringBuilder.append(cls2.getSimpleName());
        stringBuilder.append("->");
        stringBuilder.append(cls3.getSimpleName());
        stringBuilder.append("}");
        this.f3688e = stringBuilder.toString();
    }

    private C1159s<ResourceType> m2755a(C1098c<DataType> c1098c, int i, int i2, C5253j c5253j, List<Exception> list) {
        int size = this.f3686c.size();
        C1159s<ResourceType> c1159s = null;
        for (int i3 = 0; i3 < size; i3++) {
            C1211k c1211k = (C1211k) this.f3686c.get(i3);
            try {
                if (c1211k.mo1200a(c1098c.mo1115a(), c5253j)) {
                    c1159s = c1211k.mo1199a(c1098c.mo1115a(), i, i2, c5253j);
                }
            } catch (Throwable e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    StringBuilder stringBuilder = new StringBuilder("Failed to decode data for ");
                    stringBuilder.append(c1211k);
                    Log.v("DecodePath", stringBuilder.toString(), e);
                }
                list.add(e);
            }
            if (c1159s != null) {
                break;
            }
        }
        if (c1159s != null) {
            return c1159s;
        }
        throw new C1156o(this.f3688e, new ArrayList(list));
    }

    final C1159s<ResourceType> m2756a(C1098c<DataType> c1098c, int i, int i2, C5253j c5253j) {
        List list = (List) this.f3687d.mo308a();
        try {
            C1159s<ResourceType> a = m2755a(c1098c, i, i2, c5253j, list);
            return a;
        } finally {
            this.f3687d.mo309a(list);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DecodePath{ dataClass=");
        stringBuilder.append(this.f3685b);
        stringBuilder.append(", decoders=");
        stringBuilder.append(this.f3686c);
        stringBuilder.append(", transcoder=");
        stringBuilder.append(this.f3684a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
