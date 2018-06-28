package org.jivesoftware.smack.filter;

import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.util.StringUtils;

@Deprecated
public class PacketIDFilter implements StanzaFilter {
    private final String packetID;

    @Deprecated
    public PacketIDFilter(String str) {
        StringUtils.requireNotNullOrEmpty(str, "Packet ID must not be null or empty.");
        this.packetID = str;
    }

    @Deprecated
    public PacketIDFilter(Stanza stanza) {
        this(stanza.getStanzaId());
    }

    public boolean accept(Stanza stanza) {
        return this.packetID.equals(stanza.getStanzaId());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(": id=");
        stringBuilder.append(this.packetID);
        return stringBuilder.toString();
    }
}
