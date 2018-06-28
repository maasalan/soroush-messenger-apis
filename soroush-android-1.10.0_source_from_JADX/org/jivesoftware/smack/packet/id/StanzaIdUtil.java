package org.jivesoftware.smack.packet.id;

import java.util.concurrent.atomic.AtomicLong;
import org.jivesoftware.smack.util.StringUtils;

public class StanzaIdUtil {
    private static final AtomicLong ID = new AtomicLong();
    private static final String PREFIX;

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(StringUtils.randomString(5));
        stringBuilder.append("-");
        PREFIX = stringBuilder.toString();
    }

    public static String newStanzaId() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(PREFIX);
        stringBuilder.append(Long.toString(ID.incrementAndGet()));
        return stringBuilder.toString();
    }
}
