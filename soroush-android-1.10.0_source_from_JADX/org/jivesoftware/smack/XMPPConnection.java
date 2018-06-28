package org.jivesoftware.smack;

import org.b.a.b;
import org.b.a.f;
import org.jivesoftware.smack.StanzaCollector.Configuration;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.iqrequest.IQRequestHandler;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.packet.Nonza;
import org.jivesoftware.smack.packet.Stanza;

public interface XMPPConnection {

    public enum FromMode {
        UNCHANGED,
        OMITTED,
        USER
    }

    void addAsyncStanzaListener(StanzaListener stanzaListener, StanzaFilter stanzaFilter);

    void addConnectionListener(ConnectionListener connectionListener);

    void addOneTimeSyncCallback(StanzaListener stanzaListener, StanzaFilter stanzaFilter);

    void addPacketInterceptor(StanzaListener stanzaListener, StanzaFilter stanzaFilter);

    @Deprecated
    void addPacketListener(StanzaListener stanzaListener, StanzaFilter stanzaFilter);

    void addPacketSendingListener(StanzaListener stanzaListener, StanzaFilter stanzaFilter);

    void addSyncStanzaListener(StanzaListener stanzaListener, StanzaFilter stanzaFilter);

    StanzaCollector createStanzaCollector(Configuration configuration);

    StanzaCollector createStanzaCollector(StanzaFilter stanzaFilter);

    StanzaCollector createStanzaCollectorAndSend(StanzaFilter stanzaFilter, Stanza stanza);

    StanzaCollector createStanzaCollectorAndSend(IQ iq);

    int getConnectionCounter();

    <F extends ExtensionElement> F getFeature(String str, String str2);

    FromMode getFromMode();

    String getHost();

    long getLastStanzaReceived();

    @Deprecated
    long getPacketReplyTimeout();

    int getPort();

    long getReplyTimeout();

    b getServiceName();

    String getStreamId();

    f getUser();

    b getXMPPServiceDomain();

    boolean hasFeature(String str, String str2);

    boolean isAnonymous();

    boolean isAuthenticated();

    boolean isConnected();

    boolean isSecureConnection();

    boolean isUsingCompression();

    IQRequestHandler registerIQRequestHandler(IQRequestHandler iQRequestHandler);

    boolean removeAsyncStanzaListener(StanzaListener stanzaListener);

    void removeConnectionListener(ConnectionListener connectionListener);

    void removePacketInterceptor(StanzaListener stanzaListener);

    @Deprecated
    boolean removePacketListener(StanzaListener stanzaListener);

    void removePacketSendingListener(StanzaListener stanzaListener);

    void removeStanzaCollector(StanzaCollector stanzaCollector);

    boolean removeSyncStanzaListener(StanzaListener stanzaListener);

    void sendIqWithResponseCallback(IQ iq, StanzaListener stanzaListener);

    void sendIqWithResponseCallback(IQ iq, StanzaListener stanzaListener, ExceptionCallback exceptionCallback);

    void sendIqWithResponseCallback(IQ iq, StanzaListener stanzaListener, ExceptionCallback exceptionCallback, long j);

    void sendNonza(Nonza nonza);

    @Deprecated
    void sendPacket(Stanza stanza);

    void sendStanza(Stanza stanza);

    void sendStanzaWithResponseCallback(Stanza stanza, StanzaFilter stanzaFilter, StanzaListener stanzaListener);

    void sendStanzaWithResponseCallback(Stanza stanza, StanzaFilter stanzaFilter, StanzaListener stanzaListener, ExceptionCallback exceptionCallback);

    void sendStanzaWithResponseCallback(Stanza stanza, StanzaFilter stanzaFilter, StanzaListener stanzaListener, ExceptionCallback exceptionCallback, long j);

    void setFromMode(FromMode fromMode);

    @Deprecated
    void setPacketReplyTimeout(long j);

    void setReplyTimeout(long j);

    IQRequestHandler unregisterIQRequestHandler(String str, String str2, Type type);

    IQRequestHandler unregisterIQRequestHandler(IQRequestHandler iQRequestHandler);
}
