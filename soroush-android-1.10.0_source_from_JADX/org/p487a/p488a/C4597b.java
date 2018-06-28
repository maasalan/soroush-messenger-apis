package org.p487a.p488a;

public final class C4597b extends RuntimeException {
    Throwable f12615a;

    public C4597b(String str, Throwable th) {
        if (th != null) {
            StringBuffer stringBuffer = new StringBuffer("Exception while initializing ");
            stringBuffer.append(str);
            stringBuffer.append(": ");
            stringBuffer.append(th);
            str = stringBuffer.toString();
        }
        super(str);
        this.f12615a = th;
    }

    public final Throwable getCause() {
        return this.f12615a;
    }
}
