package org.jivesoftware.smack.util.stringencoder.android;

import android.util.Base64;
import org.jivesoftware.smack.util.stringencoder.Base64.Encoder;

public final class AndroidBase64Encoder implements Encoder {
    private static final int BASE64_ENCODER_FLAGS = 2;
    private static AndroidBase64Encoder instance = new AndroidBase64Encoder();

    private AndroidBase64Encoder() {
    }

    public static AndroidBase64Encoder getInstance() {
        return instance;
    }

    public final byte[] decode(String str) {
        return Base64.decode(str, 0);
    }

    public final byte[] decode(byte[] bArr, int i, int i2) {
        return Base64.decode(bArr, i, i2, 0);
    }

    public final byte[] encode(byte[] bArr, int i, int i2) {
        return Base64.encode(bArr, i, i2, 2);
    }

    public final String encodeToString(byte[] bArr, int i, int i2) {
        return Base64.encodeToString(bArr, i, i2, 2);
    }
}
