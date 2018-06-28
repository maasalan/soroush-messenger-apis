package org.jivesoftware.smack;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.packet.Stanza;

public class StanzaCollector {
    private boolean cancelled = false;
    private final StanzaCollector collectorToReset;
    private final XMPPConnection connection;
    private final StanzaFilter packetFilter;
    private final ArrayBlockingQueue<Stanza> resultQueue;
    private volatile long waitStart;

    public static final class Configuration {
        private StanzaCollector collectorToReset;
        private StanzaFilter packetFilter;
        private int size;

        private Configuration() {
            this.size = SmackConfiguration.getStanzaCollectorSize();
        }

        public final Configuration setCollectorToReset(StanzaCollector stanzaCollector) {
            this.collectorToReset = stanzaCollector;
            return this;
        }

        @Deprecated
        public final Configuration setPacketFilter(StanzaFilter stanzaFilter) {
            return setStanzaFilter(stanzaFilter);
        }

        public final Configuration setSize(int i) {
            this.size = i;
            return this;
        }

        public final Configuration setStanzaFilter(StanzaFilter stanzaFilter) {
            this.packetFilter = stanzaFilter;
            return this;
        }
    }

    protected StanzaCollector(XMPPConnection xMPPConnection, Configuration configuration) {
        this.connection = xMPPConnection;
        this.packetFilter = configuration.packetFilter;
        this.resultQueue = new ArrayBlockingQueue(configuration.size);
        this.collectorToReset = configuration.collectorToReset;
    }

    public static Configuration newConfiguration() {
        return new Configuration();
    }

    private final void throwIfCancelled() {
        if (this.cancelled) {
            throw new IllegalStateException("Packet collector already cancelled");
        }
    }

    public void cancel() {
        if (!this.cancelled) {
            this.cancelled = true;
            this.connection.removeStanzaCollector(this);
        }
    }

    public int getCollectedCount() {
        return this.resultQueue.size();
    }

    @Deprecated
    public StanzaFilter getPacketFilter() {
        return getStanzaFilter();
    }

    public StanzaFilter getStanzaFilter() {
        return this.packetFilter;
    }

    public <P extends Stanza> P nextResult() {
        return nextResult(this.connection.getReplyTimeout());
    }

    public <P extends Stanza> P nextResult(long j) {
        throwIfCancelled();
        this.waitStart = System.currentTimeMillis();
        long j2 = j;
        do {
            Stanza stanza = (Stanza) this.resultQueue.poll(j2, TimeUnit.MILLISECONDS);
            if (stanza != null) {
                return stanza;
            }
            j2 = j - (System.currentTimeMillis() - this.waitStart);
        } while (j2 > 0);
        return null;
    }

    public <P extends Stanza> P nextResultBlockForever() {
        throwIfCancelled();
        P p = null;
        while (p == null) {
            Stanza stanza = (Stanza) this.resultQueue.take();
        }
        return p;
    }

    public <P extends Stanza> P nextResultOrThrow() {
        return nextResultOrThrow(this.connection.getReplyTimeout());
    }

    public <P extends Stanza> P nextResultOrThrow(long j) {
        P nextResult = nextResult(j);
        cancel();
        if (nextResult != null) {
            XMPPErrorException.ifHasErrorThenThrow(nextResult);
            return nextResult;
        } else if (this.connection.isConnected()) {
            throw NoResponseException.newWith(this.connection, this);
        } else {
            throw new NotConnectedException(this.connection, this.packetFilter);
        }
    }

    public <P extends Stanza> P pollResult() {
        return (Stanza) this.resultQueue.poll();
    }

    public <P extends Stanza> P pollResultOrThrow() {
        P pollResult = pollResult();
        if (pollResult != null) {
            XMPPErrorException.ifHasErrorThenThrow(pollResult);
        }
        return pollResult;
    }

    protected void processStanza(Stanza stanza) {
        if (this.packetFilter == null || this.packetFilter.accept(stanza)) {
            while (!this.resultQueue.offer(stanza)) {
                this.resultQueue.poll();
            }
            if (this.collectorToReset != null) {
                this.collectorToReset.waitStart = System.currentTimeMillis();
            }
        }
    }
}
