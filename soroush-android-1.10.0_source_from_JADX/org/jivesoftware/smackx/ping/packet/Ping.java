package org.jivesoftware.smackx.ping.packet;

import org.b.a.i;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.packet.SimpleIQ;

public class Ping extends SimpleIQ {
    public static final String ELEMENT = "ping";
    public static final String NAMESPACE = "urn:xmpp:ping";

    public Ping() {
        super(ELEMENT, NAMESPACE);
    }

    public Ping(i iVar) {
        this();
        setTo(iVar);
        setType(Type.get);
    }

    public IQ getPong() {
        return IQ.createResultIQ(this);
    }
}
