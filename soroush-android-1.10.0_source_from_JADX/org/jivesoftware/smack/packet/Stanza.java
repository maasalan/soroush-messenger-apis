package org.jivesoftware.smack.packet;

import java.util.Collection;
import java.util.List;
import java.util.Locale;
import org.b.a.a.d;
import org.b.a.i;
import org.b.c.b;
import org.jivesoftware.smack.packet.XMPPError.Builder;
import org.jivesoftware.smack.packet.id.StanzaIdUtil;
import org.jivesoftware.smack.util.MultiMap;
import org.jivesoftware.smack.util.PacketUtil;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.message_correct.element.MessageCorrectExtension;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;

public abstract class Stanza implements TopLevelStreamElement {
    protected static final String DEFAULT_LANGUAGE = Locale.getDefault().getLanguage().toLowerCase(Locale.US);
    public static final String ITEM = "item";
    public static final String TEXT = "text";
    private XMPPError error;
    private i from;
    private String id;
    protected String language;
    private final MultiMap<String, ExtensionElement> packetExtensions;
    private i to;

    protected Stanza() {
        this(StanzaIdUtil.newStanzaId());
    }

    protected Stanza(String str) {
        this.packetExtensions = new MultiMap();
        this.id = null;
        this.error = null;
        setStanzaId(str);
    }

    protected Stanza(Stanza stanza) {
        this.packetExtensions = new MultiMap();
        this.id = null;
        this.error = null;
        this.id = stanza.getStanzaId();
        this.to = stanza.getTo();
        this.from = stanza.getFrom();
        this.error = stanza.error;
        for (ExtensionElement addExtension : stanza.getExtensions()) {
            addExtension(addExtension);
        }
    }

    public static String getDefaultLanguage() {
        return DEFAULT_LANGUAGE;
    }

    protected void addCommonAttributes(XmlStringBuilder xmlStringBuilder) {
        xmlStringBuilder.optAttribute(PrivacyItem.SUBSCRIPTION_TO, getTo());
        xmlStringBuilder.optAttribute(PrivacyItem.SUBSCRIPTION_FROM, getFrom());
        xmlStringBuilder.optAttribute(MessageCorrectExtension.ID_TAG, getStanzaId());
        xmlStringBuilder.xmllangAttribute(getLanguage());
    }

    public void addExtension(ExtensionElement extensionElement) {
        if (extensionElement != null) {
            String a = b.a(extensionElement.getElementName(), extensionElement.getNamespace());
            synchronized (this.packetExtensions) {
                this.packetExtensions.put(a, extensionElement);
            }
        }
    }

    public void addExtensions(Collection<ExtensionElement> collection) {
        if (collection != null) {
            for (ExtensionElement addExtension : collection) {
                addExtension(addExtension);
            }
        }
    }

    protected void appendErrorIfExists(XmlStringBuilder xmlStringBuilder) {
        XMPPError error = getError();
        if (error != null) {
            xmlStringBuilder.append(error.toXML());
        }
    }

    public XMPPError getError() {
        return this.error;
    }

    public ExtensionElement getExtension(String str) {
        return PacketUtil.extensionElementFrom(getExtensions(), null, str);
    }

    public <PE extends ExtensionElement> PE getExtension(String str, String str2) {
        if (str2 == null) {
            return null;
        }
        ExtensionElement extensionElement;
        str = b.a(str, str2);
        synchronized (this.packetExtensions) {
            extensionElement = (ExtensionElement) this.packetExtensions.getFirst(str);
        }
        return extensionElement == null ? null : extensionElement;
    }

    public List<ExtensionElement> getExtensions() {
        List<ExtensionElement> values;
        synchronized (this.packetExtensions) {
            values = this.packetExtensions.values();
        }
        return values;
    }

    public List<ExtensionElement> getExtensions(String str, String str2) {
        StringUtils.requireNotNullOrEmpty(str, "elementName must not be null or empty");
        StringUtils.requireNotNullOrEmpty(str2, "namespace must not be null or empty");
        return this.packetExtensions.getAll(b.a(str, str2));
    }

    protected final XmlStringBuilder getExtensionsXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
        for (ExtensionElement toXML : getExtensions()) {
            xmlStringBuilder.append(toXML.toXML());
        }
        return xmlStringBuilder;
    }

    public i getFrom() {
        return this.from;
    }

    public String getLanguage() {
        return this.language;
    }

    @Deprecated
    public String getPacketID() {
        return getStanzaId();
    }

    public String getStanzaId() {
        return this.id;
    }

    public i getTo() {
        return this.to;
    }

    public boolean hasExtension(String str) {
        synchronized (this.packetExtensions) {
            for (ExtensionElement namespace : this.packetExtensions.values()) {
                if (namespace.getNamespace().equals(str)) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean hasExtension(String str, String str2) {
        if (str == null) {
            return hasExtension(str2);
        }
        boolean containsKey;
        str = b.a(str, str2);
        synchronized (this.packetExtensions) {
            containsKey = this.packetExtensions.containsKey(str);
        }
        return containsKey;
    }

    public boolean hasStanzaIdSet() {
        return this.id != null;
    }

    protected void logCommonAttributes(StringBuilder stringBuilder) {
        if (getTo() != null) {
            stringBuilder.append("to=");
            stringBuilder.append(this.to);
            stringBuilder.append(',');
        }
        if (getFrom() != null) {
            stringBuilder.append("from=");
            stringBuilder.append(this.from);
            stringBuilder.append(',');
        }
        if (hasStanzaIdSet()) {
            stringBuilder.append("id=");
            stringBuilder.append(this.id);
            stringBuilder.append(',');
        }
    }

    public ExtensionElement overrideExtension(ExtensionElement extensionElement) {
        if (extensionElement == null) {
            return null;
        }
        ExtensionElement removeExtension;
        synchronized (this.packetExtensions) {
            removeExtension = removeExtension(extensionElement);
            addExtension(extensionElement);
        }
        return removeExtension;
    }

    public ExtensionElement removeExtension(String str, String str2) {
        ExtensionElement extensionElement;
        str = b.a(str, str2);
        synchronized (this.packetExtensions) {
            extensionElement = (ExtensionElement) this.packetExtensions.remove(str);
        }
        return extensionElement;
    }

    public ExtensionElement removeExtension(ExtensionElement extensionElement) {
        return removeExtension(extensionElement.getElementName(), extensionElement.getNamespace());
    }

    public void setError(Builder builder) {
        if (builder != null) {
            builder.setStanza(this);
            this.error = builder.build();
        }
    }

    @Deprecated
    public void setError(XMPPError xMPPError) {
        this.error = xMPPError;
    }

    @Deprecated
    public void setFrom(String str) {
        try {
            setFrom(d.a(str));
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    public void setFrom(i iVar) {
        this.from = iVar;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    @Deprecated
    public void setPacketID(String str) {
        setStanzaId(str);
    }

    public String setStanzaId() {
        if (!hasStanzaIdSet()) {
            setStanzaId(StanzaIdUtil.newStanzaId());
        }
        return getStanzaId();
    }

    public void setStanzaId(String str) {
        if (str != null) {
            StringUtils.requireNotNullOrEmpty(str, "id must either be null or not the empty String");
        }
        this.id = str;
    }

    @Deprecated
    public void setTo(String str) {
        try {
            setTo(d.a(str));
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    public void setTo(i iVar) {
        this.to = iVar;
    }

    public abstract String toString();
}
