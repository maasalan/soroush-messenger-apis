package org.jivesoftware.smackx.pubsub.packet;

import org.b.a.i;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smackx.pubsub.PubSubElementType;

public class PubSub extends IQ {
    public static final String ELEMENT = "pubsub";
    public static final String NAMESPACE = "http://jabber.org/protocol/pubsub";

    public PubSub() {
        super("pubsub", "http://jabber.org/protocol/pubsub");
    }

    public PubSub(i iVar, Type type, PubSubNamespace pubSubNamespace) {
        String str = "pubsub";
        if (pubSubNamespace == null) {
            pubSubNamespace = PubSubNamespace.BASIC;
        }
        super(str, pubSubNamespace.getXmlns());
        setTo(iVar);
        setType(type);
    }

    public PubSub(PubSubNamespace pubSubNamespace) {
        super("pubsub", pubSubNamespace.getXmlns());
    }

    public static PubSub createPubsubPacket(i iVar, Type type, ExtensionElement extensionElement, PubSubNamespace pubSubNamespace) {
        PubSub pubSub = new PubSub(iVar, type, pubSubNamespace);
        pubSub.addExtension(extensionElement);
        return pubSub;
    }

    public <PE extends ExtensionElement> PE getExtension(PubSubElementType pubSubElementType) {
        return getExtension(pubSubElementType.getElementName(), pubSubElementType.getNamespace().getXmlns());
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        return iQChildElementXmlStringBuilder;
    }
}
