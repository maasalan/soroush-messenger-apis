package org.jivesoftware.smack.sasl.core;

public interface ScramHmac {
    String getHmacName();

    byte[] hmac(byte[] bArr, byte[] bArr2);
}
