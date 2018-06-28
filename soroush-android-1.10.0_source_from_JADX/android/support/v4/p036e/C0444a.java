package android.support.v4.p036e;

import android.support.v4.p038g.C0481l;
import android.util.Base64;
import java.util.List;

public final class C0444a {
    final String f1548a;
    final String f1549b;
    final String f1550c;
    final List<List<byte[]>> f1551d;
    final int f1552e = 0;
    final String f1553f;

    public C0444a(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f1548a = (String) C0481l.m1009a(str);
        this.f1549b = (String) C0481l.m1009a(str2);
        this.f1550c = (String) C0481l.m1009a(str3);
        this.f1551d = (List) C0481l.m1009a(list);
        StringBuilder stringBuilder = new StringBuilder(this.f1548a);
        stringBuilder.append("-");
        stringBuilder.append(this.f1549b);
        stringBuilder.append("-");
        stringBuilder.append(this.f1550c);
        this.f1553f = stringBuilder.toString();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder("FontRequest {mProviderAuthority: ");
        stringBuilder2.append(this.f1548a);
        stringBuilder2.append(", mProviderPackage: ");
        stringBuilder2.append(this.f1549b);
        stringBuilder2.append(", mQuery: ");
        stringBuilder2.append(this.f1550c);
        stringBuilder2.append(", mCertificates:");
        stringBuilder.append(stringBuilder2.toString());
        for (int i = 0; i < this.f1551d.size(); i++) {
            stringBuilder.append(" [");
            List list = (List) this.f1551d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                stringBuilder.append(" \"");
                stringBuilder.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                stringBuilder.append("\"");
            }
            stringBuilder.append(" ]");
        }
        stringBuilder.append("}");
        stringBuilder2 = new StringBuilder("mCertificatesArray: ");
        stringBuilder2.append(this.f1552e);
        stringBuilder.append(stringBuilder2.toString());
        return stringBuilder.toString();
    }
}
