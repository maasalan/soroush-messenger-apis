package org.jivesoftware.smack.packet;

import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.packet.XMPPError.Builder;
import org.jivesoftware.smack.util.Objects;

public class ErrorIQ extends SimpleIQ {
    public static final String ELEMENT = "error";

    public ErrorIQ(Builder builder) {
        super("error", null);
        Objects.requireNonNull(builder, "xmppErrorBuilder must not be null");
        setType(Type.error);
        setError(builder);
    }
}
