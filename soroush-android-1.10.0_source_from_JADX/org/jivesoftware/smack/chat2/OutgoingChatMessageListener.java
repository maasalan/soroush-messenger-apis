package org.jivesoftware.smack.chat2;

import org.b.a.e;
import org.jivesoftware.smack.packet.Message;

public interface OutgoingChatMessageListener {
    void newOutgoingMessage(e eVar, Message message, Chat chat);
}
