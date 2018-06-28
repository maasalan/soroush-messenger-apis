package org.jivesoftware.smack.util;

import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import org.b.c.a;
import org.jivesoftware.smack.packet.Element;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.NamedElement;

public class XmlStringBuilder implements Appendable, CharSequence {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String RIGHT_ANGLE_BRACKET = Character.toString('>');
    private final LazyStringBuilder sb;

    public XmlStringBuilder() {
        this.sb = new LazyStringBuilder();
    }

    public XmlStringBuilder(ExtensionElement extensionElement) {
        this();
        prelude(extensionElement);
    }

    public XmlStringBuilder(ExtensionElement extensionElement, String str) {
        this();
        if (extensionElement.getNamespace().equals(str)) {
            halfOpenElement(extensionElement.getElementName());
        } else {
            prelude(extensionElement);
        }
    }

    public XmlStringBuilder(NamedElement namedElement) {
        this();
        halfOpenElement(namedElement.getElementName());
    }

    public XmlStringBuilder append(char c) {
        this.sb.append(c);
        return this;
    }

    public XmlStringBuilder append(CharSequence charSequence) {
        this.sb.append(charSequence);
        return this;
    }

    public XmlStringBuilder append(CharSequence charSequence, int i, int i2) {
        this.sb.append(charSequence, i, i2);
        return this;
    }

    public XmlStringBuilder append(Collection<? extends Element> collection) {
        for (Element toXML : collection) {
            append(toXML.toXML());
        }
        return this;
    }

    public XmlStringBuilder append(XmlStringBuilder xmlStringBuilder) {
        this.sb.append(xmlStringBuilder.sb);
        return this;
    }

    public XmlStringBuilder attribute(String str, int i) {
        return attribute(str, String.valueOf(i));
    }

    public XmlStringBuilder attribute(String str, CharSequence charSequence) {
        return attribute(str, charSequence.toString());
    }

    public XmlStringBuilder attribute(String str, Enum<?> enumR) {
        attribute(str, enumR.name());
        return this;
    }

    public XmlStringBuilder attribute(String str, String str2) {
        this.sb.append(' ').append((CharSequence) str).append((CharSequence) "='");
        escapeAttributeValue(str2);
        this.sb.append('\'');
        return this;
    }

    public XmlStringBuilder attribute(String str, Date date) {
        return attribute(str, a.a(date));
    }

    public XmlStringBuilder attribute(String str, boolean z) {
        return attribute(str, Boolean.toString(z));
    }

    public char charAt(int i) {
        return this.sb.charAt(i);
    }

    public XmlStringBuilder closeElement(String str) {
        this.sb.append((CharSequence) "</").append((CharSequence) str);
        rightAngleBracket();
        return this;
    }

    public XmlStringBuilder closeElement(NamedElement namedElement) {
        closeElement(namedElement.getElementName());
        return this;
    }

    public XmlStringBuilder closeEmptyElement() {
        this.sb.append((CharSequence) "/>");
        return this;
    }

    public XmlStringBuilder condAttribute(boolean z, String str, String str2) {
        if (z) {
            attribute(str, str2);
        }
        return this;
    }

    public XmlStringBuilder condEmptyElement(boolean z, String str) {
        if (z) {
            emptyElement(str);
        }
        return this;
    }

    public XmlStringBuilder element(String str, CharSequence charSequence) {
        return element(str, charSequence.toString());
    }

    public XmlStringBuilder element(String str, Enum<?> enumR) {
        element(str, enumR.name());
        return this;
    }

    public XmlStringBuilder element(String str, String str2) {
        openElement(str);
        escape(str2);
        closeElement(str);
        return this;
    }

    public XmlStringBuilder element(String str, Date date) {
        return element(str, a.a(date));
    }

    public XmlStringBuilder element(Element element) {
        return append(element.toXML());
    }

    public XmlStringBuilder emptyElement(Enum<?> enumR) {
        return emptyElement(enumR.name());
    }

    public XmlStringBuilder emptyElement(String str) {
        halfOpenElement(str);
        return closeEmptyElement();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CharSequence)) {
            return false;
        }
        return toString().equals(((CharSequence) obj).toString());
    }

    public XmlStringBuilder escape(CharSequence charSequence) {
        return escape(charSequence.toString());
    }

    public XmlStringBuilder escape(String str) {
        this.sb.append(StringUtils.escapeForXml(str));
        return this;
    }

    public XmlStringBuilder escapeAttributeValue(String str) {
        this.sb.append(StringUtils.escapeForXmlAttributeApos(str));
        return this;
    }

    public XmlStringBuilder escapedElement(String str, String str2) {
        openElement(str);
        append((CharSequence) str2);
        closeElement(str);
        return this;
    }

    public XmlStringBuilder halfOpenElement(String str) {
        this.sb.append('<').append((CharSequence) str);
        return this;
    }

    public XmlStringBuilder halfOpenElement(NamedElement namedElement) {
        return halfOpenElement(namedElement.getElementName());
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public int length() {
        return this.sb.length();
    }

    public XmlStringBuilder openElement(String str) {
        halfOpenElement(str).rightAngleBracket();
        return this;
    }

    public XmlStringBuilder optAppend(CharSequence charSequence) {
        if (charSequence != null) {
            append(charSequence);
        }
        return this;
    }

    public XmlStringBuilder optAppend(Element element) {
        if (element != null) {
            append(element.toXML());
        }
        return this;
    }

    public XmlStringBuilder optAttribute(String str, CharSequence charSequence) {
        if (charSequence != null) {
            attribute(str, charSequence.toString());
        }
        return this;
    }

    public XmlStringBuilder optAttribute(String str, Enum<?> enumR) {
        if (enumR != null) {
            attribute(str, enumR.toString());
        }
        return this;
    }

    public XmlStringBuilder optAttribute(String str, String str2) {
        if (str2 != null) {
            attribute(str, str2);
        }
        return this;
    }

    public XmlStringBuilder optAttribute(String str, Date date) {
        if (date != null) {
            attribute(str, date);
        }
        return this;
    }

    public XmlStringBuilder optBooleanAttribute(String str, boolean z) {
        if (z) {
            this.sb.append(' ').append((CharSequence) str).append((CharSequence) "='true'");
        }
        return this;
    }

    public XmlStringBuilder optBooleanAttributeDefaultTrue(String str, boolean z) {
        if (!z) {
            this.sb.append(' ').append((CharSequence) str).append((CharSequence) "='false'");
        }
        return this;
    }

    public XmlStringBuilder optElement(String str, CharSequence charSequence) {
        if (charSequence != null) {
            element(str, charSequence.toString());
        }
        return this;
    }

    public XmlStringBuilder optElement(String str, Enum<?> enumR) {
        if (enumR != null) {
            element(str, (Enum) enumR);
        }
        return this;
    }

    public XmlStringBuilder optElement(String str, Object obj) {
        if (obj != null) {
            element(str, obj.toString());
        }
        return this;
    }

    public XmlStringBuilder optElement(String str, String str2) {
        if (str2 != null) {
            element(str, str2);
        }
        return this;
    }

    public XmlStringBuilder optElement(String str, Date date) {
        if (date != null) {
            element(str, date);
        }
        return this;
    }

    public XmlStringBuilder optElement(Element element) {
        if (element != null) {
            append(element.toXML());
        }
        return this;
    }

    public XmlStringBuilder optEscape(CharSequence charSequence) {
        return charSequence == null ? this : escape(charSequence);
    }

    public XmlStringBuilder optIntAttribute(String str, int i) {
        if (i >= 0) {
            attribute(str, Integer.toString(i));
        }
        return this;
    }

    public XmlStringBuilder optIntElement(String str, int i) {
        if (i >= 0) {
            element(str, String.valueOf(i));
        }
        return this;
    }

    public XmlStringBuilder optLongAttribute(String str, Long l) {
        if (l != null && l.longValue() >= 0) {
            attribute(str, Long.toString(l.longValue()));
        }
        return this;
    }

    public XmlStringBuilder prelude(String str, String str2) {
        halfOpenElement(str);
        xmlnsAttribute(str2);
        return this;
    }

    public XmlStringBuilder prelude(ExtensionElement extensionElement) {
        return prelude(extensionElement.getElementName(), extensionElement.getNamespace());
    }

    @Deprecated
    public XmlStringBuilder rightAngelBracket() {
        return rightAngleBracket();
    }

    public XmlStringBuilder rightAngleBracket() {
        this.sb.append(RIGHT_ANGLE_BRACKET);
        return this;
    }

    public CharSequence subSequence(int i, int i2) {
        return this.sb.subSequence(i, i2);
    }

    public String toString() {
        return this.sb.toString();
    }

    public void write(Writer writer) {
        for (CharSequence charSequence : this.sb.getAsList()) {
            if (charSequence instanceof XmlStringBuilder) {
                ((XmlStringBuilder) charSequence).write(writer);
            } else {
                writer.write(charSequence.toString());
            }
        }
    }

    public XmlStringBuilder xmllangAttribute(String str) {
        optAttribute("xml:lang", str);
        return this;
    }

    public XmlStringBuilder xmlnsAttribute(String str) {
        optAttribute("xmlns", str);
        return this;
    }
}
