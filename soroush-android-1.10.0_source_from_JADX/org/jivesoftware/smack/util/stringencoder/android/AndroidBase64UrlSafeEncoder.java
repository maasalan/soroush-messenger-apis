package org.jivesoftware.smack.util.stringencoder.android;

import android.util.Base64;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.stringencoder.StringEncoder;

public final class AndroidBase64UrlSafeEncoder implements StringEncoder {
    private static final int BASE64_ENCODER_FLAGS = 10;
    private static AndroidBase64UrlSafeEncoder instance = new AndroidBase64UrlSafeEncoder();

    private AndroidBase64UrlSafeEncoder() {
    }

    public static AndroidBase64UrlSafeEncoder getInstance() {
        return instance;
    }

    public final String decode(String str) {
        try {
            return new String(Base64.decode(str, 10), StringUtils.UTF8);
        } catch (Throwable e) {
            throw new IllegalStateException("UTF-8 not supported", e);
        }
    }

    public final String encode(String str) {
        try {
            return Base64.encodeToString(str.getBytes(StringUtils.UTF8), 10);
        } catch (Throwable e) {
            throw new IllegalStateException("UTF-8 not supported", e);
        }
    }
}
