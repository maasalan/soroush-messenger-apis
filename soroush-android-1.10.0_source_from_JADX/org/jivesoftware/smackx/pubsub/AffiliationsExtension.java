package org.jivesoftware.smackx.pubsub;

import java.util.Collections;
import java.util.List;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.iot.data.element.NodeElement;

public class AffiliationsExtension extends NodeExtension {
    protected List<Affiliation> items;
    private final String node;

    public AffiliationsExtension() {
        this(null, null);
    }

    public AffiliationsExtension(List<Affiliation> list) {
        this(list, null);
    }

    public AffiliationsExtension(List<Affiliation> list, String str) {
        super(PubSubElementType.AFFILIATIONS);
        this.items = Collections.emptyList();
        this.items = list;
        this.node = str;
    }

    public List<Affiliation> getAffiliations() {
        return this.items;
    }

    public CharSequence toXML() {
        if (this.items != null) {
            if (this.items.size() != 0) {
                CharSequence xmlStringBuilder = new XmlStringBuilder();
                xmlStringBuilder.openElement(getElementName());
                xmlStringBuilder.optAttribute(NodeElement.ELEMENT, this.node);
                xmlStringBuilder.rightAngleBracket();
                xmlStringBuilder.append(this.items);
                xmlStringBuilder.closeElement((NamedElement) this);
                return xmlStringBuilder;
            }
        }
        return super.toXML();
    }
}
