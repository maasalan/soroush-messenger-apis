package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class C1791k {
    private static final Pattern f5465a = Pattern.compile("\\\\.");
    private static final Pattern f5466b = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    public static String m4530a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = f5466b.matcher(str);
            StringBuffer stringBuffer = null;
            while (matcher.find()) {
                String str2;
                if (stringBuffer == null) {
                    stringBuffer = new StringBuffer();
                }
                char charAt = matcher.group().charAt(0);
                if (charAt == '\"') {
                    str2 = "\\\\\\\"";
                } else if (charAt == '/') {
                    str2 = "\\\\/";
                } else if (charAt != '\\') {
                    switch (charAt) {
                        case '\b':
                            str2 = "\\\\b";
                            break;
                        case '\t':
                            str2 = "\\\\t";
                            break;
                        case '\n':
                            str2 = "\\\\n";
                            break;
                        default:
                            switch (charAt) {
                                case '\f':
                                    str2 = "\\\\f";
                                    break;
                                case '\r':
                                    str2 = "\\\\r";
                                    break;
                                default:
                                    continue;
                                    continue;
                            }
                    }
                } else {
                    str2 = "\\\\\\\\";
                }
                matcher.appendReplacement(stringBuffer, str2);
            }
            if (stringBuffer == null) {
                return str;
            }
            matcher.appendTail(stringBuffer);
            str = stringBuffer.toString();
        }
        return str;
    }
}
