package org.jivesoftware.smackx.mam.element;

import java.util.List;
import org.b.a.i;
import org.jivesoftware.smack.packet.Element;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.forward.packet.Forwarded;
import org.jivesoftware.smackx.message_correct.element.MessageCorrectExtension;

public class MamElements {
    public static final String NAMESPACE = "urn:xmpp:mam:1";

    public static class AlwaysJidListElement implements Element {
        private final List<i> alwaysJids;

        AlwaysJidListElement(List<i> list) {
            this.alwaysJids = list;
        }

        public CharSequence toXML() {
            CharSequence xmlStringBuilder = new XmlStringBuilder();
            xmlStringBuilder.openElement("always");
            for (CharSequence element : this.alwaysJids) {
                xmlStringBuilder.element(ParserUtils.JID, element);
            }
            xmlStringBuilder.closeElement("always");
            return xmlStringBuilder;
        }
    }

    public static class NeverJidListElement implements Element {
        private List<i> neverJids;

        public NeverJidListElement(List<i> list) {
            this.neverJids = list;
        }

        public CharSequence toXML() {
            CharSequence xmlStringBuilder = new XmlStringBuilder();
            xmlStringBuilder.openElement("never");
            for (CharSequence element : this.neverJids) {
                xmlStringBuilder.element(ParserUtils.JID, element);
            }
            xmlStringBuilder.closeElement("never");
            return xmlStringBuilder;
        }
    }

    public static class MamResultExtension implements ExtensionElement {
        public static final String ELEMENT = "result";
        private final Forwarded forwarded;
        private final String id;
        private String queryId;

        public MamResultExtension(String str, String str2, Forwarded forwarded) {
            if (StringUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("id must not be null or empty");
            } else if (forwarded == null) {
                throw new IllegalArgumentException("forwarded must no be null");
            } else {
                this.id = str2;
                this.forwarded = forwarded;
                this.queryId = str;
            }
        }

        public static MamResultExtension from(Message message) {
            return (MamResultExtension) message.getExtension(ELEMENT, "urn:xmpp:mam:1");
        }

        public String getElementName() {
            return ELEMENT;
        }

        public Forwarded getForwarded() {
            return this.forwarded;
        }

        public String getId() {
            return this.id;
        }

        public final String getNamespace() {
            return "urn:xmpp:mam:1";
        }

        public final String getQueryId() {
            return this.queryId;
        }

        public CharSequence toXML() {
            CharSequence xmlStringBuilder = new XmlStringBuilder();
            xmlStringBuilder.halfOpenElement((NamedElement) this);
            xmlStringBuilder.xmlnsAttribute("urn:xmpp:mam:1");
            xmlStringBuilder.optAttribute("queryid", getQueryId());
            xmlStringBuilder.optAttribute(MessageCorrectExtension.ID_TAG, getId());
            xmlStringBuilder.rightAngleBracket();
            xmlStringBuilder.element(getForwarded());
            xmlStringBuilder.closeElement((NamedElement) this);
            return xmlStringBuilder;
        }
    }
}
