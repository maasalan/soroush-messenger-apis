package org.p501b.p506b;

import java.io.IOException;

public final class C4617c extends IOException {
    private final String f12681a;

    public C4617c(String str, Exception exception) {
        StringBuilder stringBuilder = new StringBuilder("XmppStringprepException caused by '");
        stringBuilder.append(str);
        stringBuilder.append("': ");
        stringBuilder.append(exception);
        super(stringBuilder.toString());
        initCause(exception);
        this.f12681a = str;
    }

    public C4617c(String str, String str2) {
        super(str2);
        this.f12681a = str;
    }
}
