package org.jivesoftware.smackx.pubsub;

import org.b.a.a;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.iot.data.element.NodeElement;
import org.jivesoftware.smackx.pubsub.packet.PubSubNamespace;

public class Affiliation implements ExtensionElement {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String ELEMENT = "affiliation";
    private final Type affiliation;
    private final a jid;
    private final PubSubNamespace namespace;
    private final String node;

    public enum Type {
        member,
        none,
        outcast,
        owner,
        publisher
    }

    public Affiliation(String str, Type type) {
        this.node = (String) StringUtils.requireNotNullOrEmpty(str, "node must not be null or empty");
        this.affiliation = type;
        this.jid = null;
        this.namespace = type != null ? PubSubNamespace.BASIC : PubSubNamespace.OWNER;
    }

    public Affiliation(a aVar, Type type) {
        this(aVar, type, PubSubNamespace.OWNER);
    }

    public Affiliation(a aVar, Type type, PubSubNamespace pubSubNamespace) {
        this.jid = aVar;
        this.affiliation = type;
        this.node = null;
        this.namespace = pubSubNamespace;
    }

    public Type getAffiliation() {
        return this.affiliation;
    }

    public String getElementName() {
        return ELEMENT;
    }

    public a getJid() {
        return this.jid;
    }

    public String getNamespace() {
        return this.namespace.getXmlns();
    }

    public String getNode() {
        return this.node;
    }

    @Deprecated
    public String getNodeId() {
        return getNode();
    }

    public PubSubNamespace getPubSubNamespace() {
        return this.namespace;
    }

    @Deprecated
    public Type getType() {
        return getAffiliation();
    }

    public boolean isAffiliationModification() {
        return (this.jid == null || this.affiliation == null) ? false : true;
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.optAttribute(NodeElement.ELEMENT, this.node);
        xmlStringBuilder.optAttribute(ParserUtils.JID, this.jid);
        xmlStringBuilder.optAttribute(ELEMENT, this.affiliation);
        xmlStringBuilder.closeEmptyElement();
        return xmlStringBuilder;
    }
}
