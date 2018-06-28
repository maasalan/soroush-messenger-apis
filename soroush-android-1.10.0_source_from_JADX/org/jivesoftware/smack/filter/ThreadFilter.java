package org.jivesoftware.smack.filter;

import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.util.StringUtils;

public class ThreadFilter extends FlexibleStanzaTypeFilter<Message> implements StanzaFilter {
    private final String thread;

    public ThreadFilter(String str) {
        StringUtils.requireNotNullOrEmpty(str, "Thread must not be null or empty.");
        this.thread = str;
    }

    protected boolean acceptSpecific(Message message) {
        return this.thread.equals(message.getThread());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(": thread=");
        stringBuilder.append(this.thread);
        return stringBuilder.toString();
    }
}
