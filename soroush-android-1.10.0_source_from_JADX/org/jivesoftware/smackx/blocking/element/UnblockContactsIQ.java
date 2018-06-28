package org.jivesoftware.smackx.blocking.element;

import java.util.Collections;
import java.util.List;
import org.b.a.i;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.util.ParserUtils;

public class UnblockContactsIQ extends IQ {
    public static final String ELEMENT = "unblock";
    public static final String NAMESPACE = "urn:xmpp:blocking";
    private final List<i> jids;

    public UnblockContactsIQ() {
        this(null);
    }

    public UnblockContactsIQ(List<i> list) {
        super(ELEMENT, "urn:xmpp:blocking");
        setType(Type.set);
        this.jids = list != null ? Collections.unmodifiableList(list) : null;
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        if (this.jids == null) {
            iQChildElementXmlStringBuilder.setEmptyElement();
            return iQChildElementXmlStringBuilder;
        }
        iQChildElementXmlStringBuilder.rightAngleBracket();
        for (i iVar : this.jids) {
            iQChildElementXmlStringBuilder.halfOpenElement("item");
            iQChildElementXmlStringBuilder.attribute(ParserUtils.JID, (CharSequence) iVar);
            iQChildElementXmlStringBuilder.closeEmptyElement();
        }
        return iQChildElementXmlStringBuilder;
    }

    public List<i> getJids() {
        return this.jids;
    }
}
