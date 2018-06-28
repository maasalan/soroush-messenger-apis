package org.jivesoftware.smackx.carbons;

import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smackx.carbons.packet.CarbonExtension.Direction;

public interface CarbonCopyReceivedListener {
    void onCarbonCopyReceived(Direction direction, Message message, Message message2);
}
