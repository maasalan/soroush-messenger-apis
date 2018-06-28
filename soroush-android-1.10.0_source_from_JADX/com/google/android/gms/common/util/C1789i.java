package com.google.android.gms.common.util;

import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public final class C1789i {
    private static final Pattern f5462a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    private static final Pattern f5463b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
    private static final Pattern f5464c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    private static String m4527a(String str, String str2) {
        if (str2 == null) {
            try {
                str2 = "ISO-8859-1";
            } catch (Throwable e) {
                throw new IllegalArgumentException(e);
            }
        }
        return URLDecoder.decode(str, str2);
    }

    public static Map<String, String> m4528a(URI uri, String str) {
        Map<String, String> emptyMap = Collections.emptyMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            emptyMap = new HashMap();
            Scanner scanner = new Scanner(rawQuery);
            scanner.useDelimiter("&");
            while (scanner.hasNext()) {
                String[] split = scanner.next().split("=");
                if (split.length != 0) {
                    if (split.length <= 2) {
                        String a = C1789i.m4527a(split[0], str);
                        Object obj = null;
                        if (split.length == 2) {
                            obj = C1789i.m4527a(split[1], str);
                        }
                        emptyMap.put(a, obj);
                    }
                }
                throw new IllegalArgumentException("bad parameter");
            }
        }
        return emptyMap;
    }
}
