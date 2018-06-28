package org.json.p613a.p614a;

public final class C7813e {
    public int f24870a = 0;
    public Object f24871b = null;

    public C7813e(int i, Object obj) {
        this.f24870a = i;
        this.f24871b = obj;
    }

    public final String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        switch (this.f24870a) {
            case -1:
                str = "END OF FILE";
                break;
            case 0:
                stringBuffer.append("VALUE(");
                stringBuffer.append(this.f24871b);
                str = ")";
                break;
            case 1:
                str = "LEFT BRACE({)";
                break;
            case 2:
                str = "RIGHT BRACE(})";
                break;
            case 3:
                str = "LEFT SQUARE([)";
                break;
            case 4:
                str = "RIGHT SQUARE(])";
                break;
            case 5:
                str = "COMMA(,)";
                break;
            case 6:
                str = "COLON(:)";
                break;
            default:
                break;
        }
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
