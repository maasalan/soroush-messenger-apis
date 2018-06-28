package org.jivesoftware.smackx.pubsub;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ItemPublishEvent<T extends Item> extends SubscriptionEvent {
    private List<T> items;
    private Date originalDate;

    public ItemPublishEvent(String str, List<T> list) {
        super(str);
        this.items = list;
    }

    public ItemPublishEvent(String str, List<T> list, List<String> list2) {
        super(str, list2);
        this.items = list;
    }

    public ItemPublishEvent(String str, List<T> list, List<String> list2, Date date) {
        super(str, list2);
        this.items = list;
        if (date != null) {
            this.originalDate = date;
        }
    }

    public List<T> getItems() {
        return Collections.unmodifiableList(this.items);
    }

    public Date getPublishedDate() {
        return this.originalDate;
    }

    public boolean isDelayed() {
        return this.originalDate != null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName());
        stringBuilder.append("  [subscriptions: ");
        stringBuilder.append(getSubscriptions());
        stringBuilder.append("], [Delayed: ");
        stringBuilder.append(isDelayed() ? this.originalDate.toString() : "false");
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
