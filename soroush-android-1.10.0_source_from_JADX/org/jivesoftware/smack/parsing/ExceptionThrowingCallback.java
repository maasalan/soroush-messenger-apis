package org.jivesoftware.smack.parsing;

import org.jivesoftware.smack.UnparseableStanza;

public class ExceptionThrowingCallback implements ParsingExceptionCallback {
    public void handleUnparsableStanza(UnparseableStanza unparseableStanza) {
        throw unparseableStanza.getParsingException();
    }
}
