package org.jivesoftware.smack.sasl.core;

import org.jivesoftware.smack.sasl.SASLMechanism;

public class ScramSha1PlusMechanism extends ScramPlusMechanism {
    public static final String NAME = new ScramSha1PlusMechanism().getName();

    public ScramSha1PlusMechanism() {
        super(SCRAMSHA1Mechanism.SHA_1_SCRAM_HMAC);
    }

    public int getPriority() {
        return 110;
    }

    protected SASLMechanism newInstance() {
        return new ScramSha1PlusMechanism();
    }
}
