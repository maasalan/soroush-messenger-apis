package org.jivesoftware.smackx.iqregister.packet;

import java.util.Map;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;

public class Registration extends IQ {
    public static final String ELEMENT = "query";
    public static final String NAMESPACE = "jabber:iq:register";
    private final Map<String, String> attributes;
    private final String instructions;

    public static final class Feature implements ExtensionElement {
        public static final String ELEMENT = "register";
        public static final Feature INSTANCE = new Feature();
        public static final String NAMESPACE = "http://jabber.org/features/iq-register";

        private Feature() {
        }

        public final String getElementName() {
            return "register";
        }

        public final String getNamespace() {
            return NAMESPACE;
        }

        public final CharSequence toXML() {
            return "<register xmlns='http://jabber.org/features/iq-register'/>";
        }
    }

    public Registration() {
        this(null);
    }

    public Registration(String str, Map<String, String> map) {
        super("query", NAMESPACE);
        this.instructions = str;
        this.attributes = map;
    }

    public Registration(Map<String, String> map) {
        this(null, map);
    }

    public Map<String, String> getAttributes() {
        return this.attributes;
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        iQChildElementXmlStringBuilder.optElement("instructions", this.instructions);
        if (this.attributes != null && this.attributes.size() > 0) {
            for (String str : this.attributes.keySet()) {
                iQChildElementXmlStringBuilder.element(str, (String) this.attributes.get(str));
            }
        }
        return iQChildElementXmlStringBuilder;
    }

    public String getInstructions() {
        return this.instructions;
    }
}
