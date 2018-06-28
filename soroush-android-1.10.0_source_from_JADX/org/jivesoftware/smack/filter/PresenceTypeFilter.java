package org.jivesoftware.smack.filter;

import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.Presence.Type;
import org.jivesoftware.smack.util.Objects;

public final class PresenceTypeFilter extends FlexibleStanzaTypeFilter<Presence> {
    public static final PresenceTypeFilter AVAILABLE = new PresenceTypeFilter(Type.available);
    public static final PresenceTypeFilter ERROR = new PresenceTypeFilter(Type.error);
    public static final StanzaFilter OUTGOING_PRESENCE_BROADCAST = new AndFilter(AVAILABLE, EmptyToMatcher.INSTANCE);
    public static final PresenceTypeFilter PROBE = new PresenceTypeFilter(Type.probe);
    public static final PresenceTypeFilter SUBSCRIBE = new PresenceTypeFilter(Type.subscribe);
    public static final PresenceTypeFilter SUBSCRIBED = new PresenceTypeFilter(Type.subscribed);
    public static final PresenceTypeFilter UNAVAILABLE = new PresenceTypeFilter(Type.unavailable);
    public static final PresenceTypeFilter UNSUBSCRIBE = new PresenceTypeFilter(Type.unsubscribe);
    public static final PresenceTypeFilter UNSUBSCRIBED = new PresenceTypeFilter(Type.unsubscribed);
    private final Type type;

    private PresenceTypeFilter(Type type) {
        super(Presence.class);
        this.type = (Type) Objects.requireNonNull(type, "type must not be null");
    }

    protected final boolean acceptSpecific(Presence presence) {
        return presence.getType() == this.type;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(": type=");
        stringBuilder.append(this.type);
        return stringBuilder.toString();
    }
}
