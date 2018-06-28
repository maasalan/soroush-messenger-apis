package p000a.p003b.p004a.p007c;

import java.util.List;
import p000a.p003b.p004a.C0065j;
import p000a.p003b.p004a.C0076k;
import p000a.p003b.p004a.p014i.C0061g;

public final class C0030c extends RuntimeException {
    public C0030c(C0065j c0065j, String str) {
        StringBuilder stringBuilder = new StringBuilder("Validation of request to ");
        stringBuilder.append(c0065j);
        stringBuilder.append(" failed: ");
        stringBuilder.append(str);
        super(stringBuilder.toString());
    }

    public C0030c(C0076k<? extends C0061g> c0076k, String str) {
        StringBuilder stringBuilder = new StringBuilder("Validation of record ");
        stringBuilder.append(c0076k);
        stringBuilder.append(" failed: ");
        stringBuilder.append(str);
        super(stringBuilder.toString());
    }

    public C0030c(String str) {
        super(str);
    }

    public C0030c(String str, Throwable th) {
        super(str, th);
    }

    public C0030c(List<C0076k<? extends C0061g>> list, String str) {
        StringBuilder stringBuilder = new StringBuilder("Validation of ");
        stringBuilder.append(list.size());
        stringBuilder.append(" ");
        stringBuilder.append(((C0076k) list.get(0)).f341b);
        stringBuilder.append(" record");
        stringBuilder.append(list.size() > 1 ? "s" : "");
        stringBuilder.append(" failed: ");
        stringBuilder.append(str);
        super(stringBuilder.toString());
    }
}
