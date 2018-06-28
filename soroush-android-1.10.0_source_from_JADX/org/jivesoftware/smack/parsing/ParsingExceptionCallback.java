package org.jivesoftware.smack.parsing;

import org.jivesoftware.smack.UnparseableStanza;

public interface ParsingExceptionCallback {
    void handleUnparsableStanza(UnparseableStanza unparseableStanza);
}
