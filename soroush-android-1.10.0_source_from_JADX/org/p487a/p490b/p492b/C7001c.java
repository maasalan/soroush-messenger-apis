package org.p487a.p490b.p492b;

import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p488a.C4598d;
import org.p487a.p488a.C6295c;
import org.p487a.p488a.p489a.C4595d;

final class C7001c implements C6295c {
    Object f20006a;
    Object f20007b;
    Object[] f20008c;
    C7000a f20009d;

    static class C6296a implements C7000a {
        String f17227a;
        C4598d f17228b;
        C4595d f17229c;
        private int f17230d;

        public C6296a(int i, String str, C4598d c4598d, C4595d c4595d) {
            this.f17227a = str;
            this.f17228b = c4598d;
            this.f17229c = c4595d;
            this.f17230d = i;
        }

        public final String toString() {
            C4602h c4602h = C4602h.f12624k;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(C4602h.m8328a(this.f17227a));
            stringBuffer.append("(");
            stringBuffer.append(((C6298f) this.f17228b).m14734b(c4602h));
            stringBuffer.append(")");
            return stringBuffer.toString();
        }
    }

    public C7001c(C7000a c7000a, Object obj, Object obj2, Object[] objArr) {
        this.f20009d = c7000a;
        this.f20006a = obj;
        this.f20007b = obj2;
        this.f20008c = objArr;
    }

    public final Object mo3263a() {
        return this.f20007b;
    }

    public final String toString() {
        return this.f20009d.toString();
    }
}
