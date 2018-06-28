package com.googlecode.mp4parser.authoring.tracks;

import com.googlecode.mp4parser.authoring.Track;
import com.p149g.p152b.p153a.C1613a;
import java.util.List;
import java.util.UUID;

public interface CencEncryptedTrack extends Track {
    UUID getDefaultKeyId();

    List<C1613a> getSampleEncryptionEntries();

    boolean hasSubSampleEncryption();
}
