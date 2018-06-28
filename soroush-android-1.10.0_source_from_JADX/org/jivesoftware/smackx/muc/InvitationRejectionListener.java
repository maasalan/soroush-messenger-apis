package org.jivesoftware.smackx.muc;

import org.b.a.e;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smackx.muc.packet.MUCUser.Decline;

public interface InvitationRejectionListener {
    void invitationDeclined(e eVar, String str, Message message, Decline decline);
}
