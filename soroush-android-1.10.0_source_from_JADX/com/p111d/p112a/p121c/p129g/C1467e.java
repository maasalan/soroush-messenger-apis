package com.p111d.p112a.p121c.p129g;

import com.p111d.p112a.p113a.ad;
import org.jivesoftware.smackx.time.packet.Time;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement.RegexValidateElement;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;

public enum C1467e {
    COLOR("color"),
    DATE("date"),
    DATE_TIME("date-time"),
    EMAIL("email"),
    HOST_NAME("host-name"),
    IP_ADDRESS("ip-address"),
    IPV6("ipv6"),
    PHONE("phone"),
    REGEX(RegexValidateElement.METHOD),
    STYLE(XHTMLText.STYLE),
    TIME(Time.ELEMENT),
    URI("uri"),
    UTC_MILLISEC("utc-millisec");
    
    private final String f4608n;

    private C1467e(String str) {
        this.f4608n = str;
    }

    @ad
    public final String toString() {
        return this.f4608n;
    }
}
