package com.googlecode.mp4parser.util;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JuliLogger extends Logger {
    Logger logger;

    public JuliLogger(String str) {
        this.logger = Logger.getLogger(str);
    }

    public void logDebug(String str) {
        this.logger.log(Level.FINE, str);
    }

    public void logError(String str) {
        this.logger.log(Level.SEVERE, str);
    }

    public void logWarn(String str) {
        this.logger.log(Level.WARNING, str);
    }
}
