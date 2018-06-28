package org.jivesoftware.smackx.iot.control.element;

import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.util.XmlStringBuilder;

public abstract class SetData implements NamedElement {
    private final String name;
    private final Type type;
    private final String value;

    public enum Type {
        BOOL,
        INT,
        LONG,
        DOUBLE;
        
        private final String toStringCache;

        public final String toString() {
            return this.toStringCache;
        }
    }

    protected SetData(String str, Type type, String str2) {
        this.name = str;
        this.type = type;
        this.value = str2;
    }

    public final String getElementName() {
        return getType().toString();
    }

    public final String getName() {
        return this.name;
    }

    public final Type getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public final XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
        xmlStringBuilder.attribute("name", this.name);
        xmlStringBuilder.attribute("value", this.value);
        xmlStringBuilder.closeEmptyElement();
        return xmlStringBuilder;
    }
}
