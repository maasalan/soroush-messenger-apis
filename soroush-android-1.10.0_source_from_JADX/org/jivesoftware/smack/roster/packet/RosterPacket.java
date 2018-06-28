package org.jivesoftware.smack.roster.packet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.b.a.a;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.util.Objects;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;

public class RosterPacket extends IQ {
    public static final String ELEMENT = "query";
    public static final String NAMESPACE = "jabber:iq:roster";
    private final List<Item> rosterItems = new ArrayList();
    private String rosterVersion;

    public enum ItemType {
        none('⊥'),
        to('←'),
        from('→'),
        both('↔'),
        remove('⚡');
        
        private static final char ME = '●';
        private final String symbol;

        private ItemType(char c) {
            StringBuilder stringBuilder = new StringBuilder(2);
            stringBuilder.append(ME);
            stringBuilder.append(c);
            this.symbol = stringBuilder.toString();
        }

        public static ItemType fromString(String str) {
            return StringUtils.isNullOrEmpty((CharSequence) str) ? none : valueOf(str.toLowerCase(Locale.US));
        }

        public final String asSymbol() {
            return this.symbol;
        }
    }

    public static class Item implements NamedElement {
        public static final String ELEMENT = "item";
        public static final String GROUP = "group";
        private boolean approved;
        private final Set<String> groupNames;
        private ItemType itemType;
        private final a jid;
        private String name;
        private boolean subscriptionPending;

        public Item(a aVar, String str) {
            this(aVar, str, false);
        }

        public Item(a aVar, String str, boolean z) {
            this.itemType = ItemType.none;
            this.jid = (a) Objects.requireNonNull(aVar);
            this.name = str;
            this.subscriptionPending = z;
            this.groupNames = new CopyOnWriteArraySet();
        }

        public void addGroupName(String str) {
            this.groupNames.add(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Item item = (Item) obj;
            if (this.groupNames == null) {
                if (item.groupNames != null) {
                    return false;
                }
            } else if (!this.groupNames.equals(item.groupNames)) {
                return false;
            }
            if (this.subscriptionPending != item.subscriptionPending || this.itemType != item.itemType) {
                return false;
            }
            if (this.name == null) {
                if (item.name != null) {
                    return false;
                }
            } else if (!this.name.equals(item.name)) {
                return false;
            }
            if (this.jid == null) {
                if (item.jid != null) {
                    return false;
                }
            } else if (!this.jid.a(item.jid)) {
                return false;
            }
            return this.approved == item.approved;
        }

        public String getElementName() {
            return "item";
        }

        public Set<String> getGroupNames() {
            return Collections.unmodifiableSet(this.groupNames);
        }

        public ItemType getItemType() {
            return this.itemType;
        }

        public a getJid() {
            return this.jid;
        }

        public String getName() {
            return this.name;
        }

        @Deprecated
        public String getUser() {
            return this.jid.toString();
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((((((this.groupNames == null ? 0 : this.groupNames.hashCode()) + 31) * 31) + (this.subscriptionPending ^ 1)) * 31) + (this.itemType == null ? 0 : this.itemType.hashCode())) * 31) + (this.name == null ? 0 : this.name.hashCode())) * 31;
            if (this.jid != null) {
                i = this.jid.hashCode();
            }
            return (31 * (hashCode + i)) + this.approved;
        }

        public boolean isApproved() {
            return this.approved;
        }

        public boolean isSubscriptionPending() {
            return this.subscriptionPending;
        }

        public void removeGroupName(String str) {
            this.groupNames.remove(str);
        }

        public void setApproved(boolean z) {
            this.approved = z;
        }

        public void setItemType(ItemType itemType) {
            this.itemType = (ItemType) Objects.requireNonNull(itemType, "itemType must not be null");
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setSubscriptionPending(boolean z) {
            this.subscriptionPending = z;
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
            xmlStringBuilder.attribute(ParserUtils.JID, this.jid);
            xmlStringBuilder.optAttribute("name", this.name);
            xmlStringBuilder.optAttribute("subscription", this.itemType);
            if (this.subscriptionPending) {
                xmlStringBuilder.append((CharSequence) " ask='subscribe'");
            }
            xmlStringBuilder.optBooleanAttribute("approved", this.approved);
            xmlStringBuilder.rightAngleBracket();
            for (String escape : this.groupNames) {
                xmlStringBuilder.openElement(GROUP).escape(escape).closeElement(GROUP);
            }
            xmlStringBuilder.closeElement((NamedElement) this);
            return xmlStringBuilder;
        }
    }

    public RosterPacket() {
        super("query", NAMESPACE);
    }

    public void addRosterItem(Item item) {
        synchronized (this.rosterItems) {
            this.rosterItems.add(item);
        }
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.optAttribute(RosterVer.ELEMENT, this.rosterVersion);
        iQChildElementXmlStringBuilder.rightAngleBracket();
        synchronized (this.rosterItems) {
            for (Item toXML : this.rosterItems) {
                iQChildElementXmlStringBuilder.append(toXML.toXML());
            }
        }
        return iQChildElementXmlStringBuilder;
    }

    public int getRosterItemCount() {
        int size;
        synchronized (this.rosterItems) {
            size = this.rosterItems.size();
        }
        return size;
    }

    public List<Item> getRosterItems() {
        List arrayList;
        synchronized (this.rosterItems) {
            arrayList = new ArrayList(this.rosterItems);
        }
        return arrayList;
    }

    public String getVersion() {
        return this.rosterVersion;
    }

    public void setVersion(String str) {
        this.rosterVersion = str;
    }
}
