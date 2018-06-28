package org.jivesoftware.smackx.chatstates;

import java.util.Map;
import java.util.WeakHashMap;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.chat.Chat;
import org.jivesoftware.smack.chat.ChatManager;
import org.jivesoftware.smack.chat.ChatManagerListener;
import org.jivesoftware.smack.chat.ChatMessageListener;
import org.jivesoftware.smack.filter.NotFilter;
import org.jivesoftware.smack.filter.StanzaExtensionFilter;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smackx.chatstates.packet.ChatStateExtension;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;

public final class ChatStateManager extends Manager {
    private static final Map<XMPPConnection, ChatStateManager> INSTANCES = new WeakHashMap();
    public static final String NAMESPACE = "http://jabber.org/protocol/chatstates";
    private static final StanzaFilter filter = new NotFilter(new StanzaExtensionFilter("http://jabber.org/protocol/chatstates"));
    private final ChatManager chatManager;
    private final Map<Chat, ChatState> chatStates = new WeakHashMap();
    private final IncomingMessageInterceptor incomingInterceptor = new IncomingMessageInterceptor();
    private final OutgoingMessageInterceptor outgoingInterceptor = new OutgoingMessageInterceptor();

    private static class IncomingMessageInterceptor implements ChatManagerListener, ChatMessageListener {
        private IncomingMessageInterceptor() {
        }

        public void chatCreated(Chat chat, boolean z) {
            chat.addMessageListener(this);
        }

        public void processMessage(org.jivesoftware.smack.chat.Chat r2, org.jivesoftware.smack.packet.Message r3) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r1 = this;
            r0 = "http://jabber.org/protocol/chatstates";
            r0 = r3.getExtension(r0);
            if (r0 != 0) goto L_0x0009;
        L_0x0008:
            return;
        L_0x0009:
            r0 = r0.getElementName();	 Catch:{ Exception -> 0x0014 }
            r0 = org.jivesoftware.smackx.chatstates.ChatState.valueOf(r0);	 Catch:{ Exception -> 0x0014 }
            org.jivesoftware.smackx.chatstates.ChatStateManager.fireNewChatState(r2, r0, r3);
        L_0x0014:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.chatstates.ChatStateManager.IncomingMessageInterceptor.processMessage(org.jivesoftware.smack.chat.Chat, org.jivesoftware.smack.packet.Message):void");
        }
    }

    private class OutgoingMessageInterceptor implements MessageListener {
        private OutgoingMessageInterceptor() {
        }

        public void processMessage(Message message) {
            Chat threadChat = ChatStateManager.this.chatManager.getThreadChat(message.getThread());
            if (threadChat != null && ChatStateManager.this.updateChatState(threadChat, ChatState.active)) {
                message.addExtension(new ChatStateExtension(ChatState.active));
            }
        }
    }

    private ChatStateManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        this.chatManager = ChatManager.getInstanceFor(xMPPConnection);
        this.chatManager.addOutgoingMessageInterceptor(this.outgoingInterceptor, filter);
        this.chatManager.addChatListener(this.incomingInterceptor);
        ServiceDiscoveryManager.getInstanceFor(xMPPConnection).addFeature("http://jabber.org/protocol/chatstates");
        INSTANCES.put(xMPPConnection, this);
    }

    private static void fireNewChatState(Chat chat, ChatState chatState, Message message) {
        for (ChatMessageListener chatMessageListener : chat.getListeners()) {
            if (chatMessageListener instanceof ChatStateListener) {
                ((ChatStateListener) chatMessageListener).stateChanged(chat, chatState, message);
            }
        }
    }

    public static synchronized ChatStateManager getInstance(XMPPConnection xMPPConnection) {
        ChatStateManager chatStateManager;
        synchronized (ChatStateManager.class) {
            chatStateManager = (ChatStateManager) INSTANCES.get(xMPPConnection);
            if (chatStateManager == null) {
                chatStateManager = new ChatStateManager(xMPPConnection);
            }
        }
        return chatStateManager;
    }

    private synchronized boolean updateChatState(Chat chat, ChatState chatState) {
        boolean z;
        if (((ChatState) this.chatStates.get(chat)) != chatState) {
            this.chatStates.put(chat, chatState);
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                return connection().equals(((ChatStateManager) obj).connection());
            }
        }
        return false;
    }

    public final int hashCode() {
        return connection().hashCode();
    }

    public final void setCurrentState(ChatState chatState, Chat chat) {
        if (chat != null) {
            if (chatState != null) {
                if (updateChatState(chat, chatState)) {
                    Message message = new Message();
                    message.addExtension(new ChatStateExtension(chatState));
                    chat.sendMessage(message);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Arguments cannot be null.");
    }
}
