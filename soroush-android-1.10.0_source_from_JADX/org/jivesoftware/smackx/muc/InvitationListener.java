package org.jivesoftware.smackx.muc;

import org.b.a.g;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smackx.muc.packet.MUCUser.Invite;

public interface InvitationListener {
    void invitationReceived(XMPPConnection xMPPConnection, MultiUserChat multiUserChat, g gVar, String str, String str2, Message message, Invite invite);
}
