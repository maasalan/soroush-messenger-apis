package org.jivesoftware.smack.util;

import java.util.concurrent.ThreadFactory;
import org.jivesoftware.smack.XMPPConnection;

public final class SmackExecutorThreadFactory implements ThreadFactory {
    private final int connectionCounterValue;
    private int count = 0;
    private final String name;

    public SmackExecutorThreadFactory(XMPPConnection xMPPConnection, String str) {
        this.connectionCounterValue = xMPPConnection.getConnectionCounter();
        this.name = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        StringBuilder stringBuilder = new StringBuilder("Smack-");
        stringBuilder.append(this.name);
        stringBuilder.append(' ');
        int i = this.count;
        this.count = i + 1;
        stringBuilder.append(i);
        stringBuilder.append(" (");
        stringBuilder.append(this.connectionCounterValue);
        stringBuilder.append(")");
        thread.setName(stringBuilder.toString());
        thread.setDaemon(true);
        return thread;
    }
}
