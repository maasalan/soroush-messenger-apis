package org.jivesoftware.smackx.hoxt.packet;

import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.util.Objects;

public final class HttpOverXmppResp extends AbstractHttpOverXmpp {
    public static final String ELEMENT = "resp";
    private final int statusCode;
    private final String statusMessage;

    public static final class Builder extends org.jivesoftware.smackx.hoxt.packet.AbstractHttpOverXmpp.Builder<Builder, HttpOverXmppResp> {
        private int statusCode;
        private String statusMessage;

        private Builder() {
            this.statusCode = 200;
            this.statusMessage = null;
        }

        public final HttpOverXmppResp build() {
            return new HttpOverXmppResp();
        }

        protected final Builder getThis() {
            return this;
        }

        public final Builder setStatusCode(int i) {
            this.statusCode = i;
            return this;
        }

        public final Builder setStatusMessage(String str) {
            this.statusMessage = str;
            return this;
        }
    }

    private HttpOverXmppResp(Builder builder) {
        super(ELEMENT, builder);
        this.statusCode = ((Integer) Objects.requireNonNull(Integer.valueOf(builder.statusCode), "statusCode must not be null")).intValue();
        this.statusMessage = builder.statusMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    protected final IQChildElementXmlStringBuilder getIQHoxtChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.attribute("version", getVersion());
        iQChildElementXmlStringBuilder.attribute("statusCode", this.statusCode);
        iQChildElementXmlStringBuilder.optAttribute("statusMessage", this.statusMessage);
        iQChildElementXmlStringBuilder.rightAngleBracket();
        return iQChildElementXmlStringBuilder;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMessage() {
        return this.statusMessage;
    }
}
