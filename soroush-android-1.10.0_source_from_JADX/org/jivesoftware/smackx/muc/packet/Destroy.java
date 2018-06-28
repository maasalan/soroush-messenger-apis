package org.jivesoftware.smackx.muc.packet;

import java.io.Serializable;
import org.b.a.e;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;

public class Destroy implements Serializable, NamedElement {
    public static final String ELEMENT = "destroy";
    private static final long serialVersionUID = 1;
    private final e jid;
    private final String reason;

    public Destroy(e eVar, String str) {
        this.jid = eVar;
        this.reason = str;
    }

    public Destroy(Destroy destroy) {
        this(destroy.jid, destroy.reason);
    }

    public Destroy clone() {
        return new Destroy(this);
    }

    public String getElementName() {
        return ELEMENT;
    }

    public e getJid() {
        return this.jid;
    }

    public String getReason() {
        return this.reason;
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
        xmlStringBuilder.optAttribute(ParserUtils.JID, getJid());
        xmlStringBuilder.rightAngleBracket();
        xmlStringBuilder.optElement("reason", getReason());
        xmlStringBuilder.closeElement((NamedElement) this);
        return xmlStringBuilder;
    }
}
