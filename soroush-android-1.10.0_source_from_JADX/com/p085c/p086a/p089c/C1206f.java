package com.p085c.p086a.p089c;

import com.p085c.p086a.p089c.p092b.p093a.C1104b;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface C1206f {

    public enum C1205a {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        
        public final boolean f3821i;

        private C1205a(boolean z) {
            this.f3821i = z;
        }
    }

    int mo1207a(InputStream inputStream, C1104b c1104b);

    C1205a mo1208a(InputStream inputStream);

    C1205a mo1209a(ByteBuffer byteBuffer);
}
