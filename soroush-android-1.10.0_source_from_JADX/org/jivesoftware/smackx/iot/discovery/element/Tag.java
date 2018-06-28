package org.jivesoftware.smackx.iot.discovery.element;

import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.util.Objects;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;

public class Tag implements NamedElement {
    private final String name;
    private final Type type;
    private final String value;

    public enum Type {
        str,
        num
    }

    public Tag(String str, Type type, String str2) {
        this.name = (String) StringUtils.requireNotNullOrEmpty(str, "name must not be null or empty");
        this.type = (Type) Objects.requireNonNull(type);
        this.value = (String) StringUtils.requireNotNullOrEmpty(str2, "value must not be null or empty");
        if (this.name.length() > 32) {
            throw new IllegalArgumentException("Meta Tag names must not be longer then 32 characters (XEP-0347 § 5.2");
        } else if (this.type == Type.str && this.value.length() > 128) {
            throw new IllegalArgumentException("Meta Tag string values must not be longer then 128 characters (XEP-0347 § 5.2");
        }
    }

    public String getElementName() {
        return getType().toString();
    }

    public String getName() {
        return this.name;
    }

    public Type getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.name);
        stringBuilder.append('(');
        stringBuilder.append(this.type);
        stringBuilder.append("):");
        stringBuilder.append(this.value);
        return stringBuilder.toString();
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
        xmlStringBuilder.attribute("name", this.name);
        xmlStringBuilder.attribute("value", this.value);
        xmlStringBuilder.closeEmptyElement();
        return xmlStringBuilder;
    }
}
