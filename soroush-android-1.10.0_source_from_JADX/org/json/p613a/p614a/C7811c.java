package org.json.p613a.p614a;

import org.msgpack.util.TemplatePrecompiler;

public final class C7811c extends Exception {
    private int f24846a;
    private Object f24847b;
    private int f24848c;

    public C7811c(int i, int i2, Object obj) {
        this.f24848c = i;
        this.f24846a = i2;
        this.f24847b = obj;
    }

    public final String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        switch (this.f24846a) {
            case 0:
                stringBuffer.append("Unexpected character (");
                stringBuffer.append(this.f24847b);
                str = ") at position ";
                break;
            case 1:
                stringBuffer.append("Unexpected token ");
                stringBuffer.append(this.f24847b);
                str = " at position ";
                break;
            case 2:
                stringBuffer.append("Unexpected exception at position ");
                stringBuffer.append(this.f24848c);
                stringBuffer.append(": ");
                stringBuffer.append(this.f24847b);
                break;
            default:
                str = "Unkown error at position ";
                break;
        }
        stringBuffer.append(str);
        stringBuffer.append(this.f24848c);
        stringBuffer.append(TemplatePrecompiler.DEFAULT_DEST);
        return stringBuffer.toString();
    }
}
