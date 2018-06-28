package org.jivesoftware.smackx.muc;

import java.util.Date;
import org.b.a.b.d;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.Presence.Type;
import org.jivesoftware.smack.util.Objects;
import org.jivesoftware.smackx.muc.packet.MUCInitialPresence;

public final class MucEnterConfiguration {
    private final Presence joinPresence;
    private final int maxChars;
    private final int maxStanzas;
    private final d nickname;
    private final String password;
    private final int seconds;
    private final Date since;
    private final long timeout;

    public static final class Builder {
        private Presence joinPresence;
        private int maxChars = -1;
        private int maxStanzas = -1;
        private final d nickname;
        private String password;
        private int seconds = -1;
        private Date since;
        private long timeout;

        Builder(d dVar, long j) {
            this.nickname = (d) Objects.requireNonNull(dVar, "Nickname must not be null");
            timeoutAfter(j);
        }

        public final MucEnterConfiguration build() {
            return new MucEnterConfiguration(this);
        }

        public final Builder requestHistorySince(int i) {
            this.seconds = i;
            return this;
        }

        public final Builder requestHistorySince(Date date) {
            this.since = date;
            return this;
        }

        public final Builder requestMaxCharsHistory(int i) {
            this.maxChars = i;
            return this;
        }

        public final Builder requestMaxStanzasHistory(int i) {
            this.maxStanzas = i;
            return this;
        }

        public final Builder requestNoHistory() {
            this.maxChars = 0;
            this.maxStanzas = -1;
            this.seconds = -1;
            this.since = null;
            return this;
        }

        public final Builder timeoutAfter(long j) {
            if (j <= 0) {
                throw new IllegalArgumentException("timeout must be positive");
            }
            this.timeout = j;
            return this;
        }

        public final Builder withPassword(String str) {
            this.password = str;
            return this;
        }

        public final Builder withPresence(Presence presence) {
            if (presence.getType() != Type.available) {
                throw new IllegalArgumentException("Presence must be of type 'available'");
            }
            this.joinPresence = presence;
            return this;
        }
    }

    MucEnterConfiguration(Builder builder) {
        this.nickname = builder.nickname;
        this.password = builder.password;
        this.maxChars = builder.maxChars;
        this.maxStanzas = builder.maxStanzas;
        this.seconds = builder.seconds;
        this.since = builder.since;
        this.timeout = builder.timeout;
        this.joinPresence = builder.joinPresence == null ? new Presence(Type.available) : builder.joinPresence.clone();
        this.joinPresence.addExtension(new MUCInitialPresence(this.password, this.maxChars, this.maxStanzas, this.seconds, this.since));
    }

    final Presence getJoinPresence(MultiUserChat multiUserChat) {
        this.joinPresence.setTo(org.b.a.a.d.a(multiUserChat.getRoom(), this.nickname));
        return this.joinPresence;
    }

    final long getTimeout() {
        return this.timeout;
    }
}
