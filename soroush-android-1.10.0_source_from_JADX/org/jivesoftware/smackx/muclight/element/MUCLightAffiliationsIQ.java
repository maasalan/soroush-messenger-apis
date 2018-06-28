package org.jivesoftware.smackx.muclight.element;

import java.util.HashMap;
import java.util.Map.Entry;
import org.b.a.i;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smackx.muclight.MUCLightAffiliation;
import org.jivesoftware.smackx.muclight.element.MUCLightElements.UserWithAffiliationElement;

public class MUCLightAffiliationsIQ extends IQ {
    public static final String ELEMENT = "query";
    public static final String NAMESPACE = "urn:xmpp:muclight:0#affiliations";
    private HashMap<i, MUCLightAffiliation> affiliations;
    private final String version;

    public MUCLightAffiliationsIQ(String str, HashMap<i, MUCLightAffiliation> hashMap) {
        super("query", "urn:xmpp:muclight:0#affiliations");
        this.version = str;
        this.affiliations = hashMap;
    }

    public HashMap<i, MUCLightAffiliation> getAffiliations() {
        return this.affiliations;
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        iQChildElementXmlStringBuilder.optElement("version", this.version);
        for (Entry entry : this.affiliations.entrySet()) {
            iQChildElementXmlStringBuilder.element(new UserWithAffiliationElement((i) entry.getKey(), (MUCLightAffiliation) entry.getValue()));
        }
        return iQChildElementXmlStringBuilder;
    }

    public String getVersion() {
        return this.version;
    }
}
