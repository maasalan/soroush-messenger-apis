package org.jivesoftware.smackx.muclight;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.b.a.g;
import org.b.a.i;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.StanzaCollector;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.chat.Chat;
import org.jivesoftware.smack.chat.ChatManager;
import org.jivesoftware.smack.chat.ChatMessageListener;
import org.jivesoftware.smack.filter.AndFilter;
import org.jivesoftware.smack.filter.FromMatchesFilter;
import org.jivesoftware.smack.filter.MessageTypeFilter;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Message.Type;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.muclight.element.MUCLightAffiliationsIQ;
import org.jivesoftware.smackx.muclight.element.MUCLightChangeAffiliationsIQ;
import org.jivesoftware.smackx.muclight.element.MUCLightConfigurationIQ;
import org.jivesoftware.smackx.muclight.element.MUCLightCreateIQ;
import org.jivesoftware.smackx.muclight.element.MUCLightDestroyIQ;
import org.jivesoftware.smackx.muclight.element.MUCLightGetAffiliationsIQ;
import org.jivesoftware.smackx.muclight.element.MUCLightGetConfigsIQ;
import org.jivesoftware.smackx.muclight.element.MUCLightGetInfoIQ;
import org.jivesoftware.smackx.muclight.element.MUCLightInfoIQ;
import org.jivesoftware.smackx.muclight.element.MUCLightSetConfigsIQ;

public class MultiUserChatLight {
    public static final String AFFILIATIONS = "#affiliations";
    public static final String BLOCKING = "#blocking";
    public static final String CONFIGURATION = "#configuration";
    public static final String CREATE = "#create";
    public static final String DESTROY = "#destroy";
    public static final String INFO = "#info";
    public static final String NAMESPACE = "urn:xmpp:muclight:0";
    private final XMPPConnection connection;
    private final StanzaFilter fromRoomFilter;
    private final StanzaFilter fromRoomGroupchatFilter;
    private StanzaCollector messageCollector;
    private final StanzaListener messageListener;
    private final Set<MessageListener> messageListeners = new CopyOnWriteArraySet();
    private final g room;

    class C79471 implements StanzaListener {
        C79471() {
        }

        public void processStanza(Stanza stanza) {
            Message message = (Message) stanza;
            for (MessageListener processMessage : MultiUserChatLight.this.messageListeners) {
                processMessage.processMessage(message);
            }
        }
    }

    MultiUserChatLight(XMPPConnection xMPPConnection, g gVar) {
        this.connection = xMPPConnection;
        this.room = gVar;
        this.fromRoomFilter = FromMatchesFilter.create(gVar);
        this.fromRoomGroupchatFilter = new AndFilter(this.fromRoomFilter, MessageTypeFilter.GROUPCHAT);
        this.messageListener = new C79471();
        xMPPConnection.addSyncStanzaListener(this.messageListener, this.fromRoomGroupchatFilter);
    }

    private void removeConnectionCallbacks() {
        this.connection.removeSyncStanzaListener(this.messageListener);
        if (this.messageCollector != null) {
            this.messageCollector.cancel();
            this.messageCollector = null;
        }
    }

    public boolean addMessageListener(MessageListener messageListener) {
        return this.messageListeners.add(messageListener);
    }

    public void changeAffiliations(HashMap<i, MUCLightAffiliation> hashMap) {
        this.connection.createStanzaCollectorAndSend(new MUCLightChangeAffiliationsIQ(this.room, hashMap)).nextResultOrThrow();
    }

    public void changeRoomName(String str) {
        this.connection.createStanzaCollectorAndSend(new MUCLightSetConfigsIQ(this.room, str, null)).nextResultOrThrow();
    }

    public void changeSubject(String str) {
        this.connection.createStanzaCollectorAndSend(new MUCLightSetConfigsIQ(this.room, null, str, null)).nextResultOrThrow();
    }

    public void create(String str, String str2, HashMap<String, String> hashMap, List<i> list) {
        IQ mUCLightCreateIQ = new MUCLightCreateIQ(this.room, str, list);
        this.messageCollector = this.connection.createStanzaCollector(this.fromRoomGroupchatFilter);
        try {
            this.connection.createStanzaCollectorAndSend(mUCLightCreateIQ).nextResultOrThrow();
        } catch (NotConnectedException e) {
            removeConnectionCallbacks();
            throw e;
        }
    }

    public void create(String str, List<i> list) {
        create(str, null, null, list);
    }

    public Message createMessage() {
        return new Message(this.room, Type.groupchat);
    }

    @Deprecated
    public Chat createPrivateChat(g gVar, ChatMessageListener chatMessageListener) {
        return ChatManager.getInstanceFor(this.connection).createChat(gVar, chatMessageListener);
    }

    public void destroy() {
        if (((IQ) this.connection.createStanzaCollectorAndSend(new MUCLightDestroyIQ(this.room)).nextResultOrThrow()).getType().equals(IQ.Type.result)) {
            removeConnectionCallbacks();
        }
    }

    public HashMap<i, MUCLightAffiliation> getAffiliations() {
        return getAffiliations(null);
    }

    public HashMap<i, MUCLightAffiliation> getAffiliations(String str) {
        return ((MUCLightAffiliationsIQ) ((IQ) this.connection.createStanzaCollectorAndSend(new MUCLightGetAffiliationsIQ(this.room, str)).nextResultOrThrow())).getAffiliations();
    }

    public MUCLightRoomConfiguration getConfiguration() {
        return getConfiguration(null);
    }

    public MUCLightRoomConfiguration getConfiguration(String str) {
        return ((MUCLightConfigurationIQ) ((IQ) this.connection.createStanzaCollectorAndSend(new MUCLightGetConfigsIQ(this.room, str)).nextResultOrThrow())).getConfiguration();
    }

    public MUCLightRoomInfo getFullInfo() {
        return getFullInfo(null);
    }

    public MUCLightRoomInfo getFullInfo(String str) {
        MUCLightInfoIQ mUCLightInfoIQ = (MUCLightInfoIQ) ((IQ) this.connection.createStanzaCollectorAndSend(new MUCLightGetInfoIQ(this.room, str)).nextResultOrThrow());
        return new MUCLightRoomInfo(mUCLightInfoIQ.getVersion(), this.room, mUCLightInfoIQ.getConfiguration(), mUCLightInfoIQ.getOccupants());
    }

    public g getRoom() {
        return this.room;
    }

    public void leave() {
        HashMap hashMap = new HashMap();
        hashMap.put(this.connection.getUser(), MUCLightAffiliation.none);
        if (((IQ) this.connection.createStanzaCollectorAndSend(new MUCLightChangeAffiliationsIQ(this.room, hashMap)).nextResultOrThrow()).getType().equals(IQ.Type.result)) {
            removeConnectionCallbacks();
        }
    }

    public Message nextMessage() {
        return (Message) this.messageCollector.nextResult();
    }

    public Message nextMessage(long j) {
        return (Message) this.messageCollector.nextResult(j);
    }

    public Message pollMessage() {
        return (Message) this.messageCollector.pollResult();
    }

    public boolean removeMessageListener(MessageListener messageListener) {
        return this.messageListeners.remove(messageListener);
    }

    public void sendMessage(String str) {
        Stanza createMessage = createMessage();
        createMessage.setBody(str);
        this.connection.sendStanza(createMessage);
    }

    public void sendMessage(Message message) {
        message.setTo(this.room);
        message.setType(Type.groupchat);
        this.connection.sendStanza(message);
    }

    public void setRoomConfigs(String str, HashMap<String, String> hashMap) {
        this.connection.createStanzaCollectorAndSend(new MUCLightSetConfigsIQ(this.room, str, hashMap)).nextResultOrThrow();
    }

    public void setRoomConfigs(HashMap<String, String> hashMap) {
        setRoomConfigs(null, hashMap);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("MUC Light: ");
        stringBuilder.append(this.room);
        stringBuilder.append("(");
        stringBuilder.append(this.connection.getUser());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
