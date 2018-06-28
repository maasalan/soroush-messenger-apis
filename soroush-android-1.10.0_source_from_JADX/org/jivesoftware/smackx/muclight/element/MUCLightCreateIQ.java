package org.jivesoftware.smackx.muclight.element;

import java.util.HashMap;
import java.util.List;
import org.b.a.g;
import org.b.a.i;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smackx.muclight.MUCLightAffiliation;
import org.jivesoftware.smackx.muclight.MUCLightRoomConfiguration;
import org.jivesoftware.smackx.muclight.element.MUCLightElements.ConfigurationElement;
import org.jivesoftware.smackx.muclight.element.MUCLightElements.OccupantsElement;

public class MUCLightCreateIQ extends IQ {
    public static final String ELEMENT = "query";
    public static final String NAMESPACE = "urn:xmpp:muclight:0#create";
    private MUCLightRoomConfiguration configuration;
    private final HashMap<i, MUCLightAffiliation> occupants;

    public MUCLightCreateIQ(g gVar, String str, String str2, HashMap<String, String> hashMap, List<i> list) {
        super("query", NAMESPACE);
        this.configuration = new MUCLightRoomConfiguration(str, str2, hashMap);
        this.occupants = new HashMap();
        for (i put : list) {
            this.occupants.put(put, MUCLightAffiliation.member);
        }
        setType(Type.set);
        setTo((i) gVar);
    }

    public MUCLightCreateIQ(g gVar, String str, List<i> list) {
        this(gVar, str, null, null, list);
    }

    public MUCLightRoomConfiguration getConfiguration() {
        return this.configuration;
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        iQChildElementXmlStringBuilder.element(new ConfigurationElement(this.configuration));
        if (!this.occupants.isEmpty()) {
            iQChildElementXmlStringBuilder.element(new OccupantsElement(this.occupants));
        }
        return iQChildElementXmlStringBuilder;
    }

    public HashMap<i, MUCLightAffiliation> getOccupants() {
        return this.occupants;
    }
}
