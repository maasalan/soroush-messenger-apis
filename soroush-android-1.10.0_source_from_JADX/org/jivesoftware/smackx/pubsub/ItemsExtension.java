package org.jivesoftware.smackx.pubsub;

import java.util.List;
import org.jivesoftware.smack.packet.ExtensionElement;

public class ItemsExtension extends NodeExtension implements EmbeddedPacketExtension {
    protected List<? extends ExtensionElement> items;
    protected Boolean notify;
    protected ItemsElementType type;

    public enum ItemsElementType {
        items(PubSubElementType.ITEMS, "max_items"),
        retract(PubSubElementType.RETRACT, "notify");
        
        private final String att;
        private final PubSubElementType elem;

        private ItemsElementType(PubSubElementType pubSubElementType, String str) {
            this.elem = pubSubElementType;
            this.att = str;
        }

        public final String getElementAttribute() {
            return this.att;
        }

        public final PubSubElementType getNodeElement() {
            return this.elem;
        }
    }

    public ItemsExtension(String str, List<? extends ExtensionElement> list, boolean z) {
        super(ItemsElementType.retract.getNodeElement(), str);
        this.type = ItemsElementType.retract;
        this.items = list;
        this.notify = Boolean.valueOf(z);
    }

    public ItemsExtension(ItemsElementType itemsElementType, String str, List<? extends ExtensionElement> list) {
        super(itemsElementType.getNodeElement(), str);
        this.type = itemsElementType;
        this.items = list;
    }

    public List<ExtensionElement> getExtensions() {
        return getItems();
    }

    public List<? extends ExtensionElement> getItems() {
        return this.items;
    }

    public ItemsElementType getItemsElementType() {
        return this.type;
    }

    public boolean getNotify() {
        return this.notify.booleanValue();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName());
        stringBuilder.append("Content [");
        stringBuilder.append(toXML());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public CharSequence toXML() {
        if (this.items != null) {
            if (this.items.size() != 0) {
                StringBuilder stringBuilder = new StringBuilder("<");
                stringBuilder.append(getElementName());
                stringBuilder.append(" node='");
                stringBuilder.append(getNode());
                if (this.notify != null) {
                    stringBuilder.append("' ");
                    stringBuilder.append(this.type.getElementAttribute());
                    stringBuilder.append("='");
                    stringBuilder.append(this.notify.equals(Boolean.TRUE));
                    stringBuilder.append("'>");
                } else {
                    stringBuilder.append("'>");
                    for (ExtensionElement toXML : this.items) {
                        stringBuilder.append(toXML.toXML());
                    }
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
