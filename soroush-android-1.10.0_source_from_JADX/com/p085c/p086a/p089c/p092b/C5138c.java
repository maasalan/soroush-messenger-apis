package com.p085c.p086a.p089c.p092b;

import com.p085c.p086a.p089c.C1203d;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p092b.p094b.C1115a.C1114b;
import java.io.File;

final class C5138c<DataType> implements C1114b {
    private final C1203d<DataType> f14357a;
    private final DataType f14358b;
    private final C5253j f14359c;

    C5138c(C1203d<DataType> c1203d, DataType dataType, C5253j c5253j) {
        this.f14357a = c1203d;
        this.f14358b = dataType;
        this.f14359c = c5253j;
    }

    public final boolean mo1162a(File file) {
        return this.f14357a.mo1189a(this.f14358b, file, this.f14359c);
    }
}
