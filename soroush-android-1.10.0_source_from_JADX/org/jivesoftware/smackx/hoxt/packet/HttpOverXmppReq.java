package org.jivesoftware.smackx.hoxt.packet;

import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smackx.hoxt.packet.AbstractHttpOverXmpp.Ibb;

public final class HttpOverXmppReq extends AbstractHttpOverXmpp {
    public static final String ELEMENT = "req";
    private final boolean ibb;
    private final boolean jingle;
    private final int maxChunkSize;
    private final HttpMethod method;
    private final String resource;
    private final boolean sipub;

    public static final class Builder extends org.jivesoftware.smackx.hoxt.packet.AbstractHttpOverXmpp.Builder<Builder, HttpOverXmppReq> {
        private boolean ibb;
        private boolean jingle;
        private int maxChunkSize;
        private HttpMethod method;
        private String resource;
        private boolean sipub;

        private Builder() {
            this.maxChunkSize = -1;
            this.sipub = true;
            this.ibb = true;
            this.jingle = true;
        }

        public final HttpOverXmppReq build() {
            if (this.method == null) {
                throw new IllegalArgumentException("Method cannot be null");
            } else if (this.resource != null) {
                return new HttpOverXmppReq();
            } else {
                throw new IllegalArgumentException("Resource cannot be null");
            }
        }

        protected final Builder getThis() {
            return this;
        }

        public final Builder setIbb(boolean z) {
            this.ibb = z;
            return this;
        }

        public final Builder setJingle(boolean z) {
            this.jingle = z;
            return this;
        }

        public final Builder setMaxChunkSize(int i) {
            if (i >= 256) {
                if (i <= 65536) {
                    this.maxChunkSize = i;
                    return this;
                }
            }
            throw new IllegalArgumentException("maxChunkSize must be within [256, 65536]");
        }

        public final Builder setMethod(HttpMethod httpMethod) {
            this.method = httpMethod;
            return this;
        }

        public final Builder setResource(String str) {
            this.resource = str;
            return this;
        }

        public final Builder setSipub(boolean z) {
            this.sipub = z;
            return this;
        }
    }

    private HttpOverXmppReq(Builder builder) {
        super("req", builder);
        this.method = builder.method;
        this.resource = builder.resource;
        this.maxChunkSize = builder.maxChunkSize;
        this.ibb = builder.ibb;
        this.jingle = builder.jingle;
        this.sipub = builder.sipub;
        setType(Type.set);
    }

    public static Builder builder() {
        return new Builder();
    }

    protected final IQChildElementXmlStringBuilder getIQHoxtChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.attribute("method", this.method);
        iQChildElementXmlStringBuilder.attribute("resource", this.resource);
        iQChildElementXmlStringBuilder.attribute("version", getVersion());
        iQChildElementXmlStringBuilder.optIntAttribute("maxChunkSize", this.maxChunkSize);
        iQChildElementXmlStringBuilder.optBooleanAttributeDefaultTrue("sipub", this.sipub);
        iQChildElementXmlStringBuilder.optBooleanAttributeDefaultTrue(Ibb.ELEMENT, this.ibb);
        iQChildElementXmlStringBuilder.optBooleanAttributeDefaultTrue("jingle", this.jingle);
        iQChildElementXmlStringBuilder.rightAngleBracket();
        return iQChildElementXmlStringBuilder;
    }

    public final int getMaxChunkSize() {
        return this.maxChunkSize;
    }

    public final HttpMethod getMethod() {
        return this.method;
    }

    public final String getResource() {
        return this.resource;
    }

    public final boolean isIbb() {
        return this.ibb;
    }

    public final boolean isJingle() {
        return this.jingle;
    }

    public final boolean isSipub() {
        return this.sipub;
    }
}
