package org.jivesoftware.smackx.pep;

import org.b.a.e;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smackx.pubsub.EventElement;

public interface PEPListener {
    void eventReceived(e eVar, EventElement eventElement, Message message);
}
