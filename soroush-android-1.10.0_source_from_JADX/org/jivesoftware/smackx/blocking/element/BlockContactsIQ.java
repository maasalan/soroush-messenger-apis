package org.jivesoftware.smackx.blocking.element;

import java.util.Collections;
import java.util.List;
import org.b.a.i;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.util.ParserUtils;

public class BlockContactsIQ extends IQ {
    public static final String ELEMENT = "block";
    public static final String NAMESPACE = "urn:xmpp:blocking";
    private final List<i> jids;

    public BlockContactsIQ(List<i> list) {
        super(ELEMENT, "urn:xmpp:blocking");
        setType(Type.set);
        this.jids = Collections.unmodifiableList(list);
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        if (this.jids != null) {
            for (i iVar : this.jids) {
                iQChildElementXmlStringBuilder.halfOpenElement("item");
                iQChildElementXmlStringBuilder.attribute(ParserUtils.JID, (CharSequence) iVar);
                iQChildElementXmlStringBuilder.closeEmptyElement();
            }
        }
        return iQChildElementXmlStringBuilder;
    }

    public List<i> getJids() {
        return this.jids;
    }
}
