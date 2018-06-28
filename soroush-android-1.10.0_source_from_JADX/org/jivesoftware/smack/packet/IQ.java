package org.jivesoftware.smack.packet;

import java.util.Locale;
import org.jivesoftware.smack.packet.XMPPError.Builder;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smack.util.Objects;
import org.jivesoftware.smack.util.XmlStringBuilder;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public abstract class IQ extends Stanza {
    public static final String IQ_ELEMENT = "iq";
    public static final String QUERY_ELEMENT = "query";
    private final String childElementName;
    private final String childElementNamespace;
    private Type type;

    public enum Type {
        get,
        set,
        result,
        error;

        public static Type fromString(String str) {
            return valueOf(str.toLowerCase(Locale.US));
        }
    }

    public static class IQChildElementXmlStringBuilder extends XmlStringBuilder {
        private final String element;
        private boolean isEmptyElement;

        private IQChildElementXmlStringBuilder(String str, String str2) {
            prelude(str, str2);
            this.element = str;
        }

        public IQChildElementXmlStringBuilder(ExtensionElement extensionElement) {
            this(extensionElement.getElementName(), extensionElement.getNamespace());
        }

        private IQChildElementXmlStringBuilder(IQ iq) {
            this(iq.getChildElementName(), iq.getChildElementNamespace());
        }

        public void setEmptyElement() {
            this.isEmptyElement = true;
        }
    }

    protected IQ(String str) {
        this(str, null);
    }

    protected IQ(String str, String str2) {
        this.type = Type.get;
        this.childElementName = str;
        this.childElementNamespace = str2;
    }

    public IQ(IQ iq) {
        super((Stanza) iq);
        this.type = Type.get;
        this.type = iq.getType();
        this.childElementName = iq.childElementName;
        this.childElementNamespace = iq.childElementNamespace;
    }

    public static ErrorIQ createErrorResponse(IQ iq, Builder builder) {
        if (iq.getType() == Type.get || iq.getType() == Type.set) {
            Stanza errorIQ = new ErrorIQ(builder);
            errorIQ.setStanzaId(iq.getStanzaId());
            errorIQ.setFrom(iq.getTo());
            errorIQ.setTo(iq.getFrom());
            builder.setStanza(errorIQ);
            return errorIQ;
        }
        StringBuilder stringBuilder = new StringBuilder("IQ must be of type 'set' or 'get'. Original IQ: ");
        stringBuilder.append(iq.toXML());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static ErrorIQ createErrorResponse(IQ iq, Condition condition) {
        return createErrorResponse(iq, XMPPError.getBuilder(condition));
    }

    public static ErrorIQ createErrorResponse(IQ iq, XMPPError xMPPError) {
        return createErrorResponse(iq, XMPPError.getBuilder(xMPPError));
    }

    public static IQ createResultIQ(IQ iq) {
        return new EmptyResultIQ(iq);
    }

    public final String getChildElementName() {
        return this.childElementName;
    }

    public final String getChildElementNamespace() {
        return this.childElementNamespace;
    }

    public final XmlStringBuilder getChildElementXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
        if (this.type == Type.error) {
            appendErrorIfExists(xmlStringBuilder);
            return xmlStringBuilder;
        }
        if (this.childElementName != null) {
            XmlStringBuilder iQChildElementBuilder = getIQChildElementBuilder(new IQChildElementXmlStringBuilder());
            if (iQChildElementBuilder != null) {
                xmlStringBuilder.append(iQChildElementBuilder);
                XmlStringBuilder extensionsXML = getExtensionsXML();
                if (iQChildElementBuilder.isEmptyElement) {
                    if (extensionsXML.length() == 0) {
                        xmlStringBuilder.closeEmptyElement();
                        return xmlStringBuilder;
                    }
                    xmlStringBuilder.rightAngleBracket();
                }
                xmlStringBuilder.append(extensionsXML);
                xmlStringBuilder.closeElement(iQChildElementBuilder.element);
            }
        }
        return xmlStringBuilder;
    }

    public abstract IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder);

    public Type getType() {
        return this.type;
    }

    protected final void initialzeAsResultFor(IQ iq) {
        if (iq.getType() == Type.get || iq.getType() == Type.set) {
            setStanzaId(iq.getStanzaId());
            setFrom(iq.getTo());
            setTo(iq.getFrom());
            setType(Type.result);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("IQ must be of type 'set' or 'get'. Original IQ: ");
        stringBuilder.append(iq.toXML());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public boolean isRequestIQ() {
        switch (this.type) {
            case get:
            case set:
                return true;
            default:
                return false;
        }
    }

    public void setType(Type type) {
        this.type = (Type) Objects.requireNonNull(type, "type must not be null");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IQ Stanza (");
        stringBuilder.append(getChildElementName());
        stringBuilder.append(' ');
        stringBuilder.append(getChildElementNamespace());
        stringBuilder.append(") [");
        logCommonAttributes(stringBuilder);
        stringBuilder.append("type=");
        stringBuilder.append(this.type);
        stringBuilder.append(',');
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final XmlStringBuilder toXML() {
        String str;
        String str2;
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
        xmlStringBuilder.halfOpenElement(IQ_ELEMENT);
        addCommonAttributes(xmlStringBuilder);
        if (this.type == null) {
            str = IjkMediaMeta.IJKM_KEY_TYPE;
            str2 = "get";
        } else {
            str = IjkMediaMeta.IJKM_KEY_TYPE;
            str2 = this.type.toString();
        }
        xmlStringBuilder.attribute(str, str2);
        xmlStringBuilder.rightAngleBracket();
        xmlStringBuilder.append(getChildElementXML());
        xmlStringBuilder.closeElement(IQ_ELEMENT);
        return xmlStringBuilder;
    }
}
