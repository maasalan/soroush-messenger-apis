package org.jivesoftware.smackx.pubsub;

import java.util.Collections;
import java.util.List;

public abstract class SubscriptionEvent extends NodeEvent {
    private List<String> subIds = Collections.emptyList();

    protected SubscriptionEvent(String str) {
        super(str);
    }

    protected SubscriptionEvent(String str, List<String> list) {
        super(str);
        if (list != null) {
            this.subIds = list;
        }
    }

    public List<String> getSubscriptions() {
        return Collections.unmodifiableList(this.subIds);
    }

    protected void setSubscriptions(List<String> list) {
        if (list != null) {
            this.subIds = list;
        }
    }
}
