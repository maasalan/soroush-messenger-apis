package org.jivesoftware.smackx.muc;

import org.b.a.b.d;
import org.b.a.f;
import org.b.a.i;

public interface ParticipantStatusListener {
    void adminGranted(f fVar);

    void adminRevoked(f fVar);

    void banned(f fVar, i iVar, String str);

    void joined(f fVar);

    void kicked(f fVar, i iVar, String str);

    void left(f fVar);

    void membershipGranted(f fVar);

    void membershipRevoked(f fVar);

    void moderatorGranted(f fVar);

    void moderatorRevoked(f fVar);

    void nicknameChanged(f fVar, d dVar);

    void ownershipGranted(f fVar);

    void ownershipRevoked(f fVar);

    void voiceGranted(f fVar);

    void voiceRevoked(f fVar);
}
