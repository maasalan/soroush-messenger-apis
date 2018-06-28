package org.jivesoftware.smackx.muc.packet;

import java.util.Date;
import org.b.c.a;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.util.XmlStringBuilder;

public class MUCInitialPresence implements ExtensionElement {
    public static final String ELEMENT = "x";
    public static final String NAMESPACE = "http://jabber.org/protocol/muc";
    private History history;
    private String password;

    public static class History implements NamedElement {
        public static final String ELEMENT = "history";
        private int maxChars;
        private int maxStanzas;
        private int seconds;
        private Date since;

        @Deprecated
        public History() {
            this.maxChars = -1;
            this.maxStanzas = -1;
            this.seconds = -1;
        }

        public History(int i, int i2, int i3, Date date) {
            if (i >= 0 || i2 >= 0 || i3 >= 0 || date != null) {
                this.maxChars = i;
                this.maxStanzas = i2;
                this.seconds = i3;
                this.since = date;
                return;
            }
            throw new IllegalArgumentException();
        }

        public String getElementName() {
            return ELEMENT;
        }

        public int getMaxChars() {
            return this.maxChars;
        }

        public int getMaxStanzas() {
            return this.maxStanzas;
        }

        public int getSeconds() {
            return this.seconds;
        }

        public Date getSince() {
            return this.since;
        }

        @Deprecated
        public void setMaxChars(int i) {
            this.maxChars = i;
        }

        @Deprecated
        public void setMaxStanzas(int i) {
            this.maxStanzas = i;
        }

        @Deprecated
        public void setSeconds(int i) {
            this.seconds = i;
        }

        @Deprecated
        public void setSince(Date date) {
            this.since = date;
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
            xmlStringBuilder.optIntAttribute("maxchars", getMaxChars());
            xmlStringBuilder.optIntAttribute("maxstanzas", getMaxStanzas());
            xmlStringBuilder.optIntAttribute("seconds", getSeconds());
            if (getSince() != null) {
                xmlStringBuilder.attribute("since", a.a(getSince()));
            }
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }

    public MUCInitialPresence(String str, int i, int i2, int i3, Date date) {
        History history;
        this.password = str;
        if (i < 0 && i2 < 0 && i3 < 0) {
            if (date == null) {
                history = null;
                this.history = history;
            }
        }
        history = new History(i, i2, i3, date);
        this.history = history;
    }

    public static MUCInitialPresence from(Stanza stanza) {
        return (MUCInitialPresence) stanza.getExtension("x", NAMESPACE);
    }

    @Deprecated
    public static MUCInitialPresence getFrom(Stanza stanza) {
        return from(stanza);
    }

    public String getElementName() {
        return "x";
    }

    public History getHistory() {
        return this.history;
    }

    public String getNamespace() {
        return NAMESPACE;
    }

    public String getPassword() {
        return this.password;
    }

    @Deprecated
    public void setHistory(History history) {
        this.history = history;
    }

    @Deprecated
    public void setPassword(String str) {
        this.password = str;
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.rightAngleBracket();
        xmlStringBuilder.optElement("password", getPassword());
        xmlStringBuilder.optElement(getHistory());
        xmlStringBuilder.closeElement((NamedElement) this);
        return xmlStringBuilder;
    }
}
