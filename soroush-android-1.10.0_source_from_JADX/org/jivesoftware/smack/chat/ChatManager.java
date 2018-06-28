package org.jivesoftware.smack.chat;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import org.b.a.e;
import org.b.a.g;
import org.b.a.i;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.StanzaCollector;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.filter.AndFilter;
import org.jivesoftware.smack.filter.FlexibleStanzaTypeFilter;
import org.jivesoftware.smack.filter.FromMatchesFilter;
import org.jivesoftware.smack.filter.MessageTypeFilter;
import org.jivesoftware.smack.filter.OrFilter;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.filter.ThreadFilter;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Message.Type;
import org.jivesoftware.smack.packet.Stanza;

@Deprecated
public final class ChatManager extends Manager {
    private static final Map<XMPPConnection, ChatManager> INSTANCES = new WeakHashMap();
    private static final Logger LOGGER = Logger.getLogger(ChatManager.class.getName());
    private static boolean defaultIsNormalInclude = true;
    private static MatchMode defaultMatchMode = MatchMode.BARE_JID;
    private Map<e, Chat> baseJidChats = new ConcurrentHashMap();
    private Set<ChatManagerListener> chatManagerListeners = new CopyOnWriteArraySet();
    private Map<MessageListener, StanzaFilter> interceptors = new WeakHashMap();
    private Map<i, Chat> jidChats = new ConcurrentHashMap();
    private MatchMode matchMode = defaultMatchMode;
    private boolean normalIncluded = defaultIsNormalInclude;
    private final StanzaFilter packetFilter = new OrFilter(MessageTypeFilter.CHAT, new C80011());
    private Map<String, Chat> threadChats = new ConcurrentHashMap();

    public enum MatchMode {
        NONE,
        SUPPLIED_JID,
        BARE_JID
    }

    class C78882 implements StanzaListener {
        C78882() {
        }

        public void processStanza(Stanza stanza) {
            Message message = (Message) stanza;
            Chat access$100 = message.getThread() == null ? ChatManager.this.getUserChat(message.getFrom()) : ChatManager.this.getThreadChat(message.getThread());
            if (access$100 == null) {
                access$100 = ChatManager.this.createChat(message);
            }
            if (access$100 != null) {
                ChatManager.deliverMessage(access$100, message);
            }
        }
    }

    class C80011 extends FlexibleStanzaTypeFilter<Message> {
        C80011() {
        }

        protected boolean acceptSpecific(Message message) {
            return ChatManager.this.normalIncluded && message.getType() == Type.normal;
        }
    }

    private ChatManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        xMPPConnection.addSyncStanzaListener(new C78882(), this.packetFilter);
        INSTANCES.put(xMPPConnection, this);
    }

    private Chat createChat(g gVar, String str, boolean z) {
        Chat chat = new Chat(this, gVar, str);
        this.threadChats.put(str, chat);
        this.jidChats.put(gVar, chat);
        this.baseJidChats.put(gVar.b(), chat);
        for (ChatManagerListener chatCreated : this.chatManagerListeners) {
            chatCreated.chatCreated(chat, z);
        }
        return chat;
    }

    private Chat createChat(Message message) {
        i from = message.getFrom();
        if (from == null) {
            return null;
        }
        g r = from.r();
        if (r == null) {
            Logger logger = LOGGER;
            StringBuilder stringBuilder = new StringBuilder("Message from JID without localpart: '");
            stringBuilder.append(message.toXML());
            stringBuilder.append("'");
            logger.warning(stringBuilder.toString());
            return null;
        }
        String thread = message.getThread();
        if (thread == null) {
            thread = nextID();
        }
        return createChat(r, thread, false);
    }

    private static void deliverMessage(Chat chat, Message message) {
        chat.deliver(message);
    }

    public static synchronized ChatManager getInstanceFor(XMPPConnection xMPPConnection) {
        ChatManager chatManager;
        synchronized (ChatManager.class) {
            chatManager = (ChatManager) INSTANCES.get(xMPPConnection);
            if (chatManager == null) {
                chatManager = new ChatManager(xMPPConnection);
            }
        }
        return chatManager;
    }

    private Chat getUserChat(i iVar) {
        if (this.matchMode == MatchMode.NONE || iVar == null) {
            return null;
        }
        Chat chat = (Chat) this.jidChats.get(iVar);
        if (chat == null && this.matchMode == MatchMode.BARE_JID) {
            e n = iVar.n();
            if (n != null) {
                chat = (Chat) this.baseJidChats.get(n);
            }
        }
        return chat;
    }

    private static String nextID() {
        return UUID.randomUUID().toString();
    }

    public static void setDefaultIsNormalIncluded(boolean z) {
        defaultIsNormalInclude = z;
    }

    public static void setDefaultMatchMode(MatchMode matchMode) {
        defaultMatchMode = matchMode;
    }

    public final void addChatListener(ChatManagerListener chatManagerListener) {
        this.chatManagerListeners.add(chatManagerListener);
    }

    public final void addOutgoingMessageInterceptor(MessageListener messageListener) {
        addOutgoingMessageInterceptor(messageListener, null);
    }

    public final void addOutgoingMessageInterceptor(MessageListener messageListener, StanzaFilter stanzaFilter) {
        if (messageListener != null) {
            this.interceptors.put(messageListener, stanzaFilter);
        }
    }

    final void closeChat(Chat chat) {
        this.threadChats.remove(chat.getThreadID());
        g participant = chat.getParticipant();
        this.jidChats.remove(participant);
        this.baseJidChats.remove(participant.b());
    }

    public final Chat createChat(g gVar) {
        return createChat(gVar, null);
    }

    public final Chat createChat(g gVar, String str, ChatMessageListener chatMessageListener) {
        if (str == null) {
            str = nextID();
        }
        if (((Chat) this.threadChats.get(str)) != null) {
            throw new IllegalArgumentException("ThreadID is already used");
        }
        Chat createChat = createChat(gVar, str, true);
        createChat.addMessageListener(chatMessageListener);
        return createChat;
    }

    public final Chat createChat(g gVar, ChatMessageListener chatMessageListener) {
        return createChat(gVar, null, chatMessageListener);
    }

    final StanzaCollector createStanzaCollector(Chat chat) {
        return connection().createStanzaCollector(new AndFilter(new ThreadFilter(chat.getThreadID()), FromMatchesFilter.create(chat.getParticipant())));
    }

    public final Set<ChatManagerListener> getChatListeners() {
        return Collections.unmodifiableSet(this.chatManagerListeners);
    }

    public final MatchMode getMatchMode() {
        return this.matchMode;
    }

    public final Chat getThreadChat(String str) {
        return (Chat) this.threadChats.get(str);
    }

    public final boolean isNormalIncluded() {
        return this.normalIncluded;
    }

    public final void removeChatListener(ChatManagerListener chatManagerListener) {
        this.chatManagerListeners.remove(chatManagerListener);
    }

    final void sendMessage(Chat chat, Message message) {
        for (Entry entry : this.interceptors.entrySet()) {
            StanzaFilter stanzaFilter = (StanzaFilter) entry.getValue();
            if (stanzaFilter != null && stanzaFilter.accept(message)) {
                ((MessageListener) entry.getKey()).processMessage(message);
            }
        }
        connection().sendStanza(message);
    }

    public final void setMatchMode(MatchMode matchMode) {
        this.matchMode = matchMode;
    }

    public final void setNormalIncluded(boolean z) {
        this.normalIncluded = z;
    }
}
