package org.jivesoftware.smackx.pubsub;

import java.util.Collections;
import java.util.List;

public class SubscriptionsExtension extends NodeExtension {
    protected List<Subscription> items = Collections.emptyList();

    public SubscriptionsExtension(String str, List<Subscription> list) {
        super(PubSubElementType.SUBSCRIPTIONS, str);
        if (list != null) {
            this.items = list;
        }
    }

    public SubscriptionsExtension(List<Subscription> list) {
        super(PubSubElementType.SUBSCRIPTIONS);
        if (list != null) {
            this.items = list;
        }
    }

    public List<Subscription> getSubscriptions() {
        return this.items;
    }

    public CharSequence toXML() {
        if (this.items != null) {
            if (this.items.size() != 0) {
                StringBuilder stringBuilder = new StringBuilder("<");
                stringBuilder.append(getElementName());
                if (getNode() != null) {
                    stringBuilder.append(" node='");
                    stringBuilder.append(getNode());
                    stringBuilder.append('\'');
                }
                stringBuilder.append('>');
                for (Subscription toXML : this.items) {
                    stringBuilder.append(toXML.toXML());
                }
                stringBuilder.append("</");
                stringBuilder.append(getElementName());
                stringBuilder.append('>');
                return stringBuilder.toString();
            }
        }
        return super.toXML();
    }
}
