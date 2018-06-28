package org.jivesoftware.smack.filter;

import org.jivesoftware.smack.packet.Message;

public final class MessageWithBodiesFilter extends FlexibleStanzaTypeFilter<Message> {
    public static final StanzaFilter INSTANCE = new MessageWithBodiesFilter();

    private MessageWithBodiesFilter() {
        super(Message.class);
    }

    protected final boolean acceptSpecific(Message message) {
        return !message.getBodies().isEmpty();
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
