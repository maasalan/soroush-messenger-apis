package org.jivesoftware.smack.filter;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.b.a.b;
import org.b.a.f;
import org.b.a.i;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.Stanza;

public class IQReplyFilter implements StanzaFilter {
    private static final Logger LOGGER = Logger.getLogger(IQReplyFilter.class.getName());
    private final OrFilter fromFilter;
    private final StanzaFilter iqAndIdFilter;
    private final f local;
    private final String packetId;
    private final b server;
    private final i to;

    public IQReplyFilter(IQ iq, XMPPConnection xMPPConnection) {
        if (iq.isRequestIQ()) {
            this.to = iq.getTo();
            this.local = xMPPConnection.getUser();
            if (this.local == null) {
                throw new IllegalArgumentException("Must have a local (user) JID set. Either you didn't configure one or you where not connected at least once");
            }
            this.server = xMPPConnection.getXMPPServiceDomain();
            this.packetId = iq.getStanzaId();
            OrFilter orFilter = new OrFilter(IQTypeFilter.ERROR, IQTypeFilter.RESULT);
            StanzaIdFilter stanzaIdFilter = new StanzaIdFilter((Stanza) iq);
            this.iqAndIdFilter = new AndFilter(orFilter, stanzaIdFilter);
            this.fromFilter = new OrFilter();
            this.fromFilter.addFilter(FromMatchesFilter.createFull(this.to));
            if (this.to == null) {
                this.fromFilter.addFilter(FromMatchesFilter.createBare(this.local));
                this.fromFilter.addFilter(FromMatchesFilter.createFull(this.server));
                return;
            }
            if (this.to.a(this.local.m())) {
                this.fromFilter.addFilter(FromMatchesFilter.createFull(null));
            }
            return;
        }
        throw new IllegalArgumentException("IQ must be a request IQ, i.e. of type 'get' or 'set'.");
    }

    public boolean accept(Stanza stanza) {
        if (!this.iqAndIdFilter.accept(stanza)) {
            return false;
        }
        if (this.fromFilter.accept(stanza)) {
            return true;
        }
        LOGGER.log(Level.WARNING, String.format("Rejected potentially spoofed reply to IQ-packet. Filter settings: packetId=%s, to=%s, local=%s, server=%s. Received packet with from=%s", new Object[]{this.packetId, this.to, this.local, this.server, stanza.getFrom()}), stanza);
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(": iqAndIdFilter (");
        stringBuilder.append(this.iqAndIdFilter.toString());
        stringBuilder.append("), ");
        stringBuilder.append(": fromFilter (");
        stringBuilder.append(this.fromFilter.toString());
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
