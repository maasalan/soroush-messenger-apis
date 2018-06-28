package org.jivesoftware.smackx.httpfileupload.element;

import org.b.a.b;
import org.b.a.i;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.IQ.Type;

public class SlotRequest extends IQ {
    public static final String ELEMENT = "request";
    public static final String NAMESPACE = "urn:xmpp:http:upload:0";
    private final String contentType;
    private final String filename;
    private final long size;

    public SlotRequest(b bVar, String str, long j) {
        this(bVar, str, j, null);
    }

    public SlotRequest(b bVar, String str, long j, String str2) {
        this(bVar, str, j, str2, "urn:xmpp:http:upload:0");
    }

    protected SlotRequest(b bVar, String str, long j, String str2, String str3) {
        super("request", str3);
        if (j <= 0) {
            throw new IllegalArgumentException("File fileSize must be greater than zero.");
        }
        this.filename = str;
        this.size = j;
        this.contentType = str2;
        setType(Type.get);
        setTo((i) bVar);
    }

    public String getContentType() {
        return this.contentType;
    }

    public String getFilename() {
        return this.filename;
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        iQChildElementXmlStringBuilder.element("filename", this.filename);
        iQChildElementXmlStringBuilder.element("size", String.valueOf(this.size));
        iQChildElementXmlStringBuilder.optElement("content-type", this.contentType);
        return iQChildElementXmlStringBuilder;
    }

    public long getSize() {
        return this.size;
    }
}
