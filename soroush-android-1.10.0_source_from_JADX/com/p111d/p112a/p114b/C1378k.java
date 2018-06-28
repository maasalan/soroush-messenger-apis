package com.p111d.p112a.p114b;

import java.io.IOException;

public class C1378k extends IOException {
    protected C1375h f4372b;

    protected C1378k(String str) {
        super(str);
    }

    protected C1378k(String str, C1375h c1375h) {
        this(str, c1375h, null);
    }

    protected C1378k(String str, C1375h c1375h, Throwable th) {
        super(str);
        if (th != null) {
            initCause(th);
        }
        this.f4372b = c1375h;
    }

    protected C1378k(String str, Throwable th) {
        this(str, null, th);
    }

    public Object mo1282a() {
        return null;
    }

    public final C1375h m3353b() {
        return this.f4372b;
    }

    public String mo2815c() {
        return null;
    }

    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        C1375h c1375h = this.f4372b;
        String c = mo2815c();
        if (c1375h == null && c == null) {
            return message;
        }
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append(message);
        if (c != null) {
            stringBuilder.append(c);
        }
        if (c1375h != null) {
            stringBuilder.append('\n');
            stringBuilder.append(" at ");
            stringBuilder.append(c1375h.toString());
        }
        return stringBuilder.toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName());
        stringBuilder.append(": ");
        stringBuilder.append(getMessage());
        return stringBuilder.toString();
    }
}
