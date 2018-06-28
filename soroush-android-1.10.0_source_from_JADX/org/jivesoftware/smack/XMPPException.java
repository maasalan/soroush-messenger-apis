package org.jivesoftware.smack;

import org.b.a.i;
import org.jivesoftware.smack.packet.Nonza;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.packet.StreamError;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.packet.XMPPError.Builder;
import org.jivesoftware.smack.packet.XMPPError.Condition;

public abstract class XMPPException extends Exception {
    private static final long serialVersionUID = 6881651633890968625L;

    public static class FailedNonzaException extends XMPPException {
        private static final long serialVersionUID = 1;
        private final Condition condition;
        private final Nonza nonza;

        public FailedNonzaException(Nonza nonza, Condition condition) {
            this.condition = condition;
            this.nonza = nonza;
        }

        public Condition getCondition() {
            return this.condition;
        }

        public Nonza getNonza() {
            return this.nonza;
        }
    }

    public static class StreamErrorException extends XMPPException {
        private static final long serialVersionUID = 3400556867134848886L;
        private final StreamError streamError;

        public StreamErrorException(StreamError streamError) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(streamError.getCondition().toString());
            stringBuilder.append(" You can read more about the meaning of this stream error at http://xmpp.org/rfcs/rfc6120.html#streams-error-conditions\n");
            stringBuilder.append(streamError.toString());
            super(stringBuilder.toString());
            this.streamError = streamError;
        }

        public StreamError getStreamError() {
            return this.streamError;
        }
    }

    public static class XMPPErrorException extends XMPPException {
        private static final long serialVersionUID = 212790389529249604L;
        private final XMPPError error;
        private final Stanza stanza;

        public XMPPErrorException(Stanza stanza, XMPPError xMPPError) {
            this.error = xMPPError;
            this.stanza = stanza;
        }

        @Deprecated
        public XMPPErrorException(Builder builder) {
            this(null, builder.build());
        }

        public static void ifHasErrorThenThrow(Stanza stanza) {
            XMPPError error = stanza.getError();
            if (error != null) {
                throw new XMPPErrorException(stanza, error);
            }
        }

        public String getMessage() {
            StringBuilder stringBuilder = new StringBuilder();
            if (this.stanza != null) {
                i from = this.stanza.getFrom();
                if (from != null) {
                    StringBuilder stringBuilder2 = new StringBuilder("XMPP error reply received from ");
                    stringBuilder2.append(from);
                    stringBuilder2.append(": ");
                    stringBuilder.append(stringBuilder2.toString());
                }
            }
            stringBuilder.append(this.error);
            return stringBuilder.toString();
        }

        public XMPPError getXMPPError() {
            return this.error;
        }
    }

    protected XMPPException() {
    }

    protected XMPPException(String str) {
        super(str);
    }

    protected XMPPException(String str, Throwable th) {
        super(str, th);
    }
}
