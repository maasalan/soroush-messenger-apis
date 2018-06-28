package org.json.p613a;

import java.util.List;
import java.util.Map;

public final class C7815d {
    public static String m22090a(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof String) {
            StringBuffer stringBuffer = new StringBuffer("\"");
            String str = (String) obj;
            if (str == null) {
                str = null;
            } else {
                StringBuffer stringBuffer2 = new StringBuffer();
                C7815d.m22091a(str, stringBuffer2);
                str = stringBuffer2.toString();
            }
            stringBuffer.append(str);
            stringBuffer.append("\"");
            return stringBuffer.toString();
        } else if (obj instanceof Double) {
            Double d = (Double) obj;
            if (!d.isInfinite()) {
                if (!d.isNaN()) {
                    return obj.toString();
                }
            }
            return "null";
        } else if (!(obj instanceof Float)) {
            return obj instanceof Number ? obj.toString() : obj instanceof Boolean ? obj.toString() : obj instanceof C7814b ? ((C7814b) obj).mo3933a() : obj instanceof Map ? C7970c.m22182a((Map) obj) : obj instanceof List ? C7969a.m22180a((List) obj) : obj.toString();
        } else {
            Float f = (Float) obj;
            if (!f.isInfinite()) {
                if (!f.isNaN()) {
                    return obj.toString();
                }
            }
            return "null";
        }
    }

    static void m22091a(String str, StringBuffer stringBuffer) {
        for (int i = 0; i < str.length(); i++) {
            String str2;
            char charAt = str.charAt(i);
            if (charAt == '\"') {
                str2 = "\\\"";
            } else if (charAt == '/') {
                str2 = "\\/";
            } else if (charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        str2 = "\\b";
                        break;
                    case '\t':
                        str2 = "\\t";
                        break;
                    case '\n':
                        str2 = "\\n";
                        break;
                    default:
                        switch (charAt) {
                            case '\f':
                                str2 = "\\f";
                                break;
                            case '\r':
                                str2 = "\\r";
                                break;
                            default:
                                if ((charAt >= '\u0000' && charAt <= '\u001f') || ((charAt >= '' && charAt <= '') || (charAt >= ' ' && charAt <= '⃿'))) {
                                    str2 = Integer.toHexString(charAt);
                                    stringBuffer.append("\\u");
                                    for (int i2 = 0; i2 < 4 - str2.length(); i2++) {
                                        stringBuffer.append('0');
                                    }
                                    str2 = str2.toUpperCase();
                                    break;
                                }
                                stringBuffer.append(charAt);
                                continue;
                                continue;
                                break;
                        }
                }
            } else {
                str2 = "\\\\";
            }
            stringBuffer.append(str2);
        }
    }
}
