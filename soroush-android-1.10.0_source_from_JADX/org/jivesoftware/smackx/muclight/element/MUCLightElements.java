package org.jivesoftware.smackx.muclight.element;

import java.util.HashMap;
import java.util.Map.Entry;
import org.b.a.i;
import org.jivesoftware.smack.packet.Element;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.amp.packet.AMPExtension.Action;
import org.jivesoftware.smackx.muclight.MUCLightAffiliation;
import org.jivesoftware.smackx.muclight.MUCLightRoomConfiguration;
import org.jivesoftware.smackx.pubsub.Affiliation;

public abstract class MUCLightElements {

    public static class BlockingElement implements Element {
        private Boolean allow;
        private Boolean isRoom;
        private i jid;

        public BlockingElement(i iVar, Boolean bool, Boolean bool2) {
            this.jid = iVar;
            this.allow = bool;
            this.isRoom = bool2;
        }

        public CharSequence toXML() {
            CharSequence xmlStringBuilder = new XmlStringBuilder();
            String str = this.isRoom.booleanValue() ? "room" : "user";
            xmlStringBuilder.halfOpenElement(str);
            xmlStringBuilder.attribute(Action.ATTRIBUTE_NAME, this.allow.booleanValue() ? "allow" : "deny");
            xmlStringBuilder.rightAngleBracket();
            xmlStringBuilder.escape(this.jid);
            xmlStringBuilder.closeElement(str);
            return xmlStringBuilder;
        }
    }

    public static class ConfigurationElement implements Element {
        private MUCLightRoomConfiguration configuration;

        public ConfigurationElement(MUCLightRoomConfiguration mUCLightRoomConfiguration) {
            this.configuration = mUCLightRoomConfiguration;
        }

        public CharSequence toXML() {
            CharSequence xmlStringBuilder = new XmlStringBuilder();
            xmlStringBuilder.openElement("configuration");
            xmlStringBuilder.element("roomname", this.configuration.getRoomName());
            xmlStringBuilder.optElement("subject", this.configuration.getSubject());
            if (this.configuration.getCustomConfigs() != null) {
                for (Entry entry : this.configuration.getCustomConfigs().entrySet()) {
                    xmlStringBuilder.element((String) entry.getKey(), (String) entry.getValue());
                }
            }
            xmlStringBuilder.closeElement("configuration");
            return xmlStringBuilder;
        }
    }

    public static class OccupantsElement implements Element {
        private HashMap<i, MUCLightAffiliation> occupants;

        public OccupantsElement(HashMap<i, MUCLightAffiliation> hashMap) {
            this.occupants = hashMap;
        }

        public CharSequence toXML() {
            CharSequence xmlStringBuilder = new XmlStringBuilder();
            xmlStringBuilder.openElement("occupants");
            for (Entry entry : this.occupants.entrySet()) {
                xmlStringBuilder.element(new UserWithAffiliationElement((i) entry.getKey(), (MUCLightAffiliation) entry.getValue()));
            }
            xmlStringBuilder.closeElement("occupants");
            return xmlStringBuilder;
        }
    }

    public static class UserWithAffiliationElement implements Element {
        private MUCLightAffiliation affiliation;
        private i user;

        public UserWithAffiliationElement(i iVar, MUCLightAffiliation mUCLightAffiliation) {
            this.user = iVar;
            this.affiliation = mUCLightAffiliation;
        }

        public CharSequence toXML() {
            CharSequence xmlStringBuilder = new XmlStringBuilder();
            xmlStringBuilder.halfOpenElement("user");
            xmlStringBuilder.attribute(Affiliation.ELEMENT, this.affiliation);
            xmlStringBuilder.rightAngleBracket();
            xmlStringBuilder.escape(this.user);
            xmlStringBuilder.closeElement("user");
            return xmlStringBuilder;
        }
    }

    public static class AffiliationsChangeExtension implements ExtensionElement {
        public static final String ELEMENT = "x";
        public static final String NAMESPACE = "urn:xmpp:muclight:0#affiliations";
        private final HashMap<i, MUCLightAffiliation> affiliations;
        private final String prevVersion;
        private final String version;

        public AffiliationsChangeExtension(HashMap<i, MUCLightAffiliation> hashMap, String str, String str2) {
            this.affiliations = hashMap;
            this.prevVersion = str;
            this.version = str2;
        }

        public static AffiliationsChangeExtension from(Message message) {
            return (AffiliationsChangeExtension) message.getExtension("x", "urn:xmpp:muclight:0#affiliations");
        }

        public HashMap<i, MUCLightAffiliation> getAffiliations() {
            return this.affiliations;
        }

        public String getElementName() {
            return "x";
        }

        public String getNamespace() {
            return "urn:xmpp:muclight:0#affiliations";
        }

        public String getPrevVersion() {
            return this.prevVersion;
        }

        public String getVersion() {
            return this.version;
        }

        public CharSequence toXML() {
            CharSequence xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
            xmlStringBuilder.rightAngleBracket();
            xmlStringBuilder.optElement("prev-version", this.prevVersion);
            xmlStringBuilder.optElement("version", this.version);
            for (Entry entry : this.affiliations.entrySet()) {
                xmlStringBuilder.element(new UserWithAffiliationElement((i) entry.getKey(), (MUCLightAffiliation) entry.getValue()));
            }
            xmlStringBuilder.closeElement((NamedElement) this);
            return xmlStringBuilder;
        }
    }

    public static class ConfigurationsChangeExtension implements ExtensionElement {
        public static final String ELEMENT = "x";
        public static final String NAMESPACE = "urn:xmpp:muclight:0#configuration";
        private final HashMap<String, String> customConfigs;
        private final String prevVersion;
        private final String roomName;
        private final String subject;
        private final String version;

        public ConfigurationsChangeExtension(String str, String str2, String str3, String str4, HashMap<String, String> hashMap) {
            this.prevVersion = str;
            this.version = str2;
            this.roomName = str3;
            this.subject = str4;
            this.customConfigs = hashMap;
        }

        public static ConfigurationsChangeExtension from(Message message) {
            return (ConfigurationsChangeExtension) message.getExtension("x", "urn:xmpp:muclight:0#configuration");
        }

        public HashMap<String, String> getCustomConfigs() {
            return this.customConfigs;
        }

        public String getElementName() {
            return "x";
        }

        public String getNamespace() {
            return "urn:xmpp:muclight:0#configuration";
        }

        public String getPrevVersion() {
            return this.prevVersion;
        }

        public String getRoomName() {
            return this.roomName;
        }

        public String getSubject() {
            return this.subject;
        }

        public String getVersion() {
            return this.version;
        }

        public CharSequence toXML() {
            CharSequence xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
            xmlStringBuilder.rightAngleBracket();
            xmlStringBuilder.optElement("prev-version", this.prevVersion);
            xmlStringBuilder.optElement("version", this.version);
            xmlStringBuilder.optElement("roomname", this.roomName);
            xmlStringBuilder.optElement("subject", this.subject);
            if (this.customConfigs != null) {
                for (Entry entry : this.customConfigs.entrySet()) {
                    xmlStringBuilder.element((String) entry.getKey(), (String) entry.getValue());
                }
            }
            xmlStringBuilder.closeElement((NamedElement) this);
            return xmlStringBuilder;
        }
    }
}
