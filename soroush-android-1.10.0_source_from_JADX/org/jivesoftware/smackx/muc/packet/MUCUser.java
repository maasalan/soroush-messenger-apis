package org.jivesoftware.smackx.muc.packet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.b.a.e;
import org.b.a.f;
import org.b.a.g;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;

public class MUCUser implements ExtensionElement {
    public static final String ELEMENT = "x";
    public static final String NAMESPACE = "http://jabber.org/protocol/muc#user";
    private Decline decline;
    private Destroy destroy;
    private Invite invite;
    private MUCItem item;
    private String password;
    private final Set<Status> statusCodes = new HashSet(4);

    public static class Decline implements NamedElement {
        public static final String ELEMENT = "decline";
        private final e from;
        private final String reason;
        private final e to;

        public Decline(String str, e eVar) {
            this(str, null, eVar);
        }

        public Decline(String str, e eVar, e eVar2) {
            this.reason = str;
            this.from = eVar;
            this.to = eVar2;
        }

        public String getElementName() {
            return ELEMENT;
        }

        public e getFrom() {
            return this.from;
        }

        public String getReason() {
            return this.reason;
        }

        public e getTo() {
            return this.to;
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
            xmlStringBuilder.optAttribute(PrivacyItem.SUBSCRIPTION_TO, getTo());
            xmlStringBuilder.optAttribute(PrivacyItem.SUBSCRIPTION_FROM, getFrom());
            xmlStringBuilder.rightAngleBracket();
            xmlStringBuilder.optElement("reason", getReason());
            xmlStringBuilder.closeElement((NamedElement) this);
            return xmlStringBuilder;
        }
    }

    public static class Invite implements NamedElement {
        public static final String ELEMENT = "invite";
        private final g from;
        private final String reason;
        private final e to;

        public Invite(String str, e eVar) {
            this(str, null, eVar);
        }

        public Invite(String str, f fVar) {
            this(str, fVar, null);
        }

        public Invite(String str, g gVar, e eVar) {
            this.reason = str;
            this.from = gVar;
            this.to = eVar;
        }

        public String getElementName() {
            return ELEMENT;
        }

        public g getFrom() {
            return this.from;
        }

        public String getReason() {
            return this.reason;
        }

        public e getTo() {
            return this.to;
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
            xmlStringBuilder.optAttribute(PrivacyItem.SUBSCRIPTION_TO, getTo());
            xmlStringBuilder.optAttribute(PrivacyItem.SUBSCRIPTION_FROM, getFrom());
            xmlStringBuilder.rightAngleBracket();
            xmlStringBuilder.optElement("reason", getReason());
            xmlStringBuilder.closeElement((NamedElement) this);
            return xmlStringBuilder;
        }
    }

    public static final class Status implements NamedElement {
        public static final Status BANNED_301 = create(Integer.valueOf(301));
        public static final String ELEMENT = "status";
        public static final Status KICKED_307 = create(Integer.valueOf(307));
        public static final Status NEW_NICKNAME_303 = create(Integer.valueOf(303));
        public static final Status PRESENCE_TO_SELF_110 = create(Integer.valueOf(110));
        public static final Status REMOVED_AFFIL_CHANGE_321 = create(Integer.valueOf(321));
        public static final Status ROOM_CREATED_201 = create(Integer.valueOf(201));
        private static final Map<Integer, Status> statusMap = new HashMap(8);
        private final Integer code;

        private Status(int i) {
            this.code = Integer.valueOf(i);
        }

        public static Status create(Integer num) {
            Status status = (Status) statusMap.get(num);
            if (status != null) {
                return status;
            }
            status = new Status(num.intValue());
            statusMap.put(num, status);
            return status;
        }

        public static Status create(String str) {
            return create(Integer.valueOf(str));
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof Status)) {
                return false;
            }
            return this.code.equals(Integer.valueOf(((Status) obj).getCode()));
        }

        public final int getCode() {
            return this.code.intValue();
        }

        public final String getElementName() {
            return ELEMENT;
        }

        public final int hashCode() {
            return this.code.intValue();
        }

        public final String toString() {
            return this.code.toString();
        }

        public final XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
            xmlStringBuilder.attribute(XHTMLText.CODE, getCode());
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }

    public static MUCUser from(Stanza stanza) {
        return (MUCUser) stanza.getExtension("x", NAMESPACE);
    }

    @Deprecated
    public static MUCUser getFrom(Stanza stanza) {
        return from(stanza);
    }

    public void addStatusCode(Status status) {
        this.statusCodes.add(status);
    }

    public void addStatusCodes(Set<Status> set) {
        this.statusCodes.addAll(set);
    }

    public Decline getDecline() {
        return this.decline;
    }

    public Destroy getDestroy() {
        return this.destroy;
    }

    public String getElementName() {
        return "x";
    }

    public Invite getInvite() {
        return this.invite;
    }

    public MUCItem getItem() {
        return this.item;
    }

    public String getNamespace() {
        return NAMESPACE;
    }

    public String getPassword() {
        return this.password;
    }

    public Set<Status> getStatus() {
        return this.statusCodes;
    }

    public boolean hasStatus() {
        return !this.statusCodes.isEmpty();
    }

    public void setDecline(Decline decline) {
        this.decline = decline;
    }

    public void setDestroy(Destroy destroy) {
        this.destroy = destroy;
    }

    public void setInvite(Invite invite) {
        this.invite = invite;
    }

    public void setItem(MUCItem mUCItem) {
        this.item = mUCItem;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.rightAngleBracket();
        xmlStringBuilder.optElement(getInvite());
        xmlStringBuilder.optElement(getDecline());
        xmlStringBuilder.optElement(getItem());
        xmlStringBuilder.optElement("password", getPassword());
        xmlStringBuilder.append(this.statusCodes);
        xmlStringBuilder.optElement(getDestroy());
        xmlStringBuilder.closeElement((NamedElement) this);
        return xmlStringBuilder;
    }
}
