package org.jivesoftware.smack.sasl.provided;

import javax.security.auth.callback.CallbackHandler;
import org.jivesoftware.smack.sasl.SASLMechanism;
import org.jivesoftware.smack.util.ByteUtils;

public class SASLPlainMechanism extends SASLMechanism {
    public static final String NAME = "PLAIN";

    protected void authenticateInternal(CallbackHandler callbackHandler) {
        throw new UnsupportedOperationException("CallbackHandler not (yet) supported");
    }

    public boolean authzidSupported() {
        return true;
    }

    public void checkIfSuccessfulOrThrow() {
    }

    protected byte[] getAuthenticationText() {
        String obj = this.authorizationId == null ? "" : this.authorizationId.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(obj);
        stringBuilder.append('\u0000');
        stringBuilder.append(this.authenticationId);
        byte[] toBytes = SASLMechanism.toBytes(stringBuilder.toString());
        stringBuilder = new StringBuilder("\u0000");
        stringBuilder.append(this.password);
        return ByteUtils.concact(toBytes, SASLMechanism.toBytes(stringBuilder.toString()));
    }

    public String getName() {
        return "PLAIN";
    }

    public int getPriority() {
        return 410;
    }

    public SASLPlainMechanism newInstance() {
        return new SASLPlainMechanism();
    }
}
