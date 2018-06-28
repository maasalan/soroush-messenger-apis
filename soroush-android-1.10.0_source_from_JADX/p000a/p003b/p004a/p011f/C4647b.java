package p000a.p003b.p004a.p011f;

import p000a.p003b.p004a.C0041d.C6319c;
import p000a.p003b.p004a.C0063i;
import p000a.p003b.p004a.C0065j;

public final class C4647b extends C0063i {
    public final C0065j f12770a;
    public final C6319c f12771b;

    public C4647b(C0065j c0065j, C6319c c6319c) {
        StringBuilder stringBuilder = new StringBuilder("Asking for ");
        stringBuilder.append(c0065j);
        stringBuilder.append(" yielded an error response ");
        stringBuilder.append(c6319c);
        super(stringBuilder.toString());
        this.f12770a = c0065j;
        this.f12771b = c6319c;
    }
}
