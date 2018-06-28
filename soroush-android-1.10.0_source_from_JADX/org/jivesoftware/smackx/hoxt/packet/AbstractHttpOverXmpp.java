package org.jivesoftware.smackx.hoxt.packet;

import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.util.Objects;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.shim.packet.HeadersExtension;

public abstract class AbstractHttpOverXmpp extends IQ {
    public static final String NAMESPACE = "urn:xmpp:http";
    private final Data data;
    private final HeadersExtension headers;
    private final String version;

    public static abstract class Builder<B extends Builder<B, C>, C extends AbstractHttpOverXmpp> {
        private Data data;
        private HeadersExtension headers;
        private String version = "1.1";

        public abstract C build();

        protected abstract B getThis();

        public B setData(Data data) {
            this.data = data;
            return getThis();
        }

        public B setHeaders(HeadersExtension headersExtension) {
            this.headers = headersExtension;
            return getThis();
        }

        public B setVersion(String str) {
            this.version = str;
            return getThis();
        }
    }

    public static class Base64 implements NamedElement {
        public static final String ELEMENT = "base64";
        private final String text;

        public Base64(String str) {
            this.text = str;
        }

        public String getElementName() {
            return ELEMENT;
        }

        public String getText() {
            return this.text;
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
            xmlStringBuilder.rightAngleBracket();
            xmlStringBuilder.optAppend(this.text);
            xmlStringBuilder.closeElement((NamedElement) this);
            return xmlStringBuilder;
        }
    }

    public static class ChunkedBase64 implements NamedElement {
        public static final String ELEMENT = "chunkedBase64";
        private final String streamId;

        public ChunkedBase64(String str) {
            this.streamId = str;
        }

        public String getElementName() {
            return ELEMENT;
        }

        public String getStreamId() {
            return this.streamId;
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
            xmlStringBuilder.attribute(Base64BinaryChunk.ATTRIBUTE_STREAM_ID, this.streamId);
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }

    public static class Data implements NamedElement {
        public static final String ELEMENT = "data";
        private final NamedElement child;

        public Data(NamedElement namedElement) {
            this.child = namedElement;
        }

        public NamedElement getChild() {
            return this.child;
        }

        public String getElementName() {
            return "data";
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
            xmlStringBuilder.rightAngleBracket();
            xmlStringBuilder.element(this.child);
            xmlStringBuilder.closeElement((NamedElement) this);
            return xmlStringBuilder;
        }
    }

    public static class Ibb implements NamedElement {
        public static final String ELEMENT = "ibb";
        private final String sid;

        public Ibb(String str) {
            this.sid = str;
        }

        public String getElementName() {
            return ELEMENT;
        }

        public String getSid() {
            return this.sid;
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
            xmlStringBuilder.attribute("sid", this.sid);
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }

    public static class Text implements NamedElement {
        public static final String ELEMENT = "text";
        private final String text;

        public Text(String str) {
            this.text = str;
        }

        public String getElementName() {
            return "text";
        }

        public String getText() {
            return this.text;
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
            xmlStringBuilder.rightAngleBracket();
            xmlStringBuilder.optAppend(this.text);
            xmlStringBuilder.closeElement((NamedElement) this);
            return xmlStringBuilder;
        }
    }

    public static class Xml implements NamedElement {
        public static final String ELEMENT = "xml";
        private final String text;

        public Xml(String str) {
            this.text = str;
        }

        public String getElementName() {
            return ELEMENT;
        }

        public String getText() {
            return this.text;
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
            xmlStringBuilder.rightAngleBracket();
            xmlStringBuilder.optAppend(this.text);
            xmlStringBuilder.closeElement((NamedElement) this);
            return xmlStringBuilder;
        }
    }

    protected AbstractHttpOverXmpp(String str, Builder<?, ?> builder) {
        super(str, "urn:xmpp:http");
        this.headers = builder.headers;
        this.data = builder.data;
        this.version = (String) Objects.requireNonNull(builder.version, "version must not be null");
    }

    public Data getData() {
        return this.data;
    }

    public HeadersExtension getHeaders() {
        return this.headers;
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder = getIQHoxtChildElementBuilder(iQChildElementXmlStringBuilder);
        iQChildElementXmlStringBuilder.optAppend(this.headers);
        iQChildElementXmlStringBuilder.optAppend(this.data);
        return iQChildElementXmlStringBuilder;
    }

    protected abstract IQChildElementXmlStringBuilder getIQHoxtChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder);

    public String getVersion() {
        return this.version;
    }
}
