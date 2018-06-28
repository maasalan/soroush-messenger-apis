package org.jivesoftware.smackx.carbons.packet;

import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.packet.SimpleIQ;

public class Carbon {
    public static final String NAMESPACE = "urn:xmpp:carbons:2";

    public static class Disable extends SimpleIQ {
        public static final String ELEMENT = "disable";

        public Disable() {
            super("disable", "urn:xmpp:carbons:2");
            setType(Type.set);
        }
    }

    public static class Enable extends SimpleIQ {
        public static final String ELEMENT = "enable";

        public Enable() {
            super("enable", "urn:xmpp:carbons:2");
            setType(Type.set);
        }
    }
}
