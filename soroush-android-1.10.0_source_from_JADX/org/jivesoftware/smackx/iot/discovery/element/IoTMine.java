package org.jivesoftware.smackx.iot.discovery.element;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;

public class IoTMine extends IQ {
    public static final String ELEMENT = "mine";
    public static final String NAMESPACE = "urn:xmpp:iot:discovery";
    private final List<Tag> metaTags;
    private final boolean publicThing;

    public IoTMine(Collection<Tag> collection, boolean z) {
        this(new ArrayList(collection), z);
    }

    public IoTMine(List<Tag> list, boolean z) {
        super(ELEMENT, "urn:xmpp:iot:discovery");
        this.metaTags = list;
        this.publicThing = z;
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.optBooleanAttributeDefaultTrue("public", this.publicThing);
        iQChildElementXmlStringBuilder.rightAngleBracket();
        iQChildElementXmlStringBuilder.append(this.metaTags);
        return iQChildElementXmlStringBuilder;
    }
}
