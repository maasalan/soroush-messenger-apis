package org.jivesoftware.smackx.muclight.element;

import java.util.HashMap;
import java.util.Map.Entry;
import org.b.a.i;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.IQ.Type;

public class MUCLightSetConfigsIQ extends IQ {
    public static final String ELEMENT = "query";
    public static final String NAMESPACE = "urn:xmpp:muclight:0#configuration";
    private HashMap<String, String> customConfigs;
    private String roomName;
    private String subject;

    public MUCLightSetConfigsIQ(i iVar, String str, String str2, HashMap<String, String> hashMap) {
        super("query", "urn:xmpp:muclight:0#configuration");
        this.roomName = str;
        this.subject = str2;
        this.customConfigs = hashMap;
        setType(Type.set);
        setTo(iVar);
    }

    public MUCLightSetConfigsIQ(i iVar, String str, HashMap<String, String> hashMap) {
        this(iVar, str, null, hashMap);
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        iQChildElementXmlStringBuilder.optElement("roomname", this.roomName);
        iQChildElementXmlStringBuilder.optElement("subject", this.subject);
        if (this.customConfigs != null) {
            for (Entry entry : this.customConfigs.entrySet()) {
                iQChildElementXmlStringBuilder.element((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return iQChildElementXmlStringBuilder;
    }
}
