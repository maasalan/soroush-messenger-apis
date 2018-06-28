package org.jivesoftware.smackx.muc.packet;

import org.b.a.b.d;
import org.b.a.i;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.muc.MUCAffiliation;
import org.jivesoftware.smackx.muc.MUCRole;
import org.jivesoftware.smackx.nick.packet.Nick;
import org.jivesoftware.smackx.pubsub.Affiliation;

public class MUCItem implements NamedElement {
    public static final String ELEMENT = "item";
    private final i actor;
    private final d actorNick;
    private final MUCAffiliation affiliation;
    private final i jid;
    private final d nick;
    private final String reason;
    private final MUCRole role;

    public MUCItem(MUCAffiliation mUCAffiliation) {
        this(mUCAffiliation, null, null, null, null, null, null);
    }

    public MUCItem(MUCAffiliation mUCAffiliation, i iVar) {
        this(mUCAffiliation, null, null, null, iVar, null, null);
    }

    public MUCItem(MUCAffiliation mUCAffiliation, i iVar, String str) {
        this(mUCAffiliation, null, null, str, iVar, null, null);
    }

    public MUCItem(MUCAffiliation mUCAffiliation, MUCRole mUCRole, i iVar, String str, i iVar2, d dVar, d dVar2) {
        this.affiliation = mUCAffiliation;
        this.role = mUCRole;
        this.actor = iVar;
        this.reason = str;
        this.jid = iVar2;
        this.nick = dVar;
        this.actorNick = dVar2;
    }

    public MUCItem(MUCRole mUCRole) {
        this(null, mUCRole, null, null, null, null, null);
    }

    public MUCItem(MUCRole mUCRole, d dVar) {
        this(null, mUCRole, null, null, null, dVar, null);
    }

    public MUCItem(MUCRole mUCRole, d dVar, String str) {
        this(null, mUCRole, null, str, null, dVar, null);
    }

    public i getActor() {
        return this.actor;
    }

    public d getActorNick() {
        return this.actorNick;
    }

    public MUCAffiliation getAffiliation() {
        return this.affiliation;
    }

    public String getElementName() {
        return "item";
    }

    public i getJid() {
        return this.jid;
    }

    public d getNick() {
        return this.nick;
    }

    public String getReason() {
        return this.reason;
    }

    public MUCRole getRole() {
        return this.role;
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
        xmlStringBuilder.optAttribute(Affiliation.ELEMENT, getAffiliation());
        xmlStringBuilder.optAttribute(ParserUtils.JID, getJid());
        xmlStringBuilder.optAttribute(Nick.ELEMENT_NAME, getNick());
        xmlStringBuilder.optAttribute("role", getRole());
        xmlStringBuilder.rightAngleBracket();
        xmlStringBuilder.optElement("reason", getReason());
        if (getActor() != null) {
            xmlStringBuilder.halfOpenElement("actor").attribute(ParserUtils.JID, getActor()).closeEmptyElement();
        }
        xmlStringBuilder.closeElement("item");
        return xmlStringBuilder;
    }
}
