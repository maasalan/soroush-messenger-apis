package org.jivesoftware.smackx.httpfileupload.element;

import java.net.URL;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smackx.shim.packet.Header;

public class Slot extends IQ {
    public static final String ELEMENT = "slot";
    public static final String NAMESPACE = "urn:xmpp:http:upload:0";
    private final URL getUrl;
    private final Map<String, String> headers;
    private final URL putUrl;

    public Slot(URL url, URL url2) {
        this(url, url2, null);
    }

    public Slot(URL url, URL url2, Map<String, String> map) {
        this(url, url2, map, "urn:xmpp:http:upload:0");
    }

    protected Slot(URL url, URL url2, Map<String, String> map, String str) {
        super(ELEMENT, str);
        setType(Type.result);
        this.putUrl = url;
        this.getUrl = url2;
        this.headers = map == null ? Collections.emptyMap() : Collections.unmodifiableMap(map);
    }

    public URL getGetUrl() {
        return this.getUrl;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        iQChildElementXmlStringBuilder.element("put", this.putUrl.toString());
        iQChildElementXmlStringBuilder.element("get", this.getUrl.toString());
        for (Entry entry : getHeaders().entrySet()) {
            iQChildElementXmlStringBuilder.openElement(Header.ELEMENT).attribute((String) entry.getKey(), (String) entry.getValue());
        }
        return iQChildElementXmlStringBuilder;
    }

    public URL getPutUrl() {
        return this.putUrl;
    }
}
