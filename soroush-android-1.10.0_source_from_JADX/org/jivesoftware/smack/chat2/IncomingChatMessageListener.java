package org.jivesoftware.smack.chat2;

import org.b.a.e;
import org.jivesoftware.smack.packet.Message;

public interface IncomingChatMessageListener {
    void newIncomingMessage(e eVar, Message message, Chat chat);
}
