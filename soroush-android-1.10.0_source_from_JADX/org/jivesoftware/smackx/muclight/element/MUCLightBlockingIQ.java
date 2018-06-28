package org.jivesoftware.smackx.muclight.element;

import java.util.HashMap;
import java.util.Map.Entry;
import org.b.a.i;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smackx.muclight.element.MUCLightElements.BlockingElement;

public class MUCLightBlockingIQ extends IQ {
    public static final String ELEMENT = "query";
    public static final String NAMESPACE = "urn:xmpp:muclight:0#blocking";
    private final HashMap<i, Boolean> rooms;
    private final HashMap<i, Boolean> users;

    public MUCLightBlockingIQ(HashMap<i, Boolean> hashMap, HashMap<i, Boolean> hashMap2) {
        super("query", NAMESPACE);
        this.rooms = hashMap;
        this.users = hashMap2;
    }

    private void parseBlocking(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder, HashMap<i, Boolean> hashMap, boolean z) {
        for (Entry entry : hashMap.entrySet()) {
            iQChildElementXmlStringBuilder.element(new BlockingElement((i) entry.getKey(), (Boolean) entry.getValue(), Boolean.valueOf(z)));
        }
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        if (this.rooms != null) {
            parseBlocking(iQChildElementXmlStringBuilder, this.rooms, true);
        }
        if (this.users != null) {
            parseBlocking(iQChildElementXmlStringBuilder, this.users, false);
        }
        return iQChildElementXmlStringBuilder;
    }

    public HashMap<i, Boolean> getRooms() {
        return this.rooms;
    }

    public HashMap<i, Boolean> getUsers() {
        return this.users;
    }
}
