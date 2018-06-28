package org.jivesoftware.smack.tcp;

import org.jivesoftware.smack.ConnectionConfiguration;

public final class XMPPTCPConnectionConfiguration extends ConnectionConfiguration {
    public static int DEFAULT_CONNECT_TIMEOUT = 30000;
    private final boolean compressionEnabled;
    private final int connectTimeout;

    public static final class Builder extends org.jivesoftware.smack.ConnectionConfiguration.Builder<Builder, XMPPTCPConnectionConfiguration> {
        private boolean compressionEnabled;
        private int connectTimeout;

        private Builder() {
            this.compressionEnabled = false;
            this.connectTimeout = XMPPTCPConnectionConfiguration.DEFAULT_CONNECT_TIMEOUT;
        }

        public final XMPPTCPConnectionConfiguration build() {
            return new XMPPTCPConnectionConfiguration();
        }

        protected final Builder getThis() {
            return this;
        }

        public final Builder setCompressionEnabled(boolean z) {
            this.compressionEnabled = z;
            return this;
        }

        public final Builder setConnectTimeout(int i) {
            this.connectTimeout = i;
            return this;
        }
    }

    private XMPPTCPConnectionConfiguration(Builder builder) {
        super(builder);
        this.compressionEnabled = builder.compressionEnabled;
        this.connectTimeout = builder.connectTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final boolean isCompressionEnabled() {
        return this.compressionEnabled;
    }
}
