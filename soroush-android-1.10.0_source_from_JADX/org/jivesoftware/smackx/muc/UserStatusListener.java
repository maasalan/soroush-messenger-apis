package org.jivesoftware.smackx.muc;

import org.b.a.i;

public interface UserStatusListener {
    void adminGranted();

    void adminRevoked();

    void banned(i iVar, String str);

    void kicked(i iVar, String str);

    void membershipGranted();

    void membershipRevoked();

    void moderatorGranted();

    void moderatorRevoked();

    void ownershipGranted();

    void ownershipRevoked();

    void roomDestroyed(MultiUserChat multiUserChat, String str);

    void voiceGranted();

    void voiceRevoked();
}
