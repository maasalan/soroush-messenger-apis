package org.jivesoftware.smack.sm;

import java.util.Collections;
import java.util.List;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.packet.Stanza;

public abstract class StreamManagementException extends SmackException {
    private static final long serialVersionUID = 3767590115788821101L;

    public static class StreamIdDoesNotMatchException extends StreamManagementException {
        private static final long serialVersionUID = 1191073341336559621L;

        public StreamIdDoesNotMatchException(String str, String str2) {
            StringBuilder stringBuilder = new StringBuilder("Stream IDs do not match. Expected '");
            stringBuilder.append(str);
            stringBuilder.append("', but got '");
            stringBuilder.append(str2);
            stringBuilder.append("'");
            super(stringBuilder.toString());
        }
    }

    public static class StreamManagementCounterError extends StreamManagementException {
        private static final long serialVersionUID = 1;
        private final long ackedStanzaCount;
        private final List<Stanza> ackedStanzas;
        private final long handledCount;
        private final int outstandingStanzasCount;
        private final long previousServerHandledCount;

        public StreamManagementCounterError(long j, long j2, long j3, List<Stanza> list) {
            StringBuilder stringBuilder = new StringBuilder("There was an error regarding the Stream Mangement counters. Server reported ");
            stringBuilder.append(j);
            stringBuilder.append(" handled stanzas, which means that the ");
            stringBuilder.append(j3);
            stringBuilder.append(" recently send stanzas by client are now acked by the server. But Smack had only ");
            stringBuilder.append(list.size());
            stringBuilder.append(" to acknowledge. The stanza id of the last acked outstanding stanza is ");
            stringBuilder.append(list.isEmpty() ? "<no acked stanzas>" : ((Stanza) list.get(list.size() - 1)).getStanzaId());
            super(stringBuilder.toString());
            this.handledCount = j;
            this.previousServerHandledCount = j2;
            this.ackedStanzaCount = j3;
            this.outstandingStanzasCount = list.size();
            this.ackedStanzas = Collections.unmodifiableList(list);
        }

        public long getAckedStanzaCount() {
            return this.ackedStanzaCount;
        }

        public List<Stanza> getAckedStanzas() {
            return this.ackedStanzas;
        }

        public long getHandledCount() {
            return this.handledCount;
        }

        public int getOutstandingStanzasCount() {
            return this.outstandingStanzasCount;
        }

        public long getPreviousServerHandledCount() {
            return this.previousServerHandledCount;
        }
    }

    public static class StreamManagementNotEnabledException extends StreamManagementException {
        private static final long serialVersionUID = 2624821584352571307L;
    }

    public StreamManagementException(String str) {
        super(str);
    }
}
