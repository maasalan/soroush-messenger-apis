package org.jivesoftware.smack.packet;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.b.c.b;
import org.jivesoftware.smack.util.MultiMap;
import org.jivesoftware.smack.util.Objects;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;

public final class StandardExtensionElement implements ExtensionElement {
    private final Map<String, String> attributes;
    private final MultiMap<String, StandardExtensionElement> elements;
    private final String name;
    private final String namespace;
    private final String text;
    private XmlStringBuilder xmlCache;

    public static final class Builder {
        private Map<String, String> attributes;
        private MultiMap<String, StandardExtensionElement> elements;
        private final String name;
        private final String namespace;
        private String text;

        private Builder(String str, String str2) {
            this.name = str;
            this.namespace = str2;
        }

        public final Builder addAttribute(String str, String str2) {
            StringUtils.requireNotNullOrEmpty(str, "Attribute name must be set");
            Objects.requireNonNull(str2, "Attribute value must be not null");
            if (this.attributes == null) {
                this.attributes = new LinkedHashMap();
            }
            this.attributes.put(str, str2);
            return this;
        }

        public final Builder addAttributes(Map<String, String> map) {
            if (this.attributes == null) {
                this.attributes = new LinkedHashMap(map.size());
            }
            this.attributes.putAll(map);
            return this;
        }

        public final Builder addElement(String str, String str2) {
            return addElement(StandardExtensionElement.builder(str, this.namespace).setText(str2).build());
        }

        public final Builder addElement(StandardExtensionElement standardExtensionElement) {
            Objects.requireNonNull(standardExtensionElement, "Element must not be null");
            if (this.elements == null) {
                this.elements = new MultiMap();
            }
            this.elements.put(b.a(standardExtensionElement.getElementName(), standardExtensionElement.getNamespace()), standardExtensionElement);
            return this;
        }

        public final StandardExtensionElement build() {
            return new StandardExtensionElement(this.name, this.namespace, this.attributes, this.text, this.elements);
        }

        public final Builder setText(String str) {
            this.text = (String) Objects.requireNonNull(str, "Text must be not null");
            return this;
        }
    }

    public StandardExtensionElement(String str, String str2) {
        this(str, str2, null, null, null);
    }

    private StandardExtensionElement(String str, String str2, Map<String, String> map, String str3, MultiMap<String, StandardExtensionElement> multiMap) {
        this.name = (String) StringUtils.requireNotNullOrEmpty(str, "Name must not be null or empty");
        this.namespace = (String) StringUtils.requireNotNullOrEmpty(str2, "Namespace must not be null or empty");
        if (map == null) {
            this.attributes = Collections.emptyMap();
        } else {
            this.attributes = map;
        }
        this.text = str3;
        this.elements = multiMap;
    }

    public static Builder builder(String str, String str2) {
        return new Builder(str, str2);
    }

    public final String getAttributeValue(String str) {
        return (String) this.attributes.get(str);
    }

    public final Map<String, String> getAttributes() {
        return Collections.unmodifiableMap(this.attributes);
    }

    public final String getElementName() {
        return this.name;
    }

    public final List<StandardExtensionElement> getElements() {
        return this.elements == null ? Collections.emptyList() : this.elements.values();
    }

    public final List<StandardExtensionElement> getElements(String str) {
        return getElements(str, this.namespace);
    }

    public final List<StandardExtensionElement> getElements(String str, String str2) {
        if (this.elements == null) {
            return null;
        }
        return this.elements.getAll(b.a(str, str2));
    }

    public final StandardExtensionElement getFirstElement(String str) {
        return getFirstElement(str, this.namespace);
    }

    public final StandardExtensionElement getFirstElement(String str, String str2) {
        if (this.elements == null) {
            return null;
        }
        return (StandardExtensionElement) this.elements.getFirst(b.a(str, str2));
    }

    public final String getNamespace() {
        return this.namespace;
    }

    public final String getText() {
        return this.text;
    }

    public final XmlStringBuilder toXML() {
        return toXML(null);
    }

    public final XmlStringBuilder toXML(String str) {
        if (this.xmlCache != null) {
            return this.xmlCache;
        }
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder(this, str);
        for (Entry entry : this.attributes.entrySet()) {
            xmlStringBuilder.attribute((String) entry.getKey(), (String) entry.getValue());
        }
        xmlStringBuilder.rightAngleBracket();
        xmlStringBuilder.optEscape(this.text);
        if (this.elements != null) {
            for (Entry entry2 : this.elements.entrySet()) {
                xmlStringBuilder.append(((StandardExtensionElement) entry2.getValue()).toXML(getNamespace()));
            }
        }
        xmlStringBuilder.closeElement((NamedElement) this);
        this.xmlCache = xmlStringBuilder;
        return xmlStringBuilder;
    }
}
