package org.jivesoftware.smack.packet;

import org.b.a.b.d;
import org.b.a.f;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.util.ParserUtils;

public final class Bind extends IQ {
    public static final String ELEMENT = "bind";
    public static final String NAMESPACE = "urn:ietf:params:xml:ns:xmpp-bind";
    private final f jid;
    private final d resource;

    public static final class Feature implements ExtensionElement {
        public static final Feature INSTANCE = new Feature();

        private Feature() {
        }

        public final String getElementName() {
            return Bind.ELEMENT;
        }

        public final String getNamespace() {
            return Bind.NAMESPACE;
        }

        public final String toXML() {
            return "<bind xmlns='urn:ietf:params:xml:ns:xmpp-bind'/>";
        }
    }

    private Bind(d dVar, f fVar) {
        super(ELEMENT, NAMESPACE);
        this.resource = dVar;
        this.jid = fVar;
    }

    public static Bind newResult(f fVar) {
        return new Bind(null, fVar);
    }

    public static Bind newSet(d dVar) {
        Bind bind = new Bind(dVar, null);
        bind.setType(Type.set);
        return bind;
    }

    protected final IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        iQChildElementXmlStringBuilder.optElement("resource", this.resource);
        iQChildElementXmlStringBuilder.optElement(ParserUtils.JID, this.jid);
        return iQChildElementXmlStringBuilder;
    }

    public final f getJid() {
        return this.jid;
    }

    public final d getResource() {
        return this.resource;
    }
}
