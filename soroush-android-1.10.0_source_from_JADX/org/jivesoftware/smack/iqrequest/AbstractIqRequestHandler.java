package org.jivesoftware.smack.iqrequest;

import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;

public abstract class AbstractIqRequestHandler implements IQRequestHandler {
    private final String element;
    private final Mode mode;
    private final String namespace;
    private final Type type;

    protected AbstractIqRequestHandler(String str, String str2, Type type, Mode mode) {
        switch (type) {
            case set:
            case get:
                this.element = str;
                this.namespace = str2;
                this.type = type;
                this.mode = mode;
                return;
            default:
                throw new IllegalArgumentException("Only get and set IQ type allowed");
        }
    }

    public String getElement() {
        return this.element;
    }

    public Mode getMode() {
        return this.mode;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public Type getType() {
        return this.type;
    }

    public abstract IQ handleIQRequest(IQ iq);
}
