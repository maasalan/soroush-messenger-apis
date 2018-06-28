package org.jivesoftware.smackx.mam.filter;

import org.jivesoftware.smack.filter.FlexibleStanzaTypeFilter;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smackx.mam.element.MamElements.MamResultExtension;
import org.jivesoftware.smackx.mam.element.MamQueryIQ;

public class MamResultFilter extends FlexibleStanzaTypeFilter<Message> {
    private final String queryId;

    public MamResultFilter(MamQueryIQ mamQueryIQ) {
        super(Message.class);
        this.queryId = mamQueryIQ.getQueryId();
    }

    protected boolean acceptSpecific(Message message) {
        MamResultExtension from = MamResultExtension.from(message);
        if (from == null) {
            return false;
        }
        String queryId = from.getQueryId();
        return (this.queryId == null && queryId == null) || (this.queryId != null && this.queryId.equals(queryId));
    }
}
