package org.jivesoftware.smack.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpAddressUtil {
    private static final Pattern IPV4_PATTERN = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");

    public static boolean isIPv4LiteralAddress(String str) {
        Matcher matcher = IPV4_PATTERN.matcher(str);
        if (!matcher.matches()) {
            return false;
        }
        int i = 0;
        while (i < 3) {
            try {
                if (Integer.valueOf(matcher.group(i)).intValue() > 255) {
                    return false;
                }
                i++;
            } catch (NumberFormatException e) {
                throw new AssertionError(e);
            }
        }
        return true;
    }

    public static boolean isIPv6LiteralAddress(String str) {
        return str.split(":").length == 8;
    }

    public static boolean isIpAddress(String str) {
        if (!isIPv4LiteralAddress(str)) {
            if (!isIPv6LiteralAddress(str)) {
                return false;
            }
        }
        return true;
    }
}
