package org.jivesoftware.smackx.muclight.element;

import java.util.HashMap;
import org.b.a.i;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smackx.muclight.MUCLightAffiliation;
import org.jivesoftware.smackx.muclight.MUCLightRoomConfiguration;
import org.jivesoftware.smackx.muclight.element.MUCLightElements.ConfigurationElement;
import org.jivesoftware.smackx.muclight.element.MUCLightElements.OccupantsElement;

public class MUCLightInfoIQ extends IQ {
    public static final String ELEMENT = "query";
    public static final String NAMESPACE = "urn:xmpp:muclight:0#info";
    private final MUCLightRoomConfiguration configuration;
    private final HashMap<i, MUCLightAffiliation> occupants;
    private final String version;

    public MUCLightInfoIQ(String str, MUCLightRoomConfiguration mUCLightRoomConfiguration, HashMap<i, MUCLightAffiliation> hashMap) {
        super("query", "urn:xmpp:muclight:0#info");
        this.version = str;
        this.configuration = mUCLightRoomConfiguration;
        this.occupants = hashMap;
    }

    public MUCLightRoomConfiguration getConfiguration() {
        return this.configuration;
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        iQChildElementXmlStringBuilder.optElement("version", this.version);
        iQChildElementXmlStringBuilder.element(new ConfigurationElement(this.configuration));
        iQChildElementXmlStringBuilder.element(new OccupantsElement(this.occupants));
        return iQChildElementXmlStringBuilder;
    }

    public HashMap<i, MUCLightAffiliation> getOccupants() {
        return this.occupants;
    }

    public String getVersion() {
        return this.version;
    }
}
