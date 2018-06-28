package org.jivesoftware.smackx.receipts;

import org.b.a.i;
import org.jivesoftware.smack.packet.Stanza;

public interface ReceiptReceivedListener {
    void onReceiptReceived(i iVar, i iVar2, String str, Stanza stanza);
}
