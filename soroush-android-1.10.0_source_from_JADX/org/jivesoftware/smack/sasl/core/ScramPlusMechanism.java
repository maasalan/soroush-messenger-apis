package org.jivesoftware.smack.sasl.core;

import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.util.TLSUtils;

public abstract class ScramPlusMechanism extends ScramMechanism {
    protected ScramPlusMechanism(ScramHmac scramHmac) {
        super(scramHmac);
    }

    protected byte[] getChannelBindingData() {
        try {
            return TLSUtils.getChannelBindingTlsServerEndPoint(this.sslSession);
        } catch (Throwable e) {
            throw new SmackException(e);
        }
    }

    protected String getChannelBindingName() {
        return "p=tls-server-end-point";
    }

    public String getName() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.getName());
        stringBuilder.append("-PLUS");
        return stringBuilder.toString();
    }
}
