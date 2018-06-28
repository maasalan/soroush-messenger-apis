package org.jivesoftware.smackx.bytestreams;

import org.b.a.i;

public interface BytestreamManager {
    void addIncomingBytestreamListener(BytestreamListener bytestreamListener);

    void addIncomingBytestreamListener(BytestreamListener bytestreamListener, i iVar);

    BytestreamSession establishSession(i iVar);

    BytestreamSession establishSession(i iVar, String str);

    void removeIncomingBytestreamListener(String str);

    void removeIncomingBytestreamListener(BytestreamListener bytestreamListener);
}
