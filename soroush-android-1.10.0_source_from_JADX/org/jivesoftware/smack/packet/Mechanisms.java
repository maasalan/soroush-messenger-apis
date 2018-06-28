package org.jivesoftware.smack.packet;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.jivesoftware.smack.util.XmlStringBuilder;

public class Mechanisms implements ExtensionElement {
    public static final String ELEMENT = "mechanisms";
    public static final String NAMESPACE = "urn:ietf:params:xml:ns:xmpp-sasl";
    public final List<String> mechanisms = new LinkedList();

    public Mechanisms(String str) {
        this.mechanisms.add(str);
    }

    public Mechanisms(Collection<String> collection) {
        this.mechanisms.addAll(collection);
    }

    public String getElementName() {
        return ELEMENT;
    }

    public List<String> getMechanisms() {
        return Collections.unmodifiableList(this.mechanisms);
    }

    public String getNamespace() {
        return "urn:ietf:params:xml:ns:xmpp-sasl";
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.rightAngleBracket();
        for (String element : this.mechanisms) {
            xmlStringBuilder.element("mechanism", element);
        }
        xmlStringBuilder.closeElement((NamedElement) this);
        return xmlStringBuilder;
    }
}
