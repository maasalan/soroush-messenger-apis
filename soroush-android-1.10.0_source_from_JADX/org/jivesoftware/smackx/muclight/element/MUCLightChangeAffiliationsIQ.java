package org.jivesoftware.smackx.muclight.element;

import java.util.HashMap;
import java.util.Map.Entry;
import org.b.a.i;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smackx.muclight.MUCLightAffiliation;
import org.jivesoftware.smackx.muclight.element.MUCLightElements.UserWithAffiliationElement;

public class MUCLightChangeAffiliationsIQ extends IQ {
    public static final String ELEMENT = "query";
    public static final String NAMESPACE = "urn:xmpp:muclight:0#affiliations";
    private HashMap<i, MUCLightAffiliation> affiliations;

    public MUCLightChangeAffiliationsIQ(i iVar, HashMap<i, MUCLightAffiliation> hashMap) {
        super("query", "urn:xmpp:muclight:0#affiliations");
        setType(Type.set);
        setTo(iVar);
        this.affiliations = hashMap;
    }

    public HashMap<i, MUCLightAffiliation> getAffiliations() {
        return this.affiliations;
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        if (this.affiliations != null) {
            for (Entry entry : this.affiliations.entrySet()) {
                iQChildElementXmlStringBuilder.element(new UserWithAffiliationElement((i) entry.getKey(), (MUCLightAffiliation) entry.getValue()));
            }
        }
        return iQChildElementXmlStringBuilder;
    }
}
