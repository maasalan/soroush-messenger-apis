package org.jivesoftware.smack.chat;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.b.a.g;
import org.jivesoftware.smack.StanzaCollector;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Message.Type;
import org.jivesoftware.smack.util.StringUtils;

@Deprecated
public class Chat {
    private ChatManager chatManager;
    private final Set<ChatMessageListener> listeners = new CopyOnWriteArraySet();
    private g participant;
    private String threadID;

    Chat(ChatManager chatManager, g gVar, String str) {
        if (StringUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Thread ID must not be null");
        }
        this.chatManager = chatManager;
        this.participant = gVar;
        this.threadID = str;
    }

    public void addMessageListener(ChatMessageListener chatMessageListener) {
        if (chatMessageListener != null) {
            this.listeners.add(chatMessageListener);
        }
    }

    public void close() {
        this.chatManager.closeChat(this);
        this.listeners.clear();
    }

    public StanzaCollector createCollector() {
        return this.chatManager.createStanzaCollector(this);
    }

    void deliver(Message message) {
        message.setThread(this.threadID);
        for (ChatMessageListener processMessage : this.listeners) {
            processMessage.processMessage(this, message);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof Chat) {
            Chat chat = (Chat) obj;
            if (this.threadID.equals(chat.getThreadID()) && this.participant.a(chat.getParticipant())) {
                return true;
            }
        }
        return false;
    }

    public Set<ChatMessageListener> getListeners() {
        return Collections.unmodifiableSet(this.listeners);
    }

    public g getParticipant() {
        return this.participant;
    }

    public String getThreadID() {
        return this.threadID;
    }

    public int hashCode() {
        return ((this.threadID.hashCode() + 31) * 31) + this.participant.hashCode();
    }

    public void removeMessageListener(ChatMessageListener chatMessageListener) {
        this.listeners.remove(chatMessageListener);
    }

    public void sendMessage(String str) {
        Message message = new Message();
        message.setBody(str);
        sendMessage(message);
    }

    public void sendMessage(Message message) {
        message.setTo(this.participant);
        message.setType(Type.chat);
        message.setThread(this.threadID);
        this.chatManager.sendMessage(this, message);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Chat [(participant=");
        stringBuilder.append(this.participant);
        stringBuilder.append("), (thread=");
        stringBuilder.append(this.threadID);
        stringBuilder.append(")]");
        return stringBuilder.toString();
    }
}
