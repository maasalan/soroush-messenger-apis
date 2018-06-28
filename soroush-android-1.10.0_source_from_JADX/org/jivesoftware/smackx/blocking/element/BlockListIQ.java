package org.jivesoftware.smackx.blocking.element;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.b.a.i;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.util.ParserUtils;

public class BlockListIQ extends IQ {
    public static final String ELEMENT = "blocklist";
    public static final String NAMESPACE = "urn:xmpp:blocking";
    private final List<i> jids;

    public BlockListIQ() {
        this(null);
    }

    public BlockListIQ(List<i> list) {
        super(ELEMENT, "urn:xmpp:blocking");
        this.jids = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }

    public List<i> getBlockedJids() {
        return this.jids;
    }

    public List<i> getBlockedJidsCopy() {
        return new ArrayList(getBlockedJids());
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        if (this.jids.isEmpty()) {
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
}
