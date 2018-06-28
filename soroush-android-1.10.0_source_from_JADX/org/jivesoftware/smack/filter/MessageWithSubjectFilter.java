package org.jivesoftware.smack.filter;

import org.jivesoftware.smack.packet.Message;

public final class MessageWithSubjectFilter extends FlexibleStanzaTypeFilter<Message> {
    public static final StanzaFilter INSTANCE = new MessageWithSubjectFilter();

    private MessageWithSubjectFilter() {
        super(Message.class);
    }

    protected final boolean acceptSpecific(Message message) {
        return message.getSubject() != null;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
