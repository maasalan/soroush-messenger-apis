package org.jivesoftware.smackx.chatstates.packet;

import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.chatstates.ChatState;

public class ChatStateExtension implements ExtensionElement {
    public static final String NAMESPACE = "http://jabber.org/protocol/chatstates";
    private final ChatState state;

    public ChatStateExtension(ChatState chatState) {
        this.state = chatState;
    }

    public ChatState getChatState() {
        return this.state;
    }

    public String getElementName() {
        return this.state.name();
    }

    public String getNamespace() {
        return "http://jabber.org/protocol/chatstates";
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.closeEmptyElement();
        return xmlStringBuilder;
    }
}
