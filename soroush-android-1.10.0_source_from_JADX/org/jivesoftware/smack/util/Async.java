package org.jivesoftware.smack.util;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Async {

    public static abstract class ThrowingRunnable implements Runnable {
        public static final Logger LOGGER = Logger.getLogger(ThrowingRunnable.class.getName());

        public final void run() {
            try {
                runOrThrow();
            } catch (Throwable e) {
                if (e instanceof RuntimeException) {
                    throw ((RuntimeException) e);
                }
                LOGGER.log(Level.WARNING, "Catched Exception", e);
            }
        }

        public abstract void runOrThrow();
    }

    public static Thread daemonThreadFrom(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        return thread;
    }

    public static Thread go(Runnable runnable) {
        Thread daemonThreadFrom = daemonThreadFrom(runnable);
        daemonThreadFrom.start();
        return daemonThreadFrom;
    }

    public static Thread go(Runnable runnable, String str) {
        Thread daemonThreadFrom = daemonThreadFrom(runnable);
        daemonThreadFrom.setName(str);
        daemonThreadFrom.start();
        return daemonThreadFrom;
    }
}
