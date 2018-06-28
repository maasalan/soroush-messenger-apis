package org.jivesoftware.smackx.pubsub;

import java.util.Collections;
import java.util.List;

public class ItemDeleteEvent extends SubscriptionEvent {
    private List<String> itemIds = Collections.emptyList();

    public ItemDeleteEvent(String str, List<String> list, List<String> list2) {
        super(str, list2);
        if (list == null) {
            throw new IllegalArgumentException("deletedItemIds cannot be null");
        }
        this.itemIds = list;
    }

    public List<String> getItemIds() {
        return Collections.unmodifiableList(this.itemIds);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName());
        stringBuilder.append("  [subscriptions: ");
        stringBuilder.append(getSubscriptions());
        stringBuilder.append("], [Deleted Items: ");
        stringBuilder.append(this.itemIds);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
