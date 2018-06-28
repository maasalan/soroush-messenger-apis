package org.jivesoftware.smack.chat2;

import org.b.a.e;
import org.b.a.f;
import org.b.a.i;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Presence;

public final class Chat extends Manager {
    private final e jid;
    Presence lastPresenceOfLockedResource;
    volatile f lockedResource;

    Chat(XMPPConnection xMPPConnection, e eVar) {
        super(xMPPConnection);
        this.jid = eVar;
    }

    public final e getXmppAddressOfChatPartner() {
        return this.jid;
    }

    public final void send(CharSequence charSequence) {
        Message message = new Message();
        message.setBody(charSequence);
        send(message);
    }

    public final void send(Message message) {
        switch (message.getType()) {
            case normal:
            case chat:
                i iVar = this.lockedResource;
                if (iVar == null) {
                    iVar = this.jid;
                }
                message.setTo(iVar);
                connection().sendStanza(message);
                return;
            default:
                throw new IllegalArgumentException("Message must be of type 'normal' or 'chat'");
        }
    }

    final void unlockResource() {
        this.lockedResource = null;
        this.lastPresenceOfLockedResource = null;
    }
}
