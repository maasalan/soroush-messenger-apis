package org.jivesoftware.smack.parsing;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.UnparseableStanza;

public class ExceptionLoggingCallback implements ParsingExceptionCallback {
    private static final Logger LOGGER = Logger.getLogger(ExceptionLoggingCallback.class.getName());

    public void handleUnparsableStanza(UnparseableStanza unparseableStanza) {
        Logger logger = LOGGER;
        Level level = Level.SEVERE;
        StringBuilder stringBuilder = new StringBuilder("Smack message parsing exception. Content: '");
        stringBuilder.append(unparseableStanza.getContent());
        stringBuilder.append("'");
        logger.log(level, stringBuilder.toString(), unparseableStanza.getParsingException());
    }
}
