package org.jivesoftware.smack.chat2;

import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.b.a.e;
import org.b.a.f;
import org.b.a.i;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.filter.AndFilter;
import org.jivesoftware.smack.filter.FromTypeFilter;
import org.jivesoftware.smack.filter.MessageTypeFilter;
import org.jivesoftware.smack.filter.MessageWithBodiesFilter;
import org.jivesoftware.smack.filter.OrFilter;
import org.jivesoftware.smack.filter.StanzaExtensionFilter;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.filter.ToTypeFilter;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.roster.AbstractRosterListener;
import org.jivesoftware.smack.roster.Roster;
import org.jivesoftware.smackx.xhtmlim.packet.XHTMLExtension;

public final class ChatManager extends Manager {
    private static final StanzaFilter INCOMING_MESSAGE_FILTER = new AndFilter(MESSAGE_FILTER, FromTypeFilter.ENTITY_FULL_JID);
    private static final Map<XMPPConnection, ChatManager> INSTANCES = new WeakHashMap();
    private static final StanzaFilter MESSAGE_FILTER;
    private static final StanzaFilter OUTGOING_MESSAGE_FILTER = new AndFilter(MESSAGE_FILTER, ToTypeFilter.ENTITY_FULL_OR_BARE_JID);
    private final Map<e, Chat> chats = new ConcurrentHashMap();
    private final Set<IncomingChatMessageListener> incomingListeners = new CopyOnWriteArraySet();
    private final Set<OutgoingChatMessageListener> outgoingListeners = new CopyOnWriteArraySet();
    private boolean xhtmlIm;

    class C78891 implements StanzaListener {
        C78891() {
        }

        public void processStanza(Stanza stanza) {
            Message message = (Message) stanza;
            if (ChatManager.this.shouldAcceptMessage(message)) {
                f q = message.getFrom().q();
                e b = q.b();
                Chat chatWith = ChatManager.this.chatWith(b);
                chatWith.lockedResource = q;
                for (IncomingChatMessageListener newIncomingMessage : ChatManager.this.incomingListeners) {
                    newIncomingMessage.newIncomingMessage(b, message, chatWith);
                }
            }
        }
    }

    class C78902 implements StanzaListener {
        C78902() {
        }

        public void processStanza(Stanza stanza) {
            Message message = (Message) stanza;
            if (ChatManager.this.shouldAcceptMessage(message)) {
                e o = message.getTo().o();
                Chat chatWith = ChatManager.this.chatWith(o);
                for (OutgoingChatMessageListener newOutgoingMessage : ChatManager.this.outgoingListeners) {
                    newOutgoingMessage.newOutgoingMessage(o, message, chatWith);
                }
            }
        }
    }

    class C80023 extends AbstractRosterListener {
        C80023() {
        }

        public void presenceChanged(Presence presence) {
            i from = presence.getFrom();
            e n = from.n();
            if (n != null) {
                Chat chat = (Chat) ChatManager.this.chats.get(n);
                if (chat != null && chat.lockedResource != null) {
                    if (!chat.lockedResource.a(from.p())) {
                        return;
                    }
                    if (chat.lastPresenceOfLockedResource == null) {
                        chat.lastPresenceOfLockedResource = presence;
                        return;
                    }
                    if (!(chat.lastPresenceOfLockedResource.getMode() == presence.getMode() && chat.lastPresenceOfLockedResource.getType() == presence.getType())) {
                        chat.unlockResource();
                    }
                }
            }
        }
    }

    static {
        StanzaFilter[] stanzaFilterArr = new StanzaFilter[2];
        stanzaFilterArr[0] = MessageTypeFilter.NORMAL_OR_CHAT;
        stanzaFilterArr[1] = new OrFilter(MessageWithBodiesFilter.INSTANCE, new StanzaExtensionFilter(XHTMLExtension.ELEMENT, XHTMLExtension.NAMESPACE));
        MESSAGE_FILTER = new AndFilter(stanzaFilterArr);
    }

    private ChatManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        xMPPConnection.addSyncStanzaListener(new C78891(), INCOMING_MESSAGE_FILTER);
        xMPPConnection.addPacketInterceptor(new C78902(), OUTGOING_MESSAGE_FILTER);
        Roster.getInstanceFor(xMPPConnection).addRosterListener(new C80023());
    }

    public static synchronized ChatManager getInstanceFor(XMPPConnection xMPPConnection) {
        ChatManager chatManager;
        synchronized (ChatManager.class) {
            chatManager = (ChatManager) INSTANCES.get(xMPPConnection);
            if (chatManager == null) {
                chatManager = new ChatManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, chatManager);
            }
        }
        return chatManager;
    }

    private boolean shouldAcceptMessage(Message message) {
        return !message.getBodies().isEmpty() ? true : this.xhtmlIm && XHTMLExtension.from(message) != null;
    }

    public final boolean addIncomingListener(IncomingChatMessageListener incomingChatMessageListener) {
        return this.incomingListeners.add(incomingChatMessageListener);
    }

    @Deprecated
    public final boolean addListener(IncomingChatMessageListener incomingChatMessageListener) {
        return addIncomingListener(incomingChatMessageListener);
    }

    @Deprecated
    public final boolean addListener(OutgoingChatMessageListener outgoingChatMessageListener) {
        return addOutgoingListener(outgoingChatMessageListener);
    }

    public final boolean addOutgoingListener(OutgoingChatMessageListener outgoingChatMessageListener) {
        return this.outgoingListeners.add(outgoingChatMessageListener);
    }

    public final Chat chatWith(e eVar) {
        Chat chat = (Chat) this.chats.get(eVar);
        if (chat != null) {
            return chat;
        }
        synchronized (this.chats) {
            chat = (Chat) this.chats.get(eVar);
            if (chat != null) {
                return chat;
            }
            chat = new Chat(connection(), eVar);
            return chat;
        }
    }

    public final boolean removeListener(IncomingChatMessageListener incomingChatMessageListener) {
        return this.incomingListeners.remove(incomingChatMessageListener);
    }

    public final boolean removeListener(OutgoingChatMessageListener outgoingChatMessageListener) {
        return this.outgoingListeners.remove(outgoingChatMessageListener);
    }

    @Deprecated
    public final boolean removeOutoingLIstener(OutgoingChatMessageListener outgoingChatMessageListener) {
        return removeListener(outgoingChatMessageListener);
    }

    public final void setXhmtlImEnabled(boolean z) {
        this.xhtmlIm = z;
    }
}
