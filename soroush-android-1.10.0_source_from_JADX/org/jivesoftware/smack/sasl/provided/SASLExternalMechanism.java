package org.jivesoftware.smack.sasl.provided;

import javax.security.auth.callback.CallbackHandler;
import org.b.c.b;
import org.jivesoftware.smack.sasl.SASLMechanism;
import org.jivesoftware.smack.util.StringUtils;

public class SASLExternalMechanism extends SASLMechanism {
    public static final String NAME = "EXTERNAL";

    protected void authenticateInternal(CallbackHandler callbackHandler) {
    }

    public boolean authzidSupported() {
        return true;
    }

    public void checkIfSuccessfulOrThrow() {
    }

    protected byte[] getAuthenticationText() {
        String obj;
        if (this.authorizationId != null) {
            obj = this.authorizationId.toString();
        } else if (StringUtils.isNullOrEmpty(this.authenticationId)) {
            return null;
        } else {
            obj = b.a(this.authenticationId, this.serviceName);
        }
        return SASLMechanism.toBytes(obj);
    }

    public String getName() {
        return "EXTERNAL";
    }

    public int getPriority() {
        return 510;
    }

    protected SASLMechanism newInstance() {
        return new SASLExternalMechanism();
    }
}
