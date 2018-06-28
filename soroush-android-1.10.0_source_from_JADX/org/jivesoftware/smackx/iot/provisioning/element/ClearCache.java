package org.jivesoftware.smackx.iot.provisioning.element;

import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.packet.SimpleIQ;

public class ClearCache extends SimpleIQ {
    public static final String ELEMENT = "clearCache";
    public static final String NAMESPACE = "urn:xmpp:iot:provisioning";

    public ClearCache() {
        super(ELEMENT, "urn:xmpp:iot:provisioning");
        setType(Type.get);
    }
}
