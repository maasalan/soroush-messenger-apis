package org.jivesoftware.smackx.mam.element;

import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smackx.rsm.packet.RSMSet;

public class MamFinIQ extends IQ {
    public static final String ELEMENT = "fin";
    public static final String NAMESPACE = "urn:xmpp:mam:1";
    private final boolean complete;
    private final String queryId;
    private final RSMSet rsmSet;
    private final boolean stable;

    public MamFinIQ(String str, RSMSet rSMSet, boolean z, boolean z2) {
        super(ELEMENT, "urn:xmpp:mam:1");
        if (rSMSet == null) {
            throw new IllegalArgumentException("rsmSet must not be null");
        }
        this.rsmSet = rSMSet;
        this.complete = z;
        this.stable = z2;
        this.queryId = str;
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.optAttribute("queryid", this.queryId);
        iQChildElementXmlStringBuilder.optBooleanAttribute("complete", this.complete);
        iQChildElementXmlStringBuilder.optBooleanAttribute("stable", this.stable);
        if (this.rsmSet == null) {
            iQChildElementXmlStringBuilder.setEmptyElement();
            return iQChildElementXmlStringBuilder;
        }
        iQChildElementXmlStringBuilder.rightAngleBracket();
        iQChildElementXmlStringBuilder.element(this.rsmSet);
        return iQChildElementXmlStringBuilder;
    }

    public final String getQueryId() {
        return this.queryId;
    }

    public RSMSet getRSMSet() {
        return this.rsmSet;
    }

    public boolean isComplete() {
        return this.complete;
    }

    public boolean isStable() {
        return this.stable;
    }
}
