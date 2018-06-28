package org.jivesoftware.smackx.disco.packet;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.b.a.i;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.amp.packet.AMPExtension.Action;
import org.jivesoftware.smackx.iot.data.element.NodeElement;

public class DiscoverItems extends IQ {
    public static final String ELEMENT = "query";
    public static final String NAMESPACE = "http://jabber.org/protocol/disco#items";
    private final List<Item> items = new LinkedList();
    private String node;

    public static class Item {
        public static final String REMOVE_ACTION = "remove";
        public static final String UPDATE_ACTION = "update";
        private String action;
        private final i entityID;
        private String name;
        private String node;

        public Item(i iVar) {
            this.entityID = iVar;
        }

        public String getAction() {
            return this.action;
        }

        public i getEntityID() {
            return this.entityID;
        }

        public String getName() {
            return this.name;
        }

        public String getNode() {
            return this.node;
        }

        public void setAction(String str) {
            this.action = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setNode(String str) {
            this.node = str;
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
            xmlStringBuilder.halfOpenElement("item");
            xmlStringBuilder.attribute(ParserUtils.JID, this.entityID);
            xmlStringBuilder.optAttribute("name", this.name);
            xmlStringBuilder.optAttribute(NodeElement.ELEMENT, this.node);
            xmlStringBuilder.optAttribute(Action.ATTRIBUTE_NAME, this.action);
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }

    public DiscoverItems() {
        super("query", NAMESPACE);
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void addItems(Collection<Item> collection) {
        if (collection != null) {
            for (Item addItem : collection) {
                addItem(addItem);
            }
        }
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.optAttribute(NodeElement.ELEMENT, getNode());
        iQChildElementXmlStringBuilder.rightAngleBracket();
        for (Item toXML : this.items) {
            iQChildElementXmlStringBuilder.append(toXML.toXML());
        }
        return iQChildElementXmlStringBuilder;
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(this.items);
    }

    public String getNode() {
        return this.node;
    }

    public void setNode(String str) {
        this.node = str;
    }
}
