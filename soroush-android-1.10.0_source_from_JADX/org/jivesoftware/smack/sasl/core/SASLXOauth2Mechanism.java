package org.jivesoftware.smack.sasl.core;

import javax.security.auth.callback.CallbackHandler;
import org.jivesoftware.smack.sasl.SASLMechanism;

public class SASLXOauth2Mechanism extends SASLMechanism {
    public static final String NAME = "X-OAUTH2";

    protected void authenticateInternal(CallbackHandler callbackHandler) {
        throw new UnsupportedOperationException("CallbackHandler not (yet) supported");
    }

    public void checkIfSuccessfulOrThrow() {
    }

    protected byte[] getAuthenticationText() {
        StringBuilder stringBuilder = new StringBuilder("\u0000");
        stringBuilder.append(this.authenticationId);
        stringBuilder.append('\u0000');
        stringBuilder.append(this.password);
        return SASLMechanism.toBytes(stringBuilder.toString());
    }

    public String getName() {
        return NAME;
    }

    public int getPriority() {
        return 410;
    }

    public SASLXOauth2Mechanism newInstance() {
        return new SASLXOauth2Mechanism();
    }
}
