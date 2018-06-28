package org.jivesoftware.smack;

import java.util.ArrayList;
import java.util.List;
import org.b.a.i;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.util.dns.HostAddress;

public class SmackException extends Exception {
    private static final long serialVersionUID = 1844674365368214457L;

    public static class AlreadyConnectedException extends SmackException {
        private static final long serialVersionUID = 5011416918049135231L;

        public AlreadyConnectedException() {
            super("Client is already connected");
        }
    }

    public static class AlreadyLoggedInException extends SmackException {
        private static final long serialVersionUID = 5011416918049935231L;

        public AlreadyLoggedInException() {
            super("Client is already logged in");
        }
    }

    public static class ConnectionException extends SmackException {
        private static final long serialVersionUID = 1686944201672697996L;
        private final List<HostAddress> failedAddresses;

        private ConnectionException(String str, List<HostAddress> list) {
            super(str);
            this.failedAddresses = list;
        }

        public ConnectionException(Throwable th) {
            super(th);
            this.failedAddresses = new ArrayList(0);
        }

        public static ConnectionException from(List<HostAddress> list) {
            StringBuilder stringBuilder = new StringBuilder("The following addresses failed: ");
            for (HostAddress errorMessage : list) {
                stringBuilder.append(errorMessage.getErrorMessage());
                stringBuilder.append(", ");
            }
            stringBuilder.setLength(stringBuilder.length() - 2);
            return new ConnectionException(stringBuilder.toString(), list);
        }

        public List<HostAddress> getFailedAddresses() {
            return this.failedAddresses;
        }
    }

    public static class FeatureNotSupportedException extends SmackException {
        private static final long serialVersionUID = 4713404802621452016L;
        private final String feature;
        private final i jid;

        public FeatureNotSupportedException(String str) {
            this(str, null);
        }

        public FeatureNotSupportedException(String str, i iVar) {
            String str2;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" not supported");
            if (iVar == null) {
                str2 = "";
            } else {
                StringBuilder stringBuilder2 = new StringBuilder(" by '");
                stringBuilder2.append(iVar);
                stringBuilder2.append("'");
                str2 = stringBuilder2.toString();
            }
            stringBuilder.append(str2);
            super(stringBuilder.toString());
            this.jid = iVar;
            this.feature = str;
        }

        public String getFeature() {
            return this.feature;
        }

        public i getJid() {
            return this.jid;
        }
    }

    public static class IllegalStateChangeException extends SmackException {
        private static final long serialVersionUID = -1766023961577168927L;
    }

    public static final class NoResponseException extends SmackException {
        private static final long serialVersionUID = -6523363748984543636L;
        private final StanzaFilter filter;

        private NoResponseException(String str) {
            this(str, null);
        }

        private NoResponseException(String str, StanzaFilter stanzaFilter) {
            super(str);
            this.filter = stanzaFilter;
        }

        private static StringBuilder getWaitingFor(XMPPConnection xMPPConnection) {
            long replyTimeout = xMPPConnection.getReplyTimeout();
            StringBuilder stringBuilder = new StringBuilder(256);
            StringBuilder stringBuilder2 = new StringBuilder("No response received within reply timeout. Timeout was ");
            stringBuilder2.append(replyTimeout);
            stringBuilder2.append("ms (~");
            stringBuilder2.append(replyTimeout / 1000);
            stringBuilder2.append("s).");
            stringBuilder.append(stringBuilder2.toString());
            return stringBuilder;
        }

        public static NoResponseException newWith(XMPPConnection xMPPConnection, String str) {
            StringBuilder waitingFor = getWaitingFor(xMPPConnection);
            waitingFor.append(" While waiting for ");
            waitingFor.append(str);
            return new NoResponseException(waitingFor.toString());
        }

        public static NoResponseException newWith(XMPPConnection xMPPConnection, StanzaCollector stanzaCollector) {
            return newWith(xMPPConnection, stanzaCollector.getStanzaFilter());
        }

        public static NoResponseException newWith(XMPPConnection xMPPConnection, StanzaFilter stanzaFilter) {
            StringBuilder waitingFor = getWaitingFor(xMPPConnection);
            waitingFor.append(" Waited for response using: ");
            waitingFor.append(stanzaFilter != null ? stanzaFilter.toString() : "No filter used or filter was 'null'");
            waitingFor.append('.');
            return new NoResponseException(waitingFor.toString(), stanzaFilter);
        }

        public final StanzaFilter getFilter() {
            return this.filter;
        }
    }

    public static class NotConnectedException extends SmackException {
        private static final long serialVersionUID = 9197980400776001173L;

        public NotConnectedException() {
            this(null);
        }

        public NotConnectedException(String str) {
            StringBuilder stringBuilder = new StringBuilder("Client is not, or no longer, connected.");
            if (str != null) {
                StringBuilder stringBuilder2 = new StringBuilder(" ");
                stringBuilder2.append(str);
                str = stringBuilder2.toString();
            } else {
                str = "";
            }
            stringBuilder.append(str);
            super(stringBuilder.toString());
        }

        public NotConnectedException(XMPPConnection xMPPConnection, String str) {
            StringBuilder stringBuilder = new StringBuilder("The connection ");
            stringBuilder.append(xMPPConnection.toString());
            stringBuilder.append(" is no longer connected. ");
            stringBuilder.append(str);
            super(stringBuilder.toString());
        }

        public NotConnectedException(XMPPConnection xMPPConnection, StanzaFilter stanzaFilter) {
            StringBuilder stringBuilder = new StringBuilder("The connection ");
            stringBuilder.append(xMPPConnection);
            stringBuilder.append(" is no longer connected while waiting for response with ");
            stringBuilder.append(stanzaFilter);
            super(stringBuilder.toString());
        }
    }

    public static class NotLoggedInException extends SmackException {
        private static final long serialVersionUID = 3216216839100019278L;

        public NotLoggedInException() {
            super("Client is not logged in");
        }
    }

    public static class ResourceBindingNotOfferedException extends SmackException {
        private static final long serialVersionUID = 2346934138253437571L;

        public ResourceBindingNotOfferedException() {
            super("Resource binding was not offered by server");
        }
    }

    public static class SecurityNotPossibleException extends SmackException {
        private static final long serialVersionUID = -6836090872690331336L;

        public SecurityNotPossibleException(String str) {
            super(str);
        }
    }

    public static abstract class SecurityRequiredException extends SmackException {
        private static final long serialVersionUID = 384291845029773545L;

        public SecurityRequiredException(String str) {
            super(str);
        }
    }

    public static class SecurityRequiredByClientException extends SecurityRequiredException {
        private static final long serialVersionUID = 2395325821201543159L;

        public SecurityRequiredByClientException() {
            super("SSL/TLS required by client but not supported by server");
        }
    }

    public static class SecurityRequiredByServerException extends SecurityRequiredException {
        private static final long serialVersionUID = 8268148813117631819L;

        public SecurityRequiredByServerException() {
            super("SSL/TLS required by server but disabled in client");
        }
    }

    protected SmackException() {
    }

    public SmackException(String str) {
        super(str);
    }

    public SmackException(String str, Throwable th) {
        super(str, th);
    }

    public SmackException(Throwable th) {
        super(th);
    }
}
