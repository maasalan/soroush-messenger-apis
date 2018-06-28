package org.jivesoftware.smackx.muclight.element;

import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smackx.muclight.MUCLightRoomConfiguration;
import org.jivesoftware.smackx.muclight.element.MUCLightElements.ConfigurationElement;

public class MUCLightConfigurationIQ extends IQ {
    public static final String ELEMENT = "query";
    public static final String NAMESPACE = "urn:xmpp:muclight:0#configuration";
    private final MUCLightRoomConfiguration configuration;
    private final String version;

    public MUCLightConfigurationIQ(String str, MUCLightRoomConfiguration mUCLightRoomConfiguration) {
        super("query", "urn:xmpp:muclight:0#configuration");
        this.version = str;
        this.configuration = mUCLightRoomConfiguration;
    }

    public MUCLightRoomConfiguration getConfiguration() {
        return this.configuration;
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        iQChildElementXmlStringBuilder.optElement("version", this.version);
        iQChildElementXmlStringBuilder.element(new ConfigurationElement(this.configuration));
        return iQChildElementXmlStringBuilder;
    }

    public String getVersion() {
        return this.version;
    }
}
