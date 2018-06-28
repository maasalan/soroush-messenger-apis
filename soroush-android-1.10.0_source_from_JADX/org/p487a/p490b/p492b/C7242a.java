package org.p487a.p490b.p492b;

import org.p487a.p488a.p489a.C7000a;

abstract class C7242a extends C7002d implements C7000a {
    Class[] f20923a;
    String[] f20924b;
    Class[] f20925c;

    C7242a(int i, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2) {
        super(i, str, cls);
        this.f20923a = clsArr;
        this.f20924b = strArr;
        this.f20925c = clsArr2;
    }

    public final Class[] mo3469a() {
        if (this.f20923a == null) {
            this.f20923a = m14736c(3);
        }
        return this.f20923a;
    }

    public final Class[] m19137b() {
        if (this.f20925c == null) {
            this.f20925c = m14736c(5);
        }
        return this.f20925c;
    }
}
