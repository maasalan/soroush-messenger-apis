package org.jivesoftware.smack.sasl.core;

import org.jivesoftware.smack.sasl.SASLMechanism;
import org.jivesoftware.smack.util.MAC;
import org.jivesoftware.smack.util.StringUtils;

public class SCRAMSHA1Mechanism extends ScramMechanism {
    public static final String NAME = new SCRAMSHA1Mechanism().getName();
    static final ScramHmac SHA_1_SCRAM_HMAC = new C79001();

    static class C79001 implements ScramHmac {
        C79001() {
        }

        public final String getHmacName() {
            return StringUtils.SHA1;
        }

        public final byte[] hmac(byte[] bArr, byte[] bArr2) {
            return MAC.hmacsha1(bArr, bArr2);
        }
    }

    public SCRAMSHA1Mechanism() {
        super(SHA_1_SCRAM_HMAC);
    }

    public int getPriority() {
        return 110;
    }

    protected SASLMechanism newInstance() {
        return new SCRAMSHA1Mechanism();
    }
}
