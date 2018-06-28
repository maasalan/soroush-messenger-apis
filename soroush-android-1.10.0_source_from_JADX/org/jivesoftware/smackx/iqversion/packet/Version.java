package org.jivesoftware.smackx.iqversion.packet;

import org.b.a.i;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.util.StringUtils;

public class Version extends IQ {
    public static final String ELEMENT = "query";
    public static final String NAMESPACE = "jabber:iq:version";
    private final String name;
    private String os;
    private final String version;

    public Version() {
        super("query", NAMESPACE);
        this.name = null;
        this.version = null;
        setType(Type.get);
    }

    public Version(String str, String str2) {
        this(str, str2, null);
    }

    public Version(String str, String str2, String str3) {
        super("query", NAMESPACE);
        setType(Type.result);
        this.name = (String) StringUtils.requireNotNullOrEmpty(str, "name must not be null");
        this.version = (String) StringUtils.requireNotNullOrEmpty(str2, "version must not be null");
        this.os = str3;
    }

    public Version(i iVar) {
        this();
        setTo(iVar);
    }

    public Version(Version version) {
        this(version.name, version.version, version.os);
    }

    public static Version createResultFor(Stanza stanza, Version version) {
        Version version2 = new Version(version);
        version2.setStanzaId(stanza.getStanzaId());
        version2.setTo(stanza.getFrom());
        return version2;
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        iQChildElementXmlStringBuilder.optElement("name", this.name);
        iQChildElementXmlStringBuilder.optElement("version", this.version);
        iQChildElementXmlStringBuilder.optElement("os", this.os);
        return iQChildElementXmlStringBuilder;
    }

    public String getName() {
        return this.name;
    }

    public String getOs() {
        return this.os;
    }

    public String getVersion() {
        return this.version;
    }

    public void setOs(String str) {
        this.os = str;
    }
}
