package org.jivesoftware.smackx.pubsub.filter;

import org.jivesoftware.smack.filter.StanzaExtensionFilter;
import org.jivesoftware.smackx.pubsub.EventElement;

public final class EventExtensionFilter extends StanzaExtensionFilter {
    public static final EventExtensionFilter INSTANCE = new EventExtensionFilter();

    private EventExtensionFilter() {
        super(EventElement.ELEMENT, EventElement.NAMESPACE);
    }
}
